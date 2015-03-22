package hu.worstofcsega.loser1oo.analyzer;

import hu.worstofcsega.logging.Logger;
import hu.worstofcsega.logging.LoggerFactory;
import hu.worstofcsega.loser1oo.formulas.Atom;
import hu.worstofcsega.loser1oo.formulas.Formula;
import hu.worstofcsega.loser1oo.formulas.FormulaBook;
import hu.worstofcsega.loser1oo.formulas.FormulaUtil;
import hu.worstofcsega.loser1oo.processing.ActionTable;
import hu.worstofcsega.loser1oo.processing.Groups;
import hu.worstofcsega.loser1oo.processing.JumpTable;
import hu.worstofcsega.loser1oo.processing.ProcessingUtil;
import hu.worstofcsega.loser1oo.processing.RuleState;
import hu.worstofcsega.loser1oo.processing.RuleStateSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeBuilderFactory {
	
	private static final Logger logger = LoggerFactory.getDefaultImplementation(TreeBuilderFactory.class);

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
		TreeSet<RuleStateSet> toProcess = new TreeSet<RuleStateSet>();
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
		if(LoggerFactory.debugShown()) {
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
	
}
