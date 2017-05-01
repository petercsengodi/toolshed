package hu.csega.toolshed.parser.preprocessor.impl;

import java.util.List;

import hu.csega.toolshed.parser.preprocessor.helper.ExpressionWithPositions;
import hu.csega.toolshed.parser.preprocessor.helper.UnprocessedText;

public class ValidateExpressions extends PreProcessorStep {

	@Override
	public List<ExpressionWithPositions> process(List<ExpressionWithPositions> chunks, 
			UnprocessedText text) throws PreProcessorException {

		// Strings may be only in one row
		for (ExpressionWithPositions chunk : chunks) {
			if(chunk.processable()) {
				throw new PreProcessorException("Some chunk have not been processed!", 
						chunk.getStartColumn(), chunk.getStartRow());
			}
		}
		
		return chunks;
	}

}
