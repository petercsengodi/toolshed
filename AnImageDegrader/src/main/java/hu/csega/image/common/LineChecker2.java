package hu.csega.image.common;

public class LineChecker2 {

	private double m, C;
	private boolean horizontal, vertical, leftOrAboveFromLine, cachedValue;
	private double borderX, borderY;

	private int cachedLastY = Integer.MIN_VALUE; // to avoid multiplication in many cases

	public void loadLine(double x1, double y1, double x2, double y2, double sx, double sy) {
		double dx = x2 - x1;
		double dy = y2 - y1;
		if(Math.abs(dy) < TriangleChecker.ERROR) {
			this.horizontal = true;
			this.vertical = false;
			borderY = y1;
			leftOrAboveFromLine = (sy <= y1);
		} else if(Math.abs(dx) < TriangleChecker.ERROR) {
			this.horizontal = false;
			this.vertical = true;
			borderX = x1;
			leftOrAboveFromLine = (sx <= x1);
		} else {
			this.horizontal = false;
			this.vertical = false;
			this.m = dx / dy;
			this.C = x1 - this.m * y1;

			double borderS = m*sy + C;
			leftOrAboveFromLine = (sx < borderS);
		}
	}

	public void moveToY(double y) {
		if(horizontal) {
			cachedValue = (leftOrAboveFromLine ? y <= borderY : y >= borderY);
		} else if(vertical) {
			// nothing
		} else {
			int yy = (int)y;
			if(cachedLastY + 1 == yy) {
				borderX += m;
			} else {
				borderX = y*m + C;
			}
			cachedLastY = yy;
		}
	}

	public boolean isOnTheSameSideAsReferenceValue(double x) {
		if(horizontal) {
			return cachedValue;
		} else { // generic + vertical
			return (leftOrAboveFromLine ? x <= borderX : x >= borderX);
		}
	}
}
