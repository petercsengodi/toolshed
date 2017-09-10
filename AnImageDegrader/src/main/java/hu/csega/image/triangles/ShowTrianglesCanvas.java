package hu.csega.image.triangles;

import java.awt.Graphics;

import javax.swing.JPanel;

public class ShowTrianglesCanvas extends JPanel {

	public ShowTriangles frame;

	public ShowTrianglesCanvas(ShowTriangles showTriangles) {
		this.frame = showTriangles;
	}

	@Override
	public void paint(Graphics g) {
		g.drawImage(frame.getResult(), 0, 0, null);
	}

	private static final long serialVersionUID = 1L;
}
