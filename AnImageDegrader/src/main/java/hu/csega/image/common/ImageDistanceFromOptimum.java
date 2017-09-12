package hu.csega.image.common;

import java.awt.Color;
import java.awt.image.BufferedImage;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.DistanceFromOptimum;
import hu.csega.image.triangles.TriangleTestImages;

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

	private transient final TriangleTestImages imageParameters;

	public ImageDistanceFromOptimum(BufferedImage reference, ImageEffectService service, ImageChromosomeReceiver receiver, TriangleTestImages imageParameters) {
		this.width = reference.getWidth();
		this.height = reference.getHeight();
		this.capacity = this.width * this.height * 3;
		this.rgb = new int[this.capacity];
		this.tmp = new int[this.capacity];

		this.tmpImage = service.createNewImage(this.width, this.height);

		this.receiver = receiver;

		this.service = service;
		this.service.imageToRGBArray(reference, this.rgb);

		this.imageParameters = imageParameters;
	}

	@Override
	public double calculate(Chromosome chromosome) {
		receiver.fillFromChromosome(chromosome);
		receiver.draw(tmpImage, clearColor);
		service.imageToRGBArray(tmpImage, tmp);

		int x = 0, y = 0, c = 0, e, m;
		long sum = 0;
		for(int i = 0; i < capacity; i++) {
			e = Math.abs(rgb[i] - tmp[i]);
			m = imageParameters.sweetSpotMultiplicator(x, y);

			if(m != 1) {
				sum += e * m;
			} else {
				sum += e;
			}

			c++;

			if(c >= 3) {
				x++;
				c = 0;
			}

			if(x >= width) {
				y++;
				x = 0;
			}
		}

		return sum;
	}

	public int[] getRgb() {
		return rgb;
	}

	private static final long serialVersionUID = 1L;
}
