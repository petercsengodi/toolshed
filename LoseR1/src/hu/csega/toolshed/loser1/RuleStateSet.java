package hu.csega.toolshed.loser1;

import java.util.Set;
import java.util.TreeSet;

public class RuleStateSet extends TreeSet<RuleState> implements Comparable<RuleStateSet>{

	/**
	 * Default serial version uid.
	 */
	private static final long serialVersionUID = 1L;
	
	public int id = -1;

	public RuleStateSet() {
	}
	
	public RuleStateSet(RuleStateSet original) {
		super(original);
	}
	
	public RuleStateSet getRuleStatesWithNextSymbol(String symbol) {
		RuleStateSet ret = new RuleStateSet();
		
		for(RuleState ruleState : this) {
			String s = ruleState.getNextSymbol();
			if(s.equals(symbol)) {
				ret.add(ruleState);
			}
		}
		
		return ret;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rule set id: ");
		if(id == -1) {
			builder.append("< unknown >");
		} else {
			builder.append(id);
		}

		builder.append("\n");

		if(isEmpty()) {
			builder.append("< Empty rule state set >\n"); 
		} else {
		
			for(RuleState ruleState : this) {
				builder.append(ruleState);
				builder.append("\n");		
			}
			
		}
		
		return builder.toString();
	}

	public Set<String> getPossibleNextSymbols() {
		Set<String> ret = new TreeSet<String>();
		
		for(RuleState state : this) {
			String s = state.getNextSymbol();
			if(!s.equals(LoseR1Constants.EPSILON)) {
				ret.add(s);
			}
		}
		
		return ret;
	}

	@Override
	public int compareTo(RuleStateSet o) {
		return this.id - o.id;
	}

	@Override
	public boolean equals(Object o) {
		return super.equals(o);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	
}
