package hu.csega.image.testrep;

import hu.csega.image.common.BitPipeline;

public class SingleCube {

	public static final int SIZE_IN_BYTES = 3;

	public int r;
	public int g;
	public int b;

	public void loadFromBytes(byte[] array, int offset, BitPipeline helper) {
		helper.set(array, offset, SIZE_IN_BYTES);
		r = helper.readBits(8);
		g = helper.readBits(8);
		b = helper.readBits(8);
	}
}
