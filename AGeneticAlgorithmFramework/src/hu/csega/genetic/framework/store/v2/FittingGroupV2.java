package hu.csega.genetic.framework.store.v2;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.genetic.framework.PopulationKey;

public class FittingGroupV2 implements Comparable<FittingGroupV2> {

	private Double bestFitDistance = Double.POSITIVE_INFINITY;

	private TreeMap<PopulationKey, Chromosome> chromosomes = new TreeMap<>();

	public void update() {
		Iterator<Entry<PopulationKey, Chromosome>> it = chromosomes.entrySet().iterator();
		if(it.hasNext()) {
			double localDistance = it.next().getKey().getDistance();

			if(localDistance < 0.0)
				throw new RuntimeException("Distance of a chromosome can not be negative!");

			bestFitDistance = localDistance;
		} else {
			bestFitDistance = Double.POSITIVE_INFINITY;
		}
	}

	@Override
	public int compareTo(FittingGroupV2 o) {
		return Double.compare(bestFitDistance, o.bestFitDistance);
	}

}
