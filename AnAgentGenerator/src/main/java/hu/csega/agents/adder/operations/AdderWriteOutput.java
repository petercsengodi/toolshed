package hu.csega.agents.adder.operations;

import hu.csega.agents.adder.AdderExecutionEnvironment;

public class AdderWriteOutput extends AdderNodeOperation {

	private int outputIndex;

	public AdderWriteOutput(AdderExecutionEnvironment env, int outputIndex) {
		super(env);
		this.outputIndex = outputIndex;
	}

	@Override
	public Object execute() {
		AdderOperation first = children.get(0);
		Object result = first.execute();

		if(result instanceof Integer) {
			Integer i = (Integer) result;
			env.setOutput(outputIndex, i.intValue());
		}

		return result;
	}

	@Override
	public void generateScript(StringBuilder builder) {
		builder.append("out[").append(outputIndex).append("]=(");
		children.get(0).generateScript(builder);
		builder.append(')');
	}

	@Override
	public int numberOfNeededChildren() {
		return 1;
	}

}
