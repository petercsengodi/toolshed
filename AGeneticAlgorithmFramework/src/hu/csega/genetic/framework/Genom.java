package hu.csega.genetic.framework;

import java.util.Random;

public class Genom {

	public static final Random RND = new Random(System.currentTimeMillis());

	public Genom(int length) {
		this.genes = new byte[length];
	}

	public Genom(byte[] genes) {
		this.genes = new byte[genes.length];
		System.arraycopy(genes, 0, this.genes, 0, genes.length);
	}

	public static Genom crossOver(Genom genom1, Genom genom2) {
		int length = genom1.genes.length;
		int cut = RND.nextInt(length);
		Genom result = new Genom(length);
		System.arraycopy(genom1.genes, 0, result.genes, 0, cut);
		System.arraycopy(genom2.genes, cut, result.genes, cut, length - cut);
		return result;
	}

	public static Genom mutate(Genom genom) {
		int length = genom.genes.length;
		int modify = RND.nextInt(length);
		Genom result = new Genom(genom.genes);
		result.genes[modify] = ((byte)(RND.nextInt(256) - 128));
		return result;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("[");

		for(int i = 0; i < genes.length; i++) {
			builder.append(' ').append((int)(genes[i]));
		}

		return builder.append(" ]").toString();
	}

	public byte[] getGenes() {
		return genes;
	}

	private byte[] genes;
}
