package hu.csega.toolshed.v1.json.console;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ConsoleTokenizer {

	public boolean checkFirstWord(String input) {
		char c = input.charAt(0);
		if(!Character.isAlphabetic(c) && c != '_') {
			return false;
		}
		
		int len = input.length();
		int pos = 1;
		while(pos < len) {
			c = input.charAt(pos++);
			
			if(c == ' ') {
				break;
			}
			
			if(!Character.isAlphabetic(c) && c != '_' && !Character.isDigit(c)) {
				return false;
			}
		}
		
		return true;
	}
	
	public String[] tokenize(String input) {
//		char lastChar = 0;
//		boolean insideString = false;
//		StringBuilder builder = new StringBuilder();
//		List<String> ret = new ArrayList<String>();
//		
//		
//		for(int i = 0; i < input.length(); i++) {
//			char c = input.charAt(0);
//			
//		}
//		
//		return ret;
		
		List<String> ret = new ArrayList<String>();
		
		StringTokenizer tokenizer = new StringTokenizer(input);
		while(tokenizer.hasMoreTokens()) {
			String str = tokenizer.nextToken();
			if(str != null) {
				str = str.trim();
				if(!str.isEmpty()) {
					ret.add(str);
				}
			}
		}
		
		return ret.toArray(new String[ret.size()]);
	}
	
}
