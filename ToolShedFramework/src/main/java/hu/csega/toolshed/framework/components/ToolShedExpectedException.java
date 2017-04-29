package hu.csega.toolshed.framework.components;

public class ToolShedExpectedException extends Exception implements ToolShedErrorDataCarrier {

	private ToolShedErrorData errorData = null;

	public ToolShedExpectedException(ToolShedErrorData errorData) {
		super(errorData.getMessage());
		this.errorData = errorData;
	}

	public ToolShedExpectedException(ToolShedErrorData errorData, Throwable cause) {
		super(errorData.getMessage(), cause);
		this.errorData = errorData;
	}

	@Override
	public ToolShedErrorData getErrorData() {
		return errorData;
	}

	private static final long serialVersionUID = 1L;

}
