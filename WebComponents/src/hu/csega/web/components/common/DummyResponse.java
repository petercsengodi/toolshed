package hu.csega.web.components.common;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DummyResponse {

	public enum ResponseType {
		HTML_PAGE("text/html; charset=UTF-8"),
		HTML_SNIPPET("text/html; charset=UTF-8"),
		XML("text/xml; charset=UTF-8"),
		PLAIN("text/plain; charset=UTF-8"),
		JSON("application/json; charset=UTF-8"),
		BYTES("application/octet-stream"),
		REDIRECT("text/plain; charset=UTF-8");

		private ResponseType(String contentType) {
			this.contentType = contentType;
		}

		public String getContentType() {
			return contentType;
		}

		private String contentType;
	}

	public DummyResponse() {
		responseType = ResponseType.HTML_PAGE;
		stream = new ByteArrayOutputStream();
	}

	public ResponseType getResponseType() {
		return responseType;
	}

	public void setResponseType(ResponseType responseType) {
		this.responseType = responseType;
	}

	public void append(String str) {
		try {
			stream.write(str.getBytes("UTF_8"));
		} catch(IOException ex) {
		}
	}

	public void append(byte[] bytes) {
		try {
			stream.write(bytes);
		} catch(IOException ex) {
		}
	}

	public void append(byte[] bytes, int off, int len) {
		stream.write(bytes, off, len);
	}

	public void append(byte b) {
		stream.write(b);
	}

	public byte[] getBytes() {
		return stream.toByteArray();
	}

	public String getString() {
		return new String(stream.toByteArray(), "UTF_8");
	}

	public List<String> getStates() {
		return states;
	}

	public void setStates(List<String> states) {
		this.states = states;
	}

	public String getCurrentState() {
		return currentState;
	}

	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}

	public String getTitle() {
		if(title == null || title.length() == 0) {
			return "Dummy services";
		}
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void addState(String state) {
		states.add(state);
	}

	public void addCurrentState(String state) {
		currentState = state;
		addState(state);
	}

	public void addCurrentStateAndTitle(String state) {
		addCurrentState(state);
		title = state;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void xml(String responseContent) {
		xml(responseContent, null);
	}

	public void xml(String responseContent, Integer code) {
		setResponseType(ResponseType.XML);

		if(code != null) {
			setCode(code);
		}

		append(responseContent);
	}

	public void json(String responseContent) {
		json(responseContent, null);
	}

	public void json(String responseContent, Integer code) {
		setResponseType(ResponseType.JSON);

		if(code != null) {
			setCode(code);
		}

		append(responseContent);
	}

	public void bytes(String responseContent) {
		bytes(responseContent, null);
	}

	public void bytes(String responseContent, Integer code) {
		setResponseType(ResponseType.BYTES);

		if(code != null) {
			setCode(code);
		}

		append(responseContent);
	}

	public void bytes(byte[] responseContent) {
		bytes(responseContent, null);
	}

	public void bytes(byte[] responseContent, Integer code) {
		setResponseType(ResponseType.BYTES);

		if(code != null) {
			setCode(code);
		}

		append(responseContent);
	}

	public void sendRedirect(String string) {
		setCode(HttpStatusCodes.STATUS_CODE_TEMPORARY_REDIRECT);
		setResponseType(ResponseType.REDIRECT);
		append(string);
	}

	private ResponseType responseType;
	private ByteArrayOutputStream stream;
	private List<String> states = new ArrayList<>();
	private String currentState;
	private String title;
	private int code = 200;
}
