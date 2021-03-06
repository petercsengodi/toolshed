package hu.csega.toolshed.parser.lr.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import hu.csega.toolshed.logging.Logger;
import hu.csega.toolshed.logging.LoggerFactory;
import hu.csega.toolshed.parser.lr.impl.ActionTable.ActionTableValue;

public class SyntaxAnalyzer {

	public ActionTable actionTable;
	public JumpTable jumpTable;

	public SyntaxAnalyzer(ActionTable actionTable, JumpTable jumpTable) {
		this.actionTable = actionTable;
		this.jumpTable = jumpTable;
	}

	public List<Rule> analyze(String sentence) {
		List<Rule> ret = new ArrayList<>();
		int position = 0;
		int fromIndex, toIndex;
		String symbol;

		Stack<String> content = new Stack<>();
		Stack<Integer> jumpStack = new Stack<>();
		jumpStack.push(0);

		if(sentence.length() > 0) {
			logger.info("Analyzing:");

			while(true) {
				StringBuilder builder = new StringBuilder();
				builder.append("{ \"");
				if(position < sentence.length()) {
					builder.append(sentence.substring(position));
				}
				builder.append("\", ");
				for(int i = 0; i < jumpStack.size(); i++) {
					builder.append("[");
					builder.append(jumpStack.get(i));
					builder.append("]");
					if(i < content.size()) {
						builder.append(content.get(i));
					}
				}
				builder.append(", ");
				for(int i = 0; i < ret.size(); i++) {
					builder.append("[");
					builder.append(ret.get(i));
					builder.append("]");
				}

				builder.append(" }");
				logger.info(builder.toString());

				String nextTerminal = LRAnalyzerConstants.EPSILON;
				if(position < sentence.length()) {
					nextTerminal = Character.toString(sentence.charAt(position));
				}

				int index = jumpStack.peek();
				ActionTableValue actionTableValue = actionTable.get(index, nextTerminal);
				String action = actionTableValue.action;

				switch (action) {
				case ActionTable.ACCEPT:
					ret.add(actionTableValue.rule);
					return ret;

				case ActionTable.SHIFT:
					content.push(nextTerminal);
					position++;

					// alter jump stack
					fromIndex = jumpStack.peek();
					symbol = content.peek();
					toIndex = jumpTable.get(fromIndex, symbol);
					jumpStack.push(toIndex);

					break;

				case ActionTable.BREAK:

					// break down the rule
					Rule rule = actionTableValue.rule;
					int length = rule.to.length();
					ret.add(rule);

					for(int i = 0; i < length; i++) {
						content.pop();
						jumpStack.pop();
					}

					content.push(rule.from);

					// alter jump stack
					fromIndex = jumpStack.peek();
					symbol = content.peek();
					toIndex = jumpTable.get(fromIndex, symbol);
					jumpStack.push(toIndex);

					break;

				case ActionTable.ERROR:
				default:
					logger.info("Jump table indicates error!");
					throw new RuntimeException("Can't analyze further!");
				}
			}
		} else {
			logger.info("Input is empty string, nothing to analyze!");
		}

		return ret;
	}

	private static final Logger logger = LoggerFactory.createLogger(SyntaxAnalyzer.class);
}
