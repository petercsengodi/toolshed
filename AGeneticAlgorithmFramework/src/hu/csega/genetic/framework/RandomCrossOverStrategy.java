package hu.csega.genetic.framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RandomCrossOverStrategy implements CrossOverStrategy {

	public void setChromosomes(Collection<Chromosome> chromosomes) {
		this.list = new ArrayList<>(chromosomes);
		this.listSize = list.size();
	}

	@Override
	public ChromosomePair select() {
		ChromosomePair pair = new ChromosomePair();
		pair.chromosome1 = list.get(Chromosome.RND.nextInt(listSize));
		pair.chromosome2 = list.get(Chromosome.RND.nextInt(listSize));
		return pair;
	}

	private List<Chromosome> list;
	private int listSize;
}
