package hu.csega.genetic.framework.store.v2;

import hu.csega.genetic.framework.Chromosome;

public interface GroupCounterStrategyV2 {

	int numberOfGroups();
	int groupIndexOfChromosome(Chromosome chromosome);

}
