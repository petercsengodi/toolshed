package hu.csega.worm;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * <pre>worm() {
 *     java -classpath ~/Documents/Projects/toolshed/ACodeWorm/bin hu.csega.worm.ExecutionRuntime ~/Documents/Projects/worm/worm.ini
 * }
 * </pre>
 */

public class ExecutionRuntime {

	public static void main(String[] args) throws Exception {

		if(args.length > 0) {
			String pathname = args[0];
			System.out.println("Reading property file: " + pathname);

			Properties props = new Properties();
			try(InputStream is = new FileInputStream(new File(pathname))) {
				props.load(is);
			}

			for(Map.Entry<Object, Object> entry : props.entrySet()) {
				String key = entry.getKey().toString();
				if(properties.containsKey(key)) {
					String value = entry.getValue().toString();
					properties.put(key, value);
				}
			}
		}

		Environment env = new Environment();
		List<String> result = env.collectFiles(properties.get(PROPERTY_SOURCE));
		System.out.println("Scanned " + result.size() + " files.");

	}

	private static final String PROPERTY_SOURCE = "src";

	private static Map<String, String> properties = new HashMap<>();

	static {
		properties.put(PROPERTY_SOURCE, "/home/csega/Documents/Projects/easyling/pagetranslate/src");
	}
}
