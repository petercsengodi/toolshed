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
				for(int rgb = 0; rgb < 2; rgb++) {
					this.referenceMedian[(y*width+x)*3 + rgb] = (
							referencePictureData[(y*width+x)*3 + rgb] +
							referencePictureData[(y*width+x+1)*3 + rgb] +
							referencePictureData[(y*width+x+2)*3 + rgb] +
							referencePictureData[((y+1)*width+x)*3 + rgb] +
							referencePictureData[((y+1)*width+x+1)*3 + rgb] +
							referencePictureData[((y+1)*width+x+1)*3 + rgb] + // middle one twice
							referencePictureData[((y+1)*width+x+2)*3 + rgb] +
							referencePictureData[(y*width+x+2)*3 + rgb] +
							referencePictureData[((y+2)*width+x)*3 + rgb] +
							referencePictureData[((y+2)*width+x+1)*3 + rgb] +
							referencePictureData[((y+2)*width+x+2)*3 + rgb]
							) / 10.0; // middle one twice
				}
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
				for(int rgb = 0; rgb < 2; rgb++) {
					median1 = (
							buffer[(y*width+x)*3 + rgb] +
							buffer[(y*width+x+1)*3 + rgb] +
							buffer[(y*width+x+2)*3 + rgb] +
							buffer[((y+1)*width+x)*3 + rgb] +
							buffer[((y+1)*width+x+1)*3 + rgb] +
							buffer[((y+1)*width+x+1)*3 + rgb] + // middle one twice
							buffer[((y+1)*width+x+2)*3 + rgb] +
							buffer[(y*width+x+2)*3 + rgb] +
							buffer[((y+2)*width+x)*3 + rgb] +
							buffer[((y+2)*width+x+1)*3 + rgb] +
							buffer[((y+2)*width+x+2)*3 + rgb]
							) / 10.0; // middle one twice

					median2 = referenceMedian[(y*width+x)*3 + rgb];
					sum += Math.abs(median2 - median1);
				}
			}
		}

		return sum;
	}

	public int[] getReferencePictureData() {
		return referencePictureData;
	}

	private static final long serialVersionUID = 1L;
}
