package hu.csega.ficbidta;

import hu.csega.ficbidta.model.ModelNetwork;
import hu.csega.ficbidta.model.ModelObject;
import hu.csega.toolshed.AbstractTool;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FicbidtaNameDialog extends JDialog{

	private AbstractTool tool;

	public JTextField field;
	private ModelObject object;

	public FicbidtaNameDialog(AbstractTool tool) {
		super(tool.getWindow().getAwtWindow(), "Set Name",
				ModalityType.APPLICATION_MODAL);
		this.tool = tool;

		field = new JTextField();
		field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					saveName();
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
				saveName();
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

	public void saveName() {
		String newName = field.getText();
		if(newName != null) {
			newName = newName.trim();
			if(newName.length() == 0) {
				newName = null;
			}
		}

		tool.getComponent(ModelNetwork.class).renameObject(object, newName);
		tool.getComponent(FicbidtaCanvas.class).repaint();
	}

	public void open(ModelObject object) {
		this.object = object;
		String oldName = object.name;
		if(oldName == null) {
			oldName = "";
		}

		this.field.setText(oldName);
		this.setVisible(true);
	}

	private static final long serialVersionUID = 1L;
}
