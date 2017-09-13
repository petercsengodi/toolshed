package hu.csega.image.common;

public class LineChecker1 {

	private double m, C;
	private int referenceValue;
	private boolean almostHorizontal;

	public void loadLine(double x1, double y1, double x2, double y2, double sx, double sy) {
		double dx = x2 - x1;
		double dy = y2 - y1;
		if(Math.abs(dx) > Math.abs(dy)) {
			this.almostHorizontal = true;
			this.m = dy / dx;
			this.C = y1 - this.m * x1;
		} else {
			this.almostHorizontal = false;
			this.m = dx / dy;
			this.C = x1 - this.m * y1;
		}

		this.referenceValue = calculate(sx, sy);
	}

	public boolean isOnTheSameSideAsReferenceValue(double x, double y) {
		int v = calculate(x, y);
		return (v == 0 || v == referenceValue);
	}

	private int calculate(double x, double y) {
		double v;
		if(almostHorizontal) {
			v = (y - (m * x + C));
		} else {
			v = (x - (m * y + C));
		}

		return (v > 0 ? 1 : -1);
	}
}
