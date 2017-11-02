package hu.csega.agents.adder.operations;

import hu.csega.agents.adder.AdderExecutionEnvironment;

public abstract class AdderOperation {

	protected AdderExecutionEnvironment env;

	protected AdderOperation(AdderExecutionEnvironment env) {
		this.env = env;
	}

	public abstract Object execute();

	public abstract void generateScript(StringBuilder builder);

	public int numberOfNeededChildren() {
		return 0;
	}

	public int numberOfCurrentChildren() {
		return 0;
	}
}
