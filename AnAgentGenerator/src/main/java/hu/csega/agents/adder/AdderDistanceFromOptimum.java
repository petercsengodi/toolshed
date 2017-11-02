package hu.csega.agents.adder;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.DistanceFromOptimum;

public class AdderDistanceFromOptimum implements DistanceFromOptimum {

	@Override
	public double calculate(Chromosome chromosome) {
		return 1000.0; // FIXME
	}

	private static final long serialVersionUID = 1L;
}
