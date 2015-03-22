package hu.worstofcsega.bfgenerator.statements;


public class BFWriteChar extends BFCmd {

	char c;

	@Override
	protected String generateStart() {
		int num = c;
		return "[-]" + (new String(new char[num]).replace("\0", "+")) + ".";
	}

	@Override
	protected String generateEnd() {
		return null;
	}	
	
}
