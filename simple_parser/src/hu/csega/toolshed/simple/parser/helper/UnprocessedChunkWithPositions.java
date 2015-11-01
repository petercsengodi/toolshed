package hu.csega.toolshed.simple.parser.helper;

import java.awt.Point;

public class UnprocessedChunkWithPositions extends ExpressionWithPositions {


	public UnprocessedChunkWithPositions(int startColumn, int startRow,
			int endColumn, int endRow) {
		super(startColumn, startRow, endColumn, endRow);
	}

	public UnprocessedChunkWithPositions(Point startPosition, Point endPosition) {
		super(startPosition, endPosition);
	}

	public UnprocessedChunkWithPositions(UnprocessedText text) {
		super(text.getStartRow(), text.getStartColumn(), text.getEndRow(), text.getEndColumn());
	}
	
	public boolean processable() {
		return true;
	}	
}
