package hu.csega.toolshed.parser.tokens;

import java.awt.Point;

import hu.csega.toolshed.parser.preprocessor.ParserToken;

public class WhitespaceToken extends ParserToken {

	public WhitespaceToken(int startColumn, int startRow, int endColumn, int endRow) {
		super(startColumn, startRow, endColumn, endRow);
	}

	public WhitespaceToken(Point startPosition, Point endPosition) {
		super(startPosition, endPosition);
	}

	@Override
	public boolean ignoreable() {
		return true;
	}

}
