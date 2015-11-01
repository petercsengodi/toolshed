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

public class SyntaxAnalyzer {

	private static final Logger logger = LoggerFactory.getDefaultImplementation(SyntaxAnalyzer.class);
	
	public ActionTable actionTable;
	public JumpTable jumpTable;

	public SyntaxAnalyzer(ActionTable actionTable, JumpTable jumpTable) {
		this.actionTable = actionTable;
		this.jumpTable = jumpTable;
	}

	public List<Formula> analyze(Atom... sentence) {
		return analyze(Arrays.asList(sentence));
	}

	public List<Formula> analyze(List<Atom> sentence) {
		List<Formula> ret = new ArrayList<Formula>();
		int position = 0;
		int fromIndex, toIndex;
		Atom symbol;

		Stack<Atom> content = new Stack<Atom>();
		Stack<Integer> jumpStack = new Stack<Integer>();
		jumpStack.push(0);

		if (sentence.size() > 0) {
			logger.info("Analyzing:");

			while (true) {
				log(sentence, position, content, jumpStack, ret);

				Atom nextTerminal = FormulaUtil.VACUUM;
				if (position < sentence.size()) {
					nextTerminal = sentence.get(position);
				}

				int index = jumpStack.peek();
				ActionTableValue actionTableValue = actionTable.get(index,
						nextTerminal);
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
					Formula rule = actionTableValue.rule;
					int length = rule.to.size();
					ret.add(rule);

					for (int i = 0; i < length; i++) {
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
					logger.error("Jump table indicates error!");
					throw new RuntimeException("Can't analyze further!");
				}
			}
		} else {
			logger.info("Input is empty string, nothing to analyze!");
		}

		return ret;
	}

	private void log(List<Atom> sentence, int position, Stack<Atom> content,
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
					builder.append(content.get(i));
				}
			}
			builder.append(", ");
			for (int i = 0; i < ret.size(); i++) {
				builder.append("[");
				builder.append(ret.get(i));
				builder.append("]");
			}
			builder.append(" }");
			logger.info(builder.toString());
		}
	}

}
