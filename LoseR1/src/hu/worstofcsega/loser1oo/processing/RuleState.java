package hu.worstofcsega.loser1oo.processing;

import hu.worstofcsega.loser1oo.formulas.Atom;
import hu.worstofcsega.loser1oo.formulas.Formula;
import hu.worstofcsega.loser1oo.formulas.FormulaUtil;
import hu.worstofcsega.loser1oo.formulas.Molecule;
import hu.worstofcsega.loser1oo.formulas.Terminal;

public class RuleState implements Comparable<RuleState> {

	public Formula rule;
	public int position;
	public Terminal terminal;
	
	public RuleState(Formula rule) {
		this(rule, 0, FormulaUtil.VACUUM);
	}
	
	public RuleState(Formula rule, int position) {
		this(rule, position, FormulaUtil.VACUUM);
	}
	
	public RuleState(RuleState original) {
		this(original.rule, original.position, original.terminal);
	}
	
	public RuleState(RuleState original, Terminal terminal) {
		this(original.rule, original.position, terminal);
	}
	
	public RuleState(Formula rule, int position, Terminal terminal) {
		this.rule = rule;
		this.position = position;
		this.terminal = terminal;
	}

	public Atom getNextSymbol() {
		if(position < rule.to.size()) {
			return rule.to.get(position);
		} else {
			return FormulaUtil.VACUUM;
		}
	}
	
	public Molecule getRemaining() {
		if(position < rule.to.size()) {
			return new Molecule(rule.to.subList(position, rule.to.size()));
		} else {
			return FormulaUtil.EMPTY_MOLECULE;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(rule.from);
		builder.append(FormulaUtil.RULE_MARKER);

		for(int i = 0; i < rule.to.size(); i++) {
			if(position == i) {
				builder.append(FormulaUtil.POSITION_MARKER);
			}
			
			builder.append(rule.to.get(i));
		}
		
		if(position >= rule.to.size()) {
			builder.append(FormulaUtil.POSITION_MARKER);
		}
		
		builder.append(FormulaUtil.ATOM_SEPARATOR);
		builder.append(terminal);
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((terminal == null) ? 0 : terminal.hashCode());
		result = prime * result + position;
		result = prime * result + ((rule == null) ? 0 : rule.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RuleState other = (RuleState) obj;
		if (terminal == null) {
			if (other.terminal != null)
				return false;
		} else if (!terminal.equals(other.terminal))
			return false;
		if (position != other.position)
			return false;
		if (rule == null) {
			if (other.rule != null)
				return false;
		} else if (!rule.equals(other.rule))
			return false;
		return true;
	}

	@Override
	public int compareTo(RuleState rs) {
		int c = this.rule.compareTo(rs.rule);
		if(c == 0) {
			c = (this.position - rs.position);
		}
		if(c == 0) {
			c = this.terminal.compareTo(rs.terminal);
		}
		
		return c;
	}
	
	
}
