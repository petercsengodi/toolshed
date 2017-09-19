package hu.csega.image.triangles;

import static hu.csega.image.GenerateTriangles.SCALE;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import hu.csega.image.GenerateTriangles;
import hu.csega.toolshed.logging.Logger;
import hu.csega.toolshed.logging.LoggerFactory;

public class ShowTriangles extends JFrame implements ActionListener, Runnable {

	public static final CrossOverStrategy randomCrossOverStrategy = new RandomCrossOverStrategy();
	public static final CrossOverStrategy bestFitCrossOverStrategy = new BestsInFavorCrossOverStrategy();
	public static final MutationSelectionStrategy bestFitMutationStrategy = new BestsInFavorMutationStrategy();
	public static final MutationSelectionStrategy randomMutationStrategy = new RandomMutationStrategy();

	private BufferedImage lastResult;
	private ShowTrianglesCanvas canvas;
	private Population population;
	private MultipleTriangles triangles;
	private TriangleChromosomeRandomizer randomizer;

	private JPanel buttons = new JPanel();
	private JButton start = new JButton("Start");
	private JButton stop = new JButton("Stop");
	private boolean canStart = true;
	private boolean keepRunning = false;

	private double optimumThisFar = Double.MAX_VALUE;
	private int optimumCounter = 0;
	private OutputStreamWriter writer = null;
	private DateFormat format = null;

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

	public void setRandomizer(TriangleChromosomeRandomizer randomizer) {
		this.randomizer = randomizer;
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

		closeLogFile();
		canStart = true;
		logger.info("Thread stopped.");
	}

	private void doOneLoop() {
		long cycles = 0;
		Measurement m = new TimeMeasurement(1, 2);

		while(!m.finished()) {
			population.startRound();
			population.mutateContinuously(SCALE, bestFitMutationStrategy, SCALE);
			population.mutate(SCALE, randomMutationStrategy);
			population.mutate(SCALE, SCALE / 10, randomMutationStrategy);
			population.createRandomGenes(SCALE / 4);
			population.createRandomGenes(SCALE * 3 / 4, randomizer);
			population.initCrossOverStrategy(randomCrossOverStrategy);
			population.crossOver(SCALE, randomCrossOverStrategy);
			population.initCrossOverStrategy(bestFitCrossOverStrategy);
			population.crossOver(SCALE, bestFitCrossOverStrategy);
			population.keep(50_000);
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

		StringBuilder builder = new StringBuilder("Best Fit Distance: ").append(distance);
		if(optimumThisFar < Double.MAX_VALUE) {
			if(distance < optimumThisFar) {
				builder.append(" Reduced: ").append(optimumThisFar - distance);
			} else {
				optimumCounter++;
				builder.append(" -- no change since ").append(optimumCounter).append(" reports.");
			}
		}

		if(distance < optimumThisFar) {
			optimumThisFar = distance;
			optimumCounter = 0;
		}

		logger.info(builder.toString());
		logIntoFile(distance);

		Chromosome chromosome = firstElement.getValue();
		triangles.fillFromChromosome(chromosome);
		updateResult(triangles, GenerateTriangles.CLEAR_COLOR);

		canvas.repaint();
	}

	private void openLogFile() {
		try {
			writer = new OutputStreamWriter(new FileOutputStream(GenerateTriangles.LOG_FILE));
		} catch (FileNotFoundException ex) {
			throw new RuntimeException("Couldn't open log file!", ex);
		}

		if(format == null) {
			format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		}
	}

	private void closeLogFile() {
		try {
			if(writer != null) {
				writer.close();
				writer = null;
			}
		} catch (IOException ex) {
			throw new RuntimeException("Couldn't close log file!", ex);
		}
	}

	private void logIntoFile(double distance) {
		if(writer == null) {
			openLogFile();
		}

		try {
			writer.write(format.format(new Date()));
			writer.write(";");
			writer.write(String.valueOf(distance));
			writer.write(";\n");
			writer.flush();
		} catch (IOException ex) {
			throw new RuntimeException("Couldn't write log file!", ex);
		}
	}

	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.createLogger(ShowTriangles.class);
}
