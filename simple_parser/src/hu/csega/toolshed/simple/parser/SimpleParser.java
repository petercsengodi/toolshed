package hu.csega.toolshed.simple.parser;

import hu.csega.toolshed.simple.parser.helper.ExpressionWithPositions;
import hu.csega.toolshed.simple.parser.helper.UnprocessedText;
import hu.csega.toolshed.simple.parser.preprocessor.PreProcessorException;
import hu.csega.units.DefaultImplementation;

import java.util.List;

@DefaultImplementation(SimpleParserImpl.class)
public interface SimpleParser {

	List<ExpressionWithPositions> parseText(UnprocessedText text) throws PreProcessorException;
	
}
