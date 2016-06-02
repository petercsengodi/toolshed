package hu.csega.genetic.nn;

import java.util.Map;
import java.util.TreeMap;

import hu.csega.genetic.framework.DistanceFromOptimum;
import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.Population;
import hu.csega.genetic.framework.PopulationKey;

public class NetworkTest {

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
			NETWORK.fillFromChromosome(chromosome);

			double sum = 0.0;
			for(Map.Entry<Double, Double> e : PATTERN.entrySet())
				sum += calc(e.getKey(), e.getValue());

			return sum;
		}

		private double calc(double x, double y) {
			for(int i = 0; i < array.length; i++) {
				array[i] = Math.pow(x, i);
			}

			return Math.pow(NETWORK.output(array) - y, 2);
		}

	};

	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();

		Chromosome adamAndEve = NETWORK.toChromosome();
		System.out.println("Initial value: " + DISTANCE.calculate(adamAndEve));

		Population population = Population.builder(DISTANCE)
				.adamAndEve(adamAndEve)
				.build();

		int ROUNDS = 10000;
		int DIV = ROUNDS / 10;
		System.out.print("[");

		for(int rounds = 0; rounds < ROUNDS; rounds++) {
			population.mutate(500);
			population.crossOverSameLength(500);
			population.keep(1000);

			if((rounds + 1) % DIV == 0)
				System.out.print(".");
		}

		System.out.println("]");

		population.keep(1);

		for(Map.Entry<PopulationKey, Chromosome> chromosome : population) {
			System.out.println("Final: " + chromosome);
		}

		long end = System.currentTimeMillis();
		System.out.println("Duration: " + ((end - start) / 1000.0) + " sec.");
	}

	private static final double[] array = new double[NetworkFromGenes.NODES];
	private static final NetworkFromGenes NETWORK = new NetworkFromGenes();
}
