package hu.csega.image.common;

import java.awt.Color;
import java.awt.image.BufferedImage;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.DistanceFromOptimum;
import hu.csega.image.degrader.ImageEffectService;
import hu.csega.image.triangles.MultipleTriangles;

public class ImageDistanceFromOptimum implements DistanceFromOptimum {

	public final int width;
	public final int height;
	public final int[] rgb;

	private final int capacity;
	private final int[] tmp;

	private final Color clearColor = Color.black;
	private final BufferedImage tmpImage;
	private final MultipleTriangles triangles;

	private final ImageEffectService service;

	public ImageDistanceFromOptimum(BufferedImage reference, ImageEffectService service, MultipleTriangles triangles) {
		this.width = reference.getWidth();
		this.height = reference.getHeight();
		this.capacity = this.width * this.height * 3;
		this.rgb = new int[this.capacity];
		this.tmp = new int[this.capacity];

		this.tmpImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

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
