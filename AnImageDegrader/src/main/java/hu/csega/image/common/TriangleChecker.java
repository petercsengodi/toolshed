package hu.csega.image.common;

/**
 * Interface is optimized for moving the cursor horizontally;
 */
public interface TriangleChecker {

	public static final double ERROR = 0.00001;

	/**
	 * First step: load the basic data of the triangle.
	 */
	void loadTriangle(int x1, int y1, int x2, int y2, int x3, int y3);

	/**
	 * Second step: prepare triangle by setting the y coordinate of the queries.
	 */
	void moveToY(int y);

	/**
	 * Third step: do query based on y set up earlier with {@link #moveToY(double)}, giving x as argument.
	 */
	boolean inside(int x);

	double getMinX();
	double getMaxX();
	double getMinY();
	double getMaxY();
}
