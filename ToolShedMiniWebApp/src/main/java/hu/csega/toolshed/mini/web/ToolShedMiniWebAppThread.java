package hu.csega.toolshed.mini.web;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import hu.csega.toolshed.logging.Logger;
import hu.csega.toolshed.logging.LoggerFactory;

public class ToolShedMiniWebAppThread extends Thread {

	private static final String HEADER_SEPARATOR = ": ";
	private static final int HEADER_SEPARATOR_LENGTH = HEADER_SEPARATOR.length();

	public static final String STORAGE_DIRECTORY = "res/mini/web";

	private Socket connectionSocket;

	public ToolShedMiniWebAppThread(Socket connectionSocket) {
		this.connectionSocket = connectionSocket;
	}

	@Override
	public void run() {
		try {

			BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
			DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());

			String line = inFromClient.readLine();
			if(line == null)
				return;

			if(line.startsWith("GET ")) {

				int index = line.indexOf(' ');
				String path = line.substring(index + 1).trim();
				index = path.indexOf(' ');
				path = path.substring(0, index);

				switch(path) {
				case "/index.html":
				case "/index.htm":
				case "/index.php":
					sendFile(outToClient, "text/html", STORAGE_DIRECTORY+"/index.html");
					break;
				case "/jquery.js":
				case "/miniweb.js":
					sendFile(outToClient, "application/javascript", STORAGE_DIRECTORY+path);
					break;
				case "/miniweb.css":
					sendFile(outToClient, "text/css", STORAGE_DIRECTORY+path);
					break;
				case "/favicon.ico":
					sendImage(outToClient, "image/x-icon", STORAGE_DIRECTORY+path);
					break;
				default:
					sendNotFound(outToClient, "No such page!");
					break;
				}


			} else if(line.startsWith("POST ")) {

				int index = line.indexOf(' ');
				String path = line.substring(index + 1).trim();
				index = path.indexOf(' ');
				path = path.substring(0, index);

				Map<String, String> headers = new HashMap<>();
				String key, value;
				JSONObject json = null;

				while((line = inFromClient.readLine()).length() > 0) {
					index = line.indexOf(HEADER_SEPARATOR);
					key = line.substring(0, index).toLowerCase();
					value = line.substring(index + HEADER_SEPARATOR_LENGTH);
					headers.put(key, value);
				}

				int contentLength = 0;
				String contentLengthValue = headers.get("content-length");
				if(contentLengthValue != null && !contentLengthValue.isEmpty()) {
					try {
						contentLength = Integer.parseInt(contentLengthValue);
					} catch(Exception ex) {
						contentLength = 0;
					}
				}

				if(contentLength > 0) {
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					for(int i = 0; i < contentLength; i++) {
						baos.write(inFromClient.read());
					}

					byte[] payload = baos.toByteArray();
					if(payload != null && payload.length > 0) {
						String payloadString = new String(payload, ToolShedMiniWebApp.CHARSET);
						json = new JSONObject(payloadString);
					}
				}

				if("/test".equals(path) && json != null) {
					sendResponse(outToClient, json.toString());
					return;
				}

				sendNotFound(outToClient, "Invalid call!");

			} else {

				sendNotFound(outToClient, "No such method allowed!");

			}

		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	private void sendFile(DataOutputStream outToClient, String contentType, String filename) throws IOException {
		String text = null;

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "UTF-8"))) {
			StringBuilder builder = new StringBuilder();

			String line;
			while((line = reader.readLine()) != null) {
				builder.append(line).append('\n');
			}

			text = builder.toString();
		}

		send(outToClient, "200 OK", contentType, text);
	}

	private void sendResponse(DataOutputStream outToClient, String text) throws IOException {
		send(outToClient, "200 OK", "text/plain", text);
	}

	private void sendJSON(DataOutputStream outToClient, String json) throws IOException {
		send(outToClient, "200 OK", "application/json", json);
	}

	private void sendNotFound(DataOutputStream outToClient, String text) throws IOException {
		send(outToClient, "404 Not Found", "text/plain", text);
	}

	private void sendError(DataOutputStream outToClient, String text) throws IOException {
		send(outToClient, "500 Internal Server Error", "text/plain", text);
	}

	private void send(DataOutputStream outToClient, String state, String contentType, String text) throws IOException {
		byte[] message = text.getBytes();
		int contentLength = message.length;

		StringBuilder headBuilder = new StringBuilder();
		headBuilder.append("HTTP/1.1 ").append(state).append('\n');
		headBuilder.append("Date: ").append(new Date()).append('\n');
		headBuilder.append("Server: ToolShed Mini WebApp").append('\n');
		headBuilder.append("Content-Length: ").append(contentLength).append('\n');
		headBuilder.append("Connection: Closed").append('\n');
		headBuilder.append("Content-Type: ").append(contentType).append("; charset=utf-8").append('\n');
		headBuilder.append("Cache-Control: no-cache, no-store, must-revalidate").append('\n');
		headBuilder.append("Pragma: no-cache").append('\n');
		headBuilder.append("Expires: 0").append('\n');
		headBuilder.append('\n');
		byte[] head = headBuilder.toString().getBytes();
		outToClient.write(head);
		outToClient.write(message);
		outToClient.flush();
		outToClient.close();
	}

	private void sendImage(DataOutputStream outToClient, String contentType, String filename) throws IOException {
		byte[] message = null;

		try (InputStream stream = new FileInputStream(filename)) {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();

			int b;
			while((b = stream.read()) > -1) {
				baos.write(b);
			}

			message = baos.toByteArray();
		}

		int contentLength = message.length;

		StringBuilder headBuilder = new StringBuilder();
		headBuilder.append("HTTP/1.1 200 OK").append('\n');
		headBuilder.append("Date: ").append(new Date()).append('\n');
		headBuilder.append("Server: ToolShed Mini WebApp").append('\n');
		headBuilder.append("Content-Length: ").append(contentLength).append('\n');
		headBuilder.append("Connection: Closed").append('\n');
		headBuilder.append("Content-Type: ").append(contentType).append("; charset=utf-8").append('\n');
		headBuilder.append("Cache-Control: no-cache, no-store, must-revalidate").append('\n');
		headBuilder.append("Pragma: no-cache").append('\n');
		headBuilder.append("Expires: 0").append('\n');
		headBuilder.append('\n');
		byte[] head = headBuilder.toString().getBytes();
		outToClient.write(head);
		outToClient.write(message);
		outToClient.flush();
		outToClient.close();
	}

	private static final Logger logger = LoggerFactory.createLogger(ToolShedMiniWebAppThread.class);
}
