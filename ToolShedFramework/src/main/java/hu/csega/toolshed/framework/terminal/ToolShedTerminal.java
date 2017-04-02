package hu.csega.toolshed.framework.terminal;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import hu.csega.toolshed.framework.util.PathUtil;

public class ToolShedTerminal {

	public static void main(String[] args) {
		String line;

		while(true) {
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
				while((line = reader.readLine()) != null) {
					line = line.trim();
					if("quit".equals(line) || "exit".equals(line))
						break; // user quits

					try {

						CommandList list = new CommandList();

						StringTokenizer mainCommands = new StringTokenizer(line, "|");
						while(mainCommands.hasMoreTokens()) {
							String mainCommand = mainCommands.nextToken();
							List<String> params = new ArrayList<>();

							StringTokenizer paramTokens = new StringTokenizer(mainCommand);

							if(paramTokens.hasMoreTokens()) {
								String cmd = paramTokens.nextToken();
								while (paramTokens.hasMoreTokens()) {
									params.add(paramTokens.nextToken());
								}

								Command command = new Command(cmd, params.toArray(new String[params.size()]));
								list.add(command);
							}
						}

						runCommand(list);
					} catch(IOException ex) {
						throw new RuntimeException(ex);
					} catch(Throwable t) {
						t.printStackTrace();
						// continue work
					}
				}

				break; // stream is no more
			} catch(IOException ex) {
				throw new RuntimeException(ex);
			} catch(Throwable t) {
				try {
					t.printStackTrace();
				} catch(Throwable t2) {
					// this should not happen, but in case...
				}
			}
		}
	}

	private static void runCommand(CommandList commands) throws Exception {
		String dir = PathUtil.targetFolderPath("ToolShedFramework");
		File targetFolder = new File(dir);
		URL url = targetFolder.toURI().toURL();

		String commandsSubDir = "hu.csega.toolshed.framework.terminal.commands";
		File commandsFolder = new File(dir + File.separator + commandsSubDir.replaceAll("\\.", File.separator));
		String[] possibleCommands = commandsFolder.list();

		String intfPath = "hu.csega.toolshed.framework.terminal.CommandInterface";

		Map<String, Object> allCommands = new HashMap<>();

	    try (URLClassLoader classLoader = new URLClassLoader(new URL[]{ url })) {

	    	Class<?> intfClass = classLoader.loadClass(intfPath);

	    	for(String cmd : possibleCommands) {
	    		if(cmd == null || !cmd.endsWith(".class"))
	    			continue;

	    		String className = commandsSubDir + '.' + cmd.substring(0, cmd.length() - ".class".length());
	    		Class<?> c = classLoader.loadClass(className);
	    		if(intfClass.isAssignableFrom(c)) {
	    			Object intf = c.newInstance();
	    			String commandName = (String)intf.getClass().getMethod("commandName").invoke(intf);
	    			allCommands.put(commandName, intf);
	    		}
	    	}

	    	String input = null;

 	    	for(Command cmd : commands) {
	    		Object intf = allCommands.get(cmd.getCommand());
	    		if(intf == null) {
	    			System.out.println("Command not found: " + cmd.getCommand());
	    			break;
	    		}

    			input = (String)intf.getClass().getMethod("run", String.class, String[].class).invoke(intf, input, cmd.getArgs());
	    	}

	    	if(input != null)
	    		System.out.println(input);

	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    }

	}

}
