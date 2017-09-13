package hu.csega.image.triangles;

import hu.csega.image.common.ImageChromosomeReceiver;
import hu.csega.image.common.PrototypeToArrayConverter;
import hu.csega.image.common.TriangleChecker;

public class MultipleTrianglesArrayConverter2 implements PrototypeToArrayConverter {

	private int[] buffer;
	private int width;
	private int height;
	private int clearR;
	private int clearG;
	private int clearB;

	public MultipleTrianglesArrayConverter2(int[] buffer, int width, int height, int clearR, int clearG, int clearB) {
		this.buffer = buffer;
		this.width = width;
		this.height = height;
		this.clearR = clearR;
		this.clearG = clearG;
		this.clearB = clearB;
	}

	@Override
	public int[] convert(ImageChromosomeReceiver receiver) {
		MultipleTriangles mt = (MultipleTriangles)receiver;
		SingleTriangle[] triangles = mt.triangles;
		TriangleChecker[] checkers = mt.checkers;
		int numberOfTriangles = triangles.length;

		// 1. initialize checkers
		for(int i = 0; i < numberOfTriangles; i++) {
			SingleTriangle triangle = triangles[i];
			int[] x = triangle.x;
			int[] y = triangle.y;
			checkers[i].loadTriangle(x[0], y[0], x[1], y[1], x[2], y[2]);
		}

		// 2. Clear buffer
		for(int i = 0; i < buffer.length;) {
			buffer[i++] = clearR;
			buffer[i++] = clearG;
			buffer[i++] = clearB;
		}

		SingleTriangle t;
		TriangleChecker tc;
		int colorPosition = 0, r, g, b, x, y, minx, maxx, miny, maxy;

		// 3. iterate through triangles
		for(int i = 0; i < numberOfTriangles; i++) {
			t = triangles[i];
			r = t.r;
			g = t.g;
			b = t.b;

			tc = checkers[i];

			minx = (int)tc.getMinX();
			if(minx < 0) {
				minx = 0;
			}

			maxx = (int)tc.getMaxX();
			if(maxx >= width) {
				maxx = width - 1;
			}

			miny = (int)tc.getMinY();
			if(miny < 0) {
				miny = 0;
			}

			maxy = (int)tc.getMaxY();
			if(maxy >= height) {
				maxy = height - 1;
			}

			for(y = miny; y <= maxy; y++) {
				checkers[i].moveToY(y);
				colorPosition = y * width;

				for(x = minx; x <= maxx; x++) {
					if(checkers[i].inside(x)) {
						buffer[colorPosition++] = r;
						buffer[colorPosition++] = g;
						buffer[colorPosition++] = b;
					} else {
						colorPosition += 3;
					}
				}
			}
		}

		return buffer;
	}

}
