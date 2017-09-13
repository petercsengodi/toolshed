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
import hu.csega.image.testrep.MultipleCubes;
import hu.csega.image.testrep.TestImageRepresentationConverter;
import hu.csega.image.testrep.TestImageRepresentationFrame;
import hu.csega.image.triangles.TriangleTestImages;
import hu.csega.toolshed.logging.Logger;
import hu.csega.toolshed.logging.LoggerFactory;

public class TestImageRepresentation {

	public static final TriangleTestImages IMAGE = TriangleTestImages.AUTUMN;
	public static final String POPULATION_FILE = "/tmp/test-image-representation.dat";

	public static final int SCALE = 300; // 100
	public static final boolean DIRECTED_MUTATION_APPROACH_ENABLED = true;

	public static final int CUBES_WIDTH = 16;
	public static final int CUBES_HEIGHT = 8;
	public static final int CUBES_SIZE = 50;

	public static final String FILE = IMAGE.getImageFile();
	public static final int WIDTH = CUBES_WIDTH * CUBES_SIZE;
	public static final int HEIGHT = CUBES_HEIGHT * CUBES_SIZE;
	public static final int BUFFER_CAPACITY = WIDTH * HEIGHT * 3;
	public static final Color CLEAR_COLOR = Color.BLACK;

	public static void main(String[] args) {
		ImageEffectService service = new ImageEffectServiceImpl();
		BufferedImage reference = service.loadBufferedImage(FILE, WIDTH, HEIGHT, CLEAR_COLOR);
		int[] referenceImageData = new int[BUFFER_CAPACITY];
		service.imageToRGBArray(reference, referenceImageData);

		int[] buffer = new int[BUFFER_CAPACITY];
		MultipleCubes cubes = new MultipleCubes(CUBES_WIDTH, CUBES_HEIGHT, CUBES_SIZE);
		TestImageRepresentationConverter converter = new TestImageRepresentationConverter(buffer, reference, CLEAR_COLOR, service);
		ImageDistanceFromOptimum distance = new ImageDistanceFromOptimum(referenceImageData, WIDTH, HEIGHT, cubes, converter, IMAGE);

		Population population = createOrLoadPopulation(POPULATION_FILE, cubes, distance);

		TestImageRepresentationFrame frame = new TestImageRepresentationFrame();
		Entry<PopulationKey, Chromosome> firstElement = population.iterator().next();
		cubes.fillFromChromosome(firstElement.getValue());
		frame.updateResult(cubes, CLEAR_COLOR);
		frame.setPopulation(population);
		frame.setCubes(cubes);
		frame.setVisible(true);
	}

	private static Population createBrandNewPopulation(MultipleCubes prototype, DistanceFromOptimum distanceStrategy) {
		byte[] zeros = new byte[prototype.sizeInBytes()];
		Chromosome adamAndEve = new Chromosome(zeros);

		Population population = Population.builder(adamAndEve, distanceStrategy).build();
		return population;
	}

	private static Population createOrLoadPopulation(String populationFile, MultipleCubes prototype, DistanceFromOptimum distanceStrategy) {
		Population population = null;

		if(populationFile != null && !populationFile.isEmpty()) {
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

	private static final Logger logger = LoggerFactory.createLogger(TestImageRepresentation.class);
}
