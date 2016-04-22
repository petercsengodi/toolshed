package hu.csega.web.components.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Files {

	public static String readFile(String name, Class<?> thisClass) throws IOException {
		try {
			URI uri = thisClass.getResource(name).toURI();
			File file = new File(uri);
			FileInputStream fis = new FileInputStream(file);
			byte[] data = new byte[(int) file.length()];
			fis.read(data);
			fis.close();
			return new String(data, "UTF-8");
		} catch(URISyntaxException ex) {
			throw new IOException(ex);
		}
	}
}
