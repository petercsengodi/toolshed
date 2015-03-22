package hu.fw.worstofcsega.simple.parser.helper;

import java.awt.Point;

public class OperatorExpression extends ExpressionWithPositions {

	public OperatorExpression(int startColumn, int startRow, int endColumn,
			int endRow) {
		super(startColumn, startRow, endColumn, endRow);
	}

	public OperatorExpression(Point startPosition, Point endPosition) {
		super(startPosition, endPosition);
	}

}
