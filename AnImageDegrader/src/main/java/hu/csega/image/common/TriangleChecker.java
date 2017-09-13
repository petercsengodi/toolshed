package hu.csega.image.common;

public interface TriangleChecker {

	public static final double ERROR = 0.00001;

	void loadTriangle(double x1, double y1, double x2, double y2, double x3, double y3);
	boolean inside(double x, double y);

}
