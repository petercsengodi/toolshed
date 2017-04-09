package hu.csega.equations.util;

public class VariableWithScalar implements Executable {

	@Override
	public double execute(double[] variables) {
		if(variableIndex == 0) {
			return scalar;
		} else {
			return scalar * variables[variableIndex - 1];
		}
	}

	public int variableIndex; // 0 is constant
	public double scalar;

	@Override
	public String toString() {
		if(variableIndex == 0) {
			return String.valueOf(scalar);
		} else {
			return "(" + scalar + "*V[" + (variableIndex - 1) + "])";
		}
	}
}
