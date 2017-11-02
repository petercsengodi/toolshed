package hu.csega.agents.adder.operations;

import hu.csega.agents.adder.AdderExecutionEnvironment;

public class AdderReadParam extends AdderOperation {

	private int paramIndex;

	public AdderReadParam(AdderExecutionEnvironment env, int paramIndex) {
		super(env);
		this.paramIndex = paramIndex;
	}

	@Override
	public Object execute() {
		return Integer.valueOf(env.getParameter(paramIndex));
	}

	@Override
	public void generateScript(StringBuilder builder) {
		builder.append("param[").append(paramIndex).append(']');
	}

}
