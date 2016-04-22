package hu.csega.web.components.component;

public abstract class WebInput extends WebComponent {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	private String name;
	private String value;
}
