package hu.csega.genetic.framework.crossover;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.Population;

/** AFAIK this doesn't work right. */
public class BestsInFavorCrossOverStrategy implements CrossOverStrategy {

	@Override
	public void setChromosomes(Collection<Chromosome> chromosomes) {
		this.list = new ArrayList<>(chromosomes);
		this.listSize = list.size();
		this.sourceOffset = 0;
		this.targetOffset = 1;
		this.sourceRandomLength = 1;
		this.targetRandomLength = 1;
	}

	@Override
	public ChromosomePair select(Population population) {
		if(sourceOffset >= listSize) {
			return null;
		}

		if(targetOffset >= listSize) {
			sourceOffset += Chromosome.RND.nextInt(sourceRandomLength++) + 1;
			targetOffset = sourceOffset + 1;
			targetRandomLength = 1;
			return select(population);
		}

		ChromosomePair pair = population.createNewChromosomePair(list.get(sourceOffset), list.get(targetOffset));
		targetOffset += Chromosome.RND.nextInt(targetRandomLength++) + 1;
		return pair;
	}

	private int sourceOffset;
	private int targetOffset;
	private int sourceRandomLength;
	private int targetRandomLength;

	private List<Chromosome> list;
	private int listSize;
}
