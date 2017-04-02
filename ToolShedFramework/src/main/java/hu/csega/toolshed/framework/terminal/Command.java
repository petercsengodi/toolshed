package hu.csega.toolshed.framework.terminal;

public class Command {

	public Command(String command, String[] args) {
		this.command = command;
		this.args = args;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String[] getArgs() {
		return args;
	}

	public void setArgs(String[] args) {
		this.args = args;
	}

	private String command;
	private String[] args;
}
