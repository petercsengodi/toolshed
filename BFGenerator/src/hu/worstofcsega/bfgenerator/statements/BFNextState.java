package hu.worstofcsega.bfgenerator.statements;

public class BFNextState extends BFCmd {
	
	int state;
	
	@Override
	protected String generateStart() {
		return "<<<<<<+" + 
			">>>>>" + (new String(new char[state]).replace("\0", "+"))
			+ ">";
	}

	@Override
	protected String generateEnd() {
		return null;
	}

}
