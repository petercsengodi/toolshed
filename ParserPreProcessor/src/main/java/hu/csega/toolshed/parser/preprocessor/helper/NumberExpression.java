package hu.csega.toolshed.parser.preprocessor.helper;

import java.awt.Point;

public class NumberExpression extends ExpressionWithPositions {

	public NumberExpression(int startColumn, int startRow, int endColumn, int endRow) {
		super(startColumn, startRow, endColumn, endRow);
	}

	public NumberExpression(Point startPosition, Point endPosition) {
		super(startPosition, endPosition);
	}

}
