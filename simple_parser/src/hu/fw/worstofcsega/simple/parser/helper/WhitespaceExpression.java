package hu.fw.worstofcsega.simple.parser.helper;

import java.awt.Point;

public class WhitespaceExpression extends ExpressionWithPositions {

	public WhitespaceExpression(int startColumn, int startRow, int endColumn,
			int endRow) {
		super(startColumn, startRow, endColumn, endRow);
	}

	public WhitespaceExpression(Point startPosition, Point endPosition) {
		super(startPosition, endPosition);
	}
	
	public boolean ignoreable() {
		return true;
	}

}
