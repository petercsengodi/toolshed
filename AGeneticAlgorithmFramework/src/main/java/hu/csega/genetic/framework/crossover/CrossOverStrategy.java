package hu.csega.genetic.framework.crossover;

import java.util.Collection;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.Population;

public interface CrossOverStrategy {

	void setChromosomes(Collection<Chromosome> chromosomes);

	/**
	 * @return null, if this current strategy is out of choices for now.
	 */
	ChromosomePair select(Population population);

}
