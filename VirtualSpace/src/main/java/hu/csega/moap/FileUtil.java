package hu.csega.moap;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileUtil {

	public static byte[] readFileBytes(String filename) throws IOException {
		File file = new File(filename);
		FileInputStream fis = new FileInputStream(file);
		byte[] data = new byte[(int) file.length()];
		fis.read(data);
		fis.close();
		return data;
	}

}
