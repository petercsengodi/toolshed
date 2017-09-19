package hu.csega.genetic.framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;
import java.util.TreeMap;

import hu.csega.genetic.framework.crossover.ChromosomePair;
import hu.csega.genetic.framework.crossover.CrossOverStrategy;
import hu.csega.genetic.framework.crossover.RandomCrossOverStrategy;
import hu.csega.genetic.framework.mutation.MutationExecutionStrategy;
import hu.csega.genetic.framework.mutation.MutationSelectionStrategy;

public class Population implements Iterable<Map.Entry<PopulationKey, Chromosome>>, Serializable {

	private transient long roundStartedAt;

	private long allTimeSpent;
	private long roundsCounted;

	private TreeMap<PopulationKey, Chromosome> chromosomes;
	private DistanceFromOptimum distanceStrategy;
	private int geneLength;

	private int discardedChromosomesMaxLength;
	private int discardedChromosomePairsMaxLength;

	private Map<String, String> extraProperties;

	private transient Stack<Chromosome> discardedChromosomes;
	private transient Stack<ChromosomePair> discardedChromosomePairs;

	private static final RandomCrossOverStrategy RANDOM = new RandomCrossOverStrategy();

	public static Builder builder(Chromosome chromosome, DistanceFromOptimum distanceStrategy) {
		Population population = new Population();
		population.distanceStrategy = distanceStrategy;

		if(population.chromosomes == null)
			population.chromosomes = new TreeMap<>();

		double distance = population.distanceStrategy.calculate(chromosome);
		population.chromosomes.put(new PopulationKey(distance, chromosome.getGenes()), chromosome);
		population.geneLength = chromosome.getGenes().length;

		Builder builder = new Builder();
		builder.population = population;
		return builder;
	}

	public static class Builder {

		public Builder randomGenes(int numberOfRandomGenes) {
			if(population.chromosomes == null)
				population.chromosomes = new TreeMap<>();

			population.createRandomGenes(numberOfRandomGenes);
			return this;
		}

		public Population build() {
			return population;
		}

		private Builder() {
		}

		private Population population;
	}

