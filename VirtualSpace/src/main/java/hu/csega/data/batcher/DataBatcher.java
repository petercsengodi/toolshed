package hu.csega.data.batcher;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

import org.json.JSONArray;
import org.json.JSONObject;

import hu.csega.data.batcher.http.JSONRequest;

public class DataBatcher {

	public static void main(String[] args) {
		JSONRequest connection = new JSONRequest();
		if (connection.authenticate()) {

			// check version
			boolean connectionSucceeded;
			{
				JSONObject request = new JSONObject();
				request.put("action", "version");
				JSONObject response = connection.send(request);

				System.out.println(response.toString(2));

				connectionSucceeded = !response.has("error");
				System.out.println("Connection succeeded: " + connectionSucceeded);
				System.out.println();
			}

			if (connectionSucceeded) {

				// ... do stuff ...

				// This is for refreshing legacy data
				// refreshPhocaGalleryData(connection);

				// Calculating new data to be written
				// convertPhocaToNewTree(connection);

				// Copying images
				// copyImages(connection);

				// Thumb nails
				createThumbnails(connection);
			}
		}
	}

	static void createThumbnails(JSONRequest connection) {
		while(true) {
			JSONObject request = new JSONObject();
			request.put("action", "gallery-thumbnails");
			JSONObject response = connection.send(request);
			System.out.println(response.toString(2));

			String status = response.optString("status");
			if("continue".equals(status)) {
				waitALittle(2_000);
				continue;
			}

			break;
		}
	}

	static void copyImages(JSONRequest connection) {
		String dataString = fileGet("data/gallery/gallery-tree.json");
		JSONObject dataJSON = new JSONObject(dataString);
		List<GalleryData> dataList = GalleryData.convertFrom(dataJSON.getJSONArray("items"));

		Map<String, GalleryData> datas = new HashMap<>();
		for(GalleryData data : dataList) {
			datas.put(data.getId(), data);
		}

		int counter = 0;
		JSONArray items = new JSONArray();

		for(GalleryData data : dataList) {
			if("C".equals(data.getType()))
				continue;

			JSONObject item = copyImage(connection, data, datas);
			items.put(item);

			if(items.length() >= 50) {
				sendCopyCommands(connection, items);
				counter += items.length();
				System.out.println("Written " + counter + " entries all together.");
				items = new JSONArray();

				waitALittle(10_000);
			}
		}

		sendCopyCommands(connection, items);
		counter += items.length();
		System.out.println("Written " + counter + " entries all together.");
		items = null;
	}

