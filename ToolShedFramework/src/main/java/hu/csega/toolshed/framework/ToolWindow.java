package hu.csega.toolshed.framework;

import java.awt.Container;
import java.awt.Window;

import javax.swing.JMenuBar;

public interface ToolWindow {

	Container getContentPane();
	void setJMenuBar(JMenuBar menuBar);
	Window getAwtWindow();
	void showMessage(String message);
	
	void embed(ITool tool);
	void start();
	void doOnClose();
	void finish();

}
