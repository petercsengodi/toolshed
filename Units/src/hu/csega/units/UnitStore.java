package hu.csega.units;

import java.util.HashMap;
import java.util.Map;

class UnitStore {

	static <T> T createOrGetUnit(Class<T> unitClass) {
		synchronized (unitStoreMap) {
			try {
				@SuppressWarnings("unchecked")
				T object = (T)unitStoreMap.get(unitClass);
				if(object == null) {
					object = unitClass.newInstance();
					unitStoreMap.put(unitClass, object);
				}
				
				return object;
			} catch (InstantiationException | IllegalAccessException e) {
				throw new RuntimeException(e);
			}
		}
	}
	
	private static Map<Class<?>, Object> unitStoreMap = new HashMap<>();
}
