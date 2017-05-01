package hu.csega.toolshed.parser.preprocessor.impl;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import hu.csega.toolshed.parser.preprocessor.helper.CodeIterator;
import hu.csega.toolshed.parser.preprocessor.helper.ExpressionWithPositions;
import hu.csega.toolshed.parser.preprocessor.helper.OperatorExpression;
import hu.csega.toolshed.parser.preprocessor.helper.UnprocessedChunkWithPositions;
import hu.csega.toolshed.parser.preprocessor.helper.UnprocessedText;

public class IdentifyStandAloneOperators extends PreProcessorStep {

	@Override
	public List<ExpressionWithPositions> process(List<ExpressionWithPositions> chunks,
			UnprocessedText text) throws PreProcessorException {

		List<ExpressionWithPositions> ret = new ArrayList<>();

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
