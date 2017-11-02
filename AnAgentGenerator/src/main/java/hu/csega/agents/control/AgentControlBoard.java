package hu.csega.agents.control;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
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
import hu.csega.genetic.framework.ChromosomeReceiver;
import hu.csega.genetic.framework.DistanceFromOptimum;
import hu.csega.genetic.framework.Population;
import hu.csega.genetic.framework.PopulationKey;
import hu.csega.genetic.framework.crossover.CrossOverStrategy;
import hu.csega.genetic.framework.measurement.Measurement;
import hu.csega.genetic.framework.measurement.TimeMeasurement;
import hu.csega.genetic.framework.mutation.MutationSelectionStrategy;
import hu.csega.toolshed.logging.Logger;
import hu.csega.toolshed.logging.LoggerFactory;

public class AgentControlBoard extends JFrame implements ActionListener, Runnable {

	public static final int CANVAS_WIDTH = 800;
	public static final int CANVAS_HEIGHT = 600;
	public static final int SCALE = 300;

	private AgentControlCanvas canvas;

	private AgentControlParameters parameters;

	private Population population;
	private ChromosomeReceiver prototype;

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

	private String populationFile;
	private String logFile;

	public AgentControlBoard(AgentControlParameters parameters, String populationFile, String logFile) {
		super("Agent Generator – " + parameters.getTitle());
		this.parameters = parameters;
		this.populationFile = populationFile;
		this.logFile = logFile;

		this.prototype = this.parameters.getPrototype();

		canvas = new AgentControlCanvas(this, CANVAS_WIDTH, CANVAS_HEIGHT);
		canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));

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

		if(population == null) {
			logger.info("Population doesn't exist, yet. Loading or creating.");
			DistanceFromOptimum distanceStrategy = parameters.getDistanceStrategy();
			population = createOrLoadPopulation(populationFile, prototype, distanceStrategy);
			if(population != null) {
				logger.info("Good to go!");
			} else {
				logger.error("Couldn't create population! Exitting.");
				return;
			}
		}

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

			for(AgentControlCrossover crossover : parameters.getCrossovers()) {
				CrossOverStrategy strategy = crossover.getStrategy();
				int count = crossover.getCount();
				population.initCrossOverStrategy(strategy);
				population.crossOver(count, strategy);
			}

			for(AgentControlMutation mutation : parameters.getMutations()) {
				AgentControlMutationKind kind = mutation.getKind();
				MutationSelectionStrategy strategy = mutation.getStrategy();
				int numberOfChromosomesToMutate = mutation.getNumberOfChromosomesToMutate();
				int numberOfMaximumMutations = mutation.getNumberOfMaximumMutations();

				switch(kind) {
				case ONE_BYTE:
					population.mutate(SCALE, numberOfChromosomesToMutate, strategy);
					break;
				case MULTIPLE_BYTES:
					population.mutate(numberOfChromosomesToMutate, numberOfMaximumMutations, strategy);
					break;
				case CONTINUOUS:
					population.mutateContinuously(numberOfChromosomesToMutate, strategy, numberOfMaximumMutations);
					break;
				default:
					throw new IllegalStateException("No handler for kind: " + kind);
				}
			}

			population.createRandomGenes(parameters.getNumberOfNewRandomGenes());
			population.keep(parameters.getNumberOfGenesToKeep());
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
		population.writeIntoFile(populationFile);
		logger.info(population.statistics(prototype));
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

		canvas.repaint();
	}

	private void openLogFile() {
		try {
			writer = new OutputStreamWriter(new FileOutputStream(logFile));
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

	private Population createBrandNewPopulation(ChromosomeReceiver prototype, DistanceFromOptimum distanceStrategy) {
		byte[] zeros = new byte[prototype.sizeInBytes()];
		Chromosome adamAndEve = new Chromosome(zeros);

		Population population = Population.builder(adamAndEve, distanceStrategy).build();
		return population;
	}

	private Population createOrLoadPopulation(String populationFile, ChromosomeReceiver prototype, DistanceFromOptimum distanceStrategy) {
		Population population = null;

		File file = new File(populationFile);
		if(file.exists()) {
			try {

				logger.info("Trying to load file: " + populationFile);
				population = Population.readFromFile(populationFile);
				logger.info("File loaded.");

			} catch(Exception ex) {
				logger.info("Error loading population.");
				population = null;
				ex.printStackTrace();
			}
		}

		if(population == null) {
			logger.info("Creating new population.");
			population = createBrandNewPopulation(prototype, distanceStrategy);
		} else {
			population.setDistanceStrategy(distanceStrategy);
		}

		logger.info(population.statistics(prototype));
		return population;
	}

	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.createLogger(AgentControlBoard.class);
}
