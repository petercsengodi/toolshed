package hu.csega.agents.adder;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.DistanceFromOptimum;

public class AdderDistanceFromOptimum implements DistanceFromOptimum {

	private AdderAgentBuilder prototype;

	private int[] param1;
	private int[] param2;
	private int[] output;

	private static final int numberOfCases = 100;

	public AdderDistanceFromOptimum(AdderAgentBuilder prototype) {
		this.prototype = prototype;

		param1 = new int[numberOfCases];
		param2 = new int[numberOfCases];
		output = new int[numberOfCases];

		int counter = 0;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				param1[counter] = i;
				param2[counter] = j;
				output[counter] = i + j;
				counter++;
			}
		}
	}

	@Override
	public double calculate(Chromosome chromosome) {
		prototype.fillFromChromosome(chromosome);

		double sum = 0.0;

		for(int counter = 0; counter < numberOfCases; counter++) {
			prototype.setParameters(param1[counter], param2[counter]);
			prototype.execute();
			int value = prototype.getOutput()[0];
			sum += Math.abs(output[counter] - value);
		}

		return sum;
	}

	private static final long serialVersionUID = 1L;
}
