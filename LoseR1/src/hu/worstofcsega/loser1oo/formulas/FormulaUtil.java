package hu.worstofcsega.loser1oo.formulas;

public class FormulaUtil {

	public static final Universe UNIVERSE = new Universe();
	public static final Vacuum VACUUM = new Vacuum();
	
	public static final Molecule UNIVERSE_MOLECULE = new Molecule(UNIVERSE);
	public static final Molecule VACUUM_MOLECULE = new Molecule(VACUUM);
	public static final Molecule EMPTY_MOLECULE = new Molecule();

	public static final String POSITION_MARKER = " ° ";
	public static final String ATOM_SEPARATOR = " | ";
	public static final String RULE_MARKER = " -> ";
	
	public static boolean isNonTerminal(Atom atom) {
		return (atom instanceof NonTerminal);
	}

	public static boolean isTerminal(Atom atom) {
		return (atom instanceof Terminal);
	}
	
	public static Molecule applyRule(Molecule startingMolecule, Formula rule) {
		if(startingMolecule.size() == 0) {
			return null;
		}
		
		Atom a = startingMolecule.get(0);
		if(isTerminal(a)) {
			return null;
		}
		
		if(rule.from.equals(UNIVERSE)) {
			return null;
		}
		
		// at this point it can only be a NonTerminal
		NonTerminal nonTerminal = (NonTerminal)rule.from;
		if(!a.equals(nonTerminal)) {
			return null;
		}
		
		if(startingMolecule.size() == 1) {
			return rule.to;
		} else {
			Molecule ret = new Molecule(rule.to); 
			ret.addAll(startingMolecule.subList(1, startingMolecule.size()));
			return ret;
		}
	}

}
