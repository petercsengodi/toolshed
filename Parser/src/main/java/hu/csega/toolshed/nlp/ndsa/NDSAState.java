package hu.csega.toolshed.nlp.ndsa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NDSAState {

	/** Null means it's not a terminal state. */
	public String terminalWord;

	/** ASCII 0 character means it's a transition on error. */
	public Map<Character, List<NDSATransition>> transitions = new HashMap<>();
}
