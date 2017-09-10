package hu.csega.genetic.framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;
import java.util.TreeMap;

import hu.csega.genetic.framework.crossover.ChromosomePair;
import hu.csega.genetic.framework.crossover.CrossOverStrategy;
import hu.csega.genetic.framework.crossover.RandomCrossOverStrategy;
import hu.csega.genetic.framework.mutation.MutationStrategy;

public class Population implements Iterable<Map.Entry<PopulationKey, Chromosome>>, Serializable {

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

		Iterator<Entry<PopulationKey, Chromosome>> it = this.iterator();

		Entry<PopulationKey, Chromosome> bestFitWithKey = it.next();
		builder.append("Best Fit Chromosome: ").append(bestFitWithKey).append('\n');
		Chromosome bestFit = bestFitWithKey.getValue();
		prototype.fillFromChromosome(bestFit);
		builder.append("Best Fit Prototype: ").append(prototype).append('\n');

		Entry<PopulationKey, Chromosome> leastFitWithKey = bestFitWithKey;
		while(it.hasNext())
			leastFitWithKey = it.next();

		builder.append("Least Fit Chromosome: ").append(leastFitWithKey).append('\n');
		Chromosome leastFit = leastFitWithKey.getValue();
		prototype.fillFromChromosome(leastFit);
		builder.append("Least Fit Prototype: ").append(prototype).append('\n');

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
			for(byte k = -1; k < 2; k+= 2) { // -1 and +1
				for(int j = 0; j < geneLength; j++) {
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

	private transient long roundStartedAt;

	private long allTimeSpent;
	private long roundsCounted;

	private TreeMap<PopulationKey, Chromosome> chromosomes;
	private DistanceFromOptimum distanceStrategy;
	private int geneLength;

	private int discardedChromosomesMaxLength;
	private int discardedChromosomePairsMaxLength;

	private transient Stack<Chromosome> discardedChromosomes;
	private transient Stack<ChromosomePair> discardedChromosomePairs;

	private static final RandomCrossOverStrategy RANDOM = new RandomCrossOverStrategy();

	private static final long serialVersionUID = 1L;
}
