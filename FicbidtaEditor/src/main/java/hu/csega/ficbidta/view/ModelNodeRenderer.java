package hu.csega.ficbidta.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;

import hu.csega.ficbidta.model.ModelNetwork;
import hu.csega.ficbidta.model.ModelNode;
import hu.csega.toolshed.framework.components.ToolComponent;
import hu.csega.toolshed.framework.impl.AbstractTool;
import hu.csega.toolshed.framework.util.ToolUtil;

public class ModelNodeRenderer extends ToolComponent {

	public ModelNodeRenderer(AbstractTool tool) {
		super(tool);
	}

	private static final int MIN_X = -10;
	private static final int MIN_Y = -10;
	private static final int MAX_X = 10;
	private static final int MAX_Y = 10;
	
	private static final int FONT_SIZE = 16;
	
	public ModelNetwork model() {
		return getComponent(ModelNetwork.class);		
	}
	
	public void paint(ModelNode node, Graphics2D g) {
		boolean selected = model().selectedItems.contains(node.id);
		
		if(selected) {
			g.setColor(Color.green);
		} else {
			g.setColor(Color.black);
		}
		
		g.fillRect(node.x + MIN_X, node.y + MIN_Y, MAX_X - MIN_X + 1, MAX_Y - MIN_Y + 1);
		g.setFont(new Font("Arial", 0, FONT_SIZE));
		
		int row = 1; 
		if(node.name != null && node.name.length() > 0) {
			g.drawString(node.name, node.x + MIN_X, 
					node.y + MAX_Y + (row++) * (FONT_SIZE + 4));
		}
		
		String displayType = node.getTypeDisplayName();
		if(displayType != null) {
			g.drawString("[ " + displayType + " ]", 
					node.x + MIN_X, node.y + MAX_Y + (row++) * (FONT_SIZE + 4));
		}
	}
	
	public void paintBorder(ModelNode node, Graphics2D g) {
		g.setColor(Color.lightGray);
		g.drawRect(node.x + MIN_X, node.y + MIN_Y, MAX_X - MIN_X + 1, MAX_Y - MIN_Y + 1);
	}
	
	public boolean pointInsideNode(Point p, ModelNode node) {
		return (p.x >= node.x + MIN_X && p.x <= node.x + MAX_X &&
				p.y >= node.y + MIN_Y && p.y <= node.y + MAX_Y);
	}

	public boolean selectionCoveringNode(Rectangle rect, ModelNode node) {
		Rectangle r = ToolUtil.normalizeRectangle(rect);
		return (r.x <= node.x + MIN_X && r.y <= node.y + MIN_Y &&
				r.x + r.width >= node.x + MAX_X && r.y + r.height >= node.y + MAX_Y);
	}
}
