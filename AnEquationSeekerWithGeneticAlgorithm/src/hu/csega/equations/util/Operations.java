package hu.csega.equations.util;

public class Operations {

	public static Operation[] operations = new Operation[16];

	static {

		// Do nothing
		operations[0] = new Operation() {
			@Override
			public double calculate(double left, double right) {
				return 0;
			}

			@Override
			public String print(String left, String right) {
				return "0";
			}
		};

		// Only first parameter
		operations[1] = new Operation() {
			@Override
			public double calculate(double left, double right) {
				return left;
			}

			@Override
			public String print(String left, String right) {
				return left;
			}
		};

		// Only second parameter
		operations[2] = new Operation() {
			@Override
			public double calculate(double left, double right) {
				return right;
			}

			@Override
			public String print(String left, String right) {
				return right;
			}
		};

		// Add
		operations[3] = new Operation() {
			@Override
			public double calculate(double left, double right) {
				return left + right;
			}

			@Override
			public String print(String left, String right) {
				return '(' + left + " + " + right + ')';
			}
		};

		// Sub
		operations[4] = new Operation() {
			@Override
			public double calculate(double left, double right) {
				return left - right;
			}

			@Override
			public String print(String left, String right) {
				return '(' + left + " - " + right + ')';
			}
		};

		// Multiply
		operations[5] = new Operation() {
			@Override
			public double calculate(double left, double right) {
				return left * right;
			}

			@Override
			public String print(String left, String right) {
				return '(' + left + " * " + right + ')';
			}
		};

		// Division
		operations[6] = new Operation() {
			@Override
			public double calculate(double left, double right) {
				if(right == 0.0)
					return Double.POSITIVE_INFINITY;
				return left / right;
			}

			@Override
			public String print(String left, String right) {
				return '(' + left + " / " + right + ')';
			}
		};

		// Modulo
		operations[7] = new Operation() {
			@Override
			public double calculate(double left, double right) {
				if(right == 0.0)
					return 0.0;
				return left - (Math.floor(left / right) * right);
			}

			@Override
			public String print(String left, String right) {
				return '(' + left + " % " + right + ')';
			}
		};

		// Sinus
		operations[8] = new Operation() {
			@Override
			public double calculate(double left, double right) {
				return Math.sin(left);
			}

			@Override
			public String print(String left, String right) {
				return "sin(" + left + ')';
			}
		};

		// Cosinus
		operations[9] = new Operation() {
			@Override
			public double calculate(double left, double right) {
				return Math.cos(left);
			}

			@Override
			public String print(String left, String right) {
				return "cos(" + left + ')';
			}
		};

		// Square
		operations[10] = new Operation() {
			@Override
			public double calculate(double left, double right) {
				return left * left;
			}

			@Override
			public String print(String left, String right) {
				return '(' + left + "^2)";
			}
		};

		// Square root
		operations[11] = new Operation() {
			@Override
			public double calculate(double left, double right) {
				return Math.sqrt(left);
			}

			@Override
			public String print(String left, String right) {
				return "sqrt(" + left + ')';
			}
		};

		// Power of Three
		operations[12] = new Operation() {
			@Override
			public double calculate(double left, double right) {
				return Math.pow(left, 3);
			}

			@Override
			public String print(String left, String right) {
				return '(' + left + "^3)";
			}
		};

		// Power of Four
		operations[13] = new Operation() {
			@Override
			public double calculate(double left, double right) {
				return Math.pow(left, 4);
			}

			@Override
			public String print(String left, String right) {
				return '(' + left + "^4)";
			}
		};

		// Power of Right
		operations[14] = new Operation() {
			@Override
			public double calculate(double left, double right) {
				return Math.pow(left, right);
			}

			@Override
			public String print(String left, String right) {
				return '(' + left + "^" + right + ')';
			}
		};

		// Logarithm
		operations[15] = new Operation() {
			@Override
			public double calculate(double left, double right) {
				if(right == 1.0)
					return Double.POSITIVE_INFINITY;
				return Math.log(left) / Math.log(right);
			}

			@Override
			public String print(String left, String right) {
				return "log(<" + left + '>' + right + ')';
			}
		};

	}

}
