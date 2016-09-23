package hu.csega.ficbidta;

import hu.csega.ficbidta.model.ModelNetwork;
import hu.csega.ficbidta.view.SimpleView;
import hu.csega.toolshed.AbstractTool;
import hu.csega.toolshed.util.ToolUtil;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.JPanel;

public class FicbidtaCanvas extends JPanel {

	/**
	 * Default serial version uid.
	 */
	private static final long serialVersionUID = 1L;
	
	private AbstractTool tool;

	private Image buffer = null;
	
	public Rectangle selectionBox = null;
	public Rectangle selectionLine = null;
	
	public FicbidtaCanvas(AbstractTool tool) {
		this.tool = tool;
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(800, 600);
	}
	
    public void update(Graphics g) 
    { 
         paint(g); 
    } 
    
	public void resetMarkings() {
		selectionBox = null;
		selectionLine = null;
	}
	
	public SimpleView view() {
		return tool.getComponent(SimpleView.class);
	}
	
	public ModelNetwork model() {
		return tool.getComponent(ModelNetwork.class);
	}
    
	@Override
	public void paint(Graphics g) {
		Dimension size = getSize();
		if(buffer == null) {
			buffer = createImage(size.width, size.height);
		}
		
		Graphics2D gBuf = (Graphics2D)buffer.getGraphics();
		gBuf.setColor(Color.darkGray);
		gBuf.fillRect(0, 0, size.width, size.height);
		gBuf.setColor(Color.black);
		
		gBuf.translate(size.width / 2, size.height / 2);
		view().paint(gBuf, tool.getComponent(ModelNetwork.class));
		gBuf.translate(-size.width / 2, -size.height / 2);
		
		if(selectionLine != null) {
			gBuf.setColor(Color.red);
			Rectangle rect = selectionLine;
			gBuf.drawLine(rect.x, rect.y, 
					rect.x + rect.width, 
					rect.y + rect.height);
		}
		
		if(selectionBox != null) {
			gBuf.setColor(Color.lightGray);
			Rectangle rect = ToolUtil.normalizeRectangle(selectionBox);
			gBuf.drawRect(rect.x, rect.y, 
					rect.width, rect.height);
		}
		
		g.drawImage(buffer, 0, 0, size.width, size.height, null);
	} // end of function paint

}
