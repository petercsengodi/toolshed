package hu.csega.toolshed.parser.lr.oo.formulas;

import java.util.TreeSet;

/**
 * A set of rules. 
 */
public class FormulaBook extends TreeSet<Formula> {

	/**
	 * Default serial version uid. 
	 */
	private static final long serialVersionUID = 1L;

	public FormulaBook() {
	}
	
	@Override
	public String toString() {
		if(isEmpty()) {
			return "< Empty rule set >\n"; 
		}
		
		StringBuilder builder = new StringBuilder();
		
		for(Formula rule : this) {
			builder.append(rule);
			builder.append("\n");
		}
		
		return builder.toString();
	}
	
	public static FormulaBook create(Formula... rules) {
		FormulaBook set = new FormulaBook();
		for(Formula rule : rules) {
			set.add(rule);
		}
		
		return set;
	}
	
	public static FormulaBook substract(FormulaBook set, Formula rule){
		FormulaBook ret = new FormulaBook();
		for(Formula r : set) {
			if(!r.equals(rule)) {
				ret.add(r);
			}
		}
		
		return ret;
	}
	
	public FormulaBook applicable(Atom atom) {
		FormulaBook ret = new FormulaBook();
		
		for(Formula rule : this) {
			if(rule.from.equals(atom)) {
				ret.add(rule);
			}
		}
		
		return ret;
	}
}
