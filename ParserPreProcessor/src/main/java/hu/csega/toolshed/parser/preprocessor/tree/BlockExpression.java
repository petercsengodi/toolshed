package hu.csega.toolshed.parser.preprocessor.tree;

import java.util.ArrayList;
import java.util.List;

import hu.csega.toolshed.parser.preprocessor.helper.ExpressionWithPositions;

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