	public static Population readFromFile(String filename) {
		try {
			FileInputStream fin = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fin);
			Population population = (Population) ois.readObject();
			ois.close();
			return population;
		} catch (Exception e) {
			throw new RuntimeException("Error reading population file from: " + filename);
		}
	}

	@SuppressWarnings("unused")
	public void migrateData() {
		// from V1 -> V2
		if(chromosomes != null && !chromosomes.isEmpty()) {
			for(Entry<PopulationKey, Chromosome> entry : chromosomes.entrySet()) {

			}

			// TODO chromosomes = null;
		}
	}

	public void setDistanceStrategy(DistanceFromOptimum distanceStrategy) {
		this.distanceStrategy = distanceStrategy;
	}

	public void startRound() {
		roundStartedAt = System.currentTimeMillis();
	}

	public void endRound() {
		roundsCounted++;
		allTimeSpent += (System.currentTimeMillis() - roundStartedAt);
	}

	public void writeIntoFile(String filename) {
		if(filename == null || filename.isEmpty())
			return;

		try {
			FileOutputStream fileOut = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(this);
			out.close();
			fileOut.close();
		} catch(Exception ex) {
			throw new RuntimeException("Error saving population to file: " + filename);
		}

	}

	public String statistics(ChromosomeReceiver prototype) {
		StringBuilder builder = new StringBuilder();

		builder.append("All rounds done: ").append(roundsCounted)
		.append(" All time spent: ").append(allTimeSpent).append('\n');

		builder.append("Size of population: ").append(chromosomes.size()).append('\n');

		Iterator<Entry<PopulationKey, Chromosome>> it = this.iterator();

		Entry<PopulationKey, Chromosome> bestFitWithKey = it.next();
		builder.append("Best Fit Chromosome: ").append(bestFitWithKey).append('\n');
		Chromosome bestFit = bestFitWithKey.getValue();

		if(prototype != null) {
			prototype.fillFromChromosome(bestFit);
			builder.append("Best Fit Prototype: ").append(prototype).append('\n');
		}

		Entry<PopulationKey, Chromosome> leastFitWithKey = bestFitWithKey;
		while(it.hasNext())
			leastFitWithKey = it.next();

		builder.append("Least Fit Chromosome: ").append(leastFitWithKey).append('\n');
		Chromosome leastFit = leastFitWithKey.getValue();

		if(prototype != null) {
			prototype.fillFromChromosome(leastFit);
			builder.append("Least Fit Prototype: ").append(prototype).append('\n');
		}

		builder.append("Number of discarded chromosomes: ")
			.append(discardedChromosomes == null ? 0 : discardedChromosomes.size())
			.append('\n');

		builder.append("Maximum of discarded chromosomes: ").append(discardedChromosomesMaxLength).append('\n');

		builder.append("Number of discarded chromosome pairs: ")
		.append(discardedChromosomePairs == null ? 0 : discardedChromosomePairs.size())
		.append('\n');

		builder.append("Maximum of discarded chromosome pairs: ").append(discardedChromosomePairsMaxLength).append('\n');

		return builder.toString();
	}

	public void mergeIn(Population other, long scale, CrossOverStrategy crossOverStrategy) {
		int count = 0;
		List<Chromosome> list = new ArrayList<>();
		Iterator<Chromosome> itThis = this.chromosomes.values().iterator();
		while(itThis.hasNext() && count < scale) {
			list.add(itThis.next());
		}

		ChromosomePair children;
		double distance;

		// We cross over the first #scale chromosomes from each of the populations
		// (scale * scale operation)
		for(Chromosome chromosomeThis : list) {

			count = 0;
			Iterator<Entry<PopulationKey, Chromosome>> itOther = other.chromosomes.entrySet().iterator();
			if(itOther.hasNext() && count < scale) {
				Entry<PopulationKey, Chromosome> next = itOther.next();
				Chromosome chromosomeOther = next.getValue();

				children = Chromosome.crossOver(this, chromosomeThis, chromosomeOther);

				// TODO csega: if new chromosomes already exist in map, shouldn't re-calculate them

				distance = distanceStrategy.calculate(children.chromosome1);
				this.chromosomes.put(new PopulationKey(distance, children.chromosome1.getGenes()), children.chromosome1);

				distance = distanceStrategy.calculate(children.chromosome2);
				this.chromosomes.put(new PopulationKey(distance, children.chromosome2.getGenes()), children.chromosome2);

				discardChromosomePair(children);
				count++;
			}

		}

		// We copy #scale chromosomes from "other" to "this"
		int countOther = 0;
		Iterator<Entry<PopulationKey, Chromosome>> itOther = other.chromosomes.entrySet().iterator();
		if(itOther.hasNext() && countOther < scale) {
			Entry<PopulationKey, Chromosome> next = itOther.next();
			this.chromosomes.put(next.getKey(), next.getValue());
		}

		this.chromosomes.putAll(other.chromosomes);
		this.allTimeSpent += other.allTimeSpent;
		this.roundsCounted += other.roundsCounted;
	}

	public void createRandomGenes(int numberOfRandomGenes) {
		for(int i = 0; i < numberOfRandomGenes; i++) {
			Chromosome chromosome = createNewChromosome();
			chromosome.randomizeGenes();

			double distance = distanceStrategy.calculate(chromosome);
			chromosomes.put(new PopulationKey(distance, chromosome.getGenes()), chromosome);
		}
	}

	public void createRandomGenes(int numberOfRandomGenes, ChromosomeRandomizer randomizerStrategy) {
		for(int i = 0; i < numberOfRandomGenes; i++) {
			Chromosome chromosome = createNewChromosome();
			chromosome.randomizeGenes(randomizerStrategy);

			double distance = distanceStrategy.calculate(chromosome);
			chromosomes.put(new PopulationKey(distance, chromosome.getGenes()), chromosome);
		}
	}

	public void mutate(int numberOfMutations, MutationSelectionStrategy strategy) {
		mutate(numberOfMutations, 1, strategy);
	}

	public void mutate(int numberOfChromosomesToMutate, int maxMutatedBytes, MutationSelectionStrategy strategy) {
		strategy.selectBatch(chromosomes, numberOfChromosomesToMutate);

		Chromosome chromosomeToMutate;
		double distance;

		for(Map.Entry<PopulationKey, Chromosome> chromosomeWithKey : strategy) {
			chromosomeToMutate = chromosomeWithKey.getValue();
			Chromosome mutated = Chromosome.mutate(this, chromosomeToMutate, maxMutatedBytes);
			distance = distanceStrategy.calculate(mutated);
			chromosomes.put(new PopulationKey(distance, mutated.getGenes()), mutated);
		}
	}

	public void mutate(int numberOfChromosomesToMutate, MutationSelectionStrategy strategy, MutationExecutionStrategy mutator) {
		strategy.selectBatch(chromosomes, numberOfChromosomesToMutate);

		Chromosome chromosomeToMutate;
		double distance;

		for(Map.Entry<PopulationKey, Chromosome> chromosomeWithKey : strategy) {
			chromosomeToMutate = chromosomeWithKey.getValue();
			List<Chromosome> mutatedChromosomes = mutator.mutate(this, chromosomeToMutate);
			for(Chromosome mutated : mutatedChromosomes) {
				distance = distanceStrategy.calculate(mutated);
				chromosomes.put(new PopulationKey(distance, mutated.getGenes()), mutated);
			}
		}
	}

	public void mutateContinuously(int numberOfChromosomesToMutate, MutationSelectionStrategy strategy, int maxNumberOfMutations) {
		mutateContinuously(numberOfChromosomesToMutate, strategy, maxNumberOfMutations, -1);
	}

	/**
	 * Main idea: if we manage to reduce the distance with a mutation, do that mutation
	 * a plenty more times in this cycle.
	 */
	public void mutateContinuously(int numberOfChromosomesToMutate, MutationSelectionStrategy strategy, int maxNumberOfMutations, int fixPosition) {
		strategy.selectBatch(chromosomes, numberOfChromosomesToMutate);

		Chromosome startingChromosome, lastChromosome, mutated;
		double distance, lastDistance;
		boolean keepGoing;
		int counter = 0;

		adios:
		for(Map.Entry<PopulationKey, Chromosome> chromosomeWithKey : strategy) {
			startingChromosome = chromosomeWithKey.getValue();
			distance = -1.0; // temporary value

			int position = (fixPosition < 0 ? startingChromosome.getRandomPosition() : fixPosition);
			for(byte k = -1; k < 2; k+= 2) { // -1 and +1
				lastChromosome = startingChromosome;
				lastDistance = chromosomeWithKey.getKey().getDistance();

				do {
					keepGoing = false;

					mutated = Chromosome.mutateFix(this, lastChromosome, position, k);
					counter++;

					if(mutated != null) {
						distance = distanceStrategy.calculate(mutated);

						if(distance < lastDistance) {
							chromosomes.put(new PopulationKey(distance, mutated.getGenes()), mutated);
							lastChromosome = mutated;
							lastDistance = distance;
							keepGoing = true;
						}
					}

					if(counter >= maxNumberOfMutations)
						break adios; // !!!!

				} while(keepGoing);
			}
		}
	}

	/** Results in (2*numberOfBytesInChromosome * numberOfChromosomesToMutate) new entities. */
	public void mutateToNearOnes(int numberOfChromosomesToMutate, MutationSelectionStrategy strategy) {
		strategy.selectBatch(chromosomes, numberOfChromosomesToMutate);

		Chromosome chromosomeToMutate, mutated;
		double distance;
		int counter = 0;

		for(Map.Entry<PopulationKey, Chromosome> chromosomeWithKey : strategy) {
			chromosomeToMutate = chromosomeWithKey.getValue();

			for(byte k = -1; k < 2; k+= 2) { // -1 and +1
				for(int j = 0; j < geneLength; j++) {
					mutated = Chromosome.mutateFix(this, chromosomeToMutate, j, k);
					if(mutated != null) {
						distance = distanceStrategy.calculate(mutated);
						chromosomes.put(new PopulationKey(distance, mutated.getGenes()), mutated);
					}
				}
			}

			counter++;
			if(counter >= numberOfChromosomesToMutate)
				break;
		}
	}

	public int mutateToNearOnes(int numberOfChromosomesToMutate, MutationSelectionStrategy strategy, int start, int maxNumberOfMutations) {
		strategy.selectBatch(chromosomes, numberOfChromosomesToMutate);

		if(start >= geneLength)
			start = (start % geneLength);

		Chromosome chromosomeToMutate, mutated;
		double distance;
		int counter = 0, mutations = 0;

		adios:
		for(Map.Entry<PopulationKey, Chromosome> chromosomeWithKey : strategy) {
			chromosomeToMutate = chromosomeWithKey.getValue();

			for(byte k = -1; k < 2; k+= 2) { // -1 and +1
				for(int j = start; j < geneLength; j++) {
					mutated = Chromosome.mutateFix(this, chromosomeToMutate, j, k);
					if(mutated != null) {
						distance = distanceStrategy.calculate(mutated);
						chromosomes.put(new PopulationKey(distance, mutated.getGenes()), mutated);
					}

					mutations ++;
					if(mutations >= maxNumberOfMutations) {
						start = j;
						break adios;
					}
				}
			}

			start = 0;

			counter++;
			if(counter >= numberOfChromosomesToMutate)
				break;
		}

		return start;
	}

	/**
	 * Main idea: if we manage to reduce the distance with a mutation, do that mutation
	 * a plenty more times in this cycle.
	 */
	public void mutateContinuouslyToNearOnes(int numberOfChromosomesToMutate, MutationSelectionStrategy strategy, int maxNumberOfMutations) {
		strategy.selectBatch(chromosomes, numberOfChromosomesToMutate);

		Chromosome startingChromosome, lastChromosome, mutated;
		double distance, lastDistance;
		boolean keepGoing;
		int counter = 0;

		adios:
		for(Map.Entry<PopulationKey, Chromosome> chromosomeWithKey : strategy) {
			startingChromosome = chromosomeWithKey.getValue();

			for(int j = 0; j < geneLength; j++) {
				for(byte k = -1; k < 2; k+= 2) { // -1 and +1
					lastChromosome = startingChromosome;
					lastDistance = chromosomeWithKey.getKey().getDistance();

					do {
						keepGoing = false;

						mutated = Chromosome.mutateFix(this, lastChromosome, j, k);
						counter++;

						if(mutated != null) {
							distance = distanceStrategy.calculate(mutated);

							if(distance < lastDistance) {
								chromosomes.put(new PopulationKey(distance, mutated.getGenes()), mutated);
								lastChromosome = mutated;
								lastDistance = distance;
								keepGoing = true;
							}
						}

						if(counter >= maxNumberOfMutations)
							break adios; // !!!!

					} while(keepGoing);
				}
			}
		}
	}

	// FIXME csega: this is sh*t
	public void initCrossOverStrategy(CrossOverStrategy crossOverStrategy) {
		crossOverStrategy.setChromosomes(chromosomes.values());
	}

	public void crossOverSameLength(int numberOfCrossOvers) {
		crossOver(numberOfCrossOvers, RANDOM);
	}

	public void crossOver(int numberOfCrossOvers, CrossOverStrategy crossOverStrategy) {
		TreeMap<PopulationKey, Chromosome> result = new TreeMap<>();
		result.putAll(chromosomes);

		ChromosomePair parents;
		ChromosomePair children;
		double distance;

		for(int i = 0; i < numberOfCrossOvers; i++) {
			parents = crossOverStrategy.select(this);

			if(parents == null) {
				System.out.println("Algorithm could select only " + i + " pairs, exiting loop.");
				break;
			}

			children = Chromosome.crossOver(this, parents.chromosome1, parents.chromosome2);

			// TODO csega: if new chromosomes already exist in map, shouldn't re-calculate them

			distance = distanceStrategy.calculate(children.chromosome1);
			result.put(new PopulationKey(distance, children.chromosome1.getGenes()), children.chromosome1);

			distance = distanceStrategy.calculate(children.chromosome2);
			result.put(new PopulationKey(distance, children.chromosome2.getGenes()), children.chromosome2);

			discardChromosomePair(parents);
			discardChromosomePair(children);
		}

		chromosomes = result;
	}

	public void crossOverVariateLength(int numberOfCrossOvers) {
		crossOver(numberOfCrossOvers, new RandomCrossOverStrategy());
	}

	public void keep(int numberOfGenomsToKeep) {
		// TODO spare treemap objects?
		TreeMap<PopulationKey, Chromosome> result = new TreeMap<>();

		Iterator<Map.Entry<PopulationKey, Chromosome>> it = chromosomes.entrySet().iterator();
		while(it.hasNext() && numberOfGenomsToKeep-- > 0) {
			Entry<PopulationKey, Chromosome> e = it.next();
			result.put(e.getKey(), e.getValue());
		}

		while(it.hasNext()) {
			Entry<PopulationKey, Chromosome> e = it.next();
			discardChromosome(e.getValue());
		}

		chromosomes = result;
	}

	@Override
	public Iterator<Map.Entry<PopulationKey, Chromosome>> iterator() {
		return chromosomes.entrySet().iterator();
	}

	public long getRoundsCounted() {
		return roundsCounted;
	}

	public Chromosome createNewChromosome() {
		if(discardedChromosomes == null || discardedChromosomes.isEmpty())
			return new Chromosome(geneLength);
		else
			return discardedChromosomes.pop();
	}

	public Chromosome copyChromosome(Chromosome chromosome) {
		Chromosome ret = createNewChromosome();
		ret.fromOtherChromosome(chromosome);
		return ret;
	}

	public ChromosomePair createNewChromosomePair(Chromosome c1, Chromosome c2) {
		ChromosomePair pair;

		if(discardedChromosomePairs == null || discardedChromosomePairs.isEmpty())
			pair = new ChromosomePair();
		else
			pair = discardedChromosomePairs.pop();

		pair.chromosome1 = c1;
		pair.chromosome2 = c2;
		return pair;
	}

	public void discardChromosome(Chromosome chromosome) {
		if(discardedChromosomes == null)
			discardedChromosomes = new Stack<>();

		discardedChromosomes.push(chromosome);
		if(discardedChromosomes.size() > discardedChromosomesMaxLength)
			discardedChromosomesMaxLength = discardedChromosomes.size();
	}

	public void discardChromosomePair(ChromosomePair pair) {
		if(discardedChromosomePairs == null)
			discardedChromosomePairs = new Stack<>();

		discardedChromosomePairs.push(pair);
		if(discardedChromosomePairs.size() > discardedChromosomePairsMaxLength)
			discardedChromosomePairsMaxLength = discardedChromosomePairs.size();
	}

	public Chromosome bestFit() {
		return chromosomes.firstEntry().getValue();
	}

	public int geneLength() {
		return geneLength;
	}

	public Map<String, String> getExtraProperties() {
		if(extraProperties == null)
			extraProperties = new HashMap<>();
		return extraProperties;
	}

	private static final long serialVersionUID = 1L;
}
