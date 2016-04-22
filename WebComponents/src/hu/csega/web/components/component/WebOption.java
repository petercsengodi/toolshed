package hu.csega.web.components.component;

public class WebOption extends WebComponent {

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	private String value;
	private String label;
}
