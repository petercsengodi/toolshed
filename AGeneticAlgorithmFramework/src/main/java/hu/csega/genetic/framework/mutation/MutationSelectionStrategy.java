package hu.csega.genetic.framework.mutation;

import java.util.Map;
import java.util.TreeMap;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.PopulationKey;

public interface MutationSelectionStrategy extends Iterable<Map.Entry<PopulationKey, Chromosome>> {

	void selectBatch(TreeMap<PopulationKey, Chromosome> chromosomes, int size);

}
