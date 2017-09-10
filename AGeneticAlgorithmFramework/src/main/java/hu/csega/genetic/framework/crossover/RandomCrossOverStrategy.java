package hu.csega.genetic.framework.crossover;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.Population;

public class RandomCrossOverStrategy implements CrossOverStrategy {

	@Override
	public void setChromosomes(Collection<Chromosome> chromosomes) {
		this.list = new ArrayList<>(chromosomes);
		this.listSize = list.size();
	}

	@Override
	public ChromosomePair select(Population population) {
		ChromosomePair pair = population.createNewChromosomePair(
				list.get(Chromosome.RND.nextInt(listSize)),
				list.get(Chromosome.RND.nextInt(listSize)));
		return pair;
	}

	private List<Chromosome> list;
	private int listSize;
}
