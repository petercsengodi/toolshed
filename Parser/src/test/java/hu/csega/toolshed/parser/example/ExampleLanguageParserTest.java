package hu.csega.toolshed.parser.example;

import hu.csega.toolshed.logging.Level;
import hu.csega.toolshed.logging.Logger;
import hu.csega.toolshed.logging.LoggerFactory;
import hu.csega.toolshed.parser.example.ExampleLanguageParser;
import hu.csega.toolshed.parser.lr.oo.analyzer.Node;
import hu.csega.toolshed.parser.lr.oo.analyzer.TreeBuilderFactory;
import hu.csega.toolshed.parser.preprocessor.helper.UnprocessedText;
import hu.csega.toolshed.parser.preprocessor.impl.PreProcessorUtil;
import hu.csega.units.UnitStore;

import org.junit.Test;

public class ExampleLanguageParserTest {

	private static Logger logger;

	public static final String TEST_STRING = "12+(-23) * 2 // valami comment";

	@Test
	public void test() throws Exception {
		LoggerFactory.setDefaultLevel(Level.ERROR);
		logger = LoggerFactory.getDefaultImplementation(TreeBuilderFactory.class);
		UnprocessedText text = PreProcessorUtil.loadString(TEST_STRING);

		ExampleLanguageParser parser = UnitStore.instance(ExampleLanguageParser.class);
		Node rootNode = parser.parse(text);

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
