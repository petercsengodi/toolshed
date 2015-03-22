package hu.worstofcsega.loser1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LoseR1Util {

	public static boolean isNonTerminal(String s) {
		return s.length() > 0 && isNonTerminal(s.charAt(0));
	}

	public static boolean isNonTerminal(char c) {
		return Character.isLetter(c) && Character.isUpperCase(c);
	}
	
	public static boolean isTerminal(char c) {
		return !isNonTerminal(c);
	}
	
	public static String applyRule(String generatedString, Rule rule) {
		if(generatedString.length() == 0) {
			return null;
		}
		
		char c = generatedString.charAt(0);
		if(isTerminal(c)) {
			return null;
		}
		
		if(rule.from.equals(LoseR1Constants.UNIVERSE)) {
			return null;
		}
		
		char nonTerminant = rule.from.charAt(0);
		if(c != nonTerminant) {
			return null;
		}
		
		String ret = rule.to;
		if(generatedString.length() == 1) {
			return ret;
		} else {
			return ret + generatedString.substring(1);
		}
	}
	
	public static Set<String> getNextSymbol(RuleStateSet set) {
		return set.getPossibleNextSymbols();
	}

//	public static RuleStateSet getNextState(RuleState ruleState, RuleSet set) {
//		int len = ruleState.rule.to.length();
//		String generatedString = "";
//		if(ruleState.position < len) {
//			generatedString = ruleState.rule.to.substring(ruleState.position);
//		}
//		
//		Set<String> terminals = new TreeSet<String>(); 
//		generateNextTerminal(ruleState, generatedString, set, terminals);		
//		
//		RuleStateSet ruleStates = new RuleStateSet();		
//		for(String terminal : terminals) {
//			RuleState state = new RuleState(ruleState.rule);
//			state.position = ruleState.position;
//			state.terminal = terminal;
//			ruleStates.add(state);
//		}
//		
//		return ruleStates;
//	}
//
	public static Set<String> generateFollowingLanguage(RuleState state, RuleSet rules) {
		Set<String> terminals = new TreeSet<String>();
		String remaining = state.getRemaining(); 
		generateFollowingLanguage(state, remaining, rules, terminals);
		return terminals;
	}
	
	private static void generateFollowingLanguage(RuleState state, String generatedString, RuleSet rules, Set<String> collector) {
		if(generatedString == null || generatedString.length() == 0) {
//			collector.add(LoseR1Constants.EPSILON);
			collector.add(state.terminal);
			return;
		}
		
		char first = generatedString.charAt(0);
		if(isTerminal(first)) {
			collector.add(Character.toString(first));
			return;
		}
		
		// Non terminal
		RuleSet applicableRules = rules.applicable(Character.toString(first));
		for(Rule applicableRule : applicableRules) {
			String gen = applyRule(generatedString, applicableRule);
			if(gen == null) {
				// rule is not applicable after all
				continue;
			}
			
			if(gen.length() == 0) {
				collector.add(state.terminal);
				continue;
			}
			
			char c = gen.charAt(0);
			if(isTerminal(c)) {
				collector.add(Character.toString(c));
				continue;
			}
			
			// Non terminal comes next -> do it recursively without
			// using current rule (to avoid infinite loop)
			RuleSet minSet = RuleSet.substract(rules, applicableRule);
			if(minSet.isEmpty()) {
				// If there are no rules left, we won't be able to
				// proceed anyway
				continue;
			}
			
			generateFollowingLanguage(state, gen, minSet, collector);
		}
	}	
	
	public static RuleStateSet extendRuleStateSet(RuleStateSet set, RuleSet rules) {
		RuleStateSet ret = new RuleStateSet();
		RuleStateSet toProcess = new RuleStateSet();
		
		for(RuleState ruleState : set) {
			toProcess.add(ruleState);
			ret.add(ruleState);
		}
		
		while(!toProcess.isEmpty()) {
			RuleState stateToProcess = toProcess.first();
			toProcess.remove(stateToProcess);
			
			String nextSymbol = stateToProcess.getNextSymbol();
			if(isNonTerminal(nextSymbol)) {
				RuleState tempState = new RuleState(stateToProcess);
				tempState.position = tempState.position + 1;
				Set<String> followingTerminals = generateFollowingLanguage(tempState, rules);
				
				RuleSet applicableRules = rules.applicable(nextSymbol);
				for(Rule applicable : applicableRules) {
					for(String terminal : followingTerminals) {
						RuleState newState = new RuleState(applicable, 0, terminal);
						
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
			String nextSymbol) {
		RuleStateSet founders = new RuleStateSet();
		
		RuleStateSet ruleStatesWithNextSymbol = baseSet.getRuleStatesWithNextSymbol(nextSymbol);
		for(RuleState ruleState : ruleStatesWithNextSymbol) {
			RuleState founder = new RuleState(ruleState);
			founder.position = founder.position + 1;
			founders.add(founder);
		}
		
		return founders;
	}

	public static ActionTable generateActionTable(Groups groups, RuleSet rules) {
		ActionTable actionTable = new ActionTable();
		
		for(RuleStateSet set : groups) {
			int fromIndex = set.id;
			
			for(RuleState state : set) {
				if(state.position >= state.rule.to.length()) {
					String action = ActionTable.BREAK;
					if(state.rule.from.equals(LoseR1Constants.UNIVERSE)) {
						action = ActionTable.ACCEPT;
					}
					
					// ???
					Set<String> following = LoseR1Util.generateFollowingLanguage(state, rules);
					for(String f : following) {
						actionTable.put(fromIndex, f, action, state.rule);
						System.out.println(fromIndex + " / \"" +
						f + "\" / " + action + " / " + state);
					}
					
				} else if(state.position < state.rule.to.length()) {
					Set<String> following = LoseR1Util.generateFollowingLanguage(state, rules);
					for(String f : following) {
					actionTable.put(fromIndex, f, ActionTable.SHIFT, null);
						System.out.println(fromIndex + " / \"" +
						f + "\" / S / " + state);
					}
				} else {
					// do nothing
				}
			}
		}

		return actionTable;
	}
	
	public static void generateWithRules(List<Rule> ruleSequence) {
		System.out.println("Generating...");
		
		String temp = "";
		System.out.println('"' + temp + '"');
		
		for(Rule rule : ruleSequence) {
			System.out.println(rule);
			
			if(rule.from.equals(LoseR1Constants.UNIVERSE)) {
				temp += rule.to;
			} else {
				int index = temp.lastIndexOf(rule.from.charAt(0));
				if(index == -1) {
					throw new RuntimeException("Invalid rule!");
				} else if(index == 0) {
					if(temp.length() == 0) {
						temp = rule.to;
					} else {
						temp = rule.to + temp.substring(1);
					}
				} else {
					if(index < temp.length() - 1) {
						temp = temp.substring(0, index) + rule.to + temp.substring(index+1);
					} else if(index == temp.length() - 1){
						temp = temp.substring(0, temp.length() - 1) + rule.to;
					} else {
						throw new RuntimeException("Rule activation error!");
					}
				}
			}
			
			System.out.println('"' + temp + '"');
		}

		System.out.println();
	}
}
