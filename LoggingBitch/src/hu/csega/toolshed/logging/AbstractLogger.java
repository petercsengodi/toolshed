package hu.csega.toolshed.logging;

public abstract class AbstractLogger implements Logger {

	private final Level level;
	private final String className;
	
	protected AbstractLogger(String className, Level level) {
		this.level = level;
		this.className = className;
	}
	
	protected abstract void print(String className, Level level, String message);
	
	@Override
	public void trace(String message) {
		if(level.getSeverity() >= Level.TRACE.getSeverity())
			print(className, Level.TRACE, message);
	}

	@Override
	public void debug(String message) {
		if(level.getSeverity() >= Level.DEBUG.getSeverity())
			print(className, Level.DEBUG, message);
	}

	@Override
	public void info(String message) {
		if(level.getSeverity() >= Level.INFO.getSeverity())
			print(className, Level.INFO, message);
	}

	@Override
	public void warning(String message) {
		if(level.getSeverity() >= Level.WARNING.getSeverity())
			print(className, Level.WARNING, message);
	}

	@Override
	public void error(String message) {
		if(level.getSeverity() >= Level.ERROR.getSeverity())
			print(className, Level.ERROR, message);
	}

	@Override
	public boolean traceShown() {
		return (level.getSeverity() >= Level.TRACE.getSeverity());
	}

	@Override
	public boolean debugShown() {
		return (level.getSeverity() >= Level.DEBUG.getSeverity());
	}

	@Override
	public boolean infoShown() {
		return (level.getSeverity() >= Level.INFO.getSeverity());
	}

	@Override
	public boolean warningShown() {
		return (level.getSeverity() >= Level.WARNING.getSeverity());
	}

	@Override
	public boolean errorShown() {
		return (level.getSeverity() >= Level.ERROR.getSeverity());
	}

}
