package hu.csega.genetic.framework.mutation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.PopulationKey;

public class RandomMutationStrategy implements MutationStrategy {

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
		List<Chromosome> list = new ArrayList<>(chromosomes.values());

		if(list.isEmpty())
			throw new RuntimeException("No genoms to mutate!");

		int listSize = list.size();
		for(int i = 0; i < size; i++) {
			Chromosome chromosomeToMutate = list.get(Chromosome.RND.nextInt(listSize));
			iterator.add(chromosomeToMutate);
		}

		return iterator;
	}

}
