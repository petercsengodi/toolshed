package hu.csega.image.triangles;

public class TriangleSweetSpot {

	public TriangleSweetSpot(int x1, int y1, int x2, int y2, int multiplicator) {
		this.x1 = Math.min(x1, x2);
		this.y1 = Math.min(y1, y2);
		this.x2 = Math.max(x1, x2);
		this.y2 = Math.max(y1, y2);
		this.multiplicator = multiplicator;
	}

	public boolean isInTheSweetSpot(int x, int y) {
		return (x >= x1) && (x < x2) && (y >= y1) && (y < y2);
	}

	public int getMultiplicator() {
		return multiplicator;
	}

	private final int x1;
	private final int y1;
	private final int x2;
	private final int y2;
	private final int multiplicator;
}
