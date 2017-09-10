package hu.csega.toolshed.parser.lr;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hu.csega.toolshed.logging.Logger;
import hu.csega.toolshed.logging.LoggerFactory;

public class PerformanceTest {

	private static final int LOOPS = 100;
	private static final double AVERAGE_TIME_LIMIT = 1.0;

	// Inputs
	private String grammar;
	private String script;

	@Before
	public void setUp() throws Exception {

		// load inputs
		grammar = readFullString("res/test/performance/performanceTestGrammar.txt");

		// load outputs
		script = readFullString("res/test/performance/performanceTestScript.txt");

	}

	@After
	public void tearDown() throws Exception {
		grammar = null;
		script = null;
	}


	@Test
	public void testFunctionality() throws Exception {

		// get result
		Object result = coreFunctionality();

		// check result
		Assert.assertNull(result);

	}

	@Test
	public void testPerformance() throws Exception {

		double averageTime = 0;

		for(int i = 0; i < LOOPS; i++) {
			long start = System.currentTimeMillis();

			coreFunctionality();

			long end = System.currentTimeMillis();
			double thisTime = (end - start) / 1000.0 / LOOPS;
			averageTime += thisTime;
		}

		logger.info("Average time: " + averageTime + " (secs.)");
		Assert.assertTrue("Average time must be under " + AVERAGE_TIME_LIMIT + " seconds.", averageTime < AVERAGE_TIME_LIMIT);
	}

	private Object coreFunctionality() throws Exception {
		// 1. get the meta grammar for the grammar rules

		// 2.: parse grammar rules, and get AST

		// 3.: convert AST to java objects representing the rules

		// 4.: parse test script, and get AST

		// 5.: execute AST (which basically means to run the script)
		Object result = null;

		// 6.: return results for further check if needed
		return result;
	}

	public String readFullString(String filename) throws Exception {
		StringBuilder contentBuffer = new StringBuilder();
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "UTF-8"))) {

			String line;
			while((line = reader.readLine()) != null) {
				contentBuffer.append(line).append('\n');
			}

			String source = contentBuffer.toString();
			return source;
		}
	}

	private static final Logger logger = LoggerFactory.createLogger(PerformanceTest.class);
}
