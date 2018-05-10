package hu.csega.toolshed.parser.lr.oo.formulas;

public class Formula implements Comparable<Formula> {

	public Atom from;
	public Molecule to;

	public Formula() {
		this.from = FormulaUtil.UNIVERSE;
		this.to = FormulaUtil.VACUUM_MOLECULE;
 	}

	public Formula(Atom from, Molecule to) {
		this.from = from;
		this.to = to;
	}

	public Formula(Atom from, Atom... toAtom) {
		this.from = from;
		this.to = new Molecule(toAtom);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(from.toString());
		builder.append(FormulaUtil.RULE_MARKER);
		builder.append(to);
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
		Formula other = (Formula) obj;
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
	public int compareTo(Formula other) {
		int c = this.from.compareTo(other.from);
		if(c != 0 ) {
			return c;
		}

		c = this.to.compareTo(other.to);
		return c;
	}

}
