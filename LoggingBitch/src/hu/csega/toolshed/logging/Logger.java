package hu.csega.toolshed.logging;

public interface Logger {

	public void trace(String string);

	public void debug(String string);

	public void info(String string);

	public void warning(String string);

	public void error(String string);

	public boolean traceShown();
	
	public boolean debugShown();
	
	public boolean infoShown();
	
	public boolean warningShown();
	
	public boolean errorShown();
	
}
