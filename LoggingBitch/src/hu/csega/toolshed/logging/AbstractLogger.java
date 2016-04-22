package hu.csega.toolshed.logging;

import java.util.function.Function;

public abstract class AbstractLogger implements Logger {

	private final Level level;
	private final String className;

	protected AbstractLogger(String className, Level level) {
		this.level = level;
		this.className = className;
	}

	protected abstract void print(String className, Level level, String message);

	@Override
	public void trace(Object message) {
		if(level.getSeverity() >= Level.TRACE.getSeverity())
			print(className, Level.TRACE, convert(message));
	}

	@Override
	public void debug(Object message) {
		if(level.getSeverity() >= Level.DEBUG.getSeverity())
			print(className, Level.DEBUG, convert(message));
	}

	@Override
	public void info(Object message) {
		if(level.getSeverity() >= Level.INFO.getSeverity())
			print(className, Level.INFO, convert(message));
	}

	@Override
	public void warning(Object message) {
		if(level.getSeverity() >= Level.WARNING.getSeverity())
			print(className, Level.WARNING, convert(message));
	}

	@Override
	public void error(Object message) {
		if(level.getSeverity() >= Level.ERROR.getSeverity())
			print(className, Level.ERROR, convert(message));
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

	private static final String convert(Object object) {
		return convert(object, (Object o) -> (o == null ? "null" : o.toString()));
	}

	private static final <T> T convert(Object object, Function<Object, T> method) {
		return method.apply(object);
	}
}
