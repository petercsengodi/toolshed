package hu.csega.toolshed.simple.parser.preprocessor;

import hu.csega.toolshed.simple.parser.helper.ExpressionWithPositions;
import hu.csega.toolshed.simple.parser.helper.UnprocessedChunkWithPositions;
import hu.csega.toolshed.simple.parser.helper.UnprocessedText;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class TestPreProcessor {

	private static final String TEST_CODE = 
			"package x;\n\n" +
			"public class TestClass { // only for testing\n\n" +
			"/* NOTE! this comment \n is in two different rows! */\n" +
			"    private static final String TEST_STRING = \"Test '\\n' \\\\ \\\" \\\\\\\" string!\\\\\";\n\n" +
			"    private static final String TEST_CHARACTER_CONSTANT = '\\n';\n\n" +
			"} // ending comment";
	
	public static void main(String[] args) throws Exception {

		InputStream stream = new ByteArrayInputStream(TEST_CODE.getBytes("utf-8"));
		UnprocessedText text = ConvertInputStreamIntoUnprocessedText.read(stream);
		stream.close();
		
		try {
			List<ExpressionWithPositions> chunks = Arrays.asList(
					(ExpressionWithPositions)new UnprocessedChunkWithPositions(text));
			PrintExpressionsWithPositions.print(chunks, text);
			
			IdentifyStringsAndComments identifyStringsAndComments = new IdentifyStringsAndComments();
			chunks = identifyStringsAndComments.process(chunks, text);
		
			IdentifyWhitespaceSequences identifyWhitespaceSequences = new IdentifyWhitespaceSequences();
			chunks = identifyWhitespaceSequences.process(chunks, text);
	
			IdentifyStandAloneOperators identifyStandAloneOperators = new IdentifyStandAloneOperators();
			chunks = identifyStandAloneOperators.process(chunks, text);
	
			IdentifyOperatorSequences identifyOperatorSequences = new IdentifyOperatorSequences();
			chunks = identifyOperatorSequences.process(chunks, text);
	
			TransformUnprocessedExpressions transformUnprocessedExpressions = new TransformUnprocessedExpressions();
			chunks = transformUnprocessedExpressions.process(chunks, text);

			DropIgnorableExpressions dropIgnorableExpressions = new DropIgnorableExpressions();
			chunks = dropIgnorableExpressions.process(chunks, text);
			
			ValidateExpressions validateExpressions = new ValidateExpressions();
			chunks = validateExpressions.process(chunks, text);
			
			PrintExpressionsWithPositions.print(chunks, text);
		} catch(PreProcessorException ex) {
			System.out.println("PreProcessing Error: " + ex.getMessage() +
					" [row=" + ex.getRow() + "; column=" + ex.getColumn() + "]\n");
			ex.printStackTrace(System.out);
		}
	}

}
