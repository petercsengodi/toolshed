package hu.csega.image.triangles;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.image.common.BitAssembler;
import hu.csega.image.common.BitPipeline;
import hu.csega.image.common.ImageChromosomeReceiver;
import hu.csega.image.common.TriangleChecker;

public class MultipleTriangles implements ImageChromosomeReceiver {

	private int capacity;

	public SingleTriangle[] triangles;
	public TriangleChecker[] checkers;
	public BitPipeline helper = new BitPipeline();
	public BitAssembler assembler = new BitAssembler();

	public MultipleTriangles(int capacity) {
		this.capacity = capacity;
		triangles = new SingleTriangle[capacity];
		checkers = new TriangleChecker[capacity];

		for(int i = 0; i < capacity; i++) {
			triangles[i] = new SingleTriangle();
			checkers[i] = new TriangleChecker();
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

		for(SingleTriangle t : triangles) {
			g.setColor(new Color(t.r, t.g, t.b));
			g.fillPolygon(t.x, t.y, 3);
		}
	}

	@Override
	public void draw(int[] buffer, int width, int height, int clearR, int clearG, int clearB) {
		// 1. initialize checkers
		for(int i = 0; i < capacity; i++) {
			SingleTriangle triangle = triangles[i];
			int[] x = triangle.x;
			int[] y = triangle.y;
			checkers[i].loadTriangle(x[0], y[0], x[1], y[1], x[2], y[2]);
		}

		SingleTriangle t;
		int colorPosition = 0, r, g, b;

		// 2. iterate through pixels
		for(int x = 0; x < width; x++) {
			for(int y = 0; y < height; y++) {

				r = clearR;
				g = clearG;
				b = clearB;

				// 3. iterate through triangles backwards
				for(int i = capacity-1; i >= 0; i--) {

					// 4. if pixel is contained by current triangle, we set this color
					// (if not contained by any, "clear color" remains)

					if(checkers[i].inside(x, y)) {
						t = triangles[i];
						r = t.r;
						g = t.g;
						b = t.b;
						break;
					}

				} // end 3.

				// 5. we paint the pixel
				// (because all pixels will be colored _somehow_, no previous clearing is needed)
				buffer[colorPosition++] = r;
				buffer[colorPosition++] = g;
				buffer[colorPosition++] = b;
			}

		} // end 2.
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
