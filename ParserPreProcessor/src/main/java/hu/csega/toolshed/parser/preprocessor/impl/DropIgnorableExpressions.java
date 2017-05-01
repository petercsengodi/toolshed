package hu.csega.toolshed.parser.preprocessor.impl;

import java.util.ArrayList;
import java.util.List;

import hu.csega.toolshed.logging.Logger;
import hu.csega.toolshed.logging.LoggerFactory;
import hu.csega.toolshed.parser.preprocessor.helper.ExpressionWithPositions;
import hu.csega.toolshed.parser.preprocessor.helper.UnprocessedText;

public class DropIgnorableExpressions extends PreProcessorStep {

	@Override
	public List<ExpressionWithPositions> process(List<ExpressionWithPositions> chunks,
			UnprocessedText text) throws PreProcessorException {

		List<ExpressionWithPositions> ret = new ArrayList<>();

		// Strings may be only in one row
		for (ExpressionWithPositions chunk : chunks) {
			if (!chunk.ignoreable()) {
				if(chunk.processable()) {
					logger.info("UNPROCESSED: " + chunk.getContent(text));
//					throw new PreProcessorException("Some chunk have not been processed!",
//							chunk.getStartColumn(), chunk.getStartRow());
				}

				ret.add(chunk);
			}
		}

		return ret;
	}

	private static final Logger logger = LoggerFactory.createLogger(DropIgnorableExpressions.class);
}
