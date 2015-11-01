package hu.csega.toolshed.simple.parser.helper;

import java.awt.Point;

public class CharacterConstantExpression extends ExpressionWithPositions {

	public CharacterConstantExpression(int startColumn, int startRow, int endColumn,
			int endRow) {
		super(startColumn, startRow, endColumn, endRow);
	}

	public CharacterConstantExpression(Point startPosition, Point endPosition) {
		super(startPosition, endPosition);
	}

}
