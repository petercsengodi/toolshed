package hu.csega.toolshed.simple.parser.tree;

import hu.csega.toolshed.simple.parser.helper.ExpressionWithPositions;

import java.util.ArrayList;
import java.util.List;

public class BlockExpression extends TreeExpression {

	public List<TreeExpression> expressions = new ArrayList<TreeExpression>();
	public ExpressionWithPositions startingExpression = null;
	public ExpressionWithPositions endingExpression = null;
	public String startingContent = null;
	public String endingContent = null;
	
	@Override
	public Object valuate() {
		Object ret = null;
		for(TreeExpression expression : expressions) {
			ret = expression.valuate();
		}
		
		return ret;
	}

	
	
}
