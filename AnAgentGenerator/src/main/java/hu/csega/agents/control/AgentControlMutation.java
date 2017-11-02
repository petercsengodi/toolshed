package hu.csega.agents.control;

import hu.csega.genetic.framework.mutation.MutationSelectionStrategy;

public class AgentControlMutation {

	private MutationSelectionStrategy strategy;
	private AgentControlMutationKind kind;
	private int numberOfChromosomesToMutate;
	private int numberOfMaximumMutations;

	public AgentControlMutation(MutationSelectionStrategy strategy, AgentControlMutationKind kind, int numberOfChromosomesToMutate, int numberOfMaximumMutations) {
		this.strategy = strategy;
		this.kind = kind;
		this.numberOfChromosomesToMutate = numberOfChromosomesToMutate;
		this.numberOfMaximumMutations = numberOfMaximumMutations;
	}

	public MutationSelectionStrategy getStrategy() {
		return strategy;
	}

	public AgentControlMutationKind getKind() {
		return kind;
	}

	public int getNumberOfChromosomesToMutate() {
		return numberOfChromosomesToMutate;
	}

	public int getNumberOfMaximumMutations() {
		return numberOfMaximumMutations;
	}

}
