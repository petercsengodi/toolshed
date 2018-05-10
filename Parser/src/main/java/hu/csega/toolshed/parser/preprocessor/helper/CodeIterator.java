package hu.csega.toolshed.parser.preprocessor.helper;

import java.awt.Point;
import java.util.Iterator;

import hu.csega.toolshed.parser.preprocessor.impl.ExpressionWithPositions;

public class CodeIterator implements Iterator<Character> {

	private int actualRow;
	private int actualColumn;
	private ExpressionWithPositions expression;
	private UnprocessedText text;

	public CodeIterator(ExpressionWithPositions expression, UnprocessedText text) {
		this.expression = expression;
		this.text = text;
		this.actualColumn = expression.getStartColumn();
		this.actualRow = expression.getStartRow();
	}

	@Override
	public boolean hasNext() {
		return (actualRow < expression.getEndRow()) ||
				(actualRow == expression.getEndRow() &&
				actualColumn < expression.getEndColumn());
	}

	@Override
	public Character next() {
		String selectedRow = text.getContent().get(actualRow);
		if(actualColumn < selectedRow.length()) {
			Character ret = selectedRow.charAt(actualColumn);
			actualColumn++;
			return ret;
		} else {
			actualColumn = 0;
			actualRow++;
			return '\n';
		}
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException("remove");
	}

	public Point getPosition() {
		return new Point(actualColumn, actualRow);
	}

	public int getActualRow() {
		return actualRow;
	}

	public int getActualColumn() {
		return actualColumn;
	}
}
