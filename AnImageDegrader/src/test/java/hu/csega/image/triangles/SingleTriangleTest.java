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

		byte[] testArray = new byte[SingleTriangle.SIZE_IN_BYTES];
		for(int i = 0; i < testArray.length; i++) {
			testArray[i] = -1;
		}

		t.loadFromBytes(testArray, 0, helper);

		assertEquals(1023, t.x[0]);
		assertEquals(1023, t.y[0]);
		assertEquals(1023, t.x[1]);
		assertEquals(1023, t.y[1]);
		assertEquals(1023, t.x[2]);
		assertEquals(1023, t.y[2]);
		assertEquals(255, t.r);
		assertEquals(255, t.g);
		assertEquals(255, t.b);

		for(int i = 0; i < testArray.length; i++) {
			testArray[i] = 3;
		}

		t.loadFromBytes(testArray, 0, helper);

		assertEquals(771, t.x[0]);
		assertEquals(12, t.y[0]);
		assertEquals(48, t.x[1]);
		assertEquals(192, t.y[1]);
		assertEquals(771, t.x[2]);
		assertEquals(12, t.y[2]);
		assertEquals(12, t.r);
		assertEquals(12, t.g);
		assertEquals(12, t.b);
	}

}
