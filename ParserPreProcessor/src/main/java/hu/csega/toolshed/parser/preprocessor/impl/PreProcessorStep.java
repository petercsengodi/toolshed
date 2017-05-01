package hu.csega.toolshed.parser.preprocessor.impl;

import java.awt.Point;
import java.util.List;

import hu.csega.toolshed.parser.preprocessor.helper.ExpressionWithPositions;
import hu.csega.toolshed.parser.preprocessor.helper.UnprocessedText;

public abstract class PreProcessorStep {

	protected boolean isAfter(Point left, Point right) {
		return (left.y > right.y) || (left.y == right.y && left.x > right.x);
	}

	public abstract List<ExpressionWithPositions> process(List<ExpressionWithPositions> chunks,
			UnprocessedText text) throws PreProcessorException;

}
