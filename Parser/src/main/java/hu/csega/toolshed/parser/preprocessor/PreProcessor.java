package hu.csega.toolshed.parser.preprocessor;

import hu.csega.toolshed.parser.preprocessor.helper.UnprocessedText;
import hu.csega.toolshed.parser.preprocessor.impl.PreProcessorException;
import hu.csega.toolshed.parser.preprocessor.impl.PreProcessorImpl;
import hu.csega.units.DefaultImplementation;
import hu.csega.units.Unit;

import java.io.InputStream;
import java.util.List;

@Unit
@DefaultImplementation(PreProcessorImpl.class)
public interface PreProcessor {

	List<ParserToken> parseText(String source) throws PreProcessorException;
	List<ParserToken> parseText(InputStream in) throws PreProcessorException;
	List<ParserToken> parseText(UnprocessedText text) throws PreProcessorException;

}
