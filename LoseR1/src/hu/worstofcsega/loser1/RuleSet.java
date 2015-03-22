package hu.worstofcsega.loser1;

import java.util.TreeSet;

public class RuleSet extends TreeSet<Rule> {

	/**
	 * Default serial version uid. 
	 */
	private static final long serialVersionUID = 1L;

	public RuleSet() {
	}
	
	@Override
	public String toString() {
		if(isEmpty()) {
			return "< Empty rule set >\n"; 
		}
		
		StringBuilder builder = new StringBuilder();
		
		for(Rule rule : this) {
			builder.append(rule);
			builder.append("\n");
		}
		
		return builder.toString();
	}
	
	public static RuleSet create(Rule... rules) {
		RuleSet set = new RuleSet();
		for(Rule rule : rules) {
			set.add(rule);
		}
		
		return set;
	}
	
	public static RuleSet substract(RuleSet set, Rule rule){
		RuleSet ret = new RuleSet();
		for(Rule r : set) {
			if(!r.equals(rule)) {
				ret.add(r);
			}
		}
		
		return ret;
	}
	
	public RuleSet applicable(String symbol) {
		RuleSet ret = new RuleSet();
		
		for(Rule rule : this) {
			if(rule.from.equals(symbol)) {
				ret.add(rule);
			}
		}
		
		return ret;
	}
}
