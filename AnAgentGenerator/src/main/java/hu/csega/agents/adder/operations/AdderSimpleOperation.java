package hu.csega.agents.adder.operations;

import hu.csega.agents.adder.AdderExecutionEnvironment;

public class AdderSimpleOperation extends AdderNodeOperation {

	private char op = 0;

	public AdderSimpleOperation(AdderExecutionEnvironment env, char op) {
		super(env);
		this.op = op;
	}

	public boolean isReturnStatement() {
		return op == 0;
	}

	@Override
	public Object execute() {
		switch(op) {
		case '+': {
			int sum = 0;
			for(AdderOperation child : children) {
				Object obj = child.execute();
				if(obj instanceof Integer) {
					sum += ((Integer)obj).intValue();
				}
			}
			return Integer.valueOf(sum);
		}
		case '-': {
			int sum = 0;
			boolean first = true;
			for(AdderOperation child : children) {
				Object obj = child.execute();
				if(obj instanceof Integer) {
					if(first)
						sum = ((Integer)obj).intValue();
					else
						sum -= ((Integer)obj).intValue();
				}
				first = false;
			}
			return Integer.valueOf(sum);
		}
		case '*': {
			int sum = 1;
			for(AdderOperation child : children) {
				Object obj = child.execute();
				if(obj instanceof Integer) {
					sum *= ((Integer)obj).intValue();
				}
			}
			return Integer.valueOf(sum);
		}
		case '/': {
			int sum = 1;
			boolean first = true;
			for(AdderOperation child : children) {
				Object obj = child.execute();
				if(obj instanceof Integer) {
					if(first)
						sum = ((Integer)obj).intValue();
					else
						sum /= ((Integer)obj).intValue();
				}
				first = false;
			}
			return Integer.valueOf(sum);
		}
		default:
			return Integer.valueOf(0);
		}
	}

	@Override
	public void generateScript(StringBuilder builder) {
		if(op != '+' && op != '*' && op != '/' && op != '-') {
			builder.append("<return>");
			return;
		}

		builder.append('(');

		boolean first = true;
		for(AdderOperation child : children) {
			if(!first)
				builder.append(' ').append(op).append(' ');
			child.generateScript(builder);
			first = false;
		}

		builder.append(')');
	}

	@Override
	public int numberOfNeededChildren() {
		if(op != '+' && op != '*' && op != '/' && op != '-') {
			return 0;
		} else {
			return 2;
		}
	}

}
