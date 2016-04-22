package hu.csega.web.components.component;

import hu.csega.web.components.common.DummyResponse;
import hu.csega.web.components.common.DummyResponse.ResponseType;

public class WebError implements WebResponse {

	public WebError(int code, String message) {
		this.code = code;
		this.message = message;
	}

	@Override
	public void respond(DummyResponse response) {
		response.setCode(code);
		response.append(message);
		response.setResponseType(ResponseType.PLAIN);
	}

	private int code;
	private String message;
}
