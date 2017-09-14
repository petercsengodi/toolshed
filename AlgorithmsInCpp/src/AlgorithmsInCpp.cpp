//============================================================================
// Name        : AlgorithmsInCpp.cpp
// Author      : petercsengodi
// Version     :
// Copyright   : -
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <climits>
using namespace std;

class LineChecker {
private:

	bool horizontal, vertical, leftOrAboveFromLine, cachedValue;
	double m, C, borderX, borderY;
	int cachedLastY = INT_MIN;

public:

	void loadLine(int x1, int y1, int x2, int y2, double sx, double sy) {
		if(y1 == y2) {
			horizontal = true;
			vertical = false;
			borderY = y1;
			leftOrAboveFromLine = (sy <= y1);
		} else if(x1 == x2) {
			horizontal = false;
			vertical = true;
			borderX = x1;
			leftOrAboveFromLine = (sx <= x1);
		} else {
			horizontal = false;
			vertical = false;
			m = (x2 - x1) / (double)(y2 - y1);
			C = x1 - m * y1;
			leftOrAboveFromLine = (sx < m*sy + C);
		}
	}

	void moveToY(int y) {
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

	bool isOnTheSameSideAsReferenceValue(int x) {
		if(horizontal) {
			return cachedValue;
		} else { // generic + vertical
			return (leftOrAboveFromLine ? x <= borderX : x >= borderX);
		}
	}

};

class TriangleChecker {
private:

	bool initializedWithValidData = false;
	double sx, sy, minx, miny, maxx, maxy;
	LineChecker lc1, lc2, lc3;


	bool tooNearToEachOther(int x1, int y1, int x2, int y2) {
		return x1 == x2 && y1 == y2;
	}

	int min(int a, int b, int c) {
		return (a < b && a < c) ? a : (b < c ? b : c);
	}

	int max(int a, int b, int c) {
		return (a > b && a > c) ? a : (b > c ? b : c);
	}

public:

	void loadTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {

		// If either of the two points are (almost) the same, the triangle has no valid area

		if(tooNearToEachOther(x1, y1, x2, y2) || tooNearToEachOther(x2, y2, x3, y3) || tooNearToEachOther(x3, y3, x1, y1)) {
			initializedWithValidData = false;
			return;
		}

		// A point is inside in the triangle, if a point is on the same side
		// of all line (equations) as the weight point (sx;sy)

		sx = (x1 + x2 + x3) / 3.0;
		sy = (y1 + y2 + y3) / 3.0;

		// Remember: points here can't be too close to each other,
		// we filtered that out earlier

		lc1.loadLine(x1, y1, x2, y2, sx, sy);
		lc2.loadLine(x2, y2, x3, y3, sx, sy);
		lc3.loadLine(x3, y3, x1, y1, sx, sy);

		// We also build a bounding box to speed up the check
		// in really impossible cases

		minx = min(x1, x2, x3);
		miny = min(y1, y2, y3);
		maxx = max(x1, x2, x3);
		maxy = max(y1, y2, y3);

		// Okay, we successfully initialized the triangle

		initializedWithValidData = true;
	}

	void moveToY(int y) {
		if(initializedWithValidData) {
			lc1.moveToY(y);
			lc2.moveToY(y);
			lc3.moveToY(y);
		}
	}

	bool inside(int x) {
		return (initializedWithValidData && lc1.isOnTheSameSideAsReferenceValue(x) && lc2.isOnTheSameSideAsReferenceValue(x) && lc3.isOnTheSameSideAsReferenceValue(x));
	}

	double getMinX() {
		return minx;
	}

	double getMinY() {
		return miny;
	}

	double getMaxX() {
		return maxx;
	}

	double getMaxY() {
		return maxy;
	}

};

int main() {
	cout << "Hello World!" << endl; // prints Hello World!
	return 0;
}
