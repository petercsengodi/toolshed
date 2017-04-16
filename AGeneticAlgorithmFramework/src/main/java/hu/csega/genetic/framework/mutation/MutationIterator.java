package hu.csega.genetic.framework.mutation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import hu.csega.genetic.framework.Chromosome;

public class MutationIterator implements Iterator<Chromosome> {

	private int fullSize;
	private int current;
	private List<Chromosome> list = new ArrayList<>();

	MutationIterator() {
		fullSize = 0;
		current = 0;
	}

	public void add(Chromosome chromosome) {
		list.add(chromosome);
		fullSize++;
	}

	@Override
	public boolean hasNext() {
		return current >= fullSize;
	}

	@Override
	public Chromosome next() {
		int index = current % list.size();
		return list.get(index);
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("remove");
	}

}
