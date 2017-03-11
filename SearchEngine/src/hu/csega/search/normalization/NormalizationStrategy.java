package hu.csega.search.normalization;

import java.util.Set;

/**
 * Normalizer tasks:
 * <ul>
 * 	<li>Simplify white-spaces.</li>
 * 	<li>Remove HTML tags.</li>
 *  <li>Sort(?) words.</li>
 *  <li>Filter too small words.</li>
 *  <li>Map special characters / accents to normal english letters.</li>
 * </ul>
 */
public interface NormalizationStrategy {

	Set<String> normalizeForSearchEngine(String original);

}
