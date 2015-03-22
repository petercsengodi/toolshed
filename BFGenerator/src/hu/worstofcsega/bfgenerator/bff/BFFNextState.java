package hu.worstofcsega.bfgenerator.bff;

public class BFFNextState extends BFFCmd {
	
	int state;
	
	@Override
	protected String generateStart() {
		return generateNextState(state);
	}

    static String generateNextState(int nextState) {
		return "<[<]" + BFFProgram.comment("run back to left side of border '1'") + 
				"<<<<<<+" + BFFProgram.comment("program should be continued") +  
">>>>>" + (new String(new char[nextState]).replace("\0", "+")) +
BFFProgram.comment("set method refenrence to " + nextState) + 
">> [>]" + BFFProgram.comment("run behind call stack");
    }
	
	@Override
	protected String generateEnd() {
		return null;
	}

}
