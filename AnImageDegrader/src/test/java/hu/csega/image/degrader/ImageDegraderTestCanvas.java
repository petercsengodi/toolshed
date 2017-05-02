package hu.csega.image.degrader;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class ImageDegraderTestCanvas extends JPanel {

	private Image original;
	private Image degradedBySimpleAlgorithm;
	private Image resultAfterOneCycle;
	private Image currentResult;

	private BufferedImage buffer = null;
	private Dimension lastSize = new Dimension();

	public ImageDegraderTestCanvas(ImageDegraderTestFrame frame) {
		this.original = frame.getOriginal();
		this.degradedBySimpleAlgorithm = frame.getDegradedBySimpleAlgorithm();
		this.resultAfterOneCycle = frame.getResultAfterOneCycle();
		this.currentResult = frame.getCurrentResult();
	}

	@Override
	public void paint(Graphics g) {
		Dimension size = getSize();
		if(buffer == null || !lastSize.equals(size)) {
			buffer = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_RGB);
			lastSize.width = size.width;
			lastSize.height = size.height;
		}

		Graphics2D g2d = (Graphics2D)buffer.getGraphics();
		g2d.setColor(Color.LIGHT_GRAY);
		g2d.fillRect(0, 0, lastSize.width, lastSize.height);

		if(original != null)
			g2d.drawImage(original, 0, 0, null);

		if(degradedBySimpleAlgorithm != null)
			g2d.drawImage(degradedBySimpleAlgorithm, 0, size.height / 2, null);

		if(resultAfterOneCycle != null)
			g2d.drawImage(resultAfterOneCycle, size.width / 2, 0, null);

		if(currentResult != null)
			g2d.drawImage(currentResult, size.width / 2, size.height / 2, null);

		g.drawImage(buffer, 0, 0, null);
	}

	private static final long serialVersionUID = 1L;
}
