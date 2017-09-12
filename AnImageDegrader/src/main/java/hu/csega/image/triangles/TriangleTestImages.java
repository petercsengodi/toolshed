package hu.csega.image.triangles;

public enum TriangleTestImages {

	AUTUMN("triangles-autumn", "res/image/autumn.jpg", 800, 500),

	TIM_CURRY("triangles-tim-curry", "res/image/tim-curry.jpg", 680, 520,
			new TriangleSweetSpot(285, 18, 600, 178, 2),
			new TriangleSweetSpot(290, 10, 620, 500, 1));

	private final String populationFile;
	private final String imageFile;
	private final int width;
	private final int height;
	private final int numberOfSweetSpots;
	private final TriangleSweetSpot[] sweetSpots;

	private TriangleTestImages(String populationFile, String imageFile, int width, int height, TriangleSweetSpot... sweetSpots) {
		this.populationFile = populationFile;
		this.imageFile = imageFile;
		this.width = width;
		this.height = height;
		this.sweetSpots = sweetSpots;
		this.numberOfSweetSpots = ((sweetSpots == null || sweetSpots.length == 0) ? 0 : sweetSpots.length);
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

	public TriangleSweetSpot[] getSweetSpots() {
		return sweetSpots;
	}

	public int sweetSpotMultiplicator(int x, int y) {
		int ret = 1;

		if(numberOfSweetSpots > 0) {
			for(TriangleSweetSpot spot : sweetSpots) {
				if(spot.isInTheSweetSpot(x, y)) {
					ret += spot.getMultiplicator();
				}
			}
		}

		return ret;
	}
}
