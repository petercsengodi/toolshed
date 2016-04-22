package hu.csega.web.components.servlets;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.Set;

public class GenerateEnumeration {

	public static void main(String[] args) throws Exception {
		String currentDir = System.getProperty("user.dir");
		File dir = new File(currentDir);
		while(!"XternalDummy".equals(dir.getName())) {
			dir = new File(dir.getParent());
		}

		System.out.println(dir.getPath());

		WebXmlParser webXmlParser = new WebXmlParser(GenerateEnumeration.class.getClassLoader());
		webXmlParser.parse(currentDir + "/war/WEB-INF/web.xml");
		Map<Class<?>, Set<String>> urls = webXmlParser.getUrls();

		String fn = dir.getPath() + "/src/hu/skawa/dummy/web/servlets/Servlet.java";
		try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(fn))) {
			writer.write("package hu.skawa.dummy.web.servlets;\n\npublic enum Servlet {\n");
			boolean first = true;

			for(Map.Entry<Class<?>, Set<String>> entry : urls.entrySet()) {
				Class<?> servletClass = entry.getKey();
				if(servletClass == null)
					continue;

				if(first)
					first = false;
				else
					writer.write(",\n");

				writer.write("\t");
				writer.write(toUppercase(servletClass.getSimpleName()));
				writer.write("(\"");
				writer.write(entry.getValue().iterator().next());
				writer.write("\")");
			}

			writer.write(";\n\n");
			writer.flush();

			writer.write("\tprivate Servlet(String url) {\n");
			writer.write("\t\tthis.url = url;\n");
			writer.write("\t}\n\n");

			writer.write("\tpublic String getUrl() {\n");
			writer.write("\t\treturn url;\n");
			writer.write("\t}\n\n");

			writer.write("\tprivate String url;\n");
			writer.write("}");
		}
	}

	private static String toUppercase(String simpleName) {
		StringBuffer buffer = new StringBuffer();

		for(int i = 0; i < simpleName.length(); i++) {
			char c = simpleName.charAt(i);
			if(i > 0 && Character.isUpperCase(c) &&  i < simpleName.length() - 1 &&
					!Character.isUpperCase(simpleName.charAt(i - 1)) && Character.isLowerCase(simpleName.charAt(i + 1))) {
				buffer.append('_');
			}

			buffer.append(Character.toUpperCase(c));
		}

		return buffer.toString();
	}
}
