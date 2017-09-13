package hu.csega.image.common;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TriangleCheckerTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1Impl() {
		TriangleChecker tc = new TriangleChecker1Impl();
		assertEquals(false, inside(tc, 1, 5));

		tc.loadTriangle(-10, -10, 0, 10, 10, -10);
		assertEquals(true, inside(tc, 0, 0));
		assertEquals(true, inside(tc, 1, 1));
		assertEquals(true, inside(tc, -1, -1));
		assertEquals(false, inside(tc, -10, 0));
		assertEquals(false, inside(tc, 10, 0));
		assertEquals(true, inside(tc, 0, -5));
		assertEquals(false, inside(tc, 0, -10)); // !!!
		assertEquals(false, inside(tc, 0, -15));
	}

	@Test
	public void test2Impl() {
		TriangleChecker tc = new TriangleChecker2Impl();
		assertEquals(false, inside(tc, 1, 5));

		tc.loadTriangle(-10, -10, 0, 10, 10, -10);
		assertEquals(true, inside(tc, 0, 0));
		assertEquals(true, inside(tc, 1, 1));
		assertEquals(true, inside(tc, -1, -1));
		assertEquals(false, inside(tc, -10, 0));
		assertEquals(false, inside(tc, 10, 0));
		assertEquals(true, inside(tc, 0, -5));
		assertEquals(true, inside(tc, 0, -10)); // !!!
		assertEquals(false, inside(tc, 0, -15));
	}

	@Test
	public void test3Impl() {
		TriangleChecker tc = new TriangleChecker3Impl();
		assertEquals(false, inside(tc, 1, 5));

		tc.loadTriangle(-10, -10, 0, 10, 10, -10);
		assertEquals(true, inside(tc, 0, 0));
		assertEquals(true, inside(tc, 1, 1));
		assertEquals(true, inside(tc, -1, -1));
		assertEquals(false, inside(tc, -10, 0));
		assertEquals(false, inside(tc, 10, 0));
		assertEquals(true, inside(tc, 0, -5));
		assertEquals(true, inside(tc, 0, -10)); // !!!
		assertEquals(false, inside(tc, 0, -15));
	}

	@Test
	public void test4Impl() {
		TriangleChecker tc = new TriangleChecker4Impl();
		assertEquals(false, inside(tc, 1, 5));

		tc.loadTriangle(-10, -10, 0, 10, 10, -10);
		assertEquals(true, inside(tc, 0, 0));
		assertEquals(true, inside(tc, 1, 1));
		assertEquals(true, inside(tc, -1, -1));
		assertEquals(false, inside(tc, -10, 0));
		assertEquals(false, inside(tc, 10, 0));
		assertEquals(true, inside(tc, 0, -5));
		assertEquals(true, inside(tc, 0, -10)); // !!!
		assertEquals(false, inside(tc, 0, -15));
	}

	private boolean inside(TriangleChecker tc, int x, int y) {
		tc.moveToY(y);
		return tc.inside(x);
	}

}
