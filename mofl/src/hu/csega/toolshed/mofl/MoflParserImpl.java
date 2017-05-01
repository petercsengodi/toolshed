package hu.csega.toolshed.mofl;

import hu.csega.toolshed.loser1.LoseR1;
import hu.csega.toolshed.loser1oo.analyzer.Node;
import hu.csega.toolshed.loser1oo.formulas.FormulaBook;
import hu.csega.toolshed.mofl.converters.SimpleParserConverter;
import hu.csega.toolshed.mofl.formulas.FormulaFactory;
import hu.csega.toolshed.parser.preprocessor.SimpleParser;
import hu.csega.toolshed.parser.preprocessor.helper.ExpressionWithPositions;
import hu.csega.toolshed.parser.preprocessor.helper.UnprocessedText;
import hu.csega.toolshed.parser.preprocessor.impl.PreProcessorException;
import hu.csega.units.AbstractUnit;
import hu.csega.units.Unit;

import java.util.List;

public class MoflParserImpl extends AbstractUnit implements MoflParser {

	@Unit
	public void setSimpleParser(SimpleParser simpleParser) {
		this.simpleParser = simpleParser;
	}

	@Unit
	public void setLoseR1(LoseR1 loseR1) {
		this.loseR1 = loseR1;
	}
	
	@Override
	public Node parse(UnprocessedText text) throws PreProcessorException {
		List<ExpressionWithPositions> parsedText = simpleParser.parseText(text);
		
		SimpleParserConverter converter = new SimpleParserConverter(text);
		List<Node> converted = converter.convertFromSimpleParserExpressions(parsedText);
		
		FormulaBook formulaBook = FormulaFactory.formulaBook;
		Node rootNode = loseR1.buildTree(formulaBook, converted);
		
		return rootNode;
	}
	
	private SimpleParser simpleParser;
	private LoseR1 loseR1;
}
