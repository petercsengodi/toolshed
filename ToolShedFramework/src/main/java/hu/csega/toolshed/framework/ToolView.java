package hu.csega.toolshed.framework;

import java.awt.Dimension;
import java.awt.Graphics2D;

public interface ToolView {

	ToolModel getModel();
	void setModel(ToolModel model);
	void paint(Graphics2D g, Dimension size);

}
