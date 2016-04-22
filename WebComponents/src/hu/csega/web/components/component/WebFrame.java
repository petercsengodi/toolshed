package hu.csega.web.components.component;

import hu.csega.web.components.common.DummyResponse;
import hu.csega.web.components.common.DummyResponse.ResponseType;
import hu.csega.web.components.renderer.WebRenderer;
import hu.csega.web.components.renderer.WebRendererFactory;

import java.util.ArrayList;
import java.util.List;

public class WebFrame extends WebContainer implements WebResponse {

	public WebFrame(String title) {
		this.title = title;
	}

	public static WebFrame createWithTitleAndState(String state) {
		WebFrame frame = new WebFrame(state);
		frame.stackState("Main");
		frame.stackState(state);
		return frame;
	}

	public WebFrame stackState(String state) {
		if(states == null)
			states = new ArrayList<>();
		states.add(state);
		currentState = state;
		title = state;
		return this;
	}

	@Override
	public void respond(DummyResponse response) {
		WebRenderer renderer = WebRendererFactory.getRenderer();
		response.append(renderer.render(this));
		response.setResponseType(ResponseType.HTML_SNIPPET);
	}

	public String getTitle() {
		return title;
	}

	public WebFrame setTitle(String title) {
		this.title = title;
		return this;
	}

	public String getCurrentState() {
		return currentState;
	}

	public WebFrame setCurrentState(String currentState) {
		this.currentState = currentState;
		return this;
	}

	public List<String> getStates() {
		return states;
	}

	public WebFrame setStates(List<String> states) {
		this.states = states;
		return this;
	}

	public WebForm form() {
		WebForm webForm = new WebForm();
		addComponent(webForm);
		return webForm;
	}

	private String title;
	private String currentState;
	private List<String> states;
}
