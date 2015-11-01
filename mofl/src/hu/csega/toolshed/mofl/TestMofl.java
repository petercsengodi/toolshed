package hu.csega.toolshed.mofl;

import hu.csega.toolshed.logging.Level;
import hu.csega.toolshed.logging.Logger;
import hu.csega.toolshed.logging.LoggerFactory;
import hu.csega.toolshed.loser1oo.analyzer.Node;
import hu.csega.toolshed.loser1oo.analyzer.TreeBuilder;
import hu.csega.toolshed.loser1oo.analyzer.TreeBuilderFactory;
import hu.csega.toolshed.loser1oo.formulas.FormulaBook;
import hu.csega.toolshed.mofl.converters.SimpleParserConverter;
import hu.csega.toolshed.mofl.formulas.FormulaFactory;
import hu.csega.toolshed.simple.parser.helper.ExpressionWithPositions;
import hu.csega.toolshed.simple.parser.helper.UnprocessedText;
import hu.csega.toolshed.simple.parser.preprocessor.ParserUtil;

import java.util.List;

public class TestMofl {
	
	private static final Logger logger = LoggerFactory.getDefaultImplementation(TreeBuilderFactory.class);

	public static final String TEST_STRING = "12+(-23) * 2 // valami comment";
	
	public static void main(String[] args) throws Exception {
		LoggerFactory.setDefaultLevel(Level.DEBUG);
		UnprocessedText text = ParserUtil.loadString(TEST_STRING);
		List<ExpressionWithPositions> parsed = ParserUtil.parseText(text);
		SimpleParserConverter converter = new SimpleParserConverter(text);
		List<Node> converted = converter.convertFromSimpleParserExpressions(parsed);
		FormulaBook formulaBook = FormulaFactory.formulaBook;
		TreeBuilder builder = TreeBuilderFactory.createBuilder(formulaBook);
		Node rootNode = builder.build(converted);
		log(rootNode);
	}

	public static void log(Node rootNode) {
		if(logger.debugShown()) {
			StringBuilder builder = new StringBuilder();
			log(rootNode, builder);
			logger.debug(builder.toString());
		}
	}
	
	private static void log(Node node, StringBuilder builder) {
		builder.append(node);
		
		if(node.getChildren() != null && node.getChildren().size() > 0) {
			builder.append("(");
			
			boolean first = true;
			for(Node n : node.getChildren()) {
				if(first) {
					first = false;
				} else {
					builder.append(", ");
				}
				
				log(n, builder);
			}
			
			builder.append(")");
		}
	}

}
