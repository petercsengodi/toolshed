package hu.csega.image;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Map.Entry;

import hu.csega.genetic.framework.Chromosome;
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

		byte[] zeros = new byte[triangles.sizeInBytes()];
		Chromosome adamAndEve = new Chromosome(zeros);

		double d = distance.calculate(adamAndEve);
		logger.info("Initial distance: " + d);

		ShowTriangles frame = new ShowTriangles();

		Population population = Population.builder(distance)
				.adamAndEve(adamAndEve)
				.build();

		Entry<PopulationKey, Chromosome> firstElement = population.iterator().next();
		triangles.fillFromChromosome(firstElement.getValue());
		frame.updateResult(triangles, clearColor);

		frame.setPopulation(population);
		frame.setTriangles(triangles);
		frame.setVisible(true);
	}

	private static final Logger logger = LoggerFactory.createLogger(GenerateTriangles.class);
}
