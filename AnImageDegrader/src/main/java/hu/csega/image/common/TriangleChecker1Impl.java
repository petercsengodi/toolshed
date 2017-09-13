package hu.csega.image.common;

public class TriangleChecker1Impl implements TriangleChecker {

	private boolean initializedWithValidData = false;
	private double sx, sy, minx, miny, maxx, maxy;
	private LineChecker1 lc1 = new LineChecker1(), lc2 = new LineChecker1(), lc3 = new LineChecker1();

	@Override
	public void loadTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		double d;

		// If either of the two points are (almost) the same, the triangle has no valid area

		d = distanceSquare(x1, y1, x2, y2);
		if(d < ERROR) {
			this.initializedWithValidData = false;
			return;
		}

		d = distanceSquare(x2, y2, x3, y3);
		if(d < ERROR) {
			this.initializedWithValidData = false;
			return;
		}

		d = distanceSquare(x3, y3, x1, y1);
		if(d < ERROR) {
			this.initializedWithValidData = false;
			return;
		}

		// A point is inside in the triangle, if a point is on the same side
		// of all line (equations) as the weight point (sx;sy)

		this.sx = (x1 + x2 + x3) / 3.0;
		this.sy = (y1 + y2 + y3) / 3.0;

		this.lc1.loadLine(x1, y1, x2, y2, this.sx, this.sy);
		this.lc2.loadLine(x2, y2, x3, y3, this.sx, this.sy);
		this.lc3.loadLine(x3, y3, x1, y1, this.sx, this.sy);

		// We also build a bounding box to speed up the check
		// in really impossible cases

		this.minx = Math.min(Math.min(x1, x2), x3);
		this.miny = Math.min(Math.min(y1, y2), y3);
		this.maxx = Math.max(Math.max(x1, x2), x3);
		this.maxy = Math.max(Math.max(y1, y2), y3);

		this.initializedWithValidData = true;
	}

	@Override
	public boolean inside(double x, double y) {
		// 1. check if object is initialized well
		if(!initializedWithValidData)
			return false;

		// 2. check if point is out of the binding box
		if(x < minx || x > maxx || y < miny || y > maxy){
			return false;
		}

		// 3. check if point is on the same side of all line (equations)
		// as the weight point (sx;sy)

		if(!lc1.isOnTheSameSideAsReferenceValue(x, y)) {
			return false;
		}

		if(!lc2.isOnTheSameSideAsReferenceValue(x, y)) {
			return false;
		}

		if(!lc3.isOnTheSameSideAsReferenceValue(x, y)) {
			return false;
		}

		// 4. all right, point is inside the triangle
		return true;
	}

	private static double distanceSquare(double x1, double y1, double x2, double y2) {
		double dx = x2 - x1;
		double dy = y2 - y1;
		return (dx*dx) + (dy*dy);
	}
}
