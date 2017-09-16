package hu.csega.image.common;

public class TriangleChecker4Impl implements TriangleChecker {

	private boolean initializedWithValidData = false, okay = false;
	private double sx, sy, minx, miny, maxx, maxy;

	private boolean lc1_horizontal, lc1_vertical, lc1_leftOrAboveFromLine, lc1_cachedValue;
	private double lc1_m, lc1_C, lc1_borderX, lc1_borderY;

	private boolean lc2_horizontal, lc2_vertical, lc2_leftOrAboveFromLine, lc2_cachedValue;
	private double lc2_m, lc2_C, lc2_borderX, lc2_borderY;

	private boolean lc3_horizontal, lc3_vertical, lc3_leftOrAboveFromLine, lc3_cachedValue;
	private double lc3_m, lc3_C, lc3_borderX, lc3_borderY;

	private int lc1_cachedLastY = Integer.MIN_VALUE, lc2_cachedLastY = Integer.MIN_VALUE, lc3_cachedLastY = Integer.MIN_VALUE; // to avoid multiplication in many cases

	@Override
	public void loadTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {

		// If either of the two points are (almost) the same, the triangle has no valid area

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			this.initializedWithValidData = false;
			return;
		}

		// A point is inside in the triangle, if a point is on the same side
		// of all line (equations) as the weight point (sx;sy)

		this.sx = (x1 + x2 + x3) / 3.0;
		this.sy = (y1 + y2 + y3) / 3.0;

		// Remember: points here can't be too close to each other,
		// we filtered that out earlier

		if(y1 == y2) {
			lc1_horizontal = true;
			lc1_vertical = false;
			lc1_borderY = y1;
			lc1_leftOrAboveFromLine = (sy <= y1);
		} else if(x1 == x2) {
			lc1_horizontal = false;
			lc1_vertical = true;
			lc1_borderX = x1;
			lc1_leftOrAboveFromLine = (sx <= x1);
		} else {
			lc1_horizontal = false;
			lc1_vertical = false;
			lc1_m = (x2 - x1) / (double)(y2 - y1);
			lc1_C = x1 - this.lc1_m * y1;
			lc1_leftOrAboveFromLine = (sx < lc1_m*sy + lc1_C);
		}

		if(y2 == y3) {
			lc2_horizontal = true;
			lc2_vertical = false;
			lc2_borderY = y2;
			lc2_leftOrAboveFromLine = (sy <= y2);
		} else if(x2 == x3) {
			lc2_horizontal = false;
			lc2_vertical = true;
			lc2_borderX = x2;
			lc2_leftOrAboveFromLine = (sx <= x2);
		} else {
			lc2_horizontal = false;
			lc2_vertical = false;
			lc2_m = (x3 - x2) / (double)(y3 - y2);
			lc2_C = x2 - this.lc2_m * y2;
			lc2_leftOrAboveFromLine = (sx < lc2_m*sy + lc2_C);
		}

		if(y3 == y1) {
			lc3_horizontal = true;
			lc3_vertical = false;
			lc3_borderY = y3;
			lc3_leftOrAboveFromLine = (sy <= y3);
		} else if(x3 == x1) {
			lc3_horizontal = false;
			lc3_vertical = true;
			lc3_borderX = x3;
			lc3_leftOrAboveFromLine = (sx <= x3);
		} else {
			lc3_horizontal = false;
			lc3_vertical = false;
			lc3_m = (x1 - x3) / (double)(y1 - y3);
			lc3_C = x3 - this.lc3_m * y3;
			lc3_leftOrAboveFromLine = (sx < lc3_m*sy + lc3_C);
		}

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
			if(y < miny || y > maxy) {
				okay = false;
				return;
			}
			
			okay = true;
			if(lc1_horizontal) {
				lc1_cachedValue = (lc1_leftOrAboveFromLine ? y <= lc1_borderY : y >= lc1_borderY);
			} else if(lc1_vertical) {
				// nothing
			} else {
				if(lc1_cachedLastY == y - 1) {
					lc1_borderX += lc1_m;
					lc1_cachedLastY++;
				} else {
					lc1_borderX = y*lc1_m + lc1_C;
					lc1_cachedLastY = y;
				}
			}
			if(lc2_horizontal) {
				lc2_cachedValue = (lc2_leftOrAboveFromLine ? y <= lc2_borderY : y >= lc2_borderY);
			} else if(lc2_vertical) {
				// nothing
			} else {
				if(lc2_cachedLastY == y - 1) {
					lc2_borderX += lc2_m;
					lc2_cachedLastY++;
				} else {
					lc2_borderX = y*lc2_m + lc2_C;
					lc2_cachedLastY = y;
				}
			}
			if(lc3_horizontal) {
				lc3_cachedValue = (lc3_leftOrAboveFromLine ? y <= lc3_borderY : y >= lc3_borderY);
			} else if(lc3_vertical) {
				// nothing
			} else {
				if(lc3_cachedLastY == y - 1) {
					lc3_borderX += lc3_m;
					lc3_cachedLastY++;
				} else {
					lc3_borderX = y*lc3_m + lc3_C;
					lc3_cachedLastY = y;
				}
			}
		}
	}

	@Override
	public boolean inside(int x) {
		return (okay &&
				(lc1_horizontal ? lc1_cachedValue : (lc1_leftOrAboveFromLine ? x <= lc1_borderX : x >= lc1_borderX)) &&
				(lc2_horizontal ? lc2_cachedValue : (lc2_leftOrAboveFromLine ? x <= lc2_borderX : x >= lc2_borderX)) &&
				(lc3_horizontal ? lc3_cachedValue : (lc3_leftOrAboveFromLine ? x <= lc3_borderX : x >= lc3_borderX))
				);
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
}
