package hu.csega.toolshed.logging;

public class ConsoleLogger extends AbstractLogger {

	protected ConsoleLogger(String className, Level level) {
		super(className, level);
	}

	@Override
	protected void print(String className, Level level, String message) {
		System.out.println(level.name() + " - " + className + " : " + message);
	}

}
