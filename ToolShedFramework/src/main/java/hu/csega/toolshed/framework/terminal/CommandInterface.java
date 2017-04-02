package hu.csega.toolshed.framework.terminal;

public interface CommandInterface {

	String commandName();
	String run(String input, String[] params);

}
