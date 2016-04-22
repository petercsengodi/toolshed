package hu.csega.web.components.component;

import hu.csega.web.components.common.DummyResponse;
import hu.csega.web.components.servlets.Servlet;

public class WebRedirect implements WebResponse {

	public WebRedirect(String url) {
		this.url = url;
	}

	public WebRedirect(Servlet servlet) {
		this.servlet = servlet;
	}

	public WebRedirect(Servlet servlet, String action) {
		this.servlet = servlet;
		this.action = action;
	}

	public Servlet getServlet() {
		return servlet;
	}

	public void setServlet(Servlet servlet) {
		this.servlet = servlet;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public void respond(DummyResponse response) {
		String url = this.url;
		if(servlet != null) {
			url = servlet.getUrl();
			if(action != null)
				url += "/" + action;
		}

		response.sendRedirect(url);
	}

	private Servlet servlet;
	private String action;
	private String url;
}
