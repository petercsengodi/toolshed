package hu.csega.toolshed.parser.tokens;

import java.awt.Point;

import hu.csega.toolshed.parser.preprocessor.ParserToken;

public class CharacterToken extends ParserToken {

	public CharacterToken(int startColumn, int startRow, int endColumn, int endRow) {
		super(startColumn, startRow, endColumn, endRow);
	}

	public CharacterToken(Point startPosition, Point endPosition) {
		super(startPosition, endPosition);
	}

}
