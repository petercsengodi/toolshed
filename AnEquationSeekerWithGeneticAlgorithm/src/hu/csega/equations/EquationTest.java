package hu.csega.equations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import hu.csega.equations.tests.GenerateTestData;
import hu.csega.equations.tests.TestData;
import hu.csega.equations.util.Conversions;
import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.DistanceFromOptimum;
import hu.csega.genetic.framework.Population;
import hu.csega.genetic.framework.crossover.CrossOverStrategy;
import hu.csega.genetic.framework.crossover.RandomCrossOverStrategy;
import hu.csega.genetic.framework.measurement.Measurement;
import hu.csega.genetic.framework.measurement.TimeMeasurement;
import hu.csega.genetic.framework.mutation.BestsInFavorMutationStrategy;
import hu.csega.genetic.framework.mutation.MutationStrategy;
import hu.csega.genetic.framework.mutation.RandomMutationStrategy;

public class EquationTest {

	public static final String POPULATION_FILE = "/tmp/population.dat";

	public static final String[] SIDE_FILES = new String[] {
			"/tmp/population_s001.dat",
			"/tmp/population_s002.dat",
			"/tmp/population_s003.dat"
	};

	private static final Equation EQUATION = new Equation();

	public static final TestData[] TEST_DATA = loadTestDataExc();

	private static TestData[] loadTestDataExc() {
		try {
			return loadTestData();
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	public static TestData[] loadTestData() throws Exception {
		File file = new File(GenerateTestData.TEST_DATA_FILENAME);

		List<TestData> data = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

		try {

			int index;
			String line;

			do {

				line = reader.readLine();
				if(line != null && !line.isEmpty()) {
					TestData testData = new TestData();
					testData.variables = new double[3];
					data.add(testData);

					index = line.indexOf(';');
					testData.variables[0] = Double.parseDouble(line.substring(0, index));
					line = line.substring(index + 1);

					index = line.indexOf(';');
					testData.variables[1] = Double.parseDouble(line.substring(0, index));
					line = line.substring(index + 1);

					index = line.indexOf(';');
					testData.variables[2] = Double.parseDouble(line.substring(0, index));
					line = line.substring(index + 1);

					testData.value = Double.parseDouble(line);
				}

			} while (line != null);

		} finally {
			reader.close();
		}

		return data.toArray(new TestData[data.size()]);
	}

	public static final DistanceFromOptimum DISTANCE = new DistanceFromOptimum() {

		@Override
		public double calculate(Chromosome chromosome) {
			EQUATION.fillFromChromosome(chromosome);

			double result, diff;
			double sum = 0.0;
			for(int i = 0; i < TEST_DATA.length; i++) {
				// TODO csega: ????
				double val = TEST_DATA[i].value;
				if(Double.isInfinite(val) || Double.isNaN(val)) {
					continue;
				}

				result = EQUATION.calculate(TEST_DATA[i].variables);
				if(Double.isFinite(result) && !Double.isNaN(result)) {
					diff = val - result;
					if(diff > 1000)
						diff = 1000;
					if(diff < -1000)
						diff = 1000;
				} else {
					diff = 1000;
				}

				if(Double.isNaN(diff) || Double.isInfinite(diff)) {
					throw new RuntimeException("Error difference just went off the chart!");
				}

				sum += diff*diff;

				if(Double.isNaN(sum) || Double.isInfinite(sum)) {
					throw new RuntimeException("Error summary just went off the chart!");
				}
			}

			return sum;
		}

		private static final long serialVersionUID = 1L;
	};

	private static Population createBrandNewPopulation() {
		byte[] zeros = new byte[Conversions.NUMBER_OF_BYTES];
		Chromosome adamAndEve = new Chromosome(zeros);

		Population population = Population.builder(DISTANCE)
				.adamAndEve(adamAndEve)
				.build();

		return population;
	}

	private static Population createOrLoadPopulation(String populationFile) {
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
			population = createBrandNewPopulation();
		}

		return population;
	}

	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		Population population = createOrLoadPopulation(POPULATION_FILE);
		Population[] sidePopulations = new Population[SIDE_FILES.length];
		for(int i = 0; i < SIDE_FILES.length; i++) {
			sidePopulations[i] = createOrLoadPopulation(SIDE_FILES[i]);
		}

		System.out.println("\n\nInitial state:\n" + population.statistics(EQUATION));
		System.out.println();

		CrossOverStrategy crossOverStrategy = new RandomCrossOverStrategy();

		int SCALE = 100; // 100

		MutationStrategy bestFitMutationStrategy = new BestsInFavorMutationStrategy();
		MutationStrategy randomMutationStrategy = new RandomMutationStrategy();

		long cycles = 0;
		Measurement m = new TimeMeasurement(120, 10);

		while(!m.finished()) {
			population.startRound();
			population.mutateToNearOnes(10 * (SCALE / 10), bestFitMutationStrategy);
			population.mutate(2 * SCALE, randomMutationStrategy);
			population.createRandomGenes(3 * SCALE, Conversions.NUMBER_OF_BYTES);
			population.initCrossOverStrategy(crossOverStrategy);
			population.crossOverSameLength(2 * SCALE, crossOverStrategy);
			population.keep(300);
			population.endRound();

			for(int i = 0; i < SIDE_FILES.length; i++) {
				Population sidePopulation = sidePopulations[i];
				sidePopulation.startRound();
				sidePopulation.mutateToNearOnes(10, bestFitMutationStrategy);
				sidePopulation.mutate(50, randomMutationStrategy);
				sidePopulation.createRandomGenes(50, Conversions.NUMBER_OF_BYTES);
				sidePopulation.initCrossOverStrategy(crossOverStrategy);
				sidePopulation.crossOverSameLength(40, crossOverStrategy);
				sidePopulation.keep(300);
				sidePopulation.endRound();


				if(sidePopulation.getRoundsCounted() >= 77) {
					System.out.println("Merging in:\n" + sidePopulation.statistics(EQUATION) + "\n\n");
					population.mergeIn(sidePopulation, 20, crossOverStrategy);
					sidePopulations[i] = createBrandNewPopulation();
				}
			}

			if(m.timeToLog()) {
				long now = System.currentTimeMillis();
				System.out.println("Still working. Duration: " + ((now - start) / 1000.0) + " sec. Cycles made: " + cycles);
			}

			if(m.autoSave()) {
				System.out.print("Auto-saving...");
				population.writeIntoFile(POPULATION_FILE);
				for(int i = 0; i < SIDE_FILES.length; i++) {
					Population p = sidePopulations[i];
					p.writeIntoFile(SIDE_FILES[i]);
				}
				System.out.println("Done!\n");
			}

			cycles++;
		}

		System.out.println("Final Statistics:\n");

		population.writeIntoFile(POPULATION_FILE);
		System.out.println("Main population (" + POPULATION_FILE + "):\n" + population.statistics(EQUATION) + "\n\n");

		for(int i = 0; i < SIDE_FILES.length; i++) {
			Population p = sidePopulations[i];
			p.writeIntoFile(SIDE_FILES[i]);
			System.out.println("Side population (" + SIDE_FILES[i] + "):\n" + p.statistics(EQUATION) + "\n\n");
		}


		long end = System.currentTimeMillis();
		System.out.println("FINISHED! Duration: " + ((end - start) / 1000.0) + " sec. Cycles made: " + cycles);
	}

}
