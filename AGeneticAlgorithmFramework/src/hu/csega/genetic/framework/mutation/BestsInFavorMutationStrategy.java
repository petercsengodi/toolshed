package hu.csega.genetic.framework.mutation;

import java.util.Iterator;
import java.util.TreeMap;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.PopulationKey;

public class BestsInFavorMutationStrategy implements MutationStrategy {

	private TreeMap<PopulationKey, Chromosome> chromosomes;
	private int size;

	@Override
	public void selectBatch(TreeMap<PopulationKey, Chromosome> chromosomes, int size) {
		this.chromosomes = chromosomes;
		this.size = size;
	}

	@Override
	public Iterator<Chromosome> iterator() {
		MutationIterator iterator = new MutationIterator();

		Iterator<Chromosome> it = chromosomes.values().iterator();
		if(!it.hasNext())
			throw new RuntimeException("No genoms to mutate!");

		for(int i = 0; i < size; i++) {
			if(!it.hasNext()) {
				it = chromosomes.values().iterator();
			}

			Chromosome chromosomeToMutate = it.next();
			iterator.add(chromosomeToMutate);
		}

		return iterator;
	}

}
