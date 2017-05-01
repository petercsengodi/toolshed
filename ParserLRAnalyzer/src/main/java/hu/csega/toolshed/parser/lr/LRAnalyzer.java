package hu.csega.toolshed.parser.lr;

import hu.csega.toolshed.parser.lr.oo.analyzer.Node;
import hu.csega.toolshed.parser.lr.oo.formulas.FormulaBook;
import hu.csega.units.DefaultImplementation;
import hu.csega.units.Unit;

import java.util.List;

@Unit
@DefaultImplementation(LRAnalyzerImpl.class)
public interface LRAnalyzer {

	Node buildTree(FormulaBook formulaBook, List<Node> converted);

}
