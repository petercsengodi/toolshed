package hu.csega.web.components.common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DummyTemplate {

	public DummyTemplate(String content) {
		this.content = content;
	}

	public DummyTemplate(Class<?> neighborClass, String fileName) {
		try {
			URI uri = neighborClass.getResource(fileName).toURI();
			File file = new File(uri);
			FileInputStream fis = new FileInputStream(file);
			byte[] data = new byte[(int) file.length()];
			fis.read(data);
			fis.close();
			content = new String(data, "UTF-8");
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	public String getContent() {
		return content;
	}

	@Override
	public String toString() {
		return content;
	}

	public static List<String> readList(Class<?> neighborClass, String fileName) {
		List<String> ret = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(neighborClass.getResourceAsStream(fileName)))) {
			String line;
			while((line = reader.readLine()) != null)
				ret.add(line);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}

		return ret;
	}

	public void variable(String varName, Object value) {
		String varPattern = "\\#\\#"+varName+"\\#\\#";
		content = content.replaceAll(varPattern, str(value));
	}

	public void forEach(String listName, String varName, List<?> values) {
		if(values == null || values.isEmpty()) {
			return;
		}

		Pattern startPattern = Pattern.compile("\\<\\!--\\s*for\\:"+listName+"\\s*--\\>");
		Pattern endPattern = Pattern.compile("\\<\\!--\\s*\\/for\\:"+listName+"\\s*--\\>");
		String varPattern = "\\#\\#"+varName+"\\#\\#";

		while(true) {

			Integer startStartPos = null;
			Integer startEndPos = null;
			Integer endStartPos = null;
			Integer endEndPos = null;

			Matcher startMatcher = startPattern.matcher(content);
			if(startMatcher.find()) {
				startStartPos = startMatcher.start();
				startEndPos = startMatcher.end();
			}

			Matcher endMatcher = endPattern.matcher(content);
			if(endMatcher.find()) {
				endStartPos = endMatcher.start();
				endEndPos = endMatcher.end();
			}

			if(startStartPos == null || startEndPos == null || endStartPos == null || endEndPos == null ||
					startEndPos < endStartPos) {
				break;
			}

			String prefix = content.substring(0, startStartPos);
			String subTemplate = content.substring(startEndPos, endStartPos);
			String suffix = content.substring(endEndPos);

			StringBuilder builder = new StringBuilder(prefix);

			for(Object o : values) {
				builder.append(subTemplate.replaceAll(varPattern, str(o)));
			}

			content = builder.append(suffix).toString();
		}
	}

	public void forEach(String listName, List<?> values) {
		if(values == null || values.isEmpty()) {
			return;
		}

		Pattern startPattern = Pattern.compile("\\<\\!--\\s*for\\:"+listName+"\\s*--\\>");
		Pattern endPattern = Pattern.compile("\\<\\!--\\s*\\/for\\:"+listName+"\\s*--\\>");
		Pattern varPattern = Pattern.compile("\\#\\#([a-zA-Z0-9_]*)\\#\\#");

		while(true) {

			Integer startStartPos = null;
			Integer startEndPos = null;
			Integer endStartPos = null;
			Integer endEndPos = null;

			Matcher startMatcher = startPattern.matcher(content);
			if(startMatcher.find()) {
				startStartPos = startMatcher.start();
				startEndPos = startMatcher.end();
			}

			Matcher endMatcher = endPattern.matcher(content);
			if(endMatcher.find()) {
				endStartPos = endMatcher.start();
				endEndPos = endMatcher.end();
			}

			if(startStartPos == null || startEndPos == null || endStartPos == null || endEndPos == null ||
					endStartPos < startEndPos) {
				break;
			}

			String prefix = content.substring(0, startStartPos);
			String subTemplate = content.substring(startEndPos, endStartPos);
			String suffix = content.substring(endEndPos);

			StringBuilder builder = new StringBuilder(prefix);

			for(Object o : values) {
				if(o == null) {
					continue;
				}

				Class<?> c = o.getClass();
				Method[] ms = c.getMethods();
				int pos = 0;

				Matcher varMatcher = varPattern.matcher(subTemplate);
				while(varMatcher.find()) {
					String v = varMatcher.group(1);
					String isV = "is" + v;
					String getV = "get" + v;

					for(Method m : ms) {
						if(m.getTypeParameters() != null && m.getTypeParameters().length > 0) {
							return;
						}

						if(m.getName().equalsIgnoreCase(isV) || m.getName().equalsIgnoreCase(getV)) {
							builder.append(subTemplate.substring(pos, varMatcher.start()));
							try {
								builder.append(str(m.invoke(o)));
							} catch(Exception ex) {
								ex.printStackTrace();
							}

							pos = varMatcher.end();
							break;
						}
					}

				} // end while varMatcher find

				if(pos < subTemplate.length()) {
					builder.append(subTemplate.substring(pos));
				}
			} // end for o

			content = builder.append(suffix).toString();
		}
	}

	private String str(Object o) {
		return (o == null ? "" : o.toString());
	}

	private String content;
}
