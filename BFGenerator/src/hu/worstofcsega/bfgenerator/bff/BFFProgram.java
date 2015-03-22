package hu.worstofcsega.bfgenerator.bff;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BFFProgram extends BFFCmd {

	String author;
	String programName;
	
	static Map<String, Integer> functionNameToState = new HashMap<String, Integer>();
	static int stateCounter = 0;
	static BFFState entryPoint;
	
	public static boolean WITH_COMMENTS = true;
	
	static {
		entryPoint = new BFFState();
	}
	
	public BFFProgram(String author, String programName) {
		this.author = author;
		this.programName = programName;
		this.children.add(entryPoint);
	}

	@Override
	protected String generateStart() {
		return programName + " by " + author + " generated: " + (new Date()) + 
				'\n' + ">>>>>>>+<<<<<<<+[->+" + comment("Program start");
	}

	@Override
	protected String generateEnd() {
		return "[-]<]" + comment("Program finish");
	}

	public static String comment(String c) {
		if(WITH_COMMENTS) {
			return " // " + c + "\n";
		}
		
		return "";
	}
}
