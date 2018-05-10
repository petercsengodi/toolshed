package hu.csega.units;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UnitStoreTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int input = 4;
		CustomTestService service = UnitStore.instance(CustomTestService.class);
		int output = service.returnSameValue(input);
		assertEquals("Should be the same!", input, output);
	}

}
