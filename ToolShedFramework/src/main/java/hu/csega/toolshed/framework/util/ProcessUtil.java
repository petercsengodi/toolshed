package hu.csega.toolshed.framework.util;

import java.io.File;
import java.util.UUID;

public class ProcessUtil {

	public static String generateUniqueId() {
		return UUID.randomUUID().toString();
	}

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
