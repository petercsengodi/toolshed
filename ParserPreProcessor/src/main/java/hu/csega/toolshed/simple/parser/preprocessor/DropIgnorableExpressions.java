package hu.csega.toolshed.simple.parser.preprocessor;

import hu.csega.toolshed.simple.parser.helper.ExpressionWithPositions;
import hu.csega.toolshed.simple.parser.helper.UnprocessedText;

import java.util.ArrayList;
import java.util.List;

public class DropIgnorableExpressions extends PreProcessorStep {

	@Override
	public List<ExpressionWithPositions> process(List<ExpressionWithPositions> chunks, 
			UnprocessedText text) throws PreProcessorException {
		List<ExpressionWithPositions> ret = new ArrayList<ExpressionWithPositions>();
		
		// Strings may be only in one row
		for (ExpressionWithPositions chunk : chunks) {
			if (!chunk.ignoreable()) {
				if(chunk.processable()) {
					System.out.println("UNPROCESSED: " + chunk.getContent(text));
//					throw new PreProcessorException("Some chunk have not been processed!", 
//							chunk.getStartColumn(), chunk.getStartRow());
				}
				
				ret.add(chunk);
			}
		}
		
		return ret;
	}

}
