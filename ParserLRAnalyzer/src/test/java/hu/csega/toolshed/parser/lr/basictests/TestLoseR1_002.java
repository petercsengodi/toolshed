package hu.csega.toolshed.parser.lr.basictests;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import hu.csega.toolshed.logging.Logger;
import hu.csega.toolshed.logging.LoggerFactory;
import hu.csega.toolshed.parser.lr.impl.ActionTable;
import hu.csega.toolshed.parser.lr.impl.Groups;
import hu.csega.toolshed.parser.lr.impl.JumpTable;
import hu.csega.toolshed.parser.lr.impl.LRAnalyzerConstants;
import hu.csega.toolshed.parser.lr.impl.LRAnalyzerUtil;
import hu.csega.toolshed.parser.lr.impl.Rule;
import hu.csega.toolshed.parser.lr.impl.RuleSet;
import hu.csega.toolshed.parser.lr.impl.RuleState;
import hu.csega.toolshed.parser.lr.impl.RuleStateSet;
import hu.csega.toolshed.parser.lr.impl.SyntaxAnalyzer;

public class TestLoseR1_002 {

	public static void main(String[] args) {
		logger.info("Starting application...");

		Rule base = new Rule(LRAnalyzerConstants.UNIVERSE, "E");
		RuleSet rules = RuleSet.create(
				base,

				// the algorithm
				// can't handle rules like this
				// new Rule("E", ""),

				new Rule("E", "E+T"),
				new Rule("E", "T"),
				new Rule("T", "T*F"),
				new Rule("T", "F"),
				new Rule("F", "(E)"),
				new Rule("F", "a")
				);

		logger.info("Rule set:\n" + rules);

		RuleState baseState = new RuleState(base);
		RuleStateSet tempSet = new RuleStateSet();
		tempSet.add(baseState);
		RuleStateSet baseSet = LRAnalyzerUtil.extendRuleStateSet(tempSet, rules);

		logger.info("Initial rule state set:\n" + baseSet);

		JumpTable jumpTable = new JumpTable();

		Groups groups = new Groups();
		groups.add(baseSet);
		TreeSet<RuleStateSet> toProcess = new TreeSet<>();
		toProcess.add(baseSet);

		while(!toProcess.isEmpty()) {
			RuleStateSet setToProcess = toProcess.first();
			toProcess.remove(setToProcess);

			Set<String> possibleNextSymbols = setToProcess.getPossibleNextSymbols();
			for(String nextSymbol : possibleNextSymbols) {
				logger.info("Building: [" + setToProcess.id + "] + " + nextSymbol + ": ");

				RuleStateSet founders = LRAnalyzerUtil.generateFounderRuleStates(setToProcess, nextSymbol);
				RuleStateSet newStateSet = LRAnalyzerUtil.extendRuleStateSet(founders, rules);

				if(!newStateSet.isEmpty()) {
					int index = groups.indexOf(newStateSet);
					if(index == -1) {
						groups.add(newStateSet);
						toProcess.add(newStateSet);
						logger.info("=> Not found, yet => " + newStateSet.id);
					} else {
						newStateSet = groups.get(index);
						logger.info("=> Found => " + newStateSet.id);
					}
				}

				jumpTable.put(setToProcess.id, nextSymbol, newStateSet.id);
				logger.info(newStateSet);
			}
		}

		logger.info(jumpTable);

		ActionTable actionTable = LRAnalyzerUtil.generateActionTable(groups, rules);
		logger.info(actionTable);

		SyntaxAnalyzer analyzer = new SyntaxAnalyzer(actionTable, jumpTable);
		List<Rule> ruleSequence = analyzer.analyze("a+a*a");
		Collections.reverse(ruleSequence);

		LRAnalyzerUtil.generateWithRules(ruleSequence);
	}

	private static final Logger logger = LoggerFactory.createLogger(TestLoseR1_002.class);
}
