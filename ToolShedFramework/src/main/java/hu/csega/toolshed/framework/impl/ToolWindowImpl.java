package hu.csega.toolshed.framework.impl;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import hu.csega.toolshed.framework.ITool;
import hu.csega.toolshed.framework.ToolWindow;

public class ToolWindowImpl extends JFrame implements ToolWindow {

	private ITool tool;

	public ToolWindowImpl() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new ToolWindowAdapter(this));
	}

	@Override
	public void addComponent(Object component) {
		if(component instanceof Component) {
			Component awtComponent = (Component)component;
			getContentPane().add(awtComponent);
		}
	}

	@Override
	public void embed(ITool tool) {
		if(tool instanceof AbstractTool)
			((AbstractTool)tool).setWindow(this);
		this.tool = tool;
		this.setTitle(tool.getTitle());
		this.tool.initialize(this);
	}

	@Override
	public void doOnClose() {
		int resp = JOptionPane.showConfirmDialog(this, "Really close application?");
		if(resp == JOptionPane.YES_OPTION) {
			finish();
		}
	}

	@Override
	public void start() {
		pack();

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2,
				dim.height/2-this.getSize().height/2);

		// setResizable(false);
		setVisible(true);
	}

	@Override
	public void finish() {
		tool.finishWork();
		System.exit(0);
	}

	@Override
	public Window getAwtWindow() {
		return this;
	}

	@Override
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(this, message);
	}

	private static final long serialVersionUID = 1L;
}
