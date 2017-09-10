package hu.csega.genetic.framework.mutation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.PopulationKey;

public class MutationIterator implements Iterator<Map.Entry<PopulationKey, Chromosome>> {

	private int fullSize;
	private int current;
	private List<Map.Entry<PopulationKey, Chromosome>> list = new ArrayList<>();

	MutationIterator() {
		fullSize = 0;
		current = 0;
	}

	public void add(Map.Entry<PopulationKey, Chromosome> chromosomeWithKey) {
		list.add(chromosomeWithKey);
		fullSize++;
	}

	@Override
	public boolean hasNext() {
		return current < fullSize;
	}

	@Override
	public Map.Entry<PopulationKey, Chromosome> next() {
		int index = current % list.size();
		current++;
		return list.get(index);
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("remove");
	}

}
