package hu.csega.toolshed.simple.parser.preprocessor;

import hu.csega.toolshed.simple.parser.helper.ExpressionWithPositions;
import hu.csega.toolshed.simple.parser.helper.UnprocessedText;

import java.awt.Point;
import java.util.List;

public abstract class PreProcessorStep {
	
	protected boolean isAfter(Point left, Point right) {
		return (left.y > right.y) || (left.y == right.y && left.x > right.x);
	}
	
	public abstract List<ExpressionWithPositions> process(
			List<ExpressionWithPositions> chunks,
			UnprocessedText text) 
			throws PreProcessorException; 
	
}
