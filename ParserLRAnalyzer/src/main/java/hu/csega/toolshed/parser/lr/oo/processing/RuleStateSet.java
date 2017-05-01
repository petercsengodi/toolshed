package hu.csega.toolshed.parser.lr.oo.processing;

import java.util.Set;
import java.util.TreeSet;

import hu.csega.toolshed.parser.lr.oo.formulas.Atom;
import hu.csega.toolshed.parser.lr.oo.formulas.FormulaUtil;

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
	
	public RuleStateSet getRuleStatesWithNextSymbol(Atom symbol) {
		RuleStateSet ret = new RuleStateSet();
		
		for(RuleState ruleState : this) {
			Atom nextSymbol = ruleState.getNextSymbol();
			if(nextSymbol.equals(symbol)) {
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

	public Set<Atom> getPossibleNextSymbols() {
		Set<Atom> ret = new TreeSet<Atom>();
		
		for(RuleState state : this) {
			Atom nextSymbol = state.getNextSymbol();
			if(!nextSymbol.equals(FormulaUtil.VACUUM)) {
				ret.add(nextSymbol);
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
