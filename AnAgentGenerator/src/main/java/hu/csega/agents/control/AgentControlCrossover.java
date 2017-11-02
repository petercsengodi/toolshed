package hu.csega.agents.control;

import hu.csega.genetic.framework.crossover.CrossOverStrategy;

public class AgentControlCrossover {

	private CrossOverStrategy strategy;
	private int count;

	public AgentControlCrossover(CrossOverStrategy strategy, int count) {
		this.strategy = strategy;
		this.count = count;
	}

	public CrossOverStrategy getStrategy() {
		return strategy;
	}

	public int getCount() {
		return count;
	}
}
