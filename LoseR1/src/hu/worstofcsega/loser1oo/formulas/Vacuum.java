package hu.worstofcsega.loser1oo.formulas;

public class Vacuum implements Terminal {

	@Override
	public String toString() {
		return "< vacuum >";
	}
	
	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Vacuum);
	}
	
	@Override
	public int hashCode() {
		return 0;
	}

	@Override
	public int compareTo(Atom other) {
		if(other instanceof Vacuum) {
			return 0;
		}
		
		return 1;
	}

	
}
