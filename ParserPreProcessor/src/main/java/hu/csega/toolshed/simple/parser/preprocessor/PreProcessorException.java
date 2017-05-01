package hu.csega.toolshed.simple.parser.preprocessor;

import java.awt.Point;

public class PreProcessorException extends Exception {

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

	public PreProcessorException(int column, int row) {
		this.column = column;
		this.row = row;
	}

	public PreProcessorException(String message, int column, int row) {
		super(message);
		this.column = column;
		this.row = row;
	}

	public PreProcessorException(Point position) {
		this.column = position.x;
		this.row = position.y;
	}

	public PreProcessorException(String message, Point position) {
		super(message);
		this.column = position.x;
		this.row = position.y;
	}
}
