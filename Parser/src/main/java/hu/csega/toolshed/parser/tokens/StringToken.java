package hu.csega.toolshed.parser.tokens;

import java.awt.Point;

import hu.csega.toolshed.parser.preprocessor.ParserToken;

public class StringToken extends ParserToken {

	public StringToken(int startColumn, int startRow, int endColumn, int endRow) {
		super(startColumn, startRow, endColumn, endRow);
	}

	public StringToken(Point startPosition, Point endPosition) {
		super(startPosition, endPosition);
	}

}
