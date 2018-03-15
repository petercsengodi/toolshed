package hu.csega.toolshed.framework.util;

import java.awt.Rectangle;

public class ToolUtil {

	public static Rectangle normalizeRectangle(Rectangle original) {
		Rectangle rect = new Rectangle();

		if (original.width > 0) {
			rect.x = original.x;
			rect.width = original.width;
		} else {
			rect.x = original.x + original.width;
			rect.width = -original.width;
		}

		if (original.height > 0) {
			rect.y = original.y;
			rect.height = original.height;
		} else {
			rect.y = original.y + original.height;
			rect.height = -original.height;
		}

		return rect;
	}
	
	public static double distance(int x1, int y1, int x2, int y2) {
		double d1 = (x2 - x1) * (x2 - x1);
		double d2 = (y2 - y1) * (y2 - y1);
		return Math.sqrt(d1 + d2);
	}
}
