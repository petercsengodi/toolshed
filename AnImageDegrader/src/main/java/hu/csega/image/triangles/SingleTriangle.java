package hu.csega.image.triangles;

import hu.csega.image.common.BitPipeline;

public class SingleTriangle {

	public static final int SIZE_IN_BYTES = 9;

	public int x[] = new int[3];
	public int y[] = new int[3];
	public int r;
	public int g;
	public int b;

	public void loadFromBytes(byte[] array, int offset, BitPipeline helper) {
		// x and y coordinates: 10 bits each = 60 bits
		// r g b colors: 4 bits each = 12 bits
		// summary: 38 bits = 9 bytes and 0 unused bits (currently)

		helper.set(array, offset, SIZE_IN_BYTES);
		x[0] = helper.readBits(10);
		y[0] = helper.readBits(10);
		x[1] = helper.readBits(10);
		y[1] = helper.readBits(10);
		x[2] = helper.readBits(10);
		y[2] = helper.readBits(10);
		r = helper.readBits(4) << 4; // to get a value between 0 - 255
		g = helper.readBits(4) << 4; // to get a value between 0 - 255
		b = helper.readBits(4) << 4; // to get a value between 0 - 255
	}

}
