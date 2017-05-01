package hu.csega.toolshed.simple.parser;

import hu.csega.toolshed.parser.preprocessor.PreProcessor;
import hu.csega.toolshed.parser.preprocessor.PreProcessorImpl;
import hu.csega.toolshed.parser.preprocessor.helper.ExpressionWithPositions;
import hu.csega.toolshed.parser.preprocessor.helper.UnprocessedText;
import hu.csega.toolshed.parser.preprocessor.impl.ConvertInputStreamIntoUnprocessedText;
import hu.csega.toolshed.parser.preprocessor.impl.PreProcessorException;
import hu.csega.toolshed.parser.preprocessor.impl.PrintExpressionsWithPositions;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import org.junit.Test;

public class SimpleParserTest {

	private static final String TEST_CODE = 
			"package x;\n\n" +
			"public class TestClass { // only for testing\n\n" +
			"/* NOTE! this comment \n is in two different rows! */\n" +
			"    private static final String TEST_STRING = \"Test '\\n' \\\\ \\\" \\\\\\\" string!\\\\\";\n\n" +
			"    private static final String TEST_CHARACTER_CONSTANT = '\\n';\n\n" +
			"} // ending comment";
	
	@Test
	public void test() throws Exception {

		InputStream stream = new ByteArrayInputStream(TEST_CODE.getBytes("utf-8"));
		UnprocessedText text = ConvertInputStreamIntoUnprocessedText.read(stream);
		stream.close();
		
		PreProcessor parser = new PreProcessorImpl();

		try {
			List<ExpressionWithPositions> parsedText = parser.parseText(text);
			
			PrintExpressionsWithPositions.print(parsedText, text);
		} catch(PreProcessorException ex) {
			System.out.println("PreProcessing Error: " + ex.getMessage() +
					" [row=" + ex.getRow() + "; column=" + ex.getColumn() + "]\n");
			ex.printStackTrace(System.out);
		}
	}

}
