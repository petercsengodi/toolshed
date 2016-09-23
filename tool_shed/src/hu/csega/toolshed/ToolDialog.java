package hu.csega.toolshed;

import java.awt.Window;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ToolDialog extends JDialog implements ToolWindow {

	/**
	 * Default serial version uid.
	 */
	private static final long serialVersionUID = 1L;
	
	private AbstractTool tool;
	private JFrame parent;

	public ToolDialog(JFrame parent) {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new ToolWindowAdapter(this));
		this.parent = parent;
	}
	
	public void embed(AbstractTool tool) {
		tool.setWindow(this);
		this.tool = tool;
		this.setTitle(tool.getTitle());
		this.tool.initialize(this);
	}
	
	public void doOnClose() {
		int resp = JOptionPane.showConfirmDialog(this, "Bez�r a baz�r?");
		if(resp == JOptionPane.YES_OPTION) {
			finish();
		}
	}
	
	public void start() {
		setLocationRelativeTo(parent); 
		setResizable(false);
		pack();
		setVisible(true);
	}
	
	public void finish() {
		tool.finishWork();
		System.exit(0);
		setVisible(false);
	}

	public Window getAwtWindow() {
		return this;
	}

	public void showMessage(String message) {
		JOptionPane.showMessageDialog(this, message);
	}

}
