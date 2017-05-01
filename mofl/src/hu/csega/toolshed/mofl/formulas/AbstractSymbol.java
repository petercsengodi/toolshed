package hu.csega.toolshed.mofl.formulas;

import hu.csega.toolshed.parser.lr.oo.formulas.Atom;

public abstract class AbstractSymbol implements Atom, Comparable<Atom> {
	
	public int compareTo(Atom o) {
		if(o instanceof AbstractSymbol) {
			return this.getClass().getName().compareTo(o.getClass().getName());
		} else {
			return -o.compareTo(this);
		}
	}
	
	@Override
	public boolean equals(Object obj) {
		return (obj.getClass().equals(this.getClass()));
	}
	
	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
