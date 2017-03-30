package hu.csega.toolshed.framework;

public interface ITool {

	<T> T getComponent(Class<T> componentClass);

	<T> T getComponent(String name, Class<T> componentClass);

	Object getComponent(String name);

	String getTitle();

	void initialize(ToolWindow window);

	/**
	 * Override this to do any extra tasks before the application closes finally.
	 */
	void finishWork();

	ToolWindow getWindow();

	ToolMessage getMessage();

	void setMessage(ToolMessage message);

}