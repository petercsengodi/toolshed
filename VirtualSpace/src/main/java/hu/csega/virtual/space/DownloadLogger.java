package hu.csega.virtual.space;

public interface DownloadLogger {

	void log(String filename, String path);

	void warning(String message);

}
