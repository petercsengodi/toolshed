package hu.csega.image.common;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TriangleCheckerPerformanceTest {

	private static final NumberFormat FORMATTER = new DecimalFormat("#0.00000000");

	private static final long NUMBER_OF_ROUNDS = 3;

	private static final long PICTURE_SIZE = 800 * 600; // 480_000
	private static final long NUMBER_OF_TRIANGLES = 300;
	private static final long NUMBER_OF_CYCLES = 1;

	private static final long NUMBER_OF_LOADS = NUMBER_OF_TRIANGLES * NUMBER_OF_CYCLES;

	private static final long NUMBER_OF_OPERATIONS = PICTURE_SIZE * NUMBER_OF_TRIANGLES * NUMBER_OF_CYCLES;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		measure(new TriangleChecker1Impl());
		measure(new TriangleChecker2Impl());
		measure(new TriangleChecker1Impl());
		measure(new TriangleChecker2Impl());
		measure(new TriangleChecker1Impl());
		measure(new TriangleChecker2Impl());
	}

	private void measure(TriangleChecker tc) {
		for(long j = 0; j < NUMBER_OF_ROUNDS; j++) {
			long start1 = System.nanoTime();

			for(long i = 0; i < NUMBER_OF_LOADS; i++) {
				tc.loadTriangle(-10, -10, 0, 10, 10, -10);
			}

			long end1 = System.nanoTime();

			long start2 = System.nanoTime();

			for(long i = 0; i < NUMBER_OF_OPERATIONS; i++) {
				tc.inside(0, 0);
				tc.inside(1, 1);
				tc.inside(-1, -1);
				tc.inside(-10, 0);
				tc.inside(10, 0);
				tc.inside(0, -10);
			}

			long end2 = System.nanoTime();

			System.out.println(tc.getClass().getSimpleName() + " (" + j + ") – Loading phase: " + diff(start1, end1) + " Calculation phase: " + diff(start2, end2));
		}
	}

	private static String diff(long start, long end) {
		double d = ((end - start) / 1_000) / 1000_000.0;
		return FORMATTER.format(d) + " secs.";
	}
}
