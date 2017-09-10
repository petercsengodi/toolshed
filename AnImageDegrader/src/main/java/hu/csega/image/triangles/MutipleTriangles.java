package hu.csega.image.triangles;

import hu.csega.image.common.BitPipeline;

public class MutipleTriangles {

	private int capacity;

	public SingleTriangle[] triangles;
	public BitPipeline helper = new BitPipeline();

	public MutipleTriangles(int capacity) {
		this.capacity = capacity;
		triangles = new SingleTriangle[capacity];
	}

	public int sizeInBytes() {
		return SingleTriangle.SIZE_IN_BYTES * capacity;
	}

	public void loadFrom(byte[] array) {
		int offset = 0;
		for(int i = 0; i < capacity; i++) {
			triangles[i].loadFromBytes(array, offset, helper);
			offset += SingleTriangle.SIZE_IN_BYTES;
		}
	}

}
