package hu.csega.image.common;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LineCheckerTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		LineChecker1 lc = new LineChecker1();

		lc.loadLine(0, 0, 10, 5, 5, 10);
		Assert.assertEquals(true, lc.isOnTheSameSideAsReferenceValue(2, 10));
		Assert.assertEquals(false, lc.isOnTheSameSideAsReferenceValue(10, 2));

		lc.loadLine(0, 0, 5, 10, 0, 5);
		Assert.assertEquals(true, lc.isOnTheSameSideAsReferenceValue(1, 10));
		Assert.assertEquals(false, lc.isOnTheSameSideAsReferenceValue(10, 1));
	}

}
