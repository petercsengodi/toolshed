package hu.csega.ficbidta;

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

import hu.csega.toolshed.AbstractTool;

public class FicbidtaStringDialog extends JDialog {

	private AbstractTool tool;
	public JTextField field;
	public FicbidtaPropertyRow row;

	public FicbidtaStringDialog(AbstractTool tool) {
		super(tool.getWindow().getAwtWindow(), "String",
				ModalityType.APPLICATION_MODAL);
		this.tool = tool;

		field = new JTextField();
		field.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					if(save()) {
						close();
					}
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
				if(save()) {
					close();
				}
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

	public void open(FicbidtaPropertyRow row) {
		this.row = row;
		field.setText(row.propertyValue);
		setVisible(true);
	}

	public boolean save() {
		String text = field.getText();
		row.propertyValue = text;
		text = row.property.display(row.property.convertFromString(text, String.class), String.class);
		row.propertyDisplayValue = text;
		tool.getComponent(FicbidtaPropertyDialog.class).table.repaint();

		// successful
		return true;
	}

	public void close() {
		row = null;
		setVisible(false);
	}

	private static final long serialVersionUID = 1L;
}
