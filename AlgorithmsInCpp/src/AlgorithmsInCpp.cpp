//============================================================================
// Name        : AlgorithmsInCpp.cpp
// Author      : petercsengodi
// Version     :
// Copyright   : -
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <climits>
#include <sys/time.h>
#include <stdio.h>

using namespace std;

class LineChecker3 {
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

protected:

	double minx, miny, maxx, maxy;

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

	virtual void loadTriangle(int x1, int y1, int x2, int y2, int x3, int y3) = 0;

	virtual void moveToY(int y) = 0;

	virtual bool inside(int x) = 0;

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

	TriangleChecker() {
		minx = miny = maxx = maxy = 0.0;
	}

	virtual ~TriangleChecker() {
		// Nothing, I guess
	}
};

class TriangleChecker3Impl : public TriangleChecker {
private:

	bool initializedWithValidData;
	double sx, sy;
	LineChecker3 lc1, lc2, lc3;

public:

	TriangleChecker3Impl() {
		initializedWithValidData = false;
		sx = sy = 0.0;
	}

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

	virtual ~TriangleChecker3Impl() {
		// Nothing, I guess
	}

};

class TriangleChecker4Impl : public TriangleChecker {

private:

	bool initializedWithValidData;
	double sx, sy;

	bool lc1_horizontal, lc1_vertical, lc1_leftOrAboveFromLine, lc1_cachedValue;
	double lc1_m, lc1_C, lc1_borderX, lc1_borderY;

	bool lc2_horizontal, lc2_vertical, lc2_leftOrAboveFromLine, lc2_cachedValue;
	double lc2_m, lc2_C, lc2_borderX, lc2_borderY;

	bool lc3_horizontal, lc3_vertical, lc3_leftOrAboveFromLine, lc3_cachedValue;
	double lc3_m, lc3_C, lc3_borderX, lc3_borderY;

	int lc1_cachedLastY, lc2_cachedLastY, lc3_cachedLastY;

public:

	TriangleChecker4Impl() {
		initializedWithValidData = false;
		sx = sy = 0.0;

		lc1_horizontal = lc1_vertical = lc1_leftOrAboveFromLine = lc1_cachedValue = false;
		lc1_m = lc1_C = lc1_borderX = lc1_borderY = 0.0;

		lc2_horizontal = lc2_vertical = lc2_leftOrAboveFromLine = lc2_cachedValue = false;
		lc2_m = lc2_C = lc2_borderX = lc2_borderY = 0.0;

		lc3_horizontal = lc3_vertical = lc3_leftOrAboveFromLine = lc3_cachedValue = false;
		lc3_m = lc3_C = lc3_borderX = lc3_borderY = 0.0;

		lc1_cachedLastY = lc2_cachedLastY = lc3_cachedLastY = INT_MIN;
	}

	void loadTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {

		// If either of the two points are (almost) the same, the triangle has no valid area

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			initializedWithValidData = false;
			return;
		}

		// A point is inside in the triangle, if a point is on the same side
		// of all line (equations) as the weight point (sx;sy)

		sx = (x1 + x2 + x3) / 3.0;
		sy = (y1 + y2 + y3) / 3.0;

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
			lc1_C = x1 - lc1_m * y1;
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
			lc2_C = x2 - lc2_m * y2;
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
			lc3_C = x3 - lc3_m * y3;
			lc3_leftOrAboveFromLine = (sx < lc3_m*sy + lc3_C);
		}

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

	bool inside(int x) {
		return (initializedWithValidData &&
				(lc1_horizontal ? lc1_cachedValue : (lc1_leftOrAboveFromLine ? x <= lc1_borderX : x >= lc1_borderX)) &&
				(lc2_horizontal ? lc2_cachedValue : (lc2_leftOrAboveFromLine ? x <= lc2_borderX : x >= lc2_borderX)) &&
				(lc3_horizontal ? lc3_cachedValue : (lc3_leftOrAboveFromLine ? x <= lc3_borderX : x >= lc3_borderX))
				);
	}

	virtual ~TriangleChecker4Impl() {
		// Nothing, I guess
	}
};

void diff(char* label, long start, long end) {
	printf("%s: %lf secs.\n", label, (end - start) / 1000.0);
}

const long NUMBER_OF_ROUNDS = 3;

const long PICTURE_WIDTH = 800;
const long PICTURE_HEIGHT = 800;
const long NUMBER_OF_TRIANGLES = 300;
const long NUMBER_OF_CYCLES = 1;

const long NUMBER_OF_OPERATIONS = NUMBER_OF_TRIANGLES * NUMBER_OF_CYCLES;

