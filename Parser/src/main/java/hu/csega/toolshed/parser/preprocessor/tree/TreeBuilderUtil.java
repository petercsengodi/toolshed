package hu.csega.toolshed.parser.preprocessor.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import hu.csega.toolshed.parser.preprocessor.helper.UnprocessedText;
import hu.csega.toolshed.parser.preprocessor.impl.ExpressionWithPositions;
import hu.csega.toolshed.parser.tokens.OperatorToken;

public class TreeBuilderUtil {

	public static BlockExpression buildTree(UnprocessedText text,
			List<ExpressionWithPositions> expressions) 
	throws TreeBuilderException {
		BlockExpression rootExpression = new BlockExpression();
		Iterator<ExpressionWithPositions> it = expressions.iterator();
		analyzeBlocks(text, it, rootExpression);		
		return rootExpression;
	}
	
	private static void analyzeBlocks(UnprocessedText text,
			Iterator<ExpressionWithPositions> it,
			BlockExpression blockExpression) throws TreeBuilderException {
		
		while(it.hasNext()) {
			ExpressionWithPositions expression = it.next();
			
			if(expression instanceof OperatorToken) {
				String operator = expression.getContent(text);
				
				if(operator.equals("{")) {
					BlockExpression newBlockExpression = new BlockExpression();
					blockExpression.expressions.add(newBlockExpression);
					newBlockExpression.startingContent = operator;
					newBlockExpression.endingContent = "}";
					analyzeBlocks(text, it, newBlockExpression);
				} else if(operator.equals("(")) {
					BlockExpression newBlockExpression = new BlockExpression();
					blockExpression.expressions.add(newBlockExpression);
					newBlockExpression.startingContent = operator;
					newBlockExpression.endingContent = ")";
					analyzeBlocks(text, it, newBlockExpression);
				} else if(operator.equals("[")) {
					BlockExpression newBlockExpression = new BlockExpression();
					blockExpression.expressions.add(newBlockExpression);
					newBlockExpression.startingContent = operator;
					newBlockExpression.endingContent = "]";
					analyzeBlocks(text, it, newBlockExpression);
				} else if(operator.equals("}") || operator.equals(")") || operator.equals("]")) {
					if(operator.equals(blockExpression.endingContent)) {
						// a correct end of block
						blockExpression.endingExpression = expression;
						analyzeOperators(text, blockExpression);
						return;
					} else {
						// error of end of block
						throw new TreeBuilderException(
								"Wrong block is closed!", 
								expression.getStartPosition());
					}
				} else {
					// other operators
					UnidentifiedExpression unidentifiedExpression = new UnidentifiedExpression();
					unidentifiedExpression.innerExpression = expression;
					unidentifiedExpression.value = expression.getContent(text);
					blockExpression.expressions.add(unidentifiedExpression);
				}
				
				
			} else {
				// it is a value expression
				UnidentifiedExpression unidentifiedExpression = new UnidentifiedExpression();
				unidentifiedExpression.innerExpression = expression;
				unidentifiedExpression.value = expression.getContent(text);
				blockExpression.expressions.add(unidentifiedExpression);
			}
		}
		
		// this code is reached only if we reached the end of the
		// code to parse
		if(blockExpression.startingExpression != null) {
			// there are open blocks left
			throw new TreeBuilderException("Block is not closed!", 0, 0);
		} else {
			// everything is fine
			// we simply quit
			analyzeOperators(text, blockExpression);
			return;
		}
	}

	private static void analyzeOperators(UnprocessedText text,
			BlockExpression blockExpression) throws TreeBuilderException {
		analyzeOperators(text, blockExpression, Arrays.asList("*", "/", "%"), OperatorType.BOTH);
		analyzeOperators(text, blockExpression, Arrays.asList("+", "-"), OperatorType.BOTH);		
	}

	private static void analyzeOperators(UnprocessedText text,
			BlockExpression blockExpression, List<String> operators,
			OperatorType operatorType) 
					throws TreeBuilderException {
		List<TreeExpression> newExpressions = new ArrayList<TreeExpression>();

		int numberOfTokens = blockExpression.expressions.size();
		for(int i = 0; i < numberOfTokens; i++) {
			TreeExpression treeExpression = blockExpression.expressions.get(i);
			if(treeExpression instanceof UnidentifiedExpression) {
				UnidentifiedExpression exp = (UnidentifiedExpression) treeExpression;
				if(exp.innerExpression instanceof OperatorToken) {
					OperatorToken op = (OperatorToken) exp.innerExpression;
					String content = op.getContent(text);
					
					if(operators.contains(content)) {
						// TODO
					}
				}
			}
		}
		
		blockExpression.expressions.clear();
		blockExpression.expressions.addAll(newExpressions);
	}
	
	enum OperatorType {STAND_ALONE, LEFT, RIGHT, BOTH};
}
