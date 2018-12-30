package hu.csega.virtual.space;

import java.io.PrintWriter;

public class PrintWriterUploadLogger implements UploadLogger {

	private PrintWriter printWriter;

	public PrintWriterUploadLogger(PrintWriter printWriter) {
		this.printWriter = printWriter;
	}

	@Override
	public void log(String filename, String path, String contentType) {
		printWriter.println("<p>Uploaded " + contentType + " / " + filename + " as " + path + "</p>");
	}

	@Override
	public void warning(String message) {
		printWriter.println("<p>Warning: " + message + "</p>");
	}

}
