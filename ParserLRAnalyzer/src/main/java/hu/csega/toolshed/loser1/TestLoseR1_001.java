package hu.csega.toolshed.loser1;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class TestLoseR1_001 {

	public static void main(String[] args) {
		System.out.println("Starting application...");
		
		Rule base = new Rule(LoseR1Constants.UNIVERSE, "E");
		RuleSet rules = RuleSet.create(
				base,

				// the algorithm
				// can't handle rules like this
				// new Rule("E", ""),
				
				new Rule("E", "EE+"),
				new Rule("E", "EE*"),
				new Rule("E", "a")
				);
		
		System.out.println("Rule set:");
		System.out.println(rules);

		System.out.println("Initial rule state set:");
		RuleState baseState = new RuleState(base);
		RuleStateSet tempSet = new RuleStateSet();
		tempSet.add(baseState);
		RuleStateSet baseSet = LoseR1Util.extendRuleStateSet(tempSet, rules);
		System.out.println(baseSet.toString());
		
		JumpTable jumpTable = new JumpTable();
		
		Groups groups = new Groups();
		groups.add(baseSet);
		TreeSet<RuleStateSet> toProcess = new TreeSet<RuleStateSet>();
		toProcess.add(baseSet);
		
		while(!toProcess.isEmpty()) {
			RuleStateSet setToProcess = toProcess.first();
			toProcess.remove(setToProcess);
			
			Set<String> possibleNextSymbols = setToProcess.getPossibleNextSymbols();
			for(String nextSymbol : possibleNextSymbols) {
				System.out.println("Building: [" + setToProcess.id + "] + " + nextSymbol + ": ");
				
				RuleStateSet founders = LoseR1Util.generateFounderRuleStates(setToProcess, nextSymbol);
				RuleStateSet newStateSet = LoseR1Util.extendRuleStateSet(founders, rules);
				
				if(!newStateSet.isEmpty()) {
					int index = groups.indexOf(newStateSet);
					if(index == -1) {
						groups.add(newStateSet);
						toProcess.add(newStateSet);
						System.out.println("=> Not found, yet => " + newStateSet.id);
					} else {
						newStateSet = groups.get(index);
						System.out.println("=> Found => " + newStateSet.id);
					}
				}
				
				jumpTable.put(setToProcess.id, nextSymbol, newStateSet.id);
				System.out.println(newStateSet);
			}
		}
		
		System.out.println(jumpTable.toString());
		
		ActionTable actionTable = LoseR1Util.generateActionTable(groups, rules);
		System.out.println(actionTable.toString());
		
		SyntaxAnalyzer analyzer = new SyntaxAnalyzer(actionTable, jumpTable);
		List<Rule> ruleSequence = analyzer.analyze("aaa+*");
		Collections.reverse(ruleSequence);
		
		LoseR1Util.generateWithRules(ruleSequence);
	}

}
