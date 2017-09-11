package hu.csega.image.triangles;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.ChromosomeRandomizer;

public class TriangleChromosomeRandomizer implements ChromosomeRandomizer {

	private MultipleTriangles prototype;
	private int width;
	private int height;
	private int[] rgb;

	public TriangleChromosomeRandomizer(int[] rgb, int width, int height) {
		this.rgb = rgb;
		this.width = width;
		this.height = height;
	}

	public MultipleTriangles getPrototype() {
		return prototype;
	}

	public void setPrototype(MultipleTriangles prototype) {
		this.prototype = prototype;
	}

	@Override
	public void randomizeGenes(byte[] genes) {
		int p, x, y, capacity = prototype.getCapacity();

		for(int i = 0; i < capacity; i++) {
			SingleTriangle triangleToRandomize = prototype.getTriangle(i);
			x = Chromosome.RND.nextInt(width);
			y = Chromosome.RND.nextInt(height);

			triangleToRandomize.x[0] = Math.max(0, x-20);
			triangleToRandomize.y[0] = Math.max(0, y-20);
			triangleToRandomize.x[1] = x;
			triangleToRandomize.y[1] = y + 10 + Chromosome.RND.nextInt(50);
			triangleToRandomize.x[2] = x + 10 + Chromosome.RND.nextInt(50);
			triangleToRandomize.y[2] = y;

			p = (y * width + x) * 3;
			triangleToRandomize.r = rgb[p];
			triangleToRandomize.g = rgb[p+1];
			triangleToRandomize.b = rgb[p+2];
		}

		prototype.loadIntoGenes(genes);
	}

}
