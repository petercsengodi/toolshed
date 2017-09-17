package hu.csega.image.common;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.DistanceFromOptimum;
import hu.csega.image.degrader.ChromosomeToImageConverter;
import hu.csega.image.degrader.DegraderTestImages;
import hu.csega.image.triangles.TriangleTestImages;

public class MedianDistanceFromOptimum implements DistanceFromOptimum {

	private transient final int[] referencePictureData;
	private transient final int width;
	private transient final int height;
	private transient final int capacity;

	private transient final double[] referenceMedian;

	private transient final ChromosomeToImageConverter converter;
	private transient final DegraderTestImages imageParameters;
	private transient int[] buffer;

	public MedianDistanceFromOptimum(int[] referencePictureData, int width, int height, ChromosomeToImageConverter converter, DegraderTestImages imageParameters) {
		this.referencePictureData = referencePictureData;
		this.width = width;
		this.height = height;
		this.capacity = this.width * this.height * 3;

		this.imageParameters = imageParameters;
		this.converter = converter;
		this.buffer = new int[this.capacity];
		
		this.referenceMedian = new double[this.capacity];

		for(int y = 0; y < height - 2; y++) {
			for(int x = 0; x < width - 2; x++) {
				this.referenceMedian[y*width+x] = (
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
			}
		}
	}

	@Override
	public double calculate(Chromosome chromosome) {
		if(converter == null) {
			throw new RuntimeException("This is not really a serializable object, please, create a new instance!");
		}

		converter.convert(buffer, chromosome);

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
				sum += (median2 - median1);
			}
		}
		
		return sum;
	}

	public int[] getReferencePictureData() {
		return referencePictureData;
	}

	private static final long serialVersionUID = 1L;
}
