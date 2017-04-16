package hu.csega.toolshed.framework;

import java.awt.Container;
import java.awt.Window;

import javax.swing.JMenuBar;

import hu.csega.toolshed.framework.impl.ToolWindowImpl;
import hu.csega.units.DefaultImplementation;
import hu.csega.units.Unit;

@Unit
@DefaultImplementation(ToolWindowImpl.class)
public interface ToolWindow {

	void addComponent(Object component);

	void setJMenuBar(JMenuBar menuBar);
	Window getAwtWindow();
	void showMessage(String message);

	void embed(ITool tool);
	void start();
	void doOnClose();
	void finish();

}
