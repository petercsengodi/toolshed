package hu.csega.web.components.component;

public class WebText extends WebComponent {

	public WebText(String text){
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	private String text;
}
