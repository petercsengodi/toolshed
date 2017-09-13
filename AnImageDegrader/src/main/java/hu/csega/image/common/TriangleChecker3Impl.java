package hu.csega.image.common;

public class TriangleChecker3Impl implements TriangleChecker {

	private boolean initializedWithValidData = false;
	private double sx, sy, minx, miny, maxx, maxy;
	private LineChecker3 lc1 = new LineChecker3(), lc2 = new LineChecker3(), lc3 = new LineChecker3();

	@Override
	public void loadTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {

		// If either of the two points are (almost) the same, the triangle has no valid area

		if(tooNearToEachOther(x1, y1, x2, y2) || tooNearToEachOther(x2, y2, x3, y3) || tooNearToEachOther(x3, y3, x1, y1)) {
			this.initializedWithValidData = false;
			return;
		}

		// A point is inside in the triangle, if a point is on the same side
		// of all line (equations) as the weight point (sx;sy)

		this.sx = (x1 + x2 + x3) / 3.0;
		this.sy = (y1 + y2 + y3) / 3.0;

		// Remember: points here can't be too close to each other,
		// we filtered that out earlier

		this.lc1.loadLine(x1, y1, x2, y2, this.sx, this.sy);
		this.lc2.loadLine(x2, y2, x3, y3, this.sx, this.sy);
		this.lc3.loadLine(x3, y3, x1, y1, this.sx, this.sy);

		// We also build a bounding box to speed up the check
		// in really impossible cases

		this.minx = Math.min(Math.min(x1, x2), x3);
		this.miny = Math.min(Math.min(y1, y2), y3);
		this.maxx = Math.max(Math.max(x1, x2), x3);
		this.maxy = Math.max(Math.max(y1, y2), y3);

		// Okay, we successfully initialized the triangle

		this.initializedWithValidData = true;
	}

	@Override
	public void moveToY(int y) {
		if(initializedWithValidData) {
			lc1.moveToY(y);
			lc2.moveToY(y);
			lc3.moveToY(y);
		}
	}

	@Override
	public boolean inside(int x) {
		return (initializedWithValidData && lc1.isOnTheSameSideAsReferenceValue(x) && lc2.isOnTheSameSideAsReferenceValue(x) && lc3.isOnTheSameSideAsReferenceValue(x));
	}

	@Override
	public double getMinX() {
		return minx;
	}

	@Override
	public double getMinY() {
		return miny;
	}

	@Override
	public double getMaxX() {
		return maxx;
	}

	@Override
	public double getMaxY() {
		return maxy;
	}

	private static boolean tooNearToEachOther(int x1, int y1, int x2, int y2) {
		return x1 == x2 && y1 == y2;
	}
}
