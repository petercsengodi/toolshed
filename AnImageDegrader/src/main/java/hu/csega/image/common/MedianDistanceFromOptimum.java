package hu.csega.image.common;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.DistanceFromOptimum;
import hu.csega.image.degrader.ChromosomeToImageConverter;
import hu.csega.image.degrader.DegraderTestImages;

public class MedianDistanceFromOptimum implements DistanceFromOptimum {

	private transient final int[] referencePictureData;
	private transient final int width;
	private transient final int height;
	private transient final int capacity;

	private transient final double[] referenceMedian;

	private transient final ChromosomeToImageConverter converter;
	private transient final DegraderTestImages imageParameters;

	public MedianDistanceFromOptimum(int[] referencePictureData, int width, int height, ChromosomeToImageConverter converter, DegraderTestImages imageParameters) {
		this.referencePictureData = referencePictureData;
		this.width = width;
		this.height = height;
		this.capacity = this.width * this.height * 3;

		this.imageParameters = imageParameters;
		this.converter = converter;

		this.referenceMedian = new double[this.capacity];

		for(int y = 0; y < height - 2; y++) {
			for(int x = 0; x < width - 2; x++) {
				this.referenceMedian[y*width+x] = (
						referencePictureData[y*width+x] +
						referencePictureData[y*width+x+1] +
						referencePictureData[y*width+x+2] +
						referencePictureData[(y+1)*width+x] +
						referencePictureData[(y+1)*width+x+1] +
						referencePictureData[(y+1)*width+x+2] +
						referencePictureData[y*width+x+2] +
						referencePictureData[(y+2)*width+x] +
						referencePictureData[(y+2)*width+x+1] +
						referencePictureData[(y+2)*width+x+2]
						) / 9.0;
			}
		}
	}

	@Override
	public double calculate(Chromosome chromosome) {
		if(converter == null) {
			throw new RuntimeException("This is not really a serializable object, please, create a new instance!");
		}

		int[] buffer = converter.convert(chromosome);

		double median1, median2, sum = 0;

		for(int y = 0; y < height - 2; y++) {
			for(int x = 0; x < width - 2; x++) {
				median1 = (
						buffer[y*width+x] +
						buffer[y*width+x+1] +
						buffer[y*width+x+2] +
						buffer[(y+1)*width+x] +
						buffer[(y+1)*width+x+1] +
						buffer[(y+1)*width+x+2] +
						buffer[y*width+x+2] +
						buffer[(y+2)*width+x] +
						buffer[(y+2)*width+x+1] +
						buffer[(y+2)*width+x+2]
						) / 9.0;

				median2 = referenceMedian[y*width+x];
				sum += Math.abs(median2 - median1);
			}
		}

		return sum;
	}

	public int[] getReferencePictureData() {
		return referencePictureData;
	}

	private static final long serialVersionUID = 1L;
}
