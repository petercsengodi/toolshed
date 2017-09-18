package hu.csega.image;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Map.Entry;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.DistanceFromOptimum;
import hu.csega.genetic.framework.Population;
import hu.csega.genetic.framework.PopulationKey;
import hu.csega.image.common.ImageEffectService;
import hu.csega.image.common.ImageEffectServiceImpl;
import hu.csega.image.common.MedianDistanceFromOptimum;
import hu.csega.image.degrader.ChromosomeToImageConverter;
import hu.csega.image.degrader.DegraderTestImages;
import hu.csega.image.degrader.ShowDegrader;
import hu.csega.toolshed.logging.Logger;
import hu.csega.toolshed.logging.LoggerFactory;

public class DegradeImage {

	public static final DegraderTestImages IMAGE = DegraderTestImages.AUTUMN_800;
	public static final int WIDTH = IMAGE.getWidth();
	public static final int HEIGHT = IMAGE.getHeight();
	public static final int BUFFER_CAPACITY = WIDTH * HEIGHT * 3;
	public static final String FILE = IMAGE.getImageFile();
	public static final String POPULATION_FILE = "output/" + IMAGE.getPopulationFile() + ".dat";
	public static final String LOG_FILE = "output/" + IMAGE.getPopulationFile() + ".csv";

	public static final int SCALE = 30;

	public static final Color CLEAR_COLOR = Color.BLACK;

	public static void main(String[] args) {
		ImageEffectService service = new ImageEffectServiceImpl();
		BufferedImage reference = service.loadBufferedImage(FILE, WIDTH, HEIGHT, CLEAR_COLOR);
		int[] referenceImageData = new int[BUFFER_CAPACITY];
		service.imageToRGBArray(reference, referenceImageData);

		int[] buffer = new int[BUFFER_CAPACITY];
		ChromosomeToImageConverter converter = new ChromosomeToImageConverter(service, buffer);
		MedianDistanceFromOptimum distance = new MedianDistanceFromOptimum(referenceImageData, WIDTH, HEIGHT, converter, IMAGE);

		Population population = createOrLoadPopulation(POPULATION_FILE, converter, distance);

		ShowDegrader frame = new ShowDegrader(IMAGE);
		Entry<PopulationKey, Chromosome> firstElement = population.iterator().next();
		converter.fillFromChromosome(firstElement.getValue());
		frame.updateResult(converter, CLEAR_COLOR);
		frame.setPopulation(population);
		frame.setPrototype(converter);
		frame.setVisible(true);
	}

	private static Population createBrandNewPopulation(ChromosomeToImageConverter prototype, DistanceFromOptimum distanceStrategy) {
		byte[] zeros = new byte[prototype.sizeInBytes()];
		Chromosome adamAndEve = new Chromosome(zeros);

		Population population = Population.builder(adamAndEve, distanceStrategy).build();
		return population;
	}

	private static Population createOrLoadPopulation(String populationFile, ChromosomeToImageConverter prototype, DistanceFromOptimum distanceStrategy) {
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

	private static final Logger logger = LoggerFactory.createLogger(DegradeImage.class);
}
