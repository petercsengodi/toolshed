package hu.csega.toolshed.framework.components;

public class ToolShedUnexpectedException extends RuntimeException implements ToolShedErrorDataCarrier {

	private ToolShedErrorData errorData = null;

	public ToolShedUnexpectedException(ToolShedErrorData errorData) {
		super(errorData.getMessage());
		this.errorData = errorData;
	}

	public ToolShedUnexpectedException(ToolShedErrorData errorData, Throwable cause) {
		super(errorData.getMessage(), cause);
		this.errorData = errorData;
	}

	@Override
	public ToolShedErrorData getErrorData() {
		return errorData;
	}

	private static final long serialVersionUID = 1L;

}
