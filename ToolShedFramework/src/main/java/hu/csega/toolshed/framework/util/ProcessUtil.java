package hu.csega.toolshed.framework.util;

import java.io.File;

public class ProcessUtil {

	public static void run(String cmd, File dir) {
		try {
			Process exec = Runtime.getRuntime().exec(cmd, null, dir);
			exec.waitFor();
			return;
		} catch (Throwable t) {
			throw new RuntimeException(t);
		}
	}

}
