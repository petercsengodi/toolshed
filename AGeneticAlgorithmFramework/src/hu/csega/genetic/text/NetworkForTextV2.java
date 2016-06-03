package hu.csega.genetic.text;

import hu.csega.genetic.framework.Chromosome;

public class NetworkForTextV2 {

	public void fillFromChromosome(Chromosome chromosome) {
		byte[] genes = chromosome.getGenes();

		if(genes.length != LENGTH_PARAMETERS) {
			throw new RuntimeException("Gene must be " + LENGTH_PARAMETERS + " long!");
		}

		for(int i = 0; i < genes.length; i++) {
			parameters[i] = byteToDouble(genes[i]);
		}
	}

	public double output(double[] input) {
		if(input.length != NUMBER_OF_INPUTS) {
			throw new RuntimeException(NUMBER_OF_INPUTS + " input variables expected");
		}

		// clear layers
		System.arraycopy(clearLayers, 0, layers, 0, LENGTH_LAYERS);

		// fill first layer
		int sourceOffset = 0;
		int targetOffset = 0;
		int parametersOffset = 0;
		for(int i = 0; i < NODES_FIRST_LAYER; i++) {
			for(int j = 0; j < NUMBER_OF_INPUTS; j++) {
				layers[targetOffset + i] += parameters[parametersOffset + i * NUMBER_OF_INPUTS + j] * input[j];
			}
			layers[targetOffset + i] += parameters[parametersOffset + i * NUMBER_OF_INPUTS + NUMBER_OF_INPUTS];
		}

		// fill second layer
		sourceOffset = targetOffset;
		targetOffset += NODES_FIRST_LAYER;
		parametersOffset += NODES_FIRST_LAYER * (NUMBER_OF_INPUTS + 1);
		for(int i = 0; i < NODES_SECOND_LAYER; i++) {
			for(int j = 0; j < NODES_FIRST_LAYER; j++) {
				layers[targetOffset + i] += parameters[parametersOffset + i * NODES_FIRST_LAYER + j] * input[j];
			}
			layers[targetOffset + i] += parameters[parametersOffset + i * NODES_FIRST_LAYER + NODES_FIRST_LAYER];
		}

		// third second layer
		sourceOffset = targetOffset;
		targetOffset += NODES_SECOND_LAYER;
		parametersOffset += NODES_SECOND_LAYER * (NODES_FIRST_LAYER + 1);
		for(int i = 0; i < NODES_THIRD_LAYER; i++) {
			for(int j = 0; j < NODES_SECOND_LAYER; j++) {
				layers[targetOffset + i] += parameters[parametersOffset + i * NODES_SECOND_LAYER + j] * input[j];
			}
			layers[targetOffset + i] += parameters[parametersOffset + i * NODES_SECOND_LAYER + NODES_SECOND_LAYER];
		}

		// return output
		sourceOffset = targetOffset;
		targetOffset += NODES_THIRD_LAYER * (NODES_SECOND_LAYER + 1);
		return sigmoid(layers[sourceOffset + 0]);
	}

	private double byteToDouble(byte input) {
		return (double)(input) / 10.0;
	}

	private static double sigmoid(double x) {
		return 1.0 / (1.0 - Math.exp(x));
	}

	public static final int NUMBER_OF_INPUTS = 20;
	public static final int NODES_FIRST_LAYER = 20;
	public static final int NODES_SECOND_LAYER = 10;
	public static final int NODES_THIRD_LAYER = 1;

	public static final int LENGTH_PARAMETERS = NODES_FIRST_LAYER * (NUMBER_OF_INPUTS + 1)
			+ NODES_SECOND_LAYER * (NODES_FIRST_LAYER + 1)
			+ NODES_THIRD_LAYER * (NODES_SECOND_LAYER + 1);

	public static final int LENGTH_LAYERS = NODES_FIRST_LAYER + NODES_SECOND_LAYER + NODES_THIRD_LAYER;

	private double[] parameters = new double[LENGTH_PARAMETERS];

	private double[] layers = new double[LENGTH_LAYERS];
	private double[] clearLayers = new double[LENGTH_LAYERS]; // always 0.0-s
}
