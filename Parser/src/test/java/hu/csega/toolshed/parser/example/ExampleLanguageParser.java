package hu.csega.toolshed.parser.example;

import hu.csega.toolshed.parser.lr.oo.analyzer.Node;
import hu.csega.toolshed.parser.preprocessor.helper.UnprocessedText;
import hu.csega.toolshed.parser.preprocessor.impl.PreProcessorException;
import hu.csega.units.DefaultImplementation;
import hu.csega.units.Unit;

@Unit
@DefaultImplementation(ExampleLanguageParserImpl.class)
public interface ExampleLanguageParser {

	Node parse(UnprocessedText text) throws PreProcessorException;

}
