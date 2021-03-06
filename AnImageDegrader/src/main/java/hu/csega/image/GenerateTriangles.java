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
import hu.csega.image.common.PrototypeToArrayConverter;
import hu.csega.image.triangles.MultipleTriangles;
import hu.csega.image.triangles.MultipleTrianglesImageConverter;
import hu.csega.image.triangles.ShowTriangles;
import hu.csega.image.triangles.TriangleChromosomeRandomizer;
import hu.csega.image.triangles.TriangleTestImages;
import hu.csega.toolshed.logging.Logger;
import hu.csega.toolshed.logging.LoggerFactory;

public class GenerateTriangles {

	public static final TriangleTestImages IMAGE = TriangleTestImages.TIM_CURRY;
	public static final int WIDTH = IMAGE.getWidth();
	public static final int HEIGHT = IMAGE.getHeight();
	public static final int BUFFER_CAPACITY = WIDTH * HEIGHT * 3;
	public static final String FILE = IMAGE.getImageFile();
	public static final String POPULATION_FILE = "output/" + IMAGE.getPopulationFile() + ".dat";
	public static final String LOG_FILE = "output/" + IMAGE.getPopulationFile() + ".csv";

	public static final int NUMBER_OF_TRIANGLES = 300;
	public static final int SCALE = 30;

	public static final Color CLEAR_COLOR = Color.BLACK;

	public static void main(String[] args) {
		ImageEffectService service = new ImageEffectServiceImpl();
		BufferedImage reference = service.loadBufferedImage(FILE, WIDTH, HEIGHT, CLEAR_COLOR);
		int[] referenceImageData = new int[BUFFER_CAPACITY];
		service.imageToRGBArray(reference, referenceImageData);

		int[] buffer = new int[BUFFER_CAPACITY];
		MultipleTriangles triangles = new MultipleTriangles(NUMBER_OF_TRIANGLES);

		// PrototypeToArrayConverter converter = new MultipleTrianglesArrayConverter1(buffer, WIDTH, HEIGHT, CLEAR_COLOR.getRed(), CLEAR_COLOR.getGreen(), CLEAR_COLOR.getBlue());

		// PrototypeToArrayConverter converter = new MultipleTrianglesArrayConverter2(buffer, WIDTH, HEIGHT, CLEAR_COLOR.getRed(), CLEAR_COLOR.getGreen(), CLEAR_COLOR.getBlue());

		// PrototypeToArrayConverter converter = new MultipleTrianglesArrayConverter3(buffer, WIDTH, HEIGHT, CLEAR_COLOR.getRed(), CLEAR_COLOR.getGreen(), CLEAR_COLOR.getBlue());

		BufferedImage bufferImage = service.createNewImage(WIDTH, HEIGHT);
		PrototypeToArrayConverter converter = new MultipleTrianglesImageConverter(buffer, bufferImage, CLEAR_COLOR, service);

		ImageDistanceFromOptimum distance = new ImageDistanceFromOptimum(referenceImageData, WIDTH, HEIGHT, triangles, converter, IMAGE);

		TriangleChromosomeRandomizer randomizer = new TriangleChromosomeRandomizer(distance.getReferencePictureData(), WIDTH, HEIGHT);
		randomizer.setPrototype(triangles);

		Population population = createOrLoadPopulation(POPULATION_FILE, triangles, distance);

		ShowTriangles frame = new ShowTriangles();
		Entry<PopulationKey, Chromosome> firstElement = population.iterator().next();
		triangles.fillFromChromosome(firstElement.getValue());
		frame.updateResult(triangles, CLEAR_COLOR);
		frame.setPopulation(population);
		frame.setTriangles(triangles);
		frame.setRandomizer(randomizer);
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
