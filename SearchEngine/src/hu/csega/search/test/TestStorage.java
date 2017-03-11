package hu.csega.search.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Pattern;

import hu.csega.search.normalization.NormalizationPrototype;
import hu.csega.search.normalization.NormalizationStrategy;
import hu.csega.search.util.ContentAndNormalized;

public class TestStorage {

	public List<ContentAndNormalized> search(String expression) {
		Set<String> words = strategy.normalizeForSearchEngine(expression);
		return search(words);
	}

	public List<ContentAndNormalized> search(Set<String> words) {
		String pattern = wordsToPattern(words);
		return searchByPattern(pattern);
	}

	public List<ContentAndNormalized> searchByPattern(String pattern) {
		List<ContentAndNormalized> ret = new ArrayList<>();

		Pattern compiled = Pattern.compile(pattern);

		for(Map.Entry<String, String> e : normalizedTexts.entrySet()) {
			String normalized = e.getValue();
			if(compiled.matcher(normalized).find()) {
				String key = e.getKey();
				String original = keyToOriginalContent.get(key);
				ret.add(new ContentAndNormalized(original, normalized));
			}
		}

		return ret;
	}

	public void add(String original) {
		String key = createNewId();
		keyToOriginalContent.put(key, original);
		Set<String> words = strategy.normalizeForSearchEngine(original);
		String normalized = wordsToNormalizedText(words);
		normalizedTexts.put(key, normalized);
	}

	private static final String wordsToNormalizedText(Set<String> words) {
		StringBuilder builder = new StringBuilder();
		for (String word : words) {
			builder.append('{').append(word).append("}");
		}

		return builder.toString();
	}

	private static final String wordsToPattern(Collection<String> words) {
		StringBuilder builder = new StringBuilder();

		boolean first = true;
		for(String word : words) {
			if(first)
				first = false;
			else
				builder.append(".*");

			builder.append("\\{").append(word).append("\\}");
		}

		String pattern = builder.toString();
		return pattern;
	}

	private static final String createNewId() {
		return UUID.randomUUID().toString();
	}

	private NormalizationStrategy strategy = new NormalizationPrototype();

	private Map<String, String> keyToOriginalContent = new HashMap<>();
	private Map<String, String> normalizedTexts = new HashMap<>();
}
