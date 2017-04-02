package hu.csega.toolshed.framework.terminal.commands;

import hu.csega.toolshed.framework.terminal.CommandInterface;

public class TerminalInfoCommand implements CommandInterface {

	@Override
	public String commandName() {
		return "info";
	}

	@Override
	public String run(String input, String[] params) {
		return "info 1";
	}

}
