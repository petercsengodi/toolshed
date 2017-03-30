package hu.csega.toolshed.framework.impl;

import java.util.HashMap;
import java.util.Map;

import hu.csega.toolshed.framework.ITool;
import hu.csega.toolshed.framework.ToolMessage;
import hu.csega.toolshed.framework.ToolWindow;

public abstract class AbstractTool implements ITool {

	private ToolMessage message;
	private ToolWindow window;

	private Map<String, Object> components = new HashMap<>();

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

	@Override
	@SuppressWarnings("unchecked")
	public <T> T getComponent(Class<T> componentClass) {
		String name = componentClass.getName();
		return (T)components.get(name);
	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> T getComponent(String name, Class<T> componentClass) {
		return (T)components.get(name);
	}

	@Override
	public Object getComponent(String name) {
		return components.get(name);
	}

	/** {@inheritDoc} */
	@Override
	public void finishWork() {
		// Do nothing by default.
	}

	void setWindow(ToolWindow window) {
		this.window = window;
	}

	@Override
	public ToolWindow getWindow() {
		return window;
	}

	@Override
	public ToolMessage getMessage() {
		return message;
	}

	@Override
	public void setMessage(ToolMessage message) {
		this.message = message;
	}
}
