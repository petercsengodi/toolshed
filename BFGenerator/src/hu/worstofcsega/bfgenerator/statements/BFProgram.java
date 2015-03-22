package hu.worstofcsega.bfgenerator.statements;

import java.util.Date;

public class BFProgram extends BFCmd {

	String author;
	String programName;
	
	public BFProgram(String author, String programName) {
		this.author = author;
		this.programName = programName;
	}

	@Override
	protected String generateStart() {
		return programName + " by " + author + " generated: " + (new Date());
	}

	@Override
	protected String generateEnd() {
		return null;
	}

}
