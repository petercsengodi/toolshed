package hu.csega.equations.util;

public class Conversions {

	public static final int NUMBER_OF_VARIABLES = 16; // constant included
	public static final int NUMBER_OF_BASE_SLOTS = 16;
	public static final int NUMBER_OF_BYTES = 3 * NUMBER_OF_BASE_SLOTS - 1;

	public static Operation operationFromByte(byte b) {
		int index = b & 15;
		return Operations.operations[index];
	}

	public static VariableWithScalar variableWithScalarFromBytes(byte upper, byte lower) {
		int mantissaTimesTen = unsignedCopy(lower);
		double mantissa = mantissaTimesTen / 10.0;

		int exponent = upper & 7;
		switch(exponent) {
		case 7:
			exponent = -1;
			break;
		case 6:
			exponent = -2;
			break;
		case 5:
			exponent = -3;
			break;
		default:
			break;
		}

		int sign = ((upper & 8) > 0) ? -1 : 1;

		VariableWithScalar vws = new VariableWithScalar();
		vws.scalar = sign * mantissa * Math.pow(10, exponent);
		vws.variableIndex = unsignedCopy(upper) / 16;

		/* FIXME csega:
		 * since there are only 3 variables now:
		 */
		vws.variableIndex = vws.variableIndex % 4;

		return vws;
	}

	private static int unsignedCopy(byte lower) {
		int ret = lower & 15;
		ret += ((int)((lower >>> 4) & 15)) << 4;
		return ret;
	}

	public static void main(String[] args) {
		byte b = 1;
		for(int i = 0; i < 10; i++) {
			System.out.println(unsignedCopy(b));
			b = (byte)(b << 1);
		}

		b = -1;
		System.out.println(unsignedCopy(b));

		byte a = -127;
		System.out.println(unsignedCopy(a));

		VariableWithScalar vws = variableWithScalarFromBytes(a, b);
		System.out.println(vws);
	}
}
