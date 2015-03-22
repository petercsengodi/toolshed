package hu.worstofcsega.bfgenerator.bff;

public class BFFState extends BFFHasStateNumber {
	
	@Override
	protected String generateStart() {
		return "[>>+>>[-<<->]<<[-<<->>>>>" +
				BFFProgram.comment("start state " + stateNumber) +
				"> [>]" + BFFProgram.comment("run tape behind call stack");
	}

	@Override
	protected String generateEnd() {
		return "<[<]" + BFFProgram.comment("run to the left side of the border '1'") +
				"<<<<]<[->+<]]>[<+>-]<" + BFFProgram.comment("close state ");
	}

}
