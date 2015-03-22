package hu.worstofcsega.bfgenerator.statements;

public class BFStateMachine extends BFCmd {

	@Override
	protected String generateStart() {
		return "+[->+";
	}

	@Override
	protected String generateEnd() {
		return "[-]<]";
	}

}
