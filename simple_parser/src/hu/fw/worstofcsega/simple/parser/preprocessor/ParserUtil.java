package hu.fw.worstofcsega.simple.parser.preprocessor;

import hu.fw.worstofcsega.simple.parser.helper.ExpressionWithPositions;
import hu.fw.worstofcsega.simple.parser.helper.UnprocessedChunkWithPositions;
import hu.fw.worstofcsega.simple.parser.helper.UnprocessedText;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class ParserUtil {

	public static UnprocessedText loadFile(File file) 
			throws PreProcessorException, IOException {
		if(!file.exists() || file.isDirectory()) {
			throw new FileNotFoundException("File can't be opened");
		}

		InputStream stream = new FileInputStream(file);
		UnprocessedText text = ConvertInputStreamIntoUnprocessedText.read(stream);
		stream.close();
		return text;
	}
	
	public static UnprocessedText loadString(String text) {
		UnprocessedText ret = ConvertInputStreamIntoUnprocessedText.read(text);
		return ret;
	}

	public static List<ExpressionWithPositions> parseText(UnprocessedText text) 
			throws PreProcessorException {
		List<ExpressionWithPositions> chunks = Arrays.asList(
				(ExpressionWithPositions) new UnprocessedChunkWithPositions(text));

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
