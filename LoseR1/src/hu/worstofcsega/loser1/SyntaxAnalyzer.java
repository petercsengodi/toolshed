package hu.worstofcsega.loser1;

import hu.worstofcsega.loser1.ActionTable.ActionTableValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SyntaxAnalyzer {

	public ActionTable actionTable;
	public JumpTable jumpTable;
	
	public SyntaxAnalyzer(ActionTable actionTable, JumpTable jumpTable) {
		this.actionTable = actionTable;
		this.jumpTable = jumpTable;
	}
	
	public List<Rule> analyze(String sentence) {
		List<Rule> ret = new ArrayList<Rule>();
		int position = 0;
		int fromIndex, toIndex;
		String symbol;
		
		Stack<String> content = new Stack<String>();
		Stack<Integer> jumpStack = new Stack<Integer>();
		jumpStack.push(0);
		
		if(sentence.length() > 0) {
			System.out.println("Analyzing:");
			
			while(true) {
				StringBuilder builder = new StringBuilder();
				builder.append("{ \"");
				if(position < sentence.length()) {
					builder.append(sentence.substring(position));
				}				
				builder.append("\", ");
				for(int i = 0; i < jumpStack.size(); i++) {
					builder.append("[");
					builder.append(jumpStack.get(i));
					builder.append("]");
					if(i < content.size()) {
						builder.append(content.get(i));
					}
				}
				builder.append(", ");
				for(int i = 0; i < ret.size(); i++) {
					builder.append("[");
					builder.append(ret.get(i));
					builder.append("]");
				}
				builder.append(" }");
				System.out.println(builder.toString());
				
				String nextTerminal = LoseR1Constants.EPSILON;
				if(position < sentence.length()) {
					nextTerminal = Character.toString(sentence.charAt(position));
				}
				
				int index = jumpStack.peek();
				ActionTableValue actionTableValue = actionTable.get(index, nextTerminal);
				String action = actionTableValue.action;
				
				switch (action) {
				case ActionTable.ACCEPT:
					ret.add(actionTableValue.rule);
					return ret;

				case ActionTable.SHIFT:
					content.push(nextTerminal);
					position++;
					
					// alter jump stack
					fromIndex = jumpStack.peek();
					symbol = content.peek();
					toIndex = jumpTable.get(fromIndex, symbol);
					jumpStack.push(toIndex);
					
					break;
	
				case ActionTable.BREAK:
					
					// break down the rule
					Rule rule = actionTableValue.rule;
					int length = rule.to.length();
					ret.add(rule);
					
					for(int i = 0; i < length; i++) {
						content.pop();
						jumpStack.pop();
					}
					
					content.push(rule.from);
					
					// alter jump stack
					fromIndex = jumpStack.peek();
					symbol = content.peek();
					toIndex = jumpTable.get(fromIndex, symbol);
					jumpStack.push(toIndex);
					
					break;
	
				case ActionTable.ERROR:
				default:
					System.out.println("Jump table indicates error!");
					throw new RuntimeException("Can't analyze further!");
				}
			}
		} else {
			System.out.println("Input is empty string, nothing to analyze!");
		}
		
		return ret;
	}
	
}
