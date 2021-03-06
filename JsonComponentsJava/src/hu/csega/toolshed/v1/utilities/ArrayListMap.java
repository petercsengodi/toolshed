package hu.csega.toolshed.v1.utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayListMap<K, V> extends HashMap<K, ArrayList<V>> {

	public List<V> getOrCreate(K key) {
		ArrayList<V> list = this.get(key);
		if(list == null) {
			list = new ArrayList<>();
			this.put(key, list);
		}

		return list;
	}

	private static final long serialVersionUID = 1L;
}
