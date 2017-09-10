package hu.csega.image.testrep;

import java.awt.Graphics;

import javax.swing.JPanel;

public class TestImageRepresentationCanvas extends JPanel {

	public TestImageRepresentationFrame frame;

	public TestImageRepresentationCanvas(TestImageRepresentationFrame frame) {
		this.frame = frame;
	}

	@Override
	public void paint(Graphics g) {
		g.drawImage(frame.getResult(), 0, 0, null);
	}

	private static final long serialVersionUID = 1L;
}
