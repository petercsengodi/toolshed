package hu.csega.toolshed.parser.lr.oo.formulas;

import java.util.ArrayList;
import java.util.List;

public class Molecule extends ArrayList<Atom> implements Comparable<Molecule> {

	/**
	 * Default serial version UID.
	 */
	private static final long serialVersionUID = 1L;

	public Molecule() {
	}
	
	public Molecule(Atom... atoms) {
		for(Atom atom : atoms) {
			super.add(atom);
		}
	}

	public Molecule(List<Atom> atoms) {
		super.addAll(atoms);
	}
	
	public Molecule subMolecule(int start) {
		return subMolecule(start, this.size());
	}
	
	public Molecule subMolecule(int start, int end) {
		return new Molecule(subList(start, end));
	}
	
	@Override
	public String toString() {
		if(isEmpty()) {
			return FormulaUtil.VACUUM.toString();
		}
		
		boolean first = true;
		StringBuilder builder = new StringBuilder();
		
		for(Atom atom : this) {
			if(first) {
				first = false;
			} else {
				builder.append(FormulaUtil.ATOM_SEPARATOR);
			}
			
			builder.append(atom.toString());
		}
		
		return builder.toString();
	}

	@Override
	public int compareTo(Molecule other) {
		int index = 0;
		
		while(true) {
			if(index >= size() && index >= other.size()) {
				return 0;
			} else if(index >= size()) {
				return -1;
			} else if(index >= other.size()) {
				return 1;
			} else {
				int c = this.get(index).compareTo(other.get(index));
				if(c != 0) {
					return c;
				}
			}
			
			index++;
		}
	}

	public static Molecule concat(Molecule... molecules) {
		Molecule ret = new Molecule();
		
		for(Molecule molecule : molecules) {
			ret.addAll(molecule);
		}
		
		return ret;
	}
	
}
