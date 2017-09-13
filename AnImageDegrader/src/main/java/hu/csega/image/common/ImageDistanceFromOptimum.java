package hu.csega.image.common;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.DistanceFromOptimum;
import hu.csega.image.triangles.TriangleTestImages;

public class ImageDistanceFromOptimum implements DistanceFromOptimum {

	private transient final int[] referencePictureData;
	private transient final int width;
	private transient final int height;
	private transient final int capacity;

	private transient final ImageChromosomeReceiver prototype;
	private transient final PrototypeToArrayConverter converter;
	private transient final TriangleTestImages imageParameters;

	public ImageDistanceFromOptimum(int[] referencePictureData, int width, int height, ImageChromosomeReceiver prototype, PrototypeToArrayConverter converter, TriangleTestImages imageParameters) {
		this.referencePictureData = referencePictureData;
		this.width = width;
		this.height = height;
		this.capacity = this.width * this.height * 3;

		this.prototype = prototype;
		this.imageParameters = imageParameters;
		this.converter = converter;
	}

	@Override
	public double calculate(Chromosome chromosome) {
		if(prototype == null) {
			throw new RuntimeException("This is not really a serializable object, please, create a new instance!");
		}

		prototype.fillFromChromosome(chromosome);

		long now = System.currentTimeMillis();
		int[] tmp = converter.convert(prototype);
		System.out.println("Converting: " + ((System.currentTimeMillis() - now) / 1000.0) + " secs.");

		int x = 0, y = 0, c = 0, e, m;
		long sum = 0;
		for(int i = 0; i < capacity; i++) {
			e = Math.abs(referencePictureData[i] - tmp[i]);
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

	public int[] getReferencePictureData() {
		return referencePictureData;
	}

	private static final long serialVersionUID = 1L;
}
