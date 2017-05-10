package hu.csega.toolshed.framework;

import java.awt.Graphics2D;
import java.awt.Rectangle;

public interface ToolView {

	ToolModel getModel();
	void setModel(ToolModel model);
	void paint(Graphics2D g, Rectangle visibleRectangle);

}
