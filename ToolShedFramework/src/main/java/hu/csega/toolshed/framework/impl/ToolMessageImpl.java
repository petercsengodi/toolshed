package hu.csega.toolshed.framework.impl;

import hu.csega.toolshed.framework.ToolCallback;
import hu.csega.toolshed.framework.ToolMessage;

public class ToolMessageImpl implements ToolMessage {

	private ToolCallback callback;
	private String request;
	private String response;
	private boolean responseProvided;
	private boolean processCanceled;
	private boolean processFinished;

	public ToolMessageImpl(String request, ToolCallback callback) {
		this.responseProvided = false;
		this.processCanceled = false;
		this.processFinished = true;
		this.request = request;
		this.callback = callback;
	}

	public String getRequest() {
		return request;
	}

	public synchronized String getResponse() {
		return response;
	}

	public synchronized boolean isResponseProvided() {
		return responseProvided;
	}

	public synchronized boolean isProcessCanceled() {
		return processCanceled;
	}

	public synchronized boolean isProcessFinished() {
		return processFinished;
	}

	public void provideRespones(String response) {
		registerResponse(response);
		callback.call(this);
	}

	public void cancelProcess() {
		registerNoResponse();
		callback.call(this);
	}

	private synchronized void registerResponse(String response) {
		this.response = response;
		this.responseProvided = true;
		this.processCanceled = false;
		this.processFinished = true;
	}

	private synchronized void registerNoResponse() {
		this.response = null;
		this.responseProvided = false;
		this.processCanceled = true;
		this.processFinished = true;
	}

}
