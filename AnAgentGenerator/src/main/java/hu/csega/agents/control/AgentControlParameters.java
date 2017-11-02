package hu.csega.agents.control;

import java.util.ArrayList;
import java.util.List;

import hu.csega.genetic.framework.ChromosomeReceiver;
import hu.csega.genetic.framework.DistanceFromOptimum;
import hu.csega.genetic.framework.crossover.CrossOverStrategy;
import hu.csega.genetic.framework.mutation.MutationSelectionStrategy;

public class AgentControlParameters {

	private String title;

	private ChromosomeReceiver prototype;
	private DistanceFromOptimum distanceStrategy;

	private List<AgentControlCrossover> crossovers = new ArrayList<>();
	private List<AgentControlMutation> mutations = new ArrayList<>();

	private int numberOfGenesToKeep = 1000;
	private int numberOfNewRandomGenes = 100;

	public AgentControlParameters title(String title) {
		this.title = title;
		return this;
	}

	public AgentControlParameters prototype(ChromosomeReceiver prototype) {
		this.prototype = prototype;
		return this;
	}

	public AgentControlParameters distanceStrategy(DistanceFromOptimum distanceStrategy) {
		this.distanceStrategy = distanceStrategy;
		return this;
	}

	public AgentControlParameters addMutation(MutationSelectionStrategy strategy, AgentControlMutationKind kind, int numberOfChromosomesToMutate, int numberOfMaximumMutations) {
		mutations.add(new AgentControlMutation(strategy, kind, numberOfChromosomesToMutate, numberOfMaximumMutations));
		return this;
	}

	public AgentControlParameters addCrossover(CrossOverStrategy strategy, int count) {
		crossovers.add(new AgentControlCrossover(strategy, count));
		return this;
	}

	public AgentControlParameters numberOfGenesToKeep(int numberOfGenesToKeep) {
		this.numberOfGenesToKeep = numberOfGenesToKeep;
		return this;
	}

	public AgentControlParameters numberOfNewRandomGenes(int numberOfNewRandomGenes) {
		this.numberOfNewRandomGenes = numberOfNewRandomGenes;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public ChromosomeReceiver getPrototype() {
		return prototype;
	}

	public DistanceFromOptimum getDistanceStrategy() {
		return distanceStrategy;
	}

	public List<AgentControlCrossover> getCrossovers() {
		return crossovers;
	}

	public List<AgentControlMutation> getMutations() {
		return mutations;
	}

	public int getNumberOfGenesToKeep() {
		return numberOfGenesToKeep;
	}

	public int getNumberOfNewRandomGenes() {
		return numberOfNewRandomGenes;
	}

}
