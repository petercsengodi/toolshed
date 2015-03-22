package hu.fw.worstofcsega.simple.parser.helper;

import java.awt.Point;

public class StringExpression extends ExpressionWithPositions {

	public StringExpression(int startColumn, int startRow, int endColumn,
			int endRow) {
		super(startColumn, startRow, endColumn, endRow);
	}

	public StringExpression(Point startPosition, Point endPosition) {
		super(startPosition, endPosition);
	}

}
