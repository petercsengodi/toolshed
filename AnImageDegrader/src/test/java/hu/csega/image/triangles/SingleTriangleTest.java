package hu.csega.image.triangles;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import hu.csega.image.common.BitPipeline;

public class SingleTriangleTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLoad1() {
		SingleTriangle t = new SingleTriangle();
		BitPipeline helper = new BitPipeline();

		byte[] testArray = new byte[] { (byte)-1, (byte)-1, (byte)-1, (byte)-1, (byte)-1};

		t.loadFromBytes(testArray, 0, helper);

		assertEquals(1023, t.x);
		assertEquals(1023, t.y);
		assertEquals(252, t.r);
		assertEquals(252, t.g);
		assertEquals(252, t.b);
	}

}
