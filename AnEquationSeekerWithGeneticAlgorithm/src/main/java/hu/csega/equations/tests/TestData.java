package hu.csega.equations.tests;

public class TestData {

	public double variables[];
	public double value;

	public String toString() {
		StringBuilder builder = new StringBuilder()
				.append("[fv(");

		boolean first = true;
		for(int i = 0 ; i < variables.length; i++) {
			if(first)
				first = false;
			else
				builder.append(';');
			builder.append(variables[i]);
		}


		return builder.append(")=").append(value).append(']').toString();
	};
}
