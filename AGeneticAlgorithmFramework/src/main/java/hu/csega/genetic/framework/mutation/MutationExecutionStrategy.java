package hu.csega.genetic.framework.mutation;

import java.util.List;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.Population;

public interface MutationExecutionStrategy {

	List<Chromosome> mutate(Population population, Chromosome chromosome);

}
