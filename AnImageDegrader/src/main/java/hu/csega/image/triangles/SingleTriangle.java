package hu.csega.image.triangles;

import hu.csega.image.common.BitAssembler;
import hu.csega.image.common.BitPipeline;

public class SingleTriangle {

	public static final int SIZE_IN_BYTES = 11;

	public int x[] = new int[3];
	public int y[] = new int[3];
	public int r;
	public int g;
	public int b;

	public void loadFromBytes(byte[] array, int offset, BitPipeline helper) {
		helper.set(array, offset, SIZE_IN_BYTES);
		x[0] = helper.readBits(10);
		y[0] = helper.readBits(10);
		x[1] = helper.readBits(10);
		y[1] = helper.readBits(10);
		x[2] = helper.readBits(10);
		y[2] = helper.readBits(10);
		r = helper.readBits(8);
		g = helper.readBits(8);
		b = helper.readBits(8);
	}

	public void loadIntoGenes(BitAssembler assembler) {
		assembler.setBitsAndSlide(x[0], 10);
		assembler.setBitsAndSlide(y[0], 10);
		assembler.setBitsAndSlide(x[1], 10);
		assembler.setBitsAndSlide(y[1], 10);
		assembler.setBitsAndSlide(x[2], 10);
		assembler.setBitsAndSlide(y[2], 10);
		assembler.setBitsAndSlide(r, 8);
		assembler.setBitsAndSlide(g, 8);
		assembler.setBitsAndSlide(b, 8);
	}

}
