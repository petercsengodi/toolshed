package hu.csega.image.common;

public class TriangleChecker {

	private static final double ERROR = 0.00001;

	private boolean initialized = false;
	private double sx, sy;
	private LineChecker lc1 = new LineChecker(), lc2 = new LineChecker(), lc3 = new LineChecker();

	public void loadTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		double d;

		d = distanceSquare(x1, y1, x2, y2);
		if(d < ERROR) {
			this.initialized = false;
			return;
		}

		d = distanceSquare(x2, y2, x3, y3);
		if(d < ERROR) {
			this.initialized = false;
			return;
		}

		d = distanceSquare(x3, y3, x1, y1);
		if(d < ERROR) {
			this.initialized = false;
			return;
		}

		sx = (x1 + x2 + x3) / 3.0;
		sy = (y1 + y2 + y3) / 3.0;

		lc1.loadLine(x1, y1, x2, y2, sx, sy);
		lc2.loadLine(x2, y2, x3, y3, sx, sy);
		lc3.loadLine(x3, y3, x1, y1, sx, sy);

		this.initialized = true;
	}

	public boolean inside(double x, double y) {
		if(!initialized)
			return false;

		if(!lc1.isOnTheSameSideAsReferenceValue(x, y))
			return false;

		if(!lc2.isOnTheSameSideAsReferenceValue(x, y))
			return false;

		if(!lc3.isOnTheSameSideAsReferenceValue(x, y))
			return false;

		return true;
	}

	private static double distanceSquare(double x1, double y1, double x2, double y2) {
		double dx = x2 - x1;
		double dy = y2 - y1;
		return (dx*dx) + (dy*dy);
	}
}
