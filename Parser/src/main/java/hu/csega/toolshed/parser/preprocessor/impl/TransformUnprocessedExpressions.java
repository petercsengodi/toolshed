package hu.csega.toolshed.parser.preprocessor.impl;

import java.util.ArrayList;
import java.util.List;

import hu.csega.toolshed.parser.preprocessor.helper.UnprocessedText;
import hu.csega.toolshed.parser.tokens.NameToken;
import hu.csega.toolshed.parser.tokens.NumberToken;

public class TransformUnprocessedExpressions extends PreProcessorStep {

	@Override
	public List<ExpressionWithPositions> process(List<ExpressionWithPositions> chunks, 
			UnprocessedText text) throws PreProcessorException {
		List<ExpressionWithPositions> ret = new ArrayList<ExpressionWithPositions>();
		
		// Strings may be only in one row
		for (ExpressionWithPositions chunk : chunks) {
			if(chunk.processable()) {
				String content = chunk.getContent(text);
				if(content.length() == 0) {
					continue;
				}
				
				if(Character.isDigit(content.charAt(0))) {
					ret.add(new NumberToken(chunk.getStartPosition(), chunk.getEndPosition()));
				} else {
					ret.add(new NameToken(chunk.getStartPosition(), chunk.getEndPosition()));
				}
			} else {
				ret.add(chunk);
			}
		}
		
		return ret;
	}

}