void measureTC3() {
	TriangleChecker3Impl tc;

	int i, j, x, y;
	long long start, end;

	struct timeval tp;

	for(j = 0; j < NUMBER_OF_ROUNDS; j++) {
		gettimeofday(&tp, NULL);
		start = (long long) tp.tv_sec * 1000L + tp.tv_usec / 1000;

		for(i = 0; i < NUMBER_OF_OPERATIONS * 10000; i++) {
			tc.loadTriangle(-10, -10, 0, 10, 10, -10);
		}

		for(i = 0; i < NUMBER_OF_OPERATIONS; i++) {
			for(y = 0; y < PICTURE_HEIGHT; y++) {
				tc.moveToY(5);
				for(x = 0; x < PICTURE_WIDTH; x++) {
					tc.inside(-5);
					tc.inside(-1);
					tc.inside(0);
					tc.inside(1);
					tc.inside(5);
					tc.inside(9);
				}
			}
		}

		gettimeofday(&tp, NULL);
		end = (long long) tp.tv_sec * 1000L + tp.tv_usec / 1000;
		diff("3rd implementation", start, end);
	}
}

void measureTC3InArray() {
	TriangleChecker3Impl tc[300];

	int i, j, x, y;
	long long start, end;

	struct timeval tp;

	for(j = 0; j < NUMBER_OF_ROUNDS; j++) {
		gettimeofday(&tp, NULL);
		start = (long long) tp.tv_sec * 1000L + tp.tv_usec / 1000;

		for(i = 0; i < NUMBER_OF_OPERATIONS * 10000; i++) {
			tc[0].loadTriangle(-10, -10, 0, 10, 10, -10);
		}

		for(i = 0; i < NUMBER_OF_OPERATIONS; i++) {
			for(y = 0; y < PICTURE_HEIGHT; y++) {
				tc[0].moveToY(5);
				for(x = 0; x < PICTURE_WIDTH; x++) {
					tc[0].inside(-5);
					tc[0].inside(-1);
					tc[0].inside(0);
					tc[0].inside(1);
					tc[0].inside(5);
					tc[0].inside(9);
				}
			}
		}

		gettimeofday(&tp, NULL);
		end = (long long) tp.tv_sec * 1000L + tp.tv_usec / 1000;
		diff("3rd implementation [array]", start, end);
	}
}

void measureTC3WithPointer() {
	TriangleChecker3Impl* tc = new TriangleChecker3Impl();

	int i, j, x, y;
	long long start, end;

	struct timeval tp;

	for(j = 0; j < NUMBER_OF_ROUNDS; j++) {
		gettimeofday(&tp, NULL);
		start = (long long) tp.tv_sec * 1000L + tp.tv_usec / 1000;

		for(i = 0; i < NUMBER_OF_OPERATIONS * 10000; i++) {
			tc->loadTriangle(-10, -10, 0, 10, 10, -10);
		}

		for(i = 0; i < NUMBER_OF_OPERATIONS; i++) {
			for(y = 0; y < PICTURE_HEIGHT; y++) {
				tc->moveToY(5);
				for(x = 0; x < PICTURE_WIDTH; x++) {
					tc->inside(-5);
					tc->inside(-1);
					tc->inside(0);
					tc->inside(1);
					tc->inside(5);
					tc->inside(9);
				}
			}
		}

		gettimeofday(&tp, NULL);
		end = (long long) tp.tv_sec * 1000L + tp.tv_usec / 1000;
		diff("3rd implementation [pointer]", start, end);
	}

	delete tc;
}

void measureTC3WithReference() {
	TriangleChecker3Impl* tcp = new TriangleChecker3Impl();
	TriangleChecker3Impl& tc = *tcp;

	int i, j, x, y;
	long long start, end;

	struct timeval tp;

	for(j = 0; j < NUMBER_OF_ROUNDS; j++) {
		gettimeofday(&tp, NULL);
		start = (long long) tp.tv_sec * 1000L + tp.tv_usec / 1000;

		for(i = 0; i < NUMBER_OF_OPERATIONS * 10000; i++) {
			tc.loadTriangle(-10, -10, 0, 10, 10, -10);
		}

		for(i = 0; i < NUMBER_OF_OPERATIONS; i++) {
			for(y = 0; y < PICTURE_HEIGHT; y++) {
				tc.moveToY(5);
				for(x = 0; x < PICTURE_WIDTH; x++) {
					tc.inside(-5);
					tc.inside(-1);
					tc.inside(0);
					tc.inside(1);
					tc.inside(5);
					tc.inside(9);
				}
			}
		}

		gettimeofday(&tp, NULL);
		end = (long long) tp.tv_sec * 1000L + tp.tv_usec / 1000;
		diff("3rd implementation [reference]", start, end);
	}

	delete tcp;
}

