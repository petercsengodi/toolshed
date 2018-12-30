package hu.csega.virtual.space;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import hu.csega.data.batcher.DataConnection;
import hu.csega.moap.FileUtil;

public class UploadData {

	public static final String RESOURCES_LIST_FILENAME = "resources.list";

	public static final Map<String, String> CONTENT_TYPES = new HashMap<>();

	static {
		CONTENT_TYPES.put("text", "text/plain; charset=utf-8");
		CONTENT_TYPES.put("html", "text/html; charset=utf-8");
		CONTENT_TYPES.put("css", "text/css; charset=utf-8");
		CONTENT_TYPES.put("js", "application/javascript; charset=utf-8");
		CONTENT_TYPES.put("json", "application/json; charset=utf-8");
		CONTENT_TYPES.put("jpg", "image/jpg");
		CONTENT_TYPES.put("png", "image/png");
	}

	public static void main(String[] args) {
		list(new SystemOutUploadLogger());
	}

	public static void list(UploadLogger logger) {
		String textContentType = CONTENT_TYPES.get("text");
		send(RESOURCES_LIST_FILENAME, "/" + RESOURCES_LIST_FILENAME, textContentType, logger);

		String resourcesListFileName = "content/" + RESOURCES_LIST_FILENAME;
		List<String> list;

		try {
			list = FileUtil.readFileLines(resourcesListFileName);
		} catch (IOException ex) {
			logger.warning("Couldn't load " + resourcesListFileName);
			ex.printStackTrace();
			return;
		}

		for(String item : list) {
			if(item == null || item.length() == 0) {
				continue;
			}

			item = item.trim();
			if(item.length() == 0 || item.charAt(0) == '#') {
				continue;
			}

			String file;
			String path;

			try {
				JSONObject json = new JSONObject(item);
				file = json.getString("file");
				path = json.getString("path");
			} catch (JSONException e) {
				logger.warning("Line has invalid format: " + item);
				return;
			}

			String extension = null;
			int index = file.lastIndexOf(".");
			if(index > -1) {
				extension = file.substring(index + 1);
			}

			String contentType = null;
			if(extension != null) {
				contentType = CONTENT_TYPES.get(extension);
				if(contentType == null) {
					logger.warning("Couldn't find content type for extension: " + extension + " for file: " + file);
					contentType = textContentType;
				}
			} else {
				logger.warning("File without extension: " + file);
				contentType = textContentType;
			}

			send(file, path, contentType, logger);
		}

	}

	private static void send(String filename, String path, String contentType, UploadLogger logger) {
		try {
			byte[] bytes = FileUtil.readFileBytes("content/" + filename);
			DataConnection.INSTANCE.store(path, contentType, bytes);
			logger.log(filename, path, contentType);
		} catch(Exception ex) {
			throw new RuntimeException("Error when sending path: " + path);
		}
	}

}
