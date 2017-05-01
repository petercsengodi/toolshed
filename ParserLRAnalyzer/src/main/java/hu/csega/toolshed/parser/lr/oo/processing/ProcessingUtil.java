package hu.csega.toolshed.parser.lr.oo.processing;

import hu.csega.toolshed.logging.Logger;
import hu.csega.toolshed.logging.LoggerFactory;
import hu.csega.toolshed.parser.lr.oo.formulas.Atom;
import hu.csega.toolshed.parser.lr.oo.formulas.Formula;
import hu.csega.toolshed.parser.lr.oo.formulas.FormulaBook;
import hu.csega.toolshed.parser.lr.oo.formulas.FormulaUtil;
import hu.csega.toolshed.parser.lr.oo.formulas.Molecule;
import hu.csega.toolshed.parser.lr.oo.formulas.Terminal;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ProcessingUtil {
	
	private static final Logger logger = LoggerFactory.getDefaultImplementation(ProcessingUtil.class);
	
	public static Set<Atom> getNextSymbol(RuleStateSet set) {
		return set.getPossibleNextSymbols();
	}

	public static Set<Atom> generateFollowingLanguage(RuleState state, FormulaBook rules) {
		Set<Atom> terminals = new TreeSet<Atom>();
		Molecule remaining = state.getRemaining(); 
		generateFollowingLanguage(state, remaining, rules, terminals);
		return terminals;
	}
	
	private static void generateFollowingLanguage(RuleState state, Molecule generated, FormulaBook rules, Set<Atom> collector) {
		if(generated == null || generated.size() == 0) {
			collector.add(state.terminal);
			return;
		}
		
		Atom first = generated.get(0);
		if(FormulaUtil.isTerminal(first)) {
			collector.add(first);
			return;
		}
		
		// Non terminal
		FormulaBook applicableRules = rules.applicable(first);
		for(Formula applicableRule : applicableRules) {
			Molecule gen = FormulaUtil.applyRule(generated, applicableRule);
			if(gen == null) {
				// rule is not applicable after all
				continue;
			}
			
			if(gen.size() == 0) {
				collector.add(state.terminal);
				continue;
			}
			
			Atom a = gen.get(0);
			if(FormulaUtil.isTerminal(a)) {
				collector.add(a);
				continue;
			}
			
			// Non terminal comes next -> do it recursively without
			// using current rule (to avoid infinite loop)
			FormulaBook minSet = FormulaBook.substract(rules, applicableRule);
			if(minSet.isEmpty()) {
				// If there are no rules left, we won't be able to
				// proceed anyway
				continue;
			}
			
			generateFollowingLanguage(state, gen, minSet, collector);
		}
	}	
	
	public static RuleStateSet extendRuleStateSet(RuleStateSet set, FormulaBook rules) {
		RuleStateSet ret = new RuleStateSet();
		RuleStateSet toProcess = new RuleStateSet();
		
		for(RuleState ruleState : set) {
			toProcess.add(ruleState);
			ret.add(ruleState);
		}
		
		while(!toProcess.isEmpty()) {
			RuleState stateToProcess = toProcess.first();
			toProcess.remove(stateToProcess);
			
			Atom nextSymbol = stateToProcess.getNextSymbol();
			if(FormulaUtil.isNonTerminal(nextSymbol)) {
				RuleState tempState = new RuleState(stateToProcess);
				tempState.position = tempState.position + 1;
				Set<Atom> followingTerminals = ProcessingUtil.generateFollowingLanguage(tempState, rules);
				
				FormulaBook applicableRules = rules.applicable(nextSymbol);
				for(Formula applicable : applicableRules) {
					for(Atom terminal : followingTerminals) {
						RuleState newState = new RuleState(applicable, 0, (Terminal)terminal);
						
						if(ret.contains(newState)){
							// do nothing, we already got that
						} else {
							ret.add(newState);
							if(!toProcess.contains(newState)) {
								toProcess.add(newState);
							}
						}
					}
				}
				
			} // end if isNonTerminal
		}
		
		return ret;
	}

	public static RuleStateSet generateFounderRuleStates(RuleStateSet baseSet,
			Atom nextSymbol) {
		RuleStateSet founders = new RuleStateSet();
		
		RuleStateSet ruleStatesWithNextSymbol = baseSet.getRuleStatesWithNextSymbol(nextSymbol);
		for(RuleState ruleState : ruleStatesWithNextSymbol) {
			RuleState founder = new RuleState(ruleState);
			founder.position = founder.position + 1;
			founders.add(founder);
		}
		
		return founders;
	}

	public static ActionTable generateActionTable(Groups groups, FormulaBook rules) {
		ActionTable actionTable = new ActionTable();
		
		for(RuleStateSet set : groups) {
			int fromIndex = set.id;
			
			for(RuleState state : set) {
				if(state.position >= state.rule.to.size()) {
					String action = ActionTable.BREAK;
					if(state.rule.from.equals(FormulaUtil.UNIVERSE)) {
						action = ActionTable.ACCEPT;
					}
					
					Set<Atom> following = ProcessingUtil.generateFollowingLanguage(state, rules);
					for(Atom symbol : following) {
						actionTable.put(fromIndex, symbol, action, state.rule);
						logger.info(fromIndex + " / \"" +
								symbol + "\" / " + action + " / " + state);
					}
					
				} else if(state.position < state.rule.to.size()) {
					Set<Atom> following = ProcessingUtil.generateFollowingLanguage(state, rules);
					for(Atom symbol : following) {
					actionTable.put(fromIndex, symbol, ActionTable.SHIFT, null);
					logger.info(fromIndex + " / \"" +
								symbol + "\" / S / " + state);
					}
				} else {
					// do nothing
				}
			}
		}

		return actionTable;
	}
	
	public static void generateWithRules(List<Formula> ruleSequence) {
		logger.info("Generating...");
		
		Molecule temp = new Molecule();
		logger.info(temp.toString());
		
		for(Formula rule : ruleSequence) {
			logger.info(rule.toString());
			
			if(rule.from.equals(FormulaUtil.UNIVERSE)) {
				temp.addAll(rule.to);
			} else {
				int index = temp.lastIndexOf(rule.from);
				if(index == -1) {
					throw new RuntimeException("Invalid rule!");
				} else if(index == 0) {
					if(temp.size() == 0) {
						temp = rule.to;
					} else {
						temp = Molecule.concat(rule.to, temp.subMolecule(1));
					}
				} else {
					if(index < temp.size() - 1) {
						temp = Molecule.concat(temp.subMolecule(0, index), rule.to, temp.subMolecule(index + 1));
					} else if(index == temp.size() - 1){
						temp = Molecule.concat(temp.subMolecule(0, temp.size() - 1), rule.to);
					} else {
						throw new RuntimeException("Rule activation error!");
					}
				}
			}
			
			logger.info(temp.toString());
		}

	}

}
