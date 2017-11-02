package hu.csega.agents.adder.operations;

import hu.csega.agents.adder.AdderExecutionEnvironment;

public class AdderReadRegister extends AdderOperation {

	private int registerIndex;

	public AdderReadRegister(AdderExecutionEnvironment env, int registerIndex) {
		super(env);
		this.registerIndex = registerIndex;
	}

	@Override
	public Object execute() {
		return Integer.valueOf(env.getRegister(registerIndex));
	}

	@Override
	public void generateScript(StringBuilder builder) {
		builder.append("reg[").append(registerIndex).append(']');
	}

}
