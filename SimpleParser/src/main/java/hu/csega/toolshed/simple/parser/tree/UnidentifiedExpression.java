package hu.csega.toolshed.simple.parser.tree;

import hu.csega.toolshed.simple.parser.helper.ExpressionWithPositions;

public class UnidentifiedExpression extends TreeExpression {

	public ExpressionWithPositions innerExpression = null;
	public Object value;
	
	@Override
	public Object valuate() {
		return value;
	}

}
