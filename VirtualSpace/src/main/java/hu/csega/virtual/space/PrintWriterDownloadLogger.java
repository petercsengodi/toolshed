package hu.csega.virtual.space;

import java.io.PrintWriter;

public class PrintWriterDownloadLogger implements DownloadLogger {

	private PrintWriter printWriter;

	public PrintWriterDownloadLogger(PrintWriter printWriter) {
		this.printWriter = printWriter;
	}

	@Override
	public void log(String filename, String path) {
		printWriter.println("<p>Downloaded " + filename + " as " + path + "</p>");
	}

	@Override
	public void warning(String message) {
		printWriter.println("<p>Warning: " + message + "</p>");
	}

}
