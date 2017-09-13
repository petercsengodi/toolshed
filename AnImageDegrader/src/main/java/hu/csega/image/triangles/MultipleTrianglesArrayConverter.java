package hu.csega.image.triangles;

import hu.csega.image.common.ImageChromosomeReceiver;
import hu.csega.image.common.PrototypeToArrayConverter;

public class MultipleTrianglesArrayConverter implements PrototypeToArrayConverter {

	private int[] buffer;
	private int width;
	private int height;
	private int clearR;
	private int clearG;
	private int clearB;

	public MultipleTrianglesArrayConverter(int[] buffer, int width, int height, int clearR, int clearG, int clearB) {
		this.buffer = buffer;
		this.width = width;
		this.height = height;
		this.clearR = clearR;
		this.clearG = clearG;
		this.clearB = clearB;
	}

	@Override
	public int[] convert(ImageChromosomeReceiver receiver) {
		receiver.draw(buffer, width, height, clearR, clearG, clearB);
		return buffer;
	}

}
