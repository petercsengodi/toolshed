package hu.csega.toolshed.util;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class SetTable<K, V> {
	private Hashtable<K, Set<V>> map = new Hashtable<K, Set<V>>();
	
	public void add(K key, V value) {
		Set<V> Set = getSet(key);
		Set.add(value);
	}
	
	public Set<V> getSet(K key) {
		Set<V> Set = map.get(key);
		if(Set == null) {
			Set = new HashSet<V>();
			map.put(key, Set);
		}
		
		return Set;
	}
	
	public void removeKey(K key) {
		map.remove(key);
	}
	
	public void removeValue(K key, V value) {
		Set<V> Set = map.get(key);
		Set.remove(value);
	}
	
	public void clear() {
		map.clear();
	}
}
