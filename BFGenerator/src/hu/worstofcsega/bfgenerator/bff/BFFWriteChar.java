package hu.worstofcsega.bfgenerator.bff;


public class BFFWriteChar extends BFFCmd {

	char c;

	@Override
	protected String generateStart() {
		int num = c;
		return "[-]" 
			+ (new String(new char[num]).replace("\0", "+"))
			+ ".[-]" + BFFProgram.comment("write character: " + c);
	}

	@Override
	protected String generateEnd() {
		return null;
	}	
	
}
