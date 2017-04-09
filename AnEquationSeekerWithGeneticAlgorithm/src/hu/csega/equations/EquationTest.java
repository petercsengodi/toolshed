package hu.csega.equations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import hu.csega.equations.tests.GenerateTestData;
import hu.csega.equations.tests.TestData;
import hu.csega.equations.util.Conversions;
import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.DistanceFromOptimum;
import hu.csega.genetic.framework.Population;
import hu.csega.genetic.framework.PopulationKey;
import hu.csega.genetic.framework.crossover.CrossOverStrategy;
import hu.csega.genetic.framework.crossover.RandomCrossOverStrategy;
import hu.csega.genetic.framework.measurement.Measurement;
import hu.csega.genetic.framework.measurement.TimeMeasurement;
import hu.csega.genetic.framework.mutation.BestsInFavorMutationStrategy;
import hu.csega.genetic.framework.mutation.MutationStrategy;
import hu.csega.genetic.framework.mutation.RandomMutationStrategy;

public class EquationTest {

	public static final String POPULATION_FILE = "/tmp/population.dat";

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

	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		Population population = null;

		File file = new File(POPULATION_FILE);
		if(file.exists()) {
			try {

				System.out.println("Trying to load file: " + POPULATION_FILE);

				FileInputStream fin = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fin);
				population = (Population) ois.readObject();
				ois.close();

				System.out.println("File loaded.");

				Entry<PopulationKey, Chromosome> bestFit = population.iterator().next();
				System.out.println("Initial value: " + DISTANCE.calculate(bestFit.getValue()));
			} catch(Exception ex) {
				System.out.println("Error loading population.");
				population = null;

				ex.printStackTrace();
			}
		}

		if(population == null) {
			System.out.println("Creating new population.");

			byte[] zeros = new byte[Conversions.NUMBER_OF_BYTES];
			Chromosome adamAndEve = new Chromosome(zeros);
			System.out.println("Initial value: " + DISTANCE.calculate(adamAndEve));

			population = Population.builder(DISTANCE)
					.adamAndEve(adamAndEve)
					.build();
		}

		CrossOverStrategy strategy = new RandomCrossOverStrategy();

		int SCALE = 100; // 100

		MutationStrategy bestFitMutationStrategy = new BestsInFavorMutationStrategy();
		MutationStrategy randomMutationStrategy = new RandomMutationStrategy();

		long cycles = 0;
		Measurement m = new TimeMeasurement(25);
		System.out.print("[");

		while(!m.finished()) {
			population.createRandomGenes(3 * SCALE, Conversions.NUMBER_OF_BYTES);
			population.initCrossOverStrategy(strategy);
			population.crossOverSameLength(2 * SCALE, strategy);
			population.mutate(2 * SCALE, randomMutationStrategy);
			population.mutateToNearOnes(10 * (SCALE / 10), bestFitMutationStrategy);
			population.keep(1000);

			if(m.timeToLog())
				System.out.print(".");

			cycles++;
		}

		System.out.println("]");

		try {
			FileOutputStream fileOut = new FileOutputStream(file);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(population);
			out.close();
			fileOut.close();
		} catch(Exception ex) {
			System.out.println("Error saving population.");
			ex.printStackTrace();
		}

		population.keep(1);

		for(Map.Entry<PopulationKey, Chromosome> chromosome : population) {
			System.out.println("Final: " + chromosome);
			EQUATION.fillFromChromosome(chromosome.getValue());
			System.out.println("Equation: " + EQUATION);
		}

		long end = System.currentTimeMillis();
		System.out.println("Duration: " + ((end - start) / 1000.0) + " sec. Cycles made: " + cycles);
	}

	private static final Equation EQUATION = new Equation();
}
