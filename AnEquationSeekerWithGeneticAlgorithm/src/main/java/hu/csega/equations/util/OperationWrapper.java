package hu.csega.equations.util;

public class OperationWrapper implements Executable {

	public Operation operation;
	public Executable left, right;

	@Override
	public double execute(double[] variables) {
		double leftValue = left.execute(variables);
		double rightValue = right.execute(variables);
		return operation.calculate(leftValue, rightValue);
	}

	@Override
	public String toString() {
		return operation.print(left.toString(), right.toString());
	}
}
