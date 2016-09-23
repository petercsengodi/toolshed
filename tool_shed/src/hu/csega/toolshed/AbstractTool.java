package hu.csega.toolshed;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractTool {

	private ToolMessage message;
	private ToolWindow window;
	
	private Map<String, Object> components = new HashMap<String, Object>();
	
	protected void registerComponent(String name, Object component) {
		components.put(name, component);
	}
	
	protected void registerComponent(Class<?> componentClass, Object component) {
		String name = componentClass.getName();
		components.put(name, component);
	}
	
	protected void registerComponent(Object component) {
		String name = component.getClass().getName();
		components.put(name, component);
	}
	
	@SuppressWarnings("unchecked")
	public <T> T getComponent(Class<T> componentClass) {
		String name = componentClass.getName();
		return (T)components.get(name);
	}
	
	@SuppressWarnings("unchecked")
	public <T> T getComponent(String name, Class<T> componentClass) {
		return (T)components.get(name);
	}	
	
	public Object getComponent(String name) {
		return components.get(name);
	}	
	
	public abstract String getTitle();

	public abstract void initialize(ToolWindow window);

	/**
	 * Override this to do any extra tasks before the application closes
	 * finally.
	 */
	public void finishWork() {
		// Do nothing by default.
	}
	
	void setWindow(ToolWindow window) {
		this.window = window;
	}
	
	public ToolWindow getWindow() {
		return window;
	}
	
	public ToolMessage getMessage() {
		return message;
	}

	public void setMessage(ToolMessage message) {
		this.message = message;
	}
}
