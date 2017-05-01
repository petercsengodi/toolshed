package hu.csega.toolshed.simple.parser.helper;

import java.awt.Point;

public class CommentExpression extends ExpressionWithPositions {

	public CommentExpression(int startColumn, int startRow, int endColumn, int endRow) {
		super(startColumn, startRow, endColumn, endRow);
	}

	public CommentExpression(Point startPosition, Point endPosition) {
		super(startPosition, endPosition);
	}

	@Override
	public boolean ignoreable() {
		return true;
	}

}
