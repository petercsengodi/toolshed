package hu.csega.toolshed.framework;

public interface ToolMessage {

	String getRequest();

	String getResponse();

	boolean isResponseProvided();

	boolean isProcessCanceled();

	boolean isProcessFinished();

	void provideRespones(String response);

	void cancelProcess();

}
