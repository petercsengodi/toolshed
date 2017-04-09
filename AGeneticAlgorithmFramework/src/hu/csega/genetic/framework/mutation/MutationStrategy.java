package hu.csega.genetic.framework.mutation;

import java.util.TreeMap;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.PopulationKey;

public interface MutationStrategy extends Iterable<Chromosome> {

	void selectBatch(TreeMap<PopulationKey, Chromosome> chromosomes, int size);

}
