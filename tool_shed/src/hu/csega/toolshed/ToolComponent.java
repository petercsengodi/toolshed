package hu.csega.toolshed;

public class ToolComponent {

	private AbstractTool tool;
	
	public ToolComponent(AbstractTool tool) {
		this.tool = tool;
	}
	
	protected <T> T getComponent(Class<T> componentClass) {
		return tool.getComponent(componentClass);
	}
	
	
	protected <T> T getComponent(String name, Class<T> componentClass) {
		return tool.getComponent(name, componentClass);
	}
	
	public ToolWindow getWindow() {
		return tool.getWindow();
	}
	
	public AbstractTool getTool() {
		return tool;
	}
	
}
