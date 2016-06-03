package hu.csega.genetic.framework;

import java.io.Serializable;

public interface DistanceFromOptimum extends Serializable {

	double calculate(Chromosome chromosome);

}
