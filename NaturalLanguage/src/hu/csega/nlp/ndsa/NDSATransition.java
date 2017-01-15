package hu.csega.nlp.ndsa;

public class NDSATransition {

	/** ASCII 0 character means it's a transition on error. */
	public char onCharacter;
	public NDSAState state;
	public double percentage;
}
