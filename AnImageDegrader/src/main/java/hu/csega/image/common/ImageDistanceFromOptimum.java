package hu.csega.image.common;

import java.awt.Color;
import java.awt.image.BufferedImage;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.DistanceFromOptimum;

public class ImageDistanceFromOptimum implements DistanceFromOptimum {

	public transient final int width;
	public transient final int height;
	public transient final int[] rgb;

	private transient final int capacity;
	private transient final int[] tmp;

	private transient final Color clearColor = Color.black;
	private transient final BufferedImage tmpImage;
	private transient final ImageChromosomeReceiver receiver;

	private transient final ImageEffectService service;

	public ImageDistanceFromOptimum(BufferedImage reference, ImageEffectService service, ImageChromosomeReceiver receiver) {
		this.width = reference.getWidth();
		this.height = reference.getHeight();
		this.capacity = this.width * this.height * 3;
		this.rgb = new int[this.capacity];
		this.tmp = new int[this.capacity];

		this.tmpImage = service.createNewImage(this.width, this.height);

		this.receiver = receiver;

		this.service = service;
		this.service.imageToRGBArray(reference, this.rgb);
	}

	@Override
	public double calculate(Chromosome chromosome) {
		receiver.fillFromChromosome(chromosome);
		receiver.draw(tmpImage, clearColor);
		service.imageToRGBArray(tmpImage, tmp);

		long sum = 0;
		for(int i = 0; i < capacity; i++) {
			sum += Math.abs(rgb[i] - tmp[i]);
		}

		return sum;
	}

	public int[] getRgb() {
		return rgb;
	}

	private static final long serialVersionUID = 1L;
}
