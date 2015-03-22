package hu.fw.worstofcsega.simple.parser.tree;

import hu.fw.worstofcsega.simple.parser.helper.ExpressionWithPositions;

public class UnidentifiedExpression extends TreeExpression {

	public ExpressionWithPositions innerExpression = null;
	public Object value;
	
	@Override
	public Object valuate() {
		return value;
	}

}
