package hu.worstofcsega.loser1oo;

import hu.worstofcsega.logging.Logger;
import hu.worstofcsega.logging.LoggerFactory;
import hu.worstofcsega.loser1oo.analyzer.Node;
import hu.worstofcsega.loser1oo.analyzer.SyntaxAnalyzer;
import hu.worstofcsega.loser1oo.analyzer.TreeBuilder;
import hu.worstofcsega.loser1oo.formulas.Atom;
import hu.worstofcsega.loser1oo.formulas.Formula;
import hu.worstofcsega.loser1oo.formulas.FormulaBook;
import hu.worstofcsega.loser1oo.formulas.FormulaUtil;
import hu.worstofcsega.loser1oo.formulas.NonTerminal;
import hu.worstofcsega.loser1oo.formulas.Terminal;
import hu.worstofcsega.loser1oo.processing.ActionTable;
import hu.worstofcsega.loser1oo.processing.Groups;
import hu.worstofcsega.loser1oo.processing.JumpTable;
import hu.worstofcsega.loser1oo.processing.ProcessingUtil;
import hu.worstofcsega.loser1oo.processing.RuleState;
import hu.worstofcsega.loser1oo.processing.RuleStateSet;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class TestLoseR1oo_001 {
	
	private static final Logger logger = LoggerFactory.getDefaultImplementation(TestLoseR1oo_001.class);

	public static abstract class AbstractSymbol implements Atom {
		
		protected char c;
		
		public AbstractSymbol(char c) {
			this.c = c;
		}
		
		@Override
		public String toString() {
			return "< " + c + " >";
		}
		
		public int compareTo(Atom o) {
			if(o instanceof AbstractSymbol) {
				char c2 = ((AbstractSymbol)o).c;
				return Character.compare(c, c2);
			} else {
				return -o.compareTo(this);
			}
		}
		
		public String toSring() {
			return "<" + c + ">";
		}
	}
	
	public static class TestNonTerminal extends AbstractSymbol implements NonTerminal {

		public TestNonTerminal(char c) {
			super(c);
		}
	}
	
	public static class TestTerminal extends AbstractSymbol implements Terminal {

		public TestTerminal(char c) {
			super(c);
		}
	}
	
	public static void main(String[] args) {
		logger.debug("Starting application...");
		
		TestNonTerminal E = new TestNonTerminal('E');
		TestNonTerminal T = new TestNonTerminal('T');
		TestNonTerminal F = new TestNonTerminal('F');
		
		TestTerminal LETTER = new TestTerminal('a');
		TestTerminal MULTIPLY = new TestTerminal('*');
		TestTerminal ADD = new TestTerminal('+');
		TestTerminal OPEN = new TestTerminal('(');
		TestTerminal CLOSE = new TestTerminal(')');
		
		Formula base = new Formula(FormulaUtil.UNIVERSE, E);
		FormulaBook rules = FormulaBook.create(
				base,

				// the algorithm
				// can't handle rules like this
				// new Rule("E", ""),
				
				new Formula(E, T, ADD, E),
				new Formula(E, T),
				new Formula(T, F, MULTIPLY, T),
				new Formula(T, F),
				new Formula(F, OPEN, E, CLOSE),
				new Formula(F, LETTER)
				);
		
		logger.debug("Rule set:");
		logger.debug(rules.toString());

		logger.debug("Initial rule state set:");
		RuleState baseState = new RuleState(base);
		RuleStateSet tempSet = new RuleStateSet();
		tempSet.add(baseState);
		RuleStateSet baseSet = ProcessingUtil.extendRuleStateSet(tempSet, rules);
		logger.debug(baseSet.toString());
		
		JumpTable jumpTable = new JumpTable();
		
		Groups groups = new Groups();
		groups.add(baseSet);
		TreeSet<RuleStateSet> toProcess = new TreeSet<RuleStateSet>();
		toProcess.add(baseSet);
		
		while(!toProcess.isEmpty()) {
			RuleStateSet setToProcess = toProcess.first();
			toProcess.remove(setToProcess);
			
			Set<Atom> possibleNextSymbols = setToProcess.getPossibleNextSymbols();
			for(Atom nextSymbol : possibleNextSymbols) {
				logger.debug("Building: [" + setToProcess.id + "] + " + nextSymbol + ": ");
				
				RuleStateSet founders = ProcessingUtil.generateFounderRuleStates(setToProcess, nextSymbol);
				RuleStateSet newStateSet = ProcessingUtil.extendRuleStateSet(founders, rules);
				
				if(!newStateSet.isEmpty()) {
					int index = groups.indexOf(newStateSet);
					if(index == -1) {
						groups.add(newStateSet);
						toProcess.add(newStateSet);
						logger.debug("=> Not found, yet => " + newStateSet.id);
					} else {
						newStateSet = groups.get(index);
						logger.debug("=> Found => " + newStateSet.id);
					}
				}
				
				jumpTable.put(setToProcess.id, nextSymbol, newStateSet.id);
				logger.debug(newStateSet.toString());
			}
		}
		
		logger.debug(jumpTable.toString());
		
		ActionTable actionTable = ProcessingUtil.generateActionTable(groups, rules);
		logger.debug(actionTable.toString());
		
		SyntaxAnalyzer analyzer = new SyntaxAnalyzer(actionTable, jumpTable);
		List<Formula> ruleSequence = analyzer.analyze(LETTER, ADD, LETTER, MULTIPLY, LETTER);
		Collections.reverse(ruleSequence);
		
		ProcessingUtil.generateWithRules(ruleSequence);
		
		TreeBuilder builder = new TreeBuilder(actionTable, jumpTable);
		Node rootNode = builder.build(LETTER, ADD, LETTER, MULTIPLY, LETTER, MULTIPLY, LETTER);
		log(rootNode);
	}

	public static void log(Node rootNode) {
		if(LoggerFactory.debugShown()) {
			StringBuilder builder = new StringBuilder();
			log(rootNode, builder);
			logger.debug(builder.toString());
		}
	}
	
	private static void log(Node node, StringBuilder builder) {
		builder.append(node.getAtom());		
		
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
