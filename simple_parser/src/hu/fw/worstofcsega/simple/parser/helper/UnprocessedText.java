package hu.fw.worstofcsega.simple.parser.helper;

import java.util.List;

public class UnprocessedText extends ExpressionWithPositions {

	public UnprocessedText(List<String> content) {
		super(0, 0, content.size() - 1, content.get(content.size() - 1).length());
		this.content = content;
	}

	private List<String> content;
	
	public List<String> getContent() {
		return content;
	}

	public void setContent(List<String> content) {
		this.content = content;
	}
	
}
