package hu.csega.virtual.space;

import static hu.csega.virtual.space.UploadData.RESOURCES_LIST_FILENAME;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import hu.csega.data.batcher.DataConnection;
import hu.csega.encryption.DecryptedContent;
import hu.csega.moap.FileUtil;

public class DownloadData {

	public static void fullDownload(DownloadLogger logger) {
		File downloadDirectory = new File("download");

		try {
			if(!downloadDirectory.exists()) {
				downloadDirectory.mkdirs();
			}
		} catch (Exception ex) {
			logger.warning("Couldn't create " + downloadDirectory.getAbsolutePath());
			ex.printStackTrace();
			return;
		}

		String resourcesListFileName = "download/" + RESOURCES_LIST_FILENAME;

		try {
			byte[] resourceListBytes = load(null, "/" + RESOURCES_LIST_FILENAME, RESOURCES_LIST_FILENAME, logger);
			FileUtil.writeFileBytes(resourcesListFileName, resourceListBytes);
		} catch (IOException ex) {
			logger.warning("Couldn't write " + resourcesListFileName);
			ex.printStackTrace();
			return;
		}

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
				continue;
			}

			try {
				byte[] loadedBytes = load(null, path, file, logger);
				FileUtil.writeFileBytes("download/" + file, loadedBytes);
			} catch (IOException ex) {
				logger.warning("Could not download file: " + item);
				ex.printStackTrace();
				continue;
			}
		}

	}

	public static byte[] load(HttpServletResponse response, String path, String filename, DownloadLogger logger) throws IOException {
		try {

			DecryptedContent page = DataConnection.INSTANCE.load(path);
			byte[] bytes = page.asBytes();

			if(response != null) {
				String contentType = page.getContentType();
				response.setHeader("Content-type", contentType);

				try (OutputStream stream = response.getOutputStream()) {
					stream.write(bytes);
				}
			}

			if(logger != null) {
				logger.log(filename, path);
			}

			return bytes;

		} catch(Exception ex) {
			ex.printStackTrace();
			if(logger != null) {
				logger.warning("Exception thrown: " + ex.getMessage());
			}

			return null;
		}
	}

}
