package hu.csega.toolshed.framework.impl.properties;

import hu.csega.toolshed.framework.ToolProperty;

public class ExampleToolBackingBean {

	@ToolProperty("Title")
	private String title;

	@ToolProperty("Subtitle")
	private String subtitle;

	@ToolProperty("Author")
	private String author;

	@ToolProperty("Year")
	private String year;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}


}
