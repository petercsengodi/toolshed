package hu.csega.search.util;

public class ContentAndNormalized {

	public ContentAndNormalized(String content, String normalized) {
		this.content = content;
		this.normalized = normalized;
	}

	public String getContent() {
		return content;
	}

	public String getNormalized() {
		return normalized;
	}

	private String content;
	private String normalized;
}
