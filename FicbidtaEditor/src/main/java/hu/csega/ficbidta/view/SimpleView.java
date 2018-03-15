package hu.csega.ficbidta.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;

import hu.csega.ficbidta.model.ModelConnection;
import hu.csega.ficbidta.model.ModelNetwork;
import hu.csega.ficbidta.model.ModelNode;
import hu.csega.ficbidta.window.FicbidtaCanvas;
import hu.csega.toolshed.framework.components.ToolComponent;
import hu.csega.toolshed.framework.impl.AbstractTool;
import hu.csega.toolshed.framework.util.ToolUtil;

public class SimpleView extends ToolComponent implements FicbidtaView {

	public SimpleView(AbstractTool tool) {
		super(tool);
	}
	public static final int MIN_X = -3000;
	public static final int MAX_X = 3000;
	public static final int MIN_Y = -3000;
	public static final int MAX_Y = 3000;
	public static final double MIN_ZOOM = Math.pow(0.5, 8);
	public static final double MAX_ZOOM = Math.pow(2.0, 8);
	
	public int translateX = 0;
	public int translateY = 0;
	public double zoom = 1.0;
	
	public Point slideSelected = null;
	
	public ModelNetwork model() {
		return getComponent(ModelNetwork.class);
	}
	
	public ModelNodeRenderer nodeRenderer() {
		return getComponent(ModelNodeRenderer.class);
	}

	public ModelConnectionRenderer connectionRenderer() {
		return getComponent(ModelConnectionRenderer.class);
	}
	
	public FicbidtaCanvas canvas() {
		return getComponent(FicbidtaCanvas.class);
	}
	
	public void paint(Graphics2D g, ModelNetwork model) {
		// Apply transformation
		g.translate(translateX, translateY);
		g.scale(zoom, zoom);
		
		// Background
		g.setColor(Color.gray);
		g.fillRect(MIN_X, MIN_Y, MAX_X - MIN_X + 1, MAX_Y - MIN_Y + 1);
		
		// Crosshair
		g.setColor(Color.white);
		g.drawLine(0, -20, 0, 20);
		g.drawLine(-20, 0, 20, 0);

		drawModel(g, model);

		// Remove transformation
		g.scale(1/zoom, 1/zoom);
		g.translate(-translateX, -translateY);
		
		if(slideSelected != null) {
			g.translate(slideSelected.x, slideSelected.y);
			g.translate(translateX, translateY);
			g.scale(zoom, zoom);
			
			drawBorder(g, model);
			
			g.scale(1/zoom, 1/zoom);
			g.translate(-translateX, -translateY);
			g.translate(-slideSelected.x, -slideSelected.y);
		}
	}

	private void drawModel(Graphics2D g, ModelNetwork model) {
		// Draw all connections from model
		for(ModelConnection connection : model().connections) {
			connectionRenderer().paint(connection, g);
		}
		
		// Draw all nodes from model
		for(ModelNode node : model().nodes) {
			nodeRenderer().paint(node, g);
		}
	}

	private void drawBorder(Graphics2D g, ModelNetwork model) {
		// Only nodes are moveable
		for(ModelNode node : model().nodes) {
			if(model().selectedItems.contains(node.id)) {
				nodeRenderer().paintBorder(node, g);
			}
		}
	}
	
	public Point getOriginalPosition(int x, int y) {
		x -= translateX;
		y -= translateY;

		Dimension size = canvas().getSize();
		x -= size.width / 2;
		y -= size.height / 2;
		
		x = (int)(x / zoom);
		y = (int)(y / zoom);
		
		return new Point(x, y);
	}
	
	public boolean isOutOfBorder(Point p) {
		return p.x < SimpleView.MIN_X || p.y < SimpleView.MIN_Y ||
				p.x > SimpleView.MAX_X || p.y > SimpleView.MAX_Y;
	}

	public ModelNode getNodeAt(int x, int y) {
		Point p = new Point(x, y);
		for(ModelNode node : model().nodes) {
			if(nodeRenderer().pointInsideNode(p, node)) {
				return node;
			}
		}
		
		return null;
	}

	public void toggleSelectionItemsOnPosition(int x, int y) {
		Point p = new Point(x, y);
		
		for(ModelNode node : model().nodes) {
			if(nodeRenderer().pointInsideNode(p, node)) {
				if(model().selectedItems.contains(node.id)) {
					model().selectedItems.remove(node.id);
				} else {
					model().selectedItems.add(node.id);
				}
			}
		}

		for(ModelConnection connection : model().connections) {
			if(connectionRenderer().pointInsideMark(p, connection)) {
				if(model().selectedItems.contains(connection.id)) {
					model().selectedItems.remove(connection.id);
				} else {
					model().selectedItems.add(connection.id);
				}
			}
		}
	}
	
	public void selectItemsOnPosition(int x, int y) {
		Point p = new Point(x, y);
		
		for(ModelNode node : model().nodes) {
			if(nodeRenderer().pointInsideNode(p, node)) {
				model().selectedItems.add(node.id);
			}
		}

		for(ModelConnection connection : model().connections) {
			if(connectionRenderer().pointInsideMark(p, connection)) {
				model().selectedItems.add(connection.id);
			}
		}
	}
	
	public void selectItemsInsideBox(Rectangle rect) {
		Rectangle r = ToolUtil.normalizeRectangle(rect);
		for(ModelNode node : model().nodes) {
			if(nodeRenderer().selectionCoveringNode(r, node)) {
				model().selectedItems.add(node.id);
			}
		}

		for(ModelConnection connection : model().connections) {
			if(connectionRenderer().selectionCoveringMark(r, connection)) {
				model().selectedItems.add(connection.id);
			}
		}
	}

	public void resetViewPort() {
		translateX = 0;
		translateY = 0;
		zoom = 1.0;
	}
}
