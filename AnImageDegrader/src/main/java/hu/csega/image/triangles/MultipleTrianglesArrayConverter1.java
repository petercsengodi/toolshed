package hu.csega.image.triangles;

import hu.csega.image.common.ImageChromosomeReceiver;
import hu.csega.image.common.PrototypeToArrayConverter;
import hu.csega.image.common.TriangleChecker;

public class MultipleTrianglesArrayConverter1 implements PrototypeToArrayConverter {

	private int[] buffer;
	private int width;
	private int height;
	private int clearR;
	private int clearG;
	private int clearB;

	public MultipleTrianglesArrayConverter1(int[] buffer, int width, int height, int clearR, int clearG, int clearB) {
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

		SingleTriangle t;
		int colorPosition = 0, r, g, b;

		// 2. iterate through pixels
		for(int y = 0; y < height; y++) {

			for(int i = 0; i < numberOfTriangles; i++) {
				checkers[i].moveToY(y);
			}

			for(int x = 0; x < width; x++) {
				r = clearR;
				g = clearG;
				b = clearB;

				// 3. iterate through triangles backwards
				for(int i = numberOfTriangles-1; i >= 0; i--) {

					// 4. if pixel is contained by current triangle, we set this color
					// (if not contained by any, "clear color" remains)

					if (checkers[i].inside(x)) {
						t = triangles[i];
						r = t.r;
						g = t.g;
						b = t.b;
						break;
					}

				} // end 3.

				// 5. we paint the pixel
				// (because all pixels will be colored _somehow_, no previous clearing is needed)
				buffer[colorPosition++] = r;
				buffer[colorPosition++] = g;
				buffer[colorPosition++] = b;
			}

		} // end 2.

		return buffer;
	}

}
