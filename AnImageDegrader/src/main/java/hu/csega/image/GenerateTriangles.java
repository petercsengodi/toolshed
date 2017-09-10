package hu.csega.image;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Map.Entry;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.DistanceFromOptimum;
import hu.csega.genetic.framework.Population;
import hu.csega.genetic.framework.PopulationKey;
import hu.csega.image.common.ImageDistanceFromOptimum;
import hu.csega.image.common.ImageEffectService;
import hu.csega.image.common.ImageEffectServiceImpl;
import hu.csega.image.triangles.MultipleTriangles;
import hu.csega.image.triangles.ShowTriangles;
import hu.csega.toolshed.logging.Logger;
import hu.csega.toolshed.logging.LoggerFactory;

public class GenerateTriangles {

	public static final String POPULATION_FILE = "/tmp/triangles.dat";

	public static final int NUMBER_OF_TRIANGLES = 300;

	public static final String FILE = "res/image/autumn.jpg";
	public static final int WIDTH = 800;
	public static final int HEIGHT = 500;
	public static final Color clearColor = Color.BLACK;

	public static void main(String[] args) {

		ImageEffectService service = new ImageEffectServiceImpl();
		BufferedImage reference = service.loadBufferedImage(FILE, WIDTH, HEIGHT, clearColor);

		MultipleTriangles triangles = new MultipleTriangles(NUMBER_OF_TRIANGLES);
		ImageDistanceFromOptimum distance = new ImageDistanceFromOptimum(reference, service, triangles);

		Population population = createOrLoadPopulation(POPULATION_FILE, triangles, distance);

		ShowTriangles frame = new ShowTriangles();
		Entry<PopulationKey, Chromosome> firstElement = population.iterator().next();
		triangles.fillFromChromosome(firstElement.getValue());
		frame.updateResult(triangles, clearColor);
		frame.setPopulation(population);
		frame.setTriangles(triangles);
		frame.setVisible(true);
	}

	private static Population createBrandNewPopulation(MultipleTriangles prototype, DistanceFromOptimum distanceStrategy) {
		byte[] zeros = new byte[prototype.sizeInBytes()];
		Chromosome adamAndEve = new Chromosome(zeros);

		Population population = Population.builder(adamAndEve, distanceStrategy).build();
		return population;
	}

	private static Population createOrLoadPopulation(String populationFile, MultipleTriangles prototype, DistanceFromOptimum distanceStrategy) {
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

	private static final Logger logger = LoggerFactory.createLogger(GenerateTriangles.class);
}
