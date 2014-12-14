package hu.csega.toolshed.app;

import hu.csega.toolshed.app.sandbox.JQuery;
import hu.csega.toolshed.app.sandbox.Sandbox;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class Server {
	
	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		ServerSocket server = new ServerSocket(18080);

		String url = "http://localhost:18080/";
		Desktop desktop = Desktop.getDesktop();
		desktop.browse(new URI(url));
		
		Sandbox sandbox = new Sandbox();
		JQuery jquery = new JQuery();
		Source source = sandbox;

		while (true) {
			Socket conn = server.accept();
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			// don't use buffered writer because we need to write both "text"
			// and
			// "binary"
			OutputStream out = conn.getOutputStream();
			int count = 0;
			while (true) {
				count++;
				String line = reader.readLine();
				if (line == null) {
					System.out.println("Connection closed");
					out.close();
					reader.close();
					break;
				}

				System.out.println("" + count + ": " + line);
				
				if(line.startsWith("GET ")) {
					String request = line.substring(4);
					int index = request.indexOf(' ');
					if(index > -1) {
						request = request.substring(0, index);
					}
					
					if(request.equals("/jquery")) {
						source = jquery;
					} else {
						source = sandbox;
					}
				}
				
				if (line.equals("")) {
					System.out.println("Writing response...");

					String statusLine = "HTTP/1.1 200 OK\r\n";
					out.write(statusLine.getBytes(StandardCharsets.UTF_8));

					byte[] response = source.getSource().getBytes(StandardCharsets.UTF_8);

					String contentLength = "Content-Length: " + response.length + "\r\n";
					out.write(contentLength.getBytes(StandardCharsets.UTF_8));

					String contentType = "Content-Type: " + source.getContentType().val() + "; charset=utf-8\r\n";
					out.write(contentType.getBytes(StandardCharsets.UTF_8));
					
					for(String header : HEADERS) {
						String h = header + "\r\n";
						out.write(h.getBytes(StandardCharsets.UTF_8));
					}
					
					// signal end of headers
					out.write("\r\n".getBytes(StandardCharsets.UTF_8));

					// write actual response and flush
					out.write(response);
					out.flush();
				}
			}
		}

	}
	
	private static final List<String> HEADERS = Arrays.asList(
			"Cache-control: no-cache",
			"Cache-control: no-store",
			"Pragma: no-cache",
			"Expires: 0");

}
