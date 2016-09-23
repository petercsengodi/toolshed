package hu.csega.ficbidta;

import hu.csega.ficbidta.model.ModelNetwork;
import hu.csega.ficbidta.model.ModelObject;
import hu.csega.ficbidta.properties.FicbidtaAbstractProperty;
import hu.csega.ficbidta.properties.FicbidtaProperty;
import hu.csega.toolshed.AbstractTool;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.TreeMap;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

public class FicbidtaPropertyDialog extends JDialog{

	/**
	 * Default serial version uid.
	 */
	private static final long serialVersionUID = 1L;
	
	private AbstractTool tool;
	public JTable table;
	public FicbidtaPropertyModel tableModel;
	
	public FicbidtaStringDialog stringDialog;
	public FicbidtaListDialog listDialog;
	
	private ModelObject object;
	
	public FicbidtaPropertyDialog(AbstractTool tool) {
		super(tool.getWindow().getAwtWindow(), "Properties", 
				ModalityType.APPLICATION_MODAL);
		this.tool = tool;
		
		stringDialog = new FicbidtaStringDialog(tool);
		
		tableModel = new FicbidtaPropertyModel();
		table = new JTable(tableModel);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent evt) {
				int row = table.rowAtPoint(evt.getPoint());
				int col = table.columnAtPoint(evt.getPoint());
				if (row >= 0 && row < tableModel.getRowCount() && col == 1) {
					stringDialog.setLocationRelativeTo(getContentPane());
					stringDialog.open(tableModel.rows.get(row));
				}
			}
		});
		
		JPanel buttonPanel = new JPanel();
		JButton okButton = new JButton("Save");
		JButton cancelButton = new JButton("Cancel");
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(okButton);
		buttonPanel.add(cancelButton);
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				save();
				close();
			}
		});
		
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
			}
		});
		
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add("North", table);
		getContentPane().add("South", buttonPanel);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setResizable(false);
	}
	
	public void close() {
		setVisible(false);
		this.object = null;
	}
	
	public void save() {
		TreeMap<String, String> newProperties = new TreeMap<String, String>();
		for(FicbidtaPropertyRow row : tableModel.rows) {
			newProperties.put(row.propertyName, row.propertyValue);
		}
		
		tool.getComponent(ModelNetwork.class).changeProperties(object, newProperties);
		tool.getComponent(FicbidtaCanvas.class).repaint();
	}
	
	public void open(ModelObject object) {
		String typeString = object.type;
		if(typeString == null || typeString.length() == 0) {
			tool.getWindow().showMessage("Choose an object type first!");
			return;
		}
		
		Class<?> typeClass;
		
		try {
			typeClass = getClass().getClassLoader().loadClass(typeString);
		} catch(ClassNotFoundException ex) {
			throw new RuntimeException(ex);
		}
		
		tableModel.rows = new ArrayList<FicbidtaPropertyRow>();
		Field[] allFields = typeClass.getFields();
		for(Field field : allFields) {
			FicbidtaProperty prop = field.getAnnotation(FicbidtaProperty.class);
			if(prop == null) {
				continue;
			}
			
			FicbidtaPropertyRow row = new FicbidtaPropertyRow();
			row.propertyName = prop.name();
			row.propertyDisplayName = prop.displayName();
			if(row.propertyDisplayName == null || row.propertyDisplayName.length() == 0){
				row.propertyDisplayName = row.propertyName;
			}
			
			try {
				Class<?> propClass = prop.property();
				row.property = (FicbidtaAbstractProperty)propClass.newInstance();
			} catch (InstantiationException e) {
				throw new RuntimeException(e);
			} catch (IllegalAccessException e) {
				throw new RuntimeException(e);
			}
			
			String value = object.properties.get(row.propertyName);
			row.propertyValue = value;
			row.propertyDisplayValue = row.property.display(row.property.convertFromString(value, String.class), String.class);
			tableModel.rows.add(row);
		}
		
		if(tableModel.rows.size() == 0) {
			return;
		}
		
		this.object = object;
		pack();
		setVisible(true);
	}

}
