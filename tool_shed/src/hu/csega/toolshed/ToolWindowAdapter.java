package hu.csega.toolshed;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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
