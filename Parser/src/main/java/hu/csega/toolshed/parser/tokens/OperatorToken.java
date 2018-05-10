package hu.csega.toolshed.parser.tokens;

import java.awt.Point;

import hu.csega.toolshed.parser.preprocessor.ParserToken;

public class OperatorToken extends ParserToken {

	public OperatorToken(int startColumn, int startRow, int endColumn, int endRow) {
		super(startColumn, startRow, endColumn, endRow);
	}

	public OperatorToken(Point startPosition, Point endPosition) {
		super(startPosition, endPosition);
	}

}
