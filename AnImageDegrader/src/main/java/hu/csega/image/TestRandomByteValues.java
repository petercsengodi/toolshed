package hu.csega.image;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.DistanceFromOptimum;
import hu.csega.genetic.framework.Population;
import hu.csega.genetic.framework.measurement.Measurement;
import hu.csega.genetic.framework.measurement.TimeMeasurement;
import hu.csega.genetic.framework.mutation.BestsInFavorMutationStrategy;
import hu.csega.genetic.framework.mutation.MutationStrategy;
import hu.csega.toolshed.logging.Logger;
import hu.csega.toolshed.logging.LoggerFactory;

/**
 * This is only for testing the genetic algorythm's near-by mutation.
 * In certain cases a near-by mutation MUST ALWAYS get closer to the perfect solution by definition.
 */
public class TestRandomByteValues {

	private static final int LENGTH = 20;

	public static void main(String[] args) {

		Chromosome goalChromosome = new Chromosome(LENGTH);
		goalChromosome.randomizeGenes();
		final byte[] goal = goalChromosome.getGenes();

		DistanceFromOptimum distance = new DistanceFromOptimum() {

			@Override
			public double calculate(Chromosome chromosome) {
				byte[] current = chromosome.getGenes();
				long sum = 0;

				for(int i = 0; i < LENGTH; i++)
					sum += Math.abs(current[i] - goal[i]);

				return (double)sum;
			}

			private static final long serialVersionUID = 1L;
		};


		Chromosome adamAndEve = new Chromosome(LENGTH);
		Population population = Population.builder(adamAndEve, distance).build();
		MutationStrategy mutationStrategy = new BestsInFavorMutationStrategy();

		double error = distance.calculate(adamAndEve);
		logger.info("Initial error: " + error);

		while(error > 0.0001) {
			Measurement m = new TimeMeasurement(1, 2);

			while(!m.finished()) {
				population.startRound();
				population.mutateToNearOnes(1, mutationStrategy);
				population.keep(1);
				population.endRound();

				if(m.timeToLog()) {
					error = distance.calculate(population.bestFit());
					logger.info("Current error: " + error);
					if(error < 0.00001)
						break;
				}
			}
		}

		logger.info(population.statistics(null));
		error = distance.calculate(population.bestFit());
		logger.info("Final error: " + error);
	}

	private static final Logger logger = LoggerFactory.createLogger(TestRandomByteValues.class);
}
