package hu.csega.genetic.framework;

import java.io.Serializable;
import java.util.Random;

import hu.csega.genetic.framework.crossover.ChromosomePair;

public class Chromosome implements Serializable {

	public static final Random RND = new Random(System.currentTimeMillis());

	public Chromosome(int length) {
		this.genes = new byte[length];
	}

	public Chromosome(byte[] genes) {
		this.genes = new byte[genes.length];
		System.arraycopy(genes, 0, this.genes, 0, genes.length);
	}

	public void fromOtherChromosome(Chromosome other) {
		System.arraycopy(other.genes, 0, this.genes, 0, other.genes.length);
	}

	public void randomizeGenes() {
		int length = genes.length;
		for(int i = 0; i < length; i++)
			genes[i] = getRandomByte();
	}

	public static ChromosomePair crossOver(Population population, Chromosome chromosome1, Chromosome chromosome2) {
		int length = chromosome1.genes.length;
		int prefix = RND.nextInt(length - 2) + 1;
		int suffix = length - prefix;

		ChromosomePair children = population.createNewChromosomePair(population.createNewChromosome(), population.createNewChromosome());

		System.arraycopy(chromosome1.genes, 0, children.chromosome1.genes, 0, prefix);
		System.arraycopy(chromosome2.genes, prefix, children.chromosome1.genes, prefix, suffix);

		System.arraycopy(chromosome2.genes, 0, children.chromosome2.genes, 0, prefix);
		System.arraycopy(chromosome1.genes, prefix, children.chromosome2.genes, prefix, suffix);

		return children;
	}

	public static Chromosome mutateFix(Population population, Chromosome chromosome, int index, byte add) {
		byte oldValue = chromosome.genes[index];
		if(oldValue > Byte.MIN_VALUE && add < 0 || oldValue < Byte.MAX_VALUE && add > 0) {
			Chromosome result = population.copyChromosome(chromosome);
			if(add > 0)
				result.genes[index]++;
			else
				result.genes[index]--;
			return result;
		}

		return null;
	}

	public static Chromosome mutate(Population population, Chromosome chromosome, int maxMutatedBytes) {
		int numberOfMutations;
		if(maxMutatedBytes < 2)
			numberOfMutations = 1;
		else
			numberOfMutations = RND.nextInt(maxMutatedBytes - 1) + 1;

		Chromosome result = population.copyChromosome(chromosome);

		int length = chromosome.genes.length;
		for(int i = 0; i < numberOfMutations; i++) {
			int modify = RND.nextInt(length);
			byte newValue = getRandomByte();
			result.genes[modify] = newValue;
		}

		return result;
	}

	public static byte getRandomByte() {
		return ((byte)(RND.nextInt(256) - 128));
	}

	public static double getRandomDouble() {
		return RND.nextDouble();
	}

	public static byte getRandomAddOrRemove() {
		return RND.nextBoolean() ? (byte)1 : (byte)-1;
	}

	public int getRandomPosition() {
		return RND.nextInt(genes.length);
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

	private static final long serialVersionUID = 1L;
}
