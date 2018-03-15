package hu.csega.toolshed.logging;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoggerTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Logger logger = LoggerFactory.createLogger(LoggerTest.class);
		logger.info("Basic logging tested.");

		Assert.assertTrue(logger.infoShown());
	}

}
