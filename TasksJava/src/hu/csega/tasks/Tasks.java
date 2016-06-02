package hu.csega.tasks;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import javax.json.JsonObject;

import hu.csega.toolshed.v1.json.common.JsonUtil;

public class Tasks {

	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();

		File f = new File("tasks.properties");
		if(!f.exists()) {
			System.out.println("tasks.properties wasn't found, using default settings");
			properties.setProperty("host", "http://csega.hu/tasks/json/connect.php");
		} else {

			try (InputStream stream = new FileInputStream(f)) {
				properties.load(stream);
			}

		}

		byte[] data;
		try (InputStream stream = new URL(properties.getProperty("host")).openStream()) {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();

			int b = -1;
			while((b = stream.read()) >= 0) {
				baos.write(b);
			}

			data = baos.toByteArray();
		}

		String content = new String(data, "UTF-8");
		JsonObject json = JsonUtil.readFromString(content);
		System.out.println(json);
	}

}
