package hu.csega.virtual.space;

import hu.csega.data.batcher.DataConnection;
import hu.csega.moap.FileUtil;

public class UploadData {

	public static final String HTML = "text/html; charset=utf-8";
	public static final String CSS = "text/css; charset=utf-8";
	public static final String JS = "application/javascript; charset=utf-8";
	public static final String JSON = "application/json; charset=utf-8";
	public static final String JPG = "image/jpg";
	public static final String PNG = "image/png";

	public static void main(String[] args) {
		list(new SystemOutUploadLogger());
	}

	public static void list(UploadLogger logger) {
		send("index.html", "/", HTML, logger);
		send("ship.jpg", "/ship.jpg", JPG, logger);
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
