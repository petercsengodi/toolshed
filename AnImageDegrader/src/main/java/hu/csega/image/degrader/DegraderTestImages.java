package hu.csega.image.degrader;

public enum DegraderTestImages {

	AUTUMN_80("degrade-autumn-80", "res/image/autumn.jpg", 80, 80, 50000),
	AUTUMN_800("degrade-autumn-800", "res/image/autumn.jpg", 800, 500, 2000),
	TIM_CURRY("degrade-tim-curry", "res/image/tim-curry.jpg", 680, 520, 3000);

	private final String populationFile;
	private final String imageFile;
	private final int width;
	private final int height;
	private final int keepValue;

	private DegraderTestImages(String populationFile, String imageFile, int width, int height, int keepValue) {
		this.populationFile = populationFile;
		this.imageFile = imageFile;
		this.width = width;
		this.height = height;
		this.keepValue = keepValue;
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

	public int getKeepValue() {
		return keepValue;
	}
}
