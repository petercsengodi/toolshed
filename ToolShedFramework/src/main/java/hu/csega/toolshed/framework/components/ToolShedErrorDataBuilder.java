package hu.csega.toolshed.framework.components;

import org.json.JSONObject;

import hu.csega.toolshed.framework.util.ProcessUtil;

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

	public ToolShedErrorDataBuilder mnemonic(String mnemonic) {
		this.mnemonic = mnemonic;
		return this;
	}

	public ToolShedErrorDataBuilder message(String message) {
		this.message = message;
		return this;
	}

	public ToolShedErrorDataBuilder description(String description) {
		this.description = description;
		return this;
	}

	public ToolShedErrorDataBuilder parameters(JSONObject parameters) {
		this.parameters = parameters;
		return this;
	}

	public ToolShedErrorDataBuilder severity(ToolShedSeverity severity) {
		this.severity = severity;
		return this;
	}

	private ToolShedErrorDataBuilder() {
		this.uniqueIdentifier = ProcessUtil.generateUniqueId();
		this.timestamp = System.currentTimeMillis();
		this.severity = ToolShedSeverity.INFO;
	}
}
