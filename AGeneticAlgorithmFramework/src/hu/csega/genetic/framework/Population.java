package hu.csega.genetic.framework;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import hu.csega.genetic.framework.crossover.ChromosomePair;
import hu.csega.genetic.framework.crossover.CrossOverStrategy;
import hu.csega.genetic.framework.crossover.RandomCrossOverStrategy;
import hu.csega.genetic.framework.mutation.MutationStrategy;

public class Population implements Iterable<Map.Entry<PopulationKey, Chromosome>>, Serializable {

	public static class Builder {

		public Builder adamAndEve(Chromosome chromosome) {
			if(population.chromosomes == null)
				population.chromosomes = new TreeMap<>();

			double distance = population.distanceStrategy.calculate(chromosome);
			population.chromosomes.put(new PopulationKey(distance, chromosome.getGenes()), chromosome);
			return this;
		}

		public Builder randomGenes(int numberOfRandomGenes, int length) {
			if(population.chromosomes == null)
				population.chromosomes = new TreeMap<>();

			population.createRandomGenes(numberOfRandomGenes, length);
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
		builder.population.distanceStrategy = distance;
		return builder;
	}

	public void createRandomGenes(int numberOfRandomGenes, int length) {
		for(int i = 0; i < numberOfRandomGenes; i++) {
			Chromosome chromosome = Chromosome.createRandomGene(length);
			double distance = distanceStrategy.calculate(chromosome);
			chromosomes.put(new PopulationKey(distance, chromosome.getGenes()), chromosome);
		}
	}

	public void mutate(int numberOfMutations, MutationStrategy strategy) {
		mutate(numberOfMutations, 1, strategy);
	}

	public void mutate(int numberOfChromosomesToMutate, int maxMutatedBytes, MutationStrategy strategy) {
		strategy.selectBatch(chromosomes, numberOfChromosomesToMutate);
		for(Chromosome chromosomeToMutate : strategy) {
			Chromosome mutated = Chromosome.mutate(chromosomeToMutate, maxMutatedBytes);
			double distance = distanceStrategy.calculate(mutated);
			chromosomes.put(new PopulationKey(distance, mutated.getGenes()), mutated);
		}
	}

	/** Results in (2*numberOfBytesInChromosome * numberOfChromosomesToMutate) new entities. */
	public void mutateToNearOnes(int numberOfChromosomesToMutate, MutationStrategy strategy) {
		strategy.selectBatch(chromosomes, numberOfChromosomesToMutate);
		for(Chromosome chromosomeToMutate : strategy) {
			int genesLength = chromosomeToMutate.getGenes().length;
			for(byte k = -1; k < 2; k+= 2) { // -1 and +1
				for(int j = 0; j < genesLength; j++) {
					Chromosome mutated = Chromosome.mutateFix(chromosomeToMutate, j, k);
					if(mutated != null) {
						double distance = distanceStrategy.calculate(mutated);
						chromosomes.put(new PopulationKey(distance, mutated.getGenes()), mutated);
					}
				}
			}
		}
	}

	// FIXME csega: this is sh*t
	public void initCrossOverStrategy(CrossOverStrategy crossOverStrategy) {
		crossOverStrategy.setChromosomes(chromosomes.values());
	}

	public void crossOverSameLength(int numberOfCrossOvers) {
		crossOverSameLength(numberOfCrossOvers, new RandomCrossOverStrategy());
	}

	public void crossOverSameLength(int numberOfCrossOvers, CrossOverStrategy crossOverStrategy) {
		TreeMap<PopulationKey, Chromosome> result = new TreeMap<>();
		result.putAll(chromosomes);

		ChromosomePair children;
		double distance;

		for(int i = 0; i < numberOfCrossOvers; i++) {
			ChromosomePair pair = crossOverStrategy.select();

			if(pair == null) {
				System.out.println("Algorithm could select only " + i + " pairs, exiting loop.");
				break;
			}

			children = Chromosome.crossOverSameLength(pair.chromosome1, pair.chromosome2);

			// TODO csega: if new chromosomes already exist in map, shouldn't re-calculate them

			distance = distanceStrategy.calculate(children.chromosome1);
			result.put(new PopulationKey(distance, children.chromosome1.getGenes()), children.chromosome1);

			distance = distanceStrategy.calculate(children.chromosome2);
			result.put(new PopulationKey(distance, children.chromosome2.getGenes()), children.chromosome2);
		}

		chromosomes = result;
	}

	public void crossOverVariateLength(int numberOfCrossOvers) {
		crossOverSameLength(numberOfCrossOvers, new RandomCrossOverStrategy());
	}

	public void crossOverVariateLength(int numberOfCrossOvers, CrossOverStrategy crossOverStrategy) {
		TreeMap<PopulationKey, Chromosome> result = new TreeMap<>();
		result.putAll(chromosomes);

		ChromosomePair children;
		double distance;

		for(int i = 0; i < numberOfCrossOvers; i++) {
			ChromosomePair pair = crossOverStrategy.select();

			if(pair == null) {
				System.out.println("Algorithm could select only " + i + " pairs, exiting loop.");
				break;
			}

			children = Chromosome.crossOverVariateLength(pair.chromosome1, pair.chromosome2);
			distance = distanceStrategy.calculate(children.chromosome1);
			result.put(new PopulationKey(distance, children.chromosome1.getGenes()), children.chromosome1);
			distance = distanceStrategy.calculate(children.chromosome2);
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

	@Override
	public Iterator<Map.Entry<PopulationKey, Chromosome>> iterator() {
		return chromosomes.entrySet().iterator();
	}

	private TreeMap<PopulationKey, Chromosome> chromosomes;
	private DistanceFromOptimum distanceStrategy;

	private static final long serialVersionUID = 1L;
}
