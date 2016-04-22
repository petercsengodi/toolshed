package hu.csega.toolshed.mofl;

import hu.csega.toolshed.loser1oo.analyzer.Node;
import hu.csega.toolshed.simple.parser.helper.UnprocessedText;
import hu.csega.toolshed.simple.parser.preprocessor.PreProcessorException;
import hu.csega.units.DefaultImplementation;
import hu.csega.units.Unit;

@Unit
@DefaultImplementation(MoflParserImpl.class)
public interface MoflParser {

	Node parse(UnprocessedText text) throws PreProcessorException;

}
