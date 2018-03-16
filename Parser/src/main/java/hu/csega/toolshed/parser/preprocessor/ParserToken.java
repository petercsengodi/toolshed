package hu.csega.toolshed.parser.preprocessor;

import java.awt.Point;

import hu.csega.toolshed.parser.preprocessor.impl.ExpressionWithPositions;

public abstract class ParserToken extends ExpressionWithPositions {

	public ParserToken(int startColumn, int startRow, int endColumn, int endRow) {
		super(startColumn, startRow, endColumn, endRow);
	}

	public ParserToken(Point startPosition, Point endPosition) {
		super(startPosition, endPosition);
	}

}
