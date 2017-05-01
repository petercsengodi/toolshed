package hu.csega.toolshed.simple.parser.preprocessor;

import hu.csega.toolshed.simple.parser.helper.CodeIterator;
import hu.csega.toolshed.simple.parser.helper.ExpressionWithPositions;
import hu.csega.toolshed.simple.parser.helper.OperatorExpression;
import hu.csega.toolshed.simple.parser.helper.UnprocessedChunkWithPositions;
import hu.csega.toolshed.simple.parser.helper.UnprocessedText;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class IdentifyStandAloneOperators extends PreProcessorStep {

	@Override
	public List<ExpressionWithPositions> process(List<ExpressionWithPositions> chunks, 
			UnprocessedText text) throws PreProcessorException {
		List<ExpressionWithPositions> ret = new ArrayList<ExpressionWithPositions>();
		
		// Strings may be only in one row
		for(ExpressionWithPositions chunk : chunks) {
			if(chunk.processable()) {
				CodeIterator it = chunk.iterator(text);
				boolean standAloneOperatorsFound = false;

				Point startPosition = it.getPosition();
				Point lastPosition = new Point(0, 0);
				char c;
				
				while(it.hasNext()) {
					lastPosition.x = it.getActualColumn();
					lastPosition.y = it.getActualRow();
					c = it.next();
					
					if(isStandAloneOperator(c)) {
						standAloneOperatorsFound = true;
						if(isAfter(lastPosition, startPosition)) {
							ret.add(new UnprocessedChunkWithPositions(startPosition, lastPosition));
						}
						startPosition = it.getPosition();
						ret.add(new OperatorExpression(lastPosition, startPosition));
					} else {
						// do nothing
					}
				}
				
				if(standAloneOperatorsFound) {
					lastPosition = it.getPosition();
					if(isAfter(lastPosition, startPosition)) {
						ret.add(new UnprocessedChunkWithPositions(startPosition, lastPosition));
					}
				} else {
					ret.add(chunk);
				}
			} else {
				ret.add(chunk);
			}
		}
		
		return ret;
	}

	private boolean isStandAloneOperator(char c) {
		return ".;,()[]{}".indexOf(c) > -1;
	}
}
