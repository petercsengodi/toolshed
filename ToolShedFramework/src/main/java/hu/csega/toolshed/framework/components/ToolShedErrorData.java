package hu.csega.toolshed.framework.components;

import org.json.JSONObject;

public class ToolShedErrorData {

	private String componentName;
	private String mnemonic;
	private String message;
	private String description;
	private JSONObject parameters;
	private ToolShedSeverity severity;
	private long timestamp;
	private String uniqueIdentifier;

	public ToolShedExpectedException toExpectedException() {
		return new ToolShedExpectedException(this);
	}

	public ToolShedUnexpectedException toUnexpectedException() {
		return new ToolShedUnexpectedException(this);
	}

	public String getComponentName() {
		return componentName;
	}

	public String getMnemonic() {
		return mnemonic;
	}

	public String getMessage() {
		return message;
	}

	public String getDescription() {
		return description;
	}

	public JSONObject getParameters() {
		return parameters;
	}

	public ToolShedSeverity getSeverity() {
		return severity;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public String getUniqueIdentifier() {
		return uniqueIdentifier;
	}

	ToolShedErrorData(ToolShedErrorDataBuilder builder) {

	}
}
