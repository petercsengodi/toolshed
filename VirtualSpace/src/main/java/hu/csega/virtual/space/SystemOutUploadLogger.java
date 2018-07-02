package hu.csega.virtual.space;

public class SystemOutUploadLogger implements UploadLogger {

	@Override
	public void log(String filename, String path, String contentType) {
		System.out.println("Uploaded " + contentType + " / " + filename + " as " + path);
	}

}
