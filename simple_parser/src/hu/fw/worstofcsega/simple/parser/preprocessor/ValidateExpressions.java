package hu.fw.worstofcsega.simple.parser.preprocessor;

import hu.fw.worstofcsega.simple.parser.helper.ExpressionWithPositions;
import hu.fw.worstofcsega.simple.parser.helper.UnprocessedText;

import java.util.List;

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
