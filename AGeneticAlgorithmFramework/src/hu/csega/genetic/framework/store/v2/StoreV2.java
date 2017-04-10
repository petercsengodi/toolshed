package hu.csega.genetic.framework.store.v2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StoreV2 {

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

	private void sortGroups() {
		for(FittingGroupV2 fg : fittingGroups) {
			fg.update();
		}

		Collections.sort(sortedFittingGroups);
	}

	private GroupCounterStrategyV2 groupCounterStrategy;
	private int groups;

	private List<FittingGroupV2> sortedFittingGroups;
	private FittingGroupV2[] fittingGroups;

}
