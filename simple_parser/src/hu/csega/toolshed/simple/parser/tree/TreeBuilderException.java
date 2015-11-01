package hu.csega.toolshed.simple.parser.tree;

import java.awt.Point;

public class TreeBuilderException extends Exception {

	/**
	 * Default serial version uid.
	 */
	private static final long serialVersionUID = 1L;

	private int row;
	private int column;

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public TreeBuilderException(int column, int row) {
		this.column = column;
		this.row = row;
	}

	public TreeBuilderException(String message, int column, int row) {
		super(message);
		this.column = column;
		this.row = row;
	}

	public TreeBuilderException(Point position) {
		this.column = position.x;
		this.row = position.y;
	}

	public TreeBuilderException(String message, Point position) {
		super(message);
		this.column = position.x;
		this.row = position.y;
	}
}
