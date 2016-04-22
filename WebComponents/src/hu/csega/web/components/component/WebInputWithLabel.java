package hu.csega.web.components.component;

public abstract class WebInputWithLabel extends WebInput {

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	private String label;
}
