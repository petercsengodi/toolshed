package hu.csega.toolshed.framework.terminal.commands;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import hu.csega.toolshed.framework.terminal.CommandInterface;

public class TerminalCatCommand implements CommandInterface {

	@Override
	public String commandName() {
		return "cat";
	}

	@Override
	public String run(String input, String[] params) {
		StringBuilder builder = new StringBuilder();
		String line;

		for(String p : params) {
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(p)))) {
				while((line = reader.readLine()) != null) {
					builder.append(line).append('\n');
				}
			} catch(Throwable t) {
				t.printStackTrace();
			}
		}

		return builder.toString();
	}

}
