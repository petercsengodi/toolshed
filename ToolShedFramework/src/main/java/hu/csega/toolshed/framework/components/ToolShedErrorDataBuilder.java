package hu.csega.toolshed.framework.components;

import org.json.JSONObject;

public class ToolShedErrorDataBuilder {

	String componentName;
	String mnemonic;
	String message;
	String description;
	JSONObject parameters;
	ToolShedSeverity severity;
	long timestamp;
	String uniqueIdentifier;

	public static ToolShedErrorDataBuilder builder() {
		return new ToolShedErrorDataBuilder();
	}

	public ToolShedErrorData build() {
		return new ToolShedErrorData(this);
	}

	public ToolShedErrorDataBuilder componentName(String componentName) {
		this.componentName = componentName;
		return this;
	}

	public ToolShedErrorDataBuilder componentName(String componentName) {
		this.componentName = componentName;
		return this;
	}

	public ToolShedErrorDataBuilder componentName(String componentName) {
		this.componentName = componentName;
		return this;
	}

	public ToolShedErrorDataBuilder componentName(String componentName) {
		this.componentName = componentName;
		return this;
	}

	public ToolShedErrorDataBuilder componentName(String componentName) {
		this.componentName = componentName;
		return this;
	}

	public ToolShedErrorDataBuilder componentName(String componentName) {
		this.componentName = componentName;
		return this;
	}

	public ToolShedErrorDataBuilder componentName(String componentName) {
		this.componentName = componentName;
		return this;
	}
}
