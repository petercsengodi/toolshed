package hu.csega.toolshed.parser.example.converters;

import hu.csega.toolshed.parser.example.formulas.FormulaFactory;
import hu.csega.toolshed.parser.lr.oo.analyzer.Node;
import hu.csega.toolshed.parser.lr.oo.formulas.Atom;
import hu.csega.toolshed.parser.preprocessor.ParserToken;
import hu.csega.toolshed.parser.preprocessor.helper.UnprocessedText;
import hu.csega.toolshed.parser.preprocessor.impl.ExpressionWithPositions;
import hu.csega.toolshed.parser.tokens.CharacterToken;
import hu.csega.toolshed.parser.tokens.CommentToken;
import hu.csega.toolshed.parser.tokens.NameToken;
import hu.csega.toolshed.parser.tokens.NumberToken;
import hu.csega.toolshed.parser.tokens.OperatorToken;
import hu.csega.toolshed.parser.tokens.StringToken;
import hu.csega.toolshed.parser.tokens.WhitespaceToken;

import java.util.ArrayList;
import java.util.List;

public class SimpleParserConverter {

	private UnprocessedText text;

	public SimpleParserConverter(UnprocessedText text) {
		this.text = text;
	}

	public List<Node> convertFromSimpleParserExpressions(List<ParserToken> expressions) {
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
		if(expression instanceof CharacterToken) {
			return toConstantNode(expression);
		} else if(expression instanceof CommentToken) {
			return null;
		} else if(expression instanceof NameToken) {
			return toConstantNode(expression);
		} else if(expression instanceof NumberToken) {
			return toConstantNode(expression);
		} else if(expression instanceof OperatorToken) {
			return toOperationNode(expression);
		} else if(expression instanceof StringToken) {
			return toConstantNode(expression);
		} else if(expression instanceof WhitespaceToken) {
			return null;
		} else {
			return null;
		}
	}

	private Node toOperationNode(Object expression) {
		Atom atom;

		OperatorToken op = (OperatorToken) expression;
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
		if(expression instanceof CharacterToken) {
			title = ((CharacterToken) expression).getContent(text);
		} else if(expression instanceof NameToken) {
			title = ((NameToken) expression).getContent(text);
		} else if(expression instanceof NumberToken) {
			title = ((NumberToken) expression).getContent(text);
		} else if(expression instanceof StringToken) {
			title = ((StringToken) expression).getContent(text);
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
