package hu.csega.units;

import java.util.HashMap;
import java.util.Map;

public class UnitStore {

	@SuppressWarnings("unchecked")
	public static <T> T createOrGetUnit(Class<T> unitClass) {
		synchronized (unitStoreMap) {
			try {
				
				T object = (T)unitStoreMap.get(unitClass);
				
				if(object == null) {
					Class<?> implementation = unitClass;
					DefaultImplementation annotation = unitClass.getAnnotation(DefaultImplementation.class);
					if(annotation != null && annotation.value() != null)
						implementation = annotation.value();
					
					object = (T)implementation.newInstance();
					
					if(object instanceof AbstractUnit<?, ?>)
						((AbstractUnit<?, ?>)object).injectComponents();

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
