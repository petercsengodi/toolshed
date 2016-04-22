package hu.csega.toolshed.loser1;

import java.util.List;

import hu.csega.toolshed.loser1oo.analyzer.Node;
import hu.csega.toolshed.loser1oo.analyzer.TreeBuilder;
import hu.csega.toolshed.loser1oo.analyzer.TreeBuilderFactory;
import hu.csega.toolshed.loser1oo.formulas.FormulaBook;
import hu.csega.units.AbstractUnit;

public class LoseR1Impl extends AbstractUnit<LoseR1Impl> implements LoseR1 {

	@Override
	public Node buildTree(FormulaBook formulaBook, List<Node> converted) {
		TreeBuilder builder = TreeBuilderFactory.createBuilder(formulaBook);
		Node rootNode = builder.build(converted);
		return rootNode;
	}
	
}
