package hu.csega.toolshed.parser.preprocessor.impl;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import hu.csega.toolshed.parser.preprocessor.helper.CodeIterator;
import hu.csega.toolshed.parser.preprocessor.helper.UnprocessedChunkWithPositions;
import hu.csega.toolshed.parser.preprocessor.helper.UnprocessedText;
import hu.csega.toolshed.parser.tokens.OperatorToken;

public class IdentifyOperatorSequences extends PreProcessorStep {

	@Override
	public List<ExpressionWithPositions> process(List<ExpressionWithPositions> chunks,
			UnprocessedText text) throws PreProcessorException {

		List<ExpressionWithPositions> ret = new ArrayList<>();

		// Strings may be only in one row
		for(ExpressionWithPositions chunk : chunks) {
			if(chunk.processable()) {
				CodeIterator it = chunk.iterator(text);
				boolean operatorsFound = false;
				boolean sequenceStarted = false;

				Point startPosition = it.getPosition();
				Point lastPosition = new Point(0, 0);
				char c;

				while(it.hasNext()) {
					lastPosition.x = it.getActualColumn();
					lastPosition.y = it.getActualRow();
					c = it.next();

					if(!sequenceStarted && isRemainingOperator(c)) {
						operatorsFound = true;
						sequenceStarted = true;
						if(isAfter(lastPosition, startPosition)) {
							ret.add(new UnprocessedChunkWithPositions(startPosition, lastPosition));
							startPosition.x = lastPosition.x;
							startPosition.y = lastPosition.y;
						}
					} else if(sequenceStarted && !isRemainingOperator(c)) {
						sequenceStarted = false;
						ret.add(new OperatorToken(startPosition, lastPosition));
						startPosition.x = lastPosition.x;
						startPosition.y = lastPosition.y;
					} else {
						// do nothing
					}
				}

				if(operatorsFound) {
					if(sequenceStarted) {
						lastPosition = it.getPosition();
						if(isAfter(lastPosition, startPosition)) {
							ret.add(new OperatorToken(startPosition, lastPosition));
						}
					} else {
						lastPosition = it.getPosition();
						if(isAfter(lastPosition, startPosition)) {
							ret.add(new UnprocessedChunkWithPositions(startPosition, lastPosition));
						}
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

	private boolean isRemainingOperator(char c) {
		return "*|#&@$^~?!:`+-%/\\<=>".indexOf(c) > -1;
	}

}
