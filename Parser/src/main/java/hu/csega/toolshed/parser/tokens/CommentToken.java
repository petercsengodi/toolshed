package hu.csega.toolshed.parser.tokens;

import java.awt.Point;

import hu.csega.toolshed.parser.preprocessor.ParserToken;

public class CommentToken extends ParserToken {

	public CommentToken(int startColumn, int startRow, int endColumn, int endRow) {
		super(startColumn, startRow, endColumn, endRow);
	}

	public CommentToken(Point startPosition, Point endPosition) {
		super(startPosition, endPosition);
	}

	@Override
	public boolean ignoreable() {
		return true;
	}

}
