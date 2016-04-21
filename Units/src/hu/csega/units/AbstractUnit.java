package hu.csega.units;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractUnit<UNIT, STATE extends Enum<?>> {

	public void registerStateListener(UnitStateListener<UNIT, STATE> stateListener) {
		if(listeners == null)
			listeners = new ArrayList<>();
		listeners.add(stateListener);
	}
	
	protected AbstractUnit() {
	}
	
	@SuppressWarnings("unchecked")
	protected void naturalStoppingPoint(STATE state) {
		if(listeners != null) {
			for(UnitStateListener<UNIT, STATE> listener : listeners)
				listener.onState((UNIT)this, state);
		}
	}
	
	void injectComponents() {
		Method[] methods = this.getClass().getMethods();
		for(Method method : methods) {
			Class<?>[] parameterTypes = method.getParameterTypes();
			int length = (parameterTypes == null ? 0 : parameterTypes.length);
			if(length == 0)
				continue;
			
			Unit annotation = method.getAnnotation(Unit.class);
			if(annotation != null) {
				Object[] objects = new Object[length];
				
				for(int i = 0; i < length; i++)
					objects[i] = UnitStore.createOrGetUnit(parameterTypes[i]);
				
				try {
					method.invoke(this, objects);
				} catch (InvocationTargetException | IllegalArgumentException | IllegalAccessException e) {
					throw new RuntimeException(e);
				}
			}
		}
	}
	
	private List<UnitStateListener<UNIT, STATE>> listeners;
}
