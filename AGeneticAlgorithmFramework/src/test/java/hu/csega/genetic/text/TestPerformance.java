package hu.csega.genetic.text;

import hu.csega.genetic.framework.Chromosome;

public class TestPerformance {

	public static final int ROUNDS = 1000000;

	public static void main(String[] args) throws Exception {
		byte[] genes = new byte[NetworkForTextV2.LENGTH_PARAMETERS];
		for(int i = 0; i < genes.length; i++) {
			genes[i] = Chromosome.getRandomByte();
		}

		double[] input = new double[NetworkForTextV2.NUMBER_OF_INPUTS];
		for(int i = 0; i < input.length; i++) {
			input[i] = Chromosome.getRandomDouble();
		}

		{
			long start = System.currentTimeMillis();

			for(int i = 0; i < ROUNDS; i++) {
				NETWORK.fillFromChromosome(new Chromosome(genes));
			}

			long end = System.currentTimeMillis();
			System.out.println("Loading: " + ((end - start) / (double)ROUNDS) + " ms in average.");
		}

		{
			long start = System.currentTimeMillis();

			for(int i = 0; i < ROUNDS; i++) {
				NETWORK.output(input);
			}

			long end = System.currentTimeMillis();
			System.out.println("Running: " + ((end - start) / (double)ROUNDS) + " ms in average.");
		}
	}

	private static final NetworkForTextV2 NETWORK = new NetworkForTextV2();
}
