package hu.csega.toolshed;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ToolFrame extends JFrame implements ToolWindow {

	/**
	 * Default serial version uid.
	 */
	private static final long serialVersionUID = 1L;
	
	private AbstractTool tool;

	public ToolFrame() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new ToolWindowAdapter(this));
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
		setResizable(false);
		pack();

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, 
				dim.height/2-this.getSize().height/2);
		setVisible(true);
	}
	
	public void finish() {
		tool.finishWork();
		System.exit(0);
	}

	public Window getAwtWindow() {
		return this;
	}

	public void showMessage(String message) {
		JOptionPane.showMessageDialog(this, message);
	}

}
