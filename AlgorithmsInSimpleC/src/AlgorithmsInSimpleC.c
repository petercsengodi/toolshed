/*
 ============================================================================
 Name        : AlgorithmsInSimpleC.c
 Author      : petercsengodi
 Version     :
 Copyright   : -
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

#include <sys/time.h>
#include <stdio.h>
#include <limits.h>

double minx, miny, maxx, maxy;

int tooNearToEachOther(int x1, int y1, int x2, int y2) {
	return x1 == x2 && y1 == y2;
}

int min(int a, int b, int c) {
	return (a < b && a < c) ? a : (b < c ? b : c);
}

int max(int a, int b, int c) {
	return (a > b && a > c) ? a : (b > c ? b : c);
}

int initializedWithValidData;
double sx, sy;

int lc1_horizontal, lc1_vertical, lc1_leftOrAboveFromLine, lc1_cachedValue;
double lc1_m, lc1_C, lc1_borderX, lc1_borderY;

int lc2_horizontal, lc2_vertical, lc2_leftOrAboveFromLine, lc2_cachedValue;
double lc2_m, lc2_C, lc2_borderX, lc2_borderY;

int lc3_horizontal, lc3_vertical, lc3_leftOrAboveFromLine, lc3_cachedValue;
double lc3_m, lc3_C, lc3_borderX, lc3_borderY;

int lc1_cachedLastY, lc2_cachedLastY, lc3_cachedLastY;

void loadTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
	initializedWithValidData = 0;
	sx = sy = 0.0;

	lc1_horizontal = lc1_vertical = lc1_leftOrAboveFromLine = lc1_cachedValue = 0;
	lc1_m = lc1_C = lc1_borderX = lc1_borderY = 0.0;

	lc2_horizontal = lc2_vertical = lc2_leftOrAboveFromLine = lc2_cachedValue = 0;
	lc2_m = lc2_C = lc2_borderX = lc2_borderY = 0.0;

	lc3_horizontal = lc3_vertical = lc3_leftOrAboveFromLine = lc3_cachedValue = 0;
	lc3_m = lc3_C = lc3_borderX = lc3_borderY = 0.0;

	lc1_cachedLastY = lc2_cachedLastY = lc3_cachedLastY = INT_MIN;

	// If either of the two points are (almost) the same, the triangle has no valid area

	if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
		initializedWithValidData = 0;
		return;
	}

	// A point is inside in the triangle, if a point is on the same side
	// of all line (equations) as the weight point (sx;sy)

	sx = (x1 + x2 + x3) / 3.0;
	sy = (y1 + y2 + y3) / 3.0;

	// Remember: points here can't be too close to each other,
	// we filtered that out earlier

	if(y1 == y2) {
		lc1_horizontal = 1;
		lc1_vertical = 0;
		lc1_borderY = y1;
		lc1_leftOrAboveFromLine = (sy <= y1);
	} else if(x1 == x2) {
		lc1_horizontal = 0;
		lc1_vertical = 1;
		lc1_borderX = x1;
		lc1_leftOrAboveFromLine = (sx <= x1);
	} else {
		lc1_horizontal = 0;
		lc1_vertical = 0;
		lc1_m = (x2 - x1) / (double)(y2 - y1);
		lc1_C = x1 - lc1_m * y1;
		lc1_leftOrAboveFromLine = (sx < lc1_m*sy + lc1_C);
	}

	if(y2 == y3) {
		lc2_horizontal = 1;
		lc2_vertical = 0;
		lc2_borderY = y2;
		lc2_leftOrAboveFromLine = (sy <= y2);
	} else if(x2 == x3) {
		lc2_horizontal = 0;
		lc2_vertical = 1;
		lc2_borderX = x2;
		lc2_leftOrAboveFromLine = (sx <= x2);
	} else {
		lc2_horizontal = 0;
		lc2_vertical = 0;
		lc2_m = (x3 - x2) / (double)(y3 - y2);
		lc2_C = x2 - lc2_m * y2;
		lc2_leftOrAboveFromLine = (sx < lc2_m*sy + lc2_C);
	}

	if(y3 == y1) {
		lc3_horizontal = 1;
		lc3_vertical = 0;
		lc3_borderY = y3;
		lc3_leftOrAboveFromLine = (sy <= y3);
	} else if(x3 == x1) {
		lc3_horizontal = 0;
		lc3_vertical = 1;
		lc3_borderX = x3;
		lc3_leftOrAboveFromLine = (sx <= x3);
	} else {
		lc3_horizontal = 0;
		lc3_vertical = 0;
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

	initializedWithValidData = 1;
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

int inside(int x) {
	return (initializedWithValidData &&
			(lc1_horizontal ? lc1_cachedValue : (lc1_leftOrAboveFromLine ? x <= lc1_borderX : x >= lc1_borderX)) &&
			(lc2_horizontal ? lc2_cachedValue : (lc2_leftOrAboveFromLine ? x <= lc2_borderX : x >= lc2_borderX)) &&
			(lc3_horizontal ? lc3_cachedValue : (lc3_leftOrAboveFromLine ? x <= lc3_borderX : x >= lc3_borderX))
			);
}

void diff(long start, long end) {
	printf("4th implementation: %lf secs. \n", (end - start) / 1000.0);
}

const long NUMBER_OF_ROUNDS = 10;

const long PICTURE_WIDTH = 800;
const long PICTURE_HEIGHT = 800;
const long NUMBER_OF_TRIANGLES = 300;
const long NUMBER_OF_CYCLES = 1;

const long NUMBER_OF_OPERATIONS = 300;

int main() {
	int i, j, x, y;
	long long start, end;

	struct timeval tp;

	for(j = 0; j < NUMBER_OF_ROUNDS; j++) {
		gettimeofday(&tp, NULL);
		start = (long long) tp.tv_sec * 1000L + tp.tv_usec / 1000;

		for(i = 0; i < NUMBER_OF_OPERATIONS * 10000; i++) {
			loadTriangle(-10, -10, 0, 10, 10, -10);
		}

		for(i = 0; i < NUMBER_OF_OPERATIONS; i++) {
			for(y = 0; y < PICTURE_HEIGHT; y++) {
				moveToY(5);
				for(x = 0; x < PICTURE_WIDTH; x++) {
					inside(-5);
					inside(-1);
					inside(0);
					inside(1);
					inside(5);
					inside(9);
				}
			}
		}

		gettimeofday(&tp, NULL);
		end = (long long) tp.tv_sec * 1000L + tp.tv_usec / 1000;
		diff(start, end);
	}

	return 0;
}
