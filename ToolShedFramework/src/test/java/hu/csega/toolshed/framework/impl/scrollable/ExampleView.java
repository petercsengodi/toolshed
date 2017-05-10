package hu.csega.toolshed.framework.impl.scrollable;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import hu.csega.toolshed.framework.ToolModel;
import hu.csega.toolshed.framework.ToolView;

public class ExampleView implements ToolView {

	@Override
	public void setModel(ToolModel arg0) {
	}

	@Override
	public ToolModel getModel() {
		return new ToolModel() {
		};
	}

	@Override
	public void paint(Graphics2D g, Rectangle visibleRectangle) {
		System.out.println("R: " + visibleRectangle);

		g.setColor(Color.white);
		g.fillRect(
				30,
				30,
				visibleRectangle.width - 60,
				visibleRectangle.height - 60);
	}

}
