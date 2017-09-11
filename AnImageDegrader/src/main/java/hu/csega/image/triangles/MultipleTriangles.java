package hu.csega.image.triangles;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.image.common.BitAssembler;
import hu.csega.image.common.BitPipeline;
import hu.csega.image.common.ImageChromosomeReceiver;

public class MultipleTriangles implements ImageChromosomeReceiver {

	private int capacity;

	public SingleTriangle[] triangles;
	public BitPipeline helper = new BitPipeline();
	public BitAssembler assembler = new BitAssembler();

	public MultipleTriangles(int capacity) {
		this.capacity = capacity;
		triangles = new SingleTriangle[capacity];

		for(int i = 0; i < capacity; i++) {
			triangles[i] = new SingleTriangle();
		}
	}

	@Override
	public void fillFromChromosome(Chromosome chromosome) {
		byte[] genes = chromosome.getGenes();
		loadFrom(genes);
	}

	@Override
	public String printableMessage() {
		return capacity + " triangles";
	}

	public int sizeInBytes() {
		return SingleTriangle.SIZE_IN_BYTES * capacity;
	}

	public void loadFrom(byte[] array) {
		int expectedSize = sizeInBytes();
		if(array.length != expectedSize) {
			throw new IllegalArgumentException("Received size: " + array.length + " Expected: " + expectedSize);
		}

		int offset = 0;
		for(int i = 0; i < capacity; i++) {
			triangles[i].loadFromBytes(array, offset, helper);
			offset += SingleTriangle.SIZE_IN_BYTES;
		}
	}

	@Override
	public void draw(Image img, Color clearColor) {
		Graphics g = img.getGraphics();

		if(clearColor != null) {
			g.setColor(clearColor);
			g.fillRect(0, 0, img.getWidth(null), img.getHeight(null));
		}

		for(SingleTriangle t : triangles) {
			g.setColor(new Color(t.r, t.g, t.b));
			g.fillPolygon(t.x, t.y, 3);
		}
	}

	public int getCapacity() {
		return capacity;
	}

	public SingleTriangle getTriangle(int i) {
		return triangles[i];
	}

	public void loadIntoGenes(byte[] genes) {
		assembler.setByteArray(genes);
		for(int i = 0; i < capacity; i++) {
			assembler.setPosition(i * SingleTriangle.SIZE_IN_BYTES);
			triangles[i].loadIntoGenes(assembler);
		}
	}

}
