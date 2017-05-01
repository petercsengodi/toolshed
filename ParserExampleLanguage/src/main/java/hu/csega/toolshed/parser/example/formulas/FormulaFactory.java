package hu.csega.toolshed.parser.example.formulas;

import java.util.Set;
import java.util.TreeSet;

import hu.csega.toolshed.parser.lr.oo.formulas.Formula;
import hu.csega.toolshed.parser.lr.oo.formulas.FormulaBook;
import hu.csega.toolshed.parser.lr.oo.formulas.FormulaUtil;
import hu.csega.toolshed.parser.lr.oo.formulas.NonTerminal;
import hu.csega.toolshed.parser.lr.oo.formulas.Terminal;

public class FormulaFactory {

	public static final FormulaBook formulaBook = new FormulaBook();

	public static final Set<Terminal> terminals = new TreeSet<Terminal>();
	
	public static final Set<NonTerminal> nonTerminals = new TreeSet<NonTerminal>();

	public static final Terminal assignment = new TerminalAssignment(); // = 
	public static final Terminal or = new TerminalOr(); // || |
	public static final Terminal xor = new TerminalXor(); // ^ 
	public static final Terminal and = new TerminalAnd(); // && &
	public static final Terminal equality = new TerminalEquality(); // == !=
	public static final Terminal relation = new TerminalRelation(); // < > <= >=
	public static final Terminal addition = new TerminalAddition(); // + -
	public static final Terminal multiplication = new TerminalMultiplication(); // * / %
	public static final Terminal urinary = new TerminalUrinary(); // ++expr --expr  ! | addition
	public static final Terminal constant = new TerminalConstant();
	public static final Terminal openParenthesis = new TerminalOpenParenthesis(); // (
	public static final Terminal closeParenthesis = new TerminalCloseParenthesis(); // )
	
	public static final NonTerminal opAssignment = new NonTerminalAssignment();
	public static final NonTerminal opOr = new NonTerminalOr();
	public static final NonTerminal opXor = new NonTerminalXor();
	public static final NonTerminal opAnd = new NonTerminalAnd();
	public static final NonTerminal opEquality = new NonTerminalEquality();
	public static final NonTerminal opRelation = new NonTerminalRelation();
	public static final NonTerminal opAddition = new NonTerminalAddition();
	public static final NonTerminal opMultiplication = new NonTerminalMultiplication();
	public static final NonTerminal opUrinary = new NonTerminalUrinary();
	public static final NonTerminal opConstant = new NonTerminalConstant();
	
	static {
		terminals.add(assignment);
		terminals.add(or);
		terminals.add(xor);
		terminals.add(and);
		terminals.add(equality);
		terminals.add(relation);
		terminals.add(addition);
		terminals.add(multiplication);
		terminals.add(urinary);
		terminals.add(constant);
		terminals.add(openParenthesis);
		terminals.add(closeParenthesis);

		nonTerminals.add(opAssignment);
		nonTerminals.add(opOr);
		nonTerminals.add(opXor);
		nonTerminals.add(opAnd);
		nonTerminals.add(opEquality);
		nonTerminals.add(opRelation);
		nonTerminals.add(opAddition);
		nonTerminals.add(opMultiplication);
		nonTerminals.add(opUrinary);
		nonTerminals.add(opConstant);
		
		formulaBook.add(new Formula(FormulaUtil.UNIVERSE, opAssignment));
		formulaBook.add(new Formula(opAssignment, opAssignment, assignment, opOr));
		formulaBook.add(new Formula(opAssignment, opOr));
		formulaBook.add(new Formula(opOr, opXor, or, opOr));
		formulaBook.add(new Formula(opOr, opXor));
		formulaBook.add(new Formula(opXor, opAnd, xor, opXor));
		formulaBook.add(new Formula(opXor, opAnd));
		formulaBook.add(new Formula(opAnd, opEquality, and, opAnd));
		formulaBook.add(new Formula(opAnd, opEquality));
		formulaBook.add(new Formula(opEquality, opEquality, equality, opRelation));
		formulaBook.add(new Formula(opEquality, opRelation));
		formulaBook.add(new Formula(opRelation, opRelation, relation, opAddition));
		formulaBook.add(new Formula(opRelation, opAddition));
		formulaBook.add(new Formula(opAddition, opMultiplication, addition, opAddition));
		formulaBook.add(new Formula(opAddition, opMultiplication));
		formulaBook.add(new Formula(opMultiplication, opUrinary, multiplication, opMultiplication));
		formulaBook.add(new Formula(opMultiplication, opUrinary));
		formulaBook.add(new Formula(opUrinary, urinary, opConstant));
		formulaBook.add(new Formula(opUrinary, addition, opConstant));
		formulaBook.add(new Formula(opUrinary, opConstant));
		formulaBook.add(new Formula(opConstant, constant));
		formulaBook.add(new Formula(opConstant, openParenthesis, opAssignment, closeParenthesis));
	}
	
}
