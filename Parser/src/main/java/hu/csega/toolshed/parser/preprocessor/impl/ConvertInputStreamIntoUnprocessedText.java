package hu.csega.toolshed.parser.preprocessor.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import hu.csega.toolshed.parser.preprocessor.helper.UnprocessedText;

public class ConvertInputStreamIntoUnprocessedText {

	public static UnprocessedText read(InputStream stream) {
		List<String> content = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

		String line;
		try {
			while((line = reader.readLine()) != null) {
				content.add(line);
			}
		} catch(IOException ex) {
			throw new RuntimeException();
		}

		UnprocessedText text = new UnprocessedText(content);
		return text;
	}

	public static UnprocessedText read(String text) {
		UnprocessedText ret = new UnprocessedText(Arrays.asList(text));
		return ret;
	}

}
