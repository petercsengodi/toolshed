package hu.csega.equations.tests;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Random;

public class GenerateTestData {

	public static final int NUMBER_OF_TEST_DATA = 12000;

	public static final String TEST_DATA_FILENAME = "/tmp/testdata.dat";

	public static void main(String[] args) throws Exception {
		File outputFile = new File(TEST_DATA_FILENAME);

		OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(outputFile));

		try {
			for(int i = 0; i < NUMBER_OF_TEST_DATA; i++) {
				double x = RND.nextDouble() * 100.0 - 50.0;
				double y = RND.nextDouble() * 100.0 - 50.0;
				double z = RND.nextDouble() * 100.0 - 50.0;
				double v = fv(x, y, z);
				String row = x + ";" + y + ";" + z + ";" + v + "\n";
				writer.write(row);
			}
		} finally {
			writer.close();
		}

	}

	private static double fv(double x, double y, double z) {
		double ret = 0;

		ret += x*x*x;
		ret += 2*Math.sin(y);
		ret += -Math.sqrt(z);

		return ret;
	}

	private static final Random RND = new Random(System.currentTimeMillis());
}
