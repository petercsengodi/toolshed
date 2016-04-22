package hu.csega.web.components.component;

import hu.csega.web.components.servlets.Servlet;

public class WebForm extends WebContainer {

	public Servlet getServlet() {
		return servlet;
	}

	public WebForm setServlet(Servlet servlet) {
		this.servlet = servlet;
		return this;
	}

	public String getAction() {
		return action;
	}

	public WebForm setAction(String action) {
		this.action = action;
		return this;
	}

	public WebMethod getMethod() {
		return method;
	}

	public WebForm setMethod(WebMethod method) {
		this.method = method;
		return this;
	}

	public WebForm addInputField(String label, String name, Object value) {
		WebField component = new WebField();
		component.setLabel(label);
		component.setName(name);
		component.setValue((value == null ? null : value.toString()));
		addComponent(component);
		return this;
	}

	public WebForm addHiddenField(String name, Object value) {
		WebHiddenField component = new WebHiddenField();
		component.setName(name);
		component.setValue((value == null ? null : value.toString()));
		addComponent(component);
		return this;
	}

	public WebForm button(String label, String value) {
		WebButton button = new WebButton();
		button.setType("submit");
		button.setLabel(label);
		button.setValue(value);
		addComponent(button);
		return this;
	}

	private Servlet servlet;
	private String action;
	private WebMethod method = WebMethod.POST;
}
