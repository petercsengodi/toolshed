package hu.csega.agents.adder.operations;

import java.util.ArrayList;
import java.util.List;

import hu.csega.agents.adder.AdderExecutionEnvironment;

public abstract class AdderNodeOperation extends AdderOperation {

	protected List<AdderOperation> children = new ArrayList<>();

	protected AdderNodeOperation(AdderExecutionEnvironment env) {
		super(env);
	}

	public List<AdderOperation> getChildren() {
		return children;
	}

	@Override
	public int numberOfCurrentChildren() {
		return children == null ? 0 : children.size();
	}
}