void measureTC4() {
	TriangleChecker4Impl tc;

	int i, j, x, y;
	long long start, end;

	struct timeval tp;

	for(j = 0; j < NUMBER_OF_ROUNDS; j++) {
		gettimeofday(&tp, NULL);
		start = (long long) tp.tv_sec * 1000L + tp.tv_usec / 1000;

		for(i = 0; i < NUMBER_OF_OPERATIONS * 10000; i++) {
			tc.loadTriangle(-10, -10, 0, 10, 10, -10);
		}

		for(i = 0; i < NUMBER_OF_OPERATIONS; i++) {
			for(y = 0; y < PICTURE_HEIGHT; y++) {
				tc.moveToY(5);
				for(x = 0; x < PICTURE_WIDTH; x++) {
					tc.inside(-5);
					tc.inside(-1);
					tc.inside(0);
					tc.inside(1);
					tc.inside(5);
					tc.inside(9);
				}
			}
		}

		gettimeofday(&tp, NULL);
		end = (long long) tp.tv_sec * 1000L + tp.tv_usec / 1000;
		diff("4th implementation", start, end);
	}
}

void measureSimpleOperations1() {
	int i, j, x, y, r1, r2;
	long long start, end;

	struct timeval tp;

	for(j = 0; j < NUMBER_OF_ROUNDS; j++) {
		gettimeofday(&tp, NULL);
		start = (long long) tp.tv_sec * 1000L + tp.tv_usec / 1000;

		for(i = 0; i < NUMBER_OF_OPERATIONS; i++) {
			for(y = 0; y < PICTURE_HEIGHT; y++) {
				for(x = 0; x < PICTURE_WIDTH; x++) {
					r1 = i;
					r2 = r1 * j;
					r2 *= j;
					r2 += i;

					r1 /= 5;
					r1 *= 5;
					r1 /= 5;
					r1 *= 5;
					r1 /= 5;
					r1 *= 5;
					r1 /= 5;
					r1 *= 5;
					r1 /= 5;
					r1 *= 5;
					r1 /= 5;
					r1 *= 5;
					r1 /= 5;
					r1 *= 5;
					r1 /= 5;
					r1 *= 5;
					r1 /= 5;
					r1 *= 5;
					r1 /= 5;
					r1 *= 5;
					r1 /= 5;
					r1 *= 5;
					r1 /= 5;
					r1 *= 5;
					r1 /= 5;
					r1 *= 5;
					r1 /= 5;
					r1 *= 5;
				}
			}
		}

		gettimeofday(&tp, NULL);
		end = (long long) tp.tv_sec * 1000L + tp.tv_usec / 1000;
		diff("simple operations 1.", start, end);
	}
}

void measureSimpleOperations2() {
	int i, j, x, y, r1, r2;
	long long start, end;

	struct timeval tp;

	for(j = 0; j < NUMBER_OF_ROUNDS; j++) {
		gettimeofday(&tp, NULL);
		start = (long long) tp.tv_sec * 1000L + tp.tv_usec / 1000;

		for(i = 0; i < NUMBER_OF_OPERATIONS; i++) {
			for(y = 0; y < PICTURE_HEIGHT; y++) {
				for(x = 0; x < PICTURE_WIDTH; x++) {
					r1 = i;
					r2 = r1 + j;
					r2 += j;
					r2 += i;

					r2 += j;
					r2 += i;
					r2 -= j;
					r2 -= i;
					r2 += j;
					r2 += i;
					r2 -= j;
					r2 -= i;
					r2 += j;
					r2 += i;
					r2 -= j;
					r2 -= i;
					r2 += j;
					r2 += i;
					r2 -= j;
					r2 -= i;
					r2 += j;
					r2 += i;
					r2 -= j;
					r2 -= i;
					r2 += j;
					r2 += i;
					r2 -= j;
					r2 -= i;
					r2 += j;
					r2 += i;
					r2 -= j;
					r2 -= i;
					r2 += j;
					r2 += i;
					r2 -= j;
					r2 -= i;
					r2 += j;
					r2 += i;
					r2 -= j;
					r2 -= i;
					r2 += j;
					r2 += i;
					r2 -= j;
					r2 -= i;
					r2 += j;
					r2 += i;
					r2 -= j;
					r2 -= i;
					r2 += j;
					r2 += i;
					r2 -= j;
					r2 -= i;
				}
			}
		}

		gettimeofday(&tp, NULL);
		end = (long long) tp.tv_sec * 1000L + tp.tv_usec / 1000;
		diff("simple operations 2.", start, end);
	}
}

int main() {
	measureSimpleOperations1();
	measureSimpleOperations2();

	measureTC3();
	measureTC3InArray();
	measureTC3WithPointer();
	measureTC3WithReference();

	measureTC4();

	return 0;
}
