package hu.csega.genetic.test;

import java.util.Map;
import java.util.TreeMap;

import hu.csega.genetic.framework.DistanceFromOptimum;
import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.Population;
import hu.csega.genetic.framework.PopulationKey;

public class GeneticVariateLengthTest {

	private static final Map<Double, Double> PATTERN = new TreeMap<Double, Double>();

	static {
		PATTERN.put(0.0, 3.0);
		PATTERN.put(1.0, 1.0);
		PATTERN.put(2.0, 1.33);
		PATTERN.put(3.0, 3.0);
		PATTERN.put(4.0, 2.0);
	}

	public static final DistanceFromOptimum DISTANCE = new DistanceFromOptimum() {

		@Override
		public double calculate(Chromosome chromosome) {
			byte[] genes = chromosome.getGenes();

			double sum = 0.0;
			for(Map.Entry<Double, Double> e : PATTERN.entrySet())
				sum += calc(genes, e.getKey(), e.getValue());

			return sum;
		}

		private double calc(byte[] genes, double x, double y) {
			if(genes.length < 1 || genes.length > 10)
				return Double.MAX_VALUE;

			double result = 0;
			for(int i = 0; i < genes.length; i++)
				result += (genes[i] / 10.0) * Math.pow(x, i);
			return Math.pow((result - y), 2);
		}

		private static final long serialVersionUID = 1L;
	};

	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();

		Chromosome adamAndEve = new Chromosome(5);
		System.out.println("Initial value: " + DISTANCE.calculate(adamAndEve));

		Population population = Population.builder(DISTANCE)
				.adamAndEve(adamAndEve)
				.build();

		population.mutate(100);
		population.keep(5);

		for(Map.Entry<PopulationKey, Chromosome> chromosome : population) {
			System.out.println("Mutated: " + chromosome);
		}

		population.crossOverVariateLength(100);
		population.keep(5);

		for(Map.Entry<PopulationKey, Chromosome> chromosome : population) {
			System.out.println("Crossover: " + chromosome);
		}

		for(int rounds = 0; rounds < 10000; rounds++) {
			population.mutate(500);
			population.crossOverVariateLength(500);
			population.keep(1000);
		}

		population.keep(1);

		for(Map.Entry<PopulationKey, Chromosome> chromosome : population) {
			System.out.println("Final: " + chromosome);
		}

		long end = System.currentTimeMillis();
		System.out.println("Duration: " + ((end - start) / 1000.0) + " sec.");
	}

}