	static void waitALittle(int i) {
		try {
			Thread.sleep(i);
		} catch(Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	static void sendCopyCommands(JSONRequest connection, JSONArray items) {
		JSONObject request = new JSONObject();
		request.put("action", "gallery-copy");
		request.put("items", items);
		// System.out.println(request.toString(2));
		JSONObject response = connection.send(request);
		System.out.println(response.toString(2));
	}

	static JSONObject copyImage(JSONRequest connection, GalleryData data, Map<String, GalleryData> datas) {
		JSONArray sourceFolder = new JSONArray();
		sourceFolder.put("..");
		sourceFolder.put("images");
		sourceFolder.put("phocagallery");

		String token = null;
		StringTokenizer tokenizer = new StringTokenizer(data.getLegacyFileName(), "/");
		while(tokenizer.hasMoreTokens()) {
			if(token != null)
				sourceFolder.put(token);
			token = tokenizer.nextToken();
		}

		JSONArray targetFolder = new JSONArray();
		targetFolder.put("..");
		targetFolder.put("images");
		targetFolder.put("gallery");
		targetFolder.put(data.getSector().toLowerCase());
		collectFolders(targetFolder, data, datas);

		String originalFilename = "original-" + token;

		JSONObject item = new JSONObject();
		item.put("sourceFolder", sourceFolder);
		item.put("sourceFile", token);
		item.put("targetFolder", targetFolder);
		item.put("targetFile", originalFilename);

		StringBuilder builder = new StringBuilder();
		for(int i = 1; i < targetFolder.length(); i++) {
			builder.append(targetFolder.getString(i));
			builder.append('/');
		}

		builder.append(originalFilename);

		item.put("id", data.getId());
		item.put("link", builder.toString());

		return item;
	}

	static void collectFolders(JSONArray array, GalleryData data, Map<String, GalleryData> datas) {
		GalleryData parent = datas.get(data.getParent());
		if(parent != null) {
			collectFolders(array, parent, datas);
		}

		if("C".equals(data.getType())) {
			array.put(data.getAlias());
		}
	}

	static void convertPhocaToNewTree(JSONRequest connection) {
		// Load category data
		String categoriesString = fileGet("data/gallery/phoca-categories.json");
		JSONObject categoriesJSON = new JSONObject(categoriesString);
		List<PhocaData> categoriesList = PhocaData.convertFrom(categoriesJSON);

		Map<String, PhocaData> categories = new TreeMap<>();
		for(PhocaData category : categoriesList) {
			categories.put(category.getId(), category);
		}

		// Load image data
		String imagesString = fileGet("data/gallery/phoca-images.json");
		JSONObject imagesJSON = new JSONObject(imagesString);
		List<PhocaData> images = PhocaData.convertFrom(imagesJSON);

		// Auxiliary data for mapping category and image data
		int id = 1001;
		List<GalleryData> items = new ArrayList<>();

		// Converting categories with re-indexing
		Map<String, Integer> categoryMap = new HashMap<>();
		categoryMap.put(ALKOTASOK, 11);
		categoryMap.put(RENDEZVENYEK, 13);

		Map<String, GalleryData> categoryTree = new HashMap<>();

		for(PhocaData phoca : categories.values()) {
			String oldId = phoca.getId();
			if(ALKOTASOK.equals(oldId) || RENDEZVENYEK.equals(oldId)) {
				continue;
			}

			int itemId = id++;
			categoryMap.put(oldId, itemId);
		}

		for(PhocaData phoca : categories.values()) {
			String oldId = phoca.getId();
			if(ALKOTASOK.equals(oldId) || RENDEZVENYEK.equals(oldId)) {
				continue;
			}

			Integer itemId = categoryMap.get(oldId);
			if(itemId == null) {
				throw new RuntimeException("Id not found for: " + oldId);
			}

			String oldParent = phoca.getParent();
			Integer newParent = categoryMap.get(oldParent);
			if(newParent == null) {
				throw new RuntimeException("Parent not found for: " + oldParent);
			}

			GalleryData item = new GalleryData(phoca, itemId, newParent);

			if(ALKOTASOK.equals(oldParent)) {
				item.setSector("A");
			}

			if(RENDEZVENYEK.equals(oldParent)) {
				item.setSector("E");
			}

			item.setType("C");
			items.add(item);
			categoryTree.put(String.valueOf(itemId), item);
		}

		// Add images as well
		for(PhocaData phoca : images) {
			int itemId = id++;

			String oldParent = phoca.getParent();
			Integer newParent = categoryMap.get(oldParent);
			if(newParent == null) {
				throw new RuntimeException("Parent not found for: " + oldParent);
			}

			GalleryData item = new GalleryData(phoca, itemId, newParent);
			item.setType("I");
			items.add(item);
			categoryTree.put(String.valueOf(itemId), item);
		}

		// Recursively define sectors
		for(GalleryData item : items) {
			if(item.getSector() == null) {
				GalleryData tmp = item;
				while(tmp.getSector() == null) {
					String tmpId = tmp.getId();
					String parent = tmp.getParent();
					tmp = categoryTree.get(parent);
					if(tmp == null) {
						throw new RuntimeException("No parent for: " + tmpId + " + Missing Id: " + parent);
					}
				}

				item.setSector(tmp.getSector());
			}
		}

		for(GalleryData item : items) {
			if(item.getSector() == null) {
				throw new RuntimeException("Sector still not found for: " + item.getId());
			}
		}

		// Write semi-result into file
		JSONObject results = new JSONObject();
		results.put("items", toJSONArray(items));
		filePut("data/gallery/gallery-tree.json", results.toString(2));

		// saveInBursts(connection, items);
	}

	static void saveInBursts(JSONRequest connection, List<GalleryData> items) {
		// Save data in bursts
		List<GalleryData> burst = new ArrayList<>();
		Iterator<GalleryData> it = items.iterator();
		for(int i = 0; i < 10; i++) {
			if(!it.hasNext()) {
				break;
			}

			burst.add(it.next());
		}

		JSONObject request = new JSONObject();
		request.put("action", "gallery-put");
		request.put("items", toJSONArray(items));
		// System.out.println(request.toString(2));
		JSONObject response = connection.send(request);
		System.out.println(response.toString(2));
		burst.clear();
	}

	static JSONArray toJSONArray(List<?> items) {
		JSONArray array = new JSONArray();
		for(Object obj : items) {
			array.put(new JSONObject(obj));
		}

		return array;
	}

	static void refreshPhocaGalleryData(JSONRequest connection) {
		// download category data
		{
			JSONObject request = new JSONObject();
			request.put("action", "phoca-categories");
			JSONObject response = connection.send(request);
			filePut("data/gallery/phoca-categories.json", response.toString(2));
		}

		// download image data
		{
			JSONObject request = new JSONObject();
			request.put("action", "phoca-images");
			JSONObject response = connection.send(request);
			filePut("data/gallery/phoca-images.json", response.toString(2));
		}
	}

	static void filePut(String filename, String data) {
		byte[] dataBytes = data.getBytes(UTF8);
		try (FileOutputStream stream = new FileOutputStream(filename)) {

			stream.write(dataBytes);
			stream.flush();
			System.out.println("File written: " + filename);

		} catch(Exception ex) {
			throw new RuntimeException("Error while writing file: " + filename, ex);
		}
	}

	static String fileGet(String filename) {
		byte[] buffer = new byte[2048];
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        try(InputStream is = new FileInputStream(filename)) {
            int l = 0;
            while((l = is.read(buffer)) >= 0) {
                if(l == 0)
                    continue;

                baos.write(buffer, 0, l);
            }

        } catch(Exception ex) {
        	throw new RuntimeException("Error reading file: " + filename, ex);
        }

        byte[] bytes = baos.toByteArray();
        return new String(bytes, UTF8);
	}

	private static final String ALKOTASOK = "5";
	private static final String RENDEZVENYEK = "7";

	private static final Charset UTF8 = Charset.forName("UTF-8");
}
