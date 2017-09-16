package hu.csega.image.triangles;

public class GeneratedTriangleLoader {

	GeneratedTriangleDrawer drawer;

	public void loadTriangles(SingleTriangle[] triangles) {
		loadTriangles1(triangles);
		loadTriangles2(triangles);
		loadTriangles3(triangles);
		loadTriangles4(triangles);
		loadTriangles5(triangles);
		loadTriangles6(triangles);
		loadTriangles7(triangles);
		loadTriangles8(triangles);
		loadTriangles9(triangles);
		loadTriangles10(triangles);
	}

	public void loadTriangles1(SingleTriangle[] triangles) {
		int x1, y1, x2, y2, x3, y3;
		SingleTriangle t;

		t = triangles[0]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T0_r = t.r; drawer.T0_g = t.g; drawer.T0_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T0_initializedWithValidData = false;
		} else {

			drawer.T0_sx = (x1 + x2 + x3) / 3.0;
			drawer.T0_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T0_lc1_horizontal = true;
				drawer.T0_lc1_vertical = false;
				drawer.T0_lc1_borderY = y1;
				drawer.T0_lc1_leftOrAbove = (drawer.T0_sy <= y1);
			} else if(x1 == x2) {
				drawer.T0_lc1_horizontal = false;
				drawer.T0_lc1_vertical = true;
				drawer.T0_lc1_borderX = x1;
				drawer.T0_lc1_leftOrAbove = (drawer.T0_sx <= x1);
			} else {
				drawer.T0_lc1_horizontal = false;
				drawer.T0_lc1_vertical = false;
				drawer.T0_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T0_lc1_C = x1 - drawer.T0_lc1_m * y1;
				drawer.T0_lc1_leftOrAbove = (drawer.T0_sx < drawer.T0_lc1_m*drawer.T0_sy + drawer.T0_lc1_C);
			}

			if(y2 == y3) {
				drawer.T0_lc2_horizontal = true;
				drawer.T0_lc2_vertical = false;
				drawer.T0_lc2_borderY = y2;
				drawer.T0_lc2_leftOrAbove = (drawer.T0_sy <= y2);
			} else if(x2 == x3) {
				drawer.T0_lc2_horizontal = false;
				drawer.T0_lc2_vertical = true;
				drawer.T0_lc2_borderX = x2;
				drawer.T0_lc2_leftOrAbove = (drawer.T0_sx <= x2);
			} else {
				drawer.T0_lc2_horizontal = false;
				drawer.T0_lc2_vertical = false;
				drawer.T0_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T0_lc2_C = x2 - drawer.T0_lc2_m * y2;
				drawer.T0_lc2_leftOrAbove = (drawer.T0_sx < drawer.T0_lc2_m*drawer.T0_sy + drawer.T0_lc2_C);
			}

			if(y3 == y1) {
				drawer.T0_lc3_horizontal = true;
				drawer.T0_lc3_vertical = false;
				drawer.T0_lc3_borderY = y3;
				drawer.T0_lc3_leftOrAbove = (drawer.T0_sy <= y3);
			} else if(x3 == x1) {
				drawer.T0_lc3_horizontal = false;
				drawer.T0_lc3_vertical = true;
				drawer.T0_lc3_borderX = x3;
				drawer.T0_lc3_leftOrAbove = (drawer.T0_sx <= x3);
			} else {
				drawer.T0_lc3_horizontal = false;
				drawer.T0_lc3_vertical = false;
				drawer.T0_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T0_lc3_C = x3 - drawer.T0_lc3_m * y3;
				drawer.T0_lc3_leftOrAbove = (drawer.T0_sx < drawer.T0_lc3_m*drawer.T0_sy + drawer.T0_lc3_C);
			}

			drawer.T0_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T0_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T0_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T0_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T0_initializedWithValidData = true;
		}

		t = triangles[1]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T1_r = t.r; drawer.T1_g = t.g; drawer.T1_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T1_initializedWithValidData = false;
		} else {

			drawer.T1_sx = (x1 + x2 + x3) / 3.0;
			drawer.T1_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T1_lc1_horizontal = true;
				drawer.T1_lc1_vertical = false;
				drawer.T1_lc1_borderY = y1;
				drawer.T1_lc1_leftOrAbove = (drawer.T1_sy <= y1);
			} else if(x1 == x2) {
				drawer.T1_lc1_horizontal = false;
				drawer.T1_lc1_vertical = true;
				drawer.T1_lc1_borderX = x1;
				drawer.T1_lc1_leftOrAbove = (drawer.T1_sx <= x1);
			} else {
				drawer.T1_lc1_horizontal = false;
				drawer.T1_lc1_vertical = false;
				drawer.T1_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T1_lc1_C = x1 - drawer.T1_lc1_m * y1;
				drawer.T1_lc1_leftOrAbove = (drawer.T1_sx < drawer.T1_lc1_m*drawer.T1_sy + drawer.T1_lc1_C);
			}

			if(y2 == y3) {
				drawer.T1_lc2_horizontal = true;
				drawer.T1_lc2_vertical = false;
				drawer.T1_lc2_borderY = y2;
				drawer.T1_lc2_leftOrAbove = (drawer.T1_sy <= y2);
			} else if(x2 == x3) {
				drawer.T1_lc2_horizontal = false;
				drawer.T1_lc2_vertical = true;
				drawer.T1_lc2_borderX = x2;
				drawer.T1_lc2_leftOrAbove = (drawer.T1_sx <= x2);
			} else {
				drawer.T1_lc2_horizontal = false;
				drawer.T1_lc2_vertical = false;
				drawer.T1_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T1_lc2_C = x2 - drawer.T1_lc2_m * y2;
				drawer.T1_lc2_leftOrAbove = (drawer.T1_sx < drawer.T1_lc2_m*drawer.T1_sy + drawer.T1_lc2_C);
			}

			if(y3 == y1) {
				drawer.T1_lc3_horizontal = true;
				drawer.T1_lc3_vertical = false;
				drawer.T1_lc3_borderY = y3;
				drawer.T1_lc3_leftOrAbove = (drawer.T1_sy <= y3);
			} else if(x3 == x1) {
				drawer.T1_lc3_horizontal = false;
				drawer.T1_lc3_vertical = true;
				drawer.T1_lc3_borderX = x3;
				drawer.T1_lc3_leftOrAbove = (drawer.T1_sx <= x3);
			} else {
				drawer.T1_lc3_horizontal = false;
				drawer.T1_lc3_vertical = false;
				drawer.T1_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T1_lc3_C = x3 - drawer.T1_lc3_m * y3;
				drawer.T1_lc3_leftOrAbove = (drawer.T1_sx < drawer.T1_lc3_m*drawer.T1_sy + drawer.T1_lc3_C);
			}

			drawer.T1_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T1_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T1_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T1_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T1_initializedWithValidData = true;
		}

		t = triangles[2]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T2_r = t.r; drawer.T2_g = t.g; drawer.T2_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T2_initializedWithValidData = false;
		} else {

			drawer.T2_sx = (x1 + x2 + x3) / 3.0;
			drawer.T2_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T2_lc1_horizontal = true;
				drawer.T2_lc1_vertical = false;
				drawer.T2_lc1_borderY = y1;
				drawer.T2_lc1_leftOrAbove = (drawer.T2_sy <= y1);
			} else if(x1 == x2) {
				drawer.T2_lc1_horizontal = false;
				drawer.T2_lc1_vertical = true;
				drawer.T2_lc1_borderX = x1;
				drawer.T2_lc1_leftOrAbove = (drawer.T2_sx <= x1);
			} else {
				drawer.T2_lc1_horizontal = false;
				drawer.T2_lc1_vertical = false;
				drawer.T2_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T2_lc1_C = x1 - drawer.T2_lc1_m * y1;
				drawer.T2_lc1_leftOrAbove = (drawer.T2_sx < drawer.T2_lc1_m*drawer.T2_sy + drawer.T2_lc1_C);
			}

			if(y2 == y3) {
				drawer.T2_lc2_horizontal = true;
				drawer.T2_lc2_vertical = false;
				drawer.T2_lc2_borderY = y2;
				drawer.T2_lc2_leftOrAbove = (drawer.T2_sy <= y2);
			} else if(x2 == x3) {
				drawer.T2_lc2_horizontal = false;
				drawer.T2_lc2_vertical = true;
				drawer.T2_lc2_borderX = x2;
				drawer.T2_lc2_leftOrAbove = (drawer.T2_sx <= x2);
			} else {
				drawer.T2_lc2_horizontal = false;
				drawer.T2_lc2_vertical = false;
				drawer.T2_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T2_lc2_C = x2 - drawer.T2_lc2_m * y2;
				drawer.T2_lc2_leftOrAbove = (drawer.T2_sx < drawer.T2_lc2_m*drawer.T2_sy + drawer.T2_lc2_C);
			}

			if(y3 == y1) {
				drawer.T2_lc3_horizontal = true;
				drawer.T2_lc3_vertical = false;
				drawer.T2_lc3_borderY = y3;
				drawer.T2_lc3_leftOrAbove = (drawer.T2_sy <= y3);
			} else if(x3 == x1) {
				drawer.T2_lc3_horizontal = false;
				drawer.T2_lc3_vertical = true;
				drawer.T2_lc3_borderX = x3;
				drawer.T2_lc3_leftOrAbove = (drawer.T2_sx <= x3);
			} else {
				drawer.T2_lc3_horizontal = false;
				drawer.T2_lc3_vertical = false;
				drawer.T2_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T2_lc3_C = x3 - drawer.T2_lc3_m * y3;
				drawer.T2_lc3_leftOrAbove = (drawer.T2_sx < drawer.T2_lc3_m*drawer.T2_sy + drawer.T2_lc3_C);
			}

			drawer.T2_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T2_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T2_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T2_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T2_initializedWithValidData = true;
		}

		t = triangles[3]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T3_r = t.r; drawer.T3_g = t.g; drawer.T3_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T3_initializedWithValidData = false;
		} else {

			drawer.T3_sx = (x1 + x2 + x3) / 3.0;
			drawer.T3_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T3_lc1_horizontal = true;
				drawer.T3_lc1_vertical = false;
				drawer.T3_lc1_borderY = y1;
				drawer.T3_lc1_leftOrAbove = (drawer.T3_sy <= y1);
			} else if(x1 == x2) {
				drawer.T3_lc1_horizontal = false;
				drawer.T3_lc1_vertical = true;
				drawer.T3_lc1_borderX = x1;
				drawer.T3_lc1_leftOrAbove = (drawer.T3_sx <= x1);
			} else {
				drawer.T3_lc1_horizontal = false;
				drawer.T3_lc1_vertical = false;
				drawer.T3_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T3_lc1_C = x1 - drawer.T3_lc1_m * y1;
				drawer.T3_lc1_leftOrAbove = (drawer.T3_sx < drawer.T3_lc1_m*drawer.T3_sy + drawer.T3_lc1_C);
			}

			if(y2 == y3) {
				drawer.T3_lc2_horizontal = true;
				drawer.T3_lc2_vertical = false;
				drawer.T3_lc2_borderY = y2;
				drawer.T3_lc2_leftOrAbove = (drawer.T3_sy <= y2);
			} else if(x2 == x3) {
				drawer.T3_lc2_horizontal = false;
				drawer.T3_lc2_vertical = true;
				drawer.T3_lc2_borderX = x2;
				drawer.T3_lc2_leftOrAbove = (drawer.T3_sx <= x2);
			} else {
				drawer.T3_lc2_horizontal = false;
				drawer.T3_lc2_vertical = false;
				drawer.T3_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T3_lc2_C = x2 - drawer.T3_lc2_m * y2;
				drawer.T3_lc2_leftOrAbove = (drawer.T3_sx < drawer.T3_lc2_m*drawer.T3_sy + drawer.T3_lc2_C);
			}

			if(y3 == y1) {
				drawer.T3_lc3_horizontal = true;
				drawer.T3_lc3_vertical = false;
				drawer.T3_lc3_borderY = y3;
				drawer.T3_lc3_leftOrAbove = (drawer.T3_sy <= y3);
			} else if(x3 == x1) {
				drawer.T3_lc3_horizontal = false;
				drawer.T3_lc3_vertical = true;
				drawer.T3_lc3_borderX = x3;
				drawer.T3_lc3_leftOrAbove = (drawer.T3_sx <= x3);
			} else {
				drawer.T3_lc3_horizontal = false;
				drawer.T3_lc3_vertical = false;
				drawer.T3_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T3_lc3_C = x3 - drawer.T3_lc3_m * y3;
				drawer.T3_lc3_leftOrAbove = (drawer.T3_sx < drawer.T3_lc3_m*drawer.T3_sy + drawer.T3_lc3_C);
			}

			drawer.T3_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T3_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T3_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T3_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T3_initializedWithValidData = true;
		}

		t = triangles[4]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T4_r = t.r; drawer.T4_g = t.g; drawer.T4_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T4_initializedWithValidData = false;
		} else {

			drawer.T4_sx = (x1 + x2 + x3) / 3.0;
			drawer.T4_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T4_lc1_horizontal = true;
				drawer.T4_lc1_vertical = false;
				drawer.T4_lc1_borderY = y1;
				drawer.T4_lc1_leftOrAbove = (drawer.T4_sy <= y1);
			} else if(x1 == x2) {
				drawer.T4_lc1_horizontal = false;
				drawer.T4_lc1_vertical = true;
				drawer.T4_lc1_borderX = x1;
				drawer.T4_lc1_leftOrAbove = (drawer.T4_sx <= x1);
			} else {
				drawer.T4_lc1_horizontal = false;
				drawer.T4_lc1_vertical = false;
				drawer.T4_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T4_lc1_C = x1 - drawer.T4_lc1_m * y1;
				drawer.T4_lc1_leftOrAbove = (drawer.T4_sx < drawer.T4_lc1_m*drawer.T4_sy + drawer.T4_lc1_C);
			}

			if(y2 == y3) {
				drawer.T4_lc2_horizontal = true;
				drawer.T4_lc2_vertical = false;
				drawer.T4_lc2_borderY = y2;
				drawer.T4_lc2_leftOrAbove = (drawer.T4_sy <= y2);
			} else if(x2 == x3) {
				drawer.T4_lc2_horizontal = false;
				drawer.T4_lc2_vertical = true;
				drawer.T4_lc2_borderX = x2;
				drawer.T4_lc2_leftOrAbove = (drawer.T4_sx <= x2);
			} else {
				drawer.T4_lc2_horizontal = false;
				drawer.T4_lc2_vertical = false;
				drawer.T4_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T4_lc2_C = x2 - drawer.T4_lc2_m * y2;
				drawer.T4_lc2_leftOrAbove = (drawer.T4_sx < drawer.T4_lc2_m*drawer.T4_sy + drawer.T4_lc2_C);
			}

			if(y3 == y1) {
				drawer.T4_lc3_horizontal = true;
				drawer.T4_lc3_vertical = false;
				drawer.T4_lc3_borderY = y3;
				drawer.T4_lc3_leftOrAbove = (drawer.T4_sy <= y3);
			} else if(x3 == x1) {
				drawer.T4_lc3_horizontal = false;
				drawer.T4_lc3_vertical = true;
				drawer.T4_lc3_borderX = x3;
				drawer.T4_lc3_leftOrAbove = (drawer.T4_sx <= x3);
			} else {
				drawer.T4_lc3_horizontal = false;
				drawer.T4_lc3_vertical = false;
				drawer.T4_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T4_lc3_C = x3 - drawer.T4_lc3_m * y3;
				drawer.T4_lc3_leftOrAbove = (drawer.T4_sx < drawer.T4_lc3_m*drawer.T4_sy + drawer.T4_lc3_C);
			}

			drawer.T4_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T4_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T4_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T4_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T4_initializedWithValidData = true;
		}

		t = triangles[5]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T5_r = t.r; drawer.T5_g = t.g; drawer.T5_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T5_initializedWithValidData = false;
		} else {

			drawer.T5_sx = (x1 + x2 + x3) / 3.0;
			drawer.T5_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T5_lc1_horizontal = true;
				drawer.T5_lc1_vertical = false;
				drawer.T5_lc1_borderY = y1;
				drawer.T5_lc1_leftOrAbove = (drawer.T5_sy <= y1);
			} else if(x1 == x2) {
				drawer.T5_lc1_horizontal = false;
				drawer.T5_lc1_vertical = true;
				drawer.T5_lc1_borderX = x1;
				drawer.T5_lc1_leftOrAbove = (drawer.T5_sx <= x1);
			} else {
				drawer.T5_lc1_horizontal = false;
				drawer.T5_lc1_vertical = false;
				drawer.T5_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T5_lc1_C = x1 - drawer.T5_lc1_m * y1;
				drawer.T5_lc1_leftOrAbove = (drawer.T5_sx < drawer.T5_lc1_m*drawer.T5_sy + drawer.T5_lc1_C);
			}

			if(y2 == y3) {
				drawer.T5_lc2_horizontal = true;
				drawer.T5_lc2_vertical = false;
				drawer.T5_lc2_borderY = y2;
				drawer.T5_lc2_leftOrAbove = (drawer.T5_sy <= y2);
			} else if(x2 == x3) {
				drawer.T5_lc2_horizontal = false;
				drawer.T5_lc2_vertical = true;
				drawer.T5_lc2_borderX = x2;
				drawer.T5_lc2_leftOrAbove = (drawer.T5_sx <= x2);
			} else {
				drawer.T5_lc2_horizontal = false;
				drawer.T5_lc2_vertical = false;
				drawer.T5_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T5_lc2_C = x2 - drawer.T5_lc2_m * y2;
				drawer.T5_lc2_leftOrAbove = (drawer.T5_sx < drawer.T5_lc2_m*drawer.T5_sy + drawer.T5_lc2_C);
			}

			if(y3 == y1) {
				drawer.T5_lc3_horizontal = true;
				drawer.T5_lc3_vertical = false;
				drawer.T5_lc3_borderY = y3;
				drawer.T5_lc3_leftOrAbove = (drawer.T5_sy <= y3);
			} else if(x3 == x1) {
				drawer.T5_lc3_horizontal = false;
				drawer.T5_lc3_vertical = true;
				drawer.T5_lc3_borderX = x3;
				drawer.T5_lc3_leftOrAbove = (drawer.T5_sx <= x3);
			} else {
				drawer.T5_lc3_horizontal = false;
				drawer.T5_lc3_vertical = false;
				drawer.T5_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T5_lc3_C = x3 - drawer.T5_lc3_m * y3;
				drawer.T5_lc3_leftOrAbove = (drawer.T5_sx < drawer.T5_lc3_m*drawer.T5_sy + drawer.T5_lc3_C);
			}

			drawer.T5_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T5_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T5_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T5_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T5_initializedWithValidData = true;
		}

		t = triangles[6]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T6_r = t.r; drawer.T6_g = t.g; drawer.T6_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T6_initializedWithValidData = false;
		} else {

			drawer.T6_sx = (x1 + x2 + x3) / 3.0;
			drawer.T6_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T6_lc1_horizontal = true;
				drawer.T6_lc1_vertical = false;
				drawer.T6_lc1_borderY = y1;
				drawer.T6_lc1_leftOrAbove = (drawer.T6_sy <= y1);
			} else if(x1 == x2) {
				drawer.T6_lc1_horizontal = false;
				drawer.T6_lc1_vertical = true;
				drawer.T6_lc1_borderX = x1;
				drawer.T6_lc1_leftOrAbove = (drawer.T6_sx <= x1);
			} else {
				drawer.T6_lc1_horizontal = false;
				drawer.T6_lc1_vertical = false;
				drawer.T6_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T6_lc1_C = x1 - drawer.T6_lc1_m * y1;
				drawer.T6_lc1_leftOrAbove = (drawer.T6_sx < drawer.T6_lc1_m*drawer.T6_sy + drawer.T6_lc1_C);
			}

			if(y2 == y3) {
				drawer.T6_lc2_horizontal = true;
				drawer.T6_lc2_vertical = false;
				drawer.T6_lc2_borderY = y2;
				drawer.T6_lc2_leftOrAbove = (drawer.T6_sy <= y2);
			} else if(x2 == x3) {
				drawer.T6_lc2_horizontal = false;
				drawer.T6_lc2_vertical = true;
				drawer.T6_lc2_borderX = x2;
				drawer.T6_lc2_leftOrAbove = (drawer.T6_sx <= x2);
			} else {
				drawer.T6_lc2_horizontal = false;
				drawer.T6_lc2_vertical = false;
				drawer.T6_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T6_lc2_C = x2 - drawer.T6_lc2_m * y2;
				drawer.T6_lc2_leftOrAbove = (drawer.T6_sx < drawer.T6_lc2_m*drawer.T6_sy + drawer.T6_lc2_C);
			}

			if(y3 == y1) {
				drawer.T6_lc3_horizontal = true;
				drawer.T6_lc3_vertical = false;
				drawer.T6_lc3_borderY = y3;
				drawer.T6_lc3_leftOrAbove = (drawer.T6_sy <= y3);
			} else if(x3 == x1) {
				drawer.T6_lc3_horizontal = false;
				drawer.T6_lc3_vertical = true;
				drawer.T6_lc3_borderX = x3;
				drawer.T6_lc3_leftOrAbove = (drawer.T6_sx <= x3);
			} else {
				drawer.T6_lc3_horizontal = false;
				drawer.T6_lc3_vertical = false;
				drawer.T6_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T6_lc3_C = x3 - drawer.T6_lc3_m * y3;
				drawer.T6_lc3_leftOrAbove = (drawer.T6_sx < drawer.T6_lc3_m*drawer.T6_sy + drawer.T6_lc3_C);
			}

			drawer.T6_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T6_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T6_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T6_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T6_initializedWithValidData = true;
		}

		t = triangles[7]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T7_r = t.r; drawer.T7_g = t.g; drawer.T7_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T7_initializedWithValidData = false;
		} else {

			drawer.T7_sx = (x1 + x2 + x3) / 3.0;
			drawer.T7_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T7_lc1_horizontal = true;
				drawer.T7_lc1_vertical = false;
				drawer.T7_lc1_borderY = y1;
				drawer.T7_lc1_leftOrAbove = (drawer.T7_sy <= y1);
			} else if(x1 == x2) {
				drawer.T7_lc1_horizontal = false;
				drawer.T7_lc1_vertical = true;
				drawer.T7_lc1_borderX = x1;
				drawer.T7_lc1_leftOrAbove = (drawer.T7_sx <= x1);
			} else {
				drawer.T7_lc1_horizontal = false;
				drawer.T7_lc1_vertical = false;
				drawer.T7_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T7_lc1_C = x1 - drawer.T7_lc1_m * y1;
				drawer.T7_lc1_leftOrAbove = (drawer.T7_sx < drawer.T7_lc1_m*drawer.T7_sy + drawer.T7_lc1_C);
			}

			if(y2 == y3) {
				drawer.T7_lc2_horizontal = true;
				drawer.T7_lc2_vertical = false;
				drawer.T7_lc2_borderY = y2;
				drawer.T7_lc2_leftOrAbove = (drawer.T7_sy <= y2);
			} else if(x2 == x3) {
				drawer.T7_lc2_horizontal = false;
				drawer.T7_lc2_vertical = true;
				drawer.T7_lc2_borderX = x2;
				drawer.T7_lc2_leftOrAbove = (drawer.T7_sx <= x2);
			} else {
				drawer.T7_lc2_horizontal = false;
				drawer.T7_lc2_vertical = false;
				drawer.T7_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T7_lc2_C = x2 - drawer.T7_lc2_m * y2;
				drawer.T7_lc2_leftOrAbove = (drawer.T7_sx < drawer.T7_lc2_m*drawer.T7_sy + drawer.T7_lc2_C);
			}

			if(y3 == y1) {
				drawer.T7_lc3_horizontal = true;
				drawer.T7_lc3_vertical = false;
				drawer.T7_lc3_borderY = y3;
				drawer.T7_lc3_leftOrAbove = (drawer.T7_sy <= y3);
			} else if(x3 == x1) {
				drawer.T7_lc3_horizontal = false;
				drawer.T7_lc3_vertical = true;
				drawer.T7_lc3_borderX = x3;
				drawer.T7_lc3_leftOrAbove = (drawer.T7_sx <= x3);
			} else {
				drawer.T7_lc3_horizontal = false;
				drawer.T7_lc3_vertical = false;
				drawer.T7_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T7_lc3_C = x3 - drawer.T7_lc3_m * y3;
				drawer.T7_lc3_leftOrAbove = (drawer.T7_sx < drawer.T7_lc3_m*drawer.T7_sy + drawer.T7_lc3_C);
			}

			drawer.T7_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T7_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T7_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T7_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T7_initializedWithValidData = true;
		}

		t = triangles[8]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T8_r = t.r; drawer.T8_g = t.g; drawer.T8_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T8_initializedWithValidData = false;
		} else {

			drawer.T8_sx = (x1 + x2 + x3) / 3.0;
			drawer.T8_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T8_lc1_horizontal = true;
				drawer.T8_lc1_vertical = false;
				drawer.T8_lc1_borderY = y1;
				drawer.T8_lc1_leftOrAbove = (drawer.T8_sy <= y1);
			} else if(x1 == x2) {
				drawer.T8_lc1_horizontal = false;
				drawer.T8_lc1_vertical = true;
				drawer.T8_lc1_borderX = x1;
				drawer.T8_lc1_leftOrAbove = (drawer.T8_sx <= x1);
			} else {
				drawer.T8_lc1_horizontal = false;
				drawer.T8_lc1_vertical = false;
				drawer.T8_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T8_lc1_C = x1 - drawer.T8_lc1_m * y1;
				drawer.T8_lc1_leftOrAbove = (drawer.T8_sx < drawer.T8_lc1_m*drawer.T8_sy + drawer.T8_lc1_C);
			}

			if(y2 == y3) {
				drawer.T8_lc2_horizontal = true;
				drawer.T8_lc2_vertical = false;
				drawer.T8_lc2_borderY = y2;
				drawer.T8_lc2_leftOrAbove = (drawer.T8_sy <= y2);
			} else if(x2 == x3) {
				drawer.T8_lc2_horizontal = false;
				drawer.T8_lc2_vertical = true;
				drawer.T8_lc2_borderX = x2;
				drawer.T8_lc2_leftOrAbove = (drawer.T8_sx <= x2);
			} else {
				drawer.T8_lc2_horizontal = false;
				drawer.T8_lc2_vertical = false;
				drawer.T8_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T8_lc2_C = x2 - drawer.T8_lc2_m * y2;
				drawer.T8_lc2_leftOrAbove = (drawer.T8_sx < drawer.T8_lc2_m*drawer.T8_sy + drawer.T8_lc2_C);
			}

			if(y3 == y1) {
				drawer.T8_lc3_horizontal = true;
				drawer.T8_lc3_vertical = false;
				drawer.T8_lc3_borderY = y3;
				drawer.T8_lc3_leftOrAbove = (drawer.T8_sy <= y3);
			} else if(x3 == x1) {
				drawer.T8_lc3_horizontal = false;
				drawer.T8_lc3_vertical = true;
				drawer.T8_lc3_borderX = x3;
				drawer.T8_lc3_leftOrAbove = (drawer.T8_sx <= x3);
			} else {
				drawer.T8_lc3_horizontal = false;
				drawer.T8_lc3_vertical = false;
				drawer.T8_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T8_lc3_C = x3 - drawer.T8_lc3_m * y3;
				drawer.T8_lc3_leftOrAbove = (drawer.T8_sx < drawer.T8_lc3_m*drawer.T8_sy + drawer.T8_lc3_C);
			}

			drawer.T8_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T8_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T8_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T8_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T8_initializedWithValidData = true;
		}

		t = triangles[9]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T9_r = t.r; drawer.T9_g = t.g; drawer.T9_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T9_initializedWithValidData = false;
		} else {

			drawer.T9_sx = (x1 + x2 + x3) / 3.0;
			drawer.T9_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T9_lc1_horizontal = true;
				drawer.T9_lc1_vertical = false;
				drawer.T9_lc1_borderY = y1;
				drawer.T9_lc1_leftOrAbove = (drawer.T9_sy <= y1);
			} else if(x1 == x2) {
				drawer.T9_lc1_horizontal = false;
				drawer.T9_lc1_vertical = true;
				drawer.T9_lc1_borderX = x1;
				drawer.T9_lc1_leftOrAbove = (drawer.T9_sx <= x1);
			} else {
				drawer.T9_lc1_horizontal = false;
				drawer.T9_lc1_vertical = false;
				drawer.T9_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T9_lc1_C = x1 - drawer.T9_lc1_m * y1;
				drawer.T9_lc1_leftOrAbove = (drawer.T9_sx < drawer.T9_lc1_m*drawer.T9_sy + drawer.T9_lc1_C);
			}

			if(y2 == y3) {
				drawer.T9_lc2_horizontal = true;
				drawer.T9_lc2_vertical = false;
				drawer.T9_lc2_borderY = y2;
				drawer.T9_lc2_leftOrAbove = (drawer.T9_sy <= y2);
			} else if(x2 == x3) {
				drawer.T9_lc2_horizontal = false;
				drawer.T9_lc2_vertical = true;
				drawer.T9_lc2_borderX = x2;
				drawer.T9_lc2_leftOrAbove = (drawer.T9_sx <= x2);
			} else {
				drawer.T9_lc2_horizontal = false;
				drawer.T9_lc2_vertical = false;
				drawer.T9_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T9_lc2_C = x2 - drawer.T9_lc2_m * y2;
				drawer.T9_lc2_leftOrAbove = (drawer.T9_sx < drawer.T9_lc2_m*drawer.T9_sy + drawer.T9_lc2_C);
			}

			if(y3 == y1) {
				drawer.T9_lc3_horizontal = true;
				drawer.T9_lc3_vertical = false;
				drawer.T9_lc3_borderY = y3;
				drawer.T9_lc3_leftOrAbove = (drawer.T9_sy <= y3);
			} else if(x3 == x1) {
				drawer.T9_lc3_horizontal = false;
				drawer.T9_lc3_vertical = true;
				drawer.T9_lc3_borderX = x3;
				drawer.T9_lc3_leftOrAbove = (drawer.T9_sx <= x3);
			} else {
				drawer.T9_lc3_horizontal = false;
				drawer.T9_lc3_vertical = false;
				drawer.T9_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T9_lc3_C = x3 - drawer.T9_lc3_m * y3;
				drawer.T9_lc3_leftOrAbove = (drawer.T9_sx < drawer.T9_lc3_m*drawer.T9_sy + drawer.T9_lc3_C);
			}

			drawer.T9_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T9_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T9_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T9_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T9_initializedWithValidData = true;
		}

		t = triangles[10]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T10_r = t.r; drawer.T10_g = t.g; drawer.T10_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T10_initializedWithValidData = false;
		} else {

			drawer.T10_sx = (x1 + x2 + x3) / 3.0;
			drawer.T10_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T10_lc1_horizontal = true;
				drawer.T10_lc1_vertical = false;
				drawer.T10_lc1_borderY = y1;
				drawer.T10_lc1_leftOrAbove = (drawer.T10_sy <= y1);
			} else if(x1 == x2) {
				drawer.T10_lc1_horizontal = false;
				drawer.T10_lc1_vertical = true;
				drawer.T10_lc1_borderX = x1;
				drawer.T10_lc1_leftOrAbove = (drawer.T10_sx <= x1);
			} else {
				drawer.T10_lc1_horizontal = false;
				drawer.T10_lc1_vertical = false;
				drawer.T10_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T10_lc1_C = x1 - drawer.T10_lc1_m * y1;
				drawer.T10_lc1_leftOrAbove = (drawer.T10_sx < drawer.T10_lc1_m*drawer.T10_sy + drawer.T10_lc1_C);
			}

			if(y2 == y3) {
				drawer.T10_lc2_horizontal = true;
				drawer.T10_lc2_vertical = false;
				drawer.T10_lc2_borderY = y2;
				drawer.T10_lc2_leftOrAbove = (drawer.T10_sy <= y2);
			} else if(x2 == x3) {
				drawer.T10_lc2_horizontal = false;
				drawer.T10_lc2_vertical = true;
				drawer.T10_lc2_borderX = x2;
				drawer.T10_lc2_leftOrAbove = (drawer.T10_sx <= x2);
			} else {
				drawer.T10_lc2_horizontal = false;
				drawer.T10_lc2_vertical = false;
				drawer.T10_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T10_lc2_C = x2 - drawer.T10_lc2_m * y2;
				drawer.T10_lc2_leftOrAbove = (drawer.T10_sx < drawer.T10_lc2_m*drawer.T10_sy + drawer.T10_lc2_C);
			}

			if(y3 == y1) {
				drawer.T10_lc3_horizontal = true;
				drawer.T10_lc3_vertical = false;
				drawer.T10_lc3_borderY = y3;
				drawer.T10_lc3_leftOrAbove = (drawer.T10_sy <= y3);
			} else if(x3 == x1) {
				drawer.T10_lc3_horizontal = false;
				drawer.T10_lc3_vertical = true;
				drawer.T10_lc3_borderX = x3;
				drawer.T10_lc3_leftOrAbove = (drawer.T10_sx <= x3);
			} else {
				drawer.T10_lc3_horizontal = false;
				drawer.T10_lc3_vertical = false;
				drawer.T10_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T10_lc3_C = x3 - drawer.T10_lc3_m * y3;
				drawer.T10_lc3_leftOrAbove = (drawer.T10_sx < drawer.T10_lc3_m*drawer.T10_sy + drawer.T10_lc3_C);
			}

			drawer.T10_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T10_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T10_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T10_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T10_initializedWithValidData = true;
		}

		t = triangles[11]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T11_r = t.r; drawer.T11_g = t.g; drawer.T11_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T11_initializedWithValidData = false;
		} else {

			drawer.T11_sx = (x1 + x2 + x3) / 3.0;
			drawer.T11_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T11_lc1_horizontal = true;
				drawer.T11_lc1_vertical = false;
				drawer.T11_lc1_borderY = y1;
				drawer.T11_lc1_leftOrAbove = (drawer.T11_sy <= y1);
			} else if(x1 == x2) {
				drawer.T11_lc1_horizontal = false;
				drawer.T11_lc1_vertical = true;
				drawer.T11_lc1_borderX = x1;
				drawer.T11_lc1_leftOrAbove = (drawer.T11_sx <= x1);
			} else {
				drawer.T11_lc1_horizontal = false;
				drawer.T11_lc1_vertical = false;
				drawer.T11_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T11_lc1_C = x1 - drawer.T11_lc1_m * y1;
				drawer.T11_lc1_leftOrAbove = (drawer.T11_sx < drawer.T11_lc1_m*drawer.T11_sy + drawer.T11_lc1_C);
			}

			if(y2 == y3) {
				drawer.T11_lc2_horizontal = true;
				drawer.T11_lc2_vertical = false;
				drawer.T11_lc2_borderY = y2;
				drawer.T11_lc2_leftOrAbove = (drawer.T11_sy <= y2);
			} else if(x2 == x3) {
				drawer.T11_lc2_horizontal = false;
				drawer.T11_lc2_vertical = true;
				drawer.T11_lc2_borderX = x2;
				drawer.T11_lc2_leftOrAbove = (drawer.T11_sx <= x2);
			} else {
				drawer.T11_lc2_horizontal = false;
				drawer.T11_lc2_vertical = false;
				drawer.T11_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T11_lc2_C = x2 - drawer.T11_lc2_m * y2;
				drawer.T11_lc2_leftOrAbove = (drawer.T11_sx < drawer.T11_lc2_m*drawer.T11_sy + drawer.T11_lc2_C);
			}

			if(y3 == y1) {
				drawer.T11_lc3_horizontal = true;
				drawer.T11_lc3_vertical = false;
				drawer.T11_lc3_borderY = y3;
				drawer.T11_lc3_leftOrAbove = (drawer.T11_sy <= y3);
			} else if(x3 == x1) {
				drawer.T11_lc3_horizontal = false;
				drawer.T11_lc3_vertical = true;
				drawer.T11_lc3_borderX = x3;
				drawer.T11_lc3_leftOrAbove = (drawer.T11_sx <= x3);
			} else {
				drawer.T11_lc3_horizontal = false;
				drawer.T11_lc3_vertical = false;
				drawer.T11_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T11_lc3_C = x3 - drawer.T11_lc3_m * y3;
				drawer.T11_lc3_leftOrAbove = (drawer.T11_sx < drawer.T11_lc3_m*drawer.T11_sy + drawer.T11_lc3_C);
			}

			drawer.T11_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T11_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T11_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T11_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T11_initializedWithValidData = true;
		}

		t = triangles[12]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T12_r = t.r; drawer.T12_g = t.g; drawer.T12_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T12_initializedWithValidData = false;
		} else {

			drawer.T12_sx = (x1 + x2 + x3) / 3.0;
			drawer.T12_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T12_lc1_horizontal = true;
				drawer.T12_lc1_vertical = false;
				drawer.T12_lc1_borderY = y1;
				drawer.T12_lc1_leftOrAbove = (drawer.T12_sy <= y1);
			} else if(x1 == x2) {
				drawer.T12_lc1_horizontal = false;
				drawer.T12_lc1_vertical = true;
				drawer.T12_lc1_borderX = x1;
				drawer.T12_lc1_leftOrAbove = (drawer.T12_sx <= x1);
			} else {
				drawer.T12_lc1_horizontal = false;
				drawer.T12_lc1_vertical = false;
				drawer.T12_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T12_lc1_C = x1 - drawer.T12_lc1_m * y1;
				drawer.T12_lc1_leftOrAbove = (drawer.T12_sx < drawer.T12_lc1_m*drawer.T12_sy + drawer.T12_lc1_C);
			}

			if(y2 == y3) {
				drawer.T12_lc2_horizontal = true;
				drawer.T12_lc2_vertical = false;
				drawer.T12_lc2_borderY = y2;
				drawer.T12_lc2_leftOrAbove = (drawer.T12_sy <= y2);
			} else if(x2 == x3) {
				drawer.T12_lc2_horizontal = false;
				drawer.T12_lc2_vertical = true;
				drawer.T12_lc2_borderX = x2;
				drawer.T12_lc2_leftOrAbove = (drawer.T12_sx <= x2);
			} else {
				drawer.T12_lc2_horizontal = false;
				drawer.T12_lc2_vertical = false;
				drawer.T12_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T12_lc2_C = x2 - drawer.T12_lc2_m * y2;
				drawer.T12_lc2_leftOrAbove = (drawer.T12_sx < drawer.T12_lc2_m*drawer.T12_sy + drawer.T12_lc2_C);
			}

			if(y3 == y1) {
				drawer.T12_lc3_horizontal = true;
				drawer.T12_lc3_vertical = false;
				drawer.T12_lc3_borderY = y3;
				drawer.T12_lc3_leftOrAbove = (drawer.T12_sy <= y3);
			} else if(x3 == x1) {
				drawer.T12_lc3_horizontal = false;
				drawer.T12_lc3_vertical = true;
				drawer.T12_lc3_borderX = x3;
				drawer.T12_lc3_leftOrAbove = (drawer.T12_sx <= x3);
			} else {
				drawer.T12_lc3_horizontal = false;
				drawer.T12_lc3_vertical = false;
				drawer.T12_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T12_lc3_C = x3 - drawer.T12_lc3_m * y3;
				drawer.T12_lc3_leftOrAbove = (drawer.T12_sx < drawer.T12_lc3_m*drawer.T12_sy + drawer.T12_lc3_C);
			}

			drawer.T12_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T12_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T12_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T12_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T12_initializedWithValidData = true;
		}

		t = triangles[13]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T13_r = t.r; drawer.T13_g = t.g; drawer.T13_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T13_initializedWithValidData = false;
		} else {

			drawer.T13_sx = (x1 + x2 + x3) / 3.0;
			drawer.T13_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T13_lc1_horizontal = true;
				drawer.T13_lc1_vertical = false;
				drawer.T13_lc1_borderY = y1;
				drawer.T13_lc1_leftOrAbove = (drawer.T13_sy <= y1);
			} else if(x1 == x2) {
				drawer.T13_lc1_horizontal = false;
				drawer.T13_lc1_vertical = true;
				drawer.T13_lc1_borderX = x1;
				drawer.T13_lc1_leftOrAbove = (drawer.T13_sx <= x1);
			} else {
				drawer.T13_lc1_horizontal = false;
				drawer.T13_lc1_vertical = false;
				drawer.T13_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T13_lc1_C = x1 - drawer.T13_lc1_m * y1;
				drawer.T13_lc1_leftOrAbove = (drawer.T13_sx < drawer.T13_lc1_m*drawer.T13_sy + drawer.T13_lc1_C);
			}

			if(y2 == y3) {
				drawer.T13_lc2_horizontal = true;
				drawer.T13_lc2_vertical = false;
				drawer.T13_lc2_borderY = y2;
				drawer.T13_lc2_leftOrAbove = (drawer.T13_sy <= y2);
			} else if(x2 == x3) {
				drawer.T13_lc2_horizontal = false;
				drawer.T13_lc2_vertical = true;
				drawer.T13_lc2_borderX = x2;
				drawer.T13_lc2_leftOrAbove = (drawer.T13_sx <= x2);
			} else {
				drawer.T13_lc2_horizontal = false;
				drawer.T13_lc2_vertical = false;
				drawer.T13_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T13_lc2_C = x2 - drawer.T13_lc2_m * y2;
				drawer.T13_lc2_leftOrAbove = (drawer.T13_sx < drawer.T13_lc2_m*drawer.T13_sy + drawer.T13_lc2_C);
			}

			if(y3 == y1) {
				drawer.T13_lc3_horizontal = true;
				drawer.T13_lc3_vertical = false;
				drawer.T13_lc3_borderY = y3;
				drawer.T13_lc3_leftOrAbove = (drawer.T13_sy <= y3);
			} else if(x3 == x1) {
				drawer.T13_lc3_horizontal = false;
				drawer.T13_lc3_vertical = true;
				drawer.T13_lc3_borderX = x3;
				drawer.T13_lc3_leftOrAbove = (drawer.T13_sx <= x3);
			} else {
				drawer.T13_lc3_horizontal = false;
				drawer.T13_lc3_vertical = false;
				drawer.T13_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T13_lc3_C = x3 - drawer.T13_lc3_m * y3;
				drawer.T13_lc3_leftOrAbove = (drawer.T13_sx < drawer.T13_lc3_m*drawer.T13_sy + drawer.T13_lc3_C);
			}

			drawer.T13_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T13_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T13_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T13_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T13_initializedWithValidData = true;
		}

		t = triangles[14]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T14_r = t.r; drawer.T14_g = t.g; drawer.T14_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T14_initializedWithValidData = false;
		} else {

			drawer.T14_sx = (x1 + x2 + x3) / 3.0;
			drawer.T14_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T14_lc1_horizontal = true;
				drawer.T14_lc1_vertical = false;
				drawer.T14_lc1_borderY = y1;
				drawer.T14_lc1_leftOrAbove = (drawer.T14_sy <= y1);
			} else if(x1 == x2) {
				drawer.T14_lc1_horizontal = false;
				drawer.T14_lc1_vertical = true;
				drawer.T14_lc1_borderX = x1;
				drawer.T14_lc1_leftOrAbove = (drawer.T14_sx <= x1);
			} else {
				drawer.T14_lc1_horizontal = false;
				drawer.T14_lc1_vertical = false;
				drawer.T14_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T14_lc1_C = x1 - drawer.T14_lc1_m * y1;
				drawer.T14_lc1_leftOrAbove = (drawer.T14_sx < drawer.T14_lc1_m*drawer.T14_sy + drawer.T14_lc1_C);
			}

			if(y2 == y3) {
				drawer.T14_lc2_horizontal = true;
				drawer.T14_lc2_vertical = false;
				drawer.T14_lc2_borderY = y2;
				drawer.T14_lc2_leftOrAbove = (drawer.T14_sy <= y2);
			} else if(x2 == x3) {
				drawer.T14_lc2_horizontal = false;
				drawer.T14_lc2_vertical = true;
				drawer.T14_lc2_borderX = x2;
				drawer.T14_lc2_leftOrAbove = (drawer.T14_sx <= x2);
			} else {
				drawer.T14_lc2_horizontal = false;
				drawer.T14_lc2_vertical = false;
				drawer.T14_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T14_lc2_C = x2 - drawer.T14_lc2_m * y2;
				drawer.T14_lc2_leftOrAbove = (drawer.T14_sx < drawer.T14_lc2_m*drawer.T14_sy + drawer.T14_lc2_C);
			}

			if(y3 == y1) {
				drawer.T14_lc3_horizontal = true;
				drawer.T14_lc3_vertical = false;
				drawer.T14_lc3_borderY = y3;
				drawer.T14_lc3_leftOrAbove = (drawer.T14_sy <= y3);
			} else if(x3 == x1) {
				drawer.T14_lc3_horizontal = false;
				drawer.T14_lc3_vertical = true;
				drawer.T14_lc3_borderX = x3;
				drawer.T14_lc3_leftOrAbove = (drawer.T14_sx <= x3);
			} else {
				drawer.T14_lc3_horizontal = false;
				drawer.T14_lc3_vertical = false;
				drawer.T14_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T14_lc3_C = x3 - drawer.T14_lc3_m * y3;
				drawer.T14_lc3_leftOrAbove = (drawer.T14_sx < drawer.T14_lc3_m*drawer.T14_sy + drawer.T14_lc3_C);
			}

			drawer.T14_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T14_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T14_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T14_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T14_initializedWithValidData = true;
		}

		t = triangles[15]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T15_r = t.r; drawer.T15_g = t.g; drawer.T15_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T15_initializedWithValidData = false;
		} else {

			drawer.T15_sx = (x1 + x2 + x3) / 3.0;
			drawer.T15_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T15_lc1_horizontal = true;
				drawer.T15_lc1_vertical = false;
				drawer.T15_lc1_borderY = y1;
				drawer.T15_lc1_leftOrAbove = (drawer.T15_sy <= y1);
			} else if(x1 == x2) {
				drawer.T15_lc1_horizontal = false;
				drawer.T15_lc1_vertical = true;
				drawer.T15_lc1_borderX = x1;
				drawer.T15_lc1_leftOrAbove = (drawer.T15_sx <= x1);
			} else {
				drawer.T15_lc1_horizontal = false;
				drawer.T15_lc1_vertical = false;
				drawer.T15_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T15_lc1_C = x1 - drawer.T15_lc1_m * y1;
				drawer.T15_lc1_leftOrAbove = (drawer.T15_sx < drawer.T15_lc1_m*drawer.T15_sy + drawer.T15_lc1_C);
			}

			if(y2 == y3) {
				drawer.T15_lc2_horizontal = true;
				drawer.T15_lc2_vertical = false;
				drawer.T15_lc2_borderY = y2;
				drawer.T15_lc2_leftOrAbove = (drawer.T15_sy <= y2);
			} else if(x2 == x3) {
				drawer.T15_lc2_horizontal = false;
				drawer.T15_lc2_vertical = true;
				drawer.T15_lc2_borderX = x2;
				drawer.T15_lc2_leftOrAbove = (drawer.T15_sx <= x2);
			} else {
				drawer.T15_lc2_horizontal = false;
				drawer.T15_lc2_vertical = false;
				drawer.T15_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T15_lc2_C = x2 - drawer.T15_lc2_m * y2;
				drawer.T15_lc2_leftOrAbove = (drawer.T15_sx < drawer.T15_lc2_m*drawer.T15_sy + drawer.T15_lc2_C);
			}

			if(y3 == y1) {
				drawer.T15_lc3_horizontal = true;
				drawer.T15_lc3_vertical = false;
				drawer.T15_lc3_borderY = y3;
				drawer.T15_lc3_leftOrAbove = (drawer.T15_sy <= y3);
			} else if(x3 == x1) {
				drawer.T15_lc3_horizontal = false;
				drawer.T15_lc3_vertical = true;
				drawer.T15_lc3_borderX = x3;
				drawer.T15_lc3_leftOrAbove = (drawer.T15_sx <= x3);
			} else {
				drawer.T15_lc3_horizontal = false;
				drawer.T15_lc3_vertical = false;
				drawer.T15_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T15_lc3_C = x3 - drawer.T15_lc3_m * y3;
				drawer.T15_lc3_leftOrAbove = (drawer.T15_sx < drawer.T15_lc3_m*drawer.T15_sy + drawer.T15_lc3_C);
			}

			drawer.T15_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T15_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T15_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T15_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T15_initializedWithValidData = true;
		}

		t = triangles[16]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T16_r = t.r; drawer.T16_g = t.g; drawer.T16_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T16_initializedWithValidData = false;
		} else {

			drawer.T16_sx = (x1 + x2 + x3) / 3.0;
			drawer.T16_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T16_lc1_horizontal = true;
				drawer.T16_lc1_vertical = false;
				drawer.T16_lc1_borderY = y1;
				drawer.T16_lc1_leftOrAbove = (drawer.T16_sy <= y1);
			} else if(x1 == x2) {
				drawer.T16_lc1_horizontal = false;
				drawer.T16_lc1_vertical = true;
				drawer.T16_lc1_borderX = x1;
				drawer.T16_lc1_leftOrAbove = (drawer.T16_sx <= x1);
			} else {
				drawer.T16_lc1_horizontal = false;
				drawer.T16_lc1_vertical = false;
				drawer.T16_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T16_lc1_C = x1 - drawer.T16_lc1_m * y1;
				drawer.T16_lc1_leftOrAbove = (drawer.T16_sx < drawer.T16_lc1_m*drawer.T16_sy + drawer.T16_lc1_C);
			}

			if(y2 == y3) {
				drawer.T16_lc2_horizontal = true;
				drawer.T16_lc2_vertical = false;
				drawer.T16_lc2_borderY = y2;
				drawer.T16_lc2_leftOrAbove = (drawer.T16_sy <= y2);
			} else if(x2 == x3) {
				drawer.T16_lc2_horizontal = false;
				drawer.T16_lc2_vertical = true;
				drawer.T16_lc2_borderX = x2;
				drawer.T16_lc2_leftOrAbove = (drawer.T16_sx <= x2);
			} else {
				drawer.T16_lc2_horizontal = false;
				drawer.T16_lc2_vertical = false;
				drawer.T16_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T16_lc2_C = x2 - drawer.T16_lc2_m * y2;
				drawer.T16_lc2_leftOrAbove = (drawer.T16_sx < drawer.T16_lc2_m*drawer.T16_sy + drawer.T16_lc2_C);
			}

			if(y3 == y1) {
				drawer.T16_lc3_horizontal = true;
				drawer.T16_lc3_vertical = false;
				drawer.T16_lc3_borderY = y3;
				drawer.T16_lc3_leftOrAbove = (drawer.T16_sy <= y3);
			} else if(x3 == x1) {
				drawer.T16_lc3_horizontal = false;
				drawer.T16_lc3_vertical = true;
				drawer.T16_lc3_borderX = x3;
				drawer.T16_lc3_leftOrAbove = (drawer.T16_sx <= x3);
			} else {
				drawer.T16_lc3_horizontal = false;
				drawer.T16_lc3_vertical = false;
				drawer.T16_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T16_lc3_C = x3 - drawer.T16_lc3_m * y3;
				drawer.T16_lc3_leftOrAbove = (drawer.T16_sx < drawer.T16_lc3_m*drawer.T16_sy + drawer.T16_lc3_C);
			}

			drawer.T16_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T16_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T16_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T16_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T16_initializedWithValidData = true;
		}

		t = triangles[17]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T17_r = t.r; drawer.T17_g = t.g; drawer.T17_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T17_initializedWithValidData = false;
		} else {

			drawer.T17_sx = (x1 + x2 + x3) / 3.0;
			drawer.T17_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T17_lc1_horizontal = true;
				drawer.T17_lc1_vertical = false;
				drawer.T17_lc1_borderY = y1;
				drawer.T17_lc1_leftOrAbove = (drawer.T17_sy <= y1);
			} else if(x1 == x2) {
				drawer.T17_lc1_horizontal = false;
				drawer.T17_lc1_vertical = true;
				drawer.T17_lc1_borderX = x1;
				drawer.T17_lc1_leftOrAbove = (drawer.T17_sx <= x1);
			} else {
				drawer.T17_lc1_horizontal = false;
				drawer.T17_lc1_vertical = false;
				drawer.T17_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T17_lc1_C = x1 - drawer.T17_lc1_m * y1;
				drawer.T17_lc1_leftOrAbove = (drawer.T17_sx < drawer.T17_lc1_m*drawer.T17_sy + drawer.T17_lc1_C);
			}

			if(y2 == y3) {
				drawer.T17_lc2_horizontal = true;
				drawer.T17_lc2_vertical = false;
				drawer.T17_lc2_borderY = y2;
				drawer.T17_lc2_leftOrAbove = (drawer.T17_sy <= y2);
			} else if(x2 == x3) {
				drawer.T17_lc2_horizontal = false;
				drawer.T17_lc2_vertical = true;
				drawer.T17_lc2_borderX = x2;
				drawer.T17_lc2_leftOrAbove = (drawer.T17_sx <= x2);
			} else {
				drawer.T17_lc2_horizontal = false;
				drawer.T17_lc2_vertical = false;
				drawer.T17_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T17_lc2_C = x2 - drawer.T17_lc2_m * y2;
				drawer.T17_lc2_leftOrAbove = (drawer.T17_sx < drawer.T17_lc2_m*drawer.T17_sy + drawer.T17_lc2_C);
			}

			if(y3 == y1) {
				drawer.T17_lc3_horizontal = true;
				drawer.T17_lc3_vertical = false;
				drawer.T17_lc3_borderY = y3;
				drawer.T17_lc3_leftOrAbove = (drawer.T17_sy <= y3);
			} else if(x3 == x1) {
				drawer.T17_lc3_horizontal = false;
				drawer.T17_lc3_vertical = true;
				drawer.T17_lc3_borderX = x3;
				drawer.T17_lc3_leftOrAbove = (drawer.T17_sx <= x3);
			} else {
				drawer.T17_lc3_horizontal = false;
				drawer.T17_lc3_vertical = false;
				drawer.T17_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T17_lc3_C = x3 - drawer.T17_lc3_m * y3;
				drawer.T17_lc3_leftOrAbove = (drawer.T17_sx < drawer.T17_lc3_m*drawer.T17_sy + drawer.T17_lc3_C);
			}

			drawer.T17_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T17_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T17_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T17_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T17_initializedWithValidData = true;
		}

		t = triangles[18]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T18_r = t.r; drawer.T18_g = t.g; drawer.T18_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T18_initializedWithValidData = false;
		} else {

			drawer.T18_sx = (x1 + x2 + x3) / 3.0;
			drawer.T18_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T18_lc1_horizontal = true;
				drawer.T18_lc1_vertical = false;
				drawer.T18_lc1_borderY = y1;
				drawer.T18_lc1_leftOrAbove = (drawer.T18_sy <= y1);
			} else if(x1 == x2) {
				drawer.T18_lc1_horizontal = false;
				drawer.T18_lc1_vertical = true;
				drawer.T18_lc1_borderX = x1;
				drawer.T18_lc1_leftOrAbove = (drawer.T18_sx <= x1);
			} else {
				drawer.T18_lc1_horizontal = false;
				drawer.T18_lc1_vertical = false;
				drawer.T18_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T18_lc1_C = x1 - drawer.T18_lc1_m * y1;
				drawer.T18_lc1_leftOrAbove = (drawer.T18_sx < drawer.T18_lc1_m*drawer.T18_sy + drawer.T18_lc1_C);
			}

			if(y2 == y3) {
				drawer.T18_lc2_horizontal = true;
				drawer.T18_lc2_vertical = false;
				drawer.T18_lc2_borderY = y2;
				drawer.T18_lc2_leftOrAbove = (drawer.T18_sy <= y2);
			} else if(x2 == x3) {
				drawer.T18_lc2_horizontal = false;
				drawer.T18_lc2_vertical = true;
				drawer.T18_lc2_borderX = x2;
				drawer.T18_lc2_leftOrAbove = (drawer.T18_sx <= x2);
			} else {
				drawer.T18_lc2_horizontal = false;
				drawer.T18_lc2_vertical = false;
				drawer.T18_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T18_lc2_C = x2 - drawer.T18_lc2_m * y2;
				drawer.T18_lc2_leftOrAbove = (drawer.T18_sx < drawer.T18_lc2_m*drawer.T18_sy + drawer.T18_lc2_C);
			}

			if(y3 == y1) {
				drawer.T18_lc3_horizontal = true;
				drawer.T18_lc3_vertical = false;
				drawer.T18_lc3_borderY = y3;
				drawer.T18_lc3_leftOrAbove = (drawer.T18_sy <= y3);
			} else if(x3 == x1) {
				drawer.T18_lc3_horizontal = false;
				drawer.T18_lc3_vertical = true;
				drawer.T18_lc3_borderX = x3;
				drawer.T18_lc3_leftOrAbove = (drawer.T18_sx <= x3);
			} else {
				drawer.T18_lc3_horizontal = false;
				drawer.T18_lc3_vertical = false;
				drawer.T18_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T18_lc3_C = x3 - drawer.T18_lc3_m * y3;
				drawer.T18_lc3_leftOrAbove = (drawer.T18_sx < drawer.T18_lc3_m*drawer.T18_sy + drawer.T18_lc3_C);
			}

			drawer.T18_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T18_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T18_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T18_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T18_initializedWithValidData = true;
		}

		t = triangles[19]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T19_r = t.r; drawer.T19_g = t.g; drawer.T19_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T19_initializedWithValidData = false;
		} else {

			drawer.T19_sx = (x1 + x2 + x3) / 3.0;
			drawer.T19_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T19_lc1_horizontal = true;
				drawer.T19_lc1_vertical = false;
				drawer.T19_lc1_borderY = y1;
				drawer.T19_lc1_leftOrAbove = (drawer.T19_sy <= y1);
			} else if(x1 == x2) {
				drawer.T19_lc1_horizontal = false;
				drawer.T19_lc1_vertical = true;
				drawer.T19_lc1_borderX = x1;
				drawer.T19_lc1_leftOrAbove = (drawer.T19_sx <= x1);
			} else {
				drawer.T19_lc1_horizontal = false;
				drawer.T19_lc1_vertical = false;
				drawer.T19_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T19_lc1_C = x1 - drawer.T19_lc1_m * y1;
				drawer.T19_lc1_leftOrAbove = (drawer.T19_sx < drawer.T19_lc1_m*drawer.T19_sy + drawer.T19_lc1_C);
			}

			if(y2 == y3) {
				drawer.T19_lc2_horizontal = true;
				drawer.T19_lc2_vertical = false;
				drawer.T19_lc2_borderY = y2;
				drawer.T19_lc2_leftOrAbove = (drawer.T19_sy <= y2);
			} else if(x2 == x3) {
				drawer.T19_lc2_horizontal = false;
				drawer.T19_lc2_vertical = true;
				drawer.T19_lc2_borderX = x2;
				drawer.T19_lc2_leftOrAbove = (drawer.T19_sx <= x2);
			} else {
				drawer.T19_lc2_horizontal = false;
				drawer.T19_lc2_vertical = false;
				drawer.T19_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T19_lc2_C = x2 - drawer.T19_lc2_m * y2;
				drawer.T19_lc2_leftOrAbove = (drawer.T19_sx < drawer.T19_lc2_m*drawer.T19_sy + drawer.T19_lc2_C);
			}

			if(y3 == y1) {
				drawer.T19_lc3_horizontal = true;
				drawer.T19_lc3_vertical = false;
				drawer.T19_lc3_borderY = y3;
				drawer.T19_lc3_leftOrAbove = (drawer.T19_sy <= y3);
			} else if(x3 == x1) {
				drawer.T19_lc3_horizontal = false;
				drawer.T19_lc3_vertical = true;
				drawer.T19_lc3_borderX = x3;
				drawer.T19_lc3_leftOrAbove = (drawer.T19_sx <= x3);
			} else {
				drawer.T19_lc3_horizontal = false;
				drawer.T19_lc3_vertical = false;
				drawer.T19_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T19_lc3_C = x3 - drawer.T19_lc3_m * y3;
				drawer.T19_lc3_leftOrAbove = (drawer.T19_sx < drawer.T19_lc3_m*drawer.T19_sy + drawer.T19_lc3_C);
			}

			drawer.T19_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T19_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T19_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T19_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T19_initializedWithValidData = true;
		}

		t = triangles[20]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T20_r = t.r; drawer.T20_g = t.g; drawer.T20_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T20_initializedWithValidData = false;
		} else {

			drawer.T20_sx = (x1 + x2 + x3) / 3.0;
			drawer.T20_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T20_lc1_horizontal = true;
				drawer.T20_lc1_vertical = false;
				drawer.T20_lc1_borderY = y1;
				drawer.T20_lc1_leftOrAbove = (drawer.T20_sy <= y1);
			} else if(x1 == x2) {
				drawer.T20_lc1_horizontal = false;
				drawer.T20_lc1_vertical = true;
				drawer.T20_lc1_borderX = x1;
				drawer.T20_lc1_leftOrAbove = (drawer.T20_sx <= x1);
			} else {
				drawer.T20_lc1_horizontal = false;
				drawer.T20_lc1_vertical = false;
				drawer.T20_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T20_lc1_C = x1 - drawer.T20_lc1_m * y1;
				drawer.T20_lc1_leftOrAbove = (drawer.T20_sx < drawer.T20_lc1_m*drawer.T20_sy + drawer.T20_lc1_C);
			}

			if(y2 == y3) {
				drawer.T20_lc2_horizontal = true;
				drawer.T20_lc2_vertical = false;
				drawer.T20_lc2_borderY = y2;
				drawer.T20_lc2_leftOrAbove = (drawer.T20_sy <= y2);
			} else if(x2 == x3) {
				drawer.T20_lc2_horizontal = false;
				drawer.T20_lc2_vertical = true;
				drawer.T20_lc2_borderX = x2;
				drawer.T20_lc2_leftOrAbove = (drawer.T20_sx <= x2);
			} else {
				drawer.T20_lc2_horizontal = false;
				drawer.T20_lc2_vertical = false;
				drawer.T20_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T20_lc2_C = x2 - drawer.T20_lc2_m * y2;
				drawer.T20_lc2_leftOrAbove = (drawer.T20_sx < drawer.T20_lc2_m*drawer.T20_sy + drawer.T20_lc2_C);
			}

			if(y3 == y1) {
				drawer.T20_lc3_horizontal = true;
				drawer.T20_lc3_vertical = false;
				drawer.T20_lc3_borderY = y3;
				drawer.T20_lc3_leftOrAbove = (drawer.T20_sy <= y3);
			} else if(x3 == x1) {
				drawer.T20_lc3_horizontal = false;
				drawer.T20_lc3_vertical = true;
				drawer.T20_lc3_borderX = x3;
				drawer.T20_lc3_leftOrAbove = (drawer.T20_sx <= x3);
			} else {
				drawer.T20_lc3_horizontal = false;
				drawer.T20_lc3_vertical = false;
				drawer.T20_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T20_lc3_C = x3 - drawer.T20_lc3_m * y3;
				drawer.T20_lc3_leftOrAbove = (drawer.T20_sx < drawer.T20_lc3_m*drawer.T20_sy + drawer.T20_lc3_C);
			}

			drawer.T20_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T20_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T20_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T20_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T20_initializedWithValidData = true;
		}

		t = triangles[21]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T21_r = t.r; drawer.T21_g = t.g; drawer.T21_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T21_initializedWithValidData = false;
		} else {

			drawer.T21_sx = (x1 + x2 + x3) / 3.0;
			drawer.T21_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T21_lc1_horizontal = true;
				drawer.T21_lc1_vertical = false;
				drawer.T21_lc1_borderY = y1;
				drawer.T21_lc1_leftOrAbove = (drawer.T21_sy <= y1);
			} else if(x1 == x2) {
				drawer.T21_lc1_horizontal = false;
				drawer.T21_lc1_vertical = true;
				drawer.T21_lc1_borderX = x1;
				drawer.T21_lc1_leftOrAbove = (drawer.T21_sx <= x1);
			} else {
				drawer.T21_lc1_horizontal = false;
				drawer.T21_lc1_vertical = false;
				drawer.T21_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T21_lc1_C = x1 - drawer.T21_lc1_m * y1;
				drawer.T21_lc1_leftOrAbove = (drawer.T21_sx < drawer.T21_lc1_m*drawer.T21_sy + drawer.T21_lc1_C);
			}

			if(y2 == y3) {
				drawer.T21_lc2_horizontal = true;
				drawer.T21_lc2_vertical = false;
				drawer.T21_lc2_borderY = y2;
				drawer.T21_lc2_leftOrAbove = (drawer.T21_sy <= y2);
			} else if(x2 == x3) {
				drawer.T21_lc2_horizontal = false;
				drawer.T21_lc2_vertical = true;
				drawer.T21_lc2_borderX = x2;
				drawer.T21_lc2_leftOrAbove = (drawer.T21_sx <= x2);
			} else {
				drawer.T21_lc2_horizontal = false;
				drawer.T21_lc2_vertical = false;
				drawer.T21_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T21_lc2_C = x2 - drawer.T21_lc2_m * y2;
				drawer.T21_lc2_leftOrAbove = (drawer.T21_sx < drawer.T21_lc2_m*drawer.T21_sy + drawer.T21_lc2_C);
			}

			if(y3 == y1) {
				drawer.T21_lc3_horizontal = true;
				drawer.T21_lc3_vertical = false;
				drawer.T21_lc3_borderY = y3;
				drawer.T21_lc3_leftOrAbove = (drawer.T21_sy <= y3);
			} else if(x3 == x1) {
				drawer.T21_lc3_horizontal = false;
				drawer.T21_lc3_vertical = true;
				drawer.T21_lc3_borderX = x3;
				drawer.T21_lc3_leftOrAbove = (drawer.T21_sx <= x3);
			} else {
				drawer.T21_lc3_horizontal = false;
				drawer.T21_lc3_vertical = false;
				drawer.T21_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T21_lc3_C = x3 - drawer.T21_lc3_m * y3;
				drawer.T21_lc3_leftOrAbove = (drawer.T21_sx < drawer.T21_lc3_m*drawer.T21_sy + drawer.T21_lc3_C);
			}

			drawer.T21_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T21_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T21_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T21_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T21_initializedWithValidData = true;
		}

		t = triangles[22]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T22_r = t.r; drawer.T22_g = t.g; drawer.T22_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T22_initializedWithValidData = false;
		} else {

			drawer.T22_sx = (x1 + x2 + x3) / 3.0;
			drawer.T22_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T22_lc1_horizontal = true;
				drawer.T22_lc1_vertical = false;
				drawer.T22_lc1_borderY = y1;
				drawer.T22_lc1_leftOrAbove = (drawer.T22_sy <= y1);
			} else if(x1 == x2) {
				drawer.T22_lc1_horizontal = false;
				drawer.T22_lc1_vertical = true;
				drawer.T22_lc1_borderX = x1;
				drawer.T22_lc1_leftOrAbove = (drawer.T22_sx <= x1);
			} else {
				drawer.T22_lc1_horizontal = false;
				drawer.T22_lc1_vertical = false;
				drawer.T22_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T22_lc1_C = x1 - drawer.T22_lc1_m * y1;
				drawer.T22_lc1_leftOrAbove = (drawer.T22_sx < drawer.T22_lc1_m*drawer.T22_sy + drawer.T22_lc1_C);
			}

			if(y2 == y3) {
				drawer.T22_lc2_horizontal = true;
				drawer.T22_lc2_vertical = false;
				drawer.T22_lc2_borderY = y2;
				drawer.T22_lc2_leftOrAbove = (drawer.T22_sy <= y2);
			} else if(x2 == x3) {
				drawer.T22_lc2_horizontal = false;
				drawer.T22_lc2_vertical = true;
				drawer.T22_lc2_borderX = x2;
				drawer.T22_lc2_leftOrAbove = (drawer.T22_sx <= x2);
			} else {
				drawer.T22_lc2_horizontal = false;
				drawer.T22_lc2_vertical = false;
				drawer.T22_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T22_lc2_C = x2 - drawer.T22_lc2_m * y2;
				drawer.T22_lc2_leftOrAbove = (drawer.T22_sx < drawer.T22_lc2_m*drawer.T22_sy + drawer.T22_lc2_C);
			}

			if(y3 == y1) {
				drawer.T22_lc3_horizontal = true;
				drawer.T22_lc3_vertical = false;
				drawer.T22_lc3_borderY = y3;
				drawer.T22_lc3_leftOrAbove = (drawer.T22_sy <= y3);
			} else if(x3 == x1) {
				drawer.T22_lc3_horizontal = false;
				drawer.T22_lc3_vertical = true;
				drawer.T22_lc3_borderX = x3;
				drawer.T22_lc3_leftOrAbove = (drawer.T22_sx <= x3);
			} else {
				drawer.T22_lc3_horizontal = false;
				drawer.T22_lc3_vertical = false;
				drawer.T22_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T22_lc3_C = x3 - drawer.T22_lc3_m * y3;
				drawer.T22_lc3_leftOrAbove = (drawer.T22_sx < drawer.T22_lc3_m*drawer.T22_sy + drawer.T22_lc3_C);
			}

			drawer.T22_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T22_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T22_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T22_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T22_initializedWithValidData = true;
		}

		t = triangles[23]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T23_r = t.r; drawer.T23_g = t.g; drawer.T23_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T23_initializedWithValidData = false;
		} else {

			drawer.T23_sx = (x1 + x2 + x3) / 3.0;
			drawer.T23_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T23_lc1_horizontal = true;
				drawer.T23_lc1_vertical = false;
				drawer.T23_lc1_borderY = y1;
				drawer.T23_lc1_leftOrAbove = (drawer.T23_sy <= y1);
			} else if(x1 == x2) {
				drawer.T23_lc1_horizontal = false;
				drawer.T23_lc1_vertical = true;
				drawer.T23_lc1_borderX = x1;
				drawer.T23_lc1_leftOrAbove = (drawer.T23_sx <= x1);
			} else {
				drawer.T23_lc1_horizontal = false;
				drawer.T23_lc1_vertical = false;
				drawer.T23_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T23_lc1_C = x1 - drawer.T23_lc1_m * y1;
				drawer.T23_lc1_leftOrAbove = (drawer.T23_sx < drawer.T23_lc1_m*drawer.T23_sy + drawer.T23_lc1_C);
			}

			if(y2 == y3) {
				drawer.T23_lc2_horizontal = true;
				drawer.T23_lc2_vertical = false;
				drawer.T23_lc2_borderY = y2;
				drawer.T23_lc2_leftOrAbove = (drawer.T23_sy <= y2);
			} else if(x2 == x3) {
				drawer.T23_lc2_horizontal = false;
				drawer.T23_lc2_vertical = true;
				drawer.T23_lc2_borderX = x2;
				drawer.T23_lc2_leftOrAbove = (drawer.T23_sx <= x2);
			} else {
				drawer.T23_lc2_horizontal = false;
				drawer.T23_lc2_vertical = false;
				drawer.T23_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T23_lc2_C = x2 - drawer.T23_lc2_m * y2;
				drawer.T23_lc2_leftOrAbove = (drawer.T23_sx < drawer.T23_lc2_m*drawer.T23_sy + drawer.T23_lc2_C);
			}

			if(y3 == y1) {
				drawer.T23_lc3_horizontal = true;
				drawer.T23_lc3_vertical = false;
				drawer.T23_lc3_borderY = y3;
				drawer.T23_lc3_leftOrAbove = (drawer.T23_sy <= y3);
			} else if(x3 == x1) {
				drawer.T23_lc3_horizontal = false;
				drawer.T23_lc3_vertical = true;
				drawer.T23_lc3_borderX = x3;
				drawer.T23_lc3_leftOrAbove = (drawer.T23_sx <= x3);
			} else {
				drawer.T23_lc3_horizontal = false;
				drawer.T23_lc3_vertical = false;
				drawer.T23_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T23_lc3_C = x3 - drawer.T23_lc3_m * y3;
				drawer.T23_lc3_leftOrAbove = (drawer.T23_sx < drawer.T23_lc3_m*drawer.T23_sy + drawer.T23_lc3_C);
			}

			drawer.T23_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T23_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T23_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T23_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T23_initializedWithValidData = true;
		}

		t = triangles[24]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T24_r = t.r; drawer.T24_g = t.g; drawer.T24_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T24_initializedWithValidData = false;
		} else {

			drawer.T24_sx = (x1 + x2 + x3) / 3.0;
			drawer.T24_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T24_lc1_horizontal = true;
				drawer.T24_lc1_vertical = false;
				drawer.T24_lc1_borderY = y1;
				drawer.T24_lc1_leftOrAbove = (drawer.T24_sy <= y1);
			} else if(x1 == x2) {
				drawer.T24_lc1_horizontal = false;
				drawer.T24_lc1_vertical = true;
				drawer.T24_lc1_borderX = x1;
				drawer.T24_lc1_leftOrAbove = (drawer.T24_sx <= x1);
			} else {
				drawer.T24_lc1_horizontal = false;
				drawer.T24_lc1_vertical = false;
				drawer.T24_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T24_lc1_C = x1 - drawer.T24_lc1_m * y1;
				drawer.T24_lc1_leftOrAbove = (drawer.T24_sx < drawer.T24_lc1_m*drawer.T24_sy + drawer.T24_lc1_C);
			}

			if(y2 == y3) {
				drawer.T24_lc2_horizontal = true;
				drawer.T24_lc2_vertical = false;
				drawer.T24_lc2_borderY = y2;
				drawer.T24_lc2_leftOrAbove = (drawer.T24_sy <= y2);
			} else if(x2 == x3) {
				drawer.T24_lc2_horizontal = false;
				drawer.T24_lc2_vertical = true;
				drawer.T24_lc2_borderX = x2;
				drawer.T24_lc2_leftOrAbove = (drawer.T24_sx <= x2);
			} else {
				drawer.T24_lc2_horizontal = false;
				drawer.T24_lc2_vertical = false;
				drawer.T24_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T24_lc2_C = x2 - drawer.T24_lc2_m * y2;
				drawer.T24_lc2_leftOrAbove = (drawer.T24_sx < drawer.T24_lc2_m*drawer.T24_sy + drawer.T24_lc2_C);
			}

			if(y3 == y1) {
				drawer.T24_lc3_horizontal = true;
				drawer.T24_lc3_vertical = false;
				drawer.T24_lc3_borderY = y3;
				drawer.T24_lc3_leftOrAbove = (drawer.T24_sy <= y3);
			} else if(x3 == x1) {
				drawer.T24_lc3_horizontal = false;
				drawer.T24_lc3_vertical = true;
				drawer.T24_lc3_borderX = x3;
				drawer.T24_lc3_leftOrAbove = (drawer.T24_sx <= x3);
			} else {
				drawer.T24_lc3_horizontal = false;
				drawer.T24_lc3_vertical = false;
				drawer.T24_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T24_lc3_C = x3 - drawer.T24_lc3_m * y3;
				drawer.T24_lc3_leftOrAbove = (drawer.T24_sx < drawer.T24_lc3_m*drawer.T24_sy + drawer.T24_lc3_C);
			}

			drawer.T24_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T24_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T24_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T24_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T24_initializedWithValidData = true;
		}

		t = triangles[25]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T25_r = t.r; drawer.T25_g = t.g; drawer.T25_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T25_initializedWithValidData = false;
		} else {

			drawer.T25_sx = (x1 + x2 + x3) / 3.0;
			drawer.T25_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T25_lc1_horizontal = true;
				drawer.T25_lc1_vertical = false;
				drawer.T25_lc1_borderY = y1;
				drawer.T25_lc1_leftOrAbove = (drawer.T25_sy <= y1);
			} else if(x1 == x2) {
				drawer.T25_lc1_horizontal = false;
				drawer.T25_lc1_vertical = true;
				drawer.T25_lc1_borderX = x1;
				drawer.T25_lc1_leftOrAbove = (drawer.T25_sx <= x1);
			} else {
				drawer.T25_lc1_horizontal = false;
				drawer.T25_lc1_vertical = false;
				drawer.T25_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T25_lc1_C = x1 - drawer.T25_lc1_m * y1;
				drawer.T25_lc1_leftOrAbove = (drawer.T25_sx < drawer.T25_lc1_m*drawer.T25_sy + drawer.T25_lc1_C);
			}

			if(y2 == y3) {
				drawer.T25_lc2_horizontal = true;
				drawer.T25_lc2_vertical = false;
				drawer.T25_lc2_borderY = y2;
				drawer.T25_lc2_leftOrAbove = (drawer.T25_sy <= y2);
			} else if(x2 == x3) {
				drawer.T25_lc2_horizontal = false;
				drawer.T25_lc2_vertical = true;
				drawer.T25_lc2_borderX = x2;
				drawer.T25_lc2_leftOrAbove = (drawer.T25_sx <= x2);
			} else {
				drawer.T25_lc2_horizontal = false;
				drawer.T25_lc2_vertical = false;
				drawer.T25_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T25_lc2_C = x2 - drawer.T25_lc2_m * y2;
				drawer.T25_lc2_leftOrAbove = (drawer.T25_sx < drawer.T25_lc2_m*drawer.T25_sy + drawer.T25_lc2_C);
			}

			if(y3 == y1) {
				drawer.T25_lc3_horizontal = true;
				drawer.T25_lc3_vertical = false;
				drawer.T25_lc3_borderY = y3;
				drawer.T25_lc3_leftOrAbove = (drawer.T25_sy <= y3);
			} else if(x3 == x1) {
				drawer.T25_lc3_horizontal = false;
				drawer.T25_lc3_vertical = true;
				drawer.T25_lc3_borderX = x3;
				drawer.T25_lc3_leftOrAbove = (drawer.T25_sx <= x3);
			} else {
				drawer.T25_lc3_horizontal = false;
				drawer.T25_lc3_vertical = false;
				drawer.T25_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T25_lc3_C = x3 - drawer.T25_lc3_m * y3;
				drawer.T25_lc3_leftOrAbove = (drawer.T25_sx < drawer.T25_lc3_m*drawer.T25_sy + drawer.T25_lc3_C);
			}

			drawer.T25_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T25_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T25_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T25_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T25_initializedWithValidData = true;
		}

		t = triangles[26]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T26_r = t.r; drawer.T26_g = t.g; drawer.T26_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T26_initializedWithValidData = false;
		} else {

			drawer.T26_sx = (x1 + x2 + x3) / 3.0;
			drawer.T26_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T26_lc1_horizontal = true;
				drawer.T26_lc1_vertical = false;
				drawer.T26_lc1_borderY = y1;
				drawer.T26_lc1_leftOrAbove = (drawer.T26_sy <= y1);
			} else if(x1 == x2) {
				drawer.T26_lc1_horizontal = false;
				drawer.T26_lc1_vertical = true;
				drawer.T26_lc1_borderX = x1;
				drawer.T26_lc1_leftOrAbove = (drawer.T26_sx <= x1);
			} else {
				drawer.T26_lc1_horizontal = false;
				drawer.T26_lc1_vertical = false;
				drawer.T26_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T26_lc1_C = x1 - drawer.T26_lc1_m * y1;
				drawer.T26_lc1_leftOrAbove = (drawer.T26_sx < drawer.T26_lc1_m*drawer.T26_sy + drawer.T26_lc1_C);
			}

			if(y2 == y3) {
				drawer.T26_lc2_horizontal = true;
				drawer.T26_lc2_vertical = false;
				drawer.T26_lc2_borderY = y2;
				drawer.T26_lc2_leftOrAbove = (drawer.T26_sy <= y2);
			} else if(x2 == x3) {
				drawer.T26_lc2_horizontal = false;
				drawer.T26_lc2_vertical = true;
				drawer.T26_lc2_borderX = x2;
				drawer.T26_lc2_leftOrAbove = (drawer.T26_sx <= x2);
			} else {
				drawer.T26_lc2_horizontal = false;
				drawer.T26_lc2_vertical = false;
				drawer.T26_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T26_lc2_C = x2 - drawer.T26_lc2_m * y2;
				drawer.T26_lc2_leftOrAbove = (drawer.T26_sx < drawer.T26_lc2_m*drawer.T26_sy + drawer.T26_lc2_C);
			}

			if(y3 == y1) {
				drawer.T26_lc3_horizontal = true;
				drawer.T26_lc3_vertical = false;
				drawer.T26_lc3_borderY = y3;
				drawer.T26_lc3_leftOrAbove = (drawer.T26_sy <= y3);
			} else if(x3 == x1) {
				drawer.T26_lc3_horizontal = false;
				drawer.T26_lc3_vertical = true;
				drawer.T26_lc3_borderX = x3;
				drawer.T26_lc3_leftOrAbove = (drawer.T26_sx <= x3);
			} else {
				drawer.T26_lc3_horizontal = false;
				drawer.T26_lc3_vertical = false;
				drawer.T26_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T26_lc3_C = x3 - drawer.T26_lc3_m * y3;
				drawer.T26_lc3_leftOrAbove = (drawer.T26_sx < drawer.T26_lc3_m*drawer.T26_sy + drawer.T26_lc3_C);
			}

			drawer.T26_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T26_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T26_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T26_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T26_initializedWithValidData = true;
		}

		t = triangles[27]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T27_r = t.r; drawer.T27_g = t.g; drawer.T27_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T27_initializedWithValidData = false;
		} else {

			drawer.T27_sx = (x1 + x2 + x3) / 3.0;
			drawer.T27_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T27_lc1_horizontal = true;
				drawer.T27_lc1_vertical = false;
				drawer.T27_lc1_borderY = y1;
				drawer.T27_lc1_leftOrAbove = (drawer.T27_sy <= y1);
			} else if(x1 == x2) {
				drawer.T27_lc1_horizontal = false;
				drawer.T27_lc1_vertical = true;
				drawer.T27_lc1_borderX = x1;
				drawer.T27_lc1_leftOrAbove = (drawer.T27_sx <= x1);
			} else {
				drawer.T27_lc1_horizontal = false;
				drawer.T27_lc1_vertical = false;
				drawer.T27_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T27_lc1_C = x1 - drawer.T27_lc1_m * y1;
				drawer.T27_lc1_leftOrAbove = (drawer.T27_sx < drawer.T27_lc1_m*drawer.T27_sy + drawer.T27_lc1_C);
			}

			if(y2 == y3) {
				drawer.T27_lc2_horizontal = true;
				drawer.T27_lc2_vertical = false;
				drawer.T27_lc2_borderY = y2;
				drawer.T27_lc2_leftOrAbove = (drawer.T27_sy <= y2);
			} else if(x2 == x3) {
				drawer.T27_lc2_horizontal = false;
				drawer.T27_lc2_vertical = true;
				drawer.T27_lc2_borderX = x2;
				drawer.T27_lc2_leftOrAbove = (drawer.T27_sx <= x2);
			} else {
				drawer.T27_lc2_horizontal = false;
				drawer.T27_lc2_vertical = false;
				drawer.T27_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T27_lc2_C = x2 - drawer.T27_lc2_m * y2;
				drawer.T27_lc2_leftOrAbove = (drawer.T27_sx < drawer.T27_lc2_m*drawer.T27_sy + drawer.T27_lc2_C);
			}

			if(y3 == y1) {
				drawer.T27_lc3_horizontal = true;
				drawer.T27_lc3_vertical = false;
				drawer.T27_lc3_borderY = y3;
				drawer.T27_lc3_leftOrAbove = (drawer.T27_sy <= y3);
			} else if(x3 == x1) {
				drawer.T27_lc3_horizontal = false;
				drawer.T27_lc3_vertical = true;
				drawer.T27_lc3_borderX = x3;
				drawer.T27_lc3_leftOrAbove = (drawer.T27_sx <= x3);
			} else {
				drawer.T27_lc3_horizontal = false;
				drawer.T27_lc3_vertical = false;
				drawer.T27_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T27_lc3_C = x3 - drawer.T27_lc3_m * y3;
				drawer.T27_lc3_leftOrAbove = (drawer.T27_sx < drawer.T27_lc3_m*drawer.T27_sy + drawer.T27_lc3_C);
			}

			drawer.T27_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T27_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T27_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T27_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T27_initializedWithValidData = true;
		}

		t = triangles[28]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T28_r = t.r; drawer.T28_g = t.g; drawer.T28_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T28_initializedWithValidData = false;
		} else {

			drawer.T28_sx = (x1 + x2 + x3) / 3.0;
			drawer.T28_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T28_lc1_horizontal = true;
				drawer.T28_lc1_vertical = false;
				drawer.T28_lc1_borderY = y1;
				drawer.T28_lc1_leftOrAbove = (drawer.T28_sy <= y1);
			} else if(x1 == x2) {
				drawer.T28_lc1_horizontal = false;
				drawer.T28_lc1_vertical = true;
				drawer.T28_lc1_borderX = x1;
				drawer.T28_lc1_leftOrAbove = (drawer.T28_sx <= x1);
			} else {
				drawer.T28_lc1_horizontal = false;
				drawer.T28_lc1_vertical = false;
				drawer.T28_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T28_lc1_C = x1 - drawer.T28_lc1_m * y1;
				drawer.T28_lc1_leftOrAbove = (drawer.T28_sx < drawer.T28_lc1_m*drawer.T28_sy + drawer.T28_lc1_C);
			}

			if(y2 == y3) {
				drawer.T28_lc2_horizontal = true;
				drawer.T28_lc2_vertical = false;
				drawer.T28_lc2_borderY = y2;
				drawer.T28_lc2_leftOrAbove = (drawer.T28_sy <= y2);
			} else if(x2 == x3) {
				drawer.T28_lc2_horizontal = false;
				drawer.T28_lc2_vertical = true;
				drawer.T28_lc2_borderX = x2;
				drawer.T28_lc2_leftOrAbove = (drawer.T28_sx <= x2);
			} else {
				drawer.T28_lc2_horizontal = false;
				drawer.T28_lc2_vertical = false;
				drawer.T28_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T28_lc2_C = x2 - drawer.T28_lc2_m * y2;
				drawer.T28_lc2_leftOrAbove = (drawer.T28_sx < drawer.T28_lc2_m*drawer.T28_sy + drawer.T28_lc2_C);
			}

			if(y3 == y1) {
				drawer.T28_lc3_horizontal = true;
				drawer.T28_lc3_vertical = false;
				drawer.T28_lc3_borderY = y3;
				drawer.T28_lc3_leftOrAbove = (drawer.T28_sy <= y3);
			} else if(x3 == x1) {
				drawer.T28_lc3_horizontal = false;
				drawer.T28_lc3_vertical = true;
				drawer.T28_lc3_borderX = x3;
				drawer.T28_lc3_leftOrAbove = (drawer.T28_sx <= x3);
			} else {
				drawer.T28_lc3_horizontal = false;
				drawer.T28_lc3_vertical = false;
				drawer.T28_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T28_lc3_C = x3 - drawer.T28_lc3_m * y3;
				drawer.T28_lc3_leftOrAbove = (drawer.T28_sx < drawer.T28_lc3_m*drawer.T28_sy + drawer.T28_lc3_C);
			}

			drawer.T28_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T28_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T28_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T28_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T28_initializedWithValidData = true;
		}

		t = triangles[29]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T29_r = t.r; drawer.T29_g = t.g; drawer.T29_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T29_initializedWithValidData = false;
		} else {

			drawer.T29_sx = (x1 + x2 + x3) / 3.0;
			drawer.T29_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T29_lc1_horizontal = true;
				drawer.T29_lc1_vertical = false;
				drawer.T29_lc1_borderY = y1;
				drawer.T29_lc1_leftOrAbove = (drawer.T29_sy <= y1);
			} else if(x1 == x2) {
				drawer.T29_lc1_horizontal = false;
				drawer.T29_lc1_vertical = true;
				drawer.T29_lc1_borderX = x1;
				drawer.T29_lc1_leftOrAbove = (drawer.T29_sx <= x1);
			} else {
				drawer.T29_lc1_horizontal = false;
				drawer.T29_lc1_vertical = false;
				drawer.T29_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T29_lc1_C = x1 - drawer.T29_lc1_m * y1;
				drawer.T29_lc1_leftOrAbove = (drawer.T29_sx < drawer.T29_lc1_m*drawer.T29_sy + drawer.T29_lc1_C);
			}

			if(y2 == y3) {
				drawer.T29_lc2_horizontal = true;
				drawer.T29_lc2_vertical = false;
				drawer.T29_lc2_borderY = y2;
				drawer.T29_lc2_leftOrAbove = (drawer.T29_sy <= y2);
			} else if(x2 == x3) {
				drawer.T29_lc2_horizontal = false;
				drawer.T29_lc2_vertical = true;
				drawer.T29_lc2_borderX = x2;
				drawer.T29_lc2_leftOrAbove = (drawer.T29_sx <= x2);
			} else {
				drawer.T29_lc2_horizontal = false;
				drawer.T29_lc2_vertical = false;
				drawer.T29_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T29_lc2_C = x2 - drawer.T29_lc2_m * y2;
				drawer.T29_lc2_leftOrAbove = (drawer.T29_sx < drawer.T29_lc2_m*drawer.T29_sy + drawer.T29_lc2_C);
			}

			if(y3 == y1) {
				drawer.T29_lc3_horizontal = true;
				drawer.T29_lc3_vertical = false;
				drawer.T29_lc3_borderY = y3;
				drawer.T29_lc3_leftOrAbove = (drawer.T29_sy <= y3);
			} else if(x3 == x1) {
				drawer.T29_lc3_horizontal = false;
				drawer.T29_lc3_vertical = true;
				drawer.T29_lc3_borderX = x3;
				drawer.T29_lc3_leftOrAbove = (drawer.T29_sx <= x3);
			} else {
				drawer.T29_lc3_horizontal = false;
				drawer.T29_lc3_vertical = false;
				drawer.T29_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T29_lc3_C = x3 - drawer.T29_lc3_m * y3;
				drawer.T29_lc3_leftOrAbove = (drawer.T29_sx < drawer.T29_lc3_m*drawer.T29_sy + drawer.T29_lc3_C);
			}

			drawer.T29_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T29_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T29_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T29_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T29_initializedWithValidData = true;
		}
	}

	public void loadTriangles2(SingleTriangle[] triangles) {
		int x1, y1, x2, y2, x3, y3;
		SingleTriangle t;

		t = triangles[30]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T30_r = t.r; drawer.T30_g = t.g; drawer.T30_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T30_initializedWithValidData = false;
		} else {

			drawer.T30_sx = (x1 + x2 + x3) / 3.0;
			drawer.T30_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T30_lc1_horizontal = true;
				drawer.T30_lc1_vertical = false;
				drawer.T30_lc1_borderY = y1;
				drawer.T30_lc1_leftOrAbove = (drawer.T30_sy <= y1);
			} else if(x1 == x2) {
				drawer.T30_lc1_horizontal = false;
				drawer.T30_lc1_vertical = true;
				drawer.T30_lc1_borderX = x1;
				drawer.T30_lc1_leftOrAbove = (drawer.T30_sx <= x1);
			} else {
				drawer.T30_lc1_horizontal = false;
				drawer.T30_lc1_vertical = false;
				drawer.T30_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T30_lc1_C = x1 - drawer.T30_lc1_m * y1;
				drawer.T30_lc1_leftOrAbove = (drawer.T30_sx < drawer.T30_lc1_m*drawer.T30_sy + drawer.T30_lc1_C);
			}

			if(y2 == y3) {
				drawer.T30_lc2_horizontal = true;
				drawer.T30_lc2_vertical = false;
				drawer.T30_lc2_borderY = y2;
				drawer.T30_lc2_leftOrAbove = (drawer.T30_sy <= y2);
			} else if(x2 == x3) {
				drawer.T30_lc2_horizontal = false;
				drawer.T30_lc2_vertical = true;
				drawer.T30_lc2_borderX = x2;
				drawer.T30_lc2_leftOrAbove = (drawer.T30_sx <= x2);
			} else {
				drawer.T30_lc2_horizontal = false;
				drawer.T30_lc2_vertical = false;
				drawer.T30_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T30_lc2_C = x2 - drawer.T30_lc2_m * y2;
				drawer.T30_lc2_leftOrAbove = (drawer.T30_sx < drawer.T30_lc2_m*drawer.T30_sy + drawer.T30_lc2_C);
			}

			if(y3 == y1) {
				drawer.T30_lc3_horizontal = true;
				drawer.T30_lc3_vertical = false;
				drawer.T30_lc3_borderY = y3;
				drawer.T30_lc3_leftOrAbove = (drawer.T30_sy <= y3);
			} else if(x3 == x1) {
				drawer.T30_lc3_horizontal = false;
				drawer.T30_lc3_vertical = true;
				drawer.T30_lc3_borderX = x3;
				drawer.T30_lc3_leftOrAbove = (drawer.T30_sx <= x3);
			} else {
				drawer.T30_lc3_horizontal = false;
				drawer.T30_lc3_vertical = false;
				drawer.T30_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T30_lc3_C = x3 - drawer.T30_lc3_m * y3;
				drawer.T30_lc3_leftOrAbove = (drawer.T30_sx < drawer.T30_lc3_m*drawer.T30_sy + drawer.T30_lc3_C);
			}

			drawer.T30_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T30_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T30_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T30_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T30_initializedWithValidData = true;
		}

		t = triangles[31]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T31_r = t.r; drawer.T31_g = t.g; drawer.T31_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T31_initializedWithValidData = false;
		} else {

			drawer.T31_sx = (x1 + x2 + x3) / 3.0;
			drawer.T31_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T31_lc1_horizontal = true;
				drawer.T31_lc1_vertical = false;
				drawer.T31_lc1_borderY = y1;
				drawer.T31_lc1_leftOrAbove = (drawer.T31_sy <= y1);
			} else if(x1 == x2) {
				drawer.T31_lc1_horizontal = false;
				drawer.T31_lc1_vertical = true;
				drawer.T31_lc1_borderX = x1;
				drawer.T31_lc1_leftOrAbove = (drawer.T31_sx <= x1);
			} else {
				drawer.T31_lc1_horizontal = false;
				drawer.T31_lc1_vertical = false;
				drawer.T31_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T31_lc1_C = x1 - drawer.T31_lc1_m * y1;
				drawer.T31_lc1_leftOrAbove = (drawer.T31_sx < drawer.T31_lc1_m*drawer.T31_sy + drawer.T31_lc1_C);
			}

			if(y2 == y3) {
				drawer.T31_lc2_horizontal = true;
				drawer.T31_lc2_vertical = false;
				drawer.T31_lc2_borderY = y2;
				drawer.T31_lc2_leftOrAbove = (drawer.T31_sy <= y2);
			} else if(x2 == x3) {
				drawer.T31_lc2_horizontal = false;
				drawer.T31_lc2_vertical = true;
				drawer.T31_lc2_borderX = x2;
				drawer.T31_lc2_leftOrAbove = (drawer.T31_sx <= x2);
			} else {
				drawer.T31_lc2_horizontal = false;
				drawer.T31_lc2_vertical = false;
				drawer.T31_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T31_lc2_C = x2 - drawer.T31_lc2_m * y2;
				drawer.T31_lc2_leftOrAbove = (drawer.T31_sx < drawer.T31_lc2_m*drawer.T31_sy + drawer.T31_lc2_C);
			}

			if(y3 == y1) {
				drawer.T31_lc3_horizontal = true;
				drawer.T31_lc3_vertical = false;
				drawer.T31_lc3_borderY = y3;
				drawer.T31_lc3_leftOrAbove = (drawer.T31_sy <= y3);
			} else if(x3 == x1) {
				drawer.T31_lc3_horizontal = false;
				drawer.T31_lc3_vertical = true;
				drawer.T31_lc3_borderX = x3;
				drawer.T31_lc3_leftOrAbove = (drawer.T31_sx <= x3);
			} else {
				drawer.T31_lc3_horizontal = false;
				drawer.T31_lc3_vertical = false;
				drawer.T31_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T31_lc3_C = x3 - drawer.T31_lc3_m * y3;
				drawer.T31_lc3_leftOrAbove = (drawer.T31_sx < drawer.T31_lc3_m*drawer.T31_sy + drawer.T31_lc3_C);
			}

			drawer.T31_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T31_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T31_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T31_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T31_initializedWithValidData = true;
		}

		t = triangles[32]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T32_r = t.r; drawer.T32_g = t.g; drawer.T32_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T32_initializedWithValidData = false;
		} else {

			drawer.T32_sx = (x1 + x2 + x3) / 3.0;
			drawer.T32_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T32_lc1_horizontal = true;
				drawer.T32_lc1_vertical = false;
				drawer.T32_lc1_borderY = y1;
				drawer.T32_lc1_leftOrAbove = (drawer.T32_sy <= y1);
			} else if(x1 == x2) {
				drawer.T32_lc1_horizontal = false;
				drawer.T32_lc1_vertical = true;
				drawer.T32_lc1_borderX = x1;
				drawer.T32_lc1_leftOrAbove = (drawer.T32_sx <= x1);
			} else {
				drawer.T32_lc1_horizontal = false;
				drawer.T32_lc1_vertical = false;
				drawer.T32_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T32_lc1_C = x1 - drawer.T32_lc1_m * y1;
				drawer.T32_lc1_leftOrAbove = (drawer.T32_sx < drawer.T32_lc1_m*drawer.T32_sy + drawer.T32_lc1_C);
			}

			if(y2 == y3) {
				drawer.T32_lc2_horizontal = true;
				drawer.T32_lc2_vertical = false;
				drawer.T32_lc2_borderY = y2;
				drawer.T32_lc2_leftOrAbove = (drawer.T32_sy <= y2);
			} else if(x2 == x3) {
				drawer.T32_lc2_horizontal = false;
				drawer.T32_lc2_vertical = true;
				drawer.T32_lc2_borderX = x2;
				drawer.T32_lc2_leftOrAbove = (drawer.T32_sx <= x2);
			} else {
				drawer.T32_lc2_horizontal = false;
				drawer.T32_lc2_vertical = false;
				drawer.T32_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T32_lc2_C = x2 - drawer.T32_lc2_m * y2;
				drawer.T32_lc2_leftOrAbove = (drawer.T32_sx < drawer.T32_lc2_m*drawer.T32_sy + drawer.T32_lc2_C);
			}

			if(y3 == y1) {
				drawer.T32_lc3_horizontal = true;
				drawer.T32_lc3_vertical = false;
				drawer.T32_lc3_borderY = y3;
				drawer.T32_lc3_leftOrAbove = (drawer.T32_sy <= y3);
			} else if(x3 == x1) {
				drawer.T32_lc3_horizontal = false;
				drawer.T32_lc3_vertical = true;
				drawer.T32_lc3_borderX = x3;
				drawer.T32_lc3_leftOrAbove = (drawer.T32_sx <= x3);
			} else {
				drawer.T32_lc3_horizontal = false;
				drawer.T32_lc3_vertical = false;
				drawer.T32_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T32_lc3_C = x3 - drawer.T32_lc3_m * y3;
				drawer.T32_lc3_leftOrAbove = (drawer.T32_sx < drawer.T32_lc3_m*drawer.T32_sy + drawer.T32_lc3_C);
			}

			drawer.T32_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T32_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T32_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T32_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T32_initializedWithValidData = true;
		}

		t = triangles[33]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T33_r = t.r; drawer.T33_g = t.g; drawer.T33_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T33_initializedWithValidData = false;
		} else {

			drawer.T33_sx = (x1 + x2 + x3) / 3.0;
			drawer.T33_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T33_lc1_horizontal = true;
				drawer.T33_lc1_vertical = false;
				drawer.T33_lc1_borderY = y1;
				drawer.T33_lc1_leftOrAbove = (drawer.T33_sy <= y1);
			} else if(x1 == x2) {
				drawer.T33_lc1_horizontal = false;
				drawer.T33_lc1_vertical = true;
				drawer.T33_lc1_borderX = x1;
				drawer.T33_lc1_leftOrAbove = (drawer.T33_sx <= x1);
			} else {
				drawer.T33_lc1_horizontal = false;
				drawer.T33_lc1_vertical = false;
				drawer.T33_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T33_lc1_C = x1 - drawer.T33_lc1_m * y1;
				drawer.T33_lc1_leftOrAbove = (drawer.T33_sx < drawer.T33_lc1_m*drawer.T33_sy + drawer.T33_lc1_C);
			}

			if(y2 == y3) {
				drawer.T33_lc2_horizontal = true;
				drawer.T33_lc2_vertical = false;
				drawer.T33_lc2_borderY = y2;
				drawer.T33_lc2_leftOrAbove = (drawer.T33_sy <= y2);
			} else if(x2 == x3) {
				drawer.T33_lc2_horizontal = false;
				drawer.T33_lc2_vertical = true;
				drawer.T33_lc2_borderX = x2;
				drawer.T33_lc2_leftOrAbove = (drawer.T33_sx <= x2);
			} else {
				drawer.T33_lc2_horizontal = false;
				drawer.T33_lc2_vertical = false;
				drawer.T33_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T33_lc2_C = x2 - drawer.T33_lc2_m * y2;
				drawer.T33_lc2_leftOrAbove = (drawer.T33_sx < drawer.T33_lc2_m*drawer.T33_sy + drawer.T33_lc2_C);
			}

			if(y3 == y1) {
				drawer.T33_lc3_horizontal = true;
				drawer.T33_lc3_vertical = false;
				drawer.T33_lc3_borderY = y3;
				drawer.T33_lc3_leftOrAbove = (drawer.T33_sy <= y3);
			} else if(x3 == x1) {
				drawer.T33_lc3_horizontal = false;
				drawer.T33_lc3_vertical = true;
				drawer.T33_lc3_borderX = x3;
				drawer.T33_lc3_leftOrAbove = (drawer.T33_sx <= x3);
			} else {
				drawer.T33_lc3_horizontal = false;
				drawer.T33_lc3_vertical = false;
				drawer.T33_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T33_lc3_C = x3 - drawer.T33_lc3_m * y3;
				drawer.T33_lc3_leftOrAbove = (drawer.T33_sx < drawer.T33_lc3_m*drawer.T33_sy + drawer.T33_lc3_C);
			}

			drawer.T33_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T33_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T33_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T33_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T33_initializedWithValidData = true;
		}

		t = triangles[34]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T34_r = t.r; drawer.T34_g = t.g; drawer.T34_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T34_initializedWithValidData = false;
		} else {

			drawer.T34_sx = (x1 + x2 + x3) / 3.0;
			drawer.T34_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T34_lc1_horizontal = true;
				drawer.T34_lc1_vertical = false;
				drawer.T34_lc1_borderY = y1;
				drawer.T34_lc1_leftOrAbove = (drawer.T34_sy <= y1);
			} else if(x1 == x2) {
				drawer.T34_lc1_horizontal = false;
				drawer.T34_lc1_vertical = true;
				drawer.T34_lc1_borderX = x1;
				drawer.T34_lc1_leftOrAbove = (drawer.T34_sx <= x1);
			} else {
				drawer.T34_lc1_horizontal = false;
				drawer.T34_lc1_vertical = false;
				drawer.T34_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T34_lc1_C = x1 - drawer.T34_lc1_m * y1;
				drawer.T34_lc1_leftOrAbove = (drawer.T34_sx < drawer.T34_lc1_m*drawer.T34_sy + drawer.T34_lc1_C);
			}

			if(y2 == y3) {
				drawer.T34_lc2_horizontal = true;
				drawer.T34_lc2_vertical = false;
				drawer.T34_lc2_borderY = y2;
				drawer.T34_lc2_leftOrAbove = (drawer.T34_sy <= y2);
			} else if(x2 == x3) {
				drawer.T34_lc2_horizontal = false;
				drawer.T34_lc2_vertical = true;
				drawer.T34_lc2_borderX = x2;
				drawer.T34_lc2_leftOrAbove = (drawer.T34_sx <= x2);
			} else {
				drawer.T34_lc2_horizontal = false;
				drawer.T34_lc2_vertical = false;
				drawer.T34_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T34_lc2_C = x2 - drawer.T34_lc2_m * y2;
				drawer.T34_lc2_leftOrAbove = (drawer.T34_sx < drawer.T34_lc2_m*drawer.T34_sy + drawer.T34_lc2_C);
			}

			if(y3 == y1) {
				drawer.T34_lc3_horizontal = true;
				drawer.T34_lc3_vertical = false;
				drawer.T34_lc3_borderY = y3;
				drawer.T34_lc3_leftOrAbove = (drawer.T34_sy <= y3);
			} else if(x3 == x1) {
				drawer.T34_lc3_horizontal = false;
				drawer.T34_lc3_vertical = true;
				drawer.T34_lc3_borderX = x3;
				drawer.T34_lc3_leftOrAbove = (drawer.T34_sx <= x3);
			} else {
				drawer.T34_lc3_horizontal = false;
				drawer.T34_lc3_vertical = false;
				drawer.T34_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T34_lc3_C = x3 - drawer.T34_lc3_m * y3;
				drawer.T34_lc3_leftOrAbove = (drawer.T34_sx < drawer.T34_lc3_m*drawer.T34_sy + drawer.T34_lc3_C);
			}

			drawer.T34_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T34_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T34_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T34_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T34_initializedWithValidData = true;
		}

		t = triangles[35]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T35_r = t.r; drawer.T35_g = t.g; drawer.T35_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T35_initializedWithValidData = false;
		} else {

			drawer.T35_sx = (x1 + x2 + x3) / 3.0;
			drawer.T35_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T35_lc1_horizontal = true;
				drawer.T35_lc1_vertical = false;
				drawer.T35_lc1_borderY = y1;
				drawer.T35_lc1_leftOrAbove = (drawer.T35_sy <= y1);
			} else if(x1 == x2) {
				drawer.T35_lc1_horizontal = false;
				drawer.T35_lc1_vertical = true;
				drawer.T35_lc1_borderX = x1;
				drawer.T35_lc1_leftOrAbove = (drawer.T35_sx <= x1);
			} else {
				drawer.T35_lc1_horizontal = false;
				drawer.T35_lc1_vertical = false;
				drawer.T35_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T35_lc1_C = x1 - drawer.T35_lc1_m * y1;
				drawer.T35_lc1_leftOrAbove = (drawer.T35_sx < drawer.T35_lc1_m*drawer.T35_sy + drawer.T35_lc1_C);
			}

			if(y2 == y3) {
				drawer.T35_lc2_horizontal = true;
				drawer.T35_lc2_vertical = false;
				drawer.T35_lc2_borderY = y2;
				drawer.T35_lc2_leftOrAbove = (drawer.T35_sy <= y2);
			} else if(x2 == x3) {
				drawer.T35_lc2_horizontal = false;
				drawer.T35_lc2_vertical = true;
				drawer.T35_lc2_borderX = x2;
				drawer.T35_lc2_leftOrAbove = (drawer.T35_sx <= x2);
			} else {
				drawer.T35_lc2_horizontal = false;
				drawer.T35_lc2_vertical = false;
				drawer.T35_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T35_lc2_C = x2 - drawer.T35_lc2_m * y2;
				drawer.T35_lc2_leftOrAbove = (drawer.T35_sx < drawer.T35_lc2_m*drawer.T35_sy + drawer.T35_lc2_C);
			}

			if(y3 == y1) {
				drawer.T35_lc3_horizontal = true;
				drawer.T35_lc3_vertical = false;
				drawer.T35_lc3_borderY = y3;
				drawer.T35_lc3_leftOrAbove = (drawer.T35_sy <= y3);
			} else if(x3 == x1) {
				drawer.T35_lc3_horizontal = false;
				drawer.T35_lc3_vertical = true;
				drawer.T35_lc3_borderX = x3;
				drawer.T35_lc3_leftOrAbove = (drawer.T35_sx <= x3);
			} else {
				drawer.T35_lc3_horizontal = false;
				drawer.T35_lc3_vertical = false;
				drawer.T35_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T35_lc3_C = x3 - drawer.T35_lc3_m * y3;
				drawer.T35_lc3_leftOrAbove = (drawer.T35_sx < drawer.T35_lc3_m*drawer.T35_sy + drawer.T35_lc3_C);
			}

			drawer.T35_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T35_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T35_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T35_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T35_initializedWithValidData = true;
		}

		t = triangles[36]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T36_r = t.r; drawer.T36_g = t.g; drawer.T36_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T36_initializedWithValidData = false;
		} else {

			drawer.T36_sx = (x1 + x2 + x3) / 3.0;
			drawer.T36_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T36_lc1_horizontal = true;
				drawer.T36_lc1_vertical = false;
				drawer.T36_lc1_borderY = y1;
				drawer.T36_lc1_leftOrAbove = (drawer.T36_sy <= y1);
			} else if(x1 == x2) {
				drawer.T36_lc1_horizontal = false;
				drawer.T36_lc1_vertical = true;
				drawer.T36_lc1_borderX = x1;
				drawer.T36_lc1_leftOrAbove = (drawer.T36_sx <= x1);
			} else {
				drawer.T36_lc1_horizontal = false;
				drawer.T36_lc1_vertical = false;
				drawer.T36_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T36_lc1_C = x1 - drawer.T36_lc1_m * y1;
				drawer.T36_lc1_leftOrAbove = (drawer.T36_sx < drawer.T36_lc1_m*drawer.T36_sy + drawer.T36_lc1_C);
			}

			if(y2 == y3) {
				drawer.T36_lc2_horizontal = true;
				drawer.T36_lc2_vertical = false;
				drawer.T36_lc2_borderY = y2;
				drawer.T36_lc2_leftOrAbove = (drawer.T36_sy <= y2);
			} else if(x2 == x3) {
				drawer.T36_lc2_horizontal = false;
				drawer.T36_lc2_vertical = true;
				drawer.T36_lc2_borderX = x2;
				drawer.T36_lc2_leftOrAbove = (drawer.T36_sx <= x2);
			} else {
				drawer.T36_lc2_horizontal = false;
				drawer.T36_lc2_vertical = false;
				drawer.T36_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T36_lc2_C = x2 - drawer.T36_lc2_m * y2;
				drawer.T36_lc2_leftOrAbove = (drawer.T36_sx < drawer.T36_lc2_m*drawer.T36_sy + drawer.T36_lc2_C);
			}

			if(y3 == y1) {
				drawer.T36_lc3_horizontal = true;
				drawer.T36_lc3_vertical = false;
				drawer.T36_lc3_borderY = y3;
				drawer.T36_lc3_leftOrAbove = (drawer.T36_sy <= y3);
			} else if(x3 == x1) {
				drawer.T36_lc3_horizontal = false;
				drawer.T36_lc3_vertical = true;
				drawer.T36_lc3_borderX = x3;
				drawer.T36_lc3_leftOrAbove = (drawer.T36_sx <= x3);
			} else {
				drawer.T36_lc3_horizontal = false;
				drawer.T36_lc3_vertical = false;
				drawer.T36_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T36_lc3_C = x3 - drawer.T36_lc3_m * y3;
				drawer.T36_lc3_leftOrAbove = (drawer.T36_sx < drawer.T36_lc3_m*drawer.T36_sy + drawer.T36_lc3_C);
			}

			drawer.T36_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T36_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T36_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T36_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T36_initializedWithValidData = true;
		}

		t = triangles[37]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T37_r = t.r; drawer.T37_g = t.g; drawer.T37_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T37_initializedWithValidData = false;
		} else {

			drawer.T37_sx = (x1 + x2 + x3) / 3.0;
			drawer.T37_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T37_lc1_horizontal = true;
				drawer.T37_lc1_vertical = false;
				drawer.T37_lc1_borderY = y1;
				drawer.T37_lc1_leftOrAbove = (drawer.T37_sy <= y1);
			} else if(x1 == x2) {
				drawer.T37_lc1_horizontal = false;
				drawer.T37_lc1_vertical = true;
				drawer.T37_lc1_borderX = x1;
				drawer.T37_lc1_leftOrAbove = (drawer.T37_sx <= x1);
			} else {
				drawer.T37_lc1_horizontal = false;
				drawer.T37_lc1_vertical = false;
				drawer.T37_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T37_lc1_C = x1 - drawer.T37_lc1_m * y1;
				drawer.T37_lc1_leftOrAbove = (drawer.T37_sx < drawer.T37_lc1_m*drawer.T37_sy + drawer.T37_lc1_C);
			}

			if(y2 == y3) {
				drawer.T37_lc2_horizontal = true;
				drawer.T37_lc2_vertical = false;
				drawer.T37_lc2_borderY = y2;
				drawer.T37_lc2_leftOrAbove = (drawer.T37_sy <= y2);
			} else if(x2 == x3) {
				drawer.T37_lc2_horizontal = false;
				drawer.T37_lc2_vertical = true;
				drawer.T37_lc2_borderX = x2;
				drawer.T37_lc2_leftOrAbove = (drawer.T37_sx <= x2);
			} else {
				drawer.T37_lc2_horizontal = false;
				drawer.T37_lc2_vertical = false;
				drawer.T37_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T37_lc2_C = x2 - drawer.T37_lc2_m * y2;
				drawer.T37_lc2_leftOrAbove = (drawer.T37_sx < drawer.T37_lc2_m*drawer.T37_sy + drawer.T37_lc2_C);
			}

			if(y3 == y1) {
				drawer.T37_lc3_horizontal = true;
				drawer.T37_lc3_vertical = false;
				drawer.T37_lc3_borderY = y3;
				drawer.T37_lc3_leftOrAbove = (drawer.T37_sy <= y3);
			} else if(x3 == x1) {
				drawer.T37_lc3_horizontal = false;
				drawer.T37_lc3_vertical = true;
				drawer.T37_lc3_borderX = x3;
				drawer.T37_lc3_leftOrAbove = (drawer.T37_sx <= x3);
			} else {
				drawer.T37_lc3_horizontal = false;
				drawer.T37_lc3_vertical = false;
				drawer.T37_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T37_lc3_C = x3 - drawer.T37_lc3_m * y3;
				drawer.T37_lc3_leftOrAbove = (drawer.T37_sx < drawer.T37_lc3_m*drawer.T37_sy + drawer.T37_lc3_C);
			}

			drawer.T37_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T37_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T37_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T37_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T37_initializedWithValidData = true;
		}

		t = triangles[38]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T38_r = t.r; drawer.T38_g = t.g; drawer.T38_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T38_initializedWithValidData = false;
		} else {

			drawer.T38_sx = (x1 + x2 + x3) / 3.0;
			drawer.T38_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T38_lc1_horizontal = true;
				drawer.T38_lc1_vertical = false;
				drawer.T38_lc1_borderY = y1;
				drawer.T38_lc1_leftOrAbove = (drawer.T38_sy <= y1);
			} else if(x1 == x2) {
				drawer.T38_lc1_horizontal = false;
				drawer.T38_lc1_vertical = true;
				drawer.T38_lc1_borderX = x1;
				drawer.T38_lc1_leftOrAbove = (drawer.T38_sx <= x1);
			} else {
				drawer.T38_lc1_horizontal = false;
				drawer.T38_lc1_vertical = false;
				drawer.T38_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T38_lc1_C = x1 - drawer.T38_lc1_m * y1;
				drawer.T38_lc1_leftOrAbove = (drawer.T38_sx < drawer.T38_lc1_m*drawer.T38_sy + drawer.T38_lc1_C);
			}

			if(y2 == y3) {
				drawer.T38_lc2_horizontal = true;
				drawer.T38_lc2_vertical = false;
				drawer.T38_lc2_borderY = y2;
				drawer.T38_lc2_leftOrAbove = (drawer.T38_sy <= y2);
			} else if(x2 == x3) {
				drawer.T38_lc2_horizontal = false;
				drawer.T38_lc2_vertical = true;
				drawer.T38_lc2_borderX = x2;
				drawer.T38_lc2_leftOrAbove = (drawer.T38_sx <= x2);
			} else {
				drawer.T38_lc2_horizontal = false;
				drawer.T38_lc2_vertical = false;
				drawer.T38_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T38_lc2_C = x2 - drawer.T38_lc2_m * y2;
				drawer.T38_lc2_leftOrAbove = (drawer.T38_sx < drawer.T38_lc2_m*drawer.T38_sy + drawer.T38_lc2_C);
			}

			if(y3 == y1) {
				drawer.T38_lc3_horizontal = true;
				drawer.T38_lc3_vertical = false;
				drawer.T38_lc3_borderY = y3;
				drawer.T38_lc3_leftOrAbove = (drawer.T38_sy <= y3);
			} else if(x3 == x1) {
				drawer.T38_lc3_horizontal = false;
				drawer.T38_lc3_vertical = true;
				drawer.T38_lc3_borderX = x3;
				drawer.T38_lc3_leftOrAbove = (drawer.T38_sx <= x3);
			} else {
				drawer.T38_lc3_horizontal = false;
				drawer.T38_lc3_vertical = false;
				drawer.T38_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T38_lc3_C = x3 - drawer.T38_lc3_m * y3;
				drawer.T38_lc3_leftOrAbove = (drawer.T38_sx < drawer.T38_lc3_m*drawer.T38_sy + drawer.T38_lc3_C);
			}

			drawer.T38_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T38_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T38_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T38_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T38_initializedWithValidData = true;
		}

		t = triangles[39]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T39_r = t.r; drawer.T39_g = t.g; drawer.T39_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T39_initializedWithValidData = false;
		} else {

			drawer.T39_sx = (x1 + x2 + x3) / 3.0;
			drawer.T39_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T39_lc1_horizontal = true;
				drawer.T39_lc1_vertical = false;
				drawer.T39_lc1_borderY = y1;
				drawer.T39_lc1_leftOrAbove = (drawer.T39_sy <= y1);
			} else if(x1 == x2) {
				drawer.T39_lc1_horizontal = false;
				drawer.T39_lc1_vertical = true;
				drawer.T39_lc1_borderX = x1;
				drawer.T39_lc1_leftOrAbove = (drawer.T39_sx <= x1);
			} else {
				drawer.T39_lc1_horizontal = false;
				drawer.T39_lc1_vertical = false;
				drawer.T39_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T39_lc1_C = x1 - drawer.T39_lc1_m * y1;
				drawer.T39_lc1_leftOrAbove = (drawer.T39_sx < drawer.T39_lc1_m*drawer.T39_sy + drawer.T39_lc1_C);
			}

			if(y2 == y3) {
				drawer.T39_lc2_horizontal = true;
				drawer.T39_lc2_vertical = false;
				drawer.T39_lc2_borderY = y2;
				drawer.T39_lc2_leftOrAbove = (drawer.T39_sy <= y2);
			} else if(x2 == x3) {
				drawer.T39_lc2_horizontal = false;
				drawer.T39_lc2_vertical = true;
				drawer.T39_lc2_borderX = x2;
				drawer.T39_lc2_leftOrAbove = (drawer.T39_sx <= x2);
			} else {
				drawer.T39_lc2_horizontal = false;
				drawer.T39_lc2_vertical = false;
				drawer.T39_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T39_lc2_C = x2 - drawer.T39_lc2_m * y2;
				drawer.T39_lc2_leftOrAbove = (drawer.T39_sx < drawer.T39_lc2_m*drawer.T39_sy + drawer.T39_lc2_C);
			}

			if(y3 == y1) {
				drawer.T39_lc3_horizontal = true;
				drawer.T39_lc3_vertical = false;
				drawer.T39_lc3_borderY = y3;
				drawer.T39_lc3_leftOrAbove = (drawer.T39_sy <= y3);
			} else if(x3 == x1) {
				drawer.T39_lc3_horizontal = false;
				drawer.T39_lc3_vertical = true;
				drawer.T39_lc3_borderX = x3;
				drawer.T39_lc3_leftOrAbove = (drawer.T39_sx <= x3);
			} else {
				drawer.T39_lc3_horizontal = false;
				drawer.T39_lc3_vertical = false;
				drawer.T39_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T39_lc3_C = x3 - drawer.T39_lc3_m * y3;
				drawer.T39_lc3_leftOrAbove = (drawer.T39_sx < drawer.T39_lc3_m*drawer.T39_sy + drawer.T39_lc3_C);
			}

			drawer.T39_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T39_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T39_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T39_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T39_initializedWithValidData = true;
		}

		t = triangles[40]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T40_r = t.r; drawer.T40_g = t.g; drawer.T40_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T40_initializedWithValidData = false;
		} else {

			drawer.T40_sx = (x1 + x2 + x3) / 3.0;
			drawer.T40_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T40_lc1_horizontal = true;
				drawer.T40_lc1_vertical = false;
				drawer.T40_lc1_borderY = y1;
				drawer.T40_lc1_leftOrAbove = (drawer.T40_sy <= y1);
			} else if(x1 == x2) {
				drawer.T40_lc1_horizontal = false;
				drawer.T40_lc1_vertical = true;
				drawer.T40_lc1_borderX = x1;
				drawer.T40_lc1_leftOrAbove = (drawer.T40_sx <= x1);
			} else {
				drawer.T40_lc1_horizontal = false;
				drawer.T40_lc1_vertical = false;
				drawer.T40_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T40_lc1_C = x1 - drawer.T40_lc1_m * y1;
				drawer.T40_lc1_leftOrAbove = (drawer.T40_sx < drawer.T40_lc1_m*drawer.T40_sy + drawer.T40_lc1_C);
			}

			if(y2 == y3) {
				drawer.T40_lc2_horizontal = true;
				drawer.T40_lc2_vertical = false;
				drawer.T40_lc2_borderY = y2;
				drawer.T40_lc2_leftOrAbove = (drawer.T40_sy <= y2);
			} else if(x2 == x3) {
				drawer.T40_lc2_horizontal = false;
				drawer.T40_lc2_vertical = true;
				drawer.T40_lc2_borderX = x2;
				drawer.T40_lc2_leftOrAbove = (drawer.T40_sx <= x2);
			} else {
				drawer.T40_lc2_horizontal = false;
				drawer.T40_lc2_vertical = false;
				drawer.T40_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T40_lc2_C = x2 - drawer.T40_lc2_m * y2;
				drawer.T40_lc2_leftOrAbove = (drawer.T40_sx < drawer.T40_lc2_m*drawer.T40_sy + drawer.T40_lc2_C);
			}

			if(y3 == y1) {
				drawer.T40_lc3_horizontal = true;
				drawer.T40_lc3_vertical = false;
				drawer.T40_lc3_borderY = y3;
				drawer.T40_lc3_leftOrAbove = (drawer.T40_sy <= y3);
			} else if(x3 == x1) {
				drawer.T40_lc3_horizontal = false;
				drawer.T40_lc3_vertical = true;
				drawer.T40_lc3_borderX = x3;
				drawer.T40_lc3_leftOrAbove = (drawer.T40_sx <= x3);
			} else {
				drawer.T40_lc3_horizontal = false;
				drawer.T40_lc3_vertical = false;
				drawer.T40_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T40_lc3_C = x3 - drawer.T40_lc3_m * y3;
				drawer.T40_lc3_leftOrAbove = (drawer.T40_sx < drawer.T40_lc3_m*drawer.T40_sy + drawer.T40_lc3_C);
			}

			drawer.T40_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T40_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T40_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T40_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T40_initializedWithValidData = true;
		}

		t = triangles[41]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T41_r = t.r; drawer.T41_g = t.g; drawer.T41_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T41_initializedWithValidData = false;
		} else {

			drawer.T41_sx = (x1 + x2 + x3) / 3.0;
			drawer.T41_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T41_lc1_horizontal = true;
				drawer.T41_lc1_vertical = false;
				drawer.T41_lc1_borderY = y1;
				drawer.T41_lc1_leftOrAbove = (drawer.T41_sy <= y1);
			} else if(x1 == x2) {
				drawer.T41_lc1_horizontal = false;
				drawer.T41_lc1_vertical = true;
				drawer.T41_lc1_borderX = x1;
				drawer.T41_lc1_leftOrAbove = (drawer.T41_sx <= x1);
			} else {
				drawer.T41_lc1_horizontal = false;
				drawer.T41_lc1_vertical = false;
				drawer.T41_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T41_lc1_C = x1 - drawer.T41_lc1_m * y1;
				drawer.T41_lc1_leftOrAbove = (drawer.T41_sx < drawer.T41_lc1_m*drawer.T41_sy + drawer.T41_lc1_C);
			}

			if(y2 == y3) {
				drawer.T41_lc2_horizontal = true;
				drawer.T41_lc2_vertical = false;
				drawer.T41_lc2_borderY = y2;
				drawer.T41_lc2_leftOrAbove = (drawer.T41_sy <= y2);
			} else if(x2 == x3) {
				drawer.T41_lc2_horizontal = false;
				drawer.T41_lc2_vertical = true;
				drawer.T41_lc2_borderX = x2;
				drawer.T41_lc2_leftOrAbove = (drawer.T41_sx <= x2);
			} else {
				drawer.T41_lc2_horizontal = false;
				drawer.T41_lc2_vertical = false;
				drawer.T41_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T41_lc2_C = x2 - drawer.T41_lc2_m * y2;
				drawer.T41_lc2_leftOrAbove = (drawer.T41_sx < drawer.T41_lc2_m*drawer.T41_sy + drawer.T41_lc2_C);
			}

			if(y3 == y1) {
				drawer.T41_lc3_horizontal = true;
				drawer.T41_lc3_vertical = false;
				drawer.T41_lc3_borderY = y3;
				drawer.T41_lc3_leftOrAbove = (drawer.T41_sy <= y3);
			} else if(x3 == x1) {
				drawer.T41_lc3_horizontal = false;
				drawer.T41_lc3_vertical = true;
				drawer.T41_lc3_borderX = x3;
				drawer.T41_lc3_leftOrAbove = (drawer.T41_sx <= x3);
			} else {
				drawer.T41_lc3_horizontal = false;
				drawer.T41_lc3_vertical = false;
				drawer.T41_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T41_lc3_C = x3 - drawer.T41_lc3_m * y3;
				drawer.T41_lc3_leftOrAbove = (drawer.T41_sx < drawer.T41_lc3_m*drawer.T41_sy + drawer.T41_lc3_C);
			}

			drawer.T41_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T41_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T41_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T41_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T41_initializedWithValidData = true;
		}

		t = triangles[42]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T42_r = t.r; drawer.T42_g = t.g; drawer.T42_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T42_initializedWithValidData = false;
		} else {

			drawer.T42_sx = (x1 + x2 + x3) / 3.0;
			drawer.T42_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T42_lc1_horizontal = true;
				drawer.T42_lc1_vertical = false;
				drawer.T42_lc1_borderY = y1;
				drawer.T42_lc1_leftOrAbove = (drawer.T42_sy <= y1);
			} else if(x1 == x2) {
				drawer.T42_lc1_horizontal = false;
				drawer.T42_lc1_vertical = true;
				drawer.T42_lc1_borderX = x1;
				drawer.T42_lc1_leftOrAbove = (drawer.T42_sx <= x1);
			} else {
				drawer.T42_lc1_horizontal = false;
				drawer.T42_lc1_vertical = false;
				drawer.T42_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T42_lc1_C = x1 - drawer.T42_lc1_m * y1;
				drawer.T42_lc1_leftOrAbove = (drawer.T42_sx < drawer.T42_lc1_m*drawer.T42_sy + drawer.T42_lc1_C);
			}

			if(y2 == y3) {
				drawer.T42_lc2_horizontal = true;
				drawer.T42_lc2_vertical = false;
				drawer.T42_lc2_borderY = y2;
				drawer.T42_lc2_leftOrAbove = (drawer.T42_sy <= y2);
			} else if(x2 == x3) {
				drawer.T42_lc2_horizontal = false;
				drawer.T42_lc2_vertical = true;
				drawer.T42_lc2_borderX = x2;
				drawer.T42_lc2_leftOrAbove = (drawer.T42_sx <= x2);
			} else {
				drawer.T42_lc2_horizontal = false;
				drawer.T42_lc2_vertical = false;
				drawer.T42_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T42_lc2_C = x2 - drawer.T42_lc2_m * y2;
				drawer.T42_lc2_leftOrAbove = (drawer.T42_sx < drawer.T42_lc2_m*drawer.T42_sy + drawer.T42_lc2_C);
			}

			if(y3 == y1) {
				drawer.T42_lc3_horizontal = true;
				drawer.T42_lc3_vertical = false;
				drawer.T42_lc3_borderY = y3;
				drawer.T42_lc3_leftOrAbove = (drawer.T42_sy <= y3);
			} else if(x3 == x1) {
				drawer.T42_lc3_horizontal = false;
				drawer.T42_lc3_vertical = true;
				drawer.T42_lc3_borderX = x3;
				drawer.T42_lc3_leftOrAbove = (drawer.T42_sx <= x3);
			} else {
				drawer.T42_lc3_horizontal = false;
				drawer.T42_lc3_vertical = false;
				drawer.T42_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T42_lc3_C = x3 - drawer.T42_lc3_m * y3;
				drawer.T42_lc3_leftOrAbove = (drawer.T42_sx < drawer.T42_lc3_m*drawer.T42_sy + drawer.T42_lc3_C);
			}

			drawer.T42_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T42_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T42_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T42_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T42_initializedWithValidData = true;
		}

		t = triangles[43]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T43_r = t.r; drawer.T43_g = t.g; drawer.T43_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T43_initializedWithValidData = false;
		} else {

			drawer.T43_sx = (x1 + x2 + x3) / 3.0;
			drawer.T43_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T43_lc1_horizontal = true;
				drawer.T43_lc1_vertical = false;
				drawer.T43_lc1_borderY = y1;
				drawer.T43_lc1_leftOrAbove = (drawer.T43_sy <= y1);
			} else if(x1 == x2) {
				drawer.T43_lc1_horizontal = false;
				drawer.T43_lc1_vertical = true;
				drawer.T43_lc1_borderX = x1;
				drawer.T43_lc1_leftOrAbove = (drawer.T43_sx <= x1);
			} else {
				drawer.T43_lc1_horizontal = false;
				drawer.T43_lc1_vertical = false;
				drawer.T43_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T43_lc1_C = x1 - drawer.T43_lc1_m * y1;
				drawer.T43_lc1_leftOrAbove = (drawer.T43_sx < drawer.T43_lc1_m*drawer.T43_sy + drawer.T43_lc1_C);
			}

			if(y2 == y3) {
				drawer.T43_lc2_horizontal = true;
				drawer.T43_lc2_vertical = false;
				drawer.T43_lc2_borderY = y2;
				drawer.T43_lc2_leftOrAbove = (drawer.T43_sy <= y2);
			} else if(x2 == x3) {
				drawer.T43_lc2_horizontal = false;
				drawer.T43_lc2_vertical = true;
				drawer.T43_lc2_borderX = x2;
				drawer.T43_lc2_leftOrAbove = (drawer.T43_sx <= x2);
			} else {
				drawer.T43_lc2_horizontal = false;
				drawer.T43_lc2_vertical = false;
				drawer.T43_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T43_lc2_C = x2 - drawer.T43_lc2_m * y2;
				drawer.T43_lc2_leftOrAbove = (drawer.T43_sx < drawer.T43_lc2_m*drawer.T43_sy + drawer.T43_lc2_C);
			}

			if(y3 == y1) {
				drawer.T43_lc3_horizontal = true;
				drawer.T43_lc3_vertical = false;
				drawer.T43_lc3_borderY = y3;
				drawer.T43_lc3_leftOrAbove = (drawer.T43_sy <= y3);
			} else if(x3 == x1) {
				drawer.T43_lc3_horizontal = false;
				drawer.T43_lc3_vertical = true;
				drawer.T43_lc3_borderX = x3;
				drawer.T43_lc3_leftOrAbove = (drawer.T43_sx <= x3);
			} else {
				drawer.T43_lc3_horizontal = false;
				drawer.T43_lc3_vertical = false;
				drawer.T43_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T43_lc3_C = x3 - drawer.T43_lc3_m * y3;
				drawer.T43_lc3_leftOrAbove = (drawer.T43_sx < drawer.T43_lc3_m*drawer.T43_sy + drawer.T43_lc3_C);
			}

			drawer.T43_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T43_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T43_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T43_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T43_initializedWithValidData = true;
		}

		t = triangles[44]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T44_r = t.r; drawer.T44_g = t.g; drawer.T44_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T44_initializedWithValidData = false;
		} else {

			drawer.T44_sx = (x1 + x2 + x3) / 3.0;
			drawer.T44_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T44_lc1_horizontal = true;
				drawer.T44_lc1_vertical = false;
				drawer.T44_lc1_borderY = y1;
				drawer.T44_lc1_leftOrAbove = (drawer.T44_sy <= y1);
			} else if(x1 == x2) {
				drawer.T44_lc1_horizontal = false;
				drawer.T44_lc1_vertical = true;
				drawer.T44_lc1_borderX = x1;
				drawer.T44_lc1_leftOrAbove = (drawer.T44_sx <= x1);
			} else {
				drawer.T44_lc1_horizontal = false;
				drawer.T44_lc1_vertical = false;
				drawer.T44_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T44_lc1_C = x1 - drawer.T44_lc1_m * y1;
				drawer.T44_lc1_leftOrAbove = (drawer.T44_sx < drawer.T44_lc1_m*drawer.T44_sy + drawer.T44_lc1_C);
			}

			if(y2 == y3) {
				drawer.T44_lc2_horizontal = true;
				drawer.T44_lc2_vertical = false;
				drawer.T44_lc2_borderY = y2;
				drawer.T44_lc2_leftOrAbove = (drawer.T44_sy <= y2);
			} else if(x2 == x3) {
				drawer.T44_lc2_horizontal = false;
				drawer.T44_lc2_vertical = true;
				drawer.T44_lc2_borderX = x2;
				drawer.T44_lc2_leftOrAbove = (drawer.T44_sx <= x2);
			} else {
				drawer.T44_lc2_horizontal = false;
				drawer.T44_lc2_vertical = false;
				drawer.T44_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T44_lc2_C = x2 - drawer.T44_lc2_m * y2;
				drawer.T44_lc2_leftOrAbove = (drawer.T44_sx < drawer.T44_lc2_m*drawer.T44_sy + drawer.T44_lc2_C);
			}

			if(y3 == y1) {
				drawer.T44_lc3_horizontal = true;
				drawer.T44_lc3_vertical = false;
				drawer.T44_lc3_borderY = y3;
				drawer.T44_lc3_leftOrAbove = (drawer.T44_sy <= y3);
			} else if(x3 == x1) {
				drawer.T44_lc3_horizontal = false;
				drawer.T44_lc3_vertical = true;
				drawer.T44_lc3_borderX = x3;
				drawer.T44_lc3_leftOrAbove = (drawer.T44_sx <= x3);
			} else {
				drawer.T44_lc3_horizontal = false;
				drawer.T44_lc3_vertical = false;
				drawer.T44_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T44_lc3_C = x3 - drawer.T44_lc3_m * y3;
				drawer.T44_lc3_leftOrAbove = (drawer.T44_sx < drawer.T44_lc3_m*drawer.T44_sy + drawer.T44_lc3_C);
			}

			drawer.T44_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T44_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T44_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T44_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T44_initializedWithValidData = true;
		}

		t = triangles[45]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T45_r = t.r; drawer.T45_g = t.g; drawer.T45_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T45_initializedWithValidData = false;
		} else {

			drawer.T45_sx = (x1 + x2 + x3) / 3.0;
			drawer.T45_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T45_lc1_horizontal = true;
				drawer.T45_lc1_vertical = false;
				drawer.T45_lc1_borderY = y1;
				drawer.T45_lc1_leftOrAbove = (drawer.T45_sy <= y1);
			} else if(x1 == x2) {
				drawer.T45_lc1_horizontal = false;
				drawer.T45_lc1_vertical = true;
				drawer.T45_lc1_borderX = x1;
				drawer.T45_lc1_leftOrAbove = (drawer.T45_sx <= x1);
			} else {
				drawer.T45_lc1_horizontal = false;
				drawer.T45_lc1_vertical = false;
				drawer.T45_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T45_lc1_C = x1 - drawer.T45_lc1_m * y1;
				drawer.T45_lc1_leftOrAbove = (drawer.T45_sx < drawer.T45_lc1_m*drawer.T45_sy + drawer.T45_lc1_C);
			}

			if(y2 == y3) {
				drawer.T45_lc2_horizontal = true;
				drawer.T45_lc2_vertical = false;
				drawer.T45_lc2_borderY = y2;
				drawer.T45_lc2_leftOrAbove = (drawer.T45_sy <= y2);
			} else if(x2 == x3) {
				drawer.T45_lc2_horizontal = false;
				drawer.T45_lc2_vertical = true;
				drawer.T45_lc2_borderX = x2;
				drawer.T45_lc2_leftOrAbove = (drawer.T45_sx <= x2);
			} else {
				drawer.T45_lc2_horizontal = false;
				drawer.T45_lc2_vertical = false;
				drawer.T45_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T45_lc2_C = x2 - drawer.T45_lc2_m * y2;
				drawer.T45_lc2_leftOrAbove = (drawer.T45_sx < drawer.T45_lc2_m*drawer.T45_sy + drawer.T45_lc2_C);
			}

			if(y3 == y1) {
				drawer.T45_lc3_horizontal = true;
				drawer.T45_lc3_vertical = false;
				drawer.T45_lc3_borderY = y3;
				drawer.T45_lc3_leftOrAbove = (drawer.T45_sy <= y3);
			} else if(x3 == x1) {
				drawer.T45_lc3_horizontal = false;
				drawer.T45_lc3_vertical = true;
				drawer.T45_lc3_borderX = x3;
				drawer.T45_lc3_leftOrAbove = (drawer.T45_sx <= x3);
			} else {
				drawer.T45_lc3_horizontal = false;
				drawer.T45_lc3_vertical = false;
				drawer.T45_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T45_lc3_C = x3 - drawer.T45_lc3_m * y3;
				drawer.T45_lc3_leftOrAbove = (drawer.T45_sx < drawer.T45_lc3_m*drawer.T45_sy + drawer.T45_lc3_C);
			}

			drawer.T45_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T45_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T45_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T45_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T45_initializedWithValidData = true;
		}

		t = triangles[46]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T46_r = t.r; drawer.T46_g = t.g; drawer.T46_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T46_initializedWithValidData = false;
		} else {

			drawer.T46_sx = (x1 + x2 + x3) / 3.0;
			drawer.T46_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T46_lc1_horizontal = true;
				drawer.T46_lc1_vertical = false;
				drawer.T46_lc1_borderY = y1;
				drawer.T46_lc1_leftOrAbove = (drawer.T46_sy <= y1);
			} else if(x1 == x2) {
				drawer.T46_lc1_horizontal = false;
				drawer.T46_lc1_vertical = true;
				drawer.T46_lc1_borderX = x1;
				drawer.T46_lc1_leftOrAbove = (drawer.T46_sx <= x1);
			} else {
				drawer.T46_lc1_horizontal = false;
				drawer.T46_lc1_vertical = false;
				drawer.T46_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T46_lc1_C = x1 - drawer.T46_lc1_m * y1;
				drawer.T46_lc1_leftOrAbove = (drawer.T46_sx < drawer.T46_lc1_m*drawer.T46_sy + drawer.T46_lc1_C);
			}

			if(y2 == y3) {
				drawer.T46_lc2_horizontal = true;
				drawer.T46_lc2_vertical = false;
				drawer.T46_lc2_borderY = y2;
				drawer.T46_lc2_leftOrAbove = (drawer.T46_sy <= y2);
			} else if(x2 == x3) {
				drawer.T46_lc2_horizontal = false;
				drawer.T46_lc2_vertical = true;
				drawer.T46_lc2_borderX = x2;
				drawer.T46_lc2_leftOrAbove = (drawer.T46_sx <= x2);
			} else {
				drawer.T46_lc2_horizontal = false;
				drawer.T46_lc2_vertical = false;
				drawer.T46_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T46_lc2_C = x2 - drawer.T46_lc2_m * y2;
				drawer.T46_lc2_leftOrAbove = (drawer.T46_sx < drawer.T46_lc2_m*drawer.T46_sy + drawer.T46_lc2_C);
			}

			if(y3 == y1) {
				drawer.T46_lc3_horizontal = true;
				drawer.T46_lc3_vertical = false;
				drawer.T46_lc3_borderY = y3;
				drawer.T46_lc3_leftOrAbove = (drawer.T46_sy <= y3);
			} else if(x3 == x1) {
				drawer.T46_lc3_horizontal = false;
				drawer.T46_lc3_vertical = true;
				drawer.T46_lc3_borderX = x3;
				drawer.T46_lc3_leftOrAbove = (drawer.T46_sx <= x3);
			} else {
				drawer.T46_lc3_horizontal = false;
				drawer.T46_lc3_vertical = false;
				drawer.T46_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T46_lc3_C = x3 - drawer.T46_lc3_m * y3;
				drawer.T46_lc3_leftOrAbove = (drawer.T46_sx < drawer.T46_lc3_m*drawer.T46_sy + drawer.T46_lc3_C);
			}

			drawer.T46_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T46_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T46_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T46_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T46_initializedWithValidData = true;
		}

		t = triangles[47]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T47_r = t.r; drawer.T47_g = t.g; drawer.T47_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T47_initializedWithValidData = false;
		} else {

			drawer.T47_sx = (x1 + x2 + x3) / 3.0;
			drawer.T47_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T47_lc1_horizontal = true;
				drawer.T47_lc1_vertical = false;
				drawer.T47_lc1_borderY = y1;
				drawer.T47_lc1_leftOrAbove = (drawer.T47_sy <= y1);
			} else if(x1 == x2) {
				drawer.T47_lc1_horizontal = false;
				drawer.T47_lc1_vertical = true;
				drawer.T47_lc1_borderX = x1;
				drawer.T47_lc1_leftOrAbove = (drawer.T47_sx <= x1);
			} else {
				drawer.T47_lc1_horizontal = false;
				drawer.T47_lc1_vertical = false;
				drawer.T47_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T47_lc1_C = x1 - drawer.T47_lc1_m * y1;
				drawer.T47_lc1_leftOrAbove = (drawer.T47_sx < drawer.T47_lc1_m*drawer.T47_sy + drawer.T47_lc1_C);
			}

			if(y2 == y3) {
				drawer.T47_lc2_horizontal = true;
				drawer.T47_lc2_vertical = false;
				drawer.T47_lc2_borderY = y2;
				drawer.T47_lc2_leftOrAbove = (drawer.T47_sy <= y2);
			} else if(x2 == x3) {
				drawer.T47_lc2_horizontal = false;
				drawer.T47_lc2_vertical = true;
				drawer.T47_lc2_borderX = x2;
				drawer.T47_lc2_leftOrAbove = (drawer.T47_sx <= x2);
			} else {
				drawer.T47_lc2_horizontal = false;
				drawer.T47_lc2_vertical = false;
				drawer.T47_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T47_lc2_C = x2 - drawer.T47_lc2_m * y2;
				drawer.T47_lc2_leftOrAbove = (drawer.T47_sx < drawer.T47_lc2_m*drawer.T47_sy + drawer.T47_lc2_C);
			}

			if(y3 == y1) {
				drawer.T47_lc3_horizontal = true;
				drawer.T47_lc3_vertical = false;
				drawer.T47_lc3_borderY = y3;
				drawer.T47_lc3_leftOrAbove = (drawer.T47_sy <= y3);
			} else if(x3 == x1) {
				drawer.T47_lc3_horizontal = false;
				drawer.T47_lc3_vertical = true;
				drawer.T47_lc3_borderX = x3;
				drawer.T47_lc3_leftOrAbove = (drawer.T47_sx <= x3);
			} else {
				drawer.T47_lc3_horizontal = false;
				drawer.T47_lc3_vertical = false;
				drawer.T47_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T47_lc3_C = x3 - drawer.T47_lc3_m * y3;
				drawer.T47_lc3_leftOrAbove = (drawer.T47_sx < drawer.T47_lc3_m*drawer.T47_sy + drawer.T47_lc3_C);
			}

			drawer.T47_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T47_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T47_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T47_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T47_initializedWithValidData = true;
		}

		t = triangles[48]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T48_r = t.r; drawer.T48_g = t.g; drawer.T48_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T48_initializedWithValidData = false;
		} else {

			drawer.T48_sx = (x1 + x2 + x3) / 3.0;
			drawer.T48_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T48_lc1_horizontal = true;
				drawer.T48_lc1_vertical = false;
				drawer.T48_lc1_borderY = y1;
				drawer.T48_lc1_leftOrAbove = (drawer.T48_sy <= y1);
			} else if(x1 == x2) {
				drawer.T48_lc1_horizontal = false;
				drawer.T48_lc1_vertical = true;
				drawer.T48_lc1_borderX = x1;
				drawer.T48_lc1_leftOrAbove = (drawer.T48_sx <= x1);
			} else {
				drawer.T48_lc1_horizontal = false;
				drawer.T48_lc1_vertical = false;
				drawer.T48_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T48_lc1_C = x1 - drawer.T48_lc1_m * y1;
				drawer.T48_lc1_leftOrAbove = (drawer.T48_sx < drawer.T48_lc1_m*drawer.T48_sy + drawer.T48_lc1_C);
			}

			if(y2 == y3) {
				drawer.T48_lc2_horizontal = true;
				drawer.T48_lc2_vertical = false;
				drawer.T48_lc2_borderY = y2;
				drawer.T48_lc2_leftOrAbove = (drawer.T48_sy <= y2);
			} else if(x2 == x3) {
				drawer.T48_lc2_horizontal = false;
				drawer.T48_lc2_vertical = true;
				drawer.T48_lc2_borderX = x2;
				drawer.T48_lc2_leftOrAbove = (drawer.T48_sx <= x2);
			} else {
				drawer.T48_lc2_horizontal = false;
				drawer.T48_lc2_vertical = false;
				drawer.T48_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T48_lc2_C = x2 - drawer.T48_lc2_m * y2;
				drawer.T48_lc2_leftOrAbove = (drawer.T48_sx < drawer.T48_lc2_m*drawer.T48_sy + drawer.T48_lc2_C);
			}

			if(y3 == y1) {
				drawer.T48_lc3_horizontal = true;
				drawer.T48_lc3_vertical = false;
				drawer.T48_lc3_borderY = y3;
				drawer.T48_lc3_leftOrAbove = (drawer.T48_sy <= y3);
			} else if(x3 == x1) {
				drawer.T48_lc3_horizontal = false;
				drawer.T48_lc3_vertical = true;
				drawer.T48_lc3_borderX = x3;
				drawer.T48_lc3_leftOrAbove = (drawer.T48_sx <= x3);
			} else {
				drawer.T48_lc3_horizontal = false;
				drawer.T48_lc3_vertical = false;
				drawer.T48_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T48_lc3_C = x3 - drawer.T48_lc3_m * y3;
				drawer.T48_lc3_leftOrAbove = (drawer.T48_sx < drawer.T48_lc3_m*drawer.T48_sy + drawer.T48_lc3_C);
			}

			drawer.T48_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T48_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T48_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T48_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T48_initializedWithValidData = true;
		}

		t = triangles[49]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T49_r = t.r; drawer.T49_g = t.g; drawer.T49_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T49_initializedWithValidData = false;
		} else {

			drawer.T49_sx = (x1 + x2 + x3) / 3.0;
			drawer.T49_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T49_lc1_horizontal = true;
				drawer.T49_lc1_vertical = false;
				drawer.T49_lc1_borderY = y1;
				drawer.T49_lc1_leftOrAbove = (drawer.T49_sy <= y1);
			} else if(x1 == x2) {
				drawer.T49_lc1_horizontal = false;
				drawer.T49_lc1_vertical = true;
				drawer.T49_lc1_borderX = x1;
				drawer.T49_lc1_leftOrAbove = (drawer.T49_sx <= x1);
			} else {
				drawer.T49_lc1_horizontal = false;
				drawer.T49_lc1_vertical = false;
				drawer.T49_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T49_lc1_C = x1 - drawer.T49_lc1_m * y1;
				drawer.T49_lc1_leftOrAbove = (drawer.T49_sx < drawer.T49_lc1_m*drawer.T49_sy + drawer.T49_lc1_C);
			}

			if(y2 == y3) {
				drawer.T49_lc2_horizontal = true;
				drawer.T49_lc2_vertical = false;
				drawer.T49_lc2_borderY = y2;
				drawer.T49_lc2_leftOrAbove = (drawer.T49_sy <= y2);
			} else if(x2 == x3) {
				drawer.T49_lc2_horizontal = false;
				drawer.T49_lc2_vertical = true;
				drawer.T49_lc2_borderX = x2;
				drawer.T49_lc2_leftOrAbove = (drawer.T49_sx <= x2);
			} else {
				drawer.T49_lc2_horizontal = false;
				drawer.T49_lc2_vertical = false;
				drawer.T49_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T49_lc2_C = x2 - drawer.T49_lc2_m * y2;
				drawer.T49_lc2_leftOrAbove = (drawer.T49_sx < drawer.T49_lc2_m*drawer.T49_sy + drawer.T49_lc2_C);
			}

			if(y3 == y1) {
				drawer.T49_lc3_horizontal = true;
				drawer.T49_lc3_vertical = false;
				drawer.T49_lc3_borderY = y3;
				drawer.T49_lc3_leftOrAbove = (drawer.T49_sy <= y3);
			} else if(x3 == x1) {
				drawer.T49_lc3_horizontal = false;
				drawer.T49_lc3_vertical = true;
				drawer.T49_lc3_borderX = x3;
				drawer.T49_lc3_leftOrAbove = (drawer.T49_sx <= x3);
			} else {
				drawer.T49_lc3_horizontal = false;
				drawer.T49_lc3_vertical = false;
				drawer.T49_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T49_lc3_C = x3 - drawer.T49_lc3_m * y3;
				drawer.T49_lc3_leftOrAbove = (drawer.T49_sx < drawer.T49_lc3_m*drawer.T49_sy + drawer.T49_lc3_C);
			}

			drawer.T49_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T49_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T49_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T49_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T49_initializedWithValidData = true;
		}

		t = triangles[50]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T50_r = t.r; drawer.T50_g = t.g; drawer.T50_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T50_initializedWithValidData = false;
		} else {

			drawer.T50_sx = (x1 + x2 + x3) / 3.0;
			drawer.T50_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T50_lc1_horizontal = true;
				drawer.T50_lc1_vertical = false;
				drawer.T50_lc1_borderY = y1;
				drawer.T50_lc1_leftOrAbove = (drawer.T50_sy <= y1);
			} else if(x1 == x2) {
				drawer.T50_lc1_horizontal = false;
				drawer.T50_lc1_vertical = true;
				drawer.T50_lc1_borderX = x1;
				drawer.T50_lc1_leftOrAbove = (drawer.T50_sx <= x1);
			} else {
				drawer.T50_lc1_horizontal = false;
				drawer.T50_lc1_vertical = false;
				drawer.T50_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T50_lc1_C = x1 - drawer.T50_lc1_m * y1;
				drawer.T50_lc1_leftOrAbove = (drawer.T50_sx < drawer.T50_lc1_m*drawer.T50_sy + drawer.T50_lc1_C);
			}

			if(y2 == y3) {
				drawer.T50_lc2_horizontal = true;
				drawer.T50_lc2_vertical = false;
				drawer.T50_lc2_borderY = y2;
				drawer.T50_lc2_leftOrAbove = (drawer.T50_sy <= y2);
			} else if(x2 == x3) {
				drawer.T50_lc2_horizontal = false;
				drawer.T50_lc2_vertical = true;
				drawer.T50_lc2_borderX = x2;
				drawer.T50_lc2_leftOrAbove = (drawer.T50_sx <= x2);
			} else {
				drawer.T50_lc2_horizontal = false;
				drawer.T50_lc2_vertical = false;
				drawer.T50_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T50_lc2_C = x2 - drawer.T50_lc2_m * y2;
				drawer.T50_lc2_leftOrAbove = (drawer.T50_sx < drawer.T50_lc2_m*drawer.T50_sy + drawer.T50_lc2_C);
			}

			if(y3 == y1) {
				drawer.T50_lc3_horizontal = true;
				drawer.T50_lc3_vertical = false;
				drawer.T50_lc3_borderY = y3;
				drawer.T50_lc3_leftOrAbove = (drawer.T50_sy <= y3);
			} else if(x3 == x1) {
				drawer.T50_lc3_horizontal = false;
				drawer.T50_lc3_vertical = true;
				drawer.T50_lc3_borderX = x3;
				drawer.T50_lc3_leftOrAbove = (drawer.T50_sx <= x3);
			} else {
				drawer.T50_lc3_horizontal = false;
				drawer.T50_lc3_vertical = false;
				drawer.T50_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T50_lc3_C = x3 - drawer.T50_lc3_m * y3;
				drawer.T50_lc3_leftOrAbove = (drawer.T50_sx < drawer.T50_lc3_m*drawer.T50_sy + drawer.T50_lc3_C);
			}

			drawer.T50_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T50_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T50_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T50_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T50_initializedWithValidData = true;
		}

		t = triangles[51]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T51_r = t.r; drawer.T51_g = t.g; drawer.T51_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T51_initializedWithValidData = false;
		} else {

			drawer.T51_sx = (x1 + x2 + x3) / 3.0;
			drawer.T51_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T51_lc1_horizontal = true;
				drawer.T51_lc1_vertical = false;
				drawer.T51_lc1_borderY = y1;
				drawer.T51_lc1_leftOrAbove = (drawer.T51_sy <= y1);
			} else if(x1 == x2) {
				drawer.T51_lc1_horizontal = false;
				drawer.T51_lc1_vertical = true;
				drawer.T51_lc1_borderX = x1;
				drawer.T51_lc1_leftOrAbove = (drawer.T51_sx <= x1);
			} else {
				drawer.T51_lc1_horizontal = false;
				drawer.T51_lc1_vertical = false;
				drawer.T51_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T51_lc1_C = x1 - drawer.T51_lc1_m * y1;
				drawer.T51_lc1_leftOrAbove = (drawer.T51_sx < drawer.T51_lc1_m*drawer.T51_sy + drawer.T51_lc1_C);
			}

			if(y2 == y3) {
				drawer.T51_lc2_horizontal = true;
				drawer.T51_lc2_vertical = false;
				drawer.T51_lc2_borderY = y2;
				drawer.T51_lc2_leftOrAbove = (drawer.T51_sy <= y2);
			} else if(x2 == x3) {
				drawer.T51_lc2_horizontal = false;
				drawer.T51_lc2_vertical = true;
				drawer.T51_lc2_borderX = x2;
				drawer.T51_lc2_leftOrAbove = (drawer.T51_sx <= x2);
			} else {
				drawer.T51_lc2_horizontal = false;
				drawer.T51_lc2_vertical = false;
				drawer.T51_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T51_lc2_C = x2 - drawer.T51_lc2_m * y2;
				drawer.T51_lc2_leftOrAbove = (drawer.T51_sx < drawer.T51_lc2_m*drawer.T51_sy + drawer.T51_lc2_C);
			}

			if(y3 == y1) {
				drawer.T51_lc3_horizontal = true;
				drawer.T51_lc3_vertical = false;
				drawer.T51_lc3_borderY = y3;
				drawer.T51_lc3_leftOrAbove = (drawer.T51_sy <= y3);
			} else if(x3 == x1) {
				drawer.T51_lc3_horizontal = false;
				drawer.T51_lc3_vertical = true;
				drawer.T51_lc3_borderX = x3;
				drawer.T51_lc3_leftOrAbove = (drawer.T51_sx <= x3);
			} else {
				drawer.T51_lc3_horizontal = false;
				drawer.T51_lc3_vertical = false;
				drawer.T51_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T51_lc3_C = x3 - drawer.T51_lc3_m * y3;
				drawer.T51_lc3_leftOrAbove = (drawer.T51_sx < drawer.T51_lc3_m*drawer.T51_sy + drawer.T51_lc3_C);
			}

			drawer.T51_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T51_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T51_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T51_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T51_initializedWithValidData = true;
		}

		t = triangles[52]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T52_r = t.r; drawer.T52_g = t.g; drawer.T52_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T52_initializedWithValidData = false;
		} else {

			drawer.T52_sx = (x1 + x2 + x3) / 3.0;
			drawer.T52_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T52_lc1_horizontal = true;
				drawer.T52_lc1_vertical = false;
				drawer.T52_lc1_borderY = y1;
				drawer.T52_lc1_leftOrAbove = (drawer.T52_sy <= y1);
			} else if(x1 == x2) {
				drawer.T52_lc1_horizontal = false;
				drawer.T52_lc1_vertical = true;
				drawer.T52_lc1_borderX = x1;
				drawer.T52_lc1_leftOrAbove = (drawer.T52_sx <= x1);
			} else {
				drawer.T52_lc1_horizontal = false;
				drawer.T52_lc1_vertical = false;
				drawer.T52_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T52_lc1_C = x1 - drawer.T52_lc1_m * y1;
				drawer.T52_lc1_leftOrAbove = (drawer.T52_sx < drawer.T52_lc1_m*drawer.T52_sy + drawer.T52_lc1_C);
			}

			if(y2 == y3) {
				drawer.T52_lc2_horizontal = true;
				drawer.T52_lc2_vertical = false;
				drawer.T52_lc2_borderY = y2;
				drawer.T52_lc2_leftOrAbove = (drawer.T52_sy <= y2);
			} else if(x2 == x3) {
				drawer.T52_lc2_horizontal = false;
				drawer.T52_lc2_vertical = true;
				drawer.T52_lc2_borderX = x2;
				drawer.T52_lc2_leftOrAbove = (drawer.T52_sx <= x2);
			} else {
				drawer.T52_lc2_horizontal = false;
				drawer.T52_lc2_vertical = false;
				drawer.T52_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T52_lc2_C = x2 - drawer.T52_lc2_m * y2;
				drawer.T52_lc2_leftOrAbove = (drawer.T52_sx < drawer.T52_lc2_m*drawer.T52_sy + drawer.T52_lc2_C);
			}

			if(y3 == y1) {
				drawer.T52_lc3_horizontal = true;
				drawer.T52_lc3_vertical = false;
				drawer.T52_lc3_borderY = y3;
				drawer.T52_lc3_leftOrAbove = (drawer.T52_sy <= y3);
			} else if(x3 == x1) {
				drawer.T52_lc3_horizontal = false;
				drawer.T52_lc3_vertical = true;
				drawer.T52_lc3_borderX = x3;
				drawer.T52_lc3_leftOrAbove = (drawer.T52_sx <= x3);
			} else {
				drawer.T52_lc3_horizontal = false;
				drawer.T52_lc3_vertical = false;
				drawer.T52_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T52_lc3_C = x3 - drawer.T52_lc3_m * y3;
				drawer.T52_lc3_leftOrAbove = (drawer.T52_sx < drawer.T52_lc3_m*drawer.T52_sy + drawer.T52_lc3_C);
			}

			drawer.T52_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T52_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T52_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T52_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T52_initializedWithValidData = true;
		}

		t = triangles[53]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T53_r = t.r; drawer.T53_g = t.g; drawer.T53_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T53_initializedWithValidData = false;
		} else {

			drawer.T53_sx = (x1 + x2 + x3) / 3.0;
			drawer.T53_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T53_lc1_horizontal = true;
				drawer.T53_lc1_vertical = false;
				drawer.T53_lc1_borderY = y1;
				drawer.T53_lc1_leftOrAbove = (drawer.T53_sy <= y1);
			} else if(x1 == x2) {
				drawer.T53_lc1_horizontal = false;
				drawer.T53_lc1_vertical = true;
				drawer.T53_lc1_borderX = x1;
				drawer.T53_lc1_leftOrAbove = (drawer.T53_sx <= x1);
			} else {
				drawer.T53_lc1_horizontal = false;
				drawer.T53_lc1_vertical = false;
				drawer.T53_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T53_lc1_C = x1 - drawer.T53_lc1_m * y1;
				drawer.T53_lc1_leftOrAbove = (drawer.T53_sx < drawer.T53_lc1_m*drawer.T53_sy + drawer.T53_lc1_C);
			}

			if(y2 == y3) {
				drawer.T53_lc2_horizontal = true;
				drawer.T53_lc2_vertical = false;
				drawer.T53_lc2_borderY = y2;
				drawer.T53_lc2_leftOrAbove = (drawer.T53_sy <= y2);
			} else if(x2 == x3) {
				drawer.T53_lc2_horizontal = false;
				drawer.T53_lc2_vertical = true;
				drawer.T53_lc2_borderX = x2;
				drawer.T53_lc2_leftOrAbove = (drawer.T53_sx <= x2);
			} else {
				drawer.T53_lc2_horizontal = false;
				drawer.T53_lc2_vertical = false;
				drawer.T53_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T53_lc2_C = x2 - drawer.T53_lc2_m * y2;
				drawer.T53_lc2_leftOrAbove = (drawer.T53_sx < drawer.T53_lc2_m*drawer.T53_sy + drawer.T53_lc2_C);
			}

			if(y3 == y1) {
				drawer.T53_lc3_horizontal = true;
				drawer.T53_lc3_vertical = false;
				drawer.T53_lc3_borderY = y3;
				drawer.T53_lc3_leftOrAbove = (drawer.T53_sy <= y3);
			} else if(x3 == x1) {
				drawer.T53_lc3_horizontal = false;
				drawer.T53_lc3_vertical = true;
				drawer.T53_lc3_borderX = x3;
				drawer.T53_lc3_leftOrAbove = (drawer.T53_sx <= x3);
			} else {
				drawer.T53_lc3_horizontal = false;
				drawer.T53_lc3_vertical = false;
				drawer.T53_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T53_lc3_C = x3 - drawer.T53_lc3_m * y3;
				drawer.T53_lc3_leftOrAbove = (drawer.T53_sx < drawer.T53_lc3_m*drawer.T53_sy + drawer.T53_lc3_C);
			}

			drawer.T53_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T53_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T53_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T53_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T53_initializedWithValidData = true;
		}

		t = triangles[54]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T54_r = t.r; drawer.T54_g = t.g; drawer.T54_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T54_initializedWithValidData = false;
		} else {

			drawer.T54_sx = (x1 + x2 + x3) / 3.0;
			drawer.T54_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T54_lc1_horizontal = true;
				drawer.T54_lc1_vertical = false;
				drawer.T54_lc1_borderY = y1;
				drawer.T54_lc1_leftOrAbove = (drawer.T54_sy <= y1);
			} else if(x1 == x2) {
				drawer.T54_lc1_horizontal = false;
				drawer.T54_lc1_vertical = true;
				drawer.T54_lc1_borderX = x1;
				drawer.T54_lc1_leftOrAbove = (drawer.T54_sx <= x1);
			} else {
				drawer.T54_lc1_horizontal = false;
				drawer.T54_lc1_vertical = false;
				drawer.T54_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T54_lc1_C = x1 - drawer.T54_lc1_m * y1;
				drawer.T54_lc1_leftOrAbove = (drawer.T54_sx < drawer.T54_lc1_m*drawer.T54_sy + drawer.T54_lc1_C);
			}

			if(y2 == y3) {
				drawer.T54_lc2_horizontal = true;
				drawer.T54_lc2_vertical = false;
				drawer.T54_lc2_borderY = y2;
				drawer.T54_lc2_leftOrAbove = (drawer.T54_sy <= y2);
			} else if(x2 == x3) {
				drawer.T54_lc2_horizontal = false;
				drawer.T54_lc2_vertical = true;
				drawer.T54_lc2_borderX = x2;
				drawer.T54_lc2_leftOrAbove = (drawer.T54_sx <= x2);
			} else {
				drawer.T54_lc2_horizontal = false;
				drawer.T54_lc2_vertical = false;
				drawer.T54_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T54_lc2_C = x2 - drawer.T54_lc2_m * y2;
				drawer.T54_lc2_leftOrAbove = (drawer.T54_sx < drawer.T54_lc2_m*drawer.T54_sy + drawer.T54_lc2_C);
			}

			if(y3 == y1) {
				drawer.T54_lc3_horizontal = true;
				drawer.T54_lc3_vertical = false;
				drawer.T54_lc3_borderY = y3;
				drawer.T54_lc3_leftOrAbove = (drawer.T54_sy <= y3);
			} else if(x3 == x1) {
				drawer.T54_lc3_horizontal = false;
				drawer.T54_lc3_vertical = true;
				drawer.T54_lc3_borderX = x3;
				drawer.T54_lc3_leftOrAbove = (drawer.T54_sx <= x3);
			} else {
				drawer.T54_lc3_horizontal = false;
				drawer.T54_lc3_vertical = false;
				drawer.T54_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T54_lc3_C = x3 - drawer.T54_lc3_m * y3;
				drawer.T54_lc3_leftOrAbove = (drawer.T54_sx < drawer.T54_lc3_m*drawer.T54_sy + drawer.T54_lc3_C);
			}

			drawer.T54_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T54_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T54_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T54_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T54_initializedWithValidData = true;
		}

		t = triangles[55]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T55_r = t.r; drawer.T55_g = t.g; drawer.T55_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T55_initializedWithValidData = false;
		} else {

			drawer.T55_sx = (x1 + x2 + x3) / 3.0;
			drawer.T55_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T55_lc1_horizontal = true;
				drawer.T55_lc1_vertical = false;
				drawer.T55_lc1_borderY = y1;
				drawer.T55_lc1_leftOrAbove = (drawer.T55_sy <= y1);
			} else if(x1 == x2) {
				drawer.T55_lc1_horizontal = false;
				drawer.T55_lc1_vertical = true;
				drawer.T55_lc1_borderX = x1;
				drawer.T55_lc1_leftOrAbove = (drawer.T55_sx <= x1);
			} else {
				drawer.T55_lc1_horizontal = false;
				drawer.T55_lc1_vertical = false;
				drawer.T55_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T55_lc1_C = x1 - drawer.T55_lc1_m * y1;
				drawer.T55_lc1_leftOrAbove = (drawer.T55_sx < drawer.T55_lc1_m*drawer.T55_sy + drawer.T55_lc1_C);
			}

			if(y2 == y3) {
				drawer.T55_lc2_horizontal = true;
				drawer.T55_lc2_vertical = false;
				drawer.T55_lc2_borderY = y2;
				drawer.T55_lc2_leftOrAbove = (drawer.T55_sy <= y2);
			} else if(x2 == x3) {
				drawer.T55_lc2_horizontal = false;
				drawer.T55_lc2_vertical = true;
				drawer.T55_lc2_borderX = x2;
				drawer.T55_lc2_leftOrAbove = (drawer.T55_sx <= x2);
			} else {
				drawer.T55_lc2_horizontal = false;
				drawer.T55_lc2_vertical = false;
				drawer.T55_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T55_lc2_C = x2 - drawer.T55_lc2_m * y2;
				drawer.T55_lc2_leftOrAbove = (drawer.T55_sx < drawer.T55_lc2_m*drawer.T55_sy + drawer.T55_lc2_C);
			}

			if(y3 == y1) {
				drawer.T55_lc3_horizontal = true;
				drawer.T55_lc3_vertical = false;
				drawer.T55_lc3_borderY = y3;
				drawer.T55_lc3_leftOrAbove = (drawer.T55_sy <= y3);
			} else if(x3 == x1) {
				drawer.T55_lc3_horizontal = false;
				drawer.T55_lc3_vertical = true;
				drawer.T55_lc3_borderX = x3;
				drawer.T55_lc3_leftOrAbove = (drawer.T55_sx <= x3);
			} else {
				drawer.T55_lc3_horizontal = false;
				drawer.T55_lc3_vertical = false;
				drawer.T55_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T55_lc3_C = x3 - drawer.T55_lc3_m * y3;
				drawer.T55_lc3_leftOrAbove = (drawer.T55_sx < drawer.T55_lc3_m*drawer.T55_sy + drawer.T55_lc3_C);
			}

			drawer.T55_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T55_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T55_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T55_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T55_initializedWithValidData = true;
		}

		t = triangles[56]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T56_r = t.r; drawer.T56_g = t.g; drawer.T56_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T56_initializedWithValidData = false;
		} else {

			drawer.T56_sx = (x1 + x2 + x3) / 3.0;
			drawer.T56_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T56_lc1_horizontal = true;
				drawer.T56_lc1_vertical = false;
				drawer.T56_lc1_borderY = y1;
				drawer.T56_lc1_leftOrAbove = (drawer.T56_sy <= y1);
			} else if(x1 == x2) {
				drawer.T56_lc1_horizontal = false;
				drawer.T56_lc1_vertical = true;
				drawer.T56_lc1_borderX = x1;
				drawer.T56_lc1_leftOrAbove = (drawer.T56_sx <= x1);
			} else {
				drawer.T56_lc1_horizontal = false;
				drawer.T56_lc1_vertical = false;
				drawer.T56_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T56_lc1_C = x1 - drawer.T56_lc1_m * y1;
				drawer.T56_lc1_leftOrAbove = (drawer.T56_sx < drawer.T56_lc1_m*drawer.T56_sy + drawer.T56_lc1_C);
			}

			if(y2 == y3) {
				drawer.T56_lc2_horizontal = true;
				drawer.T56_lc2_vertical = false;
				drawer.T56_lc2_borderY = y2;
				drawer.T56_lc2_leftOrAbove = (drawer.T56_sy <= y2);
			} else if(x2 == x3) {
				drawer.T56_lc2_horizontal = false;
				drawer.T56_lc2_vertical = true;
				drawer.T56_lc2_borderX = x2;
				drawer.T56_lc2_leftOrAbove = (drawer.T56_sx <= x2);
			} else {
				drawer.T56_lc2_horizontal = false;
				drawer.T56_lc2_vertical = false;
				drawer.T56_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T56_lc2_C = x2 - drawer.T56_lc2_m * y2;
				drawer.T56_lc2_leftOrAbove = (drawer.T56_sx < drawer.T56_lc2_m*drawer.T56_sy + drawer.T56_lc2_C);
			}

			if(y3 == y1) {
				drawer.T56_lc3_horizontal = true;
				drawer.T56_lc3_vertical = false;
				drawer.T56_lc3_borderY = y3;
				drawer.T56_lc3_leftOrAbove = (drawer.T56_sy <= y3);
			} else if(x3 == x1) {
				drawer.T56_lc3_horizontal = false;
				drawer.T56_lc3_vertical = true;
				drawer.T56_lc3_borderX = x3;
				drawer.T56_lc3_leftOrAbove = (drawer.T56_sx <= x3);
			} else {
				drawer.T56_lc3_horizontal = false;
				drawer.T56_lc3_vertical = false;
				drawer.T56_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T56_lc3_C = x3 - drawer.T56_lc3_m * y3;
				drawer.T56_lc3_leftOrAbove = (drawer.T56_sx < drawer.T56_lc3_m*drawer.T56_sy + drawer.T56_lc3_C);
			}

			drawer.T56_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T56_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T56_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T56_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T56_initializedWithValidData = true;
		}

		t = triangles[57]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T57_r = t.r; drawer.T57_g = t.g; drawer.T57_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T57_initializedWithValidData = false;
		} else {

			drawer.T57_sx = (x1 + x2 + x3) / 3.0;
			drawer.T57_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T57_lc1_horizontal = true;
				drawer.T57_lc1_vertical = false;
				drawer.T57_lc1_borderY = y1;
				drawer.T57_lc1_leftOrAbove = (drawer.T57_sy <= y1);
			} else if(x1 == x2) {
				drawer.T57_lc1_horizontal = false;
				drawer.T57_lc1_vertical = true;
				drawer.T57_lc1_borderX = x1;
				drawer.T57_lc1_leftOrAbove = (drawer.T57_sx <= x1);
			} else {
				drawer.T57_lc1_horizontal = false;
				drawer.T57_lc1_vertical = false;
				drawer.T57_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T57_lc1_C = x1 - drawer.T57_lc1_m * y1;
				drawer.T57_lc1_leftOrAbove = (drawer.T57_sx < drawer.T57_lc1_m*drawer.T57_sy + drawer.T57_lc1_C);
			}

			if(y2 == y3) {
				drawer.T57_lc2_horizontal = true;
				drawer.T57_lc2_vertical = false;
				drawer.T57_lc2_borderY = y2;
				drawer.T57_lc2_leftOrAbove = (drawer.T57_sy <= y2);
			} else if(x2 == x3) {
				drawer.T57_lc2_horizontal = false;
				drawer.T57_lc2_vertical = true;
				drawer.T57_lc2_borderX = x2;
				drawer.T57_lc2_leftOrAbove = (drawer.T57_sx <= x2);
			} else {
				drawer.T57_lc2_horizontal = false;
				drawer.T57_lc2_vertical = false;
				drawer.T57_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T57_lc2_C = x2 - drawer.T57_lc2_m * y2;
				drawer.T57_lc2_leftOrAbove = (drawer.T57_sx < drawer.T57_lc2_m*drawer.T57_sy + drawer.T57_lc2_C);
			}

			if(y3 == y1) {
				drawer.T57_lc3_horizontal = true;
				drawer.T57_lc3_vertical = false;
				drawer.T57_lc3_borderY = y3;
				drawer.T57_lc3_leftOrAbove = (drawer.T57_sy <= y3);
			} else if(x3 == x1) {
				drawer.T57_lc3_horizontal = false;
				drawer.T57_lc3_vertical = true;
				drawer.T57_lc3_borderX = x3;
				drawer.T57_lc3_leftOrAbove = (drawer.T57_sx <= x3);
			} else {
				drawer.T57_lc3_horizontal = false;
				drawer.T57_lc3_vertical = false;
				drawer.T57_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T57_lc3_C = x3 - drawer.T57_lc3_m * y3;
				drawer.T57_lc3_leftOrAbove = (drawer.T57_sx < drawer.T57_lc3_m*drawer.T57_sy + drawer.T57_lc3_C);
			}

			drawer.T57_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T57_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T57_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T57_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T57_initializedWithValidData = true;
		}

		t = triangles[58]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T58_r = t.r; drawer.T58_g = t.g; drawer.T58_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T58_initializedWithValidData = false;
		} else {

			drawer.T58_sx = (x1 + x2 + x3) / 3.0;
			drawer.T58_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T58_lc1_horizontal = true;
				drawer.T58_lc1_vertical = false;
				drawer.T58_lc1_borderY = y1;
				drawer.T58_lc1_leftOrAbove = (drawer.T58_sy <= y1);
			} else if(x1 == x2) {
				drawer.T58_lc1_horizontal = false;
				drawer.T58_lc1_vertical = true;
				drawer.T58_lc1_borderX = x1;
				drawer.T58_lc1_leftOrAbove = (drawer.T58_sx <= x1);
			} else {
				drawer.T58_lc1_horizontal = false;
				drawer.T58_lc1_vertical = false;
				drawer.T58_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T58_lc1_C = x1 - drawer.T58_lc1_m * y1;
				drawer.T58_lc1_leftOrAbove = (drawer.T58_sx < drawer.T58_lc1_m*drawer.T58_sy + drawer.T58_lc1_C);
			}

			if(y2 == y3) {
				drawer.T58_lc2_horizontal = true;
				drawer.T58_lc2_vertical = false;
				drawer.T58_lc2_borderY = y2;
				drawer.T58_lc2_leftOrAbove = (drawer.T58_sy <= y2);
			} else if(x2 == x3) {
				drawer.T58_lc2_horizontal = false;
				drawer.T58_lc2_vertical = true;
				drawer.T58_lc2_borderX = x2;
				drawer.T58_lc2_leftOrAbove = (drawer.T58_sx <= x2);
			} else {
				drawer.T58_lc2_horizontal = false;
				drawer.T58_lc2_vertical = false;
				drawer.T58_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T58_lc2_C = x2 - drawer.T58_lc2_m * y2;
				drawer.T58_lc2_leftOrAbove = (drawer.T58_sx < drawer.T58_lc2_m*drawer.T58_sy + drawer.T58_lc2_C);
			}

			if(y3 == y1) {
				drawer.T58_lc3_horizontal = true;
				drawer.T58_lc3_vertical = false;
				drawer.T58_lc3_borderY = y3;
				drawer.T58_lc3_leftOrAbove = (drawer.T58_sy <= y3);
			} else if(x3 == x1) {
				drawer.T58_lc3_horizontal = false;
				drawer.T58_lc3_vertical = true;
				drawer.T58_lc3_borderX = x3;
				drawer.T58_lc3_leftOrAbove = (drawer.T58_sx <= x3);
			} else {
				drawer.T58_lc3_horizontal = false;
				drawer.T58_lc3_vertical = false;
				drawer.T58_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T58_lc3_C = x3 - drawer.T58_lc3_m * y3;
				drawer.T58_lc3_leftOrAbove = (drawer.T58_sx < drawer.T58_lc3_m*drawer.T58_sy + drawer.T58_lc3_C);
			}

			drawer.T58_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T58_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T58_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T58_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T58_initializedWithValidData = true;
		}

		t = triangles[59]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T59_r = t.r; drawer.T59_g = t.g; drawer.T59_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T59_initializedWithValidData = false;
		} else {

			drawer.T59_sx = (x1 + x2 + x3) / 3.0;
			drawer.T59_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T59_lc1_horizontal = true;
				drawer.T59_lc1_vertical = false;
				drawer.T59_lc1_borderY = y1;
				drawer.T59_lc1_leftOrAbove = (drawer.T59_sy <= y1);
			} else if(x1 == x2) {
				drawer.T59_lc1_horizontal = false;
				drawer.T59_lc1_vertical = true;
				drawer.T59_lc1_borderX = x1;
				drawer.T59_lc1_leftOrAbove = (drawer.T59_sx <= x1);
			} else {
				drawer.T59_lc1_horizontal = false;
				drawer.T59_lc1_vertical = false;
				drawer.T59_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T59_lc1_C = x1 - drawer.T59_lc1_m * y1;
				drawer.T59_lc1_leftOrAbove = (drawer.T59_sx < drawer.T59_lc1_m*drawer.T59_sy + drawer.T59_lc1_C);
			}

			if(y2 == y3) {
				drawer.T59_lc2_horizontal = true;
				drawer.T59_lc2_vertical = false;
				drawer.T59_lc2_borderY = y2;
				drawer.T59_lc2_leftOrAbove = (drawer.T59_sy <= y2);
			} else if(x2 == x3) {
				drawer.T59_lc2_horizontal = false;
				drawer.T59_lc2_vertical = true;
				drawer.T59_lc2_borderX = x2;
				drawer.T59_lc2_leftOrAbove = (drawer.T59_sx <= x2);
			} else {
				drawer.T59_lc2_horizontal = false;
				drawer.T59_lc2_vertical = false;
				drawer.T59_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T59_lc2_C = x2 - drawer.T59_lc2_m * y2;
				drawer.T59_lc2_leftOrAbove = (drawer.T59_sx < drawer.T59_lc2_m*drawer.T59_sy + drawer.T59_lc2_C);
			}

			if(y3 == y1) {
				drawer.T59_lc3_horizontal = true;
				drawer.T59_lc3_vertical = false;
				drawer.T59_lc3_borderY = y3;
				drawer.T59_lc3_leftOrAbove = (drawer.T59_sy <= y3);
			} else if(x3 == x1) {
				drawer.T59_lc3_horizontal = false;
				drawer.T59_lc3_vertical = true;
				drawer.T59_lc3_borderX = x3;
				drawer.T59_lc3_leftOrAbove = (drawer.T59_sx <= x3);
			} else {
				drawer.T59_lc3_horizontal = false;
				drawer.T59_lc3_vertical = false;
				drawer.T59_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T59_lc3_C = x3 - drawer.T59_lc3_m * y3;
				drawer.T59_lc3_leftOrAbove = (drawer.T59_sx < drawer.T59_lc3_m*drawer.T59_sy + drawer.T59_lc3_C);
			}

			drawer.T59_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T59_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T59_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T59_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T59_initializedWithValidData = true;
		}
	}

	public void loadTriangles3(SingleTriangle[] triangles) {
		int x1, y1, x2, y2, x3, y3;
		SingleTriangle t;

		t = triangles[60]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T60_r = t.r; drawer.T60_g = t.g; drawer.T60_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T60_initializedWithValidData = false;
		} else {

			drawer.T60_sx = (x1 + x2 + x3) / 3.0;
			drawer.T60_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T60_lc1_horizontal = true;
				drawer.T60_lc1_vertical = false;
				drawer.T60_lc1_borderY = y1;
				drawer.T60_lc1_leftOrAbove = (drawer.T60_sy <= y1);
			} else if(x1 == x2) {
				drawer.T60_lc1_horizontal = false;
				drawer.T60_lc1_vertical = true;
				drawer.T60_lc1_borderX = x1;
				drawer.T60_lc1_leftOrAbove = (drawer.T60_sx <= x1);
			} else {
				drawer.T60_lc1_horizontal = false;
				drawer.T60_lc1_vertical = false;
				drawer.T60_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T60_lc1_C = x1 - drawer.T60_lc1_m * y1;
				drawer.T60_lc1_leftOrAbove = (drawer.T60_sx < drawer.T60_lc1_m*drawer.T60_sy + drawer.T60_lc1_C);
			}

			if(y2 == y3) {
				drawer.T60_lc2_horizontal = true;
				drawer.T60_lc2_vertical = false;
				drawer.T60_lc2_borderY = y2;
				drawer.T60_lc2_leftOrAbove = (drawer.T60_sy <= y2);
			} else if(x2 == x3) {
				drawer.T60_lc2_horizontal = false;
				drawer.T60_lc2_vertical = true;
				drawer.T60_lc2_borderX = x2;
				drawer.T60_lc2_leftOrAbove = (drawer.T60_sx <= x2);
			} else {
				drawer.T60_lc2_horizontal = false;
				drawer.T60_lc2_vertical = false;
				drawer.T60_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T60_lc2_C = x2 - drawer.T60_lc2_m * y2;
				drawer.T60_lc2_leftOrAbove = (drawer.T60_sx < drawer.T60_lc2_m*drawer.T60_sy + drawer.T60_lc2_C);
			}

			if(y3 == y1) {
				drawer.T60_lc3_horizontal = true;
				drawer.T60_lc3_vertical = false;
				drawer.T60_lc3_borderY = y3;
				drawer.T60_lc3_leftOrAbove = (drawer.T60_sy <= y3);
			} else if(x3 == x1) {
				drawer.T60_lc3_horizontal = false;
				drawer.T60_lc3_vertical = true;
				drawer.T60_lc3_borderX = x3;
				drawer.T60_lc3_leftOrAbove = (drawer.T60_sx <= x3);
			} else {
				drawer.T60_lc3_horizontal = false;
				drawer.T60_lc3_vertical = false;
				drawer.T60_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T60_lc3_C = x3 - drawer.T60_lc3_m * y3;
				drawer.T60_lc3_leftOrAbove = (drawer.T60_sx < drawer.T60_lc3_m*drawer.T60_sy + drawer.T60_lc3_C);
			}

			drawer.T60_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T60_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T60_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T60_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T60_initializedWithValidData = true;
		}

		t = triangles[61]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T61_r = t.r; drawer.T61_g = t.g; drawer.T61_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T61_initializedWithValidData = false;
		} else {

			drawer.T61_sx = (x1 + x2 + x3) / 3.0;
			drawer.T61_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T61_lc1_horizontal = true;
				drawer.T61_lc1_vertical = false;
				drawer.T61_lc1_borderY = y1;
				drawer.T61_lc1_leftOrAbove = (drawer.T61_sy <= y1);
			} else if(x1 == x2) {
				drawer.T61_lc1_horizontal = false;
				drawer.T61_lc1_vertical = true;
				drawer.T61_lc1_borderX = x1;
				drawer.T61_lc1_leftOrAbove = (drawer.T61_sx <= x1);
			} else {
				drawer.T61_lc1_horizontal = false;
				drawer.T61_lc1_vertical = false;
				drawer.T61_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T61_lc1_C = x1 - drawer.T61_lc1_m * y1;
				drawer.T61_lc1_leftOrAbove = (drawer.T61_sx < drawer.T61_lc1_m*drawer.T61_sy + drawer.T61_lc1_C);
			}

			if(y2 == y3) {
				drawer.T61_lc2_horizontal = true;
				drawer.T61_lc2_vertical = false;
				drawer.T61_lc2_borderY = y2;
				drawer.T61_lc2_leftOrAbove = (drawer.T61_sy <= y2);
			} else if(x2 == x3) {
				drawer.T61_lc2_horizontal = false;
				drawer.T61_lc2_vertical = true;
				drawer.T61_lc2_borderX = x2;
				drawer.T61_lc2_leftOrAbove = (drawer.T61_sx <= x2);
			} else {
				drawer.T61_lc2_horizontal = false;
				drawer.T61_lc2_vertical = false;
				drawer.T61_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T61_lc2_C = x2 - drawer.T61_lc2_m * y2;
				drawer.T61_lc2_leftOrAbove = (drawer.T61_sx < drawer.T61_lc2_m*drawer.T61_sy + drawer.T61_lc2_C);
			}

			if(y3 == y1) {
				drawer.T61_lc3_horizontal = true;
				drawer.T61_lc3_vertical = false;
				drawer.T61_lc3_borderY = y3;
				drawer.T61_lc3_leftOrAbove = (drawer.T61_sy <= y3);
			} else if(x3 == x1) {
				drawer.T61_lc3_horizontal = false;
				drawer.T61_lc3_vertical = true;
				drawer.T61_lc3_borderX = x3;
				drawer.T61_lc3_leftOrAbove = (drawer.T61_sx <= x3);
			} else {
				drawer.T61_lc3_horizontal = false;
				drawer.T61_lc3_vertical = false;
				drawer.T61_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T61_lc3_C = x3 - drawer.T61_lc3_m * y3;
				drawer.T61_lc3_leftOrAbove = (drawer.T61_sx < drawer.T61_lc3_m*drawer.T61_sy + drawer.T61_lc3_C);
			}

			drawer.T61_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T61_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T61_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T61_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T61_initializedWithValidData = true;
		}

		t = triangles[62]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T62_r = t.r; drawer.T62_g = t.g; drawer.T62_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T62_initializedWithValidData = false;
		} else {

			drawer.T62_sx = (x1 + x2 + x3) / 3.0;
			drawer.T62_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T62_lc1_horizontal = true;
				drawer.T62_lc1_vertical = false;
				drawer.T62_lc1_borderY = y1;
				drawer.T62_lc1_leftOrAbove = (drawer.T62_sy <= y1);
			} else if(x1 == x2) {
				drawer.T62_lc1_horizontal = false;
				drawer.T62_lc1_vertical = true;
				drawer.T62_lc1_borderX = x1;
				drawer.T62_lc1_leftOrAbove = (drawer.T62_sx <= x1);
			} else {
				drawer.T62_lc1_horizontal = false;
				drawer.T62_lc1_vertical = false;
				drawer.T62_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T62_lc1_C = x1 - drawer.T62_lc1_m * y1;
				drawer.T62_lc1_leftOrAbove = (drawer.T62_sx < drawer.T62_lc1_m*drawer.T62_sy + drawer.T62_lc1_C);
			}

			if(y2 == y3) {
				drawer.T62_lc2_horizontal = true;
				drawer.T62_lc2_vertical = false;
				drawer.T62_lc2_borderY = y2;
				drawer.T62_lc2_leftOrAbove = (drawer.T62_sy <= y2);
			} else if(x2 == x3) {
				drawer.T62_lc2_horizontal = false;
				drawer.T62_lc2_vertical = true;
				drawer.T62_lc2_borderX = x2;
				drawer.T62_lc2_leftOrAbove = (drawer.T62_sx <= x2);
			} else {
				drawer.T62_lc2_horizontal = false;
				drawer.T62_lc2_vertical = false;
				drawer.T62_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T62_lc2_C = x2 - drawer.T62_lc2_m * y2;
				drawer.T62_lc2_leftOrAbove = (drawer.T62_sx < drawer.T62_lc2_m*drawer.T62_sy + drawer.T62_lc2_C);
			}

			if(y3 == y1) {
				drawer.T62_lc3_horizontal = true;
				drawer.T62_lc3_vertical = false;
				drawer.T62_lc3_borderY = y3;
				drawer.T62_lc3_leftOrAbove = (drawer.T62_sy <= y3);
			} else if(x3 == x1) {
				drawer.T62_lc3_horizontal = false;
				drawer.T62_lc3_vertical = true;
				drawer.T62_lc3_borderX = x3;
				drawer.T62_lc3_leftOrAbove = (drawer.T62_sx <= x3);
			} else {
				drawer.T62_lc3_horizontal = false;
				drawer.T62_lc3_vertical = false;
				drawer.T62_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T62_lc3_C = x3 - drawer.T62_lc3_m * y3;
				drawer.T62_lc3_leftOrAbove = (drawer.T62_sx < drawer.T62_lc3_m*drawer.T62_sy + drawer.T62_lc3_C);
			}

			drawer.T62_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T62_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T62_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T62_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T62_initializedWithValidData = true;
		}

		t = triangles[63]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T63_r = t.r; drawer.T63_g = t.g; drawer.T63_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T63_initializedWithValidData = false;
		} else {

			drawer.T63_sx = (x1 + x2 + x3) / 3.0;
			drawer.T63_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T63_lc1_horizontal = true;
				drawer.T63_lc1_vertical = false;
				drawer.T63_lc1_borderY = y1;
				drawer.T63_lc1_leftOrAbove = (drawer.T63_sy <= y1);
			} else if(x1 == x2) {
				drawer.T63_lc1_horizontal = false;
				drawer.T63_lc1_vertical = true;
				drawer.T63_lc1_borderX = x1;
				drawer.T63_lc1_leftOrAbove = (drawer.T63_sx <= x1);
			} else {
				drawer.T63_lc1_horizontal = false;
				drawer.T63_lc1_vertical = false;
				drawer.T63_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T63_lc1_C = x1 - drawer.T63_lc1_m * y1;
				drawer.T63_lc1_leftOrAbove = (drawer.T63_sx < drawer.T63_lc1_m*drawer.T63_sy + drawer.T63_lc1_C);
			}

			if(y2 == y3) {
				drawer.T63_lc2_horizontal = true;
				drawer.T63_lc2_vertical = false;
				drawer.T63_lc2_borderY = y2;
				drawer.T63_lc2_leftOrAbove = (drawer.T63_sy <= y2);
			} else if(x2 == x3) {
				drawer.T63_lc2_horizontal = false;
				drawer.T63_lc2_vertical = true;
				drawer.T63_lc2_borderX = x2;
				drawer.T63_lc2_leftOrAbove = (drawer.T63_sx <= x2);
			} else {
				drawer.T63_lc2_horizontal = false;
				drawer.T63_lc2_vertical = false;
				drawer.T63_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T63_lc2_C = x2 - drawer.T63_lc2_m * y2;
				drawer.T63_lc2_leftOrAbove = (drawer.T63_sx < drawer.T63_lc2_m*drawer.T63_sy + drawer.T63_lc2_C);
			}

			if(y3 == y1) {
				drawer.T63_lc3_horizontal = true;
				drawer.T63_lc3_vertical = false;
				drawer.T63_lc3_borderY = y3;
				drawer.T63_lc3_leftOrAbove = (drawer.T63_sy <= y3);
			} else if(x3 == x1) {
				drawer.T63_lc3_horizontal = false;
				drawer.T63_lc3_vertical = true;
				drawer.T63_lc3_borderX = x3;
				drawer.T63_lc3_leftOrAbove = (drawer.T63_sx <= x3);
			} else {
				drawer.T63_lc3_horizontal = false;
				drawer.T63_lc3_vertical = false;
				drawer.T63_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T63_lc3_C = x3 - drawer.T63_lc3_m * y3;
				drawer.T63_lc3_leftOrAbove = (drawer.T63_sx < drawer.T63_lc3_m*drawer.T63_sy + drawer.T63_lc3_C);
			}

			drawer.T63_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T63_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T63_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T63_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T63_initializedWithValidData = true;
		}

		t = triangles[64]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T64_r = t.r; drawer.T64_g = t.g; drawer.T64_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T64_initializedWithValidData = false;
		} else {

			drawer.T64_sx = (x1 + x2 + x3) / 3.0;
			drawer.T64_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T64_lc1_horizontal = true;
				drawer.T64_lc1_vertical = false;
				drawer.T64_lc1_borderY = y1;
				drawer.T64_lc1_leftOrAbove = (drawer.T64_sy <= y1);
			} else if(x1 == x2) {
				drawer.T64_lc1_horizontal = false;
				drawer.T64_lc1_vertical = true;
				drawer.T64_lc1_borderX = x1;
				drawer.T64_lc1_leftOrAbove = (drawer.T64_sx <= x1);
			} else {
				drawer.T64_lc1_horizontal = false;
				drawer.T64_lc1_vertical = false;
				drawer.T64_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T64_lc1_C = x1 - drawer.T64_lc1_m * y1;
				drawer.T64_lc1_leftOrAbove = (drawer.T64_sx < drawer.T64_lc1_m*drawer.T64_sy + drawer.T64_lc1_C);
			}

			if(y2 == y3) {
				drawer.T64_lc2_horizontal = true;
				drawer.T64_lc2_vertical = false;
				drawer.T64_lc2_borderY = y2;
				drawer.T64_lc2_leftOrAbove = (drawer.T64_sy <= y2);
			} else if(x2 == x3) {
				drawer.T64_lc2_horizontal = false;
				drawer.T64_lc2_vertical = true;
				drawer.T64_lc2_borderX = x2;
				drawer.T64_lc2_leftOrAbove = (drawer.T64_sx <= x2);
			} else {
				drawer.T64_lc2_horizontal = false;
				drawer.T64_lc2_vertical = false;
				drawer.T64_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T64_lc2_C = x2 - drawer.T64_lc2_m * y2;
				drawer.T64_lc2_leftOrAbove = (drawer.T64_sx < drawer.T64_lc2_m*drawer.T64_sy + drawer.T64_lc2_C);
			}

			if(y3 == y1) {
				drawer.T64_lc3_horizontal = true;
				drawer.T64_lc3_vertical = false;
				drawer.T64_lc3_borderY = y3;
				drawer.T64_lc3_leftOrAbove = (drawer.T64_sy <= y3);
			} else if(x3 == x1) {
				drawer.T64_lc3_horizontal = false;
				drawer.T64_lc3_vertical = true;
				drawer.T64_lc3_borderX = x3;
				drawer.T64_lc3_leftOrAbove = (drawer.T64_sx <= x3);
			} else {
				drawer.T64_lc3_horizontal = false;
				drawer.T64_lc3_vertical = false;
				drawer.T64_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T64_lc3_C = x3 - drawer.T64_lc3_m * y3;
				drawer.T64_lc3_leftOrAbove = (drawer.T64_sx < drawer.T64_lc3_m*drawer.T64_sy + drawer.T64_lc3_C);
			}

			drawer.T64_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T64_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T64_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T64_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T64_initializedWithValidData = true;
		}

		t = triangles[65]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T65_r = t.r; drawer.T65_g = t.g; drawer.T65_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T65_initializedWithValidData = false;
		} else {

			drawer.T65_sx = (x1 + x2 + x3) / 3.0;
			drawer.T65_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T65_lc1_horizontal = true;
				drawer.T65_lc1_vertical = false;
				drawer.T65_lc1_borderY = y1;
				drawer.T65_lc1_leftOrAbove = (drawer.T65_sy <= y1);
			} else if(x1 == x2) {
				drawer.T65_lc1_horizontal = false;
				drawer.T65_lc1_vertical = true;
				drawer.T65_lc1_borderX = x1;
				drawer.T65_lc1_leftOrAbove = (drawer.T65_sx <= x1);
			} else {
				drawer.T65_lc1_horizontal = false;
				drawer.T65_lc1_vertical = false;
				drawer.T65_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T65_lc1_C = x1 - drawer.T65_lc1_m * y1;
				drawer.T65_lc1_leftOrAbove = (drawer.T65_sx < drawer.T65_lc1_m*drawer.T65_sy + drawer.T65_lc1_C);
			}

			if(y2 == y3) {
				drawer.T65_lc2_horizontal = true;
				drawer.T65_lc2_vertical = false;
				drawer.T65_lc2_borderY = y2;
				drawer.T65_lc2_leftOrAbove = (drawer.T65_sy <= y2);
			} else if(x2 == x3) {
				drawer.T65_lc2_horizontal = false;
				drawer.T65_lc2_vertical = true;
				drawer.T65_lc2_borderX = x2;
				drawer.T65_lc2_leftOrAbove = (drawer.T65_sx <= x2);
			} else {
				drawer.T65_lc2_horizontal = false;
				drawer.T65_lc2_vertical = false;
				drawer.T65_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T65_lc2_C = x2 - drawer.T65_lc2_m * y2;
				drawer.T65_lc2_leftOrAbove = (drawer.T65_sx < drawer.T65_lc2_m*drawer.T65_sy + drawer.T65_lc2_C);
			}

			if(y3 == y1) {
				drawer.T65_lc3_horizontal = true;
				drawer.T65_lc3_vertical = false;
				drawer.T65_lc3_borderY = y3;
				drawer.T65_lc3_leftOrAbove = (drawer.T65_sy <= y3);
			} else if(x3 == x1) {
				drawer.T65_lc3_horizontal = false;
				drawer.T65_lc3_vertical = true;
				drawer.T65_lc3_borderX = x3;
				drawer.T65_lc3_leftOrAbove = (drawer.T65_sx <= x3);
			} else {
				drawer.T65_lc3_horizontal = false;
				drawer.T65_lc3_vertical = false;
				drawer.T65_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T65_lc3_C = x3 - drawer.T65_lc3_m * y3;
				drawer.T65_lc3_leftOrAbove = (drawer.T65_sx < drawer.T65_lc3_m*drawer.T65_sy + drawer.T65_lc3_C);
			}

			drawer.T65_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T65_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T65_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T65_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T65_initializedWithValidData = true;
		}

		t = triangles[66]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T66_r = t.r; drawer.T66_g = t.g; drawer.T66_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T66_initializedWithValidData = false;
		} else {

			drawer.T66_sx = (x1 + x2 + x3) / 3.0;
			drawer.T66_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T66_lc1_horizontal = true;
				drawer.T66_lc1_vertical = false;
				drawer.T66_lc1_borderY = y1;
				drawer.T66_lc1_leftOrAbove = (drawer.T66_sy <= y1);
			} else if(x1 == x2) {
				drawer.T66_lc1_horizontal = false;
				drawer.T66_lc1_vertical = true;
				drawer.T66_lc1_borderX = x1;
				drawer.T66_lc1_leftOrAbove = (drawer.T66_sx <= x1);
			} else {
				drawer.T66_lc1_horizontal = false;
				drawer.T66_lc1_vertical = false;
				drawer.T66_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T66_lc1_C = x1 - drawer.T66_lc1_m * y1;
				drawer.T66_lc1_leftOrAbove = (drawer.T66_sx < drawer.T66_lc1_m*drawer.T66_sy + drawer.T66_lc1_C);
			}

			if(y2 == y3) {
				drawer.T66_lc2_horizontal = true;
				drawer.T66_lc2_vertical = false;
				drawer.T66_lc2_borderY = y2;
				drawer.T66_lc2_leftOrAbove = (drawer.T66_sy <= y2);
			} else if(x2 == x3) {
				drawer.T66_lc2_horizontal = false;
				drawer.T66_lc2_vertical = true;
				drawer.T66_lc2_borderX = x2;
				drawer.T66_lc2_leftOrAbove = (drawer.T66_sx <= x2);
			} else {
				drawer.T66_lc2_horizontal = false;
				drawer.T66_lc2_vertical = false;
				drawer.T66_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T66_lc2_C = x2 - drawer.T66_lc2_m * y2;
				drawer.T66_lc2_leftOrAbove = (drawer.T66_sx < drawer.T66_lc2_m*drawer.T66_sy + drawer.T66_lc2_C);
			}

			if(y3 == y1) {
				drawer.T66_lc3_horizontal = true;
				drawer.T66_lc3_vertical = false;
				drawer.T66_lc3_borderY = y3;
				drawer.T66_lc3_leftOrAbove = (drawer.T66_sy <= y3);
			} else if(x3 == x1) {
				drawer.T66_lc3_horizontal = false;
				drawer.T66_lc3_vertical = true;
				drawer.T66_lc3_borderX = x3;
				drawer.T66_lc3_leftOrAbove = (drawer.T66_sx <= x3);
			} else {
				drawer.T66_lc3_horizontal = false;
				drawer.T66_lc3_vertical = false;
				drawer.T66_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T66_lc3_C = x3 - drawer.T66_lc3_m * y3;
				drawer.T66_lc3_leftOrAbove = (drawer.T66_sx < drawer.T66_lc3_m*drawer.T66_sy + drawer.T66_lc3_C);
			}

			drawer.T66_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T66_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T66_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T66_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T66_initializedWithValidData = true;
		}

		t = triangles[67]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T67_r = t.r; drawer.T67_g = t.g; drawer.T67_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T67_initializedWithValidData = false;
		} else {

			drawer.T67_sx = (x1 + x2 + x3) / 3.0;
			drawer.T67_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T67_lc1_horizontal = true;
				drawer.T67_lc1_vertical = false;
				drawer.T67_lc1_borderY = y1;
				drawer.T67_lc1_leftOrAbove = (drawer.T67_sy <= y1);
			} else if(x1 == x2) {
				drawer.T67_lc1_horizontal = false;
				drawer.T67_lc1_vertical = true;
				drawer.T67_lc1_borderX = x1;
				drawer.T67_lc1_leftOrAbove = (drawer.T67_sx <= x1);
			} else {
				drawer.T67_lc1_horizontal = false;
				drawer.T67_lc1_vertical = false;
				drawer.T67_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T67_lc1_C = x1 - drawer.T67_lc1_m * y1;
				drawer.T67_lc1_leftOrAbove = (drawer.T67_sx < drawer.T67_lc1_m*drawer.T67_sy + drawer.T67_lc1_C);
			}

			if(y2 == y3) {
				drawer.T67_lc2_horizontal = true;
				drawer.T67_lc2_vertical = false;
				drawer.T67_lc2_borderY = y2;
				drawer.T67_lc2_leftOrAbove = (drawer.T67_sy <= y2);
			} else if(x2 == x3) {
				drawer.T67_lc2_horizontal = false;
				drawer.T67_lc2_vertical = true;
				drawer.T67_lc2_borderX = x2;
				drawer.T67_lc2_leftOrAbove = (drawer.T67_sx <= x2);
			} else {
				drawer.T67_lc2_horizontal = false;
				drawer.T67_lc2_vertical = false;
				drawer.T67_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T67_lc2_C = x2 - drawer.T67_lc2_m * y2;
				drawer.T67_lc2_leftOrAbove = (drawer.T67_sx < drawer.T67_lc2_m*drawer.T67_sy + drawer.T67_lc2_C);
			}

			if(y3 == y1) {
				drawer.T67_lc3_horizontal = true;
				drawer.T67_lc3_vertical = false;
				drawer.T67_lc3_borderY = y3;
				drawer.T67_lc3_leftOrAbove = (drawer.T67_sy <= y3);
			} else if(x3 == x1) {
				drawer.T67_lc3_horizontal = false;
				drawer.T67_lc3_vertical = true;
				drawer.T67_lc3_borderX = x3;
				drawer.T67_lc3_leftOrAbove = (drawer.T67_sx <= x3);
			} else {
				drawer.T67_lc3_horizontal = false;
				drawer.T67_lc3_vertical = false;
				drawer.T67_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T67_lc3_C = x3 - drawer.T67_lc3_m * y3;
				drawer.T67_lc3_leftOrAbove = (drawer.T67_sx < drawer.T67_lc3_m*drawer.T67_sy + drawer.T67_lc3_C);
			}

			drawer.T67_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T67_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T67_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T67_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T67_initializedWithValidData = true;
		}

		t = triangles[68]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T68_r = t.r; drawer.T68_g = t.g; drawer.T68_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T68_initializedWithValidData = false;
		} else {

			drawer.T68_sx = (x1 + x2 + x3) / 3.0;
			drawer.T68_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T68_lc1_horizontal = true;
				drawer.T68_lc1_vertical = false;
				drawer.T68_lc1_borderY = y1;
				drawer.T68_lc1_leftOrAbove = (drawer.T68_sy <= y1);
			} else if(x1 == x2) {
				drawer.T68_lc1_horizontal = false;
				drawer.T68_lc1_vertical = true;
				drawer.T68_lc1_borderX = x1;
				drawer.T68_lc1_leftOrAbove = (drawer.T68_sx <= x1);
			} else {
				drawer.T68_lc1_horizontal = false;
				drawer.T68_lc1_vertical = false;
				drawer.T68_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T68_lc1_C = x1 - drawer.T68_lc1_m * y1;
				drawer.T68_lc1_leftOrAbove = (drawer.T68_sx < drawer.T68_lc1_m*drawer.T68_sy + drawer.T68_lc1_C);
			}

			if(y2 == y3) {
				drawer.T68_lc2_horizontal = true;
				drawer.T68_lc2_vertical = false;
				drawer.T68_lc2_borderY = y2;
				drawer.T68_lc2_leftOrAbove = (drawer.T68_sy <= y2);
			} else if(x2 == x3) {
				drawer.T68_lc2_horizontal = false;
				drawer.T68_lc2_vertical = true;
				drawer.T68_lc2_borderX = x2;
				drawer.T68_lc2_leftOrAbove = (drawer.T68_sx <= x2);
			} else {
				drawer.T68_lc2_horizontal = false;
				drawer.T68_lc2_vertical = false;
				drawer.T68_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T68_lc2_C = x2 - drawer.T68_lc2_m * y2;
				drawer.T68_lc2_leftOrAbove = (drawer.T68_sx < drawer.T68_lc2_m*drawer.T68_sy + drawer.T68_lc2_C);
			}

			if(y3 == y1) {
				drawer.T68_lc3_horizontal = true;
				drawer.T68_lc3_vertical = false;
				drawer.T68_lc3_borderY = y3;
				drawer.T68_lc3_leftOrAbove = (drawer.T68_sy <= y3);
			} else if(x3 == x1) {
				drawer.T68_lc3_horizontal = false;
				drawer.T68_lc3_vertical = true;
				drawer.T68_lc3_borderX = x3;
				drawer.T68_lc3_leftOrAbove = (drawer.T68_sx <= x3);
			} else {
				drawer.T68_lc3_horizontal = false;
				drawer.T68_lc3_vertical = false;
				drawer.T68_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T68_lc3_C = x3 - drawer.T68_lc3_m * y3;
				drawer.T68_lc3_leftOrAbove = (drawer.T68_sx < drawer.T68_lc3_m*drawer.T68_sy + drawer.T68_lc3_C);
			}

			drawer.T68_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T68_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T68_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T68_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T68_initializedWithValidData = true;
		}

		t = triangles[69]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T69_r = t.r; drawer.T69_g = t.g; drawer.T69_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T69_initializedWithValidData = false;
		} else {

			drawer.T69_sx = (x1 + x2 + x3) / 3.0;
			drawer.T69_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T69_lc1_horizontal = true;
				drawer.T69_lc1_vertical = false;
				drawer.T69_lc1_borderY = y1;
				drawer.T69_lc1_leftOrAbove = (drawer.T69_sy <= y1);
			} else if(x1 == x2) {
				drawer.T69_lc1_horizontal = false;
				drawer.T69_lc1_vertical = true;
				drawer.T69_lc1_borderX = x1;
				drawer.T69_lc1_leftOrAbove = (drawer.T69_sx <= x1);
			} else {
				drawer.T69_lc1_horizontal = false;
				drawer.T69_lc1_vertical = false;
				drawer.T69_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T69_lc1_C = x1 - drawer.T69_lc1_m * y1;
				drawer.T69_lc1_leftOrAbove = (drawer.T69_sx < drawer.T69_lc1_m*drawer.T69_sy + drawer.T69_lc1_C);
			}

			if(y2 == y3) {
				drawer.T69_lc2_horizontal = true;
				drawer.T69_lc2_vertical = false;
				drawer.T69_lc2_borderY = y2;
				drawer.T69_lc2_leftOrAbove = (drawer.T69_sy <= y2);
			} else if(x2 == x3) {
				drawer.T69_lc2_horizontal = false;
				drawer.T69_lc2_vertical = true;
				drawer.T69_lc2_borderX = x2;
				drawer.T69_lc2_leftOrAbove = (drawer.T69_sx <= x2);
			} else {
				drawer.T69_lc2_horizontal = false;
				drawer.T69_lc2_vertical = false;
				drawer.T69_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T69_lc2_C = x2 - drawer.T69_lc2_m * y2;
				drawer.T69_lc2_leftOrAbove = (drawer.T69_sx < drawer.T69_lc2_m*drawer.T69_sy + drawer.T69_lc2_C);
			}

			if(y3 == y1) {
				drawer.T69_lc3_horizontal = true;
				drawer.T69_lc3_vertical = false;
				drawer.T69_lc3_borderY = y3;
				drawer.T69_lc3_leftOrAbove = (drawer.T69_sy <= y3);
			} else if(x3 == x1) {
				drawer.T69_lc3_horizontal = false;
				drawer.T69_lc3_vertical = true;
				drawer.T69_lc3_borderX = x3;
				drawer.T69_lc3_leftOrAbove = (drawer.T69_sx <= x3);
			} else {
				drawer.T69_lc3_horizontal = false;
				drawer.T69_lc3_vertical = false;
				drawer.T69_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T69_lc3_C = x3 - drawer.T69_lc3_m * y3;
				drawer.T69_lc3_leftOrAbove = (drawer.T69_sx < drawer.T69_lc3_m*drawer.T69_sy + drawer.T69_lc3_C);
			}

			drawer.T69_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T69_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T69_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T69_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T69_initializedWithValidData = true;
		}

		t = triangles[70]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T70_r = t.r; drawer.T70_g = t.g; drawer.T70_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T70_initializedWithValidData = false;
		} else {

			drawer.T70_sx = (x1 + x2 + x3) / 3.0;
			drawer.T70_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T70_lc1_horizontal = true;
				drawer.T70_lc1_vertical = false;
				drawer.T70_lc1_borderY = y1;
				drawer.T70_lc1_leftOrAbove = (drawer.T70_sy <= y1);
			} else if(x1 == x2) {
				drawer.T70_lc1_horizontal = false;
				drawer.T70_lc1_vertical = true;
				drawer.T70_lc1_borderX = x1;
				drawer.T70_lc1_leftOrAbove = (drawer.T70_sx <= x1);
			} else {
				drawer.T70_lc1_horizontal = false;
				drawer.T70_lc1_vertical = false;
				drawer.T70_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T70_lc1_C = x1 - drawer.T70_lc1_m * y1;
				drawer.T70_lc1_leftOrAbove = (drawer.T70_sx < drawer.T70_lc1_m*drawer.T70_sy + drawer.T70_lc1_C);
			}

			if(y2 == y3) {
				drawer.T70_lc2_horizontal = true;
				drawer.T70_lc2_vertical = false;
				drawer.T70_lc2_borderY = y2;
				drawer.T70_lc2_leftOrAbove = (drawer.T70_sy <= y2);
			} else if(x2 == x3) {
				drawer.T70_lc2_horizontal = false;
				drawer.T70_lc2_vertical = true;
				drawer.T70_lc2_borderX = x2;
				drawer.T70_lc2_leftOrAbove = (drawer.T70_sx <= x2);
			} else {
				drawer.T70_lc2_horizontal = false;
				drawer.T70_lc2_vertical = false;
				drawer.T70_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T70_lc2_C = x2 - drawer.T70_lc2_m * y2;
				drawer.T70_lc2_leftOrAbove = (drawer.T70_sx < drawer.T70_lc2_m*drawer.T70_sy + drawer.T70_lc2_C);
			}

			if(y3 == y1) {
				drawer.T70_lc3_horizontal = true;
				drawer.T70_lc3_vertical = false;
				drawer.T70_lc3_borderY = y3;
				drawer.T70_lc3_leftOrAbove = (drawer.T70_sy <= y3);
			} else if(x3 == x1) {
				drawer.T70_lc3_horizontal = false;
				drawer.T70_lc3_vertical = true;
				drawer.T70_lc3_borderX = x3;
				drawer.T70_lc3_leftOrAbove = (drawer.T70_sx <= x3);
			} else {
				drawer.T70_lc3_horizontal = false;
				drawer.T70_lc3_vertical = false;
				drawer.T70_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T70_lc3_C = x3 - drawer.T70_lc3_m * y3;
				drawer.T70_lc3_leftOrAbove = (drawer.T70_sx < drawer.T70_lc3_m*drawer.T70_sy + drawer.T70_lc3_C);
			}

			drawer.T70_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T70_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T70_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T70_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T70_initializedWithValidData = true;
		}

		t = triangles[71]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T71_r = t.r; drawer.T71_g = t.g; drawer.T71_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T71_initializedWithValidData = false;
		} else {

			drawer.T71_sx = (x1 + x2 + x3) / 3.0;
			drawer.T71_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T71_lc1_horizontal = true;
				drawer.T71_lc1_vertical = false;
				drawer.T71_lc1_borderY = y1;
				drawer.T71_lc1_leftOrAbove = (drawer.T71_sy <= y1);
			} else if(x1 == x2) {
				drawer.T71_lc1_horizontal = false;
				drawer.T71_lc1_vertical = true;
				drawer.T71_lc1_borderX = x1;
				drawer.T71_lc1_leftOrAbove = (drawer.T71_sx <= x1);
			} else {
				drawer.T71_lc1_horizontal = false;
				drawer.T71_lc1_vertical = false;
				drawer.T71_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T71_lc1_C = x1 - drawer.T71_lc1_m * y1;
				drawer.T71_lc1_leftOrAbove = (drawer.T71_sx < drawer.T71_lc1_m*drawer.T71_sy + drawer.T71_lc1_C);
			}

			if(y2 == y3) {
				drawer.T71_lc2_horizontal = true;
				drawer.T71_lc2_vertical = false;
				drawer.T71_lc2_borderY = y2;
				drawer.T71_lc2_leftOrAbove = (drawer.T71_sy <= y2);
			} else if(x2 == x3) {
				drawer.T71_lc2_horizontal = false;
				drawer.T71_lc2_vertical = true;
				drawer.T71_lc2_borderX = x2;
				drawer.T71_lc2_leftOrAbove = (drawer.T71_sx <= x2);
			} else {
				drawer.T71_lc2_horizontal = false;
				drawer.T71_lc2_vertical = false;
				drawer.T71_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T71_lc2_C = x2 - drawer.T71_lc2_m * y2;
				drawer.T71_lc2_leftOrAbove = (drawer.T71_sx < drawer.T71_lc2_m*drawer.T71_sy + drawer.T71_lc2_C);
			}

			if(y3 == y1) {
				drawer.T71_lc3_horizontal = true;
				drawer.T71_lc3_vertical = false;
				drawer.T71_lc3_borderY = y3;
				drawer.T71_lc3_leftOrAbove = (drawer.T71_sy <= y3);
			} else if(x3 == x1) {
				drawer.T71_lc3_horizontal = false;
				drawer.T71_lc3_vertical = true;
				drawer.T71_lc3_borderX = x3;
				drawer.T71_lc3_leftOrAbove = (drawer.T71_sx <= x3);
			} else {
				drawer.T71_lc3_horizontal = false;
				drawer.T71_lc3_vertical = false;
				drawer.T71_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T71_lc3_C = x3 - drawer.T71_lc3_m * y3;
				drawer.T71_lc3_leftOrAbove = (drawer.T71_sx < drawer.T71_lc3_m*drawer.T71_sy + drawer.T71_lc3_C);
			}

			drawer.T71_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T71_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T71_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T71_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T71_initializedWithValidData = true;
		}

		t = triangles[72]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T72_r = t.r; drawer.T72_g = t.g; drawer.T72_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T72_initializedWithValidData = false;
		} else {

			drawer.T72_sx = (x1 + x2 + x3) / 3.0;
			drawer.T72_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T72_lc1_horizontal = true;
				drawer.T72_lc1_vertical = false;
				drawer.T72_lc1_borderY = y1;
				drawer.T72_lc1_leftOrAbove = (drawer.T72_sy <= y1);
			} else if(x1 == x2) {
				drawer.T72_lc1_horizontal = false;
				drawer.T72_lc1_vertical = true;
				drawer.T72_lc1_borderX = x1;
				drawer.T72_lc1_leftOrAbove = (drawer.T72_sx <= x1);
			} else {
				drawer.T72_lc1_horizontal = false;
				drawer.T72_lc1_vertical = false;
				drawer.T72_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T72_lc1_C = x1 - drawer.T72_lc1_m * y1;
				drawer.T72_lc1_leftOrAbove = (drawer.T72_sx < drawer.T72_lc1_m*drawer.T72_sy + drawer.T72_lc1_C);
			}

			if(y2 == y3) {
				drawer.T72_lc2_horizontal = true;
				drawer.T72_lc2_vertical = false;
				drawer.T72_lc2_borderY = y2;
				drawer.T72_lc2_leftOrAbove = (drawer.T72_sy <= y2);
			} else if(x2 == x3) {
				drawer.T72_lc2_horizontal = false;
				drawer.T72_lc2_vertical = true;
				drawer.T72_lc2_borderX = x2;
				drawer.T72_lc2_leftOrAbove = (drawer.T72_sx <= x2);
			} else {
				drawer.T72_lc2_horizontal = false;
				drawer.T72_lc2_vertical = false;
				drawer.T72_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T72_lc2_C = x2 - drawer.T72_lc2_m * y2;
				drawer.T72_lc2_leftOrAbove = (drawer.T72_sx < drawer.T72_lc2_m*drawer.T72_sy + drawer.T72_lc2_C);
			}

			if(y3 == y1) {
				drawer.T72_lc3_horizontal = true;
				drawer.T72_lc3_vertical = false;
				drawer.T72_lc3_borderY = y3;
				drawer.T72_lc3_leftOrAbove = (drawer.T72_sy <= y3);
			} else if(x3 == x1) {
				drawer.T72_lc3_horizontal = false;
				drawer.T72_lc3_vertical = true;
				drawer.T72_lc3_borderX = x3;
				drawer.T72_lc3_leftOrAbove = (drawer.T72_sx <= x3);
			} else {
				drawer.T72_lc3_horizontal = false;
				drawer.T72_lc3_vertical = false;
				drawer.T72_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T72_lc3_C = x3 - drawer.T72_lc3_m * y3;
				drawer.T72_lc3_leftOrAbove = (drawer.T72_sx < drawer.T72_lc3_m*drawer.T72_sy + drawer.T72_lc3_C);
			}

			drawer.T72_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T72_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T72_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T72_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T72_initializedWithValidData = true;
		}

		t = triangles[73]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T73_r = t.r; drawer.T73_g = t.g; drawer.T73_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T73_initializedWithValidData = false;
		} else {

			drawer.T73_sx = (x1 + x2 + x3) / 3.0;
			drawer.T73_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T73_lc1_horizontal = true;
				drawer.T73_lc1_vertical = false;
				drawer.T73_lc1_borderY = y1;
				drawer.T73_lc1_leftOrAbove = (drawer.T73_sy <= y1);
			} else if(x1 == x2) {
				drawer.T73_lc1_horizontal = false;
				drawer.T73_lc1_vertical = true;
				drawer.T73_lc1_borderX = x1;
				drawer.T73_lc1_leftOrAbove = (drawer.T73_sx <= x1);
			} else {
				drawer.T73_lc1_horizontal = false;
				drawer.T73_lc1_vertical = false;
				drawer.T73_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T73_lc1_C = x1 - drawer.T73_lc1_m * y1;
				drawer.T73_lc1_leftOrAbove = (drawer.T73_sx < drawer.T73_lc1_m*drawer.T73_sy + drawer.T73_lc1_C);
			}

			if(y2 == y3) {
				drawer.T73_lc2_horizontal = true;
				drawer.T73_lc2_vertical = false;
				drawer.T73_lc2_borderY = y2;
				drawer.T73_lc2_leftOrAbove = (drawer.T73_sy <= y2);
			} else if(x2 == x3) {
				drawer.T73_lc2_horizontal = false;
				drawer.T73_lc2_vertical = true;
				drawer.T73_lc2_borderX = x2;
				drawer.T73_lc2_leftOrAbove = (drawer.T73_sx <= x2);
			} else {
				drawer.T73_lc2_horizontal = false;
				drawer.T73_lc2_vertical = false;
				drawer.T73_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T73_lc2_C = x2 - drawer.T73_lc2_m * y2;
				drawer.T73_lc2_leftOrAbove = (drawer.T73_sx < drawer.T73_lc2_m*drawer.T73_sy + drawer.T73_lc2_C);
			}

			if(y3 == y1) {
				drawer.T73_lc3_horizontal = true;
				drawer.T73_lc3_vertical = false;
				drawer.T73_lc3_borderY = y3;
				drawer.T73_lc3_leftOrAbove = (drawer.T73_sy <= y3);
			} else if(x3 == x1) {
				drawer.T73_lc3_horizontal = false;
				drawer.T73_lc3_vertical = true;
				drawer.T73_lc3_borderX = x3;
				drawer.T73_lc3_leftOrAbove = (drawer.T73_sx <= x3);
			} else {
				drawer.T73_lc3_horizontal = false;
				drawer.T73_lc3_vertical = false;
				drawer.T73_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T73_lc3_C = x3 - drawer.T73_lc3_m * y3;
				drawer.T73_lc3_leftOrAbove = (drawer.T73_sx < drawer.T73_lc3_m*drawer.T73_sy + drawer.T73_lc3_C);
			}

			drawer.T73_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T73_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T73_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T73_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T73_initializedWithValidData = true;
		}

		t = triangles[74]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T74_r = t.r; drawer.T74_g = t.g; drawer.T74_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T74_initializedWithValidData = false;
		} else {

			drawer.T74_sx = (x1 + x2 + x3) / 3.0;
			drawer.T74_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T74_lc1_horizontal = true;
				drawer.T74_lc1_vertical = false;
				drawer.T74_lc1_borderY = y1;
				drawer.T74_lc1_leftOrAbove = (drawer.T74_sy <= y1);
			} else if(x1 == x2) {
				drawer.T74_lc1_horizontal = false;
				drawer.T74_lc1_vertical = true;
				drawer.T74_lc1_borderX = x1;
				drawer.T74_lc1_leftOrAbove = (drawer.T74_sx <= x1);
			} else {
				drawer.T74_lc1_horizontal = false;
				drawer.T74_lc1_vertical = false;
				drawer.T74_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T74_lc1_C = x1 - drawer.T74_lc1_m * y1;
				drawer.T74_lc1_leftOrAbove = (drawer.T74_sx < drawer.T74_lc1_m*drawer.T74_sy + drawer.T74_lc1_C);
			}

			if(y2 == y3) {
				drawer.T74_lc2_horizontal = true;
				drawer.T74_lc2_vertical = false;
				drawer.T74_lc2_borderY = y2;
				drawer.T74_lc2_leftOrAbove = (drawer.T74_sy <= y2);
			} else if(x2 == x3) {
				drawer.T74_lc2_horizontal = false;
				drawer.T74_lc2_vertical = true;
				drawer.T74_lc2_borderX = x2;
				drawer.T74_lc2_leftOrAbove = (drawer.T74_sx <= x2);
			} else {
				drawer.T74_lc2_horizontal = false;
				drawer.T74_lc2_vertical = false;
				drawer.T74_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T74_lc2_C = x2 - drawer.T74_lc2_m * y2;
				drawer.T74_lc2_leftOrAbove = (drawer.T74_sx < drawer.T74_lc2_m*drawer.T74_sy + drawer.T74_lc2_C);
			}

			if(y3 == y1) {
				drawer.T74_lc3_horizontal = true;
				drawer.T74_lc3_vertical = false;
				drawer.T74_lc3_borderY = y3;
				drawer.T74_lc3_leftOrAbove = (drawer.T74_sy <= y3);
			} else if(x3 == x1) {
				drawer.T74_lc3_horizontal = false;
				drawer.T74_lc3_vertical = true;
				drawer.T74_lc3_borderX = x3;
				drawer.T74_lc3_leftOrAbove = (drawer.T74_sx <= x3);
			} else {
				drawer.T74_lc3_horizontal = false;
				drawer.T74_lc3_vertical = false;
				drawer.T74_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T74_lc3_C = x3 - drawer.T74_lc3_m * y3;
				drawer.T74_lc3_leftOrAbove = (drawer.T74_sx < drawer.T74_lc3_m*drawer.T74_sy + drawer.T74_lc3_C);
			}

			drawer.T74_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T74_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T74_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T74_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T74_initializedWithValidData = true;
		}

		t = triangles[75]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T75_r = t.r; drawer.T75_g = t.g; drawer.T75_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T75_initializedWithValidData = false;
		} else {

			drawer.T75_sx = (x1 + x2 + x3) / 3.0;
			drawer.T75_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T75_lc1_horizontal = true;
				drawer.T75_lc1_vertical = false;
				drawer.T75_lc1_borderY = y1;
				drawer.T75_lc1_leftOrAbove = (drawer.T75_sy <= y1);
			} else if(x1 == x2) {
				drawer.T75_lc1_horizontal = false;
				drawer.T75_lc1_vertical = true;
				drawer.T75_lc1_borderX = x1;
				drawer.T75_lc1_leftOrAbove = (drawer.T75_sx <= x1);
			} else {
				drawer.T75_lc1_horizontal = false;
				drawer.T75_lc1_vertical = false;
				drawer.T75_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T75_lc1_C = x1 - drawer.T75_lc1_m * y1;
				drawer.T75_lc1_leftOrAbove = (drawer.T75_sx < drawer.T75_lc1_m*drawer.T75_sy + drawer.T75_lc1_C);
			}

			if(y2 == y3) {
				drawer.T75_lc2_horizontal = true;
				drawer.T75_lc2_vertical = false;
				drawer.T75_lc2_borderY = y2;
				drawer.T75_lc2_leftOrAbove = (drawer.T75_sy <= y2);
			} else if(x2 == x3) {
				drawer.T75_lc2_horizontal = false;
				drawer.T75_lc2_vertical = true;
				drawer.T75_lc2_borderX = x2;
				drawer.T75_lc2_leftOrAbove = (drawer.T75_sx <= x2);
			} else {
				drawer.T75_lc2_horizontal = false;
				drawer.T75_lc2_vertical = false;
				drawer.T75_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T75_lc2_C = x2 - drawer.T75_lc2_m * y2;
				drawer.T75_lc2_leftOrAbove = (drawer.T75_sx < drawer.T75_lc2_m*drawer.T75_sy + drawer.T75_lc2_C);
			}

			if(y3 == y1) {
				drawer.T75_lc3_horizontal = true;
				drawer.T75_lc3_vertical = false;
				drawer.T75_lc3_borderY = y3;
				drawer.T75_lc3_leftOrAbove = (drawer.T75_sy <= y3);
			} else if(x3 == x1) {
				drawer.T75_lc3_horizontal = false;
				drawer.T75_lc3_vertical = true;
				drawer.T75_lc3_borderX = x3;
				drawer.T75_lc3_leftOrAbove = (drawer.T75_sx <= x3);
			} else {
				drawer.T75_lc3_horizontal = false;
				drawer.T75_lc3_vertical = false;
				drawer.T75_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T75_lc3_C = x3 - drawer.T75_lc3_m * y3;
				drawer.T75_lc3_leftOrAbove = (drawer.T75_sx < drawer.T75_lc3_m*drawer.T75_sy + drawer.T75_lc3_C);
			}

			drawer.T75_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T75_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T75_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T75_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T75_initializedWithValidData = true;
		}

		t = triangles[76]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T76_r = t.r; drawer.T76_g = t.g; drawer.T76_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T76_initializedWithValidData = false;
		} else {

			drawer.T76_sx = (x1 + x2 + x3) / 3.0;
			drawer.T76_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T76_lc1_horizontal = true;
				drawer.T76_lc1_vertical = false;
				drawer.T76_lc1_borderY = y1;
				drawer.T76_lc1_leftOrAbove = (drawer.T76_sy <= y1);
			} else if(x1 == x2) {
				drawer.T76_lc1_horizontal = false;
				drawer.T76_lc1_vertical = true;
				drawer.T76_lc1_borderX = x1;
				drawer.T76_lc1_leftOrAbove = (drawer.T76_sx <= x1);
			} else {
				drawer.T76_lc1_horizontal = false;
				drawer.T76_lc1_vertical = false;
				drawer.T76_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T76_lc1_C = x1 - drawer.T76_lc1_m * y1;
				drawer.T76_lc1_leftOrAbove = (drawer.T76_sx < drawer.T76_lc1_m*drawer.T76_sy + drawer.T76_lc1_C);
			}

			if(y2 == y3) {
				drawer.T76_lc2_horizontal = true;
				drawer.T76_lc2_vertical = false;
				drawer.T76_lc2_borderY = y2;
				drawer.T76_lc2_leftOrAbove = (drawer.T76_sy <= y2);
			} else if(x2 == x3) {
				drawer.T76_lc2_horizontal = false;
				drawer.T76_lc2_vertical = true;
				drawer.T76_lc2_borderX = x2;
				drawer.T76_lc2_leftOrAbove = (drawer.T76_sx <= x2);
			} else {
				drawer.T76_lc2_horizontal = false;
				drawer.T76_lc2_vertical = false;
				drawer.T76_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T76_lc2_C = x2 - drawer.T76_lc2_m * y2;
				drawer.T76_lc2_leftOrAbove = (drawer.T76_sx < drawer.T76_lc2_m*drawer.T76_sy + drawer.T76_lc2_C);
			}

			if(y3 == y1) {
				drawer.T76_lc3_horizontal = true;
				drawer.T76_lc3_vertical = false;
				drawer.T76_lc3_borderY = y3;
				drawer.T76_lc3_leftOrAbove = (drawer.T76_sy <= y3);
			} else if(x3 == x1) {
				drawer.T76_lc3_horizontal = false;
				drawer.T76_lc3_vertical = true;
				drawer.T76_lc3_borderX = x3;
				drawer.T76_lc3_leftOrAbove = (drawer.T76_sx <= x3);
			} else {
				drawer.T76_lc3_horizontal = false;
				drawer.T76_lc3_vertical = false;
				drawer.T76_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T76_lc3_C = x3 - drawer.T76_lc3_m * y3;
				drawer.T76_lc3_leftOrAbove = (drawer.T76_sx < drawer.T76_lc3_m*drawer.T76_sy + drawer.T76_lc3_C);
			}

			drawer.T76_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T76_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T76_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T76_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T76_initializedWithValidData = true;
		}

		t = triangles[77]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T77_r = t.r; drawer.T77_g = t.g; drawer.T77_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T77_initializedWithValidData = false;
		} else {

			drawer.T77_sx = (x1 + x2 + x3) / 3.0;
			drawer.T77_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T77_lc1_horizontal = true;
				drawer.T77_lc1_vertical = false;
				drawer.T77_lc1_borderY = y1;
				drawer.T77_lc1_leftOrAbove = (drawer.T77_sy <= y1);
			} else if(x1 == x2) {
				drawer.T77_lc1_horizontal = false;
				drawer.T77_lc1_vertical = true;
				drawer.T77_lc1_borderX = x1;
				drawer.T77_lc1_leftOrAbove = (drawer.T77_sx <= x1);
			} else {
				drawer.T77_lc1_horizontal = false;
				drawer.T77_lc1_vertical = false;
				drawer.T77_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T77_lc1_C = x1 - drawer.T77_lc1_m * y1;
				drawer.T77_lc1_leftOrAbove = (drawer.T77_sx < drawer.T77_lc1_m*drawer.T77_sy + drawer.T77_lc1_C);
			}

			if(y2 == y3) {
				drawer.T77_lc2_horizontal = true;
				drawer.T77_lc2_vertical = false;
				drawer.T77_lc2_borderY = y2;
				drawer.T77_lc2_leftOrAbove = (drawer.T77_sy <= y2);
			} else if(x2 == x3) {
				drawer.T77_lc2_horizontal = false;
				drawer.T77_lc2_vertical = true;
				drawer.T77_lc2_borderX = x2;
				drawer.T77_lc2_leftOrAbove = (drawer.T77_sx <= x2);
			} else {
				drawer.T77_lc2_horizontal = false;
				drawer.T77_lc2_vertical = false;
				drawer.T77_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T77_lc2_C = x2 - drawer.T77_lc2_m * y2;
				drawer.T77_lc2_leftOrAbove = (drawer.T77_sx < drawer.T77_lc2_m*drawer.T77_sy + drawer.T77_lc2_C);
			}

			if(y3 == y1) {
				drawer.T77_lc3_horizontal = true;
				drawer.T77_lc3_vertical = false;
				drawer.T77_lc3_borderY = y3;
				drawer.T77_lc3_leftOrAbove = (drawer.T77_sy <= y3);
			} else if(x3 == x1) {
				drawer.T77_lc3_horizontal = false;
				drawer.T77_lc3_vertical = true;
				drawer.T77_lc3_borderX = x3;
				drawer.T77_lc3_leftOrAbove = (drawer.T77_sx <= x3);
			} else {
				drawer.T77_lc3_horizontal = false;
				drawer.T77_lc3_vertical = false;
				drawer.T77_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T77_lc3_C = x3 - drawer.T77_lc3_m * y3;
				drawer.T77_lc3_leftOrAbove = (drawer.T77_sx < drawer.T77_lc3_m*drawer.T77_sy + drawer.T77_lc3_C);
			}

			drawer.T77_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T77_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T77_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T77_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T77_initializedWithValidData = true;
		}

		t = triangles[78]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T78_r = t.r; drawer.T78_g = t.g; drawer.T78_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T78_initializedWithValidData = false;
		} else {

			drawer.T78_sx = (x1 + x2 + x3) / 3.0;
			drawer.T78_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T78_lc1_horizontal = true;
				drawer.T78_lc1_vertical = false;
				drawer.T78_lc1_borderY = y1;
				drawer.T78_lc1_leftOrAbove = (drawer.T78_sy <= y1);
			} else if(x1 == x2) {
				drawer.T78_lc1_horizontal = false;
				drawer.T78_lc1_vertical = true;
				drawer.T78_lc1_borderX = x1;
				drawer.T78_lc1_leftOrAbove = (drawer.T78_sx <= x1);
			} else {
				drawer.T78_lc1_horizontal = false;
				drawer.T78_lc1_vertical = false;
				drawer.T78_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T78_lc1_C = x1 - drawer.T78_lc1_m * y1;
				drawer.T78_lc1_leftOrAbove = (drawer.T78_sx < drawer.T78_lc1_m*drawer.T78_sy + drawer.T78_lc1_C);
			}

			if(y2 == y3) {
				drawer.T78_lc2_horizontal = true;
				drawer.T78_lc2_vertical = false;
				drawer.T78_lc2_borderY = y2;
				drawer.T78_lc2_leftOrAbove = (drawer.T78_sy <= y2);
			} else if(x2 == x3) {
				drawer.T78_lc2_horizontal = false;
				drawer.T78_lc2_vertical = true;
				drawer.T78_lc2_borderX = x2;
				drawer.T78_lc2_leftOrAbove = (drawer.T78_sx <= x2);
			} else {
				drawer.T78_lc2_horizontal = false;
				drawer.T78_lc2_vertical = false;
				drawer.T78_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T78_lc2_C = x2 - drawer.T78_lc2_m * y2;
				drawer.T78_lc2_leftOrAbove = (drawer.T78_sx < drawer.T78_lc2_m*drawer.T78_sy + drawer.T78_lc2_C);
			}

			if(y3 == y1) {
				drawer.T78_lc3_horizontal = true;
				drawer.T78_lc3_vertical = false;
				drawer.T78_lc3_borderY = y3;
				drawer.T78_lc3_leftOrAbove = (drawer.T78_sy <= y3);
			} else if(x3 == x1) {
				drawer.T78_lc3_horizontal = false;
				drawer.T78_lc3_vertical = true;
				drawer.T78_lc3_borderX = x3;
				drawer.T78_lc3_leftOrAbove = (drawer.T78_sx <= x3);
			} else {
				drawer.T78_lc3_horizontal = false;
				drawer.T78_lc3_vertical = false;
				drawer.T78_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T78_lc3_C = x3 - drawer.T78_lc3_m * y3;
				drawer.T78_lc3_leftOrAbove = (drawer.T78_sx < drawer.T78_lc3_m*drawer.T78_sy + drawer.T78_lc3_C);
			}

			drawer.T78_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T78_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T78_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T78_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T78_initializedWithValidData = true;
		}

		t = triangles[79]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T79_r = t.r; drawer.T79_g = t.g; drawer.T79_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T79_initializedWithValidData = false;
		} else {

			drawer.T79_sx = (x1 + x2 + x3) / 3.0;
			drawer.T79_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T79_lc1_horizontal = true;
				drawer.T79_lc1_vertical = false;
				drawer.T79_lc1_borderY = y1;
				drawer.T79_lc1_leftOrAbove = (drawer.T79_sy <= y1);
			} else if(x1 == x2) {
				drawer.T79_lc1_horizontal = false;
				drawer.T79_lc1_vertical = true;
				drawer.T79_lc1_borderX = x1;
				drawer.T79_lc1_leftOrAbove = (drawer.T79_sx <= x1);
			} else {
				drawer.T79_lc1_horizontal = false;
				drawer.T79_lc1_vertical = false;
				drawer.T79_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T79_lc1_C = x1 - drawer.T79_lc1_m * y1;
				drawer.T79_lc1_leftOrAbove = (drawer.T79_sx < drawer.T79_lc1_m*drawer.T79_sy + drawer.T79_lc1_C);
			}

			if(y2 == y3) {
				drawer.T79_lc2_horizontal = true;
				drawer.T79_lc2_vertical = false;
				drawer.T79_lc2_borderY = y2;
				drawer.T79_lc2_leftOrAbove = (drawer.T79_sy <= y2);
			} else if(x2 == x3) {
				drawer.T79_lc2_horizontal = false;
				drawer.T79_lc2_vertical = true;
				drawer.T79_lc2_borderX = x2;
				drawer.T79_lc2_leftOrAbove = (drawer.T79_sx <= x2);
			} else {
				drawer.T79_lc2_horizontal = false;
				drawer.T79_lc2_vertical = false;
				drawer.T79_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T79_lc2_C = x2 - drawer.T79_lc2_m * y2;
				drawer.T79_lc2_leftOrAbove = (drawer.T79_sx < drawer.T79_lc2_m*drawer.T79_sy + drawer.T79_lc2_C);
			}

			if(y3 == y1) {
				drawer.T79_lc3_horizontal = true;
				drawer.T79_lc3_vertical = false;
				drawer.T79_lc3_borderY = y3;
				drawer.T79_lc3_leftOrAbove = (drawer.T79_sy <= y3);
			} else if(x3 == x1) {
				drawer.T79_lc3_horizontal = false;
				drawer.T79_lc3_vertical = true;
				drawer.T79_lc3_borderX = x3;
				drawer.T79_lc3_leftOrAbove = (drawer.T79_sx <= x3);
			} else {
				drawer.T79_lc3_horizontal = false;
				drawer.T79_lc3_vertical = false;
				drawer.T79_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T79_lc3_C = x3 - drawer.T79_lc3_m * y3;
				drawer.T79_lc3_leftOrAbove = (drawer.T79_sx < drawer.T79_lc3_m*drawer.T79_sy + drawer.T79_lc3_C);
			}

			drawer.T79_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T79_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T79_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T79_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T79_initializedWithValidData = true;
		}

		t = triangles[80]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T80_r = t.r; drawer.T80_g = t.g; drawer.T80_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T80_initializedWithValidData = false;
		} else {

			drawer.T80_sx = (x1 + x2 + x3) / 3.0;
			drawer.T80_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T80_lc1_horizontal = true;
				drawer.T80_lc1_vertical = false;
				drawer.T80_lc1_borderY = y1;
				drawer.T80_lc1_leftOrAbove = (drawer.T80_sy <= y1);
			} else if(x1 == x2) {
				drawer.T80_lc1_horizontal = false;
				drawer.T80_lc1_vertical = true;
				drawer.T80_lc1_borderX = x1;
				drawer.T80_lc1_leftOrAbove = (drawer.T80_sx <= x1);
			} else {
				drawer.T80_lc1_horizontal = false;
				drawer.T80_lc1_vertical = false;
				drawer.T80_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T80_lc1_C = x1 - drawer.T80_lc1_m * y1;
				drawer.T80_lc1_leftOrAbove = (drawer.T80_sx < drawer.T80_lc1_m*drawer.T80_sy + drawer.T80_lc1_C);
			}

			if(y2 == y3) {
				drawer.T80_lc2_horizontal = true;
				drawer.T80_lc2_vertical = false;
				drawer.T80_lc2_borderY = y2;
				drawer.T80_lc2_leftOrAbove = (drawer.T80_sy <= y2);
			} else if(x2 == x3) {
				drawer.T80_lc2_horizontal = false;
				drawer.T80_lc2_vertical = true;
				drawer.T80_lc2_borderX = x2;
				drawer.T80_lc2_leftOrAbove = (drawer.T80_sx <= x2);
			} else {
				drawer.T80_lc2_horizontal = false;
				drawer.T80_lc2_vertical = false;
				drawer.T80_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T80_lc2_C = x2 - drawer.T80_lc2_m * y2;
				drawer.T80_lc2_leftOrAbove = (drawer.T80_sx < drawer.T80_lc2_m*drawer.T80_sy + drawer.T80_lc2_C);
			}

			if(y3 == y1) {
				drawer.T80_lc3_horizontal = true;
				drawer.T80_lc3_vertical = false;
				drawer.T80_lc3_borderY = y3;
				drawer.T80_lc3_leftOrAbove = (drawer.T80_sy <= y3);
			} else if(x3 == x1) {
				drawer.T80_lc3_horizontal = false;
				drawer.T80_lc3_vertical = true;
				drawer.T80_lc3_borderX = x3;
				drawer.T80_lc3_leftOrAbove = (drawer.T80_sx <= x3);
			} else {
				drawer.T80_lc3_horizontal = false;
				drawer.T80_lc3_vertical = false;
				drawer.T80_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T80_lc3_C = x3 - drawer.T80_lc3_m * y3;
				drawer.T80_lc3_leftOrAbove = (drawer.T80_sx < drawer.T80_lc3_m*drawer.T80_sy + drawer.T80_lc3_C);
			}

			drawer.T80_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T80_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T80_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T80_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T80_initializedWithValidData = true;
		}

		t = triangles[81]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T81_r = t.r; drawer.T81_g = t.g; drawer.T81_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T81_initializedWithValidData = false;
		} else {

			drawer.T81_sx = (x1 + x2 + x3) / 3.0;
			drawer.T81_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T81_lc1_horizontal = true;
				drawer.T81_lc1_vertical = false;
				drawer.T81_lc1_borderY = y1;
				drawer.T81_lc1_leftOrAbove = (drawer.T81_sy <= y1);
			} else if(x1 == x2) {
				drawer.T81_lc1_horizontal = false;
				drawer.T81_lc1_vertical = true;
				drawer.T81_lc1_borderX = x1;
				drawer.T81_lc1_leftOrAbove = (drawer.T81_sx <= x1);
			} else {
				drawer.T81_lc1_horizontal = false;
				drawer.T81_lc1_vertical = false;
				drawer.T81_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T81_lc1_C = x1 - drawer.T81_lc1_m * y1;
				drawer.T81_lc1_leftOrAbove = (drawer.T81_sx < drawer.T81_lc1_m*drawer.T81_sy + drawer.T81_lc1_C);
			}

			if(y2 == y3) {
				drawer.T81_lc2_horizontal = true;
				drawer.T81_lc2_vertical = false;
				drawer.T81_lc2_borderY = y2;
				drawer.T81_lc2_leftOrAbove = (drawer.T81_sy <= y2);
			} else if(x2 == x3) {
				drawer.T81_lc2_horizontal = false;
				drawer.T81_lc2_vertical = true;
				drawer.T81_lc2_borderX = x2;
				drawer.T81_lc2_leftOrAbove = (drawer.T81_sx <= x2);
			} else {
				drawer.T81_lc2_horizontal = false;
				drawer.T81_lc2_vertical = false;
				drawer.T81_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T81_lc2_C = x2 - drawer.T81_lc2_m * y2;
				drawer.T81_lc2_leftOrAbove = (drawer.T81_sx < drawer.T81_lc2_m*drawer.T81_sy + drawer.T81_lc2_C);
			}

			if(y3 == y1) {
				drawer.T81_lc3_horizontal = true;
				drawer.T81_lc3_vertical = false;
				drawer.T81_lc3_borderY = y3;
				drawer.T81_lc3_leftOrAbove = (drawer.T81_sy <= y3);
			} else if(x3 == x1) {
				drawer.T81_lc3_horizontal = false;
				drawer.T81_lc3_vertical = true;
				drawer.T81_lc3_borderX = x3;
				drawer.T81_lc3_leftOrAbove = (drawer.T81_sx <= x3);
			} else {
				drawer.T81_lc3_horizontal = false;
				drawer.T81_lc3_vertical = false;
				drawer.T81_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T81_lc3_C = x3 - drawer.T81_lc3_m * y3;
				drawer.T81_lc3_leftOrAbove = (drawer.T81_sx < drawer.T81_lc3_m*drawer.T81_sy + drawer.T81_lc3_C);
			}

			drawer.T81_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T81_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T81_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T81_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T81_initializedWithValidData = true;
		}

		t = triangles[82]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T82_r = t.r; drawer.T82_g = t.g; drawer.T82_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T82_initializedWithValidData = false;
		} else {

			drawer.T82_sx = (x1 + x2 + x3) / 3.0;
			drawer.T82_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T82_lc1_horizontal = true;
				drawer.T82_lc1_vertical = false;
				drawer.T82_lc1_borderY = y1;
				drawer.T82_lc1_leftOrAbove = (drawer.T82_sy <= y1);
			} else if(x1 == x2) {
				drawer.T82_lc1_horizontal = false;
				drawer.T82_lc1_vertical = true;
				drawer.T82_lc1_borderX = x1;
				drawer.T82_lc1_leftOrAbove = (drawer.T82_sx <= x1);
			} else {
				drawer.T82_lc1_horizontal = false;
				drawer.T82_lc1_vertical = false;
				drawer.T82_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T82_lc1_C = x1 - drawer.T82_lc1_m * y1;
				drawer.T82_lc1_leftOrAbove = (drawer.T82_sx < drawer.T82_lc1_m*drawer.T82_sy + drawer.T82_lc1_C);
			}

			if(y2 == y3) {
				drawer.T82_lc2_horizontal = true;
				drawer.T82_lc2_vertical = false;
				drawer.T82_lc2_borderY = y2;
				drawer.T82_lc2_leftOrAbove = (drawer.T82_sy <= y2);
			} else if(x2 == x3) {
				drawer.T82_lc2_horizontal = false;
				drawer.T82_lc2_vertical = true;
				drawer.T82_lc2_borderX = x2;
				drawer.T82_lc2_leftOrAbove = (drawer.T82_sx <= x2);
			} else {
				drawer.T82_lc2_horizontal = false;
				drawer.T82_lc2_vertical = false;
				drawer.T82_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T82_lc2_C = x2 - drawer.T82_lc2_m * y2;
				drawer.T82_lc2_leftOrAbove = (drawer.T82_sx < drawer.T82_lc2_m*drawer.T82_sy + drawer.T82_lc2_C);
			}

			if(y3 == y1) {
				drawer.T82_lc3_horizontal = true;
				drawer.T82_lc3_vertical = false;
				drawer.T82_lc3_borderY = y3;
				drawer.T82_lc3_leftOrAbove = (drawer.T82_sy <= y3);
			} else if(x3 == x1) {
				drawer.T82_lc3_horizontal = false;
				drawer.T82_lc3_vertical = true;
				drawer.T82_lc3_borderX = x3;
				drawer.T82_lc3_leftOrAbove = (drawer.T82_sx <= x3);
			} else {
				drawer.T82_lc3_horizontal = false;
				drawer.T82_lc3_vertical = false;
				drawer.T82_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T82_lc3_C = x3 - drawer.T82_lc3_m * y3;
				drawer.T82_lc3_leftOrAbove = (drawer.T82_sx < drawer.T82_lc3_m*drawer.T82_sy + drawer.T82_lc3_C);
			}

			drawer.T82_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T82_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T82_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T82_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T82_initializedWithValidData = true;
		}

		t = triangles[83]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T83_r = t.r; drawer.T83_g = t.g; drawer.T83_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T83_initializedWithValidData = false;
		} else {

			drawer.T83_sx = (x1 + x2 + x3) / 3.0;
			drawer.T83_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T83_lc1_horizontal = true;
				drawer.T83_lc1_vertical = false;
				drawer.T83_lc1_borderY = y1;
				drawer.T83_lc1_leftOrAbove = (drawer.T83_sy <= y1);
			} else if(x1 == x2) {
				drawer.T83_lc1_horizontal = false;
				drawer.T83_lc1_vertical = true;
				drawer.T83_lc1_borderX = x1;
				drawer.T83_lc1_leftOrAbove = (drawer.T83_sx <= x1);
			} else {
				drawer.T83_lc1_horizontal = false;
				drawer.T83_lc1_vertical = false;
				drawer.T83_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T83_lc1_C = x1 - drawer.T83_lc1_m * y1;
				drawer.T83_lc1_leftOrAbove = (drawer.T83_sx < drawer.T83_lc1_m*drawer.T83_sy + drawer.T83_lc1_C);
			}

			if(y2 == y3) {
				drawer.T83_lc2_horizontal = true;
				drawer.T83_lc2_vertical = false;
				drawer.T83_lc2_borderY = y2;
				drawer.T83_lc2_leftOrAbove = (drawer.T83_sy <= y2);
			} else if(x2 == x3) {
				drawer.T83_lc2_horizontal = false;
				drawer.T83_lc2_vertical = true;
				drawer.T83_lc2_borderX = x2;
				drawer.T83_lc2_leftOrAbove = (drawer.T83_sx <= x2);
			} else {
				drawer.T83_lc2_horizontal = false;
				drawer.T83_lc2_vertical = false;
				drawer.T83_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T83_lc2_C = x2 - drawer.T83_lc2_m * y2;
				drawer.T83_lc2_leftOrAbove = (drawer.T83_sx < drawer.T83_lc2_m*drawer.T83_sy + drawer.T83_lc2_C);
			}

			if(y3 == y1) {
				drawer.T83_lc3_horizontal = true;
				drawer.T83_lc3_vertical = false;
				drawer.T83_lc3_borderY = y3;
				drawer.T83_lc3_leftOrAbove = (drawer.T83_sy <= y3);
			} else if(x3 == x1) {
				drawer.T83_lc3_horizontal = false;
				drawer.T83_lc3_vertical = true;
				drawer.T83_lc3_borderX = x3;
				drawer.T83_lc3_leftOrAbove = (drawer.T83_sx <= x3);
			} else {
				drawer.T83_lc3_horizontal = false;
				drawer.T83_lc3_vertical = false;
				drawer.T83_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T83_lc3_C = x3 - drawer.T83_lc3_m * y3;
				drawer.T83_lc3_leftOrAbove = (drawer.T83_sx < drawer.T83_lc3_m*drawer.T83_sy + drawer.T83_lc3_C);
			}

			drawer.T83_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T83_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T83_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T83_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T83_initializedWithValidData = true;
		}

		t = triangles[84]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T84_r = t.r; drawer.T84_g = t.g; drawer.T84_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T84_initializedWithValidData = false;
		} else {

			drawer.T84_sx = (x1 + x2 + x3) / 3.0;
			drawer.T84_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T84_lc1_horizontal = true;
				drawer.T84_lc1_vertical = false;
				drawer.T84_lc1_borderY = y1;
				drawer.T84_lc1_leftOrAbove = (drawer.T84_sy <= y1);
			} else if(x1 == x2) {
				drawer.T84_lc1_horizontal = false;
				drawer.T84_lc1_vertical = true;
				drawer.T84_lc1_borderX = x1;
				drawer.T84_lc1_leftOrAbove = (drawer.T84_sx <= x1);
			} else {
				drawer.T84_lc1_horizontal = false;
				drawer.T84_lc1_vertical = false;
				drawer.T84_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T84_lc1_C = x1 - drawer.T84_lc1_m * y1;
				drawer.T84_lc1_leftOrAbove = (drawer.T84_sx < drawer.T84_lc1_m*drawer.T84_sy + drawer.T84_lc1_C);
			}

			if(y2 == y3) {
				drawer.T84_lc2_horizontal = true;
				drawer.T84_lc2_vertical = false;
				drawer.T84_lc2_borderY = y2;
				drawer.T84_lc2_leftOrAbove = (drawer.T84_sy <= y2);
			} else if(x2 == x3) {
				drawer.T84_lc2_horizontal = false;
				drawer.T84_lc2_vertical = true;
				drawer.T84_lc2_borderX = x2;
				drawer.T84_lc2_leftOrAbove = (drawer.T84_sx <= x2);
			} else {
				drawer.T84_lc2_horizontal = false;
				drawer.T84_lc2_vertical = false;
				drawer.T84_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T84_lc2_C = x2 - drawer.T84_lc2_m * y2;
				drawer.T84_lc2_leftOrAbove = (drawer.T84_sx < drawer.T84_lc2_m*drawer.T84_sy + drawer.T84_lc2_C);
			}

			if(y3 == y1) {
				drawer.T84_lc3_horizontal = true;
				drawer.T84_lc3_vertical = false;
				drawer.T84_lc3_borderY = y3;
				drawer.T84_lc3_leftOrAbove = (drawer.T84_sy <= y3);
			} else if(x3 == x1) {
				drawer.T84_lc3_horizontal = false;
				drawer.T84_lc3_vertical = true;
				drawer.T84_lc3_borderX = x3;
				drawer.T84_lc3_leftOrAbove = (drawer.T84_sx <= x3);
			} else {
				drawer.T84_lc3_horizontal = false;
				drawer.T84_lc3_vertical = false;
				drawer.T84_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T84_lc3_C = x3 - drawer.T84_lc3_m * y3;
				drawer.T84_lc3_leftOrAbove = (drawer.T84_sx < drawer.T84_lc3_m*drawer.T84_sy + drawer.T84_lc3_C);
			}

			drawer.T84_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T84_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T84_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T84_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T84_initializedWithValidData = true;
		}

		t = triangles[85]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T85_r = t.r; drawer.T85_g = t.g; drawer.T85_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T85_initializedWithValidData = false;
		} else {

			drawer.T85_sx = (x1 + x2 + x3) / 3.0;
			drawer.T85_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T85_lc1_horizontal = true;
				drawer.T85_lc1_vertical = false;
				drawer.T85_lc1_borderY = y1;
				drawer.T85_lc1_leftOrAbove = (drawer.T85_sy <= y1);
			} else if(x1 == x2) {
				drawer.T85_lc1_horizontal = false;
				drawer.T85_lc1_vertical = true;
				drawer.T85_lc1_borderX = x1;
				drawer.T85_lc1_leftOrAbove = (drawer.T85_sx <= x1);
			} else {
				drawer.T85_lc1_horizontal = false;
				drawer.T85_lc1_vertical = false;
				drawer.T85_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T85_lc1_C = x1 - drawer.T85_lc1_m * y1;
				drawer.T85_lc1_leftOrAbove = (drawer.T85_sx < drawer.T85_lc1_m*drawer.T85_sy + drawer.T85_lc1_C);
			}

			if(y2 == y3) {
				drawer.T85_lc2_horizontal = true;
				drawer.T85_lc2_vertical = false;
				drawer.T85_lc2_borderY = y2;
				drawer.T85_lc2_leftOrAbove = (drawer.T85_sy <= y2);
			} else if(x2 == x3) {
				drawer.T85_lc2_horizontal = false;
				drawer.T85_lc2_vertical = true;
				drawer.T85_lc2_borderX = x2;
				drawer.T85_lc2_leftOrAbove = (drawer.T85_sx <= x2);
			} else {
				drawer.T85_lc2_horizontal = false;
				drawer.T85_lc2_vertical = false;
				drawer.T85_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T85_lc2_C = x2 - drawer.T85_lc2_m * y2;
				drawer.T85_lc2_leftOrAbove = (drawer.T85_sx < drawer.T85_lc2_m*drawer.T85_sy + drawer.T85_lc2_C);
			}

			if(y3 == y1) {
				drawer.T85_lc3_horizontal = true;
				drawer.T85_lc3_vertical = false;
				drawer.T85_lc3_borderY = y3;
				drawer.T85_lc3_leftOrAbove = (drawer.T85_sy <= y3);
			} else if(x3 == x1) {
				drawer.T85_lc3_horizontal = false;
				drawer.T85_lc3_vertical = true;
				drawer.T85_lc3_borderX = x3;
				drawer.T85_lc3_leftOrAbove = (drawer.T85_sx <= x3);
			} else {
				drawer.T85_lc3_horizontal = false;
				drawer.T85_lc3_vertical = false;
				drawer.T85_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T85_lc3_C = x3 - drawer.T85_lc3_m * y3;
				drawer.T85_lc3_leftOrAbove = (drawer.T85_sx < drawer.T85_lc3_m*drawer.T85_sy + drawer.T85_lc3_C);
			}

			drawer.T85_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T85_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T85_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T85_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T85_initializedWithValidData = true;
		}

		t = triangles[86]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T86_r = t.r; drawer.T86_g = t.g; drawer.T86_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T86_initializedWithValidData = false;
		} else {

			drawer.T86_sx = (x1 + x2 + x3) / 3.0;
			drawer.T86_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T86_lc1_horizontal = true;
				drawer.T86_lc1_vertical = false;
				drawer.T86_lc1_borderY = y1;
				drawer.T86_lc1_leftOrAbove = (drawer.T86_sy <= y1);
			} else if(x1 == x2) {
				drawer.T86_lc1_horizontal = false;
				drawer.T86_lc1_vertical = true;
				drawer.T86_lc1_borderX = x1;
				drawer.T86_lc1_leftOrAbove = (drawer.T86_sx <= x1);
			} else {
				drawer.T86_lc1_horizontal = false;
				drawer.T86_lc1_vertical = false;
				drawer.T86_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T86_lc1_C = x1 - drawer.T86_lc1_m * y1;
				drawer.T86_lc1_leftOrAbove = (drawer.T86_sx < drawer.T86_lc1_m*drawer.T86_sy + drawer.T86_lc1_C);
			}

			if(y2 == y3) {
				drawer.T86_lc2_horizontal = true;
				drawer.T86_lc2_vertical = false;
				drawer.T86_lc2_borderY = y2;
				drawer.T86_lc2_leftOrAbove = (drawer.T86_sy <= y2);
			} else if(x2 == x3) {
				drawer.T86_lc2_horizontal = false;
				drawer.T86_lc2_vertical = true;
				drawer.T86_lc2_borderX = x2;
				drawer.T86_lc2_leftOrAbove = (drawer.T86_sx <= x2);
			} else {
				drawer.T86_lc2_horizontal = false;
				drawer.T86_lc2_vertical = false;
				drawer.T86_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T86_lc2_C = x2 - drawer.T86_lc2_m * y2;
				drawer.T86_lc2_leftOrAbove = (drawer.T86_sx < drawer.T86_lc2_m*drawer.T86_sy + drawer.T86_lc2_C);
			}

			if(y3 == y1) {
				drawer.T86_lc3_horizontal = true;
				drawer.T86_lc3_vertical = false;
				drawer.T86_lc3_borderY = y3;
				drawer.T86_lc3_leftOrAbove = (drawer.T86_sy <= y3);
			} else if(x3 == x1) {
				drawer.T86_lc3_horizontal = false;
				drawer.T86_lc3_vertical = true;
				drawer.T86_lc3_borderX = x3;
				drawer.T86_lc3_leftOrAbove = (drawer.T86_sx <= x3);
			} else {
				drawer.T86_lc3_horizontal = false;
				drawer.T86_lc3_vertical = false;
				drawer.T86_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T86_lc3_C = x3 - drawer.T86_lc3_m * y3;
				drawer.T86_lc3_leftOrAbove = (drawer.T86_sx < drawer.T86_lc3_m*drawer.T86_sy + drawer.T86_lc3_C);
			}

			drawer.T86_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T86_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T86_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T86_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T86_initializedWithValidData = true;
		}

		t = triangles[87]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T87_r = t.r; drawer.T87_g = t.g; drawer.T87_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T87_initializedWithValidData = false;
		} else {

			drawer.T87_sx = (x1 + x2 + x3) / 3.0;
			drawer.T87_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T87_lc1_horizontal = true;
				drawer.T87_lc1_vertical = false;
				drawer.T87_lc1_borderY = y1;
				drawer.T87_lc1_leftOrAbove = (drawer.T87_sy <= y1);
			} else if(x1 == x2) {
				drawer.T87_lc1_horizontal = false;
				drawer.T87_lc1_vertical = true;
				drawer.T87_lc1_borderX = x1;
				drawer.T87_lc1_leftOrAbove = (drawer.T87_sx <= x1);
			} else {
				drawer.T87_lc1_horizontal = false;
				drawer.T87_lc1_vertical = false;
				drawer.T87_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T87_lc1_C = x1 - drawer.T87_lc1_m * y1;
				drawer.T87_lc1_leftOrAbove = (drawer.T87_sx < drawer.T87_lc1_m*drawer.T87_sy + drawer.T87_lc1_C);
			}

			if(y2 == y3) {
				drawer.T87_lc2_horizontal = true;
				drawer.T87_lc2_vertical = false;
				drawer.T87_lc2_borderY = y2;
				drawer.T87_lc2_leftOrAbove = (drawer.T87_sy <= y2);
			} else if(x2 == x3) {
				drawer.T87_lc2_horizontal = false;
				drawer.T87_lc2_vertical = true;
				drawer.T87_lc2_borderX = x2;
				drawer.T87_lc2_leftOrAbove = (drawer.T87_sx <= x2);
			} else {
				drawer.T87_lc2_horizontal = false;
				drawer.T87_lc2_vertical = false;
				drawer.T87_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T87_lc2_C = x2 - drawer.T87_lc2_m * y2;
				drawer.T87_lc2_leftOrAbove = (drawer.T87_sx < drawer.T87_lc2_m*drawer.T87_sy + drawer.T87_lc2_C);
			}

			if(y3 == y1) {
				drawer.T87_lc3_horizontal = true;
				drawer.T87_lc3_vertical = false;
				drawer.T87_lc3_borderY = y3;
				drawer.T87_lc3_leftOrAbove = (drawer.T87_sy <= y3);
			} else if(x3 == x1) {
				drawer.T87_lc3_horizontal = false;
				drawer.T87_lc3_vertical = true;
				drawer.T87_lc3_borderX = x3;
				drawer.T87_lc3_leftOrAbove = (drawer.T87_sx <= x3);
			} else {
				drawer.T87_lc3_horizontal = false;
				drawer.T87_lc3_vertical = false;
				drawer.T87_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T87_lc3_C = x3 - drawer.T87_lc3_m * y3;
				drawer.T87_lc3_leftOrAbove = (drawer.T87_sx < drawer.T87_lc3_m*drawer.T87_sy + drawer.T87_lc3_C);
			}

			drawer.T87_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T87_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T87_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T87_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T87_initializedWithValidData = true;
		}

		t = triangles[88]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T88_r = t.r; drawer.T88_g = t.g; drawer.T88_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T88_initializedWithValidData = false;
		} else {

			drawer.T88_sx = (x1 + x2 + x3) / 3.0;
			drawer.T88_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T88_lc1_horizontal = true;
				drawer.T88_lc1_vertical = false;
				drawer.T88_lc1_borderY = y1;
				drawer.T88_lc1_leftOrAbove = (drawer.T88_sy <= y1);
			} else if(x1 == x2) {
				drawer.T88_lc1_horizontal = false;
				drawer.T88_lc1_vertical = true;
				drawer.T88_lc1_borderX = x1;
				drawer.T88_lc1_leftOrAbove = (drawer.T88_sx <= x1);
			} else {
				drawer.T88_lc1_horizontal = false;
				drawer.T88_lc1_vertical = false;
				drawer.T88_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T88_lc1_C = x1 - drawer.T88_lc1_m * y1;
				drawer.T88_lc1_leftOrAbove = (drawer.T88_sx < drawer.T88_lc1_m*drawer.T88_sy + drawer.T88_lc1_C);
			}

			if(y2 == y3) {
				drawer.T88_lc2_horizontal = true;
				drawer.T88_lc2_vertical = false;
				drawer.T88_lc2_borderY = y2;
				drawer.T88_lc2_leftOrAbove = (drawer.T88_sy <= y2);
			} else if(x2 == x3) {
				drawer.T88_lc2_horizontal = false;
				drawer.T88_lc2_vertical = true;
				drawer.T88_lc2_borderX = x2;
				drawer.T88_lc2_leftOrAbove = (drawer.T88_sx <= x2);
			} else {
				drawer.T88_lc2_horizontal = false;
				drawer.T88_lc2_vertical = false;
				drawer.T88_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T88_lc2_C = x2 - drawer.T88_lc2_m * y2;
				drawer.T88_lc2_leftOrAbove = (drawer.T88_sx < drawer.T88_lc2_m*drawer.T88_sy + drawer.T88_lc2_C);
			}

			if(y3 == y1) {
				drawer.T88_lc3_horizontal = true;
				drawer.T88_lc3_vertical = false;
				drawer.T88_lc3_borderY = y3;
				drawer.T88_lc3_leftOrAbove = (drawer.T88_sy <= y3);
			} else if(x3 == x1) {
				drawer.T88_lc3_horizontal = false;
				drawer.T88_lc3_vertical = true;
				drawer.T88_lc3_borderX = x3;
				drawer.T88_lc3_leftOrAbove = (drawer.T88_sx <= x3);
			} else {
				drawer.T88_lc3_horizontal = false;
				drawer.T88_lc3_vertical = false;
				drawer.T88_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T88_lc3_C = x3 - drawer.T88_lc3_m * y3;
				drawer.T88_lc3_leftOrAbove = (drawer.T88_sx < drawer.T88_lc3_m*drawer.T88_sy + drawer.T88_lc3_C);
			}

			drawer.T88_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T88_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T88_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T88_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T88_initializedWithValidData = true;
		}

		t = triangles[89]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T89_r = t.r; drawer.T89_g = t.g; drawer.T89_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T89_initializedWithValidData = false;
		} else {

			drawer.T89_sx = (x1 + x2 + x3) / 3.0;
			drawer.T89_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T89_lc1_horizontal = true;
				drawer.T89_lc1_vertical = false;
				drawer.T89_lc1_borderY = y1;
				drawer.T89_lc1_leftOrAbove = (drawer.T89_sy <= y1);
			} else if(x1 == x2) {
				drawer.T89_lc1_horizontal = false;
				drawer.T89_lc1_vertical = true;
				drawer.T89_lc1_borderX = x1;
				drawer.T89_lc1_leftOrAbove = (drawer.T89_sx <= x1);
			} else {
				drawer.T89_lc1_horizontal = false;
				drawer.T89_lc1_vertical = false;
				drawer.T89_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T89_lc1_C = x1 - drawer.T89_lc1_m * y1;
				drawer.T89_lc1_leftOrAbove = (drawer.T89_sx < drawer.T89_lc1_m*drawer.T89_sy + drawer.T89_lc1_C);
			}

			if(y2 == y3) {
				drawer.T89_lc2_horizontal = true;
				drawer.T89_lc2_vertical = false;
				drawer.T89_lc2_borderY = y2;
				drawer.T89_lc2_leftOrAbove = (drawer.T89_sy <= y2);
			} else if(x2 == x3) {
				drawer.T89_lc2_horizontal = false;
				drawer.T89_lc2_vertical = true;
				drawer.T89_lc2_borderX = x2;
				drawer.T89_lc2_leftOrAbove = (drawer.T89_sx <= x2);
			} else {
				drawer.T89_lc2_horizontal = false;
				drawer.T89_lc2_vertical = false;
				drawer.T89_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T89_lc2_C = x2 - drawer.T89_lc2_m * y2;
				drawer.T89_lc2_leftOrAbove = (drawer.T89_sx < drawer.T89_lc2_m*drawer.T89_sy + drawer.T89_lc2_C);
			}

			if(y3 == y1) {
				drawer.T89_lc3_horizontal = true;
				drawer.T89_lc3_vertical = false;
				drawer.T89_lc3_borderY = y3;
				drawer.T89_lc3_leftOrAbove = (drawer.T89_sy <= y3);
			} else if(x3 == x1) {
				drawer.T89_lc3_horizontal = false;
				drawer.T89_lc3_vertical = true;
				drawer.T89_lc3_borderX = x3;
				drawer.T89_lc3_leftOrAbove = (drawer.T89_sx <= x3);
			} else {
				drawer.T89_lc3_horizontal = false;
				drawer.T89_lc3_vertical = false;
				drawer.T89_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T89_lc3_C = x3 - drawer.T89_lc3_m * y3;
				drawer.T89_lc3_leftOrAbove = (drawer.T89_sx < drawer.T89_lc3_m*drawer.T89_sy + drawer.T89_lc3_C);
			}

			drawer.T89_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T89_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T89_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T89_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T89_initializedWithValidData = true;
		}
	}

	public void loadTriangles4(SingleTriangle[] triangles) {
		int x1, y1, x2, y2, x3, y3;
		SingleTriangle t;

		t = triangles[90]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T90_r = t.r; drawer.T90_g = t.g; drawer.T90_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T90_initializedWithValidData = false;
		} else {

			drawer.T90_sx = (x1 + x2 + x3) / 3.0;
			drawer.T90_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T90_lc1_horizontal = true;
				drawer.T90_lc1_vertical = false;
				drawer.T90_lc1_borderY = y1;
				drawer.T90_lc1_leftOrAbove = (drawer.T90_sy <= y1);
			} else if(x1 == x2) {
				drawer.T90_lc1_horizontal = false;
				drawer.T90_lc1_vertical = true;
				drawer.T90_lc1_borderX = x1;
				drawer.T90_lc1_leftOrAbove = (drawer.T90_sx <= x1);
			} else {
				drawer.T90_lc1_horizontal = false;
				drawer.T90_lc1_vertical = false;
				drawer.T90_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T90_lc1_C = x1 - drawer.T90_lc1_m * y1;
				drawer.T90_lc1_leftOrAbove = (drawer.T90_sx < drawer.T90_lc1_m*drawer.T90_sy + drawer.T90_lc1_C);
			}

			if(y2 == y3) {
				drawer.T90_lc2_horizontal = true;
				drawer.T90_lc2_vertical = false;
				drawer.T90_lc2_borderY = y2;
				drawer.T90_lc2_leftOrAbove = (drawer.T90_sy <= y2);
			} else if(x2 == x3) {
				drawer.T90_lc2_horizontal = false;
				drawer.T90_lc2_vertical = true;
				drawer.T90_lc2_borderX = x2;
				drawer.T90_lc2_leftOrAbove = (drawer.T90_sx <= x2);
			} else {
				drawer.T90_lc2_horizontal = false;
				drawer.T90_lc2_vertical = false;
				drawer.T90_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T90_lc2_C = x2 - drawer.T90_lc2_m * y2;
				drawer.T90_lc2_leftOrAbove = (drawer.T90_sx < drawer.T90_lc2_m*drawer.T90_sy + drawer.T90_lc2_C);
			}

			if(y3 == y1) {
				drawer.T90_lc3_horizontal = true;
				drawer.T90_lc3_vertical = false;
				drawer.T90_lc3_borderY = y3;
				drawer.T90_lc3_leftOrAbove = (drawer.T90_sy <= y3);
			} else if(x3 == x1) {
				drawer.T90_lc3_horizontal = false;
				drawer.T90_lc3_vertical = true;
				drawer.T90_lc3_borderX = x3;
				drawer.T90_lc3_leftOrAbove = (drawer.T90_sx <= x3);
			} else {
				drawer.T90_lc3_horizontal = false;
				drawer.T90_lc3_vertical = false;
				drawer.T90_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T90_lc3_C = x3 - drawer.T90_lc3_m * y3;
				drawer.T90_lc3_leftOrAbove = (drawer.T90_sx < drawer.T90_lc3_m*drawer.T90_sy + drawer.T90_lc3_C);
			}

			drawer.T90_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T90_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T90_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T90_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T90_initializedWithValidData = true;
		}

		t = triangles[91]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T91_r = t.r; drawer.T91_g = t.g; drawer.T91_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T91_initializedWithValidData = false;
		} else {

			drawer.T91_sx = (x1 + x2 + x3) / 3.0;
			drawer.T91_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T91_lc1_horizontal = true;
				drawer.T91_lc1_vertical = false;
				drawer.T91_lc1_borderY = y1;
				drawer.T91_lc1_leftOrAbove = (drawer.T91_sy <= y1);
			} else if(x1 == x2) {
				drawer.T91_lc1_horizontal = false;
				drawer.T91_lc1_vertical = true;
				drawer.T91_lc1_borderX = x1;
				drawer.T91_lc1_leftOrAbove = (drawer.T91_sx <= x1);
			} else {
				drawer.T91_lc1_horizontal = false;
				drawer.T91_lc1_vertical = false;
				drawer.T91_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T91_lc1_C = x1 - drawer.T91_lc1_m * y1;
				drawer.T91_lc1_leftOrAbove = (drawer.T91_sx < drawer.T91_lc1_m*drawer.T91_sy + drawer.T91_lc1_C);
			}

			if(y2 == y3) {
				drawer.T91_lc2_horizontal = true;
				drawer.T91_lc2_vertical = false;
				drawer.T91_lc2_borderY = y2;
				drawer.T91_lc2_leftOrAbove = (drawer.T91_sy <= y2);
			} else if(x2 == x3) {
				drawer.T91_lc2_horizontal = false;
				drawer.T91_lc2_vertical = true;
				drawer.T91_lc2_borderX = x2;
				drawer.T91_lc2_leftOrAbove = (drawer.T91_sx <= x2);
			} else {
				drawer.T91_lc2_horizontal = false;
				drawer.T91_lc2_vertical = false;
				drawer.T91_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T91_lc2_C = x2 - drawer.T91_lc2_m * y2;
				drawer.T91_lc2_leftOrAbove = (drawer.T91_sx < drawer.T91_lc2_m*drawer.T91_sy + drawer.T91_lc2_C);
			}

			if(y3 == y1) {
				drawer.T91_lc3_horizontal = true;
				drawer.T91_lc3_vertical = false;
				drawer.T91_lc3_borderY = y3;
				drawer.T91_lc3_leftOrAbove = (drawer.T91_sy <= y3);
			} else if(x3 == x1) {
				drawer.T91_lc3_horizontal = false;
				drawer.T91_lc3_vertical = true;
				drawer.T91_lc3_borderX = x3;
				drawer.T91_lc3_leftOrAbove = (drawer.T91_sx <= x3);
			} else {
				drawer.T91_lc3_horizontal = false;
				drawer.T91_lc3_vertical = false;
				drawer.T91_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T91_lc3_C = x3 - drawer.T91_lc3_m * y3;
				drawer.T91_lc3_leftOrAbove = (drawer.T91_sx < drawer.T91_lc3_m*drawer.T91_sy + drawer.T91_lc3_C);
			}

			drawer.T91_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T91_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T91_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T91_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T91_initializedWithValidData = true;
		}

		t = triangles[92]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T92_r = t.r; drawer.T92_g = t.g; drawer.T92_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T92_initializedWithValidData = false;
		} else {

			drawer.T92_sx = (x1 + x2 + x3) / 3.0;
			drawer.T92_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T92_lc1_horizontal = true;
				drawer.T92_lc1_vertical = false;
				drawer.T92_lc1_borderY = y1;
				drawer.T92_lc1_leftOrAbove = (drawer.T92_sy <= y1);
			} else if(x1 == x2) {
				drawer.T92_lc1_horizontal = false;
				drawer.T92_lc1_vertical = true;
				drawer.T92_lc1_borderX = x1;
				drawer.T92_lc1_leftOrAbove = (drawer.T92_sx <= x1);
			} else {
				drawer.T92_lc1_horizontal = false;
				drawer.T92_lc1_vertical = false;
				drawer.T92_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T92_lc1_C = x1 - drawer.T92_lc1_m * y1;
				drawer.T92_lc1_leftOrAbove = (drawer.T92_sx < drawer.T92_lc1_m*drawer.T92_sy + drawer.T92_lc1_C);
			}

			if(y2 == y3) {
				drawer.T92_lc2_horizontal = true;
				drawer.T92_lc2_vertical = false;
				drawer.T92_lc2_borderY = y2;
				drawer.T92_lc2_leftOrAbove = (drawer.T92_sy <= y2);
			} else if(x2 == x3) {
				drawer.T92_lc2_horizontal = false;
				drawer.T92_lc2_vertical = true;
				drawer.T92_lc2_borderX = x2;
				drawer.T92_lc2_leftOrAbove = (drawer.T92_sx <= x2);
			} else {
				drawer.T92_lc2_horizontal = false;
				drawer.T92_lc2_vertical = false;
				drawer.T92_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T92_lc2_C = x2 - drawer.T92_lc2_m * y2;
				drawer.T92_lc2_leftOrAbove = (drawer.T92_sx < drawer.T92_lc2_m*drawer.T92_sy + drawer.T92_lc2_C);
			}

			if(y3 == y1) {
				drawer.T92_lc3_horizontal = true;
				drawer.T92_lc3_vertical = false;
				drawer.T92_lc3_borderY = y3;
				drawer.T92_lc3_leftOrAbove = (drawer.T92_sy <= y3);
			} else if(x3 == x1) {
				drawer.T92_lc3_horizontal = false;
				drawer.T92_lc3_vertical = true;
				drawer.T92_lc3_borderX = x3;
				drawer.T92_lc3_leftOrAbove = (drawer.T92_sx <= x3);
			} else {
				drawer.T92_lc3_horizontal = false;
				drawer.T92_lc3_vertical = false;
				drawer.T92_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T92_lc3_C = x3 - drawer.T92_lc3_m * y3;
				drawer.T92_lc3_leftOrAbove = (drawer.T92_sx < drawer.T92_lc3_m*drawer.T92_sy + drawer.T92_lc3_C);
			}

			drawer.T92_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T92_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T92_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T92_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T92_initializedWithValidData = true;
		}

		t = triangles[93]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T93_r = t.r; drawer.T93_g = t.g; drawer.T93_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T93_initializedWithValidData = false;
		} else {

			drawer.T93_sx = (x1 + x2 + x3) / 3.0;
			drawer.T93_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T93_lc1_horizontal = true;
				drawer.T93_lc1_vertical = false;
				drawer.T93_lc1_borderY = y1;
				drawer.T93_lc1_leftOrAbove = (drawer.T93_sy <= y1);
			} else if(x1 == x2) {
				drawer.T93_lc1_horizontal = false;
				drawer.T93_lc1_vertical = true;
				drawer.T93_lc1_borderX = x1;
				drawer.T93_lc1_leftOrAbove = (drawer.T93_sx <= x1);
			} else {
				drawer.T93_lc1_horizontal = false;
				drawer.T93_lc1_vertical = false;
				drawer.T93_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T93_lc1_C = x1 - drawer.T93_lc1_m * y1;
				drawer.T93_lc1_leftOrAbove = (drawer.T93_sx < drawer.T93_lc1_m*drawer.T93_sy + drawer.T93_lc1_C);
			}

			if(y2 == y3) {
				drawer.T93_lc2_horizontal = true;
				drawer.T93_lc2_vertical = false;
				drawer.T93_lc2_borderY = y2;
				drawer.T93_lc2_leftOrAbove = (drawer.T93_sy <= y2);
			} else if(x2 == x3) {
				drawer.T93_lc2_horizontal = false;
				drawer.T93_lc2_vertical = true;
				drawer.T93_lc2_borderX = x2;
				drawer.T93_lc2_leftOrAbove = (drawer.T93_sx <= x2);
			} else {
				drawer.T93_lc2_horizontal = false;
				drawer.T93_lc2_vertical = false;
				drawer.T93_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T93_lc2_C = x2 - drawer.T93_lc2_m * y2;
				drawer.T93_lc2_leftOrAbove = (drawer.T93_sx < drawer.T93_lc2_m*drawer.T93_sy + drawer.T93_lc2_C);
			}

			if(y3 == y1) {
				drawer.T93_lc3_horizontal = true;
				drawer.T93_lc3_vertical = false;
				drawer.T93_lc3_borderY = y3;
				drawer.T93_lc3_leftOrAbove = (drawer.T93_sy <= y3);
			} else if(x3 == x1) {
				drawer.T93_lc3_horizontal = false;
				drawer.T93_lc3_vertical = true;
				drawer.T93_lc3_borderX = x3;
				drawer.T93_lc3_leftOrAbove = (drawer.T93_sx <= x3);
			} else {
				drawer.T93_lc3_horizontal = false;
				drawer.T93_lc3_vertical = false;
				drawer.T93_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T93_lc3_C = x3 - drawer.T93_lc3_m * y3;
				drawer.T93_lc3_leftOrAbove = (drawer.T93_sx < drawer.T93_lc3_m*drawer.T93_sy + drawer.T93_lc3_C);
			}

			drawer.T93_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T93_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T93_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T93_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T93_initializedWithValidData = true;
		}

		t = triangles[94]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T94_r = t.r; drawer.T94_g = t.g; drawer.T94_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T94_initializedWithValidData = false;
		} else {

			drawer.T94_sx = (x1 + x2 + x3) / 3.0;
			drawer.T94_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T94_lc1_horizontal = true;
				drawer.T94_lc1_vertical = false;
				drawer.T94_lc1_borderY = y1;
				drawer.T94_lc1_leftOrAbove = (drawer.T94_sy <= y1);
			} else if(x1 == x2) {
				drawer.T94_lc1_horizontal = false;
				drawer.T94_lc1_vertical = true;
				drawer.T94_lc1_borderX = x1;
				drawer.T94_lc1_leftOrAbove = (drawer.T94_sx <= x1);
			} else {
				drawer.T94_lc1_horizontal = false;
				drawer.T94_lc1_vertical = false;
				drawer.T94_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T94_lc1_C = x1 - drawer.T94_lc1_m * y1;
				drawer.T94_lc1_leftOrAbove = (drawer.T94_sx < drawer.T94_lc1_m*drawer.T94_sy + drawer.T94_lc1_C);
			}

			if(y2 == y3) {
				drawer.T94_lc2_horizontal = true;
				drawer.T94_lc2_vertical = false;
				drawer.T94_lc2_borderY = y2;
				drawer.T94_lc2_leftOrAbove = (drawer.T94_sy <= y2);
			} else if(x2 == x3) {
				drawer.T94_lc2_horizontal = false;
				drawer.T94_lc2_vertical = true;
				drawer.T94_lc2_borderX = x2;
				drawer.T94_lc2_leftOrAbove = (drawer.T94_sx <= x2);
			} else {
				drawer.T94_lc2_horizontal = false;
				drawer.T94_lc2_vertical = false;
				drawer.T94_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T94_lc2_C = x2 - drawer.T94_lc2_m * y2;
				drawer.T94_lc2_leftOrAbove = (drawer.T94_sx < drawer.T94_lc2_m*drawer.T94_sy + drawer.T94_lc2_C);
			}

			if(y3 == y1) {
				drawer.T94_lc3_horizontal = true;
				drawer.T94_lc3_vertical = false;
				drawer.T94_lc3_borderY = y3;
				drawer.T94_lc3_leftOrAbove = (drawer.T94_sy <= y3);
			} else if(x3 == x1) {
				drawer.T94_lc3_horizontal = false;
				drawer.T94_lc3_vertical = true;
				drawer.T94_lc3_borderX = x3;
				drawer.T94_lc3_leftOrAbove = (drawer.T94_sx <= x3);
			} else {
				drawer.T94_lc3_horizontal = false;
				drawer.T94_lc3_vertical = false;
				drawer.T94_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T94_lc3_C = x3 - drawer.T94_lc3_m * y3;
				drawer.T94_lc3_leftOrAbove = (drawer.T94_sx < drawer.T94_lc3_m*drawer.T94_sy + drawer.T94_lc3_C);
			}

			drawer.T94_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T94_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T94_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T94_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T94_initializedWithValidData = true;
		}

		t = triangles[95]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T95_r = t.r; drawer.T95_g = t.g; drawer.T95_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T95_initializedWithValidData = false;
		} else {

			drawer.T95_sx = (x1 + x2 + x3) / 3.0;
			drawer.T95_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T95_lc1_horizontal = true;
				drawer.T95_lc1_vertical = false;
				drawer.T95_lc1_borderY = y1;
				drawer.T95_lc1_leftOrAbove = (drawer.T95_sy <= y1);
			} else if(x1 == x2) {
				drawer.T95_lc1_horizontal = false;
				drawer.T95_lc1_vertical = true;
				drawer.T95_lc1_borderX = x1;
				drawer.T95_lc1_leftOrAbove = (drawer.T95_sx <= x1);
			} else {
				drawer.T95_lc1_horizontal = false;
				drawer.T95_lc1_vertical = false;
				drawer.T95_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T95_lc1_C = x1 - drawer.T95_lc1_m * y1;
				drawer.T95_lc1_leftOrAbove = (drawer.T95_sx < drawer.T95_lc1_m*drawer.T95_sy + drawer.T95_lc1_C);
			}

			if(y2 == y3) {
				drawer.T95_lc2_horizontal = true;
				drawer.T95_lc2_vertical = false;
				drawer.T95_lc2_borderY = y2;
				drawer.T95_lc2_leftOrAbove = (drawer.T95_sy <= y2);
			} else if(x2 == x3) {
				drawer.T95_lc2_horizontal = false;
				drawer.T95_lc2_vertical = true;
				drawer.T95_lc2_borderX = x2;
				drawer.T95_lc2_leftOrAbove = (drawer.T95_sx <= x2);
			} else {
				drawer.T95_lc2_horizontal = false;
				drawer.T95_lc2_vertical = false;
				drawer.T95_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T95_lc2_C = x2 - drawer.T95_lc2_m * y2;
				drawer.T95_lc2_leftOrAbove = (drawer.T95_sx < drawer.T95_lc2_m*drawer.T95_sy + drawer.T95_lc2_C);
			}

			if(y3 == y1) {
				drawer.T95_lc3_horizontal = true;
				drawer.T95_lc3_vertical = false;
				drawer.T95_lc3_borderY = y3;
				drawer.T95_lc3_leftOrAbove = (drawer.T95_sy <= y3);
			} else if(x3 == x1) {
				drawer.T95_lc3_horizontal = false;
				drawer.T95_lc3_vertical = true;
				drawer.T95_lc3_borderX = x3;
				drawer.T95_lc3_leftOrAbove = (drawer.T95_sx <= x3);
			} else {
				drawer.T95_lc3_horizontal = false;
				drawer.T95_lc3_vertical = false;
				drawer.T95_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T95_lc3_C = x3 - drawer.T95_lc3_m * y3;
				drawer.T95_lc3_leftOrAbove = (drawer.T95_sx < drawer.T95_lc3_m*drawer.T95_sy + drawer.T95_lc3_C);
			}

			drawer.T95_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T95_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T95_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T95_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T95_initializedWithValidData = true;
		}

		t = triangles[96]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T96_r = t.r; drawer.T96_g = t.g; drawer.T96_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T96_initializedWithValidData = false;
		} else {

			drawer.T96_sx = (x1 + x2 + x3) / 3.0;
			drawer.T96_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T96_lc1_horizontal = true;
				drawer.T96_lc1_vertical = false;
				drawer.T96_lc1_borderY = y1;
				drawer.T96_lc1_leftOrAbove = (drawer.T96_sy <= y1);
			} else if(x1 == x2) {
				drawer.T96_lc1_horizontal = false;
				drawer.T96_lc1_vertical = true;
				drawer.T96_lc1_borderX = x1;
				drawer.T96_lc1_leftOrAbove = (drawer.T96_sx <= x1);
			} else {
				drawer.T96_lc1_horizontal = false;
				drawer.T96_lc1_vertical = false;
				drawer.T96_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T96_lc1_C = x1 - drawer.T96_lc1_m * y1;
				drawer.T96_lc1_leftOrAbove = (drawer.T96_sx < drawer.T96_lc1_m*drawer.T96_sy + drawer.T96_lc1_C);
			}

			if(y2 == y3) {
				drawer.T96_lc2_horizontal = true;
				drawer.T96_lc2_vertical = false;
				drawer.T96_lc2_borderY = y2;
				drawer.T96_lc2_leftOrAbove = (drawer.T96_sy <= y2);
			} else if(x2 == x3) {
				drawer.T96_lc2_horizontal = false;
				drawer.T96_lc2_vertical = true;
				drawer.T96_lc2_borderX = x2;
				drawer.T96_lc2_leftOrAbove = (drawer.T96_sx <= x2);
			} else {
				drawer.T96_lc2_horizontal = false;
				drawer.T96_lc2_vertical = false;
				drawer.T96_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T96_lc2_C = x2 - drawer.T96_lc2_m * y2;
				drawer.T96_lc2_leftOrAbove = (drawer.T96_sx < drawer.T96_lc2_m*drawer.T96_sy + drawer.T96_lc2_C);
			}

			if(y3 == y1) {
				drawer.T96_lc3_horizontal = true;
				drawer.T96_lc3_vertical = false;
				drawer.T96_lc3_borderY = y3;
				drawer.T96_lc3_leftOrAbove = (drawer.T96_sy <= y3);
			} else if(x3 == x1) {
				drawer.T96_lc3_horizontal = false;
				drawer.T96_lc3_vertical = true;
				drawer.T96_lc3_borderX = x3;
				drawer.T96_lc3_leftOrAbove = (drawer.T96_sx <= x3);
			} else {
				drawer.T96_lc3_horizontal = false;
				drawer.T96_lc3_vertical = false;
				drawer.T96_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T96_lc3_C = x3 - drawer.T96_lc3_m * y3;
				drawer.T96_lc3_leftOrAbove = (drawer.T96_sx < drawer.T96_lc3_m*drawer.T96_sy + drawer.T96_lc3_C);
			}

			drawer.T96_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T96_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T96_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T96_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T96_initializedWithValidData = true;
		}

		t = triangles[97]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T97_r = t.r; drawer.T97_g = t.g; drawer.T97_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T97_initializedWithValidData = false;
		} else {

			drawer.T97_sx = (x1 + x2 + x3) / 3.0;
			drawer.T97_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T97_lc1_horizontal = true;
				drawer.T97_lc1_vertical = false;
				drawer.T97_lc1_borderY = y1;
				drawer.T97_lc1_leftOrAbove = (drawer.T97_sy <= y1);
			} else if(x1 == x2) {
				drawer.T97_lc1_horizontal = false;
				drawer.T97_lc1_vertical = true;
				drawer.T97_lc1_borderX = x1;
				drawer.T97_lc1_leftOrAbove = (drawer.T97_sx <= x1);
			} else {
				drawer.T97_lc1_horizontal = false;
				drawer.T97_lc1_vertical = false;
				drawer.T97_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T97_lc1_C = x1 - drawer.T97_lc1_m * y1;
				drawer.T97_lc1_leftOrAbove = (drawer.T97_sx < drawer.T97_lc1_m*drawer.T97_sy + drawer.T97_lc1_C);
			}

			if(y2 == y3) {
				drawer.T97_lc2_horizontal = true;
				drawer.T97_lc2_vertical = false;
				drawer.T97_lc2_borderY = y2;
				drawer.T97_lc2_leftOrAbove = (drawer.T97_sy <= y2);
			} else if(x2 == x3) {
				drawer.T97_lc2_horizontal = false;
				drawer.T97_lc2_vertical = true;
				drawer.T97_lc2_borderX = x2;
				drawer.T97_lc2_leftOrAbove = (drawer.T97_sx <= x2);
			} else {
				drawer.T97_lc2_horizontal = false;
				drawer.T97_lc2_vertical = false;
				drawer.T97_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T97_lc2_C = x2 - drawer.T97_lc2_m * y2;
				drawer.T97_lc2_leftOrAbove = (drawer.T97_sx < drawer.T97_lc2_m*drawer.T97_sy + drawer.T97_lc2_C);
			}

			if(y3 == y1) {
				drawer.T97_lc3_horizontal = true;
				drawer.T97_lc3_vertical = false;
				drawer.T97_lc3_borderY = y3;
				drawer.T97_lc3_leftOrAbove = (drawer.T97_sy <= y3);
			} else if(x3 == x1) {
				drawer.T97_lc3_horizontal = false;
				drawer.T97_lc3_vertical = true;
				drawer.T97_lc3_borderX = x3;
				drawer.T97_lc3_leftOrAbove = (drawer.T97_sx <= x3);
			} else {
				drawer.T97_lc3_horizontal = false;
				drawer.T97_lc3_vertical = false;
				drawer.T97_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T97_lc3_C = x3 - drawer.T97_lc3_m * y3;
				drawer.T97_lc3_leftOrAbove = (drawer.T97_sx < drawer.T97_lc3_m*drawer.T97_sy + drawer.T97_lc3_C);
			}

			drawer.T97_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T97_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T97_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T97_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T97_initializedWithValidData = true;
		}

		t = triangles[98]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T98_r = t.r; drawer.T98_g = t.g; drawer.T98_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T98_initializedWithValidData = false;
		} else {

			drawer.T98_sx = (x1 + x2 + x3) / 3.0;
			drawer.T98_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T98_lc1_horizontal = true;
				drawer.T98_lc1_vertical = false;
				drawer.T98_lc1_borderY = y1;
				drawer.T98_lc1_leftOrAbove = (drawer.T98_sy <= y1);
			} else if(x1 == x2) {
				drawer.T98_lc1_horizontal = false;
				drawer.T98_lc1_vertical = true;
				drawer.T98_lc1_borderX = x1;
				drawer.T98_lc1_leftOrAbove = (drawer.T98_sx <= x1);
			} else {
				drawer.T98_lc1_horizontal = false;
				drawer.T98_lc1_vertical = false;
				drawer.T98_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T98_lc1_C = x1 - drawer.T98_lc1_m * y1;
				drawer.T98_lc1_leftOrAbove = (drawer.T98_sx < drawer.T98_lc1_m*drawer.T98_sy + drawer.T98_lc1_C);
			}

			if(y2 == y3) {
				drawer.T98_lc2_horizontal = true;
				drawer.T98_lc2_vertical = false;
				drawer.T98_lc2_borderY = y2;
				drawer.T98_lc2_leftOrAbove = (drawer.T98_sy <= y2);
			} else if(x2 == x3) {
				drawer.T98_lc2_horizontal = false;
				drawer.T98_lc2_vertical = true;
				drawer.T98_lc2_borderX = x2;
				drawer.T98_lc2_leftOrAbove = (drawer.T98_sx <= x2);
			} else {
				drawer.T98_lc2_horizontal = false;
				drawer.T98_lc2_vertical = false;
				drawer.T98_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T98_lc2_C = x2 - drawer.T98_lc2_m * y2;
				drawer.T98_lc2_leftOrAbove = (drawer.T98_sx < drawer.T98_lc2_m*drawer.T98_sy + drawer.T98_lc2_C);
			}

			if(y3 == y1) {
				drawer.T98_lc3_horizontal = true;
				drawer.T98_lc3_vertical = false;
				drawer.T98_lc3_borderY = y3;
				drawer.T98_lc3_leftOrAbove = (drawer.T98_sy <= y3);
			} else if(x3 == x1) {
				drawer.T98_lc3_horizontal = false;
				drawer.T98_lc3_vertical = true;
				drawer.T98_lc3_borderX = x3;
				drawer.T98_lc3_leftOrAbove = (drawer.T98_sx <= x3);
			} else {
				drawer.T98_lc3_horizontal = false;
				drawer.T98_lc3_vertical = false;
				drawer.T98_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T98_lc3_C = x3 - drawer.T98_lc3_m * y3;
				drawer.T98_lc3_leftOrAbove = (drawer.T98_sx < drawer.T98_lc3_m*drawer.T98_sy + drawer.T98_lc3_C);
			}

			drawer.T98_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T98_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T98_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T98_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T98_initializedWithValidData = true;
		}

		t = triangles[99]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T99_r = t.r; drawer.T99_g = t.g; drawer.T99_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T99_initializedWithValidData = false;
		} else {

			drawer.T99_sx = (x1 + x2 + x3) / 3.0;
			drawer.T99_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T99_lc1_horizontal = true;
				drawer.T99_lc1_vertical = false;
				drawer.T99_lc1_borderY = y1;
				drawer.T99_lc1_leftOrAbove = (drawer.T99_sy <= y1);
			} else if(x1 == x2) {
				drawer.T99_lc1_horizontal = false;
				drawer.T99_lc1_vertical = true;
				drawer.T99_lc1_borderX = x1;
				drawer.T99_lc1_leftOrAbove = (drawer.T99_sx <= x1);
			} else {
				drawer.T99_lc1_horizontal = false;
				drawer.T99_lc1_vertical = false;
				drawer.T99_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T99_lc1_C = x1 - drawer.T99_lc1_m * y1;
				drawer.T99_lc1_leftOrAbove = (drawer.T99_sx < drawer.T99_lc1_m*drawer.T99_sy + drawer.T99_lc1_C);
			}

			if(y2 == y3) {
				drawer.T99_lc2_horizontal = true;
				drawer.T99_lc2_vertical = false;
				drawer.T99_lc2_borderY = y2;
				drawer.T99_lc2_leftOrAbove = (drawer.T99_sy <= y2);
			} else if(x2 == x3) {
				drawer.T99_lc2_horizontal = false;
				drawer.T99_lc2_vertical = true;
				drawer.T99_lc2_borderX = x2;
				drawer.T99_lc2_leftOrAbove = (drawer.T99_sx <= x2);
			} else {
				drawer.T99_lc2_horizontal = false;
				drawer.T99_lc2_vertical = false;
				drawer.T99_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T99_lc2_C = x2 - drawer.T99_lc2_m * y2;
				drawer.T99_lc2_leftOrAbove = (drawer.T99_sx < drawer.T99_lc2_m*drawer.T99_sy + drawer.T99_lc2_C);
			}

			if(y3 == y1) {
				drawer.T99_lc3_horizontal = true;
				drawer.T99_lc3_vertical = false;
				drawer.T99_lc3_borderY = y3;
				drawer.T99_lc3_leftOrAbove = (drawer.T99_sy <= y3);
			} else if(x3 == x1) {
				drawer.T99_lc3_horizontal = false;
				drawer.T99_lc3_vertical = true;
				drawer.T99_lc3_borderX = x3;
				drawer.T99_lc3_leftOrAbove = (drawer.T99_sx <= x3);
			} else {
				drawer.T99_lc3_horizontal = false;
				drawer.T99_lc3_vertical = false;
				drawer.T99_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T99_lc3_C = x3 - drawer.T99_lc3_m * y3;
				drawer.T99_lc3_leftOrAbove = (drawer.T99_sx < drawer.T99_lc3_m*drawer.T99_sy + drawer.T99_lc3_C);
			}

			drawer.T99_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T99_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T99_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T99_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T99_initializedWithValidData = true;
		}

		t = triangles[100]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T100_r = t.r; drawer.T100_g = t.g; drawer.T100_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T100_initializedWithValidData = false;
		} else {

			drawer.T100_sx = (x1 + x2 + x3) / 3.0;
			drawer.T100_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T100_lc1_horizontal = true;
				drawer.T100_lc1_vertical = false;
				drawer.T100_lc1_borderY = y1;
				drawer.T100_lc1_leftOrAbove = (drawer.T100_sy <= y1);
			} else if(x1 == x2) {
				drawer.T100_lc1_horizontal = false;
				drawer.T100_lc1_vertical = true;
				drawer.T100_lc1_borderX = x1;
				drawer.T100_lc1_leftOrAbove = (drawer.T100_sx <= x1);
			} else {
				drawer.T100_lc1_horizontal = false;
				drawer.T100_lc1_vertical = false;
				drawer.T100_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T100_lc1_C = x1 - drawer.T100_lc1_m * y1;
				drawer.T100_lc1_leftOrAbove = (drawer.T100_sx < drawer.T100_lc1_m*drawer.T100_sy + drawer.T100_lc1_C);
			}

			if(y2 == y3) {
				drawer.T100_lc2_horizontal = true;
				drawer.T100_lc2_vertical = false;
				drawer.T100_lc2_borderY = y2;
				drawer.T100_lc2_leftOrAbove = (drawer.T100_sy <= y2);
			} else if(x2 == x3) {
				drawer.T100_lc2_horizontal = false;
				drawer.T100_lc2_vertical = true;
				drawer.T100_lc2_borderX = x2;
				drawer.T100_lc2_leftOrAbove = (drawer.T100_sx <= x2);
			} else {
				drawer.T100_lc2_horizontal = false;
				drawer.T100_lc2_vertical = false;
				drawer.T100_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T100_lc2_C = x2 - drawer.T100_lc2_m * y2;
				drawer.T100_lc2_leftOrAbove = (drawer.T100_sx < drawer.T100_lc2_m*drawer.T100_sy + drawer.T100_lc2_C);
			}

			if(y3 == y1) {
				drawer.T100_lc3_horizontal = true;
				drawer.T100_lc3_vertical = false;
				drawer.T100_lc3_borderY = y3;
				drawer.T100_lc3_leftOrAbove = (drawer.T100_sy <= y3);
			} else if(x3 == x1) {
				drawer.T100_lc3_horizontal = false;
				drawer.T100_lc3_vertical = true;
				drawer.T100_lc3_borderX = x3;
				drawer.T100_lc3_leftOrAbove = (drawer.T100_sx <= x3);
			} else {
				drawer.T100_lc3_horizontal = false;
				drawer.T100_lc3_vertical = false;
				drawer.T100_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T100_lc3_C = x3 - drawer.T100_lc3_m * y3;
				drawer.T100_lc3_leftOrAbove = (drawer.T100_sx < drawer.T100_lc3_m*drawer.T100_sy + drawer.T100_lc3_C);
			}

			drawer.T100_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T100_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T100_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T100_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T100_initializedWithValidData = true;
		}

		t = triangles[101]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T101_r = t.r; drawer.T101_g = t.g; drawer.T101_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T101_initializedWithValidData = false;
		} else {

			drawer.T101_sx = (x1 + x2 + x3) / 3.0;
			drawer.T101_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T101_lc1_horizontal = true;
				drawer.T101_lc1_vertical = false;
				drawer.T101_lc1_borderY = y1;
				drawer.T101_lc1_leftOrAbove = (drawer.T101_sy <= y1);
			} else if(x1 == x2) {
				drawer.T101_lc1_horizontal = false;
				drawer.T101_lc1_vertical = true;
				drawer.T101_lc1_borderX = x1;
				drawer.T101_lc1_leftOrAbove = (drawer.T101_sx <= x1);
			} else {
				drawer.T101_lc1_horizontal = false;
				drawer.T101_lc1_vertical = false;
				drawer.T101_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T101_lc1_C = x1 - drawer.T101_lc1_m * y1;
				drawer.T101_lc1_leftOrAbove = (drawer.T101_sx < drawer.T101_lc1_m*drawer.T101_sy + drawer.T101_lc1_C);
			}

			if(y2 == y3) {
				drawer.T101_lc2_horizontal = true;
				drawer.T101_lc2_vertical = false;
				drawer.T101_lc2_borderY = y2;
				drawer.T101_lc2_leftOrAbove = (drawer.T101_sy <= y2);
			} else if(x2 == x3) {
				drawer.T101_lc2_horizontal = false;
				drawer.T101_lc2_vertical = true;
				drawer.T101_lc2_borderX = x2;
				drawer.T101_lc2_leftOrAbove = (drawer.T101_sx <= x2);
			} else {
				drawer.T101_lc2_horizontal = false;
				drawer.T101_lc2_vertical = false;
				drawer.T101_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T101_lc2_C = x2 - drawer.T101_lc2_m * y2;
				drawer.T101_lc2_leftOrAbove = (drawer.T101_sx < drawer.T101_lc2_m*drawer.T101_sy + drawer.T101_lc2_C);
			}

			if(y3 == y1) {
				drawer.T101_lc3_horizontal = true;
				drawer.T101_lc3_vertical = false;
				drawer.T101_lc3_borderY = y3;
				drawer.T101_lc3_leftOrAbove = (drawer.T101_sy <= y3);
			} else if(x3 == x1) {
				drawer.T101_lc3_horizontal = false;
				drawer.T101_lc3_vertical = true;
				drawer.T101_lc3_borderX = x3;
				drawer.T101_lc3_leftOrAbove = (drawer.T101_sx <= x3);
			} else {
				drawer.T101_lc3_horizontal = false;
				drawer.T101_lc3_vertical = false;
				drawer.T101_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T101_lc3_C = x3 - drawer.T101_lc3_m * y3;
				drawer.T101_lc3_leftOrAbove = (drawer.T101_sx < drawer.T101_lc3_m*drawer.T101_sy + drawer.T101_lc3_C);
			}

			drawer.T101_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T101_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T101_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T101_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T101_initializedWithValidData = true;
		}

		t = triangles[102]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T102_r = t.r; drawer.T102_g = t.g; drawer.T102_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T102_initializedWithValidData = false;
		} else {

			drawer.T102_sx = (x1 + x2 + x3) / 3.0;
			drawer.T102_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T102_lc1_horizontal = true;
				drawer.T102_lc1_vertical = false;
				drawer.T102_lc1_borderY = y1;
				drawer.T102_lc1_leftOrAbove = (drawer.T102_sy <= y1);
			} else if(x1 == x2) {
				drawer.T102_lc1_horizontal = false;
				drawer.T102_lc1_vertical = true;
				drawer.T102_lc1_borderX = x1;
				drawer.T102_lc1_leftOrAbove = (drawer.T102_sx <= x1);
			} else {
				drawer.T102_lc1_horizontal = false;
				drawer.T102_lc1_vertical = false;
				drawer.T102_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T102_lc1_C = x1 - drawer.T102_lc1_m * y1;
				drawer.T102_lc1_leftOrAbove = (drawer.T102_sx < drawer.T102_lc1_m*drawer.T102_sy + drawer.T102_lc1_C);
			}

			if(y2 == y3) {
				drawer.T102_lc2_horizontal = true;
				drawer.T102_lc2_vertical = false;
				drawer.T102_lc2_borderY = y2;
				drawer.T102_lc2_leftOrAbove = (drawer.T102_sy <= y2);
			} else if(x2 == x3) {
				drawer.T102_lc2_horizontal = false;
				drawer.T102_lc2_vertical = true;
				drawer.T102_lc2_borderX = x2;
				drawer.T102_lc2_leftOrAbove = (drawer.T102_sx <= x2);
			} else {
				drawer.T102_lc2_horizontal = false;
				drawer.T102_lc2_vertical = false;
				drawer.T102_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T102_lc2_C = x2 - drawer.T102_lc2_m * y2;
				drawer.T102_lc2_leftOrAbove = (drawer.T102_sx < drawer.T102_lc2_m*drawer.T102_sy + drawer.T102_lc2_C);
			}

			if(y3 == y1) {
				drawer.T102_lc3_horizontal = true;
				drawer.T102_lc3_vertical = false;
				drawer.T102_lc3_borderY = y3;
				drawer.T102_lc3_leftOrAbove = (drawer.T102_sy <= y3);
			} else if(x3 == x1) {
				drawer.T102_lc3_horizontal = false;
				drawer.T102_lc3_vertical = true;
				drawer.T102_lc3_borderX = x3;
				drawer.T102_lc3_leftOrAbove = (drawer.T102_sx <= x3);
			} else {
				drawer.T102_lc3_horizontal = false;
				drawer.T102_lc3_vertical = false;
				drawer.T102_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T102_lc3_C = x3 - drawer.T102_lc3_m * y3;
				drawer.T102_lc3_leftOrAbove = (drawer.T102_sx < drawer.T102_lc3_m*drawer.T102_sy + drawer.T102_lc3_C);
			}

			drawer.T102_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T102_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T102_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T102_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T102_initializedWithValidData = true;
		}

		t = triangles[103]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T103_r = t.r; drawer.T103_g = t.g; drawer.T103_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T103_initializedWithValidData = false;
		} else {

			drawer.T103_sx = (x1 + x2 + x3) / 3.0;
			drawer.T103_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T103_lc1_horizontal = true;
				drawer.T103_lc1_vertical = false;
				drawer.T103_lc1_borderY = y1;
				drawer.T103_lc1_leftOrAbove = (drawer.T103_sy <= y1);
			} else if(x1 == x2) {
				drawer.T103_lc1_horizontal = false;
				drawer.T103_lc1_vertical = true;
				drawer.T103_lc1_borderX = x1;
				drawer.T103_lc1_leftOrAbove = (drawer.T103_sx <= x1);
			} else {
				drawer.T103_lc1_horizontal = false;
				drawer.T103_lc1_vertical = false;
				drawer.T103_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T103_lc1_C = x1 - drawer.T103_lc1_m * y1;
				drawer.T103_lc1_leftOrAbove = (drawer.T103_sx < drawer.T103_lc1_m*drawer.T103_sy + drawer.T103_lc1_C);
			}

			if(y2 == y3) {
				drawer.T103_lc2_horizontal = true;
				drawer.T103_lc2_vertical = false;
				drawer.T103_lc2_borderY = y2;
				drawer.T103_lc2_leftOrAbove = (drawer.T103_sy <= y2);
			} else if(x2 == x3) {
				drawer.T103_lc2_horizontal = false;
				drawer.T103_lc2_vertical = true;
				drawer.T103_lc2_borderX = x2;
				drawer.T103_lc2_leftOrAbove = (drawer.T103_sx <= x2);
			} else {
				drawer.T103_lc2_horizontal = false;
				drawer.T103_lc2_vertical = false;
				drawer.T103_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T103_lc2_C = x2 - drawer.T103_lc2_m * y2;
				drawer.T103_lc2_leftOrAbove = (drawer.T103_sx < drawer.T103_lc2_m*drawer.T103_sy + drawer.T103_lc2_C);
			}

			if(y3 == y1) {
				drawer.T103_lc3_horizontal = true;
				drawer.T103_lc3_vertical = false;
				drawer.T103_lc3_borderY = y3;
				drawer.T103_lc3_leftOrAbove = (drawer.T103_sy <= y3);
			} else if(x3 == x1) {
				drawer.T103_lc3_horizontal = false;
				drawer.T103_lc3_vertical = true;
				drawer.T103_lc3_borderX = x3;
				drawer.T103_lc3_leftOrAbove = (drawer.T103_sx <= x3);
			} else {
				drawer.T103_lc3_horizontal = false;
				drawer.T103_lc3_vertical = false;
				drawer.T103_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T103_lc3_C = x3 - drawer.T103_lc3_m * y3;
				drawer.T103_lc3_leftOrAbove = (drawer.T103_sx < drawer.T103_lc3_m*drawer.T103_sy + drawer.T103_lc3_C);
			}

			drawer.T103_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T103_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T103_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T103_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T103_initializedWithValidData = true;
		}

		t = triangles[104]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T104_r = t.r; drawer.T104_g = t.g; drawer.T104_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T104_initializedWithValidData = false;
		} else {

			drawer.T104_sx = (x1 + x2 + x3) / 3.0;
			drawer.T104_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T104_lc1_horizontal = true;
				drawer.T104_lc1_vertical = false;
				drawer.T104_lc1_borderY = y1;
				drawer.T104_lc1_leftOrAbove = (drawer.T104_sy <= y1);
			} else if(x1 == x2) {
				drawer.T104_lc1_horizontal = false;
				drawer.T104_lc1_vertical = true;
				drawer.T104_lc1_borderX = x1;
				drawer.T104_lc1_leftOrAbove = (drawer.T104_sx <= x1);
			} else {
				drawer.T104_lc1_horizontal = false;
				drawer.T104_lc1_vertical = false;
				drawer.T104_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T104_lc1_C = x1 - drawer.T104_lc1_m * y1;
				drawer.T104_lc1_leftOrAbove = (drawer.T104_sx < drawer.T104_lc1_m*drawer.T104_sy + drawer.T104_lc1_C);
			}

			if(y2 == y3) {
				drawer.T104_lc2_horizontal = true;
				drawer.T104_lc2_vertical = false;
				drawer.T104_lc2_borderY = y2;
				drawer.T104_lc2_leftOrAbove = (drawer.T104_sy <= y2);
			} else if(x2 == x3) {
				drawer.T104_lc2_horizontal = false;
				drawer.T104_lc2_vertical = true;
				drawer.T104_lc2_borderX = x2;
				drawer.T104_lc2_leftOrAbove = (drawer.T104_sx <= x2);
			} else {
				drawer.T104_lc2_horizontal = false;
				drawer.T104_lc2_vertical = false;
				drawer.T104_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T104_lc2_C = x2 - drawer.T104_lc2_m * y2;
				drawer.T104_lc2_leftOrAbove = (drawer.T104_sx < drawer.T104_lc2_m*drawer.T104_sy + drawer.T104_lc2_C);
			}

			if(y3 == y1) {
				drawer.T104_lc3_horizontal = true;
				drawer.T104_lc3_vertical = false;
				drawer.T104_lc3_borderY = y3;
				drawer.T104_lc3_leftOrAbove = (drawer.T104_sy <= y3);
			} else if(x3 == x1) {
				drawer.T104_lc3_horizontal = false;
				drawer.T104_lc3_vertical = true;
				drawer.T104_lc3_borderX = x3;
				drawer.T104_lc3_leftOrAbove = (drawer.T104_sx <= x3);
			} else {
				drawer.T104_lc3_horizontal = false;
				drawer.T104_lc3_vertical = false;
				drawer.T104_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T104_lc3_C = x3 - drawer.T104_lc3_m * y3;
				drawer.T104_lc3_leftOrAbove = (drawer.T104_sx < drawer.T104_lc3_m*drawer.T104_sy + drawer.T104_lc3_C);
			}

			drawer.T104_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T104_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T104_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T104_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T104_initializedWithValidData = true;
		}

		t = triangles[105]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T105_r = t.r; drawer.T105_g = t.g; drawer.T105_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T105_initializedWithValidData = false;
		} else {

			drawer.T105_sx = (x1 + x2 + x3) / 3.0;
			drawer.T105_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T105_lc1_horizontal = true;
				drawer.T105_lc1_vertical = false;
				drawer.T105_lc1_borderY = y1;
				drawer.T105_lc1_leftOrAbove = (drawer.T105_sy <= y1);
			} else if(x1 == x2) {
				drawer.T105_lc1_horizontal = false;
				drawer.T105_lc1_vertical = true;
				drawer.T105_lc1_borderX = x1;
				drawer.T105_lc1_leftOrAbove = (drawer.T105_sx <= x1);
			} else {
				drawer.T105_lc1_horizontal = false;
				drawer.T105_lc1_vertical = false;
				drawer.T105_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T105_lc1_C = x1 - drawer.T105_lc1_m * y1;
				drawer.T105_lc1_leftOrAbove = (drawer.T105_sx < drawer.T105_lc1_m*drawer.T105_sy + drawer.T105_lc1_C);
			}

			if(y2 == y3) {
				drawer.T105_lc2_horizontal = true;
				drawer.T105_lc2_vertical = false;
				drawer.T105_lc2_borderY = y2;
				drawer.T105_lc2_leftOrAbove = (drawer.T105_sy <= y2);
			} else if(x2 == x3) {
				drawer.T105_lc2_horizontal = false;
				drawer.T105_lc2_vertical = true;
				drawer.T105_lc2_borderX = x2;
				drawer.T105_lc2_leftOrAbove = (drawer.T105_sx <= x2);
			} else {
				drawer.T105_lc2_horizontal = false;
				drawer.T105_lc2_vertical = false;
				drawer.T105_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T105_lc2_C = x2 - drawer.T105_lc2_m * y2;
				drawer.T105_lc2_leftOrAbove = (drawer.T105_sx < drawer.T105_lc2_m*drawer.T105_sy + drawer.T105_lc2_C);
			}

			if(y3 == y1) {
				drawer.T105_lc3_horizontal = true;
				drawer.T105_lc3_vertical = false;
				drawer.T105_lc3_borderY = y3;
				drawer.T105_lc3_leftOrAbove = (drawer.T105_sy <= y3);
			} else if(x3 == x1) {
				drawer.T105_lc3_horizontal = false;
				drawer.T105_lc3_vertical = true;
				drawer.T105_lc3_borderX = x3;
				drawer.T105_lc3_leftOrAbove = (drawer.T105_sx <= x3);
			} else {
				drawer.T105_lc3_horizontal = false;
				drawer.T105_lc3_vertical = false;
				drawer.T105_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T105_lc3_C = x3 - drawer.T105_lc3_m * y3;
				drawer.T105_lc3_leftOrAbove = (drawer.T105_sx < drawer.T105_lc3_m*drawer.T105_sy + drawer.T105_lc3_C);
			}

			drawer.T105_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T105_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T105_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T105_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T105_initializedWithValidData = true;
		}

		t = triangles[106]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T106_r = t.r; drawer.T106_g = t.g; drawer.T106_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T106_initializedWithValidData = false;
		} else {

			drawer.T106_sx = (x1 + x2 + x3) / 3.0;
			drawer.T106_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T106_lc1_horizontal = true;
				drawer.T106_lc1_vertical = false;
				drawer.T106_lc1_borderY = y1;
				drawer.T106_lc1_leftOrAbove = (drawer.T106_sy <= y1);
			} else if(x1 == x2) {
				drawer.T106_lc1_horizontal = false;
				drawer.T106_lc1_vertical = true;
				drawer.T106_lc1_borderX = x1;
				drawer.T106_lc1_leftOrAbove = (drawer.T106_sx <= x1);
			} else {
				drawer.T106_lc1_horizontal = false;
				drawer.T106_lc1_vertical = false;
				drawer.T106_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T106_lc1_C = x1 - drawer.T106_lc1_m * y1;
				drawer.T106_lc1_leftOrAbove = (drawer.T106_sx < drawer.T106_lc1_m*drawer.T106_sy + drawer.T106_lc1_C);
			}

			if(y2 == y3) {
				drawer.T106_lc2_horizontal = true;
				drawer.T106_lc2_vertical = false;
				drawer.T106_lc2_borderY = y2;
				drawer.T106_lc2_leftOrAbove = (drawer.T106_sy <= y2);
			} else if(x2 == x3) {
				drawer.T106_lc2_horizontal = false;
				drawer.T106_lc2_vertical = true;
				drawer.T106_lc2_borderX = x2;
				drawer.T106_lc2_leftOrAbove = (drawer.T106_sx <= x2);
			} else {
				drawer.T106_lc2_horizontal = false;
				drawer.T106_lc2_vertical = false;
				drawer.T106_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T106_lc2_C = x2 - drawer.T106_lc2_m * y2;
				drawer.T106_lc2_leftOrAbove = (drawer.T106_sx < drawer.T106_lc2_m*drawer.T106_sy + drawer.T106_lc2_C);
			}

			if(y3 == y1) {
				drawer.T106_lc3_horizontal = true;
				drawer.T106_lc3_vertical = false;
				drawer.T106_lc3_borderY = y3;
				drawer.T106_lc3_leftOrAbove = (drawer.T106_sy <= y3);
			} else if(x3 == x1) {
				drawer.T106_lc3_horizontal = false;
				drawer.T106_lc3_vertical = true;
				drawer.T106_lc3_borderX = x3;
				drawer.T106_lc3_leftOrAbove = (drawer.T106_sx <= x3);
			} else {
				drawer.T106_lc3_horizontal = false;
				drawer.T106_lc3_vertical = false;
				drawer.T106_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T106_lc3_C = x3 - drawer.T106_lc3_m * y3;
				drawer.T106_lc3_leftOrAbove = (drawer.T106_sx < drawer.T106_lc3_m*drawer.T106_sy + drawer.T106_lc3_C);
			}

			drawer.T106_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T106_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T106_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T106_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T106_initializedWithValidData = true;
		}

		t = triangles[107]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T107_r = t.r; drawer.T107_g = t.g; drawer.T107_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T107_initializedWithValidData = false;
		} else {

			drawer.T107_sx = (x1 + x2 + x3) / 3.0;
			drawer.T107_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T107_lc1_horizontal = true;
				drawer.T107_lc1_vertical = false;
				drawer.T107_lc1_borderY = y1;
				drawer.T107_lc1_leftOrAbove = (drawer.T107_sy <= y1);
			} else if(x1 == x2) {
				drawer.T107_lc1_horizontal = false;
				drawer.T107_lc1_vertical = true;
				drawer.T107_lc1_borderX = x1;
				drawer.T107_lc1_leftOrAbove = (drawer.T107_sx <= x1);
			} else {
				drawer.T107_lc1_horizontal = false;
				drawer.T107_lc1_vertical = false;
				drawer.T107_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T107_lc1_C = x1 - drawer.T107_lc1_m * y1;
				drawer.T107_lc1_leftOrAbove = (drawer.T107_sx < drawer.T107_lc1_m*drawer.T107_sy + drawer.T107_lc1_C);
			}

			if(y2 == y3) {
				drawer.T107_lc2_horizontal = true;
				drawer.T107_lc2_vertical = false;
				drawer.T107_lc2_borderY = y2;
				drawer.T107_lc2_leftOrAbove = (drawer.T107_sy <= y2);
			} else if(x2 == x3) {
				drawer.T107_lc2_horizontal = false;
				drawer.T107_lc2_vertical = true;
				drawer.T107_lc2_borderX = x2;
				drawer.T107_lc2_leftOrAbove = (drawer.T107_sx <= x2);
			} else {
				drawer.T107_lc2_horizontal = false;
				drawer.T107_lc2_vertical = false;
				drawer.T107_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T107_lc2_C = x2 - drawer.T107_lc2_m * y2;
				drawer.T107_lc2_leftOrAbove = (drawer.T107_sx < drawer.T107_lc2_m*drawer.T107_sy + drawer.T107_lc2_C);
			}

			if(y3 == y1) {
				drawer.T107_lc3_horizontal = true;
				drawer.T107_lc3_vertical = false;
				drawer.T107_lc3_borderY = y3;
				drawer.T107_lc3_leftOrAbove = (drawer.T107_sy <= y3);
			} else if(x3 == x1) {
				drawer.T107_lc3_horizontal = false;
				drawer.T107_lc3_vertical = true;
				drawer.T107_lc3_borderX = x3;
				drawer.T107_lc3_leftOrAbove = (drawer.T107_sx <= x3);
			} else {
				drawer.T107_lc3_horizontal = false;
				drawer.T107_lc3_vertical = false;
				drawer.T107_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T107_lc3_C = x3 - drawer.T107_lc3_m * y3;
				drawer.T107_lc3_leftOrAbove = (drawer.T107_sx < drawer.T107_lc3_m*drawer.T107_sy + drawer.T107_lc3_C);
			}

			drawer.T107_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T107_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T107_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T107_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T107_initializedWithValidData = true;
		}

		t = triangles[108]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T108_r = t.r; drawer.T108_g = t.g; drawer.T108_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T108_initializedWithValidData = false;
		} else {

			drawer.T108_sx = (x1 + x2 + x3) / 3.0;
			drawer.T108_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T108_lc1_horizontal = true;
				drawer.T108_lc1_vertical = false;
				drawer.T108_lc1_borderY = y1;
				drawer.T108_lc1_leftOrAbove = (drawer.T108_sy <= y1);
			} else if(x1 == x2) {
				drawer.T108_lc1_horizontal = false;
				drawer.T108_lc1_vertical = true;
				drawer.T108_lc1_borderX = x1;
				drawer.T108_lc1_leftOrAbove = (drawer.T108_sx <= x1);
			} else {
				drawer.T108_lc1_horizontal = false;
				drawer.T108_lc1_vertical = false;
				drawer.T108_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T108_lc1_C = x1 - drawer.T108_lc1_m * y1;
				drawer.T108_lc1_leftOrAbove = (drawer.T108_sx < drawer.T108_lc1_m*drawer.T108_sy + drawer.T108_lc1_C);
			}

			if(y2 == y3) {
				drawer.T108_lc2_horizontal = true;
				drawer.T108_lc2_vertical = false;
				drawer.T108_lc2_borderY = y2;
				drawer.T108_lc2_leftOrAbove = (drawer.T108_sy <= y2);
			} else if(x2 == x3) {
				drawer.T108_lc2_horizontal = false;
				drawer.T108_lc2_vertical = true;
				drawer.T108_lc2_borderX = x2;
				drawer.T108_lc2_leftOrAbove = (drawer.T108_sx <= x2);
			} else {
				drawer.T108_lc2_horizontal = false;
				drawer.T108_lc2_vertical = false;
				drawer.T108_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T108_lc2_C = x2 - drawer.T108_lc2_m * y2;
				drawer.T108_lc2_leftOrAbove = (drawer.T108_sx < drawer.T108_lc2_m*drawer.T108_sy + drawer.T108_lc2_C);
			}

			if(y3 == y1) {
				drawer.T108_lc3_horizontal = true;
				drawer.T108_lc3_vertical = false;
				drawer.T108_lc3_borderY = y3;
				drawer.T108_lc3_leftOrAbove = (drawer.T108_sy <= y3);
			} else if(x3 == x1) {
				drawer.T108_lc3_horizontal = false;
				drawer.T108_lc3_vertical = true;
				drawer.T108_lc3_borderX = x3;
				drawer.T108_lc3_leftOrAbove = (drawer.T108_sx <= x3);
			} else {
				drawer.T108_lc3_horizontal = false;
				drawer.T108_lc3_vertical = false;
				drawer.T108_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T108_lc3_C = x3 - drawer.T108_lc3_m * y3;
				drawer.T108_lc3_leftOrAbove = (drawer.T108_sx < drawer.T108_lc3_m*drawer.T108_sy + drawer.T108_lc3_C);
			}

			drawer.T108_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T108_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T108_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T108_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T108_initializedWithValidData = true;
		}

		t = triangles[109]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T109_r = t.r; drawer.T109_g = t.g; drawer.T109_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T109_initializedWithValidData = false;
		} else {

			drawer.T109_sx = (x1 + x2 + x3) / 3.0;
			drawer.T109_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T109_lc1_horizontal = true;
				drawer.T109_lc1_vertical = false;
				drawer.T109_lc1_borderY = y1;
				drawer.T109_lc1_leftOrAbove = (drawer.T109_sy <= y1);
			} else if(x1 == x2) {
				drawer.T109_lc1_horizontal = false;
				drawer.T109_lc1_vertical = true;
				drawer.T109_lc1_borderX = x1;
				drawer.T109_lc1_leftOrAbove = (drawer.T109_sx <= x1);
			} else {
				drawer.T109_lc1_horizontal = false;
				drawer.T109_lc1_vertical = false;
				drawer.T109_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T109_lc1_C = x1 - drawer.T109_lc1_m * y1;
				drawer.T109_lc1_leftOrAbove = (drawer.T109_sx < drawer.T109_lc1_m*drawer.T109_sy + drawer.T109_lc1_C);
			}

			if(y2 == y3) {
				drawer.T109_lc2_horizontal = true;
				drawer.T109_lc2_vertical = false;
				drawer.T109_lc2_borderY = y2;
				drawer.T109_lc2_leftOrAbove = (drawer.T109_sy <= y2);
			} else if(x2 == x3) {
				drawer.T109_lc2_horizontal = false;
				drawer.T109_lc2_vertical = true;
				drawer.T109_lc2_borderX = x2;
				drawer.T109_lc2_leftOrAbove = (drawer.T109_sx <= x2);
			} else {
				drawer.T109_lc2_horizontal = false;
				drawer.T109_lc2_vertical = false;
				drawer.T109_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T109_lc2_C = x2 - drawer.T109_lc2_m * y2;
				drawer.T109_lc2_leftOrAbove = (drawer.T109_sx < drawer.T109_lc2_m*drawer.T109_sy + drawer.T109_lc2_C);
			}

			if(y3 == y1) {
				drawer.T109_lc3_horizontal = true;
				drawer.T109_lc3_vertical = false;
				drawer.T109_lc3_borderY = y3;
				drawer.T109_lc3_leftOrAbove = (drawer.T109_sy <= y3);
			} else if(x3 == x1) {
				drawer.T109_lc3_horizontal = false;
				drawer.T109_lc3_vertical = true;
				drawer.T109_lc3_borderX = x3;
				drawer.T109_lc3_leftOrAbove = (drawer.T109_sx <= x3);
			} else {
				drawer.T109_lc3_horizontal = false;
				drawer.T109_lc3_vertical = false;
				drawer.T109_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T109_lc3_C = x3 - drawer.T109_lc3_m * y3;
				drawer.T109_lc3_leftOrAbove = (drawer.T109_sx < drawer.T109_lc3_m*drawer.T109_sy + drawer.T109_lc3_C);
			}

			drawer.T109_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T109_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T109_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T109_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T109_initializedWithValidData = true;
		}

		t = triangles[110]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T110_r = t.r; drawer.T110_g = t.g; drawer.T110_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T110_initializedWithValidData = false;
		} else {

			drawer.T110_sx = (x1 + x2 + x3) / 3.0;
			drawer.T110_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T110_lc1_horizontal = true;
				drawer.T110_lc1_vertical = false;
				drawer.T110_lc1_borderY = y1;
				drawer.T110_lc1_leftOrAbove = (drawer.T110_sy <= y1);
			} else if(x1 == x2) {
				drawer.T110_lc1_horizontal = false;
				drawer.T110_lc1_vertical = true;
				drawer.T110_lc1_borderX = x1;
				drawer.T110_lc1_leftOrAbove = (drawer.T110_sx <= x1);
			} else {
				drawer.T110_lc1_horizontal = false;
				drawer.T110_lc1_vertical = false;
				drawer.T110_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T110_lc1_C = x1 - drawer.T110_lc1_m * y1;
				drawer.T110_lc1_leftOrAbove = (drawer.T110_sx < drawer.T110_lc1_m*drawer.T110_sy + drawer.T110_lc1_C);
			}

			if(y2 == y3) {
				drawer.T110_lc2_horizontal = true;
				drawer.T110_lc2_vertical = false;
				drawer.T110_lc2_borderY = y2;
				drawer.T110_lc2_leftOrAbove = (drawer.T110_sy <= y2);
			} else if(x2 == x3) {
				drawer.T110_lc2_horizontal = false;
				drawer.T110_lc2_vertical = true;
				drawer.T110_lc2_borderX = x2;
				drawer.T110_lc2_leftOrAbove = (drawer.T110_sx <= x2);
			} else {
				drawer.T110_lc2_horizontal = false;
				drawer.T110_lc2_vertical = false;
				drawer.T110_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T110_lc2_C = x2 - drawer.T110_lc2_m * y2;
				drawer.T110_lc2_leftOrAbove = (drawer.T110_sx < drawer.T110_lc2_m*drawer.T110_sy + drawer.T110_lc2_C);
			}

			if(y3 == y1) {
				drawer.T110_lc3_horizontal = true;
				drawer.T110_lc3_vertical = false;
				drawer.T110_lc3_borderY = y3;
				drawer.T110_lc3_leftOrAbove = (drawer.T110_sy <= y3);
			} else if(x3 == x1) {
				drawer.T110_lc3_horizontal = false;
				drawer.T110_lc3_vertical = true;
				drawer.T110_lc3_borderX = x3;
				drawer.T110_lc3_leftOrAbove = (drawer.T110_sx <= x3);
			} else {
				drawer.T110_lc3_horizontal = false;
				drawer.T110_lc3_vertical = false;
				drawer.T110_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T110_lc3_C = x3 - drawer.T110_lc3_m * y3;
				drawer.T110_lc3_leftOrAbove = (drawer.T110_sx < drawer.T110_lc3_m*drawer.T110_sy + drawer.T110_lc3_C);
			}

			drawer.T110_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T110_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T110_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T110_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T110_initializedWithValidData = true;
		}

		t = triangles[111]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T111_r = t.r; drawer.T111_g = t.g; drawer.T111_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T111_initializedWithValidData = false;
		} else {

			drawer.T111_sx = (x1 + x2 + x3) / 3.0;
			drawer.T111_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T111_lc1_horizontal = true;
				drawer.T111_lc1_vertical = false;
				drawer.T111_lc1_borderY = y1;
				drawer.T111_lc1_leftOrAbove = (drawer.T111_sy <= y1);
			} else if(x1 == x2) {
				drawer.T111_lc1_horizontal = false;
				drawer.T111_lc1_vertical = true;
				drawer.T111_lc1_borderX = x1;
				drawer.T111_lc1_leftOrAbove = (drawer.T111_sx <= x1);
			} else {
				drawer.T111_lc1_horizontal = false;
				drawer.T111_lc1_vertical = false;
				drawer.T111_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T111_lc1_C = x1 - drawer.T111_lc1_m * y1;
				drawer.T111_lc1_leftOrAbove = (drawer.T111_sx < drawer.T111_lc1_m*drawer.T111_sy + drawer.T111_lc1_C);
			}

			if(y2 == y3) {
				drawer.T111_lc2_horizontal = true;
				drawer.T111_lc2_vertical = false;
				drawer.T111_lc2_borderY = y2;
				drawer.T111_lc2_leftOrAbove = (drawer.T111_sy <= y2);
			} else if(x2 == x3) {
				drawer.T111_lc2_horizontal = false;
				drawer.T111_lc2_vertical = true;
				drawer.T111_lc2_borderX = x2;
				drawer.T111_lc2_leftOrAbove = (drawer.T111_sx <= x2);
			} else {
				drawer.T111_lc2_horizontal = false;
				drawer.T111_lc2_vertical = false;
				drawer.T111_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T111_lc2_C = x2 - drawer.T111_lc2_m * y2;
				drawer.T111_lc2_leftOrAbove = (drawer.T111_sx < drawer.T111_lc2_m*drawer.T111_sy + drawer.T111_lc2_C);
			}

			if(y3 == y1) {
				drawer.T111_lc3_horizontal = true;
				drawer.T111_lc3_vertical = false;
				drawer.T111_lc3_borderY = y3;
				drawer.T111_lc3_leftOrAbove = (drawer.T111_sy <= y3);
			} else if(x3 == x1) {
				drawer.T111_lc3_horizontal = false;
				drawer.T111_lc3_vertical = true;
				drawer.T111_lc3_borderX = x3;
				drawer.T111_lc3_leftOrAbove = (drawer.T111_sx <= x3);
			} else {
				drawer.T111_lc3_horizontal = false;
				drawer.T111_lc3_vertical = false;
				drawer.T111_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T111_lc3_C = x3 - drawer.T111_lc3_m * y3;
				drawer.T111_lc3_leftOrAbove = (drawer.T111_sx < drawer.T111_lc3_m*drawer.T111_sy + drawer.T111_lc3_C);
			}

			drawer.T111_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T111_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T111_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T111_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T111_initializedWithValidData = true;
		}

		t = triangles[112]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T112_r = t.r; drawer.T112_g = t.g; drawer.T112_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T112_initializedWithValidData = false;
		} else {

			drawer.T112_sx = (x1 + x2 + x3) / 3.0;
			drawer.T112_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T112_lc1_horizontal = true;
				drawer.T112_lc1_vertical = false;
				drawer.T112_lc1_borderY = y1;
				drawer.T112_lc1_leftOrAbove = (drawer.T112_sy <= y1);
			} else if(x1 == x2) {
				drawer.T112_lc1_horizontal = false;
				drawer.T112_lc1_vertical = true;
				drawer.T112_lc1_borderX = x1;
				drawer.T112_lc1_leftOrAbove = (drawer.T112_sx <= x1);
			} else {
				drawer.T112_lc1_horizontal = false;
				drawer.T112_lc1_vertical = false;
				drawer.T112_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T112_lc1_C = x1 - drawer.T112_lc1_m * y1;
				drawer.T112_lc1_leftOrAbove = (drawer.T112_sx < drawer.T112_lc1_m*drawer.T112_sy + drawer.T112_lc1_C);
			}

			if(y2 == y3) {
				drawer.T112_lc2_horizontal = true;
				drawer.T112_lc2_vertical = false;
				drawer.T112_lc2_borderY = y2;
				drawer.T112_lc2_leftOrAbove = (drawer.T112_sy <= y2);
			} else if(x2 == x3) {
				drawer.T112_lc2_horizontal = false;
				drawer.T112_lc2_vertical = true;
				drawer.T112_lc2_borderX = x2;
				drawer.T112_lc2_leftOrAbove = (drawer.T112_sx <= x2);
			} else {
				drawer.T112_lc2_horizontal = false;
				drawer.T112_lc2_vertical = false;
				drawer.T112_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T112_lc2_C = x2 - drawer.T112_lc2_m * y2;
				drawer.T112_lc2_leftOrAbove = (drawer.T112_sx < drawer.T112_lc2_m*drawer.T112_sy + drawer.T112_lc2_C);
			}

			if(y3 == y1) {
				drawer.T112_lc3_horizontal = true;
				drawer.T112_lc3_vertical = false;
				drawer.T112_lc3_borderY = y3;
				drawer.T112_lc3_leftOrAbove = (drawer.T112_sy <= y3);
			} else if(x3 == x1) {
				drawer.T112_lc3_horizontal = false;
				drawer.T112_lc3_vertical = true;
				drawer.T112_lc3_borderX = x3;
				drawer.T112_lc3_leftOrAbove = (drawer.T112_sx <= x3);
			} else {
				drawer.T112_lc3_horizontal = false;
				drawer.T112_lc3_vertical = false;
				drawer.T112_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T112_lc3_C = x3 - drawer.T112_lc3_m * y3;
				drawer.T112_lc3_leftOrAbove = (drawer.T112_sx < drawer.T112_lc3_m*drawer.T112_sy + drawer.T112_lc3_C);
			}

			drawer.T112_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T112_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T112_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T112_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T112_initializedWithValidData = true;
		}

		t = triangles[113]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T113_r = t.r; drawer.T113_g = t.g; drawer.T113_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T113_initializedWithValidData = false;
		} else {

			drawer.T113_sx = (x1 + x2 + x3) / 3.0;
			drawer.T113_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T113_lc1_horizontal = true;
				drawer.T113_lc1_vertical = false;
				drawer.T113_lc1_borderY = y1;
				drawer.T113_lc1_leftOrAbove = (drawer.T113_sy <= y1);
			} else if(x1 == x2) {
				drawer.T113_lc1_horizontal = false;
				drawer.T113_lc1_vertical = true;
				drawer.T113_lc1_borderX = x1;
				drawer.T113_lc1_leftOrAbove = (drawer.T113_sx <= x1);
			} else {
				drawer.T113_lc1_horizontal = false;
				drawer.T113_lc1_vertical = false;
				drawer.T113_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T113_lc1_C = x1 - drawer.T113_lc1_m * y1;
				drawer.T113_lc1_leftOrAbove = (drawer.T113_sx < drawer.T113_lc1_m*drawer.T113_sy + drawer.T113_lc1_C);
			}

			if(y2 == y3) {
				drawer.T113_lc2_horizontal = true;
				drawer.T113_lc2_vertical = false;
				drawer.T113_lc2_borderY = y2;
				drawer.T113_lc2_leftOrAbove = (drawer.T113_sy <= y2);
			} else if(x2 == x3) {
				drawer.T113_lc2_horizontal = false;
				drawer.T113_lc2_vertical = true;
				drawer.T113_lc2_borderX = x2;
				drawer.T113_lc2_leftOrAbove = (drawer.T113_sx <= x2);
			} else {
				drawer.T113_lc2_horizontal = false;
				drawer.T113_lc2_vertical = false;
				drawer.T113_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T113_lc2_C = x2 - drawer.T113_lc2_m * y2;
				drawer.T113_lc2_leftOrAbove = (drawer.T113_sx < drawer.T113_lc2_m*drawer.T113_sy + drawer.T113_lc2_C);
			}

			if(y3 == y1) {
				drawer.T113_lc3_horizontal = true;
				drawer.T113_lc3_vertical = false;
				drawer.T113_lc3_borderY = y3;
				drawer.T113_lc3_leftOrAbove = (drawer.T113_sy <= y3);
			} else if(x3 == x1) {
				drawer.T113_lc3_horizontal = false;
				drawer.T113_lc3_vertical = true;
				drawer.T113_lc3_borderX = x3;
				drawer.T113_lc3_leftOrAbove = (drawer.T113_sx <= x3);
			} else {
				drawer.T113_lc3_horizontal = false;
				drawer.T113_lc3_vertical = false;
				drawer.T113_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T113_lc3_C = x3 - drawer.T113_lc3_m * y3;
				drawer.T113_lc3_leftOrAbove = (drawer.T113_sx < drawer.T113_lc3_m*drawer.T113_sy + drawer.T113_lc3_C);
			}

			drawer.T113_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T113_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T113_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T113_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T113_initializedWithValidData = true;
		}

		t = triangles[114]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T114_r = t.r; drawer.T114_g = t.g; drawer.T114_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T114_initializedWithValidData = false;
		} else {

			drawer.T114_sx = (x1 + x2 + x3) / 3.0;
			drawer.T114_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T114_lc1_horizontal = true;
				drawer.T114_lc1_vertical = false;
				drawer.T114_lc1_borderY = y1;
				drawer.T114_lc1_leftOrAbove = (drawer.T114_sy <= y1);
			} else if(x1 == x2) {
				drawer.T114_lc1_horizontal = false;
				drawer.T114_lc1_vertical = true;
				drawer.T114_lc1_borderX = x1;
				drawer.T114_lc1_leftOrAbove = (drawer.T114_sx <= x1);
			} else {
				drawer.T114_lc1_horizontal = false;
				drawer.T114_lc1_vertical = false;
				drawer.T114_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T114_lc1_C = x1 - drawer.T114_lc1_m * y1;
				drawer.T114_lc1_leftOrAbove = (drawer.T114_sx < drawer.T114_lc1_m*drawer.T114_sy + drawer.T114_lc1_C);
			}

			if(y2 == y3) {
				drawer.T114_lc2_horizontal = true;
				drawer.T114_lc2_vertical = false;
				drawer.T114_lc2_borderY = y2;
				drawer.T114_lc2_leftOrAbove = (drawer.T114_sy <= y2);
			} else if(x2 == x3) {
				drawer.T114_lc2_horizontal = false;
				drawer.T114_lc2_vertical = true;
				drawer.T114_lc2_borderX = x2;
				drawer.T114_lc2_leftOrAbove = (drawer.T114_sx <= x2);
			} else {
				drawer.T114_lc2_horizontal = false;
				drawer.T114_lc2_vertical = false;
				drawer.T114_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T114_lc2_C = x2 - drawer.T114_lc2_m * y2;
				drawer.T114_lc2_leftOrAbove = (drawer.T114_sx < drawer.T114_lc2_m*drawer.T114_sy + drawer.T114_lc2_C);
			}

			if(y3 == y1) {
				drawer.T114_lc3_horizontal = true;
				drawer.T114_lc3_vertical = false;
				drawer.T114_lc3_borderY = y3;
				drawer.T114_lc3_leftOrAbove = (drawer.T114_sy <= y3);
			} else if(x3 == x1) {
				drawer.T114_lc3_horizontal = false;
				drawer.T114_lc3_vertical = true;
				drawer.T114_lc3_borderX = x3;
				drawer.T114_lc3_leftOrAbove = (drawer.T114_sx <= x3);
			} else {
				drawer.T114_lc3_horizontal = false;
				drawer.T114_lc3_vertical = false;
				drawer.T114_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T114_lc3_C = x3 - drawer.T114_lc3_m * y3;
				drawer.T114_lc3_leftOrAbove = (drawer.T114_sx < drawer.T114_lc3_m*drawer.T114_sy + drawer.T114_lc3_C);
			}

			drawer.T114_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T114_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T114_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T114_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T114_initializedWithValidData = true;
		}

		t = triangles[115]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T115_r = t.r; drawer.T115_g = t.g; drawer.T115_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T115_initializedWithValidData = false;
		} else {

			drawer.T115_sx = (x1 + x2 + x3) / 3.0;
			drawer.T115_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T115_lc1_horizontal = true;
				drawer.T115_lc1_vertical = false;
				drawer.T115_lc1_borderY = y1;
				drawer.T115_lc1_leftOrAbove = (drawer.T115_sy <= y1);
			} else if(x1 == x2) {
				drawer.T115_lc1_horizontal = false;
				drawer.T115_lc1_vertical = true;
				drawer.T115_lc1_borderX = x1;
				drawer.T115_lc1_leftOrAbove = (drawer.T115_sx <= x1);
			} else {
				drawer.T115_lc1_horizontal = false;
				drawer.T115_lc1_vertical = false;
				drawer.T115_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T115_lc1_C = x1 - drawer.T115_lc1_m * y1;
				drawer.T115_lc1_leftOrAbove = (drawer.T115_sx < drawer.T115_lc1_m*drawer.T115_sy + drawer.T115_lc1_C);
			}

			if(y2 == y3) {
				drawer.T115_lc2_horizontal = true;
				drawer.T115_lc2_vertical = false;
				drawer.T115_lc2_borderY = y2;
				drawer.T115_lc2_leftOrAbove = (drawer.T115_sy <= y2);
			} else if(x2 == x3) {
				drawer.T115_lc2_horizontal = false;
				drawer.T115_lc2_vertical = true;
				drawer.T115_lc2_borderX = x2;
				drawer.T115_lc2_leftOrAbove = (drawer.T115_sx <= x2);
			} else {
				drawer.T115_lc2_horizontal = false;
				drawer.T115_lc2_vertical = false;
				drawer.T115_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T115_lc2_C = x2 - drawer.T115_lc2_m * y2;
				drawer.T115_lc2_leftOrAbove = (drawer.T115_sx < drawer.T115_lc2_m*drawer.T115_sy + drawer.T115_lc2_C);
			}

			if(y3 == y1) {
				drawer.T115_lc3_horizontal = true;
				drawer.T115_lc3_vertical = false;
				drawer.T115_lc3_borderY = y3;
				drawer.T115_lc3_leftOrAbove = (drawer.T115_sy <= y3);
			} else if(x3 == x1) {
				drawer.T115_lc3_horizontal = false;
				drawer.T115_lc3_vertical = true;
				drawer.T115_lc3_borderX = x3;
				drawer.T115_lc3_leftOrAbove = (drawer.T115_sx <= x3);
			} else {
				drawer.T115_lc3_horizontal = false;
				drawer.T115_lc3_vertical = false;
				drawer.T115_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T115_lc3_C = x3 - drawer.T115_lc3_m * y3;
				drawer.T115_lc3_leftOrAbove = (drawer.T115_sx < drawer.T115_lc3_m*drawer.T115_sy + drawer.T115_lc3_C);
			}

			drawer.T115_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T115_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T115_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T115_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T115_initializedWithValidData = true;
		}

		t = triangles[116]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T116_r = t.r; drawer.T116_g = t.g; drawer.T116_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T116_initializedWithValidData = false;
		} else {

			drawer.T116_sx = (x1 + x2 + x3) / 3.0;
			drawer.T116_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T116_lc1_horizontal = true;
				drawer.T116_lc1_vertical = false;
				drawer.T116_lc1_borderY = y1;
				drawer.T116_lc1_leftOrAbove = (drawer.T116_sy <= y1);
			} else if(x1 == x2) {
				drawer.T116_lc1_horizontal = false;
				drawer.T116_lc1_vertical = true;
				drawer.T116_lc1_borderX = x1;
				drawer.T116_lc1_leftOrAbove = (drawer.T116_sx <= x1);
			} else {
				drawer.T116_lc1_horizontal = false;
				drawer.T116_lc1_vertical = false;
				drawer.T116_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T116_lc1_C = x1 - drawer.T116_lc1_m * y1;
				drawer.T116_lc1_leftOrAbove = (drawer.T116_sx < drawer.T116_lc1_m*drawer.T116_sy + drawer.T116_lc1_C);
			}

			if(y2 == y3) {
				drawer.T116_lc2_horizontal = true;
				drawer.T116_lc2_vertical = false;
				drawer.T116_lc2_borderY = y2;
				drawer.T116_lc2_leftOrAbove = (drawer.T116_sy <= y2);
			} else if(x2 == x3) {
				drawer.T116_lc2_horizontal = false;
				drawer.T116_lc2_vertical = true;
				drawer.T116_lc2_borderX = x2;
				drawer.T116_lc2_leftOrAbove = (drawer.T116_sx <= x2);
			} else {
				drawer.T116_lc2_horizontal = false;
				drawer.T116_lc2_vertical = false;
				drawer.T116_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T116_lc2_C = x2 - drawer.T116_lc2_m * y2;
				drawer.T116_lc2_leftOrAbove = (drawer.T116_sx < drawer.T116_lc2_m*drawer.T116_sy + drawer.T116_lc2_C);
			}

			if(y3 == y1) {
				drawer.T116_lc3_horizontal = true;
				drawer.T116_lc3_vertical = false;
				drawer.T116_lc3_borderY = y3;
				drawer.T116_lc3_leftOrAbove = (drawer.T116_sy <= y3);
			} else if(x3 == x1) {
				drawer.T116_lc3_horizontal = false;
				drawer.T116_lc3_vertical = true;
				drawer.T116_lc3_borderX = x3;
				drawer.T116_lc3_leftOrAbove = (drawer.T116_sx <= x3);
			} else {
				drawer.T116_lc3_horizontal = false;
				drawer.T116_lc3_vertical = false;
				drawer.T116_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T116_lc3_C = x3 - drawer.T116_lc3_m * y3;
				drawer.T116_lc3_leftOrAbove = (drawer.T116_sx < drawer.T116_lc3_m*drawer.T116_sy + drawer.T116_lc3_C);
			}

			drawer.T116_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T116_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T116_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T116_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T116_initializedWithValidData = true;
		}

		t = triangles[117]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T117_r = t.r; drawer.T117_g = t.g; drawer.T117_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T117_initializedWithValidData = false;
		} else {

			drawer.T117_sx = (x1 + x2 + x3) / 3.0;
			drawer.T117_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T117_lc1_horizontal = true;
				drawer.T117_lc1_vertical = false;
				drawer.T117_lc1_borderY = y1;
				drawer.T117_lc1_leftOrAbove = (drawer.T117_sy <= y1);
			} else if(x1 == x2) {
				drawer.T117_lc1_horizontal = false;
				drawer.T117_lc1_vertical = true;
				drawer.T117_lc1_borderX = x1;
				drawer.T117_lc1_leftOrAbove = (drawer.T117_sx <= x1);
			} else {
				drawer.T117_lc1_horizontal = false;
				drawer.T117_lc1_vertical = false;
				drawer.T117_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T117_lc1_C = x1 - drawer.T117_lc1_m * y1;
				drawer.T117_lc1_leftOrAbove = (drawer.T117_sx < drawer.T117_lc1_m*drawer.T117_sy + drawer.T117_lc1_C);
			}

			if(y2 == y3) {
				drawer.T117_lc2_horizontal = true;
				drawer.T117_lc2_vertical = false;
				drawer.T117_lc2_borderY = y2;
				drawer.T117_lc2_leftOrAbove = (drawer.T117_sy <= y2);
			} else if(x2 == x3) {
				drawer.T117_lc2_horizontal = false;
				drawer.T117_lc2_vertical = true;
				drawer.T117_lc2_borderX = x2;
				drawer.T117_lc2_leftOrAbove = (drawer.T117_sx <= x2);
			} else {
				drawer.T117_lc2_horizontal = false;
				drawer.T117_lc2_vertical = false;
				drawer.T117_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T117_lc2_C = x2 - drawer.T117_lc2_m * y2;
				drawer.T117_lc2_leftOrAbove = (drawer.T117_sx < drawer.T117_lc2_m*drawer.T117_sy + drawer.T117_lc2_C);
			}

			if(y3 == y1) {
				drawer.T117_lc3_horizontal = true;
				drawer.T117_lc3_vertical = false;
				drawer.T117_lc3_borderY = y3;
				drawer.T117_lc3_leftOrAbove = (drawer.T117_sy <= y3);
			} else if(x3 == x1) {
				drawer.T117_lc3_horizontal = false;
				drawer.T117_lc3_vertical = true;
				drawer.T117_lc3_borderX = x3;
				drawer.T117_lc3_leftOrAbove = (drawer.T117_sx <= x3);
			} else {
				drawer.T117_lc3_horizontal = false;
				drawer.T117_lc3_vertical = false;
				drawer.T117_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T117_lc3_C = x3 - drawer.T117_lc3_m * y3;
				drawer.T117_lc3_leftOrAbove = (drawer.T117_sx < drawer.T117_lc3_m*drawer.T117_sy + drawer.T117_lc3_C);
			}

			drawer.T117_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T117_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T117_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T117_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T117_initializedWithValidData = true;
		}

		t = triangles[118]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T118_r = t.r; drawer.T118_g = t.g; drawer.T118_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T118_initializedWithValidData = false;
		} else {

			drawer.T118_sx = (x1 + x2 + x3) / 3.0;
			drawer.T118_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T118_lc1_horizontal = true;
				drawer.T118_lc1_vertical = false;
				drawer.T118_lc1_borderY = y1;
				drawer.T118_lc1_leftOrAbove = (drawer.T118_sy <= y1);
			} else if(x1 == x2) {
				drawer.T118_lc1_horizontal = false;
				drawer.T118_lc1_vertical = true;
				drawer.T118_lc1_borderX = x1;
				drawer.T118_lc1_leftOrAbove = (drawer.T118_sx <= x1);
			} else {
				drawer.T118_lc1_horizontal = false;
				drawer.T118_lc1_vertical = false;
				drawer.T118_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T118_lc1_C = x1 - drawer.T118_lc1_m * y1;
				drawer.T118_lc1_leftOrAbove = (drawer.T118_sx < drawer.T118_lc1_m*drawer.T118_sy + drawer.T118_lc1_C);
			}

			if(y2 == y3) {
				drawer.T118_lc2_horizontal = true;
				drawer.T118_lc2_vertical = false;
				drawer.T118_lc2_borderY = y2;
				drawer.T118_lc2_leftOrAbove = (drawer.T118_sy <= y2);
			} else if(x2 == x3) {
				drawer.T118_lc2_horizontal = false;
				drawer.T118_lc2_vertical = true;
				drawer.T118_lc2_borderX = x2;
				drawer.T118_lc2_leftOrAbove = (drawer.T118_sx <= x2);
			} else {
				drawer.T118_lc2_horizontal = false;
				drawer.T118_lc2_vertical = false;
				drawer.T118_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T118_lc2_C = x2 - drawer.T118_lc2_m * y2;
				drawer.T118_lc2_leftOrAbove = (drawer.T118_sx < drawer.T118_lc2_m*drawer.T118_sy + drawer.T118_lc2_C);
			}

			if(y3 == y1) {
				drawer.T118_lc3_horizontal = true;
				drawer.T118_lc3_vertical = false;
				drawer.T118_lc3_borderY = y3;
				drawer.T118_lc3_leftOrAbove = (drawer.T118_sy <= y3);
			} else if(x3 == x1) {
				drawer.T118_lc3_horizontal = false;
				drawer.T118_lc3_vertical = true;
				drawer.T118_lc3_borderX = x3;
				drawer.T118_lc3_leftOrAbove = (drawer.T118_sx <= x3);
			} else {
				drawer.T118_lc3_horizontal = false;
				drawer.T118_lc3_vertical = false;
				drawer.T118_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T118_lc3_C = x3 - drawer.T118_lc3_m * y3;
				drawer.T118_lc3_leftOrAbove = (drawer.T118_sx < drawer.T118_lc3_m*drawer.T118_sy + drawer.T118_lc3_C);
			}

			drawer.T118_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T118_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T118_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T118_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T118_initializedWithValidData = true;
		}

		t = triangles[119]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T119_r = t.r; drawer.T119_g = t.g; drawer.T119_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T119_initializedWithValidData = false;
		} else {

			drawer.T119_sx = (x1 + x2 + x3) / 3.0;
			drawer.T119_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T119_lc1_horizontal = true;
				drawer.T119_lc1_vertical = false;
				drawer.T119_lc1_borderY = y1;
				drawer.T119_lc1_leftOrAbove = (drawer.T119_sy <= y1);
			} else if(x1 == x2) {
				drawer.T119_lc1_horizontal = false;
				drawer.T119_lc1_vertical = true;
				drawer.T119_lc1_borderX = x1;
				drawer.T119_lc1_leftOrAbove = (drawer.T119_sx <= x1);
			} else {
				drawer.T119_lc1_horizontal = false;
				drawer.T119_lc1_vertical = false;
				drawer.T119_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T119_lc1_C = x1 - drawer.T119_lc1_m * y1;
				drawer.T119_lc1_leftOrAbove = (drawer.T119_sx < drawer.T119_lc1_m*drawer.T119_sy + drawer.T119_lc1_C);
			}

			if(y2 == y3) {
				drawer.T119_lc2_horizontal = true;
				drawer.T119_lc2_vertical = false;
				drawer.T119_lc2_borderY = y2;
				drawer.T119_lc2_leftOrAbove = (drawer.T119_sy <= y2);
			} else if(x2 == x3) {
				drawer.T119_lc2_horizontal = false;
				drawer.T119_lc2_vertical = true;
				drawer.T119_lc2_borderX = x2;
				drawer.T119_lc2_leftOrAbove = (drawer.T119_sx <= x2);
			} else {
				drawer.T119_lc2_horizontal = false;
				drawer.T119_lc2_vertical = false;
				drawer.T119_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T119_lc2_C = x2 - drawer.T119_lc2_m * y2;
				drawer.T119_lc2_leftOrAbove = (drawer.T119_sx < drawer.T119_lc2_m*drawer.T119_sy + drawer.T119_lc2_C);
			}

			if(y3 == y1) {
				drawer.T119_lc3_horizontal = true;
				drawer.T119_lc3_vertical = false;
				drawer.T119_lc3_borderY = y3;
				drawer.T119_lc3_leftOrAbove = (drawer.T119_sy <= y3);
			} else if(x3 == x1) {
				drawer.T119_lc3_horizontal = false;
				drawer.T119_lc3_vertical = true;
				drawer.T119_lc3_borderX = x3;
				drawer.T119_lc3_leftOrAbove = (drawer.T119_sx <= x3);
			} else {
				drawer.T119_lc3_horizontal = false;
				drawer.T119_lc3_vertical = false;
				drawer.T119_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T119_lc3_C = x3 - drawer.T119_lc3_m * y3;
				drawer.T119_lc3_leftOrAbove = (drawer.T119_sx < drawer.T119_lc3_m*drawer.T119_sy + drawer.T119_lc3_C);
			}

			drawer.T119_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T119_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T119_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T119_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T119_initializedWithValidData = true;
		}
	}

	public void loadTriangles5(SingleTriangle[] triangles) {
		int x1, y1, x2, y2, x3, y3;
		SingleTriangle t;

		t = triangles[120]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T120_r = t.r; drawer.T120_g = t.g; drawer.T120_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T120_initializedWithValidData = false;
		} else {

			drawer.T120_sx = (x1 + x2 + x3) / 3.0;
			drawer.T120_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T120_lc1_horizontal = true;
				drawer.T120_lc1_vertical = false;
				drawer.T120_lc1_borderY = y1;
				drawer.T120_lc1_leftOrAbove = (drawer.T120_sy <= y1);
			} else if(x1 == x2) {
				drawer.T120_lc1_horizontal = false;
				drawer.T120_lc1_vertical = true;
				drawer.T120_lc1_borderX = x1;
				drawer.T120_lc1_leftOrAbove = (drawer.T120_sx <= x1);
			} else {
				drawer.T120_lc1_horizontal = false;
				drawer.T120_lc1_vertical = false;
				drawer.T120_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T120_lc1_C = x1 - drawer.T120_lc1_m * y1;
				drawer.T120_lc1_leftOrAbove = (drawer.T120_sx < drawer.T120_lc1_m*drawer.T120_sy + drawer.T120_lc1_C);
			}

			if(y2 == y3) {
				drawer.T120_lc2_horizontal = true;
				drawer.T120_lc2_vertical = false;
				drawer.T120_lc2_borderY = y2;
				drawer.T120_lc2_leftOrAbove = (drawer.T120_sy <= y2);
			} else if(x2 == x3) {
				drawer.T120_lc2_horizontal = false;
				drawer.T120_lc2_vertical = true;
				drawer.T120_lc2_borderX = x2;
				drawer.T120_lc2_leftOrAbove = (drawer.T120_sx <= x2);
			} else {
				drawer.T120_lc2_horizontal = false;
				drawer.T120_lc2_vertical = false;
				drawer.T120_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T120_lc2_C = x2 - drawer.T120_lc2_m * y2;
				drawer.T120_lc2_leftOrAbove = (drawer.T120_sx < drawer.T120_lc2_m*drawer.T120_sy + drawer.T120_lc2_C);
			}

			if(y3 == y1) {
				drawer.T120_lc3_horizontal = true;
				drawer.T120_lc3_vertical = false;
				drawer.T120_lc3_borderY = y3;
				drawer.T120_lc3_leftOrAbove = (drawer.T120_sy <= y3);
			} else if(x3 == x1) {
				drawer.T120_lc3_horizontal = false;
				drawer.T120_lc3_vertical = true;
				drawer.T120_lc3_borderX = x3;
				drawer.T120_lc3_leftOrAbove = (drawer.T120_sx <= x3);
			} else {
				drawer.T120_lc3_horizontal = false;
				drawer.T120_lc3_vertical = false;
				drawer.T120_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T120_lc3_C = x3 - drawer.T120_lc3_m * y3;
				drawer.T120_lc3_leftOrAbove = (drawer.T120_sx < drawer.T120_lc3_m*drawer.T120_sy + drawer.T120_lc3_C);
			}

			drawer.T120_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T120_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T120_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T120_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T120_initializedWithValidData = true;
		}

		t = triangles[121]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T121_r = t.r; drawer.T121_g = t.g; drawer.T121_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T121_initializedWithValidData = false;
		} else {

			drawer.T121_sx = (x1 + x2 + x3) / 3.0;
			drawer.T121_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T121_lc1_horizontal = true;
				drawer.T121_lc1_vertical = false;
				drawer.T121_lc1_borderY = y1;
				drawer.T121_lc1_leftOrAbove = (drawer.T121_sy <= y1);
			} else if(x1 == x2) {
				drawer.T121_lc1_horizontal = false;
				drawer.T121_lc1_vertical = true;
				drawer.T121_lc1_borderX = x1;
				drawer.T121_lc1_leftOrAbove = (drawer.T121_sx <= x1);
			} else {
				drawer.T121_lc1_horizontal = false;
				drawer.T121_lc1_vertical = false;
				drawer.T121_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T121_lc1_C = x1 - drawer.T121_lc1_m * y1;
				drawer.T121_lc1_leftOrAbove = (drawer.T121_sx < drawer.T121_lc1_m*drawer.T121_sy + drawer.T121_lc1_C);
			}

			if(y2 == y3) {
				drawer.T121_lc2_horizontal = true;
				drawer.T121_lc2_vertical = false;
				drawer.T121_lc2_borderY = y2;
				drawer.T121_lc2_leftOrAbove = (drawer.T121_sy <= y2);
			} else if(x2 == x3) {
				drawer.T121_lc2_horizontal = false;
				drawer.T121_lc2_vertical = true;
				drawer.T121_lc2_borderX = x2;
				drawer.T121_lc2_leftOrAbove = (drawer.T121_sx <= x2);
			} else {
				drawer.T121_lc2_horizontal = false;
				drawer.T121_lc2_vertical = false;
				drawer.T121_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T121_lc2_C = x2 - drawer.T121_lc2_m * y2;
				drawer.T121_lc2_leftOrAbove = (drawer.T121_sx < drawer.T121_lc2_m*drawer.T121_sy + drawer.T121_lc2_C);
			}

			if(y3 == y1) {
				drawer.T121_lc3_horizontal = true;
				drawer.T121_lc3_vertical = false;
				drawer.T121_lc3_borderY = y3;
				drawer.T121_lc3_leftOrAbove = (drawer.T121_sy <= y3);
			} else if(x3 == x1) {
				drawer.T121_lc3_horizontal = false;
				drawer.T121_lc3_vertical = true;
				drawer.T121_lc3_borderX = x3;
				drawer.T121_lc3_leftOrAbove = (drawer.T121_sx <= x3);
			} else {
				drawer.T121_lc3_horizontal = false;
				drawer.T121_lc3_vertical = false;
				drawer.T121_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T121_lc3_C = x3 - drawer.T121_lc3_m * y3;
				drawer.T121_lc3_leftOrAbove = (drawer.T121_sx < drawer.T121_lc3_m*drawer.T121_sy + drawer.T121_lc3_C);
			}

			drawer.T121_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T121_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T121_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T121_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T121_initializedWithValidData = true;
		}

		t = triangles[122]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T122_r = t.r; drawer.T122_g = t.g; drawer.T122_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T122_initializedWithValidData = false;
		} else {

			drawer.T122_sx = (x1 + x2 + x3) / 3.0;
			drawer.T122_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T122_lc1_horizontal = true;
				drawer.T122_lc1_vertical = false;
				drawer.T122_lc1_borderY = y1;
				drawer.T122_lc1_leftOrAbove = (drawer.T122_sy <= y1);
			} else if(x1 == x2) {
				drawer.T122_lc1_horizontal = false;
				drawer.T122_lc1_vertical = true;
				drawer.T122_lc1_borderX = x1;
				drawer.T122_lc1_leftOrAbove = (drawer.T122_sx <= x1);
			} else {
				drawer.T122_lc1_horizontal = false;
				drawer.T122_lc1_vertical = false;
				drawer.T122_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T122_lc1_C = x1 - drawer.T122_lc1_m * y1;
				drawer.T122_lc1_leftOrAbove = (drawer.T122_sx < drawer.T122_lc1_m*drawer.T122_sy + drawer.T122_lc1_C);
			}

			if(y2 == y3) {
				drawer.T122_lc2_horizontal = true;
				drawer.T122_lc2_vertical = false;
				drawer.T122_lc2_borderY = y2;
				drawer.T122_lc2_leftOrAbove = (drawer.T122_sy <= y2);
			} else if(x2 == x3) {
				drawer.T122_lc2_horizontal = false;
				drawer.T122_lc2_vertical = true;
				drawer.T122_lc2_borderX = x2;
				drawer.T122_lc2_leftOrAbove = (drawer.T122_sx <= x2);
			} else {
				drawer.T122_lc2_horizontal = false;
				drawer.T122_lc2_vertical = false;
				drawer.T122_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T122_lc2_C = x2 - drawer.T122_lc2_m * y2;
				drawer.T122_lc2_leftOrAbove = (drawer.T122_sx < drawer.T122_lc2_m*drawer.T122_sy + drawer.T122_lc2_C);
			}

			if(y3 == y1) {
				drawer.T122_lc3_horizontal = true;
				drawer.T122_lc3_vertical = false;
				drawer.T122_lc3_borderY = y3;
				drawer.T122_lc3_leftOrAbove = (drawer.T122_sy <= y3);
			} else if(x3 == x1) {
				drawer.T122_lc3_horizontal = false;
				drawer.T122_lc3_vertical = true;
				drawer.T122_lc3_borderX = x3;
				drawer.T122_lc3_leftOrAbove = (drawer.T122_sx <= x3);
			} else {
				drawer.T122_lc3_horizontal = false;
				drawer.T122_lc3_vertical = false;
				drawer.T122_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T122_lc3_C = x3 - drawer.T122_lc3_m * y3;
				drawer.T122_lc3_leftOrAbove = (drawer.T122_sx < drawer.T122_lc3_m*drawer.T122_sy + drawer.T122_lc3_C);
			}

			drawer.T122_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T122_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T122_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T122_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T122_initializedWithValidData = true;
		}

		t = triangles[123]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T123_r = t.r; drawer.T123_g = t.g; drawer.T123_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T123_initializedWithValidData = false;
		} else {

			drawer.T123_sx = (x1 + x2 + x3) / 3.0;
			drawer.T123_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T123_lc1_horizontal = true;
				drawer.T123_lc1_vertical = false;
				drawer.T123_lc1_borderY = y1;
				drawer.T123_lc1_leftOrAbove = (drawer.T123_sy <= y1);
			} else if(x1 == x2) {
				drawer.T123_lc1_horizontal = false;
				drawer.T123_lc1_vertical = true;
				drawer.T123_lc1_borderX = x1;
				drawer.T123_lc1_leftOrAbove = (drawer.T123_sx <= x1);
			} else {
				drawer.T123_lc1_horizontal = false;
				drawer.T123_lc1_vertical = false;
				drawer.T123_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T123_lc1_C = x1 - drawer.T123_lc1_m * y1;
				drawer.T123_lc1_leftOrAbove = (drawer.T123_sx < drawer.T123_lc1_m*drawer.T123_sy + drawer.T123_lc1_C);
			}

			if(y2 == y3) {
				drawer.T123_lc2_horizontal = true;
				drawer.T123_lc2_vertical = false;
				drawer.T123_lc2_borderY = y2;
				drawer.T123_lc2_leftOrAbove = (drawer.T123_sy <= y2);
			} else if(x2 == x3) {
				drawer.T123_lc2_horizontal = false;
				drawer.T123_lc2_vertical = true;
				drawer.T123_lc2_borderX = x2;
				drawer.T123_lc2_leftOrAbove = (drawer.T123_sx <= x2);
			} else {
				drawer.T123_lc2_horizontal = false;
				drawer.T123_lc2_vertical = false;
				drawer.T123_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T123_lc2_C = x2 - drawer.T123_lc2_m * y2;
				drawer.T123_lc2_leftOrAbove = (drawer.T123_sx < drawer.T123_lc2_m*drawer.T123_sy + drawer.T123_lc2_C);
			}

			if(y3 == y1) {
				drawer.T123_lc3_horizontal = true;
				drawer.T123_lc3_vertical = false;
				drawer.T123_lc3_borderY = y3;
				drawer.T123_lc3_leftOrAbove = (drawer.T123_sy <= y3);
			} else if(x3 == x1) {
				drawer.T123_lc3_horizontal = false;
				drawer.T123_lc3_vertical = true;
				drawer.T123_lc3_borderX = x3;
				drawer.T123_lc3_leftOrAbove = (drawer.T123_sx <= x3);
			} else {
				drawer.T123_lc3_horizontal = false;
				drawer.T123_lc3_vertical = false;
				drawer.T123_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T123_lc3_C = x3 - drawer.T123_lc3_m * y3;
				drawer.T123_lc3_leftOrAbove = (drawer.T123_sx < drawer.T123_lc3_m*drawer.T123_sy + drawer.T123_lc3_C);
			}

			drawer.T123_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T123_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T123_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T123_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T123_initializedWithValidData = true;
		}

		t = triangles[124]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T124_r = t.r; drawer.T124_g = t.g; drawer.T124_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T124_initializedWithValidData = false;
		} else {

			drawer.T124_sx = (x1 + x2 + x3) / 3.0;
			drawer.T124_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T124_lc1_horizontal = true;
				drawer.T124_lc1_vertical = false;
				drawer.T124_lc1_borderY = y1;
				drawer.T124_lc1_leftOrAbove = (drawer.T124_sy <= y1);
			} else if(x1 == x2) {
				drawer.T124_lc1_horizontal = false;
				drawer.T124_lc1_vertical = true;
				drawer.T124_lc1_borderX = x1;
				drawer.T124_lc1_leftOrAbove = (drawer.T124_sx <= x1);
			} else {
				drawer.T124_lc1_horizontal = false;
				drawer.T124_lc1_vertical = false;
				drawer.T124_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T124_lc1_C = x1 - drawer.T124_lc1_m * y1;
				drawer.T124_lc1_leftOrAbove = (drawer.T124_sx < drawer.T124_lc1_m*drawer.T124_sy + drawer.T124_lc1_C);
			}

			if(y2 == y3) {
				drawer.T124_lc2_horizontal = true;
				drawer.T124_lc2_vertical = false;
				drawer.T124_lc2_borderY = y2;
				drawer.T124_lc2_leftOrAbove = (drawer.T124_sy <= y2);
			} else if(x2 == x3) {
				drawer.T124_lc2_horizontal = false;
				drawer.T124_lc2_vertical = true;
				drawer.T124_lc2_borderX = x2;
				drawer.T124_lc2_leftOrAbove = (drawer.T124_sx <= x2);
			} else {
				drawer.T124_lc2_horizontal = false;
				drawer.T124_lc2_vertical = false;
				drawer.T124_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T124_lc2_C = x2 - drawer.T124_lc2_m * y2;
				drawer.T124_lc2_leftOrAbove = (drawer.T124_sx < drawer.T124_lc2_m*drawer.T124_sy + drawer.T124_lc2_C);
			}

			if(y3 == y1) {
				drawer.T124_lc3_horizontal = true;
				drawer.T124_lc3_vertical = false;
				drawer.T124_lc3_borderY = y3;
				drawer.T124_lc3_leftOrAbove = (drawer.T124_sy <= y3);
			} else if(x3 == x1) {
				drawer.T124_lc3_horizontal = false;
				drawer.T124_lc3_vertical = true;
				drawer.T124_lc3_borderX = x3;
				drawer.T124_lc3_leftOrAbove = (drawer.T124_sx <= x3);
			} else {
				drawer.T124_lc3_horizontal = false;
				drawer.T124_lc3_vertical = false;
				drawer.T124_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T124_lc3_C = x3 - drawer.T124_lc3_m * y3;
				drawer.T124_lc3_leftOrAbove = (drawer.T124_sx < drawer.T124_lc3_m*drawer.T124_sy + drawer.T124_lc3_C);
			}

			drawer.T124_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T124_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T124_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T124_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T124_initializedWithValidData = true;
		}

		t = triangles[125]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T125_r = t.r; drawer.T125_g = t.g; drawer.T125_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T125_initializedWithValidData = false;
		} else {

			drawer.T125_sx = (x1 + x2 + x3) / 3.0;
			drawer.T125_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T125_lc1_horizontal = true;
				drawer.T125_lc1_vertical = false;
				drawer.T125_lc1_borderY = y1;
				drawer.T125_lc1_leftOrAbove = (drawer.T125_sy <= y1);
			} else if(x1 == x2) {
				drawer.T125_lc1_horizontal = false;
				drawer.T125_lc1_vertical = true;
				drawer.T125_lc1_borderX = x1;
				drawer.T125_lc1_leftOrAbove = (drawer.T125_sx <= x1);
			} else {
				drawer.T125_lc1_horizontal = false;
				drawer.T125_lc1_vertical = false;
				drawer.T125_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T125_lc1_C = x1 - drawer.T125_lc1_m * y1;
				drawer.T125_lc1_leftOrAbove = (drawer.T125_sx < drawer.T125_lc1_m*drawer.T125_sy + drawer.T125_lc1_C);
			}

			if(y2 == y3) {
				drawer.T125_lc2_horizontal = true;
				drawer.T125_lc2_vertical = false;
				drawer.T125_lc2_borderY = y2;
				drawer.T125_lc2_leftOrAbove = (drawer.T125_sy <= y2);
			} else if(x2 == x3) {
				drawer.T125_lc2_horizontal = false;
				drawer.T125_lc2_vertical = true;
				drawer.T125_lc2_borderX = x2;
				drawer.T125_lc2_leftOrAbove = (drawer.T125_sx <= x2);
			} else {
				drawer.T125_lc2_horizontal = false;
				drawer.T125_lc2_vertical = false;
				drawer.T125_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T125_lc2_C = x2 - drawer.T125_lc2_m * y2;
				drawer.T125_lc2_leftOrAbove = (drawer.T125_sx < drawer.T125_lc2_m*drawer.T125_sy + drawer.T125_lc2_C);
			}

			if(y3 == y1) {
				drawer.T125_lc3_horizontal = true;
				drawer.T125_lc3_vertical = false;
				drawer.T125_lc3_borderY = y3;
				drawer.T125_lc3_leftOrAbove = (drawer.T125_sy <= y3);
			} else if(x3 == x1) {
				drawer.T125_lc3_horizontal = false;
				drawer.T125_lc3_vertical = true;
				drawer.T125_lc3_borderX = x3;
				drawer.T125_lc3_leftOrAbove = (drawer.T125_sx <= x3);
			} else {
				drawer.T125_lc3_horizontal = false;
				drawer.T125_lc3_vertical = false;
				drawer.T125_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T125_lc3_C = x3 - drawer.T125_lc3_m * y3;
				drawer.T125_lc3_leftOrAbove = (drawer.T125_sx < drawer.T125_lc3_m*drawer.T125_sy + drawer.T125_lc3_C);
			}

			drawer.T125_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T125_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T125_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T125_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T125_initializedWithValidData = true;
		}

		t = triangles[126]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T126_r = t.r; drawer.T126_g = t.g; drawer.T126_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T126_initializedWithValidData = false;
		} else {

			drawer.T126_sx = (x1 + x2 + x3) / 3.0;
			drawer.T126_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T126_lc1_horizontal = true;
				drawer.T126_lc1_vertical = false;
				drawer.T126_lc1_borderY = y1;
				drawer.T126_lc1_leftOrAbove = (drawer.T126_sy <= y1);
			} else if(x1 == x2) {
				drawer.T126_lc1_horizontal = false;
				drawer.T126_lc1_vertical = true;
				drawer.T126_lc1_borderX = x1;
				drawer.T126_lc1_leftOrAbove = (drawer.T126_sx <= x1);
			} else {
				drawer.T126_lc1_horizontal = false;
				drawer.T126_lc1_vertical = false;
				drawer.T126_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T126_lc1_C = x1 - drawer.T126_lc1_m * y1;
				drawer.T126_lc1_leftOrAbove = (drawer.T126_sx < drawer.T126_lc1_m*drawer.T126_sy + drawer.T126_lc1_C);
			}

			if(y2 == y3) {
				drawer.T126_lc2_horizontal = true;
				drawer.T126_lc2_vertical = false;
				drawer.T126_lc2_borderY = y2;
				drawer.T126_lc2_leftOrAbove = (drawer.T126_sy <= y2);
			} else if(x2 == x3) {
				drawer.T126_lc2_horizontal = false;
				drawer.T126_lc2_vertical = true;
				drawer.T126_lc2_borderX = x2;
				drawer.T126_lc2_leftOrAbove = (drawer.T126_sx <= x2);
			} else {
				drawer.T126_lc2_horizontal = false;
				drawer.T126_lc2_vertical = false;
				drawer.T126_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T126_lc2_C = x2 - drawer.T126_lc2_m * y2;
				drawer.T126_lc2_leftOrAbove = (drawer.T126_sx < drawer.T126_lc2_m*drawer.T126_sy + drawer.T126_lc2_C);
			}

			if(y3 == y1) {
				drawer.T126_lc3_horizontal = true;
				drawer.T126_lc3_vertical = false;
				drawer.T126_lc3_borderY = y3;
				drawer.T126_lc3_leftOrAbove = (drawer.T126_sy <= y3);
			} else if(x3 == x1) {
				drawer.T126_lc3_horizontal = false;
				drawer.T126_lc3_vertical = true;
				drawer.T126_lc3_borderX = x3;
				drawer.T126_lc3_leftOrAbove = (drawer.T126_sx <= x3);
			} else {
				drawer.T126_lc3_horizontal = false;
				drawer.T126_lc3_vertical = false;
				drawer.T126_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T126_lc3_C = x3 - drawer.T126_lc3_m * y3;
				drawer.T126_lc3_leftOrAbove = (drawer.T126_sx < drawer.T126_lc3_m*drawer.T126_sy + drawer.T126_lc3_C);
			}

			drawer.T126_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T126_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T126_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T126_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T126_initializedWithValidData = true;
		}

		t = triangles[127]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T127_r = t.r; drawer.T127_g = t.g; drawer.T127_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T127_initializedWithValidData = false;
		} else {

			drawer.T127_sx = (x1 + x2 + x3) / 3.0;
			drawer.T127_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T127_lc1_horizontal = true;
				drawer.T127_lc1_vertical = false;
				drawer.T127_lc1_borderY = y1;
				drawer.T127_lc1_leftOrAbove = (drawer.T127_sy <= y1);
			} else if(x1 == x2) {
				drawer.T127_lc1_horizontal = false;
				drawer.T127_lc1_vertical = true;
				drawer.T127_lc1_borderX = x1;
				drawer.T127_lc1_leftOrAbove = (drawer.T127_sx <= x1);
			} else {
				drawer.T127_lc1_horizontal = false;
				drawer.T127_lc1_vertical = false;
				drawer.T127_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T127_lc1_C = x1 - drawer.T127_lc1_m * y1;
				drawer.T127_lc1_leftOrAbove = (drawer.T127_sx < drawer.T127_lc1_m*drawer.T127_sy + drawer.T127_lc1_C);
			}

			if(y2 == y3) {
				drawer.T127_lc2_horizontal = true;
				drawer.T127_lc2_vertical = false;
				drawer.T127_lc2_borderY = y2;
				drawer.T127_lc2_leftOrAbove = (drawer.T127_sy <= y2);
			} else if(x2 == x3) {
				drawer.T127_lc2_horizontal = false;
				drawer.T127_lc2_vertical = true;
				drawer.T127_lc2_borderX = x2;
				drawer.T127_lc2_leftOrAbove = (drawer.T127_sx <= x2);
			} else {
				drawer.T127_lc2_horizontal = false;
				drawer.T127_lc2_vertical = false;
				drawer.T127_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T127_lc2_C = x2 - drawer.T127_lc2_m * y2;
				drawer.T127_lc2_leftOrAbove = (drawer.T127_sx < drawer.T127_lc2_m*drawer.T127_sy + drawer.T127_lc2_C);
			}

			if(y3 == y1) {
				drawer.T127_lc3_horizontal = true;
				drawer.T127_lc3_vertical = false;
				drawer.T127_lc3_borderY = y3;
				drawer.T127_lc3_leftOrAbove = (drawer.T127_sy <= y3);
			} else if(x3 == x1) {
				drawer.T127_lc3_horizontal = false;
				drawer.T127_lc3_vertical = true;
				drawer.T127_lc3_borderX = x3;
				drawer.T127_lc3_leftOrAbove = (drawer.T127_sx <= x3);
			} else {
				drawer.T127_lc3_horizontal = false;
				drawer.T127_lc3_vertical = false;
				drawer.T127_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T127_lc3_C = x3 - drawer.T127_lc3_m * y3;
				drawer.T127_lc3_leftOrAbove = (drawer.T127_sx < drawer.T127_lc3_m*drawer.T127_sy + drawer.T127_lc3_C);
			}

			drawer.T127_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T127_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T127_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T127_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T127_initializedWithValidData = true;
		}

		t = triangles[128]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T128_r = t.r; drawer.T128_g = t.g; drawer.T128_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T128_initializedWithValidData = false;
		} else {

			drawer.T128_sx = (x1 + x2 + x3) / 3.0;
			drawer.T128_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T128_lc1_horizontal = true;
				drawer.T128_lc1_vertical = false;
				drawer.T128_lc1_borderY = y1;
				drawer.T128_lc1_leftOrAbove = (drawer.T128_sy <= y1);
			} else if(x1 == x2) {
				drawer.T128_lc1_horizontal = false;
				drawer.T128_lc1_vertical = true;
				drawer.T128_lc1_borderX = x1;
				drawer.T128_lc1_leftOrAbove = (drawer.T128_sx <= x1);
			} else {
				drawer.T128_lc1_horizontal = false;
				drawer.T128_lc1_vertical = false;
				drawer.T128_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T128_lc1_C = x1 - drawer.T128_lc1_m * y1;
				drawer.T128_lc1_leftOrAbove = (drawer.T128_sx < drawer.T128_lc1_m*drawer.T128_sy + drawer.T128_lc1_C);
			}

			if(y2 == y3) {
				drawer.T128_lc2_horizontal = true;
				drawer.T128_lc2_vertical = false;
				drawer.T128_lc2_borderY = y2;
				drawer.T128_lc2_leftOrAbove = (drawer.T128_sy <= y2);
			} else if(x2 == x3) {
				drawer.T128_lc2_horizontal = false;
				drawer.T128_lc2_vertical = true;
				drawer.T128_lc2_borderX = x2;
				drawer.T128_lc2_leftOrAbove = (drawer.T128_sx <= x2);
			} else {
				drawer.T128_lc2_horizontal = false;
				drawer.T128_lc2_vertical = false;
				drawer.T128_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T128_lc2_C = x2 - drawer.T128_lc2_m * y2;
				drawer.T128_lc2_leftOrAbove = (drawer.T128_sx < drawer.T128_lc2_m*drawer.T128_sy + drawer.T128_lc2_C);
			}

			if(y3 == y1) {
				drawer.T128_lc3_horizontal = true;
				drawer.T128_lc3_vertical = false;
				drawer.T128_lc3_borderY = y3;
				drawer.T128_lc3_leftOrAbove = (drawer.T128_sy <= y3);
			} else if(x3 == x1) {
				drawer.T128_lc3_horizontal = false;
				drawer.T128_lc3_vertical = true;
				drawer.T128_lc3_borderX = x3;
				drawer.T128_lc3_leftOrAbove = (drawer.T128_sx <= x3);
			} else {
				drawer.T128_lc3_horizontal = false;
				drawer.T128_lc3_vertical = false;
				drawer.T128_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T128_lc3_C = x3 - drawer.T128_lc3_m * y3;
				drawer.T128_lc3_leftOrAbove = (drawer.T128_sx < drawer.T128_lc3_m*drawer.T128_sy + drawer.T128_lc3_C);
			}

			drawer.T128_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T128_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T128_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T128_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T128_initializedWithValidData = true;
		}

		t = triangles[129]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T129_r = t.r; drawer.T129_g = t.g; drawer.T129_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T129_initializedWithValidData = false;
		} else {

			drawer.T129_sx = (x1 + x2 + x3) / 3.0;
			drawer.T129_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T129_lc1_horizontal = true;
				drawer.T129_lc1_vertical = false;
				drawer.T129_lc1_borderY = y1;
				drawer.T129_lc1_leftOrAbove = (drawer.T129_sy <= y1);
			} else if(x1 == x2) {
				drawer.T129_lc1_horizontal = false;
				drawer.T129_lc1_vertical = true;
				drawer.T129_lc1_borderX = x1;
				drawer.T129_lc1_leftOrAbove = (drawer.T129_sx <= x1);
			} else {
				drawer.T129_lc1_horizontal = false;
				drawer.T129_lc1_vertical = false;
				drawer.T129_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T129_lc1_C = x1 - drawer.T129_lc1_m * y1;
				drawer.T129_lc1_leftOrAbove = (drawer.T129_sx < drawer.T129_lc1_m*drawer.T129_sy + drawer.T129_lc1_C);
			}

			if(y2 == y3) {
				drawer.T129_lc2_horizontal = true;
				drawer.T129_lc2_vertical = false;
				drawer.T129_lc2_borderY = y2;
				drawer.T129_lc2_leftOrAbove = (drawer.T129_sy <= y2);
			} else if(x2 == x3) {
				drawer.T129_lc2_horizontal = false;
				drawer.T129_lc2_vertical = true;
				drawer.T129_lc2_borderX = x2;
				drawer.T129_lc2_leftOrAbove = (drawer.T129_sx <= x2);
			} else {
				drawer.T129_lc2_horizontal = false;
				drawer.T129_lc2_vertical = false;
				drawer.T129_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T129_lc2_C = x2 - drawer.T129_lc2_m * y2;
				drawer.T129_lc2_leftOrAbove = (drawer.T129_sx < drawer.T129_lc2_m*drawer.T129_sy + drawer.T129_lc2_C);
			}

			if(y3 == y1) {
				drawer.T129_lc3_horizontal = true;
				drawer.T129_lc3_vertical = false;
				drawer.T129_lc3_borderY = y3;
				drawer.T129_lc3_leftOrAbove = (drawer.T129_sy <= y3);
			} else if(x3 == x1) {
				drawer.T129_lc3_horizontal = false;
				drawer.T129_lc3_vertical = true;
				drawer.T129_lc3_borderX = x3;
				drawer.T129_lc3_leftOrAbove = (drawer.T129_sx <= x3);
			} else {
				drawer.T129_lc3_horizontal = false;
				drawer.T129_lc3_vertical = false;
				drawer.T129_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T129_lc3_C = x3 - drawer.T129_lc3_m * y3;
				drawer.T129_lc3_leftOrAbove = (drawer.T129_sx < drawer.T129_lc3_m*drawer.T129_sy + drawer.T129_lc3_C);
			}

			drawer.T129_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T129_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T129_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T129_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T129_initializedWithValidData = true;
		}

		t = triangles[130]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T130_r = t.r; drawer.T130_g = t.g; drawer.T130_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T130_initializedWithValidData = false;
		} else {

			drawer.T130_sx = (x1 + x2 + x3) / 3.0;
			drawer.T130_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T130_lc1_horizontal = true;
				drawer.T130_lc1_vertical = false;
				drawer.T130_lc1_borderY = y1;
				drawer.T130_lc1_leftOrAbove = (drawer.T130_sy <= y1);
			} else if(x1 == x2) {
				drawer.T130_lc1_horizontal = false;
				drawer.T130_lc1_vertical = true;
				drawer.T130_lc1_borderX = x1;
				drawer.T130_lc1_leftOrAbove = (drawer.T130_sx <= x1);
			} else {
				drawer.T130_lc1_horizontal = false;
				drawer.T130_lc1_vertical = false;
				drawer.T130_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T130_lc1_C = x1 - drawer.T130_lc1_m * y1;
				drawer.T130_lc1_leftOrAbove = (drawer.T130_sx < drawer.T130_lc1_m*drawer.T130_sy + drawer.T130_lc1_C);
			}

			if(y2 == y3) {
				drawer.T130_lc2_horizontal = true;
				drawer.T130_lc2_vertical = false;
				drawer.T130_lc2_borderY = y2;
				drawer.T130_lc2_leftOrAbove = (drawer.T130_sy <= y2);
			} else if(x2 == x3) {
				drawer.T130_lc2_horizontal = false;
				drawer.T130_lc2_vertical = true;
				drawer.T130_lc2_borderX = x2;
				drawer.T130_lc2_leftOrAbove = (drawer.T130_sx <= x2);
			} else {
				drawer.T130_lc2_horizontal = false;
				drawer.T130_lc2_vertical = false;
				drawer.T130_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T130_lc2_C = x2 - drawer.T130_lc2_m * y2;
				drawer.T130_lc2_leftOrAbove = (drawer.T130_sx < drawer.T130_lc2_m*drawer.T130_sy + drawer.T130_lc2_C);
			}

			if(y3 == y1) {
				drawer.T130_lc3_horizontal = true;
				drawer.T130_lc3_vertical = false;
				drawer.T130_lc3_borderY = y3;
				drawer.T130_lc3_leftOrAbove = (drawer.T130_sy <= y3);
			} else if(x3 == x1) {
				drawer.T130_lc3_horizontal = false;
				drawer.T130_lc3_vertical = true;
				drawer.T130_lc3_borderX = x3;
				drawer.T130_lc3_leftOrAbove = (drawer.T130_sx <= x3);
			} else {
				drawer.T130_lc3_horizontal = false;
				drawer.T130_lc3_vertical = false;
				drawer.T130_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T130_lc3_C = x3 - drawer.T130_lc3_m * y3;
				drawer.T130_lc3_leftOrAbove = (drawer.T130_sx < drawer.T130_lc3_m*drawer.T130_sy + drawer.T130_lc3_C);
			}

			drawer.T130_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T130_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T130_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T130_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T130_initializedWithValidData = true;
		}

		t = triangles[131]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T131_r = t.r; drawer.T131_g = t.g; drawer.T131_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T131_initializedWithValidData = false;
		} else {

			drawer.T131_sx = (x1 + x2 + x3) / 3.0;
			drawer.T131_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T131_lc1_horizontal = true;
				drawer.T131_lc1_vertical = false;
				drawer.T131_lc1_borderY = y1;
				drawer.T131_lc1_leftOrAbove = (drawer.T131_sy <= y1);
			} else if(x1 == x2) {
				drawer.T131_lc1_horizontal = false;
				drawer.T131_lc1_vertical = true;
				drawer.T131_lc1_borderX = x1;
				drawer.T131_lc1_leftOrAbove = (drawer.T131_sx <= x1);
			} else {
				drawer.T131_lc1_horizontal = false;
				drawer.T131_lc1_vertical = false;
				drawer.T131_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T131_lc1_C = x1 - drawer.T131_lc1_m * y1;
				drawer.T131_lc1_leftOrAbove = (drawer.T131_sx < drawer.T131_lc1_m*drawer.T131_sy + drawer.T131_lc1_C);
			}

			if(y2 == y3) {
				drawer.T131_lc2_horizontal = true;
				drawer.T131_lc2_vertical = false;
				drawer.T131_lc2_borderY = y2;
				drawer.T131_lc2_leftOrAbove = (drawer.T131_sy <= y2);
			} else if(x2 == x3) {
				drawer.T131_lc2_horizontal = false;
				drawer.T131_lc2_vertical = true;
				drawer.T131_lc2_borderX = x2;
				drawer.T131_lc2_leftOrAbove = (drawer.T131_sx <= x2);
			} else {
				drawer.T131_lc2_horizontal = false;
				drawer.T131_lc2_vertical = false;
				drawer.T131_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T131_lc2_C = x2 - drawer.T131_lc2_m * y2;
				drawer.T131_lc2_leftOrAbove = (drawer.T131_sx < drawer.T131_lc2_m*drawer.T131_sy + drawer.T131_lc2_C);
			}

			if(y3 == y1) {
				drawer.T131_lc3_horizontal = true;
				drawer.T131_lc3_vertical = false;
				drawer.T131_lc3_borderY = y3;
				drawer.T131_lc3_leftOrAbove = (drawer.T131_sy <= y3);
			} else if(x3 == x1) {
				drawer.T131_lc3_horizontal = false;
				drawer.T131_lc3_vertical = true;
				drawer.T131_lc3_borderX = x3;
				drawer.T131_lc3_leftOrAbove = (drawer.T131_sx <= x3);
			} else {
				drawer.T131_lc3_horizontal = false;
				drawer.T131_lc3_vertical = false;
				drawer.T131_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T131_lc3_C = x3 - drawer.T131_lc3_m * y3;
				drawer.T131_lc3_leftOrAbove = (drawer.T131_sx < drawer.T131_lc3_m*drawer.T131_sy + drawer.T131_lc3_C);
			}

			drawer.T131_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T131_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T131_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T131_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T131_initializedWithValidData = true;
		}

		t = triangles[132]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T132_r = t.r; drawer.T132_g = t.g; drawer.T132_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T132_initializedWithValidData = false;
		} else {

			drawer.T132_sx = (x1 + x2 + x3) / 3.0;
			drawer.T132_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T132_lc1_horizontal = true;
				drawer.T132_lc1_vertical = false;
				drawer.T132_lc1_borderY = y1;
				drawer.T132_lc1_leftOrAbove = (drawer.T132_sy <= y1);
			} else if(x1 == x2) {
				drawer.T132_lc1_horizontal = false;
				drawer.T132_lc1_vertical = true;
				drawer.T132_lc1_borderX = x1;
				drawer.T132_lc1_leftOrAbove = (drawer.T132_sx <= x1);
			} else {
				drawer.T132_lc1_horizontal = false;
				drawer.T132_lc1_vertical = false;
				drawer.T132_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T132_lc1_C = x1 - drawer.T132_lc1_m * y1;
				drawer.T132_lc1_leftOrAbove = (drawer.T132_sx < drawer.T132_lc1_m*drawer.T132_sy + drawer.T132_lc1_C);
			}

			if(y2 == y3) {
				drawer.T132_lc2_horizontal = true;
				drawer.T132_lc2_vertical = false;
				drawer.T132_lc2_borderY = y2;
				drawer.T132_lc2_leftOrAbove = (drawer.T132_sy <= y2);
			} else if(x2 == x3) {
				drawer.T132_lc2_horizontal = false;
				drawer.T132_lc2_vertical = true;
				drawer.T132_lc2_borderX = x2;
				drawer.T132_lc2_leftOrAbove = (drawer.T132_sx <= x2);
			} else {
				drawer.T132_lc2_horizontal = false;
				drawer.T132_lc2_vertical = false;
				drawer.T132_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T132_lc2_C = x2 - drawer.T132_lc2_m * y2;
				drawer.T132_lc2_leftOrAbove = (drawer.T132_sx < drawer.T132_lc2_m*drawer.T132_sy + drawer.T132_lc2_C);
			}

			if(y3 == y1) {
				drawer.T132_lc3_horizontal = true;
				drawer.T132_lc3_vertical = false;
				drawer.T132_lc3_borderY = y3;
				drawer.T132_lc3_leftOrAbove = (drawer.T132_sy <= y3);
			} else if(x3 == x1) {
				drawer.T132_lc3_horizontal = false;
				drawer.T132_lc3_vertical = true;
				drawer.T132_lc3_borderX = x3;
				drawer.T132_lc3_leftOrAbove = (drawer.T132_sx <= x3);
			} else {
				drawer.T132_lc3_horizontal = false;
				drawer.T132_lc3_vertical = false;
				drawer.T132_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T132_lc3_C = x3 - drawer.T132_lc3_m * y3;
				drawer.T132_lc3_leftOrAbove = (drawer.T132_sx < drawer.T132_lc3_m*drawer.T132_sy + drawer.T132_lc3_C);
			}

			drawer.T132_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T132_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T132_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T132_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T132_initializedWithValidData = true;
		}

		t = triangles[133]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T133_r = t.r; drawer.T133_g = t.g; drawer.T133_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T133_initializedWithValidData = false;
		} else {

			drawer.T133_sx = (x1 + x2 + x3) / 3.0;
			drawer.T133_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T133_lc1_horizontal = true;
				drawer.T133_lc1_vertical = false;
				drawer.T133_lc1_borderY = y1;
				drawer.T133_lc1_leftOrAbove = (drawer.T133_sy <= y1);
			} else if(x1 == x2) {
				drawer.T133_lc1_horizontal = false;
				drawer.T133_lc1_vertical = true;
				drawer.T133_lc1_borderX = x1;
				drawer.T133_lc1_leftOrAbove = (drawer.T133_sx <= x1);
			} else {
				drawer.T133_lc1_horizontal = false;
				drawer.T133_lc1_vertical = false;
				drawer.T133_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T133_lc1_C = x1 - drawer.T133_lc1_m * y1;
				drawer.T133_lc1_leftOrAbove = (drawer.T133_sx < drawer.T133_lc1_m*drawer.T133_sy + drawer.T133_lc1_C);
			}

			if(y2 == y3) {
				drawer.T133_lc2_horizontal = true;
				drawer.T133_lc2_vertical = false;
				drawer.T133_lc2_borderY = y2;
				drawer.T133_lc2_leftOrAbove = (drawer.T133_sy <= y2);
			} else if(x2 == x3) {
				drawer.T133_lc2_horizontal = false;
				drawer.T133_lc2_vertical = true;
				drawer.T133_lc2_borderX = x2;
				drawer.T133_lc2_leftOrAbove = (drawer.T133_sx <= x2);
			} else {
				drawer.T133_lc2_horizontal = false;
				drawer.T133_lc2_vertical = false;
				drawer.T133_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T133_lc2_C = x2 - drawer.T133_lc2_m * y2;
				drawer.T133_lc2_leftOrAbove = (drawer.T133_sx < drawer.T133_lc2_m*drawer.T133_sy + drawer.T133_lc2_C);
			}

			if(y3 == y1) {
				drawer.T133_lc3_horizontal = true;
				drawer.T133_lc3_vertical = false;
				drawer.T133_lc3_borderY = y3;
				drawer.T133_lc3_leftOrAbove = (drawer.T133_sy <= y3);
			} else if(x3 == x1) {
				drawer.T133_lc3_horizontal = false;
				drawer.T133_lc3_vertical = true;
				drawer.T133_lc3_borderX = x3;
				drawer.T133_lc3_leftOrAbove = (drawer.T133_sx <= x3);
			} else {
				drawer.T133_lc3_horizontal = false;
				drawer.T133_lc3_vertical = false;
				drawer.T133_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T133_lc3_C = x3 - drawer.T133_lc3_m * y3;
				drawer.T133_lc3_leftOrAbove = (drawer.T133_sx < drawer.T133_lc3_m*drawer.T133_sy + drawer.T133_lc3_C);
			}

			drawer.T133_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T133_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T133_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T133_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T133_initializedWithValidData = true;
		}

		t = triangles[134]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T134_r = t.r; drawer.T134_g = t.g; drawer.T134_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T134_initializedWithValidData = false;
		} else {

			drawer.T134_sx = (x1 + x2 + x3) / 3.0;
			drawer.T134_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T134_lc1_horizontal = true;
				drawer.T134_lc1_vertical = false;
				drawer.T134_lc1_borderY = y1;
				drawer.T134_lc1_leftOrAbove = (drawer.T134_sy <= y1);
			} else if(x1 == x2) {
				drawer.T134_lc1_horizontal = false;
				drawer.T134_lc1_vertical = true;
				drawer.T134_lc1_borderX = x1;
				drawer.T134_lc1_leftOrAbove = (drawer.T134_sx <= x1);
			} else {
				drawer.T134_lc1_horizontal = false;
				drawer.T134_lc1_vertical = false;
				drawer.T134_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T134_lc1_C = x1 - drawer.T134_lc1_m * y1;
				drawer.T134_lc1_leftOrAbove = (drawer.T134_sx < drawer.T134_lc1_m*drawer.T134_sy + drawer.T134_lc1_C);
			}

			if(y2 == y3) {
				drawer.T134_lc2_horizontal = true;
				drawer.T134_lc2_vertical = false;
				drawer.T134_lc2_borderY = y2;
				drawer.T134_lc2_leftOrAbove = (drawer.T134_sy <= y2);
			} else if(x2 == x3) {
				drawer.T134_lc2_horizontal = false;
				drawer.T134_lc2_vertical = true;
				drawer.T134_lc2_borderX = x2;
				drawer.T134_lc2_leftOrAbove = (drawer.T134_sx <= x2);
			} else {
				drawer.T134_lc2_horizontal = false;
				drawer.T134_lc2_vertical = false;
				drawer.T134_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T134_lc2_C = x2 - drawer.T134_lc2_m * y2;
				drawer.T134_lc2_leftOrAbove = (drawer.T134_sx < drawer.T134_lc2_m*drawer.T134_sy + drawer.T134_lc2_C);
			}

			if(y3 == y1) {
				drawer.T134_lc3_horizontal = true;
				drawer.T134_lc3_vertical = false;
				drawer.T134_lc3_borderY = y3;
				drawer.T134_lc3_leftOrAbove = (drawer.T134_sy <= y3);
			} else if(x3 == x1) {
				drawer.T134_lc3_horizontal = false;
				drawer.T134_lc3_vertical = true;
				drawer.T134_lc3_borderX = x3;
				drawer.T134_lc3_leftOrAbove = (drawer.T134_sx <= x3);
			} else {
				drawer.T134_lc3_horizontal = false;
				drawer.T134_lc3_vertical = false;
				drawer.T134_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T134_lc3_C = x3 - drawer.T134_lc3_m * y3;
				drawer.T134_lc3_leftOrAbove = (drawer.T134_sx < drawer.T134_lc3_m*drawer.T134_sy + drawer.T134_lc3_C);
			}

			drawer.T134_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T134_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T134_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T134_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T134_initializedWithValidData = true;
		}

		t = triangles[135]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T135_r = t.r; drawer.T135_g = t.g; drawer.T135_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T135_initializedWithValidData = false;
		} else {

			drawer.T135_sx = (x1 + x2 + x3) / 3.0;
			drawer.T135_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T135_lc1_horizontal = true;
				drawer.T135_lc1_vertical = false;
				drawer.T135_lc1_borderY = y1;
				drawer.T135_lc1_leftOrAbove = (drawer.T135_sy <= y1);
			} else if(x1 == x2) {
				drawer.T135_lc1_horizontal = false;
				drawer.T135_lc1_vertical = true;
				drawer.T135_lc1_borderX = x1;
				drawer.T135_lc1_leftOrAbove = (drawer.T135_sx <= x1);
			} else {
				drawer.T135_lc1_horizontal = false;
				drawer.T135_lc1_vertical = false;
				drawer.T135_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T135_lc1_C = x1 - drawer.T135_lc1_m * y1;
				drawer.T135_lc1_leftOrAbove = (drawer.T135_sx < drawer.T135_lc1_m*drawer.T135_sy + drawer.T135_lc1_C);
			}

			if(y2 == y3) {
				drawer.T135_lc2_horizontal = true;
				drawer.T135_lc2_vertical = false;
				drawer.T135_lc2_borderY = y2;
				drawer.T135_lc2_leftOrAbove = (drawer.T135_sy <= y2);
			} else if(x2 == x3) {
				drawer.T135_lc2_horizontal = false;
				drawer.T135_lc2_vertical = true;
				drawer.T135_lc2_borderX = x2;
				drawer.T135_lc2_leftOrAbove = (drawer.T135_sx <= x2);
			} else {
				drawer.T135_lc2_horizontal = false;
				drawer.T135_lc2_vertical = false;
				drawer.T135_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T135_lc2_C = x2 - drawer.T135_lc2_m * y2;
				drawer.T135_lc2_leftOrAbove = (drawer.T135_sx < drawer.T135_lc2_m*drawer.T135_sy + drawer.T135_lc2_C);
			}

			if(y3 == y1) {
				drawer.T135_lc3_horizontal = true;
				drawer.T135_lc3_vertical = false;
				drawer.T135_lc3_borderY = y3;
				drawer.T135_lc3_leftOrAbove = (drawer.T135_sy <= y3);
			} else if(x3 == x1) {
				drawer.T135_lc3_horizontal = false;
				drawer.T135_lc3_vertical = true;
				drawer.T135_lc3_borderX = x3;
				drawer.T135_lc3_leftOrAbove = (drawer.T135_sx <= x3);
			} else {
				drawer.T135_lc3_horizontal = false;
				drawer.T135_lc3_vertical = false;
				drawer.T135_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T135_lc3_C = x3 - drawer.T135_lc3_m * y3;
				drawer.T135_lc3_leftOrAbove = (drawer.T135_sx < drawer.T135_lc3_m*drawer.T135_sy + drawer.T135_lc3_C);
			}

			drawer.T135_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T135_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T135_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T135_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T135_initializedWithValidData = true;
		}

		t = triangles[136]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T136_r = t.r; drawer.T136_g = t.g; drawer.T136_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T136_initializedWithValidData = false;
		} else {

			drawer.T136_sx = (x1 + x2 + x3) / 3.0;
			drawer.T136_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T136_lc1_horizontal = true;
				drawer.T136_lc1_vertical = false;
				drawer.T136_lc1_borderY = y1;
				drawer.T136_lc1_leftOrAbove = (drawer.T136_sy <= y1);
			} else if(x1 == x2) {
				drawer.T136_lc1_horizontal = false;
				drawer.T136_lc1_vertical = true;
				drawer.T136_lc1_borderX = x1;
				drawer.T136_lc1_leftOrAbove = (drawer.T136_sx <= x1);
			} else {
				drawer.T136_lc1_horizontal = false;
				drawer.T136_lc1_vertical = false;
				drawer.T136_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T136_lc1_C = x1 - drawer.T136_lc1_m * y1;
				drawer.T136_lc1_leftOrAbove = (drawer.T136_sx < drawer.T136_lc1_m*drawer.T136_sy + drawer.T136_lc1_C);
			}

			if(y2 == y3) {
				drawer.T136_lc2_horizontal = true;
				drawer.T136_lc2_vertical = false;
				drawer.T136_lc2_borderY = y2;
				drawer.T136_lc2_leftOrAbove = (drawer.T136_sy <= y2);
			} else if(x2 == x3) {
				drawer.T136_lc2_horizontal = false;
				drawer.T136_lc2_vertical = true;
				drawer.T136_lc2_borderX = x2;
				drawer.T136_lc2_leftOrAbove = (drawer.T136_sx <= x2);
			} else {
				drawer.T136_lc2_horizontal = false;
				drawer.T136_lc2_vertical = false;
				drawer.T136_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T136_lc2_C = x2 - drawer.T136_lc2_m * y2;
				drawer.T136_lc2_leftOrAbove = (drawer.T136_sx < drawer.T136_lc2_m*drawer.T136_sy + drawer.T136_lc2_C);
			}

			if(y3 == y1) {
				drawer.T136_lc3_horizontal = true;
				drawer.T136_lc3_vertical = false;
				drawer.T136_lc3_borderY = y3;
				drawer.T136_lc3_leftOrAbove = (drawer.T136_sy <= y3);
			} else if(x3 == x1) {
				drawer.T136_lc3_horizontal = false;
				drawer.T136_lc3_vertical = true;
				drawer.T136_lc3_borderX = x3;
				drawer.T136_lc3_leftOrAbove = (drawer.T136_sx <= x3);
			} else {
				drawer.T136_lc3_horizontal = false;
				drawer.T136_lc3_vertical = false;
				drawer.T136_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T136_lc3_C = x3 - drawer.T136_lc3_m * y3;
				drawer.T136_lc3_leftOrAbove = (drawer.T136_sx < drawer.T136_lc3_m*drawer.T136_sy + drawer.T136_lc3_C);
			}

			drawer.T136_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T136_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T136_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T136_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T136_initializedWithValidData = true;
		}

		t = triangles[137]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T137_r = t.r; drawer.T137_g = t.g; drawer.T137_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T137_initializedWithValidData = false;
		} else {

			drawer.T137_sx = (x1 + x2 + x3) / 3.0;
			drawer.T137_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T137_lc1_horizontal = true;
				drawer.T137_lc1_vertical = false;
				drawer.T137_lc1_borderY = y1;
				drawer.T137_lc1_leftOrAbove = (drawer.T137_sy <= y1);
			} else if(x1 == x2) {
				drawer.T137_lc1_horizontal = false;
				drawer.T137_lc1_vertical = true;
				drawer.T137_lc1_borderX = x1;
				drawer.T137_lc1_leftOrAbove = (drawer.T137_sx <= x1);
			} else {
				drawer.T137_lc1_horizontal = false;
				drawer.T137_lc1_vertical = false;
				drawer.T137_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T137_lc1_C = x1 - drawer.T137_lc1_m * y1;
				drawer.T137_lc1_leftOrAbove = (drawer.T137_sx < drawer.T137_lc1_m*drawer.T137_sy + drawer.T137_lc1_C);
			}

			if(y2 == y3) {
				drawer.T137_lc2_horizontal = true;
				drawer.T137_lc2_vertical = false;
				drawer.T137_lc2_borderY = y2;
				drawer.T137_lc2_leftOrAbove = (drawer.T137_sy <= y2);
			} else if(x2 == x3) {
				drawer.T137_lc2_horizontal = false;
				drawer.T137_lc2_vertical = true;
				drawer.T137_lc2_borderX = x2;
				drawer.T137_lc2_leftOrAbove = (drawer.T137_sx <= x2);
			} else {
				drawer.T137_lc2_horizontal = false;
				drawer.T137_lc2_vertical = false;
				drawer.T137_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T137_lc2_C = x2 - drawer.T137_lc2_m * y2;
				drawer.T137_lc2_leftOrAbove = (drawer.T137_sx < drawer.T137_lc2_m*drawer.T137_sy + drawer.T137_lc2_C);
			}

			if(y3 == y1) {
				drawer.T137_lc3_horizontal = true;
				drawer.T137_lc3_vertical = false;
				drawer.T137_lc3_borderY = y3;
				drawer.T137_lc3_leftOrAbove = (drawer.T137_sy <= y3);
			} else if(x3 == x1) {
				drawer.T137_lc3_horizontal = false;
				drawer.T137_lc3_vertical = true;
				drawer.T137_lc3_borderX = x3;
				drawer.T137_lc3_leftOrAbove = (drawer.T137_sx <= x3);
			} else {
				drawer.T137_lc3_horizontal = false;
				drawer.T137_lc3_vertical = false;
				drawer.T137_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T137_lc3_C = x3 - drawer.T137_lc3_m * y3;
				drawer.T137_lc3_leftOrAbove = (drawer.T137_sx < drawer.T137_lc3_m*drawer.T137_sy + drawer.T137_lc3_C);
			}

			drawer.T137_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T137_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T137_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T137_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T137_initializedWithValidData = true;
		}

		t = triangles[138]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T138_r = t.r; drawer.T138_g = t.g; drawer.T138_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T138_initializedWithValidData = false;
		} else {

			drawer.T138_sx = (x1 + x2 + x3) / 3.0;
			drawer.T138_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T138_lc1_horizontal = true;
				drawer.T138_lc1_vertical = false;
				drawer.T138_lc1_borderY = y1;
				drawer.T138_lc1_leftOrAbove = (drawer.T138_sy <= y1);
			} else if(x1 == x2) {
				drawer.T138_lc1_horizontal = false;
				drawer.T138_lc1_vertical = true;
				drawer.T138_lc1_borderX = x1;
				drawer.T138_lc1_leftOrAbove = (drawer.T138_sx <= x1);
			} else {
				drawer.T138_lc1_horizontal = false;
				drawer.T138_lc1_vertical = false;
				drawer.T138_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T138_lc1_C = x1 - drawer.T138_lc1_m * y1;
				drawer.T138_lc1_leftOrAbove = (drawer.T138_sx < drawer.T138_lc1_m*drawer.T138_sy + drawer.T138_lc1_C);
			}

			if(y2 == y3) {
				drawer.T138_lc2_horizontal = true;
				drawer.T138_lc2_vertical = false;
				drawer.T138_lc2_borderY = y2;
				drawer.T138_lc2_leftOrAbove = (drawer.T138_sy <= y2);
			} else if(x2 == x3) {
				drawer.T138_lc2_horizontal = false;
				drawer.T138_lc2_vertical = true;
				drawer.T138_lc2_borderX = x2;
				drawer.T138_lc2_leftOrAbove = (drawer.T138_sx <= x2);
			} else {
				drawer.T138_lc2_horizontal = false;
				drawer.T138_lc2_vertical = false;
				drawer.T138_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T138_lc2_C = x2 - drawer.T138_lc2_m * y2;
				drawer.T138_lc2_leftOrAbove = (drawer.T138_sx < drawer.T138_lc2_m*drawer.T138_sy + drawer.T138_lc2_C);
			}

			if(y3 == y1) {
				drawer.T138_lc3_horizontal = true;
				drawer.T138_lc3_vertical = false;
				drawer.T138_lc3_borderY = y3;
				drawer.T138_lc3_leftOrAbove = (drawer.T138_sy <= y3);
			} else if(x3 == x1) {
				drawer.T138_lc3_horizontal = false;
				drawer.T138_lc3_vertical = true;
				drawer.T138_lc3_borderX = x3;
				drawer.T138_lc3_leftOrAbove = (drawer.T138_sx <= x3);
			} else {
				drawer.T138_lc3_horizontal = false;
				drawer.T138_lc3_vertical = false;
				drawer.T138_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T138_lc3_C = x3 - drawer.T138_lc3_m * y3;
				drawer.T138_lc3_leftOrAbove = (drawer.T138_sx < drawer.T138_lc3_m*drawer.T138_sy + drawer.T138_lc3_C);
			}

			drawer.T138_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T138_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T138_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T138_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T138_initializedWithValidData = true;
		}

		t = triangles[139]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T139_r = t.r; drawer.T139_g = t.g; drawer.T139_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T139_initializedWithValidData = false;
		} else {

			drawer.T139_sx = (x1 + x2 + x3) / 3.0;
			drawer.T139_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T139_lc1_horizontal = true;
				drawer.T139_lc1_vertical = false;
				drawer.T139_lc1_borderY = y1;
				drawer.T139_lc1_leftOrAbove = (drawer.T139_sy <= y1);
			} else if(x1 == x2) {
				drawer.T139_lc1_horizontal = false;
				drawer.T139_lc1_vertical = true;
				drawer.T139_lc1_borderX = x1;
				drawer.T139_lc1_leftOrAbove = (drawer.T139_sx <= x1);
			} else {
				drawer.T139_lc1_horizontal = false;
				drawer.T139_lc1_vertical = false;
				drawer.T139_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T139_lc1_C = x1 - drawer.T139_lc1_m * y1;
				drawer.T139_lc1_leftOrAbove = (drawer.T139_sx < drawer.T139_lc1_m*drawer.T139_sy + drawer.T139_lc1_C);
			}

			if(y2 == y3) {
				drawer.T139_lc2_horizontal = true;
				drawer.T139_lc2_vertical = false;
				drawer.T139_lc2_borderY = y2;
				drawer.T139_lc2_leftOrAbove = (drawer.T139_sy <= y2);
			} else if(x2 == x3) {
				drawer.T139_lc2_horizontal = false;
				drawer.T139_lc2_vertical = true;
				drawer.T139_lc2_borderX = x2;
				drawer.T139_lc2_leftOrAbove = (drawer.T139_sx <= x2);
			} else {
				drawer.T139_lc2_horizontal = false;
				drawer.T139_lc2_vertical = false;
				drawer.T139_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T139_lc2_C = x2 - drawer.T139_lc2_m * y2;
				drawer.T139_lc2_leftOrAbove = (drawer.T139_sx < drawer.T139_lc2_m*drawer.T139_sy + drawer.T139_lc2_C);
			}

			if(y3 == y1) {
				drawer.T139_lc3_horizontal = true;
				drawer.T139_lc3_vertical = false;
				drawer.T139_lc3_borderY = y3;
				drawer.T139_lc3_leftOrAbove = (drawer.T139_sy <= y3);
			} else if(x3 == x1) {
				drawer.T139_lc3_horizontal = false;
				drawer.T139_lc3_vertical = true;
				drawer.T139_lc3_borderX = x3;
				drawer.T139_lc3_leftOrAbove = (drawer.T139_sx <= x3);
			} else {
				drawer.T139_lc3_horizontal = false;
				drawer.T139_lc3_vertical = false;
				drawer.T139_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T139_lc3_C = x3 - drawer.T139_lc3_m * y3;
				drawer.T139_lc3_leftOrAbove = (drawer.T139_sx < drawer.T139_lc3_m*drawer.T139_sy + drawer.T139_lc3_C);
			}

			drawer.T139_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T139_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T139_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T139_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T139_initializedWithValidData = true;
		}

		t = triangles[140]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T140_r = t.r; drawer.T140_g = t.g; drawer.T140_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T140_initializedWithValidData = false;
		} else {

			drawer.T140_sx = (x1 + x2 + x3) / 3.0;
			drawer.T140_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T140_lc1_horizontal = true;
				drawer.T140_lc1_vertical = false;
				drawer.T140_lc1_borderY = y1;
				drawer.T140_lc1_leftOrAbove = (drawer.T140_sy <= y1);
			} else if(x1 == x2) {
				drawer.T140_lc1_horizontal = false;
				drawer.T140_lc1_vertical = true;
				drawer.T140_lc1_borderX = x1;
				drawer.T140_lc1_leftOrAbove = (drawer.T140_sx <= x1);
			} else {
				drawer.T140_lc1_horizontal = false;
				drawer.T140_lc1_vertical = false;
				drawer.T140_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T140_lc1_C = x1 - drawer.T140_lc1_m * y1;
				drawer.T140_lc1_leftOrAbove = (drawer.T140_sx < drawer.T140_lc1_m*drawer.T140_sy + drawer.T140_lc1_C);
			}

			if(y2 == y3) {
				drawer.T140_lc2_horizontal = true;
				drawer.T140_lc2_vertical = false;
				drawer.T140_lc2_borderY = y2;
				drawer.T140_lc2_leftOrAbove = (drawer.T140_sy <= y2);
			} else if(x2 == x3) {
				drawer.T140_lc2_horizontal = false;
				drawer.T140_lc2_vertical = true;
				drawer.T140_lc2_borderX = x2;
				drawer.T140_lc2_leftOrAbove = (drawer.T140_sx <= x2);
			} else {
				drawer.T140_lc2_horizontal = false;
				drawer.T140_lc2_vertical = false;
				drawer.T140_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T140_lc2_C = x2 - drawer.T140_lc2_m * y2;
				drawer.T140_lc2_leftOrAbove = (drawer.T140_sx < drawer.T140_lc2_m*drawer.T140_sy + drawer.T140_lc2_C);
			}

			if(y3 == y1) {
				drawer.T140_lc3_horizontal = true;
				drawer.T140_lc3_vertical = false;
				drawer.T140_lc3_borderY = y3;
				drawer.T140_lc3_leftOrAbove = (drawer.T140_sy <= y3);
			} else if(x3 == x1) {
				drawer.T140_lc3_horizontal = false;
				drawer.T140_lc3_vertical = true;
				drawer.T140_lc3_borderX = x3;
				drawer.T140_lc3_leftOrAbove = (drawer.T140_sx <= x3);
			} else {
				drawer.T140_lc3_horizontal = false;
				drawer.T140_lc3_vertical = false;
				drawer.T140_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T140_lc3_C = x3 - drawer.T140_lc3_m * y3;
				drawer.T140_lc3_leftOrAbove = (drawer.T140_sx < drawer.T140_lc3_m*drawer.T140_sy + drawer.T140_lc3_C);
			}

			drawer.T140_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T140_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T140_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T140_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T140_initializedWithValidData = true;
		}

		t = triangles[141]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T141_r = t.r; drawer.T141_g = t.g; drawer.T141_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T141_initializedWithValidData = false;
		} else {

			drawer.T141_sx = (x1 + x2 + x3) / 3.0;
			drawer.T141_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T141_lc1_horizontal = true;
				drawer.T141_lc1_vertical = false;
				drawer.T141_lc1_borderY = y1;
				drawer.T141_lc1_leftOrAbove = (drawer.T141_sy <= y1);
			} else if(x1 == x2) {
				drawer.T141_lc1_horizontal = false;
				drawer.T141_lc1_vertical = true;
				drawer.T141_lc1_borderX = x1;
				drawer.T141_lc1_leftOrAbove = (drawer.T141_sx <= x1);
			} else {
				drawer.T141_lc1_horizontal = false;
				drawer.T141_lc1_vertical = false;
				drawer.T141_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T141_lc1_C = x1 - drawer.T141_lc1_m * y1;
				drawer.T141_lc1_leftOrAbove = (drawer.T141_sx < drawer.T141_lc1_m*drawer.T141_sy + drawer.T141_lc1_C);
			}

			if(y2 == y3) {
				drawer.T141_lc2_horizontal = true;
				drawer.T141_lc2_vertical = false;
				drawer.T141_lc2_borderY = y2;
				drawer.T141_lc2_leftOrAbove = (drawer.T141_sy <= y2);
			} else if(x2 == x3) {
				drawer.T141_lc2_horizontal = false;
				drawer.T141_lc2_vertical = true;
				drawer.T141_lc2_borderX = x2;
				drawer.T141_lc2_leftOrAbove = (drawer.T141_sx <= x2);
			} else {
				drawer.T141_lc2_horizontal = false;
				drawer.T141_lc2_vertical = false;
				drawer.T141_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T141_lc2_C = x2 - drawer.T141_lc2_m * y2;
				drawer.T141_lc2_leftOrAbove = (drawer.T141_sx < drawer.T141_lc2_m*drawer.T141_sy + drawer.T141_lc2_C);
			}

			if(y3 == y1) {
				drawer.T141_lc3_horizontal = true;
				drawer.T141_lc3_vertical = false;
				drawer.T141_lc3_borderY = y3;
				drawer.T141_lc3_leftOrAbove = (drawer.T141_sy <= y3);
			} else if(x3 == x1) {
				drawer.T141_lc3_horizontal = false;
				drawer.T141_lc3_vertical = true;
				drawer.T141_lc3_borderX = x3;
				drawer.T141_lc3_leftOrAbove = (drawer.T141_sx <= x3);
			} else {
				drawer.T141_lc3_horizontal = false;
				drawer.T141_lc3_vertical = false;
				drawer.T141_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T141_lc3_C = x3 - drawer.T141_lc3_m * y3;
				drawer.T141_lc3_leftOrAbove = (drawer.T141_sx < drawer.T141_lc3_m*drawer.T141_sy + drawer.T141_lc3_C);
			}

			drawer.T141_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T141_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T141_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T141_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T141_initializedWithValidData = true;
		}

		t = triangles[142]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T142_r = t.r; drawer.T142_g = t.g; drawer.T142_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T142_initializedWithValidData = false;
		} else {

			drawer.T142_sx = (x1 + x2 + x3) / 3.0;
			drawer.T142_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T142_lc1_horizontal = true;
				drawer.T142_lc1_vertical = false;
				drawer.T142_lc1_borderY = y1;
				drawer.T142_lc1_leftOrAbove = (drawer.T142_sy <= y1);
			} else if(x1 == x2) {
				drawer.T142_lc1_horizontal = false;
				drawer.T142_lc1_vertical = true;
				drawer.T142_lc1_borderX = x1;
				drawer.T142_lc1_leftOrAbove = (drawer.T142_sx <= x1);
			} else {
				drawer.T142_lc1_horizontal = false;
				drawer.T142_lc1_vertical = false;
				drawer.T142_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T142_lc1_C = x1 - drawer.T142_lc1_m * y1;
				drawer.T142_lc1_leftOrAbove = (drawer.T142_sx < drawer.T142_lc1_m*drawer.T142_sy + drawer.T142_lc1_C);
			}

			if(y2 == y3) {
				drawer.T142_lc2_horizontal = true;
				drawer.T142_lc2_vertical = false;
				drawer.T142_lc2_borderY = y2;
				drawer.T142_lc2_leftOrAbove = (drawer.T142_sy <= y2);
			} else if(x2 == x3) {
				drawer.T142_lc2_horizontal = false;
				drawer.T142_lc2_vertical = true;
				drawer.T142_lc2_borderX = x2;
				drawer.T142_lc2_leftOrAbove = (drawer.T142_sx <= x2);
			} else {
				drawer.T142_lc2_horizontal = false;
				drawer.T142_lc2_vertical = false;
				drawer.T142_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T142_lc2_C = x2 - drawer.T142_lc2_m * y2;
				drawer.T142_lc2_leftOrAbove = (drawer.T142_sx < drawer.T142_lc2_m*drawer.T142_sy + drawer.T142_lc2_C);
			}

			if(y3 == y1) {
				drawer.T142_lc3_horizontal = true;
				drawer.T142_lc3_vertical = false;
				drawer.T142_lc3_borderY = y3;
				drawer.T142_lc3_leftOrAbove = (drawer.T142_sy <= y3);
			} else if(x3 == x1) {
				drawer.T142_lc3_horizontal = false;
				drawer.T142_lc3_vertical = true;
				drawer.T142_lc3_borderX = x3;
				drawer.T142_lc3_leftOrAbove = (drawer.T142_sx <= x3);
			} else {
				drawer.T142_lc3_horizontal = false;
				drawer.T142_lc3_vertical = false;
				drawer.T142_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T142_lc3_C = x3 - drawer.T142_lc3_m * y3;
				drawer.T142_lc3_leftOrAbove = (drawer.T142_sx < drawer.T142_lc3_m*drawer.T142_sy + drawer.T142_lc3_C);
			}

			drawer.T142_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T142_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T142_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T142_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T142_initializedWithValidData = true;
		}

		t = triangles[143]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T143_r = t.r; drawer.T143_g = t.g; drawer.T143_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T143_initializedWithValidData = false;
		} else {

			drawer.T143_sx = (x1 + x2 + x3) / 3.0;
			drawer.T143_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T143_lc1_horizontal = true;
				drawer.T143_lc1_vertical = false;
				drawer.T143_lc1_borderY = y1;
				drawer.T143_lc1_leftOrAbove = (drawer.T143_sy <= y1);
			} else if(x1 == x2) {
				drawer.T143_lc1_horizontal = false;
				drawer.T143_lc1_vertical = true;
				drawer.T143_lc1_borderX = x1;
				drawer.T143_lc1_leftOrAbove = (drawer.T143_sx <= x1);
			} else {
				drawer.T143_lc1_horizontal = false;
				drawer.T143_lc1_vertical = false;
				drawer.T143_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T143_lc1_C = x1 - drawer.T143_lc1_m * y1;
				drawer.T143_lc1_leftOrAbove = (drawer.T143_sx < drawer.T143_lc1_m*drawer.T143_sy + drawer.T143_lc1_C);
			}

			if(y2 == y3) {
				drawer.T143_lc2_horizontal = true;
				drawer.T143_lc2_vertical = false;
				drawer.T143_lc2_borderY = y2;
				drawer.T143_lc2_leftOrAbove = (drawer.T143_sy <= y2);
			} else if(x2 == x3) {
				drawer.T143_lc2_horizontal = false;
				drawer.T143_lc2_vertical = true;
				drawer.T143_lc2_borderX = x2;
				drawer.T143_lc2_leftOrAbove = (drawer.T143_sx <= x2);
			} else {
				drawer.T143_lc2_horizontal = false;
				drawer.T143_lc2_vertical = false;
				drawer.T143_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T143_lc2_C = x2 - drawer.T143_lc2_m * y2;
				drawer.T143_lc2_leftOrAbove = (drawer.T143_sx < drawer.T143_lc2_m*drawer.T143_sy + drawer.T143_lc2_C);
			}

			if(y3 == y1) {
				drawer.T143_lc3_horizontal = true;
				drawer.T143_lc3_vertical = false;
				drawer.T143_lc3_borderY = y3;
				drawer.T143_lc3_leftOrAbove = (drawer.T143_sy <= y3);
			} else if(x3 == x1) {
				drawer.T143_lc3_horizontal = false;
				drawer.T143_lc3_vertical = true;
				drawer.T143_lc3_borderX = x3;
				drawer.T143_lc3_leftOrAbove = (drawer.T143_sx <= x3);
			} else {
				drawer.T143_lc3_horizontal = false;
				drawer.T143_lc3_vertical = false;
				drawer.T143_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T143_lc3_C = x3 - drawer.T143_lc3_m * y3;
				drawer.T143_lc3_leftOrAbove = (drawer.T143_sx < drawer.T143_lc3_m*drawer.T143_sy + drawer.T143_lc3_C);
			}

			drawer.T143_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T143_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T143_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T143_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T143_initializedWithValidData = true;
		}

		t = triangles[144]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T144_r = t.r; drawer.T144_g = t.g; drawer.T144_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T144_initializedWithValidData = false;
		} else {

			drawer.T144_sx = (x1 + x2 + x3) / 3.0;
			drawer.T144_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T144_lc1_horizontal = true;
				drawer.T144_lc1_vertical = false;
				drawer.T144_lc1_borderY = y1;
				drawer.T144_lc1_leftOrAbove = (drawer.T144_sy <= y1);
			} else if(x1 == x2) {
				drawer.T144_lc1_horizontal = false;
				drawer.T144_lc1_vertical = true;
				drawer.T144_lc1_borderX = x1;
				drawer.T144_lc1_leftOrAbove = (drawer.T144_sx <= x1);
			} else {
				drawer.T144_lc1_horizontal = false;
				drawer.T144_lc1_vertical = false;
				drawer.T144_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T144_lc1_C = x1 - drawer.T144_lc1_m * y1;
				drawer.T144_lc1_leftOrAbove = (drawer.T144_sx < drawer.T144_lc1_m*drawer.T144_sy + drawer.T144_lc1_C);
			}

			if(y2 == y3) {
				drawer.T144_lc2_horizontal = true;
				drawer.T144_lc2_vertical = false;
				drawer.T144_lc2_borderY = y2;
				drawer.T144_lc2_leftOrAbove = (drawer.T144_sy <= y2);
			} else if(x2 == x3) {
				drawer.T144_lc2_horizontal = false;
				drawer.T144_lc2_vertical = true;
				drawer.T144_lc2_borderX = x2;
				drawer.T144_lc2_leftOrAbove = (drawer.T144_sx <= x2);
			} else {
				drawer.T144_lc2_horizontal = false;
				drawer.T144_lc2_vertical = false;
				drawer.T144_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T144_lc2_C = x2 - drawer.T144_lc2_m * y2;
				drawer.T144_lc2_leftOrAbove = (drawer.T144_sx < drawer.T144_lc2_m*drawer.T144_sy + drawer.T144_lc2_C);
			}

			if(y3 == y1) {
				drawer.T144_lc3_horizontal = true;
				drawer.T144_lc3_vertical = false;
				drawer.T144_lc3_borderY = y3;
				drawer.T144_lc3_leftOrAbove = (drawer.T144_sy <= y3);
			} else if(x3 == x1) {
				drawer.T144_lc3_horizontal = false;
				drawer.T144_lc3_vertical = true;
				drawer.T144_lc3_borderX = x3;
				drawer.T144_lc3_leftOrAbove = (drawer.T144_sx <= x3);
			} else {
				drawer.T144_lc3_horizontal = false;
				drawer.T144_lc3_vertical = false;
				drawer.T144_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T144_lc3_C = x3 - drawer.T144_lc3_m * y3;
				drawer.T144_lc3_leftOrAbove = (drawer.T144_sx < drawer.T144_lc3_m*drawer.T144_sy + drawer.T144_lc3_C);
			}

			drawer.T144_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T144_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T144_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T144_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T144_initializedWithValidData = true;
		}

		t = triangles[145]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T145_r = t.r; drawer.T145_g = t.g; drawer.T145_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T145_initializedWithValidData = false;
		} else {

			drawer.T145_sx = (x1 + x2 + x3) / 3.0;
			drawer.T145_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T145_lc1_horizontal = true;
				drawer.T145_lc1_vertical = false;
				drawer.T145_lc1_borderY = y1;
				drawer.T145_lc1_leftOrAbove = (drawer.T145_sy <= y1);
			} else if(x1 == x2) {
				drawer.T145_lc1_horizontal = false;
				drawer.T145_lc1_vertical = true;
				drawer.T145_lc1_borderX = x1;
				drawer.T145_lc1_leftOrAbove = (drawer.T145_sx <= x1);
			} else {
				drawer.T145_lc1_horizontal = false;
				drawer.T145_lc1_vertical = false;
				drawer.T145_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T145_lc1_C = x1 - drawer.T145_lc1_m * y1;
				drawer.T145_lc1_leftOrAbove = (drawer.T145_sx < drawer.T145_lc1_m*drawer.T145_sy + drawer.T145_lc1_C);
			}

			if(y2 == y3) {
				drawer.T145_lc2_horizontal = true;
				drawer.T145_lc2_vertical = false;
				drawer.T145_lc2_borderY = y2;
				drawer.T145_lc2_leftOrAbove = (drawer.T145_sy <= y2);
			} else if(x2 == x3) {
				drawer.T145_lc2_horizontal = false;
				drawer.T145_lc2_vertical = true;
				drawer.T145_lc2_borderX = x2;
				drawer.T145_lc2_leftOrAbove = (drawer.T145_sx <= x2);
			} else {
				drawer.T145_lc2_horizontal = false;
				drawer.T145_lc2_vertical = false;
				drawer.T145_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T145_lc2_C = x2 - drawer.T145_lc2_m * y2;
				drawer.T145_lc2_leftOrAbove = (drawer.T145_sx < drawer.T145_lc2_m*drawer.T145_sy + drawer.T145_lc2_C);
			}

			if(y3 == y1) {
				drawer.T145_lc3_horizontal = true;
				drawer.T145_lc3_vertical = false;
				drawer.T145_lc3_borderY = y3;
				drawer.T145_lc3_leftOrAbove = (drawer.T145_sy <= y3);
			} else if(x3 == x1) {
				drawer.T145_lc3_horizontal = false;
				drawer.T145_lc3_vertical = true;
				drawer.T145_lc3_borderX = x3;
				drawer.T145_lc3_leftOrAbove = (drawer.T145_sx <= x3);
			} else {
				drawer.T145_lc3_horizontal = false;
				drawer.T145_lc3_vertical = false;
				drawer.T145_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T145_lc3_C = x3 - drawer.T145_lc3_m * y3;
				drawer.T145_lc3_leftOrAbove = (drawer.T145_sx < drawer.T145_lc3_m*drawer.T145_sy + drawer.T145_lc3_C);
			}

			drawer.T145_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T145_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T145_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T145_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T145_initializedWithValidData = true;
		}

		t = triangles[146]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T146_r = t.r; drawer.T146_g = t.g; drawer.T146_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T146_initializedWithValidData = false;
		} else {

			drawer.T146_sx = (x1 + x2 + x3) / 3.0;
			drawer.T146_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T146_lc1_horizontal = true;
				drawer.T146_lc1_vertical = false;
				drawer.T146_lc1_borderY = y1;
				drawer.T146_lc1_leftOrAbove = (drawer.T146_sy <= y1);
			} else if(x1 == x2) {
				drawer.T146_lc1_horizontal = false;
				drawer.T146_lc1_vertical = true;
				drawer.T146_lc1_borderX = x1;
				drawer.T146_lc1_leftOrAbove = (drawer.T146_sx <= x1);
			} else {
				drawer.T146_lc1_horizontal = false;
				drawer.T146_lc1_vertical = false;
				drawer.T146_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T146_lc1_C = x1 - drawer.T146_lc1_m * y1;
				drawer.T146_lc1_leftOrAbove = (drawer.T146_sx < drawer.T146_lc1_m*drawer.T146_sy + drawer.T146_lc1_C);
			}

			if(y2 == y3) {
				drawer.T146_lc2_horizontal = true;
				drawer.T146_lc2_vertical = false;
				drawer.T146_lc2_borderY = y2;
				drawer.T146_lc2_leftOrAbove = (drawer.T146_sy <= y2);
			} else if(x2 == x3) {
				drawer.T146_lc2_horizontal = false;
				drawer.T146_lc2_vertical = true;
				drawer.T146_lc2_borderX = x2;
				drawer.T146_lc2_leftOrAbove = (drawer.T146_sx <= x2);
			} else {
				drawer.T146_lc2_horizontal = false;
				drawer.T146_lc2_vertical = false;
				drawer.T146_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T146_lc2_C = x2 - drawer.T146_lc2_m * y2;
				drawer.T146_lc2_leftOrAbove = (drawer.T146_sx < drawer.T146_lc2_m*drawer.T146_sy + drawer.T146_lc2_C);
			}

			if(y3 == y1) {
				drawer.T146_lc3_horizontal = true;
				drawer.T146_lc3_vertical = false;
				drawer.T146_lc3_borderY = y3;
				drawer.T146_lc3_leftOrAbove = (drawer.T146_sy <= y3);
			} else if(x3 == x1) {
				drawer.T146_lc3_horizontal = false;
				drawer.T146_lc3_vertical = true;
				drawer.T146_lc3_borderX = x3;
				drawer.T146_lc3_leftOrAbove = (drawer.T146_sx <= x3);
			} else {
				drawer.T146_lc3_horizontal = false;
				drawer.T146_lc3_vertical = false;
				drawer.T146_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T146_lc3_C = x3 - drawer.T146_lc3_m * y3;
				drawer.T146_lc3_leftOrAbove = (drawer.T146_sx < drawer.T146_lc3_m*drawer.T146_sy + drawer.T146_lc3_C);
			}

			drawer.T146_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T146_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T146_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T146_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T146_initializedWithValidData = true;
		}

		t = triangles[147]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T147_r = t.r; drawer.T147_g = t.g; drawer.T147_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T147_initializedWithValidData = false;
		} else {

			drawer.T147_sx = (x1 + x2 + x3) / 3.0;
			drawer.T147_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T147_lc1_horizontal = true;
				drawer.T147_lc1_vertical = false;
				drawer.T147_lc1_borderY = y1;
				drawer.T147_lc1_leftOrAbove = (drawer.T147_sy <= y1);
			} else if(x1 == x2) {
				drawer.T147_lc1_horizontal = false;
				drawer.T147_lc1_vertical = true;
				drawer.T147_lc1_borderX = x1;
				drawer.T147_lc1_leftOrAbove = (drawer.T147_sx <= x1);
			} else {
				drawer.T147_lc1_horizontal = false;
				drawer.T147_lc1_vertical = false;
				drawer.T147_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T147_lc1_C = x1 - drawer.T147_lc1_m * y1;
				drawer.T147_lc1_leftOrAbove = (drawer.T147_sx < drawer.T147_lc1_m*drawer.T147_sy + drawer.T147_lc1_C);
			}

			if(y2 == y3) {
				drawer.T147_lc2_horizontal = true;
				drawer.T147_lc2_vertical = false;
				drawer.T147_lc2_borderY = y2;
				drawer.T147_lc2_leftOrAbove = (drawer.T147_sy <= y2);
			} else if(x2 == x3) {
				drawer.T147_lc2_horizontal = false;
				drawer.T147_lc2_vertical = true;
				drawer.T147_lc2_borderX = x2;
				drawer.T147_lc2_leftOrAbove = (drawer.T147_sx <= x2);
			} else {
				drawer.T147_lc2_horizontal = false;
				drawer.T147_lc2_vertical = false;
				drawer.T147_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T147_lc2_C = x2 - drawer.T147_lc2_m * y2;
				drawer.T147_lc2_leftOrAbove = (drawer.T147_sx < drawer.T147_lc2_m*drawer.T147_sy + drawer.T147_lc2_C);
			}

			if(y3 == y1) {
				drawer.T147_lc3_horizontal = true;
				drawer.T147_lc3_vertical = false;
				drawer.T147_lc3_borderY = y3;
				drawer.T147_lc3_leftOrAbove = (drawer.T147_sy <= y3);
			} else if(x3 == x1) {
				drawer.T147_lc3_horizontal = false;
				drawer.T147_lc3_vertical = true;
				drawer.T147_lc3_borderX = x3;
				drawer.T147_lc3_leftOrAbove = (drawer.T147_sx <= x3);
			} else {
				drawer.T147_lc3_horizontal = false;
				drawer.T147_lc3_vertical = false;
				drawer.T147_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T147_lc3_C = x3 - drawer.T147_lc3_m * y3;
				drawer.T147_lc3_leftOrAbove = (drawer.T147_sx < drawer.T147_lc3_m*drawer.T147_sy + drawer.T147_lc3_C);
			}

			drawer.T147_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T147_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T147_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T147_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T147_initializedWithValidData = true;
		}

		t = triangles[148]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T148_r = t.r; drawer.T148_g = t.g; drawer.T148_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T148_initializedWithValidData = false;
		} else {

			drawer.T148_sx = (x1 + x2 + x3) / 3.0;
			drawer.T148_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T148_lc1_horizontal = true;
				drawer.T148_lc1_vertical = false;
				drawer.T148_lc1_borderY = y1;
				drawer.T148_lc1_leftOrAbove = (drawer.T148_sy <= y1);
			} else if(x1 == x2) {
				drawer.T148_lc1_horizontal = false;
				drawer.T148_lc1_vertical = true;
				drawer.T148_lc1_borderX = x1;
				drawer.T148_lc1_leftOrAbove = (drawer.T148_sx <= x1);
			} else {
				drawer.T148_lc1_horizontal = false;
				drawer.T148_lc1_vertical = false;
				drawer.T148_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T148_lc1_C = x1 - drawer.T148_lc1_m * y1;
				drawer.T148_lc1_leftOrAbove = (drawer.T148_sx < drawer.T148_lc1_m*drawer.T148_sy + drawer.T148_lc1_C);
			}

			if(y2 == y3) {
				drawer.T148_lc2_horizontal = true;
				drawer.T148_lc2_vertical = false;
				drawer.T148_lc2_borderY = y2;
				drawer.T148_lc2_leftOrAbove = (drawer.T148_sy <= y2);
			} else if(x2 == x3) {
				drawer.T148_lc2_horizontal = false;
				drawer.T148_lc2_vertical = true;
				drawer.T148_lc2_borderX = x2;
				drawer.T148_lc2_leftOrAbove = (drawer.T148_sx <= x2);
			} else {
				drawer.T148_lc2_horizontal = false;
				drawer.T148_lc2_vertical = false;
				drawer.T148_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T148_lc2_C = x2 - drawer.T148_lc2_m * y2;
				drawer.T148_lc2_leftOrAbove = (drawer.T148_sx < drawer.T148_lc2_m*drawer.T148_sy + drawer.T148_lc2_C);
			}

			if(y3 == y1) {
				drawer.T148_lc3_horizontal = true;
				drawer.T148_lc3_vertical = false;
				drawer.T148_lc3_borderY = y3;
				drawer.T148_lc3_leftOrAbove = (drawer.T148_sy <= y3);
			} else if(x3 == x1) {
				drawer.T148_lc3_horizontal = false;
				drawer.T148_lc3_vertical = true;
				drawer.T148_lc3_borderX = x3;
				drawer.T148_lc3_leftOrAbove = (drawer.T148_sx <= x3);
			} else {
				drawer.T148_lc3_horizontal = false;
				drawer.T148_lc3_vertical = false;
				drawer.T148_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T148_lc3_C = x3 - drawer.T148_lc3_m * y3;
				drawer.T148_lc3_leftOrAbove = (drawer.T148_sx < drawer.T148_lc3_m*drawer.T148_sy + drawer.T148_lc3_C);
			}

			drawer.T148_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T148_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T148_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T148_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T148_initializedWithValidData = true;
		}

		t = triangles[149]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T149_r = t.r; drawer.T149_g = t.g; drawer.T149_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T149_initializedWithValidData = false;
		} else {

			drawer.T149_sx = (x1 + x2 + x3) / 3.0;
			drawer.T149_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T149_lc1_horizontal = true;
				drawer.T149_lc1_vertical = false;
				drawer.T149_lc1_borderY = y1;
				drawer.T149_lc1_leftOrAbove = (drawer.T149_sy <= y1);
			} else if(x1 == x2) {
				drawer.T149_lc1_horizontal = false;
				drawer.T149_lc1_vertical = true;
				drawer.T149_lc1_borderX = x1;
				drawer.T149_lc1_leftOrAbove = (drawer.T149_sx <= x1);
			} else {
				drawer.T149_lc1_horizontal = false;
				drawer.T149_lc1_vertical = false;
				drawer.T149_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T149_lc1_C = x1 - drawer.T149_lc1_m * y1;
				drawer.T149_lc1_leftOrAbove = (drawer.T149_sx < drawer.T149_lc1_m*drawer.T149_sy + drawer.T149_lc1_C);
			}

			if(y2 == y3) {
				drawer.T149_lc2_horizontal = true;
				drawer.T149_lc2_vertical = false;
				drawer.T149_lc2_borderY = y2;
				drawer.T149_lc2_leftOrAbove = (drawer.T149_sy <= y2);
			} else if(x2 == x3) {
				drawer.T149_lc2_horizontal = false;
				drawer.T149_lc2_vertical = true;
				drawer.T149_lc2_borderX = x2;
				drawer.T149_lc2_leftOrAbove = (drawer.T149_sx <= x2);
			} else {
				drawer.T149_lc2_horizontal = false;
				drawer.T149_lc2_vertical = false;
				drawer.T149_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T149_lc2_C = x2 - drawer.T149_lc2_m * y2;
				drawer.T149_lc2_leftOrAbove = (drawer.T149_sx < drawer.T149_lc2_m*drawer.T149_sy + drawer.T149_lc2_C);
			}

			if(y3 == y1) {
				drawer.T149_lc3_horizontal = true;
				drawer.T149_lc3_vertical = false;
				drawer.T149_lc3_borderY = y3;
				drawer.T149_lc3_leftOrAbove = (drawer.T149_sy <= y3);
			} else if(x3 == x1) {
				drawer.T149_lc3_horizontal = false;
				drawer.T149_lc3_vertical = true;
				drawer.T149_lc3_borderX = x3;
				drawer.T149_lc3_leftOrAbove = (drawer.T149_sx <= x3);
			} else {
				drawer.T149_lc3_horizontal = false;
				drawer.T149_lc3_vertical = false;
				drawer.T149_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T149_lc3_C = x3 - drawer.T149_lc3_m * y3;
				drawer.T149_lc3_leftOrAbove = (drawer.T149_sx < drawer.T149_lc3_m*drawer.T149_sy + drawer.T149_lc3_C);
			}

			drawer.T149_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T149_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T149_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T149_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T149_initializedWithValidData = true;
		}
	}

	public void loadTriangles6(SingleTriangle[] triangles) {
		int x1, y1, x2, y2, x3, y3;
		SingleTriangle t;

		t = triangles[150]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T150_r = t.r; drawer.T150_g = t.g; drawer.T150_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T150_initializedWithValidData = false;
		} else {

			drawer.T150_sx = (x1 + x2 + x3) / 3.0;
			drawer.T150_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T150_lc1_horizontal = true;
				drawer.T150_lc1_vertical = false;
				drawer.T150_lc1_borderY = y1;
				drawer.T150_lc1_leftOrAbove = (drawer.T150_sy <= y1);
			} else if(x1 == x2) {
				drawer.T150_lc1_horizontal = false;
				drawer.T150_lc1_vertical = true;
				drawer.T150_lc1_borderX = x1;
				drawer.T150_lc1_leftOrAbove = (drawer.T150_sx <= x1);
			} else {
				drawer.T150_lc1_horizontal = false;
				drawer.T150_lc1_vertical = false;
				drawer.T150_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T150_lc1_C = x1 - drawer.T150_lc1_m * y1;
				drawer.T150_lc1_leftOrAbove = (drawer.T150_sx < drawer.T150_lc1_m*drawer.T150_sy + drawer.T150_lc1_C);
			}

			if(y2 == y3) {
				drawer.T150_lc2_horizontal = true;
				drawer.T150_lc2_vertical = false;
				drawer.T150_lc2_borderY = y2;
				drawer.T150_lc2_leftOrAbove = (drawer.T150_sy <= y2);
			} else if(x2 == x3) {
				drawer.T150_lc2_horizontal = false;
				drawer.T150_lc2_vertical = true;
				drawer.T150_lc2_borderX = x2;
				drawer.T150_lc2_leftOrAbove = (drawer.T150_sx <= x2);
			} else {
				drawer.T150_lc2_horizontal = false;
				drawer.T150_lc2_vertical = false;
				drawer.T150_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T150_lc2_C = x2 - drawer.T150_lc2_m * y2;
				drawer.T150_lc2_leftOrAbove = (drawer.T150_sx < drawer.T150_lc2_m*drawer.T150_sy + drawer.T150_lc2_C);
			}

			if(y3 == y1) {
				drawer.T150_lc3_horizontal = true;
				drawer.T150_lc3_vertical = false;
				drawer.T150_lc3_borderY = y3;
				drawer.T150_lc3_leftOrAbove = (drawer.T150_sy <= y3);
			} else if(x3 == x1) {
				drawer.T150_lc3_horizontal = false;
				drawer.T150_lc3_vertical = true;
				drawer.T150_lc3_borderX = x3;
				drawer.T150_lc3_leftOrAbove = (drawer.T150_sx <= x3);
			} else {
				drawer.T150_lc3_horizontal = false;
				drawer.T150_lc3_vertical = false;
				drawer.T150_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T150_lc3_C = x3 - drawer.T150_lc3_m * y3;
				drawer.T150_lc3_leftOrAbove = (drawer.T150_sx < drawer.T150_lc3_m*drawer.T150_sy + drawer.T150_lc3_C);
			}

			drawer.T150_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T150_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T150_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T150_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T150_initializedWithValidData = true;
		}

		t = triangles[151]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T151_r = t.r; drawer.T151_g = t.g; drawer.T151_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T151_initializedWithValidData = false;
		} else {

			drawer.T151_sx = (x1 + x2 + x3) / 3.0;
			drawer.T151_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T151_lc1_horizontal = true;
				drawer.T151_lc1_vertical = false;
				drawer.T151_lc1_borderY = y1;
				drawer.T151_lc1_leftOrAbove = (drawer.T151_sy <= y1);
			} else if(x1 == x2) {
				drawer.T151_lc1_horizontal = false;
				drawer.T151_lc1_vertical = true;
				drawer.T151_lc1_borderX = x1;
				drawer.T151_lc1_leftOrAbove = (drawer.T151_sx <= x1);
			} else {
				drawer.T151_lc1_horizontal = false;
				drawer.T151_lc1_vertical = false;
				drawer.T151_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T151_lc1_C = x1 - drawer.T151_lc1_m * y1;
				drawer.T151_lc1_leftOrAbove = (drawer.T151_sx < drawer.T151_lc1_m*drawer.T151_sy + drawer.T151_lc1_C);
			}

			if(y2 == y3) {
				drawer.T151_lc2_horizontal = true;
				drawer.T151_lc2_vertical = false;
				drawer.T151_lc2_borderY = y2;
				drawer.T151_lc2_leftOrAbove = (drawer.T151_sy <= y2);
			} else if(x2 == x3) {
				drawer.T151_lc2_horizontal = false;
				drawer.T151_lc2_vertical = true;
				drawer.T151_lc2_borderX = x2;
				drawer.T151_lc2_leftOrAbove = (drawer.T151_sx <= x2);
			} else {
				drawer.T151_lc2_horizontal = false;
				drawer.T151_lc2_vertical = false;
				drawer.T151_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T151_lc2_C = x2 - drawer.T151_lc2_m * y2;
				drawer.T151_lc2_leftOrAbove = (drawer.T151_sx < drawer.T151_lc2_m*drawer.T151_sy + drawer.T151_lc2_C);
			}

			if(y3 == y1) {
				drawer.T151_lc3_horizontal = true;
				drawer.T151_lc3_vertical = false;
				drawer.T151_lc3_borderY = y3;
				drawer.T151_lc3_leftOrAbove = (drawer.T151_sy <= y3);
			} else if(x3 == x1) {
				drawer.T151_lc3_horizontal = false;
				drawer.T151_lc3_vertical = true;
				drawer.T151_lc3_borderX = x3;
				drawer.T151_lc3_leftOrAbove = (drawer.T151_sx <= x3);
			} else {
				drawer.T151_lc3_horizontal = false;
				drawer.T151_lc3_vertical = false;
				drawer.T151_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T151_lc3_C = x3 - drawer.T151_lc3_m * y3;
				drawer.T151_lc3_leftOrAbove = (drawer.T151_sx < drawer.T151_lc3_m*drawer.T151_sy + drawer.T151_lc3_C);
			}

			drawer.T151_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T151_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T151_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T151_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T151_initializedWithValidData = true;
		}

		t = triangles[152]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T152_r = t.r; drawer.T152_g = t.g; drawer.T152_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T152_initializedWithValidData = false;
		} else {

			drawer.T152_sx = (x1 + x2 + x3) / 3.0;
			drawer.T152_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T152_lc1_horizontal = true;
				drawer.T152_lc1_vertical = false;
				drawer.T152_lc1_borderY = y1;
				drawer.T152_lc1_leftOrAbove = (drawer.T152_sy <= y1);
			} else if(x1 == x2) {
				drawer.T152_lc1_horizontal = false;
				drawer.T152_lc1_vertical = true;
				drawer.T152_lc1_borderX = x1;
				drawer.T152_lc1_leftOrAbove = (drawer.T152_sx <= x1);
			} else {
				drawer.T152_lc1_horizontal = false;
				drawer.T152_lc1_vertical = false;
				drawer.T152_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T152_lc1_C = x1 - drawer.T152_lc1_m * y1;
				drawer.T152_lc1_leftOrAbove = (drawer.T152_sx < drawer.T152_lc1_m*drawer.T152_sy + drawer.T152_lc1_C);
			}

			if(y2 == y3) {
				drawer.T152_lc2_horizontal = true;
				drawer.T152_lc2_vertical = false;
				drawer.T152_lc2_borderY = y2;
				drawer.T152_lc2_leftOrAbove = (drawer.T152_sy <= y2);
			} else if(x2 == x3) {
				drawer.T152_lc2_horizontal = false;
				drawer.T152_lc2_vertical = true;
				drawer.T152_lc2_borderX = x2;
				drawer.T152_lc2_leftOrAbove = (drawer.T152_sx <= x2);
			} else {
				drawer.T152_lc2_horizontal = false;
				drawer.T152_lc2_vertical = false;
				drawer.T152_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T152_lc2_C = x2 - drawer.T152_lc2_m * y2;
				drawer.T152_lc2_leftOrAbove = (drawer.T152_sx < drawer.T152_lc2_m*drawer.T152_sy + drawer.T152_lc2_C);
			}

			if(y3 == y1) {
				drawer.T152_lc3_horizontal = true;
				drawer.T152_lc3_vertical = false;
				drawer.T152_lc3_borderY = y3;
				drawer.T152_lc3_leftOrAbove = (drawer.T152_sy <= y3);
			} else if(x3 == x1) {
				drawer.T152_lc3_horizontal = false;
				drawer.T152_lc3_vertical = true;
				drawer.T152_lc3_borderX = x3;
				drawer.T152_lc3_leftOrAbove = (drawer.T152_sx <= x3);
			} else {
				drawer.T152_lc3_horizontal = false;
				drawer.T152_lc3_vertical = false;
				drawer.T152_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T152_lc3_C = x3 - drawer.T152_lc3_m * y3;
				drawer.T152_lc3_leftOrAbove = (drawer.T152_sx < drawer.T152_lc3_m*drawer.T152_sy + drawer.T152_lc3_C);
			}

			drawer.T152_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T152_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T152_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T152_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T152_initializedWithValidData = true;
		}

		t = triangles[153]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T153_r = t.r; drawer.T153_g = t.g; drawer.T153_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T153_initializedWithValidData = false;
		} else {

			drawer.T153_sx = (x1 + x2 + x3) / 3.0;
			drawer.T153_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T153_lc1_horizontal = true;
				drawer.T153_lc1_vertical = false;
				drawer.T153_lc1_borderY = y1;
				drawer.T153_lc1_leftOrAbove = (drawer.T153_sy <= y1);
			} else if(x1 == x2) {
				drawer.T153_lc1_horizontal = false;
				drawer.T153_lc1_vertical = true;
				drawer.T153_lc1_borderX = x1;
				drawer.T153_lc1_leftOrAbove = (drawer.T153_sx <= x1);
			} else {
				drawer.T153_lc1_horizontal = false;
				drawer.T153_lc1_vertical = false;
				drawer.T153_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T153_lc1_C = x1 - drawer.T153_lc1_m * y1;
				drawer.T153_lc1_leftOrAbove = (drawer.T153_sx < drawer.T153_lc1_m*drawer.T153_sy + drawer.T153_lc1_C);
			}

			if(y2 == y3) {
				drawer.T153_lc2_horizontal = true;
				drawer.T153_lc2_vertical = false;
				drawer.T153_lc2_borderY = y2;
				drawer.T153_lc2_leftOrAbove = (drawer.T153_sy <= y2);
			} else if(x2 == x3) {
				drawer.T153_lc2_horizontal = false;
				drawer.T153_lc2_vertical = true;
				drawer.T153_lc2_borderX = x2;
				drawer.T153_lc2_leftOrAbove = (drawer.T153_sx <= x2);
			} else {
				drawer.T153_lc2_horizontal = false;
				drawer.T153_lc2_vertical = false;
				drawer.T153_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T153_lc2_C = x2 - drawer.T153_lc2_m * y2;
				drawer.T153_lc2_leftOrAbove = (drawer.T153_sx < drawer.T153_lc2_m*drawer.T153_sy + drawer.T153_lc2_C);
			}

			if(y3 == y1) {
				drawer.T153_lc3_horizontal = true;
				drawer.T153_lc3_vertical = false;
				drawer.T153_lc3_borderY = y3;
				drawer.T153_lc3_leftOrAbove = (drawer.T153_sy <= y3);
			} else if(x3 == x1) {
				drawer.T153_lc3_horizontal = false;
				drawer.T153_lc3_vertical = true;
				drawer.T153_lc3_borderX = x3;
				drawer.T153_lc3_leftOrAbove = (drawer.T153_sx <= x3);
			} else {
				drawer.T153_lc3_horizontal = false;
				drawer.T153_lc3_vertical = false;
				drawer.T153_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T153_lc3_C = x3 - drawer.T153_lc3_m * y3;
				drawer.T153_lc3_leftOrAbove = (drawer.T153_sx < drawer.T153_lc3_m*drawer.T153_sy + drawer.T153_lc3_C);
			}

			drawer.T153_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T153_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T153_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T153_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T153_initializedWithValidData = true;
		}

		t = triangles[154]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T154_r = t.r; drawer.T154_g = t.g; drawer.T154_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T154_initializedWithValidData = false;
		} else {

			drawer.T154_sx = (x1 + x2 + x3) / 3.0;
			drawer.T154_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T154_lc1_horizontal = true;
				drawer.T154_lc1_vertical = false;
				drawer.T154_lc1_borderY = y1;
				drawer.T154_lc1_leftOrAbove = (drawer.T154_sy <= y1);
			} else if(x1 == x2) {
				drawer.T154_lc1_horizontal = false;
				drawer.T154_lc1_vertical = true;
				drawer.T154_lc1_borderX = x1;
				drawer.T154_lc1_leftOrAbove = (drawer.T154_sx <= x1);
			} else {
				drawer.T154_lc1_horizontal = false;
				drawer.T154_lc1_vertical = false;
				drawer.T154_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T154_lc1_C = x1 - drawer.T154_lc1_m * y1;
				drawer.T154_lc1_leftOrAbove = (drawer.T154_sx < drawer.T154_lc1_m*drawer.T154_sy + drawer.T154_lc1_C);
			}

			if(y2 == y3) {
				drawer.T154_lc2_horizontal = true;
				drawer.T154_lc2_vertical = false;
				drawer.T154_lc2_borderY = y2;
				drawer.T154_lc2_leftOrAbove = (drawer.T154_sy <= y2);
			} else if(x2 == x3) {
				drawer.T154_lc2_horizontal = false;
				drawer.T154_lc2_vertical = true;
				drawer.T154_lc2_borderX = x2;
				drawer.T154_lc2_leftOrAbove = (drawer.T154_sx <= x2);
			} else {
				drawer.T154_lc2_horizontal = false;
				drawer.T154_lc2_vertical = false;
				drawer.T154_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T154_lc2_C = x2 - drawer.T154_lc2_m * y2;
				drawer.T154_lc2_leftOrAbove = (drawer.T154_sx < drawer.T154_lc2_m*drawer.T154_sy + drawer.T154_lc2_C);
			}

			if(y3 == y1) {
				drawer.T154_lc3_horizontal = true;
				drawer.T154_lc3_vertical = false;
				drawer.T154_lc3_borderY = y3;
				drawer.T154_lc3_leftOrAbove = (drawer.T154_sy <= y3);
			} else if(x3 == x1) {
				drawer.T154_lc3_horizontal = false;
				drawer.T154_lc3_vertical = true;
				drawer.T154_lc3_borderX = x3;
				drawer.T154_lc3_leftOrAbove = (drawer.T154_sx <= x3);
			} else {
				drawer.T154_lc3_horizontal = false;
				drawer.T154_lc3_vertical = false;
				drawer.T154_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T154_lc3_C = x3 - drawer.T154_lc3_m * y3;
				drawer.T154_lc3_leftOrAbove = (drawer.T154_sx < drawer.T154_lc3_m*drawer.T154_sy + drawer.T154_lc3_C);
			}

			drawer.T154_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T154_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T154_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T154_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T154_initializedWithValidData = true;
		}

		t = triangles[155]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T155_r = t.r; drawer.T155_g = t.g; drawer.T155_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T155_initializedWithValidData = false;
		} else {

			drawer.T155_sx = (x1 + x2 + x3) / 3.0;
			drawer.T155_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T155_lc1_horizontal = true;
				drawer.T155_lc1_vertical = false;
				drawer.T155_lc1_borderY = y1;
				drawer.T155_lc1_leftOrAbove = (drawer.T155_sy <= y1);
			} else if(x1 == x2) {
				drawer.T155_lc1_horizontal = false;
				drawer.T155_lc1_vertical = true;
				drawer.T155_lc1_borderX = x1;
				drawer.T155_lc1_leftOrAbove = (drawer.T155_sx <= x1);
			} else {
				drawer.T155_lc1_horizontal = false;
				drawer.T155_lc1_vertical = false;
				drawer.T155_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T155_lc1_C = x1 - drawer.T155_lc1_m * y1;
				drawer.T155_lc1_leftOrAbove = (drawer.T155_sx < drawer.T155_lc1_m*drawer.T155_sy + drawer.T155_lc1_C);
			}

			if(y2 == y3) {
				drawer.T155_lc2_horizontal = true;
				drawer.T155_lc2_vertical = false;
				drawer.T155_lc2_borderY = y2;
				drawer.T155_lc2_leftOrAbove = (drawer.T155_sy <= y2);
			} else if(x2 == x3) {
				drawer.T155_lc2_horizontal = false;
				drawer.T155_lc2_vertical = true;
				drawer.T155_lc2_borderX = x2;
				drawer.T155_lc2_leftOrAbove = (drawer.T155_sx <= x2);
			} else {
				drawer.T155_lc2_horizontal = false;
				drawer.T155_lc2_vertical = false;
				drawer.T155_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T155_lc2_C = x2 - drawer.T155_lc2_m * y2;
				drawer.T155_lc2_leftOrAbove = (drawer.T155_sx < drawer.T155_lc2_m*drawer.T155_sy + drawer.T155_lc2_C);
			}

			if(y3 == y1) {
				drawer.T155_lc3_horizontal = true;
				drawer.T155_lc3_vertical = false;
				drawer.T155_lc3_borderY = y3;
				drawer.T155_lc3_leftOrAbove = (drawer.T155_sy <= y3);
			} else if(x3 == x1) {
				drawer.T155_lc3_horizontal = false;
				drawer.T155_lc3_vertical = true;
				drawer.T155_lc3_borderX = x3;
				drawer.T155_lc3_leftOrAbove = (drawer.T155_sx <= x3);
			} else {
				drawer.T155_lc3_horizontal = false;
				drawer.T155_lc3_vertical = false;
				drawer.T155_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T155_lc3_C = x3 - drawer.T155_lc3_m * y3;
				drawer.T155_lc3_leftOrAbove = (drawer.T155_sx < drawer.T155_lc3_m*drawer.T155_sy + drawer.T155_lc3_C);
			}

			drawer.T155_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T155_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T155_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T155_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T155_initializedWithValidData = true;
		}

		t = triangles[156]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T156_r = t.r; drawer.T156_g = t.g; drawer.T156_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T156_initializedWithValidData = false;
		} else {

			drawer.T156_sx = (x1 + x2 + x3) / 3.0;
			drawer.T156_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T156_lc1_horizontal = true;
				drawer.T156_lc1_vertical = false;
				drawer.T156_lc1_borderY = y1;
				drawer.T156_lc1_leftOrAbove = (drawer.T156_sy <= y1);
			} else if(x1 == x2) {
				drawer.T156_lc1_horizontal = false;
				drawer.T156_lc1_vertical = true;
				drawer.T156_lc1_borderX = x1;
				drawer.T156_lc1_leftOrAbove = (drawer.T156_sx <= x1);
			} else {
				drawer.T156_lc1_horizontal = false;
				drawer.T156_lc1_vertical = false;
				drawer.T156_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T156_lc1_C = x1 - drawer.T156_lc1_m * y1;
				drawer.T156_lc1_leftOrAbove = (drawer.T156_sx < drawer.T156_lc1_m*drawer.T156_sy + drawer.T156_lc1_C);
			}

			if(y2 == y3) {
				drawer.T156_lc2_horizontal = true;
				drawer.T156_lc2_vertical = false;
				drawer.T156_lc2_borderY = y2;
				drawer.T156_lc2_leftOrAbove = (drawer.T156_sy <= y2);
			} else if(x2 == x3) {
				drawer.T156_lc2_horizontal = false;
				drawer.T156_lc2_vertical = true;
				drawer.T156_lc2_borderX = x2;
				drawer.T156_lc2_leftOrAbove = (drawer.T156_sx <= x2);
			} else {
				drawer.T156_lc2_horizontal = false;
				drawer.T156_lc2_vertical = false;
				drawer.T156_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T156_lc2_C = x2 - drawer.T156_lc2_m * y2;
				drawer.T156_lc2_leftOrAbove = (drawer.T156_sx < drawer.T156_lc2_m*drawer.T156_sy + drawer.T156_lc2_C);
			}

			if(y3 == y1) {
				drawer.T156_lc3_horizontal = true;
				drawer.T156_lc3_vertical = false;
				drawer.T156_lc3_borderY = y3;
				drawer.T156_lc3_leftOrAbove = (drawer.T156_sy <= y3);
			} else if(x3 == x1) {
				drawer.T156_lc3_horizontal = false;
				drawer.T156_lc3_vertical = true;
				drawer.T156_lc3_borderX = x3;
				drawer.T156_lc3_leftOrAbove = (drawer.T156_sx <= x3);
			} else {
				drawer.T156_lc3_horizontal = false;
				drawer.T156_lc3_vertical = false;
				drawer.T156_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T156_lc3_C = x3 - drawer.T156_lc3_m * y3;
				drawer.T156_lc3_leftOrAbove = (drawer.T156_sx < drawer.T156_lc3_m*drawer.T156_sy + drawer.T156_lc3_C);
			}

			drawer.T156_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T156_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T156_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T156_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T156_initializedWithValidData = true;
		}

		t = triangles[157]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T157_r = t.r; drawer.T157_g = t.g; drawer.T157_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T157_initializedWithValidData = false;
		} else {

			drawer.T157_sx = (x1 + x2 + x3) / 3.0;
			drawer.T157_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T157_lc1_horizontal = true;
				drawer.T157_lc1_vertical = false;
				drawer.T157_lc1_borderY = y1;
				drawer.T157_lc1_leftOrAbove = (drawer.T157_sy <= y1);
			} else if(x1 == x2) {
				drawer.T157_lc1_horizontal = false;
				drawer.T157_lc1_vertical = true;
				drawer.T157_lc1_borderX = x1;
				drawer.T157_lc1_leftOrAbove = (drawer.T157_sx <= x1);
			} else {
				drawer.T157_lc1_horizontal = false;
				drawer.T157_lc1_vertical = false;
				drawer.T157_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T157_lc1_C = x1 - drawer.T157_lc1_m * y1;
				drawer.T157_lc1_leftOrAbove = (drawer.T157_sx < drawer.T157_lc1_m*drawer.T157_sy + drawer.T157_lc1_C);
			}

			if(y2 == y3) {
				drawer.T157_lc2_horizontal = true;
				drawer.T157_lc2_vertical = false;
				drawer.T157_lc2_borderY = y2;
				drawer.T157_lc2_leftOrAbove = (drawer.T157_sy <= y2);
			} else if(x2 == x3) {
				drawer.T157_lc2_horizontal = false;
				drawer.T157_lc2_vertical = true;
				drawer.T157_lc2_borderX = x2;
				drawer.T157_lc2_leftOrAbove = (drawer.T157_sx <= x2);
			} else {
				drawer.T157_lc2_horizontal = false;
				drawer.T157_lc2_vertical = false;
				drawer.T157_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T157_lc2_C = x2 - drawer.T157_lc2_m * y2;
				drawer.T157_lc2_leftOrAbove = (drawer.T157_sx < drawer.T157_lc2_m*drawer.T157_sy + drawer.T157_lc2_C);
			}

			if(y3 == y1) {
				drawer.T157_lc3_horizontal = true;
				drawer.T157_lc3_vertical = false;
				drawer.T157_lc3_borderY = y3;
				drawer.T157_lc3_leftOrAbove = (drawer.T157_sy <= y3);
			} else if(x3 == x1) {
				drawer.T157_lc3_horizontal = false;
				drawer.T157_lc3_vertical = true;
				drawer.T157_lc3_borderX = x3;
				drawer.T157_lc3_leftOrAbove = (drawer.T157_sx <= x3);
			} else {
				drawer.T157_lc3_horizontal = false;
				drawer.T157_lc3_vertical = false;
				drawer.T157_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T157_lc3_C = x3 - drawer.T157_lc3_m * y3;
				drawer.T157_lc3_leftOrAbove = (drawer.T157_sx < drawer.T157_lc3_m*drawer.T157_sy + drawer.T157_lc3_C);
			}

			drawer.T157_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T157_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T157_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T157_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T157_initializedWithValidData = true;
		}

		t = triangles[158]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T158_r = t.r; drawer.T158_g = t.g; drawer.T158_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T158_initializedWithValidData = false;
		} else {

			drawer.T158_sx = (x1 + x2 + x3) / 3.0;
			drawer.T158_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T158_lc1_horizontal = true;
				drawer.T158_lc1_vertical = false;
				drawer.T158_lc1_borderY = y1;
				drawer.T158_lc1_leftOrAbove = (drawer.T158_sy <= y1);
			} else if(x1 == x2) {
				drawer.T158_lc1_horizontal = false;
				drawer.T158_lc1_vertical = true;
				drawer.T158_lc1_borderX = x1;
				drawer.T158_lc1_leftOrAbove = (drawer.T158_sx <= x1);
			} else {
				drawer.T158_lc1_horizontal = false;
				drawer.T158_lc1_vertical = false;
				drawer.T158_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T158_lc1_C = x1 - drawer.T158_lc1_m * y1;
				drawer.T158_lc1_leftOrAbove = (drawer.T158_sx < drawer.T158_lc1_m*drawer.T158_sy + drawer.T158_lc1_C);
			}

			if(y2 == y3) {
				drawer.T158_lc2_horizontal = true;
				drawer.T158_lc2_vertical = false;
				drawer.T158_lc2_borderY = y2;
				drawer.T158_lc2_leftOrAbove = (drawer.T158_sy <= y2);
			} else if(x2 == x3) {
				drawer.T158_lc2_horizontal = false;
				drawer.T158_lc2_vertical = true;
				drawer.T158_lc2_borderX = x2;
				drawer.T158_lc2_leftOrAbove = (drawer.T158_sx <= x2);
			} else {
				drawer.T158_lc2_horizontal = false;
				drawer.T158_lc2_vertical = false;
				drawer.T158_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T158_lc2_C = x2 - drawer.T158_lc2_m * y2;
				drawer.T158_lc2_leftOrAbove = (drawer.T158_sx < drawer.T158_lc2_m*drawer.T158_sy + drawer.T158_lc2_C);
			}

			if(y3 == y1) {
				drawer.T158_lc3_horizontal = true;
				drawer.T158_lc3_vertical = false;
				drawer.T158_lc3_borderY = y3;
				drawer.T158_lc3_leftOrAbove = (drawer.T158_sy <= y3);
			} else if(x3 == x1) {
				drawer.T158_lc3_horizontal = false;
				drawer.T158_lc3_vertical = true;
				drawer.T158_lc3_borderX = x3;
				drawer.T158_lc3_leftOrAbove = (drawer.T158_sx <= x3);
			} else {
				drawer.T158_lc3_horizontal = false;
				drawer.T158_lc3_vertical = false;
				drawer.T158_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T158_lc3_C = x3 - drawer.T158_lc3_m * y3;
				drawer.T158_lc3_leftOrAbove = (drawer.T158_sx < drawer.T158_lc3_m*drawer.T158_sy + drawer.T158_lc3_C);
			}

			drawer.T158_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T158_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T158_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T158_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T158_initializedWithValidData = true;
		}

		t = triangles[159]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T159_r = t.r; drawer.T159_g = t.g; drawer.T159_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T159_initializedWithValidData = false;
		} else {

			drawer.T159_sx = (x1 + x2 + x3) / 3.0;
			drawer.T159_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T159_lc1_horizontal = true;
				drawer.T159_lc1_vertical = false;
				drawer.T159_lc1_borderY = y1;
				drawer.T159_lc1_leftOrAbove = (drawer.T159_sy <= y1);
			} else if(x1 == x2) {
				drawer.T159_lc1_horizontal = false;
				drawer.T159_lc1_vertical = true;
				drawer.T159_lc1_borderX = x1;
				drawer.T159_lc1_leftOrAbove = (drawer.T159_sx <= x1);
			} else {
				drawer.T159_lc1_horizontal = false;
				drawer.T159_lc1_vertical = false;
				drawer.T159_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T159_lc1_C = x1 - drawer.T159_lc1_m * y1;
				drawer.T159_lc1_leftOrAbove = (drawer.T159_sx < drawer.T159_lc1_m*drawer.T159_sy + drawer.T159_lc1_C);
			}

			if(y2 == y3) {
				drawer.T159_lc2_horizontal = true;
				drawer.T159_lc2_vertical = false;
				drawer.T159_lc2_borderY = y2;
				drawer.T159_lc2_leftOrAbove = (drawer.T159_sy <= y2);
			} else if(x2 == x3) {
				drawer.T159_lc2_horizontal = false;
				drawer.T159_lc2_vertical = true;
				drawer.T159_lc2_borderX = x2;
				drawer.T159_lc2_leftOrAbove = (drawer.T159_sx <= x2);
			} else {
				drawer.T159_lc2_horizontal = false;
				drawer.T159_lc2_vertical = false;
				drawer.T159_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T159_lc2_C = x2 - drawer.T159_lc2_m * y2;
				drawer.T159_lc2_leftOrAbove = (drawer.T159_sx < drawer.T159_lc2_m*drawer.T159_sy + drawer.T159_lc2_C);
			}

			if(y3 == y1) {
				drawer.T159_lc3_horizontal = true;
				drawer.T159_lc3_vertical = false;
				drawer.T159_lc3_borderY = y3;
				drawer.T159_lc3_leftOrAbove = (drawer.T159_sy <= y3);
			} else if(x3 == x1) {
				drawer.T159_lc3_horizontal = false;
				drawer.T159_lc3_vertical = true;
				drawer.T159_lc3_borderX = x3;
				drawer.T159_lc3_leftOrAbove = (drawer.T159_sx <= x3);
			} else {
				drawer.T159_lc3_horizontal = false;
				drawer.T159_lc3_vertical = false;
				drawer.T159_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T159_lc3_C = x3 - drawer.T159_lc3_m * y3;
				drawer.T159_lc3_leftOrAbove = (drawer.T159_sx < drawer.T159_lc3_m*drawer.T159_sy + drawer.T159_lc3_C);
			}

			drawer.T159_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T159_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T159_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T159_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T159_initializedWithValidData = true;
		}

		t = triangles[160]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T160_r = t.r; drawer.T160_g = t.g; drawer.T160_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T160_initializedWithValidData = false;
		} else {

			drawer.T160_sx = (x1 + x2 + x3) / 3.0;
			drawer.T160_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T160_lc1_horizontal = true;
				drawer.T160_lc1_vertical = false;
				drawer.T160_lc1_borderY = y1;
				drawer.T160_lc1_leftOrAbove = (drawer.T160_sy <= y1);
			} else if(x1 == x2) {
				drawer.T160_lc1_horizontal = false;
				drawer.T160_lc1_vertical = true;
				drawer.T160_lc1_borderX = x1;
				drawer.T160_lc1_leftOrAbove = (drawer.T160_sx <= x1);
			} else {
				drawer.T160_lc1_horizontal = false;
				drawer.T160_lc1_vertical = false;
				drawer.T160_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T160_lc1_C = x1 - drawer.T160_lc1_m * y1;
				drawer.T160_lc1_leftOrAbove = (drawer.T160_sx < drawer.T160_lc1_m*drawer.T160_sy + drawer.T160_lc1_C);
			}

			if(y2 == y3) {
				drawer.T160_lc2_horizontal = true;
				drawer.T160_lc2_vertical = false;
				drawer.T160_lc2_borderY = y2;
				drawer.T160_lc2_leftOrAbove = (drawer.T160_sy <= y2);
			} else if(x2 == x3) {
				drawer.T160_lc2_horizontal = false;
				drawer.T160_lc2_vertical = true;
				drawer.T160_lc2_borderX = x2;
				drawer.T160_lc2_leftOrAbove = (drawer.T160_sx <= x2);
			} else {
				drawer.T160_lc2_horizontal = false;
				drawer.T160_lc2_vertical = false;
				drawer.T160_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T160_lc2_C = x2 - drawer.T160_lc2_m * y2;
				drawer.T160_lc2_leftOrAbove = (drawer.T160_sx < drawer.T160_lc2_m*drawer.T160_sy + drawer.T160_lc2_C);
			}

			if(y3 == y1) {
				drawer.T160_lc3_horizontal = true;
				drawer.T160_lc3_vertical = false;
				drawer.T160_lc3_borderY = y3;
				drawer.T160_lc3_leftOrAbove = (drawer.T160_sy <= y3);
			} else if(x3 == x1) {
				drawer.T160_lc3_horizontal = false;
				drawer.T160_lc3_vertical = true;
				drawer.T160_lc3_borderX = x3;
				drawer.T160_lc3_leftOrAbove = (drawer.T160_sx <= x3);
			} else {
				drawer.T160_lc3_horizontal = false;
				drawer.T160_lc3_vertical = false;
				drawer.T160_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T160_lc3_C = x3 - drawer.T160_lc3_m * y3;
				drawer.T160_lc3_leftOrAbove = (drawer.T160_sx < drawer.T160_lc3_m*drawer.T160_sy + drawer.T160_lc3_C);
			}

			drawer.T160_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T160_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T160_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T160_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T160_initializedWithValidData = true;
		}

		t = triangles[161]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T161_r = t.r; drawer.T161_g = t.g; drawer.T161_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T161_initializedWithValidData = false;
		} else {

			drawer.T161_sx = (x1 + x2 + x3) / 3.0;
			drawer.T161_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T161_lc1_horizontal = true;
				drawer.T161_lc1_vertical = false;
				drawer.T161_lc1_borderY = y1;
				drawer.T161_lc1_leftOrAbove = (drawer.T161_sy <= y1);
			} else if(x1 == x2) {
				drawer.T161_lc1_horizontal = false;
				drawer.T161_lc1_vertical = true;
				drawer.T161_lc1_borderX = x1;
				drawer.T161_lc1_leftOrAbove = (drawer.T161_sx <= x1);
			} else {
				drawer.T161_lc1_horizontal = false;
				drawer.T161_lc1_vertical = false;
				drawer.T161_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T161_lc1_C = x1 - drawer.T161_lc1_m * y1;
				drawer.T161_lc1_leftOrAbove = (drawer.T161_sx < drawer.T161_lc1_m*drawer.T161_sy + drawer.T161_lc1_C);
			}

			if(y2 == y3) {
				drawer.T161_lc2_horizontal = true;
				drawer.T161_lc2_vertical = false;
				drawer.T161_lc2_borderY = y2;
				drawer.T161_lc2_leftOrAbove = (drawer.T161_sy <= y2);
			} else if(x2 == x3) {
				drawer.T161_lc2_horizontal = false;
				drawer.T161_lc2_vertical = true;
				drawer.T161_lc2_borderX = x2;
				drawer.T161_lc2_leftOrAbove = (drawer.T161_sx <= x2);
			} else {
				drawer.T161_lc2_horizontal = false;
				drawer.T161_lc2_vertical = false;
				drawer.T161_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T161_lc2_C = x2 - drawer.T161_lc2_m * y2;
				drawer.T161_lc2_leftOrAbove = (drawer.T161_sx < drawer.T161_lc2_m*drawer.T161_sy + drawer.T161_lc2_C);
			}

			if(y3 == y1) {
				drawer.T161_lc3_horizontal = true;
				drawer.T161_lc3_vertical = false;
				drawer.T161_lc3_borderY = y3;
				drawer.T161_lc3_leftOrAbove = (drawer.T161_sy <= y3);
			} else if(x3 == x1) {
				drawer.T161_lc3_horizontal = false;
				drawer.T161_lc3_vertical = true;
				drawer.T161_lc3_borderX = x3;
				drawer.T161_lc3_leftOrAbove = (drawer.T161_sx <= x3);
			} else {
				drawer.T161_lc3_horizontal = false;
				drawer.T161_lc3_vertical = false;
				drawer.T161_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T161_lc3_C = x3 - drawer.T161_lc3_m * y3;
				drawer.T161_lc3_leftOrAbove = (drawer.T161_sx < drawer.T161_lc3_m*drawer.T161_sy + drawer.T161_lc3_C);
			}

			drawer.T161_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T161_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T161_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T161_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T161_initializedWithValidData = true;
		}

		t = triangles[162]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T162_r = t.r; drawer.T162_g = t.g; drawer.T162_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T162_initializedWithValidData = false;
		} else {

			drawer.T162_sx = (x1 + x2 + x3) / 3.0;
			drawer.T162_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T162_lc1_horizontal = true;
				drawer.T162_lc1_vertical = false;
				drawer.T162_lc1_borderY = y1;
				drawer.T162_lc1_leftOrAbove = (drawer.T162_sy <= y1);
			} else if(x1 == x2) {
				drawer.T162_lc1_horizontal = false;
				drawer.T162_lc1_vertical = true;
				drawer.T162_lc1_borderX = x1;
				drawer.T162_lc1_leftOrAbove = (drawer.T162_sx <= x1);
			} else {
				drawer.T162_lc1_horizontal = false;
				drawer.T162_lc1_vertical = false;
				drawer.T162_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T162_lc1_C = x1 - drawer.T162_lc1_m * y1;
				drawer.T162_lc1_leftOrAbove = (drawer.T162_sx < drawer.T162_lc1_m*drawer.T162_sy + drawer.T162_lc1_C);
			}

			if(y2 == y3) {
				drawer.T162_lc2_horizontal = true;
				drawer.T162_lc2_vertical = false;
				drawer.T162_lc2_borderY = y2;
				drawer.T162_lc2_leftOrAbove = (drawer.T162_sy <= y2);
			} else if(x2 == x3) {
				drawer.T162_lc2_horizontal = false;
				drawer.T162_lc2_vertical = true;
				drawer.T162_lc2_borderX = x2;
				drawer.T162_lc2_leftOrAbove = (drawer.T162_sx <= x2);
			} else {
				drawer.T162_lc2_horizontal = false;
				drawer.T162_lc2_vertical = false;
				drawer.T162_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T162_lc2_C = x2 - drawer.T162_lc2_m * y2;
				drawer.T162_lc2_leftOrAbove = (drawer.T162_sx < drawer.T162_lc2_m*drawer.T162_sy + drawer.T162_lc2_C);
			}

			if(y3 == y1) {
				drawer.T162_lc3_horizontal = true;
				drawer.T162_lc3_vertical = false;
				drawer.T162_lc3_borderY = y3;
				drawer.T162_lc3_leftOrAbove = (drawer.T162_sy <= y3);
			} else if(x3 == x1) {
				drawer.T162_lc3_horizontal = false;
				drawer.T162_lc3_vertical = true;
				drawer.T162_lc3_borderX = x3;
				drawer.T162_lc3_leftOrAbove = (drawer.T162_sx <= x3);
			} else {
				drawer.T162_lc3_horizontal = false;
				drawer.T162_lc3_vertical = false;
				drawer.T162_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T162_lc3_C = x3 - drawer.T162_lc3_m * y3;
				drawer.T162_lc3_leftOrAbove = (drawer.T162_sx < drawer.T162_lc3_m*drawer.T162_sy + drawer.T162_lc3_C);
			}

			drawer.T162_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T162_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T162_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T162_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T162_initializedWithValidData = true;
		}

		t = triangles[163]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T163_r = t.r; drawer.T163_g = t.g; drawer.T163_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T163_initializedWithValidData = false;
		} else {

			drawer.T163_sx = (x1 + x2 + x3) / 3.0;
			drawer.T163_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T163_lc1_horizontal = true;
				drawer.T163_lc1_vertical = false;
				drawer.T163_lc1_borderY = y1;
				drawer.T163_lc1_leftOrAbove = (drawer.T163_sy <= y1);
			} else if(x1 == x2) {
				drawer.T163_lc1_horizontal = false;
				drawer.T163_lc1_vertical = true;
				drawer.T163_lc1_borderX = x1;
				drawer.T163_lc1_leftOrAbove = (drawer.T163_sx <= x1);
			} else {
				drawer.T163_lc1_horizontal = false;
				drawer.T163_lc1_vertical = false;
				drawer.T163_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T163_lc1_C = x1 - drawer.T163_lc1_m * y1;
				drawer.T163_lc1_leftOrAbove = (drawer.T163_sx < drawer.T163_lc1_m*drawer.T163_sy + drawer.T163_lc1_C);
			}

			if(y2 == y3) {
				drawer.T163_lc2_horizontal = true;
				drawer.T163_lc2_vertical = false;
				drawer.T163_lc2_borderY = y2;
				drawer.T163_lc2_leftOrAbove = (drawer.T163_sy <= y2);
			} else if(x2 == x3) {
				drawer.T163_lc2_horizontal = false;
				drawer.T163_lc2_vertical = true;
				drawer.T163_lc2_borderX = x2;
				drawer.T163_lc2_leftOrAbove = (drawer.T163_sx <= x2);
			} else {
				drawer.T163_lc2_horizontal = false;
				drawer.T163_lc2_vertical = false;
				drawer.T163_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T163_lc2_C = x2 - drawer.T163_lc2_m * y2;
				drawer.T163_lc2_leftOrAbove = (drawer.T163_sx < drawer.T163_lc2_m*drawer.T163_sy + drawer.T163_lc2_C);
			}

			if(y3 == y1) {
				drawer.T163_lc3_horizontal = true;
				drawer.T163_lc3_vertical = false;
				drawer.T163_lc3_borderY = y3;
				drawer.T163_lc3_leftOrAbove = (drawer.T163_sy <= y3);
			} else if(x3 == x1) {
				drawer.T163_lc3_horizontal = false;
				drawer.T163_lc3_vertical = true;
				drawer.T163_lc3_borderX = x3;
				drawer.T163_lc3_leftOrAbove = (drawer.T163_sx <= x3);
			} else {
				drawer.T163_lc3_horizontal = false;
				drawer.T163_lc3_vertical = false;
				drawer.T163_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T163_lc3_C = x3 - drawer.T163_lc3_m * y3;
				drawer.T163_lc3_leftOrAbove = (drawer.T163_sx < drawer.T163_lc3_m*drawer.T163_sy + drawer.T163_lc3_C);
			}

			drawer.T163_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T163_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T163_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T163_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T163_initializedWithValidData = true;
		}

		t = triangles[164]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T164_r = t.r; drawer.T164_g = t.g; drawer.T164_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T164_initializedWithValidData = false;
		} else {

			drawer.T164_sx = (x1 + x2 + x3) / 3.0;
			drawer.T164_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T164_lc1_horizontal = true;
				drawer.T164_lc1_vertical = false;
				drawer.T164_lc1_borderY = y1;
				drawer.T164_lc1_leftOrAbove = (drawer.T164_sy <= y1);
			} else if(x1 == x2) {
				drawer.T164_lc1_horizontal = false;
				drawer.T164_lc1_vertical = true;
				drawer.T164_lc1_borderX = x1;
				drawer.T164_lc1_leftOrAbove = (drawer.T164_sx <= x1);
			} else {
				drawer.T164_lc1_horizontal = false;
				drawer.T164_lc1_vertical = false;
				drawer.T164_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T164_lc1_C = x1 - drawer.T164_lc1_m * y1;
				drawer.T164_lc1_leftOrAbove = (drawer.T164_sx < drawer.T164_lc1_m*drawer.T164_sy + drawer.T164_lc1_C);
			}

			if(y2 == y3) {
				drawer.T164_lc2_horizontal = true;
				drawer.T164_lc2_vertical = false;
				drawer.T164_lc2_borderY = y2;
				drawer.T164_lc2_leftOrAbove = (drawer.T164_sy <= y2);
			} else if(x2 == x3) {
				drawer.T164_lc2_horizontal = false;
				drawer.T164_lc2_vertical = true;
				drawer.T164_lc2_borderX = x2;
				drawer.T164_lc2_leftOrAbove = (drawer.T164_sx <= x2);
			} else {
				drawer.T164_lc2_horizontal = false;
				drawer.T164_lc2_vertical = false;
				drawer.T164_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T164_lc2_C = x2 - drawer.T164_lc2_m * y2;
				drawer.T164_lc2_leftOrAbove = (drawer.T164_sx < drawer.T164_lc2_m*drawer.T164_sy + drawer.T164_lc2_C);
			}

			if(y3 == y1) {
				drawer.T164_lc3_horizontal = true;
				drawer.T164_lc3_vertical = false;
				drawer.T164_lc3_borderY = y3;
				drawer.T164_lc3_leftOrAbove = (drawer.T164_sy <= y3);
			} else if(x3 == x1) {
				drawer.T164_lc3_horizontal = false;
				drawer.T164_lc3_vertical = true;
				drawer.T164_lc3_borderX = x3;
				drawer.T164_lc3_leftOrAbove = (drawer.T164_sx <= x3);
			} else {
				drawer.T164_lc3_horizontal = false;
				drawer.T164_lc3_vertical = false;
				drawer.T164_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T164_lc3_C = x3 - drawer.T164_lc3_m * y3;
				drawer.T164_lc3_leftOrAbove = (drawer.T164_sx < drawer.T164_lc3_m*drawer.T164_sy + drawer.T164_lc3_C);
			}

			drawer.T164_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T164_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T164_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T164_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T164_initializedWithValidData = true;
		}

		t = triangles[165]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T165_r = t.r; drawer.T165_g = t.g; drawer.T165_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T165_initializedWithValidData = false;
		} else {

			drawer.T165_sx = (x1 + x2 + x3) / 3.0;
			drawer.T165_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T165_lc1_horizontal = true;
				drawer.T165_lc1_vertical = false;
				drawer.T165_lc1_borderY = y1;
				drawer.T165_lc1_leftOrAbove = (drawer.T165_sy <= y1);
			} else if(x1 == x2) {
				drawer.T165_lc1_horizontal = false;
				drawer.T165_lc1_vertical = true;
				drawer.T165_lc1_borderX = x1;
				drawer.T165_lc1_leftOrAbove = (drawer.T165_sx <= x1);
			} else {
				drawer.T165_lc1_horizontal = false;
				drawer.T165_lc1_vertical = false;
				drawer.T165_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T165_lc1_C = x1 - drawer.T165_lc1_m * y1;
				drawer.T165_lc1_leftOrAbove = (drawer.T165_sx < drawer.T165_lc1_m*drawer.T165_sy + drawer.T165_lc1_C);
			}

			if(y2 == y3) {
				drawer.T165_lc2_horizontal = true;
				drawer.T165_lc2_vertical = false;
				drawer.T165_lc2_borderY = y2;
				drawer.T165_lc2_leftOrAbove = (drawer.T165_sy <= y2);
			} else if(x2 == x3) {
				drawer.T165_lc2_horizontal = false;
				drawer.T165_lc2_vertical = true;
				drawer.T165_lc2_borderX = x2;
				drawer.T165_lc2_leftOrAbove = (drawer.T165_sx <= x2);
			} else {
				drawer.T165_lc2_horizontal = false;
				drawer.T165_lc2_vertical = false;
				drawer.T165_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T165_lc2_C = x2 - drawer.T165_lc2_m * y2;
				drawer.T165_lc2_leftOrAbove = (drawer.T165_sx < drawer.T165_lc2_m*drawer.T165_sy + drawer.T165_lc2_C);
			}

			if(y3 == y1) {
				drawer.T165_lc3_horizontal = true;
				drawer.T165_lc3_vertical = false;
				drawer.T165_lc3_borderY = y3;
				drawer.T165_lc3_leftOrAbove = (drawer.T165_sy <= y3);
			} else if(x3 == x1) {
				drawer.T165_lc3_horizontal = false;
				drawer.T165_lc3_vertical = true;
				drawer.T165_lc3_borderX = x3;
				drawer.T165_lc3_leftOrAbove = (drawer.T165_sx <= x3);
			} else {
				drawer.T165_lc3_horizontal = false;
				drawer.T165_lc3_vertical = false;
				drawer.T165_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T165_lc3_C = x3 - drawer.T165_lc3_m * y3;
				drawer.T165_lc3_leftOrAbove = (drawer.T165_sx < drawer.T165_lc3_m*drawer.T165_sy + drawer.T165_lc3_C);
			}

			drawer.T165_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T165_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T165_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T165_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T165_initializedWithValidData = true;
		}

		t = triangles[166]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T166_r = t.r; drawer.T166_g = t.g; drawer.T166_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T166_initializedWithValidData = false;
		} else {

			drawer.T166_sx = (x1 + x2 + x3) / 3.0;
			drawer.T166_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T166_lc1_horizontal = true;
				drawer.T166_lc1_vertical = false;
				drawer.T166_lc1_borderY = y1;
				drawer.T166_lc1_leftOrAbove = (drawer.T166_sy <= y1);
			} else if(x1 == x2) {
				drawer.T166_lc1_horizontal = false;
				drawer.T166_lc1_vertical = true;
				drawer.T166_lc1_borderX = x1;
				drawer.T166_lc1_leftOrAbove = (drawer.T166_sx <= x1);
			} else {
				drawer.T166_lc1_horizontal = false;
				drawer.T166_lc1_vertical = false;
				drawer.T166_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T166_lc1_C = x1 - drawer.T166_lc1_m * y1;
				drawer.T166_lc1_leftOrAbove = (drawer.T166_sx < drawer.T166_lc1_m*drawer.T166_sy + drawer.T166_lc1_C);
			}

			if(y2 == y3) {
				drawer.T166_lc2_horizontal = true;
				drawer.T166_lc2_vertical = false;
				drawer.T166_lc2_borderY = y2;
				drawer.T166_lc2_leftOrAbove = (drawer.T166_sy <= y2);
			} else if(x2 == x3) {
				drawer.T166_lc2_horizontal = false;
				drawer.T166_lc2_vertical = true;
				drawer.T166_lc2_borderX = x2;
				drawer.T166_lc2_leftOrAbove = (drawer.T166_sx <= x2);
			} else {
				drawer.T166_lc2_horizontal = false;
				drawer.T166_lc2_vertical = false;
				drawer.T166_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T166_lc2_C = x2 - drawer.T166_lc2_m * y2;
				drawer.T166_lc2_leftOrAbove = (drawer.T166_sx < drawer.T166_lc2_m*drawer.T166_sy + drawer.T166_lc2_C);
			}

			if(y3 == y1) {
				drawer.T166_lc3_horizontal = true;
				drawer.T166_lc3_vertical = false;
				drawer.T166_lc3_borderY = y3;
				drawer.T166_lc3_leftOrAbove = (drawer.T166_sy <= y3);
			} else if(x3 == x1) {
				drawer.T166_lc3_horizontal = false;
				drawer.T166_lc3_vertical = true;
				drawer.T166_lc3_borderX = x3;
				drawer.T166_lc3_leftOrAbove = (drawer.T166_sx <= x3);
			} else {
				drawer.T166_lc3_horizontal = false;
				drawer.T166_lc3_vertical = false;
				drawer.T166_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T166_lc3_C = x3 - drawer.T166_lc3_m * y3;
				drawer.T166_lc3_leftOrAbove = (drawer.T166_sx < drawer.T166_lc3_m*drawer.T166_sy + drawer.T166_lc3_C);
			}

			drawer.T166_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T166_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T166_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T166_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T166_initializedWithValidData = true;
		}

		t = triangles[167]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T167_r = t.r; drawer.T167_g = t.g; drawer.T167_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T167_initializedWithValidData = false;
		} else {

			drawer.T167_sx = (x1 + x2 + x3) / 3.0;
			drawer.T167_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T167_lc1_horizontal = true;
				drawer.T167_lc1_vertical = false;
				drawer.T167_lc1_borderY = y1;
				drawer.T167_lc1_leftOrAbove = (drawer.T167_sy <= y1);
			} else if(x1 == x2) {
				drawer.T167_lc1_horizontal = false;
				drawer.T167_lc1_vertical = true;
				drawer.T167_lc1_borderX = x1;
				drawer.T167_lc1_leftOrAbove = (drawer.T167_sx <= x1);
			} else {
				drawer.T167_lc1_horizontal = false;
				drawer.T167_lc1_vertical = false;
				drawer.T167_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T167_lc1_C = x1 - drawer.T167_lc1_m * y1;
				drawer.T167_lc1_leftOrAbove = (drawer.T167_sx < drawer.T167_lc1_m*drawer.T167_sy + drawer.T167_lc1_C);
			}

			if(y2 == y3) {
				drawer.T167_lc2_horizontal = true;
				drawer.T167_lc2_vertical = false;
				drawer.T167_lc2_borderY = y2;
				drawer.T167_lc2_leftOrAbove = (drawer.T167_sy <= y2);
			} else if(x2 == x3) {
				drawer.T167_lc2_horizontal = false;
				drawer.T167_lc2_vertical = true;
				drawer.T167_lc2_borderX = x2;
				drawer.T167_lc2_leftOrAbove = (drawer.T167_sx <= x2);
			} else {
				drawer.T167_lc2_horizontal = false;
				drawer.T167_lc2_vertical = false;
				drawer.T167_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T167_lc2_C = x2 - drawer.T167_lc2_m * y2;
				drawer.T167_lc2_leftOrAbove = (drawer.T167_sx < drawer.T167_lc2_m*drawer.T167_sy + drawer.T167_lc2_C);
			}

			if(y3 == y1) {
				drawer.T167_lc3_horizontal = true;
				drawer.T167_lc3_vertical = false;
				drawer.T167_lc3_borderY = y3;
				drawer.T167_lc3_leftOrAbove = (drawer.T167_sy <= y3);
			} else if(x3 == x1) {
				drawer.T167_lc3_horizontal = false;
				drawer.T167_lc3_vertical = true;
				drawer.T167_lc3_borderX = x3;
				drawer.T167_lc3_leftOrAbove = (drawer.T167_sx <= x3);
			} else {
				drawer.T167_lc3_horizontal = false;
				drawer.T167_lc3_vertical = false;
				drawer.T167_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T167_lc3_C = x3 - drawer.T167_lc3_m * y3;
				drawer.T167_lc3_leftOrAbove = (drawer.T167_sx < drawer.T167_lc3_m*drawer.T167_sy + drawer.T167_lc3_C);
			}

			drawer.T167_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T167_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T167_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T167_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T167_initializedWithValidData = true;
		}

		t = triangles[168]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T168_r = t.r; drawer.T168_g = t.g; drawer.T168_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T168_initializedWithValidData = false;
		} else {

			drawer.T168_sx = (x1 + x2 + x3) / 3.0;
			drawer.T168_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T168_lc1_horizontal = true;
				drawer.T168_lc1_vertical = false;
				drawer.T168_lc1_borderY = y1;
				drawer.T168_lc1_leftOrAbove = (drawer.T168_sy <= y1);
			} else if(x1 == x2) {
				drawer.T168_lc1_horizontal = false;
				drawer.T168_lc1_vertical = true;
				drawer.T168_lc1_borderX = x1;
				drawer.T168_lc1_leftOrAbove = (drawer.T168_sx <= x1);
			} else {
				drawer.T168_lc1_horizontal = false;
				drawer.T168_lc1_vertical = false;
				drawer.T168_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T168_lc1_C = x1 - drawer.T168_lc1_m * y1;
				drawer.T168_lc1_leftOrAbove = (drawer.T168_sx < drawer.T168_lc1_m*drawer.T168_sy + drawer.T168_lc1_C);
			}

			if(y2 == y3) {
				drawer.T168_lc2_horizontal = true;
				drawer.T168_lc2_vertical = false;
				drawer.T168_lc2_borderY = y2;
				drawer.T168_lc2_leftOrAbove = (drawer.T168_sy <= y2);
			} else if(x2 == x3) {
				drawer.T168_lc2_horizontal = false;
				drawer.T168_lc2_vertical = true;
				drawer.T168_lc2_borderX = x2;
				drawer.T168_lc2_leftOrAbove = (drawer.T168_sx <= x2);
			} else {
				drawer.T168_lc2_horizontal = false;
				drawer.T168_lc2_vertical = false;
				drawer.T168_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T168_lc2_C = x2 - drawer.T168_lc2_m * y2;
				drawer.T168_lc2_leftOrAbove = (drawer.T168_sx < drawer.T168_lc2_m*drawer.T168_sy + drawer.T168_lc2_C);
			}

			if(y3 == y1) {
				drawer.T168_lc3_horizontal = true;
				drawer.T168_lc3_vertical = false;
				drawer.T168_lc3_borderY = y3;
				drawer.T168_lc3_leftOrAbove = (drawer.T168_sy <= y3);
			} else if(x3 == x1) {
				drawer.T168_lc3_horizontal = false;
				drawer.T168_lc3_vertical = true;
				drawer.T168_lc3_borderX = x3;
				drawer.T168_lc3_leftOrAbove = (drawer.T168_sx <= x3);
			} else {
				drawer.T168_lc3_horizontal = false;
				drawer.T168_lc3_vertical = false;
				drawer.T168_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T168_lc3_C = x3 - drawer.T168_lc3_m * y3;
				drawer.T168_lc3_leftOrAbove = (drawer.T168_sx < drawer.T168_lc3_m*drawer.T168_sy + drawer.T168_lc3_C);
			}

			drawer.T168_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T168_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T168_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T168_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T168_initializedWithValidData = true;
		}

		t = triangles[169]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T169_r = t.r; drawer.T169_g = t.g; drawer.T169_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T169_initializedWithValidData = false;
		} else {

			drawer.T169_sx = (x1 + x2 + x3) / 3.0;
			drawer.T169_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T169_lc1_horizontal = true;
				drawer.T169_lc1_vertical = false;
				drawer.T169_lc1_borderY = y1;
				drawer.T169_lc1_leftOrAbove = (drawer.T169_sy <= y1);
			} else if(x1 == x2) {
				drawer.T169_lc1_horizontal = false;
				drawer.T169_lc1_vertical = true;
				drawer.T169_lc1_borderX = x1;
				drawer.T169_lc1_leftOrAbove = (drawer.T169_sx <= x1);
			} else {
				drawer.T169_lc1_horizontal = false;
				drawer.T169_lc1_vertical = false;
				drawer.T169_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T169_lc1_C = x1 - drawer.T169_lc1_m * y1;
				drawer.T169_lc1_leftOrAbove = (drawer.T169_sx < drawer.T169_lc1_m*drawer.T169_sy + drawer.T169_lc1_C);
			}

			if(y2 == y3) {
				drawer.T169_lc2_horizontal = true;
				drawer.T169_lc2_vertical = false;
				drawer.T169_lc2_borderY = y2;
				drawer.T169_lc2_leftOrAbove = (drawer.T169_sy <= y2);
			} else if(x2 == x3) {
				drawer.T169_lc2_horizontal = false;
				drawer.T169_lc2_vertical = true;
				drawer.T169_lc2_borderX = x2;
				drawer.T169_lc2_leftOrAbove = (drawer.T169_sx <= x2);
			} else {
				drawer.T169_lc2_horizontal = false;
				drawer.T169_lc2_vertical = false;
				drawer.T169_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T169_lc2_C = x2 - drawer.T169_lc2_m * y2;
				drawer.T169_lc2_leftOrAbove = (drawer.T169_sx < drawer.T169_lc2_m*drawer.T169_sy + drawer.T169_lc2_C);
			}

			if(y3 == y1) {
				drawer.T169_lc3_horizontal = true;
				drawer.T169_lc3_vertical = false;
				drawer.T169_lc3_borderY = y3;
				drawer.T169_lc3_leftOrAbove = (drawer.T169_sy <= y3);
			} else if(x3 == x1) {
				drawer.T169_lc3_horizontal = false;
				drawer.T169_lc3_vertical = true;
				drawer.T169_lc3_borderX = x3;
				drawer.T169_lc3_leftOrAbove = (drawer.T169_sx <= x3);
			} else {
				drawer.T169_lc3_horizontal = false;
				drawer.T169_lc3_vertical = false;
				drawer.T169_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T169_lc3_C = x3 - drawer.T169_lc3_m * y3;
				drawer.T169_lc3_leftOrAbove = (drawer.T169_sx < drawer.T169_lc3_m*drawer.T169_sy + drawer.T169_lc3_C);
			}

			drawer.T169_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T169_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T169_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T169_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T169_initializedWithValidData = true;
		}

		t = triangles[170]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T170_r = t.r; drawer.T170_g = t.g; drawer.T170_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T170_initializedWithValidData = false;
		} else {

			drawer.T170_sx = (x1 + x2 + x3) / 3.0;
			drawer.T170_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T170_lc1_horizontal = true;
				drawer.T170_lc1_vertical = false;
				drawer.T170_lc1_borderY = y1;
				drawer.T170_lc1_leftOrAbove = (drawer.T170_sy <= y1);
			} else if(x1 == x2) {
				drawer.T170_lc1_horizontal = false;
				drawer.T170_lc1_vertical = true;
				drawer.T170_lc1_borderX = x1;
				drawer.T170_lc1_leftOrAbove = (drawer.T170_sx <= x1);
			} else {
				drawer.T170_lc1_horizontal = false;
				drawer.T170_lc1_vertical = false;
				drawer.T170_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T170_lc1_C = x1 - drawer.T170_lc1_m * y1;
				drawer.T170_lc1_leftOrAbove = (drawer.T170_sx < drawer.T170_lc1_m*drawer.T170_sy + drawer.T170_lc1_C);
			}

			if(y2 == y3) {
				drawer.T170_lc2_horizontal = true;
				drawer.T170_lc2_vertical = false;
				drawer.T170_lc2_borderY = y2;
				drawer.T170_lc2_leftOrAbove = (drawer.T170_sy <= y2);
			} else if(x2 == x3) {
				drawer.T170_lc2_horizontal = false;
				drawer.T170_lc2_vertical = true;
				drawer.T170_lc2_borderX = x2;
				drawer.T170_lc2_leftOrAbove = (drawer.T170_sx <= x2);
			} else {
				drawer.T170_lc2_horizontal = false;
				drawer.T170_lc2_vertical = false;
				drawer.T170_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T170_lc2_C = x2 - drawer.T170_lc2_m * y2;
				drawer.T170_lc2_leftOrAbove = (drawer.T170_sx < drawer.T170_lc2_m*drawer.T170_sy + drawer.T170_lc2_C);
			}

			if(y3 == y1) {
				drawer.T170_lc3_horizontal = true;
				drawer.T170_lc3_vertical = false;
				drawer.T170_lc3_borderY = y3;
				drawer.T170_lc3_leftOrAbove = (drawer.T170_sy <= y3);
			} else if(x3 == x1) {
				drawer.T170_lc3_horizontal = false;
				drawer.T170_lc3_vertical = true;
				drawer.T170_lc3_borderX = x3;
				drawer.T170_lc3_leftOrAbove = (drawer.T170_sx <= x3);
			} else {
				drawer.T170_lc3_horizontal = false;
				drawer.T170_lc3_vertical = false;
				drawer.T170_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T170_lc3_C = x3 - drawer.T170_lc3_m * y3;
				drawer.T170_lc3_leftOrAbove = (drawer.T170_sx < drawer.T170_lc3_m*drawer.T170_sy + drawer.T170_lc3_C);
			}

			drawer.T170_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T170_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T170_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T170_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T170_initializedWithValidData = true;
		}

		t = triangles[171]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T171_r = t.r; drawer.T171_g = t.g; drawer.T171_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T171_initializedWithValidData = false;
		} else {

			drawer.T171_sx = (x1 + x2 + x3) / 3.0;
			drawer.T171_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T171_lc1_horizontal = true;
				drawer.T171_lc1_vertical = false;
				drawer.T171_lc1_borderY = y1;
				drawer.T171_lc1_leftOrAbove = (drawer.T171_sy <= y1);
			} else if(x1 == x2) {
				drawer.T171_lc1_horizontal = false;
				drawer.T171_lc1_vertical = true;
				drawer.T171_lc1_borderX = x1;
				drawer.T171_lc1_leftOrAbove = (drawer.T171_sx <= x1);
			} else {
				drawer.T171_lc1_horizontal = false;
				drawer.T171_lc1_vertical = false;
				drawer.T171_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T171_lc1_C = x1 - drawer.T171_lc1_m * y1;
				drawer.T171_lc1_leftOrAbove = (drawer.T171_sx < drawer.T171_lc1_m*drawer.T171_sy + drawer.T171_lc1_C);
			}

			if(y2 == y3) {
				drawer.T171_lc2_horizontal = true;
				drawer.T171_lc2_vertical = false;
				drawer.T171_lc2_borderY = y2;
				drawer.T171_lc2_leftOrAbove = (drawer.T171_sy <= y2);
			} else if(x2 == x3) {
				drawer.T171_lc2_horizontal = false;
				drawer.T171_lc2_vertical = true;
				drawer.T171_lc2_borderX = x2;
				drawer.T171_lc2_leftOrAbove = (drawer.T171_sx <= x2);
			} else {
				drawer.T171_lc2_horizontal = false;
				drawer.T171_lc2_vertical = false;
				drawer.T171_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T171_lc2_C = x2 - drawer.T171_lc2_m * y2;
				drawer.T171_lc2_leftOrAbove = (drawer.T171_sx < drawer.T171_lc2_m*drawer.T171_sy + drawer.T171_lc2_C);
			}

			if(y3 == y1) {
				drawer.T171_lc3_horizontal = true;
				drawer.T171_lc3_vertical = false;
				drawer.T171_lc3_borderY = y3;
				drawer.T171_lc3_leftOrAbove = (drawer.T171_sy <= y3);
			} else if(x3 == x1) {
				drawer.T171_lc3_horizontal = false;
				drawer.T171_lc3_vertical = true;
				drawer.T171_lc3_borderX = x3;
				drawer.T171_lc3_leftOrAbove = (drawer.T171_sx <= x3);
			} else {
				drawer.T171_lc3_horizontal = false;
				drawer.T171_lc3_vertical = false;
				drawer.T171_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T171_lc3_C = x3 - drawer.T171_lc3_m * y3;
				drawer.T171_lc3_leftOrAbove = (drawer.T171_sx < drawer.T171_lc3_m*drawer.T171_sy + drawer.T171_lc3_C);
			}

			drawer.T171_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T171_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T171_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T171_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T171_initializedWithValidData = true;
		}

		t = triangles[172]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T172_r = t.r; drawer.T172_g = t.g; drawer.T172_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T172_initializedWithValidData = false;
		} else {

			drawer.T172_sx = (x1 + x2 + x3) / 3.0;
			drawer.T172_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T172_lc1_horizontal = true;
				drawer.T172_lc1_vertical = false;
				drawer.T172_lc1_borderY = y1;
				drawer.T172_lc1_leftOrAbove = (drawer.T172_sy <= y1);
			} else if(x1 == x2) {
				drawer.T172_lc1_horizontal = false;
				drawer.T172_lc1_vertical = true;
				drawer.T172_lc1_borderX = x1;
				drawer.T172_lc1_leftOrAbove = (drawer.T172_sx <= x1);
			} else {
				drawer.T172_lc1_horizontal = false;
				drawer.T172_lc1_vertical = false;
				drawer.T172_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T172_lc1_C = x1 - drawer.T172_lc1_m * y1;
				drawer.T172_lc1_leftOrAbove = (drawer.T172_sx < drawer.T172_lc1_m*drawer.T172_sy + drawer.T172_lc1_C);
			}

			if(y2 == y3) {
				drawer.T172_lc2_horizontal = true;
				drawer.T172_lc2_vertical = false;
				drawer.T172_lc2_borderY = y2;
				drawer.T172_lc2_leftOrAbove = (drawer.T172_sy <= y2);
			} else if(x2 == x3) {
				drawer.T172_lc2_horizontal = false;
				drawer.T172_lc2_vertical = true;
				drawer.T172_lc2_borderX = x2;
				drawer.T172_lc2_leftOrAbove = (drawer.T172_sx <= x2);
			} else {
				drawer.T172_lc2_horizontal = false;
				drawer.T172_lc2_vertical = false;
				drawer.T172_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T172_lc2_C = x2 - drawer.T172_lc2_m * y2;
				drawer.T172_lc2_leftOrAbove = (drawer.T172_sx < drawer.T172_lc2_m*drawer.T172_sy + drawer.T172_lc2_C);
			}

			if(y3 == y1) {
				drawer.T172_lc3_horizontal = true;
				drawer.T172_lc3_vertical = false;
				drawer.T172_lc3_borderY = y3;
				drawer.T172_lc3_leftOrAbove = (drawer.T172_sy <= y3);
			} else if(x3 == x1) {
				drawer.T172_lc3_horizontal = false;
				drawer.T172_lc3_vertical = true;
				drawer.T172_lc3_borderX = x3;
				drawer.T172_lc3_leftOrAbove = (drawer.T172_sx <= x3);
			} else {
				drawer.T172_lc3_horizontal = false;
				drawer.T172_lc3_vertical = false;
				drawer.T172_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T172_lc3_C = x3 - drawer.T172_lc3_m * y3;
				drawer.T172_lc3_leftOrAbove = (drawer.T172_sx < drawer.T172_lc3_m*drawer.T172_sy + drawer.T172_lc3_C);
			}

			drawer.T172_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T172_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T172_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T172_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T172_initializedWithValidData = true;
		}

		t = triangles[173]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T173_r = t.r; drawer.T173_g = t.g; drawer.T173_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T173_initializedWithValidData = false;
		} else {

			drawer.T173_sx = (x1 + x2 + x3) / 3.0;
			drawer.T173_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T173_lc1_horizontal = true;
				drawer.T173_lc1_vertical = false;
				drawer.T173_lc1_borderY = y1;
				drawer.T173_lc1_leftOrAbove = (drawer.T173_sy <= y1);
			} else if(x1 == x2) {
				drawer.T173_lc1_horizontal = false;
				drawer.T173_lc1_vertical = true;
				drawer.T173_lc1_borderX = x1;
				drawer.T173_lc1_leftOrAbove = (drawer.T173_sx <= x1);
			} else {
				drawer.T173_lc1_horizontal = false;
				drawer.T173_lc1_vertical = false;
				drawer.T173_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T173_lc1_C = x1 - drawer.T173_lc1_m * y1;
				drawer.T173_lc1_leftOrAbove = (drawer.T173_sx < drawer.T173_lc1_m*drawer.T173_sy + drawer.T173_lc1_C);
			}

			if(y2 == y3) {
				drawer.T173_lc2_horizontal = true;
				drawer.T173_lc2_vertical = false;
				drawer.T173_lc2_borderY = y2;
				drawer.T173_lc2_leftOrAbove = (drawer.T173_sy <= y2);
			} else if(x2 == x3) {
				drawer.T173_lc2_horizontal = false;
				drawer.T173_lc2_vertical = true;
				drawer.T173_lc2_borderX = x2;
				drawer.T173_lc2_leftOrAbove = (drawer.T173_sx <= x2);
			} else {
				drawer.T173_lc2_horizontal = false;
				drawer.T173_lc2_vertical = false;
				drawer.T173_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T173_lc2_C = x2 - drawer.T173_lc2_m * y2;
				drawer.T173_lc2_leftOrAbove = (drawer.T173_sx < drawer.T173_lc2_m*drawer.T173_sy + drawer.T173_lc2_C);
			}

			if(y3 == y1) {
				drawer.T173_lc3_horizontal = true;
				drawer.T173_lc3_vertical = false;
				drawer.T173_lc3_borderY = y3;
				drawer.T173_lc3_leftOrAbove = (drawer.T173_sy <= y3);
			} else if(x3 == x1) {
				drawer.T173_lc3_horizontal = false;
				drawer.T173_lc3_vertical = true;
				drawer.T173_lc3_borderX = x3;
				drawer.T173_lc3_leftOrAbove = (drawer.T173_sx <= x3);
			} else {
				drawer.T173_lc3_horizontal = false;
				drawer.T173_lc3_vertical = false;
				drawer.T173_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T173_lc3_C = x3 - drawer.T173_lc3_m * y3;
				drawer.T173_lc3_leftOrAbove = (drawer.T173_sx < drawer.T173_lc3_m*drawer.T173_sy + drawer.T173_lc3_C);
			}

			drawer.T173_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T173_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T173_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T173_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T173_initializedWithValidData = true;
		}

		t = triangles[174]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T174_r = t.r; drawer.T174_g = t.g; drawer.T174_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T174_initializedWithValidData = false;
		} else {

			drawer.T174_sx = (x1 + x2 + x3) / 3.0;
			drawer.T174_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T174_lc1_horizontal = true;
				drawer.T174_lc1_vertical = false;
				drawer.T174_lc1_borderY = y1;
				drawer.T174_lc1_leftOrAbove = (drawer.T174_sy <= y1);
			} else if(x1 == x2) {
				drawer.T174_lc1_horizontal = false;
				drawer.T174_lc1_vertical = true;
				drawer.T174_lc1_borderX = x1;
				drawer.T174_lc1_leftOrAbove = (drawer.T174_sx <= x1);
			} else {
				drawer.T174_lc1_horizontal = false;
				drawer.T174_lc1_vertical = false;
				drawer.T174_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T174_lc1_C = x1 - drawer.T174_lc1_m * y1;
				drawer.T174_lc1_leftOrAbove = (drawer.T174_sx < drawer.T174_lc1_m*drawer.T174_sy + drawer.T174_lc1_C);
			}

			if(y2 == y3) {
				drawer.T174_lc2_horizontal = true;
				drawer.T174_lc2_vertical = false;
				drawer.T174_lc2_borderY = y2;
				drawer.T174_lc2_leftOrAbove = (drawer.T174_sy <= y2);
			} else if(x2 == x3) {
				drawer.T174_lc2_horizontal = false;
				drawer.T174_lc2_vertical = true;
				drawer.T174_lc2_borderX = x2;
				drawer.T174_lc2_leftOrAbove = (drawer.T174_sx <= x2);
			} else {
				drawer.T174_lc2_horizontal = false;
				drawer.T174_lc2_vertical = false;
				drawer.T174_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T174_lc2_C = x2 - drawer.T174_lc2_m * y2;
				drawer.T174_lc2_leftOrAbove = (drawer.T174_sx < drawer.T174_lc2_m*drawer.T174_sy + drawer.T174_lc2_C);
			}

			if(y3 == y1) {
				drawer.T174_lc3_horizontal = true;
				drawer.T174_lc3_vertical = false;
				drawer.T174_lc3_borderY = y3;
				drawer.T174_lc3_leftOrAbove = (drawer.T174_sy <= y3);
			} else if(x3 == x1) {
				drawer.T174_lc3_horizontal = false;
				drawer.T174_lc3_vertical = true;
				drawer.T174_lc3_borderX = x3;
				drawer.T174_lc3_leftOrAbove = (drawer.T174_sx <= x3);
			} else {
				drawer.T174_lc3_horizontal = false;
				drawer.T174_lc3_vertical = false;
				drawer.T174_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T174_lc3_C = x3 - drawer.T174_lc3_m * y3;
				drawer.T174_lc3_leftOrAbove = (drawer.T174_sx < drawer.T174_lc3_m*drawer.T174_sy + drawer.T174_lc3_C);
			}

			drawer.T174_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T174_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T174_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T174_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T174_initializedWithValidData = true;
		}

		t = triangles[175]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T175_r = t.r; drawer.T175_g = t.g; drawer.T175_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T175_initializedWithValidData = false;
		} else {

			drawer.T175_sx = (x1 + x2 + x3) / 3.0;
			drawer.T175_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T175_lc1_horizontal = true;
				drawer.T175_lc1_vertical = false;
				drawer.T175_lc1_borderY = y1;
				drawer.T175_lc1_leftOrAbove = (drawer.T175_sy <= y1);
			} else if(x1 == x2) {
				drawer.T175_lc1_horizontal = false;
				drawer.T175_lc1_vertical = true;
				drawer.T175_lc1_borderX = x1;
				drawer.T175_lc1_leftOrAbove = (drawer.T175_sx <= x1);
			} else {
				drawer.T175_lc1_horizontal = false;
				drawer.T175_lc1_vertical = false;
				drawer.T175_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T175_lc1_C = x1 - drawer.T175_lc1_m * y1;
				drawer.T175_lc1_leftOrAbove = (drawer.T175_sx < drawer.T175_lc1_m*drawer.T175_sy + drawer.T175_lc1_C);
			}

			if(y2 == y3) {
				drawer.T175_lc2_horizontal = true;
				drawer.T175_lc2_vertical = false;
				drawer.T175_lc2_borderY = y2;
				drawer.T175_lc2_leftOrAbove = (drawer.T175_sy <= y2);
			} else if(x2 == x3) {
				drawer.T175_lc2_horizontal = false;
				drawer.T175_lc2_vertical = true;
				drawer.T175_lc2_borderX = x2;
				drawer.T175_lc2_leftOrAbove = (drawer.T175_sx <= x2);
			} else {
				drawer.T175_lc2_horizontal = false;
				drawer.T175_lc2_vertical = false;
				drawer.T175_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T175_lc2_C = x2 - drawer.T175_lc2_m * y2;
				drawer.T175_lc2_leftOrAbove = (drawer.T175_sx < drawer.T175_lc2_m*drawer.T175_sy + drawer.T175_lc2_C);
			}

			if(y3 == y1) {
				drawer.T175_lc3_horizontal = true;
				drawer.T175_lc3_vertical = false;
				drawer.T175_lc3_borderY = y3;
				drawer.T175_lc3_leftOrAbove = (drawer.T175_sy <= y3);
			} else if(x3 == x1) {
				drawer.T175_lc3_horizontal = false;
				drawer.T175_lc3_vertical = true;
				drawer.T175_lc3_borderX = x3;
				drawer.T175_lc3_leftOrAbove = (drawer.T175_sx <= x3);
			} else {
				drawer.T175_lc3_horizontal = false;
				drawer.T175_lc3_vertical = false;
				drawer.T175_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T175_lc3_C = x3 - drawer.T175_lc3_m * y3;
				drawer.T175_lc3_leftOrAbove = (drawer.T175_sx < drawer.T175_lc3_m*drawer.T175_sy + drawer.T175_lc3_C);
			}

			drawer.T175_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T175_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T175_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T175_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T175_initializedWithValidData = true;
		}

		t = triangles[176]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T176_r = t.r; drawer.T176_g = t.g; drawer.T176_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T176_initializedWithValidData = false;
		} else {

			drawer.T176_sx = (x1 + x2 + x3) / 3.0;
			drawer.T176_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T176_lc1_horizontal = true;
				drawer.T176_lc1_vertical = false;
				drawer.T176_lc1_borderY = y1;
				drawer.T176_lc1_leftOrAbove = (drawer.T176_sy <= y1);
			} else if(x1 == x2) {
				drawer.T176_lc1_horizontal = false;
				drawer.T176_lc1_vertical = true;
				drawer.T176_lc1_borderX = x1;
				drawer.T176_lc1_leftOrAbove = (drawer.T176_sx <= x1);
			} else {
				drawer.T176_lc1_horizontal = false;
				drawer.T176_lc1_vertical = false;
				drawer.T176_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T176_lc1_C = x1 - drawer.T176_lc1_m * y1;
				drawer.T176_lc1_leftOrAbove = (drawer.T176_sx < drawer.T176_lc1_m*drawer.T176_sy + drawer.T176_lc1_C);
			}

			if(y2 == y3) {
				drawer.T176_lc2_horizontal = true;
				drawer.T176_lc2_vertical = false;
				drawer.T176_lc2_borderY = y2;
				drawer.T176_lc2_leftOrAbove = (drawer.T176_sy <= y2);
			} else if(x2 == x3) {
				drawer.T176_lc2_horizontal = false;
				drawer.T176_lc2_vertical = true;
				drawer.T176_lc2_borderX = x2;
				drawer.T176_lc2_leftOrAbove = (drawer.T176_sx <= x2);
			} else {
				drawer.T176_lc2_horizontal = false;
				drawer.T176_lc2_vertical = false;
				drawer.T176_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T176_lc2_C = x2 - drawer.T176_lc2_m * y2;
				drawer.T176_lc2_leftOrAbove = (drawer.T176_sx < drawer.T176_lc2_m*drawer.T176_sy + drawer.T176_lc2_C);
			}

			if(y3 == y1) {
				drawer.T176_lc3_horizontal = true;
				drawer.T176_lc3_vertical = false;
				drawer.T176_lc3_borderY = y3;
				drawer.T176_lc3_leftOrAbove = (drawer.T176_sy <= y3);
			} else if(x3 == x1) {
				drawer.T176_lc3_horizontal = false;
				drawer.T176_lc3_vertical = true;
				drawer.T176_lc3_borderX = x3;
				drawer.T176_lc3_leftOrAbove = (drawer.T176_sx <= x3);
			} else {
				drawer.T176_lc3_horizontal = false;
				drawer.T176_lc3_vertical = false;
				drawer.T176_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T176_lc3_C = x3 - drawer.T176_lc3_m * y3;
				drawer.T176_lc3_leftOrAbove = (drawer.T176_sx < drawer.T176_lc3_m*drawer.T176_sy + drawer.T176_lc3_C);
			}

			drawer.T176_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T176_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T176_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T176_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T176_initializedWithValidData = true;
		}

		t = triangles[177]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T177_r = t.r; drawer.T177_g = t.g; drawer.T177_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T177_initializedWithValidData = false;
		} else {

			drawer.T177_sx = (x1 + x2 + x3) / 3.0;
			drawer.T177_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T177_lc1_horizontal = true;
				drawer.T177_lc1_vertical = false;
				drawer.T177_lc1_borderY = y1;
				drawer.T177_lc1_leftOrAbove = (drawer.T177_sy <= y1);
			} else if(x1 == x2) {
				drawer.T177_lc1_horizontal = false;
				drawer.T177_lc1_vertical = true;
				drawer.T177_lc1_borderX = x1;
				drawer.T177_lc1_leftOrAbove = (drawer.T177_sx <= x1);
			} else {
				drawer.T177_lc1_horizontal = false;
				drawer.T177_lc1_vertical = false;
				drawer.T177_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T177_lc1_C = x1 - drawer.T177_lc1_m * y1;
				drawer.T177_lc1_leftOrAbove = (drawer.T177_sx < drawer.T177_lc1_m*drawer.T177_sy + drawer.T177_lc1_C);
			}

			if(y2 == y3) {
				drawer.T177_lc2_horizontal = true;
				drawer.T177_lc2_vertical = false;
				drawer.T177_lc2_borderY = y2;
				drawer.T177_lc2_leftOrAbove = (drawer.T177_sy <= y2);
			} else if(x2 == x3) {
				drawer.T177_lc2_horizontal = false;
				drawer.T177_lc2_vertical = true;
				drawer.T177_lc2_borderX = x2;
				drawer.T177_lc2_leftOrAbove = (drawer.T177_sx <= x2);
			} else {
				drawer.T177_lc2_horizontal = false;
				drawer.T177_lc2_vertical = false;
				drawer.T177_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T177_lc2_C = x2 - drawer.T177_lc2_m * y2;
				drawer.T177_lc2_leftOrAbove = (drawer.T177_sx < drawer.T177_lc2_m*drawer.T177_sy + drawer.T177_lc2_C);
			}

			if(y3 == y1) {
				drawer.T177_lc3_horizontal = true;
				drawer.T177_lc3_vertical = false;
				drawer.T177_lc3_borderY = y3;
				drawer.T177_lc3_leftOrAbove = (drawer.T177_sy <= y3);
			} else if(x3 == x1) {
				drawer.T177_lc3_horizontal = false;
				drawer.T177_lc3_vertical = true;
				drawer.T177_lc3_borderX = x3;
				drawer.T177_lc3_leftOrAbove = (drawer.T177_sx <= x3);
			} else {
				drawer.T177_lc3_horizontal = false;
				drawer.T177_lc3_vertical = false;
				drawer.T177_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T177_lc3_C = x3 - drawer.T177_lc3_m * y3;
				drawer.T177_lc3_leftOrAbove = (drawer.T177_sx < drawer.T177_lc3_m*drawer.T177_sy + drawer.T177_lc3_C);
			}

			drawer.T177_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T177_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T177_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T177_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T177_initializedWithValidData = true;
		}

		t = triangles[178]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T178_r = t.r; drawer.T178_g = t.g; drawer.T178_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T178_initializedWithValidData = false;
		} else {

			drawer.T178_sx = (x1 + x2 + x3) / 3.0;
			drawer.T178_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T178_lc1_horizontal = true;
				drawer.T178_lc1_vertical = false;
				drawer.T178_lc1_borderY = y1;
				drawer.T178_lc1_leftOrAbove = (drawer.T178_sy <= y1);
			} else if(x1 == x2) {
				drawer.T178_lc1_horizontal = false;
				drawer.T178_lc1_vertical = true;
				drawer.T178_lc1_borderX = x1;
				drawer.T178_lc1_leftOrAbove = (drawer.T178_sx <= x1);
			} else {
				drawer.T178_lc1_horizontal = false;
				drawer.T178_lc1_vertical = false;
				drawer.T178_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T178_lc1_C = x1 - drawer.T178_lc1_m * y1;
				drawer.T178_lc1_leftOrAbove = (drawer.T178_sx < drawer.T178_lc1_m*drawer.T178_sy + drawer.T178_lc1_C);
			}

			if(y2 == y3) {
				drawer.T178_lc2_horizontal = true;
				drawer.T178_lc2_vertical = false;
				drawer.T178_lc2_borderY = y2;
				drawer.T178_lc2_leftOrAbove = (drawer.T178_sy <= y2);
			} else if(x2 == x3) {
				drawer.T178_lc2_horizontal = false;
				drawer.T178_lc2_vertical = true;
				drawer.T178_lc2_borderX = x2;
				drawer.T178_lc2_leftOrAbove = (drawer.T178_sx <= x2);
			} else {
				drawer.T178_lc2_horizontal = false;
				drawer.T178_lc2_vertical = false;
				drawer.T178_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T178_lc2_C = x2 - drawer.T178_lc2_m * y2;
				drawer.T178_lc2_leftOrAbove = (drawer.T178_sx < drawer.T178_lc2_m*drawer.T178_sy + drawer.T178_lc2_C);
			}

			if(y3 == y1) {
				drawer.T178_lc3_horizontal = true;
				drawer.T178_lc3_vertical = false;
				drawer.T178_lc3_borderY = y3;
				drawer.T178_lc3_leftOrAbove = (drawer.T178_sy <= y3);
			} else if(x3 == x1) {
				drawer.T178_lc3_horizontal = false;
				drawer.T178_lc3_vertical = true;
				drawer.T178_lc3_borderX = x3;
				drawer.T178_lc3_leftOrAbove = (drawer.T178_sx <= x3);
			} else {
				drawer.T178_lc3_horizontal = false;
				drawer.T178_lc3_vertical = false;
				drawer.T178_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T178_lc3_C = x3 - drawer.T178_lc3_m * y3;
				drawer.T178_lc3_leftOrAbove = (drawer.T178_sx < drawer.T178_lc3_m*drawer.T178_sy + drawer.T178_lc3_C);
			}

			drawer.T178_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T178_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T178_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T178_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T178_initializedWithValidData = true;
		}

		t = triangles[179]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T179_r = t.r; drawer.T179_g = t.g; drawer.T179_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T179_initializedWithValidData = false;
		} else {

			drawer.T179_sx = (x1 + x2 + x3) / 3.0;
			drawer.T179_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T179_lc1_horizontal = true;
				drawer.T179_lc1_vertical = false;
				drawer.T179_lc1_borderY = y1;
				drawer.T179_lc1_leftOrAbove = (drawer.T179_sy <= y1);
			} else if(x1 == x2) {
				drawer.T179_lc1_horizontal = false;
				drawer.T179_lc1_vertical = true;
				drawer.T179_lc1_borderX = x1;
				drawer.T179_lc1_leftOrAbove = (drawer.T179_sx <= x1);
			} else {
				drawer.T179_lc1_horizontal = false;
				drawer.T179_lc1_vertical = false;
				drawer.T179_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T179_lc1_C = x1 - drawer.T179_lc1_m * y1;
				drawer.T179_lc1_leftOrAbove = (drawer.T179_sx < drawer.T179_lc1_m*drawer.T179_sy + drawer.T179_lc1_C);
			}

			if(y2 == y3) {
				drawer.T179_lc2_horizontal = true;
				drawer.T179_lc2_vertical = false;
				drawer.T179_lc2_borderY = y2;
				drawer.T179_lc2_leftOrAbove = (drawer.T179_sy <= y2);
			} else if(x2 == x3) {
				drawer.T179_lc2_horizontal = false;
				drawer.T179_lc2_vertical = true;
				drawer.T179_lc2_borderX = x2;
				drawer.T179_lc2_leftOrAbove = (drawer.T179_sx <= x2);
			} else {
				drawer.T179_lc2_horizontal = false;
				drawer.T179_lc2_vertical = false;
				drawer.T179_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T179_lc2_C = x2 - drawer.T179_lc2_m * y2;
				drawer.T179_lc2_leftOrAbove = (drawer.T179_sx < drawer.T179_lc2_m*drawer.T179_sy + drawer.T179_lc2_C);
			}

			if(y3 == y1) {
				drawer.T179_lc3_horizontal = true;
				drawer.T179_lc3_vertical = false;
				drawer.T179_lc3_borderY = y3;
				drawer.T179_lc3_leftOrAbove = (drawer.T179_sy <= y3);
			} else if(x3 == x1) {
				drawer.T179_lc3_horizontal = false;
				drawer.T179_lc3_vertical = true;
				drawer.T179_lc3_borderX = x3;
				drawer.T179_lc3_leftOrAbove = (drawer.T179_sx <= x3);
			} else {
				drawer.T179_lc3_horizontal = false;
				drawer.T179_lc3_vertical = false;
				drawer.T179_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T179_lc3_C = x3 - drawer.T179_lc3_m * y3;
				drawer.T179_lc3_leftOrAbove = (drawer.T179_sx < drawer.T179_lc3_m*drawer.T179_sy + drawer.T179_lc3_C);
			}

			drawer.T179_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T179_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T179_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T179_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T179_initializedWithValidData = true;
		}
	}

	public void loadTriangles7(SingleTriangle[] triangles) {
		int x1, y1, x2, y2, x3, y3;
		SingleTriangle t;

		t = triangles[180]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T180_r = t.r; drawer.T180_g = t.g; drawer.T180_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T180_initializedWithValidData = false;
		} else {

			drawer.T180_sx = (x1 + x2 + x3) / 3.0;
			drawer.T180_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T180_lc1_horizontal = true;
				drawer.T180_lc1_vertical = false;
				drawer.T180_lc1_borderY = y1;
				drawer.T180_lc1_leftOrAbove = (drawer.T180_sy <= y1);
			} else if(x1 == x2) {
				drawer.T180_lc1_horizontal = false;
				drawer.T180_lc1_vertical = true;
				drawer.T180_lc1_borderX = x1;
				drawer.T180_lc1_leftOrAbove = (drawer.T180_sx <= x1);
			} else {
				drawer.T180_lc1_horizontal = false;
				drawer.T180_lc1_vertical = false;
				drawer.T180_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T180_lc1_C = x1 - drawer.T180_lc1_m * y1;
				drawer.T180_lc1_leftOrAbove = (drawer.T180_sx < drawer.T180_lc1_m*drawer.T180_sy + drawer.T180_lc1_C);
			}

			if(y2 == y3) {
				drawer.T180_lc2_horizontal = true;
				drawer.T180_lc2_vertical = false;
				drawer.T180_lc2_borderY = y2;
				drawer.T180_lc2_leftOrAbove = (drawer.T180_sy <= y2);
			} else if(x2 == x3) {
				drawer.T180_lc2_horizontal = false;
				drawer.T180_lc2_vertical = true;
				drawer.T180_lc2_borderX = x2;
				drawer.T180_lc2_leftOrAbove = (drawer.T180_sx <= x2);
			} else {
				drawer.T180_lc2_horizontal = false;
				drawer.T180_lc2_vertical = false;
				drawer.T180_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T180_lc2_C = x2 - drawer.T180_lc2_m * y2;
				drawer.T180_lc2_leftOrAbove = (drawer.T180_sx < drawer.T180_lc2_m*drawer.T180_sy + drawer.T180_lc2_C);
			}

			if(y3 == y1) {
				drawer.T180_lc3_horizontal = true;
				drawer.T180_lc3_vertical = false;
				drawer.T180_lc3_borderY = y3;
				drawer.T180_lc3_leftOrAbove = (drawer.T180_sy <= y3);
			} else if(x3 == x1) {
				drawer.T180_lc3_horizontal = false;
				drawer.T180_lc3_vertical = true;
				drawer.T180_lc3_borderX = x3;
				drawer.T180_lc3_leftOrAbove = (drawer.T180_sx <= x3);
			} else {
				drawer.T180_lc3_horizontal = false;
				drawer.T180_lc3_vertical = false;
				drawer.T180_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T180_lc3_C = x3 - drawer.T180_lc3_m * y3;
				drawer.T180_lc3_leftOrAbove = (drawer.T180_sx < drawer.T180_lc3_m*drawer.T180_sy + drawer.T180_lc3_C);
			}

			drawer.T180_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T180_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T180_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T180_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T180_initializedWithValidData = true;
		}

		t = triangles[181]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T181_r = t.r; drawer.T181_g = t.g; drawer.T181_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T181_initializedWithValidData = false;
		} else {

			drawer.T181_sx = (x1 + x2 + x3) / 3.0;
			drawer.T181_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T181_lc1_horizontal = true;
				drawer.T181_lc1_vertical = false;
				drawer.T181_lc1_borderY = y1;
				drawer.T181_lc1_leftOrAbove = (drawer.T181_sy <= y1);
			} else if(x1 == x2) {
				drawer.T181_lc1_horizontal = false;
				drawer.T181_lc1_vertical = true;
				drawer.T181_lc1_borderX = x1;
				drawer.T181_lc1_leftOrAbove = (drawer.T181_sx <= x1);
			} else {
				drawer.T181_lc1_horizontal = false;
				drawer.T181_lc1_vertical = false;
				drawer.T181_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T181_lc1_C = x1 - drawer.T181_lc1_m * y1;
				drawer.T181_lc1_leftOrAbove = (drawer.T181_sx < drawer.T181_lc1_m*drawer.T181_sy + drawer.T181_lc1_C);
			}

			if(y2 == y3) {
				drawer.T181_lc2_horizontal = true;
				drawer.T181_lc2_vertical = false;
				drawer.T181_lc2_borderY = y2;
				drawer.T181_lc2_leftOrAbove = (drawer.T181_sy <= y2);
			} else if(x2 == x3) {
				drawer.T181_lc2_horizontal = false;
				drawer.T181_lc2_vertical = true;
				drawer.T181_lc2_borderX = x2;
				drawer.T181_lc2_leftOrAbove = (drawer.T181_sx <= x2);
			} else {
				drawer.T181_lc2_horizontal = false;
				drawer.T181_lc2_vertical = false;
				drawer.T181_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T181_lc2_C = x2 - drawer.T181_lc2_m * y2;
				drawer.T181_lc2_leftOrAbove = (drawer.T181_sx < drawer.T181_lc2_m*drawer.T181_sy + drawer.T181_lc2_C);
			}

			if(y3 == y1) {
				drawer.T181_lc3_horizontal = true;
				drawer.T181_lc3_vertical = false;
				drawer.T181_lc3_borderY = y3;
				drawer.T181_lc3_leftOrAbove = (drawer.T181_sy <= y3);
			} else if(x3 == x1) {
				drawer.T181_lc3_horizontal = false;
				drawer.T181_lc3_vertical = true;
				drawer.T181_lc3_borderX = x3;
				drawer.T181_lc3_leftOrAbove = (drawer.T181_sx <= x3);
			} else {
				drawer.T181_lc3_horizontal = false;
				drawer.T181_lc3_vertical = false;
				drawer.T181_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T181_lc3_C = x3 - drawer.T181_lc3_m * y3;
				drawer.T181_lc3_leftOrAbove = (drawer.T181_sx < drawer.T181_lc3_m*drawer.T181_sy + drawer.T181_lc3_C);
			}

			drawer.T181_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T181_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T181_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T181_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T181_initializedWithValidData = true;
		}

		t = triangles[182]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T182_r = t.r; drawer.T182_g = t.g; drawer.T182_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T182_initializedWithValidData = false;
		} else {

			drawer.T182_sx = (x1 + x2 + x3) / 3.0;
			drawer.T182_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T182_lc1_horizontal = true;
				drawer.T182_lc1_vertical = false;
				drawer.T182_lc1_borderY = y1;
				drawer.T182_lc1_leftOrAbove = (drawer.T182_sy <= y1);
			} else if(x1 == x2) {
				drawer.T182_lc1_horizontal = false;
				drawer.T182_lc1_vertical = true;
				drawer.T182_lc1_borderX = x1;
				drawer.T182_lc1_leftOrAbove = (drawer.T182_sx <= x1);
			} else {
				drawer.T182_lc1_horizontal = false;
				drawer.T182_lc1_vertical = false;
				drawer.T182_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T182_lc1_C = x1 - drawer.T182_lc1_m * y1;
				drawer.T182_lc1_leftOrAbove = (drawer.T182_sx < drawer.T182_lc1_m*drawer.T182_sy + drawer.T182_lc1_C);
			}

			if(y2 == y3) {
				drawer.T182_lc2_horizontal = true;
				drawer.T182_lc2_vertical = false;
				drawer.T182_lc2_borderY = y2;
				drawer.T182_lc2_leftOrAbove = (drawer.T182_sy <= y2);
			} else if(x2 == x3) {
				drawer.T182_lc2_horizontal = false;
				drawer.T182_lc2_vertical = true;
				drawer.T182_lc2_borderX = x2;
				drawer.T182_lc2_leftOrAbove = (drawer.T182_sx <= x2);
			} else {
				drawer.T182_lc2_horizontal = false;
				drawer.T182_lc2_vertical = false;
				drawer.T182_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T182_lc2_C = x2 - drawer.T182_lc2_m * y2;
				drawer.T182_lc2_leftOrAbove = (drawer.T182_sx < drawer.T182_lc2_m*drawer.T182_sy + drawer.T182_lc2_C);
			}

			if(y3 == y1) {
				drawer.T182_lc3_horizontal = true;
				drawer.T182_lc3_vertical = false;
				drawer.T182_lc3_borderY = y3;
				drawer.T182_lc3_leftOrAbove = (drawer.T182_sy <= y3);
			} else if(x3 == x1) {
				drawer.T182_lc3_horizontal = false;
				drawer.T182_lc3_vertical = true;
				drawer.T182_lc3_borderX = x3;
				drawer.T182_lc3_leftOrAbove = (drawer.T182_sx <= x3);
			} else {
				drawer.T182_lc3_horizontal = false;
				drawer.T182_lc3_vertical = false;
				drawer.T182_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T182_lc3_C = x3 - drawer.T182_lc3_m * y3;
				drawer.T182_lc3_leftOrAbove = (drawer.T182_sx < drawer.T182_lc3_m*drawer.T182_sy + drawer.T182_lc3_C);
			}

			drawer.T182_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T182_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T182_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T182_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T182_initializedWithValidData = true;
		}

		t = triangles[183]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T183_r = t.r; drawer.T183_g = t.g; drawer.T183_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T183_initializedWithValidData = false;
		} else {

			drawer.T183_sx = (x1 + x2 + x3) / 3.0;
			drawer.T183_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T183_lc1_horizontal = true;
				drawer.T183_lc1_vertical = false;
				drawer.T183_lc1_borderY = y1;
				drawer.T183_lc1_leftOrAbove = (drawer.T183_sy <= y1);
			} else if(x1 == x2) {
				drawer.T183_lc1_horizontal = false;
				drawer.T183_lc1_vertical = true;
				drawer.T183_lc1_borderX = x1;
				drawer.T183_lc1_leftOrAbove = (drawer.T183_sx <= x1);
			} else {
				drawer.T183_lc1_horizontal = false;
				drawer.T183_lc1_vertical = false;
				drawer.T183_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T183_lc1_C = x1 - drawer.T183_lc1_m * y1;
				drawer.T183_lc1_leftOrAbove = (drawer.T183_sx < drawer.T183_lc1_m*drawer.T183_sy + drawer.T183_lc1_C);
			}

			if(y2 == y3) {
				drawer.T183_lc2_horizontal = true;
				drawer.T183_lc2_vertical = false;
				drawer.T183_lc2_borderY = y2;
				drawer.T183_lc2_leftOrAbove = (drawer.T183_sy <= y2);
			} else if(x2 == x3) {
				drawer.T183_lc2_horizontal = false;
				drawer.T183_lc2_vertical = true;
				drawer.T183_lc2_borderX = x2;
				drawer.T183_lc2_leftOrAbove = (drawer.T183_sx <= x2);
			} else {
				drawer.T183_lc2_horizontal = false;
				drawer.T183_lc2_vertical = false;
				drawer.T183_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T183_lc2_C = x2 - drawer.T183_lc2_m * y2;
				drawer.T183_lc2_leftOrAbove = (drawer.T183_sx < drawer.T183_lc2_m*drawer.T183_sy + drawer.T183_lc2_C);
			}

			if(y3 == y1) {
				drawer.T183_lc3_horizontal = true;
				drawer.T183_lc3_vertical = false;
				drawer.T183_lc3_borderY = y3;
				drawer.T183_lc3_leftOrAbove = (drawer.T183_sy <= y3);
			} else if(x3 == x1) {
				drawer.T183_lc3_horizontal = false;
				drawer.T183_lc3_vertical = true;
				drawer.T183_lc3_borderX = x3;
				drawer.T183_lc3_leftOrAbove = (drawer.T183_sx <= x3);
			} else {
				drawer.T183_lc3_horizontal = false;
				drawer.T183_lc3_vertical = false;
				drawer.T183_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T183_lc3_C = x3 - drawer.T183_lc3_m * y3;
				drawer.T183_lc3_leftOrAbove = (drawer.T183_sx < drawer.T183_lc3_m*drawer.T183_sy + drawer.T183_lc3_C);
			}

			drawer.T183_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T183_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T183_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T183_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T183_initializedWithValidData = true;
		}

		t = triangles[184]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T184_r = t.r; drawer.T184_g = t.g; drawer.T184_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T184_initializedWithValidData = false;
		} else {

			drawer.T184_sx = (x1 + x2 + x3) / 3.0;
			drawer.T184_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T184_lc1_horizontal = true;
				drawer.T184_lc1_vertical = false;
				drawer.T184_lc1_borderY = y1;
				drawer.T184_lc1_leftOrAbove = (drawer.T184_sy <= y1);
			} else if(x1 == x2) {
				drawer.T184_lc1_horizontal = false;
				drawer.T184_lc1_vertical = true;
				drawer.T184_lc1_borderX = x1;
				drawer.T184_lc1_leftOrAbove = (drawer.T184_sx <= x1);
			} else {
				drawer.T184_lc1_horizontal = false;
				drawer.T184_lc1_vertical = false;
				drawer.T184_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T184_lc1_C = x1 - drawer.T184_lc1_m * y1;
				drawer.T184_lc1_leftOrAbove = (drawer.T184_sx < drawer.T184_lc1_m*drawer.T184_sy + drawer.T184_lc1_C);
			}

			if(y2 == y3) {
				drawer.T184_lc2_horizontal = true;
				drawer.T184_lc2_vertical = false;
				drawer.T184_lc2_borderY = y2;
				drawer.T184_lc2_leftOrAbove = (drawer.T184_sy <= y2);
			} else if(x2 == x3) {
				drawer.T184_lc2_horizontal = false;
				drawer.T184_lc2_vertical = true;
				drawer.T184_lc2_borderX = x2;
				drawer.T184_lc2_leftOrAbove = (drawer.T184_sx <= x2);
			} else {
				drawer.T184_lc2_horizontal = false;
				drawer.T184_lc2_vertical = false;
				drawer.T184_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T184_lc2_C = x2 - drawer.T184_lc2_m * y2;
				drawer.T184_lc2_leftOrAbove = (drawer.T184_sx < drawer.T184_lc2_m*drawer.T184_sy + drawer.T184_lc2_C);
			}

			if(y3 == y1) {
				drawer.T184_lc3_horizontal = true;
				drawer.T184_lc3_vertical = false;
				drawer.T184_lc3_borderY = y3;
				drawer.T184_lc3_leftOrAbove = (drawer.T184_sy <= y3);
			} else if(x3 == x1) {
				drawer.T184_lc3_horizontal = false;
				drawer.T184_lc3_vertical = true;
				drawer.T184_lc3_borderX = x3;
				drawer.T184_lc3_leftOrAbove = (drawer.T184_sx <= x3);
			} else {
				drawer.T184_lc3_horizontal = false;
				drawer.T184_lc3_vertical = false;
				drawer.T184_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T184_lc3_C = x3 - drawer.T184_lc3_m * y3;
				drawer.T184_lc3_leftOrAbove = (drawer.T184_sx < drawer.T184_lc3_m*drawer.T184_sy + drawer.T184_lc3_C);
			}

			drawer.T184_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T184_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T184_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T184_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T184_initializedWithValidData = true;
		}

		t = triangles[185]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T185_r = t.r; drawer.T185_g = t.g; drawer.T185_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T185_initializedWithValidData = false;
		} else {

			drawer.T185_sx = (x1 + x2 + x3) / 3.0;
			drawer.T185_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T185_lc1_horizontal = true;
				drawer.T185_lc1_vertical = false;
				drawer.T185_lc1_borderY = y1;
				drawer.T185_lc1_leftOrAbove = (drawer.T185_sy <= y1);
			} else if(x1 == x2) {
				drawer.T185_lc1_horizontal = false;
				drawer.T185_lc1_vertical = true;
				drawer.T185_lc1_borderX = x1;
				drawer.T185_lc1_leftOrAbove = (drawer.T185_sx <= x1);
			} else {
				drawer.T185_lc1_horizontal = false;
				drawer.T185_lc1_vertical = false;
				drawer.T185_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T185_lc1_C = x1 - drawer.T185_lc1_m * y1;
				drawer.T185_lc1_leftOrAbove = (drawer.T185_sx < drawer.T185_lc1_m*drawer.T185_sy + drawer.T185_lc1_C);
			}

			if(y2 == y3) {
				drawer.T185_lc2_horizontal = true;
				drawer.T185_lc2_vertical = false;
				drawer.T185_lc2_borderY = y2;
				drawer.T185_lc2_leftOrAbove = (drawer.T185_sy <= y2);
			} else if(x2 == x3) {
				drawer.T185_lc2_horizontal = false;
				drawer.T185_lc2_vertical = true;
				drawer.T185_lc2_borderX = x2;
				drawer.T185_lc2_leftOrAbove = (drawer.T185_sx <= x2);
			} else {
				drawer.T185_lc2_horizontal = false;
				drawer.T185_lc2_vertical = false;
				drawer.T185_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T185_lc2_C = x2 - drawer.T185_lc2_m * y2;
				drawer.T185_lc2_leftOrAbove = (drawer.T185_sx < drawer.T185_lc2_m*drawer.T185_sy + drawer.T185_lc2_C);
			}

			if(y3 == y1) {
				drawer.T185_lc3_horizontal = true;
				drawer.T185_lc3_vertical = false;
				drawer.T185_lc3_borderY = y3;
				drawer.T185_lc3_leftOrAbove = (drawer.T185_sy <= y3);
			} else if(x3 == x1) {
				drawer.T185_lc3_horizontal = false;
				drawer.T185_lc3_vertical = true;
				drawer.T185_lc3_borderX = x3;
				drawer.T185_lc3_leftOrAbove = (drawer.T185_sx <= x3);
			} else {
				drawer.T185_lc3_horizontal = false;
				drawer.T185_lc3_vertical = false;
				drawer.T185_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T185_lc3_C = x3 - drawer.T185_lc3_m * y3;
				drawer.T185_lc3_leftOrAbove = (drawer.T185_sx < drawer.T185_lc3_m*drawer.T185_sy + drawer.T185_lc3_C);
			}

			drawer.T185_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T185_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T185_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T185_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T185_initializedWithValidData = true;
		}

		t = triangles[186]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T186_r = t.r; drawer.T186_g = t.g; drawer.T186_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T186_initializedWithValidData = false;
		} else {

			drawer.T186_sx = (x1 + x2 + x3) / 3.0;
			drawer.T186_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T186_lc1_horizontal = true;
				drawer.T186_lc1_vertical = false;
				drawer.T186_lc1_borderY = y1;
				drawer.T186_lc1_leftOrAbove = (drawer.T186_sy <= y1);
			} else if(x1 == x2) {
				drawer.T186_lc1_horizontal = false;
				drawer.T186_lc1_vertical = true;
				drawer.T186_lc1_borderX = x1;
				drawer.T186_lc1_leftOrAbove = (drawer.T186_sx <= x1);
			} else {
				drawer.T186_lc1_horizontal = false;
				drawer.T186_lc1_vertical = false;
				drawer.T186_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T186_lc1_C = x1 - drawer.T186_lc1_m * y1;
				drawer.T186_lc1_leftOrAbove = (drawer.T186_sx < drawer.T186_lc1_m*drawer.T186_sy + drawer.T186_lc1_C);
			}

			if(y2 == y3) {
				drawer.T186_lc2_horizontal = true;
				drawer.T186_lc2_vertical = false;
				drawer.T186_lc2_borderY = y2;
				drawer.T186_lc2_leftOrAbove = (drawer.T186_sy <= y2);
			} else if(x2 == x3) {
				drawer.T186_lc2_horizontal = false;
				drawer.T186_lc2_vertical = true;
				drawer.T186_lc2_borderX = x2;
				drawer.T186_lc2_leftOrAbove = (drawer.T186_sx <= x2);
			} else {
				drawer.T186_lc2_horizontal = false;
				drawer.T186_lc2_vertical = false;
				drawer.T186_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T186_lc2_C = x2 - drawer.T186_lc2_m * y2;
				drawer.T186_lc2_leftOrAbove = (drawer.T186_sx < drawer.T186_lc2_m*drawer.T186_sy + drawer.T186_lc2_C);
			}

			if(y3 == y1) {
				drawer.T186_lc3_horizontal = true;
				drawer.T186_lc3_vertical = false;
				drawer.T186_lc3_borderY = y3;
				drawer.T186_lc3_leftOrAbove = (drawer.T186_sy <= y3);
			} else if(x3 == x1) {
				drawer.T186_lc3_horizontal = false;
				drawer.T186_lc3_vertical = true;
				drawer.T186_lc3_borderX = x3;
				drawer.T186_lc3_leftOrAbove = (drawer.T186_sx <= x3);
			} else {
				drawer.T186_lc3_horizontal = false;
				drawer.T186_lc3_vertical = false;
				drawer.T186_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T186_lc3_C = x3 - drawer.T186_lc3_m * y3;
				drawer.T186_lc3_leftOrAbove = (drawer.T186_sx < drawer.T186_lc3_m*drawer.T186_sy + drawer.T186_lc3_C);
			}

			drawer.T186_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T186_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T186_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T186_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T186_initializedWithValidData = true;
		}

		t = triangles[187]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T187_r = t.r; drawer.T187_g = t.g; drawer.T187_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T187_initializedWithValidData = false;
		} else {

			drawer.T187_sx = (x1 + x2 + x3) / 3.0;
			drawer.T187_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T187_lc1_horizontal = true;
				drawer.T187_lc1_vertical = false;
				drawer.T187_lc1_borderY = y1;
				drawer.T187_lc1_leftOrAbove = (drawer.T187_sy <= y1);
			} else if(x1 == x2) {
				drawer.T187_lc1_horizontal = false;
				drawer.T187_lc1_vertical = true;
				drawer.T187_lc1_borderX = x1;
				drawer.T187_lc1_leftOrAbove = (drawer.T187_sx <= x1);
			} else {
				drawer.T187_lc1_horizontal = false;
				drawer.T187_lc1_vertical = false;
				drawer.T187_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T187_lc1_C = x1 - drawer.T187_lc1_m * y1;
				drawer.T187_lc1_leftOrAbove = (drawer.T187_sx < drawer.T187_lc1_m*drawer.T187_sy + drawer.T187_lc1_C);
			}

			if(y2 == y3) {
				drawer.T187_lc2_horizontal = true;
				drawer.T187_lc2_vertical = false;
				drawer.T187_lc2_borderY = y2;
				drawer.T187_lc2_leftOrAbove = (drawer.T187_sy <= y2);
			} else if(x2 == x3) {
				drawer.T187_lc2_horizontal = false;
				drawer.T187_lc2_vertical = true;
				drawer.T187_lc2_borderX = x2;
				drawer.T187_lc2_leftOrAbove = (drawer.T187_sx <= x2);
			} else {
				drawer.T187_lc2_horizontal = false;
				drawer.T187_lc2_vertical = false;
				drawer.T187_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T187_lc2_C = x2 - drawer.T187_lc2_m * y2;
				drawer.T187_lc2_leftOrAbove = (drawer.T187_sx < drawer.T187_lc2_m*drawer.T187_sy + drawer.T187_lc2_C);
			}

			if(y3 == y1) {
				drawer.T187_lc3_horizontal = true;
				drawer.T187_lc3_vertical = false;
				drawer.T187_lc3_borderY = y3;
				drawer.T187_lc3_leftOrAbove = (drawer.T187_sy <= y3);
			} else if(x3 == x1) {
				drawer.T187_lc3_horizontal = false;
				drawer.T187_lc3_vertical = true;
				drawer.T187_lc3_borderX = x3;
				drawer.T187_lc3_leftOrAbove = (drawer.T187_sx <= x3);
			} else {
				drawer.T187_lc3_horizontal = false;
				drawer.T187_lc3_vertical = false;
				drawer.T187_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T187_lc3_C = x3 - drawer.T187_lc3_m * y3;
				drawer.T187_lc3_leftOrAbove = (drawer.T187_sx < drawer.T187_lc3_m*drawer.T187_sy + drawer.T187_lc3_C);
			}

			drawer.T187_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T187_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T187_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T187_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T187_initializedWithValidData = true;
		}

		t = triangles[188]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T188_r = t.r; drawer.T188_g = t.g; drawer.T188_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T188_initializedWithValidData = false;
		} else {

			drawer.T188_sx = (x1 + x2 + x3) / 3.0;
			drawer.T188_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T188_lc1_horizontal = true;
				drawer.T188_lc1_vertical = false;
				drawer.T188_lc1_borderY = y1;
				drawer.T188_lc1_leftOrAbove = (drawer.T188_sy <= y1);
			} else if(x1 == x2) {
				drawer.T188_lc1_horizontal = false;
				drawer.T188_lc1_vertical = true;
				drawer.T188_lc1_borderX = x1;
				drawer.T188_lc1_leftOrAbove = (drawer.T188_sx <= x1);
			} else {
				drawer.T188_lc1_horizontal = false;
				drawer.T188_lc1_vertical = false;
				drawer.T188_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T188_lc1_C = x1 - drawer.T188_lc1_m * y1;
				drawer.T188_lc1_leftOrAbove = (drawer.T188_sx < drawer.T188_lc1_m*drawer.T188_sy + drawer.T188_lc1_C);
			}

			if(y2 == y3) {
				drawer.T188_lc2_horizontal = true;
				drawer.T188_lc2_vertical = false;
				drawer.T188_lc2_borderY = y2;
				drawer.T188_lc2_leftOrAbove = (drawer.T188_sy <= y2);
			} else if(x2 == x3) {
				drawer.T188_lc2_horizontal = false;
				drawer.T188_lc2_vertical = true;
				drawer.T188_lc2_borderX = x2;
				drawer.T188_lc2_leftOrAbove = (drawer.T188_sx <= x2);
			} else {
				drawer.T188_lc2_horizontal = false;
				drawer.T188_lc2_vertical = false;
				drawer.T188_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T188_lc2_C = x2 - drawer.T188_lc2_m * y2;
				drawer.T188_lc2_leftOrAbove = (drawer.T188_sx < drawer.T188_lc2_m*drawer.T188_sy + drawer.T188_lc2_C);
			}

			if(y3 == y1) {
				drawer.T188_lc3_horizontal = true;
				drawer.T188_lc3_vertical = false;
				drawer.T188_lc3_borderY = y3;
				drawer.T188_lc3_leftOrAbove = (drawer.T188_sy <= y3);
			} else if(x3 == x1) {
				drawer.T188_lc3_horizontal = false;
				drawer.T188_lc3_vertical = true;
				drawer.T188_lc3_borderX = x3;
				drawer.T188_lc3_leftOrAbove = (drawer.T188_sx <= x3);
			} else {
				drawer.T188_lc3_horizontal = false;
				drawer.T188_lc3_vertical = false;
				drawer.T188_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T188_lc3_C = x3 - drawer.T188_lc3_m * y3;
				drawer.T188_lc3_leftOrAbove = (drawer.T188_sx < drawer.T188_lc3_m*drawer.T188_sy + drawer.T188_lc3_C);
			}

			drawer.T188_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T188_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T188_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T188_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T188_initializedWithValidData = true;
		}

		t = triangles[189]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T189_r = t.r; drawer.T189_g = t.g; drawer.T189_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T189_initializedWithValidData = false;
		} else {

			drawer.T189_sx = (x1 + x2 + x3) / 3.0;
			drawer.T189_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T189_lc1_horizontal = true;
				drawer.T189_lc1_vertical = false;
				drawer.T189_lc1_borderY = y1;
				drawer.T189_lc1_leftOrAbove = (drawer.T189_sy <= y1);
			} else if(x1 == x2) {
				drawer.T189_lc1_horizontal = false;
				drawer.T189_lc1_vertical = true;
				drawer.T189_lc1_borderX = x1;
				drawer.T189_lc1_leftOrAbove = (drawer.T189_sx <= x1);
			} else {
				drawer.T189_lc1_horizontal = false;
				drawer.T189_lc1_vertical = false;
				drawer.T189_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T189_lc1_C = x1 - drawer.T189_lc1_m * y1;
				drawer.T189_lc1_leftOrAbove = (drawer.T189_sx < drawer.T189_lc1_m*drawer.T189_sy + drawer.T189_lc1_C);
			}

			if(y2 == y3) {
				drawer.T189_lc2_horizontal = true;
				drawer.T189_lc2_vertical = false;
				drawer.T189_lc2_borderY = y2;
				drawer.T189_lc2_leftOrAbove = (drawer.T189_sy <= y2);
			} else if(x2 == x3) {
				drawer.T189_lc2_horizontal = false;
				drawer.T189_lc2_vertical = true;
				drawer.T189_lc2_borderX = x2;
				drawer.T189_lc2_leftOrAbove = (drawer.T189_sx <= x2);
			} else {
				drawer.T189_lc2_horizontal = false;
				drawer.T189_lc2_vertical = false;
				drawer.T189_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T189_lc2_C = x2 - drawer.T189_lc2_m * y2;
				drawer.T189_lc2_leftOrAbove = (drawer.T189_sx < drawer.T189_lc2_m*drawer.T189_sy + drawer.T189_lc2_C);
			}

			if(y3 == y1) {
				drawer.T189_lc3_horizontal = true;
				drawer.T189_lc3_vertical = false;
				drawer.T189_lc3_borderY = y3;
				drawer.T189_lc3_leftOrAbove = (drawer.T189_sy <= y3);
			} else if(x3 == x1) {
				drawer.T189_lc3_horizontal = false;
				drawer.T189_lc3_vertical = true;
				drawer.T189_lc3_borderX = x3;
				drawer.T189_lc3_leftOrAbove = (drawer.T189_sx <= x3);
			} else {
				drawer.T189_lc3_horizontal = false;
				drawer.T189_lc3_vertical = false;
				drawer.T189_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T189_lc3_C = x3 - drawer.T189_lc3_m * y3;
				drawer.T189_lc3_leftOrAbove = (drawer.T189_sx < drawer.T189_lc3_m*drawer.T189_sy + drawer.T189_lc3_C);
			}

			drawer.T189_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T189_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T189_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T189_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T189_initializedWithValidData = true;
		}

		t = triangles[190]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T190_r = t.r; drawer.T190_g = t.g; drawer.T190_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T190_initializedWithValidData = false;
		} else {

			drawer.T190_sx = (x1 + x2 + x3) / 3.0;
			drawer.T190_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T190_lc1_horizontal = true;
				drawer.T190_lc1_vertical = false;
				drawer.T190_lc1_borderY = y1;
				drawer.T190_lc1_leftOrAbove = (drawer.T190_sy <= y1);
			} else if(x1 == x2) {
				drawer.T190_lc1_horizontal = false;
				drawer.T190_lc1_vertical = true;
				drawer.T190_lc1_borderX = x1;
				drawer.T190_lc1_leftOrAbove = (drawer.T190_sx <= x1);
			} else {
				drawer.T190_lc1_horizontal = false;
				drawer.T190_lc1_vertical = false;
				drawer.T190_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T190_lc1_C = x1 - drawer.T190_lc1_m * y1;
				drawer.T190_lc1_leftOrAbove = (drawer.T190_sx < drawer.T190_lc1_m*drawer.T190_sy + drawer.T190_lc1_C);
			}

			if(y2 == y3) {
				drawer.T190_lc2_horizontal = true;
				drawer.T190_lc2_vertical = false;
				drawer.T190_lc2_borderY = y2;
				drawer.T190_lc2_leftOrAbove = (drawer.T190_sy <= y2);
			} else if(x2 == x3) {
				drawer.T190_lc2_horizontal = false;
				drawer.T190_lc2_vertical = true;
				drawer.T190_lc2_borderX = x2;
				drawer.T190_lc2_leftOrAbove = (drawer.T190_sx <= x2);
			} else {
				drawer.T190_lc2_horizontal = false;
				drawer.T190_lc2_vertical = false;
				drawer.T190_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T190_lc2_C = x2 - drawer.T190_lc2_m * y2;
				drawer.T190_lc2_leftOrAbove = (drawer.T190_sx < drawer.T190_lc2_m*drawer.T190_sy + drawer.T190_lc2_C);
			}

			if(y3 == y1) {
				drawer.T190_lc3_horizontal = true;
				drawer.T190_lc3_vertical = false;
				drawer.T190_lc3_borderY = y3;
				drawer.T190_lc3_leftOrAbove = (drawer.T190_sy <= y3);
			} else if(x3 == x1) {
				drawer.T190_lc3_horizontal = false;
				drawer.T190_lc3_vertical = true;
				drawer.T190_lc3_borderX = x3;
				drawer.T190_lc3_leftOrAbove = (drawer.T190_sx <= x3);
			} else {
				drawer.T190_lc3_horizontal = false;
				drawer.T190_lc3_vertical = false;
				drawer.T190_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T190_lc3_C = x3 - drawer.T190_lc3_m * y3;
				drawer.T190_lc3_leftOrAbove = (drawer.T190_sx < drawer.T190_lc3_m*drawer.T190_sy + drawer.T190_lc3_C);
			}

			drawer.T190_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T190_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T190_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T190_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T190_initializedWithValidData = true;
		}

		t = triangles[191]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T191_r = t.r; drawer.T191_g = t.g; drawer.T191_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T191_initializedWithValidData = false;
		} else {

			drawer.T191_sx = (x1 + x2 + x3) / 3.0;
			drawer.T191_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T191_lc1_horizontal = true;
				drawer.T191_lc1_vertical = false;
				drawer.T191_lc1_borderY = y1;
				drawer.T191_lc1_leftOrAbove = (drawer.T191_sy <= y1);
			} else if(x1 == x2) {
				drawer.T191_lc1_horizontal = false;
				drawer.T191_lc1_vertical = true;
				drawer.T191_lc1_borderX = x1;
				drawer.T191_lc1_leftOrAbove = (drawer.T191_sx <= x1);
			} else {
				drawer.T191_lc1_horizontal = false;
				drawer.T191_lc1_vertical = false;
				drawer.T191_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T191_lc1_C = x1 - drawer.T191_lc1_m * y1;
				drawer.T191_lc1_leftOrAbove = (drawer.T191_sx < drawer.T191_lc1_m*drawer.T191_sy + drawer.T191_lc1_C);
			}

			if(y2 == y3) {
				drawer.T191_lc2_horizontal = true;
				drawer.T191_lc2_vertical = false;
				drawer.T191_lc2_borderY = y2;
				drawer.T191_lc2_leftOrAbove = (drawer.T191_sy <= y2);
			} else if(x2 == x3) {
				drawer.T191_lc2_horizontal = false;
				drawer.T191_lc2_vertical = true;
				drawer.T191_lc2_borderX = x2;
				drawer.T191_lc2_leftOrAbove = (drawer.T191_sx <= x2);
			} else {
				drawer.T191_lc2_horizontal = false;
				drawer.T191_lc2_vertical = false;
				drawer.T191_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T191_lc2_C = x2 - drawer.T191_lc2_m * y2;
				drawer.T191_lc2_leftOrAbove = (drawer.T191_sx < drawer.T191_lc2_m*drawer.T191_sy + drawer.T191_lc2_C);
			}

			if(y3 == y1) {
				drawer.T191_lc3_horizontal = true;
				drawer.T191_lc3_vertical = false;
				drawer.T191_lc3_borderY = y3;
				drawer.T191_lc3_leftOrAbove = (drawer.T191_sy <= y3);
			} else if(x3 == x1) {
				drawer.T191_lc3_horizontal = false;
				drawer.T191_lc3_vertical = true;
				drawer.T191_lc3_borderX = x3;
				drawer.T191_lc3_leftOrAbove = (drawer.T191_sx <= x3);
			} else {
				drawer.T191_lc3_horizontal = false;
				drawer.T191_lc3_vertical = false;
				drawer.T191_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T191_lc3_C = x3 - drawer.T191_lc3_m * y3;
				drawer.T191_lc3_leftOrAbove = (drawer.T191_sx < drawer.T191_lc3_m*drawer.T191_sy + drawer.T191_lc3_C);
			}

			drawer.T191_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T191_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T191_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T191_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T191_initializedWithValidData = true;
		}

		t = triangles[192]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T192_r = t.r; drawer.T192_g = t.g; drawer.T192_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T192_initializedWithValidData = false;
		} else {

			drawer.T192_sx = (x1 + x2 + x3) / 3.0;
			drawer.T192_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T192_lc1_horizontal = true;
				drawer.T192_lc1_vertical = false;
				drawer.T192_lc1_borderY = y1;
				drawer.T192_lc1_leftOrAbove = (drawer.T192_sy <= y1);
			} else if(x1 == x2) {
				drawer.T192_lc1_horizontal = false;
				drawer.T192_lc1_vertical = true;
				drawer.T192_lc1_borderX = x1;
				drawer.T192_lc1_leftOrAbove = (drawer.T192_sx <= x1);
			} else {
				drawer.T192_lc1_horizontal = false;
				drawer.T192_lc1_vertical = false;
				drawer.T192_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T192_lc1_C = x1 - drawer.T192_lc1_m * y1;
				drawer.T192_lc1_leftOrAbove = (drawer.T192_sx < drawer.T192_lc1_m*drawer.T192_sy + drawer.T192_lc1_C);
			}

			if(y2 == y3) {
				drawer.T192_lc2_horizontal = true;
				drawer.T192_lc2_vertical = false;
				drawer.T192_lc2_borderY = y2;
				drawer.T192_lc2_leftOrAbove = (drawer.T192_sy <= y2);
			} else if(x2 == x3) {
				drawer.T192_lc2_horizontal = false;
				drawer.T192_lc2_vertical = true;
				drawer.T192_lc2_borderX = x2;
				drawer.T192_lc2_leftOrAbove = (drawer.T192_sx <= x2);
			} else {
				drawer.T192_lc2_horizontal = false;
				drawer.T192_lc2_vertical = false;
				drawer.T192_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T192_lc2_C = x2 - drawer.T192_lc2_m * y2;
				drawer.T192_lc2_leftOrAbove = (drawer.T192_sx < drawer.T192_lc2_m*drawer.T192_sy + drawer.T192_lc2_C);
			}

			if(y3 == y1) {
				drawer.T192_lc3_horizontal = true;
				drawer.T192_lc3_vertical = false;
				drawer.T192_lc3_borderY = y3;
				drawer.T192_lc3_leftOrAbove = (drawer.T192_sy <= y3);
			} else if(x3 == x1) {
				drawer.T192_lc3_horizontal = false;
				drawer.T192_lc3_vertical = true;
				drawer.T192_lc3_borderX = x3;
				drawer.T192_lc3_leftOrAbove = (drawer.T192_sx <= x3);
			} else {
				drawer.T192_lc3_horizontal = false;
				drawer.T192_lc3_vertical = false;
				drawer.T192_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T192_lc3_C = x3 - drawer.T192_lc3_m * y3;
				drawer.T192_lc3_leftOrAbove = (drawer.T192_sx < drawer.T192_lc3_m*drawer.T192_sy + drawer.T192_lc3_C);
			}

			drawer.T192_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T192_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T192_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T192_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T192_initializedWithValidData = true;
		}

		t = triangles[193]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T193_r = t.r; drawer.T193_g = t.g; drawer.T193_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T193_initializedWithValidData = false;
		} else {

			drawer.T193_sx = (x1 + x2 + x3) / 3.0;
			drawer.T193_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T193_lc1_horizontal = true;
				drawer.T193_lc1_vertical = false;
				drawer.T193_lc1_borderY = y1;
				drawer.T193_lc1_leftOrAbove = (drawer.T193_sy <= y1);
			} else if(x1 == x2) {
				drawer.T193_lc1_horizontal = false;
				drawer.T193_lc1_vertical = true;
				drawer.T193_lc1_borderX = x1;
				drawer.T193_lc1_leftOrAbove = (drawer.T193_sx <= x1);
			} else {
				drawer.T193_lc1_horizontal = false;
				drawer.T193_lc1_vertical = false;
				drawer.T193_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T193_lc1_C = x1 - drawer.T193_lc1_m * y1;
				drawer.T193_lc1_leftOrAbove = (drawer.T193_sx < drawer.T193_lc1_m*drawer.T193_sy + drawer.T193_lc1_C);
			}

			if(y2 == y3) {
				drawer.T193_lc2_horizontal = true;
				drawer.T193_lc2_vertical = false;
				drawer.T193_lc2_borderY = y2;
				drawer.T193_lc2_leftOrAbove = (drawer.T193_sy <= y2);
			} else if(x2 == x3) {
				drawer.T193_lc2_horizontal = false;
				drawer.T193_lc2_vertical = true;
				drawer.T193_lc2_borderX = x2;
				drawer.T193_lc2_leftOrAbove = (drawer.T193_sx <= x2);
			} else {
				drawer.T193_lc2_horizontal = false;
				drawer.T193_lc2_vertical = false;
				drawer.T193_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T193_lc2_C = x2 - drawer.T193_lc2_m * y2;
				drawer.T193_lc2_leftOrAbove = (drawer.T193_sx < drawer.T193_lc2_m*drawer.T193_sy + drawer.T193_lc2_C);
			}

			if(y3 == y1) {
				drawer.T193_lc3_horizontal = true;
				drawer.T193_lc3_vertical = false;
				drawer.T193_lc3_borderY = y3;
				drawer.T193_lc3_leftOrAbove = (drawer.T193_sy <= y3);
			} else if(x3 == x1) {
				drawer.T193_lc3_horizontal = false;
				drawer.T193_lc3_vertical = true;
				drawer.T193_lc3_borderX = x3;
				drawer.T193_lc3_leftOrAbove = (drawer.T193_sx <= x3);
			} else {
				drawer.T193_lc3_horizontal = false;
				drawer.T193_lc3_vertical = false;
				drawer.T193_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T193_lc3_C = x3 - drawer.T193_lc3_m * y3;
				drawer.T193_lc3_leftOrAbove = (drawer.T193_sx < drawer.T193_lc3_m*drawer.T193_sy + drawer.T193_lc3_C);
			}

			drawer.T193_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T193_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T193_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T193_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T193_initializedWithValidData = true;
		}

		t = triangles[194]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T194_r = t.r; drawer.T194_g = t.g; drawer.T194_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T194_initializedWithValidData = false;
		} else {

			drawer.T194_sx = (x1 + x2 + x3) / 3.0;
			drawer.T194_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T194_lc1_horizontal = true;
				drawer.T194_lc1_vertical = false;
				drawer.T194_lc1_borderY = y1;
				drawer.T194_lc1_leftOrAbove = (drawer.T194_sy <= y1);
			} else if(x1 == x2) {
				drawer.T194_lc1_horizontal = false;
				drawer.T194_lc1_vertical = true;
				drawer.T194_lc1_borderX = x1;
				drawer.T194_lc1_leftOrAbove = (drawer.T194_sx <= x1);
			} else {
				drawer.T194_lc1_horizontal = false;
				drawer.T194_lc1_vertical = false;
				drawer.T194_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T194_lc1_C = x1 - drawer.T194_lc1_m * y1;
				drawer.T194_lc1_leftOrAbove = (drawer.T194_sx < drawer.T194_lc1_m*drawer.T194_sy + drawer.T194_lc1_C);
			}

			if(y2 == y3) {
				drawer.T194_lc2_horizontal = true;
				drawer.T194_lc2_vertical = false;
				drawer.T194_lc2_borderY = y2;
				drawer.T194_lc2_leftOrAbove = (drawer.T194_sy <= y2);
			} else if(x2 == x3) {
				drawer.T194_lc2_horizontal = false;
				drawer.T194_lc2_vertical = true;
				drawer.T194_lc2_borderX = x2;
				drawer.T194_lc2_leftOrAbove = (drawer.T194_sx <= x2);
			} else {
				drawer.T194_lc2_horizontal = false;
				drawer.T194_lc2_vertical = false;
				drawer.T194_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T194_lc2_C = x2 - drawer.T194_lc2_m * y2;
				drawer.T194_lc2_leftOrAbove = (drawer.T194_sx < drawer.T194_lc2_m*drawer.T194_sy + drawer.T194_lc2_C);
			}

			if(y3 == y1) {
				drawer.T194_lc3_horizontal = true;
				drawer.T194_lc3_vertical = false;
				drawer.T194_lc3_borderY = y3;
				drawer.T194_lc3_leftOrAbove = (drawer.T194_sy <= y3);
			} else if(x3 == x1) {
				drawer.T194_lc3_horizontal = false;
				drawer.T194_lc3_vertical = true;
				drawer.T194_lc3_borderX = x3;
				drawer.T194_lc3_leftOrAbove = (drawer.T194_sx <= x3);
			} else {
				drawer.T194_lc3_horizontal = false;
				drawer.T194_lc3_vertical = false;
				drawer.T194_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T194_lc3_C = x3 - drawer.T194_lc3_m * y3;
				drawer.T194_lc3_leftOrAbove = (drawer.T194_sx < drawer.T194_lc3_m*drawer.T194_sy + drawer.T194_lc3_C);
			}

			drawer.T194_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T194_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T194_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T194_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T194_initializedWithValidData = true;
		}

		t = triangles[195]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T195_r = t.r; drawer.T195_g = t.g; drawer.T195_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T195_initializedWithValidData = false;
		} else {

			drawer.T195_sx = (x1 + x2 + x3) / 3.0;
			drawer.T195_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T195_lc1_horizontal = true;
				drawer.T195_lc1_vertical = false;
				drawer.T195_lc1_borderY = y1;
				drawer.T195_lc1_leftOrAbove = (drawer.T195_sy <= y1);
			} else if(x1 == x2) {
				drawer.T195_lc1_horizontal = false;
				drawer.T195_lc1_vertical = true;
				drawer.T195_lc1_borderX = x1;
				drawer.T195_lc1_leftOrAbove = (drawer.T195_sx <= x1);
			} else {
				drawer.T195_lc1_horizontal = false;
				drawer.T195_lc1_vertical = false;
				drawer.T195_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T195_lc1_C = x1 - drawer.T195_lc1_m * y1;
				drawer.T195_lc1_leftOrAbove = (drawer.T195_sx < drawer.T195_lc1_m*drawer.T195_sy + drawer.T195_lc1_C);
			}

			if(y2 == y3) {
				drawer.T195_lc2_horizontal = true;
				drawer.T195_lc2_vertical = false;
				drawer.T195_lc2_borderY = y2;
				drawer.T195_lc2_leftOrAbove = (drawer.T195_sy <= y2);
			} else if(x2 == x3) {
				drawer.T195_lc2_horizontal = false;
				drawer.T195_lc2_vertical = true;
				drawer.T195_lc2_borderX = x2;
				drawer.T195_lc2_leftOrAbove = (drawer.T195_sx <= x2);
			} else {
				drawer.T195_lc2_horizontal = false;
				drawer.T195_lc2_vertical = false;
				drawer.T195_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T195_lc2_C = x2 - drawer.T195_lc2_m * y2;
				drawer.T195_lc2_leftOrAbove = (drawer.T195_sx < drawer.T195_lc2_m*drawer.T195_sy + drawer.T195_lc2_C);
			}

			if(y3 == y1) {
				drawer.T195_lc3_horizontal = true;
				drawer.T195_lc3_vertical = false;
				drawer.T195_lc3_borderY = y3;
				drawer.T195_lc3_leftOrAbove = (drawer.T195_sy <= y3);
			} else if(x3 == x1) {
				drawer.T195_lc3_horizontal = false;
				drawer.T195_lc3_vertical = true;
				drawer.T195_lc3_borderX = x3;
				drawer.T195_lc3_leftOrAbove = (drawer.T195_sx <= x3);
			} else {
				drawer.T195_lc3_horizontal = false;
				drawer.T195_lc3_vertical = false;
				drawer.T195_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T195_lc3_C = x3 - drawer.T195_lc3_m * y3;
				drawer.T195_lc3_leftOrAbove = (drawer.T195_sx < drawer.T195_lc3_m*drawer.T195_sy + drawer.T195_lc3_C);
			}

			drawer.T195_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T195_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T195_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T195_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T195_initializedWithValidData = true;
		}

		t = triangles[196]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T196_r = t.r; drawer.T196_g = t.g; drawer.T196_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T196_initializedWithValidData = false;
		} else {

			drawer.T196_sx = (x1 + x2 + x3) / 3.0;
			drawer.T196_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T196_lc1_horizontal = true;
				drawer.T196_lc1_vertical = false;
				drawer.T196_lc1_borderY = y1;
				drawer.T196_lc1_leftOrAbove = (drawer.T196_sy <= y1);
			} else if(x1 == x2) {
				drawer.T196_lc1_horizontal = false;
				drawer.T196_lc1_vertical = true;
				drawer.T196_lc1_borderX = x1;
				drawer.T196_lc1_leftOrAbove = (drawer.T196_sx <= x1);
			} else {
				drawer.T196_lc1_horizontal = false;
				drawer.T196_lc1_vertical = false;
				drawer.T196_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T196_lc1_C = x1 - drawer.T196_lc1_m * y1;
				drawer.T196_lc1_leftOrAbove = (drawer.T196_sx < drawer.T196_lc1_m*drawer.T196_sy + drawer.T196_lc1_C);
			}

			if(y2 == y3) {
				drawer.T196_lc2_horizontal = true;
				drawer.T196_lc2_vertical = false;
				drawer.T196_lc2_borderY = y2;
				drawer.T196_lc2_leftOrAbove = (drawer.T196_sy <= y2);
			} else if(x2 == x3) {
				drawer.T196_lc2_horizontal = false;
				drawer.T196_lc2_vertical = true;
				drawer.T196_lc2_borderX = x2;
				drawer.T196_lc2_leftOrAbove = (drawer.T196_sx <= x2);
			} else {
				drawer.T196_lc2_horizontal = false;
				drawer.T196_lc2_vertical = false;
				drawer.T196_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T196_lc2_C = x2 - drawer.T196_lc2_m * y2;
				drawer.T196_lc2_leftOrAbove = (drawer.T196_sx < drawer.T196_lc2_m*drawer.T196_sy + drawer.T196_lc2_C);
			}

			if(y3 == y1) {
				drawer.T196_lc3_horizontal = true;
				drawer.T196_lc3_vertical = false;
				drawer.T196_lc3_borderY = y3;
				drawer.T196_lc3_leftOrAbove = (drawer.T196_sy <= y3);
			} else if(x3 == x1) {
				drawer.T196_lc3_horizontal = false;
				drawer.T196_lc3_vertical = true;
				drawer.T196_lc3_borderX = x3;
				drawer.T196_lc3_leftOrAbove = (drawer.T196_sx <= x3);
			} else {
				drawer.T196_lc3_horizontal = false;
				drawer.T196_lc3_vertical = false;
				drawer.T196_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T196_lc3_C = x3 - drawer.T196_lc3_m * y3;
				drawer.T196_lc3_leftOrAbove = (drawer.T196_sx < drawer.T196_lc3_m*drawer.T196_sy + drawer.T196_lc3_C);
			}

			drawer.T196_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T196_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T196_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T196_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T196_initializedWithValidData = true;
		}

		t = triangles[197]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T197_r = t.r; drawer.T197_g = t.g; drawer.T197_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T197_initializedWithValidData = false;
		} else {

			drawer.T197_sx = (x1 + x2 + x3) / 3.0;
			drawer.T197_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T197_lc1_horizontal = true;
				drawer.T197_lc1_vertical = false;
				drawer.T197_lc1_borderY = y1;
				drawer.T197_lc1_leftOrAbove = (drawer.T197_sy <= y1);
			} else if(x1 == x2) {
				drawer.T197_lc1_horizontal = false;
				drawer.T197_lc1_vertical = true;
				drawer.T197_lc1_borderX = x1;
				drawer.T197_lc1_leftOrAbove = (drawer.T197_sx <= x1);
			} else {
				drawer.T197_lc1_horizontal = false;
				drawer.T197_lc1_vertical = false;
				drawer.T197_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T197_lc1_C = x1 - drawer.T197_lc1_m * y1;
				drawer.T197_lc1_leftOrAbove = (drawer.T197_sx < drawer.T197_lc1_m*drawer.T197_sy + drawer.T197_lc1_C);
			}

			if(y2 == y3) {
				drawer.T197_lc2_horizontal = true;
				drawer.T197_lc2_vertical = false;
				drawer.T197_lc2_borderY = y2;
				drawer.T197_lc2_leftOrAbove = (drawer.T197_sy <= y2);
			} else if(x2 == x3) {
				drawer.T197_lc2_horizontal = false;
				drawer.T197_lc2_vertical = true;
				drawer.T197_lc2_borderX = x2;
				drawer.T197_lc2_leftOrAbove = (drawer.T197_sx <= x2);
			} else {
				drawer.T197_lc2_horizontal = false;
				drawer.T197_lc2_vertical = false;
				drawer.T197_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T197_lc2_C = x2 - drawer.T197_lc2_m * y2;
				drawer.T197_lc2_leftOrAbove = (drawer.T197_sx < drawer.T197_lc2_m*drawer.T197_sy + drawer.T197_lc2_C);
			}

			if(y3 == y1) {
				drawer.T197_lc3_horizontal = true;
				drawer.T197_lc3_vertical = false;
				drawer.T197_lc3_borderY = y3;
				drawer.T197_lc3_leftOrAbove = (drawer.T197_sy <= y3);
			} else if(x3 == x1) {
				drawer.T197_lc3_horizontal = false;
				drawer.T197_lc3_vertical = true;
				drawer.T197_lc3_borderX = x3;
				drawer.T197_lc3_leftOrAbove = (drawer.T197_sx <= x3);
			} else {
				drawer.T197_lc3_horizontal = false;
				drawer.T197_lc3_vertical = false;
				drawer.T197_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T197_lc3_C = x3 - drawer.T197_lc3_m * y3;
				drawer.T197_lc3_leftOrAbove = (drawer.T197_sx < drawer.T197_lc3_m*drawer.T197_sy + drawer.T197_lc3_C);
			}

			drawer.T197_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T197_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T197_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T197_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T197_initializedWithValidData = true;
		}

		t = triangles[198]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T198_r = t.r; drawer.T198_g = t.g; drawer.T198_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T198_initializedWithValidData = false;
		} else {

			drawer.T198_sx = (x1 + x2 + x3) / 3.0;
			drawer.T198_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T198_lc1_horizontal = true;
				drawer.T198_lc1_vertical = false;
				drawer.T198_lc1_borderY = y1;
				drawer.T198_lc1_leftOrAbove = (drawer.T198_sy <= y1);
			} else if(x1 == x2) {
				drawer.T198_lc1_horizontal = false;
				drawer.T198_lc1_vertical = true;
				drawer.T198_lc1_borderX = x1;
				drawer.T198_lc1_leftOrAbove = (drawer.T198_sx <= x1);
			} else {
				drawer.T198_lc1_horizontal = false;
				drawer.T198_lc1_vertical = false;
				drawer.T198_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T198_lc1_C = x1 - drawer.T198_lc1_m * y1;
				drawer.T198_lc1_leftOrAbove = (drawer.T198_sx < drawer.T198_lc1_m*drawer.T198_sy + drawer.T198_lc1_C);
			}

			if(y2 == y3) {
				drawer.T198_lc2_horizontal = true;
				drawer.T198_lc2_vertical = false;
				drawer.T198_lc2_borderY = y2;
				drawer.T198_lc2_leftOrAbove = (drawer.T198_sy <= y2);
			} else if(x2 == x3) {
				drawer.T198_lc2_horizontal = false;
				drawer.T198_lc2_vertical = true;
				drawer.T198_lc2_borderX = x2;
				drawer.T198_lc2_leftOrAbove = (drawer.T198_sx <= x2);
			} else {
				drawer.T198_lc2_horizontal = false;
				drawer.T198_lc2_vertical = false;
				drawer.T198_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T198_lc2_C = x2 - drawer.T198_lc2_m * y2;
				drawer.T198_lc2_leftOrAbove = (drawer.T198_sx < drawer.T198_lc2_m*drawer.T198_sy + drawer.T198_lc2_C);
			}

			if(y3 == y1) {
				drawer.T198_lc3_horizontal = true;
				drawer.T198_lc3_vertical = false;
				drawer.T198_lc3_borderY = y3;
				drawer.T198_lc3_leftOrAbove = (drawer.T198_sy <= y3);
			} else if(x3 == x1) {
				drawer.T198_lc3_horizontal = false;
				drawer.T198_lc3_vertical = true;
				drawer.T198_lc3_borderX = x3;
				drawer.T198_lc3_leftOrAbove = (drawer.T198_sx <= x3);
			} else {
				drawer.T198_lc3_horizontal = false;
				drawer.T198_lc3_vertical = false;
				drawer.T198_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T198_lc3_C = x3 - drawer.T198_lc3_m * y3;
				drawer.T198_lc3_leftOrAbove = (drawer.T198_sx < drawer.T198_lc3_m*drawer.T198_sy + drawer.T198_lc3_C);
			}

			drawer.T198_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T198_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T198_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T198_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T198_initializedWithValidData = true;
		}

		t = triangles[199]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T199_r = t.r; drawer.T199_g = t.g; drawer.T199_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T199_initializedWithValidData = false;
		} else {

			drawer.T199_sx = (x1 + x2 + x3) / 3.0;
			drawer.T199_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T199_lc1_horizontal = true;
				drawer.T199_lc1_vertical = false;
				drawer.T199_lc1_borderY = y1;
				drawer.T199_lc1_leftOrAbove = (drawer.T199_sy <= y1);
			} else if(x1 == x2) {
				drawer.T199_lc1_horizontal = false;
				drawer.T199_lc1_vertical = true;
				drawer.T199_lc1_borderX = x1;
				drawer.T199_lc1_leftOrAbove = (drawer.T199_sx <= x1);
			} else {
				drawer.T199_lc1_horizontal = false;
				drawer.T199_lc1_vertical = false;
				drawer.T199_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T199_lc1_C = x1 - drawer.T199_lc1_m * y1;
				drawer.T199_lc1_leftOrAbove = (drawer.T199_sx < drawer.T199_lc1_m*drawer.T199_sy + drawer.T199_lc1_C);
			}

			if(y2 == y3) {
				drawer.T199_lc2_horizontal = true;
				drawer.T199_lc2_vertical = false;
				drawer.T199_lc2_borderY = y2;
				drawer.T199_lc2_leftOrAbove = (drawer.T199_sy <= y2);
			} else if(x2 == x3) {
				drawer.T199_lc2_horizontal = false;
				drawer.T199_lc2_vertical = true;
				drawer.T199_lc2_borderX = x2;
				drawer.T199_lc2_leftOrAbove = (drawer.T199_sx <= x2);
			} else {
				drawer.T199_lc2_horizontal = false;
				drawer.T199_lc2_vertical = false;
				drawer.T199_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T199_lc2_C = x2 - drawer.T199_lc2_m * y2;
				drawer.T199_lc2_leftOrAbove = (drawer.T199_sx < drawer.T199_lc2_m*drawer.T199_sy + drawer.T199_lc2_C);
			}

			if(y3 == y1) {
				drawer.T199_lc3_horizontal = true;
				drawer.T199_lc3_vertical = false;
				drawer.T199_lc3_borderY = y3;
				drawer.T199_lc3_leftOrAbove = (drawer.T199_sy <= y3);
			} else if(x3 == x1) {
				drawer.T199_lc3_horizontal = false;
				drawer.T199_lc3_vertical = true;
				drawer.T199_lc3_borderX = x3;
				drawer.T199_lc3_leftOrAbove = (drawer.T199_sx <= x3);
			} else {
				drawer.T199_lc3_horizontal = false;
				drawer.T199_lc3_vertical = false;
				drawer.T199_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T199_lc3_C = x3 - drawer.T199_lc3_m * y3;
				drawer.T199_lc3_leftOrAbove = (drawer.T199_sx < drawer.T199_lc3_m*drawer.T199_sy + drawer.T199_lc3_C);
			}

			drawer.T199_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T199_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T199_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T199_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T199_initializedWithValidData = true;
		}

		t = triangles[200]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T200_r = t.r; drawer.T200_g = t.g; drawer.T200_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T200_initializedWithValidData = false;
		} else {

			drawer.T200_sx = (x1 + x2 + x3) / 3.0;
			drawer.T200_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T200_lc1_horizontal = true;
				drawer.T200_lc1_vertical = false;
				drawer.T200_lc1_borderY = y1;
				drawer.T200_lc1_leftOrAbove = (drawer.T200_sy <= y1);
			} else if(x1 == x2) {
				drawer.T200_lc1_horizontal = false;
				drawer.T200_lc1_vertical = true;
				drawer.T200_lc1_borderX = x1;
				drawer.T200_lc1_leftOrAbove = (drawer.T200_sx <= x1);
			} else {
				drawer.T200_lc1_horizontal = false;
				drawer.T200_lc1_vertical = false;
				drawer.T200_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T200_lc1_C = x1 - drawer.T200_lc1_m * y1;
				drawer.T200_lc1_leftOrAbove = (drawer.T200_sx < drawer.T200_lc1_m*drawer.T200_sy + drawer.T200_lc1_C);
			}

			if(y2 == y3) {
				drawer.T200_lc2_horizontal = true;
				drawer.T200_lc2_vertical = false;
				drawer.T200_lc2_borderY = y2;
				drawer.T200_lc2_leftOrAbove = (drawer.T200_sy <= y2);
			} else if(x2 == x3) {
				drawer.T200_lc2_horizontal = false;
				drawer.T200_lc2_vertical = true;
				drawer.T200_lc2_borderX = x2;
				drawer.T200_lc2_leftOrAbove = (drawer.T200_sx <= x2);
			} else {
				drawer.T200_lc2_horizontal = false;
				drawer.T200_lc2_vertical = false;
				drawer.T200_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T200_lc2_C = x2 - drawer.T200_lc2_m * y2;
				drawer.T200_lc2_leftOrAbove = (drawer.T200_sx < drawer.T200_lc2_m*drawer.T200_sy + drawer.T200_lc2_C);
			}

			if(y3 == y1) {
				drawer.T200_lc3_horizontal = true;
				drawer.T200_lc3_vertical = false;
				drawer.T200_lc3_borderY = y3;
				drawer.T200_lc3_leftOrAbove = (drawer.T200_sy <= y3);
			} else if(x3 == x1) {
				drawer.T200_lc3_horizontal = false;
				drawer.T200_lc3_vertical = true;
				drawer.T200_lc3_borderX = x3;
				drawer.T200_lc3_leftOrAbove = (drawer.T200_sx <= x3);
			} else {
				drawer.T200_lc3_horizontal = false;
				drawer.T200_lc3_vertical = false;
				drawer.T200_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T200_lc3_C = x3 - drawer.T200_lc3_m * y3;
				drawer.T200_lc3_leftOrAbove = (drawer.T200_sx < drawer.T200_lc3_m*drawer.T200_sy + drawer.T200_lc3_C);
			}

			drawer.T200_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T200_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T200_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T200_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T200_initializedWithValidData = true;
		}

		t = triangles[201]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T201_r = t.r; drawer.T201_g = t.g; drawer.T201_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T201_initializedWithValidData = false;
		} else {

			drawer.T201_sx = (x1 + x2 + x3) / 3.0;
			drawer.T201_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T201_lc1_horizontal = true;
				drawer.T201_lc1_vertical = false;
				drawer.T201_lc1_borderY = y1;
				drawer.T201_lc1_leftOrAbove = (drawer.T201_sy <= y1);
			} else if(x1 == x2) {
				drawer.T201_lc1_horizontal = false;
				drawer.T201_lc1_vertical = true;
				drawer.T201_lc1_borderX = x1;
				drawer.T201_lc1_leftOrAbove = (drawer.T201_sx <= x1);
			} else {
				drawer.T201_lc1_horizontal = false;
				drawer.T201_lc1_vertical = false;
				drawer.T201_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T201_lc1_C = x1 - drawer.T201_lc1_m * y1;
				drawer.T201_lc1_leftOrAbove = (drawer.T201_sx < drawer.T201_lc1_m*drawer.T201_sy + drawer.T201_lc1_C);
			}

			if(y2 == y3) {
				drawer.T201_lc2_horizontal = true;
				drawer.T201_lc2_vertical = false;
				drawer.T201_lc2_borderY = y2;
				drawer.T201_lc2_leftOrAbove = (drawer.T201_sy <= y2);
			} else if(x2 == x3) {
				drawer.T201_lc2_horizontal = false;
				drawer.T201_lc2_vertical = true;
				drawer.T201_lc2_borderX = x2;
				drawer.T201_lc2_leftOrAbove = (drawer.T201_sx <= x2);
			} else {
				drawer.T201_lc2_horizontal = false;
				drawer.T201_lc2_vertical = false;
				drawer.T201_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T201_lc2_C = x2 - drawer.T201_lc2_m * y2;
				drawer.T201_lc2_leftOrAbove = (drawer.T201_sx < drawer.T201_lc2_m*drawer.T201_sy + drawer.T201_lc2_C);
			}

			if(y3 == y1) {
				drawer.T201_lc3_horizontal = true;
				drawer.T201_lc3_vertical = false;
				drawer.T201_lc3_borderY = y3;
				drawer.T201_lc3_leftOrAbove = (drawer.T201_sy <= y3);
			} else if(x3 == x1) {
				drawer.T201_lc3_horizontal = false;
				drawer.T201_lc3_vertical = true;
				drawer.T201_lc3_borderX = x3;
				drawer.T201_lc3_leftOrAbove = (drawer.T201_sx <= x3);
			} else {
				drawer.T201_lc3_horizontal = false;
				drawer.T201_lc3_vertical = false;
				drawer.T201_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T201_lc3_C = x3 - drawer.T201_lc3_m * y3;
				drawer.T201_lc3_leftOrAbove = (drawer.T201_sx < drawer.T201_lc3_m*drawer.T201_sy + drawer.T201_lc3_C);
			}

			drawer.T201_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T201_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T201_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T201_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T201_initializedWithValidData = true;
		}

		t = triangles[202]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T202_r = t.r; drawer.T202_g = t.g; drawer.T202_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T202_initializedWithValidData = false;
		} else {

			drawer.T202_sx = (x1 + x2 + x3) / 3.0;
			drawer.T202_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T202_lc1_horizontal = true;
				drawer.T202_lc1_vertical = false;
				drawer.T202_lc1_borderY = y1;
				drawer.T202_lc1_leftOrAbove = (drawer.T202_sy <= y1);
			} else if(x1 == x2) {
				drawer.T202_lc1_horizontal = false;
				drawer.T202_lc1_vertical = true;
				drawer.T202_lc1_borderX = x1;
				drawer.T202_lc1_leftOrAbove = (drawer.T202_sx <= x1);
			} else {
				drawer.T202_lc1_horizontal = false;
				drawer.T202_lc1_vertical = false;
				drawer.T202_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T202_lc1_C = x1 - drawer.T202_lc1_m * y1;
				drawer.T202_lc1_leftOrAbove = (drawer.T202_sx < drawer.T202_lc1_m*drawer.T202_sy + drawer.T202_lc1_C);
			}

			if(y2 == y3) {
				drawer.T202_lc2_horizontal = true;
				drawer.T202_lc2_vertical = false;
				drawer.T202_lc2_borderY = y2;
				drawer.T202_lc2_leftOrAbove = (drawer.T202_sy <= y2);
			} else if(x2 == x3) {
				drawer.T202_lc2_horizontal = false;
				drawer.T202_lc2_vertical = true;
				drawer.T202_lc2_borderX = x2;
				drawer.T202_lc2_leftOrAbove = (drawer.T202_sx <= x2);
			} else {
				drawer.T202_lc2_horizontal = false;
				drawer.T202_lc2_vertical = false;
				drawer.T202_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T202_lc2_C = x2 - drawer.T202_lc2_m * y2;
				drawer.T202_lc2_leftOrAbove = (drawer.T202_sx < drawer.T202_lc2_m*drawer.T202_sy + drawer.T202_lc2_C);
			}

			if(y3 == y1) {
				drawer.T202_lc3_horizontal = true;
				drawer.T202_lc3_vertical = false;
				drawer.T202_lc3_borderY = y3;
				drawer.T202_lc3_leftOrAbove = (drawer.T202_sy <= y3);
			} else if(x3 == x1) {
				drawer.T202_lc3_horizontal = false;
				drawer.T202_lc3_vertical = true;
				drawer.T202_lc3_borderX = x3;
				drawer.T202_lc3_leftOrAbove = (drawer.T202_sx <= x3);
			} else {
				drawer.T202_lc3_horizontal = false;
				drawer.T202_lc3_vertical = false;
				drawer.T202_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T202_lc3_C = x3 - drawer.T202_lc3_m * y3;
				drawer.T202_lc3_leftOrAbove = (drawer.T202_sx < drawer.T202_lc3_m*drawer.T202_sy + drawer.T202_lc3_C);
			}

			drawer.T202_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T202_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T202_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T202_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T202_initializedWithValidData = true;
		}

		t = triangles[203]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T203_r = t.r; drawer.T203_g = t.g; drawer.T203_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T203_initializedWithValidData = false;
		} else {

			drawer.T203_sx = (x1 + x2 + x3) / 3.0;
			drawer.T203_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T203_lc1_horizontal = true;
				drawer.T203_lc1_vertical = false;
				drawer.T203_lc1_borderY = y1;
				drawer.T203_lc1_leftOrAbove = (drawer.T203_sy <= y1);
			} else if(x1 == x2) {
				drawer.T203_lc1_horizontal = false;
				drawer.T203_lc1_vertical = true;
				drawer.T203_lc1_borderX = x1;
				drawer.T203_lc1_leftOrAbove = (drawer.T203_sx <= x1);
			} else {
				drawer.T203_lc1_horizontal = false;
				drawer.T203_lc1_vertical = false;
				drawer.T203_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T203_lc1_C = x1 - drawer.T203_lc1_m * y1;
				drawer.T203_lc1_leftOrAbove = (drawer.T203_sx < drawer.T203_lc1_m*drawer.T203_sy + drawer.T203_lc1_C);
			}

			if(y2 == y3) {
				drawer.T203_lc2_horizontal = true;
				drawer.T203_lc2_vertical = false;
				drawer.T203_lc2_borderY = y2;
				drawer.T203_lc2_leftOrAbove = (drawer.T203_sy <= y2);
			} else if(x2 == x3) {
				drawer.T203_lc2_horizontal = false;
				drawer.T203_lc2_vertical = true;
				drawer.T203_lc2_borderX = x2;
				drawer.T203_lc2_leftOrAbove = (drawer.T203_sx <= x2);
			} else {
				drawer.T203_lc2_horizontal = false;
				drawer.T203_lc2_vertical = false;
				drawer.T203_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T203_lc2_C = x2 - drawer.T203_lc2_m * y2;
				drawer.T203_lc2_leftOrAbove = (drawer.T203_sx < drawer.T203_lc2_m*drawer.T203_sy + drawer.T203_lc2_C);
			}

			if(y3 == y1) {
				drawer.T203_lc3_horizontal = true;
				drawer.T203_lc3_vertical = false;
				drawer.T203_lc3_borderY = y3;
				drawer.T203_lc3_leftOrAbove = (drawer.T203_sy <= y3);
			} else if(x3 == x1) {
				drawer.T203_lc3_horizontal = false;
				drawer.T203_lc3_vertical = true;
				drawer.T203_lc3_borderX = x3;
				drawer.T203_lc3_leftOrAbove = (drawer.T203_sx <= x3);
			} else {
				drawer.T203_lc3_horizontal = false;
				drawer.T203_lc3_vertical = false;
				drawer.T203_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T203_lc3_C = x3 - drawer.T203_lc3_m * y3;
				drawer.T203_lc3_leftOrAbove = (drawer.T203_sx < drawer.T203_lc3_m*drawer.T203_sy + drawer.T203_lc3_C);
			}

			drawer.T203_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T203_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T203_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T203_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T203_initializedWithValidData = true;
		}

		t = triangles[204]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T204_r = t.r; drawer.T204_g = t.g; drawer.T204_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T204_initializedWithValidData = false;
		} else {

			drawer.T204_sx = (x1 + x2 + x3) / 3.0;
			drawer.T204_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T204_lc1_horizontal = true;
				drawer.T204_lc1_vertical = false;
				drawer.T204_lc1_borderY = y1;
				drawer.T204_lc1_leftOrAbove = (drawer.T204_sy <= y1);
			} else if(x1 == x2) {
				drawer.T204_lc1_horizontal = false;
				drawer.T204_lc1_vertical = true;
				drawer.T204_lc1_borderX = x1;
				drawer.T204_lc1_leftOrAbove = (drawer.T204_sx <= x1);
			} else {
				drawer.T204_lc1_horizontal = false;
				drawer.T204_lc1_vertical = false;
				drawer.T204_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T204_lc1_C = x1 - drawer.T204_lc1_m * y1;
				drawer.T204_lc1_leftOrAbove = (drawer.T204_sx < drawer.T204_lc1_m*drawer.T204_sy + drawer.T204_lc1_C);
			}

			if(y2 == y3) {
				drawer.T204_lc2_horizontal = true;
				drawer.T204_lc2_vertical = false;
				drawer.T204_lc2_borderY = y2;
				drawer.T204_lc2_leftOrAbove = (drawer.T204_sy <= y2);
			} else if(x2 == x3) {
				drawer.T204_lc2_horizontal = false;
				drawer.T204_lc2_vertical = true;
				drawer.T204_lc2_borderX = x2;
				drawer.T204_lc2_leftOrAbove = (drawer.T204_sx <= x2);
			} else {
				drawer.T204_lc2_horizontal = false;
				drawer.T204_lc2_vertical = false;
				drawer.T204_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T204_lc2_C = x2 - drawer.T204_lc2_m * y2;
				drawer.T204_lc2_leftOrAbove = (drawer.T204_sx < drawer.T204_lc2_m*drawer.T204_sy + drawer.T204_lc2_C);
			}

			if(y3 == y1) {
				drawer.T204_lc3_horizontal = true;
				drawer.T204_lc3_vertical = false;
				drawer.T204_lc3_borderY = y3;
				drawer.T204_lc3_leftOrAbove = (drawer.T204_sy <= y3);
			} else if(x3 == x1) {
				drawer.T204_lc3_horizontal = false;
				drawer.T204_lc3_vertical = true;
				drawer.T204_lc3_borderX = x3;
				drawer.T204_lc3_leftOrAbove = (drawer.T204_sx <= x3);
			} else {
				drawer.T204_lc3_horizontal = false;
				drawer.T204_lc3_vertical = false;
				drawer.T204_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T204_lc3_C = x3 - drawer.T204_lc3_m * y3;
				drawer.T204_lc3_leftOrAbove = (drawer.T204_sx < drawer.T204_lc3_m*drawer.T204_sy + drawer.T204_lc3_C);
			}

			drawer.T204_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T204_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T204_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T204_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T204_initializedWithValidData = true;
		}

		t = triangles[205]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T205_r = t.r; drawer.T205_g = t.g; drawer.T205_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T205_initializedWithValidData = false;
		} else {

			drawer.T205_sx = (x1 + x2 + x3) / 3.0;
			drawer.T205_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T205_lc1_horizontal = true;
				drawer.T205_lc1_vertical = false;
				drawer.T205_lc1_borderY = y1;
				drawer.T205_lc1_leftOrAbove = (drawer.T205_sy <= y1);
			} else if(x1 == x2) {
				drawer.T205_lc1_horizontal = false;
				drawer.T205_lc1_vertical = true;
				drawer.T205_lc1_borderX = x1;
				drawer.T205_lc1_leftOrAbove = (drawer.T205_sx <= x1);
			} else {
				drawer.T205_lc1_horizontal = false;
				drawer.T205_lc1_vertical = false;
				drawer.T205_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T205_lc1_C = x1 - drawer.T205_lc1_m * y1;
				drawer.T205_lc1_leftOrAbove = (drawer.T205_sx < drawer.T205_lc1_m*drawer.T205_sy + drawer.T205_lc1_C);
			}

			if(y2 == y3) {
				drawer.T205_lc2_horizontal = true;
				drawer.T205_lc2_vertical = false;
				drawer.T205_lc2_borderY = y2;
				drawer.T205_lc2_leftOrAbove = (drawer.T205_sy <= y2);
			} else if(x2 == x3) {
				drawer.T205_lc2_horizontal = false;
				drawer.T205_lc2_vertical = true;
				drawer.T205_lc2_borderX = x2;
				drawer.T205_lc2_leftOrAbove = (drawer.T205_sx <= x2);
			} else {
				drawer.T205_lc2_horizontal = false;
				drawer.T205_lc2_vertical = false;
				drawer.T205_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T205_lc2_C = x2 - drawer.T205_lc2_m * y2;
				drawer.T205_lc2_leftOrAbove = (drawer.T205_sx < drawer.T205_lc2_m*drawer.T205_sy + drawer.T205_lc2_C);
			}

			if(y3 == y1) {
				drawer.T205_lc3_horizontal = true;
				drawer.T205_lc3_vertical = false;
				drawer.T205_lc3_borderY = y3;
				drawer.T205_lc3_leftOrAbove = (drawer.T205_sy <= y3);
			} else if(x3 == x1) {
				drawer.T205_lc3_horizontal = false;
				drawer.T205_lc3_vertical = true;
				drawer.T205_lc3_borderX = x3;
				drawer.T205_lc3_leftOrAbove = (drawer.T205_sx <= x3);
			} else {
				drawer.T205_lc3_horizontal = false;
				drawer.T205_lc3_vertical = false;
				drawer.T205_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T205_lc3_C = x3 - drawer.T205_lc3_m * y3;
				drawer.T205_lc3_leftOrAbove = (drawer.T205_sx < drawer.T205_lc3_m*drawer.T205_sy + drawer.T205_lc3_C);
			}

			drawer.T205_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T205_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T205_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T205_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T205_initializedWithValidData = true;
		}

		t = triangles[206]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T206_r = t.r; drawer.T206_g = t.g; drawer.T206_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T206_initializedWithValidData = false;
		} else {

			drawer.T206_sx = (x1 + x2 + x3) / 3.0;
			drawer.T206_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T206_lc1_horizontal = true;
				drawer.T206_lc1_vertical = false;
				drawer.T206_lc1_borderY = y1;
				drawer.T206_lc1_leftOrAbove = (drawer.T206_sy <= y1);
			} else if(x1 == x2) {
				drawer.T206_lc1_horizontal = false;
				drawer.T206_lc1_vertical = true;
				drawer.T206_lc1_borderX = x1;
				drawer.T206_lc1_leftOrAbove = (drawer.T206_sx <= x1);
			} else {
				drawer.T206_lc1_horizontal = false;
				drawer.T206_lc1_vertical = false;
				drawer.T206_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T206_lc1_C = x1 - drawer.T206_lc1_m * y1;
				drawer.T206_lc1_leftOrAbove = (drawer.T206_sx < drawer.T206_lc1_m*drawer.T206_sy + drawer.T206_lc1_C);
			}

			if(y2 == y3) {
				drawer.T206_lc2_horizontal = true;
				drawer.T206_lc2_vertical = false;
				drawer.T206_lc2_borderY = y2;
				drawer.T206_lc2_leftOrAbove = (drawer.T206_sy <= y2);
			} else if(x2 == x3) {
				drawer.T206_lc2_horizontal = false;
				drawer.T206_lc2_vertical = true;
				drawer.T206_lc2_borderX = x2;
				drawer.T206_lc2_leftOrAbove = (drawer.T206_sx <= x2);
			} else {
				drawer.T206_lc2_horizontal = false;
				drawer.T206_lc2_vertical = false;
				drawer.T206_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T206_lc2_C = x2 - drawer.T206_lc2_m * y2;
				drawer.T206_lc2_leftOrAbove = (drawer.T206_sx < drawer.T206_lc2_m*drawer.T206_sy + drawer.T206_lc2_C);
			}

			if(y3 == y1) {
				drawer.T206_lc3_horizontal = true;
				drawer.T206_lc3_vertical = false;
				drawer.T206_lc3_borderY = y3;
				drawer.T206_lc3_leftOrAbove = (drawer.T206_sy <= y3);
			} else if(x3 == x1) {
				drawer.T206_lc3_horizontal = false;
				drawer.T206_lc3_vertical = true;
				drawer.T206_lc3_borderX = x3;
				drawer.T206_lc3_leftOrAbove = (drawer.T206_sx <= x3);
			} else {
				drawer.T206_lc3_horizontal = false;
				drawer.T206_lc3_vertical = false;
				drawer.T206_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T206_lc3_C = x3 - drawer.T206_lc3_m * y3;
				drawer.T206_lc3_leftOrAbove = (drawer.T206_sx < drawer.T206_lc3_m*drawer.T206_sy + drawer.T206_lc3_C);
			}

			drawer.T206_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T206_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T206_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T206_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T206_initializedWithValidData = true;
		}

		t = triangles[207]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T207_r = t.r; drawer.T207_g = t.g; drawer.T207_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T207_initializedWithValidData = false;
		} else {

			drawer.T207_sx = (x1 + x2 + x3) / 3.0;
			drawer.T207_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T207_lc1_horizontal = true;
				drawer.T207_lc1_vertical = false;
				drawer.T207_lc1_borderY = y1;
				drawer.T207_lc1_leftOrAbove = (drawer.T207_sy <= y1);
			} else if(x1 == x2) {
				drawer.T207_lc1_horizontal = false;
				drawer.T207_lc1_vertical = true;
				drawer.T207_lc1_borderX = x1;
				drawer.T207_lc1_leftOrAbove = (drawer.T207_sx <= x1);
			} else {
				drawer.T207_lc1_horizontal = false;
				drawer.T207_lc1_vertical = false;
				drawer.T207_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T207_lc1_C = x1 - drawer.T207_lc1_m * y1;
				drawer.T207_lc1_leftOrAbove = (drawer.T207_sx < drawer.T207_lc1_m*drawer.T207_sy + drawer.T207_lc1_C);
			}

			if(y2 == y3) {
				drawer.T207_lc2_horizontal = true;
				drawer.T207_lc2_vertical = false;
				drawer.T207_lc2_borderY = y2;
				drawer.T207_lc2_leftOrAbove = (drawer.T207_sy <= y2);
			} else if(x2 == x3) {
				drawer.T207_lc2_horizontal = false;
				drawer.T207_lc2_vertical = true;
				drawer.T207_lc2_borderX = x2;
				drawer.T207_lc2_leftOrAbove = (drawer.T207_sx <= x2);
			} else {
				drawer.T207_lc2_horizontal = false;
				drawer.T207_lc2_vertical = false;
				drawer.T207_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T207_lc2_C = x2 - drawer.T207_lc2_m * y2;
				drawer.T207_lc2_leftOrAbove = (drawer.T207_sx < drawer.T207_lc2_m*drawer.T207_sy + drawer.T207_lc2_C);
			}

			if(y3 == y1) {
				drawer.T207_lc3_horizontal = true;
				drawer.T207_lc3_vertical = false;
				drawer.T207_lc3_borderY = y3;
				drawer.T207_lc3_leftOrAbove = (drawer.T207_sy <= y3);
			} else if(x3 == x1) {
				drawer.T207_lc3_horizontal = false;
				drawer.T207_lc3_vertical = true;
				drawer.T207_lc3_borderX = x3;
				drawer.T207_lc3_leftOrAbove = (drawer.T207_sx <= x3);
			} else {
				drawer.T207_lc3_horizontal = false;
				drawer.T207_lc3_vertical = false;
				drawer.T207_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T207_lc3_C = x3 - drawer.T207_lc3_m * y3;
				drawer.T207_lc3_leftOrAbove = (drawer.T207_sx < drawer.T207_lc3_m*drawer.T207_sy + drawer.T207_lc3_C);
			}

			drawer.T207_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T207_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T207_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T207_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T207_initializedWithValidData = true;
		}

		t = triangles[208]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T208_r = t.r; drawer.T208_g = t.g; drawer.T208_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T208_initializedWithValidData = false;
		} else {

			drawer.T208_sx = (x1 + x2 + x3) / 3.0;
			drawer.T208_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T208_lc1_horizontal = true;
				drawer.T208_lc1_vertical = false;
				drawer.T208_lc1_borderY = y1;
				drawer.T208_lc1_leftOrAbove = (drawer.T208_sy <= y1);
			} else if(x1 == x2) {
				drawer.T208_lc1_horizontal = false;
				drawer.T208_lc1_vertical = true;
				drawer.T208_lc1_borderX = x1;
				drawer.T208_lc1_leftOrAbove = (drawer.T208_sx <= x1);
			} else {
				drawer.T208_lc1_horizontal = false;
				drawer.T208_lc1_vertical = false;
				drawer.T208_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T208_lc1_C = x1 - drawer.T208_lc1_m * y1;
				drawer.T208_lc1_leftOrAbove = (drawer.T208_sx < drawer.T208_lc1_m*drawer.T208_sy + drawer.T208_lc1_C);
			}

			if(y2 == y3) {
				drawer.T208_lc2_horizontal = true;
				drawer.T208_lc2_vertical = false;
				drawer.T208_lc2_borderY = y2;
				drawer.T208_lc2_leftOrAbove = (drawer.T208_sy <= y2);
			} else if(x2 == x3) {
				drawer.T208_lc2_horizontal = false;
				drawer.T208_lc2_vertical = true;
				drawer.T208_lc2_borderX = x2;
				drawer.T208_lc2_leftOrAbove = (drawer.T208_sx <= x2);
			} else {
				drawer.T208_lc2_horizontal = false;
				drawer.T208_lc2_vertical = false;
				drawer.T208_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T208_lc2_C = x2 - drawer.T208_lc2_m * y2;
				drawer.T208_lc2_leftOrAbove = (drawer.T208_sx < drawer.T208_lc2_m*drawer.T208_sy + drawer.T208_lc2_C);
			}

			if(y3 == y1) {
				drawer.T208_lc3_horizontal = true;
				drawer.T208_lc3_vertical = false;
				drawer.T208_lc3_borderY = y3;
				drawer.T208_lc3_leftOrAbove = (drawer.T208_sy <= y3);
			} else if(x3 == x1) {
				drawer.T208_lc3_horizontal = false;
				drawer.T208_lc3_vertical = true;
				drawer.T208_lc3_borderX = x3;
				drawer.T208_lc3_leftOrAbove = (drawer.T208_sx <= x3);
			} else {
				drawer.T208_lc3_horizontal = false;
				drawer.T208_lc3_vertical = false;
				drawer.T208_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T208_lc3_C = x3 - drawer.T208_lc3_m * y3;
				drawer.T208_lc3_leftOrAbove = (drawer.T208_sx < drawer.T208_lc3_m*drawer.T208_sy + drawer.T208_lc3_C);
			}

			drawer.T208_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T208_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T208_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T208_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T208_initializedWithValidData = true;
		}

		t = triangles[209]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T209_r = t.r; drawer.T209_g = t.g; drawer.T209_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T209_initializedWithValidData = false;
		} else {

			drawer.T209_sx = (x1 + x2 + x3) / 3.0;
			drawer.T209_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T209_lc1_horizontal = true;
				drawer.T209_lc1_vertical = false;
				drawer.T209_lc1_borderY = y1;
				drawer.T209_lc1_leftOrAbove = (drawer.T209_sy <= y1);
			} else if(x1 == x2) {
				drawer.T209_lc1_horizontal = false;
				drawer.T209_lc1_vertical = true;
				drawer.T209_lc1_borderX = x1;
				drawer.T209_lc1_leftOrAbove = (drawer.T209_sx <= x1);
			} else {
				drawer.T209_lc1_horizontal = false;
				drawer.T209_lc1_vertical = false;
				drawer.T209_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T209_lc1_C = x1 - drawer.T209_lc1_m * y1;
				drawer.T209_lc1_leftOrAbove = (drawer.T209_sx < drawer.T209_lc1_m*drawer.T209_sy + drawer.T209_lc1_C);
			}

			if(y2 == y3) {
				drawer.T209_lc2_horizontal = true;
				drawer.T209_lc2_vertical = false;
				drawer.T209_lc2_borderY = y2;
				drawer.T209_lc2_leftOrAbove = (drawer.T209_sy <= y2);
			} else if(x2 == x3) {
				drawer.T209_lc2_horizontal = false;
				drawer.T209_lc2_vertical = true;
				drawer.T209_lc2_borderX = x2;
				drawer.T209_lc2_leftOrAbove = (drawer.T209_sx <= x2);
			} else {
				drawer.T209_lc2_horizontal = false;
				drawer.T209_lc2_vertical = false;
				drawer.T209_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T209_lc2_C = x2 - drawer.T209_lc2_m * y2;
				drawer.T209_lc2_leftOrAbove = (drawer.T209_sx < drawer.T209_lc2_m*drawer.T209_sy + drawer.T209_lc2_C);
			}

			if(y3 == y1) {
				drawer.T209_lc3_horizontal = true;
				drawer.T209_lc3_vertical = false;
				drawer.T209_lc3_borderY = y3;
				drawer.T209_lc3_leftOrAbove = (drawer.T209_sy <= y3);
			} else if(x3 == x1) {
				drawer.T209_lc3_horizontal = false;
				drawer.T209_lc3_vertical = true;
				drawer.T209_lc3_borderX = x3;
				drawer.T209_lc3_leftOrAbove = (drawer.T209_sx <= x3);
			} else {
				drawer.T209_lc3_horizontal = false;
				drawer.T209_lc3_vertical = false;
				drawer.T209_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T209_lc3_C = x3 - drawer.T209_lc3_m * y3;
				drawer.T209_lc3_leftOrAbove = (drawer.T209_sx < drawer.T209_lc3_m*drawer.T209_sy + drawer.T209_lc3_C);
			}

			drawer.T209_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T209_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T209_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T209_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T209_initializedWithValidData = true;
		}
	}

	public void loadTriangles8(SingleTriangle[] triangles) {
		int x1, y1, x2, y2, x3, y3;
		SingleTriangle t;

		t = triangles[210]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T210_r = t.r; drawer.T210_g = t.g; drawer.T210_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T210_initializedWithValidData = false;
		} else {

			drawer.T210_sx = (x1 + x2 + x3) / 3.0;
			drawer.T210_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T210_lc1_horizontal = true;
				drawer.T210_lc1_vertical = false;
				drawer.T210_lc1_borderY = y1;
				drawer.T210_lc1_leftOrAbove = (drawer.T210_sy <= y1);
			} else if(x1 == x2) {
				drawer.T210_lc1_horizontal = false;
				drawer.T210_lc1_vertical = true;
				drawer.T210_lc1_borderX = x1;
				drawer.T210_lc1_leftOrAbove = (drawer.T210_sx <= x1);
			} else {
				drawer.T210_lc1_horizontal = false;
				drawer.T210_lc1_vertical = false;
				drawer.T210_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T210_lc1_C = x1 - drawer.T210_lc1_m * y1;
				drawer.T210_lc1_leftOrAbove = (drawer.T210_sx < drawer.T210_lc1_m*drawer.T210_sy + drawer.T210_lc1_C);
			}

			if(y2 == y3) {
				drawer.T210_lc2_horizontal = true;
				drawer.T210_lc2_vertical = false;
				drawer.T210_lc2_borderY = y2;
				drawer.T210_lc2_leftOrAbove = (drawer.T210_sy <= y2);
			} else if(x2 == x3) {
				drawer.T210_lc2_horizontal = false;
				drawer.T210_lc2_vertical = true;
				drawer.T210_lc2_borderX = x2;
				drawer.T210_lc2_leftOrAbove = (drawer.T210_sx <= x2);
			} else {
				drawer.T210_lc2_horizontal = false;
				drawer.T210_lc2_vertical = false;
				drawer.T210_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T210_lc2_C = x2 - drawer.T210_lc2_m * y2;
				drawer.T210_lc2_leftOrAbove = (drawer.T210_sx < drawer.T210_lc2_m*drawer.T210_sy + drawer.T210_lc2_C);
			}

			if(y3 == y1) {
				drawer.T210_lc3_horizontal = true;
				drawer.T210_lc3_vertical = false;
				drawer.T210_lc3_borderY = y3;
				drawer.T210_lc3_leftOrAbove = (drawer.T210_sy <= y3);
			} else if(x3 == x1) {
				drawer.T210_lc3_horizontal = false;
				drawer.T210_lc3_vertical = true;
				drawer.T210_lc3_borderX = x3;
				drawer.T210_lc3_leftOrAbove = (drawer.T210_sx <= x3);
			} else {
				drawer.T210_lc3_horizontal = false;
				drawer.T210_lc3_vertical = false;
				drawer.T210_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T210_lc3_C = x3 - drawer.T210_lc3_m * y3;
				drawer.T210_lc3_leftOrAbove = (drawer.T210_sx < drawer.T210_lc3_m*drawer.T210_sy + drawer.T210_lc3_C);
			}

			drawer.T210_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T210_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T210_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T210_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T210_initializedWithValidData = true;
		}

		t = triangles[211]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T211_r = t.r; drawer.T211_g = t.g; drawer.T211_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T211_initializedWithValidData = false;
		} else {

			drawer.T211_sx = (x1 + x2 + x3) / 3.0;
			drawer.T211_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T211_lc1_horizontal = true;
				drawer.T211_lc1_vertical = false;
				drawer.T211_lc1_borderY = y1;
				drawer.T211_lc1_leftOrAbove = (drawer.T211_sy <= y1);
			} else if(x1 == x2) {
				drawer.T211_lc1_horizontal = false;
				drawer.T211_lc1_vertical = true;
				drawer.T211_lc1_borderX = x1;
				drawer.T211_lc1_leftOrAbove = (drawer.T211_sx <= x1);
			} else {
				drawer.T211_lc1_horizontal = false;
				drawer.T211_lc1_vertical = false;
				drawer.T211_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T211_lc1_C = x1 - drawer.T211_lc1_m * y1;
				drawer.T211_lc1_leftOrAbove = (drawer.T211_sx < drawer.T211_lc1_m*drawer.T211_sy + drawer.T211_lc1_C);
			}

			if(y2 == y3) {
				drawer.T211_lc2_horizontal = true;
				drawer.T211_lc2_vertical = false;
				drawer.T211_lc2_borderY = y2;
				drawer.T211_lc2_leftOrAbove = (drawer.T211_sy <= y2);
			} else if(x2 == x3) {
				drawer.T211_lc2_horizontal = false;
				drawer.T211_lc2_vertical = true;
				drawer.T211_lc2_borderX = x2;
				drawer.T211_lc2_leftOrAbove = (drawer.T211_sx <= x2);
			} else {
				drawer.T211_lc2_horizontal = false;
				drawer.T211_lc2_vertical = false;
				drawer.T211_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T211_lc2_C = x2 - drawer.T211_lc2_m * y2;
				drawer.T211_lc2_leftOrAbove = (drawer.T211_sx < drawer.T211_lc2_m*drawer.T211_sy + drawer.T211_lc2_C);
			}

			if(y3 == y1) {
				drawer.T211_lc3_horizontal = true;
				drawer.T211_lc3_vertical = false;
				drawer.T211_lc3_borderY = y3;
				drawer.T211_lc3_leftOrAbove = (drawer.T211_sy <= y3);
			} else if(x3 == x1) {
				drawer.T211_lc3_horizontal = false;
				drawer.T211_lc3_vertical = true;
				drawer.T211_lc3_borderX = x3;
				drawer.T211_lc3_leftOrAbove = (drawer.T211_sx <= x3);
			} else {
				drawer.T211_lc3_horizontal = false;
				drawer.T211_lc3_vertical = false;
				drawer.T211_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T211_lc3_C = x3 - drawer.T211_lc3_m * y3;
				drawer.T211_lc3_leftOrAbove = (drawer.T211_sx < drawer.T211_lc3_m*drawer.T211_sy + drawer.T211_lc3_C);
			}

			drawer.T211_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T211_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T211_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T211_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T211_initializedWithValidData = true;
		}

		t = triangles[212]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T212_r = t.r; drawer.T212_g = t.g; drawer.T212_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T212_initializedWithValidData = false;
		} else {

			drawer.T212_sx = (x1 + x2 + x3) / 3.0;
			drawer.T212_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T212_lc1_horizontal = true;
				drawer.T212_lc1_vertical = false;
				drawer.T212_lc1_borderY = y1;
				drawer.T212_lc1_leftOrAbove = (drawer.T212_sy <= y1);
			} else if(x1 == x2) {
				drawer.T212_lc1_horizontal = false;
				drawer.T212_lc1_vertical = true;
				drawer.T212_lc1_borderX = x1;
				drawer.T212_lc1_leftOrAbove = (drawer.T212_sx <= x1);
			} else {
				drawer.T212_lc1_horizontal = false;
				drawer.T212_lc1_vertical = false;
				drawer.T212_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T212_lc1_C = x1 - drawer.T212_lc1_m * y1;
				drawer.T212_lc1_leftOrAbove = (drawer.T212_sx < drawer.T212_lc1_m*drawer.T212_sy + drawer.T212_lc1_C);
			}

			if(y2 == y3) {
				drawer.T212_lc2_horizontal = true;
				drawer.T212_lc2_vertical = false;
				drawer.T212_lc2_borderY = y2;
				drawer.T212_lc2_leftOrAbove = (drawer.T212_sy <= y2);
			} else if(x2 == x3) {
				drawer.T212_lc2_horizontal = false;
				drawer.T212_lc2_vertical = true;
				drawer.T212_lc2_borderX = x2;
				drawer.T212_lc2_leftOrAbove = (drawer.T212_sx <= x2);
			} else {
				drawer.T212_lc2_horizontal = false;
				drawer.T212_lc2_vertical = false;
				drawer.T212_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T212_lc2_C = x2 - drawer.T212_lc2_m * y2;
				drawer.T212_lc2_leftOrAbove = (drawer.T212_sx < drawer.T212_lc2_m*drawer.T212_sy + drawer.T212_lc2_C);
			}

			if(y3 == y1) {
				drawer.T212_lc3_horizontal = true;
				drawer.T212_lc3_vertical = false;
				drawer.T212_lc3_borderY = y3;
				drawer.T212_lc3_leftOrAbove = (drawer.T212_sy <= y3);
			} else if(x3 == x1) {
				drawer.T212_lc3_horizontal = false;
				drawer.T212_lc3_vertical = true;
				drawer.T212_lc3_borderX = x3;
				drawer.T212_lc3_leftOrAbove = (drawer.T212_sx <= x3);
			} else {
				drawer.T212_lc3_horizontal = false;
				drawer.T212_lc3_vertical = false;
				drawer.T212_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T212_lc3_C = x3 - drawer.T212_lc3_m * y3;
				drawer.T212_lc3_leftOrAbove = (drawer.T212_sx < drawer.T212_lc3_m*drawer.T212_sy + drawer.T212_lc3_C);
			}

			drawer.T212_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T212_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T212_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T212_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T212_initializedWithValidData = true;
		}

		t = triangles[213]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T213_r = t.r; drawer.T213_g = t.g; drawer.T213_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T213_initializedWithValidData = false;
		} else {

			drawer.T213_sx = (x1 + x2 + x3) / 3.0;
			drawer.T213_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T213_lc1_horizontal = true;
				drawer.T213_lc1_vertical = false;
				drawer.T213_lc1_borderY = y1;
				drawer.T213_lc1_leftOrAbove = (drawer.T213_sy <= y1);
			} else if(x1 == x2) {
				drawer.T213_lc1_horizontal = false;
				drawer.T213_lc1_vertical = true;
				drawer.T213_lc1_borderX = x1;
				drawer.T213_lc1_leftOrAbove = (drawer.T213_sx <= x1);
			} else {
				drawer.T213_lc1_horizontal = false;
				drawer.T213_lc1_vertical = false;
				drawer.T213_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T213_lc1_C = x1 - drawer.T213_lc1_m * y1;
				drawer.T213_lc1_leftOrAbove = (drawer.T213_sx < drawer.T213_lc1_m*drawer.T213_sy + drawer.T213_lc1_C);
			}

			if(y2 == y3) {
				drawer.T213_lc2_horizontal = true;
				drawer.T213_lc2_vertical = false;
				drawer.T213_lc2_borderY = y2;
				drawer.T213_lc2_leftOrAbove = (drawer.T213_sy <= y2);
			} else if(x2 == x3) {
				drawer.T213_lc2_horizontal = false;
				drawer.T213_lc2_vertical = true;
				drawer.T213_lc2_borderX = x2;
				drawer.T213_lc2_leftOrAbove = (drawer.T213_sx <= x2);
			} else {
				drawer.T213_lc2_horizontal = false;
				drawer.T213_lc2_vertical = false;
				drawer.T213_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T213_lc2_C = x2 - drawer.T213_lc2_m * y2;
				drawer.T213_lc2_leftOrAbove = (drawer.T213_sx < drawer.T213_lc2_m*drawer.T213_sy + drawer.T213_lc2_C);
			}

			if(y3 == y1) {
				drawer.T213_lc3_horizontal = true;
				drawer.T213_lc3_vertical = false;
				drawer.T213_lc3_borderY = y3;
				drawer.T213_lc3_leftOrAbove = (drawer.T213_sy <= y3);
			} else if(x3 == x1) {
				drawer.T213_lc3_horizontal = false;
				drawer.T213_lc3_vertical = true;
				drawer.T213_lc3_borderX = x3;
				drawer.T213_lc3_leftOrAbove = (drawer.T213_sx <= x3);
			} else {
				drawer.T213_lc3_horizontal = false;
				drawer.T213_lc3_vertical = false;
				drawer.T213_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T213_lc3_C = x3 - drawer.T213_lc3_m * y3;
				drawer.T213_lc3_leftOrAbove = (drawer.T213_sx < drawer.T213_lc3_m*drawer.T213_sy + drawer.T213_lc3_C);
			}

			drawer.T213_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T213_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T213_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T213_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T213_initializedWithValidData = true;
		}

		t = triangles[214]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T214_r = t.r; drawer.T214_g = t.g; drawer.T214_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T214_initializedWithValidData = false;
		} else {

			drawer.T214_sx = (x1 + x2 + x3) / 3.0;
			drawer.T214_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T214_lc1_horizontal = true;
				drawer.T214_lc1_vertical = false;
				drawer.T214_lc1_borderY = y1;
				drawer.T214_lc1_leftOrAbove = (drawer.T214_sy <= y1);
			} else if(x1 == x2) {
				drawer.T214_lc1_horizontal = false;
				drawer.T214_lc1_vertical = true;
				drawer.T214_lc1_borderX = x1;
				drawer.T214_lc1_leftOrAbove = (drawer.T214_sx <= x1);
			} else {
				drawer.T214_lc1_horizontal = false;
				drawer.T214_lc1_vertical = false;
				drawer.T214_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T214_lc1_C = x1 - drawer.T214_lc1_m * y1;
				drawer.T214_lc1_leftOrAbove = (drawer.T214_sx < drawer.T214_lc1_m*drawer.T214_sy + drawer.T214_lc1_C);
			}

			if(y2 == y3) {
				drawer.T214_lc2_horizontal = true;
				drawer.T214_lc2_vertical = false;
				drawer.T214_lc2_borderY = y2;
				drawer.T214_lc2_leftOrAbove = (drawer.T214_sy <= y2);
			} else if(x2 == x3) {
				drawer.T214_lc2_horizontal = false;
				drawer.T214_lc2_vertical = true;
				drawer.T214_lc2_borderX = x2;
				drawer.T214_lc2_leftOrAbove = (drawer.T214_sx <= x2);
			} else {
				drawer.T214_lc2_horizontal = false;
				drawer.T214_lc2_vertical = false;
				drawer.T214_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T214_lc2_C = x2 - drawer.T214_lc2_m * y2;
				drawer.T214_lc2_leftOrAbove = (drawer.T214_sx < drawer.T214_lc2_m*drawer.T214_sy + drawer.T214_lc2_C);
			}

			if(y3 == y1) {
				drawer.T214_lc3_horizontal = true;
				drawer.T214_lc3_vertical = false;
				drawer.T214_lc3_borderY = y3;
				drawer.T214_lc3_leftOrAbove = (drawer.T214_sy <= y3);
			} else if(x3 == x1) {
				drawer.T214_lc3_horizontal = false;
				drawer.T214_lc3_vertical = true;
				drawer.T214_lc3_borderX = x3;
				drawer.T214_lc3_leftOrAbove = (drawer.T214_sx <= x3);
			} else {
				drawer.T214_lc3_horizontal = false;
				drawer.T214_lc3_vertical = false;
				drawer.T214_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T214_lc3_C = x3 - drawer.T214_lc3_m * y3;
				drawer.T214_lc3_leftOrAbove = (drawer.T214_sx < drawer.T214_lc3_m*drawer.T214_sy + drawer.T214_lc3_C);
			}

			drawer.T214_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T214_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T214_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T214_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T214_initializedWithValidData = true;
		}

		t = triangles[215]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T215_r = t.r; drawer.T215_g = t.g; drawer.T215_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T215_initializedWithValidData = false;
		} else {

			drawer.T215_sx = (x1 + x2 + x3) / 3.0;
			drawer.T215_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T215_lc1_horizontal = true;
				drawer.T215_lc1_vertical = false;
				drawer.T215_lc1_borderY = y1;
				drawer.T215_lc1_leftOrAbove = (drawer.T215_sy <= y1);
			} else if(x1 == x2) {
				drawer.T215_lc1_horizontal = false;
				drawer.T215_lc1_vertical = true;
				drawer.T215_lc1_borderX = x1;
				drawer.T215_lc1_leftOrAbove = (drawer.T215_sx <= x1);
			} else {
				drawer.T215_lc1_horizontal = false;
				drawer.T215_lc1_vertical = false;
				drawer.T215_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T215_lc1_C = x1 - drawer.T215_lc1_m * y1;
				drawer.T215_lc1_leftOrAbove = (drawer.T215_sx < drawer.T215_lc1_m*drawer.T215_sy + drawer.T215_lc1_C);
			}

			if(y2 == y3) {
				drawer.T215_lc2_horizontal = true;
				drawer.T215_lc2_vertical = false;
				drawer.T215_lc2_borderY = y2;
				drawer.T215_lc2_leftOrAbove = (drawer.T215_sy <= y2);
			} else if(x2 == x3) {
				drawer.T215_lc2_horizontal = false;
				drawer.T215_lc2_vertical = true;
				drawer.T215_lc2_borderX = x2;
				drawer.T215_lc2_leftOrAbove = (drawer.T215_sx <= x2);
			} else {
				drawer.T215_lc2_horizontal = false;
				drawer.T215_lc2_vertical = false;
				drawer.T215_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T215_lc2_C = x2 - drawer.T215_lc2_m * y2;
				drawer.T215_lc2_leftOrAbove = (drawer.T215_sx < drawer.T215_lc2_m*drawer.T215_sy + drawer.T215_lc2_C);
			}

			if(y3 == y1) {
				drawer.T215_lc3_horizontal = true;
				drawer.T215_lc3_vertical = false;
				drawer.T215_lc3_borderY = y3;
				drawer.T215_lc3_leftOrAbove = (drawer.T215_sy <= y3);
			} else if(x3 == x1) {
				drawer.T215_lc3_horizontal = false;
				drawer.T215_lc3_vertical = true;
				drawer.T215_lc3_borderX = x3;
				drawer.T215_lc3_leftOrAbove = (drawer.T215_sx <= x3);
			} else {
				drawer.T215_lc3_horizontal = false;
				drawer.T215_lc3_vertical = false;
				drawer.T215_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T215_lc3_C = x3 - drawer.T215_lc3_m * y3;
				drawer.T215_lc3_leftOrAbove = (drawer.T215_sx < drawer.T215_lc3_m*drawer.T215_sy + drawer.T215_lc3_C);
			}

			drawer.T215_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T215_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T215_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T215_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T215_initializedWithValidData = true;
		}

		t = triangles[216]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T216_r = t.r; drawer.T216_g = t.g; drawer.T216_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T216_initializedWithValidData = false;
		} else {

			drawer.T216_sx = (x1 + x2 + x3) / 3.0;
			drawer.T216_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T216_lc1_horizontal = true;
				drawer.T216_lc1_vertical = false;
				drawer.T216_lc1_borderY = y1;
				drawer.T216_lc1_leftOrAbove = (drawer.T216_sy <= y1);
			} else if(x1 == x2) {
				drawer.T216_lc1_horizontal = false;
				drawer.T216_lc1_vertical = true;
				drawer.T216_lc1_borderX = x1;
				drawer.T216_lc1_leftOrAbove = (drawer.T216_sx <= x1);
			} else {
				drawer.T216_lc1_horizontal = false;
				drawer.T216_lc1_vertical = false;
				drawer.T216_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T216_lc1_C = x1 - drawer.T216_lc1_m * y1;
				drawer.T216_lc1_leftOrAbove = (drawer.T216_sx < drawer.T216_lc1_m*drawer.T216_sy + drawer.T216_lc1_C);
			}

			if(y2 == y3) {
				drawer.T216_lc2_horizontal = true;
				drawer.T216_lc2_vertical = false;
				drawer.T216_lc2_borderY = y2;
				drawer.T216_lc2_leftOrAbove = (drawer.T216_sy <= y2);
			} else if(x2 == x3) {
				drawer.T216_lc2_horizontal = false;
				drawer.T216_lc2_vertical = true;
				drawer.T216_lc2_borderX = x2;
				drawer.T216_lc2_leftOrAbove = (drawer.T216_sx <= x2);
			} else {
				drawer.T216_lc2_horizontal = false;
				drawer.T216_lc2_vertical = false;
				drawer.T216_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T216_lc2_C = x2 - drawer.T216_lc2_m * y2;
				drawer.T216_lc2_leftOrAbove = (drawer.T216_sx < drawer.T216_lc2_m*drawer.T216_sy + drawer.T216_lc2_C);
			}

			if(y3 == y1) {
				drawer.T216_lc3_horizontal = true;
				drawer.T216_lc3_vertical = false;
				drawer.T216_lc3_borderY = y3;
				drawer.T216_lc3_leftOrAbove = (drawer.T216_sy <= y3);
			} else if(x3 == x1) {
				drawer.T216_lc3_horizontal = false;
				drawer.T216_lc3_vertical = true;
				drawer.T216_lc3_borderX = x3;
				drawer.T216_lc3_leftOrAbove = (drawer.T216_sx <= x3);
			} else {
				drawer.T216_lc3_horizontal = false;
				drawer.T216_lc3_vertical = false;
				drawer.T216_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T216_lc3_C = x3 - drawer.T216_lc3_m * y3;
				drawer.T216_lc3_leftOrAbove = (drawer.T216_sx < drawer.T216_lc3_m*drawer.T216_sy + drawer.T216_lc3_C);
			}

			drawer.T216_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T216_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T216_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T216_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T216_initializedWithValidData = true;
		}

		t = triangles[217]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T217_r = t.r; drawer.T217_g = t.g; drawer.T217_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T217_initializedWithValidData = false;
		} else {

			drawer.T217_sx = (x1 + x2 + x3) / 3.0;
			drawer.T217_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T217_lc1_horizontal = true;
				drawer.T217_lc1_vertical = false;
				drawer.T217_lc1_borderY = y1;
				drawer.T217_lc1_leftOrAbove = (drawer.T217_sy <= y1);
			} else if(x1 == x2) {
				drawer.T217_lc1_horizontal = false;
				drawer.T217_lc1_vertical = true;
				drawer.T217_lc1_borderX = x1;
				drawer.T217_lc1_leftOrAbove = (drawer.T217_sx <= x1);
			} else {
				drawer.T217_lc1_horizontal = false;
				drawer.T217_lc1_vertical = false;
				drawer.T217_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T217_lc1_C = x1 - drawer.T217_lc1_m * y1;
				drawer.T217_lc1_leftOrAbove = (drawer.T217_sx < drawer.T217_lc1_m*drawer.T217_sy + drawer.T217_lc1_C);
			}

			if(y2 == y3) {
				drawer.T217_lc2_horizontal = true;
				drawer.T217_lc2_vertical = false;
				drawer.T217_lc2_borderY = y2;
				drawer.T217_lc2_leftOrAbove = (drawer.T217_sy <= y2);
			} else if(x2 == x3) {
				drawer.T217_lc2_horizontal = false;
				drawer.T217_lc2_vertical = true;
				drawer.T217_lc2_borderX = x2;
				drawer.T217_lc2_leftOrAbove = (drawer.T217_sx <= x2);
			} else {
				drawer.T217_lc2_horizontal = false;
				drawer.T217_lc2_vertical = false;
				drawer.T217_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T217_lc2_C = x2 - drawer.T217_lc2_m * y2;
				drawer.T217_lc2_leftOrAbove = (drawer.T217_sx < drawer.T217_lc2_m*drawer.T217_sy + drawer.T217_lc2_C);
			}

			if(y3 == y1) {
				drawer.T217_lc3_horizontal = true;
				drawer.T217_lc3_vertical = false;
				drawer.T217_lc3_borderY = y3;
				drawer.T217_lc3_leftOrAbove = (drawer.T217_sy <= y3);
			} else if(x3 == x1) {
				drawer.T217_lc3_horizontal = false;
				drawer.T217_lc3_vertical = true;
				drawer.T217_lc3_borderX = x3;
				drawer.T217_lc3_leftOrAbove = (drawer.T217_sx <= x3);
			} else {
				drawer.T217_lc3_horizontal = false;
				drawer.T217_lc3_vertical = false;
				drawer.T217_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T217_lc3_C = x3 - drawer.T217_lc3_m * y3;
				drawer.T217_lc3_leftOrAbove = (drawer.T217_sx < drawer.T217_lc3_m*drawer.T217_sy + drawer.T217_lc3_C);
			}

			drawer.T217_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T217_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T217_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T217_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T217_initializedWithValidData = true;
		}

		t = triangles[218]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T218_r = t.r; drawer.T218_g = t.g; drawer.T218_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T218_initializedWithValidData = false;
		} else {

			drawer.T218_sx = (x1 + x2 + x3) / 3.0;
			drawer.T218_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T218_lc1_horizontal = true;
				drawer.T218_lc1_vertical = false;
				drawer.T218_lc1_borderY = y1;
				drawer.T218_lc1_leftOrAbove = (drawer.T218_sy <= y1);
			} else if(x1 == x2) {
				drawer.T218_lc1_horizontal = false;
				drawer.T218_lc1_vertical = true;
				drawer.T218_lc1_borderX = x1;
				drawer.T218_lc1_leftOrAbove = (drawer.T218_sx <= x1);
			} else {
				drawer.T218_lc1_horizontal = false;
				drawer.T218_lc1_vertical = false;
				drawer.T218_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T218_lc1_C = x1 - drawer.T218_lc1_m * y1;
				drawer.T218_lc1_leftOrAbove = (drawer.T218_sx < drawer.T218_lc1_m*drawer.T218_sy + drawer.T218_lc1_C);
			}

			if(y2 == y3) {
				drawer.T218_lc2_horizontal = true;
				drawer.T218_lc2_vertical = false;
				drawer.T218_lc2_borderY = y2;
				drawer.T218_lc2_leftOrAbove = (drawer.T218_sy <= y2);
			} else if(x2 == x3) {
				drawer.T218_lc2_horizontal = false;
				drawer.T218_lc2_vertical = true;
				drawer.T218_lc2_borderX = x2;
				drawer.T218_lc2_leftOrAbove = (drawer.T218_sx <= x2);
			} else {
				drawer.T218_lc2_horizontal = false;
				drawer.T218_lc2_vertical = false;
				drawer.T218_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T218_lc2_C = x2 - drawer.T218_lc2_m * y2;
				drawer.T218_lc2_leftOrAbove = (drawer.T218_sx < drawer.T218_lc2_m*drawer.T218_sy + drawer.T218_lc2_C);
			}

			if(y3 == y1) {
				drawer.T218_lc3_horizontal = true;
				drawer.T218_lc3_vertical = false;
				drawer.T218_lc3_borderY = y3;
				drawer.T218_lc3_leftOrAbove = (drawer.T218_sy <= y3);
			} else if(x3 == x1) {
				drawer.T218_lc3_horizontal = false;
				drawer.T218_lc3_vertical = true;
				drawer.T218_lc3_borderX = x3;
				drawer.T218_lc3_leftOrAbove = (drawer.T218_sx <= x3);
			} else {
				drawer.T218_lc3_horizontal = false;
				drawer.T218_lc3_vertical = false;
				drawer.T218_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T218_lc3_C = x3 - drawer.T218_lc3_m * y3;
				drawer.T218_lc3_leftOrAbove = (drawer.T218_sx < drawer.T218_lc3_m*drawer.T218_sy + drawer.T218_lc3_C);
			}

			drawer.T218_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T218_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T218_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T218_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T218_initializedWithValidData = true;
		}

		t = triangles[219]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T219_r = t.r; drawer.T219_g = t.g; drawer.T219_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T219_initializedWithValidData = false;
		} else {

			drawer.T219_sx = (x1 + x2 + x3) / 3.0;
			drawer.T219_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T219_lc1_horizontal = true;
				drawer.T219_lc1_vertical = false;
				drawer.T219_lc1_borderY = y1;
				drawer.T219_lc1_leftOrAbove = (drawer.T219_sy <= y1);
			} else if(x1 == x2) {
				drawer.T219_lc1_horizontal = false;
				drawer.T219_lc1_vertical = true;
				drawer.T219_lc1_borderX = x1;
				drawer.T219_lc1_leftOrAbove = (drawer.T219_sx <= x1);
			} else {
				drawer.T219_lc1_horizontal = false;
				drawer.T219_lc1_vertical = false;
				drawer.T219_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T219_lc1_C = x1 - drawer.T219_lc1_m * y1;
				drawer.T219_lc1_leftOrAbove = (drawer.T219_sx < drawer.T219_lc1_m*drawer.T219_sy + drawer.T219_lc1_C);
			}

			if(y2 == y3) {
				drawer.T219_lc2_horizontal = true;
				drawer.T219_lc2_vertical = false;
				drawer.T219_lc2_borderY = y2;
				drawer.T219_lc2_leftOrAbove = (drawer.T219_sy <= y2);
			} else if(x2 == x3) {
				drawer.T219_lc2_horizontal = false;
				drawer.T219_lc2_vertical = true;
				drawer.T219_lc2_borderX = x2;
				drawer.T219_lc2_leftOrAbove = (drawer.T219_sx <= x2);
			} else {
				drawer.T219_lc2_horizontal = false;
				drawer.T219_lc2_vertical = false;
				drawer.T219_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T219_lc2_C = x2 - drawer.T219_lc2_m * y2;
				drawer.T219_lc2_leftOrAbove = (drawer.T219_sx < drawer.T219_lc2_m*drawer.T219_sy + drawer.T219_lc2_C);
			}

			if(y3 == y1) {
				drawer.T219_lc3_horizontal = true;
				drawer.T219_lc3_vertical = false;
				drawer.T219_lc3_borderY = y3;
				drawer.T219_lc3_leftOrAbove = (drawer.T219_sy <= y3);
			} else if(x3 == x1) {
				drawer.T219_lc3_horizontal = false;
				drawer.T219_lc3_vertical = true;
				drawer.T219_lc3_borderX = x3;
				drawer.T219_lc3_leftOrAbove = (drawer.T219_sx <= x3);
			} else {
				drawer.T219_lc3_horizontal = false;
				drawer.T219_lc3_vertical = false;
				drawer.T219_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T219_lc3_C = x3 - drawer.T219_lc3_m * y3;
				drawer.T219_lc3_leftOrAbove = (drawer.T219_sx < drawer.T219_lc3_m*drawer.T219_sy + drawer.T219_lc3_C);
			}

			drawer.T219_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T219_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T219_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T219_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T219_initializedWithValidData = true;
		}

		t = triangles[220]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T220_r = t.r; drawer.T220_g = t.g; drawer.T220_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T220_initializedWithValidData = false;
		} else {

			drawer.T220_sx = (x1 + x2 + x3) / 3.0;
			drawer.T220_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T220_lc1_horizontal = true;
				drawer.T220_lc1_vertical = false;
				drawer.T220_lc1_borderY = y1;
				drawer.T220_lc1_leftOrAbove = (drawer.T220_sy <= y1);
			} else if(x1 == x2) {
				drawer.T220_lc1_horizontal = false;
				drawer.T220_lc1_vertical = true;
				drawer.T220_lc1_borderX = x1;
				drawer.T220_lc1_leftOrAbove = (drawer.T220_sx <= x1);
			} else {
				drawer.T220_lc1_horizontal = false;
				drawer.T220_lc1_vertical = false;
				drawer.T220_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T220_lc1_C = x1 - drawer.T220_lc1_m * y1;
				drawer.T220_lc1_leftOrAbove = (drawer.T220_sx < drawer.T220_lc1_m*drawer.T220_sy + drawer.T220_lc1_C);
			}

			if(y2 == y3) {
				drawer.T220_lc2_horizontal = true;
				drawer.T220_lc2_vertical = false;
				drawer.T220_lc2_borderY = y2;
				drawer.T220_lc2_leftOrAbove = (drawer.T220_sy <= y2);
			} else if(x2 == x3) {
				drawer.T220_lc2_horizontal = false;
				drawer.T220_lc2_vertical = true;
				drawer.T220_lc2_borderX = x2;
				drawer.T220_lc2_leftOrAbove = (drawer.T220_sx <= x2);
			} else {
				drawer.T220_lc2_horizontal = false;
				drawer.T220_lc2_vertical = false;
				drawer.T220_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T220_lc2_C = x2 - drawer.T220_lc2_m * y2;
				drawer.T220_lc2_leftOrAbove = (drawer.T220_sx < drawer.T220_lc2_m*drawer.T220_sy + drawer.T220_lc2_C);
			}

			if(y3 == y1) {
				drawer.T220_lc3_horizontal = true;
				drawer.T220_lc3_vertical = false;
				drawer.T220_lc3_borderY = y3;
				drawer.T220_lc3_leftOrAbove = (drawer.T220_sy <= y3);
			} else if(x3 == x1) {
				drawer.T220_lc3_horizontal = false;
				drawer.T220_lc3_vertical = true;
				drawer.T220_lc3_borderX = x3;
				drawer.T220_lc3_leftOrAbove = (drawer.T220_sx <= x3);
			} else {
				drawer.T220_lc3_horizontal = false;
				drawer.T220_lc3_vertical = false;
				drawer.T220_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T220_lc3_C = x3 - drawer.T220_lc3_m * y3;
				drawer.T220_lc3_leftOrAbove = (drawer.T220_sx < drawer.T220_lc3_m*drawer.T220_sy + drawer.T220_lc3_C);
			}

			drawer.T220_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T220_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T220_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T220_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T220_initializedWithValidData = true;
		}

		t = triangles[221]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T221_r = t.r; drawer.T221_g = t.g; drawer.T221_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T221_initializedWithValidData = false;
		} else {

			drawer.T221_sx = (x1 + x2 + x3) / 3.0;
			drawer.T221_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T221_lc1_horizontal = true;
				drawer.T221_lc1_vertical = false;
				drawer.T221_lc1_borderY = y1;
				drawer.T221_lc1_leftOrAbove = (drawer.T221_sy <= y1);
			} else if(x1 == x2) {
				drawer.T221_lc1_horizontal = false;
				drawer.T221_lc1_vertical = true;
				drawer.T221_lc1_borderX = x1;
				drawer.T221_lc1_leftOrAbove = (drawer.T221_sx <= x1);
			} else {
				drawer.T221_lc1_horizontal = false;
				drawer.T221_lc1_vertical = false;
				drawer.T221_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T221_lc1_C = x1 - drawer.T221_lc1_m * y1;
				drawer.T221_lc1_leftOrAbove = (drawer.T221_sx < drawer.T221_lc1_m*drawer.T221_sy + drawer.T221_lc1_C);
			}

			if(y2 == y3) {
				drawer.T221_lc2_horizontal = true;
				drawer.T221_lc2_vertical = false;
				drawer.T221_lc2_borderY = y2;
				drawer.T221_lc2_leftOrAbove = (drawer.T221_sy <= y2);
			} else if(x2 == x3) {
				drawer.T221_lc2_horizontal = false;
				drawer.T221_lc2_vertical = true;
				drawer.T221_lc2_borderX = x2;
				drawer.T221_lc2_leftOrAbove = (drawer.T221_sx <= x2);
			} else {
				drawer.T221_lc2_horizontal = false;
				drawer.T221_lc2_vertical = false;
				drawer.T221_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T221_lc2_C = x2 - drawer.T221_lc2_m * y2;
				drawer.T221_lc2_leftOrAbove = (drawer.T221_sx < drawer.T221_lc2_m*drawer.T221_sy + drawer.T221_lc2_C);
			}

			if(y3 == y1) {
				drawer.T221_lc3_horizontal = true;
				drawer.T221_lc3_vertical = false;
				drawer.T221_lc3_borderY = y3;
				drawer.T221_lc3_leftOrAbove = (drawer.T221_sy <= y3);
			} else if(x3 == x1) {
				drawer.T221_lc3_horizontal = false;
				drawer.T221_lc3_vertical = true;
				drawer.T221_lc3_borderX = x3;
				drawer.T221_lc3_leftOrAbove = (drawer.T221_sx <= x3);
			} else {
				drawer.T221_lc3_horizontal = false;
				drawer.T221_lc3_vertical = false;
				drawer.T221_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T221_lc3_C = x3 - drawer.T221_lc3_m * y3;
				drawer.T221_lc3_leftOrAbove = (drawer.T221_sx < drawer.T221_lc3_m*drawer.T221_sy + drawer.T221_lc3_C);
			}

			drawer.T221_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T221_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T221_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T221_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T221_initializedWithValidData = true;
		}

		t = triangles[222]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T222_r = t.r; drawer.T222_g = t.g; drawer.T222_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T222_initializedWithValidData = false;
		} else {

			drawer.T222_sx = (x1 + x2 + x3) / 3.0;
			drawer.T222_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T222_lc1_horizontal = true;
				drawer.T222_lc1_vertical = false;
				drawer.T222_lc1_borderY = y1;
				drawer.T222_lc1_leftOrAbove = (drawer.T222_sy <= y1);
			} else if(x1 == x2) {
				drawer.T222_lc1_horizontal = false;
				drawer.T222_lc1_vertical = true;
				drawer.T222_lc1_borderX = x1;
				drawer.T222_lc1_leftOrAbove = (drawer.T222_sx <= x1);
			} else {
				drawer.T222_lc1_horizontal = false;
				drawer.T222_lc1_vertical = false;
				drawer.T222_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T222_lc1_C = x1 - drawer.T222_lc1_m * y1;
				drawer.T222_lc1_leftOrAbove = (drawer.T222_sx < drawer.T222_lc1_m*drawer.T222_sy + drawer.T222_lc1_C);
			}

			if(y2 == y3) {
				drawer.T222_lc2_horizontal = true;
				drawer.T222_lc2_vertical = false;
				drawer.T222_lc2_borderY = y2;
				drawer.T222_lc2_leftOrAbove = (drawer.T222_sy <= y2);
			} else if(x2 == x3) {
				drawer.T222_lc2_horizontal = false;
				drawer.T222_lc2_vertical = true;
				drawer.T222_lc2_borderX = x2;
				drawer.T222_lc2_leftOrAbove = (drawer.T222_sx <= x2);
			} else {
				drawer.T222_lc2_horizontal = false;
				drawer.T222_lc2_vertical = false;
				drawer.T222_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T222_lc2_C = x2 - drawer.T222_lc2_m * y2;
				drawer.T222_lc2_leftOrAbove = (drawer.T222_sx < drawer.T222_lc2_m*drawer.T222_sy + drawer.T222_lc2_C);
			}

			if(y3 == y1) {
				drawer.T222_lc3_horizontal = true;
				drawer.T222_lc3_vertical = false;
				drawer.T222_lc3_borderY = y3;
				drawer.T222_lc3_leftOrAbove = (drawer.T222_sy <= y3);
			} else if(x3 == x1) {
				drawer.T222_lc3_horizontal = false;
				drawer.T222_lc3_vertical = true;
				drawer.T222_lc3_borderX = x3;
				drawer.T222_lc3_leftOrAbove = (drawer.T222_sx <= x3);
			} else {
				drawer.T222_lc3_horizontal = false;
				drawer.T222_lc3_vertical = false;
				drawer.T222_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T222_lc3_C = x3 - drawer.T222_lc3_m * y3;
				drawer.T222_lc3_leftOrAbove = (drawer.T222_sx < drawer.T222_lc3_m*drawer.T222_sy + drawer.T222_lc3_C);
			}

			drawer.T222_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T222_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T222_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T222_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T222_initializedWithValidData = true;
		}

		t = triangles[223]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T223_r = t.r; drawer.T223_g = t.g; drawer.T223_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T223_initializedWithValidData = false;
		} else {

			drawer.T223_sx = (x1 + x2 + x3) / 3.0;
			drawer.T223_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T223_lc1_horizontal = true;
				drawer.T223_lc1_vertical = false;
				drawer.T223_lc1_borderY = y1;
				drawer.T223_lc1_leftOrAbove = (drawer.T223_sy <= y1);
			} else if(x1 == x2) {
				drawer.T223_lc1_horizontal = false;
				drawer.T223_lc1_vertical = true;
				drawer.T223_lc1_borderX = x1;
				drawer.T223_lc1_leftOrAbove = (drawer.T223_sx <= x1);
			} else {
				drawer.T223_lc1_horizontal = false;
				drawer.T223_lc1_vertical = false;
				drawer.T223_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T223_lc1_C = x1 - drawer.T223_lc1_m * y1;
				drawer.T223_lc1_leftOrAbove = (drawer.T223_sx < drawer.T223_lc1_m*drawer.T223_sy + drawer.T223_lc1_C);
			}

			if(y2 == y3) {
				drawer.T223_lc2_horizontal = true;
				drawer.T223_lc2_vertical = false;
				drawer.T223_lc2_borderY = y2;
				drawer.T223_lc2_leftOrAbove = (drawer.T223_sy <= y2);
			} else if(x2 == x3) {
				drawer.T223_lc2_horizontal = false;
				drawer.T223_lc2_vertical = true;
				drawer.T223_lc2_borderX = x2;
				drawer.T223_lc2_leftOrAbove = (drawer.T223_sx <= x2);
			} else {
				drawer.T223_lc2_horizontal = false;
				drawer.T223_lc2_vertical = false;
				drawer.T223_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T223_lc2_C = x2 - drawer.T223_lc2_m * y2;
				drawer.T223_lc2_leftOrAbove = (drawer.T223_sx < drawer.T223_lc2_m*drawer.T223_sy + drawer.T223_lc2_C);
			}

			if(y3 == y1) {
				drawer.T223_lc3_horizontal = true;
				drawer.T223_lc3_vertical = false;
				drawer.T223_lc3_borderY = y3;
				drawer.T223_lc3_leftOrAbove = (drawer.T223_sy <= y3);
			} else if(x3 == x1) {
				drawer.T223_lc3_horizontal = false;
				drawer.T223_lc3_vertical = true;
				drawer.T223_lc3_borderX = x3;
				drawer.T223_lc3_leftOrAbove = (drawer.T223_sx <= x3);
			} else {
				drawer.T223_lc3_horizontal = false;
				drawer.T223_lc3_vertical = false;
				drawer.T223_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T223_lc3_C = x3 - drawer.T223_lc3_m * y3;
				drawer.T223_lc3_leftOrAbove = (drawer.T223_sx < drawer.T223_lc3_m*drawer.T223_sy + drawer.T223_lc3_C);
			}

			drawer.T223_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T223_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T223_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T223_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T223_initializedWithValidData = true;
		}

		t = triangles[224]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T224_r = t.r; drawer.T224_g = t.g; drawer.T224_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T224_initializedWithValidData = false;
		} else {

			drawer.T224_sx = (x1 + x2 + x3) / 3.0;
			drawer.T224_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T224_lc1_horizontal = true;
				drawer.T224_lc1_vertical = false;
				drawer.T224_lc1_borderY = y1;
				drawer.T224_lc1_leftOrAbove = (drawer.T224_sy <= y1);
			} else if(x1 == x2) {
				drawer.T224_lc1_horizontal = false;
				drawer.T224_lc1_vertical = true;
				drawer.T224_lc1_borderX = x1;
				drawer.T224_lc1_leftOrAbove = (drawer.T224_sx <= x1);
			} else {
				drawer.T224_lc1_horizontal = false;
				drawer.T224_lc1_vertical = false;
				drawer.T224_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T224_lc1_C = x1 - drawer.T224_lc1_m * y1;
				drawer.T224_lc1_leftOrAbove = (drawer.T224_sx < drawer.T224_lc1_m*drawer.T224_sy + drawer.T224_lc1_C);
			}

			if(y2 == y3) {
				drawer.T224_lc2_horizontal = true;
				drawer.T224_lc2_vertical = false;
				drawer.T224_lc2_borderY = y2;
				drawer.T224_lc2_leftOrAbove = (drawer.T224_sy <= y2);
			} else if(x2 == x3) {
				drawer.T224_lc2_horizontal = false;
				drawer.T224_lc2_vertical = true;
				drawer.T224_lc2_borderX = x2;
				drawer.T224_lc2_leftOrAbove = (drawer.T224_sx <= x2);
			} else {
				drawer.T224_lc2_horizontal = false;
				drawer.T224_lc2_vertical = false;
				drawer.T224_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T224_lc2_C = x2 - drawer.T224_lc2_m * y2;
				drawer.T224_lc2_leftOrAbove = (drawer.T224_sx < drawer.T224_lc2_m*drawer.T224_sy + drawer.T224_lc2_C);
			}

			if(y3 == y1) {
				drawer.T224_lc3_horizontal = true;
				drawer.T224_lc3_vertical = false;
				drawer.T224_lc3_borderY = y3;
				drawer.T224_lc3_leftOrAbove = (drawer.T224_sy <= y3);
			} else if(x3 == x1) {
				drawer.T224_lc3_horizontal = false;
				drawer.T224_lc3_vertical = true;
				drawer.T224_lc3_borderX = x3;
				drawer.T224_lc3_leftOrAbove = (drawer.T224_sx <= x3);
			} else {
				drawer.T224_lc3_horizontal = false;
				drawer.T224_lc3_vertical = false;
				drawer.T224_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T224_lc3_C = x3 - drawer.T224_lc3_m * y3;
				drawer.T224_lc3_leftOrAbove = (drawer.T224_sx < drawer.T224_lc3_m*drawer.T224_sy + drawer.T224_lc3_C);
			}

			drawer.T224_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T224_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T224_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T224_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T224_initializedWithValidData = true;
		}

		t = triangles[225]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T225_r = t.r; drawer.T225_g = t.g; drawer.T225_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T225_initializedWithValidData = false;
		} else {

			drawer.T225_sx = (x1 + x2 + x3) / 3.0;
			drawer.T225_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T225_lc1_horizontal = true;
				drawer.T225_lc1_vertical = false;
				drawer.T225_lc1_borderY = y1;
				drawer.T225_lc1_leftOrAbove = (drawer.T225_sy <= y1);
			} else if(x1 == x2) {
				drawer.T225_lc1_horizontal = false;
				drawer.T225_lc1_vertical = true;
				drawer.T225_lc1_borderX = x1;
				drawer.T225_lc1_leftOrAbove = (drawer.T225_sx <= x1);
			} else {
				drawer.T225_lc1_horizontal = false;
				drawer.T225_lc1_vertical = false;
				drawer.T225_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T225_lc1_C = x1 - drawer.T225_lc1_m * y1;
				drawer.T225_lc1_leftOrAbove = (drawer.T225_sx < drawer.T225_lc1_m*drawer.T225_sy + drawer.T225_lc1_C);
			}

			if(y2 == y3) {
				drawer.T225_lc2_horizontal = true;
				drawer.T225_lc2_vertical = false;
				drawer.T225_lc2_borderY = y2;
				drawer.T225_lc2_leftOrAbove = (drawer.T225_sy <= y2);
			} else if(x2 == x3) {
				drawer.T225_lc2_horizontal = false;
				drawer.T225_lc2_vertical = true;
				drawer.T225_lc2_borderX = x2;
				drawer.T225_lc2_leftOrAbove = (drawer.T225_sx <= x2);
			} else {
				drawer.T225_lc2_horizontal = false;
				drawer.T225_lc2_vertical = false;
				drawer.T225_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T225_lc2_C = x2 - drawer.T225_lc2_m * y2;
				drawer.T225_lc2_leftOrAbove = (drawer.T225_sx < drawer.T225_lc2_m*drawer.T225_sy + drawer.T225_lc2_C);
			}

			if(y3 == y1) {
				drawer.T225_lc3_horizontal = true;
				drawer.T225_lc3_vertical = false;
				drawer.T225_lc3_borderY = y3;
				drawer.T225_lc3_leftOrAbove = (drawer.T225_sy <= y3);
			} else if(x3 == x1) {
				drawer.T225_lc3_horizontal = false;
				drawer.T225_lc3_vertical = true;
				drawer.T225_lc3_borderX = x3;
				drawer.T225_lc3_leftOrAbove = (drawer.T225_sx <= x3);
			} else {
				drawer.T225_lc3_horizontal = false;
				drawer.T225_lc3_vertical = false;
				drawer.T225_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T225_lc3_C = x3 - drawer.T225_lc3_m * y3;
				drawer.T225_lc3_leftOrAbove = (drawer.T225_sx < drawer.T225_lc3_m*drawer.T225_sy + drawer.T225_lc3_C);
			}

			drawer.T225_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T225_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T225_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T225_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T225_initializedWithValidData = true;
		}

		t = triangles[226]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T226_r = t.r; drawer.T226_g = t.g; drawer.T226_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T226_initializedWithValidData = false;
		} else {

			drawer.T226_sx = (x1 + x2 + x3) / 3.0;
			drawer.T226_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T226_lc1_horizontal = true;
				drawer.T226_lc1_vertical = false;
				drawer.T226_lc1_borderY = y1;
				drawer.T226_lc1_leftOrAbove = (drawer.T226_sy <= y1);
			} else if(x1 == x2) {
				drawer.T226_lc1_horizontal = false;
				drawer.T226_lc1_vertical = true;
				drawer.T226_lc1_borderX = x1;
				drawer.T226_lc1_leftOrAbove = (drawer.T226_sx <= x1);
			} else {
				drawer.T226_lc1_horizontal = false;
				drawer.T226_lc1_vertical = false;
				drawer.T226_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T226_lc1_C = x1 - drawer.T226_lc1_m * y1;
				drawer.T226_lc1_leftOrAbove = (drawer.T226_sx < drawer.T226_lc1_m*drawer.T226_sy + drawer.T226_lc1_C);
			}

			if(y2 == y3) {
				drawer.T226_lc2_horizontal = true;
				drawer.T226_lc2_vertical = false;
				drawer.T226_lc2_borderY = y2;
				drawer.T226_lc2_leftOrAbove = (drawer.T226_sy <= y2);
			} else if(x2 == x3) {
				drawer.T226_lc2_horizontal = false;
				drawer.T226_lc2_vertical = true;
				drawer.T226_lc2_borderX = x2;
				drawer.T226_lc2_leftOrAbove = (drawer.T226_sx <= x2);
			} else {
				drawer.T226_lc2_horizontal = false;
				drawer.T226_lc2_vertical = false;
				drawer.T226_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T226_lc2_C = x2 - drawer.T226_lc2_m * y2;
				drawer.T226_lc2_leftOrAbove = (drawer.T226_sx < drawer.T226_lc2_m*drawer.T226_sy + drawer.T226_lc2_C);
			}

			if(y3 == y1) {
				drawer.T226_lc3_horizontal = true;
				drawer.T226_lc3_vertical = false;
				drawer.T226_lc3_borderY = y3;
				drawer.T226_lc3_leftOrAbove = (drawer.T226_sy <= y3);
			} else if(x3 == x1) {
				drawer.T226_lc3_horizontal = false;
				drawer.T226_lc3_vertical = true;
				drawer.T226_lc3_borderX = x3;
				drawer.T226_lc3_leftOrAbove = (drawer.T226_sx <= x3);
			} else {
				drawer.T226_lc3_horizontal = false;
				drawer.T226_lc3_vertical = false;
				drawer.T226_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T226_lc3_C = x3 - drawer.T226_lc3_m * y3;
				drawer.T226_lc3_leftOrAbove = (drawer.T226_sx < drawer.T226_lc3_m*drawer.T226_sy + drawer.T226_lc3_C);
			}

			drawer.T226_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T226_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T226_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T226_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T226_initializedWithValidData = true;
		}

		t = triangles[227]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T227_r = t.r; drawer.T227_g = t.g; drawer.T227_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T227_initializedWithValidData = false;
		} else {

			drawer.T227_sx = (x1 + x2 + x3) / 3.0;
			drawer.T227_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T227_lc1_horizontal = true;
				drawer.T227_lc1_vertical = false;
				drawer.T227_lc1_borderY = y1;
				drawer.T227_lc1_leftOrAbove = (drawer.T227_sy <= y1);
			} else if(x1 == x2) {
				drawer.T227_lc1_horizontal = false;
				drawer.T227_lc1_vertical = true;
				drawer.T227_lc1_borderX = x1;
				drawer.T227_lc1_leftOrAbove = (drawer.T227_sx <= x1);
			} else {
				drawer.T227_lc1_horizontal = false;
				drawer.T227_lc1_vertical = false;
				drawer.T227_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T227_lc1_C = x1 - drawer.T227_lc1_m * y1;
				drawer.T227_lc1_leftOrAbove = (drawer.T227_sx < drawer.T227_lc1_m*drawer.T227_sy + drawer.T227_lc1_C);
			}

			if(y2 == y3) {
				drawer.T227_lc2_horizontal = true;
				drawer.T227_lc2_vertical = false;
				drawer.T227_lc2_borderY = y2;
				drawer.T227_lc2_leftOrAbove = (drawer.T227_sy <= y2);
			} else if(x2 == x3) {
				drawer.T227_lc2_horizontal = false;
				drawer.T227_lc2_vertical = true;
				drawer.T227_lc2_borderX = x2;
				drawer.T227_lc2_leftOrAbove = (drawer.T227_sx <= x2);
			} else {
				drawer.T227_lc2_horizontal = false;
				drawer.T227_lc2_vertical = false;
				drawer.T227_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T227_lc2_C = x2 - drawer.T227_lc2_m * y2;
				drawer.T227_lc2_leftOrAbove = (drawer.T227_sx < drawer.T227_lc2_m*drawer.T227_sy + drawer.T227_lc2_C);
			}

			if(y3 == y1) {
				drawer.T227_lc3_horizontal = true;
				drawer.T227_lc3_vertical = false;
				drawer.T227_lc3_borderY = y3;
				drawer.T227_lc3_leftOrAbove = (drawer.T227_sy <= y3);
			} else if(x3 == x1) {
				drawer.T227_lc3_horizontal = false;
				drawer.T227_lc3_vertical = true;
				drawer.T227_lc3_borderX = x3;
				drawer.T227_lc3_leftOrAbove = (drawer.T227_sx <= x3);
			} else {
				drawer.T227_lc3_horizontal = false;
				drawer.T227_lc3_vertical = false;
				drawer.T227_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T227_lc3_C = x3 - drawer.T227_lc3_m * y3;
				drawer.T227_lc3_leftOrAbove = (drawer.T227_sx < drawer.T227_lc3_m*drawer.T227_sy + drawer.T227_lc3_C);
			}

			drawer.T227_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T227_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T227_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T227_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T227_initializedWithValidData = true;
		}

		t = triangles[228]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T228_r = t.r; drawer.T228_g = t.g; drawer.T228_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T228_initializedWithValidData = false;
		} else {

			drawer.T228_sx = (x1 + x2 + x3) / 3.0;
			drawer.T228_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T228_lc1_horizontal = true;
				drawer.T228_lc1_vertical = false;
				drawer.T228_lc1_borderY = y1;
				drawer.T228_lc1_leftOrAbove = (drawer.T228_sy <= y1);
			} else if(x1 == x2) {
				drawer.T228_lc1_horizontal = false;
				drawer.T228_lc1_vertical = true;
				drawer.T228_lc1_borderX = x1;
				drawer.T228_lc1_leftOrAbove = (drawer.T228_sx <= x1);
			} else {
				drawer.T228_lc1_horizontal = false;
				drawer.T228_lc1_vertical = false;
				drawer.T228_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T228_lc1_C = x1 - drawer.T228_lc1_m * y1;
				drawer.T228_lc1_leftOrAbove = (drawer.T228_sx < drawer.T228_lc1_m*drawer.T228_sy + drawer.T228_lc1_C);
			}

			if(y2 == y3) {
				drawer.T228_lc2_horizontal = true;
				drawer.T228_lc2_vertical = false;
				drawer.T228_lc2_borderY = y2;
				drawer.T228_lc2_leftOrAbove = (drawer.T228_sy <= y2);
			} else if(x2 == x3) {
				drawer.T228_lc2_horizontal = false;
				drawer.T228_lc2_vertical = true;
				drawer.T228_lc2_borderX = x2;
				drawer.T228_lc2_leftOrAbove = (drawer.T228_sx <= x2);
			} else {
				drawer.T228_lc2_horizontal = false;
				drawer.T228_lc2_vertical = false;
				drawer.T228_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T228_lc2_C = x2 - drawer.T228_lc2_m * y2;
				drawer.T228_lc2_leftOrAbove = (drawer.T228_sx < drawer.T228_lc2_m*drawer.T228_sy + drawer.T228_lc2_C);
			}

			if(y3 == y1) {
				drawer.T228_lc3_horizontal = true;
				drawer.T228_lc3_vertical = false;
				drawer.T228_lc3_borderY = y3;
				drawer.T228_lc3_leftOrAbove = (drawer.T228_sy <= y3);
			} else if(x3 == x1) {
				drawer.T228_lc3_horizontal = false;
				drawer.T228_lc3_vertical = true;
				drawer.T228_lc3_borderX = x3;
				drawer.T228_lc3_leftOrAbove = (drawer.T228_sx <= x3);
			} else {
				drawer.T228_lc3_horizontal = false;
				drawer.T228_lc3_vertical = false;
				drawer.T228_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T228_lc3_C = x3 - drawer.T228_lc3_m * y3;
				drawer.T228_lc3_leftOrAbove = (drawer.T228_sx < drawer.T228_lc3_m*drawer.T228_sy + drawer.T228_lc3_C);
			}

			drawer.T228_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T228_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T228_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T228_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T228_initializedWithValidData = true;
		}

		t = triangles[229]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T229_r = t.r; drawer.T229_g = t.g; drawer.T229_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T229_initializedWithValidData = false;
		} else {

			drawer.T229_sx = (x1 + x2 + x3) / 3.0;
			drawer.T229_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T229_lc1_horizontal = true;
				drawer.T229_lc1_vertical = false;
				drawer.T229_lc1_borderY = y1;
				drawer.T229_lc1_leftOrAbove = (drawer.T229_sy <= y1);
			} else if(x1 == x2) {
				drawer.T229_lc1_horizontal = false;
				drawer.T229_lc1_vertical = true;
				drawer.T229_lc1_borderX = x1;
				drawer.T229_lc1_leftOrAbove = (drawer.T229_sx <= x1);
			} else {
				drawer.T229_lc1_horizontal = false;
				drawer.T229_lc1_vertical = false;
				drawer.T229_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T229_lc1_C = x1 - drawer.T229_lc1_m * y1;
				drawer.T229_lc1_leftOrAbove = (drawer.T229_sx < drawer.T229_lc1_m*drawer.T229_sy + drawer.T229_lc1_C);
			}

			if(y2 == y3) {
				drawer.T229_lc2_horizontal = true;
				drawer.T229_lc2_vertical = false;
				drawer.T229_lc2_borderY = y2;
				drawer.T229_lc2_leftOrAbove = (drawer.T229_sy <= y2);
			} else if(x2 == x3) {
				drawer.T229_lc2_horizontal = false;
				drawer.T229_lc2_vertical = true;
				drawer.T229_lc2_borderX = x2;
				drawer.T229_lc2_leftOrAbove = (drawer.T229_sx <= x2);
			} else {
				drawer.T229_lc2_horizontal = false;
				drawer.T229_lc2_vertical = false;
				drawer.T229_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T229_lc2_C = x2 - drawer.T229_lc2_m * y2;
				drawer.T229_lc2_leftOrAbove = (drawer.T229_sx < drawer.T229_lc2_m*drawer.T229_sy + drawer.T229_lc2_C);
			}

			if(y3 == y1) {
				drawer.T229_lc3_horizontal = true;
				drawer.T229_lc3_vertical = false;
				drawer.T229_lc3_borderY = y3;
				drawer.T229_lc3_leftOrAbove = (drawer.T229_sy <= y3);
			} else if(x3 == x1) {
				drawer.T229_lc3_horizontal = false;
				drawer.T229_lc3_vertical = true;
				drawer.T229_lc3_borderX = x3;
				drawer.T229_lc3_leftOrAbove = (drawer.T229_sx <= x3);
			} else {
				drawer.T229_lc3_horizontal = false;
				drawer.T229_lc3_vertical = false;
				drawer.T229_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T229_lc3_C = x3 - drawer.T229_lc3_m * y3;
				drawer.T229_lc3_leftOrAbove = (drawer.T229_sx < drawer.T229_lc3_m*drawer.T229_sy + drawer.T229_lc3_C);
			}

			drawer.T229_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T229_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T229_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T229_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T229_initializedWithValidData = true;
		}

		t = triangles[230]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T230_r = t.r; drawer.T230_g = t.g; drawer.T230_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T230_initializedWithValidData = false;
		} else {

			drawer.T230_sx = (x1 + x2 + x3) / 3.0;
			drawer.T230_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T230_lc1_horizontal = true;
				drawer.T230_lc1_vertical = false;
				drawer.T230_lc1_borderY = y1;
				drawer.T230_lc1_leftOrAbove = (drawer.T230_sy <= y1);
			} else if(x1 == x2) {
				drawer.T230_lc1_horizontal = false;
				drawer.T230_lc1_vertical = true;
				drawer.T230_lc1_borderX = x1;
				drawer.T230_lc1_leftOrAbove = (drawer.T230_sx <= x1);
			} else {
				drawer.T230_lc1_horizontal = false;
				drawer.T230_lc1_vertical = false;
				drawer.T230_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T230_lc1_C = x1 - drawer.T230_lc1_m * y1;
				drawer.T230_lc1_leftOrAbove = (drawer.T230_sx < drawer.T230_lc1_m*drawer.T230_sy + drawer.T230_lc1_C);
			}

			if(y2 == y3) {
				drawer.T230_lc2_horizontal = true;
				drawer.T230_lc2_vertical = false;
				drawer.T230_lc2_borderY = y2;
				drawer.T230_lc2_leftOrAbove = (drawer.T230_sy <= y2);
			} else if(x2 == x3) {
				drawer.T230_lc2_horizontal = false;
				drawer.T230_lc2_vertical = true;
				drawer.T230_lc2_borderX = x2;
				drawer.T230_lc2_leftOrAbove = (drawer.T230_sx <= x2);
			} else {
				drawer.T230_lc2_horizontal = false;
				drawer.T230_lc2_vertical = false;
				drawer.T230_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T230_lc2_C = x2 - drawer.T230_lc2_m * y2;
				drawer.T230_lc2_leftOrAbove = (drawer.T230_sx < drawer.T230_lc2_m*drawer.T230_sy + drawer.T230_lc2_C);
			}

			if(y3 == y1) {
				drawer.T230_lc3_horizontal = true;
				drawer.T230_lc3_vertical = false;
				drawer.T230_lc3_borderY = y3;
				drawer.T230_lc3_leftOrAbove = (drawer.T230_sy <= y3);
			} else if(x3 == x1) {
				drawer.T230_lc3_horizontal = false;
				drawer.T230_lc3_vertical = true;
				drawer.T230_lc3_borderX = x3;
				drawer.T230_lc3_leftOrAbove = (drawer.T230_sx <= x3);
			} else {
				drawer.T230_lc3_horizontal = false;
				drawer.T230_lc3_vertical = false;
				drawer.T230_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T230_lc3_C = x3 - drawer.T230_lc3_m * y3;
				drawer.T230_lc3_leftOrAbove = (drawer.T230_sx < drawer.T230_lc3_m*drawer.T230_sy + drawer.T230_lc3_C);
			}

			drawer.T230_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T230_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T230_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T230_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T230_initializedWithValidData = true;
		}

		t = triangles[231]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T231_r = t.r; drawer.T231_g = t.g; drawer.T231_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T231_initializedWithValidData = false;
		} else {

			drawer.T231_sx = (x1 + x2 + x3) / 3.0;
			drawer.T231_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T231_lc1_horizontal = true;
				drawer.T231_lc1_vertical = false;
				drawer.T231_lc1_borderY = y1;
				drawer.T231_lc1_leftOrAbove = (drawer.T231_sy <= y1);
			} else if(x1 == x2) {
				drawer.T231_lc1_horizontal = false;
				drawer.T231_lc1_vertical = true;
				drawer.T231_lc1_borderX = x1;
				drawer.T231_lc1_leftOrAbove = (drawer.T231_sx <= x1);
			} else {
				drawer.T231_lc1_horizontal = false;
				drawer.T231_lc1_vertical = false;
				drawer.T231_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T231_lc1_C = x1 - drawer.T231_lc1_m * y1;
				drawer.T231_lc1_leftOrAbove = (drawer.T231_sx < drawer.T231_lc1_m*drawer.T231_sy + drawer.T231_lc1_C);
			}

			if(y2 == y3) {
				drawer.T231_lc2_horizontal = true;
				drawer.T231_lc2_vertical = false;
				drawer.T231_lc2_borderY = y2;
				drawer.T231_lc2_leftOrAbove = (drawer.T231_sy <= y2);
			} else if(x2 == x3) {
				drawer.T231_lc2_horizontal = false;
				drawer.T231_lc2_vertical = true;
				drawer.T231_lc2_borderX = x2;
				drawer.T231_lc2_leftOrAbove = (drawer.T231_sx <= x2);
			} else {
				drawer.T231_lc2_horizontal = false;
				drawer.T231_lc2_vertical = false;
				drawer.T231_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T231_lc2_C = x2 - drawer.T231_lc2_m * y2;
				drawer.T231_lc2_leftOrAbove = (drawer.T231_sx < drawer.T231_lc2_m*drawer.T231_sy + drawer.T231_lc2_C);
			}

			if(y3 == y1) {
				drawer.T231_lc3_horizontal = true;
				drawer.T231_lc3_vertical = false;
				drawer.T231_lc3_borderY = y3;
				drawer.T231_lc3_leftOrAbove = (drawer.T231_sy <= y3);
			} else if(x3 == x1) {
				drawer.T231_lc3_horizontal = false;
				drawer.T231_lc3_vertical = true;
				drawer.T231_lc3_borderX = x3;
				drawer.T231_lc3_leftOrAbove = (drawer.T231_sx <= x3);
			} else {
				drawer.T231_lc3_horizontal = false;
				drawer.T231_lc3_vertical = false;
				drawer.T231_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T231_lc3_C = x3 - drawer.T231_lc3_m * y3;
				drawer.T231_lc3_leftOrAbove = (drawer.T231_sx < drawer.T231_lc3_m*drawer.T231_sy + drawer.T231_lc3_C);
			}

			drawer.T231_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T231_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T231_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T231_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T231_initializedWithValidData = true;
		}

		t = triangles[232]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T232_r = t.r; drawer.T232_g = t.g; drawer.T232_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T232_initializedWithValidData = false;
		} else {

			drawer.T232_sx = (x1 + x2 + x3) / 3.0;
			drawer.T232_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T232_lc1_horizontal = true;
				drawer.T232_lc1_vertical = false;
				drawer.T232_lc1_borderY = y1;
				drawer.T232_lc1_leftOrAbove = (drawer.T232_sy <= y1);
			} else if(x1 == x2) {
				drawer.T232_lc1_horizontal = false;
				drawer.T232_lc1_vertical = true;
				drawer.T232_lc1_borderX = x1;
				drawer.T232_lc1_leftOrAbove = (drawer.T232_sx <= x1);
			} else {
				drawer.T232_lc1_horizontal = false;
				drawer.T232_lc1_vertical = false;
				drawer.T232_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T232_lc1_C = x1 - drawer.T232_lc1_m * y1;
				drawer.T232_lc1_leftOrAbove = (drawer.T232_sx < drawer.T232_lc1_m*drawer.T232_sy + drawer.T232_lc1_C);
			}

			if(y2 == y3) {
				drawer.T232_lc2_horizontal = true;
				drawer.T232_lc2_vertical = false;
				drawer.T232_lc2_borderY = y2;
				drawer.T232_lc2_leftOrAbove = (drawer.T232_sy <= y2);
			} else if(x2 == x3) {
				drawer.T232_lc2_horizontal = false;
				drawer.T232_lc2_vertical = true;
				drawer.T232_lc2_borderX = x2;
				drawer.T232_lc2_leftOrAbove = (drawer.T232_sx <= x2);
			} else {
				drawer.T232_lc2_horizontal = false;
				drawer.T232_lc2_vertical = false;
				drawer.T232_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T232_lc2_C = x2 - drawer.T232_lc2_m * y2;
				drawer.T232_lc2_leftOrAbove = (drawer.T232_sx < drawer.T232_lc2_m*drawer.T232_sy + drawer.T232_lc2_C);
			}

			if(y3 == y1) {
				drawer.T232_lc3_horizontal = true;
				drawer.T232_lc3_vertical = false;
				drawer.T232_lc3_borderY = y3;
				drawer.T232_lc3_leftOrAbove = (drawer.T232_sy <= y3);
			} else if(x3 == x1) {
				drawer.T232_lc3_horizontal = false;
				drawer.T232_lc3_vertical = true;
				drawer.T232_lc3_borderX = x3;
				drawer.T232_lc3_leftOrAbove = (drawer.T232_sx <= x3);
			} else {
				drawer.T232_lc3_horizontal = false;
				drawer.T232_lc3_vertical = false;
				drawer.T232_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T232_lc3_C = x3 - drawer.T232_lc3_m * y3;
				drawer.T232_lc3_leftOrAbove = (drawer.T232_sx < drawer.T232_lc3_m*drawer.T232_sy + drawer.T232_lc3_C);
			}

			drawer.T232_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T232_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T232_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T232_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T232_initializedWithValidData = true;
		}

		t = triangles[233]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T233_r = t.r; drawer.T233_g = t.g; drawer.T233_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T233_initializedWithValidData = false;
		} else {

			drawer.T233_sx = (x1 + x2 + x3) / 3.0;
			drawer.T233_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T233_lc1_horizontal = true;
				drawer.T233_lc1_vertical = false;
				drawer.T233_lc1_borderY = y1;
				drawer.T233_lc1_leftOrAbove = (drawer.T233_sy <= y1);
			} else if(x1 == x2) {
				drawer.T233_lc1_horizontal = false;
				drawer.T233_lc1_vertical = true;
				drawer.T233_lc1_borderX = x1;
				drawer.T233_lc1_leftOrAbove = (drawer.T233_sx <= x1);
			} else {
				drawer.T233_lc1_horizontal = false;
				drawer.T233_lc1_vertical = false;
				drawer.T233_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T233_lc1_C = x1 - drawer.T233_lc1_m * y1;
				drawer.T233_lc1_leftOrAbove = (drawer.T233_sx < drawer.T233_lc1_m*drawer.T233_sy + drawer.T233_lc1_C);
			}

			if(y2 == y3) {
				drawer.T233_lc2_horizontal = true;
				drawer.T233_lc2_vertical = false;
				drawer.T233_lc2_borderY = y2;
				drawer.T233_lc2_leftOrAbove = (drawer.T233_sy <= y2);
			} else if(x2 == x3) {
				drawer.T233_lc2_horizontal = false;
				drawer.T233_lc2_vertical = true;
				drawer.T233_lc2_borderX = x2;
				drawer.T233_lc2_leftOrAbove = (drawer.T233_sx <= x2);
			} else {
				drawer.T233_lc2_horizontal = false;
				drawer.T233_lc2_vertical = false;
				drawer.T233_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T233_lc2_C = x2 - drawer.T233_lc2_m * y2;
				drawer.T233_lc2_leftOrAbove = (drawer.T233_sx < drawer.T233_lc2_m*drawer.T233_sy + drawer.T233_lc2_C);
			}

			if(y3 == y1) {
				drawer.T233_lc3_horizontal = true;
				drawer.T233_lc3_vertical = false;
				drawer.T233_lc3_borderY = y3;
				drawer.T233_lc3_leftOrAbove = (drawer.T233_sy <= y3);
			} else if(x3 == x1) {
				drawer.T233_lc3_horizontal = false;
				drawer.T233_lc3_vertical = true;
				drawer.T233_lc3_borderX = x3;
				drawer.T233_lc3_leftOrAbove = (drawer.T233_sx <= x3);
			} else {
				drawer.T233_lc3_horizontal = false;
				drawer.T233_lc3_vertical = false;
				drawer.T233_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T233_lc3_C = x3 - drawer.T233_lc3_m * y3;
				drawer.T233_lc3_leftOrAbove = (drawer.T233_sx < drawer.T233_lc3_m*drawer.T233_sy + drawer.T233_lc3_C);
			}

			drawer.T233_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T233_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T233_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T233_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T233_initializedWithValidData = true;
		}

		t = triangles[234]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T234_r = t.r; drawer.T234_g = t.g; drawer.T234_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T234_initializedWithValidData = false;
		} else {

			drawer.T234_sx = (x1 + x2 + x3) / 3.0;
			drawer.T234_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T234_lc1_horizontal = true;
				drawer.T234_lc1_vertical = false;
				drawer.T234_lc1_borderY = y1;
				drawer.T234_lc1_leftOrAbove = (drawer.T234_sy <= y1);
			} else if(x1 == x2) {
				drawer.T234_lc1_horizontal = false;
				drawer.T234_lc1_vertical = true;
				drawer.T234_lc1_borderX = x1;
				drawer.T234_lc1_leftOrAbove = (drawer.T234_sx <= x1);
			} else {
				drawer.T234_lc1_horizontal = false;
				drawer.T234_lc1_vertical = false;
				drawer.T234_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T234_lc1_C = x1 - drawer.T234_lc1_m * y1;
				drawer.T234_lc1_leftOrAbove = (drawer.T234_sx < drawer.T234_lc1_m*drawer.T234_sy + drawer.T234_lc1_C);
			}

			if(y2 == y3) {
				drawer.T234_lc2_horizontal = true;
				drawer.T234_lc2_vertical = false;
				drawer.T234_lc2_borderY = y2;
				drawer.T234_lc2_leftOrAbove = (drawer.T234_sy <= y2);
			} else if(x2 == x3) {
				drawer.T234_lc2_horizontal = false;
				drawer.T234_lc2_vertical = true;
				drawer.T234_lc2_borderX = x2;
				drawer.T234_lc2_leftOrAbove = (drawer.T234_sx <= x2);
			} else {
				drawer.T234_lc2_horizontal = false;
				drawer.T234_lc2_vertical = false;
				drawer.T234_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T234_lc2_C = x2 - drawer.T234_lc2_m * y2;
				drawer.T234_lc2_leftOrAbove = (drawer.T234_sx < drawer.T234_lc2_m*drawer.T234_sy + drawer.T234_lc2_C);
			}

			if(y3 == y1) {
				drawer.T234_lc3_horizontal = true;
				drawer.T234_lc3_vertical = false;
				drawer.T234_lc3_borderY = y3;
				drawer.T234_lc3_leftOrAbove = (drawer.T234_sy <= y3);
			} else if(x3 == x1) {
				drawer.T234_lc3_horizontal = false;
				drawer.T234_lc3_vertical = true;
				drawer.T234_lc3_borderX = x3;
				drawer.T234_lc3_leftOrAbove = (drawer.T234_sx <= x3);
			} else {
				drawer.T234_lc3_horizontal = false;
				drawer.T234_lc3_vertical = false;
				drawer.T234_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T234_lc3_C = x3 - drawer.T234_lc3_m * y3;
				drawer.T234_lc3_leftOrAbove = (drawer.T234_sx < drawer.T234_lc3_m*drawer.T234_sy + drawer.T234_lc3_C);
			}

			drawer.T234_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T234_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T234_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T234_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T234_initializedWithValidData = true;
		}

		t = triangles[235]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T235_r = t.r; drawer.T235_g = t.g; drawer.T235_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T235_initializedWithValidData = false;
		} else {

			drawer.T235_sx = (x1 + x2 + x3) / 3.0;
			drawer.T235_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T235_lc1_horizontal = true;
				drawer.T235_lc1_vertical = false;
				drawer.T235_lc1_borderY = y1;
				drawer.T235_lc1_leftOrAbove = (drawer.T235_sy <= y1);
			} else if(x1 == x2) {
				drawer.T235_lc1_horizontal = false;
				drawer.T235_lc1_vertical = true;
				drawer.T235_lc1_borderX = x1;
				drawer.T235_lc1_leftOrAbove = (drawer.T235_sx <= x1);
			} else {
				drawer.T235_lc1_horizontal = false;
				drawer.T235_lc1_vertical = false;
				drawer.T235_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T235_lc1_C = x1 - drawer.T235_lc1_m * y1;
				drawer.T235_lc1_leftOrAbove = (drawer.T235_sx < drawer.T235_lc1_m*drawer.T235_sy + drawer.T235_lc1_C);
			}

			if(y2 == y3) {
				drawer.T235_lc2_horizontal = true;
				drawer.T235_lc2_vertical = false;
				drawer.T235_lc2_borderY = y2;
				drawer.T235_lc2_leftOrAbove = (drawer.T235_sy <= y2);
			} else if(x2 == x3) {
				drawer.T235_lc2_horizontal = false;
				drawer.T235_lc2_vertical = true;
				drawer.T235_lc2_borderX = x2;
				drawer.T235_lc2_leftOrAbove = (drawer.T235_sx <= x2);
			} else {
				drawer.T235_lc2_horizontal = false;
				drawer.T235_lc2_vertical = false;
				drawer.T235_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T235_lc2_C = x2 - drawer.T235_lc2_m * y2;
				drawer.T235_lc2_leftOrAbove = (drawer.T235_sx < drawer.T235_lc2_m*drawer.T235_sy + drawer.T235_lc2_C);
			}

			if(y3 == y1) {
				drawer.T235_lc3_horizontal = true;
				drawer.T235_lc3_vertical = false;
				drawer.T235_lc3_borderY = y3;
				drawer.T235_lc3_leftOrAbove = (drawer.T235_sy <= y3);
			} else if(x3 == x1) {
				drawer.T235_lc3_horizontal = false;
				drawer.T235_lc3_vertical = true;
				drawer.T235_lc3_borderX = x3;
				drawer.T235_lc3_leftOrAbove = (drawer.T235_sx <= x3);
			} else {
				drawer.T235_lc3_horizontal = false;
				drawer.T235_lc3_vertical = false;
				drawer.T235_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T235_lc3_C = x3 - drawer.T235_lc3_m * y3;
				drawer.T235_lc3_leftOrAbove = (drawer.T235_sx < drawer.T235_lc3_m*drawer.T235_sy + drawer.T235_lc3_C);
			}

			drawer.T235_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T235_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T235_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T235_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T235_initializedWithValidData = true;
		}

		t = triangles[236]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T236_r = t.r; drawer.T236_g = t.g; drawer.T236_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T236_initializedWithValidData = false;
		} else {

			drawer.T236_sx = (x1 + x2 + x3) / 3.0;
			drawer.T236_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T236_lc1_horizontal = true;
				drawer.T236_lc1_vertical = false;
				drawer.T236_lc1_borderY = y1;
				drawer.T236_lc1_leftOrAbove = (drawer.T236_sy <= y1);
			} else if(x1 == x2) {
				drawer.T236_lc1_horizontal = false;
				drawer.T236_lc1_vertical = true;
				drawer.T236_lc1_borderX = x1;
				drawer.T236_lc1_leftOrAbove = (drawer.T236_sx <= x1);
			} else {
				drawer.T236_lc1_horizontal = false;
				drawer.T236_lc1_vertical = false;
				drawer.T236_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T236_lc1_C = x1 - drawer.T236_lc1_m * y1;
				drawer.T236_lc1_leftOrAbove = (drawer.T236_sx < drawer.T236_lc1_m*drawer.T236_sy + drawer.T236_lc1_C);
			}

			if(y2 == y3) {
				drawer.T236_lc2_horizontal = true;
				drawer.T236_lc2_vertical = false;
				drawer.T236_lc2_borderY = y2;
				drawer.T236_lc2_leftOrAbove = (drawer.T236_sy <= y2);
			} else if(x2 == x3) {
				drawer.T236_lc2_horizontal = false;
				drawer.T236_lc2_vertical = true;
				drawer.T236_lc2_borderX = x2;
				drawer.T236_lc2_leftOrAbove = (drawer.T236_sx <= x2);
			} else {
				drawer.T236_lc2_horizontal = false;
				drawer.T236_lc2_vertical = false;
				drawer.T236_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T236_lc2_C = x2 - drawer.T236_lc2_m * y2;
				drawer.T236_lc2_leftOrAbove = (drawer.T236_sx < drawer.T236_lc2_m*drawer.T236_sy + drawer.T236_lc2_C);
			}

			if(y3 == y1) {
				drawer.T236_lc3_horizontal = true;
				drawer.T236_lc3_vertical = false;
				drawer.T236_lc3_borderY = y3;
				drawer.T236_lc3_leftOrAbove = (drawer.T236_sy <= y3);
			} else if(x3 == x1) {
				drawer.T236_lc3_horizontal = false;
				drawer.T236_lc3_vertical = true;
				drawer.T236_lc3_borderX = x3;
				drawer.T236_lc3_leftOrAbove = (drawer.T236_sx <= x3);
			} else {
				drawer.T236_lc3_horizontal = false;
				drawer.T236_lc3_vertical = false;
				drawer.T236_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T236_lc3_C = x3 - drawer.T236_lc3_m * y3;
				drawer.T236_lc3_leftOrAbove = (drawer.T236_sx < drawer.T236_lc3_m*drawer.T236_sy + drawer.T236_lc3_C);
			}

			drawer.T236_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T236_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T236_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T236_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T236_initializedWithValidData = true;
		}

		t = triangles[237]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T237_r = t.r; drawer.T237_g = t.g; drawer.T237_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T237_initializedWithValidData = false;
		} else {

			drawer.T237_sx = (x1 + x2 + x3) / 3.0;
			drawer.T237_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T237_lc1_horizontal = true;
				drawer.T237_lc1_vertical = false;
				drawer.T237_lc1_borderY = y1;
				drawer.T237_lc1_leftOrAbove = (drawer.T237_sy <= y1);
			} else if(x1 == x2) {
				drawer.T237_lc1_horizontal = false;
				drawer.T237_lc1_vertical = true;
				drawer.T237_lc1_borderX = x1;
				drawer.T237_lc1_leftOrAbove = (drawer.T237_sx <= x1);
			} else {
				drawer.T237_lc1_horizontal = false;
				drawer.T237_lc1_vertical = false;
				drawer.T237_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T237_lc1_C = x1 - drawer.T237_lc1_m * y1;
				drawer.T237_lc1_leftOrAbove = (drawer.T237_sx < drawer.T237_lc1_m*drawer.T237_sy + drawer.T237_lc1_C);
			}

			if(y2 == y3) {
				drawer.T237_lc2_horizontal = true;
				drawer.T237_lc2_vertical = false;
				drawer.T237_lc2_borderY = y2;
				drawer.T237_lc2_leftOrAbove = (drawer.T237_sy <= y2);
			} else if(x2 == x3) {
				drawer.T237_lc2_horizontal = false;
				drawer.T237_lc2_vertical = true;
				drawer.T237_lc2_borderX = x2;
				drawer.T237_lc2_leftOrAbove = (drawer.T237_sx <= x2);
			} else {
				drawer.T237_lc2_horizontal = false;
				drawer.T237_lc2_vertical = false;
				drawer.T237_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T237_lc2_C = x2 - drawer.T237_lc2_m * y2;
				drawer.T237_lc2_leftOrAbove = (drawer.T237_sx < drawer.T237_lc2_m*drawer.T237_sy + drawer.T237_lc2_C);
			}

			if(y3 == y1) {
				drawer.T237_lc3_horizontal = true;
				drawer.T237_lc3_vertical = false;
				drawer.T237_lc3_borderY = y3;
				drawer.T237_lc3_leftOrAbove = (drawer.T237_sy <= y3);
			} else if(x3 == x1) {
				drawer.T237_lc3_horizontal = false;
				drawer.T237_lc3_vertical = true;
				drawer.T237_lc3_borderX = x3;
				drawer.T237_lc3_leftOrAbove = (drawer.T237_sx <= x3);
			} else {
				drawer.T237_lc3_horizontal = false;
				drawer.T237_lc3_vertical = false;
				drawer.T237_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T237_lc3_C = x3 - drawer.T237_lc3_m * y3;
				drawer.T237_lc3_leftOrAbove = (drawer.T237_sx < drawer.T237_lc3_m*drawer.T237_sy + drawer.T237_lc3_C);
			}

			drawer.T237_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T237_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T237_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T237_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T237_initializedWithValidData = true;
		}

		t = triangles[238]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T238_r = t.r; drawer.T238_g = t.g; drawer.T238_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T238_initializedWithValidData = false;
		} else {

			drawer.T238_sx = (x1 + x2 + x3) / 3.0;
			drawer.T238_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T238_lc1_horizontal = true;
				drawer.T238_lc1_vertical = false;
				drawer.T238_lc1_borderY = y1;
				drawer.T238_lc1_leftOrAbove = (drawer.T238_sy <= y1);
			} else if(x1 == x2) {
				drawer.T238_lc1_horizontal = false;
				drawer.T238_lc1_vertical = true;
				drawer.T238_lc1_borderX = x1;
				drawer.T238_lc1_leftOrAbove = (drawer.T238_sx <= x1);
			} else {
				drawer.T238_lc1_horizontal = false;
				drawer.T238_lc1_vertical = false;
				drawer.T238_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T238_lc1_C = x1 - drawer.T238_lc1_m * y1;
				drawer.T238_lc1_leftOrAbove = (drawer.T238_sx < drawer.T238_lc1_m*drawer.T238_sy + drawer.T238_lc1_C);
			}

			if(y2 == y3) {
				drawer.T238_lc2_horizontal = true;
				drawer.T238_lc2_vertical = false;
				drawer.T238_lc2_borderY = y2;
				drawer.T238_lc2_leftOrAbove = (drawer.T238_sy <= y2);
			} else if(x2 == x3) {
				drawer.T238_lc2_horizontal = false;
				drawer.T238_lc2_vertical = true;
				drawer.T238_lc2_borderX = x2;
				drawer.T238_lc2_leftOrAbove = (drawer.T238_sx <= x2);
			} else {
				drawer.T238_lc2_horizontal = false;
				drawer.T238_lc2_vertical = false;
				drawer.T238_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T238_lc2_C = x2 - drawer.T238_lc2_m * y2;
				drawer.T238_lc2_leftOrAbove = (drawer.T238_sx < drawer.T238_lc2_m*drawer.T238_sy + drawer.T238_lc2_C);
			}

			if(y3 == y1) {
				drawer.T238_lc3_horizontal = true;
				drawer.T238_lc3_vertical = false;
				drawer.T238_lc3_borderY = y3;
				drawer.T238_lc3_leftOrAbove = (drawer.T238_sy <= y3);
			} else if(x3 == x1) {
				drawer.T238_lc3_horizontal = false;
				drawer.T238_lc3_vertical = true;
				drawer.T238_lc3_borderX = x3;
				drawer.T238_lc3_leftOrAbove = (drawer.T238_sx <= x3);
			} else {
				drawer.T238_lc3_horizontal = false;
				drawer.T238_lc3_vertical = false;
				drawer.T238_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T238_lc3_C = x3 - drawer.T238_lc3_m * y3;
				drawer.T238_lc3_leftOrAbove = (drawer.T238_sx < drawer.T238_lc3_m*drawer.T238_sy + drawer.T238_lc3_C);
			}

			drawer.T238_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T238_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T238_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T238_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T238_initializedWithValidData = true;
		}

		t = triangles[239]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T239_r = t.r; drawer.T239_g = t.g; drawer.T239_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T239_initializedWithValidData = false;
		} else {

			drawer.T239_sx = (x1 + x2 + x3) / 3.0;
			drawer.T239_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T239_lc1_horizontal = true;
				drawer.T239_lc1_vertical = false;
				drawer.T239_lc1_borderY = y1;
				drawer.T239_lc1_leftOrAbove = (drawer.T239_sy <= y1);
			} else if(x1 == x2) {
				drawer.T239_lc1_horizontal = false;
				drawer.T239_lc1_vertical = true;
				drawer.T239_lc1_borderX = x1;
				drawer.T239_lc1_leftOrAbove = (drawer.T239_sx <= x1);
			} else {
				drawer.T239_lc1_horizontal = false;
				drawer.T239_lc1_vertical = false;
				drawer.T239_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T239_lc1_C = x1 - drawer.T239_lc1_m * y1;
				drawer.T239_lc1_leftOrAbove = (drawer.T239_sx < drawer.T239_lc1_m*drawer.T239_sy + drawer.T239_lc1_C);
			}

			if(y2 == y3) {
				drawer.T239_lc2_horizontal = true;
				drawer.T239_lc2_vertical = false;
				drawer.T239_lc2_borderY = y2;
				drawer.T239_lc2_leftOrAbove = (drawer.T239_sy <= y2);
			} else if(x2 == x3) {
				drawer.T239_lc2_horizontal = false;
				drawer.T239_lc2_vertical = true;
				drawer.T239_lc2_borderX = x2;
				drawer.T239_lc2_leftOrAbove = (drawer.T239_sx <= x2);
			} else {
				drawer.T239_lc2_horizontal = false;
				drawer.T239_lc2_vertical = false;
				drawer.T239_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T239_lc2_C = x2 - drawer.T239_lc2_m * y2;
				drawer.T239_lc2_leftOrAbove = (drawer.T239_sx < drawer.T239_lc2_m*drawer.T239_sy + drawer.T239_lc2_C);
			}

			if(y3 == y1) {
				drawer.T239_lc3_horizontal = true;
				drawer.T239_lc3_vertical = false;
				drawer.T239_lc3_borderY = y3;
				drawer.T239_lc3_leftOrAbove = (drawer.T239_sy <= y3);
			} else if(x3 == x1) {
				drawer.T239_lc3_horizontal = false;
				drawer.T239_lc3_vertical = true;
				drawer.T239_lc3_borderX = x3;
				drawer.T239_lc3_leftOrAbove = (drawer.T239_sx <= x3);
			} else {
				drawer.T239_lc3_horizontal = false;
				drawer.T239_lc3_vertical = false;
				drawer.T239_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T239_lc3_C = x3 - drawer.T239_lc3_m * y3;
				drawer.T239_lc3_leftOrAbove = (drawer.T239_sx < drawer.T239_lc3_m*drawer.T239_sy + drawer.T239_lc3_C);
			}

			drawer.T239_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T239_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T239_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T239_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T239_initializedWithValidData = true;
		}
	}

	public void loadTriangles9(SingleTriangle[] triangles) {
		int x1, y1, x2, y2, x3, y3;
		SingleTriangle t;

		t = triangles[240]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T240_r = t.r; drawer.T240_g = t.g; drawer.T240_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T240_initializedWithValidData = false;
		} else {

			drawer.T240_sx = (x1 + x2 + x3) / 3.0;
			drawer.T240_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T240_lc1_horizontal = true;
				drawer.T240_lc1_vertical = false;
				drawer.T240_lc1_borderY = y1;
				drawer.T240_lc1_leftOrAbove = (drawer.T240_sy <= y1);
			} else if(x1 == x2) {
				drawer.T240_lc1_horizontal = false;
				drawer.T240_lc1_vertical = true;
				drawer.T240_lc1_borderX = x1;
				drawer.T240_lc1_leftOrAbove = (drawer.T240_sx <= x1);
			} else {
				drawer.T240_lc1_horizontal = false;
				drawer.T240_lc1_vertical = false;
				drawer.T240_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T240_lc1_C = x1 - drawer.T240_lc1_m * y1;
				drawer.T240_lc1_leftOrAbove = (drawer.T240_sx < drawer.T240_lc1_m*drawer.T240_sy + drawer.T240_lc1_C);
			}

			if(y2 == y3) {
				drawer.T240_lc2_horizontal = true;
				drawer.T240_lc2_vertical = false;
				drawer.T240_lc2_borderY = y2;
				drawer.T240_lc2_leftOrAbove = (drawer.T240_sy <= y2);
			} else if(x2 == x3) {
				drawer.T240_lc2_horizontal = false;
				drawer.T240_lc2_vertical = true;
				drawer.T240_lc2_borderX = x2;
				drawer.T240_lc2_leftOrAbove = (drawer.T240_sx <= x2);
			} else {
				drawer.T240_lc2_horizontal = false;
				drawer.T240_lc2_vertical = false;
				drawer.T240_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T240_lc2_C = x2 - drawer.T240_lc2_m * y2;
				drawer.T240_lc2_leftOrAbove = (drawer.T240_sx < drawer.T240_lc2_m*drawer.T240_sy + drawer.T240_lc2_C);
			}

			if(y3 == y1) {
				drawer.T240_lc3_horizontal = true;
				drawer.T240_lc3_vertical = false;
				drawer.T240_lc3_borderY = y3;
				drawer.T240_lc3_leftOrAbove = (drawer.T240_sy <= y3);
			} else if(x3 == x1) {
				drawer.T240_lc3_horizontal = false;
				drawer.T240_lc3_vertical = true;
				drawer.T240_lc3_borderX = x3;
				drawer.T240_lc3_leftOrAbove = (drawer.T240_sx <= x3);
			} else {
				drawer.T240_lc3_horizontal = false;
				drawer.T240_lc3_vertical = false;
				drawer.T240_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T240_lc3_C = x3 - drawer.T240_lc3_m * y3;
				drawer.T240_lc3_leftOrAbove = (drawer.T240_sx < drawer.T240_lc3_m*drawer.T240_sy + drawer.T240_lc3_C);
			}

			drawer.T240_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T240_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T240_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T240_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T240_initializedWithValidData = true;
		}

		t = triangles[241]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T241_r = t.r; drawer.T241_g = t.g; drawer.T241_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T241_initializedWithValidData = false;
		} else {

			drawer.T241_sx = (x1 + x2 + x3) / 3.0;
			drawer.T241_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T241_lc1_horizontal = true;
				drawer.T241_lc1_vertical = false;
				drawer.T241_lc1_borderY = y1;
				drawer.T241_lc1_leftOrAbove = (drawer.T241_sy <= y1);
			} else if(x1 == x2) {
				drawer.T241_lc1_horizontal = false;
				drawer.T241_lc1_vertical = true;
				drawer.T241_lc1_borderX = x1;
				drawer.T241_lc1_leftOrAbove = (drawer.T241_sx <= x1);
			} else {
				drawer.T241_lc1_horizontal = false;
				drawer.T241_lc1_vertical = false;
				drawer.T241_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T241_lc1_C = x1 - drawer.T241_lc1_m * y1;
				drawer.T241_lc1_leftOrAbove = (drawer.T241_sx < drawer.T241_lc1_m*drawer.T241_sy + drawer.T241_lc1_C);
			}

			if(y2 == y3) {
				drawer.T241_lc2_horizontal = true;
				drawer.T241_lc2_vertical = false;
				drawer.T241_lc2_borderY = y2;
				drawer.T241_lc2_leftOrAbove = (drawer.T241_sy <= y2);
			} else if(x2 == x3) {
				drawer.T241_lc2_horizontal = false;
				drawer.T241_lc2_vertical = true;
				drawer.T241_lc2_borderX = x2;
				drawer.T241_lc2_leftOrAbove = (drawer.T241_sx <= x2);
			} else {
				drawer.T241_lc2_horizontal = false;
				drawer.T241_lc2_vertical = false;
				drawer.T241_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T241_lc2_C = x2 - drawer.T241_lc2_m * y2;
				drawer.T241_lc2_leftOrAbove = (drawer.T241_sx < drawer.T241_lc2_m*drawer.T241_sy + drawer.T241_lc2_C);
			}

			if(y3 == y1) {
				drawer.T241_lc3_horizontal = true;
				drawer.T241_lc3_vertical = false;
				drawer.T241_lc3_borderY = y3;
				drawer.T241_lc3_leftOrAbove = (drawer.T241_sy <= y3);
			} else if(x3 == x1) {
				drawer.T241_lc3_horizontal = false;
				drawer.T241_lc3_vertical = true;
				drawer.T241_lc3_borderX = x3;
				drawer.T241_lc3_leftOrAbove = (drawer.T241_sx <= x3);
			} else {
				drawer.T241_lc3_horizontal = false;
				drawer.T241_lc3_vertical = false;
				drawer.T241_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T241_lc3_C = x3 - drawer.T241_lc3_m * y3;
				drawer.T241_lc3_leftOrAbove = (drawer.T241_sx < drawer.T241_lc3_m*drawer.T241_sy + drawer.T241_lc3_C);
			}

			drawer.T241_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T241_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T241_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T241_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T241_initializedWithValidData = true;
		}

		t = triangles[242]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T242_r = t.r; drawer.T242_g = t.g; drawer.T242_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T242_initializedWithValidData = false;
		} else {

			drawer.T242_sx = (x1 + x2 + x3) / 3.0;
			drawer.T242_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T242_lc1_horizontal = true;
				drawer.T242_lc1_vertical = false;
				drawer.T242_lc1_borderY = y1;
				drawer.T242_lc1_leftOrAbove = (drawer.T242_sy <= y1);
			} else if(x1 == x2) {
				drawer.T242_lc1_horizontal = false;
				drawer.T242_lc1_vertical = true;
				drawer.T242_lc1_borderX = x1;
				drawer.T242_lc1_leftOrAbove = (drawer.T242_sx <= x1);
			} else {
				drawer.T242_lc1_horizontal = false;
				drawer.T242_lc1_vertical = false;
				drawer.T242_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T242_lc1_C = x1 - drawer.T242_lc1_m * y1;
				drawer.T242_lc1_leftOrAbove = (drawer.T242_sx < drawer.T242_lc1_m*drawer.T242_sy + drawer.T242_lc1_C);
			}

			if(y2 == y3) {
				drawer.T242_lc2_horizontal = true;
				drawer.T242_lc2_vertical = false;
				drawer.T242_lc2_borderY = y2;
				drawer.T242_lc2_leftOrAbove = (drawer.T242_sy <= y2);
			} else if(x2 == x3) {
				drawer.T242_lc2_horizontal = false;
				drawer.T242_lc2_vertical = true;
				drawer.T242_lc2_borderX = x2;
				drawer.T242_lc2_leftOrAbove = (drawer.T242_sx <= x2);
			} else {
				drawer.T242_lc2_horizontal = false;
				drawer.T242_lc2_vertical = false;
				drawer.T242_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T242_lc2_C = x2 - drawer.T242_lc2_m * y2;
				drawer.T242_lc2_leftOrAbove = (drawer.T242_sx < drawer.T242_lc2_m*drawer.T242_sy + drawer.T242_lc2_C);
			}

			if(y3 == y1) {
				drawer.T242_lc3_horizontal = true;
				drawer.T242_lc3_vertical = false;
				drawer.T242_lc3_borderY = y3;
				drawer.T242_lc3_leftOrAbove = (drawer.T242_sy <= y3);
			} else if(x3 == x1) {
				drawer.T242_lc3_horizontal = false;
				drawer.T242_lc3_vertical = true;
				drawer.T242_lc3_borderX = x3;
				drawer.T242_lc3_leftOrAbove = (drawer.T242_sx <= x3);
			} else {
				drawer.T242_lc3_horizontal = false;
				drawer.T242_lc3_vertical = false;
				drawer.T242_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T242_lc3_C = x3 - drawer.T242_lc3_m * y3;
				drawer.T242_lc3_leftOrAbove = (drawer.T242_sx < drawer.T242_lc3_m*drawer.T242_sy + drawer.T242_lc3_C);
			}

			drawer.T242_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T242_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T242_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T242_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T242_initializedWithValidData = true;
		}

		t = triangles[243]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T243_r = t.r; drawer.T243_g = t.g; drawer.T243_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T243_initializedWithValidData = false;
		} else {

			drawer.T243_sx = (x1 + x2 + x3) / 3.0;
			drawer.T243_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T243_lc1_horizontal = true;
				drawer.T243_lc1_vertical = false;
				drawer.T243_lc1_borderY = y1;
				drawer.T243_lc1_leftOrAbove = (drawer.T243_sy <= y1);
			} else if(x1 == x2) {
				drawer.T243_lc1_horizontal = false;
				drawer.T243_lc1_vertical = true;
				drawer.T243_lc1_borderX = x1;
				drawer.T243_lc1_leftOrAbove = (drawer.T243_sx <= x1);
			} else {
				drawer.T243_lc1_horizontal = false;
				drawer.T243_lc1_vertical = false;
				drawer.T243_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T243_lc1_C = x1 - drawer.T243_lc1_m * y1;
				drawer.T243_lc1_leftOrAbove = (drawer.T243_sx < drawer.T243_lc1_m*drawer.T243_sy + drawer.T243_lc1_C);
			}

			if(y2 == y3) {
				drawer.T243_lc2_horizontal = true;
				drawer.T243_lc2_vertical = false;
				drawer.T243_lc2_borderY = y2;
				drawer.T243_lc2_leftOrAbove = (drawer.T243_sy <= y2);
			} else if(x2 == x3) {
				drawer.T243_lc2_horizontal = false;
				drawer.T243_lc2_vertical = true;
				drawer.T243_lc2_borderX = x2;
				drawer.T243_lc2_leftOrAbove = (drawer.T243_sx <= x2);
			} else {
				drawer.T243_lc2_horizontal = false;
				drawer.T243_lc2_vertical = false;
				drawer.T243_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T243_lc2_C = x2 - drawer.T243_lc2_m * y2;
				drawer.T243_lc2_leftOrAbove = (drawer.T243_sx < drawer.T243_lc2_m*drawer.T243_sy + drawer.T243_lc2_C);
			}

			if(y3 == y1) {
				drawer.T243_lc3_horizontal = true;
				drawer.T243_lc3_vertical = false;
				drawer.T243_lc3_borderY = y3;
				drawer.T243_lc3_leftOrAbove = (drawer.T243_sy <= y3);
			} else if(x3 == x1) {
				drawer.T243_lc3_horizontal = false;
				drawer.T243_lc3_vertical = true;
				drawer.T243_lc3_borderX = x3;
				drawer.T243_lc3_leftOrAbove = (drawer.T243_sx <= x3);
			} else {
				drawer.T243_lc3_horizontal = false;
				drawer.T243_lc3_vertical = false;
				drawer.T243_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T243_lc3_C = x3 - drawer.T243_lc3_m * y3;
				drawer.T243_lc3_leftOrAbove = (drawer.T243_sx < drawer.T243_lc3_m*drawer.T243_sy + drawer.T243_lc3_C);
			}

			drawer.T243_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T243_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T243_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T243_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T243_initializedWithValidData = true;
		}

		t = triangles[244]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T244_r = t.r; drawer.T244_g = t.g; drawer.T244_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T244_initializedWithValidData = false;
		} else {

			drawer.T244_sx = (x1 + x2 + x3) / 3.0;
			drawer.T244_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T244_lc1_horizontal = true;
				drawer.T244_lc1_vertical = false;
				drawer.T244_lc1_borderY = y1;
				drawer.T244_lc1_leftOrAbove = (drawer.T244_sy <= y1);
			} else if(x1 == x2) {
				drawer.T244_lc1_horizontal = false;
				drawer.T244_lc1_vertical = true;
				drawer.T244_lc1_borderX = x1;
				drawer.T244_lc1_leftOrAbove = (drawer.T244_sx <= x1);
			} else {
				drawer.T244_lc1_horizontal = false;
				drawer.T244_lc1_vertical = false;
				drawer.T244_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T244_lc1_C = x1 - drawer.T244_lc1_m * y1;
				drawer.T244_lc1_leftOrAbove = (drawer.T244_sx < drawer.T244_lc1_m*drawer.T244_sy + drawer.T244_lc1_C);
			}

			if(y2 == y3) {
				drawer.T244_lc2_horizontal = true;
				drawer.T244_lc2_vertical = false;
				drawer.T244_lc2_borderY = y2;
				drawer.T244_lc2_leftOrAbove = (drawer.T244_sy <= y2);
			} else if(x2 == x3) {
				drawer.T244_lc2_horizontal = false;
				drawer.T244_lc2_vertical = true;
				drawer.T244_lc2_borderX = x2;
				drawer.T244_lc2_leftOrAbove = (drawer.T244_sx <= x2);
			} else {
				drawer.T244_lc2_horizontal = false;
				drawer.T244_lc2_vertical = false;
				drawer.T244_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T244_lc2_C = x2 - drawer.T244_lc2_m * y2;
				drawer.T244_lc2_leftOrAbove = (drawer.T244_sx < drawer.T244_lc2_m*drawer.T244_sy + drawer.T244_lc2_C);
			}

			if(y3 == y1) {
				drawer.T244_lc3_horizontal = true;
				drawer.T244_lc3_vertical = false;
				drawer.T244_lc3_borderY = y3;
				drawer.T244_lc3_leftOrAbove = (drawer.T244_sy <= y3);
			} else if(x3 == x1) {
				drawer.T244_lc3_horizontal = false;
				drawer.T244_lc3_vertical = true;
				drawer.T244_lc3_borderX = x3;
				drawer.T244_lc3_leftOrAbove = (drawer.T244_sx <= x3);
			} else {
				drawer.T244_lc3_horizontal = false;
				drawer.T244_lc3_vertical = false;
				drawer.T244_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T244_lc3_C = x3 - drawer.T244_lc3_m * y3;
				drawer.T244_lc3_leftOrAbove = (drawer.T244_sx < drawer.T244_lc3_m*drawer.T244_sy + drawer.T244_lc3_C);
			}

			drawer.T244_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T244_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T244_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T244_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T244_initializedWithValidData = true;
		}

		t = triangles[245]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T245_r = t.r; drawer.T245_g = t.g; drawer.T245_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T245_initializedWithValidData = false;
		} else {

			drawer.T245_sx = (x1 + x2 + x3) / 3.0;
			drawer.T245_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T245_lc1_horizontal = true;
				drawer.T245_lc1_vertical = false;
				drawer.T245_lc1_borderY = y1;
				drawer.T245_lc1_leftOrAbove = (drawer.T245_sy <= y1);
			} else if(x1 == x2) {
				drawer.T245_lc1_horizontal = false;
				drawer.T245_lc1_vertical = true;
				drawer.T245_lc1_borderX = x1;
				drawer.T245_lc1_leftOrAbove = (drawer.T245_sx <= x1);
			} else {
				drawer.T245_lc1_horizontal = false;
				drawer.T245_lc1_vertical = false;
				drawer.T245_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T245_lc1_C = x1 - drawer.T245_lc1_m * y1;
				drawer.T245_lc1_leftOrAbove = (drawer.T245_sx < drawer.T245_lc1_m*drawer.T245_sy + drawer.T245_lc1_C);
			}

			if(y2 == y3) {
				drawer.T245_lc2_horizontal = true;
				drawer.T245_lc2_vertical = false;
				drawer.T245_lc2_borderY = y2;
				drawer.T245_lc2_leftOrAbove = (drawer.T245_sy <= y2);
			} else if(x2 == x3) {
				drawer.T245_lc2_horizontal = false;
				drawer.T245_lc2_vertical = true;
				drawer.T245_lc2_borderX = x2;
				drawer.T245_lc2_leftOrAbove = (drawer.T245_sx <= x2);
			} else {
				drawer.T245_lc2_horizontal = false;
				drawer.T245_lc2_vertical = false;
				drawer.T245_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T245_lc2_C = x2 - drawer.T245_lc2_m * y2;
				drawer.T245_lc2_leftOrAbove = (drawer.T245_sx < drawer.T245_lc2_m*drawer.T245_sy + drawer.T245_lc2_C);
			}

			if(y3 == y1) {
				drawer.T245_lc3_horizontal = true;
				drawer.T245_lc3_vertical = false;
				drawer.T245_lc3_borderY = y3;
				drawer.T245_lc3_leftOrAbove = (drawer.T245_sy <= y3);
			} else if(x3 == x1) {
				drawer.T245_lc3_horizontal = false;
				drawer.T245_lc3_vertical = true;
				drawer.T245_lc3_borderX = x3;
				drawer.T245_lc3_leftOrAbove = (drawer.T245_sx <= x3);
			} else {
				drawer.T245_lc3_horizontal = false;
				drawer.T245_lc3_vertical = false;
				drawer.T245_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T245_lc3_C = x3 - drawer.T245_lc3_m * y3;
				drawer.T245_lc3_leftOrAbove = (drawer.T245_sx < drawer.T245_lc3_m*drawer.T245_sy + drawer.T245_lc3_C);
			}

			drawer.T245_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T245_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T245_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T245_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T245_initializedWithValidData = true;
		}

		t = triangles[246]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T246_r = t.r; drawer.T246_g = t.g; drawer.T246_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T246_initializedWithValidData = false;
		} else {

			drawer.T246_sx = (x1 + x2 + x3) / 3.0;
			drawer.T246_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T246_lc1_horizontal = true;
				drawer.T246_lc1_vertical = false;
				drawer.T246_lc1_borderY = y1;
				drawer.T246_lc1_leftOrAbove = (drawer.T246_sy <= y1);
			} else if(x1 == x2) {
				drawer.T246_lc1_horizontal = false;
				drawer.T246_lc1_vertical = true;
				drawer.T246_lc1_borderX = x1;
				drawer.T246_lc1_leftOrAbove = (drawer.T246_sx <= x1);
			} else {
				drawer.T246_lc1_horizontal = false;
				drawer.T246_lc1_vertical = false;
				drawer.T246_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T246_lc1_C = x1 - drawer.T246_lc1_m * y1;
				drawer.T246_lc1_leftOrAbove = (drawer.T246_sx < drawer.T246_lc1_m*drawer.T246_sy + drawer.T246_lc1_C);
			}

			if(y2 == y3) {
				drawer.T246_lc2_horizontal = true;
				drawer.T246_lc2_vertical = false;
				drawer.T246_lc2_borderY = y2;
				drawer.T246_lc2_leftOrAbove = (drawer.T246_sy <= y2);
			} else if(x2 == x3) {
				drawer.T246_lc2_horizontal = false;
				drawer.T246_lc2_vertical = true;
				drawer.T246_lc2_borderX = x2;
				drawer.T246_lc2_leftOrAbove = (drawer.T246_sx <= x2);
			} else {
				drawer.T246_lc2_horizontal = false;
				drawer.T246_lc2_vertical = false;
				drawer.T246_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T246_lc2_C = x2 - drawer.T246_lc2_m * y2;
				drawer.T246_lc2_leftOrAbove = (drawer.T246_sx < drawer.T246_lc2_m*drawer.T246_sy + drawer.T246_lc2_C);
			}

			if(y3 == y1) {
				drawer.T246_lc3_horizontal = true;
				drawer.T246_lc3_vertical = false;
				drawer.T246_lc3_borderY = y3;
				drawer.T246_lc3_leftOrAbove = (drawer.T246_sy <= y3);
			} else if(x3 == x1) {
				drawer.T246_lc3_horizontal = false;
				drawer.T246_lc3_vertical = true;
				drawer.T246_lc3_borderX = x3;
				drawer.T246_lc3_leftOrAbove = (drawer.T246_sx <= x3);
			} else {
				drawer.T246_lc3_horizontal = false;
				drawer.T246_lc3_vertical = false;
				drawer.T246_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T246_lc3_C = x3 - drawer.T246_lc3_m * y3;
				drawer.T246_lc3_leftOrAbove = (drawer.T246_sx < drawer.T246_lc3_m*drawer.T246_sy + drawer.T246_lc3_C);
			}

			drawer.T246_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T246_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T246_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T246_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T246_initializedWithValidData = true;
		}

		t = triangles[247]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T247_r = t.r; drawer.T247_g = t.g; drawer.T247_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T247_initializedWithValidData = false;
		} else {

			drawer.T247_sx = (x1 + x2 + x3) / 3.0;
			drawer.T247_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T247_lc1_horizontal = true;
				drawer.T247_lc1_vertical = false;
				drawer.T247_lc1_borderY = y1;
				drawer.T247_lc1_leftOrAbove = (drawer.T247_sy <= y1);
			} else if(x1 == x2) {
				drawer.T247_lc1_horizontal = false;
				drawer.T247_lc1_vertical = true;
				drawer.T247_lc1_borderX = x1;
				drawer.T247_lc1_leftOrAbove = (drawer.T247_sx <= x1);
			} else {
				drawer.T247_lc1_horizontal = false;
				drawer.T247_lc1_vertical = false;
				drawer.T247_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T247_lc1_C = x1 - drawer.T247_lc1_m * y1;
				drawer.T247_lc1_leftOrAbove = (drawer.T247_sx < drawer.T247_lc1_m*drawer.T247_sy + drawer.T247_lc1_C);
			}

			if(y2 == y3) {
				drawer.T247_lc2_horizontal = true;
				drawer.T247_lc2_vertical = false;
				drawer.T247_lc2_borderY = y2;
				drawer.T247_lc2_leftOrAbove = (drawer.T247_sy <= y2);
			} else if(x2 == x3) {
				drawer.T247_lc2_horizontal = false;
				drawer.T247_lc2_vertical = true;
				drawer.T247_lc2_borderX = x2;
				drawer.T247_lc2_leftOrAbove = (drawer.T247_sx <= x2);
			} else {
				drawer.T247_lc2_horizontal = false;
				drawer.T247_lc2_vertical = false;
				drawer.T247_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T247_lc2_C = x2 - drawer.T247_lc2_m * y2;
				drawer.T247_lc2_leftOrAbove = (drawer.T247_sx < drawer.T247_lc2_m*drawer.T247_sy + drawer.T247_lc2_C);
			}

			if(y3 == y1) {
				drawer.T247_lc3_horizontal = true;
				drawer.T247_lc3_vertical = false;
				drawer.T247_lc3_borderY = y3;
				drawer.T247_lc3_leftOrAbove = (drawer.T247_sy <= y3);
			} else if(x3 == x1) {
				drawer.T247_lc3_horizontal = false;
				drawer.T247_lc3_vertical = true;
				drawer.T247_lc3_borderX = x3;
				drawer.T247_lc3_leftOrAbove = (drawer.T247_sx <= x3);
			} else {
				drawer.T247_lc3_horizontal = false;
				drawer.T247_lc3_vertical = false;
				drawer.T247_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T247_lc3_C = x3 - drawer.T247_lc3_m * y3;
				drawer.T247_lc3_leftOrAbove = (drawer.T247_sx < drawer.T247_lc3_m*drawer.T247_sy + drawer.T247_lc3_C);
			}

			drawer.T247_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T247_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T247_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T247_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T247_initializedWithValidData = true;
		}

		t = triangles[248]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T248_r = t.r; drawer.T248_g = t.g; drawer.T248_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T248_initializedWithValidData = false;
		} else {

			drawer.T248_sx = (x1 + x2 + x3) / 3.0;
			drawer.T248_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T248_lc1_horizontal = true;
				drawer.T248_lc1_vertical = false;
				drawer.T248_lc1_borderY = y1;
				drawer.T248_lc1_leftOrAbove = (drawer.T248_sy <= y1);
			} else if(x1 == x2) {
				drawer.T248_lc1_horizontal = false;
				drawer.T248_lc1_vertical = true;
				drawer.T248_lc1_borderX = x1;
				drawer.T248_lc1_leftOrAbove = (drawer.T248_sx <= x1);
			} else {
				drawer.T248_lc1_horizontal = false;
				drawer.T248_lc1_vertical = false;
				drawer.T248_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T248_lc1_C = x1 - drawer.T248_lc1_m * y1;
				drawer.T248_lc1_leftOrAbove = (drawer.T248_sx < drawer.T248_lc1_m*drawer.T248_sy + drawer.T248_lc1_C);
			}

			if(y2 == y3) {
				drawer.T248_lc2_horizontal = true;
				drawer.T248_lc2_vertical = false;
				drawer.T248_lc2_borderY = y2;
				drawer.T248_lc2_leftOrAbove = (drawer.T248_sy <= y2);
			} else if(x2 == x3) {
				drawer.T248_lc2_horizontal = false;
				drawer.T248_lc2_vertical = true;
				drawer.T248_lc2_borderX = x2;
				drawer.T248_lc2_leftOrAbove = (drawer.T248_sx <= x2);
			} else {
				drawer.T248_lc2_horizontal = false;
				drawer.T248_lc2_vertical = false;
				drawer.T248_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T248_lc2_C = x2 - drawer.T248_lc2_m * y2;
				drawer.T248_lc2_leftOrAbove = (drawer.T248_sx < drawer.T248_lc2_m*drawer.T248_sy + drawer.T248_lc2_C);
			}

			if(y3 == y1) {
				drawer.T248_lc3_horizontal = true;
				drawer.T248_lc3_vertical = false;
				drawer.T248_lc3_borderY = y3;
				drawer.T248_lc3_leftOrAbove = (drawer.T248_sy <= y3);
			} else if(x3 == x1) {
				drawer.T248_lc3_horizontal = false;
				drawer.T248_lc3_vertical = true;
				drawer.T248_lc3_borderX = x3;
				drawer.T248_lc3_leftOrAbove = (drawer.T248_sx <= x3);
			} else {
				drawer.T248_lc3_horizontal = false;
				drawer.T248_lc3_vertical = false;
				drawer.T248_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T248_lc3_C = x3 - drawer.T248_lc3_m * y3;
				drawer.T248_lc3_leftOrAbove = (drawer.T248_sx < drawer.T248_lc3_m*drawer.T248_sy + drawer.T248_lc3_C);
			}

			drawer.T248_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T248_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T248_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T248_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T248_initializedWithValidData = true;
		}

		t = triangles[249]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T249_r = t.r; drawer.T249_g = t.g; drawer.T249_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T249_initializedWithValidData = false;
		} else {

			drawer.T249_sx = (x1 + x2 + x3) / 3.0;
			drawer.T249_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T249_lc1_horizontal = true;
				drawer.T249_lc1_vertical = false;
				drawer.T249_lc1_borderY = y1;
				drawer.T249_lc1_leftOrAbove = (drawer.T249_sy <= y1);
			} else if(x1 == x2) {
				drawer.T249_lc1_horizontal = false;
				drawer.T249_lc1_vertical = true;
				drawer.T249_lc1_borderX = x1;
				drawer.T249_lc1_leftOrAbove = (drawer.T249_sx <= x1);
			} else {
				drawer.T249_lc1_horizontal = false;
				drawer.T249_lc1_vertical = false;
				drawer.T249_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T249_lc1_C = x1 - drawer.T249_lc1_m * y1;
				drawer.T249_lc1_leftOrAbove = (drawer.T249_sx < drawer.T249_lc1_m*drawer.T249_sy + drawer.T249_lc1_C);
			}

			if(y2 == y3) {
				drawer.T249_lc2_horizontal = true;
				drawer.T249_lc2_vertical = false;
				drawer.T249_lc2_borderY = y2;
				drawer.T249_lc2_leftOrAbove = (drawer.T249_sy <= y2);
			} else if(x2 == x3) {
				drawer.T249_lc2_horizontal = false;
				drawer.T249_lc2_vertical = true;
				drawer.T249_lc2_borderX = x2;
				drawer.T249_lc2_leftOrAbove = (drawer.T249_sx <= x2);
			} else {
				drawer.T249_lc2_horizontal = false;
				drawer.T249_lc2_vertical = false;
				drawer.T249_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T249_lc2_C = x2 - drawer.T249_lc2_m * y2;
				drawer.T249_lc2_leftOrAbove = (drawer.T249_sx < drawer.T249_lc2_m*drawer.T249_sy + drawer.T249_lc2_C);
			}

			if(y3 == y1) {
				drawer.T249_lc3_horizontal = true;
				drawer.T249_lc3_vertical = false;
				drawer.T249_lc3_borderY = y3;
				drawer.T249_lc3_leftOrAbove = (drawer.T249_sy <= y3);
			} else if(x3 == x1) {
				drawer.T249_lc3_horizontal = false;
				drawer.T249_lc3_vertical = true;
				drawer.T249_lc3_borderX = x3;
				drawer.T249_lc3_leftOrAbove = (drawer.T249_sx <= x3);
			} else {
				drawer.T249_lc3_horizontal = false;
				drawer.T249_lc3_vertical = false;
				drawer.T249_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T249_lc3_C = x3 - drawer.T249_lc3_m * y3;
				drawer.T249_lc3_leftOrAbove = (drawer.T249_sx < drawer.T249_lc3_m*drawer.T249_sy + drawer.T249_lc3_C);
			}

			drawer.T249_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T249_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T249_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T249_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T249_initializedWithValidData = true;
		}

		t = triangles[250]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T250_r = t.r; drawer.T250_g = t.g; drawer.T250_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T250_initializedWithValidData = false;
		} else {

			drawer.T250_sx = (x1 + x2 + x3) / 3.0;
			drawer.T250_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T250_lc1_horizontal = true;
				drawer.T250_lc1_vertical = false;
				drawer.T250_lc1_borderY = y1;
				drawer.T250_lc1_leftOrAbove = (drawer.T250_sy <= y1);
			} else if(x1 == x2) {
				drawer.T250_lc1_horizontal = false;
				drawer.T250_lc1_vertical = true;
				drawer.T250_lc1_borderX = x1;
				drawer.T250_lc1_leftOrAbove = (drawer.T250_sx <= x1);
			} else {
				drawer.T250_lc1_horizontal = false;
				drawer.T250_lc1_vertical = false;
				drawer.T250_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T250_lc1_C = x1 - drawer.T250_lc1_m * y1;
				drawer.T250_lc1_leftOrAbove = (drawer.T250_sx < drawer.T250_lc1_m*drawer.T250_sy + drawer.T250_lc1_C);
			}

			if(y2 == y3) {
				drawer.T250_lc2_horizontal = true;
				drawer.T250_lc2_vertical = false;
				drawer.T250_lc2_borderY = y2;
				drawer.T250_lc2_leftOrAbove = (drawer.T250_sy <= y2);
			} else if(x2 == x3) {
				drawer.T250_lc2_horizontal = false;
				drawer.T250_lc2_vertical = true;
				drawer.T250_lc2_borderX = x2;
				drawer.T250_lc2_leftOrAbove = (drawer.T250_sx <= x2);
			} else {
				drawer.T250_lc2_horizontal = false;
				drawer.T250_lc2_vertical = false;
				drawer.T250_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T250_lc2_C = x2 - drawer.T250_lc2_m * y2;
				drawer.T250_lc2_leftOrAbove = (drawer.T250_sx < drawer.T250_lc2_m*drawer.T250_sy + drawer.T250_lc2_C);
			}

			if(y3 == y1) {
				drawer.T250_lc3_horizontal = true;
				drawer.T250_lc3_vertical = false;
				drawer.T250_lc3_borderY = y3;
				drawer.T250_lc3_leftOrAbove = (drawer.T250_sy <= y3);
			} else if(x3 == x1) {
				drawer.T250_lc3_horizontal = false;
				drawer.T250_lc3_vertical = true;
				drawer.T250_lc3_borderX = x3;
				drawer.T250_lc3_leftOrAbove = (drawer.T250_sx <= x3);
			} else {
				drawer.T250_lc3_horizontal = false;
				drawer.T250_lc3_vertical = false;
				drawer.T250_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T250_lc3_C = x3 - drawer.T250_lc3_m * y3;
				drawer.T250_lc3_leftOrAbove = (drawer.T250_sx < drawer.T250_lc3_m*drawer.T250_sy + drawer.T250_lc3_C);
			}

			drawer.T250_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T250_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T250_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T250_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T250_initializedWithValidData = true;
		}

		t = triangles[251]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T251_r = t.r; drawer.T251_g = t.g; drawer.T251_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T251_initializedWithValidData = false;
		} else {

			drawer.T251_sx = (x1 + x2 + x3) / 3.0;
			drawer.T251_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T251_lc1_horizontal = true;
				drawer.T251_lc1_vertical = false;
				drawer.T251_lc1_borderY = y1;
				drawer.T251_lc1_leftOrAbove = (drawer.T251_sy <= y1);
			} else if(x1 == x2) {
				drawer.T251_lc1_horizontal = false;
				drawer.T251_lc1_vertical = true;
				drawer.T251_lc1_borderX = x1;
				drawer.T251_lc1_leftOrAbove = (drawer.T251_sx <= x1);
			} else {
				drawer.T251_lc1_horizontal = false;
				drawer.T251_lc1_vertical = false;
				drawer.T251_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T251_lc1_C = x1 - drawer.T251_lc1_m * y1;
				drawer.T251_lc1_leftOrAbove = (drawer.T251_sx < drawer.T251_lc1_m*drawer.T251_sy + drawer.T251_lc1_C);
			}

			if(y2 == y3) {
				drawer.T251_lc2_horizontal = true;
				drawer.T251_lc2_vertical = false;
				drawer.T251_lc2_borderY = y2;
				drawer.T251_lc2_leftOrAbove = (drawer.T251_sy <= y2);
			} else if(x2 == x3) {
				drawer.T251_lc2_horizontal = false;
				drawer.T251_lc2_vertical = true;
				drawer.T251_lc2_borderX = x2;
				drawer.T251_lc2_leftOrAbove = (drawer.T251_sx <= x2);
			} else {
				drawer.T251_lc2_horizontal = false;
				drawer.T251_lc2_vertical = false;
				drawer.T251_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T251_lc2_C = x2 - drawer.T251_lc2_m * y2;
				drawer.T251_lc2_leftOrAbove = (drawer.T251_sx < drawer.T251_lc2_m*drawer.T251_sy + drawer.T251_lc2_C);
			}

			if(y3 == y1) {
				drawer.T251_lc3_horizontal = true;
				drawer.T251_lc3_vertical = false;
				drawer.T251_lc3_borderY = y3;
				drawer.T251_lc3_leftOrAbove = (drawer.T251_sy <= y3);
			} else if(x3 == x1) {
				drawer.T251_lc3_horizontal = false;
				drawer.T251_lc3_vertical = true;
				drawer.T251_lc3_borderX = x3;
				drawer.T251_lc3_leftOrAbove = (drawer.T251_sx <= x3);
			} else {
				drawer.T251_lc3_horizontal = false;
				drawer.T251_lc3_vertical = false;
				drawer.T251_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T251_lc3_C = x3 - drawer.T251_lc3_m * y3;
				drawer.T251_lc3_leftOrAbove = (drawer.T251_sx < drawer.T251_lc3_m*drawer.T251_sy + drawer.T251_lc3_C);
			}

			drawer.T251_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T251_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T251_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T251_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T251_initializedWithValidData = true;
		}

		t = triangles[252]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T252_r = t.r; drawer.T252_g = t.g; drawer.T252_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T252_initializedWithValidData = false;
		} else {

			drawer.T252_sx = (x1 + x2 + x3) / 3.0;
			drawer.T252_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T252_lc1_horizontal = true;
				drawer.T252_lc1_vertical = false;
				drawer.T252_lc1_borderY = y1;
				drawer.T252_lc1_leftOrAbove = (drawer.T252_sy <= y1);
			} else if(x1 == x2) {
				drawer.T252_lc1_horizontal = false;
				drawer.T252_lc1_vertical = true;
				drawer.T252_lc1_borderX = x1;
				drawer.T252_lc1_leftOrAbove = (drawer.T252_sx <= x1);
			} else {
				drawer.T252_lc1_horizontal = false;
				drawer.T252_lc1_vertical = false;
				drawer.T252_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T252_lc1_C = x1 - drawer.T252_lc1_m * y1;
				drawer.T252_lc1_leftOrAbove = (drawer.T252_sx < drawer.T252_lc1_m*drawer.T252_sy + drawer.T252_lc1_C);
			}

			if(y2 == y3) {
				drawer.T252_lc2_horizontal = true;
				drawer.T252_lc2_vertical = false;
				drawer.T252_lc2_borderY = y2;
				drawer.T252_lc2_leftOrAbove = (drawer.T252_sy <= y2);
			} else if(x2 == x3) {
				drawer.T252_lc2_horizontal = false;
				drawer.T252_lc2_vertical = true;
				drawer.T252_lc2_borderX = x2;
				drawer.T252_lc2_leftOrAbove = (drawer.T252_sx <= x2);
			} else {
				drawer.T252_lc2_horizontal = false;
				drawer.T252_lc2_vertical = false;
				drawer.T252_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T252_lc2_C = x2 - drawer.T252_lc2_m * y2;
				drawer.T252_lc2_leftOrAbove = (drawer.T252_sx < drawer.T252_lc2_m*drawer.T252_sy + drawer.T252_lc2_C);
			}

			if(y3 == y1) {
				drawer.T252_lc3_horizontal = true;
				drawer.T252_lc3_vertical = false;
				drawer.T252_lc3_borderY = y3;
				drawer.T252_lc3_leftOrAbove = (drawer.T252_sy <= y3);
			} else if(x3 == x1) {
				drawer.T252_lc3_horizontal = false;
				drawer.T252_lc3_vertical = true;
				drawer.T252_lc3_borderX = x3;
				drawer.T252_lc3_leftOrAbove = (drawer.T252_sx <= x3);
			} else {
				drawer.T252_lc3_horizontal = false;
				drawer.T252_lc3_vertical = false;
				drawer.T252_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T252_lc3_C = x3 - drawer.T252_lc3_m * y3;
				drawer.T252_lc3_leftOrAbove = (drawer.T252_sx < drawer.T252_lc3_m*drawer.T252_sy + drawer.T252_lc3_C);
			}

			drawer.T252_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T252_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T252_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T252_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T252_initializedWithValidData = true;
		}

		t = triangles[253]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T253_r = t.r; drawer.T253_g = t.g; drawer.T253_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T253_initializedWithValidData = false;
		} else {

			drawer.T253_sx = (x1 + x2 + x3) / 3.0;
			drawer.T253_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T253_lc1_horizontal = true;
				drawer.T253_lc1_vertical = false;
				drawer.T253_lc1_borderY = y1;
				drawer.T253_lc1_leftOrAbove = (drawer.T253_sy <= y1);
			} else if(x1 == x2) {
				drawer.T253_lc1_horizontal = false;
				drawer.T253_lc1_vertical = true;
				drawer.T253_lc1_borderX = x1;
				drawer.T253_lc1_leftOrAbove = (drawer.T253_sx <= x1);
			} else {
				drawer.T253_lc1_horizontal = false;
				drawer.T253_lc1_vertical = false;
				drawer.T253_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T253_lc1_C = x1 - drawer.T253_lc1_m * y1;
				drawer.T253_lc1_leftOrAbove = (drawer.T253_sx < drawer.T253_lc1_m*drawer.T253_sy + drawer.T253_lc1_C);
			}

			if(y2 == y3) {
				drawer.T253_lc2_horizontal = true;
				drawer.T253_lc2_vertical = false;
				drawer.T253_lc2_borderY = y2;
				drawer.T253_lc2_leftOrAbove = (drawer.T253_sy <= y2);
			} else if(x2 == x3) {
				drawer.T253_lc2_horizontal = false;
				drawer.T253_lc2_vertical = true;
				drawer.T253_lc2_borderX = x2;
				drawer.T253_lc2_leftOrAbove = (drawer.T253_sx <= x2);
			} else {
				drawer.T253_lc2_horizontal = false;
				drawer.T253_lc2_vertical = false;
				drawer.T253_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T253_lc2_C = x2 - drawer.T253_lc2_m * y2;
				drawer.T253_lc2_leftOrAbove = (drawer.T253_sx < drawer.T253_lc2_m*drawer.T253_sy + drawer.T253_lc2_C);
			}

			if(y3 == y1) {
				drawer.T253_lc3_horizontal = true;
				drawer.T253_lc3_vertical = false;
				drawer.T253_lc3_borderY = y3;
				drawer.T253_lc3_leftOrAbove = (drawer.T253_sy <= y3);
			} else if(x3 == x1) {
				drawer.T253_lc3_horizontal = false;
				drawer.T253_lc3_vertical = true;
				drawer.T253_lc3_borderX = x3;
				drawer.T253_lc3_leftOrAbove = (drawer.T253_sx <= x3);
			} else {
				drawer.T253_lc3_horizontal = false;
				drawer.T253_lc3_vertical = false;
				drawer.T253_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T253_lc3_C = x3 - drawer.T253_lc3_m * y3;
				drawer.T253_lc3_leftOrAbove = (drawer.T253_sx < drawer.T253_lc3_m*drawer.T253_sy + drawer.T253_lc3_C);
			}

			drawer.T253_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T253_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T253_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T253_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T253_initializedWithValidData = true;
		}

		t = triangles[254]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T254_r = t.r; drawer.T254_g = t.g; drawer.T254_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T254_initializedWithValidData = false;
		} else {

			drawer.T254_sx = (x1 + x2 + x3) / 3.0;
			drawer.T254_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T254_lc1_horizontal = true;
				drawer.T254_lc1_vertical = false;
				drawer.T254_lc1_borderY = y1;
				drawer.T254_lc1_leftOrAbove = (drawer.T254_sy <= y1);
			} else if(x1 == x2) {
				drawer.T254_lc1_horizontal = false;
				drawer.T254_lc1_vertical = true;
				drawer.T254_lc1_borderX = x1;
				drawer.T254_lc1_leftOrAbove = (drawer.T254_sx <= x1);
			} else {
				drawer.T254_lc1_horizontal = false;
				drawer.T254_lc1_vertical = false;
				drawer.T254_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T254_lc1_C = x1 - drawer.T254_lc1_m * y1;
				drawer.T254_lc1_leftOrAbove = (drawer.T254_sx < drawer.T254_lc1_m*drawer.T254_sy + drawer.T254_lc1_C);
			}

			if(y2 == y3) {
				drawer.T254_lc2_horizontal = true;
				drawer.T254_lc2_vertical = false;
				drawer.T254_lc2_borderY = y2;
				drawer.T254_lc2_leftOrAbove = (drawer.T254_sy <= y2);
			} else if(x2 == x3) {
				drawer.T254_lc2_horizontal = false;
				drawer.T254_lc2_vertical = true;
				drawer.T254_lc2_borderX = x2;
				drawer.T254_lc2_leftOrAbove = (drawer.T254_sx <= x2);
			} else {
				drawer.T254_lc2_horizontal = false;
				drawer.T254_lc2_vertical = false;
				drawer.T254_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T254_lc2_C = x2 - drawer.T254_lc2_m * y2;
				drawer.T254_lc2_leftOrAbove = (drawer.T254_sx < drawer.T254_lc2_m*drawer.T254_sy + drawer.T254_lc2_C);
			}

			if(y3 == y1) {
				drawer.T254_lc3_horizontal = true;
				drawer.T254_lc3_vertical = false;
				drawer.T254_lc3_borderY = y3;
				drawer.T254_lc3_leftOrAbove = (drawer.T254_sy <= y3);
			} else if(x3 == x1) {
				drawer.T254_lc3_horizontal = false;
				drawer.T254_lc3_vertical = true;
				drawer.T254_lc3_borderX = x3;
				drawer.T254_lc3_leftOrAbove = (drawer.T254_sx <= x3);
			} else {
				drawer.T254_lc3_horizontal = false;
				drawer.T254_lc3_vertical = false;
				drawer.T254_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T254_lc3_C = x3 - drawer.T254_lc3_m * y3;
				drawer.T254_lc3_leftOrAbove = (drawer.T254_sx < drawer.T254_lc3_m*drawer.T254_sy + drawer.T254_lc3_C);
			}

			drawer.T254_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T254_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T254_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T254_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T254_initializedWithValidData = true;
		}

		t = triangles[255]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T255_r = t.r; drawer.T255_g = t.g; drawer.T255_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T255_initializedWithValidData = false;
		} else {

			drawer.T255_sx = (x1 + x2 + x3) / 3.0;
			drawer.T255_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T255_lc1_horizontal = true;
				drawer.T255_lc1_vertical = false;
				drawer.T255_lc1_borderY = y1;
				drawer.T255_lc1_leftOrAbove = (drawer.T255_sy <= y1);
			} else if(x1 == x2) {
				drawer.T255_lc1_horizontal = false;
				drawer.T255_lc1_vertical = true;
				drawer.T255_lc1_borderX = x1;
				drawer.T255_lc1_leftOrAbove = (drawer.T255_sx <= x1);
			} else {
				drawer.T255_lc1_horizontal = false;
				drawer.T255_lc1_vertical = false;
				drawer.T255_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T255_lc1_C = x1 - drawer.T255_lc1_m * y1;
				drawer.T255_lc1_leftOrAbove = (drawer.T255_sx < drawer.T255_lc1_m*drawer.T255_sy + drawer.T255_lc1_C);
			}

			if(y2 == y3) {
				drawer.T255_lc2_horizontal = true;
				drawer.T255_lc2_vertical = false;
				drawer.T255_lc2_borderY = y2;
				drawer.T255_lc2_leftOrAbove = (drawer.T255_sy <= y2);
			} else if(x2 == x3) {
				drawer.T255_lc2_horizontal = false;
				drawer.T255_lc2_vertical = true;
				drawer.T255_lc2_borderX = x2;
				drawer.T255_lc2_leftOrAbove = (drawer.T255_sx <= x2);
			} else {
				drawer.T255_lc2_horizontal = false;
				drawer.T255_lc2_vertical = false;
				drawer.T255_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T255_lc2_C = x2 - drawer.T255_lc2_m * y2;
				drawer.T255_lc2_leftOrAbove = (drawer.T255_sx < drawer.T255_lc2_m*drawer.T255_sy + drawer.T255_lc2_C);
			}

			if(y3 == y1) {
				drawer.T255_lc3_horizontal = true;
				drawer.T255_lc3_vertical = false;
				drawer.T255_lc3_borderY = y3;
				drawer.T255_lc3_leftOrAbove = (drawer.T255_sy <= y3);
			} else if(x3 == x1) {
				drawer.T255_lc3_horizontal = false;
				drawer.T255_lc3_vertical = true;
				drawer.T255_lc3_borderX = x3;
				drawer.T255_lc3_leftOrAbove = (drawer.T255_sx <= x3);
			} else {
				drawer.T255_lc3_horizontal = false;
				drawer.T255_lc3_vertical = false;
				drawer.T255_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T255_lc3_C = x3 - drawer.T255_lc3_m * y3;
				drawer.T255_lc3_leftOrAbove = (drawer.T255_sx < drawer.T255_lc3_m*drawer.T255_sy + drawer.T255_lc3_C);
			}

			drawer.T255_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T255_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T255_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T255_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T255_initializedWithValidData = true;
		}

		t = triangles[256]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T256_r = t.r; drawer.T256_g = t.g; drawer.T256_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T256_initializedWithValidData = false;
		} else {

			drawer.T256_sx = (x1 + x2 + x3) / 3.0;
			drawer.T256_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T256_lc1_horizontal = true;
				drawer.T256_lc1_vertical = false;
				drawer.T256_lc1_borderY = y1;
				drawer.T256_lc1_leftOrAbove = (drawer.T256_sy <= y1);
			} else if(x1 == x2) {
				drawer.T256_lc1_horizontal = false;
				drawer.T256_lc1_vertical = true;
				drawer.T256_lc1_borderX = x1;
				drawer.T256_lc1_leftOrAbove = (drawer.T256_sx <= x1);
			} else {
				drawer.T256_lc1_horizontal = false;
				drawer.T256_lc1_vertical = false;
				drawer.T256_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T256_lc1_C = x1 - drawer.T256_lc1_m * y1;
				drawer.T256_lc1_leftOrAbove = (drawer.T256_sx < drawer.T256_lc1_m*drawer.T256_sy + drawer.T256_lc1_C);
			}

			if(y2 == y3) {
				drawer.T256_lc2_horizontal = true;
				drawer.T256_lc2_vertical = false;
				drawer.T256_lc2_borderY = y2;
				drawer.T256_lc2_leftOrAbove = (drawer.T256_sy <= y2);
			} else if(x2 == x3) {
				drawer.T256_lc2_horizontal = false;
				drawer.T256_lc2_vertical = true;
				drawer.T256_lc2_borderX = x2;
				drawer.T256_lc2_leftOrAbove = (drawer.T256_sx <= x2);
			} else {
				drawer.T256_lc2_horizontal = false;
				drawer.T256_lc2_vertical = false;
				drawer.T256_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T256_lc2_C = x2 - drawer.T256_lc2_m * y2;
				drawer.T256_lc2_leftOrAbove = (drawer.T256_sx < drawer.T256_lc2_m*drawer.T256_sy + drawer.T256_lc2_C);
			}

			if(y3 == y1) {
				drawer.T256_lc3_horizontal = true;
				drawer.T256_lc3_vertical = false;
				drawer.T256_lc3_borderY = y3;
				drawer.T256_lc3_leftOrAbove = (drawer.T256_sy <= y3);
			} else if(x3 == x1) {
				drawer.T256_lc3_horizontal = false;
				drawer.T256_lc3_vertical = true;
				drawer.T256_lc3_borderX = x3;
				drawer.T256_lc3_leftOrAbove = (drawer.T256_sx <= x3);
			} else {
				drawer.T256_lc3_horizontal = false;
				drawer.T256_lc3_vertical = false;
				drawer.T256_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T256_lc3_C = x3 - drawer.T256_lc3_m * y3;
				drawer.T256_lc3_leftOrAbove = (drawer.T256_sx < drawer.T256_lc3_m*drawer.T256_sy + drawer.T256_lc3_C);
			}

			drawer.T256_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T256_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T256_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T256_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T256_initializedWithValidData = true;
		}

		t = triangles[257]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T257_r = t.r; drawer.T257_g = t.g; drawer.T257_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T257_initializedWithValidData = false;
		} else {

			drawer.T257_sx = (x1 + x2 + x3) / 3.0;
			drawer.T257_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T257_lc1_horizontal = true;
				drawer.T257_lc1_vertical = false;
				drawer.T257_lc1_borderY = y1;
				drawer.T257_lc1_leftOrAbove = (drawer.T257_sy <= y1);
			} else if(x1 == x2) {
				drawer.T257_lc1_horizontal = false;
				drawer.T257_lc1_vertical = true;
				drawer.T257_lc1_borderX = x1;
				drawer.T257_lc1_leftOrAbove = (drawer.T257_sx <= x1);
			} else {
				drawer.T257_lc1_horizontal = false;
				drawer.T257_lc1_vertical = false;
				drawer.T257_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T257_lc1_C = x1 - drawer.T257_lc1_m * y1;
				drawer.T257_lc1_leftOrAbove = (drawer.T257_sx < drawer.T257_lc1_m*drawer.T257_sy + drawer.T257_lc1_C);
			}

			if(y2 == y3) {
				drawer.T257_lc2_horizontal = true;
				drawer.T257_lc2_vertical = false;
				drawer.T257_lc2_borderY = y2;
				drawer.T257_lc2_leftOrAbove = (drawer.T257_sy <= y2);
			} else if(x2 == x3) {
				drawer.T257_lc2_horizontal = false;
				drawer.T257_lc2_vertical = true;
				drawer.T257_lc2_borderX = x2;
				drawer.T257_lc2_leftOrAbove = (drawer.T257_sx <= x2);
			} else {
				drawer.T257_lc2_horizontal = false;
				drawer.T257_lc2_vertical = false;
				drawer.T257_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T257_lc2_C = x2 - drawer.T257_lc2_m * y2;
				drawer.T257_lc2_leftOrAbove = (drawer.T257_sx < drawer.T257_lc2_m*drawer.T257_sy + drawer.T257_lc2_C);
			}

			if(y3 == y1) {
				drawer.T257_lc3_horizontal = true;
				drawer.T257_lc3_vertical = false;
				drawer.T257_lc3_borderY = y3;
				drawer.T257_lc3_leftOrAbove = (drawer.T257_sy <= y3);
			} else if(x3 == x1) {
				drawer.T257_lc3_horizontal = false;
				drawer.T257_lc3_vertical = true;
				drawer.T257_lc3_borderX = x3;
				drawer.T257_lc3_leftOrAbove = (drawer.T257_sx <= x3);
			} else {
				drawer.T257_lc3_horizontal = false;
				drawer.T257_lc3_vertical = false;
				drawer.T257_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T257_lc3_C = x3 - drawer.T257_lc3_m * y3;
				drawer.T257_lc3_leftOrAbove = (drawer.T257_sx < drawer.T257_lc3_m*drawer.T257_sy + drawer.T257_lc3_C);
			}

			drawer.T257_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T257_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T257_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T257_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T257_initializedWithValidData = true;
		}

		t = triangles[258]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T258_r = t.r; drawer.T258_g = t.g; drawer.T258_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T258_initializedWithValidData = false;
		} else {

			drawer.T258_sx = (x1 + x2 + x3) / 3.0;
			drawer.T258_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T258_lc1_horizontal = true;
				drawer.T258_lc1_vertical = false;
				drawer.T258_lc1_borderY = y1;
				drawer.T258_lc1_leftOrAbove = (drawer.T258_sy <= y1);
			} else if(x1 == x2) {
				drawer.T258_lc1_horizontal = false;
				drawer.T258_lc1_vertical = true;
				drawer.T258_lc1_borderX = x1;
				drawer.T258_lc1_leftOrAbove = (drawer.T258_sx <= x1);
			} else {
				drawer.T258_lc1_horizontal = false;
				drawer.T258_lc1_vertical = false;
				drawer.T258_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T258_lc1_C = x1 - drawer.T258_lc1_m * y1;
				drawer.T258_lc1_leftOrAbove = (drawer.T258_sx < drawer.T258_lc1_m*drawer.T258_sy + drawer.T258_lc1_C);
			}

			if(y2 == y3) {
				drawer.T258_lc2_horizontal = true;
				drawer.T258_lc2_vertical = false;
				drawer.T258_lc2_borderY = y2;
				drawer.T258_lc2_leftOrAbove = (drawer.T258_sy <= y2);
			} else if(x2 == x3) {
				drawer.T258_lc2_horizontal = false;
				drawer.T258_lc2_vertical = true;
				drawer.T258_lc2_borderX = x2;
				drawer.T258_lc2_leftOrAbove = (drawer.T258_sx <= x2);
			} else {
				drawer.T258_lc2_horizontal = false;
				drawer.T258_lc2_vertical = false;
				drawer.T258_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T258_lc2_C = x2 - drawer.T258_lc2_m * y2;
				drawer.T258_lc2_leftOrAbove = (drawer.T258_sx < drawer.T258_lc2_m*drawer.T258_sy + drawer.T258_lc2_C);
			}

			if(y3 == y1) {
				drawer.T258_lc3_horizontal = true;
				drawer.T258_lc3_vertical = false;
				drawer.T258_lc3_borderY = y3;
				drawer.T258_lc3_leftOrAbove = (drawer.T258_sy <= y3);
			} else if(x3 == x1) {
				drawer.T258_lc3_horizontal = false;
				drawer.T258_lc3_vertical = true;
				drawer.T258_lc3_borderX = x3;
				drawer.T258_lc3_leftOrAbove = (drawer.T258_sx <= x3);
			} else {
				drawer.T258_lc3_horizontal = false;
				drawer.T258_lc3_vertical = false;
				drawer.T258_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T258_lc3_C = x3 - drawer.T258_lc3_m * y3;
				drawer.T258_lc3_leftOrAbove = (drawer.T258_sx < drawer.T258_lc3_m*drawer.T258_sy + drawer.T258_lc3_C);
			}

			drawer.T258_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T258_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T258_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T258_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T258_initializedWithValidData = true;
		}

		t = triangles[259]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T259_r = t.r; drawer.T259_g = t.g; drawer.T259_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T259_initializedWithValidData = false;
		} else {

			drawer.T259_sx = (x1 + x2 + x3) / 3.0;
			drawer.T259_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T259_lc1_horizontal = true;
				drawer.T259_lc1_vertical = false;
				drawer.T259_lc1_borderY = y1;
				drawer.T259_lc1_leftOrAbove = (drawer.T259_sy <= y1);
			} else if(x1 == x2) {
				drawer.T259_lc1_horizontal = false;
				drawer.T259_lc1_vertical = true;
				drawer.T259_lc1_borderX = x1;
				drawer.T259_lc1_leftOrAbove = (drawer.T259_sx <= x1);
			} else {
				drawer.T259_lc1_horizontal = false;
				drawer.T259_lc1_vertical = false;
				drawer.T259_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T259_lc1_C = x1 - drawer.T259_lc1_m * y1;
				drawer.T259_lc1_leftOrAbove = (drawer.T259_sx < drawer.T259_lc1_m*drawer.T259_sy + drawer.T259_lc1_C);
			}

			if(y2 == y3) {
				drawer.T259_lc2_horizontal = true;
				drawer.T259_lc2_vertical = false;
				drawer.T259_lc2_borderY = y2;
				drawer.T259_lc2_leftOrAbove = (drawer.T259_sy <= y2);
			} else if(x2 == x3) {
				drawer.T259_lc2_horizontal = false;
				drawer.T259_lc2_vertical = true;
				drawer.T259_lc2_borderX = x2;
				drawer.T259_lc2_leftOrAbove = (drawer.T259_sx <= x2);
			} else {
				drawer.T259_lc2_horizontal = false;
				drawer.T259_lc2_vertical = false;
				drawer.T259_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T259_lc2_C = x2 - drawer.T259_lc2_m * y2;
				drawer.T259_lc2_leftOrAbove = (drawer.T259_sx < drawer.T259_lc2_m*drawer.T259_sy + drawer.T259_lc2_C);
			}

			if(y3 == y1) {
				drawer.T259_lc3_horizontal = true;
				drawer.T259_lc3_vertical = false;
				drawer.T259_lc3_borderY = y3;
				drawer.T259_lc3_leftOrAbove = (drawer.T259_sy <= y3);
			} else if(x3 == x1) {
				drawer.T259_lc3_horizontal = false;
				drawer.T259_lc3_vertical = true;
				drawer.T259_lc3_borderX = x3;
				drawer.T259_lc3_leftOrAbove = (drawer.T259_sx <= x3);
			} else {
				drawer.T259_lc3_horizontal = false;
				drawer.T259_lc3_vertical = false;
				drawer.T259_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T259_lc3_C = x3 - drawer.T259_lc3_m * y3;
				drawer.T259_lc3_leftOrAbove = (drawer.T259_sx < drawer.T259_lc3_m*drawer.T259_sy + drawer.T259_lc3_C);
			}

			drawer.T259_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T259_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T259_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T259_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T259_initializedWithValidData = true;
		}

		t = triangles[260]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T260_r = t.r; drawer.T260_g = t.g; drawer.T260_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T260_initializedWithValidData = false;
		} else {

			drawer.T260_sx = (x1 + x2 + x3) / 3.0;
			drawer.T260_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T260_lc1_horizontal = true;
				drawer.T260_lc1_vertical = false;
				drawer.T260_lc1_borderY = y1;
				drawer.T260_lc1_leftOrAbove = (drawer.T260_sy <= y1);
			} else if(x1 == x2) {
				drawer.T260_lc1_horizontal = false;
				drawer.T260_lc1_vertical = true;
				drawer.T260_lc1_borderX = x1;
				drawer.T260_lc1_leftOrAbove = (drawer.T260_sx <= x1);
			} else {
				drawer.T260_lc1_horizontal = false;
				drawer.T260_lc1_vertical = false;
				drawer.T260_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T260_lc1_C = x1 - drawer.T260_lc1_m * y1;
				drawer.T260_lc1_leftOrAbove = (drawer.T260_sx < drawer.T260_lc1_m*drawer.T260_sy + drawer.T260_lc1_C);
			}

			if(y2 == y3) {
				drawer.T260_lc2_horizontal = true;
				drawer.T260_lc2_vertical = false;
				drawer.T260_lc2_borderY = y2;
				drawer.T260_lc2_leftOrAbove = (drawer.T260_sy <= y2);
			} else if(x2 == x3) {
				drawer.T260_lc2_horizontal = false;
				drawer.T260_lc2_vertical = true;
				drawer.T260_lc2_borderX = x2;
				drawer.T260_lc2_leftOrAbove = (drawer.T260_sx <= x2);
			} else {
				drawer.T260_lc2_horizontal = false;
				drawer.T260_lc2_vertical = false;
				drawer.T260_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T260_lc2_C = x2 - drawer.T260_lc2_m * y2;
				drawer.T260_lc2_leftOrAbove = (drawer.T260_sx < drawer.T260_lc2_m*drawer.T260_sy + drawer.T260_lc2_C);
			}

			if(y3 == y1) {
				drawer.T260_lc3_horizontal = true;
				drawer.T260_lc3_vertical = false;
				drawer.T260_lc3_borderY = y3;
				drawer.T260_lc3_leftOrAbove = (drawer.T260_sy <= y3);
			} else if(x3 == x1) {
				drawer.T260_lc3_horizontal = false;
				drawer.T260_lc3_vertical = true;
				drawer.T260_lc3_borderX = x3;
				drawer.T260_lc3_leftOrAbove = (drawer.T260_sx <= x3);
			} else {
				drawer.T260_lc3_horizontal = false;
				drawer.T260_lc3_vertical = false;
				drawer.T260_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T260_lc3_C = x3 - drawer.T260_lc3_m * y3;
				drawer.T260_lc3_leftOrAbove = (drawer.T260_sx < drawer.T260_lc3_m*drawer.T260_sy + drawer.T260_lc3_C);
			}

			drawer.T260_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T260_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T260_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T260_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T260_initializedWithValidData = true;
		}

		t = triangles[261]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T261_r = t.r; drawer.T261_g = t.g; drawer.T261_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T261_initializedWithValidData = false;
		} else {

			drawer.T261_sx = (x1 + x2 + x3) / 3.0;
			drawer.T261_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T261_lc1_horizontal = true;
				drawer.T261_lc1_vertical = false;
				drawer.T261_lc1_borderY = y1;
				drawer.T261_lc1_leftOrAbove = (drawer.T261_sy <= y1);
			} else if(x1 == x2) {
				drawer.T261_lc1_horizontal = false;
				drawer.T261_lc1_vertical = true;
				drawer.T261_lc1_borderX = x1;
				drawer.T261_lc1_leftOrAbove = (drawer.T261_sx <= x1);
			} else {
				drawer.T261_lc1_horizontal = false;
				drawer.T261_lc1_vertical = false;
				drawer.T261_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T261_lc1_C = x1 - drawer.T261_lc1_m * y1;
				drawer.T261_lc1_leftOrAbove = (drawer.T261_sx < drawer.T261_lc1_m*drawer.T261_sy + drawer.T261_lc1_C);
			}

			if(y2 == y3) {
				drawer.T261_lc2_horizontal = true;
				drawer.T261_lc2_vertical = false;
				drawer.T261_lc2_borderY = y2;
				drawer.T261_lc2_leftOrAbove = (drawer.T261_sy <= y2);
			} else if(x2 == x3) {
				drawer.T261_lc2_horizontal = false;
				drawer.T261_lc2_vertical = true;
				drawer.T261_lc2_borderX = x2;
				drawer.T261_lc2_leftOrAbove = (drawer.T261_sx <= x2);
			} else {
				drawer.T261_lc2_horizontal = false;
				drawer.T261_lc2_vertical = false;
				drawer.T261_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T261_lc2_C = x2 - drawer.T261_lc2_m * y2;
				drawer.T261_lc2_leftOrAbove = (drawer.T261_sx < drawer.T261_lc2_m*drawer.T261_sy + drawer.T261_lc2_C);
			}

			if(y3 == y1) {
				drawer.T261_lc3_horizontal = true;
				drawer.T261_lc3_vertical = false;
				drawer.T261_lc3_borderY = y3;
				drawer.T261_lc3_leftOrAbove = (drawer.T261_sy <= y3);
			} else if(x3 == x1) {
				drawer.T261_lc3_horizontal = false;
				drawer.T261_lc3_vertical = true;
				drawer.T261_lc3_borderX = x3;
				drawer.T261_lc3_leftOrAbove = (drawer.T261_sx <= x3);
			} else {
				drawer.T261_lc3_horizontal = false;
				drawer.T261_lc3_vertical = false;
				drawer.T261_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T261_lc3_C = x3 - drawer.T261_lc3_m * y3;
				drawer.T261_lc3_leftOrAbove = (drawer.T261_sx < drawer.T261_lc3_m*drawer.T261_sy + drawer.T261_lc3_C);
			}

			drawer.T261_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T261_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T261_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T261_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T261_initializedWithValidData = true;
		}

		t = triangles[262]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T262_r = t.r; drawer.T262_g = t.g; drawer.T262_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T262_initializedWithValidData = false;
		} else {

			drawer.T262_sx = (x1 + x2 + x3) / 3.0;
			drawer.T262_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T262_lc1_horizontal = true;
				drawer.T262_lc1_vertical = false;
				drawer.T262_lc1_borderY = y1;
				drawer.T262_lc1_leftOrAbove = (drawer.T262_sy <= y1);
			} else if(x1 == x2) {
				drawer.T262_lc1_horizontal = false;
				drawer.T262_lc1_vertical = true;
				drawer.T262_lc1_borderX = x1;
				drawer.T262_lc1_leftOrAbove = (drawer.T262_sx <= x1);
			} else {
				drawer.T262_lc1_horizontal = false;
				drawer.T262_lc1_vertical = false;
				drawer.T262_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T262_lc1_C = x1 - drawer.T262_lc1_m * y1;
				drawer.T262_lc1_leftOrAbove = (drawer.T262_sx < drawer.T262_lc1_m*drawer.T262_sy + drawer.T262_lc1_C);
			}

			if(y2 == y3) {
				drawer.T262_lc2_horizontal = true;
				drawer.T262_lc2_vertical = false;
				drawer.T262_lc2_borderY = y2;
				drawer.T262_lc2_leftOrAbove = (drawer.T262_sy <= y2);
			} else if(x2 == x3) {
				drawer.T262_lc2_horizontal = false;
				drawer.T262_lc2_vertical = true;
				drawer.T262_lc2_borderX = x2;
				drawer.T262_lc2_leftOrAbove = (drawer.T262_sx <= x2);
			} else {
				drawer.T262_lc2_horizontal = false;
				drawer.T262_lc2_vertical = false;
				drawer.T262_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T262_lc2_C = x2 - drawer.T262_lc2_m * y2;
				drawer.T262_lc2_leftOrAbove = (drawer.T262_sx < drawer.T262_lc2_m*drawer.T262_sy + drawer.T262_lc2_C);
			}

			if(y3 == y1) {
				drawer.T262_lc3_horizontal = true;
				drawer.T262_lc3_vertical = false;
				drawer.T262_lc3_borderY = y3;
				drawer.T262_lc3_leftOrAbove = (drawer.T262_sy <= y3);
			} else if(x3 == x1) {
				drawer.T262_lc3_horizontal = false;
				drawer.T262_lc3_vertical = true;
				drawer.T262_lc3_borderX = x3;
				drawer.T262_lc3_leftOrAbove = (drawer.T262_sx <= x3);
			} else {
				drawer.T262_lc3_horizontal = false;
				drawer.T262_lc3_vertical = false;
				drawer.T262_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T262_lc3_C = x3 - drawer.T262_lc3_m * y3;
				drawer.T262_lc3_leftOrAbove = (drawer.T262_sx < drawer.T262_lc3_m*drawer.T262_sy + drawer.T262_lc3_C);
			}

			drawer.T262_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T262_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T262_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T262_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T262_initializedWithValidData = true;
		}

		t = triangles[263]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T263_r = t.r; drawer.T263_g = t.g; drawer.T263_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T263_initializedWithValidData = false;
		} else {

			drawer.T263_sx = (x1 + x2 + x3) / 3.0;
			drawer.T263_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T263_lc1_horizontal = true;
				drawer.T263_lc1_vertical = false;
				drawer.T263_lc1_borderY = y1;
				drawer.T263_lc1_leftOrAbove = (drawer.T263_sy <= y1);
			} else if(x1 == x2) {
				drawer.T263_lc1_horizontal = false;
				drawer.T263_lc1_vertical = true;
				drawer.T263_lc1_borderX = x1;
				drawer.T263_lc1_leftOrAbove = (drawer.T263_sx <= x1);
			} else {
				drawer.T263_lc1_horizontal = false;
				drawer.T263_lc1_vertical = false;
				drawer.T263_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T263_lc1_C = x1 - drawer.T263_lc1_m * y1;
				drawer.T263_lc1_leftOrAbove = (drawer.T263_sx < drawer.T263_lc1_m*drawer.T263_sy + drawer.T263_lc1_C);
			}

			if(y2 == y3) {
				drawer.T263_lc2_horizontal = true;
				drawer.T263_lc2_vertical = false;
				drawer.T263_lc2_borderY = y2;
				drawer.T263_lc2_leftOrAbove = (drawer.T263_sy <= y2);
			} else if(x2 == x3) {
				drawer.T263_lc2_horizontal = false;
				drawer.T263_lc2_vertical = true;
				drawer.T263_lc2_borderX = x2;
				drawer.T263_lc2_leftOrAbove = (drawer.T263_sx <= x2);
			} else {
				drawer.T263_lc2_horizontal = false;
				drawer.T263_lc2_vertical = false;
				drawer.T263_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T263_lc2_C = x2 - drawer.T263_lc2_m * y2;
				drawer.T263_lc2_leftOrAbove = (drawer.T263_sx < drawer.T263_lc2_m*drawer.T263_sy + drawer.T263_lc2_C);
			}

			if(y3 == y1) {
				drawer.T263_lc3_horizontal = true;
				drawer.T263_lc3_vertical = false;
				drawer.T263_lc3_borderY = y3;
				drawer.T263_lc3_leftOrAbove = (drawer.T263_sy <= y3);
			} else if(x3 == x1) {
				drawer.T263_lc3_horizontal = false;
				drawer.T263_lc3_vertical = true;
				drawer.T263_lc3_borderX = x3;
				drawer.T263_lc3_leftOrAbove = (drawer.T263_sx <= x3);
			} else {
				drawer.T263_lc3_horizontal = false;
				drawer.T263_lc3_vertical = false;
				drawer.T263_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T263_lc3_C = x3 - drawer.T263_lc3_m * y3;
				drawer.T263_lc3_leftOrAbove = (drawer.T263_sx < drawer.T263_lc3_m*drawer.T263_sy + drawer.T263_lc3_C);
			}

			drawer.T263_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T263_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T263_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T263_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T263_initializedWithValidData = true;
		}

		t = triangles[264]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T264_r = t.r; drawer.T264_g = t.g; drawer.T264_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T264_initializedWithValidData = false;
		} else {

			drawer.T264_sx = (x1 + x2 + x3) / 3.0;
			drawer.T264_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T264_lc1_horizontal = true;
				drawer.T264_lc1_vertical = false;
				drawer.T264_lc1_borderY = y1;
				drawer.T264_lc1_leftOrAbove = (drawer.T264_sy <= y1);
			} else if(x1 == x2) {
				drawer.T264_lc1_horizontal = false;
				drawer.T264_lc1_vertical = true;
				drawer.T264_lc1_borderX = x1;
				drawer.T264_lc1_leftOrAbove = (drawer.T264_sx <= x1);
			} else {
				drawer.T264_lc1_horizontal = false;
				drawer.T264_lc1_vertical = false;
				drawer.T264_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T264_lc1_C = x1 - drawer.T264_lc1_m * y1;
				drawer.T264_lc1_leftOrAbove = (drawer.T264_sx < drawer.T264_lc1_m*drawer.T264_sy + drawer.T264_lc1_C);
			}

			if(y2 == y3) {
				drawer.T264_lc2_horizontal = true;
				drawer.T264_lc2_vertical = false;
				drawer.T264_lc2_borderY = y2;
				drawer.T264_lc2_leftOrAbove = (drawer.T264_sy <= y2);
			} else if(x2 == x3) {
				drawer.T264_lc2_horizontal = false;
				drawer.T264_lc2_vertical = true;
				drawer.T264_lc2_borderX = x2;
				drawer.T264_lc2_leftOrAbove = (drawer.T264_sx <= x2);
			} else {
				drawer.T264_lc2_horizontal = false;
				drawer.T264_lc2_vertical = false;
				drawer.T264_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T264_lc2_C = x2 - drawer.T264_lc2_m * y2;
				drawer.T264_lc2_leftOrAbove = (drawer.T264_sx < drawer.T264_lc2_m*drawer.T264_sy + drawer.T264_lc2_C);
			}

			if(y3 == y1) {
				drawer.T264_lc3_horizontal = true;
				drawer.T264_lc3_vertical = false;
				drawer.T264_lc3_borderY = y3;
				drawer.T264_lc3_leftOrAbove = (drawer.T264_sy <= y3);
			} else if(x3 == x1) {
				drawer.T264_lc3_horizontal = false;
				drawer.T264_lc3_vertical = true;
				drawer.T264_lc3_borderX = x3;
				drawer.T264_lc3_leftOrAbove = (drawer.T264_sx <= x3);
			} else {
				drawer.T264_lc3_horizontal = false;
				drawer.T264_lc3_vertical = false;
				drawer.T264_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T264_lc3_C = x3 - drawer.T264_lc3_m * y3;
				drawer.T264_lc3_leftOrAbove = (drawer.T264_sx < drawer.T264_lc3_m*drawer.T264_sy + drawer.T264_lc3_C);
			}

			drawer.T264_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T264_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T264_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T264_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T264_initializedWithValidData = true;
		}

		t = triangles[265]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T265_r = t.r; drawer.T265_g = t.g; drawer.T265_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T265_initializedWithValidData = false;
		} else {

			drawer.T265_sx = (x1 + x2 + x3) / 3.0;
			drawer.T265_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T265_lc1_horizontal = true;
				drawer.T265_lc1_vertical = false;
				drawer.T265_lc1_borderY = y1;
				drawer.T265_lc1_leftOrAbove = (drawer.T265_sy <= y1);
			} else if(x1 == x2) {
				drawer.T265_lc1_horizontal = false;
				drawer.T265_lc1_vertical = true;
				drawer.T265_lc1_borderX = x1;
				drawer.T265_lc1_leftOrAbove = (drawer.T265_sx <= x1);
			} else {
				drawer.T265_lc1_horizontal = false;
				drawer.T265_lc1_vertical = false;
				drawer.T265_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T265_lc1_C = x1 - drawer.T265_lc1_m * y1;
				drawer.T265_lc1_leftOrAbove = (drawer.T265_sx < drawer.T265_lc1_m*drawer.T265_sy + drawer.T265_lc1_C);
			}

			if(y2 == y3) {
				drawer.T265_lc2_horizontal = true;
				drawer.T265_lc2_vertical = false;
				drawer.T265_lc2_borderY = y2;
				drawer.T265_lc2_leftOrAbove = (drawer.T265_sy <= y2);
			} else if(x2 == x3) {
				drawer.T265_lc2_horizontal = false;
				drawer.T265_lc2_vertical = true;
				drawer.T265_lc2_borderX = x2;
				drawer.T265_lc2_leftOrAbove = (drawer.T265_sx <= x2);
			} else {
				drawer.T265_lc2_horizontal = false;
				drawer.T265_lc2_vertical = false;
				drawer.T265_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T265_lc2_C = x2 - drawer.T265_lc2_m * y2;
				drawer.T265_lc2_leftOrAbove = (drawer.T265_sx < drawer.T265_lc2_m*drawer.T265_sy + drawer.T265_lc2_C);
			}

			if(y3 == y1) {
				drawer.T265_lc3_horizontal = true;
				drawer.T265_lc3_vertical = false;
				drawer.T265_lc3_borderY = y3;
				drawer.T265_lc3_leftOrAbove = (drawer.T265_sy <= y3);
			} else if(x3 == x1) {
				drawer.T265_lc3_horizontal = false;
				drawer.T265_lc3_vertical = true;
				drawer.T265_lc3_borderX = x3;
				drawer.T265_lc3_leftOrAbove = (drawer.T265_sx <= x3);
			} else {
				drawer.T265_lc3_horizontal = false;
				drawer.T265_lc3_vertical = false;
				drawer.T265_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T265_lc3_C = x3 - drawer.T265_lc3_m * y3;
				drawer.T265_lc3_leftOrAbove = (drawer.T265_sx < drawer.T265_lc3_m*drawer.T265_sy + drawer.T265_lc3_C);
			}

			drawer.T265_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T265_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T265_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T265_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T265_initializedWithValidData = true;
		}

		t = triangles[266]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T266_r = t.r; drawer.T266_g = t.g; drawer.T266_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T266_initializedWithValidData = false;
		} else {

			drawer.T266_sx = (x1 + x2 + x3) / 3.0;
			drawer.T266_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T266_lc1_horizontal = true;
				drawer.T266_lc1_vertical = false;
				drawer.T266_lc1_borderY = y1;
				drawer.T266_lc1_leftOrAbove = (drawer.T266_sy <= y1);
			} else if(x1 == x2) {
				drawer.T266_lc1_horizontal = false;
				drawer.T266_lc1_vertical = true;
				drawer.T266_lc1_borderX = x1;
				drawer.T266_lc1_leftOrAbove = (drawer.T266_sx <= x1);
			} else {
				drawer.T266_lc1_horizontal = false;
				drawer.T266_lc1_vertical = false;
				drawer.T266_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T266_lc1_C = x1 - drawer.T266_lc1_m * y1;
				drawer.T266_lc1_leftOrAbove = (drawer.T266_sx < drawer.T266_lc1_m*drawer.T266_sy + drawer.T266_lc1_C);
			}

			if(y2 == y3) {
				drawer.T266_lc2_horizontal = true;
				drawer.T266_lc2_vertical = false;
				drawer.T266_lc2_borderY = y2;
				drawer.T266_lc2_leftOrAbove = (drawer.T266_sy <= y2);
			} else if(x2 == x3) {
				drawer.T266_lc2_horizontal = false;
				drawer.T266_lc2_vertical = true;
				drawer.T266_lc2_borderX = x2;
				drawer.T266_lc2_leftOrAbove = (drawer.T266_sx <= x2);
			} else {
				drawer.T266_lc2_horizontal = false;
				drawer.T266_lc2_vertical = false;
				drawer.T266_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T266_lc2_C = x2 - drawer.T266_lc2_m * y2;
				drawer.T266_lc2_leftOrAbove = (drawer.T266_sx < drawer.T266_lc2_m*drawer.T266_sy + drawer.T266_lc2_C);
			}

			if(y3 == y1) {
				drawer.T266_lc3_horizontal = true;
				drawer.T266_lc3_vertical = false;
				drawer.T266_lc3_borderY = y3;
				drawer.T266_lc3_leftOrAbove = (drawer.T266_sy <= y3);
			} else if(x3 == x1) {
				drawer.T266_lc3_horizontal = false;
				drawer.T266_lc3_vertical = true;
				drawer.T266_lc3_borderX = x3;
				drawer.T266_lc3_leftOrAbove = (drawer.T266_sx <= x3);
			} else {
				drawer.T266_lc3_horizontal = false;
				drawer.T266_lc3_vertical = false;
				drawer.T266_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T266_lc3_C = x3 - drawer.T266_lc3_m * y3;
				drawer.T266_lc3_leftOrAbove = (drawer.T266_sx < drawer.T266_lc3_m*drawer.T266_sy + drawer.T266_lc3_C);
			}

			drawer.T266_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T266_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T266_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T266_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T266_initializedWithValidData = true;
		}

		t = triangles[267]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T267_r = t.r; drawer.T267_g = t.g; drawer.T267_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T267_initializedWithValidData = false;
		} else {

			drawer.T267_sx = (x1 + x2 + x3) / 3.0;
			drawer.T267_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T267_lc1_horizontal = true;
				drawer.T267_lc1_vertical = false;
				drawer.T267_lc1_borderY = y1;
				drawer.T267_lc1_leftOrAbove = (drawer.T267_sy <= y1);
			} else if(x1 == x2) {
				drawer.T267_lc1_horizontal = false;
				drawer.T267_lc1_vertical = true;
				drawer.T267_lc1_borderX = x1;
				drawer.T267_lc1_leftOrAbove = (drawer.T267_sx <= x1);
			} else {
				drawer.T267_lc1_horizontal = false;
				drawer.T267_lc1_vertical = false;
				drawer.T267_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T267_lc1_C = x1 - drawer.T267_lc1_m * y1;
				drawer.T267_lc1_leftOrAbove = (drawer.T267_sx < drawer.T267_lc1_m*drawer.T267_sy + drawer.T267_lc1_C);
			}

			if(y2 == y3) {
				drawer.T267_lc2_horizontal = true;
				drawer.T267_lc2_vertical = false;
				drawer.T267_lc2_borderY = y2;
				drawer.T267_lc2_leftOrAbove = (drawer.T267_sy <= y2);
			} else if(x2 == x3) {
				drawer.T267_lc2_horizontal = false;
				drawer.T267_lc2_vertical = true;
				drawer.T267_lc2_borderX = x2;
				drawer.T267_lc2_leftOrAbove = (drawer.T267_sx <= x2);
			} else {
				drawer.T267_lc2_horizontal = false;
				drawer.T267_lc2_vertical = false;
				drawer.T267_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T267_lc2_C = x2 - drawer.T267_lc2_m * y2;
				drawer.T267_lc2_leftOrAbove = (drawer.T267_sx < drawer.T267_lc2_m*drawer.T267_sy + drawer.T267_lc2_C);
			}

			if(y3 == y1) {
				drawer.T267_lc3_horizontal = true;
				drawer.T267_lc3_vertical = false;
				drawer.T267_lc3_borderY = y3;
				drawer.T267_lc3_leftOrAbove = (drawer.T267_sy <= y3);
			} else if(x3 == x1) {
				drawer.T267_lc3_horizontal = false;
				drawer.T267_lc3_vertical = true;
				drawer.T267_lc3_borderX = x3;
				drawer.T267_lc3_leftOrAbove = (drawer.T267_sx <= x3);
			} else {
				drawer.T267_lc3_horizontal = false;
				drawer.T267_lc3_vertical = false;
				drawer.T267_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T267_lc3_C = x3 - drawer.T267_lc3_m * y3;
				drawer.T267_lc3_leftOrAbove = (drawer.T267_sx < drawer.T267_lc3_m*drawer.T267_sy + drawer.T267_lc3_C);
			}

			drawer.T267_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T267_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T267_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T267_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T267_initializedWithValidData = true;
		}

		t = triangles[268]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T268_r = t.r; drawer.T268_g = t.g; drawer.T268_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T268_initializedWithValidData = false;
		} else {

			drawer.T268_sx = (x1 + x2 + x3) / 3.0;
			drawer.T268_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T268_lc1_horizontal = true;
				drawer.T268_lc1_vertical = false;
				drawer.T268_lc1_borderY = y1;
				drawer.T268_lc1_leftOrAbove = (drawer.T268_sy <= y1);
			} else if(x1 == x2) {
				drawer.T268_lc1_horizontal = false;
				drawer.T268_lc1_vertical = true;
				drawer.T268_lc1_borderX = x1;
				drawer.T268_lc1_leftOrAbove = (drawer.T268_sx <= x1);
			} else {
				drawer.T268_lc1_horizontal = false;
				drawer.T268_lc1_vertical = false;
				drawer.T268_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T268_lc1_C = x1 - drawer.T268_lc1_m * y1;
				drawer.T268_lc1_leftOrAbove = (drawer.T268_sx < drawer.T268_lc1_m*drawer.T268_sy + drawer.T268_lc1_C);
			}

			if(y2 == y3) {
				drawer.T268_lc2_horizontal = true;
				drawer.T268_lc2_vertical = false;
				drawer.T268_lc2_borderY = y2;
				drawer.T268_lc2_leftOrAbove = (drawer.T268_sy <= y2);
			} else if(x2 == x3) {
				drawer.T268_lc2_horizontal = false;
				drawer.T268_lc2_vertical = true;
				drawer.T268_lc2_borderX = x2;
				drawer.T268_lc2_leftOrAbove = (drawer.T268_sx <= x2);
			} else {
				drawer.T268_lc2_horizontal = false;
				drawer.T268_lc2_vertical = false;
				drawer.T268_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T268_lc2_C = x2 - drawer.T268_lc2_m * y2;
				drawer.T268_lc2_leftOrAbove = (drawer.T268_sx < drawer.T268_lc2_m*drawer.T268_sy + drawer.T268_lc2_C);
			}

			if(y3 == y1) {
				drawer.T268_lc3_horizontal = true;
				drawer.T268_lc3_vertical = false;
				drawer.T268_lc3_borderY = y3;
				drawer.T268_lc3_leftOrAbove = (drawer.T268_sy <= y3);
			} else if(x3 == x1) {
				drawer.T268_lc3_horizontal = false;
				drawer.T268_lc3_vertical = true;
				drawer.T268_lc3_borderX = x3;
				drawer.T268_lc3_leftOrAbove = (drawer.T268_sx <= x3);
			} else {
				drawer.T268_lc3_horizontal = false;
				drawer.T268_lc3_vertical = false;
				drawer.T268_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T268_lc3_C = x3 - drawer.T268_lc3_m * y3;
				drawer.T268_lc3_leftOrAbove = (drawer.T268_sx < drawer.T268_lc3_m*drawer.T268_sy + drawer.T268_lc3_C);
			}

			drawer.T268_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T268_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T268_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T268_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T268_initializedWithValidData = true;
		}

		t = triangles[269]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T269_r = t.r; drawer.T269_g = t.g; drawer.T269_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T269_initializedWithValidData = false;
		} else {

			drawer.T269_sx = (x1 + x2 + x3) / 3.0;
			drawer.T269_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T269_lc1_horizontal = true;
				drawer.T269_lc1_vertical = false;
				drawer.T269_lc1_borderY = y1;
				drawer.T269_lc1_leftOrAbove = (drawer.T269_sy <= y1);
			} else if(x1 == x2) {
				drawer.T269_lc1_horizontal = false;
				drawer.T269_lc1_vertical = true;
				drawer.T269_lc1_borderX = x1;
				drawer.T269_lc1_leftOrAbove = (drawer.T269_sx <= x1);
			} else {
				drawer.T269_lc1_horizontal = false;
				drawer.T269_lc1_vertical = false;
				drawer.T269_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T269_lc1_C = x1 - drawer.T269_lc1_m * y1;
				drawer.T269_lc1_leftOrAbove = (drawer.T269_sx < drawer.T269_lc1_m*drawer.T269_sy + drawer.T269_lc1_C);
			}

			if(y2 == y3) {
				drawer.T269_lc2_horizontal = true;
				drawer.T269_lc2_vertical = false;
				drawer.T269_lc2_borderY = y2;
				drawer.T269_lc2_leftOrAbove = (drawer.T269_sy <= y2);
			} else if(x2 == x3) {
				drawer.T269_lc2_horizontal = false;
				drawer.T269_lc2_vertical = true;
				drawer.T269_lc2_borderX = x2;
				drawer.T269_lc2_leftOrAbove = (drawer.T269_sx <= x2);
			} else {
				drawer.T269_lc2_horizontal = false;
				drawer.T269_lc2_vertical = false;
				drawer.T269_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T269_lc2_C = x2 - drawer.T269_lc2_m * y2;
				drawer.T269_lc2_leftOrAbove = (drawer.T269_sx < drawer.T269_lc2_m*drawer.T269_sy + drawer.T269_lc2_C);
			}

			if(y3 == y1) {
				drawer.T269_lc3_horizontal = true;
				drawer.T269_lc3_vertical = false;
				drawer.T269_lc3_borderY = y3;
				drawer.T269_lc3_leftOrAbove = (drawer.T269_sy <= y3);
			} else if(x3 == x1) {
				drawer.T269_lc3_horizontal = false;
				drawer.T269_lc3_vertical = true;
				drawer.T269_lc3_borderX = x3;
				drawer.T269_lc3_leftOrAbove = (drawer.T269_sx <= x3);
			} else {
				drawer.T269_lc3_horizontal = false;
				drawer.T269_lc3_vertical = false;
				drawer.T269_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T269_lc3_C = x3 - drawer.T269_lc3_m * y3;
				drawer.T269_lc3_leftOrAbove = (drawer.T269_sx < drawer.T269_lc3_m*drawer.T269_sy + drawer.T269_lc3_C);
			}

			drawer.T269_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T269_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T269_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T269_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T269_initializedWithValidData = true;
		}
	}

	public void loadTriangles10(SingleTriangle[] triangles) {
		int x1, y1, x2, y2, x3, y3;
		SingleTriangle t;

		t = triangles[270]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T270_r = t.r; drawer.T270_g = t.g; drawer.T270_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T270_initializedWithValidData = false;
		} else {

			drawer.T270_sx = (x1 + x2 + x3) / 3.0;
			drawer.T270_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T270_lc1_horizontal = true;
				drawer.T270_lc1_vertical = false;
				drawer.T270_lc1_borderY = y1;
				drawer.T270_lc1_leftOrAbove = (drawer.T270_sy <= y1);
			} else if(x1 == x2) {
				drawer.T270_lc1_horizontal = false;
				drawer.T270_lc1_vertical = true;
				drawer.T270_lc1_borderX = x1;
				drawer.T270_lc1_leftOrAbove = (drawer.T270_sx <= x1);
			} else {
				drawer.T270_lc1_horizontal = false;
				drawer.T270_lc1_vertical = false;
				drawer.T270_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T270_lc1_C = x1 - drawer.T270_lc1_m * y1;
				drawer.T270_lc1_leftOrAbove = (drawer.T270_sx < drawer.T270_lc1_m*drawer.T270_sy + drawer.T270_lc1_C);
			}

			if(y2 == y3) {
				drawer.T270_lc2_horizontal = true;
				drawer.T270_lc2_vertical = false;
				drawer.T270_lc2_borderY = y2;
				drawer.T270_lc2_leftOrAbove = (drawer.T270_sy <= y2);
			} else if(x2 == x3) {
				drawer.T270_lc2_horizontal = false;
				drawer.T270_lc2_vertical = true;
				drawer.T270_lc2_borderX = x2;
				drawer.T270_lc2_leftOrAbove = (drawer.T270_sx <= x2);
			} else {
				drawer.T270_lc2_horizontal = false;
				drawer.T270_lc2_vertical = false;
				drawer.T270_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T270_lc2_C = x2 - drawer.T270_lc2_m * y2;
				drawer.T270_lc2_leftOrAbove = (drawer.T270_sx < drawer.T270_lc2_m*drawer.T270_sy + drawer.T270_lc2_C);
			}

			if(y3 == y1) {
				drawer.T270_lc3_horizontal = true;
				drawer.T270_lc3_vertical = false;
				drawer.T270_lc3_borderY = y3;
				drawer.T270_lc3_leftOrAbove = (drawer.T270_sy <= y3);
			} else if(x3 == x1) {
				drawer.T270_lc3_horizontal = false;
				drawer.T270_lc3_vertical = true;
				drawer.T270_lc3_borderX = x3;
				drawer.T270_lc3_leftOrAbove = (drawer.T270_sx <= x3);
			} else {
				drawer.T270_lc3_horizontal = false;
				drawer.T270_lc3_vertical = false;
				drawer.T270_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T270_lc3_C = x3 - drawer.T270_lc3_m * y3;
				drawer.T270_lc3_leftOrAbove = (drawer.T270_sx < drawer.T270_lc3_m*drawer.T270_sy + drawer.T270_lc3_C);
			}

			drawer.T270_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T270_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T270_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T270_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T270_initializedWithValidData = true;
		}

		t = triangles[271]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T271_r = t.r; drawer.T271_g = t.g; drawer.T271_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T271_initializedWithValidData = false;
		} else {

			drawer.T271_sx = (x1 + x2 + x3) / 3.0;
			drawer.T271_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T271_lc1_horizontal = true;
				drawer.T271_lc1_vertical = false;
				drawer.T271_lc1_borderY = y1;
				drawer.T271_lc1_leftOrAbove = (drawer.T271_sy <= y1);
			} else if(x1 == x2) {
				drawer.T271_lc1_horizontal = false;
				drawer.T271_lc1_vertical = true;
				drawer.T271_lc1_borderX = x1;
				drawer.T271_lc1_leftOrAbove = (drawer.T271_sx <= x1);
			} else {
				drawer.T271_lc1_horizontal = false;
				drawer.T271_lc1_vertical = false;
				drawer.T271_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T271_lc1_C = x1 - drawer.T271_lc1_m * y1;
				drawer.T271_lc1_leftOrAbove = (drawer.T271_sx < drawer.T271_lc1_m*drawer.T271_sy + drawer.T271_lc1_C);
			}

			if(y2 == y3) {
				drawer.T271_lc2_horizontal = true;
				drawer.T271_lc2_vertical = false;
				drawer.T271_lc2_borderY = y2;
				drawer.T271_lc2_leftOrAbove = (drawer.T271_sy <= y2);
			} else if(x2 == x3) {
				drawer.T271_lc2_horizontal = false;
				drawer.T271_lc2_vertical = true;
				drawer.T271_lc2_borderX = x2;
				drawer.T271_lc2_leftOrAbove = (drawer.T271_sx <= x2);
			} else {
				drawer.T271_lc2_horizontal = false;
				drawer.T271_lc2_vertical = false;
				drawer.T271_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T271_lc2_C = x2 - drawer.T271_lc2_m * y2;
				drawer.T271_lc2_leftOrAbove = (drawer.T271_sx < drawer.T271_lc2_m*drawer.T271_sy + drawer.T271_lc2_C);
			}

			if(y3 == y1) {
				drawer.T271_lc3_horizontal = true;
				drawer.T271_lc3_vertical = false;
				drawer.T271_lc3_borderY = y3;
				drawer.T271_lc3_leftOrAbove = (drawer.T271_sy <= y3);
			} else if(x3 == x1) {
				drawer.T271_lc3_horizontal = false;
				drawer.T271_lc3_vertical = true;
				drawer.T271_lc3_borderX = x3;
				drawer.T271_lc3_leftOrAbove = (drawer.T271_sx <= x3);
			} else {
				drawer.T271_lc3_horizontal = false;
				drawer.T271_lc3_vertical = false;
				drawer.T271_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T271_lc3_C = x3 - drawer.T271_lc3_m * y3;
				drawer.T271_lc3_leftOrAbove = (drawer.T271_sx < drawer.T271_lc3_m*drawer.T271_sy + drawer.T271_lc3_C);
			}

			drawer.T271_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T271_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T271_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T271_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T271_initializedWithValidData = true;
		}

		t = triangles[272]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T272_r = t.r; drawer.T272_g = t.g; drawer.T272_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T272_initializedWithValidData = false;
		} else {

			drawer.T272_sx = (x1 + x2 + x3) / 3.0;
			drawer.T272_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T272_lc1_horizontal = true;
				drawer.T272_lc1_vertical = false;
				drawer.T272_lc1_borderY = y1;
				drawer.T272_lc1_leftOrAbove = (drawer.T272_sy <= y1);
			} else if(x1 == x2) {
				drawer.T272_lc1_horizontal = false;
				drawer.T272_lc1_vertical = true;
				drawer.T272_lc1_borderX = x1;
				drawer.T272_lc1_leftOrAbove = (drawer.T272_sx <= x1);
			} else {
				drawer.T272_lc1_horizontal = false;
				drawer.T272_lc1_vertical = false;
				drawer.T272_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T272_lc1_C = x1 - drawer.T272_lc1_m * y1;
				drawer.T272_lc1_leftOrAbove = (drawer.T272_sx < drawer.T272_lc1_m*drawer.T272_sy + drawer.T272_lc1_C);
			}

			if(y2 == y3) {
				drawer.T272_lc2_horizontal = true;
				drawer.T272_lc2_vertical = false;
				drawer.T272_lc2_borderY = y2;
				drawer.T272_lc2_leftOrAbove = (drawer.T272_sy <= y2);
			} else if(x2 == x3) {
				drawer.T272_lc2_horizontal = false;
				drawer.T272_lc2_vertical = true;
				drawer.T272_lc2_borderX = x2;
				drawer.T272_lc2_leftOrAbove = (drawer.T272_sx <= x2);
			} else {
				drawer.T272_lc2_horizontal = false;
				drawer.T272_lc2_vertical = false;
				drawer.T272_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T272_lc2_C = x2 - drawer.T272_lc2_m * y2;
				drawer.T272_lc2_leftOrAbove = (drawer.T272_sx < drawer.T272_lc2_m*drawer.T272_sy + drawer.T272_lc2_C);
			}

			if(y3 == y1) {
				drawer.T272_lc3_horizontal = true;
				drawer.T272_lc3_vertical = false;
				drawer.T272_lc3_borderY = y3;
				drawer.T272_lc3_leftOrAbove = (drawer.T272_sy <= y3);
			} else if(x3 == x1) {
				drawer.T272_lc3_horizontal = false;
				drawer.T272_lc3_vertical = true;
				drawer.T272_lc3_borderX = x3;
				drawer.T272_lc3_leftOrAbove = (drawer.T272_sx <= x3);
			} else {
				drawer.T272_lc3_horizontal = false;
				drawer.T272_lc3_vertical = false;
				drawer.T272_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T272_lc3_C = x3 - drawer.T272_lc3_m * y3;
				drawer.T272_lc3_leftOrAbove = (drawer.T272_sx < drawer.T272_lc3_m*drawer.T272_sy + drawer.T272_lc3_C);
			}

			drawer.T272_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T272_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T272_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T272_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T272_initializedWithValidData = true;
		}

		t = triangles[273]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T273_r = t.r; drawer.T273_g = t.g; drawer.T273_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T273_initializedWithValidData = false;
		} else {

			drawer.T273_sx = (x1 + x2 + x3) / 3.0;
			drawer.T273_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T273_lc1_horizontal = true;
				drawer.T273_lc1_vertical = false;
				drawer.T273_lc1_borderY = y1;
				drawer.T273_lc1_leftOrAbove = (drawer.T273_sy <= y1);
			} else if(x1 == x2) {
				drawer.T273_lc1_horizontal = false;
				drawer.T273_lc1_vertical = true;
				drawer.T273_lc1_borderX = x1;
				drawer.T273_lc1_leftOrAbove = (drawer.T273_sx <= x1);
			} else {
				drawer.T273_lc1_horizontal = false;
				drawer.T273_lc1_vertical = false;
				drawer.T273_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T273_lc1_C = x1 - drawer.T273_lc1_m * y1;
				drawer.T273_lc1_leftOrAbove = (drawer.T273_sx < drawer.T273_lc1_m*drawer.T273_sy + drawer.T273_lc1_C);
			}

			if(y2 == y3) {
				drawer.T273_lc2_horizontal = true;
				drawer.T273_lc2_vertical = false;
				drawer.T273_lc2_borderY = y2;
				drawer.T273_lc2_leftOrAbove = (drawer.T273_sy <= y2);
			} else if(x2 == x3) {
				drawer.T273_lc2_horizontal = false;
				drawer.T273_lc2_vertical = true;
				drawer.T273_lc2_borderX = x2;
				drawer.T273_lc2_leftOrAbove = (drawer.T273_sx <= x2);
			} else {
				drawer.T273_lc2_horizontal = false;
				drawer.T273_lc2_vertical = false;
				drawer.T273_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T273_lc2_C = x2 - drawer.T273_lc2_m * y2;
				drawer.T273_lc2_leftOrAbove = (drawer.T273_sx < drawer.T273_lc2_m*drawer.T273_sy + drawer.T273_lc2_C);
			}

			if(y3 == y1) {
				drawer.T273_lc3_horizontal = true;
				drawer.T273_lc3_vertical = false;
				drawer.T273_lc3_borderY = y3;
				drawer.T273_lc3_leftOrAbove = (drawer.T273_sy <= y3);
			} else if(x3 == x1) {
				drawer.T273_lc3_horizontal = false;
				drawer.T273_lc3_vertical = true;
				drawer.T273_lc3_borderX = x3;
				drawer.T273_lc3_leftOrAbove = (drawer.T273_sx <= x3);
			} else {
				drawer.T273_lc3_horizontal = false;
				drawer.T273_lc3_vertical = false;
				drawer.T273_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T273_lc3_C = x3 - drawer.T273_lc3_m * y3;
				drawer.T273_lc3_leftOrAbove = (drawer.T273_sx < drawer.T273_lc3_m*drawer.T273_sy + drawer.T273_lc3_C);
			}

			drawer.T273_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T273_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T273_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T273_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T273_initializedWithValidData = true;
		}

		t = triangles[274]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T274_r = t.r; drawer.T274_g = t.g; drawer.T274_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T274_initializedWithValidData = false;
		} else {

			drawer.T274_sx = (x1 + x2 + x3) / 3.0;
			drawer.T274_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T274_lc1_horizontal = true;
				drawer.T274_lc1_vertical = false;
				drawer.T274_lc1_borderY = y1;
				drawer.T274_lc1_leftOrAbove = (drawer.T274_sy <= y1);
			} else if(x1 == x2) {
				drawer.T274_lc1_horizontal = false;
				drawer.T274_lc1_vertical = true;
				drawer.T274_lc1_borderX = x1;
				drawer.T274_lc1_leftOrAbove = (drawer.T274_sx <= x1);
			} else {
				drawer.T274_lc1_horizontal = false;
				drawer.T274_lc1_vertical = false;
				drawer.T274_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T274_lc1_C = x1 - drawer.T274_lc1_m * y1;
				drawer.T274_lc1_leftOrAbove = (drawer.T274_sx < drawer.T274_lc1_m*drawer.T274_sy + drawer.T274_lc1_C);
			}

			if(y2 == y3) {
				drawer.T274_lc2_horizontal = true;
				drawer.T274_lc2_vertical = false;
				drawer.T274_lc2_borderY = y2;
				drawer.T274_lc2_leftOrAbove = (drawer.T274_sy <= y2);
			} else if(x2 == x3) {
				drawer.T274_lc2_horizontal = false;
				drawer.T274_lc2_vertical = true;
				drawer.T274_lc2_borderX = x2;
				drawer.T274_lc2_leftOrAbove = (drawer.T274_sx <= x2);
			} else {
				drawer.T274_lc2_horizontal = false;
				drawer.T274_lc2_vertical = false;
				drawer.T274_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T274_lc2_C = x2 - drawer.T274_lc2_m * y2;
				drawer.T274_lc2_leftOrAbove = (drawer.T274_sx < drawer.T274_lc2_m*drawer.T274_sy + drawer.T274_lc2_C);
			}

			if(y3 == y1) {
				drawer.T274_lc3_horizontal = true;
				drawer.T274_lc3_vertical = false;
				drawer.T274_lc3_borderY = y3;
				drawer.T274_lc3_leftOrAbove = (drawer.T274_sy <= y3);
			} else if(x3 == x1) {
				drawer.T274_lc3_horizontal = false;
				drawer.T274_lc3_vertical = true;
				drawer.T274_lc3_borderX = x3;
				drawer.T274_lc3_leftOrAbove = (drawer.T274_sx <= x3);
			} else {
				drawer.T274_lc3_horizontal = false;
				drawer.T274_lc3_vertical = false;
				drawer.T274_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T274_lc3_C = x3 - drawer.T274_lc3_m * y3;
				drawer.T274_lc3_leftOrAbove = (drawer.T274_sx < drawer.T274_lc3_m*drawer.T274_sy + drawer.T274_lc3_C);
			}

			drawer.T274_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T274_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T274_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T274_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T274_initializedWithValidData = true;
		}

		t = triangles[275]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T275_r = t.r; drawer.T275_g = t.g; drawer.T275_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T275_initializedWithValidData = false;
		} else {

			drawer.T275_sx = (x1 + x2 + x3) / 3.0;
			drawer.T275_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T275_lc1_horizontal = true;
				drawer.T275_lc1_vertical = false;
				drawer.T275_lc1_borderY = y1;
				drawer.T275_lc1_leftOrAbove = (drawer.T275_sy <= y1);
			} else if(x1 == x2) {
				drawer.T275_lc1_horizontal = false;
				drawer.T275_lc1_vertical = true;
				drawer.T275_lc1_borderX = x1;
				drawer.T275_lc1_leftOrAbove = (drawer.T275_sx <= x1);
			} else {
				drawer.T275_lc1_horizontal = false;
				drawer.T275_lc1_vertical = false;
				drawer.T275_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T275_lc1_C = x1 - drawer.T275_lc1_m * y1;
				drawer.T275_lc1_leftOrAbove = (drawer.T275_sx < drawer.T275_lc1_m*drawer.T275_sy + drawer.T275_lc1_C);
			}

			if(y2 == y3) {
				drawer.T275_lc2_horizontal = true;
				drawer.T275_lc2_vertical = false;
				drawer.T275_lc2_borderY = y2;
				drawer.T275_lc2_leftOrAbove = (drawer.T275_sy <= y2);
			} else if(x2 == x3) {
				drawer.T275_lc2_horizontal = false;
				drawer.T275_lc2_vertical = true;
				drawer.T275_lc2_borderX = x2;
				drawer.T275_lc2_leftOrAbove = (drawer.T275_sx <= x2);
			} else {
				drawer.T275_lc2_horizontal = false;
				drawer.T275_lc2_vertical = false;
				drawer.T275_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T275_lc2_C = x2 - drawer.T275_lc2_m * y2;
				drawer.T275_lc2_leftOrAbove = (drawer.T275_sx < drawer.T275_lc2_m*drawer.T275_sy + drawer.T275_lc2_C);
			}

			if(y3 == y1) {
				drawer.T275_lc3_horizontal = true;
				drawer.T275_lc3_vertical = false;
				drawer.T275_lc3_borderY = y3;
				drawer.T275_lc3_leftOrAbove = (drawer.T275_sy <= y3);
			} else if(x3 == x1) {
				drawer.T275_lc3_horizontal = false;
				drawer.T275_lc3_vertical = true;
				drawer.T275_lc3_borderX = x3;
				drawer.T275_lc3_leftOrAbove = (drawer.T275_sx <= x3);
			} else {
				drawer.T275_lc3_horizontal = false;
				drawer.T275_lc3_vertical = false;
				drawer.T275_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T275_lc3_C = x3 - drawer.T275_lc3_m * y3;
				drawer.T275_lc3_leftOrAbove = (drawer.T275_sx < drawer.T275_lc3_m*drawer.T275_sy + drawer.T275_lc3_C);
			}

			drawer.T275_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T275_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T275_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T275_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T275_initializedWithValidData = true;
		}

		t = triangles[276]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T276_r = t.r; drawer.T276_g = t.g; drawer.T276_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T276_initializedWithValidData = false;
		} else {

			drawer.T276_sx = (x1 + x2 + x3) / 3.0;
			drawer.T276_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T276_lc1_horizontal = true;
				drawer.T276_lc1_vertical = false;
				drawer.T276_lc1_borderY = y1;
				drawer.T276_lc1_leftOrAbove = (drawer.T276_sy <= y1);
			} else if(x1 == x2) {
				drawer.T276_lc1_horizontal = false;
				drawer.T276_lc1_vertical = true;
				drawer.T276_lc1_borderX = x1;
				drawer.T276_lc1_leftOrAbove = (drawer.T276_sx <= x1);
			} else {
				drawer.T276_lc1_horizontal = false;
				drawer.T276_lc1_vertical = false;
				drawer.T276_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T276_lc1_C = x1 - drawer.T276_lc1_m * y1;
				drawer.T276_lc1_leftOrAbove = (drawer.T276_sx < drawer.T276_lc1_m*drawer.T276_sy + drawer.T276_lc1_C);
			}

			if(y2 == y3) {
				drawer.T276_lc2_horizontal = true;
				drawer.T276_lc2_vertical = false;
				drawer.T276_lc2_borderY = y2;
				drawer.T276_lc2_leftOrAbove = (drawer.T276_sy <= y2);
			} else if(x2 == x3) {
				drawer.T276_lc2_horizontal = false;
				drawer.T276_lc2_vertical = true;
				drawer.T276_lc2_borderX = x2;
				drawer.T276_lc2_leftOrAbove = (drawer.T276_sx <= x2);
			} else {
				drawer.T276_lc2_horizontal = false;
				drawer.T276_lc2_vertical = false;
				drawer.T276_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T276_lc2_C = x2 - drawer.T276_lc2_m * y2;
				drawer.T276_lc2_leftOrAbove = (drawer.T276_sx < drawer.T276_lc2_m*drawer.T276_sy + drawer.T276_lc2_C);
			}

			if(y3 == y1) {
				drawer.T276_lc3_horizontal = true;
				drawer.T276_lc3_vertical = false;
				drawer.T276_lc3_borderY = y3;
				drawer.T276_lc3_leftOrAbove = (drawer.T276_sy <= y3);
			} else if(x3 == x1) {
				drawer.T276_lc3_horizontal = false;
				drawer.T276_lc3_vertical = true;
				drawer.T276_lc3_borderX = x3;
				drawer.T276_lc3_leftOrAbove = (drawer.T276_sx <= x3);
			} else {
				drawer.T276_lc3_horizontal = false;
				drawer.T276_lc3_vertical = false;
				drawer.T276_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T276_lc3_C = x3 - drawer.T276_lc3_m * y3;
				drawer.T276_lc3_leftOrAbove = (drawer.T276_sx < drawer.T276_lc3_m*drawer.T276_sy + drawer.T276_lc3_C);
			}

			drawer.T276_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T276_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T276_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T276_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T276_initializedWithValidData = true;
		}

		t = triangles[277]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T277_r = t.r; drawer.T277_g = t.g; drawer.T277_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T277_initializedWithValidData = false;
		} else {

			drawer.T277_sx = (x1 + x2 + x3) / 3.0;
			drawer.T277_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T277_lc1_horizontal = true;
				drawer.T277_lc1_vertical = false;
				drawer.T277_lc1_borderY = y1;
				drawer.T277_lc1_leftOrAbove = (drawer.T277_sy <= y1);
			} else if(x1 == x2) {
				drawer.T277_lc1_horizontal = false;
				drawer.T277_lc1_vertical = true;
				drawer.T277_lc1_borderX = x1;
				drawer.T277_lc1_leftOrAbove = (drawer.T277_sx <= x1);
			} else {
				drawer.T277_lc1_horizontal = false;
				drawer.T277_lc1_vertical = false;
				drawer.T277_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T277_lc1_C = x1 - drawer.T277_lc1_m * y1;
				drawer.T277_lc1_leftOrAbove = (drawer.T277_sx < drawer.T277_lc1_m*drawer.T277_sy + drawer.T277_lc1_C);
			}

			if(y2 == y3) {
				drawer.T277_lc2_horizontal = true;
				drawer.T277_lc2_vertical = false;
				drawer.T277_lc2_borderY = y2;
				drawer.T277_lc2_leftOrAbove = (drawer.T277_sy <= y2);
			} else if(x2 == x3) {
				drawer.T277_lc2_horizontal = false;
				drawer.T277_lc2_vertical = true;
				drawer.T277_lc2_borderX = x2;
				drawer.T277_lc2_leftOrAbove = (drawer.T277_sx <= x2);
			} else {
				drawer.T277_lc2_horizontal = false;
				drawer.T277_lc2_vertical = false;
				drawer.T277_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T277_lc2_C = x2 - drawer.T277_lc2_m * y2;
				drawer.T277_lc2_leftOrAbove = (drawer.T277_sx < drawer.T277_lc2_m*drawer.T277_sy + drawer.T277_lc2_C);
			}

			if(y3 == y1) {
				drawer.T277_lc3_horizontal = true;
				drawer.T277_lc3_vertical = false;
				drawer.T277_lc3_borderY = y3;
				drawer.T277_lc3_leftOrAbove = (drawer.T277_sy <= y3);
			} else if(x3 == x1) {
				drawer.T277_lc3_horizontal = false;
				drawer.T277_lc3_vertical = true;
				drawer.T277_lc3_borderX = x3;
				drawer.T277_lc3_leftOrAbove = (drawer.T277_sx <= x3);
			} else {
				drawer.T277_lc3_horizontal = false;
				drawer.T277_lc3_vertical = false;
				drawer.T277_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T277_lc3_C = x3 - drawer.T277_lc3_m * y3;
				drawer.T277_lc3_leftOrAbove = (drawer.T277_sx < drawer.T277_lc3_m*drawer.T277_sy + drawer.T277_lc3_C);
			}

			drawer.T277_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T277_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T277_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T277_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T277_initializedWithValidData = true;
		}

		t = triangles[278]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T278_r = t.r; drawer.T278_g = t.g; drawer.T278_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T278_initializedWithValidData = false;
		} else {

			drawer.T278_sx = (x1 + x2 + x3) / 3.0;
			drawer.T278_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T278_lc1_horizontal = true;
				drawer.T278_lc1_vertical = false;
				drawer.T278_lc1_borderY = y1;
				drawer.T278_lc1_leftOrAbove = (drawer.T278_sy <= y1);
			} else if(x1 == x2) {
				drawer.T278_lc1_horizontal = false;
				drawer.T278_lc1_vertical = true;
				drawer.T278_lc1_borderX = x1;
				drawer.T278_lc1_leftOrAbove = (drawer.T278_sx <= x1);
			} else {
				drawer.T278_lc1_horizontal = false;
				drawer.T278_lc1_vertical = false;
				drawer.T278_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T278_lc1_C = x1 - drawer.T278_lc1_m * y1;
				drawer.T278_lc1_leftOrAbove = (drawer.T278_sx < drawer.T278_lc1_m*drawer.T278_sy + drawer.T278_lc1_C);
			}

			if(y2 == y3) {
				drawer.T278_lc2_horizontal = true;
				drawer.T278_lc2_vertical = false;
				drawer.T278_lc2_borderY = y2;
				drawer.T278_lc2_leftOrAbove = (drawer.T278_sy <= y2);
			} else if(x2 == x3) {
				drawer.T278_lc2_horizontal = false;
				drawer.T278_lc2_vertical = true;
				drawer.T278_lc2_borderX = x2;
				drawer.T278_lc2_leftOrAbove = (drawer.T278_sx <= x2);
			} else {
				drawer.T278_lc2_horizontal = false;
				drawer.T278_lc2_vertical = false;
				drawer.T278_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T278_lc2_C = x2 - drawer.T278_lc2_m * y2;
				drawer.T278_lc2_leftOrAbove = (drawer.T278_sx < drawer.T278_lc2_m*drawer.T278_sy + drawer.T278_lc2_C);
			}

			if(y3 == y1) {
				drawer.T278_lc3_horizontal = true;
				drawer.T278_lc3_vertical = false;
				drawer.T278_lc3_borderY = y3;
				drawer.T278_lc3_leftOrAbove = (drawer.T278_sy <= y3);
			} else if(x3 == x1) {
				drawer.T278_lc3_horizontal = false;
				drawer.T278_lc3_vertical = true;
				drawer.T278_lc3_borderX = x3;
				drawer.T278_lc3_leftOrAbove = (drawer.T278_sx <= x3);
			} else {
				drawer.T278_lc3_horizontal = false;
				drawer.T278_lc3_vertical = false;
				drawer.T278_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T278_lc3_C = x3 - drawer.T278_lc3_m * y3;
				drawer.T278_lc3_leftOrAbove = (drawer.T278_sx < drawer.T278_lc3_m*drawer.T278_sy + drawer.T278_lc3_C);
			}

			drawer.T278_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T278_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T278_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T278_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T278_initializedWithValidData = true;
		}

		t = triangles[279]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T279_r = t.r; drawer.T279_g = t.g; drawer.T279_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T279_initializedWithValidData = false;
		} else {

			drawer.T279_sx = (x1 + x2 + x3) / 3.0;
			drawer.T279_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T279_lc1_horizontal = true;
				drawer.T279_lc1_vertical = false;
				drawer.T279_lc1_borderY = y1;
				drawer.T279_lc1_leftOrAbove = (drawer.T279_sy <= y1);
			} else if(x1 == x2) {
				drawer.T279_lc1_horizontal = false;
				drawer.T279_lc1_vertical = true;
				drawer.T279_lc1_borderX = x1;
				drawer.T279_lc1_leftOrAbove = (drawer.T279_sx <= x1);
			} else {
				drawer.T279_lc1_horizontal = false;
				drawer.T279_lc1_vertical = false;
				drawer.T279_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T279_lc1_C = x1 - drawer.T279_lc1_m * y1;
				drawer.T279_lc1_leftOrAbove = (drawer.T279_sx < drawer.T279_lc1_m*drawer.T279_sy + drawer.T279_lc1_C);
			}

			if(y2 == y3) {
				drawer.T279_lc2_horizontal = true;
				drawer.T279_lc2_vertical = false;
				drawer.T279_lc2_borderY = y2;
				drawer.T279_lc2_leftOrAbove = (drawer.T279_sy <= y2);
			} else if(x2 == x3) {
				drawer.T279_lc2_horizontal = false;
				drawer.T279_lc2_vertical = true;
				drawer.T279_lc2_borderX = x2;
				drawer.T279_lc2_leftOrAbove = (drawer.T279_sx <= x2);
			} else {
				drawer.T279_lc2_horizontal = false;
				drawer.T279_lc2_vertical = false;
				drawer.T279_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T279_lc2_C = x2 - drawer.T279_lc2_m * y2;
				drawer.T279_lc2_leftOrAbove = (drawer.T279_sx < drawer.T279_lc2_m*drawer.T279_sy + drawer.T279_lc2_C);
			}

			if(y3 == y1) {
				drawer.T279_lc3_horizontal = true;
				drawer.T279_lc3_vertical = false;
				drawer.T279_lc3_borderY = y3;
				drawer.T279_lc3_leftOrAbove = (drawer.T279_sy <= y3);
			} else if(x3 == x1) {
				drawer.T279_lc3_horizontal = false;
				drawer.T279_lc3_vertical = true;
				drawer.T279_lc3_borderX = x3;
				drawer.T279_lc3_leftOrAbove = (drawer.T279_sx <= x3);
			} else {
				drawer.T279_lc3_horizontal = false;
				drawer.T279_lc3_vertical = false;
				drawer.T279_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T279_lc3_C = x3 - drawer.T279_lc3_m * y3;
				drawer.T279_lc3_leftOrAbove = (drawer.T279_sx < drawer.T279_lc3_m*drawer.T279_sy + drawer.T279_lc3_C);
			}

			drawer.T279_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T279_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T279_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T279_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T279_initializedWithValidData = true;
		}

		t = triangles[280]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T280_r = t.r; drawer.T280_g = t.g; drawer.T280_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T280_initializedWithValidData = false;
		} else {

			drawer.T280_sx = (x1 + x2 + x3) / 3.0;
			drawer.T280_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T280_lc1_horizontal = true;
				drawer.T280_lc1_vertical = false;
				drawer.T280_lc1_borderY = y1;
				drawer.T280_lc1_leftOrAbove = (drawer.T280_sy <= y1);
			} else if(x1 == x2) {
				drawer.T280_lc1_horizontal = false;
				drawer.T280_lc1_vertical = true;
				drawer.T280_lc1_borderX = x1;
				drawer.T280_lc1_leftOrAbove = (drawer.T280_sx <= x1);
			} else {
				drawer.T280_lc1_horizontal = false;
				drawer.T280_lc1_vertical = false;
				drawer.T280_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T280_lc1_C = x1 - drawer.T280_lc1_m * y1;
				drawer.T280_lc1_leftOrAbove = (drawer.T280_sx < drawer.T280_lc1_m*drawer.T280_sy + drawer.T280_lc1_C);
			}

			if(y2 == y3) {
				drawer.T280_lc2_horizontal = true;
				drawer.T280_lc2_vertical = false;
				drawer.T280_lc2_borderY = y2;
				drawer.T280_lc2_leftOrAbove = (drawer.T280_sy <= y2);
			} else if(x2 == x3) {
				drawer.T280_lc2_horizontal = false;
				drawer.T280_lc2_vertical = true;
				drawer.T280_lc2_borderX = x2;
				drawer.T280_lc2_leftOrAbove = (drawer.T280_sx <= x2);
			} else {
				drawer.T280_lc2_horizontal = false;
				drawer.T280_lc2_vertical = false;
				drawer.T280_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T280_lc2_C = x2 - drawer.T280_lc2_m * y2;
				drawer.T280_lc2_leftOrAbove = (drawer.T280_sx < drawer.T280_lc2_m*drawer.T280_sy + drawer.T280_lc2_C);
			}

			if(y3 == y1) {
				drawer.T280_lc3_horizontal = true;
				drawer.T280_lc3_vertical = false;
				drawer.T280_lc3_borderY = y3;
				drawer.T280_lc3_leftOrAbove = (drawer.T280_sy <= y3);
			} else if(x3 == x1) {
				drawer.T280_lc3_horizontal = false;
				drawer.T280_lc3_vertical = true;
				drawer.T280_lc3_borderX = x3;
				drawer.T280_lc3_leftOrAbove = (drawer.T280_sx <= x3);
			} else {
				drawer.T280_lc3_horizontal = false;
				drawer.T280_lc3_vertical = false;
				drawer.T280_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T280_lc3_C = x3 - drawer.T280_lc3_m * y3;
				drawer.T280_lc3_leftOrAbove = (drawer.T280_sx < drawer.T280_lc3_m*drawer.T280_sy + drawer.T280_lc3_C);
			}

			drawer.T280_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T280_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T280_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T280_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T280_initializedWithValidData = true;
		}

		t = triangles[281]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T281_r = t.r; drawer.T281_g = t.g; drawer.T281_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T281_initializedWithValidData = false;
		} else {

			drawer.T281_sx = (x1 + x2 + x3) / 3.0;
			drawer.T281_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T281_lc1_horizontal = true;
				drawer.T281_lc1_vertical = false;
				drawer.T281_lc1_borderY = y1;
				drawer.T281_lc1_leftOrAbove = (drawer.T281_sy <= y1);
			} else if(x1 == x2) {
				drawer.T281_lc1_horizontal = false;
				drawer.T281_lc1_vertical = true;
				drawer.T281_lc1_borderX = x1;
				drawer.T281_lc1_leftOrAbove = (drawer.T281_sx <= x1);
			} else {
				drawer.T281_lc1_horizontal = false;
				drawer.T281_lc1_vertical = false;
				drawer.T281_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T281_lc1_C = x1 - drawer.T281_lc1_m * y1;
				drawer.T281_lc1_leftOrAbove = (drawer.T281_sx < drawer.T281_lc1_m*drawer.T281_sy + drawer.T281_lc1_C);
			}

			if(y2 == y3) {
				drawer.T281_lc2_horizontal = true;
				drawer.T281_lc2_vertical = false;
				drawer.T281_lc2_borderY = y2;
				drawer.T281_lc2_leftOrAbove = (drawer.T281_sy <= y2);
			} else if(x2 == x3) {
				drawer.T281_lc2_horizontal = false;
				drawer.T281_lc2_vertical = true;
				drawer.T281_lc2_borderX = x2;
				drawer.T281_lc2_leftOrAbove = (drawer.T281_sx <= x2);
			} else {
				drawer.T281_lc2_horizontal = false;
				drawer.T281_lc2_vertical = false;
				drawer.T281_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T281_lc2_C = x2 - drawer.T281_lc2_m * y2;
				drawer.T281_lc2_leftOrAbove = (drawer.T281_sx < drawer.T281_lc2_m*drawer.T281_sy + drawer.T281_lc2_C);
			}

			if(y3 == y1) {
				drawer.T281_lc3_horizontal = true;
				drawer.T281_lc3_vertical = false;
				drawer.T281_lc3_borderY = y3;
				drawer.T281_lc3_leftOrAbove = (drawer.T281_sy <= y3);
			} else if(x3 == x1) {
				drawer.T281_lc3_horizontal = false;
				drawer.T281_lc3_vertical = true;
				drawer.T281_lc3_borderX = x3;
				drawer.T281_lc3_leftOrAbove = (drawer.T281_sx <= x3);
			} else {
				drawer.T281_lc3_horizontal = false;
				drawer.T281_lc3_vertical = false;
				drawer.T281_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T281_lc3_C = x3 - drawer.T281_lc3_m * y3;
				drawer.T281_lc3_leftOrAbove = (drawer.T281_sx < drawer.T281_lc3_m*drawer.T281_sy + drawer.T281_lc3_C);
			}

			drawer.T281_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T281_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T281_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T281_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T281_initializedWithValidData = true;
		}

		t = triangles[282]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T282_r = t.r; drawer.T282_g = t.g; drawer.T282_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T282_initializedWithValidData = false;
		} else {

			drawer.T282_sx = (x1 + x2 + x3) / 3.0;
			drawer.T282_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T282_lc1_horizontal = true;
				drawer.T282_lc1_vertical = false;
				drawer.T282_lc1_borderY = y1;
				drawer.T282_lc1_leftOrAbove = (drawer.T282_sy <= y1);
			} else if(x1 == x2) {
				drawer.T282_lc1_horizontal = false;
				drawer.T282_lc1_vertical = true;
				drawer.T282_lc1_borderX = x1;
				drawer.T282_lc1_leftOrAbove = (drawer.T282_sx <= x1);
			} else {
				drawer.T282_lc1_horizontal = false;
				drawer.T282_lc1_vertical = false;
				drawer.T282_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T282_lc1_C = x1 - drawer.T282_lc1_m * y1;
				drawer.T282_lc1_leftOrAbove = (drawer.T282_sx < drawer.T282_lc1_m*drawer.T282_sy + drawer.T282_lc1_C);
			}

			if(y2 == y3) {
				drawer.T282_lc2_horizontal = true;
				drawer.T282_lc2_vertical = false;
				drawer.T282_lc2_borderY = y2;
				drawer.T282_lc2_leftOrAbove = (drawer.T282_sy <= y2);
			} else if(x2 == x3) {
				drawer.T282_lc2_horizontal = false;
				drawer.T282_lc2_vertical = true;
				drawer.T282_lc2_borderX = x2;
				drawer.T282_lc2_leftOrAbove = (drawer.T282_sx <= x2);
			} else {
				drawer.T282_lc2_horizontal = false;
				drawer.T282_lc2_vertical = false;
				drawer.T282_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T282_lc2_C = x2 - drawer.T282_lc2_m * y2;
				drawer.T282_lc2_leftOrAbove = (drawer.T282_sx < drawer.T282_lc2_m*drawer.T282_sy + drawer.T282_lc2_C);
			}

			if(y3 == y1) {
				drawer.T282_lc3_horizontal = true;
				drawer.T282_lc3_vertical = false;
				drawer.T282_lc3_borderY = y3;
				drawer.T282_lc3_leftOrAbove = (drawer.T282_sy <= y3);
			} else if(x3 == x1) {
				drawer.T282_lc3_horizontal = false;
				drawer.T282_lc3_vertical = true;
				drawer.T282_lc3_borderX = x3;
				drawer.T282_lc3_leftOrAbove = (drawer.T282_sx <= x3);
			} else {
				drawer.T282_lc3_horizontal = false;
				drawer.T282_lc3_vertical = false;
				drawer.T282_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T282_lc3_C = x3 - drawer.T282_lc3_m * y3;
				drawer.T282_lc3_leftOrAbove = (drawer.T282_sx < drawer.T282_lc3_m*drawer.T282_sy + drawer.T282_lc3_C);
			}

			drawer.T282_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T282_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T282_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T282_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T282_initializedWithValidData = true;
		}

		t = triangles[283]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T283_r = t.r; drawer.T283_g = t.g; drawer.T283_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T283_initializedWithValidData = false;
		} else {

			drawer.T283_sx = (x1 + x2 + x3) / 3.0;
			drawer.T283_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T283_lc1_horizontal = true;
				drawer.T283_lc1_vertical = false;
				drawer.T283_lc1_borderY = y1;
				drawer.T283_lc1_leftOrAbove = (drawer.T283_sy <= y1);
			} else if(x1 == x2) {
				drawer.T283_lc1_horizontal = false;
				drawer.T283_lc1_vertical = true;
				drawer.T283_lc1_borderX = x1;
				drawer.T283_lc1_leftOrAbove = (drawer.T283_sx <= x1);
			} else {
				drawer.T283_lc1_horizontal = false;
				drawer.T283_lc1_vertical = false;
				drawer.T283_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T283_lc1_C = x1 - drawer.T283_lc1_m * y1;
				drawer.T283_lc1_leftOrAbove = (drawer.T283_sx < drawer.T283_lc1_m*drawer.T283_sy + drawer.T283_lc1_C);
			}

			if(y2 == y3) {
				drawer.T283_lc2_horizontal = true;
				drawer.T283_lc2_vertical = false;
				drawer.T283_lc2_borderY = y2;
				drawer.T283_lc2_leftOrAbove = (drawer.T283_sy <= y2);
			} else if(x2 == x3) {
				drawer.T283_lc2_horizontal = false;
				drawer.T283_lc2_vertical = true;
				drawer.T283_lc2_borderX = x2;
				drawer.T283_lc2_leftOrAbove = (drawer.T283_sx <= x2);
			} else {
				drawer.T283_lc2_horizontal = false;
				drawer.T283_lc2_vertical = false;
				drawer.T283_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T283_lc2_C = x2 - drawer.T283_lc2_m * y2;
				drawer.T283_lc2_leftOrAbove = (drawer.T283_sx < drawer.T283_lc2_m*drawer.T283_sy + drawer.T283_lc2_C);
			}

			if(y3 == y1) {
				drawer.T283_lc3_horizontal = true;
				drawer.T283_lc3_vertical = false;
				drawer.T283_lc3_borderY = y3;
				drawer.T283_lc3_leftOrAbove = (drawer.T283_sy <= y3);
			} else if(x3 == x1) {
				drawer.T283_lc3_horizontal = false;
				drawer.T283_lc3_vertical = true;
				drawer.T283_lc3_borderX = x3;
				drawer.T283_lc3_leftOrAbove = (drawer.T283_sx <= x3);
			} else {
				drawer.T283_lc3_horizontal = false;
				drawer.T283_lc3_vertical = false;
				drawer.T283_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T283_lc3_C = x3 - drawer.T283_lc3_m * y3;
				drawer.T283_lc3_leftOrAbove = (drawer.T283_sx < drawer.T283_lc3_m*drawer.T283_sy + drawer.T283_lc3_C);
			}

			drawer.T283_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T283_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T283_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T283_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T283_initializedWithValidData = true;
		}

		t = triangles[284]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T284_r = t.r; drawer.T284_g = t.g; drawer.T284_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T284_initializedWithValidData = false;
		} else {

			drawer.T284_sx = (x1 + x2 + x3) / 3.0;
			drawer.T284_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T284_lc1_horizontal = true;
				drawer.T284_lc1_vertical = false;
				drawer.T284_lc1_borderY = y1;
				drawer.T284_lc1_leftOrAbove = (drawer.T284_sy <= y1);
			} else if(x1 == x2) {
				drawer.T284_lc1_horizontal = false;
				drawer.T284_lc1_vertical = true;
				drawer.T284_lc1_borderX = x1;
				drawer.T284_lc1_leftOrAbove = (drawer.T284_sx <= x1);
			} else {
				drawer.T284_lc1_horizontal = false;
				drawer.T284_lc1_vertical = false;
				drawer.T284_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T284_lc1_C = x1 - drawer.T284_lc1_m * y1;
				drawer.T284_lc1_leftOrAbove = (drawer.T284_sx < drawer.T284_lc1_m*drawer.T284_sy + drawer.T284_lc1_C);
			}

			if(y2 == y3) {
				drawer.T284_lc2_horizontal = true;
				drawer.T284_lc2_vertical = false;
				drawer.T284_lc2_borderY = y2;
				drawer.T284_lc2_leftOrAbove = (drawer.T284_sy <= y2);
			} else if(x2 == x3) {
				drawer.T284_lc2_horizontal = false;
				drawer.T284_lc2_vertical = true;
				drawer.T284_lc2_borderX = x2;
				drawer.T284_lc2_leftOrAbove = (drawer.T284_sx <= x2);
			} else {
				drawer.T284_lc2_horizontal = false;
				drawer.T284_lc2_vertical = false;
				drawer.T284_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T284_lc2_C = x2 - drawer.T284_lc2_m * y2;
				drawer.T284_lc2_leftOrAbove = (drawer.T284_sx < drawer.T284_lc2_m*drawer.T284_sy + drawer.T284_lc2_C);
			}

			if(y3 == y1) {
				drawer.T284_lc3_horizontal = true;
				drawer.T284_lc3_vertical = false;
				drawer.T284_lc3_borderY = y3;
				drawer.T284_lc3_leftOrAbove = (drawer.T284_sy <= y3);
			} else if(x3 == x1) {
				drawer.T284_lc3_horizontal = false;
				drawer.T284_lc3_vertical = true;
				drawer.T284_lc3_borderX = x3;
				drawer.T284_lc3_leftOrAbove = (drawer.T284_sx <= x3);
			} else {
				drawer.T284_lc3_horizontal = false;
				drawer.T284_lc3_vertical = false;
				drawer.T284_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T284_lc3_C = x3 - drawer.T284_lc3_m * y3;
				drawer.T284_lc3_leftOrAbove = (drawer.T284_sx < drawer.T284_lc3_m*drawer.T284_sy + drawer.T284_lc3_C);
			}

			drawer.T284_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T284_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T284_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T284_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T284_initializedWithValidData = true;
		}

		t = triangles[285]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T285_r = t.r; drawer.T285_g = t.g; drawer.T285_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T285_initializedWithValidData = false;
		} else {

			drawer.T285_sx = (x1 + x2 + x3) / 3.0;
			drawer.T285_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T285_lc1_horizontal = true;
				drawer.T285_lc1_vertical = false;
				drawer.T285_lc1_borderY = y1;
				drawer.T285_lc1_leftOrAbove = (drawer.T285_sy <= y1);
			} else if(x1 == x2) {
				drawer.T285_lc1_horizontal = false;
				drawer.T285_lc1_vertical = true;
				drawer.T285_lc1_borderX = x1;
				drawer.T285_lc1_leftOrAbove = (drawer.T285_sx <= x1);
			} else {
				drawer.T285_lc1_horizontal = false;
				drawer.T285_lc1_vertical = false;
				drawer.T285_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T285_lc1_C = x1 - drawer.T285_lc1_m * y1;
				drawer.T285_lc1_leftOrAbove = (drawer.T285_sx < drawer.T285_lc1_m*drawer.T285_sy + drawer.T285_lc1_C);
			}

			if(y2 == y3) {
				drawer.T285_lc2_horizontal = true;
				drawer.T285_lc2_vertical = false;
				drawer.T285_lc2_borderY = y2;
				drawer.T285_lc2_leftOrAbove = (drawer.T285_sy <= y2);
			} else if(x2 == x3) {
				drawer.T285_lc2_horizontal = false;
				drawer.T285_lc2_vertical = true;
				drawer.T285_lc2_borderX = x2;
				drawer.T285_lc2_leftOrAbove = (drawer.T285_sx <= x2);
			} else {
				drawer.T285_lc2_horizontal = false;
				drawer.T285_lc2_vertical = false;
				drawer.T285_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T285_lc2_C = x2 - drawer.T285_lc2_m * y2;
				drawer.T285_lc2_leftOrAbove = (drawer.T285_sx < drawer.T285_lc2_m*drawer.T285_sy + drawer.T285_lc2_C);
			}

			if(y3 == y1) {
				drawer.T285_lc3_horizontal = true;
				drawer.T285_lc3_vertical = false;
				drawer.T285_lc3_borderY = y3;
				drawer.T285_lc3_leftOrAbove = (drawer.T285_sy <= y3);
			} else if(x3 == x1) {
				drawer.T285_lc3_horizontal = false;
				drawer.T285_lc3_vertical = true;
				drawer.T285_lc3_borderX = x3;
				drawer.T285_lc3_leftOrAbove = (drawer.T285_sx <= x3);
			} else {
				drawer.T285_lc3_horizontal = false;
				drawer.T285_lc3_vertical = false;
				drawer.T285_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T285_lc3_C = x3 - drawer.T285_lc3_m * y3;
				drawer.T285_lc3_leftOrAbove = (drawer.T285_sx < drawer.T285_lc3_m*drawer.T285_sy + drawer.T285_lc3_C);
			}

			drawer.T285_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T285_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T285_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T285_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T285_initializedWithValidData = true;
		}

		t = triangles[286]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T286_r = t.r; drawer.T286_g = t.g; drawer.T286_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T286_initializedWithValidData = false;
		} else {

			drawer.T286_sx = (x1 + x2 + x3) / 3.0;
			drawer.T286_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T286_lc1_horizontal = true;
				drawer.T286_lc1_vertical = false;
				drawer.T286_lc1_borderY = y1;
				drawer.T286_lc1_leftOrAbove = (drawer.T286_sy <= y1);
			} else if(x1 == x2) {
				drawer.T286_lc1_horizontal = false;
				drawer.T286_lc1_vertical = true;
				drawer.T286_lc1_borderX = x1;
				drawer.T286_lc1_leftOrAbove = (drawer.T286_sx <= x1);
			} else {
				drawer.T286_lc1_horizontal = false;
				drawer.T286_lc1_vertical = false;
				drawer.T286_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T286_lc1_C = x1 - drawer.T286_lc1_m * y1;
				drawer.T286_lc1_leftOrAbove = (drawer.T286_sx < drawer.T286_lc1_m*drawer.T286_sy + drawer.T286_lc1_C);
			}

			if(y2 == y3) {
				drawer.T286_lc2_horizontal = true;
				drawer.T286_lc2_vertical = false;
				drawer.T286_lc2_borderY = y2;
				drawer.T286_lc2_leftOrAbove = (drawer.T286_sy <= y2);
			} else if(x2 == x3) {
				drawer.T286_lc2_horizontal = false;
				drawer.T286_lc2_vertical = true;
				drawer.T286_lc2_borderX = x2;
				drawer.T286_lc2_leftOrAbove = (drawer.T286_sx <= x2);
			} else {
				drawer.T286_lc2_horizontal = false;
				drawer.T286_lc2_vertical = false;
				drawer.T286_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T286_lc2_C = x2 - drawer.T286_lc2_m * y2;
				drawer.T286_lc2_leftOrAbove = (drawer.T286_sx < drawer.T286_lc2_m*drawer.T286_sy + drawer.T286_lc2_C);
			}

			if(y3 == y1) {
				drawer.T286_lc3_horizontal = true;
				drawer.T286_lc3_vertical = false;
				drawer.T286_lc3_borderY = y3;
				drawer.T286_lc3_leftOrAbove = (drawer.T286_sy <= y3);
			} else if(x3 == x1) {
				drawer.T286_lc3_horizontal = false;
				drawer.T286_lc3_vertical = true;
				drawer.T286_lc3_borderX = x3;
				drawer.T286_lc3_leftOrAbove = (drawer.T286_sx <= x3);
			} else {
				drawer.T286_lc3_horizontal = false;
				drawer.T286_lc3_vertical = false;
				drawer.T286_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T286_lc3_C = x3 - drawer.T286_lc3_m * y3;
				drawer.T286_lc3_leftOrAbove = (drawer.T286_sx < drawer.T286_lc3_m*drawer.T286_sy + drawer.T286_lc3_C);
			}

			drawer.T286_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T286_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T286_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T286_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T286_initializedWithValidData = true;
		}

		t = triangles[287]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T287_r = t.r; drawer.T287_g = t.g; drawer.T287_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T287_initializedWithValidData = false;
		} else {

			drawer.T287_sx = (x1 + x2 + x3) / 3.0;
			drawer.T287_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T287_lc1_horizontal = true;
				drawer.T287_lc1_vertical = false;
				drawer.T287_lc1_borderY = y1;
				drawer.T287_lc1_leftOrAbove = (drawer.T287_sy <= y1);
			} else if(x1 == x2) {
				drawer.T287_lc1_horizontal = false;
				drawer.T287_lc1_vertical = true;
				drawer.T287_lc1_borderX = x1;
				drawer.T287_lc1_leftOrAbove = (drawer.T287_sx <= x1);
			} else {
				drawer.T287_lc1_horizontal = false;
				drawer.T287_lc1_vertical = false;
				drawer.T287_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T287_lc1_C = x1 - drawer.T287_lc1_m * y1;
				drawer.T287_lc1_leftOrAbove = (drawer.T287_sx < drawer.T287_lc1_m*drawer.T287_sy + drawer.T287_lc1_C);
			}

			if(y2 == y3) {
				drawer.T287_lc2_horizontal = true;
				drawer.T287_lc2_vertical = false;
				drawer.T287_lc2_borderY = y2;
				drawer.T287_lc2_leftOrAbove = (drawer.T287_sy <= y2);
			} else if(x2 == x3) {
				drawer.T287_lc2_horizontal = false;
				drawer.T287_lc2_vertical = true;
				drawer.T287_lc2_borderX = x2;
				drawer.T287_lc2_leftOrAbove = (drawer.T287_sx <= x2);
			} else {
				drawer.T287_lc2_horizontal = false;
				drawer.T287_lc2_vertical = false;
				drawer.T287_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T287_lc2_C = x2 - drawer.T287_lc2_m * y2;
				drawer.T287_lc2_leftOrAbove = (drawer.T287_sx < drawer.T287_lc2_m*drawer.T287_sy + drawer.T287_lc2_C);
			}

			if(y3 == y1) {
				drawer.T287_lc3_horizontal = true;
				drawer.T287_lc3_vertical = false;
				drawer.T287_lc3_borderY = y3;
				drawer.T287_lc3_leftOrAbove = (drawer.T287_sy <= y3);
			} else if(x3 == x1) {
				drawer.T287_lc3_horizontal = false;
				drawer.T287_lc3_vertical = true;
				drawer.T287_lc3_borderX = x3;
				drawer.T287_lc3_leftOrAbove = (drawer.T287_sx <= x3);
			} else {
				drawer.T287_lc3_horizontal = false;
				drawer.T287_lc3_vertical = false;
				drawer.T287_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T287_lc3_C = x3 - drawer.T287_lc3_m * y3;
				drawer.T287_lc3_leftOrAbove = (drawer.T287_sx < drawer.T287_lc3_m*drawer.T287_sy + drawer.T287_lc3_C);
			}

			drawer.T287_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T287_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T287_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T287_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T287_initializedWithValidData = true;
		}

		t = triangles[288]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T288_r = t.r; drawer.T288_g = t.g; drawer.T288_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T288_initializedWithValidData = false;
		} else {

			drawer.T288_sx = (x1 + x2 + x3) / 3.0;
			drawer.T288_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T288_lc1_horizontal = true;
				drawer.T288_lc1_vertical = false;
				drawer.T288_lc1_borderY = y1;
				drawer.T288_lc1_leftOrAbove = (drawer.T288_sy <= y1);
			} else if(x1 == x2) {
				drawer.T288_lc1_horizontal = false;
				drawer.T288_lc1_vertical = true;
				drawer.T288_lc1_borderX = x1;
				drawer.T288_lc1_leftOrAbove = (drawer.T288_sx <= x1);
			} else {
				drawer.T288_lc1_horizontal = false;
				drawer.T288_lc1_vertical = false;
				drawer.T288_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T288_lc1_C = x1 - drawer.T288_lc1_m * y1;
				drawer.T288_lc1_leftOrAbove = (drawer.T288_sx < drawer.T288_lc1_m*drawer.T288_sy + drawer.T288_lc1_C);
			}

			if(y2 == y3) {
				drawer.T288_lc2_horizontal = true;
				drawer.T288_lc2_vertical = false;
				drawer.T288_lc2_borderY = y2;
				drawer.T288_lc2_leftOrAbove = (drawer.T288_sy <= y2);
			} else if(x2 == x3) {
				drawer.T288_lc2_horizontal = false;
				drawer.T288_lc2_vertical = true;
				drawer.T288_lc2_borderX = x2;
				drawer.T288_lc2_leftOrAbove = (drawer.T288_sx <= x2);
			} else {
				drawer.T288_lc2_horizontal = false;
				drawer.T288_lc2_vertical = false;
				drawer.T288_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T288_lc2_C = x2 - drawer.T288_lc2_m * y2;
				drawer.T288_lc2_leftOrAbove = (drawer.T288_sx < drawer.T288_lc2_m*drawer.T288_sy + drawer.T288_lc2_C);
			}

			if(y3 == y1) {
				drawer.T288_lc3_horizontal = true;
				drawer.T288_lc3_vertical = false;
				drawer.T288_lc3_borderY = y3;
				drawer.T288_lc3_leftOrAbove = (drawer.T288_sy <= y3);
			} else if(x3 == x1) {
				drawer.T288_lc3_horizontal = false;
				drawer.T288_lc3_vertical = true;
				drawer.T288_lc3_borderX = x3;
				drawer.T288_lc3_leftOrAbove = (drawer.T288_sx <= x3);
			} else {
				drawer.T288_lc3_horizontal = false;
				drawer.T288_lc3_vertical = false;
				drawer.T288_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T288_lc3_C = x3 - drawer.T288_lc3_m * y3;
				drawer.T288_lc3_leftOrAbove = (drawer.T288_sx < drawer.T288_lc3_m*drawer.T288_sy + drawer.T288_lc3_C);
			}

			drawer.T288_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T288_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T288_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T288_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T288_initializedWithValidData = true;
		}

		t = triangles[289]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T289_r = t.r; drawer.T289_g = t.g; drawer.T289_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T289_initializedWithValidData = false;
		} else {

			drawer.T289_sx = (x1 + x2 + x3) / 3.0;
			drawer.T289_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T289_lc1_horizontal = true;
				drawer.T289_lc1_vertical = false;
				drawer.T289_lc1_borderY = y1;
				drawer.T289_lc1_leftOrAbove = (drawer.T289_sy <= y1);
			} else if(x1 == x2) {
				drawer.T289_lc1_horizontal = false;
				drawer.T289_lc1_vertical = true;
				drawer.T289_lc1_borderX = x1;
				drawer.T289_lc1_leftOrAbove = (drawer.T289_sx <= x1);
			} else {
				drawer.T289_lc1_horizontal = false;
				drawer.T289_lc1_vertical = false;
				drawer.T289_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T289_lc1_C = x1 - drawer.T289_lc1_m * y1;
				drawer.T289_lc1_leftOrAbove = (drawer.T289_sx < drawer.T289_lc1_m*drawer.T289_sy + drawer.T289_lc1_C);
			}

			if(y2 == y3) {
				drawer.T289_lc2_horizontal = true;
				drawer.T289_lc2_vertical = false;
				drawer.T289_lc2_borderY = y2;
				drawer.T289_lc2_leftOrAbove = (drawer.T289_sy <= y2);
			} else if(x2 == x3) {
				drawer.T289_lc2_horizontal = false;
				drawer.T289_lc2_vertical = true;
				drawer.T289_lc2_borderX = x2;
				drawer.T289_lc2_leftOrAbove = (drawer.T289_sx <= x2);
			} else {
				drawer.T289_lc2_horizontal = false;
				drawer.T289_lc2_vertical = false;
				drawer.T289_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T289_lc2_C = x2 - drawer.T289_lc2_m * y2;
				drawer.T289_lc2_leftOrAbove = (drawer.T289_sx < drawer.T289_lc2_m*drawer.T289_sy + drawer.T289_lc2_C);
			}

			if(y3 == y1) {
				drawer.T289_lc3_horizontal = true;
				drawer.T289_lc3_vertical = false;
				drawer.T289_lc3_borderY = y3;
				drawer.T289_lc3_leftOrAbove = (drawer.T289_sy <= y3);
			} else if(x3 == x1) {
				drawer.T289_lc3_horizontal = false;
				drawer.T289_lc3_vertical = true;
				drawer.T289_lc3_borderX = x3;
				drawer.T289_lc3_leftOrAbove = (drawer.T289_sx <= x3);
			} else {
				drawer.T289_lc3_horizontal = false;
				drawer.T289_lc3_vertical = false;
				drawer.T289_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T289_lc3_C = x3 - drawer.T289_lc3_m * y3;
				drawer.T289_lc3_leftOrAbove = (drawer.T289_sx < drawer.T289_lc3_m*drawer.T289_sy + drawer.T289_lc3_C);
			}

			drawer.T289_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T289_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T289_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T289_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T289_initializedWithValidData = true;
		}

		t = triangles[290]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T290_r = t.r; drawer.T290_g = t.g; drawer.T290_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T290_initializedWithValidData = false;
		} else {

			drawer.T290_sx = (x1 + x2 + x3) / 3.0;
			drawer.T290_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T290_lc1_horizontal = true;
				drawer.T290_lc1_vertical = false;
				drawer.T290_lc1_borderY = y1;
				drawer.T290_lc1_leftOrAbove = (drawer.T290_sy <= y1);
			} else if(x1 == x2) {
				drawer.T290_lc1_horizontal = false;
				drawer.T290_lc1_vertical = true;
				drawer.T290_lc1_borderX = x1;
				drawer.T290_lc1_leftOrAbove = (drawer.T290_sx <= x1);
			} else {
				drawer.T290_lc1_horizontal = false;
				drawer.T290_lc1_vertical = false;
				drawer.T290_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T290_lc1_C = x1 - drawer.T290_lc1_m * y1;
				drawer.T290_lc1_leftOrAbove = (drawer.T290_sx < drawer.T290_lc1_m*drawer.T290_sy + drawer.T290_lc1_C);
			}

			if(y2 == y3) {
				drawer.T290_lc2_horizontal = true;
				drawer.T290_lc2_vertical = false;
				drawer.T290_lc2_borderY = y2;
				drawer.T290_lc2_leftOrAbove = (drawer.T290_sy <= y2);
			} else if(x2 == x3) {
				drawer.T290_lc2_horizontal = false;
				drawer.T290_lc2_vertical = true;
				drawer.T290_lc2_borderX = x2;
				drawer.T290_lc2_leftOrAbove = (drawer.T290_sx <= x2);
			} else {
				drawer.T290_lc2_horizontal = false;
				drawer.T290_lc2_vertical = false;
				drawer.T290_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T290_lc2_C = x2 - drawer.T290_lc2_m * y2;
				drawer.T290_lc2_leftOrAbove = (drawer.T290_sx < drawer.T290_lc2_m*drawer.T290_sy + drawer.T290_lc2_C);
			}

			if(y3 == y1) {
				drawer.T290_lc3_horizontal = true;
				drawer.T290_lc3_vertical = false;
				drawer.T290_lc3_borderY = y3;
				drawer.T290_lc3_leftOrAbove = (drawer.T290_sy <= y3);
			} else if(x3 == x1) {
				drawer.T290_lc3_horizontal = false;
				drawer.T290_lc3_vertical = true;
				drawer.T290_lc3_borderX = x3;
				drawer.T290_lc3_leftOrAbove = (drawer.T290_sx <= x3);
			} else {
				drawer.T290_lc3_horizontal = false;
				drawer.T290_lc3_vertical = false;
				drawer.T290_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T290_lc3_C = x3 - drawer.T290_lc3_m * y3;
				drawer.T290_lc3_leftOrAbove = (drawer.T290_sx < drawer.T290_lc3_m*drawer.T290_sy + drawer.T290_lc3_C);
			}

			drawer.T290_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T290_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T290_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T290_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T290_initializedWithValidData = true;
		}

		t = triangles[291]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T291_r = t.r; drawer.T291_g = t.g; drawer.T291_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T291_initializedWithValidData = false;
		} else {

			drawer.T291_sx = (x1 + x2 + x3) / 3.0;
			drawer.T291_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T291_lc1_horizontal = true;
				drawer.T291_lc1_vertical = false;
				drawer.T291_lc1_borderY = y1;
				drawer.T291_lc1_leftOrAbove = (drawer.T291_sy <= y1);
			} else if(x1 == x2) {
				drawer.T291_lc1_horizontal = false;
				drawer.T291_lc1_vertical = true;
				drawer.T291_lc1_borderX = x1;
				drawer.T291_lc1_leftOrAbove = (drawer.T291_sx <= x1);
			} else {
				drawer.T291_lc1_horizontal = false;
				drawer.T291_lc1_vertical = false;
				drawer.T291_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T291_lc1_C = x1 - drawer.T291_lc1_m * y1;
				drawer.T291_lc1_leftOrAbove = (drawer.T291_sx < drawer.T291_lc1_m*drawer.T291_sy + drawer.T291_lc1_C);
			}

			if(y2 == y3) {
				drawer.T291_lc2_horizontal = true;
				drawer.T291_lc2_vertical = false;
				drawer.T291_lc2_borderY = y2;
				drawer.T291_lc2_leftOrAbove = (drawer.T291_sy <= y2);
			} else if(x2 == x3) {
				drawer.T291_lc2_horizontal = false;
				drawer.T291_lc2_vertical = true;
				drawer.T291_lc2_borderX = x2;
				drawer.T291_lc2_leftOrAbove = (drawer.T291_sx <= x2);
			} else {
				drawer.T291_lc2_horizontal = false;
				drawer.T291_lc2_vertical = false;
				drawer.T291_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T291_lc2_C = x2 - drawer.T291_lc2_m * y2;
				drawer.T291_lc2_leftOrAbove = (drawer.T291_sx < drawer.T291_lc2_m*drawer.T291_sy + drawer.T291_lc2_C);
			}

			if(y3 == y1) {
				drawer.T291_lc3_horizontal = true;
				drawer.T291_lc3_vertical = false;
				drawer.T291_lc3_borderY = y3;
				drawer.T291_lc3_leftOrAbove = (drawer.T291_sy <= y3);
			} else if(x3 == x1) {
				drawer.T291_lc3_horizontal = false;
				drawer.T291_lc3_vertical = true;
				drawer.T291_lc3_borderX = x3;
				drawer.T291_lc3_leftOrAbove = (drawer.T291_sx <= x3);
			} else {
				drawer.T291_lc3_horizontal = false;
				drawer.T291_lc3_vertical = false;
				drawer.T291_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T291_lc3_C = x3 - drawer.T291_lc3_m * y3;
				drawer.T291_lc3_leftOrAbove = (drawer.T291_sx < drawer.T291_lc3_m*drawer.T291_sy + drawer.T291_lc3_C);
			}

			drawer.T291_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T291_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T291_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T291_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T291_initializedWithValidData = true;
		}

		t = triangles[292]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T292_r = t.r; drawer.T292_g = t.g; drawer.T292_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T292_initializedWithValidData = false;
		} else {

			drawer.T292_sx = (x1 + x2 + x3) / 3.0;
			drawer.T292_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T292_lc1_horizontal = true;
				drawer.T292_lc1_vertical = false;
				drawer.T292_lc1_borderY = y1;
				drawer.T292_lc1_leftOrAbove = (drawer.T292_sy <= y1);
			} else if(x1 == x2) {
				drawer.T292_lc1_horizontal = false;
				drawer.T292_lc1_vertical = true;
				drawer.T292_lc1_borderX = x1;
				drawer.T292_lc1_leftOrAbove = (drawer.T292_sx <= x1);
			} else {
				drawer.T292_lc1_horizontal = false;
				drawer.T292_lc1_vertical = false;
				drawer.T292_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T292_lc1_C = x1 - drawer.T292_lc1_m * y1;
				drawer.T292_lc1_leftOrAbove = (drawer.T292_sx < drawer.T292_lc1_m*drawer.T292_sy + drawer.T292_lc1_C);
			}

			if(y2 == y3) {
				drawer.T292_lc2_horizontal = true;
				drawer.T292_lc2_vertical = false;
				drawer.T292_lc2_borderY = y2;
				drawer.T292_lc2_leftOrAbove = (drawer.T292_sy <= y2);
			} else if(x2 == x3) {
				drawer.T292_lc2_horizontal = false;
				drawer.T292_lc2_vertical = true;
				drawer.T292_lc2_borderX = x2;
				drawer.T292_lc2_leftOrAbove = (drawer.T292_sx <= x2);
			} else {
				drawer.T292_lc2_horizontal = false;
				drawer.T292_lc2_vertical = false;
				drawer.T292_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T292_lc2_C = x2 - drawer.T292_lc2_m * y2;
				drawer.T292_lc2_leftOrAbove = (drawer.T292_sx < drawer.T292_lc2_m*drawer.T292_sy + drawer.T292_lc2_C);
			}

			if(y3 == y1) {
				drawer.T292_lc3_horizontal = true;
				drawer.T292_lc3_vertical = false;
				drawer.T292_lc3_borderY = y3;
				drawer.T292_lc3_leftOrAbove = (drawer.T292_sy <= y3);
			} else if(x3 == x1) {
				drawer.T292_lc3_horizontal = false;
				drawer.T292_lc3_vertical = true;
				drawer.T292_lc3_borderX = x3;
				drawer.T292_lc3_leftOrAbove = (drawer.T292_sx <= x3);
			} else {
				drawer.T292_lc3_horizontal = false;
				drawer.T292_lc3_vertical = false;
				drawer.T292_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T292_lc3_C = x3 - drawer.T292_lc3_m * y3;
				drawer.T292_lc3_leftOrAbove = (drawer.T292_sx < drawer.T292_lc3_m*drawer.T292_sy + drawer.T292_lc3_C);
			}

			drawer.T292_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T292_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T292_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T292_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T292_initializedWithValidData = true;
		}

		t = triangles[293]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T293_r = t.r; drawer.T293_g = t.g; drawer.T293_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T293_initializedWithValidData = false;
		} else {

			drawer.T293_sx = (x1 + x2 + x3) / 3.0;
			drawer.T293_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T293_lc1_horizontal = true;
				drawer.T293_lc1_vertical = false;
				drawer.T293_lc1_borderY = y1;
				drawer.T293_lc1_leftOrAbove = (drawer.T293_sy <= y1);
			} else if(x1 == x2) {
				drawer.T293_lc1_horizontal = false;
				drawer.T293_lc1_vertical = true;
				drawer.T293_lc1_borderX = x1;
				drawer.T293_lc1_leftOrAbove = (drawer.T293_sx <= x1);
			} else {
				drawer.T293_lc1_horizontal = false;
				drawer.T293_lc1_vertical = false;
				drawer.T293_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T293_lc1_C = x1 - drawer.T293_lc1_m * y1;
				drawer.T293_lc1_leftOrAbove = (drawer.T293_sx < drawer.T293_lc1_m*drawer.T293_sy + drawer.T293_lc1_C);
			}

			if(y2 == y3) {
				drawer.T293_lc2_horizontal = true;
				drawer.T293_lc2_vertical = false;
				drawer.T293_lc2_borderY = y2;
				drawer.T293_lc2_leftOrAbove = (drawer.T293_sy <= y2);
			} else if(x2 == x3) {
				drawer.T293_lc2_horizontal = false;
				drawer.T293_lc2_vertical = true;
				drawer.T293_lc2_borderX = x2;
				drawer.T293_lc2_leftOrAbove = (drawer.T293_sx <= x2);
			} else {
				drawer.T293_lc2_horizontal = false;
				drawer.T293_lc2_vertical = false;
				drawer.T293_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T293_lc2_C = x2 - drawer.T293_lc2_m * y2;
				drawer.T293_lc2_leftOrAbove = (drawer.T293_sx < drawer.T293_lc2_m*drawer.T293_sy + drawer.T293_lc2_C);
			}

			if(y3 == y1) {
				drawer.T293_lc3_horizontal = true;
				drawer.T293_lc3_vertical = false;
				drawer.T293_lc3_borderY = y3;
				drawer.T293_lc3_leftOrAbove = (drawer.T293_sy <= y3);
			} else if(x3 == x1) {
				drawer.T293_lc3_horizontal = false;
				drawer.T293_lc3_vertical = true;
				drawer.T293_lc3_borderX = x3;
				drawer.T293_lc3_leftOrAbove = (drawer.T293_sx <= x3);
			} else {
				drawer.T293_lc3_horizontal = false;
				drawer.T293_lc3_vertical = false;
				drawer.T293_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T293_lc3_C = x3 - drawer.T293_lc3_m * y3;
				drawer.T293_lc3_leftOrAbove = (drawer.T293_sx < drawer.T293_lc3_m*drawer.T293_sy + drawer.T293_lc3_C);
			}

			drawer.T293_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T293_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T293_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T293_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T293_initializedWithValidData = true;
		}

		t = triangles[294]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T294_r = t.r; drawer.T294_g = t.g; drawer.T294_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T294_initializedWithValidData = false;
		} else {

			drawer.T294_sx = (x1 + x2 + x3) / 3.0;
			drawer.T294_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T294_lc1_horizontal = true;
				drawer.T294_lc1_vertical = false;
				drawer.T294_lc1_borderY = y1;
				drawer.T294_lc1_leftOrAbove = (drawer.T294_sy <= y1);
			} else if(x1 == x2) {
				drawer.T294_lc1_horizontal = false;
				drawer.T294_lc1_vertical = true;
				drawer.T294_lc1_borderX = x1;
				drawer.T294_lc1_leftOrAbove = (drawer.T294_sx <= x1);
			} else {
				drawer.T294_lc1_horizontal = false;
				drawer.T294_lc1_vertical = false;
				drawer.T294_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T294_lc1_C = x1 - drawer.T294_lc1_m * y1;
				drawer.T294_lc1_leftOrAbove = (drawer.T294_sx < drawer.T294_lc1_m*drawer.T294_sy + drawer.T294_lc1_C);
			}

			if(y2 == y3) {
				drawer.T294_lc2_horizontal = true;
				drawer.T294_lc2_vertical = false;
				drawer.T294_lc2_borderY = y2;
				drawer.T294_lc2_leftOrAbove = (drawer.T294_sy <= y2);
			} else if(x2 == x3) {
				drawer.T294_lc2_horizontal = false;
				drawer.T294_lc2_vertical = true;
				drawer.T294_lc2_borderX = x2;
				drawer.T294_lc2_leftOrAbove = (drawer.T294_sx <= x2);
			} else {
				drawer.T294_lc2_horizontal = false;
				drawer.T294_lc2_vertical = false;
				drawer.T294_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T294_lc2_C = x2 - drawer.T294_lc2_m * y2;
				drawer.T294_lc2_leftOrAbove = (drawer.T294_sx < drawer.T294_lc2_m*drawer.T294_sy + drawer.T294_lc2_C);
			}

			if(y3 == y1) {
				drawer.T294_lc3_horizontal = true;
				drawer.T294_lc3_vertical = false;
				drawer.T294_lc3_borderY = y3;
				drawer.T294_lc3_leftOrAbove = (drawer.T294_sy <= y3);
			} else if(x3 == x1) {
				drawer.T294_lc3_horizontal = false;
				drawer.T294_lc3_vertical = true;
				drawer.T294_lc3_borderX = x3;
				drawer.T294_lc3_leftOrAbove = (drawer.T294_sx <= x3);
			} else {
				drawer.T294_lc3_horizontal = false;
				drawer.T294_lc3_vertical = false;
				drawer.T294_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T294_lc3_C = x3 - drawer.T294_lc3_m * y3;
				drawer.T294_lc3_leftOrAbove = (drawer.T294_sx < drawer.T294_lc3_m*drawer.T294_sy + drawer.T294_lc3_C);
			}

			drawer.T294_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T294_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T294_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T294_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T294_initializedWithValidData = true;
		}

		t = triangles[295]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T295_r = t.r; drawer.T295_g = t.g; drawer.T295_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T295_initializedWithValidData = false;
		} else {

			drawer.T295_sx = (x1 + x2 + x3) / 3.0;
			drawer.T295_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T295_lc1_horizontal = true;
				drawer.T295_lc1_vertical = false;
				drawer.T295_lc1_borderY = y1;
				drawer.T295_lc1_leftOrAbove = (drawer.T295_sy <= y1);
			} else if(x1 == x2) {
				drawer.T295_lc1_horizontal = false;
				drawer.T295_lc1_vertical = true;
				drawer.T295_lc1_borderX = x1;
				drawer.T295_lc1_leftOrAbove = (drawer.T295_sx <= x1);
			} else {
				drawer.T295_lc1_horizontal = false;
				drawer.T295_lc1_vertical = false;
				drawer.T295_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T295_lc1_C = x1 - drawer.T295_lc1_m * y1;
				drawer.T295_lc1_leftOrAbove = (drawer.T295_sx < drawer.T295_lc1_m*drawer.T295_sy + drawer.T295_lc1_C);
			}

			if(y2 == y3) {
				drawer.T295_lc2_horizontal = true;
				drawer.T295_lc2_vertical = false;
				drawer.T295_lc2_borderY = y2;
				drawer.T295_lc2_leftOrAbove = (drawer.T295_sy <= y2);
			} else if(x2 == x3) {
				drawer.T295_lc2_horizontal = false;
				drawer.T295_lc2_vertical = true;
				drawer.T295_lc2_borderX = x2;
				drawer.T295_lc2_leftOrAbove = (drawer.T295_sx <= x2);
			} else {
				drawer.T295_lc2_horizontal = false;
				drawer.T295_lc2_vertical = false;
				drawer.T295_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T295_lc2_C = x2 - drawer.T295_lc2_m * y2;
				drawer.T295_lc2_leftOrAbove = (drawer.T295_sx < drawer.T295_lc2_m*drawer.T295_sy + drawer.T295_lc2_C);
			}

			if(y3 == y1) {
				drawer.T295_lc3_horizontal = true;
				drawer.T295_lc3_vertical = false;
				drawer.T295_lc3_borderY = y3;
				drawer.T295_lc3_leftOrAbove = (drawer.T295_sy <= y3);
			} else if(x3 == x1) {
				drawer.T295_lc3_horizontal = false;
				drawer.T295_lc3_vertical = true;
				drawer.T295_lc3_borderX = x3;
				drawer.T295_lc3_leftOrAbove = (drawer.T295_sx <= x3);
			} else {
				drawer.T295_lc3_horizontal = false;
				drawer.T295_lc3_vertical = false;
				drawer.T295_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T295_lc3_C = x3 - drawer.T295_lc3_m * y3;
				drawer.T295_lc3_leftOrAbove = (drawer.T295_sx < drawer.T295_lc3_m*drawer.T295_sy + drawer.T295_lc3_C);
			}

			drawer.T295_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T295_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T295_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T295_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T295_initializedWithValidData = true;
		}

		t = triangles[296]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T296_r = t.r; drawer.T296_g = t.g; drawer.T296_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T296_initializedWithValidData = false;
		} else {

			drawer.T296_sx = (x1 + x2 + x3) / 3.0;
			drawer.T296_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T296_lc1_horizontal = true;
				drawer.T296_lc1_vertical = false;
				drawer.T296_lc1_borderY = y1;
				drawer.T296_lc1_leftOrAbove = (drawer.T296_sy <= y1);
			} else if(x1 == x2) {
				drawer.T296_lc1_horizontal = false;
				drawer.T296_lc1_vertical = true;
				drawer.T296_lc1_borderX = x1;
				drawer.T296_lc1_leftOrAbove = (drawer.T296_sx <= x1);
			} else {
				drawer.T296_lc1_horizontal = false;
				drawer.T296_lc1_vertical = false;
				drawer.T296_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T296_lc1_C = x1 - drawer.T296_lc1_m * y1;
				drawer.T296_lc1_leftOrAbove = (drawer.T296_sx < drawer.T296_lc1_m*drawer.T296_sy + drawer.T296_lc1_C);
			}

			if(y2 == y3) {
				drawer.T296_lc2_horizontal = true;
				drawer.T296_lc2_vertical = false;
				drawer.T296_lc2_borderY = y2;
				drawer.T296_lc2_leftOrAbove = (drawer.T296_sy <= y2);
			} else if(x2 == x3) {
				drawer.T296_lc2_horizontal = false;
				drawer.T296_lc2_vertical = true;
				drawer.T296_lc2_borderX = x2;
				drawer.T296_lc2_leftOrAbove = (drawer.T296_sx <= x2);
			} else {
				drawer.T296_lc2_horizontal = false;
				drawer.T296_lc2_vertical = false;
				drawer.T296_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T296_lc2_C = x2 - drawer.T296_lc2_m * y2;
				drawer.T296_lc2_leftOrAbove = (drawer.T296_sx < drawer.T296_lc2_m*drawer.T296_sy + drawer.T296_lc2_C);
			}

			if(y3 == y1) {
				drawer.T296_lc3_horizontal = true;
				drawer.T296_lc3_vertical = false;
				drawer.T296_lc3_borderY = y3;
				drawer.T296_lc3_leftOrAbove = (drawer.T296_sy <= y3);
			} else if(x3 == x1) {
				drawer.T296_lc3_horizontal = false;
				drawer.T296_lc3_vertical = true;
				drawer.T296_lc3_borderX = x3;
				drawer.T296_lc3_leftOrAbove = (drawer.T296_sx <= x3);
			} else {
				drawer.T296_lc3_horizontal = false;
				drawer.T296_lc3_vertical = false;
				drawer.T296_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T296_lc3_C = x3 - drawer.T296_lc3_m * y3;
				drawer.T296_lc3_leftOrAbove = (drawer.T296_sx < drawer.T296_lc3_m*drawer.T296_sy + drawer.T296_lc3_C);
			}

			drawer.T296_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T296_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T296_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T296_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T296_initializedWithValidData = true;
		}

		t = triangles[297]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T297_r = t.r; drawer.T297_g = t.g; drawer.T297_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T297_initializedWithValidData = false;
		} else {

			drawer.T297_sx = (x1 + x2 + x3) / 3.0;
			drawer.T297_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T297_lc1_horizontal = true;
				drawer.T297_lc1_vertical = false;
				drawer.T297_lc1_borderY = y1;
				drawer.T297_lc1_leftOrAbove = (drawer.T297_sy <= y1);
			} else if(x1 == x2) {
				drawer.T297_lc1_horizontal = false;
				drawer.T297_lc1_vertical = true;
				drawer.T297_lc1_borderX = x1;
				drawer.T297_lc1_leftOrAbove = (drawer.T297_sx <= x1);
			} else {
				drawer.T297_lc1_horizontal = false;
				drawer.T297_lc1_vertical = false;
				drawer.T297_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T297_lc1_C = x1 - drawer.T297_lc1_m * y1;
				drawer.T297_lc1_leftOrAbove = (drawer.T297_sx < drawer.T297_lc1_m*drawer.T297_sy + drawer.T297_lc1_C);
			}

			if(y2 == y3) {
				drawer.T297_lc2_horizontal = true;
				drawer.T297_lc2_vertical = false;
				drawer.T297_lc2_borderY = y2;
				drawer.T297_lc2_leftOrAbove = (drawer.T297_sy <= y2);
			} else if(x2 == x3) {
				drawer.T297_lc2_horizontal = false;
				drawer.T297_lc2_vertical = true;
				drawer.T297_lc2_borderX = x2;
				drawer.T297_lc2_leftOrAbove = (drawer.T297_sx <= x2);
			} else {
				drawer.T297_lc2_horizontal = false;
				drawer.T297_lc2_vertical = false;
				drawer.T297_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T297_lc2_C = x2 - drawer.T297_lc2_m * y2;
				drawer.T297_lc2_leftOrAbove = (drawer.T297_sx < drawer.T297_lc2_m*drawer.T297_sy + drawer.T297_lc2_C);
			}

			if(y3 == y1) {
				drawer.T297_lc3_horizontal = true;
				drawer.T297_lc3_vertical = false;
				drawer.T297_lc3_borderY = y3;
				drawer.T297_lc3_leftOrAbove = (drawer.T297_sy <= y3);
			} else if(x3 == x1) {
				drawer.T297_lc3_horizontal = false;
				drawer.T297_lc3_vertical = true;
				drawer.T297_lc3_borderX = x3;
				drawer.T297_lc3_leftOrAbove = (drawer.T297_sx <= x3);
			} else {
				drawer.T297_lc3_horizontal = false;
				drawer.T297_lc3_vertical = false;
				drawer.T297_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T297_lc3_C = x3 - drawer.T297_lc3_m * y3;
				drawer.T297_lc3_leftOrAbove = (drawer.T297_sx < drawer.T297_lc3_m*drawer.T297_sy + drawer.T297_lc3_C);
			}

			drawer.T297_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T297_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T297_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T297_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T297_initializedWithValidData = true;
		}

		t = triangles[298]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T298_r = t.r; drawer.T298_g = t.g; drawer.T298_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T298_initializedWithValidData = false;
		} else {

			drawer.T298_sx = (x1 + x2 + x3) / 3.0;
			drawer.T298_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T298_lc1_horizontal = true;
				drawer.T298_lc1_vertical = false;
				drawer.T298_lc1_borderY = y1;
				drawer.T298_lc1_leftOrAbove = (drawer.T298_sy <= y1);
			} else if(x1 == x2) {
				drawer.T298_lc1_horizontal = false;
				drawer.T298_lc1_vertical = true;
				drawer.T298_lc1_borderX = x1;
				drawer.T298_lc1_leftOrAbove = (drawer.T298_sx <= x1);
			} else {
				drawer.T298_lc1_horizontal = false;
				drawer.T298_lc1_vertical = false;
				drawer.T298_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T298_lc1_C = x1 - drawer.T298_lc1_m * y1;
				drawer.T298_lc1_leftOrAbove = (drawer.T298_sx < drawer.T298_lc1_m*drawer.T298_sy + drawer.T298_lc1_C);
			}

			if(y2 == y3) {
				drawer.T298_lc2_horizontal = true;
				drawer.T298_lc2_vertical = false;
				drawer.T298_lc2_borderY = y2;
				drawer.T298_lc2_leftOrAbove = (drawer.T298_sy <= y2);
			} else if(x2 == x3) {
				drawer.T298_lc2_horizontal = false;
				drawer.T298_lc2_vertical = true;
				drawer.T298_lc2_borderX = x2;
				drawer.T298_lc2_leftOrAbove = (drawer.T298_sx <= x2);
			} else {
				drawer.T298_lc2_horizontal = false;
				drawer.T298_lc2_vertical = false;
				drawer.T298_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T298_lc2_C = x2 - drawer.T298_lc2_m * y2;
				drawer.T298_lc2_leftOrAbove = (drawer.T298_sx < drawer.T298_lc2_m*drawer.T298_sy + drawer.T298_lc2_C);
			}

			if(y3 == y1) {
				drawer.T298_lc3_horizontal = true;
				drawer.T298_lc3_vertical = false;
				drawer.T298_lc3_borderY = y3;
				drawer.T298_lc3_leftOrAbove = (drawer.T298_sy <= y3);
			} else if(x3 == x1) {
				drawer.T298_lc3_horizontal = false;
				drawer.T298_lc3_vertical = true;
				drawer.T298_lc3_borderX = x3;
				drawer.T298_lc3_leftOrAbove = (drawer.T298_sx <= x3);
			} else {
				drawer.T298_lc3_horizontal = false;
				drawer.T298_lc3_vertical = false;
				drawer.T298_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T298_lc3_C = x3 - drawer.T298_lc3_m * y3;
				drawer.T298_lc3_leftOrAbove = (drawer.T298_sx < drawer.T298_lc3_m*drawer.T298_sy + drawer.T298_lc3_C);
			}

			drawer.T298_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T298_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T298_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T298_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T298_initializedWithValidData = true;
		}

		t = triangles[299]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T299_r = t.r; drawer.T299_g = t.g; drawer.T299_b = t.b;

		if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {
			drawer.T299_initializedWithValidData = false;
		} else {

			drawer.T299_sx = (x1 + x2 + x3) / 3.0;
			drawer.T299_sy = (y1 + y2 + y3) / 3.0;

			if(y1 == y2) {
				drawer.T299_lc1_horizontal = true;
				drawer.T299_lc1_vertical = false;
				drawer.T299_lc1_borderY = y1;
				drawer.T299_lc1_leftOrAbove = (drawer.T299_sy <= y1);
			} else if(x1 == x2) {
				drawer.T299_lc1_horizontal = false;
				drawer.T299_lc1_vertical = true;
				drawer.T299_lc1_borderX = x1;
				drawer.T299_lc1_leftOrAbove = (drawer.T299_sx <= x1);
			} else {
				drawer.T299_lc1_horizontal = false;
				drawer.T299_lc1_vertical = false;
				drawer.T299_lc1_m = (x2 - x1) / (double)(y2 - y1);
				drawer.T299_lc1_C = x1 - drawer.T299_lc1_m * y1;
				drawer.T299_lc1_leftOrAbove = (drawer.T299_sx < drawer.T299_lc1_m*drawer.T299_sy + drawer.T299_lc1_C);
			}

			if(y2 == y3) {
				drawer.T299_lc2_horizontal = true;
				drawer.T299_lc2_vertical = false;
				drawer.T299_lc2_borderY = y2;
				drawer.T299_lc2_leftOrAbove = (drawer.T299_sy <= y2);
			} else if(x2 == x3) {
				drawer.T299_lc2_horizontal = false;
				drawer.T299_lc2_vertical = true;
				drawer.T299_lc2_borderX = x2;
				drawer.T299_lc2_leftOrAbove = (drawer.T299_sx <= x2);
			} else {
				drawer.T299_lc2_horizontal = false;
				drawer.T299_lc2_vertical = false;
				drawer.T299_lc2_m = (x3 - x2) / (double)(y3 - y2);
				drawer.T299_lc2_C = x2 - drawer.T299_lc2_m * y2;
				drawer.T299_lc2_leftOrAbove = (drawer.T299_sx < drawer.T299_lc2_m*drawer.T299_sy + drawer.T299_lc2_C);
			}

			if(y3 == y1) {
				drawer.T299_lc3_horizontal = true;
				drawer.T299_lc3_vertical = false;
				drawer.T299_lc3_borderY = y3;
				drawer.T299_lc3_leftOrAbove = (drawer.T299_sy <= y3);
			} else if(x3 == x1) {
				drawer.T299_lc3_horizontal = false;
				drawer.T299_lc3_vertical = true;
				drawer.T299_lc3_borderX = x3;
				drawer.T299_lc3_leftOrAbove = (drawer.T299_sx <= x3);
			} else {
				drawer.T299_lc3_horizontal = false;
				drawer.T299_lc3_vertical = false;
				drawer.T299_lc3_m = (x1 - x3) / (double)(y1 - y3);
				drawer.T299_lc3_C = x3 - drawer.T299_lc3_m * y3;
				drawer.T299_lc3_leftOrAbove = (drawer.T299_sx < drawer.T299_lc3_m*drawer.T299_sy + drawer.T299_lc3_C);
			}

			drawer.T299_minx = Math.min(Math.min(x1, x2), x3);
			drawer.T299_miny = Math.min(Math.min(y1, y2), y3);
			drawer.T299_maxx = Math.max(Math.max(x1, x2), x3);
			drawer.T299_maxy = Math.max(Math.max(y1, y2), y3);

			drawer.T299_initializedWithValidData = true;
		}
	}
}
