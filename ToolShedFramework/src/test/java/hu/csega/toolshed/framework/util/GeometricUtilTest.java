package hu.csega.toolshed.framework.util;

import static org.junit.Assert.*;

import java.awt.Rectangle;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GeometricUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNormalizeRectangle() {
		Rectangle original = new Rectangle(10, 10, -20, 30);
		Rectangle result = GeometricUtil.normalizeRectangle(original);
		assertEquals(result.x, -10);
		assertEquals(result.y, 10);
		assertEquals(result.width, 20);
		assertEquals(result.height, 30);
	}

	@Test
	public void testDistance() {
		double result = GeometricUtil.distance(0, 0, 3, 4);
		assertTrue(Math.abs(result - 5) < 0.0001);
	}

	@Test
	public void testAlmostEquals() {
		assertTrue(GeometricUtil.almostEquals(5.0, 5.0));
		assertTrue(GeometricUtil.almostEquals(5.0, 4.9999999999));
		assertFalse(GeometricUtil.almostEquals(5.0, 4.0));
		assertFalse(GeometricUtil.almostEquals(5.0, -5));
	}

}
