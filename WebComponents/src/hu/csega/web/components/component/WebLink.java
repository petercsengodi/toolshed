package hu.csega.web.components.component;

import hu.csega.web.components.servlets.Servlet;

public class WebLink extends WebComponent {

	public WebLink() {
	}

	public WebLink(String text, String url) {
		this.text = text;
		this.url = url;
	}

	public WebLink(String text, String url, boolean newTab) {
		this.text = text;
		this.url = url;
		this.newTab = newTab;
	}

	public WebLink(String text, Servlet servlet) {
		this.text = text;
		this.servlet = servlet;
	}

	public WebLink(String text, Servlet servlet, boolean newTab) {
		this.text = text;
		this.servlet = servlet;
		this.newTab = newTab;
	}

	public WebLink(String text, Servlet servlet, String action) {
		this.text = text;
		this.servlet = servlet;
		this.action = action;
	}

	public WebLink(String text, Servlet servlet, String action, boolean newTab) {
		this.text = text;
		this.servlet = servlet;
		this.action = action;
		this.newTab = newTab;
	}

	public boolean isNewTab() {
		return newTab;
	}

	public void setNewTab(boolean newTab) {
		this.newTab = newTab;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	private boolean newTab;
	private String url;
	private Servlet servlet;
	private String action;
	private String text;
}
