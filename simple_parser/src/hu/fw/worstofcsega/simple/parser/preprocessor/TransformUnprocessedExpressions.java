package hu.fw.worstofcsega.simple.parser.preprocessor;

import hu.fw.worstofcsega.simple.parser.helper.ExpressionWithPositions;
import hu.fw.worstofcsega.simple.parser.helper.NameExpression;
import hu.fw.worstofcsega.simple.parser.helper.NumberExpression;
import hu.fw.worstofcsega.simple.parser.helper.UnprocessedText;

import java.util.ArrayList;
import java.util.List;

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
					ret.add(new NumberExpression(chunk.getStartPosition(), chunk.getEndPosition()));
				} else {
					ret.add(new NameExpression(chunk.getStartPosition(), chunk.getEndPosition()));
				}
			} else {
				ret.add(chunk);
			}
		}
		
		return ret;
	}

}
