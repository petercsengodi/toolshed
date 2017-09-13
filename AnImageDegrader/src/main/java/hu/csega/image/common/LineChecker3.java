package hu.csega.image.common;

public class LineChecker3 {

	private boolean horizontal, vertical, leftOrAboveFromLine, cachedValue;
	private double m, C, borderX, borderY;

	private int cachedLastY = Integer.MIN_VALUE; // to avoid multiplication in many cases

	public void loadLine(int x1, int y1, int x2, int y2, double sx, double sy) {
		if(y1 == y2) {
			this.horizontal = true;
			this.vertical = false;
			this.borderY = y1;
			this.leftOrAboveFromLine = (sy <= y1);
		} else if(x1 == x2) {
			this.horizontal = false;
			this.vertical = true;
			this.borderX = x1;
			this.leftOrAboveFromLine = (sx <= x1);
		} else {
			this.horizontal = false;
			this.vertical = false;
			this.m = (x2 - x1) / (double)(y2 - y1);
			this.C = x1 - this.m * y1;
			this.leftOrAboveFromLine = (sx < m*sy + C);
		}
	}

	public void moveToY(int y) {
		if(horizontal) {
			cachedValue = (leftOrAboveFromLine ? y <= borderY : y >= borderY);
		} else if(vertical) {
			// nothing
		} else {
			if(cachedLastY == y - 1) {
				borderX += m;
				cachedLastY++;
			} else {
				borderX = y*m + C;
				cachedLastY = y;
			}
		}
	}

	public boolean isOnTheSameSideAsReferenceValue(int x) {
		if(horizontal) {
			return cachedValue;
		} else { // generic + vertical
			return (leftOrAboveFromLine ? x <= borderX : x >= borderX);
		}
	}
}
