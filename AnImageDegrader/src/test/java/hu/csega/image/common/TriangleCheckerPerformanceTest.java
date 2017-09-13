package hu.csega.image.common;

public class TriangleCheckerPerformanceTest {

	private static final long NUMBER_OF_ROUNDS = 3;

	private static final long PICTURE_WIDTH = 800;
	private static final long PICTURE_HEIGHT = 800;
	private static final long NUMBER_OF_TRIANGLES = 300;
	private static final long NUMBER_OF_CYCLES = 1;

	private static final long NUMBER_OF_OPERATIONS = NUMBER_OF_TRIANGLES * NUMBER_OF_CYCLES;

	public static void main(String[] args) {
		System.out.println("Memory: " + Runtime.getRuntime().freeMemory());

		TriangleChecker1Impl t1 = new TriangleChecker1Impl();
		TriangleChecker2Impl t2 = new TriangleChecker2Impl();
		TriangleChecker3Impl t3 = new TriangleChecker3Impl();

		System.gc();

		System.out.println("Memory: " + Runtime.getRuntime().freeMemory());

		measure(t3);
		measure(t2);
		measure(t1);

		System.gc();

		measure(t3);

		System.gc();

		measure(t2);

		System.gc();

		measure(t1);
	}

	private static void measure(TriangleChecker tc) {
		long start1, start2, end1, end2, i, j, x, y;
		for(j = 0; j < NUMBER_OF_ROUNDS; j++) {
			start1 = System.currentTimeMillis();

			for(i = 0; i < NUMBER_OF_OPERATIONS * 10_000; i++) {
				tc.loadTriangle(-10, -10, 0, 10, 10, -10);
			}

			end1 = System.currentTimeMillis();

			start2 = System.currentTimeMillis();

			for(i = 0; i < NUMBER_OF_OPERATIONS; i++) {
				for(y = 0; y < PICTURE_HEIGHT; y++) {
					tc.moveToY(5);
					for(x = 0; x < PICTURE_WIDTH; x++) {
						tc.inside(-5);
						tc.inside(-1);
						tc.inside(0);
						tc.inside(1);
						tc.inside(5);
						tc.inside(9);
					}
				}
			}

			end2 = System.currentTimeMillis();

			System.out.println(tc.getClass().getSimpleName() + " (" + j + ") – Loading phase: " + diff(start1, end1) + " Calculation phase: " + diff(start2, end2));
			System.out.println("Memory: " + Runtime.getRuntime().freeMemory());
		}
	}

	private static String diff(long start, long end) {
		return ((end - start) / 1_000.0) + " secs.";
	}
}
