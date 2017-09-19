package hu.csega.image.testrep;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Map.Entry;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.Population;
import hu.csega.genetic.framework.PopulationKey;
import hu.csega.genetic.framework.crossover.BestsInFavorCrossOverStrategy;
import hu.csega.genetic.framework.crossover.CrossOverStrategy;
import hu.csega.genetic.framework.crossover.RandomCrossOverStrategy;
import hu.csega.genetic.framework.measurement.Measurement;
import hu.csega.genetic.framework.measurement.TimeMeasurement;
import hu.csega.genetic.framework.mutation.BestsInFavorMutationStrategy;
import hu.csega.genetic.framework.mutation.MutationSelectionStrategy;
import hu.csega.genetic.framework.mutation.RandomMutationStrategy;
import hu.csega.image.TestImageRepresentation;
import hu.csega.toolshed.logging.Logger;
import hu.csega.toolshed.logging.LoggerFactory;

public class TestImageRepresentationFrame extends JFrame implements ActionListener, Runnable {

	public static final CrossOverStrategy randomCrossOverStrategy = new RandomCrossOverStrategy();
	public static final CrossOverStrategy bestFitCrossOverStrategy = new BestsInFavorCrossOverStrategy();
	public static final MutationSelectionStrategy bestFitMutationStrategy = new BestsInFavorMutationStrategy();
	public static final MutationSelectionStrategy randomMutationStrategy = new RandomMutationStrategy();

	private BufferedImage lastResult;
	private TestImageRepresentationCanvas canvas;
	private Population population;
	private MultipleCubes cubes;

	private JPanel buttons = new JPanel();
	private JButton start = new JButton("Start");
	private JButton stop = new JButton("Stop");
	private boolean canStart = true;
	private boolean keepRunning = false;

	private int fixPosition = 0;

	private Thread thread;

	public TestImageRepresentationFrame() {
		super("Test Image Representation");

		lastResult = new BufferedImage(TestImageRepresentation.WIDTH, TestImageRepresentation.HEIGHT, BufferedImage.TYPE_INT_RGB);

		canvas = new TestImageRepresentationCanvas(this);
		canvas.setPreferredSize(new Dimension(TestImageRepresentation.WIDTH, TestImageRepresentation.HEIGHT));

		Container cp = this.getContentPane();
		cp.setLayout(new BorderLayout());

		cp.add(canvas, BorderLayout.NORTH);
		cp.add(buttons, BorderLayout.SOUTH);

		buttons.setLayout(new FlowLayout());
		buttons.add(start);
		buttons.add(stop);

		start.addActionListener(this);
		stop.addActionListener(this);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
	}

	public void setPopulation(Population population) {
		this.population = population;
	}

	public void setCubes(MultipleCubes cubes) {
		this.cubes = cubes;
	}

	public synchronized void updateResult(MultipleCubes cubes, Color clearColor) {
		cubes.draw(lastResult, clearColor);
	}

	public synchronized BufferedImage getResult() {
		return lastResult;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();

		if(source == start) {
			if(canStart) {
				keepRunning = true;
				canStart = false;
				logger.info("Starting thread.");
				thread = new Thread(this);
				thread.start();
			}
		}

		if(source == stop) {
			if(keepRunning) {
				logger.info("Telling thread to stop.");
				keepRunning = false;
			}
		}
	}

	@Override
	public void run() {
		logger.info("Thread started.");

		while(true) {
			if(!keepRunning)
				break;

			doOneLoop();

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				logger.info("Thread interrupted.");
				break;
			}
		}

		canStart = true;
		logger.info("Thread stopped.");
	}

	private void doOneLoop() {
		long cycles = 0;
		Measurement m = new TimeMeasurement(1, 2);

		while(!m.finished()) {
			population.startRound();

			if(TestImageRepresentation.DIRECTED_MUTATION_APPROACH_ENABLED) {
				fixPosition = (fixPosition + 1) % population.geneLength();
				population.mutateContinuously(100, bestFitMutationStrategy, 100, fixPosition);
			}

			population.mutateToNearOnes(3, bestFitMutationStrategy);
			population.mutate(3 * TestImageRepresentation.SCALE, randomMutationStrategy);
			population.createRandomGenes(3 * TestImageRepresentation.SCALE);
			population.initCrossOverStrategy(randomCrossOverStrategy);
			population.crossOver(TestImageRepresentation.SCALE, randomCrossOverStrategy);
			population.initCrossOverStrategy(bestFitCrossOverStrategy);
			population.crossOver(TestImageRepresentation.SCALE, bestFitCrossOverStrategy);
			population.keep(20000);
			population.endRound();
			cycles++;

			if(!keepRunning) {
				logger.info("Breaking loop.");
				break;
			} else if(m.timeToLog()) {
				logger.info("Working. (" + cycles + ")");
				updateCanvas();
			}
		}

		logger.info("Done cycles: " + cycles);
		updateCanvas();

		logger.info("Auto-saving...");
		population.writeIntoFile(TestImageRepresentation.POPULATION_FILE);
		logger.info(population.statistics(cubes));
	}

	private void updateCanvas() {
		Entry<PopulationKey, Chromosome> firstElement = population.iterator().next();
		double distance = firstElement.getKey().getDistance();
		logger.info("Best Fit Distance: " + distance);

		Chromosome chromosome = firstElement.getValue();
		cubes.fillFromChromosome(chromosome);
		updateResult(cubes, TestImageRepresentation.CLEAR_COLOR);

		canvas.repaint();
	}

	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.createLogger(TestImageRepresentationFrame.class);
}
