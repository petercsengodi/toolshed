package hu.csega.agents.adder.operations;

import hu.csega.agents.adder.AdderExecutionEnvironment;

public class AdderWriteRegister extends AdderNodeOperation {

	private int registerIndex;

	public AdderWriteRegister(AdderExecutionEnvironment env, int registerIndex) {
		super(env);
		this.registerIndex = registerIndex;
	}

	@Override
	public Object execute() {
		AdderOperation first = children.get(0);
		Object result = first.execute();

		if(result instanceof Integer) {
			Integer i = (Integer) result;
			env.setRegister(registerIndex, i.intValue());
		}

		return result;
	}

	@Override
	public void generateScript(StringBuilder builder) {
		builder.append("reg[").append(registerIndex).append("]=(");
		children.get(0).generateScript(builder);
		builder.append(')');
	}

	@Override
	public int numberOfNeededChildren() {
		return 1;
	}

}
