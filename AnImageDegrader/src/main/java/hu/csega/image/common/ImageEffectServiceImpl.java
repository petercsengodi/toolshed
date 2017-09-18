package hu.csega.image.common;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.io.File;

import javax.imageio.ImageIO;

import hu.csega.image.degrader.ImageGeneticAlgorithmContainer;
import hu.csega.image.degrader.ImageGeneticAlgorithmContainerImpl;

public class ImageEffectServiceImpl implements ImageEffectService {

	@Override
	public BufferedImage createNewImage(int width, int height) {
		return new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
	}

	@Override
	public Image loadImage(String fileName) {
		try {
			return ImageIO.read(new File(fileName));
		} catch(Exception ex) {
			throw new RuntimeException("Error while loading file: " + fileName, ex);
		}
	}

	@Override
	public BufferedImage loadBufferedImage(String fileName, int width, int height, Color clearColor) {
		BufferedImage ret = createNewImage(width, height);
		Image img = loadImage(fileName);
		Graphics g = ret.getGraphics();
		g.setColor(clearColor);
		g.fillRect(0, 0, width, height);
		g.drawImage(img, 0, 0, null);
		return ret;
	}

	@Override
	public void imageToRGBArray(BufferedImage image, int[] result) {
		int width = image.getWidth();
		int height = image.getHeight();

		int len = width * height * 3;
		if(len != result.length) {
			throw new IllegalArgumentException("Sizes don't match! Width: " + width +
					" Height: " + height + " Expected length: " + len + " Actual: " + result.length);
		}

		int[] pixels = ((DataBufferInt)image.getRaster().getDataBuffer()).getData();

		int offset = 0;
		for(int v : pixels) {
			result[offset++] = (v >> 16) & 0xff;
			result[offset++] = (v >> 8) & 0xff;
			result[offset++] = v & 0xff;
		}
	}

	@Override
	public void rgbArrayToImage(int[] result, BufferedImage image) {
		final int[] pixels = ( (DataBufferInt) image.getRaster().getDataBuffer() ).getData();

		int offset = 0;
		for(int i = 0; i < pixels.length; i++) {
			pixels[i] = ((result[offset++] & 0xff) << 16) + ((result[offset++] & 0xff) << 8) + (result[offset++] & 0xff);
		}

//		int height = image.getHeight();
//		int width = image.getWidth();
//		int offset = 0;
//
//		for(int y = 0; y < height; y++) {
//			for(int x = 0; x < width; x++) {
//				image.setRGB(x, y, ((result[offset++] & 0xff) << 16) + ((result[offset++] & 0xff) << 8) + (result[offset++] & 0xff));
//			}
//		}
	}

	@Override
	public ImageGeneticAlgorithmContainer createGeneticAlgorithmContainer() {
		return new ImageGeneticAlgorithmContainerImpl();
	}

}
