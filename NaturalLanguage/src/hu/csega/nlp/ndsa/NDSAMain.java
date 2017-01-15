package hu.csega.nlp.ndsa;

import java.io.InputStreamReader;

public class NDSAMain {

	public static final NDSAAutomata automata;

	static {
		automata = new NDSAAutomata();

		NDSAState root = automata.getRoot();
		NDSAState stateAba = automata.createState("aba");
		NDSAState stateAbba = automata.createState("abba");
		NDSAState stateBaba = automata.createState("baba");
		NDSAState stateBab = automata.createState("bab");

		NDSAState state1 = automata.createState(null);
		NDSAState state2 = automata.createState(null);
		NDSAState state3 = automata.createState(null);
		NDSAState state4 = automata.createState(null);
		NDSAState state5 = automata.createState(null);
		NDSAState state6 = automata.createState(null);

		automata.createTransition(root, state1, 'a', 1.0);
		automata.createTransition(state1, state2, 'b', 1.0);
		automata.createTransition(state2, stateAba, 'a', 1.0);
		automata.createTransition(state2, state3, 'b', 1.0);
		automata.createTransition(state3, stateAbba, 'a', 1.0);
		automata.createTransition(root, state4, 'b', 1.0);
		automata.createTransition(state4, state5, 'a', 1.0);
		automata.createTransition(state5, stateBab, 'b', 0.5);
		automata.createTransition(state5, state6, 'b', 0.5);
		automata.createTransition(state6, stateBaba, 'a', 1.0);
	}

	public static void main(String[] args) throws Exception {
		try(InputStreamReader reader = new InputStreamReader(System.in)) {
			while(!automata.isFinished()) {
				int nextChar = reader.read();
				char ch = (char)nextChar;
				System.out.println("NEXT: " + (ch < 32 ? ("#" + (int)ch) : Character.valueOf(ch)));
				automata.consume(ch);
				System.out.println(automata.state());
			}
		}
	}

}
