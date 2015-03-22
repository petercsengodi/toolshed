package hu.worstofcsega.loser1;

public class Rule implements Comparable<Rule> {

	public String from = LoseR1Constants.UNIVERSE;
	public String to = LoseR1Constants.EPSILON;
	
	public Rule() {
	}
	
	public Rule(String from, String to) {
		this.from = from;
		this.to = to;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		if(from.equals(LoseR1Constants.UNIVERSE)) {
			builder.append("<U>");
		} else {
			builder.append(from);
		}
		
		builder.append(" -> ");
		
		if(to.equals(LoseR1Constants.EPSILON)) {
			builder.append("<e>");
		} else {
			builder.append(to);
		}
		
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		result = prime * result + ((to == null) ? 0 : to.hashCode());
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
		Rule other = (Rule) obj;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (to == null) {
			if (other.to != null)
				return false;
		} else if (!to.equals(other.to))
			return false;
		return true;
	}

	@Override
	public int compareTo(Rule r) {
		int c = this.from.compareTo(r.from);
		if(c == 0) {
			c = this.to.compareTo(r.to);
		}
		
		return c;
	}
	
}
