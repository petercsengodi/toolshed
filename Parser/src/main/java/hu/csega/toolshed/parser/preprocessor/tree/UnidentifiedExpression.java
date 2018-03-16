package hu.csega.toolshed.parser.preprocessor.tree;

import hu.csega.toolshed.parser.preprocessor.helper.ExpressionWithPositions;

public class UnidentifiedExpression extends TreeExpression {

	public ExpressionWithPositions innerExpression = null;
	public Object value;
	
	@Override
	public Object valuate() {
		return value;
	}

}
