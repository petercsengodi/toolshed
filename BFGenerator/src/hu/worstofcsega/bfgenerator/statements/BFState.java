package hu.worstofcsega.bfgenerator.statements;

public class BFState extends BFCmd {
	
	@Override
	protected String generateStart() {
		return "[>>+>>[-<<->]<<[-<<->>>>>";
	}

	@Override
	protected String generateEnd() {
		return "<<<<]<[->+<]]>[<+>-]<";
	}

}
