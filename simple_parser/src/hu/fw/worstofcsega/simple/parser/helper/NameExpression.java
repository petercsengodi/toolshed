package hu.fw.worstofcsega.simple.parser.helper;

import java.awt.Point;

public class NameExpression extends ExpressionWithPositions {

	public NameExpression(int startColumn, int startRow, int endColumn,
			int endRow) {
		super(startColumn, startRow, endColumn, endRow);
	}

	public NameExpression(Point startPosition, Point endPosition) {
		super(startPosition, endPosition);
	}

}
