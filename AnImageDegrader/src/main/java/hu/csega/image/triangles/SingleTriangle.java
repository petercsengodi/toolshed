package hu.csega.image.triangles;

import hu.csega.image.common.BitPipeline;

public class SingleTriangle {

	public static final int SIZE_IN_BYTES = 5;

	public int x;
	public int y;
	public int r;
	public int g;
	public int b;

	public void loadFromBytes(byte[] array, int offset, BitPipeline helper) {
		// x and y coordinates: 10 bits each = 20 bits
		// r g b colors: 6 bits each = 18 bits
		// summary: 38 bits = 5 bytes and two unused bits

		helper.set(array, offset, SIZE_IN_BYTES);
		x = helper.readBits(10);
		y = helper.readBits(10);
		r = helper.readBits(6) << 2; // to get a value between 0 - 255
		g = helper.readBits(6) << 2; // to get a value between 0 - 255
		b = helper.readBits(6) << 2; // to get a value between 0 - 255
	}

}
