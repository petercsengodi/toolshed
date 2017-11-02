package hu.csega.agents.adder;

import java.awt.Graphics;

import javax.swing.JPanel;

public class AdderControlCanvas extends JPanel {

	public AdderControlBoard frame;

	private int width;
	private int height;

	public AdderControlCanvas(AdderControlBoard showTriangles, int width, int height) {
		this.frame = showTriangles;
		this.width = width;
		this.height = height;
	}

	@Override
	public void paint(Graphics g) {
		// g.drawImage(frame.getResult(), 0, 0, null);
	}

	private static final long serialVersionUID = 1L;
}
