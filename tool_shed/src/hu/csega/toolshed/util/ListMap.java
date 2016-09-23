package hu.csega.toolshed.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListMap<K, V> {
	private HashMap<K, List<V>> map = new HashMap<K, List<V>>();
	
	public void add(K key, V value) {
		List<V> list = getList(key);
		list.add(value);
	}
	
	public List<V> getList(K key) {
		List<V> list = map.get(key);
		if(list == null) {
			list = new ArrayList<V>();
			map.put(key, list);
		}
		
		return list;
	}
	
	public void removeKey(K key) {
		map.remove(key);
	}
	
	public void removeValue(K key, V value) {
		List<V> list = map.get(key);
		list.remove(value);
	}
	
	public void clear() {
		map.clear();
	}
}
