package hu.csega.virtual.space;

public class SystemOutDownloadLogger implements DownloadLogger {

	@Override
	public void log(String filename, String path) {
		System.out.println("Downloaded" + filename + " as " + path);
	}

	@Override
	public void warning(String message) {
		System.out.println("Warning: " + message);
	}

}
