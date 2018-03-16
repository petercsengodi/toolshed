package hu.csega.toolshed.parser.preprocessor.helper;

import java.util.List;

public class UnprocessedText extends ExpressionWithPositions {

	private List<String> content;

	public UnprocessedText(List<String> content) {
		super(0, 0, content.size() - 1, content.get(content.size() - 1).length());
		this.content = content;
	}

	public List<String> getContent() {
		return content;
	}

	public void setContent(List<String> content) {
		this.content = content;
	}

}
