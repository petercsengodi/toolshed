package hu.worstofcsega.mofl.converters;

import hu.fw.worstofcsega.simple.parser.helper.CharacterConstantExpression;
import hu.fw.worstofcsega.simple.parser.helper.CommentExpression;
import hu.fw.worstofcsega.simple.parser.helper.ExpressionWithPositions;
import hu.fw.worstofcsega.simple.parser.helper.NameExpression;
import hu.fw.worstofcsega.simple.parser.helper.NumberExpression;
import hu.fw.worstofcsega.simple.parser.helper.OperatorExpression;
import hu.fw.worstofcsega.simple.parser.helper.StringExpression;
import hu.fw.worstofcsega.simple.parser.helper.UnprocessedText;
import hu.fw.worstofcsega.simple.parser.helper.WhitespaceExpression;
import hu.worstofcsega.loser1oo.analyzer.Node;
import hu.worstofcsega.loser1oo.formulas.Atom;
import hu.worstofcsega.mofl.formulas.FormulaFactory;

import java.util.ArrayList;
import java.util.List;

public class SimpleParserConverter {

	private UnprocessedText text;
	
	public SimpleParserConverter(UnprocessedText text) {
		this.text = text;
	}
	
	public List<Node> convertFromSimpleParserExpressions(List<ExpressionWithPositions> expressions) {
		List<Node> ret = new ArrayList<Node>();
		
		for(ExpressionWithPositions expression : expressions) {
			Node node = convert(expression);
			if(node != null) {
				ret.add(node);
			}			
		}
		
		return ret;
	}

	private Node convert(ExpressionWithPositions expression) {
		if(expression instanceof CharacterConstantExpression) {
			return toConstantNode(expression);
		} else if(expression instanceof CommentExpression) {
			return null;
		} else if(expression instanceof NameExpression) {
			return toConstantNode(expression);
		} else if(expression instanceof NumberExpression) {
			return toConstantNode(expression);
		} else if(expression instanceof OperatorExpression) {
			return toOperationNode(expression);
		} else if(expression instanceof StringExpression) {
			return toConstantNode(expression);
		} else if(expression instanceof WhitespaceExpression) {
			return null;
		} else {
			return null;
		}
	}

	private Node toOperationNode(Object expression) {
		Atom atom;
		
		OperatorExpression op = (OperatorExpression) expression;
		String content = op.getContent(text);
		
		if(eq(content, "=")) {
			atom = FormulaFactory.assignment;
		} else if(eq(content, "|", "||")) {
			atom = FormulaFactory.or;
		} else if(eq(content, "^")) {
			atom = FormulaFactory.xor;
		} else if(eq(content, "&", "&&")) {
			atom = FormulaFactory.and;
		} else if(eq(content, "==", "!=")) {
			atom = FormulaFactory.equality;
		} else if(eq(content, "<", ">", "<=", ">=")) {
			atom = FormulaFactory.relation;
		} else if(eq(content, "+", "-")) {
			atom = FormulaFactory.addition;
		} else if(eq(content, "*", "/", "%")) {
			atom = FormulaFactory.multiplication;
		} else if(eq(content, "+", "-", "++", "--", "!")) {
			atom = FormulaFactory.urinary;
		} else if(eq(content, "(")) {
			atom = FormulaFactory.openParenthesis;
		} else if(eq(content, ")")) {
			atom = FormulaFactory.closeParenthesis;
		} else {
			atom = null;
		}
		
		Node node = new Node();
		node.setAtom(atom);
		node.setData(expression);
		node.setTitle(content);
		return node;
	}
	
	private Node toConstantNode(Object expression) {
		Node node = new Node();
		node.setAtom(FormulaFactory.constant);
		node.setData(expression);
		
		String title = null;
		if(expression instanceof CharacterConstantExpression) {
			title = ((CharacterConstantExpression) expression).getContent(text);
		} else if(expression instanceof NameExpression) {
			title = ((NameExpression) expression).getContent(text);
		} else if(expression instanceof NumberExpression) {
			title = ((NumberExpression) expression).getContent(text);
		} else if(expression instanceof StringExpression) {
			title = ((StringExpression) expression).getContent(text);
		}
		
		node.setTitle(title);
		
		return node;
	}

	private boolean eq(String content, String... w) {
		for(String s : w) {
			if(content.equals(s)) {
				return true;
			}
		}
		
		return false;
	}
	
}
