package hu.csega.nlp.ndsa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class NDSAAutomata {

	public NDSAAutomata() {
		root = new NDSAState();
		states.add(root);
		clearWalkers();
	}

	public NDSAState getRoot() {
		return root;
	}

	public NDSAState createState(String terminalWord) {
		NDSAState state = new NDSAState();
		state.terminalWord = terminalWord;

		states.add(state);
		return state;
	}

	public NDSATransition createTransition(NDSAState from, NDSAState to, char onCharacter, double percentage) {
		assert(0.0 <= percentage && percentage <= 1.0);

		NDSATransition transition = new NDSATransition();
		transition.percentage = percentage;
		transition.onCharacter = onCharacter;
		transition.state = to;

		Character trigger = Character.valueOf(onCharacter);
		Map<Character, List<NDSATransition>> transitionMap = from.transitions;

		List<NDSATransition> transitions = transitionMap.get(trigger);
		if(transitions == null) {
			transitions = new ArrayList<>();
			transitionMap.put(trigger, transitions);
		}

		transitions.add(transition);
		return transition;
	}

	public void consume(char nextCharacter) {
		if(finished)
			throw new RuntimeException("Invalid state.");

		if(!addWalkers.isEmpty())
			addWalkers.clear();

		if(nextCharacter == '\n') {
			finished = true;
			return;
		}

		Character nextElement = Character.valueOf(nextCharacter);

		Iterator<NDSAWalker> it = walkers.iterator();
		while(it.hasNext()) {
			NDSAWalker walker = it.next();
			NDSAState state = walker.currentState;
			List<NDSATransition> transitions = state.transitions.get(nextElement);

			if(transitions == null || transitions.isEmpty()) {
				// error branch in automata
				it.remove();
			} else {

				int size = transitions.size();
				int index = 0;

				for(NDSATransition transition : transitions) {
					index++;
					NDSAWalker walkerToModify;

					if(index == size) {
						// don't need to clone (the original one, not the modified)
						walkerToModify = walker;
					} else {
						// need to clone

						try {
							walkerToModify = walker.clone();
						} catch (CloneNotSupportedException e) {
							throw new RuntimeException(e);
						}

						addWalkers.add(walkerToModify);
					}

					walkerToModify.addCharacter(nextCharacter);

					NDSAState nextState = transition.state;
					if(nextState.terminalWord != null) {
						walkerToModify.addWord(nextState.terminalWord);
						nextState = root;
					}

					walkerToModify.currentState = nextState;
				} // end for transition

			}

		} // end while it

		walkers.addAll(addWalkers);
		addWalkers.clear();
	}

	public String state() {
		if(finished)
			return finals();

		if(walkers.isEmpty())
			return "No variants. All possibilities ended up on error state.";

		StringBuilder builder = new StringBuilder("Current variants:");

		for(NDSAWalker walker : walkers) {
			builder.append('\n').append(walker.builder.toString());
		}

		return builder.toString();
	}

	public String finals() {
		if(walkers.isEmpty())
			return "No solution.";

		boolean solutionFound = false;
		StringBuilder builder = new StringBuilder("Solutions:");

		for(NDSAWalker walker : walkers) {
			String tmp = walker.builder.toString();
			if(tmp.endsWith("|")) {
				solutionFound = true;
				builder.append('\n').append(tmp);
			}
		}

		if(!solutionFound)
			return "No solution.";

		return builder.toString();
	}

	public void clearWalkers() {
		walkers.clear();
		addWalkers.clear();

		NDSAWalker walker = new NDSAWalker();
		walker.currentState = root;
		walkers.add(walker);

		finished = false;
	}

	public boolean isFinished() {
		return finished;
	}

	private NDSAState root;
	public List<NDSAState> states = new ArrayList<>();
	public List<NDSAWalker> walkers = new ArrayList<>();
	private List<NDSAWalker> addWalkers = new ArrayList<>();

	private boolean finished = false;

}
