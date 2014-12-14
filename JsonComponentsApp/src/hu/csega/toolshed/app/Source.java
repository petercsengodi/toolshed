package hu.csega.toolshed.app;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Source {
	
	public static final boolean CACHE = false;

	public static enum ContentType {
		HTML("text/html"), JS("text/javascript");
		
		private String value;
		
		private ContentType(String value) {
			this.value = value;
		}
		
		public String val() {
			return value;
		}
	}
	
	private String cache = null;
	
	public String getSource() throws Exception {
		if (CACHE) {
			if (cache == null) {
				cache = loadSource();
			}

			return cache;
		} else {
			return loadSource();
		}
	}
	
	private String loadSource() throws Exception {
		String sourceFileName = getSourceFileName();
		InputStream stream = this.getClass().getResourceAsStream(sourceFileName);
		BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

		String line;
		StringBuilder builder = new StringBuilder();
		while ((line = reader.readLine()) != null) {
			builder.append(line);
			builder.append("\r\n");
		}

		return builder.toString();
	}
	
	protected String getSourceFileName() {
		return this.getClass().getSimpleName().toLowerCase() + ".html";
	}
	
	protected ContentType getContentType() {
		String sourceFileName = getSourceFileName();

		if(sourceFileName.endsWith(".html")){
			return ContentType.HTML;
		}
			
		if(sourceFileName.endsWith(".js")){
			return ContentType.JS;
		}
			
		throw new RuntimeException("Unknown content type of: " + sourceFileName);
	}
}
