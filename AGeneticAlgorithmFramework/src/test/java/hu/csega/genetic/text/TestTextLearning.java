package hu.csega.genetic.text;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.DistanceFromOptimum;
import hu.csega.genetic.framework.Population;
import hu.csega.genetic.framework.PopulationKey;
import hu.csega.genetic.framework.crossover.BestsInFavorCrossOverStrategy;
import hu.csega.genetic.framework.crossover.CrossOverStrategy;
import hu.csega.genetic.framework.mutation.BestsInFavorMutationStrategy;
import hu.csega.genetic.framework.mutation.MutationSelectionStrategy;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

// TODO: make best genes in favor
public class TestTextLearning {

	public static final String JAVA_FILE = "java.txt";
	public static final String ENGLISH_FILE = "english.txt";
	public static final String TEST_FILE = "test.txt";

	public static final String POPULATION_FILE = "/tmp/population.ser";

	private static final int ROUNDS = 20;
	private static final int CROSS_OVER_COUNT = 100;
	private static final int MUTATION_COUNT = 100;
	private static final int NEW_RANDOM_COUNT = 100;
	private static final int MAX_MUTATED_BYTES = 4;
	private static final int KEEP_COUNT = 1000;

	private static final int PRINT_AFTER = 1;

	private static final boolean SMALL_TRAINING = true;
	private static final int SMALL_TRAINING_COUNT = 200;
	private static final boolean CONTINUOUS = true;

