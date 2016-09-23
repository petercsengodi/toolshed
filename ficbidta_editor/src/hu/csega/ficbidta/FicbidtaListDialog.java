package hu.csega.ficbidta;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

import hu.csega.toolshed.AbstractTool;

public class FicbidtaListDialog extends JDialog{

	private AbstractTool tool;
	public JComboBox<String> field;
	public FicbidtaComboBoxModel comboBoxModel;

	public FicbidtaListDialog(final AbstractTool tool) {
		super(tool.getWindow().getAwtWindow(), "List", ModalityType.APPLICATION_MODAL);
		this.tool = tool;

		comboBoxModel = new FicbidtaComboBoxModel();
		field = new JComboBox<String>(comboBoxModel);

		JPanel buttonPanel = new JPanel();
		JButton okButton = new JButton("Ok");
		JButton cancelButton = new JButton("Cancel");
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(okButton);
		buttonPanel.add(cancelButton);

		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tool.getComponent(FicbidtaPropertyDialog.class).stringDialog.setVisible(false);
			}
		});

		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tool.getComponent(FicbidtaPropertyDialog.class).stringDialog.setVisible(false);
			}
		});

		getContentPane().setLayout(new BorderLayout());
		getContentPane().add("North", field);
		getContentPane().add("South", buttonPanel);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setResizable(false);
		pack();
	}

	/**
	 * Default serial version UID.
	 */
	private static final long serialVersionUID = 1L;

}
