package hu.csega.toolshed.parser.preprocessor.helper;

import java.util.ArrayList;
import java.util.List;

import hu.csega.toolshed.parser.preprocessor.impl.ExpressionWithPositions;

public class UnprocessedText extends ExpressionWithPositions {

	private List<String> content;

	public static UnprocessedText of(String source) {
		List<String> content = new ArrayList<>();
		String tmp = source, line;
		int index;

		while((index = tmp.indexOf('\n')) >= 0) {
			if(index > 0) {
				line = tmp.substring(0, index);
				while(line.length() > 0 && line.endsWith("\r")) {
					if(line.length() == 1)
						line = "";
					else
						line = line.substring(0, line.length() - 1);
				}

			} else {
				line = "";
			}

			content.add(line);

			if(index < line.length() - 1)
				tmp = line.substring(index + 1);
			else
				tmp = "";
		}

		if(tmp.length() > 0)
			content.add(tmp);

		return new UnprocessedText(content);
	}

	public static UnprocessedText of(List<String> content) {
		return new UnprocessedText(content);
	}

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
