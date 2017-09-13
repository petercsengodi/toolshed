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
	public void test() {
		TriangleChecker tc = new TriangleChecker();
		assertEquals(false, tc.inside(1, 5));

		tc.loadTriangle(-10, -10, 0, 10, 10, -10);
		assertEquals(true, tc.inside(0, 0));
		assertEquals(true, tc.inside(1, 1));
		assertEquals(true, tc.inside(-1, -1));
		assertEquals(false, tc.inside(-10, 0));
		assertEquals(false, tc.inside(10, 0));
		assertEquals(false, tc.inside(0, -10));
	}

}
