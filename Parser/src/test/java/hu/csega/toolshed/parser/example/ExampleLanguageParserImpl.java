package hu.csega.toolshed.parser.example;

import hu.csega.toolshed.parser.example.converters.SimpleParserConverter;
import hu.csega.toolshed.parser.example.formulas.FormulaFactory;
import hu.csega.toolshed.parser.lr.LRAnalyzer;
import hu.csega.toolshed.parser.lr.oo.analyzer.Node;
import hu.csega.toolshed.parser.lr.oo.formulas.FormulaBook;
import hu.csega.toolshed.parser.preprocessor.ParserToken;
import hu.csega.toolshed.parser.preprocessor.PreProcessor;
import hu.csega.toolshed.parser.preprocessor.helper.UnprocessedText;
import hu.csega.toolshed.parser.preprocessor.impl.PreProcessorException;
import hu.csega.units.AbstractUnit;
import hu.csega.units.Unit;

import java.util.List;

public class ExampleLanguageParserImpl extends AbstractUnit implements ExampleLanguageParser {

	@Unit
	public void setSimpleParser(PreProcessor simpleParser) {
		this.simpleParser = simpleParser;
	}

	@Unit
	public void setLoseR1(LRAnalyzer loseR1) {
		this.loseR1 = loseR1;
	}

	@Override
	public Node parse(UnprocessedText text) throws PreProcessorException {
		List<ParserToken> parsedText = simpleParser.parseText(text);

		SimpleParserConverter converter = new SimpleParserConverter(text);
		List<Node> converted = converter.convertFromSimpleParserExpressions(parsedText);

		FormulaBook formulaBook = FormulaFactory.formulaBook;
		Node rootNode = loseR1.buildTree(formulaBook, converted);

		return rootNode;
	}

	private PreProcessor simpleParser;
	private LRAnalyzer loseR1;
}
