package hu.csega.toolshed.simple.parser;

import hu.csega.toolshed.simple.parser.helper.ExpressionWithPositions;
import hu.csega.toolshed.simple.parser.helper.UnprocessedChunkWithPositions;
import hu.csega.toolshed.simple.parser.helper.UnprocessedText;
import hu.csega.toolshed.simple.parser.preprocessor.DropIgnorableExpressions;
import hu.csega.toolshed.simple.parser.preprocessor.IdentifyOperatorSequences;
import hu.csega.toolshed.simple.parser.preprocessor.IdentifyStandAloneOperators;
import hu.csega.toolshed.simple.parser.preprocessor.IdentifyStringsAndComments;
import hu.csega.toolshed.simple.parser.preprocessor.IdentifyWhitespaceSequences;
import hu.csega.toolshed.simple.parser.preprocessor.PreProcessorException;
import hu.csega.toolshed.simple.parser.preprocessor.TransformUnprocessedExpressions;
import hu.csega.toolshed.simple.parser.preprocessor.ValidateExpressions;
import hu.csega.units.AbstractUnitWithState;

import java.util.Arrays;
import java.util.List;

public class SimpleParserImpl extends AbstractUnitWithState<SimpleParserImpl, SimpleParserState> implements SimpleParser {

	public List<ExpressionWithPositions> parseText(UnprocessedText text) throws PreProcessorException {
		naturalStoppingPoint(SimpleParserState.INIT);
		
		List<ExpressionWithPositions> chunks = Arrays.asList((ExpressionWithPositions) new UnprocessedChunkWithPositions(text));

		naturalStoppingPoint(SimpleParserState.UNPROCESSED);
		
		IdentifyStringsAndComments identifyStringsAndComments = new IdentifyStringsAndComments();
		chunks = identifyStringsAndComments.process(chunks, text);

		naturalStoppingPoint(SimpleParserState.STRINGS_AND_COMMENTS_IDENTIFIED);
		
		IdentifyWhitespaceSequences identifyWhitespaceSequences = new IdentifyWhitespaceSequences();
		chunks = identifyWhitespaceSequences.process(chunks, text);

		naturalStoppingPoint(SimpleParserState.WHITESPACES_IDENTIFIED);
		
		IdentifyStandAloneOperators identifyStandAloneOperators = new IdentifyStandAloneOperators();
		chunks = identifyStandAloneOperators.process(chunks, text);

		naturalStoppingPoint(SimpleParserState.STANDALONE_OPERATORS_IDENTIFIED);
		
		IdentifyOperatorSequences identifyOperatorSequences = new IdentifyOperatorSequences();
		chunks = identifyOperatorSequences.process(chunks, text);

		naturalStoppingPoint(SimpleParserState.OPERATOR_SEQUENCES_IDENTIFIED);
		
		TransformUnprocessedExpressions transformUnprocessedExpressions = new TransformUnprocessedExpressions();
		chunks = transformUnprocessedExpressions.process(chunks, text);

		naturalStoppingPoint(SimpleParserState.UNPROCESSED_EXPRESSIONS_TRANSFORMED);
		
		DropIgnorableExpressions dropIgnorableExpressions = new DropIgnorableExpressions();
		chunks = dropIgnorableExpressions.process(chunks, text);

		naturalStoppingPoint(SimpleParserState.IGNORABLE_EXPRESSIONS_DROPPED);
		
		ValidateExpressions validateExpressions = new ValidateExpressions();
		chunks = validateExpressions.process(chunks, text);

		naturalStoppingPoint(SimpleParserState.VALIDATED);
		
		return chunks;
	}
	
	private static final String HEX_DIGIST = "0123456789ABCDEF";
	
	public static String writeStringEscaped(String original) {
		return writeWhateverEscaped(original, '\"');
	}

	public static String writeCharacterConstantEscaped(String original) {
		return writeWhateverEscaped(original, '\'');
	}

	public static String readStringFromEscaped(String original) {
		return readWhateverFromEscaped(original, '\"');
	}

	public static String readCharacterConstantFromEscaped(String original) {
		return readWhateverFromEscaped(original, '\'');
	}

	public static String writeWhateverEscaped(String original, char sep) {
		if(original == null) {
			return "null";
		}
		
		if(original.length() == 0) {
			return sep + "" + sep;
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append(sep);
		
		for(int i = 0; i < original.length(); i++) {
			char c = original.charAt(i);
			if(c == 9) {
				builder.append("\\t");
			} else if(c == 10) {
					builder.append("\\n");
			} else if(c < 32) {
				builder.append("\\x" + HEX_DIGIST.charAt(c / 16) + HEX_DIGIST.charAt(c % 16));
			} else if(c == sep) {
				builder.append("\\" + sep);
			} else if(c == '\\') {
				builder.append("\\\\");
			} else {
				builder.append(c);
			}
		}
		
		builder.append(sep);
		return builder.toString();
	}
	
	public static String readWhateverFromEscaped(String original, char sep) {
		if(original.equals("null")) {
			return null;
		}
		
		if(original.equals(sep + "" + sep)) {
			return "";
		}
		
		if(original.length() == 0) {
			return "";
		}
		
		if(original.charAt(0) == sep) {
			original = original.substring(1);
		}
		
		if(original.length() == 0) {
			return "";
		}
		
		if(original.charAt(original.length() - 1) == sep) {
			original = original.substring(0, original.length() - 1);
		}
		
		if(original.length() == 0) {
			return "";
		}
		
		StringBuilder builder = new StringBuilder();
		int i = 0;
		while(i < original.length()) {
			char c = original.charAt(i);
			if(c == '\\' && i + 1 < original.length()) {
				char d = original.charAt(i + 1);	
				if(d == 't') {
					builder.append('\t');
					i += 2;
				} else if(d == 'n') {
					builder.append('\n');
					i += 2;
				} else if(d == '\"') {
					builder.append('\"');
					i += 2;
				} else if(d == '\'') {
					builder.append('\'');
					i += 2;
				} else if(d == '\\') {
					builder.append('\\');
					i += 2;
				} else if(d == 'x' && i + 3 < original.length() &&
						HEX_DIGIST.indexOf(Character.toUpperCase(original.charAt(i + 2))) > -1 &&
						HEX_DIGIST.indexOf(Character.toUpperCase(original.charAt(i + 3))) > -1) {
					
					char t = (char)(HEX_DIGIST.indexOf(Character.toUpperCase(original.charAt(i + 2))) * 16 +
					HEX_DIGIST.indexOf(Character.toUpperCase(original.charAt(i + 3))));
					builder.append(t);
					i += 4;
				} else {
					builder.append(c);
					builder.append(d);
					i += 2;
				}
			} else {
				builder.append(c);
				i++;
			}
		}
		
		return builder.toString();
	}
	
}