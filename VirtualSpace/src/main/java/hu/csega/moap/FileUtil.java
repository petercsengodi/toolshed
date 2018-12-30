package hu.csega.moap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

	public static byte[] readFileBytes(String filename) throws IOException {
		File file = new File(filename);
		FileInputStream fis = new FileInputStream(file);
		byte[] data = new byte[(int) file.length()];
		fis.read(data);
		fis.close();
		return data;
	}

	public static List<String> readFileLines(String filename) throws IOException {
		List<String> result = new ArrayList<>();

		File file = new File(filename);
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"))) {

			String line;
			while((line = reader.readLine()) != null) {
				result.add(line);
			}
		}

		return result;
	}

	public static void writeFileBytes(String filename, byte[] bytes) throws IOException {
		File file = new File(filename);
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(bytes);
		fos.close();
	}

}
