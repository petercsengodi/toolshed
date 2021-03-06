package hu.csega.toolshed.parser.lr.oo.analyzer;

import hu.csega.toolshed.logging.Logger;
import hu.csega.toolshed.logging.LoggerFactory;
import hu.csega.toolshed.parser.lr.oo.formulas.Atom;
import hu.csega.toolshed.parser.lr.oo.formulas.Formula;
import hu.csega.toolshed.parser.lr.oo.formulas.FormulaBook;
import hu.csega.toolshed.parser.lr.oo.formulas.FormulaUtil;
import hu.csega.toolshed.parser.lr.oo.processing.ActionTable;
import hu.csega.toolshed.parser.lr.oo.processing.Groups;
import hu.csega.toolshed.parser.lr.oo.processing.JumpTable;
import hu.csega.toolshed.parser.lr.oo.processing.ProcessingUtil;
import hu.csega.toolshed.parser.lr.oo.processing.RuleState;
import hu.csega.toolshed.parser.lr.oo.processing.RuleStateSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeBuilderFactory {

	public static TreeBuilder createBuilder(FormulaBook formulaBook) {
		Formula base = null;
		for(Formula formula : formulaBook) {
			if(formula.from.equals(FormulaUtil.UNIVERSE)) {
				base = formula;
				break;
			}
		}

		logger.debug("Initial rule state set:");
		RuleState baseState = new RuleState(base);
		RuleStateSet tempSet = new RuleStateSet();
		tempSet.add(baseState);
		RuleStateSet baseSet = ProcessingUtil.extendRuleStateSet(tempSet, formulaBook);
		logger.debug(baseSet.toString());

		JumpTable jumpTable = new JumpTable();

		Groups groups = new Groups();
		groups.add(baseSet);
		TreeSet<RuleStateSet> toProcess = new TreeSet<>();
		toProcess.add(baseSet);

		while(!toProcess.isEmpty()) {
			RuleStateSet setToProcess = toProcess.first();
			toProcess.remove(setToProcess);

			Set<Atom> possibleNextSymbols = setToProcess.getPossibleNextSymbols();
			for(Atom nextSymbol : possibleNextSymbols) {
				logger.debug("Building: [" + setToProcess.id + "] + " + nextSymbol + ": ");

				RuleStateSet founders = ProcessingUtil.generateFounderRuleStates(setToProcess, nextSymbol);
				RuleStateSet newStateSet = ProcessingUtil.extendRuleStateSet(founders, formulaBook);

				if(!newStateSet.isEmpty()) {
					int index = groups.indexOf(newStateSet);
					if(index == -1) {
						groups.add(newStateSet);
						toProcess.add(newStateSet);
						logger.debug("=> Not found, yet => " + newStateSet.id);
					} else {
						newStateSet = groups.get(index);
						logger.debug("=> Found => " + newStateSet.id);
					}
				}

				jumpTable.put(setToProcess.id, nextSymbol, newStateSet.id);
				logger.debug(newStateSet.toString());
			}
		}

		logger.debug(jumpTable.toString());

		ActionTable actionTable = ProcessingUtil.generateActionTable(groups, formulaBook);
		logger.debug(actionTable.toString());

		TreeBuilder builder = new TreeBuilder(actionTable, jumpTable);
		return builder;
	}

	public static void log(Node rootNode) {
		if(logger.debugShown()) {
			StringBuilder builder = new StringBuilder();
			log(rootNode, builder);
			logger.debug(builder.toString());
		}
	}

	private static void log(Node node, StringBuilder builder) {
		builder.append(node.getAtom());

		if(node.getChildren() != null && node.getChildren().size() > 0) {
			builder.append("(");

			boolean first = true;
			for(Node n : node.getChildren()) {
				if(first) {
					first = false;
				} else {
					builder.append(", ");
				}

				log(n, builder);
			}

			builder.append(")");
		}
	}

	private static final Logger logger = LoggerFactory.createLogger(TreeBuilderFactory.class);
}
