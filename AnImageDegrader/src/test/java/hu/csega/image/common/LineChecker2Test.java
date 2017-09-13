package hu.csega.image.common;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LineChecker2Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testVerticalLine() {
		LineChecker2 lc = new LineChecker2();
		lc.loadLine(3, -10, 3, 10, 1, 8);

		lc.moveToY(5);
		assertEquals(true, lc.isOnTheSameSideAsReferenceValue(-9));
		assertEquals(true, lc.isOnTheSameSideAsReferenceValue(1));
		assertEquals(true, lc.isOnTheSameSideAsReferenceValue(3));
		assertEquals(false, lc.isOnTheSameSideAsReferenceValue(7));

		lc.loadLine(3, -10, 3, 10, 5, 8);

		lc.moveToY(5);
		assertEquals(false, lc.isOnTheSameSideAsReferenceValue(-9));
		assertEquals(false, lc.isOnTheSameSideAsReferenceValue(1));
		assertEquals(true, lc.isOnTheSameSideAsReferenceValue(3));
		assertEquals(true, lc.isOnTheSameSideAsReferenceValue(7));
	}

	@Test
	public void testHorizontalLine() {
		LineChecker2 lc = new LineChecker2();
		lc.loadLine(3, -10, 33, -10, 1, 8);

		lc.moveToY(5);
		assertEquals(true, lc.isOnTheSameSideAsReferenceValue(-9));
		assertEquals(true, lc.isOnTheSameSideAsReferenceValue(9));

		lc.moveToY(-10);
		assertEquals(true, lc.isOnTheSameSideAsReferenceValue(-9));
		assertEquals(true, lc.isOnTheSameSideAsReferenceValue(9));

		lc.moveToY(-20);
		assertEquals(false, lc.isOnTheSameSideAsReferenceValue(-9));
		assertEquals(false, lc.isOnTheSameSideAsReferenceValue(9));

		lc.loadLine(3, -10, 33, -10, 1, -18);

		lc.moveToY(5);
		assertEquals(false, lc.isOnTheSameSideAsReferenceValue(-9));
		assertEquals(false, lc.isOnTheSameSideAsReferenceValue(9));

		lc.moveToY(-10);
		assertEquals(true, lc.isOnTheSameSideAsReferenceValue(-9));
		assertEquals(true, lc.isOnTheSameSideAsReferenceValue(9));

		lc.moveToY(-20);
		assertEquals(true, lc.isOnTheSameSideAsReferenceValue(-9));
		assertEquals(true, lc.isOnTheSameSideAsReferenceValue(9));
	}

	@Test
	public void testGenericLine() {
		LineChecker2 lc = new LineChecker2();
		lc.loadLine(0, 1, 10, 20, 1, 20); // left from line

		lc.moveToY(19);
		assertEquals(true, lc.isOnTheSameSideAsReferenceValue(-9));
		assertEquals(true, lc.isOnTheSameSideAsReferenceValue(5));
		assertEquals(false, lc.isOnTheSameSideAsReferenceValue(20));
		assertEquals(false, lc.isOnTheSameSideAsReferenceValue(30));

		lc.loadLine(0, 1, 10, 20, 20, 0); // right from line

		lc.moveToY(19);
		assertEquals(false, lc.isOnTheSameSideAsReferenceValue(-9));
		assertEquals(false, lc.isOnTheSameSideAsReferenceValue(5));
		assertEquals(true, lc.isOnTheSameSideAsReferenceValue(20));
		assertEquals(true, lc.isOnTheSameSideAsReferenceValue(30));
	}

	@Test
	public void testReversedLine() {
		LineChecker2 lc = new LineChecker2();
		lc.loadLine(10, 20, 0, 1, 1, 20); // left from line

		lc.moveToY(19);
		assertEquals(true, lc.isOnTheSameSideAsReferenceValue(-9));
		assertEquals(true, lc.isOnTheSameSideAsReferenceValue(5));
		assertEquals(false, lc.isOnTheSameSideAsReferenceValue(20));
		assertEquals(false, lc.isOnTheSameSideAsReferenceValue(30));

		lc.loadLine(10, 20, 0, 1, 20, 0); // right from line

		lc.moveToY(19);
		assertEquals(false, lc.isOnTheSameSideAsReferenceValue(-9));
		assertEquals(false, lc.isOnTheSameSideAsReferenceValue(5));
		assertEquals(true, lc.isOnTheSameSideAsReferenceValue(20));
		assertEquals(true, lc.isOnTheSameSideAsReferenceValue(30));
	}
}
