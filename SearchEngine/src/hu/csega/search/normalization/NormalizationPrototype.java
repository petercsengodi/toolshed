package hu.csega.search.normalization;

import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class NormalizationPrototype implements NormalizationStrategy {

	@Override
	public Set<String> normalizeForSearchEngine(String original) {
		if(original == null) {
			return null;
		}

		original = original.trim().toLowerCase();
		if(original.isEmpty())
			return null;

		TreeSet<String> words = new TreeSet<>();


		// FIXME csega
		StringTokenizer tokenizer = new StringTokenizer(original);
		while(tokenizer.hasMoreTokens()) {
			words.add(tokenizer.nextToken());
		}

		return words;
	}

}
