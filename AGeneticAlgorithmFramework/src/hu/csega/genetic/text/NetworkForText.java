package hu.csega.genetic.text;

import hu.csega.genetic.framework.Chromosome;

public class NetworkForText {

	public void fillFromChromosome(Chromosome chromosome) {
		int counter = 0;
		byte[] genes = chromosome.getGenes();

		if(genes.length != length()) {
			throw new RuntimeException("Gene must be " + length() + " long!");
		}

		for(int i = 0; i < NODES_FIRST_LAYER; i++) {
			for(int j = 0; j < NUMBER_OF_INPUTS; j++) {
				firstParameters[i][j] = byteToDouble(genes[counter++]);
			}
		}

		for(int i = 0; i < NODES_SECOND_LAYER; i++) {
			for(int j = 0; j < NODES_FIRST_LAYER; j++) {
				secondParameters[i][j] = byteToDouble(genes[counter++]);
			}
		}

		for(int i = 0; i < NODES_THIRD_LAYER; i++) {
			for(int j = 0; j < NODES_SECOND_LAYER; j++) {
				thirdParameters[i][j] = byteToDouble(genes[counter++]);
			}
		}
	}

	public Chromosome toChromosome() {
		byte[] genes = new byte[length()];

		int counter = 0;

		for(int i = 0; i < NODES_FIRST_LAYER; i++) {
			for(int j = 0; j < NUMBER_OF_INPUTS; j++) {
				genes[counter++] = doubleToByte(firstParameters[i][j]);
			}
		}

		for(int i = 0; i < NODES_SECOND_LAYER; i++) {
			for(int j = 0; j < NODES_FIRST_LAYER; j++) {
				genes[counter++] = doubleToByte(secondParameters[i][j]);
			}
		}

		for(int i = 0; i < NODES_THIRD_LAYER; i++) {
			for(int j = 0; j < NODES_SECOND_LAYER; j++) {
				genes[counter++] = doubleToByte(thirdParameters[i][j]);
			}
		}

		return new Chromosome(genes);
	}

	public boolean output(double[] input) {
		if(input.length != NUMBER_OF_INPUTS) {
			throw new RuntimeException(NUMBER_OF_INPUTS + " input variables expected");
		}

		// clear layers
		for(int i = 0; i < NODES_FIRST_LAYER; i++)
			firstLayer[i] = 0.0;
		for(int i = 0; i < NODES_SECOND_LAYER; i++)
			secondLayer[i] = 0.0;
		for(int i = 0; i < NODES_THIRD_LAYER; i++)
			thirdLayer[i] = 0.0;

		// fill first layer
		for(int i = 0; i < NODES_FIRST_LAYER; i++) {
			for(int j = 0; j < NUMBER_OF_INPUTS; j++) {
				firstLayer[i] += firstParameters[i][j] * input[j];
			}
		}

		// fill second layer
		for(int i = 0; i < NODES_SECOND_LAYER; i++) {
			for(int j = 0; j < NODES_FIRST_LAYER; j++) {
				secondLayer[i] += secondParameters[i][j] * firstLayer[j];
			}
		}

		// third second layer
		for(int i = 0; i < NODES_THIRD_LAYER; i++) {
			for(int j = 0; j < NODES_SECOND_LAYER; j++) {
				thirdLayer[i] += thirdParameters[i][j] * secondLayer[j];
			}
		}

		// return output
		return thirdLayer[0] > 0;
	}

	private int length() {
		return NODES_FIRST_LAYER * NUMBER_OF_INPUTS
				+ NODES_SECOND_LAYER * NODES_FIRST_LAYER
				+ NODES_THIRD_LAYER * NODES_SECOND_LAYER;
	}

	private double byteToDouble(byte input) {
		return (double)(input / 10.0);
	}

	private byte doubleToByte(double input) {
		return (byte)(10 * input);
	}

	private double[][] firstParameters = new double[NODES_FIRST_LAYER][NUMBER_OF_INPUTS];
	private double[][] secondParameters = new double[NODES_SECOND_LAYER][NODES_FIRST_LAYER];
	private double[][] thirdParameters = new double[NODES_THIRD_LAYER][NODES_SECOND_LAYER];

	private double[] firstLayer = new double[NODES_FIRST_LAYER];
	private double[] secondLayer = new double[NODES_SECOND_LAYER];
	private double[] thirdLayer = new double[NODES_THIRD_LAYER];

	public static final int NUMBER_OF_INPUTS = 20;
	public static final int NODES_FIRST_LAYER = 10;
	public static final int NODES_SECOND_LAYER = 5;
	public static final int NODES_THIRD_LAYER = 1;
}
