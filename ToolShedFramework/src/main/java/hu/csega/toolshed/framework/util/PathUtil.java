package hu.csega.toolshed.framework.util;

import java.io.File;

public class PathUtil {

	public static String targetFolderPath(String projectName) {
		String projectFolder = projectFolderPath(projectName);
		String ret = projectFolder + "target" + File.separator + "classes";
		return ret;
	}

	public static String projectFolderPath(String projectName) {
		String dir = System.getProperty("user.dir") + File.separator + "bin" + File.separator;
		String lastPath = File.separator + projectName + File.separator;
		int index = dir.lastIndexOf(lastPath);
		String projectFolder = dir.substring(0, index + lastPath.length());
		return projectFolder;
	}

}
