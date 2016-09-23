package hu.csega.ficbidta.controller;

import hu.csega.ficbidta.FicbidtaCanvas;
import hu.csega.ficbidta.model.ModelNetwork;
import hu.csega.ficbidta.model.ModelNode;
import hu.csega.ficbidta.view.SimpleView;
import hu.csega.toolshed.AbstractTool;
import hu.csega.toolshed.ToolComponent;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class GraphicalController extends ToolComponent 
		implements MouseWheelListener, MouseMotionListener, 
		MouseListener, KeyListener {

	public GraphicalController(AbstractTool tool) {
		super(tool);
	}

	private FicbidtaContextMenu contextMenu = new FicbidtaContextMenu(this);
	
	boolean controlStatus = false;
	
	private int leftPressedX = 0;
	private int leftPressedY = 0;
	private int rightPressedX = 0;
	private int rightPressedY = 0;
	private int middlePressedX = 0;
	private int middlePressedY = 0;
	private boolean pressedLeft = false;
	private boolean pressedRight = false;
	private boolean pressedMiddle = false;
	
	public int contextMenuViewX = 0;
	public int contextMenuViewY = 0;
	public int contextMenuX = 0;
	public int contextMenuY = 0;
	
	public FicbidtaCanvas canvas() {
		return getComponent(FicbidtaCanvas.class);
	}
	
	public ModelNetwork model() {
		return getComponent(ModelNetwork.class);
	}
	
	public SimpleView view() {
		return getComponent(SimpleView.class);
	}
	
	public void apply() {
		canvas().addMouseWheelListener(this);
		canvas().addMouseMotionListener(this);
		canvas().addMouseListener(this);
		getWindow().getAwtWindow().addKeyListener(this);
	}
	
	public void mouseWheelMoved(MouseWheelEvent e) {
		int clicks = e.getWheelRotation();
		if(clicks > 0) {
			// Upward
			for(int i = 0; i < Math.abs(clicks); i++) {
				view().zoom /= 2.0;
			}
			
			if(view().zoom < SimpleView.MIN_ZOOM) {
				view().zoom = SimpleView.MIN_ZOOM;
			}			
		} else if(clicks < 0) {
			// Downward
			for(int i = 0; i < Math.abs(clicks); i++) {
				view().zoom *= 2.0;
			}
			
			if(view().zoom > SimpleView.MAX_ZOOM) {
				view().zoom = SimpleView.MAX_ZOOM;
			}
		} else {
			return;
		}
		
		canvas().repaint();
	}

	public void mouseClicked(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON3) {
			contextMenuViewX = e.getX();
			contextMenuViewY = e.getY();
			Point p = view().getOriginalPosition(contextMenuViewX, contextMenuViewY);
			if(!view().isOutOfBorder(p)) {
				contextMenuX = p.x;
				contextMenuY = p.y;
				contextMenu.show(canvas(), contextMenuViewX, contextMenuViewY);
			}
		}

		if(e.getButton() == MouseEvent.BUTTON1) {
			contextMenuViewX = e.getX();
			contextMenuViewY = e.getY();
			Point p = view().getOriginalPosition(contextMenuViewX, contextMenuViewY);
			
			if(!controlStatus) {
				model().selectedItems.clear();
			}

			view().toggleSelectionItemsOnPosition(p.x, p.y);
			canvas().repaint();
		}
	}

	public void mousePressed(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1) {
			pressedLeft = true;
			leftPressedX = e.getX();
			leftPressedY = e.getY();
			
			if(model().selectedItems.isEmpty()) {
				Point p = view().getOriginalPosition(leftPressedX, leftPressedY);
				ModelNode node = view().getNodeAt(p.x, p.y);
				if(node != null) {
					canvas().selectionLine = new Rectangle(leftPressedX, leftPressedY, 0, 0);
				} else {
					canvas().selectionBox = new Rectangle(leftPressedX, leftPressedY, 0, 0);
				}
			} else {
				view().slideSelected = new Point(0, 0);
			}
		}
		if(e.getButton() == MouseEvent.BUTTON3) {
			rightPressedX = e.getX();
			rightPressedY = e.getY();
			pressedRight = true;
		}
		if(e.getButton() == MouseEvent.BUTTON2) {
			middlePressedX = e.getX();
			middlePressedY = e.getY();
			pressedMiddle = true;
		}
	}

	public void mouseReleased(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON1) {
			pressedLeft = false;
			canvas().resetMarkings();
			
			if(model().selectedItems.isEmpty()) {
				Point p1 = view().getOriginalPosition(leftPressedX, leftPressedY);
				ModelNode node1 = view().getNodeAt(p1.x, p1.y);
				Point p2 = view().getOriginalPosition(e.getX(), e.getY());
				ModelNode node2 = view().getNodeAt(p2.x, p2.y);
				if(node1 != null && node2 != null && node1.id != node2.id) {
					model().createConnection(node1.id, node2.id);
				}
				
				if(node1 == null) {
					Rectangle rect = new Rectangle(p1.x, p1.y, p2.x - p1.x, p2.y - p1.y);
					
					if(!controlStatus) {
						model().selectedItems.clear();
					}
					
					view().selectItemsInsideBox(rect);
				}
			} else if(view().slideSelected != null) {
				Point p1 = view().getOriginalPosition(leftPressedX, leftPressedY);
				Point p2 = view().getOriginalPosition(e.getX(), e.getY());
				int tx = p2.x - p1.x;
				int ty = p2.y - p1.y;
				view().slideSelected = null;
				model().moveSelected(tx, ty);
			}

			canvas().repaint();
		}
		if(e.getButton() == MouseEvent.BUTTON3) {
			pressedRight = false;
		}
		if(e.getButton() == MouseEvent.BUTTON2) {
			pressedMiddle = false;
		}
	}

	public void mouseDragged(MouseEvent e) {
		boolean repaint = false;

		if (pressedLeft) {
			int x = e.getX();
			int y = e.getY();
			int tx = x - leftPressedX;
			int ty = y - leftPressedY;

			if(model().selectedItems.isEmpty()) {
				if (canvas().selectionLine != null) {
					canvas().selectionLine.width = tx;
					canvas().selectionLine.height = ty;
					repaint = true;
				}
	
				if (canvas().selectionBox != null) {
					canvas().selectionBox.width = tx;
					canvas().selectionBox.height = ty;
					repaint = true;
				}
			} else if(view().slideSelected != null) {
				view().slideSelected.x = tx;
				view().slideSelected.y = ty;
				repaint = true;
			}
		}
		
		if(pressedRight) {
			int x = e.getX();
			int y = e.getY();
			int tx = rightPressedX - x;
			int ty = rightPressedY - y;
			rightPressedX = x;
			rightPressedY = y;
			view().translateX -= tx;
			view().translateY -= ty;
			repaint = true;
		}
		
		if(repaint) {
			canvas().repaint();
		}
	}


	public void mouseMoved(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void keyPressed(KeyEvent evt) {
		if (evt.getKeyCode() == KeyEvent.VK_CONTROL) {
			controlStatus = true;
		}
		
		if(evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
			model().selectedItems.clear();
			canvas().repaint();
		}
		
		if(evt.getKeyCode() == KeyEvent.VK_DELETE) {
			model().deleteSelection();
			canvas().repaint();
		}
		
		if(evt.getKeyCode() == KeyEvent.VK_Z && controlStatus) {
			model().stepStack.undoOneStep();
			canvas().repaint();
		}

		if(evt.getKeyCode() == KeyEvent.VK_Y && controlStatus) {
			model().stepStack.redoOneStep();
			canvas().repaint();
		}
	}

	public void keyReleased(KeyEvent evt) {
		if (evt.getKeyCode() == KeyEvent.VK_CONTROL) {
			controlStatus = false;
		}
	}

	public void keyTyped(KeyEvent evt) {
	}

}
