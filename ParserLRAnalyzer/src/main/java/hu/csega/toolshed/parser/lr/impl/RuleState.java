package hu.csega.toolshed.parser.lr.impl;

public class RuleState implements Comparable<RuleState> {

	public Rule rule;
	public int position;
	public String terminal;
	
	public RuleState(Rule rule) {
		this(rule, 0, LRAnalyzerConstants.EPSILON);
	}
	
	public RuleState(Rule rule, int position) {
		this(rule, position, LRAnalyzerConstants.EPSILON);
	}
	
	public RuleState(RuleState original) {
		this(original.rule, original.position, original.terminal);
	}
	
	public RuleState(RuleState original, String endTerminal) {
		this(original.rule, original.position, endTerminal);
	}
	
	public RuleState(Rule rule, int position, String endTerminal) {
		this.rule = rule;
		this.position = position;
		this.terminal = endTerminal;
	}

	public String getNextSymbol() {
		if(position < rule.to.length()) {
			return Character.toString(rule.to.charAt(position));
		} else {
			return LRAnalyzerConstants.EPSILON;
		}
	}
	
	public String getRemaining() {
		if(position < rule.to.length()) {
			return rule.to.substring(position);
		} else {
			return LRAnalyzerConstants.EPSILON;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		if(rule.from.equals(LRAnalyzerConstants.UNIVERSE)) {
			builder.append("<U>");
		} else {
			builder.append(rule.from);
		}
		
		builder.append(" -> ");

		for(int i = 0; i < rule.to.length(); i++) {
			if(position == i) {
				builder.append("°");
			}
			
			builder.append(rule.to.charAt(i));
		}
		
		if(position >= rule.to.length()) {
			builder.append("°");
		}
		
		builder.append(" | ");
		
		if(terminal.equals(LRAnalyzerConstants.EPSILON)) {
			builder.append("<e>");
		} else {
			builder.append(terminal);
		}
		
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
