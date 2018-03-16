package hu.csega.toolshed.parser.tokens;

import java.awt.Point;

import hu.csega.toolshed.parser.preprocessor.ParserToken;

public class NameToken extends ParserToken {

	public NameToken(int startColumn, int startRow, int endColumn, int endRow) {
		super(startColumn, startRow, endColumn, endRow);
	}

	public NameToken(Point startPosition, Point endPosition) {
		super(startPosition, endPosition);
	}

}
