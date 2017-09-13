package hu.csega.image.testrep;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.image.common.BitPipeline;
import hu.csega.image.common.ImageChromosomeReceiver;

public class MultipleCubes implements ImageChromosomeReceiver {

	private int width;
	private int height;
	private int capacity;
	private int cubeSize;

	public SingleCube[] cubes;
	public BitPipeline helper = new BitPipeline();

	public MultipleCubes(int width, int height, int cubeSize) {
		this.width = width;
		this.height = height;
		this.capacity = width * height;
		this.cubes = new SingleCube[capacity];
		this.cubeSize = cubeSize;

		for(int i = 0; i < capacity; i++) {
			this.cubes[i] = new SingleCube();
		}
	}

	@Override
	public void fillFromChromosome(Chromosome chromosome) {
		byte[] genes = chromosome.getGenes();
		loadFrom(genes);
	}

	@Override
	public String printableMessage() {
		return capacity + " cubes";
	}

	public int sizeInBytes() {
		return SingleCube.SIZE_IN_BYTES * capacity;
	}

	public void loadFrom(byte[] array) {
		int expectedSize = sizeInBytes();
		if(array.length != expectedSize) {
			throw new IllegalArgumentException("Received size: " + array.length + " Expected: " + expectedSize);
		}

		int offset = 0;
		for(int i = 0; i < capacity; i++) {
			cubes[i].loadFromBytes(array, offset, helper);
			offset += SingleCube.SIZE_IN_BYTES;
		}
	}

	@Override
	public void draw(Image img, Color clearColor) {
		Graphics g = img.getGraphics();

		if(clearColor != null) {
			g.setColor(clearColor);
			g.fillRect(0, 0, img.getWidth(null), img.getHeight(null));
		}

		int x = 0;
		int y = 0;
		int crlf = cubeSize * width;
		int end = cubeSize * height;

		for(SingleCube cube : cubes) {
			g.setColor(new Color(cube.r, cube.g, cube.b));
			g.fillRect(x, y, cubeSize, cubeSize);

			x += cubeSize;
			if(x >= crlf) {
				x = 0;
				y += cubeSize;
			}

			if(y >= end) {
				break;
			}
		}
	}

}
