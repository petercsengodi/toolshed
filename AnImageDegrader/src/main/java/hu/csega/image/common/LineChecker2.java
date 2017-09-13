package hu.csega.image.common;

public class LineChecker2 {

	private double m, C;
	private boolean almostHorizontal;
	private boolean higher;

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

		double v = calculate(sx, sy);
		this.higher = (v > 0);
	}

	public boolean isOnTheSameSideAsReferenceValue(double x, double y) {
		return higher ? calculate(x, y) > 0 : calculate(x, y) < 0;
	}

	private double calculate(double x, double y) {
		if(almostHorizontal) {
			return (y - (m * x + C));
		} else {
			return (x - (m * y + C));
		}
	}
}
