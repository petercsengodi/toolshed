package hu.worstofcsega.loser1oo.formulas;

public class Universe implements Atom {

	@Override
	public String toString() {
		return "< universe >";
	}
	
	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Universe);
	}
	
	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public int compareTo(Atom other) {
		if(other instanceof Universe) {
			return 0;
		}
		
		return -1;
	}
	
}
