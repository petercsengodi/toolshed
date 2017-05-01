package hu.csega.toolshed.parser.preprocessor;

import hu.csega.toolshed.parser.preprocessor.helper.UnprocessedText;
import hu.csega.toolshed.parser.preprocessor.impl.ConvertInputStreamIntoUnprocessedText;
import hu.csega.toolshed.parser.preprocessor.impl.PreProcessorException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class SimpleParserUtil {

	public static UnprocessedText loadFile(File file) throws PreProcessorException, IOException {
		if(!file.exists() || file.isDirectory()) {
			throw new FileNotFoundException("File can't be opened");
		}

		InputStream stream = new FileInputStream(file);
		UnprocessedText text = ConvertInputStreamIntoUnprocessedText.read(stream);
		stream.close();
		return text;
	}
	
	public static UnprocessedText loadString(String text) {
		UnprocessedText ret = ConvertInputStreamIntoUnprocessedText.read(text);
		return ret;
	}
}
