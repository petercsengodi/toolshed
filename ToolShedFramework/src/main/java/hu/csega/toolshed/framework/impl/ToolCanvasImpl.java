package hu.csega.toolshed.framework.impl;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.JPanel;

import hu.csega.toolshed.framework.ToolCanvas;
import hu.csega.toolshed.framework.ToolView;

public class ToolCanvasImpl extends JPanel implements ToolCanvas {

	private ToolView view;

	private Image buffer = null;
	private Dimension lastSize = new Dimension(800, 600);

	public ToolCanvasImpl() {
	}

	@Override
	public ToolView getToolView() {
		return view;
	}

	@Override
	public void setToolView(ToolView view) {
		this.view = view;
	}

	@Override
	public Dimension getPreferredSize() {
		return lastSize;
	}

    @Override
	public void update(Graphics g) {
         paint(g);
    }

	@Override
	public void paint(Graphics g) {
		Dimension size = getSize();
		if(buffer == null || !size.equals(lastSize)) {
			buffer = createImage(size.width, size.height);
			lastSize.setSize(size);
		}

		Graphics2D gBuf = (Graphics2D)buffer.getGraphics();
		gBuf.setColor(Color.darkGray);
		gBuf.fillRect(0, 0, size.width, size.height);
		gBuf.setColor(Color.black);

		if(view != null && view.getModel() != null) {
			view.paint(gBuf, size);
		}

		g.drawImage(buffer, 0, 0, size.width, size.height, null);
	} // end of function paint

	private static final long serialVersionUID = 1L;
}
