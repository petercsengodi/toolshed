package hu.csega.ficbidta.view;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;

import hu.csega.ficbidta.model.ModelConnection;
import hu.csega.ficbidta.model.ModelNetwork;
import hu.csega.ficbidta.model.ModelNode;
import hu.csega.toolshed.framework.components.ToolComponent;
import hu.csega.toolshed.framework.impl.AbstractTool;
import hu.csega.toolshed.framework.util.ToolUtil;

public class ModelConnectionRenderer extends ToolComponent {

	public ModelConnectionRenderer(AbstractTool tool) {
		super(tool);
	}

	private static final int MARK_ENABLED = 70;
	private static final int RADIUS = 10;
	private static final int ARROW_SIZE = 7;
	
	private static final int FONT_SIZE = 12;
	
	public ModelNetwork model() {
		return getComponent(ModelNetwork.class);		
	}
	
	public void paint(ModelConnection connection, Graphics2D g) {
		ModelNode start = model().nodeMap.get(connection.start);
		ModelNode end = model().nodeMap.get(connection.end);
		boolean selected = model().selectedItems.contains(connection.id);

		Color lineColor = (selected ? new Color(0, 128, 0) : Color.black);
		Color markColor = (selected ? new Color(0, 255, 0) : Color.black);
		Color bgColor = (selected ? new Color(0, 128, 0) : Color.lightGray);
		
		g.setColor(lineColor);
		g.drawLine(start.x, start.y, end.x, end.y);

		int middleX = (start.x + end.x) / 2;
		int middleY = (start.y + end.y) / 2;
		
		int row = 1;
		if(connection.name != null && connection.name.length() > 0) {
			g.drawString(connection.name, middleX - RADIUS, 
					middleY + RADIUS + (row++) * (FONT_SIZE + 4));
		}
		
		String displayType = connection.getTypeDisplayName();
		if(displayType != null) {
			g.drawString("[ " + displayType + " ]", 
					middleX - RADIUS, middleY + RADIUS + (row++) * (FONT_SIZE + 4));
		}
		
		double dist = ToolUtil.distance(start.x, start.y, end.x, end.y);
		if(dist < MARK_ENABLED) {
			return;
		}
		
		g.setColor(bgColor);
		g.fillOval(middleX - RADIUS, middleY - RADIUS, 2 * RADIUS + 1, 2 * RADIUS + 1);
		g.setColor(markColor);
		g.drawOval(middleX - RADIUS, middleY - RADIUS, 2 * RADIUS + 1, 2 * RADIUS + 1);
		
		double mx = (end.x - start.x) / dist;
		double my = (end.y - start.y) / dist;
		int arrowStartX = (int)(middleX + mx * ARROW_SIZE);
		int arrowStartY = (int)(middleY + my * ARROW_SIZE);
		int arrow1EndX = (int)(middleX - my * ARROW_SIZE / 2 - mx * ARROW_SIZE / 3 * 2);
		int arrow1EndY = (int)(middleY + mx * ARROW_SIZE / 2 - my * ARROW_SIZE / 3 * 2);
		int arrow2EndX = (int)(middleX + my * ARROW_SIZE / 2 - mx * ARROW_SIZE / 3 * 2);
		int arrow2EndY = (int)(middleY - mx * ARROW_SIZE / 2 - my * ARROW_SIZE / 3 * 2);
		
		g.drawLine(arrowStartX, arrowStartY, arrow1EndX, arrow1EndY);
		g.drawLine(arrowStartX, arrowStartY, arrow2EndX, arrow2EndY);
	}

	
	public boolean pointInsideMark(Point p, ModelConnection connection) {
		ModelNode start = model().nodeMap.get(connection.start);
		ModelNode end = model().nodeMap.get(connection.end);
		int middleX = (start.x + end.x) / 2;
		int middleY = (start.y + end.y) / 2;
		return ToolUtil.distance(middleX, middleY, p.x, p.y) <= RADIUS;
	}

	public boolean selectionCoveringMark(Rectangle rect, ModelConnection connection) {
		ModelNode start = model().nodeMap.get(connection.start);
		ModelNode end = model().nodeMap.get(connection.end);
		int middleX = (start.x + end.x) / 2;
		int middleY = (start.y + end.y) / 2;

		Rectangle r = ToolUtil.normalizeRectangle(rect);
		return (r.x <= middleX - RADIUS && r.y <= middleY - RADIUS &&
				r.x + r.width >= middleX + RADIUS && r.y + r.height >= middleY + RADIUS);
	}
	
}
