package hu.csega.toolshed.parser.tokens;

import java.awt.Point;

import hu.csega.toolshed.parser.preprocessor.ParserToken;

public class NumberToken extends ParserToken {

	public NumberToken(int startColumn, int startRow, int endColumn, int endRow) {
		super(startColumn, startRow, endColumn, endRow);
	}

	public NumberToken(Point startPosition, Point endPosition) {
		super(startPosition, endPosition);
	}

}
