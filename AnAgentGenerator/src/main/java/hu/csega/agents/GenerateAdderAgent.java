package hu.csega.agents;

import java.io.File;
import java.util.Map.Entry;

import hu.csega.agents.adder.AddedDistanceFromOptimum;
import hu.csega.agents.adder.AdderAgentBuilder;
import hu.csega.agents.adder.AdderControlBoard;
import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.ChromosomeReceiver;
import hu.csega.genetic.framework.DistanceFromOptimum;
import hu.csega.genetic.framework.Population;
import hu.csega.genetic.framework.PopulationKey;
import hu.csega.toolshed.logging.Logger;
import hu.csega.toolshed.logging.LoggerFactory;

public class GenerateAdderAgent {

	public static final String POPULATION_FILE = "output/adder-population.dat";
	public static final String LOG_FILE = "output/adder-population.csv";

	public static void main(String[] args) {
		AdderAgentBuilder prototype = new AdderAgentBuilder();
		DistanceFromOptimum distance = new AddedDistanceFromOptimum();
		Population population = createOrLoadPopulation(POPULATION_FILE, prototype, distance);

		AdderControlBoard frame = new AdderControlBoard(POPULATION_FILE, LOG_FILE);
		Entry<PopulationKey, Chromosome> firstElement = population.iterator().next();
		frame.setPopulation(population);
		frame.setPrototype(prototype);
		frame.setVisible(true);
	}

	private static Population createBrandNewPopulation(ChromosomeReceiver prototype, DistanceFromOptimum distanceStrategy) {
		byte[] zeros = new byte[prototype.sizeInBytes()];
		Chromosome adamAndEve = new Chromosome(zeros);

		Population population = Population.builder(adamAndEve, distanceStrategy).build();
		return population;
	}

	private static Population createOrLoadPopulation(String populationFile, ChromosomeReceiver prototype, DistanceFromOptimum distanceStrategy) {
		Population population = null;

		File file = new File(populationFile);
		if(file.exists()) {
			try {

				System.out.println("Trying to load file: " + populationFile);
				population = Population.readFromFile(populationFile);
				System.out.println("File loaded.");

			} catch(Exception ex) {
				System.out.println("Error loading population.");
				population = null;
				ex.printStackTrace();
			}
		}

		if(population == null) {
			System.out.println("Creating new population.");
			population = createBrandNewPopulation(prototype, distanceStrategy);
		} else {
			population.setDistanceStrategy(distanceStrategy);
		}

		logger.info(population.statistics(prototype));
		return population;
	}

	private static final Logger logger = LoggerFactory.createLogger(GenerateAdderAgent.class);
}
