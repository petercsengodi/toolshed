package hu.csega.agents;

import static hu.csega.agents.control.AgentControlMutationKind.ONE_BYTE;

import hu.csega.agents.adder.AdderAgentBuilder;
import hu.csega.agents.adder.AdderDistanceFromOptimum;
import hu.csega.agents.control.AgentControlBoard;
import hu.csega.agents.control.AgentControlParameters;
import hu.csega.genetic.framework.DistanceFromOptimum;
import hu.csega.genetic.framework.crossover.BestsInFavorCrossOverStrategy;
import hu.csega.genetic.framework.crossover.CrossOverStrategy;
import hu.csega.genetic.framework.crossover.RandomCrossOverStrategy;
import hu.csega.genetic.framework.mutation.BestsInFavorMutationStrategy;
import hu.csega.genetic.framework.mutation.MutationSelectionStrategy;
import hu.csega.genetic.framework.mutation.RandomMutationStrategy;
import hu.csega.toolshed.logging.Logger;
import hu.csega.toolshed.logging.LoggerFactory;

public class GenerateAdderAgent {

	public static final String POPULATION_FILE = "output/adder-population.dat";
	public static final String LOG_FILE = "output/adder-population.csv";

	public static final CrossOverStrategy randomCrossOverStrategy = new RandomCrossOverStrategy();
	public static final CrossOverStrategy bestFitCrossOverStrategy = new BestsInFavorCrossOverStrategy();
	public static final MutationSelectionStrategy bestFitMutationStrategy = new BestsInFavorMutationStrategy();
	public static final MutationSelectionStrategy randomMutationStrategy = new RandomMutationStrategy();

	public static void main(String[] args) {
		logger.info("Application entry point for Adder Agent Generator.");

		AdderAgentBuilder prototype = new AdderAgentBuilder();
		DistanceFromOptimum distanceStrategy = new AdderDistanceFromOptimum(prototype);

		AgentControlParameters parameters = new AgentControlParameters()
				.title("Adder Agent Generation")
				.prototype(prototype)
				.distanceStrategy(distanceStrategy)
				.addCrossover(bestFitCrossOverStrategy, 500)
				.addCrossover(randomCrossOverStrategy, 200)
				.addMutation(randomMutationStrategy, ONE_BYTE, 1000, 1000)
				.numberOfNewRandomGenes(200)
				.numberOfGenesToKeep(50_000);

		logger.info("Parameters set.");

		AgentControlBoard frame = new AgentControlBoard(parameters, POPULATION_FILE, LOG_FILE);

		logger.info("Starting program.");
		frame.setVisible(true);
	}

	private static final Logger logger = LoggerFactory.createLogger(GenerateAdderAgent.class);
}
