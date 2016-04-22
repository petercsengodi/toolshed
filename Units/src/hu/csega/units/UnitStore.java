package hu.csega.units;

import java.util.HashMap;
import java.util.Map;

public class UnitStore {

	@SuppressWarnings("unchecked")
	public static <T> T createOrGetUnit(Object parent, Class<T> unitClass) {
		synchronized (unitStoreMap) {
			try {
				
				AlwaysNew alwaysNewAnnotation = unitClass.getAnnotation(AlwaysNew.class);
				boolean alwaysNew = (alwaysNewAnnotation != null);
				if(alwaysNew)
					return createNewObjectWE(parent, unitClass);
				
				T object = (T)unitStoreMap.get(unitClass);
				
				if(object == null) {
					object = createNewObjectWE(parent, unitClass);

					unitStoreMap.put(unitClass, object);
				}
				
				return object;
			} catch (InstantiationException | IllegalAccessException e) {
				throw new RuntimeException(e);
			}
		}
	}
	
	public static <T> T createNewObject(Object parent, Class<T> unitClass) {
		try {
			T object = createNewObjectWE(parent, unitClass);
			return object;
		} catch (InstantiationException | IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}
	
	@SuppressWarnings("unchecked")
	private static <T> T createNewObjectWE(Object parent, Class<T> unitClass) throws InstantiationException, IllegalAccessException {
		Class<?> implementation = unitClass;
		DefaultImplementation annotation = unitClass.getAnnotation(DefaultImplementation.class);
		if(annotation != null && annotation.value() != null)
			implementation = annotation.value();
		
		T object = (T)implementation.newInstance();
		
		if(object instanceof AbstractUnit<?>)
			((AbstractUnit<?>)object).injectComponents(parent);
		
		return object;
	}
	
	private static Map<Class<?>, Object> unitStoreMap = new HashMap<>();
}
