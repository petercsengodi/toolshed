package hu.csega.web.components.component;

public class WebHtml extends WebComponent {

	public WebHtml(String html){
		this.html = html;
	}

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	private String html;
}
