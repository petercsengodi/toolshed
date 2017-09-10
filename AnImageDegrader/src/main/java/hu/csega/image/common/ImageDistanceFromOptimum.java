package hu.csega.image.common;

import java.awt.Color;
import java.awt.image.BufferedImage;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.DistanceFromOptimum;
import hu.csega.image.triangles.MultipleTriangles;

public class ImageDistanceFromOptimum implements DistanceFromOptimum {

	public transient final int width;
	public transient final int height;
	public transient final int[] rgb;

	private transient final int capacity;
	private transient final int[] tmp;

	private transient final Color clearColor = Color.black;
	private transient final BufferedImage tmpImage;
	private transient final MultipleTriangles triangles;

	private transient final ImageEffectService service;

	public ImageDistanceFromOptimum(BufferedImage reference, ImageEffectService service, MultipleTriangles triangles) {
		this.width = reference.getWidth();
		this.height = reference.getHeight();
		this.capacity = this.width * this.height * 3;
		this.rgb = new int[this.capacity];
		this.tmp = new int[this.capacity];

		this.tmpImage = service.createNewImage(this.width, this.height);

		this.triangles = triangles;

		this.service = service;
		this.service.imageToRGBArray(reference, this.rgb);
	}

	@Override
	public double calculate(Chromosome chromosome) {
		triangles.fillFromChromosome(chromosome);
		triangles.draw(tmpImage, clearColor);
		service.imageToRGBArray(tmpImage, tmp);

		double sum = 0.0, size = (double)capacity;
		for(int i = 0; i < capacity; i++) {
			sum += Math.abs(rgb[i] - tmp[i]);
		}

		double avg = sum / size;
		return avg;
	}

	private static final long serialVersionUID = 1L;
}
