package hu.csega.image.degrader;

public enum DegraderTestImages {

	AUTUMN_80("degrade-autumn-80", "res/image/autumn.jpg", 80, 80);

	private final String populationFile;
	private final String imageFile;
	private final int width;
	private final int height;

	private DegraderTestImages(String populationFile, String imageFile, int width, int height) {
		this.populationFile = populationFile;
		this.imageFile = imageFile;
		this.width = width;
		this.height = height;
	}

	public String getPopulationFile() {
		return populationFile;
	}

	public String getImageFile() {
		return imageFile;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
