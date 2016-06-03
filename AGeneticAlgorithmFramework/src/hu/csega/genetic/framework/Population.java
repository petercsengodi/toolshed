package hu.csega.genetic.framework;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Population implements Iterable<Map.Entry<PopulationKey, Chromosome>>, Serializable {

	public static class Builder {

		public Builder adamAndEve(Chromosome chromosome) {
			population.chromosomes = new TreeMap<>();
			double distance = population.strategy.calculate(chromosome);
			population.chromosomes.put(new PopulationKey(distance, chromosome.getGenes()), chromosome);
			return this;
		}

		public Population build() {
			return population;
		}

		private Population population;
	}

	public static Builder builder(DistanceFromOptimum distance) {
		Builder builder = new Builder();
		builder.population = new Population();
		builder.population.strategy = distance;
		return builder;
	}

	public void mutate(int numberOfMutations) {
		mutate(numberOfMutations, 1);
	}

	public void mutate(int numberOfMutations, int maxMutatedBytes) {
		TreeMap<PopulationKey, Chromosome> result = new TreeMap<>();
		result.putAll(chromosomes);

		Iterator<Chromosome> it = chromosomes.values().iterator();
		if(!it.hasNext())
			throw new RuntimeException("No genoms to mutate!");

		for(int i = 0; i < numberOfMutations; i++) {

			if(!it.hasNext()) {
				it = chromosomes.values().iterator();
			}

			Chromosome genomToMutate = it.next();
			Chromosome mutated = Chromosome.mutate(genomToMutate, maxMutatedBytes);
			double distance = strategy.calculate(mutated);
			result.put(new PopulationKey(distance, mutated.getGenes()), mutated);
		}

		chromosomes = result;
	}

	public void crossOverSameLength(int numberOfCrossOvers) {
		TreeMap<PopulationKey, Chromosome> result = new TreeMap<>();
		result.putAll(chromosomes);

		List<Chromosome> list = new ArrayList<>(chromosomes.values());
		int listSize = list.size();
		Chromosome chromosome1, chromosome2;
		PopulationChildren children;
		double distance;

		for(int i = 0; i < numberOfCrossOvers; i++) {
			chromosome1 = list.get(Chromosome.RND.nextInt(listSize));
			chromosome2 = list.get(Chromosome.RND.nextInt(listSize));
			children = Chromosome.crossOverSameLength(chromosome1, chromosome2);
			distance = strategy.calculate(children.chromosome1);
			result.put(new PopulationKey(distance, children.chromosome1.getGenes()), children.chromosome1);
			distance = strategy.calculate(children.chromosome2);
			result.put(new PopulationKey(distance, children.chromosome2.getGenes()), children.chromosome2);
		}

		chromosomes = result;
	}

	public void crossOverVariateLength(int numberOfCrossOvers) {
		TreeMap<PopulationKey, Chromosome> result = new TreeMap<>();
		result.putAll(chromosomes);

		List<Chromosome> list = new ArrayList<>(chromosomes.values());
		int listSize = list.size();
		Chromosome chromosome1, chromosome2;
		PopulationChildren children;
		double distance;

		for(int i = 0; i < numberOfCrossOvers; i++) {
			chromosome1 = list.get(Chromosome.RND.nextInt(listSize));
			chromosome2 = list.get(Chromosome.RND.nextInt(listSize));
			children = Chromosome.crossOverVariateLength(chromosome1, chromosome2);
			distance = strategy.calculate(children.chromosome1);
			result.put(new PopulationKey(distance, children.chromosome1.getGenes()), children.chromosome1);
			distance = strategy.calculate(children.chromosome2);
			result.put(new PopulationKey(distance, children.chromosome2.getGenes()), children.chromosome2);
		}

		chromosomes = result;
	}

	public void keep(int numberOfGenomsToKeep) {
		TreeMap<PopulationKey, Chromosome> result = new TreeMap<>();
		Iterator<Map.Entry<PopulationKey, Chromosome>> it = chromosomes.entrySet().iterator();
		while(it.hasNext() && numberOfGenomsToKeep-- > 0) {
			Entry<PopulationKey, Chromosome> e = it.next();
			result.put(e.getKey(), e.getValue());
		}

		chromosomes = result;
	}

	public Iterator<Map.Entry<PopulationKey, Chromosome>> iterator() {
		return chromosomes.entrySet().iterator();
	}

	private TreeMap<PopulationKey, Chromosome> chromosomes;
	private DistanceFromOptimum strategy;

	private static final long serialVersionUID = 1L;
}
