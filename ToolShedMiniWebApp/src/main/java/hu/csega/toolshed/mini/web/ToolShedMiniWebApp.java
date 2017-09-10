package hu.csega.toolshed.mini.web;

import java.awt.Desktop;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.nio.charset.Charset;

import hu.csega.toolshed.logging.Logger;
import hu.csega.toolshed.logging.LoggerFactory;

public class ToolShedMiniWebApp {

	public static final int TCP_PORT = 1082;
	public static final String BROWSER_URL = "http://localhost:" + TCP_PORT + "/index.html";
	public static final Charset CHARSET = Charset.forName("UTF-8");

	public static void main(String args[]) throws Exception {
		ToolShedMiniWebApp app = new ToolShedMiniWebApp();
		app.start();
	}

	public void start() throws Exception {
		logger.info("Starting TCP/IP server on port: " + TCP_PORT);

		try(ServerSocket welcomeSocket = new ServerSocket(TCP_PORT)) {

			logger.info("Opening browser for: " + BROWSER_URL);
			if(Desktop.isDesktopSupported()) {
				Desktop.getDesktop().browse(new URI(BROWSER_URL));
			}

			logger.info("Listening...");
			while (true) {
				Socket connectionSocket = welcomeSocket.accept();
				new ToolShedMiniWebAppThread(connectionSocket).start();
			}
		}
	}

	private static final Logger logger = LoggerFactory.createLogger(ToolShedMiniWebApp.class);
}
