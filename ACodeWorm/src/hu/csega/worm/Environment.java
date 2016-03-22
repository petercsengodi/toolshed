package hu.csega.worm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Environment {

	public static final Pattern FILTER = Pattern.compile(
			".*\\/\\.$|"
			+ ".*\\/\\..$");

	public List<String> collectFiles(String rootDir) throws Exception {
		this.rootDir = rootDir;
		scan("");
		return files;
	}


	private void scan(String prefix) throws Exception {
		File dir = new File(rootDir + prefix);
		File[] directoryListing = dir.listFiles();
		if (directoryListing != null) {
			for (File child : directoryListing) {
				String fn = prefix + '/' + child.getName();
				if(FILTER.matcher(fn).matches())
					continue;

				if(child.isDirectory()) {
					scan(fn);
				} else {
					handle(fn);
				}

			}
		}
	}


	private void handle(String fn) throws Exception {
		files.add(fn.substring(1));
		System.out.println(fn.substring(1));
	}

	private List<String> files = new ArrayList<>();
	private String rootDir;
}
