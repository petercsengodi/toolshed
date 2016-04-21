package hu.csega.toolshed.loser1;

import hu.csega.toolshed.loser1oo.analyzer.Node;
import hu.csega.toolshed.loser1oo.formulas.FormulaBook;
import hu.csega.units.DefaultImplementation;

import java.util.List;

@DefaultImplementation(LoseR1Impl.class)
public interface LoseR1 {

	Node buildTree(FormulaBook formulaBook, List<Node> converted);
	
}
