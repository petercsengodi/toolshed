package hu.csega.toolshed.framework.components;

public class ToolShedComponentResponse<T> implements ToolShedErrorDataCarrier {

	private T result;
	private ToolShedErrorData errorData;

	public ToolShedComponentResponse(T result) {
		this.result = result;
	}

	public ToolShedComponentResponse(ToolShedErrorData errorData) {
		this.errorData = errorData;
	}

	public boolean successful() {
		return errorData == null;
	}

	@Override
	public ToolShedErrorData getErrorData() {
		return errorData;
	}

	public T getResult() {
		return result;
	}

}
