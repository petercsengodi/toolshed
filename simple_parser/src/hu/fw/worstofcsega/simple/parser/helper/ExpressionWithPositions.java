package hu.fw.worstofcsega.simple.parser.helper;

import java.awt.Point;

public class ExpressionWithPositions {

	private int startRow;
	private int startColumn;
	private int endRow;
	private int endColumn;
	
	public ExpressionWithPositions(int startColumn, int startRow, int endColumn,
			int endRow) {
		this.startRow = startRow;
		this.startColumn = startColumn;
		this.endRow = endRow;
		this.endColumn = endColumn;
	}

	public ExpressionWithPositions(Point startPosition, Point endPosition) {
		this.startRow = startPosition.y;
		this.startColumn = startPosition.x;
		this.endRow = endPosition.y;
		this.endColumn = endPosition.x;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getStartColumn() {
		return startColumn;
	}

	public void setStartColumn(int startColumn) {
		this.startColumn = startColumn;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	public int getEndColumn() {
		return endColumn;
	}

	public void setEndColumn(int endColumn) {
		this.endColumn = endColumn;
	}
	
	public Point getStartPosition() {
		return new Point(startColumn, startRow);
	}
	
	public Point getEndPosition() {
		return new Point(endColumn, endRow);
	}
	
	public CodeIterator iterator(UnprocessedText text) {
		return new CodeIterator(this, text);
	}
	
	public boolean processable() {
		return false;
	}
	
	public boolean ignoreable() {
		return false;
	}
	
	public String getContent(UnprocessedText text) {
		StringBuilder builder = new StringBuilder();
		CodeIterator it = iterator(text);
		while(it.hasNext()) {
			builder.append(it.next());
		}
		
		return builder.toString();
	}
}
