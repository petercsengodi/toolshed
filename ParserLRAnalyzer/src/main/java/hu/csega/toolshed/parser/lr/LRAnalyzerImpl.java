package hu.csega.toolshed.parser.lr;

import java.util.List;

import hu.csega.toolshed.parser.lr.oo.analyzer.Node;
import hu.csega.toolshed.parser.lr.oo.analyzer.TreeBuilder;
import hu.csega.toolshed.parser.lr.oo.analyzer.TreeBuilderFactory;
import hu.csega.toolshed.parser.lr.oo.formulas.FormulaBook;
import hu.csega.units.AbstractUnit;

public class LRAnalyzerImpl extends AbstractUnit implements LRAnalyzer {

	@Override
	public Node buildTree(FormulaBook formulaBook, List<Node> converted) {
		TreeBuilder builder = TreeBuilderFactory.createBuilder(formulaBook);
		Node rootNode = builder.build(converted);
		return rootNode;
	}
	
}
