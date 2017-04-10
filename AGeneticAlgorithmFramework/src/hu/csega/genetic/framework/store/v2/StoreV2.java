package hu.csega.genetic.framework.store.v2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.PopulationKey;

public class StoreV2 implements Serializable {

	private GroupCounterStrategyV2 groupCounterStrategy;
	private int groups;

	private List<FittingGroupV2> sortedFittingGroups;
	private FittingGroupV2[] fittingGroups;

	public StoreV2(GroupCounterStrategyV2 groupCounterStrategy) {
		this.groupCounterStrategy = groupCounterStrategy;
		this.groups = this.groupCounterStrategy.numberOfGroups();

		this.sortedFittingGroups = new ArrayList<>(groups);
		this.fittingGroups = new FittingGroupV2[groups];

		FittingGroupV2 group;
		for(int i = 0; i < groups; i++) {
			group = new FittingGroupV2();
			this.fittingGroups[i] = group;
			sortedFittingGroups.add(group);
		}
	}

	public void finishRound() {
		sortGroups();
	}

	public void addChromosome(PopulationKey key, Chromosome chromosome) {
		int groupIndex = groupCounterStrategy.groupIndexOfChromosome(chromosome);
		fittingGroups[groupIndex].addChromosome(key, chromosome);
	}

	private void sortGroups() {
		for(FittingGroupV2 fg : fittingGroups) {
			fg.update();
		}

		Collections.sort(sortedFittingGroups);
	}

	private static final long serialVersionUID = 1L;

}
