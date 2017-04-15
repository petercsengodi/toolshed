package hu.csega.toolshed.framework.impl;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import hu.csega.toolshed.framework.ToolWindow;

public class ToolWindowAdapter extends WindowAdapter {

	private ToolWindow window;

	public ToolWindowAdapter(ToolWindow window) {
		this.window = window;
	}

	@Override
	public void windowClosing(WindowEvent we) {
		window.doOnClose();
	}

}
