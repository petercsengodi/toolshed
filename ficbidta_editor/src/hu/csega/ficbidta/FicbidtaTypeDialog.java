package hu.csega.ficbidta;

import hu.csega.ficbidta.model.ModelConnection;
import hu.csega.ficbidta.model.ModelNetwork;
import hu.csega.ficbidta.model.ModelNode;
import hu.csega.ficbidta.model.ModelObject;
import hu.csega.ficbidta.properties.FicbidtaProperty;
import hu.csega.toolshed.AbstractTool;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.lang.reflect.Field;
import java.util.List;
import java.util.TreeMap;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FicbidtaTypeDialog extends JDialog{

	private AbstractTool tool;
	private ModelObject object = null;
	public JComboBox field;
	public FicbidtaObjectTypes comboBoxModel;

	public FicbidtaTypeDialog(AbstractTool tool) {
		super(tool.getWindow().getAwtWindow(), "Set Type",
			ModalityType.APPLICATION_MODAL);
		this.tool = tool;

		comboBoxModel = new FicbidtaObjectTypes();
		field = new JComboBox(comboBoxModel);
		field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					saveType();
					close();
				}
			}
		});

		JPanel buttonPanel = new JPanel();
		JButton okButton = new JButton("Ok");
		JButton cancelButton = new JButton("Cancel");
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(okButton);
		buttonPanel.add(cancelButton);

		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveType();
				close();
			}
		});

		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				close();
			}
		});

		getContentPane().setLayout(new BorderLayout());
		getContentPane().add("North", field);
		getContentPane().add("South", buttonPanel);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setResizable(false);
		pack();
	}

	public void close() {
		setVisible(false);
		object = null;
	}

	public void saveType() {
		Object selectedType = comboBoxModel.getSelectedValue();
		String newType = null;
		if(selectedType != null) {
			newType = selectedType.toString().trim();
			if(newType.length() == 0) {
				newType = null;
			}
		}

		TreeMap<String, String> newProperties = new TreeMap<String, String>();
		if(newType != null) {
			// Saving initial values for properties
			Class<?> typeClass;

			try {
				typeClass = getClass().getClassLoader().loadClass(newType);
			} catch(ClassNotFoundException ex) {
				throw new RuntimeException(ex);
			}

			Field[] allFields = typeClass.getFields();
			for(Field field : allFields) {
				FicbidtaProperty prop = field.getAnnotation(FicbidtaProperty.class);
				if(prop == null) {
					continue;
				}

				String propertyName = prop.name();
				newProperties.put(propertyName, "");
			}

		}

		tool.getComponent(ModelNetwork.class).changeObjectType(object, newType, newProperties);
		tool.getComponent(FicbidtaCanvas.class).repaint();
	}

	public void open(ModelObject object) {
		this.object = object;
		String oldType = object.type;
		if(oldType == null) {
			oldType = "";
		}

		FicbidtaAbstractObjectProvider objectProvider =
				tool.getComponent(FicbidtaAbstractObjectProvider.class);
		List<Class<?>> types = null;
		if(object instanceof ModelNode) {
			types = objectProvider.nodeTypes();
		} else if(object instanceof ModelConnection) {
			types = objectProvider.connectionTypes();
		}

		this.comboBoxModel.loadList(types, oldType);
		this.setVisible(true);
	}

	private static final long serialVersionUID = 1L;
}
