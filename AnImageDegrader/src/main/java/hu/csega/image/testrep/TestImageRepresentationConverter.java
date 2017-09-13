package hu.csega.image.testrep;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import hu.csega.image.common.ImageChromosomeReceiver;
import hu.csega.image.common.ImageEffectService;
import hu.csega.image.common.PrototypeToArrayConverter;

public class TestImageRepresentationConverter implements PrototypeToArrayConverter {

	private int[] buffer;
	private BufferedImage image;
	private Color clearColor;
	private ImageEffectService service;

	private int width;
	private int height;

	public TestImageRepresentationConverter(int[] buffer, BufferedImage image, Color clearColor, ImageEffectService service) {
		this.buffer = buffer;
		this.image = image;
		this.clearColor = clearColor;
		this.service = service;

		this.width = image.getWidth(null);
		this.height = image.getHeight(null);
	}

	@Override
	public int[] convert(ImageChromosomeReceiver receiver) {
		Graphics g = image.getGraphics();
		g.setColor(clearColor);
		g.fillRect(0, 0, width, height);

		receiver.draw(image, clearColor);
		service.imageToRGBArray(image, buffer);
		return null;
	}



}
