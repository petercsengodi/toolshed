package hu.csega.genetic.framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Population implements Iterable<Map.Entry<Double, Genom>> {

	public static class Builder {

		public Builder adamAndEve(Genom genom) {
			population.genoms = new TreeMap<>();
			double dist = population.distance.calculate(genom);
			population.genoms.put(dist, genom);
			return this;
		}

		public Population build() {
			return population;
		}

		private Population population;
	}

	public static Builder builder(DistanceFromOptimum<Genom> distance) {
		Builder builder = new Builder();
		builder.population = new Population();
		builder.population.distance = distance;
		return builder;
	}

	public void mutate(int numberOfMutations) {
		TreeMap<Double, Genom> result = new TreeMap<>();
		result.putAll(genoms);

		Iterator<Genom> it = genoms.values().iterator();
		if(!it.hasNext())
			throw new RuntimeException("No genoms to mutate!");

		for(int i = 0; i < numberOfMutations; i++) {

			if(!it.hasNext()) {
				it = genoms.values().iterator();
			}

			Genom genomToMutate = it.next();
			Genom mutated = Genom.mutate(genomToMutate);
			double dist = distance.calculate(mutated);
			result.put(dist, mutated);
		}

		genoms = result;
	}

	public void crossOver(int numberOfCrossOvers) {
		TreeMap<Double, Genom> result = new TreeMap<>();
		result.putAll(genoms);

		List<Genom> list = new ArrayList<>(genoms.values());
		int listSize = list.size();
		Genom genom1, genom2, genomNew;
		double dist;

		for(int i = 0; i < numberOfCrossOvers; i++) {
			genom1 = list.get(Genom.RND.nextInt(listSize));
			genom2 = list.get(Genom.RND.nextInt(listSize));
			genomNew = Genom.crossOver(genom1, genom2);
			dist = distance.calculate(genomNew);
			result.put(dist, genomNew);
		}

		genoms = result;
	}

	public void keep(int numberOfGenomsToKeep) {
		TreeMap<Double, Genom> result = new TreeMap<>();
		Iterator<Map.Entry<Double, Genom>> it = genoms.entrySet().iterator();
		while(it.hasNext() && numberOfGenomsToKeep-- > 0) {
			Entry<Double, Genom> e = it.next();
			result.put(e.getKey(), e.getValue());
		}

		genoms = result;
	}

	public Iterator<Map.Entry<Double, Genom>> iterator() {
		return genoms.entrySet().iterator();
	}

	private TreeMap<Double, Genom> genoms;
	private DistanceFromOptimum<Genom> distance;
}
