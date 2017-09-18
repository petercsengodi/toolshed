package hu.csega.image.degrader;

import java.awt.Graphics;

import javax.swing.JPanel;

public class ShowDegraderCanvas extends JPanel {

	public ShowDegrader frame;

	public ShowDegraderCanvas(ShowDegrader showDegrader) {
		this.frame = showDegrader;
	}

	@Override
	public void paint(Graphics g) {
		g.drawImage(frame.getResult(), 0, 0, null);
	}

	private static final long serialVersionUID = 1L;
}
