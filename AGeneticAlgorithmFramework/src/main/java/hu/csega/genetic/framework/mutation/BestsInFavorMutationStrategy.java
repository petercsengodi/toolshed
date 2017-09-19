package hu.csega.genetic.framework.mutation;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.PopulationKey;

public class BestsInFavorMutationStrategy implements MutationSelectionStrategy {

	private TreeMap<PopulationKey, Chromosome> chromosomes;
	private int size;

	@Override
	public void selectBatch(TreeMap<PopulationKey, Chromosome> chromosomes, int size) {
		this.chromosomes = chromosomes;
		this.size = size;
	}

	@Override
	public Iterator<Map.Entry<PopulationKey, Chromosome>> iterator() {
		MutationIterator iterator = new MutationIterator();

		Iterator<Map.Entry<PopulationKey, Chromosome>> it = chromosomes.entrySet().iterator();
		if(!it.hasNext())
			throw new RuntimeException("No genoms to mutate!");

		for(int i = 0; i < size; i++) {
			if(!it.hasNext()) {
				it = chromosomes.entrySet().iterator();
			}

			Map.Entry<PopulationKey, Chromosome> chromosomeToMutate = it.next();
			iterator.add(chromosomeToMutate);
		}

		return iterator;
	}

}
