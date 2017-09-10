package hu.csega.image.triangles;

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
import hu.csega.genetic.framework.crossover.CrossOverStrategy;
import hu.csega.genetic.framework.crossover.RandomCrossOverStrategy;
import hu.csega.genetic.framework.measurement.Measurement;
import hu.csega.genetic.framework.measurement.TimeMeasurement;
import hu.csega.genetic.framework.mutation.BestsInFavorMutationStrategy;
import hu.csega.genetic.framework.mutation.MutationStrategy;
import hu.csega.genetic.framework.mutation.RandomMutationStrategy;
import hu.csega.image.GenerateTriangles;
import hu.csega.toolshed.logging.Logger;
import hu.csega.toolshed.logging.LoggerFactory;

public class ShowTriangles extends JFrame implements ActionListener, Runnable {

	public static final int SCALE = 100; // 100
	public static final CrossOverStrategy crossOverStrategy = new RandomCrossOverStrategy();
	public static final MutationStrategy bestFitMutationStrategy = new BestsInFavorMutationStrategy();
	public static final MutationStrategy randomMutationStrategy = new RandomMutationStrategy();

	private BufferedImage lastResult;
	private ShowTrianglesCanvas canvas;
	private Population population;
	private MultipleTriangles triangles;

	private JPanel buttons = new JPanel();
	private JButton start = new JButton("Start");
	private JButton stop = new JButton("Stop");
	private boolean canStart = true;
	private boolean keepRunning = false;

	private Thread thread;

	public ShowTriangles() {
		super("Triangle Experiment");

		lastResult = new BufferedImage(GenerateTriangles.WIDTH, GenerateTriangles.HEIGHT, BufferedImage.TYPE_INT_RGB);

		canvas = new ShowTrianglesCanvas(this);
		canvas.setPreferredSize(new Dimension(GenerateTriangles.WIDTH, GenerateTriangles.HEIGHT));

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

	public void setTriangles(MultipleTriangles triangles) {
		this.triangles = triangles;
	}

	public synchronized void updateResult(MultipleTriangles triangles, Color clearColor) {
		triangles.draw(lastResult, clearColor);
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
				Thread.sleep(100);
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
			// population.mutateToNearOnes(3, bestFitMutationStrategy);
			population.mutateContinuously(100, bestFitMutationStrategy, 100);
			population.mutate(SCALE, randomMutationStrategy);
			population.createRandomGenes(SCALE);
			population.initCrossOverStrategy(crossOverStrategy);
			population.keep(5000);
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
		population.writeIntoFile(GenerateTriangles.POPULATION_FILE);
		logger.info(population.statistics(triangles));
	}

	private void updateCanvas() {
		Entry<PopulationKey, Chromosome> firstElement = population.iterator().next();
		double distance = firstElement.getKey().getDistance();
		logger.info("Best Fit Distance: " + distance);

		Chromosome chromosome = firstElement.getValue();
		triangles.fillFromChromosome(chromosome);
		updateResult(triangles, GenerateTriangles.clearColor);

		canvas.repaint();
	}

	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.createLogger(ShowTriangles.class);
}
