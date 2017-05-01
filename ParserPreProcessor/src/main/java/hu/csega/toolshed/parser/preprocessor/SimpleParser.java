package hu.csega.toolshed.parser.preprocessor;

import hu.csega.toolshed.parser.preprocessor.helper.ExpressionWithPositions;
import hu.csega.toolshed.parser.preprocessor.helper.UnprocessedText;
import hu.csega.toolshed.parser.preprocessor.impl.PreProcessorException;
import hu.csega.units.DefaultImplementation;
import hu.csega.units.Unit;

import java.util.List;

@Unit
@DefaultImplementation(SimpleParserImpl.class)
public interface SimpleParser {

	List<ExpressionWithPositions> parseText(UnprocessedText text) throws PreProcessorException;

}
