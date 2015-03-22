package hu.worstofcsega.bfgenerator.bff;

public class BFFDeclareMethod extends BFFState {
	
	String methodName;
	
	@Override 
	protected String generateStart() {
		return BFFProgram.comment("*** DECLARE METHOD: " + methodName + " ***") +
				super.generateStart();
	};
	
	@Override
	protected String generateEnd() {
		return "[-]<[->+<]>" + BFFProgram.comment("pop call stack") +
				"[-<<[<]<+>>[>]>]" + BFFProgram.comment("copy value to state reference") +
				"<    " + BFFProgram.comment("one more step left needed") + 
				"<[<]" + BFFProgram.comment("run to the left side of the border '1'") +
				"<<<<<<+>>>>>>" + BFFProgram.comment("program must continue (m)") + 
				"<<<<]<[->+<]]>[<+>-]<" + BFFProgram.comment("close method (also state) ");
	}

}