	private static final String readWholeFile(String fileName) {
		try {
			URL resource = TestTextLearning.class.getResource(fileName);
			File file = new File(resource.toURI());
			byte[] array = new byte[(int)file.length()];

			try (InputStream ios = new FileInputStream(file)) {
				if ( ios.read(array) == -1 ) {
					throw new IOException("EOF reached while trying to read the whole file");
				}
			}

			return new String(array, "UTF-8");
		} catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	private static List<String> sliceTextWrapper(String text) {
		List<String> result = new ArrayList<>();
		int inputLength = NetworkForTextV2.NUMBER_OF_INPUTS;
		StringTokenizer tokenizer = new StringTokenizer(text);

		StringBuilder builder = new StringBuilder();
		String token = null;

		while(true) {

			if(token == null) {
				if(!tokenizer.hasMoreTokens()) {
					if(builder.length() > 0) {
						while(builder.length() < inputLength)
							builder.append(' ');
						result.add(builder.toString());
					}

					break;
				}

				token = tokenizer.nextToken();
			}

			if(builder.length() == 0) {
				if(token.length() <= inputLength) {
					builder.append(token);
					token = null;
				} else {
					result.add(token.substring(0, inputLength));
					token = token.substring(inputLength);
				}
			} else {
				if(builder.length() + 1 + token.length() <= inputLength) {
					builder.append(' ').append(token);
					token = null;
				} else {
					while(builder.length() < inputLength)
						builder.append(' ');
					result.add(builder.toString());
					builder = new StringBuilder();
				}
			} // end if

		} // end while

		return result;
	}

	private static double[] stringToDouble(String input, int pos, int length) {
		double[] array = new double[length];
		for(int i = 0; i < length; i++) {
			array[i] = (double)(input.charAt(pos+i));
		}
		return array;
	}

	private static List<double[]> stringToDouble(List<String> input) {
		List<double[]> result = new ArrayList<>();

		for(String s : input) {
			result.add(stringToDouble(s, 0, NetworkForTextV2.NUMBER_OF_INPUTS));
		}

		return result;
	}

	private static final Map<double[], Boolean> TRAINING_DATA = new HashMap<>();

	static {
		System.out.println("--- ONCE UPON A TIME... ---");
		System.out.println();

		{
			String javaFile = readWholeFile(JAVA_FILE);
			List<double[]> javaInputs = stringToDouble(sliceTextWrapper(javaFile));

			int counter = 0;
			for(double[] input: javaInputs) {
				TRAINING_DATA.put(input, true);
				if(SMALL_TRAINING && ++counter >= SMALL_TRAINING_COUNT)
					break;
			}
		}

		{
			String englishFile = readWholeFile(ENGLISH_FILE);
			List<double[]> englishInputs = stringToDouble(sliceTextWrapper(englishFile));

			int counter = 0;
			for(double[] input: englishInputs) {
				TRAINING_DATA.put(input, false);
				if(SMALL_TRAINING && ++counter >= SMALL_TRAINING_COUNT)
					break;
			}
		}
	}

	public static final DistanceFromOptimum DISTANCE = new DistanceFromOptimum() {

		@Override
		public double calculate(Chromosome chromosome) {
			NETWORK.fillFromChromosome(chromosome);

			double sum = 0.0;
			for (Map.Entry<double[], Boolean> e : TRAINING_DATA.entrySet()) {
				double y = (e.getValue() ? 1.0 : 0.0);
				double res = NETWORK.output(e.getKey());
				sum += Math.abs(y - res);
			}

			return sum;
		}

		private static final long serialVersionUID = 1L;
	};

	public static void main(String[] args) throws Exception {
		Population population = loadPopulation();

		MutationSelectionStrategy mutationStrategy = new BestsInFavorMutationStrategy();

		System.out.println();
		System.out.println("--- THERE WAS A POPULATION OF NEURAL NETWORKS... ---");
		System.out.println();
		long start = System.currentTimeMillis();

		do {

			int counter = 0;

			while(true) {
				population.initCrossOverStrategy(CROSS_OVER);
				population.crossOver(CROSS_OVER_COUNT, CROSS_OVER);
				population.mutate(MUTATION_COUNT, MAX_MUTATED_BYTES, mutationStrategy);
				population.createRandomGenes(NEW_RANDOM_COUNT);
				population.keep(KEEP_COUNT);

				counter++;

				if(counter % PRINT_AFTER == 0) {
					Map.Entry<PopulationKey, Chromosome> chromosome = population.iterator().next();
					double value = chromosome.getKey().getDistance();
					System.out.println("After " + counter + " rounds – error value: " + value);
					if(counter >= ROUNDS) {
						break;
					}
				}
			}

			savePopulation(population);

			// logging all genes
//			counter = 0;
//			System.out.println();
//			for(Map.Entry<PopulationKey, Chromosome> chromosome : population) {
//				if(counter > 100)
//					break;
//
//				counter++;
//				System.out.println(counter + ".: " + chromosome);
//			}
//			System.out.println();

		} while(System.currentTimeMillis() > 0 && CONTINUOUS);

		population.keep(1);

		for(Map.Entry<PopulationKey, Chromosome> chromosome : population) {
			System.out.println("Final: " + chromosome);
		}

		long end = System.currentTimeMillis();
		System.out.println("Duration: " + ((end - start) / 1000.0) + " sec.");

		//////////// TEST //////////////////////////////////////////////////////////////

		for(Map.Entry<PopulationKey, Chromosome> chromosome : population) {
			NETWORK.fillFromChromosome(chromosome.getValue());
		}

		int counter = 0;
		int lastResult = -1;
		String testFile = readWholeFile(TEST_FILE);
		List<String> slices = sliceTextWrapper(testFile);

		slices.clear(); // OFF-SWITCH

		for(String s : slices) {
			int result = NETWORK.output(stringToDouble(s, 0, NetworkForTextV2.NUMBER_OF_INPUTS)) >= 0.5
					? 1 : 0;

			if(lastResult != result) {
				System.out.println();
				System.out.print(result > 0 ? "JAVA: " : "ENGLISH: ");
				lastResult = result;
			}

			System.out.print(s.trim());
			System.out.print(' ');
			if(counter > 10) {
				System.out.println();
				counter++;
			}
		}

		System.out.println();
		System.out.println("--- THE END ---");
	}

	private static void savePopulation(Population population) {
		try (
				OutputStream file = new FileOutputStream(POPULATION_FILE);
				OutputStream buffer = new BufferedOutputStream(file);
				ObjectOutput output = new ObjectOutputStream(buffer);) {
			output.writeObject(population);

			System.out.println();
			System.out.println("Population saved!");
			System.out.println();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private static Population loadPopulation() {
		try {
			File f = new File(POPULATION_FILE);
			if(f.exists()) {
				FileInputStream fin = new FileInputStream(POPULATION_FILE);
				try (ObjectInputStream ois = new ObjectInputStream(fin)) {
					System.out.println("Reading file: " + POPULATION_FILE);
					return (Population) ois.readObject();
				}
			} else {
				System.out.println("Population file doesn't exist.");
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}

		System.out.println("Creating new population.");
		Chromosome adamAndEve = new Chromosome(NetworkForTextV2.LENGTH_PARAMETERS);
		return Population.builder(adamAndEve, DISTANCE)
				.randomGenes(KEEP_COUNT - 1)
				.build();
	}

	private static final CrossOverStrategy CROSS_OVER = new BestsInFavorCrossOverStrategy();
	private static final NetworkForTextV2 NETWORK = new NetworkForTextV2();
}
