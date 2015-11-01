package hu.csega.toolshed.loser1oo.analyzer;

import hu.csega.toolshed.logging.Logger;
import hu.csega.toolshed.logging.LoggerFactory;
import hu.csega.toolshed.loser1oo.formulas.Atom;
import hu.csega.toolshed.loser1oo.formulas.Formula;
import hu.csega.toolshed.loser1oo.formulas.FormulaUtil;
import hu.csega.toolshed.loser1oo.processing.ActionTable;
import hu.csega.toolshed.loser1oo.processing.ActionTable.ActionTableValue;
import hu.csega.toolshed.loser1oo.processing.JumpTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TreeBuilder {

	private static final Logger logger = LoggerFactory.getDefaultImplementation(TreeBuilder.class);
	
	public ActionTable actionTable;
	public JumpTable jumpTable;

	public TreeBuilder(ActionTable actionTable, JumpTable jumpTable) {
		this.actionTable = actionTable;
		this.jumpTable = jumpTable;
	}

	public Node build(Atom... sentence) {
		return build(convertToNodes(Arrays.asList(sentence)));
	}

	public Node build(List<Node> sentence) {
		Node rootNode = new Node();
		rootNode.atom = FormulaUtil.UNIVERSE;
		
		List<Formula> formulaList = new ArrayList<Formula>();
		
		int position = 0;
		int fromIndex, toIndex;
		Atom symbol;
		Node peekNode;

		Stack<Node> content = new Stack<Node>();
		Stack<Integer> jumpStack = new Stack<Integer>();
		jumpStack.push(0);

		if (sentence.size() > 0) {
			logger.debug("Analyzing:");

			while (true) {
				log(sentence, position, content, jumpStack, formulaList);

				Atom nextTerminal;
				Node nextNode;
				if (position < sentence.size()) {
					nextNode = sentence.get(position);
					nextTerminal = nextNode.atom;
				} else {
					nextTerminal = FormulaUtil.VACUUM;
					nextNode = new Node();
					nextNode.atom = nextTerminal;
				}

				int index = jumpStack.peek();
				ActionTableValue actionTableValue = actionTable.get(index,
						nextTerminal);
				String action = actionTableValue.action;

				switch (action) {
				case ActionTable.ACCEPT:
					while(content.size() > 0) {
						rootNode.children.add(content.pop());
					}
					
					return rootNode;

				case ActionTable.SHIFT:
					content.push(nextNode);
					position++;

					// alter jump stack
					fromIndex = jumpStack.peek();
					peekNode = content.peek();
					symbol = peekNode.atom;
					toIndex = jumpTable.get(fromIndex, symbol);
					jumpStack.push(toIndex);

					break;

				case ActionTable.BREAK:

					// break down the rule
					Formula rule = actionTableValue.rule;
					int length = rule.to.size();
					Node tmpNode = new Node();
					tmpNode.atom = rule.from;
					tmpNode.formula = rule;
					
					formulaList.add(rule);

					for (int i = 0; i < length; i++) {
						tmpNode.children.add(0, content.pop());
						jumpStack.pop();
					}

					content.push(tmpNode);

					// alter jump stack
					fromIndex = jumpStack.peek();
					peekNode = content.peek();
					symbol = peekNode.atom;
					toIndex = jumpTable.get(fromIndex, symbol);
					jumpStack.push(toIndex);

					break;

				case ActionTable.ERROR:
				default:
					logger.error("Jump table indicates error!");
					throw new RuntimeException("Can't analyze further!");
				}
			}
		} else {
			logger.debug("Input is empty string, nothing to analyze!");
		}

		return rootNode;
	}
	
	private List<Node> convertToNodes(List<Atom> atoms) {
		List<Node> ret = new ArrayList<Node>();
		
		for(Atom atom : atoms) {
			Node node = new Node();
			node.atom = atom;
			ret.add(node);
		}
		
		return ret;
	}

	private void log(List<Node> sentence, int position, Stack<Node> content,
			Stack<Integer> jumpStack, List<Formula> ret) {
		if(logger.infoShown()) {
			StringBuilder builder = new StringBuilder();
			builder.append("{ \"");
			if (position < sentence.size()) {
				builder.append(sentence.subList(position, sentence.size()));
			}
			builder.append("\", ");
			for (int i = 0; i < jumpStack.size(); i++) {
				builder.append("[");
				builder.append(jumpStack.get(i));
				builder.append("]");
				if (i < content.size()) {
					builder.append(content.get(i).atom);
				}
			}
			builder.append(", ");
			for (int i = 0; i < ret.size(); i++) {
				builder.append("[");
				builder.append(ret.get(i));
				builder.append("]");
			}
			builder.append(" }");
			logger.debug(builder.toString());
		}
	}

}
