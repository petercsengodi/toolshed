package hu.csega.image.triangles;

/** not thread-safe */
public class GeneratedTriangleDrawer {

	private GeneratedTriangleLoader loader;

	public GeneratedTriangleDrawer() {
		loader = new GeneratedTriangleLoader();
		loader.drawer = this;
	}

	int offset = 0, r, g, b, x, y;

	boolean T0_initializedWithValidData = false, T0_okay = false;
	double T0_sx, T0_sy, T0_minx, T0_miny, T0_maxx, T0_maxy;
	boolean T0_lc1_horizontal, T0_lc1_vertical, T0_lc1_leftOrAbove, T0_lc1_cached;
	double T0_lc1_m, T0_lc1_C, T0_lc1_borderX, T0_lc1_borderY;
	boolean T0_lc2_horizontal, T0_lc2_vertical, T0_lc2_leftOrAbove, T0_lc2_cached;
	double T0_lc2_m, T0_lc2_C, T0_lc2_borderX, T0_lc2_borderY;
	boolean T0_lc3_horizontal, T0_lc3_vertical, T0_lc3_leftOrAbove, T0_lc3_cached;
	double T0_lc3_m, T0_lc3_C, T0_lc3_borderX, T0_lc3_borderY;
	int T0_r, T0_g, T0_b, T0_lc1_lastY = Integer.MIN_VALUE, T0_lc2_lastY = Integer.MIN_VALUE, T0_lc3_lastY = Integer.MIN_VALUE;

	boolean T1_initializedWithValidData = false, T1_okay = false;
	double T1_sx, T1_sy, T1_minx, T1_miny, T1_maxx, T1_maxy;
	boolean T1_lc1_horizontal, T1_lc1_vertical, T1_lc1_leftOrAbove, T1_lc1_cached;
	double T1_lc1_m, T1_lc1_C, T1_lc1_borderX, T1_lc1_borderY;
	boolean T1_lc2_horizontal, T1_lc2_vertical, T1_lc2_leftOrAbove, T1_lc2_cached;
	double T1_lc2_m, T1_lc2_C, T1_lc2_borderX, T1_lc2_borderY;
	boolean T1_lc3_horizontal, T1_lc3_vertical, T1_lc3_leftOrAbove, T1_lc3_cached;
	double T1_lc3_m, T1_lc3_C, T1_lc3_borderX, T1_lc3_borderY;
	int T1_r, T1_g, T1_b, T1_lc1_lastY = Integer.MIN_VALUE, T1_lc2_lastY = Integer.MIN_VALUE, T1_lc3_lastY = Integer.MIN_VALUE;

	boolean T2_initializedWithValidData = false, T2_okay = false;
	double T2_sx, T2_sy, T2_minx, T2_miny, T2_maxx, T2_maxy;
	boolean T2_lc1_horizontal, T2_lc1_vertical, T2_lc1_leftOrAbove, T2_lc1_cached;
	double T2_lc1_m, T2_lc1_C, T2_lc1_borderX, T2_lc1_borderY;
	boolean T2_lc2_horizontal, T2_lc2_vertical, T2_lc2_leftOrAbove, T2_lc2_cached;
	double T2_lc2_m, T2_lc2_C, T2_lc2_borderX, T2_lc2_borderY;
	boolean T2_lc3_horizontal, T2_lc3_vertical, T2_lc3_leftOrAbove, T2_lc3_cached;
	double T2_lc3_m, T2_lc3_C, T2_lc3_borderX, T2_lc3_borderY;
	int T2_r, T2_g, T2_b, T2_lc1_lastY = Integer.MIN_VALUE, T2_lc2_lastY = Integer.MIN_VALUE, T2_lc3_lastY = Integer.MIN_VALUE;

	boolean T3_initializedWithValidData = false, T3_okay = false;
	double T3_sx, T3_sy, T3_minx, T3_miny, T3_maxx, T3_maxy;
	boolean T3_lc1_horizontal, T3_lc1_vertical, T3_lc1_leftOrAbove, T3_lc1_cached;
	double T3_lc1_m, T3_lc1_C, T3_lc1_borderX, T3_lc1_borderY;
	boolean T3_lc2_horizontal, T3_lc2_vertical, T3_lc2_leftOrAbove, T3_lc2_cached;
	double T3_lc2_m, T3_lc2_C, T3_lc2_borderX, T3_lc2_borderY;
	boolean T3_lc3_horizontal, T3_lc3_vertical, T3_lc3_leftOrAbove, T3_lc3_cached;
	double T3_lc3_m, T3_lc3_C, T3_lc3_borderX, T3_lc3_borderY;
	int T3_r, T3_g, T3_b, T3_lc1_lastY = Integer.MIN_VALUE, T3_lc2_lastY = Integer.MIN_VALUE, T3_lc3_lastY = Integer.MIN_VALUE;

	boolean T4_initializedWithValidData = false, T4_okay = false;
	double T4_sx, T4_sy, T4_minx, T4_miny, T4_maxx, T4_maxy;
	boolean T4_lc1_horizontal, T4_lc1_vertical, T4_lc1_leftOrAbove, T4_lc1_cached;
	double T4_lc1_m, T4_lc1_C, T4_lc1_borderX, T4_lc1_borderY;
	boolean T4_lc2_horizontal, T4_lc2_vertical, T4_lc2_leftOrAbove, T4_lc2_cached;
	double T4_lc2_m, T4_lc2_C, T4_lc2_borderX, T4_lc2_borderY;
	boolean T4_lc3_horizontal, T4_lc3_vertical, T4_lc3_leftOrAbove, T4_lc3_cached;
	double T4_lc3_m, T4_lc3_C, T4_lc3_borderX, T4_lc3_borderY;
	int T4_r, T4_g, T4_b, T4_lc1_lastY = Integer.MIN_VALUE, T4_lc2_lastY = Integer.MIN_VALUE, T4_lc3_lastY = Integer.MIN_VALUE;

	boolean T5_initializedWithValidData = false, T5_okay = false;
	double T5_sx, T5_sy, T5_minx, T5_miny, T5_maxx, T5_maxy;
	boolean T5_lc1_horizontal, T5_lc1_vertical, T5_lc1_leftOrAbove, T5_lc1_cached;
	double T5_lc1_m, T5_lc1_C, T5_lc1_borderX, T5_lc1_borderY;
	boolean T5_lc2_horizontal, T5_lc2_vertical, T5_lc2_leftOrAbove, T5_lc2_cached;
	double T5_lc2_m, T5_lc2_C, T5_lc2_borderX, T5_lc2_borderY;
	boolean T5_lc3_horizontal, T5_lc3_vertical, T5_lc3_leftOrAbove, T5_lc3_cached;
	double T5_lc3_m, T5_lc3_C, T5_lc3_borderX, T5_lc3_borderY;
	int T5_r, T5_g, T5_b, T5_lc1_lastY = Integer.MIN_VALUE, T5_lc2_lastY = Integer.MIN_VALUE, T5_lc3_lastY = Integer.MIN_VALUE;

	boolean T6_initializedWithValidData = false, T6_okay = false;
	double T6_sx, T6_sy, T6_minx, T6_miny, T6_maxx, T6_maxy;
	boolean T6_lc1_horizontal, T6_lc1_vertical, T6_lc1_leftOrAbove, T6_lc1_cached;
	double T6_lc1_m, T6_lc1_C, T6_lc1_borderX, T6_lc1_borderY;
	boolean T6_lc2_horizontal, T6_lc2_vertical, T6_lc2_leftOrAbove, T6_lc2_cached;
	double T6_lc2_m, T6_lc2_C, T6_lc2_borderX, T6_lc2_borderY;
	boolean T6_lc3_horizontal, T6_lc3_vertical, T6_lc3_leftOrAbove, T6_lc3_cached;
	double T6_lc3_m, T6_lc3_C, T6_lc3_borderX, T6_lc3_borderY;
	int T6_r, T6_g, T6_b, T6_lc1_lastY = Integer.MIN_VALUE, T6_lc2_lastY = Integer.MIN_VALUE, T6_lc3_lastY = Integer.MIN_VALUE;

	boolean T7_initializedWithValidData = false, T7_okay = false;
	double T7_sx, T7_sy, T7_minx, T7_miny, T7_maxx, T7_maxy;
	boolean T7_lc1_horizontal, T7_lc1_vertical, T7_lc1_leftOrAbove, T7_lc1_cached;
	double T7_lc1_m, T7_lc1_C, T7_lc1_borderX, T7_lc1_borderY;
	boolean T7_lc2_horizontal, T7_lc2_vertical, T7_lc2_leftOrAbove, T7_lc2_cached;
	double T7_lc2_m, T7_lc2_C, T7_lc2_borderX, T7_lc2_borderY;
	boolean T7_lc3_horizontal, T7_lc3_vertical, T7_lc3_leftOrAbove, T7_lc3_cached;
	double T7_lc3_m, T7_lc3_C, T7_lc3_borderX, T7_lc3_borderY;
	int T7_r, T7_g, T7_b, T7_lc1_lastY = Integer.MIN_VALUE, T7_lc2_lastY = Integer.MIN_VALUE, T7_lc3_lastY = Integer.MIN_VALUE;

	boolean T8_initializedWithValidData = false, T8_okay = false;
	double T8_sx, T8_sy, T8_minx, T8_miny, T8_maxx, T8_maxy;
	boolean T8_lc1_horizontal, T8_lc1_vertical, T8_lc1_leftOrAbove, T8_lc1_cached;
	double T8_lc1_m, T8_lc1_C, T8_lc1_borderX, T8_lc1_borderY;
	boolean T8_lc2_horizontal, T8_lc2_vertical, T8_lc2_leftOrAbove, T8_lc2_cached;
	double T8_lc2_m, T8_lc2_C, T8_lc2_borderX, T8_lc2_borderY;
	boolean T8_lc3_horizontal, T8_lc3_vertical, T8_lc3_leftOrAbove, T8_lc3_cached;
	double T8_lc3_m, T8_lc3_C, T8_lc3_borderX, T8_lc3_borderY;
	int T8_r, T8_g, T8_b, T8_lc1_lastY = Integer.MIN_VALUE, T8_lc2_lastY = Integer.MIN_VALUE, T8_lc3_lastY = Integer.MIN_VALUE;

	boolean T9_initializedWithValidData = false, T9_okay = false;
	double T9_sx, T9_sy, T9_minx, T9_miny, T9_maxx, T9_maxy;
	boolean T9_lc1_horizontal, T9_lc1_vertical, T9_lc1_leftOrAbove, T9_lc1_cached;
	double T9_lc1_m, T9_lc1_C, T9_lc1_borderX, T9_lc1_borderY;
	boolean T9_lc2_horizontal, T9_lc2_vertical, T9_lc2_leftOrAbove, T9_lc2_cached;
	double T9_lc2_m, T9_lc2_C, T9_lc2_borderX, T9_lc2_borderY;
	boolean T9_lc3_horizontal, T9_lc3_vertical, T9_lc3_leftOrAbove, T9_lc3_cached;
	double T9_lc3_m, T9_lc3_C, T9_lc3_borderX, T9_lc3_borderY;
	int T9_r, T9_g, T9_b, T9_lc1_lastY = Integer.MIN_VALUE, T9_lc2_lastY = Integer.MIN_VALUE, T9_lc3_lastY = Integer.MIN_VALUE;

	boolean T10_initializedWithValidData = false, T10_okay = false;
	double T10_sx, T10_sy, T10_minx, T10_miny, T10_maxx, T10_maxy;
	boolean T10_lc1_horizontal, T10_lc1_vertical, T10_lc1_leftOrAbove, T10_lc1_cached;
	double T10_lc1_m, T10_lc1_C, T10_lc1_borderX, T10_lc1_borderY;
	boolean T10_lc2_horizontal, T10_lc2_vertical, T10_lc2_leftOrAbove, T10_lc2_cached;
	double T10_lc2_m, T10_lc2_C, T10_lc2_borderX, T10_lc2_borderY;
	boolean T10_lc3_horizontal, T10_lc3_vertical, T10_lc3_leftOrAbove, T10_lc3_cached;
	double T10_lc3_m, T10_lc3_C, T10_lc3_borderX, T10_lc3_borderY;
	int T10_r, T10_g, T10_b, T10_lc1_lastY = Integer.MIN_VALUE, T10_lc2_lastY = Integer.MIN_VALUE, T10_lc3_lastY = Integer.MIN_VALUE;

	boolean T11_initializedWithValidData = false, T11_okay = false;
	double T11_sx, T11_sy, T11_minx, T11_miny, T11_maxx, T11_maxy;
	boolean T11_lc1_horizontal, T11_lc1_vertical, T11_lc1_leftOrAbove, T11_lc1_cached;
	double T11_lc1_m, T11_lc1_C, T11_lc1_borderX, T11_lc1_borderY;
	boolean T11_lc2_horizontal, T11_lc2_vertical, T11_lc2_leftOrAbove, T11_lc2_cached;
	double T11_lc2_m, T11_lc2_C, T11_lc2_borderX, T11_lc2_borderY;
	boolean T11_lc3_horizontal, T11_lc3_vertical, T11_lc3_leftOrAbove, T11_lc3_cached;
	double T11_lc3_m, T11_lc3_C, T11_lc3_borderX, T11_lc3_borderY;
	int T11_r, T11_g, T11_b, T11_lc1_lastY = Integer.MIN_VALUE, T11_lc2_lastY = Integer.MIN_VALUE, T11_lc3_lastY = Integer.MIN_VALUE;

	boolean T12_initializedWithValidData = false, T12_okay = false;
	double T12_sx, T12_sy, T12_minx, T12_miny, T12_maxx, T12_maxy;
	boolean T12_lc1_horizontal, T12_lc1_vertical, T12_lc1_leftOrAbove, T12_lc1_cached;
	double T12_lc1_m, T12_lc1_C, T12_lc1_borderX, T12_lc1_borderY;
	boolean T12_lc2_horizontal, T12_lc2_vertical, T12_lc2_leftOrAbove, T12_lc2_cached;
	double T12_lc2_m, T12_lc2_C, T12_lc2_borderX, T12_lc2_borderY;
	boolean T12_lc3_horizontal, T12_lc3_vertical, T12_lc3_leftOrAbove, T12_lc3_cached;
	double T12_lc3_m, T12_lc3_C, T12_lc3_borderX, T12_lc3_borderY;
	int T12_r, T12_g, T12_b, T12_lc1_lastY = Integer.MIN_VALUE, T12_lc2_lastY = Integer.MIN_VALUE, T12_lc3_lastY = Integer.MIN_VALUE;

	boolean T13_initializedWithValidData = false, T13_okay = false;
	double T13_sx, T13_sy, T13_minx, T13_miny, T13_maxx, T13_maxy;
	boolean T13_lc1_horizontal, T13_lc1_vertical, T13_lc1_leftOrAbove, T13_lc1_cached;
	double T13_lc1_m, T13_lc1_C, T13_lc1_borderX, T13_lc1_borderY;
	boolean T13_lc2_horizontal, T13_lc2_vertical, T13_lc2_leftOrAbove, T13_lc2_cached;
	double T13_lc2_m, T13_lc2_C, T13_lc2_borderX, T13_lc2_borderY;
	boolean T13_lc3_horizontal, T13_lc3_vertical, T13_lc3_leftOrAbove, T13_lc3_cached;
	double T13_lc3_m, T13_lc3_C, T13_lc3_borderX, T13_lc3_borderY;
	int T13_r, T13_g, T13_b, T13_lc1_lastY = Integer.MIN_VALUE, T13_lc2_lastY = Integer.MIN_VALUE, T13_lc3_lastY = Integer.MIN_VALUE;

	boolean T14_initializedWithValidData = false, T14_okay = false;
	double T14_sx, T14_sy, T14_minx, T14_miny, T14_maxx, T14_maxy;
	boolean T14_lc1_horizontal, T14_lc1_vertical, T14_lc1_leftOrAbove, T14_lc1_cached;
	double T14_lc1_m, T14_lc1_C, T14_lc1_borderX, T14_lc1_borderY;
	boolean T14_lc2_horizontal, T14_lc2_vertical, T14_lc2_leftOrAbove, T14_lc2_cached;
	double T14_lc2_m, T14_lc2_C, T14_lc2_borderX, T14_lc2_borderY;
	boolean T14_lc3_horizontal, T14_lc3_vertical, T14_lc3_leftOrAbove, T14_lc3_cached;
	double T14_lc3_m, T14_lc3_C, T14_lc3_borderX, T14_lc3_borderY;
	int T14_r, T14_g, T14_b, T14_lc1_lastY = Integer.MIN_VALUE, T14_lc2_lastY = Integer.MIN_VALUE, T14_lc3_lastY = Integer.MIN_VALUE;

	boolean T15_initializedWithValidData = false, T15_okay = false;
	double T15_sx, T15_sy, T15_minx, T15_miny, T15_maxx, T15_maxy;
	boolean T15_lc1_horizontal, T15_lc1_vertical, T15_lc1_leftOrAbove, T15_lc1_cached;
	double T15_lc1_m, T15_lc1_C, T15_lc1_borderX, T15_lc1_borderY;
	boolean T15_lc2_horizontal, T15_lc2_vertical, T15_lc2_leftOrAbove, T15_lc2_cached;
	double T15_lc2_m, T15_lc2_C, T15_lc2_borderX, T15_lc2_borderY;
	boolean T15_lc3_horizontal, T15_lc3_vertical, T15_lc3_leftOrAbove, T15_lc3_cached;
	double T15_lc3_m, T15_lc3_C, T15_lc3_borderX, T15_lc3_borderY;
	int T15_r, T15_g, T15_b, T15_lc1_lastY = Integer.MIN_VALUE, T15_lc2_lastY = Integer.MIN_VALUE, T15_lc3_lastY = Integer.MIN_VALUE;

	boolean T16_initializedWithValidData = false, T16_okay = false;
	double T16_sx, T16_sy, T16_minx, T16_miny, T16_maxx, T16_maxy;
	boolean T16_lc1_horizontal, T16_lc1_vertical, T16_lc1_leftOrAbove, T16_lc1_cached;
	double T16_lc1_m, T16_lc1_C, T16_lc1_borderX, T16_lc1_borderY;
	boolean T16_lc2_horizontal, T16_lc2_vertical, T16_lc2_leftOrAbove, T16_lc2_cached;
	double T16_lc2_m, T16_lc2_C, T16_lc2_borderX, T16_lc2_borderY;
	boolean T16_lc3_horizontal, T16_lc3_vertical, T16_lc3_leftOrAbove, T16_lc3_cached;
	double T16_lc3_m, T16_lc3_C, T16_lc3_borderX, T16_lc3_borderY;
	int T16_r, T16_g, T16_b, T16_lc1_lastY = Integer.MIN_VALUE, T16_lc2_lastY = Integer.MIN_VALUE, T16_lc3_lastY = Integer.MIN_VALUE;

	boolean T17_initializedWithValidData = false, T17_okay = false;
	double T17_sx, T17_sy, T17_minx, T17_miny, T17_maxx, T17_maxy;
	boolean T17_lc1_horizontal, T17_lc1_vertical, T17_lc1_leftOrAbove, T17_lc1_cached;
	double T17_lc1_m, T17_lc1_C, T17_lc1_borderX, T17_lc1_borderY;
	boolean T17_lc2_horizontal, T17_lc2_vertical, T17_lc2_leftOrAbove, T17_lc2_cached;
	double T17_lc2_m, T17_lc2_C, T17_lc2_borderX, T17_lc2_borderY;
	boolean T17_lc3_horizontal, T17_lc3_vertical, T17_lc3_leftOrAbove, T17_lc3_cached;
	double T17_lc3_m, T17_lc3_C, T17_lc3_borderX, T17_lc3_borderY;
	int T17_r, T17_g, T17_b, T17_lc1_lastY = Integer.MIN_VALUE, T17_lc2_lastY = Integer.MIN_VALUE, T17_lc3_lastY = Integer.MIN_VALUE;

	boolean T18_initializedWithValidData = false, T18_okay = false;
	double T18_sx, T18_sy, T18_minx, T18_miny, T18_maxx, T18_maxy;
	boolean T18_lc1_horizontal, T18_lc1_vertical, T18_lc1_leftOrAbove, T18_lc1_cached;
	double T18_lc1_m, T18_lc1_C, T18_lc1_borderX, T18_lc1_borderY;
	boolean T18_lc2_horizontal, T18_lc2_vertical, T18_lc2_leftOrAbove, T18_lc2_cached;
	double T18_lc2_m, T18_lc2_C, T18_lc2_borderX, T18_lc2_borderY;
	boolean T18_lc3_horizontal, T18_lc3_vertical, T18_lc3_leftOrAbove, T18_lc3_cached;
	double T18_lc3_m, T18_lc3_C, T18_lc3_borderX, T18_lc3_borderY;
	int T18_r, T18_g, T18_b, T18_lc1_lastY = Integer.MIN_VALUE, T18_lc2_lastY = Integer.MIN_VALUE, T18_lc3_lastY = Integer.MIN_VALUE;

	boolean T19_initializedWithValidData = false, T19_okay = false;
	double T19_sx, T19_sy, T19_minx, T19_miny, T19_maxx, T19_maxy;
	boolean T19_lc1_horizontal, T19_lc1_vertical, T19_lc1_leftOrAbove, T19_lc1_cached;
	double T19_lc1_m, T19_lc1_C, T19_lc1_borderX, T19_lc1_borderY;
	boolean T19_lc2_horizontal, T19_lc2_vertical, T19_lc2_leftOrAbove, T19_lc2_cached;
	double T19_lc2_m, T19_lc2_C, T19_lc2_borderX, T19_lc2_borderY;
	boolean T19_lc3_horizontal, T19_lc3_vertical, T19_lc3_leftOrAbove, T19_lc3_cached;
	double T19_lc3_m, T19_lc3_C, T19_lc3_borderX, T19_lc3_borderY;
	int T19_r, T19_g, T19_b, T19_lc1_lastY = Integer.MIN_VALUE, T19_lc2_lastY = Integer.MIN_VALUE, T19_lc3_lastY = Integer.MIN_VALUE;

	boolean T20_initializedWithValidData = false, T20_okay = false;
	double T20_sx, T20_sy, T20_minx, T20_miny, T20_maxx, T20_maxy;
	boolean T20_lc1_horizontal, T20_lc1_vertical, T20_lc1_leftOrAbove, T20_lc1_cached;
	double T20_lc1_m, T20_lc1_C, T20_lc1_borderX, T20_lc1_borderY;
	boolean T20_lc2_horizontal, T20_lc2_vertical, T20_lc2_leftOrAbove, T20_lc2_cached;
	double T20_lc2_m, T20_lc2_C, T20_lc2_borderX, T20_lc2_borderY;
	boolean T20_lc3_horizontal, T20_lc3_vertical, T20_lc3_leftOrAbove, T20_lc3_cached;
	double T20_lc3_m, T20_lc3_C, T20_lc3_borderX, T20_lc3_borderY;
	int T20_r, T20_g, T20_b, T20_lc1_lastY = Integer.MIN_VALUE, T20_lc2_lastY = Integer.MIN_VALUE, T20_lc3_lastY = Integer.MIN_VALUE;

	boolean T21_initializedWithValidData = false, T21_okay = false;
	double T21_sx, T21_sy, T21_minx, T21_miny, T21_maxx, T21_maxy;
	boolean T21_lc1_horizontal, T21_lc1_vertical, T21_lc1_leftOrAbove, T21_lc1_cached;
	double T21_lc1_m, T21_lc1_C, T21_lc1_borderX, T21_lc1_borderY;
	boolean T21_lc2_horizontal, T21_lc2_vertical, T21_lc2_leftOrAbove, T21_lc2_cached;
	double T21_lc2_m, T21_lc2_C, T21_lc2_borderX, T21_lc2_borderY;
	boolean T21_lc3_horizontal, T21_lc3_vertical, T21_lc3_leftOrAbove, T21_lc3_cached;
	double T21_lc3_m, T21_lc3_C, T21_lc3_borderX, T21_lc3_borderY;
	int T21_r, T21_g, T21_b, T21_lc1_lastY = Integer.MIN_VALUE, T21_lc2_lastY = Integer.MIN_VALUE, T21_lc3_lastY = Integer.MIN_VALUE;

	boolean T22_initializedWithValidData = false, T22_okay = false;
	double T22_sx, T22_sy, T22_minx, T22_miny, T22_maxx, T22_maxy;
	boolean T22_lc1_horizontal, T22_lc1_vertical, T22_lc1_leftOrAbove, T22_lc1_cached;
	double T22_lc1_m, T22_lc1_C, T22_lc1_borderX, T22_lc1_borderY;
	boolean T22_lc2_horizontal, T22_lc2_vertical, T22_lc2_leftOrAbove, T22_lc2_cached;
	double T22_lc2_m, T22_lc2_C, T22_lc2_borderX, T22_lc2_borderY;
	boolean T22_lc3_horizontal, T22_lc3_vertical, T22_lc3_leftOrAbove, T22_lc3_cached;
	double T22_lc3_m, T22_lc3_C, T22_lc3_borderX, T22_lc3_borderY;
	int T22_r, T22_g, T22_b, T22_lc1_lastY = Integer.MIN_VALUE, T22_lc2_lastY = Integer.MIN_VALUE, T22_lc3_lastY = Integer.MIN_VALUE;

	boolean T23_initializedWithValidData = false, T23_okay = false;
	double T23_sx, T23_sy, T23_minx, T23_miny, T23_maxx, T23_maxy;
	boolean T23_lc1_horizontal, T23_lc1_vertical, T23_lc1_leftOrAbove, T23_lc1_cached;
	double T23_lc1_m, T23_lc1_C, T23_lc1_borderX, T23_lc1_borderY;
	boolean T23_lc2_horizontal, T23_lc2_vertical, T23_lc2_leftOrAbove, T23_lc2_cached;
	double T23_lc2_m, T23_lc2_C, T23_lc2_borderX, T23_lc2_borderY;
	boolean T23_lc3_horizontal, T23_lc3_vertical, T23_lc3_leftOrAbove, T23_lc3_cached;
	double T23_lc3_m, T23_lc3_C, T23_lc3_borderX, T23_lc3_borderY;
	int T23_r, T23_g, T23_b, T23_lc1_lastY = Integer.MIN_VALUE, T23_lc2_lastY = Integer.MIN_VALUE, T23_lc3_lastY = Integer.MIN_VALUE;

	boolean T24_initializedWithValidData = false, T24_okay = false;
	double T24_sx, T24_sy, T24_minx, T24_miny, T24_maxx, T24_maxy;
	boolean T24_lc1_horizontal, T24_lc1_vertical, T24_lc1_leftOrAbove, T24_lc1_cached;
	double T24_lc1_m, T24_lc1_C, T24_lc1_borderX, T24_lc1_borderY;
	boolean T24_lc2_horizontal, T24_lc2_vertical, T24_lc2_leftOrAbove, T24_lc2_cached;
	double T24_lc2_m, T24_lc2_C, T24_lc2_borderX, T24_lc2_borderY;
	boolean T24_lc3_horizontal, T24_lc3_vertical, T24_lc3_leftOrAbove, T24_lc3_cached;
	double T24_lc3_m, T24_lc3_C, T24_lc3_borderX, T24_lc3_borderY;
	int T24_r, T24_g, T24_b, T24_lc1_lastY = Integer.MIN_VALUE, T24_lc2_lastY = Integer.MIN_VALUE, T24_lc3_lastY = Integer.MIN_VALUE;

	boolean T25_initializedWithValidData = false, T25_okay = false;
	double T25_sx, T25_sy, T25_minx, T25_miny, T25_maxx, T25_maxy;
	boolean T25_lc1_horizontal, T25_lc1_vertical, T25_lc1_leftOrAbove, T25_lc1_cached;
	double T25_lc1_m, T25_lc1_C, T25_lc1_borderX, T25_lc1_borderY;
	boolean T25_lc2_horizontal, T25_lc2_vertical, T25_lc2_leftOrAbove, T25_lc2_cached;
	double T25_lc2_m, T25_lc2_C, T25_lc2_borderX, T25_lc2_borderY;
	boolean T25_lc3_horizontal, T25_lc3_vertical, T25_lc3_leftOrAbove, T25_lc3_cached;
	double T25_lc3_m, T25_lc3_C, T25_lc3_borderX, T25_lc3_borderY;
	int T25_r, T25_g, T25_b, T25_lc1_lastY = Integer.MIN_VALUE, T25_lc2_lastY = Integer.MIN_VALUE, T25_lc3_lastY = Integer.MIN_VALUE;

	boolean T26_initializedWithValidData = false, T26_okay = false;
	double T26_sx, T26_sy, T26_minx, T26_miny, T26_maxx, T26_maxy;
	boolean T26_lc1_horizontal, T26_lc1_vertical, T26_lc1_leftOrAbove, T26_lc1_cached;
	double T26_lc1_m, T26_lc1_C, T26_lc1_borderX, T26_lc1_borderY;
	boolean T26_lc2_horizontal, T26_lc2_vertical, T26_lc2_leftOrAbove, T26_lc2_cached;
	double T26_lc2_m, T26_lc2_C, T26_lc2_borderX, T26_lc2_borderY;
	boolean T26_lc3_horizontal, T26_lc3_vertical, T26_lc3_leftOrAbove, T26_lc3_cached;
	double T26_lc3_m, T26_lc3_C, T26_lc3_borderX, T26_lc3_borderY;
	int T26_r, T26_g, T26_b, T26_lc1_lastY = Integer.MIN_VALUE, T26_lc2_lastY = Integer.MIN_VALUE, T26_lc3_lastY = Integer.MIN_VALUE;

	boolean T27_initializedWithValidData = false, T27_okay = false;
	double T27_sx, T27_sy, T27_minx, T27_miny, T27_maxx, T27_maxy;
	boolean T27_lc1_horizontal, T27_lc1_vertical, T27_lc1_leftOrAbove, T27_lc1_cached;
	double T27_lc1_m, T27_lc1_C, T27_lc1_borderX, T27_lc1_borderY;
	boolean T27_lc2_horizontal, T27_lc2_vertical, T27_lc2_leftOrAbove, T27_lc2_cached;
	double T27_lc2_m, T27_lc2_C, T27_lc2_borderX, T27_lc2_borderY;
	boolean T27_lc3_horizontal, T27_lc3_vertical, T27_lc3_leftOrAbove, T27_lc3_cached;
	double T27_lc3_m, T27_lc3_C, T27_lc3_borderX, T27_lc3_borderY;
	int T27_r, T27_g, T27_b, T27_lc1_lastY = Integer.MIN_VALUE, T27_lc2_lastY = Integer.MIN_VALUE, T27_lc3_lastY = Integer.MIN_VALUE;

	boolean T28_initializedWithValidData = false, T28_okay = false;
	double T28_sx, T28_sy, T28_minx, T28_miny, T28_maxx, T28_maxy;
	boolean T28_lc1_horizontal, T28_lc1_vertical, T28_lc1_leftOrAbove, T28_lc1_cached;
	double T28_lc1_m, T28_lc1_C, T28_lc1_borderX, T28_lc1_borderY;
	boolean T28_lc2_horizontal, T28_lc2_vertical, T28_lc2_leftOrAbove, T28_lc2_cached;
	double T28_lc2_m, T28_lc2_C, T28_lc2_borderX, T28_lc2_borderY;
	boolean T28_lc3_horizontal, T28_lc3_vertical, T28_lc3_leftOrAbove, T28_lc3_cached;
	double T28_lc3_m, T28_lc3_C, T28_lc3_borderX, T28_lc3_borderY;
	int T28_r, T28_g, T28_b, T28_lc1_lastY = Integer.MIN_VALUE, T28_lc2_lastY = Integer.MIN_VALUE, T28_lc3_lastY = Integer.MIN_VALUE;

	boolean T29_initializedWithValidData = false, T29_okay = false;
	double T29_sx, T29_sy, T29_minx, T29_miny, T29_maxx, T29_maxy;
	boolean T29_lc1_horizontal, T29_lc1_vertical, T29_lc1_leftOrAbove, T29_lc1_cached;
	double T29_lc1_m, T29_lc1_C, T29_lc1_borderX, T29_lc1_borderY;
	boolean T29_lc2_horizontal, T29_lc2_vertical, T29_lc2_leftOrAbove, T29_lc2_cached;
	double T29_lc2_m, T29_lc2_C, T29_lc2_borderX, T29_lc2_borderY;
	boolean T29_lc3_horizontal, T29_lc3_vertical, T29_lc3_leftOrAbove, T29_lc3_cached;
	double T29_lc3_m, T29_lc3_C, T29_lc3_borderX, T29_lc3_borderY;
	int T29_r, T29_g, T29_b, T29_lc1_lastY = Integer.MIN_VALUE, T29_lc2_lastY = Integer.MIN_VALUE, T29_lc3_lastY = Integer.MIN_VALUE;

	boolean T30_initializedWithValidData = false, T30_okay = false;
	double T30_sx, T30_sy, T30_minx, T30_miny, T30_maxx, T30_maxy;
	boolean T30_lc1_horizontal, T30_lc1_vertical, T30_lc1_leftOrAbove, T30_lc1_cached;
	double T30_lc1_m, T30_lc1_C, T30_lc1_borderX, T30_lc1_borderY;
	boolean T30_lc2_horizontal, T30_lc2_vertical, T30_lc2_leftOrAbove, T30_lc2_cached;
	double T30_lc2_m, T30_lc2_C, T30_lc2_borderX, T30_lc2_borderY;
	boolean T30_lc3_horizontal, T30_lc3_vertical, T30_lc3_leftOrAbove, T30_lc3_cached;
	double T30_lc3_m, T30_lc3_C, T30_lc3_borderX, T30_lc3_borderY;
	int T30_r, T30_g, T30_b, T30_lc1_lastY = Integer.MIN_VALUE, T30_lc2_lastY = Integer.MIN_VALUE, T30_lc3_lastY = Integer.MIN_VALUE;

	boolean T31_initializedWithValidData = false, T31_okay = false;
	double T31_sx, T31_sy, T31_minx, T31_miny, T31_maxx, T31_maxy;
	boolean T31_lc1_horizontal, T31_lc1_vertical, T31_lc1_leftOrAbove, T31_lc1_cached;
	double T31_lc1_m, T31_lc1_C, T31_lc1_borderX, T31_lc1_borderY;
	boolean T31_lc2_horizontal, T31_lc2_vertical, T31_lc2_leftOrAbove, T31_lc2_cached;
	double T31_lc2_m, T31_lc2_C, T31_lc2_borderX, T31_lc2_borderY;
	boolean T31_lc3_horizontal, T31_lc3_vertical, T31_lc3_leftOrAbove, T31_lc3_cached;
	double T31_lc3_m, T31_lc3_C, T31_lc3_borderX, T31_lc3_borderY;
	int T31_r, T31_g, T31_b, T31_lc1_lastY = Integer.MIN_VALUE, T31_lc2_lastY = Integer.MIN_VALUE, T31_lc3_lastY = Integer.MIN_VALUE;

	boolean T32_initializedWithValidData = false, T32_okay = false;
	double T32_sx, T32_sy, T32_minx, T32_miny, T32_maxx, T32_maxy;
	boolean T32_lc1_horizontal, T32_lc1_vertical, T32_lc1_leftOrAbove, T32_lc1_cached;
	double T32_lc1_m, T32_lc1_C, T32_lc1_borderX, T32_lc1_borderY;
	boolean T32_lc2_horizontal, T32_lc2_vertical, T32_lc2_leftOrAbove, T32_lc2_cached;
	double T32_lc2_m, T32_lc2_C, T32_lc2_borderX, T32_lc2_borderY;
	boolean T32_lc3_horizontal, T32_lc3_vertical, T32_lc3_leftOrAbove, T32_lc3_cached;
	double T32_lc3_m, T32_lc3_C, T32_lc3_borderX, T32_lc3_borderY;
	int T32_r, T32_g, T32_b, T32_lc1_lastY = Integer.MIN_VALUE, T32_lc2_lastY = Integer.MIN_VALUE, T32_lc3_lastY = Integer.MIN_VALUE;

	boolean T33_initializedWithValidData = false, T33_okay = false;
	double T33_sx, T33_sy, T33_minx, T33_miny, T33_maxx, T33_maxy;
	boolean T33_lc1_horizontal, T33_lc1_vertical, T33_lc1_leftOrAbove, T33_lc1_cached;
	double T33_lc1_m, T33_lc1_C, T33_lc1_borderX, T33_lc1_borderY;
	boolean T33_lc2_horizontal, T33_lc2_vertical, T33_lc2_leftOrAbove, T33_lc2_cached;
	double T33_lc2_m, T33_lc2_C, T33_lc2_borderX, T33_lc2_borderY;
	boolean T33_lc3_horizontal, T33_lc3_vertical, T33_lc3_leftOrAbove, T33_lc3_cached;
	double T33_lc3_m, T33_lc3_C, T33_lc3_borderX, T33_lc3_borderY;
	int T33_r, T33_g, T33_b, T33_lc1_lastY = Integer.MIN_VALUE, T33_lc2_lastY = Integer.MIN_VALUE, T33_lc3_lastY = Integer.MIN_VALUE;

	boolean T34_initializedWithValidData = false, T34_okay = false;
	double T34_sx, T34_sy, T34_minx, T34_miny, T34_maxx, T34_maxy;
	boolean T34_lc1_horizontal, T34_lc1_vertical, T34_lc1_leftOrAbove, T34_lc1_cached;
	double T34_lc1_m, T34_lc1_C, T34_lc1_borderX, T34_lc1_borderY;
	boolean T34_lc2_horizontal, T34_lc2_vertical, T34_lc2_leftOrAbove, T34_lc2_cached;
	double T34_lc2_m, T34_lc2_C, T34_lc2_borderX, T34_lc2_borderY;
	boolean T34_lc3_horizontal, T34_lc3_vertical, T34_lc3_leftOrAbove, T34_lc3_cached;
	double T34_lc3_m, T34_lc3_C, T34_lc3_borderX, T34_lc3_borderY;
	int T34_r, T34_g, T34_b, T34_lc1_lastY = Integer.MIN_VALUE, T34_lc2_lastY = Integer.MIN_VALUE, T34_lc3_lastY = Integer.MIN_VALUE;

	boolean T35_initializedWithValidData = false, T35_okay = false;
	double T35_sx, T35_sy, T35_minx, T35_miny, T35_maxx, T35_maxy;
	boolean T35_lc1_horizontal, T35_lc1_vertical, T35_lc1_leftOrAbove, T35_lc1_cached;
	double T35_lc1_m, T35_lc1_C, T35_lc1_borderX, T35_lc1_borderY;
	boolean T35_lc2_horizontal, T35_lc2_vertical, T35_lc2_leftOrAbove, T35_lc2_cached;
	double T35_lc2_m, T35_lc2_C, T35_lc2_borderX, T35_lc2_borderY;
	boolean T35_lc3_horizontal, T35_lc3_vertical, T35_lc3_leftOrAbove, T35_lc3_cached;
	double T35_lc3_m, T35_lc3_C, T35_lc3_borderX, T35_lc3_borderY;
	int T35_r, T35_g, T35_b, T35_lc1_lastY = Integer.MIN_VALUE, T35_lc2_lastY = Integer.MIN_VALUE, T35_lc3_lastY = Integer.MIN_VALUE;

	boolean T36_initializedWithValidData = false, T36_okay = false;
	double T36_sx, T36_sy, T36_minx, T36_miny, T36_maxx, T36_maxy;
	boolean T36_lc1_horizontal, T36_lc1_vertical, T36_lc1_leftOrAbove, T36_lc1_cached;
	double T36_lc1_m, T36_lc1_C, T36_lc1_borderX, T36_lc1_borderY;
	boolean T36_lc2_horizontal, T36_lc2_vertical, T36_lc2_leftOrAbove, T36_lc2_cached;
	double T36_lc2_m, T36_lc2_C, T36_lc2_borderX, T36_lc2_borderY;
	boolean T36_lc3_horizontal, T36_lc3_vertical, T36_lc3_leftOrAbove, T36_lc3_cached;
	double T36_lc3_m, T36_lc3_C, T36_lc3_borderX, T36_lc3_borderY;
	int T36_r, T36_g, T36_b, T36_lc1_lastY = Integer.MIN_VALUE, T36_lc2_lastY = Integer.MIN_VALUE, T36_lc3_lastY = Integer.MIN_VALUE;

	boolean T37_initializedWithValidData = false, T37_okay = false;
	double T37_sx, T37_sy, T37_minx, T37_miny, T37_maxx, T37_maxy;
	boolean T37_lc1_horizontal, T37_lc1_vertical, T37_lc1_leftOrAbove, T37_lc1_cached;
	double T37_lc1_m, T37_lc1_C, T37_lc1_borderX, T37_lc1_borderY;
	boolean T37_lc2_horizontal, T37_lc2_vertical, T37_lc2_leftOrAbove, T37_lc2_cached;
	double T37_lc2_m, T37_lc2_C, T37_lc2_borderX, T37_lc2_borderY;
	boolean T37_lc3_horizontal, T37_lc3_vertical, T37_lc3_leftOrAbove, T37_lc3_cached;
	double T37_lc3_m, T37_lc3_C, T37_lc3_borderX, T37_lc3_borderY;
	int T37_r, T37_g, T37_b, T37_lc1_lastY = Integer.MIN_VALUE, T37_lc2_lastY = Integer.MIN_VALUE, T37_lc3_lastY = Integer.MIN_VALUE;

	boolean T38_initializedWithValidData = false, T38_okay = false;
	double T38_sx, T38_sy, T38_minx, T38_miny, T38_maxx, T38_maxy;
	boolean T38_lc1_horizontal, T38_lc1_vertical, T38_lc1_leftOrAbove, T38_lc1_cached;
	double T38_lc1_m, T38_lc1_C, T38_lc1_borderX, T38_lc1_borderY;
	boolean T38_lc2_horizontal, T38_lc2_vertical, T38_lc2_leftOrAbove, T38_lc2_cached;
	double T38_lc2_m, T38_lc2_C, T38_lc2_borderX, T38_lc2_borderY;
	boolean T38_lc3_horizontal, T38_lc3_vertical, T38_lc3_leftOrAbove, T38_lc3_cached;
	double T38_lc3_m, T38_lc3_C, T38_lc3_borderX, T38_lc3_borderY;
	int T38_r, T38_g, T38_b, T38_lc1_lastY = Integer.MIN_VALUE, T38_lc2_lastY = Integer.MIN_VALUE, T38_lc3_lastY = Integer.MIN_VALUE;

	boolean T39_initializedWithValidData = false, T39_okay = false;
	double T39_sx, T39_sy, T39_minx, T39_miny, T39_maxx, T39_maxy;
	boolean T39_lc1_horizontal, T39_lc1_vertical, T39_lc1_leftOrAbove, T39_lc1_cached;
	double T39_lc1_m, T39_lc1_C, T39_lc1_borderX, T39_lc1_borderY;
	boolean T39_lc2_horizontal, T39_lc2_vertical, T39_lc2_leftOrAbove, T39_lc2_cached;
	double T39_lc2_m, T39_lc2_C, T39_lc2_borderX, T39_lc2_borderY;
	boolean T39_lc3_horizontal, T39_lc3_vertical, T39_lc3_leftOrAbove, T39_lc3_cached;
	double T39_lc3_m, T39_lc3_C, T39_lc3_borderX, T39_lc3_borderY;
	int T39_r, T39_g, T39_b, T39_lc1_lastY = Integer.MIN_VALUE, T39_lc2_lastY = Integer.MIN_VALUE, T39_lc3_lastY = Integer.MIN_VALUE;

	boolean T40_initializedWithValidData = false, T40_okay = false;
	double T40_sx, T40_sy, T40_minx, T40_miny, T40_maxx, T40_maxy;
	boolean T40_lc1_horizontal, T40_lc1_vertical, T40_lc1_leftOrAbove, T40_lc1_cached;
	double T40_lc1_m, T40_lc1_C, T40_lc1_borderX, T40_lc1_borderY;
	boolean T40_lc2_horizontal, T40_lc2_vertical, T40_lc2_leftOrAbove, T40_lc2_cached;
	double T40_lc2_m, T40_lc2_C, T40_lc2_borderX, T40_lc2_borderY;
	boolean T40_lc3_horizontal, T40_lc3_vertical, T40_lc3_leftOrAbove, T40_lc3_cached;
	double T40_lc3_m, T40_lc3_C, T40_lc3_borderX, T40_lc3_borderY;
	int T40_r, T40_g, T40_b, T40_lc1_lastY = Integer.MIN_VALUE, T40_lc2_lastY = Integer.MIN_VALUE, T40_lc3_lastY = Integer.MIN_VALUE;

	boolean T41_initializedWithValidData = false, T41_okay = false;
	double T41_sx, T41_sy, T41_minx, T41_miny, T41_maxx, T41_maxy;
	boolean T41_lc1_horizontal, T41_lc1_vertical, T41_lc1_leftOrAbove, T41_lc1_cached;
	double T41_lc1_m, T41_lc1_C, T41_lc1_borderX, T41_lc1_borderY;
	boolean T41_lc2_horizontal, T41_lc2_vertical, T41_lc2_leftOrAbove, T41_lc2_cached;
	double T41_lc2_m, T41_lc2_C, T41_lc2_borderX, T41_lc2_borderY;
	boolean T41_lc3_horizontal, T41_lc3_vertical, T41_lc3_leftOrAbove, T41_lc3_cached;
	double T41_lc3_m, T41_lc3_C, T41_lc3_borderX, T41_lc3_borderY;
	int T41_r, T41_g, T41_b, T41_lc1_lastY = Integer.MIN_VALUE, T41_lc2_lastY = Integer.MIN_VALUE, T41_lc3_lastY = Integer.MIN_VALUE;

	boolean T42_initializedWithValidData = false, T42_okay = false;
	double T42_sx, T42_sy, T42_minx, T42_miny, T42_maxx, T42_maxy;
	boolean T42_lc1_horizontal, T42_lc1_vertical, T42_lc1_leftOrAbove, T42_lc1_cached;
	double T42_lc1_m, T42_lc1_C, T42_lc1_borderX, T42_lc1_borderY;
	boolean T42_lc2_horizontal, T42_lc2_vertical, T42_lc2_leftOrAbove, T42_lc2_cached;
	double T42_lc2_m, T42_lc2_C, T42_lc2_borderX, T42_lc2_borderY;
	boolean T42_lc3_horizontal, T42_lc3_vertical, T42_lc3_leftOrAbove, T42_lc3_cached;
	double T42_lc3_m, T42_lc3_C, T42_lc3_borderX, T42_lc3_borderY;
	int T42_r, T42_g, T42_b, T42_lc1_lastY = Integer.MIN_VALUE, T42_lc2_lastY = Integer.MIN_VALUE, T42_lc3_lastY = Integer.MIN_VALUE;

	boolean T43_initializedWithValidData = false, T43_okay = false;
	double T43_sx, T43_sy, T43_minx, T43_miny, T43_maxx, T43_maxy;
	boolean T43_lc1_horizontal, T43_lc1_vertical, T43_lc1_leftOrAbove, T43_lc1_cached;
	double T43_lc1_m, T43_lc1_C, T43_lc1_borderX, T43_lc1_borderY;
	boolean T43_lc2_horizontal, T43_lc2_vertical, T43_lc2_leftOrAbove, T43_lc2_cached;
	double T43_lc2_m, T43_lc2_C, T43_lc2_borderX, T43_lc2_borderY;
	boolean T43_lc3_horizontal, T43_lc3_vertical, T43_lc3_leftOrAbove, T43_lc3_cached;
	double T43_lc3_m, T43_lc3_C, T43_lc3_borderX, T43_lc3_borderY;
	int T43_r, T43_g, T43_b, T43_lc1_lastY = Integer.MIN_VALUE, T43_lc2_lastY = Integer.MIN_VALUE, T43_lc3_lastY = Integer.MIN_VALUE;

	boolean T44_initializedWithValidData = false, T44_okay = false;
	double T44_sx, T44_sy, T44_minx, T44_miny, T44_maxx, T44_maxy;
	boolean T44_lc1_horizontal, T44_lc1_vertical, T44_lc1_leftOrAbove, T44_lc1_cached;
	double T44_lc1_m, T44_lc1_C, T44_lc1_borderX, T44_lc1_borderY;
	boolean T44_lc2_horizontal, T44_lc2_vertical, T44_lc2_leftOrAbove, T44_lc2_cached;
	double T44_lc2_m, T44_lc2_C, T44_lc2_borderX, T44_lc2_borderY;
	boolean T44_lc3_horizontal, T44_lc3_vertical, T44_lc3_leftOrAbove, T44_lc3_cached;
	double T44_lc3_m, T44_lc3_C, T44_lc3_borderX, T44_lc3_borderY;
	int T44_r, T44_g, T44_b, T44_lc1_lastY = Integer.MIN_VALUE, T44_lc2_lastY = Integer.MIN_VALUE, T44_lc3_lastY = Integer.MIN_VALUE;

	boolean T45_initializedWithValidData = false, T45_okay = false;
	double T45_sx, T45_sy, T45_minx, T45_miny, T45_maxx, T45_maxy;
	boolean T45_lc1_horizontal, T45_lc1_vertical, T45_lc1_leftOrAbove, T45_lc1_cached;
	double T45_lc1_m, T45_lc1_C, T45_lc1_borderX, T45_lc1_borderY;
	boolean T45_lc2_horizontal, T45_lc2_vertical, T45_lc2_leftOrAbove, T45_lc2_cached;
	double T45_lc2_m, T45_lc2_C, T45_lc2_borderX, T45_lc2_borderY;
	boolean T45_lc3_horizontal, T45_lc3_vertical, T45_lc3_leftOrAbove, T45_lc3_cached;
	double T45_lc3_m, T45_lc3_C, T45_lc3_borderX, T45_lc3_borderY;
	int T45_r, T45_g, T45_b, T45_lc1_lastY = Integer.MIN_VALUE, T45_lc2_lastY = Integer.MIN_VALUE, T45_lc3_lastY = Integer.MIN_VALUE;

	boolean T46_initializedWithValidData = false, T46_okay = false;
	double T46_sx, T46_sy, T46_minx, T46_miny, T46_maxx, T46_maxy;
	boolean T46_lc1_horizontal, T46_lc1_vertical, T46_lc1_leftOrAbove, T46_lc1_cached;
	double T46_lc1_m, T46_lc1_C, T46_lc1_borderX, T46_lc1_borderY;
	boolean T46_lc2_horizontal, T46_lc2_vertical, T46_lc2_leftOrAbove, T46_lc2_cached;
	double T46_lc2_m, T46_lc2_C, T46_lc2_borderX, T46_lc2_borderY;
	boolean T46_lc3_horizontal, T46_lc3_vertical, T46_lc3_leftOrAbove, T46_lc3_cached;
	double T46_lc3_m, T46_lc3_C, T46_lc3_borderX, T46_lc3_borderY;
	int T46_r, T46_g, T46_b, T46_lc1_lastY = Integer.MIN_VALUE, T46_lc2_lastY = Integer.MIN_VALUE, T46_lc3_lastY = Integer.MIN_VALUE;

	boolean T47_initializedWithValidData = false, T47_okay = false;
	double T47_sx, T47_sy, T47_minx, T47_miny, T47_maxx, T47_maxy;
	boolean T47_lc1_horizontal, T47_lc1_vertical, T47_lc1_leftOrAbove, T47_lc1_cached;
	double T47_lc1_m, T47_lc1_C, T47_lc1_borderX, T47_lc1_borderY;
	boolean T47_lc2_horizontal, T47_lc2_vertical, T47_lc2_leftOrAbove, T47_lc2_cached;
	double T47_lc2_m, T47_lc2_C, T47_lc2_borderX, T47_lc2_borderY;
	boolean T47_lc3_horizontal, T47_lc3_vertical, T47_lc3_leftOrAbove, T47_lc3_cached;
	double T47_lc3_m, T47_lc3_C, T47_lc3_borderX, T47_lc3_borderY;
	int T47_r, T47_g, T47_b, T47_lc1_lastY = Integer.MIN_VALUE, T47_lc2_lastY = Integer.MIN_VALUE, T47_lc3_lastY = Integer.MIN_VALUE;

	boolean T48_initializedWithValidData = false, T48_okay = false;
	double T48_sx, T48_sy, T48_minx, T48_miny, T48_maxx, T48_maxy;
	boolean T48_lc1_horizontal, T48_lc1_vertical, T48_lc1_leftOrAbove, T48_lc1_cached;
	double T48_lc1_m, T48_lc1_C, T48_lc1_borderX, T48_lc1_borderY;
	boolean T48_lc2_horizontal, T48_lc2_vertical, T48_lc2_leftOrAbove, T48_lc2_cached;
	double T48_lc2_m, T48_lc2_C, T48_lc2_borderX, T48_lc2_borderY;
	boolean T48_lc3_horizontal, T48_lc3_vertical, T48_lc3_leftOrAbove, T48_lc3_cached;
	double T48_lc3_m, T48_lc3_C, T48_lc3_borderX, T48_lc3_borderY;
	int T48_r, T48_g, T48_b, T48_lc1_lastY = Integer.MIN_VALUE, T48_lc2_lastY = Integer.MIN_VALUE, T48_lc3_lastY = Integer.MIN_VALUE;

	boolean T49_initializedWithValidData = false, T49_okay = false;
	double T49_sx, T49_sy, T49_minx, T49_miny, T49_maxx, T49_maxy;
	boolean T49_lc1_horizontal, T49_lc1_vertical, T49_lc1_leftOrAbove, T49_lc1_cached;
	double T49_lc1_m, T49_lc1_C, T49_lc1_borderX, T49_lc1_borderY;
	boolean T49_lc2_horizontal, T49_lc2_vertical, T49_lc2_leftOrAbove, T49_lc2_cached;
	double T49_lc2_m, T49_lc2_C, T49_lc2_borderX, T49_lc2_borderY;
	boolean T49_lc3_horizontal, T49_lc3_vertical, T49_lc3_leftOrAbove, T49_lc3_cached;
	double T49_lc3_m, T49_lc3_C, T49_lc3_borderX, T49_lc3_borderY;
	int T49_r, T49_g, T49_b, T49_lc1_lastY = Integer.MIN_VALUE, T49_lc2_lastY = Integer.MIN_VALUE, T49_lc3_lastY = Integer.MIN_VALUE;

	boolean T50_initializedWithValidData = false, T50_okay = false;
	double T50_sx, T50_sy, T50_minx, T50_miny, T50_maxx, T50_maxy;
	boolean T50_lc1_horizontal, T50_lc1_vertical, T50_lc1_leftOrAbove, T50_lc1_cached;
	double T50_lc1_m, T50_lc1_C, T50_lc1_borderX, T50_lc1_borderY;
	boolean T50_lc2_horizontal, T50_lc2_vertical, T50_lc2_leftOrAbove, T50_lc2_cached;
	double T50_lc2_m, T50_lc2_C, T50_lc2_borderX, T50_lc2_borderY;
	boolean T50_lc3_horizontal, T50_lc3_vertical, T50_lc3_leftOrAbove, T50_lc3_cached;
	double T50_lc3_m, T50_lc3_C, T50_lc3_borderX, T50_lc3_borderY;
	int T50_r, T50_g, T50_b, T50_lc1_lastY = Integer.MIN_VALUE, T50_lc2_lastY = Integer.MIN_VALUE, T50_lc3_lastY = Integer.MIN_VALUE;

	boolean T51_initializedWithValidData = false, T51_okay = false;
	double T51_sx, T51_sy, T51_minx, T51_miny, T51_maxx, T51_maxy;
	boolean T51_lc1_horizontal, T51_lc1_vertical, T51_lc1_leftOrAbove, T51_lc1_cached;
	double T51_lc1_m, T51_lc1_C, T51_lc1_borderX, T51_lc1_borderY;
	boolean T51_lc2_horizontal, T51_lc2_vertical, T51_lc2_leftOrAbove, T51_lc2_cached;
	double T51_lc2_m, T51_lc2_C, T51_lc2_borderX, T51_lc2_borderY;
	boolean T51_lc3_horizontal, T51_lc3_vertical, T51_lc3_leftOrAbove, T51_lc3_cached;
	double T51_lc3_m, T51_lc3_C, T51_lc3_borderX, T51_lc3_borderY;
	int T51_r, T51_g, T51_b, T51_lc1_lastY = Integer.MIN_VALUE, T51_lc2_lastY = Integer.MIN_VALUE, T51_lc3_lastY = Integer.MIN_VALUE;

	boolean T52_initializedWithValidData = false, T52_okay = false;
	double T52_sx, T52_sy, T52_minx, T52_miny, T52_maxx, T52_maxy;
	boolean T52_lc1_horizontal, T52_lc1_vertical, T52_lc1_leftOrAbove, T52_lc1_cached;
	double T52_lc1_m, T52_lc1_C, T52_lc1_borderX, T52_lc1_borderY;
	boolean T52_lc2_horizontal, T52_lc2_vertical, T52_lc2_leftOrAbove, T52_lc2_cached;
	double T52_lc2_m, T52_lc2_C, T52_lc2_borderX, T52_lc2_borderY;
	boolean T52_lc3_horizontal, T52_lc3_vertical, T52_lc3_leftOrAbove, T52_lc3_cached;
	double T52_lc3_m, T52_lc3_C, T52_lc3_borderX, T52_lc3_borderY;
	int T52_r, T52_g, T52_b, T52_lc1_lastY = Integer.MIN_VALUE, T52_lc2_lastY = Integer.MIN_VALUE, T52_lc3_lastY = Integer.MIN_VALUE;

	boolean T53_initializedWithValidData = false, T53_okay = false;
	double T53_sx, T53_sy, T53_minx, T53_miny, T53_maxx, T53_maxy;
	boolean T53_lc1_horizontal, T53_lc1_vertical, T53_lc1_leftOrAbove, T53_lc1_cached;
	double T53_lc1_m, T53_lc1_C, T53_lc1_borderX, T53_lc1_borderY;
	boolean T53_lc2_horizontal, T53_lc2_vertical, T53_lc2_leftOrAbove, T53_lc2_cached;
	double T53_lc2_m, T53_lc2_C, T53_lc2_borderX, T53_lc2_borderY;
	boolean T53_lc3_horizontal, T53_lc3_vertical, T53_lc3_leftOrAbove, T53_lc3_cached;
	double T53_lc3_m, T53_lc3_C, T53_lc3_borderX, T53_lc3_borderY;
	int T53_r, T53_g, T53_b, T53_lc1_lastY = Integer.MIN_VALUE, T53_lc2_lastY = Integer.MIN_VALUE, T53_lc3_lastY = Integer.MIN_VALUE;

	boolean T54_initializedWithValidData = false, T54_okay = false;
	double T54_sx, T54_sy, T54_minx, T54_miny, T54_maxx, T54_maxy;
	boolean T54_lc1_horizontal, T54_lc1_vertical, T54_lc1_leftOrAbove, T54_lc1_cached;
	double T54_lc1_m, T54_lc1_C, T54_lc1_borderX, T54_lc1_borderY;
	boolean T54_lc2_horizontal, T54_lc2_vertical, T54_lc2_leftOrAbove, T54_lc2_cached;
	double T54_lc2_m, T54_lc2_C, T54_lc2_borderX, T54_lc2_borderY;
	boolean T54_lc3_horizontal, T54_lc3_vertical, T54_lc3_leftOrAbove, T54_lc3_cached;
	double T54_lc3_m, T54_lc3_C, T54_lc3_borderX, T54_lc3_borderY;
	int T54_r, T54_g, T54_b, T54_lc1_lastY = Integer.MIN_VALUE, T54_lc2_lastY = Integer.MIN_VALUE, T54_lc3_lastY = Integer.MIN_VALUE;

	boolean T55_initializedWithValidData = false, T55_okay = false;
	double T55_sx, T55_sy, T55_minx, T55_miny, T55_maxx, T55_maxy;
	boolean T55_lc1_horizontal, T55_lc1_vertical, T55_lc1_leftOrAbove, T55_lc1_cached;
	double T55_lc1_m, T55_lc1_C, T55_lc1_borderX, T55_lc1_borderY;
	boolean T55_lc2_horizontal, T55_lc2_vertical, T55_lc2_leftOrAbove, T55_lc2_cached;
	double T55_lc2_m, T55_lc2_C, T55_lc2_borderX, T55_lc2_borderY;
	boolean T55_lc3_horizontal, T55_lc3_vertical, T55_lc3_leftOrAbove, T55_lc3_cached;
	double T55_lc3_m, T55_lc3_C, T55_lc3_borderX, T55_lc3_borderY;
	int T55_r, T55_g, T55_b, T55_lc1_lastY = Integer.MIN_VALUE, T55_lc2_lastY = Integer.MIN_VALUE, T55_lc3_lastY = Integer.MIN_VALUE;

	boolean T56_initializedWithValidData = false, T56_okay = false;
	double T56_sx, T56_sy, T56_minx, T56_miny, T56_maxx, T56_maxy;
	boolean T56_lc1_horizontal, T56_lc1_vertical, T56_lc1_leftOrAbove, T56_lc1_cached;
	double T56_lc1_m, T56_lc1_C, T56_lc1_borderX, T56_lc1_borderY;
	boolean T56_lc2_horizontal, T56_lc2_vertical, T56_lc2_leftOrAbove, T56_lc2_cached;
	double T56_lc2_m, T56_lc2_C, T56_lc2_borderX, T56_lc2_borderY;
	boolean T56_lc3_horizontal, T56_lc3_vertical, T56_lc3_leftOrAbove, T56_lc3_cached;
	double T56_lc3_m, T56_lc3_C, T56_lc3_borderX, T56_lc3_borderY;
	int T56_r, T56_g, T56_b, T56_lc1_lastY = Integer.MIN_VALUE, T56_lc2_lastY = Integer.MIN_VALUE, T56_lc3_lastY = Integer.MIN_VALUE;

	boolean T57_initializedWithValidData = false, T57_okay = false;
	double T57_sx, T57_sy, T57_minx, T57_miny, T57_maxx, T57_maxy;
	boolean T57_lc1_horizontal, T57_lc1_vertical, T57_lc1_leftOrAbove, T57_lc1_cached;
	double T57_lc1_m, T57_lc1_C, T57_lc1_borderX, T57_lc1_borderY;
	boolean T57_lc2_horizontal, T57_lc2_vertical, T57_lc2_leftOrAbove, T57_lc2_cached;
	double T57_lc2_m, T57_lc2_C, T57_lc2_borderX, T57_lc2_borderY;
	boolean T57_lc3_horizontal, T57_lc3_vertical, T57_lc3_leftOrAbove, T57_lc3_cached;
	double T57_lc3_m, T57_lc3_C, T57_lc3_borderX, T57_lc3_borderY;
	int T57_r, T57_g, T57_b, T57_lc1_lastY = Integer.MIN_VALUE, T57_lc2_lastY = Integer.MIN_VALUE, T57_lc3_lastY = Integer.MIN_VALUE;

	boolean T58_initializedWithValidData = false, T58_okay = false;
	double T58_sx, T58_sy, T58_minx, T58_miny, T58_maxx, T58_maxy;
	boolean T58_lc1_horizontal, T58_lc1_vertical, T58_lc1_leftOrAbove, T58_lc1_cached;
	double T58_lc1_m, T58_lc1_C, T58_lc1_borderX, T58_lc1_borderY;
	boolean T58_lc2_horizontal, T58_lc2_vertical, T58_lc2_leftOrAbove, T58_lc2_cached;
	double T58_lc2_m, T58_lc2_C, T58_lc2_borderX, T58_lc2_borderY;
	boolean T58_lc3_horizontal, T58_lc3_vertical, T58_lc3_leftOrAbove, T58_lc3_cached;
	double T58_lc3_m, T58_lc3_C, T58_lc3_borderX, T58_lc3_borderY;
	int T58_r, T58_g, T58_b, T58_lc1_lastY = Integer.MIN_VALUE, T58_lc2_lastY = Integer.MIN_VALUE, T58_lc3_lastY = Integer.MIN_VALUE;

	boolean T59_initializedWithValidData = false, T59_okay = false;
	double T59_sx, T59_sy, T59_minx, T59_miny, T59_maxx, T59_maxy;
	boolean T59_lc1_horizontal, T59_lc1_vertical, T59_lc1_leftOrAbove, T59_lc1_cached;
	double T59_lc1_m, T59_lc1_C, T59_lc1_borderX, T59_lc1_borderY;
	boolean T59_lc2_horizontal, T59_lc2_vertical, T59_lc2_leftOrAbove, T59_lc2_cached;
	double T59_lc2_m, T59_lc2_C, T59_lc2_borderX, T59_lc2_borderY;
	boolean T59_lc3_horizontal, T59_lc3_vertical, T59_lc3_leftOrAbove, T59_lc3_cached;
	double T59_lc3_m, T59_lc3_C, T59_lc3_borderX, T59_lc3_borderY;
	int T59_r, T59_g, T59_b, T59_lc1_lastY = Integer.MIN_VALUE, T59_lc2_lastY = Integer.MIN_VALUE, T59_lc3_lastY = Integer.MIN_VALUE;

	boolean T60_initializedWithValidData = false, T60_okay = false;
	double T60_sx, T60_sy, T60_minx, T60_miny, T60_maxx, T60_maxy;
	boolean T60_lc1_horizontal, T60_lc1_vertical, T60_lc1_leftOrAbove, T60_lc1_cached;
	double T60_lc1_m, T60_lc1_C, T60_lc1_borderX, T60_lc1_borderY;
	boolean T60_lc2_horizontal, T60_lc2_vertical, T60_lc2_leftOrAbove, T60_lc2_cached;
	double T60_lc2_m, T60_lc2_C, T60_lc2_borderX, T60_lc2_borderY;
	boolean T60_lc3_horizontal, T60_lc3_vertical, T60_lc3_leftOrAbove, T60_lc3_cached;
	double T60_lc3_m, T60_lc3_C, T60_lc3_borderX, T60_lc3_borderY;
	int T60_r, T60_g, T60_b, T60_lc1_lastY = Integer.MIN_VALUE, T60_lc2_lastY = Integer.MIN_VALUE, T60_lc3_lastY = Integer.MIN_VALUE;

	boolean T61_initializedWithValidData = false, T61_okay = false;
	double T61_sx, T61_sy, T61_minx, T61_miny, T61_maxx, T61_maxy;
	boolean T61_lc1_horizontal, T61_lc1_vertical, T61_lc1_leftOrAbove, T61_lc1_cached;
	double T61_lc1_m, T61_lc1_C, T61_lc1_borderX, T61_lc1_borderY;
	boolean T61_lc2_horizontal, T61_lc2_vertical, T61_lc2_leftOrAbove, T61_lc2_cached;
	double T61_lc2_m, T61_lc2_C, T61_lc2_borderX, T61_lc2_borderY;
	boolean T61_lc3_horizontal, T61_lc3_vertical, T61_lc3_leftOrAbove, T61_lc3_cached;
	double T61_lc3_m, T61_lc3_C, T61_lc3_borderX, T61_lc3_borderY;
	int T61_r, T61_g, T61_b, T61_lc1_lastY = Integer.MIN_VALUE, T61_lc2_lastY = Integer.MIN_VALUE, T61_lc3_lastY = Integer.MIN_VALUE;

	boolean T62_initializedWithValidData = false, T62_okay = false;
	double T62_sx, T62_sy, T62_minx, T62_miny, T62_maxx, T62_maxy;
	boolean T62_lc1_horizontal, T62_lc1_vertical, T62_lc1_leftOrAbove, T62_lc1_cached;
	double T62_lc1_m, T62_lc1_C, T62_lc1_borderX, T62_lc1_borderY;
	boolean T62_lc2_horizontal, T62_lc2_vertical, T62_lc2_leftOrAbove, T62_lc2_cached;
	double T62_lc2_m, T62_lc2_C, T62_lc2_borderX, T62_lc2_borderY;
	boolean T62_lc3_horizontal, T62_lc3_vertical, T62_lc3_leftOrAbove, T62_lc3_cached;
	double T62_lc3_m, T62_lc3_C, T62_lc3_borderX, T62_lc3_borderY;
	int T62_r, T62_g, T62_b, T62_lc1_lastY = Integer.MIN_VALUE, T62_lc2_lastY = Integer.MIN_VALUE, T62_lc3_lastY = Integer.MIN_VALUE;

	boolean T63_initializedWithValidData = false, T63_okay = false;
	double T63_sx, T63_sy, T63_minx, T63_miny, T63_maxx, T63_maxy;
	boolean T63_lc1_horizontal, T63_lc1_vertical, T63_lc1_leftOrAbove, T63_lc1_cached;
	double T63_lc1_m, T63_lc1_C, T63_lc1_borderX, T63_lc1_borderY;
	boolean T63_lc2_horizontal, T63_lc2_vertical, T63_lc2_leftOrAbove, T63_lc2_cached;
	double T63_lc2_m, T63_lc2_C, T63_lc2_borderX, T63_lc2_borderY;
	boolean T63_lc3_horizontal, T63_lc3_vertical, T63_lc3_leftOrAbove, T63_lc3_cached;
	double T63_lc3_m, T63_lc3_C, T63_lc3_borderX, T63_lc3_borderY;
	int T63_r, T63_g, T63_b, T63_lc1_lastY = Integer.MIN_VALUE, T63_lc2_lastY = Integer.MIN_VALUE, T63_lc3_lastY = Integer.MIN_VALUE;

	boolean T64_initializedWithValidData = false, T64_okay = false;
	double T64_sx, T64_sy, T64_minx, T64_miny, T64_maxx, T64_maxy;
	boolean T64_lc1_horizontal, T64_lc1_vertical, T64_lc1_leftOrAbove, T64_lc1_cached;
	double T64_lc1_m, T64_lc1_C, T64_lc1_borderX, T64_lc1_borderY;
	boolean T64_lc2_horizontal, T64_lc2_vertical, T64_lc2_leftOrAbove, T64_lc2_cached;
	double T64_lc2_m, T64_lc2_C, T64_lc2_borderX, T64_lc2_borderY;
	boolean T64_lc3_horizontal, T64_lc3_vertical, T64_lc3_leftOrAbove, T64_lc3_cached;
	double T64_lc3_m, T64_lc3_C, T64_lc3_borderX, T64_lc3_borderY;
	int T64_r, T64_g, T64_b, T64_lc1_lastY = Integer.MIN_VALUE, T64_lc2_lastY = Integer.MIN_VALUE, T64_lc3_lastY = Integer.MIN_VALUE;

	boolean T65_initializedWithValidData = false, T65_okay = false;
	double T65_sx, T65_sy, T65_minx, T65_miny, T65_maxx, T65_maxy;
	boolean T65_lc1_horizontal, T65_lc1_vertical, T65_lc1_leftOrAbove, T65_lc1_cached;
	double T65_lc1_m, T65_lc1_C, T65_lc1_borderX, T65_lc1_borderY;
	boolean T65_lc2_horizontal, T65_lc2_vertical, T65_lc2_leftOrAbove, T65_lc2_cached;
	double T65_lc2_m, T65_lc2_C, T65_lc2_borderX, T65_lc2_borderY;
	boolean T65_lc3_horizontal, T65_lc3_vertical, T65_lc3_leftOrAbove, T65_lc3_cached;
	double T65_lc3_m, T65_lc3_C, T65_lc3_borderX, T65_lc3_borderY;
	int T65_r, T65_g, T65_b, T65_lc1_lastY = Integer.MIN_VALUE, T65_lc2_lastY = Integer.MIN_VALUE, T65_lc3_lastY = Integer.MIN_VALUE;

	boolean T66_initializedWithValidData = false, T66_okay = false;
	double T66_sx, T66_sy, T66_minx, T66_miny, T66_maxx, T66_maxy;
	boolean T66_lc1_horizontal, T66_lc1_vertical, T66_lc1_leftOrAbove, T66_lc1_cached;
	double T66_lc1_m, T66_lc1_C, T66_lc1_borderX, T66_lc1_borderY;
	boolean T66_lc2_horizontal, T66_lc2_vertical, T66_lc2_leftOrAbove, T66_lc2_cached;
	double T66_lc2_m, T66_lc2_C, T66_lc2_borderX, T66_lc2_borderY;
	boolean T66_lc3_horizontal, T66_lc3_vertical, T66_lc3_leftOrAbove, T66_lc3_cached;
	double T66_lc3_m, T66_lc3_C, T66_lc3_borderX, T66_lc3_borderY;
	int T66_r, T66_g, T66_b, T66_lc1_lastY = Integer.MIN_VALUE, T66_lc2_lastY = Integer.MIN_VALUE, T66_lc3_lastY = Integer.MIN_VALUE;

	boolean T67_initializedWithValidData = false, T67_okay = false;
	double T67_sx, T67_sy, T67_minx, T67_miny, T67_maxx, T67_maxy;
	boolean T67_lc1_horizontal, T67_lc1_vertical, T67_lc1_leftOrAbove, T67_lc1_cached;
	double T67_lc1_m, T67_lc1_C, T67_lc1_borderX, T67_lc1_borderY;
	boolean T67_lc2_horizontal, T67_lc2_vertical, T67_lc2_leftOrAbove, T67_lc2_cached;
	double T67_lc2_m, T67_lc2_C, T67_lc2_borderX, T67_lc2_borderY;
	boolean T67_lc3_horizontal, T67_lc3_vertical, T67_lc3_leftOrAbove, T67_lc3_cached;
	double T67_lc3_m, T67_lc3_C, T67_lc3_borderX, T67_lc3_borderY;
	int T67_r, T67_g, T67_b, T67_lc1_lastY = Integer.MIN_VALUE, T67_lc2_lastY = Integer.MIN_VALUE, T67_lc3_lastY = Integer.MIN_VALUE;

	boolean T68_initializedWithValidData = false, T68_okay = false;
	double T68_sx, T68_sy, T68_minx, T68_miny, T68_maxx, T68_maxy;
	boolean T68_lc1_horizontal, T68_lc1_vertical, T68_lc1_leftOrAbove, T68_lc1_cached;
	double T68_lc1_m, T68_lc1_C, T68_lc1_borderX, T68_lc1_borderY;
	boolean T68_lc2_horizontal, T68_lc2_vertical, T68_lc2_leftOrAbove, T68_lc2_cached;
	double T68_lc2_m, T68_lc2_C, T68_lc2_borderX, T68_lc2_borderY;
	boolean T68_lc3_horizontal, T68_lc3_vertical, T68_lc3_leftOrAbove, T68_lc3_cached;
	double T68_lc3_m, T68_lc3_C, T68_lc3_borderX, T68_lc3_borderY;
	int T68_r, T68_g, T68_b, T68_lc1_lastY = Integer.MIN_VALUE, T68_lc2_lastY = Integer.MIN_VALUE, T68_lc3_lastY = Integer.MIN_VALUE;

	boolean T69_initializedWithValidData = false, T69_okay = false;
	double T69_sx, T69_sy, T69_minx, T69_miny, T69_maxx, T69_maxy;
	boolean T69_lc1_horizontal, T69_lc1_vertical, T69_lc1_leftOrAbove, T69_lc1_cached;
	double T69_lc1_m, T69_lc1_C, T69_lc1_borderX, T69_lc1_borderY;
	boolean T69_lc2_horizontal, T69_lc2_vertical, T69_lc2_leftOrAbove, T69_lc2_cached;
	double T69_lc2_m, T69_lc2_C, T69_lc2_borderX, T69_lc2_borderY;
	boolean T69_lc3_horizontal, T69_lc3_vertical, T69_lc3_leftOrAbove, T69_lc3_cached;
	double T69_lc3_m, T69_lc3_C, T69_lc3_borderX, T69_lc3_borderY;
	int T69_r, T69_g, T69_b, T69_lc1_lastY = Integer.MIN_VALUE, T69_lc2_lastY = Integer.MIN_VALUE, T69_lc3_lastY = Integer.MIN_VALUE;

	boolean T70_initializedWithValidData = false, T70_okay = false;
	double T70_sx, T70_sy, T70_minx, T70_miny, T70_maxx, T70_maxy;
	boolean T70_lc1_horizontal, T70_lc1_vertical, T70_lc1_leftOrAbove, T70_lc1_cached;
	double T70_lc1_m, T70_lc1_C, T70_lc1_borderX, T70_lc1_borderY;
	boolean T70_lc2_horizontal, T70_lc2_vertical, T70_lc2_leftOrAbove, T70_lc2_cached;
	double T70_lc2_m, T70_lc2_C, T70_lc2_borderX, T70_lc2_borderY;
	boolean T70_lc3_horizontal, T70_lc3_vertical, T70_lc3_leftOrAbove, T70_lc3_cached;
	double T70_lc3_m, T70_lc3_C, T70_lc3_borderX, T70_lc3_borderY;
	int T70_r, T70_g, T70_b, T70_lc1_lastY = Integer.MIN_VALUE, T70_lc2_lastY = Integer.MIN_VALUE, T70_lc3_lastY = Integer.MIN_VALUE;

	boolean T71_initializedWithValidData = false, T71_okay = false;
	double T71_sx, T71_sy, T71_minx, T71_miny, T71_maxx, T71_maxy;
	boolean T71_lc1_horizontal, T71_lc1_vertical, T71_lc1_leftOrAbove, T71_lc1_cached;
	double T71_lc1_m, T71_lc1_C, T71_lc1_borderX, T71_lc1_borderY;
	boolean T71_lc2_horizontal, T71_lc2_vertical, T71_lc2_leftOrAbove, T71_lc2_cached;
	double T71_lc2_m, T71_lc2_C, T71_lc2_borderX, T71_lc2_borderY;
	boolean T71_lc3_horizontal, T71_lc3_vertical, T71_lc3_leftOrAbove, T71_lc3_cached;
	double T71_lc3_m, T71_lc3_C, T71_lc3_borderX, T71_lc3_borderY;
	int T71_r, T71_g, T71_b, T71_lc1_lastY = Integer.MIN_VALUE, T71_lc2_lastY = Integer.MIN_VALUE, T71_lc3_lastY = Integer.MIN_VALUE;

	boolean T72_initializedWithValidData = false, T72_okay = false;
	double T72_sx, T72_sy, T72_minx, T72_miny, T72_maxx, T72_maxy;
	boolean T72_lc1_horizontal, T72_lc1_vertical, T72_lc1_leftOrAbove, T72_lc1_cached;
	double T72_lc1_m, T72_lc1_C, T72_lc1_borderX, T72_lc1_borderY;
	boolean T72_lc2_horizontal, T72_lc2_vertical, T72_lc2_leftOrAbove, T72_lc2_cached;
	double T72_lc2_m, T72_lc2_C, T72_lc2_borderX, T72_lc2_borderY;
	boolean T72_lc3_horizontal, T72_lc3_vertical, T72_lc3_leftOrAbove, T72_lc3_cached;
	double T72_lc3_m, T72_lc3_C, T72_lc3_borderX, T72_lc3_borderY;
	int T72_r, T72_g, T72_b, T72_lc1_lastY = Integer.MIN_VALUE, T72_lc2_lastY = Integer.MIN_VALUE, T72_lc3_lastY = Integer.MIN_VALUE;

	boolean T73_initializedWithValidData = false, T73_okay = false;
	double T73_sx, T73_sy, T73_minx, T73_miny, T73_maxx, T73_maxy;
	boolean T73_lc1_horizontal, T73_lc1_vertical, T73_lc1_leftOrAbove, T73_lc1_cached;
	double T73_lc1_m, T73_lc1_C, T73_lc1_borderX, T73_lc1_borderY;
	boolean T73_lc2_horizontal, T73_lc2_vertical, T73_lc2_leftOrAbove, T73_lc2_cached;
	double T73_lc2_m, T73_lc2_C, T73_lc2_borderX, T73_lc2_borderY;
	boolean T73_lc3_horizontal, T73_lc3_vertical, T73_lc3_leftOrAbove, T73_lc3_cached;
	double T73_lc3_m, T73_lc3_C, T73_lc3_borderX, T73_lc3_borderY;
	int T73_r, T73_g, T73_b, T73_lc1_lastY = Integer.MIN_VALUE, T73_lc2_lastY = Integer.MIN_VALUE, T73_lc3_lastY = Integer.MIN_VALUE;

	boolean T74_initializedWithValidData = false, T74_okay = false;
	double T74_sx, T74_sy, T74_minx, T74_miny, T74_maxx, T74_maxy;
	boolean T74_lc1_horizontal, T74_lc1_vertical, T74_lc1_leftOrAbove, T74_lc1_cached;
	double T74_lc1_m, T74_lc1_C, T74_lc1_borderX, T74_lc1_borderY;
	boolean T74_lc2_horizontal, T74_lc2_vertical, T74_lc2_leftOrAbove, T74_lc2_cached;
	double T74_lc2_m, T74_lc2_C, T74_lc2_borderX, T74_lc2_borderY;
	boolean T74_lc3_horizontal, T74_lc3_vertical, T74_lc3_leftOrAbove, T74_lc3_cached;
	double T74_lc3_m, T74_lc3_C, T74_lc3_borderX, T74_lc3_borderY;
	int T74_r, T74_g, T74_b, T74_lc1_lastY = Integer.MIN_VALUE, T74_lc2_lastY = Integer.MIN_VALUE, T74_lc3_lastY = Integer.MIN_VALUE;

	boolean T75_initializedWithValidData = false, T75_okay = false;
	double T75_sx, T75_sy, T75_minx, T75_miny, T75_maxx, T75_maxy;
	boolean T75_lc1_horizontal, T75_lc1_vertical, T75_lc1_leftOrAbove, T75_lc1_cached;
	double T75_lc1_m, T75_lc1_C, T75_lc1_borderX, T75_lc1_borderY;
	boolean T75_lc2_horizontal, T75_lc2_vertical, T75_lc2_leftOrAbove, T75_lc2_cached;
	double T75_lc2_m, T75_lc2_C, T75_lc2_borderX, T75_lc2_borderY;
	boolean T75_lc3_horizontal, T75_lc3_vertical, T75_lc3_leftOrAbove, T75_lc3_cached;
	double T75_lc3_m, T75_lc3_C, T75_lc3_borderX, T75_lc3_borderY;
	int T75_r, T75_g, T75_b, T75_lc1_lastY = Integer.MIN_VALUE, T75_lc2_lastY = Integer.MIN_VALUE, T75_lc3_lastY = Integer.MIN_VALUE;

	boolean T76_initializedWithValidData = false, T76_okay = false;
	double T76_sx, T76_sy, T76_minx, T76_miny, T76_maxx, T76_maxy;
	boolean T76_lc1_horizontal, T76_lc1_vertical, T76_lc1_leftOrAbove, T76_lc1_cached;
	double T76_lc1_m, T76_lc1_C, T76_lc1_borderX, T76_lc1_borderY;
	boolean T76_lc2_horizontal, T76_lc2_vertical, T76_lc2_leftOrAbove, T76_lc2_cached;
	double T76_lc2_m, T76_lc2_C, T76_lc2_borderX, T76_lc2_borderY;
	boolean T76_lc3_horizontal, T76_lc3_vertical, T76_lc3_leftOrAbove, T76_lc3_cached;
	double T76_lc3_m, T76_lc3_C, T76_lc3_borderX, T76_lc3_borderY;
	int T76_r, T76_g, T76_b, T76_lc1_lastY = Integer.MIN_VALUE, T76_lc2_lastY = Integer.MIN_VALUE, T76_lc3_lastY = Integer.MIN_VALUE;

	boolean T77_initializedWithValidData = false, T77_okay = false;
	double T77_sx, T77_sy, T77_minx, T77_miny, T77_maxx, T77_maxy;
	boolean T77_lc1_horizontal, T77_lc1_vertical, T77_lc1_leftOrAbove, T77_lc1_cached;
	double T77_lc1_m, T77_lc1_C, T77_lc1_borderX, T77_lc1_borderY;
	boolean T77_lc2_horizontal, T77_lc2_vertical, T77_lc2_leftOrAbove, T77_lc2_cached;
	double T77_lc2_m, T77_lc2_C, T77_lc2_borderX, T77_lc2_borderY;
	boolean T77_lc3_horizontal, T77_lc3_vertical, T77_lc3_leftOrAbove, T77_lc3_cached;
	double T77_lc3_m, T77_lc3_C, T77_lc3_borderX, T77_lc3_borderY;
	int T77_r, T77_g, T77_b, T77_lc1_lastY = Integer.MIN_VALUE, T77_lc2_lastY = Integer.MIN_VALUE, T77_lc3_lastY = Integer.MIN_VALUE;

	boolean T78_initializedWithValidData = false, T78_okay = false;
	double T78_sx, T78_sy, T78_minx, T78_miny, T78_maxx, T78_maxy;
	boolean T78_lc1_horizontal, T78_lc1_vertical, T78_lc1_leftOrAbove, T78_lc1_cached;
	double T78_lc1_m, T78_lc1_C, T78_lc1_borderX, T78_lc1_borderY;
	boolean T78_lc2_horizontal, T78_lc2_vertical, T78_lc2_leftOrAbove, T78_lc2_cached;
	double T78_lc2_m, T78_lc2_C, T78_lc2_borderX, T78_lc2_borderY;
	boolean T78_lc3_horizontal, T78_lc3_vertical, T78_lc3_leftOrAbove, T78_lc3_cached;
	double T78_lc3_m, T78_lc3_C, T78_lc3_borderX, T78_lc3_borderY;
	int T78_r, T78_g, T78_b, T78_lc1_lastY = Integer.MIN_VALUE, T78_lc2_lastY = Integer.MIN_VALUE, T78_lc3_lastY = Integer.MIN_VALUE;

	boolean T79_initializedWithValidData = false, T79_okay = false;
	double T79_sx, T79_sy, T79_minx, T79_miny, T79_maxx, T79_maxy;
	boolean T79_lc1_horizontal, T79_lc1_vertical, T79_lc1_leftOrAbove, T79_lc1_cached;
	double T79_lc1_m, T79_lc1_C, T79_lc1_borderX, T79_lc1_borderY;
	boolean T79_lc2_horizontal, T79_lc2_vertical, T79_lc2_leftOrAbove, T79_lc2_cached;
	double T79_lc2_m, T79_lc2_C, T79_lc2_borderX, T79_lc2_borderY;
	boolean T79_lc3_horizontal, T79_lc3_vertical, T79_lc3_leftOrAbove, T79_lc3_cached;
	double T79_lc3_m, T79_lc3_C, T79_lc3_borderX, T79_lc3_borderY;
	int T79_r, T79_g, T79_b, T79_lc1_lastY = Integer.MIN_VALUE, T79_lc2_lastY = Integer.MIN_VALUE, T79_lc3_lastY = Integer.MIN_VALUE;

	boolean T80_initializedWithValidData = false, T80_okay = false;
	double T80_sx, T80_sy, T80_minx, T80_miny, T80_maxx, T80_maxy;
	boolean T80_lc1_horizontal, T80_lc1_vertical, T80_lc1_leftOrAbove, T80_lc1_cached;
	double T80_lc1_m, T80_lc1_C, T80_lc1_borderX, T80_lc1_borderY;
	boolean T80_lc2_horizontal, T80_lc2_vertical, T80_lc2_leftOrAbove, T80_lc2_cached;
	double T80_lc2_m, T80_lc2_C, T80_lc2_borderX, T80_lc2_borderY;
	boolean T80_lc3_horizontal, T80_lc3_vertical, T80_lc3_leftOrAbove, T80_lc3_cached;
	double T80_lc3_m, T80_lc3_C, T80_lc3_borderX, T80_lc3_borderY;
	int T80_r, T80_g, T80_b, T80_lc1_lastY = Integer.MIN_VALUE, T80_lc2_lastY = Integer.MIN_VALUE, T80_lc3_lastY = Integer.MIN_VALUE;

	boolean T81_initializedWithValidData = false, T81_okay = false;
	double T81_sx, T81_sy, T81_minx, T81_miny, T81_maxx, T81_maxy;
	boolean T81_lc1_horizontal, T81_lc1_vertical, T81_lc1_leftOrAbove, T81_lc1_cached;
	double T81_lc1_m, T81_lc1_C, T81_lc1_borderX, T81_lc1_borderY;
	boolean T81_lc2_horizontal, T81_lc2_vertical, T81_lc2_leftOrAbove, T81_lc2_cached;
	double T81_lc2_m, T81_lc2_C, T81_lc2_borderX, T81_lc2_borderY;
	boolean T81_lc3_horizontal, T81_lc3_vertical, T81_lc3_leftOrAbove, T81_lc3_cached;
	double T81_lc3_m, T81_lc3_C, T81_lc3_borderX, T81_lc3_borderY;
	int T81_r, T81_g, T81_b, T81_lc1_lastY = Integer.MIN_VALUE, T81_lc2_lastY = Integer.MIN_VALUE, T81_lc3_lastY = Integer.MIN_VALUE;

	boolean T82_initializedWithValidData = false, T82_okay = false;
	double T82_sx, T82_sy, T82_minx, T82_miny, T82_maxx, T82_maxy;
	boolean T82_lc1_horizontal, T82_lc1_vertical, T82_lc1_leftOrAbove, T82_lc1_cached;
	double T82_lc1_m, T82_lc1_C, T82_lc1_borderX, T82_lc1_borderY;
	boolean T82_lc2_horizontal, T82_lc2_vertical, T82_lc2_leftOrAbove, T82_lc2_cached;
	double T82_lc2_m, T82_lc2_C, T82_lc2_borderX, T82_lc2_borderY;
	boolean T82_lc3_horizontal, T82_lc3_vertical, T82_lc3_leftOrAbove, T82_lc3_cached;
	double T82_lc3_m, T82_lc3_C, T82_lc3_borderX, T82_lc3_borderY;
	int T82_r, T82_g, T82_b, T82_lc1_lastY = Integer.MIN_VALUE, T82_lc2_lastY = Integer.MIN_VALUE, T82_lc3_lastY = Integer.MIN_VALUE;

	boolean T83_initializedWithValidData = false, T83_okay = false;
	double T83_sx, T83_sy, T83_minx, T83_miny, T83_maxx, T83_maxy;
	boolean T83_lc1_horizontal, T83_lc1_vertical, T83_lc1_leftOrAbove, T83_lc1_cached;
	double T83_lc1_m, T83_lc1_C, T83_lc1_borderX, T83_lc1_borderY;
	boolean T83_lc2_horizontal, T83_lc2_vertical, T83_lc2_leftOrAbove, T83_lc2_cached;
	double T83_lc2_m, T83_lc2_C, T83_lc2_borderX, T83_lc2_borderY;
	boolean T83_lc3_horizontal, T83_lc3_vertical, T83_lc3_leftOrAbove, T83_lc3_cached;
	double T83_lc3_m, T83_lc3_C, T83_lc3_borderX, T83_lc3_borderY;
	int T83_r, T83_g, T83_b, T83_lc1_lastY = Integer.MIN_VALUE, T83_lc2_lastY = Integer.MIN_VALUE, T83_lc3_lastY = Integer.MIN_VALUE;

	boolean T84_initializedWithValidData = false, T84_okay = false;
	double T84_sx, T84_sy, T84_minx, T84_miny, T84_maxx, T84_maxy;
	boolean T84_lc1_horizontal, T84_lc1_vertical, T84_lc1_leftOrAbove, T84_lc1_cached;
	double T84_lc1_m, T84_lc1_C, T84_lc1_borderX, T84_lc1_borderY;
	boolean T84_lc2_horizontal, T84_lc2_vertical, T84_lc2_leftOrAbove, T84_lc2_cached;
	double T84_lc2_m, T84_lc2_C, T84_lc2_borderX, T84_lc2_borderY;
	boolean T84_lc3_horizontal, T84_lc3_vertical, T84_lc3_leftOrAbove, T84_lc3_cached;
	double T84_lc3_m, T84_lc3_C, T84_lc3_borderX, T84_lc3_borderY;
	int T84_r, T84_g, T84_b, T84_lc1_lastY = Integer.MIN_VALUE, T84_lc2_lastY = Integer.MIN_VALUE, T84_lc3_lastY = Integer.MIN_VALUE;

	boolean T85_initializedWithValidData = false, T85_okay = false;
	double T85_sx, T85_sy, T85_minx, T85_miny, T85_maxx, T85_maxy;
	boolean T85_lc1_horizontal, T85_lc1_vertical, T85_lc1_leftOrAbove, T85_lc1_cached;
	double T85_lc1_m, T85_lc1_C, T85_lc1_borderX, T85_lc1_borderY;
	boolean T85_lc2_horizontal, T85_lc2_vertical, T85_lc2_leftOrAbove, T85_lc2_cached;
	double T85_lc2_m, T85_lc2_C, T85_lc2_borderX, T85_lc2_borderY;
	boolean T85_lc3_horizontal, T85_lc3_vertical, T85_lc3_leftOrAbove, T85_lc3_cached;
	double T85_lc3_m, T85_lc3_C, T85_lc3_borderX, T85_lc3_borderY;
	int T85_r, T85_g, T85_b, T85_lc1_lastY = Integer.MIN_VALUE, T85_lc2_lastY = Integer.MIN_VALUE, T85_lc3_lastY = Integer.MIN_VALUE;

	boolean T86_initializedWithValidData = false, T86_okay = false;
	double T86_sx, T86_sy, T86_minx, T86_miny, T86_maxx, T86_maxy;
	boolean T86_lc1_horizontal, T86_lc1_vertical, T86_lc1_leftOrAbove, T86_lc1_cached;
	double T86_lc1_m, T86_lc1_C, T86_lc1_borderX, T86_lc1_borderY;
	boolean T86_lc2_horizontal, T86_lc2_vertical, T86_lc2_leftOrAbove, T86_lc2_cached;
	double T86_lc2_m, T86_lc2_C, T86_lc2_borderX, T86_lc2_borderY;
	boolean T86_lc3_horizontal, T86_lc3_vertical, T86_lc3_leftOrAbove, T86_lc3_cached;
	double T86_lc3_m, T86_lc3_C, T86_lc3_borderX, T86_lc3_borderY;
	int T86_r, T86_g, T86_b, T86_lc1_lastY = Integer.MIN_VALUE, T86_lc2_lastY = Integer.MIN_VALUE, T86_lc3_lastY = Integer.MIN_VALUE;

	boolean T87_initializedWithValidData = false, T87_okay = false;
	double T87_sx, T87_sy, T87_minx, T87_miny, T87_maxx, T87_maxy;
	boolean T87_lc1_horizontal, T87_lc1_vertical, T87_lc1_leftOrAbove, T87_lc1_cached;
	double T87_lc1_m, T87_lc1_C, T87_lc1_borderX, T87_lc1_borderY;
	boolean T87_lc2_horizontal, T87_lc2_vertical, T87_lc2_leftOrAbove, T87_lc2_cached;
	double T87_lc2_m, T87_lc2_C, T87_lc2_borderX, T87_lc2_borderY;
	boolean T87_lc3_horizontal, T87_lc3_vertical, T87_lc3_leftOrAbove, T87_lc3_cached;
	double T87_lc3_m, T87_lc3_C, T87_lc3_borderX, T87_lc3_borderY;
	int T87_r, T87_g, T87_b, T87_lc1_lastY = Integer.MIN_VALUE, T87_lc2_lastY = Integer.MIN_VALUE, T87_lc3_lastY = Integer.MIN_VALUE;

	boolean T88_initializedWithValidData = false, T88_okay = false;
	double T88_sx, T88_sy, T88_minx, T88_miny, T88_maxx, T88_maxy;
	boolean T88_lc1_horizontal, T88_lc1_vertical, T88_lc1_leftOrAbove, T88_lc1_cached;
	double T88_lc1_m, T88_lc1_C, T88_lc1_borderX, T88_lc1_borderY;
	boolean T88_lc2_horizontal, T88_lc2_vertical, T88_lc2_leftOrAbove, T88_lc2_cached;
	double T88_lc2_m, T88_lc2_C, T88_lc2_borderX, T88_lc2_borderY;
	boolean T88_lc3_horizontal, T88_lc3_vertical, T88_lc3_leftOrAbove, T88_lc3_cached;
	double T88_lc3_m, T88_lc3_C, T88_lc3_borderX, T88_lc3_borderY;
	int T88_r, T88_g, T88_b, T88_lc1_lastY = Integer.MIN_VALUE, T88_lc2_lastY = Integer.MIN_VALUE, T88_lc3_lastY = Integer.MIN_VALUE;

	boolean T89_initializedWithValidData = false, T89_okay = false;
	double T89_sx, T89_sy, T89_minx, T89_miny, T89_maxx, T89_maxy;
	boolean T89_lc1_horizontal, T89_lc1_vertical, T89_lc1_leftOrAbove, T89_lc1_cached;
	double T89_lc1_m, T89_lc1_C, T89_lc1_borderX, T89_lc1_borderY;
	boolean T89_lc2_horizontal, T89_lc2_vertical, T89_lc2_leftOrAbove, T89_lc2_cached;
	double T89_lc2_m, T89_lc2_C, T89_lc2_borderX, T89_lc2_borderY;
	boolean T89_lc3_horizontal, T89_lc3_vertical, T89_lc3_leftOrAbove, T89_lc3_cached;
	double T89_lc3_m, T89_lc3_C, T89_lc3_borderX, T89_lc3_borderY;
	int T89_r, T89_g, T89_b, T89_lc1_lastY = Integer.MIN_VALUE, T89_lc2_lastY = Integer.MIN_VALUE, T89_lc3_lastY = Integer.MIN_VALUE;

	boolean T90_initializedWithValidData = false, T90_okay = false;
	double T90_sx, T90_sy, T90_minx, T90_miny, T90_maxx, T90_maxy;
	boolean T90_lc1_horizontal, T90_lc1_vertical, T90_lc1_leftOrAbove, T90_lc1_cached;
	double T90_lc1_m, T90_lc1_C, T90_lc1_borderX, T90_lc1_borderY;
	boolean T90_lc2_horizontal, T90_lc2_vertical, T90_lc2_leftOrAbove, T90_lc2_cached;
	double T90_lc2_m, T90_lc2_C, T90_lc2_borderX, T90_lc2_borderY;
	boolean T90_lc3_horizontal, T90_lc3_vertical, T90_lc3_leftOrAbove, T90_lc3_cached;
	double T90_lc3_m, T90_lc3_C, T90_lc3_borderX, T90_lc3_borderY;
	int T90_r, T90_g, T90_b, T90_lc1_lastY = Integer.MIN_VALUE, T90_lc2_lastY = Integer.MIN_VALUE, T90_lc3_lastY = Integer.MIN_VALUE;

	boolean T91_initializedWithValidData = false, T91_okay = false;
	double T91_sx, T91_sy, T91_minx, T91_miny, T91_maxx, T91_maxy;
	boolean T91_lc1_horizontal, T91_lc1_vertical, T91_lc1_leftOrAbove, T91_lc1_cached;
	double T91_lc1_m, T91_lc1_C, T91_lc1_borderX, T91_lc1_borderY;
	boolean T91_lc2_horizontal, T91_lc2_vertical, T91_lc2_leftOrAbove, T91_lc2_cached;
	double T91_lc2_m, T91_lc2_C, T91_lc2_borderX, T91_lc2_borderY;
	boolean T91_lc3_horizontal, T91_lc3_vertical, T91_lc3_leftOrAbove, T91_lc3_cached;
	double T91_lc3_m, T91_lc3_C, T91_lc3_borderX, T91_lc3_borderY;
	int T91_r, T91_g, T91_b, T91_lc1_lastY = Integer.MIN_VALUE, T91_lc2_lastY = Integer.MIN_VALUE, T91_lc3_lastY = Integer.MIN_VALUE;

	boolean T92_initializedWithValidData = false, T92_okay = false;
	double T92_sx, T92_sy, T92_minx, T92_miny, T92_maxx, T92_maxy;
	boolean T92_lc1_horizontal, T92_lc1_vertical, T92_lc1_leftOrAbove, T92_lc1_cached;
	double T92_lc1_m, T92_lc1_C, T92_lc1_borderX, T92_lc1_borderY;
	boolean T92_lc2_horizontal, T92_lc2_vertical, T92_lc2_leftOrAbove, T92_lc2_cached;
	double T92_lc2_m, T92_lc2_C, T92_lc2_borderX, T92_lc2_borderY;
	boolean T92_lc3_horizontal, T92_lc3_vertical, T92_lc3_leftOrAbove, T92_lc3_cached;
	double T92_lc3_m, T92_lc3_C, T92_lc3_borderX, T92_lc3_borderY;
	int T92_r, T92_g, T92_b, T92_lc1_lastY = Integer.MIN_VALUE, T92_lc2_lastY = Integer.MIN_VALUE, T92_lc3_lastY = Integer.MIN_VALUE;

	boolean T93_initializedWithValidData = false, T93_okay = false;
	double T93_sx, T93_sy, T93_minx, T93_miny, T93_maxx, T93_maxy;
	boolean T93_lc1_horizontal, T93_lc1_vertical, T93_lc1_leftOrAbove, T93_lc1_cached;
	double T93_lc1_m, T93_lc1_C, T93_lc1_borderX, T93_lc1_borderY;
	boolean T93_lc2_horizontal, T93_lc2_vertical, T93_lc2_leftOrAbove, T93_lc2_cached;
	double T93_lc2_m, T93_lc2_C, T93_lc2_borderX, T93_lc2_borderY;
	boolean T93_lc3_horizontal, T93_lc3_vertical, T93_lc3_leftOrAbove, T93_lc3_cached;
	double T93_lc3_m, T93_lc3_C, T93_lc3_borderX, T93_lc3_borderY;
	int T93_r, T93_g, T93_b, T93_lc1_lastY = Integer.MIN_VALUE, T93_lc2_lastY = Integer.MIN_VALUE, T93_lc3_lastY = Integer.MIN_VALUE;

	boolean T94_initializedWithValidData = false, T94_okay = false;
	double T94_sx, T94_sy, T94_minx, T94_miny, T94_maxx, T94_maxy;
	boolean T94_lc1_horizontal, T94_lc1_vertical, T94_lc1_leftOrAbove, T94_lc1_cached;
	double T94_lc1_m, T94_lc1_C, T94_lc1_borderX, T94_lc1_borderY;
	boolean T94_lc2_horizontal, T94_lc2_vertical, T94_lc2_leftOrAbove, T94_lc2_cached;
	double T94_lc2_m, T94_lc2_C, T94_lc2_borderX, T94_lc2_borderY;
	boolean T94_lc3_horizontal, T94_lc3_vertical, T94_lc3_leftOrAbove, T94_lc3_cached;
	double T94_lc3_m, T94_lc3_C, T94_lc3_borderX, T94_lc3_borderY;
	int T94_r, T94_g, T94_b, T94_lc1_lastY = Integer.MIN_VALUE, T94_lc2_lastY = Integer.MIN_VALUE, T94_lc3_lastY = Integer.MIN_VALUE;

	boolean T95_initializedWithValidData = false, T95_okay = false;
	double T95_sx, T95_sy, T95_minx, T95_miny, T95_maxx, T95_maxy;
	boolean T95_lc1_horizontal, T95_lc1_vertical, T95_lc1_leftOrAbove, T95_lc1_cached;
	double T95_lc1_m, T95_lc1_C, T95_lc1_borderX, T95_lc1_borderY;
	boolean T95_lc2_horizontal, T95_lc2_vertical, T95_lc2_leftOrAbove, T95_lc2_cached;
	double T95_lc2_m, T95_lc2_C, T95_lc2_borderX, T95_lc2_borderY;
	boolean T95_lc3_horizontal, T95_lc3_vertical, T95_lc3_leftOrAbove, T95_lc3_cached;
	double T95_lc3_m, T95_lc3_C, T95_lc3_borderX, T95_lc3_borderY;
	int T95_r, T95_g, T95_b, T95_lc1_lastY = Integer.MIN_VALUE, T95_lc2_lastY = Integer.MIN_VALUE, T95_lc3_lastY = Integer.MIN_VALUE;

	boolean T96_initializedWithValidData = false, T96_okay = false;
	double T96_sx, T96_sy, T96_minx, T96_miny, T96_maxx, T96_maxy;
	boolean T96_lc1_horizontal, T96_lc1_vertical, T96_lc1_leftOrAbove, T96_lc1_cached;
	double T96_lc1_m, T96_lc1_C, T96_lc1_borderX, T96_lc1_borderY;
	boolean T96_lc2_horizontal, T96_lc2_vertical, T96_lc2_leftOrAbove, T96_lc2_cached;
	double T96_lc2_m, T96_lc2_C, T96_lc2_borderX, T96_lc2_borderY;
	boolean T96_lc3_horizontal, T96_lc3_vertical, T96_lc3_leftOrAbove, T96_lc3_cached;
	double T96_lc3_m, T96_lc3_C, T96_lc3_borderX, T96_lc3_borderY;
	int T96_r, T96_g, T96_b, T96_lc1_lastY = Integer.MIN_VALUE, T96_lc2_lastY = Integer.MIN_VALUE, T96_lc3_lastY = Integer.MIN_VALUE;

	boolean T97_initializedWithValidData = false, T97_okay = false;
	double T97_sx, T97_sy, T97_minx, T97_miny, T97_maxx, T97_maxy;
	boolean T97_lc1_horizontal, T97_lc1_vertical, T97_lc1_leftOrAbove, T97_lc1_cached;
	double T97_lc1_m, T97_lc1_C, T97_lc1_borderX, T97_lc1_borderY;
	boolean T97_lc2_horizontal, T97_lc2_vertical, T97_lc2_leftOrAbove, T97_lc2_cached;
	double T97_lc2_m, T97_lc2_C, T97_lc2_borderX, T97_lc2_borderY;
	boolean T97_lc3_horizontal, T97_lc3_vertical, T97_lc3_leftOrAbove, T97_lc3_cached;
	double T97_lc3_m, T97_lc3_C, T97_lc3_borderX, T97_lc3_borderY;
	int T97_r, T97_g, T97_b, T97_lc1_lastY = Integer.MIN_VALUE, T97_lc2_lastY = Integer.MIN_VALUE, T97_lc3_lastY = Integer.MIN_VALUE;

	boolean T98_initializedWithValidData = false, T98_okay = false;
	double T98_sx, T98_sy, T98_minx, T98_miny, T98_maxx, T98_maxy;
	boolean T98_lc1_horizontal, T98_lc1_vertical, T98_lc1_leftOrAbove, T98_lc1_cached;
	double T98_lc1_m, T98_lc1_C, T98_lc1_borderX, T98_lc1_borderY;
	boolean T98_lc2_horizontal, T98_lc2_vertical, T98_lc2_leftOrAbove, T98_lc2_cached;
	double T98_lc2_m, T98_lc2_C, T98_lc2_borderX, T98_lc2_borderY;
	boolean T98_lc3_horizontal, T98_lc3_vertical, T98_lc3_leftOrAbove, T98_lc3_cached;
	double T98_lc3_m, T98_lc3_C, T98_lc3_borderX, T98_lc3_borderY;
	int T98_r, T98_g, T98_b, T98_lc1_lastY = Integer.MIN_VALUE, T98_lc2_lastY = Integer.MIN_VALUE, T98_lc3_lastY = Integer.MIN_VALUE;

	boolean T99_initializedWithValidData = false, T99_okay = false;
	double T99_sx, T99_sy, T99_minx, T99_miny, T99_maxx, T99_maxy;
	boolean T99_lc1_horizontal, T99_lc1_vertical, T99_lc1_leftOrAbove, T99_lc1_cached;
	double T99_lc1_m, T99_lc1_C, T99_lc1_borderX, T99_lc1_borderY;
	boolean T99_lc2_horizontal, T99_lc2_vertical, T99_lc2_leftOrAbove, T99_lc2_cached;
	double T99_lc2_m, T99_lc2_C, T99_lc2_borderX, T99_lc2_borderY;
	boolean T99_lc3_horizontal, T99_lc3_vertical, T99_lc3_leftOrAbove, T99_lc3_cached;
	double T99_lc3_m, T99_lc3_C, T99_lc3_borderX, T99_lc3_borderY;
	int T99_r, T99_g, T99_b, T99_lc1_lastY = Integer.MIN_VALUE, T99_lc2_lastY = Integer.MIN_VALUE, T99_lc3_lastY = Integer.MIN_VALUE;

	boolean T100_initializedWithValidData = false, T100_okay = false;
	double T100_sx, T100_sy, T100_minx, T100_miny, T100_maxx, T100_maxy;
	boolean T100_lc1_horizontal, T100_lc1_vertical, T100_lc1_leftOrAbove, T100_lc1_cached;
	double T100_lc1_m, T100_lc1_C, T100_lc1_borderX, T100_lc1_borderY;
	boolean T100_lc2_horizontal, T100_lc2_vertical, T100_lc2_leftOrAbove, T100_lc2_cached;
	double T100_lc2_m, T100_lc2_C, T100_lc2_borderX, T100_lc2_borderY;
	boolean T100_lc3_horizontal, T100_lc3_vertical, T100_lc3_leftOrAbove, T100_lc3_cached;
	double T100_lc3_m, T100_lc3_C, T100_lc3_borderX, T100_lc3_borderY;
	int T100_r, T100_g, T100_b, T100_lc1_lastY = Integer.MIN_VALUE, T100_lc2_lastY = Integer.MIN_VALUE, T100_lc3_lastY = Integer.MIN_VALUE;

	boolean T101_initializedWithValidData = false, T101_okay = false;
	double T101_sx, T101_sy, T101_minx, T101_miny, T101_maxx, T101_maxy;
	boolean T101_lc1_horizontal, T101_lc1_vertical, T101_lc1_leftOrAbove, T101_lc1_cached;
	double T101_lc1_m, T101_lc1_C, T101_lc1_borderX, T101_lc1_borderY;
	boolean T101_lc2_horizontal, T101_lc2_vertical, T101_lc2_leftOrAbove, T101_lc2_cached;
	double T101_lc2_m, T101_lc2_C, T101_lc2_borderX, T101_lc2_borderY;
	boolean T101_lc3_horizontal, T101_lc3_vertical, T101_lc3_leftOrAbove, T101_lc3_cached;
	double T101_lc3_m, T101_lc3_C, T101_lc3_borderX, T101_lc3_borderY;
	int T101_r, T101_g, T101_b, T101_lc1_lastY = Integer.MIN_VALUE, T101_lc2_lastY = Integer.MIN_VALUE, T101_lc3_lastY = Integer.MIN_VALUE;

	boolean T102_initializedWithValidData = false, T102_okay = false;
	double T102_sx, T102_sy, T102_minx, T102_miny, T102_maxx, T102_maxy;
	boolean T102_lc1_horizontal, T102_lc1_vertical, T102_lc1_leftOrAbove, T102_lc1_cached;
	double T102_lc1_m, T102_lc1_C, T102_lc1_borderX, T102_lc1_borderY;
	boolean T102_lc2_horizontal, T102_lc2_vertical, T102_lc2_leftOrAbove, T102_lc2_cached;
	double T102_lc2_m, T102_lc2_C, T102_lc2_borderX, T102_lc2_borderY;
	boolean T102_lc3_horizontal, T102_lc3_vertical, T102_lc3_leftOrAbove, T102_lc3_cached;
	double T102_lc3_m, T102_lc3_C, T102_lc3_borderX, T102_lc3_borderY;
	int T102_r, T102_g, T102_b, T102_lc1_lastY = Integer.MIN_VALUE, T102_lc2_lastY = Integer.MIN_VALUE, T102_lc3_lastY = Integer.MIN_VALUE;

	boolean T103_initializedWithValidData = false, T103_okay = false;
	double T103_sx, T103_sy, T103_minx, T103_miny, T103_maxx, T103_maxy;
	boolean T103_lc1_horizontal, T103_lc1_vertical, T103_lc1_leftOrAbove, T103_lc1_cached;
	double T103_lc1_m, T103_lc1_C, T103_lc1_borderX, T103_lc1_borderY;
	boolean T103_lc2_horizontal, T103_lc2_vertical, T103_lc2_leftOrAbove, T103_lc2_cached;
	double T103_lc2_m, T103_lc2_C, T103_lc2_borderX, T103_lc2_borderY;
	boolean T103_lc3_horizontal, T103_lc3_vertical, T103_lc3_leftOrAbove, T103_lc3_cached;
	double T103_lc3_m, T103_lc3_C, T103_lc3_borderX, T103_lc3_borderY;
	int T103_r, T103_g, T103_b, T103_lc1_lastY = Integer.MIN_VALUE, T103_lc2_lastY = Integer.MIN_VALUE, T103_lc3_lastY = Integer.MIN_VALUE;

	boolean T104_initializedWithValidData = false, T104_okay = false;
	double T104_sx, T104_sy, T104_minx, T104_miny, T104_maxx, T104_maxy;
	boolean T104_lc1_horizontal, T104_lc1_vertical, T104_lc1_leftOrAbove, T104_lc1_cached;
	double T104_lc1_m, T104_lc1_C, T104_lc1_borderX, T104_lc1_borderY;
	boolean T104_lc2_horizontal, T104_lc2_vertical, T104_lc2_leftOrAbove, T104_lc2_cached;
	double T104_lc2_m, T104_lc2_C, T104_lc2_borderX, T104_lc2_borderY;
	boolean T104_lc3_horizontal, T104_lc3_vertical, T104_lc3_leftOrAbove, T104_lc3_cached;
	double T104_lc3_m, T104_lc3_C, T104_lc3_borderX, T104_lc3_borderY;
	int T104_r, T104_g, T104_b, T104_lc1_lastY = Integer.MIN_VALUE, T104_lc2_lastY = Integer.MIN_VALUE, T104_lc3_lastY = Integer.MIN_VALUE;

	boolean T105_initializedWithValidData = false, T105_okay = false;
	double T105_sx, T105_sy, T105_minx, T105_miny, T105_maxx, T105_maxy;
	boolean T105_lc1_horizontal, T105_lc1_vertical, T105_lc1_leftOrAbove, T105_lc1_cached;
	double T105_lc1_m, T105_lc1_C, T105_lc1_borderX, T105_lc1_borderY;
	boolean T105_lc2_horizontal, T105_lc2_vertical, T105_lc2_leftOrAbove, T105_lc2_cached;
	double T105_lc2_m, T105_lc2_C, T105_lc2_borderX, T105_lc2_borderY;
	boolean T105_lc3_horizontal, T105_lc3_vertical, T105_lc3_leftOrAbove, T105_lc3_cached;
	double T105_lc3_m, T105_lc3_C, T105_lc3_borderX, T105_lc3_borderY;
	int T105_r, T105_g, T105_b, T105_lc1_lastY = Integer.MIN_VALUE, T105_lc2_lastY = Integer.MIN_VALUE, T105_lc3_lastY = Integer.MIN_VALUE;

	boolean T106_initializedWithValidData = false, T106_okay = false;
	double T106_sx, T106_sy, T106_minx, T106_miny, T106_maxx, T106_maxy;
	boolean T106_lc1_horizontal, T106_lc1_vertical, T106_lc1_leftOrAbove, T106_lc1_cached;
	double T106_lc1_m, T106_lc1_C, T106_lc1_borderX, T106_lc1_borderY;
	boolean T106_lc2_horizontal, T106_lc2_vertical, T106_lc2_leftOrAbove, T106_lc2_cached;
	double T106_lc2_m, T106_lc2_C, T106_lc2_borderX, T106_lc2_borderY;
	boolean T106_lc3_horizontal, T106_lc3_vertical, T106_lc3_leftOrAbove, T106_lc3_cached;
	double T106_lc3_m, T106_lc3_C, T106_lc3_borderX, T106_lc3_borderY;
	int T106_r, T106_g, T106_b, T106_lc1_lastY = Integer.MIN_VALUE, T106_lc2_lastY = Integer.MIN_VALUE, T106_lc3_lastY = Integer.MIN_VALUE;

	boolean T107_initializedWithValidData = false, T107_okay = false;
	double T107_sx, T107_sy, T107_minx, T107_miny, T107_maxx, T107_maxy;
	boolean T107_lc1_horizontal, T107_lc1_vertical, T107_lc1_leftOrAbove, T107_lc1_cached;
	double T107_lc1_m, T107_lc1_C, T107_lc1_borderX, T107_lc1_borderY;
	boolean T107_lc2_horizontal, T107_lc2_vertical, T107_lc2_leftOrAbove, T107_lc2_cached;
	double T107_lc2_m, T107_lc2_C, T107_lc2_borderX, T107_lc2_borderY;
	boolean T107_lc3_horizontal, T107_lc3_vertical, T107_lc3_leftOrAbove, T107_lc3_cached;
	double T107_lc3_m, T107_lc3_C, T107_lc3_borderX, T107_lc3_borderY;
	int T107_r, T107_g, T107_b, T107_lc1_lastY = Integer.MIN_VALUE, T107_lc2_lastY = Integer.MIN_VALUE, T107_lc3_lastY = Integer.MIN_VALUE;

	boolean T108_initializedWithValidData = false, T108_okay = false;
	double T108_sx, T108_sy, T108_minx, T108_miny, T108_maxx, T108_maxy;
	boolean T108_lc1_horizontal, T108_lc1_vertical, T108_lc1_leftOrAbove, T108_lc1_cached;
	double T108_lc1_m, T108_lc1_C, T108_lc1_borderX, T108_lc1_borderY;
	boolean T108_lc2_horizontal, T108_lc2_vertical, T108_lc2_leftOrAbove, T108_lc2_cached;
	double T108_lc2_m, T108_lc2_C, T108_lc2_borderX, T108_lc2_borderY;
	boolean T108_lc3_horizontal, T108_lc3_vertical, T108_lc3_leftOrAbove, T108_lc3_cached;
	double T108_lc3_m, T108_lc3_C, T108_lc3_borderX, T108_lc3_borderY;
	int T108_r, T108_g, T108_b, T108_lc1_lastY = Integer.MIN_VALUE, T108_lc2_lastY = Integer.MIN_VALUE, T108_lc3_lastY = Integer.MIN_VALUE;

	boolean T109_initializedWithValidData = false, T109_okay = false;
	double T109_sx, T109_sy, T109_minx, T109_miny, T109_maxx, T109_maxy;
	boolean T109_lc1_horizontal, T109_lc1_vertical, T109_lc1_leftOrAbove, T109_lc1_cached;
	double T109_lc1_m, T109_lc1_C, T109_lc1_borderX, T109_lc1_borderY;
	boolean T109_lc2_horizontal, T109_lc2_vertical, T109_lc2_leftOrAbove, T109_lc2_cached;
	double T109_lc2_m, T109_lc2_C, T109_lc2_borderX, T109_lc2_borderY;
	boolean T109_lc3_horizontal, T109_lc3_vertical, T109_lc3_leftOrAbove, T109_lc3_cached;
	double T109_lc3_m, T109_lc3_C, T109_lc3_borderX, T109_lc3_borderY;
	int T109_r, T109_g, T109_b, T109_lc1_lastY = Integer.MIN_VALUE, T109_lc2_lastY = Integer.MIN_VALUE, T109_lc3_lastY = Integer.MIN_VALUE;

	boolean T110_initializedWithValidData = false, T110_okay = false;
	double T110_sx, T110_sy, T110_minx, T110_miny, T110_maxx, T110_maxy;
	boolean T110_lc1_horizontal, T110_lc1_vertical, T110_lc1_leftOrAbove, T110_lc1_cached;
	double T110_lc1_m, T110_lc1_C, T110_lc1_borderX, T110_lc1_borderY;
	boolean T110_lc2_horizontal, T110_lc2_vertical, T110_lc2_leftOrAbove, T110_lc2_cached;
	double T110_lc2_m, T110_lc2_C, T110_lc2_borderX, T110_lc2_borderY;
	boolean T110_lc3_horizontal, T110_lc3_vertical, T110_lc3_leftOrAbove, T110_lc3_cached;
	double T110_lc3_m, T110_lc3_C, T110_lc3_borderX, T110_lc3_borderY;
	int T110_r, T110_g, T110_b, T110_lc1_lastY = Integer.MIN_VALUE, T110_lc2_lastY = Integer.MIN_VALUE, T110_lc3_lastY = Integer.MIN_VALUE;

	boolean T111_initializedWithValidData = false, T111_okay = false;
	double T111_sx, T111_sy, T111_minx, T111_miny, T111_maxx, T111_maxy;
	boolean T111_lc1_horizontal, T111_lc1_vertical, T111_lc1_leftOrAbove, T111_lc1_cached;
	double T111_lc1_m, T111_lc1_C, T111_lc1_borderX, T111_lc1_borderY;
	boolean T111_lc2_horizontal, T111_lc2_vertical, T111_lc2_leftOrAbove, T111_lc2_cached;
	double T111_lc2_m, T111_lc2_C, T111_lc2_borderX, T111_lc2_borderY;
	boolean T111_lc3_horizontal, T111_lc3_vertical, T111_lc3_leftOrAbove, T111_lc3_cached;
	double T111_lc3_m, T111_lc3_C, T111_lc3_borderX, T111_lc3_borderY;
	int T111_r, T111_g, T111_b, T111_lc1_lastY = Integer.MIN_VALUE, T111_lc2_lastY = Integer.MIN_VALUE, T111_lc3_lastY = Integer.MIN_VALUE;

	boolean T112_initializedWithValidData = false, T112_okay = false;
	double T112_sx, T112_sy, T112_minx, T112_miny, T112_maxx, T112_maxy;
	boolean T112_lc1_horizontal, T112_lc1_vertical, T112_lc1_leftOrAbove, T112_lc1_cached;
	double T112_lc1_m, T112_lc1_C, T112_lc1_borderX, T112_lc1_borderY;
	boolean T112_lc2_horizontal, T112_lc2_vertical, T112_lc2_leftOrAbove, T112_lc2_cached;
	double T112_lc2_m, T112_lc2_C, T112_lc2_borderX, T112_lc2_borderY;
	boolean T112_lc3_horizontal, T112_lc3_vertical, T112_lc3_leftOrAbove, T112_lc3_cached;
	double T112_lc3_m, T112_lc3_C, T112_lc3_borderX, T112_lc3_borderY;
	int T112_r, T112_g, T112_b, T112_lc1_lastY = Integer.MIN_VALUE, T112_lc2_lastY = Integer.MIN_VALUE, T112_lc3_lastY = Integer.MIN_VALUE;

	boolean T113_initializedWithValidData = false, T113_okay = false;
	double T113_sx, T113_sy, T113_minx, T113_miny, T113_maxx, T113_maxy;
	boolean T113_lc1_horizontal, T113_lc1_vertical, T113_lc1_leftOrAbove, T113_lc1_cached;
	double T113_lc1_m, T113_lc1_C, T113_lc1_borderX, T113_lc1_borderY;
	boolean T113_lc2_horizontal, T113_lc2_vertical, T113_lc2_leftOrAbove, T113_lc2_cached;
	double T113_lc2_m, T113_lc2_C, T113_lc2_borderX, T113_lc2_borderY;
	boolean T113_lc3_horizontal, T113_lc3_vertical, T113_lc3_leftOrAbove, T113_lc3_cached;
	double T113_lc3_m, T113_lc3_C, T113_lc3_borderX, T113_lc3_borderY;
	int T113_r, T113_g, T113_b, T113_lc1_lastY = Integer.MIN_VALUE, T113_lc2_lastY = Integer.MIN_VALUE, T113_lc3_lastY = Integer.MIN_VALUE;

	boolean T114_initializedWithValidData = false, T114_okay = false;
	double T114_sx, T114_sy, T114_minx, T114_miny, T114_maxx, T114_maxy;
	boolean T114_lc1_horizontal, T114_lc1_vertical, T114_lc1_leftOrAbove, T114_lc1_cached;
	double T114_lc1_m, T114_lc1_C, T114_lc1_borderX, T114_lc1_borderY;
	boolean T114_lc2_horizontal, T114_lc2_vertical, T114_lc2_leftOrAbove, T114_lc2_cached;
	double T114_lc2_m, T114_lc2_C, T114_lc2_borderX, T114_lc2_borderY;
	boolean T114_lc3_horizontal, T114_lc3_vertical, T114_lc3_leftOrAbove, T114_lc3_cached;
	double T114_lc3_m, T114_lc3_C, T114_lc3_borderX, T114_lc3_borderY;
	int T114_r, T114_g, T114_b, T114_lc1_lastY = Integer.MIN_VALUE, T114_lc2_lastY = Integer.MIN_VALUE, T114_lc3_lastY = Integer.MIN_VALUE;

	boolean T115_initializedWithValidData = false, T115_okay = false;
	double T115_sx, T115_sy, T115_minx, T115_miny, T115_maxx, T115_maxy;
	boolean T115_lc1_horizontal, T115_lc1_vertical, T115_lc1_leftOrAbove, T115_lc1_cached;
	double T115_lc1_m, T115_lc1_C, T115_lc1_borderX, T115_lc1_borderY;
	boolean T115_lc2_horizontal, T115_lc2_vertical, T115_lc2_leftOrAbove, T115_lc2_cached;
	double T115_lc2_m, T115_lc2_C, T115_lc2_borderX, T115_lc2_borderY;
	boolean T115_lc3_horizontal, T115_lc3_vertical, T115_lc3_leftOrAbove, T115_lc3_cached;
	double T115_lc3_m, T115_lc3_C, T115_lc3_borderX, T115_lc3_borderY;
	int T115_r, T115_g, T115_b, T115_lc1_lastY = Integer.MIN_VALUE, T115_lc2_lastY = Integer.MIN_VALUE, T115_lc3_lastY = Integer.MIN_VALUE;

	boolean T116_initializedWithValidData = false, T116_okay = false;
	double T116_sx, T116_sy, T116_minx, T116_miny, T116_maxx, T116_maxy;
	boolean T116_lc1_horizontal, T116_lc1_vertical, T116_lc1_leftOrAbove, T116_lc1_cached;
	double T116_lc1_m, T116_lc1_C, T116_lc1_borderX, T116_lc1_borderY;
	boolean T116_lc2_horizontal, T116_lc2_vertical, T116_lc2_leftOrAbove, T116_lc2_cached;
	double T116_lc2_m, T116_lc2_C, T116_lc2_borderX, T116_lc2_borderY;
	boolean T116_lc3_horizontal, T116_lc3_vertical, T116_lc3_leftOrAbove, T116_lc3_cached;
	double T116_lc3_m, T116_lc3_C, T116_lc3_borderX, T116_lc3_borderY;
	int T116_r, T116_g, T116_b, T116_lc1_lastY = Integer.MIN_VALUE, T116_lc2_lastY = Integer.MIN_VALUE, T116_lc3_lastY = Integer.MIN_VALUE;

	boolean T117_initializedWithValidData = false, T117_okay = false;
	double T117_sx, T117_sy, T117_minx, T117_miny, T117_maxx, T117_maxy;
	boolean T117_lc1_horizontal, T117_lc1_vertical, T117_lc1_leftOrAbove, T117_lc1_cached;
	double T117_lc1_m, T117_lc1_C, T117_lc1_borderX, T117_lc1_borderY;
	boolean T117_lc2_horizontal, T117_lc2_vertical, T117_lc2_leftOrAbove, T117_lc2_cached;
	double T117_lc2_m, T117_lc2_C, T117_lc2_borderX, T117_lc2_borderY;
	boolean T117_lc3_horizontal, T117_lc3_vertical, T117_lc3_leftOrAbove, T117_lc3_cached;
	double T117_lc3_m, T117_lc3_C, T117_lc3_borderX, T117_lc3_borderY;
	int T117_r, T117_g, T117_b, T117_lc1_lastY = Integer.MIN_VALUE, T117_lc2_lastY = Integer.MIN_VALUE, T117_lc3_lastY = Integer.MIN_VALUE;

	boolean T118_initializedWithValidData = false, T118_okay = false;
	double T118_sx, T118_sy, T118_minx, T118_miny, T118_maxx, T118_maxy;
	boolean T118_lc1_horizontal, T118_lc1_vertical, T118_lc1_leftOrAbove, T118_lc1_cached;
	double T118_lc1_m, T118_lc1_C, T118_lc1_borderX, T118_lc1_borderY;
	boolean T118_lc2_horizontal, T118_lc2_vertical, T118_lc2_leftOrAbove, T118_lc2_cached;
	double T118_lc2_m, T118_lc2_C, T118_lc2_borderX, T118_lc2_borderY;
	boolean T118_lc3_horizontal, T118_lc3_vertical, T118_lc3_leftOrAbove, T118_lc3_cached;
	double T118_lc3_m, T118_lc3_C, T118_lc3_borderX, T118_lc3_borderY;
	int T118_r, T118_g, T118_b, T118_lc1_lastY = Integer.MIN_VALUE, T118_lc2_lastY = Integer.MIN_VALUE, T118_lc3_lastY = Integer.MIN_VALUE;

	boolean T119_initializedWithValidData = false, T119_okay = false;
	double T119_sx, T119_sy, T119_minx, T119_miny, T119_maxx, T119_maxy;
	boolean T119_lc1_horizontal, T119_lc1_vertical, T119_lc1_leftOrAbove, T119_lc1_cached;
	double T119_lc1_m, T119_lc1_C, T119_lc1_borderX, T119_lc1_borderY;
	boolean T119_lc2_horizontal, T119_lc2_vertical, T119_lc2_leftOrAbove, T119_lc2_cached;
	double T119_lc2_m, T119_lc2_C, T119_lc2_borderX, T119_lc2_borderY;
	boolean T119_lc3_horizontal, T119_lc3_vertical, T119_lc3_leftOrAbove, T119_lc3_cached;
	double T119_lc3_m, T119_lc3_C, T119_lc3_borderX, T119_lc3_borderY;
	int T119_r, T119_g, T119_b, T119_lc1_lastY = Integer.MIN_VALUE, T119_lc2_lastY = Integer.MIN_VALUE, T119_lc3_lastY = Integer.MIN_VALUE;

	boolean T120_initializedWithValidData = false, T120_okay = false;
	double T120_sx, T120_sy, T120_minx, T120_miny, T120_maxx, T120_maxy;
	boolean T120_lc1_horizontal, T120_lc1_vertical, T120_lc1_leftOrAbove, T120_lc1_cached;
	double T120_lc1_m, T120_lc1_C, T120_lc1_borderX, T120_lc1_borderY;
	boolean T120_lc2_horizontal, T120_lc2_vertical, T120_lc2_leftOrAbove, T120_lc2_cached;
	double T120_lc2_m, T120_lc2_C, T120_lc2_borderX, T120_lc2_borderY;
	boolean T120_lc3_horizontal, T120_lc3_vertical, T120_lc3_leftOrAbove, T120_lc3_cached;
	double T120_lc3_m, T120_lc3_C, T120_lc3_borderX, T120_lc3_borderY;
	int T120_r, T120_g, T120_b, T120_lc1_lastY = Integer.MIN_VALUE, T120_lc2_lastY = Integer.MIN_VALUE, T120_lc3_lastY = Integer.MIN_VALUE;

	boolean T121_initializedWithValidData = false, T121_okay = false;
	double T121_sx, T121_sy, T121_minx, T121_miny, T121_maxx, T121_maxy;
	boolean T121_lc1_horizontal, T121_lc1_vertical, T121_lc1_leftOrAbove, T121_lc1_cached;
	double T121_lc1_m, T121_lc1_C, T121_lc1_borderX, T121_lc1_borderY;
	boolean T121_lc2_horizontal, T121_lc2_vertical, T121_lc2_leftOrAbove, T121_lc2_cached;
	double T121_lc2_m, T121_lc2_C, T121_lc2_borderX, T121_lc2_borderY;
	boolean T121_lc3_horizontal, T121_lc3_vertical, T121_lc3_leftOrAbove, T121_lc3_cached;
	double T121_lc3_m, T121_lc3_C, T121_lc3_borderX, T121_lc3_borderY;
	int T121_r, T121_g, T121_b, T121_lc1_lastY = Integer.MIN_VALUE, T121_lc2_lastY = Integer.MIN_VALUE, T121_lc3_lastY = Integer.MIN_VALUE;

	boolean T122_initializedWithValidData = false, T122_okay = false;
	double T122_sx, T122_sy, T122_minx, T122_miny, T122_maxx, T122_maxy;
	boolean T122_lc1_horizontal, T122_lc1_vertical, T122_lc1_leftOrAbove, T122_lc1_cached;
	double T122_lc1_m, T122_lc1_C, T122_lc1_borderX, T122_lc1_borderY;
	boolean T122_lc2_horizontal, T122_lc2_vertical, T122_lc2_leftOrAbove, T122_lc2_cached;
	double T122_lc2_m, T122_lc2_C, T122_lc2_borderX, T122_lc2_borderY;
	boolean T122_lc3_horizontal, T122_lc3_vertical, T122_lc3_leftOrAbove, T122_lc3_cached;
	double T122_lc3_m, T122_lc3_C, T122_lc3_borderX, T122_lc3_borderY;
	int T122_r, T122_g, T122_b, T122_lc1_lastY = Integer.MIN_VALUE, T122_lc2_lastY = Integer.MIN_VALUE, T122_lc3_lastY = Integer.MIN_VALUE;

	boolean T123_initializedWithValidData = false, T123_okay = false;
	double T123_sx, T123_sy, T123_minx, T123_miny, T123_maxx, T123_maxy;
	boolean T123_lc1_horizontal, T123_lc1_vertical, T123_lc1_leftOrAbove, T123_lc1_cached;
	double T123_lc1_m, T123_lc1_C, T123_lc1_borderX, T123_lc1_borderY;
	boolean T123_lc2_horizontal, T123_lc2_vertical, T123_lc2_leftOrAbove, T123_lc2_cached;
	double T123_lc2_m, T123_lc2_C, T123_lc2_borderX, T123_lc2_borderY;
	boolean T123_lc3_horizontal, T123_lc3_vertical, T123_lc3_leftOrAbove, T123_lc3_cached;
	double T123_lc3_m, T123_lc3_C, T123_lc3_borderX, T123_lc3_borderY;
	int T123_r, T123_g, T123_b, T123_lc1_lastY = Integer.MIN_VALUE, T123_lc2_lastY = Integer.MIN_VALUE, T123_lc3_lastY = Integer.MIN_VALUE;

	boolean T124_initializedWithValidData = false, T124_okay = false;
	double T124_sx, T124_sy, T124_minx, T124_miny, T124_maxx, T124_maxy;
	boolean T124_lc1_horizontal, T124_lc1_vertical, T124_lc1_leftOrAbove, T124_lc1_cached;
	double T124_lc1_m, T124_lc1_C, T124_lc1_borderX, T124_lc1_borderY;
	boolean T124_lc2_horizontal, T124_lc2_vertical, T124_lc2_leftOrAbove, T124_lc2_cached;
	double T124_lc2_m, T124_lc2_C, T124_lc2_borderX, T124_lc2_borderY;
	boolean T124_lc3_horizontal, T124_lc3_vertical, T124_lc3_leftOrAbove, T124_lc3_cached;
	double T124_lc3_m, T124_lc3_C, T124_lc3_borderX, T124_lc3_borderY;
	int T124_r, T124_g, T124_b, T124_lc1_lastY = Integer.MIN_VALUE, T124_lc2_lastY = Integer.MIN_VALUE, T124_lc3_lastY = Integer.MIN_VALUE;

	boolean T125_initializedWithValidData = false, T125_okay = false;
	double T125_sx, T125_sy, T125_minx, T125_miny, T125_maxx, T125_maxy;
	boolean T125_lc1_horizontal, T125_lc1_vertical, T125_lc1_leftOrAbove, T125_lc1_cached;
	double T125_lc1_m, T125_lc1_C, T125_lc1_borderX, T125_lc1_borderY;
	boolean T125_lc2_horizontal, T125_lc2_vertical, T125_lc2_leftOrAbove, T125_lc2_cached;
	double T125_lc2_m, T125_lc2_C, T125_lc2_borderX, T125_lc2_borderY;
	boolean T125_lc3_horizontal, T125_lc3_vertical, T125_lc3_leftOrAbove, T125_lc3_cached;
	double T125_lc3_m, T125_lc3_C, T125_lc3_borderX, T125_lc3_borderY;
	int T125_r, T125_g, T125_b, T125_lc1_lastY = Integer.MIN_VALUE, T125_lc2_lastY = Integer.MIN_VALUE, T125_lc3_lastY = Integer.MIN_VALUE;

	boolean T126_initializedWithValidData = false, T126_okay = false;
	double T126_sx, T126_sy, T126_minx, T126_miny, T126_maxx, T126_maxy;
	boolean T126_lc1_horizontal, T126_lc1_vertical, T126_lc1_leftOrAbove, T126_lc1_cached;
	double T126_lc1_m, T126_lc1_C, T126_lc1_borderX, T126_lc1_borderY;
	boolean T126_lc2_horizontal, T126_lc2_vertical, T126_lc2_leftOrAbove, T126_lc2_cached;
	double T126_lc2_m, T126_lc2_C, T126_lc2_borderX, T126_lc2_borderY;
	boolean T126_lc3_horizontal, T126_lc3_vertical, T126_lc3_leftOrAbove, T126_lc3_cached;
	double T126_lc3_m, T126_lc3_C, T126_lc3_borderX, T126_lc3_borderY;
	int T126_r, T126_g, T126_b, T126_lc1_lastY = Integer.MIN_VALUE, T126_lc2_lastY = Integer.MIN_VALUE, T126_lc3_lastY = Integer.MIN_VALUE;

	boolean T127_initializedWithValidData = false, T127_okay = false;
	double T127_sx, T127_sy, T127_minx, T127_miny, T127_maxx, T127_maxy;
	boolean T127_lc1_horizontal, T127_lc1_vertical, T127_lc1_leftOrAbove, T127_lc1_cached;
	double T127_lc1_m, T127_lc1_C, T127_lc1_borderX, T127_lc1_borderY;
	boolean T127_lc2_horizontal, T127_lc2_vertical, T127_lc2_leftOrAbove, T127_lc2_cached;
	double T127_lc2_m, T127_lc2_C, T127_lc2_borderX, T127_lc2_borderY;
	boolean T127_lc3_horizontal, T127_lc3_vertical, T127_lc3_leftOrAbove, T127_lc3_cached;
	double T127_lc3_m, T127_lc3_C, T127_lc3_borderX, T127_lc3_borderY;
	int T127_r, T127_g, T127_b, T127_lc1_lastY = Integer.MIN_VALUE, T127_lc2_lastY = Integer.MIN_VALUE, T127_lc3_lastY = Integer.MIN_VALUE;

	boolean T128_initializedWithValidData = false, T128_okay = false;
	double T128_sx, T128_sy, T128_minx, T128_miny, T128_maxx, T128_maxy;
	boolean T128_lc1_horizontal, T128_lc1_vertical, T128_lc1_leftOrAbove, T128_lc1_cached;
	double T128_lc1_m, T128_lc1_C, T128_lc1_borderX, T128_lc1_borderY;
	boolean T128_lc2_horizontal, T128_lc2_vertical, T128_lc2_leftOrAbove, T128_lc2_cached;
	double T128_lc2_m, T128_lc2_C, T128_lc2_borderX, T128_lc2_borderY;
	boolean T128_lc3_horizontal, T128_lc3_vertical, T128_lc3_leftOrAbove, T128_lc3_cached;
	double T128_lc3_m, T128_lc3_C, T128_lc3_borderX, T128_lc3_borderY;
	int T128_r, T128_g, T128_b, T128_lc1_lastY = Integer.MIN_VALUE, T128_lc2_lastY = Integer.MIN_VALUE, T128_lc3_lastY = Integer.MIN_VALUE;

	boolean T129_initializedWithValidData = false, T129_okay = false;
	double T129_sx, T129_sy, T129_minx, T129_miny, T129_maxx, T129_maxy;
	boolean T129_lc1_horizontal, T129_lc1_vertical, T129_lc1_leftOrAbove, T129_lc1_cached;
	double T129_lc1_m, T129_lc1_C, T129_lc1_borderX, T129_lc1_borderY;
	boolean T129_lc2_horizontal, T129_lc2_vertical, T129_lc2_leftOrAbove, T129_lc2_cached;
	double T129_lc2_m, T129_lc2_C, T129_lc2_borderX, T129_lc2_borderY;
	boolean T129_lc3_horizontal, T129_lc3_vertical, T129_lc3_leftOrAbove, T129_lc3_cached;
	double T129_lc3_m, T129_lc3_C, T129_lc3_borderX, T129_lc3_borderY;
	int T129_r, T129_g, T129_b, T129_lc1_lastY = Integer.MIN_VALUE, T129_lc2_lastY = Integer.MIN_VALUE, T129_lc3_lastY = Integer.MIN_VALUE;

	boolean T130_initializedWithValidData = false, T130_okay = false;
	double T130_sx, T130_sy, T130_minx, T130_miny, T130_maxx, T130_maxy;
	boolean T130_lc1_horizontal, T130_lc1_vertical, T130_lc1_leftOrAbove, T130_lc1_cached;
	double T130_lc1_m, T130_lc1_C, T130_lc1_borderX, T130_lc1_borderY;
	boolean T130_lc2_horizontal, T130_lc2_vertical, T130_lc2_leftOrAbove, T130_lc2_cached;
	double T130_lc2_m, T130_lc2_C, T130_lc2_borderX, T130_lc2_borderY;
	boolean T130_lc3_horizontal, T130_lc3_vertical, T130_lc3_leftOrAbove, T130_lc3_cached;
	double T130_lc3_m, T130_lc3_C, T130_lc3_borderX, T130_lc3_borderY;
	int T130_r, T130_g, T130_b, T130_lc1_lastY = Integer.MIN_VALUE, T130_lc2_lastY = Integer.MIN_VALUE, T130_lc3_lastY = Integer.MIN_VALUE;

	boolean T131_initializedWithValidData = false, T131_okay = false;
	double T131_sx, T131_sy, T131_minx, T131_miny, T131_maxx, T131_maxy;
	boolean T131_lc1_horizontal, T131_lc1_vertical, T131_lc1_leftOrAbove, T131_lc1_cached;
	double T131_lc1_m, T131_lc1_C, T131_lc1_borderX, T131_lc1_borderY;
	boolean T131_lc2_horizontal, T131_lc2_vertical, T131_lc2_leftOrAbove, T131_lc2_cached;
	double T131_lc2_m, T131_lc2_C, T131_lc2_borderX, T131_lc2_borderY;
	boolean T131_lc3_horizontal, T131_lc3_vertical, T131_lc3_leftOrAbove, T131_lc3_cached;
	double T131_lc3_m, T131_lc3_C, T131_lc3_borderX, T131_lc3_borderY;
	int T131_r, T131_g, T131_b, T131_lc1_lastY = Integer.MIN_VALUE, T131_lc2_lastY = Integer.MIN_VALUE, T131_lc3_lastY = Integer.MIN_VALUE;

	boolean T132_initializedWithValidData = false, T132_okay = false;
	double T132_sx, T132_sy, T132_minx, T132_miny, T132_maxx, T132_maxy;
	boolean T132_lc1_horizontal, T132_lc1_vertical, T132_lc1_leftOrAbove, T132_lc1_cached;
	double T132_lc1_m, T132_lc1_C, T132_lc1_borderX, T132_lc1_borderY;
	boolean T132_lc2_horizontal, T132_lc2_vertical, T132_lc2_leftOrAbove, T132_lc2_cached;
	double T132_lc2_m, T132_lc2_C, T132_lc2_borderX, T132_lc2_borderY;
	boolean T132_lc3_horizontal, T132_lc3_vertical, T132_lc3_leftOrAbove, T132_lc3_cached;
	double T132_lc3_m, T132_lc3_C, T132_lc3_borderX, T132_lc3_borderY;
	int T132_r, T132_g, T132_b, T132_lc1_lastY = Integer.MIN_VALUE, T132_lc2_lastY = Integer.MIN_VALUE, T132_lc3_lastY = Integer.MIN_VALUE;

	boolean T133_initializedWithValidData = false, T133_okay = false;
	double T133_sx, T133_sy, T133_minx, T133_miny, T133_maxx, T133_maxy;
	boolean T133_lc1_horizontal, T133_lc1_vertical, T133_lc1_leftOrAbove, T133_lc1_cached;
	double T133_lc1_m, T133_lc1_C, T133_lc1_borderX, T133_lc1_borderY;
	boolean T133_lc2_horizontal, T133_lc2_vertical, T133_lc2_leftOrAbove, T133_lc2_cached;
	double T133_lc2_m, T133_lc2_C, T133_lc2_borderX, T133_lc2_borderY;
	boolean T133_lc3_horizontal, T133_lc3_vertical, T133_lc3_leftOrAbove, T133_lc3_cached;
	double T133_lc3_m, T133_lc3_C, T133_lc3_borderX, T133_lc3_borderY;
	int T133_r, T133_g, T133_b, T133_lc1_lastY = Integer.MIN_VALUE, T133_lc2_lastY = Integer.MIN_VALUE, T133_lc3_lastY = Integer.MIN_VALUE;

	boolean T134_initializedWithValidData = false, T134_okay = false;
	double T134_sx, T134_sy, T134_minx, T134_miny, T134_maxx, T134_maxy;
	boolean T134_lc1_horizontal, T134_lc1_vertical, T134_lc1_leftOrAbove, T134_lc1_cached;
	double T134_lc1_m, T134_lc1_C, T134_lc1_borderX, T134_lc1_borderY;
	boolean T134_lc2_horizontal, T134_lc2_vertical, T134_lc2_leftOrAbove, T134_lc2_cached;
	double T134_lc2_m, T134_lc2_C, T134_lc2_borderX, T134_lc2_borderY;
	boolean T134_lc3_horizontal, T134_lc3_vertical, T134_lc3_leftOrAbove, T134_lc3_cached;
	double T134_lc3_m, T134_lc3_C, T134_lc3_borderX, T134_lc3_borderY;
	int T134_r, T134_g, T134_b, T134_lc1_lastY = Integer.MIN_VALUE, T134_lc2_lastY = Integer.MIN_VALUE, T134_lc3_lastY = Integer.MIN_VALUE;

	boolean T135_initializedWithValidData = false, T135_okay = false;
	double T135_sx, T135_sy, T135_minx, T135_miny, T135_maxx, T135_maxy;
	boolean T135_lc1_horizontal, T135_lc1_vertical, T135_lc1_leftOrAbove, T135_lc1_cached;
	double T135_lc1_m, T135_lc1_C, T135_lc1_borderX, T135_lc1_borderY;
	boolean T135_lc2_horizontal, T135_lc2_vertical, T135_lc2_leftOrAbove, T135_lc2_cached;
	double T135_lc2_m, T135_lc2_C, T135_lc2_borderX, T135_lc2_borderY;
	boolean T135_lc3_horizontal, T135_lc3_vertical, T135_lc3_leftOrAbove, T135_lc3_cached;
	double T135_lc3_m, T135_lc3_C, T135_lc3_borderX, T135_lc3_borderY;
	int T135_r, T135_g, T135_b, T135_lc1_lastY = Integer.MIN_VALUE, T135_lc2_lastY = Integer.MIN_VALUE, T135_lc3_lastY = Integer.MIN_VALUE;

	boolean T136_initializedWithValidData = false, T136_okay = false;
	double T136_sx, T136_sy, T136_minx, T136_miny, T136_maxx, T136_maxy;
	boolean T136_lc1_horizontal, T136_lc1_vertical, T136_lc1_leftOrAbove, T136_lc1_cached;
	double T136_lc1_m, T136_lc1_C, T136_lc1_borderX, T136_lc1_borderY;
	boolean T136_lc2_horizontal, T136_lc2_vertical, T136_lc2_leftOrAbove, T136_lc2_cached;
	double T136_lc2_m, T136_lc2_C, T136_lc2_borderX, T136_lc2_borderY;
	boolean T136_lc3_horizontal, T136_lc3_vertical, T136_lc3_leftOrAbove, T136_lc3_cached;
	double T136_lc3_m, T136_lc3_C, T136_lc3_borderX, T136_lc3_borderY;
	int T136_r, T136_g, T136_b, T136_lc1_lastY = Integer.MIN_VALUE, T136_lc2_lastY = Integer.MIN_VALUE, T136_lc3_lastY = Integer.MIN_VALUE;

	boolean T137_initializedWithValidData = false, T137_okay = false;
	double T137_sx, T137_sy, T137_minx, T137_miny, T137_maxx, T137_maxy;
	boolean T137_lc1_horizontal, T137_lc1_vertical, T137_lc1_leftOrAbove, T137_lc1_cached;
	double T137_lc1_m, T137_lc1_C, T137_lc1_borderX, T137_lc1_borderY;
	boolean T137_lc2_horizontal, T137_lc2_vertical, T137_lc2_leftOrAbove, T137_lc2_cached;
	double T137_lc2_m, T137_lc2_C, T137_lc2_borderX, T137_lc2_borderY;
	boolean T137_lc3_horizontal, T137_lc3_vertical, T137_lc3_leftOrAbove, T137_lc3_cached;
	double T137_lc3_m, T137_lc3_C, T137_lc3_borderX, T137_lc3_borderY;
	int T137_r, T137_g, T137_b, T137_lc1_lastY = Integer.MIN_VALUE, T137_lc2_lastY = Integer.MIN_VALUE, T137_lc3_lastY = Integer.MIN_VALUE;

	boolean T138_initializedWithValidData = false, T138_okay = false;
	double T138_sx, T138_sy, T138_minx, T138_miny, T138_maxx, T138_maxy;
	boolean T138_lc1_horizontal, T138_lc1_vertical, T138_lc1_leftOrAbove, T138_lc1_cached;
	double T138_lc1_m, T138_lc1_C, T138_lc1_borderX, T138_lc1_borderY;
	boolean T138_lc2_horizontal, T138_lc2_vertical, T138_lc2_leftOrAbove, T138_lc2_cached;
	double T138_lc2_m, T138_lc2_C, T138_lc2_borderX, T138_lc2_borderY;
	boolean T138_lc3_horizontal, T138_lc3_vertical, T138_lc3_leftOrAbove, T138_lc3_cached;
	double T138_lc3_m, T138_lc3_C, T138_lc3_borderX, T138_lc3_borderY;
	int T138_r, T138_g, T138_b, T138_lc1_lastY = Integer.MIN_VALUE, T138_lc2_lastY = Integer.MIN_VALUE, T138_lc3_lastY = Integer.MIN_VALUE;

	boolean T139_initializedWithValidData = false, T139_okay = false;
	double T139_sx, T139_sy, T139_minx, T139_miny, T139_maxx, T139_maxy;
	boolean T139_lc1_horizontal, T139_lc1_vertical, T139_lc1_leftOrAbove, T139_lc1_cached;
	double T139_lc1_m, T139_lc1_C, T139_lc1_borderX, T139_lc1_borderY;
	boolean T139_lc2_horizontal, T139_lc2_vertical, T139_lc2_leftOrAbove, T139_lc2_cached;
	double T139_lc2_m, T139_lc2_C, T139_lc2_borderX, T139_lc2_borderY;
	boolean T139_lc3_horizontal, T139_lc3_vertical, T139_lc3_leftOrAbove, T139_lc3_cached;
	double T139_lc3_m, T139_lc3_C, T139_lc3_borderX, T139_lc3_borderY;
	int T139_r, T139_g, T139_b, T139_lc1_lastY = Integer.MIN_VALUE, T139_lc2_lastY = Integer.MIN_VALUE, T139_lc3_lastY = Integer.MIN_VALUE;

	boolean T140_initializedWithValidData = false, T140_okay = false;
	double T140_sx, T140_sy, T140_minx, T140_miny, T140_maxx, T140_maxy;
	boolean T140_lc1_horizontal, T140_lc1_vertical, T140_lc1_leftOrAbove, T140_lc1_cached;
	double T140_lc1_m, T140_lc1_C, T140_lc1_borderX, T140_lc1_borderY;
	boolean T140_lc2_horizontal, T140_lc2_vertical, T140_lc2_leftOrAbove, T140_lc2_cached;
	double T140_lc2_m, T140_lc2_C, T140_lc2_borderX, T140_lc2_borderY;
	boolean T140_lc3_horizontal, T140_lc3_vertical, T140_lc3_leftOrAbove, T140_lc3_cached;
	double T140_lc3_m, T140_lc3_C, T140_lc3_borderX, T140_lc3_borderY;
	int T140_r, T140_g, T140_b, T140_lc1_lastY = Integer.MIN_VALUE, T140_lc2_lastY = Integer.MIN_VALUE, T140_lc3_lastY = Integer.MIN_VALUE;

	boolean T141_initializedWithValidData = false, T141_okay = false;
	double T141_sx, T141_sy, T141_minx, T141_miny, T141_maxx, T141_maxy;
	boolean T141_lc1_horizontal, T141_lc1_vertical, T141_lc1_leftOrAbove, T141_lc1_cached;
	double T141_lc1_m, T141_lc1_C, T141_lc1_borderX, T141_lc1_borderY;
	boolean T141_lc2_horizontal, T141_lc2_vertical, T141_lc2_leftOrAbove, T141_lc2_cached;
	double T141_lc2_m, T141_lc2_C, T141_lc2_borderX, T141_lc2_borderY;
	boolean T141_lc3_horizontal, T141_lc3_vertical, T141_lc3_leftOrAbove, T141_lc3_cached;
	double T141_lc3_m, T141_lc3_C, T141_lc3_borderX, T141_lc3_borderY;
	int T141_r, T141_g, T141_b, T141_lc1_lastY = Integer.MIN_VALUE, T141_lc2_lastY = Integer.MIN_VALUE, T141_lc3_lastY = Integer.MIN_VALUE;

	boolean T142_initializedWithValidData = false, T142_okay = false;
	double T142_sx, T142_sy, T142_minx, T142_miny, T142_maxx, T142_maxy;
	boolean T142_lc1_horizontal, T142_lc1_vertical, T142_lc1_leftOrAbove, T142_lc1_cached;
	double T142_lc1_m, T142_lc1_C, T142_lc1_borderX, T142_lc1_borderY;
	boolean T142_lc2_horizontal, T142_lc2_vertical, T142_lc2_leftOrAbove, T142_lc2_cached;
	double T142_lc2_m, T142_lc2_C, T142_lc2_borderX, T142_lc2_borderY;
	boolean T142_lc3_horizontal, T142_lc3_vertical, T142_lc3_leftOrAbove, T142_lc3_cached;
	double T142_lc3_m, T142_lc3_C, T142_lc3_borderX, T142_lc3_borderY;
	int T142_r, T142_g, T142_b, T142_lc1_lastY = Integer.MIN_VALUE, T142_lc2_lastY = Integer.MIN_VALUE, T142_lc3_lastY = Integer.MIN_VALUE;

	boolean T143_initializedWithValidData = false, T143_okay = false;
	double T143_sx, T143_sy, T143_minx, T143_miny, T143_maxx, T143_maxy;
	boolean T143_lc1_horizontal, T143_lc1_vertical, T143_lc1_leftOrAbove, T143_lc1_cached;
	double T143_lc1_m, T143_lc1_C, T143_lc1_borderX, T143_lc1_borderY;
	boolean T143_lc2_horizontal, T143_lc2_vertical, T143_lc2_leftOrAbove, T143_lc2_cached;
	double T143_lc2_m, T143_lc2_C, T143_lc2_borderX, T143_lc2_borderY;
	boolean T143_lc3_horizontal, T143_lc3_vertical, T143_lc3_leftOrAbove, T143_lc3_cached;
	double T143_lc3_m, T143_lc3_C, T143_lc3_borderX, T143_lc3_borderY;
	int T143_r, T143_g, T143_b, T143_lc1_lastY = Integer.MIN_VALUE, T143_lc2_lastY = Integer.MIN_VALUE, T143_lc3_lastY = Integer.MIN_VALUE;

	boolean T144_initializedWithValidData = false, T144_okay = false;
	double T144_sx, T144_sy, T144_minx, T144_miny, T144_maxx, T144_maxy;
	boolean T144_lc1_horizontal, T144_lc1_vertical, T144_lc1_leftOrAbove, T144_lc1_cached;
	double T144_lc1_m, T144_lc1_C, T144_lc1_borderX, T144_lc1_borderY;
	boolean T144_lc2_horizontal, T144_lc2_vertical, T144_lc2_leftOrAbove, T144_lc2_cached;
	double T144_lc2_m, T144_lc2_C, T144_lc2_borderX, T144_lc2_borderY;
	boolean T144_lc3_horizontal, T144_lc3_vertical, T144_lc3_leftOrAbove, T144_lc3_cached;
	double T144_lc3_m, T144_lc3_C, T144_lc3_borderX, T144_lc3_borderY;
	int T144_r, T144_g, T144_b, T144_lc1_lastY = Integer.MIN_VALUE, T144_lc2_lastY = Integer.MIN_VALUE, T144_lc3_lastY = Integer.MIN_VALUE;

	boolean T145_initializedWithValidData = false, T145_okay = false;
	double T145_sx, T145_sy, T145_minx, T145_miny, T145_maxx, T145_maxy;
	boolean T145_lc1_horizontal, T145_lc1_vertical, T145_lc1_leftOrAbove, T145_lc1_cached;
	double T145_lc1_m, T145_lc1_C, T145_lc1_borderX, T145_lc1_borderY;
	boolean T145_lc2_horizontal, T145_lc2_vertical, T145_lc2_leftOrAbove, T145_lc2_cached;
	double T145_lc2_m, T145_lc2_C, T145_lc2_borderX, T145_lc2_borderY;
	boolean T145_lc3_horizontal, T145_lc3_vertical, T145_lc3_leftOrAbove, T145_lc3_cached;
	double T145_lc3_m, T145_lc3_C, T145_lc3_borderX, T145_lc3_borderY;
	int T145_r, T145_g, T145_b, T145_lc1_lastY = Integer.MIN_VALUE, T145_lc2_lastY = Integer.MIN_VALUE, T145_lc3_lastY = Integer.MIN_VALUE;

	boolean T146_initializedWithValidData = false, T146_okay = false;
	double T146_sx, T146_sy, T146_minx, T146_miny, T146_maxx, T146_maxy;
	boolean T146_lc1_horizontal, T146_lc1_vertical, T146_lc1_leftOrAbove, T146_lc1_cached;
	double T146_lc1_m, T146_lc1_C, T146_lc1_borderX, T146_lc1_borderY;
	boolean T146_lc2_horizontal, T146_lc2_vertical, T146_lc2_leftOrAbove, T146_lc2_cached;
	double T146_lc2_m, T146_lc2_C, T146_lc2_borderX, T146_lc2_borderY;
	boolean T146_lc3_horizontal, T146_lc3_vertical, T146_lc3_leftOrAbove, T146_lc3_cached;
	double T146_lc3_m, T146_lc3_C, T146_lc3_borderX, T146_lc3_borderY;
	int T146_r, T146_g, T146_b, T146_lc1_lastY = Integer.MIN_VALUE, T146_lc2_lastY = Integer.MIN_VALUE, T146_lc3_lastY = Integer.MIN_VALUE;

	boolean T147_initializedWithValidData = false, T147_okay = false;
	double T147_sx, T147_sy, T147_minx, T147_miny, T147_maxx, T147_maxy;
	boolean T147_lc1_horizontal, T147_lc1_vertical, T147_lc1_leftOrAbove, T147_lc1_cached;
	double T147_lc1_m, T147_lc1_C, T147_lc1_borderX, T147_lc1_borderY;
	boolean T147_lc2_horizontal, T147_lc2_vertical, T147_lc2_leftOrAbove, T147_lc2_cached;
	double T147_lc2_m, T147_lc2_C, T147_lc2_borderX, T147_lc2_borderY;
	boolean T147_lc3_horizontal, T147_lc3_vertical, T147_lc3_leftOrAbove, T147_lc3_cached;
	double T147_lc3_m, T147_lc3_C, T147_lc3_borderX, T147_lc3_borderY;
	int T147_r, T147_g, T147_b, T147_lc1_lastY = Integer.MIN_VALUE, T147_lc2_lastY = Integer.MIN_VALUE, T147_lc3_lastY = Integer.MIN_VALUE;

	boolean T148_initializedWithValidData = false, T148_okay = false;
	double T148_sx, T148_sy, T148_minx, T148_miny, T148_maxx, T148_maxy;
	boolean T148_lc1_horizontal, T148_lc1_vertical, T148_lc1_leftOrAbove, T148_lc1_cached;
	double T148_lc1_m, T148_lc1_C, T148_lc1_borderX, T148_lc1_borderY;
	boolean T148_lc2_horizontal, T148_lc2_vertical, T148_lc2_leftOrAbove, T148_lc2_cached;
	double T148_lc2_m, T148_lc2_C, T148_lc2_borderX, T148_lc2_borderY;
	boolean T148_lc3_horizontal, T148_lc3_vertical, T148_lc3_leftOrAbove, T148_lc3_cached;
	double T148_lc3_m, T148_lc3_C, T148_lc3_borderX, T148_lc3_borderY;
	int T148_r, T148_g, T148_b, T148_lc1_lastY = Integer.MIN_VALUE, T148_lc2_lastY = Integer.MIN_VALUE, T148_lc3_lastY = Integer.MIN_VALUE;

	boolean T149_initializedWithValidData = false, T149_okay = false;
	double T149_sx, T149_sy, T149_minx, T149_miny, T149_maxx, T149_maxy;
	boolean T149_lc1_horizontal, T149_lc1_vertical, T149_lc1_leftOrAbove, T149_lc1_cached;
	double T149_lc1_m, T149_lc1_C, T149_lc1_borderX, T149_lc1_borderY;
	boolean T149_lc2_horizontal, T149_lc2_vertical, T149_lc2_leftOrAbove, T149_lc2_cached;
	double T149_lc2_m, T149_lc2_C, T149_lc2_borderX, T149_lc2_borderY;
	boolean T149_lc3_horizontal, T149_lc3_vertical, T149_lc3_leftOrAbove, T149_lc3_cached;
	double T149_lc3_m, T149_lc3_C, T149_lc3_borderX, T149_lc3_borderY;
	int T149_r, T149_g, T149_b, T149_lc1_lastY = Integer.MIN_VALUE, T149_lc2_lastY = Integer.MIN_VALUE, T149_lc3_lastY = Integer.MIN_VALUE;

	boolean T150_initializedWithValidData = false, T150_okay = false;
	double T150_sx, T150_sy, T150_minx, T150_miny, T150_maxx, T150_maxy;
	boolean T150_lc1_horizontal, T150_lc1_vertical, T150_lc1_leftOrAbove, T150_lc1_cached;
	double T150_lc1_m, T150_lc1_C, T150_lc1_borderX, T150_lc1_borderY;
	boolean T150_lc2_horizontal, T150_lc2_vertical, T150_lc2_leftOrAbove, T150_lc2_cached;
	double T150_lc2_m, T150_lc2_C, T150_lc2_borderX, T150_lc2_borderY;
	boolean T150_lc3_horizontal, T150_lc3_vertical, T150_lc3_leftOrAbove, T150_lc3_cached;
	double T150_lc3_m, T150_lc3_C, T150_lc3_borderX, T150_lc3_borderY;
	int T150_r, T150_g, T150_b, T150_lc1_lastY = Integer.MIN_VALUE, T150_lc2_lastY = Integer.MIN_VALUE, T150_lc3_lastY = Integer.MIN_VALUE;

	boolean T151_initializedWithValidData = false, T151_okay = false;
	double T151_sx, T151_sy, T151_minx, T151_miny, T151_maxx, T151_maxy;
	boolean T151_lc1_horizontal, T151_lc1_vertical, T151_lc1_leftOrAbove, T151_lc1_cached;
	double T151_lc1_m, T151_lc1_C, T151_lc1_borderX, T151_lc1_borderY;
	boolean T151_lc2_horizontal, T151_lc2_vertical, T151_lc2_leftOrAbove, T151_lc2_cached;
	double T151_lc2_m, T151_lc2_C, T151_lc2_borderX, T151_lc2_borderY;
	boolean T151_lc3_horizontal, T151_lc3_vertical, T151_lc3_leftOrAbove, T151_lc3_cached;
	double T151_lc3_m, T151_lc3_C, T151_lc3_borderX, T151_lc3_borderY;
	int T151_r, T151_g, T151_b, T151_lc1_lastY = Integer.MIN_VALUE, T151_lc2_lastY = Integer.MIN_VALUE, T151_lc3_lastY = Integer.MIN_VALUE;

	boolean T152_initializedWithValidData = false, T152_okay = false;
	double T152_sx, T152_sy, T152_minx, T152_miny, T152_maxx, T152_maxy;
	boolean T152_lc1_horizontal, T152_lc1_vertical, T152_lc1_leftOrAbove, T152_lc1_cached;
	double T152_lc1_m, T152_lc1_C, T152_lc1_borderX, T152_lc1_borderY;
	boolean T152_lc2_horizontal, T152_lc2_vertical, T152_lc2_leftOrAbove, T152_lc2_cached;
	double T152_lc2_m, T152_lc2_C, T152_lc2_borderX, T152_lc2_borderY;
	boolean T152_lc3_horizontal, T152_lc3_vertical, T152_lc3_leftOrAbove, T152_lc3_cached;
	double T152_lc3_m, T152_lc3_C, T152_lc3_borderX, T152_lc3_borderY;
	int T152_r, T152_g, T152_b, T152_lc1_lastY = Integer.MIN_VALUE, T152_lc2_lastY = Integer.MIN_VALUE, T152_lc3_lastY = Integer.MIN_VALUE;

	boolean T153_initializedWithValidData = false, T153_okay = false;
	double T153_sx, T153_sy, T153_minx, T153_miny, T153_maxx, T153_maxy;
	boolean T153_lc1_horizontal, T153_lc1_vertical, T153_lc1_leftOrAbove, T153_lc1_cached;
	double T153_lc1_m, T153_lc1_C, T153_lc1_borderX, T153_lc1_borderY;
	boolean T153_lc2_horizontal, T153_lc2_vertical, T153_lc2_leftOrAbove, T153_lc2_cached;
	double T153_lc2_m, T153_lc2_C, T153_lc2_borderX, T153_lc2_borderY;
	boolean T153_lc3_horizontal, T153_lc3_vertical, T153_lc3_leftOrAbove, T153_lc3_cached;
	double T153_lc3_m, T153_lc3_C, T153_lc3_borderX, T153_lc3_borderY;
	int T153_r, T153_g, T153_b, T153_lc1_lastY = Integer.MIN_VALUE, T153_lc2_lastY = Integer.MIN_VALUE, T153_lc3_lastY = Integer.MIN_VALUE;

	boolean T154_initializedWithValidData = false, T154_okay = false;
	double T154_sx, T154_sy, T154_minx, T154_miny, T154_maxx, T154_maxy;
	boolean T154_lc1_horizontal, T154_lc1_vertical, T154_lc1_leftOrAbove, T154_lc1_cached;
	double T154_lc1_m, T154_lc1_C, T154_lc1_borderX, T154_lc1_borderY;
	boolean T154_lc2_horizontal, T154_lc2_vertical, T154_lc2_leftOrAbove, T154_lc2_cached;
	double T154_lc2_m, T154_lc2_C, T154_lc2_borderX, T154_lc2_borderY;
	boolean T154_lc3_horizontal, T154_lc3_vertical, T154_lc3_leftOrAbove, T154_lc3_cached;
	double T154_lc3_m, T154_lc3_C, T154_lc3_borderX, T154_lc3_borderY;
	int T154_r, T154_g, T154_b, T154_lc1_lastY = Integer.MIN_VALUE, T154_lc2_lastY = Integer.MIN_VALUE, T154_lc3_lastY = Integer.MIN_VALUE;

	boolean T155_initializedWithValidData = false, T155_okay = false;
	double T155_sx, T155_sy, T155_minx, T155_miny, T155_maxx, T155_maxy;
	boolean T155_lc1_horizontal, T155_lc1_vertical, T155_lc1_leftOrAbove, T155_lc1_cached;
	double T155_lc1_m, T155_lc1_C, T155_lc1_borderX, T155_lc1_borderY;
	boolean T155_lc2_horizontal, T155_lc2_vertical, T155_lc2_leftOrAbove, T155_lc2_cached;
	double T155_lc2_m, T155_lc2_C, T155_lc2_borderX, T155_lc2_borderY;
	boolean T155_lc3_horizontal, T155_lc3_vertical, T155_lc3_leftOrAbove, T155_lc3_cached;
	double T155_lc3_m, T155_lc3_C, T155_lc3_borderX, T155_lc3_borderY;
	int T155_r, T155_g, T155_b, T155_lc1_lastY = Integer.MIN_VALUE, T155_lc2_lastY = Integer.MIN_VALUE, T155_lc3_lastY = Integer.MIN_VALUE;

	boolean T156_initializedWithValidData = false, T156_okay = false;
	double T156_sx, T156_sy, T156_minx, T156_miny, T156_maxx, T156_maxy;
	boolean T156_lc1_horizontal, T156_lc1_vertical, T156_lc1_leftOrAbove, T156_lc1_cached;
	double T156_lc1_m, T156_lc1_C, T156_lc1_borderX, T156_lc1_borderY;
	boolean T156_lc2_horizontal, T156_lc2_vertical, T156_lc2_leftOrAbove, T156_lc2_cached;
	double T156_lc2_m, T156_lc2_C, T156_lc2_borderX, T156_lc2_borderY;
	boolean T156_lc3_horizontal, T156_lc3_vertical, T156_lc3_leftOrAbove, T156_lc3_cached;
	double T156_lc3_m, T156_lc3_C, T156_lc3_borderX, T156_lc3_borderY;
	int T156_r, T156_g, T156_b, T156_lc1_lastY = Integer.MIN_VALUE, T156_lc2_lastY = Integer.MIN_VALUE, T156_lc3_lastY = Integer.MIN_VALUE;

	boolean T157_initializedWithValidData = false, T157_okay = false;
	double T157_sx, T157_sy, T157_minx, T157_miny, T157_maxx, T157_maxy;
	boolean T157_lc1_horizontal, T157_lc1_vertical, T157_lc1_leftOrAbove, T157_lc1_cached;
	double T157_lc1_m, T157_lc1_C, T157_lc1_borderX, T157_lc1_borderY;
	boolean T157_lc2_horizontal, T157_lc2_vertical, T157_lc2_leftOrAbove, T157_lc2_cached;
	double T157_lc2_m, T157_lc2_C, T157_lc2_borderX, T157_lc2_borderY;
	boolean T157_lc3_horizontal, T157_lc3_vertical, T157_lc3_leftOrAbove, T157_lc3_cached;
	double T157_lc3_m, T157_lc3_C, T157_lc3_borderX, T157_lc3_borderY;
	int T157_r, T157_g, T157_b, T157_lc1_lastY = Integer.MIN_VALUE, T157_lc2_lastY = Integer.MIN_VALUE, T157_lc3_lastY = Integer.MIN_VALUE;

	boolean T158_initializedWithValidData = false, T158_okay = false;
	double T158_sx, T158_sy, T158_minx, T158_miny, T158_maxx, T158_maxy;
	boolean T158_lc1_horizontal, T158_lc1_vertical, T158_lc1_leftOrAbove, T158_lc1_cached;
	double T158_lc1_m, T158_lc1_C, T158_lc1_borderX, T158_lc1_borderY;
	boolean T158_lc2_horizontal, T158_lc2_vertical, T158_lc2_leftOrAbove, T158_lc2_cached;
	double T158_lc2_m, T158_lc2_C, T158_lc2_borderX, T158_lc2_borderY;
	boolean T158_lc3_horizontal, T158_lc3_vertical, T158_lc3_leftOrAbove, T158_lc3_cached;
	double T158_lc3_m, T158_lc3_C, T158_lc3_borderX, T158_lc3_borderY;
	int T158_r, T158_g, T158_b, T158_lc1_lastY = Integer.MIN_VALUE, T158_lc2_lastY = Integer.MIN_VALUE, T158_lc3_lastY = Integer.MIN_VALUE;

	boolean T159_initializedWithValidData = false, T159_okay = false;
	double T159_sx, T159_sy, T159_minx, T159_miny, T159_maxx, T159_maxy;
	boolean T159_lc1_horizontal, T159_lc1_vertical, T159_lc1_leftOrAbove, T159_lc1_cached;
	double T159_lc1_m, T159_lc1_C, T159_lc1_borderX, T159_lc1_borderY;
	boolean T159_lc2_horizontal, T159_lc2_vertical, T159_lc2_leftOrAbove, T159_lc2_cached;
	double T159_lc2_m, T159_lc2_C, T159_lc2_borderX, T159_lc2_borderY;
	boolean T159_lc3_horizontal, T159_lc3_vertical, T159_lc3_leftOrAbove, T159_lc3_cached;
	double T159_lc3_m, T159_lc3_C, T159_lc3_borderX, T159_lc3_borderY;
	int T159_r, T159_g, T159_b, T159_lc1_lastY = Integer.MIN_VALUE, T159_lc2_lastY = Integer.MIN_VALUE, T159_lc3_lastY = Integer.MIN_VALUE;

	boolean T160_initializedWithValidData = false, T160_okay = false;
	double T160_sx, T160_sy, T160_minx, T160_miny, T160_maxx, T160_maxy;
	boolean T160_lc1_horizontal, T160_lc1_vertical, T160_lc1_leftOrAbove, T160_lc1_cached;
	double T160_lc1_m, T160_lc1_C, T160_lc1_borderX, T160_lc1_borderY;
	boolean T160_lc2_horizontal, T160_lc2_vertical, T160_lc2_leftOrAbove, T160_lc2_cached;
	double T160_lc2_m, T160_lc2_C, T160_lc2_borderX, T160_lc2_borderY;
	boolean T160_lc3_horizontal, T160_lc3_vertical, T160_lc3_leftOrAbove, T160_lc3_cached;
	double T160_lc3_m, T160_lc3_C, T160_lc3_borderX, T160_lc3_borderY;
	int T160_r, T160_g, T160_b, T160_lc1_lastY = Integer.MIN_VALUE, T160_lc2_lastY = Integer.MIN_VALUE, T160_lc3_lastY = Integer.MIN_VALUE;

	boolean T161_initializedWithValidData = false, T161_okay = false;
	double T161_sx, T161_sy, T161_minx, T161_miny, T161_maxx, T161_maxy;
	boolean T161_lc1_horizontal, T161_lc1_vertical, T161_lc1_leftOrAbove, T161_lc1_cached;
	double T161_lc1_m, T161_lc1_C, T161_lc1_borderX, T161_lc1_borderY;
	boolean T161_lc2_horizontal, T161_lc2_vertical, T161_lc2_leftOrAbove, T161_lc2_cached;
	double T161_lc2_m, T161_lc2_C, T161_lc2_borderX, T161_lc2_borderY;
	boolean T161_lc3_horizontal, T161_lc3_vertical, T161_lc3_leftOrAbove, T161_lc3_cached;
	double T161_lc3_m, T161_lc3_C, T161_lc3_borderX, T161_lc3_borderY;
	int T161_r, T161_g, T161_b, T161_lc1_lastY = Integer.MIN_VALUE, T161_lc2_lastY = Integer.MIN_VALUE, T161_lc3_lastY = Integer.MIN_VALUE;

	boolean T162_initializedWithValidData = false, T162_okay = false;
	double T162_sx, T162_sy, T162_minx, T162_miny, T162_maxx, T162_maxy;
	boolean T162_lc1_horizontal, T162_lc1_vertical, T162_lc1_leftOrAbove, T162_lc1_cached;
	double T162_lc1_m, T162_lc1_C, T162_lc1_borderX, T162_lc1_borderY;
	boolean T162_lc2_horizontal, T162_lc2_vertical, T162_lc2_leftOrAbove, T162_lc2_cached;
	double T162_lc2_m, T162_lc2_C, T162_lc2_borderX, T162_lc2_borderY;
	boolean T162_lc3_horizontal, T162_lc3_vertical, T162_lc3_leftOrAbove, T162_lc3_cached;
	double T162_lc3_m, T162_lc3_C, T162_lc3_borderX, T162_lc3_borderY;
	int T162_r, T162_g, T162_b, T162_lc1_lastY = Integer.MIN_VALUE, T162_lc2_lastY = Integer.MIN_VALUE, T162_lc3_lastY = Integer.MIN_VALUE;

	boolean T163_initializedWithValidData = false, T163_okay = false;
	double T163_sx, T163_sy, T163_minx, T163_miny, T163_maxx, T163_maxy;
	boolean T163_lc1_horizontal, T163_lc1_vertical, T163_lc1_leftOrAbove, T163_lc1_cached;
	double T163_lc1_m, T163_lc1_C, T163_lc1_borderX, T163_lc1_borderY;
	boolean T163_lc2_horizontal, T163_lc2_vertical, T163_lc2_leftOrAbove, T163_lc2_cached;
	double T163_lc2_m, T163_lc2_C, T163_lc2_borderX, T163_lc2_borderY;
	boolean T163_lc3_horizontal, T163_lc3_vertical, T163_lc3_leftOrAbove, T163_lc3_cached;
	double T163_lc3_m, T163_lc3_C, T163_lc3_borderX, T163_lc3_borderY;
	int T163_r, T163_g, T163_b, T163_lc1_lastY = Integer.MIN_VALUE, T163_lc2_lastY = Integer.MIN_VALUE, T163_lc3_lastY = Integer.MIN_VALUE;

	boolean T164_initializedWithValidData = false, T164_okay = false;
	double T164_sx, T164_sy, T164_minx, T164_miny, T164_maxx, T164_maxy;
	boolean T164_lc1_horizontal, T164_lc1_vertical, T164_lc1_leftOrAbove, T164_lc1_cached;
	double T164_lc1_m, T164_lc1_C, T164_lc1_borderX, T164_lc1_borderY;
	boolean T164_lc2_horizontal, T164_lc2_vertical, T164_lc2_leftOrAbove, T164_lc2_cached;
	double T164_lc2_m, T164_lc2_C, T164_lc2_borderX, T164_lc2_borderY;
	boolean T164_lc3_horizontal, T164_lc3_vertical, T164_lc3_leftOrAbove, T164_lc3_cached;
	double T164_lc3_m, T164_lc3_C, T164_lc3_borderX, T164_lc3_borderY;
	int T164_r, T164_g, T164_b, T164_lc1_lastY = Integer.MIN_VALUE, T164_lc2_lastY = Integer.MIN_VALUE, T164_lc3_lastY = Integer.MIN_VALUE;

	boolean T165_initializedWithValidData = false, T165_okay = false;
	double T165_sx, T165_sy, T165_minx, T165_miny, T165_maxx, T165_maxy;
	boolean T165_lc1_horizontal, T165_lc1_vertical, T165_lc1_leftOrAbove, T165_lc1_cached;
	double T165_lc1_m, T165_lc1_C, T165_lc1_borderX, T165_lc1_borderY;
	boolean T165_lc2_horizontal, T165_lc2_vertical, T165_lc2_leftOrAbove, T165_lc2_cached;
	double T165_lc2_m, T165_lc2_C, T165_lc2_borderX, T165_lc2_borderY;
	boolean T165_lc3_horizontal, T165_lc3_vertical, T165_lc3_leftOrAbove, T165_lc3_cached;
	double T165_lc3_m, T165_lc3_C, T165_lc3_borderX, T165_lc3_borderY;
	int T165_r, T165_g, T165_b, T165_lc1_lastY = Integer.MIN_VALUE, T165_lc2_lastY = Integer.MIN_VALUE, T165_lc3_lastY = Integer.MIN_VALUE;

	boolean T166_initializedWithValidData = false, T166_okay = false;
	double T166_sx, T166_sy, T166_minx, T166_miny, T166_maxx, T166_maxy;
	boolean T166_lc1_horizontal, T166_lc1_vertical, T166_lc1_leftOrAbove, T166_lc1_cached;
	double T166_lc1_m, T166_lc1_C, T166_lc1_borderX, T166_lc1_borderY;
	boolean T166_lc2_horizontal, T166_lc2_vertical, T166_lc2_leftOrAbove, T166_lc2_cached;
	double T166_lc2_m, T166_lc2_C, T166_lc2_borderX, T166_lc2_borderY;
	boolean T166_lc3_horizontal, T166_lc3_vertical, T166_lc3_leftOrAbove, T166_lc3_cached;
	double T166_lc3_m, T166_lc3_C, T166_lc3_borderX, T166_lc3_borderY;
	int T166_r, T166_g, T166_b, T166_lc1_lastY = Integer.MIN_VALUE, T166_lc2_lastY = Integer.MIN_VALUE, T166_lc3_lastY = Integer.MIN_VALUE;

	boolean T167_initializedWithValidData = false, T167_okay = false;
	double T167_sx, T167_sy, T167_minx, T167_miny, T167_maxx, T167_maxy;
	boolean T167_lc1_horizontal, T167_lc1_vertical, T167_lc1_leftOrAbove, T167_lc1_cached;
	double T167_lc1_m, T167_lc1_C, T167_lc1_borderX, T167_lc1_borderY;
	boolean T167_lc2_horizontal, T167_lc2_vertical, T167_lc2_leftOrAbove, T167_lc2_cached;
	double T167_lc2_m, T167_lc2_C, T167_lc2_borderX, T167_lc2_borderY;
	boolean T167_lc3_horizontal, T167_lc3_vertical, T167_lc3_leftOrAbove, T167_lc3_cached;
	double T167_lc3_m, T167_lc3_C, T167_lc3_borderX, T167_lc3_borderY;
	int T167_r, T167_g, T167_b, T167_lc1_lastY = Integer.MIN_VALUE, T167_lc2_lastY = Integer.MIN_VALUE, T167_lc3_lastY = Integer.MIN_VALUE;

	boolean T168_initializedWithValidData = false, T168_okay = false;
	double T168_sx, T168_sy, T168_minx, T168_miny, T168_maxx, T168_maxy;
	boolean T168_lc1_horizontal, T168_lc1_vertical, T168_lc1_leftOrAbove, T168_lc1_cached;
	double T168_lc1_m, T168_lc1_C, T168_lc1_borderX, T168_lc1_borderY;
	boolean T168_lc2_horizontal, T168_lc2_vertical, T168_lc2_leftOrAbove, T168_lc2_cached;
	double T168_lc2_m, T168_lc2_C, T168_lc2_borderX, T168_lc2_borderY;
	boolean T168_lc3_horizontal, T168_lc3_vertical, T168_lc3_leftOrAbove, T168_lc3_cached;
	double T168_lc3_m, T168_lc3_C, T168_lc3_borderX, T168_lc3_borderY;
	int T168_r, T168_g, T168_b, T168_lc1_lastY = Integer.MIN_VALUE, T168_lc2_lastY = Integer.MIN_VALUE, T168_lc3_lastY = Integer.MIN_VALUE;

	boolean T169_initializedWithValidData = false, T169_okay = false;
	double T169_sx, T169_sy, T169_minx, T169_miny, T169_maxx, T169_maxy;
	boolean T169_lc1_horizontal, T169_lc1_vertical, T169_lc1_leftOrAbove, T169_lc1_cached;
	double T169_lc1_m, T169_lc1_C, T169_lc1_borderX, T169_lc1_borderY;
	boolean T169_lc2_horizontal, T169_lc2_vertical, T169_lc2_leftOrAbove, T169_lc2_cached;
	double T169_lc2_m, T169_lc2_C, T169_lc2_borderX, T169_lc2_borderY;
	boolean T169_lc3_horizontal, T169_lc3_vertical, T169_lc3_leftOrAbove, T169_lc3_cached;
	double T169_lc3_m, T169_lc3_C, T169_lc3_borderX, T169_lc3_borderY;
	int T169_r, T169_g, T169_b, T169_lc1_lastY = Integer.MIN_VALUE, T169_lc2_lastY = Integer.MIN_VALUE, T169_lc3_lastY = Integer.MIN_VALUE;

	boolean T170_initializedWithValidData = false, T170_okay = false;
	double T170_sx, T170_sy, T170_minx, T170_miny, T170_maxx, T170_maxy;
	boolean T170_lc1_horizontal, T170_lc1_vertical, T170_lc1_leftOrAbove, T170_lc1_cached;
	double T170_lc1_m, T170_lc1_C, T170_lc1_borderX, T170_lc1_borderY;
	boolean T170_lc2_horizontal, T170_lc2_vertical, T170_lc2_leftOrAbove, T170_lc2_cached;
	double T170_lc2_m, T170_lc2_C, T170_lc2_borderX, T170_lc2_borderY;
	boolean T170_lc3_horizontal, T170_lc3_vertical, T170_lc3_leftOrAbove, T170_lc3_cached;
	double T170_lc3_m, T170_lc3_C, T170_lc3_borderX, T170_lc3_borderY;
	int T170_r, T170_g, T170_b, T170_lc1_lastY = Integer.MIN_VALUE, T170_lc2_lastY = Integer.MIN_VALUE, T170_lc3_lastY = Integer.MIN_VALUE;

	boolean T171_initializedWithValidData = false, T171_okay = false;
	double T171_sx, T171_sy, T171_minx, T171_miny, T171_maxx, T171_maxy;
	boolean T171_lc1_horizontal, T171_lc1_vertical, T171_lc1_leftOrAbove, T171_lc1_cached;
	double T171_lc1_m, T171_lc1_C, T171_lc1_borderX, T171_lc1_borderY;
	boolean T171_lc2_horizontal, T171_lc2_vertical, T171_lc2_leftOrAbove, T171_lc2_cached;
	double T171_lc2_m, T171_lc2_C, T171_lc2_borderX, T171_lc2_borderY;
	boolean T171_lc3_horizontal, T171_lc3_vertical, T171_lc3_leftOrAbove, T171_lc3_cached;
	double T171_lc3_m, T171_lc3_C, T171_lc3_borderX, T171_lc3_borderY;
	int T171_r, T171_g, T171_b, T171_lc1_lastY = Integer.MIN_VALUE, T171_lc2_lastY = Integer.MIN_VALUE, T171_lc3_lastY = Integer.MIN_VALUE;

	boolean T172_initializedWithValidData = false, T172_okay = false;
	double T172_sx, T172_sy, T172_minx, T172_miny, T172_maxx, T172_maxy;
	boolean T172_lc1_horizontal, T172_lc1_vertical, T172_lc1_leftOrAbove, T172_lc1_cached;
	double T172_lc1_m, T172_lc1_C, T172_lc1_borderX, T172_lc1_borderY;
	boolean T172_lc2_horizontal, T172_lc2_vertical, T172_lc2_leftOrAbove, T172_lc2_cached;
	double T172_lc2_m, T172_lc2_C, T172_lc2_borderX, T172_lc2_borderY;
	boolean T172_lc3_horizontal, T172_lc3_vertical, T172_lc3_leftOrAbove, T172_lc3_cached;
	double T172_lc3_m, T172_lc3_C, T172_lc3_borderX, T172_lc3_borderY;
	int T172_r, T172_g, T172_b, T172_lc1_lastY = Integer.MIN_VALUE, T172_lc2_lastY = Integer.MIN_VALUE, T172_lc3_lastY = Integer.MIN_VALUE;

	boolean T173_initializedWithValidData = false, T173_okay = false;
	double T173_sx, T173_sy, T173_minx, T173_miny, T173_maxx, T173_maxy;
	boolean T173_lc1_horizontal, T173_lc1_vertical, T173_lc1_leftOrAbove, T173_lc1_cached;
	double T173_lc1_m, T173_lc1_C, T173_lc1_borderX, T173_lc1_borderY;
	boolean T173_lc2_horizontal, T173_lc2_vertical, T173_lc2_leftOrAbove, T173_lc2_cached;
	double T173_lc2_m, T173_lc2_C, T173_lc2_borderX, T173_lc2_borderY;
	boolean T173_lc3_horizontal, T173_lc3_vertical, T173_lc3_leftOrAbove, T173_lc3_cached;
	double T173_lc3_m, T173_lc3_C, T173_lc3_borderX, T173_lc3_borderY;
	int T173_r, T173_g, T173_b, T173_lc1_lastY = Integer.MIN_VALUE, T173_lc2_lastY = Integer.MIN_VALUE, T173_lc3_lastY = Integer.MIN_VALUE;

	boolean T174_initializedWithValidData = false, T174_okay = false;
	double T174_sx, T174_sy, T174_minx, T174_miny, T174_maxx, T174_maxy;
	boolean T174_lc1_horizontal, T174_lc1_vertical, T174_lc1_leftOrAbove, T174_lc1_cached;
	double T174_lc1_m, T174_lc1_C, T174_lc1_borderX, T174_lc1_borderY;
	boolean T174_lc2_horizontal, T174_lc2_vertical, T174_lc2_leftOrAbove, T174_lc2_cached;
	double T174_lc2_m, T174_lc2_C, T174_lc2_borderX, T174_lc2_borderY;
	boolean T174_lc3_horizontal, T174_lc3_vertical, T174_lc3_leftOrAbove, T174_lc3_cached;
	double T174_lc3_m, T174_lc3_C, T174_lc3_borderX, T174_lc3_borderY;
	int T174_r, T174_g, T174_b, T174_lc1_lastY = Integer.MIN_VALUE, T174_lc2_lastY = Integer.MIN_VALUE, T174_lc3_lastY = Integer.MIN_VALUE;

	boolean T175_initializedWithValidData = false, T175_okay = false;
	double T175_sx, T175_sy, T175_minx, T175_miny, T175_maxx, T175_maxy;
	boolean T175_lc1_horizontal, T175_lc1_vertical, T175_lc1_leftOrAbove, T175_lc1_cached;
	double T175_lc1_m, T175_lc1_C, T175_lc1_borderX, T175_lc1_borderY;
	boolean T175_lc2_horizontal, T175_lc2_vertical, T175_lc2_leftOrAbove, T175_lc2_cached;
	double T175_lc2_m, T175_lc2_C, T175_lc2_borderX, T175_lc2_borderY;
	boolean T175_lc3_horizontal, T175_lc3_vertical, T175_lc3_leftOrAbove, T175_lc3_cached;
	double T175_lc3_m, T175_lc3_C, T175_lc3_borderX, T175_lc3_borderY;
	int T175_r, T175_g, T175_b, T175_lc1_lastY = Integer.MIN_VALUE, T175_lc2_lastY = Integer.MIN_VALUE, T175_lc3_lastY = Integer.MIN_VALUE;

	boolean T176_initializedWithValidData = false, T176_okay = false;
	double T176_sx, T176_sy, T176_minx, T176_miny, T176_maxx, T176_maxy;
	boolean T176_lc1_horizontal, T176_lc1_vertical, T176_lc1_leftOrAbove, T176_lc1_cached;
	double T176_lc1_m, T176_lc1_C, T176_lc1_borderX, T176_lc1_borderY;
	boolean T176_lc2_horizontal, T176_lc2_vertical, T176_lc2_leftOrAbove, T176_lc2_cached;
	double T176_lc2_m, T176_lc2_C, T176_lc2_borderX, T176_lc2_borderY;
	boolean T176_lc3_horizontal, T176_lc3_vertical, T176_lc3_leftOrAbove, T176_lc3_cached;
	double T176_lc3_m, T176_lc3_C, T176_lc3_borderX, T176_lc3_borderY;
	int T176_r, T176_g, T176_b, T176_lc1_lastY = Integer.MIN_VALUE, T176_lc2_lastY = Integer.MIN_VALUE, T176_lc3_lastY = Integer.MIN_VALUE;

	boolean T177_initializedWithValidData = false, T177_okay = false;
	double T177_sx, T177_sy, T177_minx, T177_miny, T177_maxx, T177_maxy;
	boolean T177_lc1_horizontal, T177_lc1_vertical, T177_lc1_leftOrAbove, T177_lc1_cached;
	double T177_lc1_m, T177_lc1_C, T177_lc1_borderX, T177_lc1_borderY;
	boolean T177_lc2_horizontal, T177_lc2_vertical, T177_lc2_leftOrAbove, T177_lc2_cached;
	double T177_lc2_m, T177_lc2_C, T177_lc2_borderX, T177_lc2_borderY;
	boolean T177_lc3_horizontal, T177_lc3_vertical, T177_lc3_leftOrAbove, T177_lc3_cached;
	double T177_lc3_m, T177_lc3_C, T177_lc3_borderX, T177_lc3_borderY;
	int T177_r, T177_g, T177_b, T177_lc1_lastY = Integer.MIN_VALUE, T177_lc2_lastY = Integer.MIN_VALUE, T177_lc3_lastY = Integer.MIN_VALUE;

	boolean T178_initializedWithValidData = false, T178_okay = false;
	double T178_sx, T178_sy, T178_minx, T178_miny, T178_maxx, T178_maxy;
	boolean T178_lc1_horizontal, T178_lc1_vertical, T178_lc1_leftOrAbove, T178_lc1_cached;
	double T178_lc1_m, T178_lc1_C, T178_lc1_borderX, T178_lc1_borderY;
	boolean T178_lc2_horizontal, T178_lc2_vertical, T178_lc2_leftOrAbove, T178_lc2_cached;
	double T178_lc2_m, T178_lc2_C, T178_lc2_borderX, T178_lc2_borderY;
	boolean T178_lc3_horizontal, T178_lc3_vertical, T178_lc3_leftOrAbove, T178_lc3_cached;
	double T178_lc3_m, T178_lc3_C, T178_lc3_borderX, T178_lc3_borderY;
	int T178_r, T178_g, T178_b, T178_lc1_lastY = Integer.MIN_VALUE, T178_lc2_lastY = Integer.MIN_VALUE, T178_lc3_lastY = Integer.MIN_VALUE;

	boolean T179_initializedWithValidData = false, T179_okay = false;
	double T179_sx, T179_sy, T179_minx, T179_miny, T179_maxx, T179_maxy;
	boolean T179_lc1_horizontal, T179_lc1_vertical, T179_lc1_leftOrAbove, T179_lc1_cached;
	double T179_lc1_m, T179_lc1_C, T179_lc1_borderX, T179_lc1_borderY;
	boolean T179_lc2_horizontal, T179_lc2_vertical, T179_lc2_leftOrAbove, T179_lc2_cached;
	double T179_lc2_m, T179_lc2_C, T179_lc2_borderX, T179_lc2_borderY;
	boolean T179_lc3_horizontal, T179_lc3_vertical, T179_lc3_leftOrAbove, T179_lc3_cached;
	double T179_lc3_m, T179_lc3_C, T179_lc3_borderX, T179_lc3_borderY;
	int T179_r, T179_g, T179_b, T179_lc1_lastY = Integer.MIN_VALUE, T179_lc2_lastY = Integer.MIN_VALUE, T179_lc3_lastY = Integer.MIN_VALUE;

	boolean T180_initializedWithValidData = false, T180_okay = false;
	double T180_sx, T180_sy, T180_minx, T180_miny, T180_maxx, T180_maxy;
	boolean T180_lc1_horizontal, T180_lc1_vertical, T180_lc1_leftOrAbove, T180_lc1_cached;
	double T180_lc1_m, T180_lc1_C, T180_lc1_borderX, T180_lc1_borderY;
	boolean T180_lc2_horizontal, T180_lc2_vertical, T180_lc2_leftOrAbove, T180_lc2_cached;
	double T180_lc2_m, T180_lc2_C, T180_lc2_borderX, T180_lc2_borderY;
	boolean T180_lc3_horizontal, T180_lc3_vertical, T180_lc3_leftOrAbove, T180_lc3_cached;
	double T180_lc3_m, T180_lc3_C, T180_lc3_borderX, T180_lc3_borderY;
	int T180_r, T180_g, T180_b, T180_lc1_lastY = Integer.MIN_VALUE, T180_lc2_lastY = Integer.MIN_VALUE, T180_lc3_lastY = Integer.MIN_VALUE;

	boolean T181_initializedWithValidData = false, T181_okay = false;
	double T181_sx, T181_sy, T181_minx, T181_miny, T181_maxx, T181_maxy;
	boolean T181_lc1_horizontal, T181_lc1_vertical, T181_lc1_leftOrAbove, T181_lc1_cached;
	double T181_lc1_m, T181_lc1_C, T181_lc1_borderX, T181_lc1_borderY;
	boolean T181_lc2_horizontal, T181_lc2_vertical, T181_lc2_leftOrAbove, T181_lc2_cached;
	double T181_lc2_m, T181_lc2_C, T181_lc2_borderX, T181_lc2_borderY;
	boolean T181_lc3_horizontal, T181_lc3_vertical, T181_lc3_leftOrAbove, T181_lc3_cached;
	double T181_lc3_m, T181_lc3_C, T181_lc3_borderX, T181_lc3_borderY;
	int T181_r, T181_g, T181_b, T181_lc1_lastY = Integer.MIN_VALUE, T181_lc2_lastY = Integer.MIN_VALUE, T181_lc3_lastY = Integer.MIN_VALUE;

	boolean T182_initializedWithValidData = false, T182_okay = false;
	double T182_sx, T182_sy, T182_minx, T182_miny, T182_maxx, T182_maxy;
	boolean T182_lc1_horizontal, T182_lc1_vertical, T182_lc1_leftOrAbove, T182_lc1_cached;
	double T182_lc1_m, T182_lc1_C, T182_lc1_borderX, T182_lc1_borderY;
	boolean T182_lc2_horizontal, T182_lc2_vertical, T182_lc2_leftOrAbove, T182_lc2_cached;
	double T182_lc2_m, T182_lc2_C, T182_lc2_borderX, T182_lc2_borderY;
	boolean T182_lc3_horizontal, T182_lc3_vertical, T182_lc3_leftOrAbove, T182_lc3_cached;
	double T182_lc3_m, T182_lc3_C, T182_lc3_borderX, T182_lc3_borderY;
	int T182_r, T182_g, T182_b, T182_lc1_lastY = Integer.MIN_VALUE, T182_lc2_lastY = Integer.MIN_VALUE, T182_lc3_lastY = Integer.MIN_VALUE;

	boolean T183_initializedWithValidData = false, T183_okay = false;
	double T183_sx, T183_sy, T183_minx, T183_miny, T183_maxx, T183_maxy;
	boolean T183_lc1_horizontal, T183_lc1_vertical, T183_lc1_leftOrAbove, T183_lc1_cached;
	double T183_lc1_m, T183_lc1_C, T183_lc1_borderX, T183_lc1_borderY;
	boolean T183_lc2_horizontal, T183_lc2_vertical, T183_lc2_leftOrAbove, T183_lc2_cached;
	double T183_lc2_m, T183_lc2_C, T183_lc2_borderX, T183_lc2_borderY;
	boolean T183_lc3_horizontal, T183_lc3_vertical, T183_lc3_leftOrAbove, T183_lc3_cached;
	double T183_lc3_m, T183_lc3_C, T183_lc3_borderX, T183_lc3_borderY;
	int T183_r, T183_g, T183_b, T183_lc1_lastY = Integer.MIN_VALUE, T183_lc2_lastY = Integer.MIN_VALUE, T183_lc3_lastY = Integer.MIN_VALUE;

	boolean T184_initializedWithValidData = false, T184_okay = false;
	double T184_sx, T184_sy, T184_minx, T184_miny, T184_maxx, T184_maxy;
	boolean T184_lc1_horizontal, T184_lc1_vertical, T184_lc1_leftOrAbove, T184_lc1_cached;
	double T184_lc1_m, T184_lc1_C, T184_lc1_borderX, T184_lc1_borderY;
	boolean T184_lc2_horizontal, T184_lc2_vertical, T184_lc2_leftOrAbove, T184_lc2_cached;
	double T184_lc2_m, T184_lc2_C, T184_lc2_borderX, T184_lc2_borderY;
	boolean T184_lc3_horizontal, T184_lc3_vertical, T184_lc3_leftOrAbove, T184_lc3_cached;
	double T184_lc3_m, T184_lc3_C, T184_lc3_borderX, T184_lc3_borderY;
	int T184_r, T184_g, T184_b, T184_lc1_lastY = Integer.MIN_VALUE, T184_lc2_lastY = Integer.MIN_VALUE, T184_lc3_lastY = Integer.MIN_VALUE;

	boolean T185_initializedWithValidData = false, T185_okay = false;
	double T185_sx, T185_sy, T185_minx, T185_miny, T185_maxx, T185_maxy;
	boolean T185_lc1_horizontal, T185_lc1_vertical, T185_lc1_leftOrAbove, T185_lc1_cached;
	double T185_lc1_m, T185_lc1_C, T185_lc1_borderX, T185_lc1_borderY;
	boolean T185_lc2_horizontal, T185_lc2_vertical, T185_lc2_leftOrAbove, T185_lc2_cached;
	double T185_lc2_m, T185_lc2_C, T185_lc2_borderX, T185_lc2_borderY;
	boolean T185_lc3_horizontal, T185_lc3_vertical, T185_lc3_leftOrAbove, T185_lc3_cached;
	double T185_lc3_m, T185_lc3_C, T185_lc3_borderX, T185_lc3_borderY;
	int T185_r, T185_g, T185_b, T185_lc1_lastY = Integer.MIN_VALUE, T185_lc2_lastY = Integer.MIN_VALUE, T185_lc3_lastY = Integer.MIN_VALUE;

	boolean T186_initializedWithValidData = false, T186_okay = false;
	double T186_sx, T186_sy, T186_minx, T186_miny, T186_maxx, T186_maxy;
	boolean T186_lc1_horizontal, T186_lc1_vertical, T186_lc1_leftOrAbove, T186_lc1_cached;
	double T186_lc1_m, T186_lc1_C, T186_lc1_borderX, T186_lc1_borderY;
	boolean T186_lc2_horizontal, T186_lc2_vertical, T186_lc2_leftOrAbove, T186_lc2_cached;
	double T186_lc2_m, T186_lc2_C, T186_lc2_borderX, T186_lc2_borderY;
	boolean T186_lc3_horizontal, T186_lc3_vertical, T186_lc3_leftOrAbove, T186_lc3_cached;
	double T186_lc3_m, T186_lc3_C, T186_lc3_borderX, T186_lc3_borderY;
	int T186_r, T186_g, T186_b, T186_lc1_lastY = Integer.MIN_VALUE, T186_lc2_lastY = Integer.MIN_VALUE, T186_lc3_lastY = Integer.MIN_VALUE;

	boolean T187_initializedWithValidData = false, T187_okay = false;
	double T187_sx, T187_sy, T187_minx, T187_miny, T187_maxx, T187_maxy;
	boolean T187_lc1_horizontal, T187_lc1_vertical, T187_lc1_leftOrAbove, T187_lc1_cached;
	double T187_lc1_m, T187_lc1_C, T187_lc1_borderX, T187_lc1_borderY;
	boolean T187_lc2_horizontal, T187_lc2_vertical, T187_lc2_leftOrAbove, T187_lc2_cached;
	double T187_lc2_m, T187_lc2_C, T187_lc2_borderX, T187_lc2_borderY;
	boolean T187_lc3_horizontal, T187_lc3_vertical, T187_lc3_leftOrAbove, T187_lc3_cached;
	double T187_lc3_m, T187_lc3_C, T187_lc3_borderX, T187_lc3_borderY;
	int T187_r, T187_g, T187_b, T187_lc1_lastY = Integer.MIN_VALUE, T187_lc2_lastY = Integer.MIN_VALUE, T187_lc3_lastY = Integer.MIN_VALUE;

	boolean T188_initializedWithValidData = false, T188_okay = false;
	double T188_sx, T188_sy, T188_minx, T188_miny, T188_maxx, T188_maxy;
	boolean T188_lc1_horizontal, T188_lc1_vertical, T188_lc1_leftOrAbove, T188_lc1_cached;
	double T188_lc1_m, T188_lc1_C, T188_lc1_borderX, T188_lc1_borderY;
	boolean T188_lc2_horizontal, T188_lc2_vertical, T188_lc2_leftOrAbove, T188_lc2_cached;
	double T188_lc2_m, T188_lc2_C, T188_lc2_borderX, T188_lc2_borderY;
	boolean T188_lc3_horizontal, T188_lc3_vertical, T188_lc3_leftOrAbove, T188_lc3_cached;
	double T188_lc3_m, T188_lc3_C, T188_lc3_borderX, T188_lc3_borderY;
	int T188_r, T188_g, T188_b, T188_lc1_lastY = Integer.MIN_VALUE, T188_lc2_lastY = Integer.MIN_VALUE, T188_lc3_lastY = Integer.MIN_VALUE;

	boolean T189_initializedWithValidData = false, T189_okay = false;
	double T189_sx, T189_sy, T189_minx, T189_miny, T189_maxx, T189_maxy;
	boolean T189_lc1_horizontal, T189_lc1_vertical, T189_lc1_leftOrAbove, T189_lc1_cached;
	double T189_lc1_m, T189_lc1_C, T189_lc1_borderX, T189_lc1_borderY;
	boolean T189_lc2_horizontal, T189_lc2_vertical, T189_lc2_leftOrAbove, T189_lc2_cached;
	double T189_lc2_m, T189_lc2_C, T189_lc2_borderX, T189_lc2_borderY;
	boolean T189_lc3_horizontal, T189_lc3_vertical, T189_lc3_leftOrAbove, T189_lc3_cached;
	double T189_lc3_m, T189_lc3_C, T189_lc3_borderX, T189_lc3_borderY;
	int T189_r, T189_g, T189_b, T189_lc1_lastY = Integer.MIN_VALUE, T189_lc2_lastY = Integer.MIN_VALUE, T189_lc3_lastY = Integer.MIN_VALUE;

	boolean T190_initializedWithValidData = false, T190_okay = false;
	double T190_sx, T190_sy, T190_minx, T190_miny, T190_maxx, T190_maxy;
	boolean T190_lc1_horizontal, T190_lc1_vertical, T190_lc1_leftOrAbove, T190_lc1_cached;
	double T190_lc1_m, T190_lc1_C, T190_lc1_borderX, T190_lc1_borderY;
	boolean T190_lc2_horizontal, T190_lc2_vertical, T190_lc2_leftOrAbove, T190_lc2_cached;
	double T190_lc2_m, T190_lc2_C, T190_lc2_borderX, T190_lc2_borderY;
	boolean T190_lc3_horizontal, T190_lc3_vertical, T190_lc3_leftOrAbove, T190_lc3_cached;
	double T190_lc3_m, T190_lc3_C, T190_lc3_borderX, T190_lc3_borderY;
	int T190_r, T190_g, T190_b, T190_lc1_lastY = Integer.MIN_VALUE, T190_lc2_lastY = Integer.MIN_VALUE, T190_lc3_lastY = Integer.MIN_VALUE;

	boolean T191_initializedWithValidData = false, T191_okay = false;
	double T191_sx, T191_sy, T191_minx, T191_miny, T191_maxx, T191_maxy;
	boolean T191_lc1_horizontal, T191_lc1_vertical, T191_lc1_leftOrAbove, T191_lc1_cached;
	double T191_lc1_m, T191_lc1_C, T191_lc1_borderX, T191_lc1_borderY;
	boolean T191_lc2_horizontal, T191_lc2_vertical, T191_lc2_leftOrAbove, T191_lc2_cached;
	double T191_lc2_m, T191_lc2_C, T191_lc2_borderX, T191_lc2_borderY;
	boolean T191_lc3_horizontal, T191_lc3_vertical, T191_lc3_leftOrAbove, T191_lc3_cached;
	double T191_lc3_m, T191_lc3_C, T191_lc3_borderX, T191_lc3_borderY;
	int T191_r, T191_g, T191_b, T191_lc1_lastY = Integer.MIN_VALUE, T191_lc2_lastY = Integer.MIN_VALUE, T191_lc3_lastY = Integer.MIN_VALUE;

	boolean T192_initializedWithValidData = false, T192_okay = false;
	double T192_sx, T192_sy, T192_minx, T192_miny, T192_maxx, T192_maxy;
	boolean T192_lc1_horizontal, T192_lc1_vertical, T192_lc1_leftOrAbove, T192_lc1_cached;
	double T192_lc1_m, T192_lc1_C, T192_lc1_borderX, T192_lc1_borderY;
	boolean T192_lc2_horizontal, T192_lc2_vertical, T192_lc2_leftOrAbove, T192_lc2_cached;
	double T192_lc2_m, T192_lc2_C, T192_lc2_borderX, T192_lc2_borderY;
	boolean T192_lc3_horizontal, T192_lc3_vertical, T192_lc3_leftOrAbove, T192_lc3_cached;
	double T192_lc3_m, T192_lc3_C, T192_lc3_borderX, T192_lc3_borderY;
	int T192_r, T192_g, T192_b, T192_lc1_lastY = Integer.MIN_VALUE, T192_lc2_lastY = Integer.MIN_VALUE, T192_lc3_lastY = Integer.MIN_VALUE;

	boolean T193_initializedWithValidData = false, T193_okay = false;
	double T193_sx, T193_sy, T193_minx, T193_miny, T193_maxx, T193_maxy;
	boolean T193_lc1_horizontal, T193_lc1_vertical, T193_lc1_leftOrAbove, T193_lc1_cached;
	double T193_lc1_m, T193_lc1_C, T193_lc1_borderX, T193_lc1_borderY;
	boolean T193_lc2_horizontal, T193_lc2_vertical, T193_lc2_leftOrAbove, T193_lc2_cached;
	double T193_lc2_m, T193_lc2_C, T193_lc2_borderX, T193_lc2_borderY;
	boolean T193_lc3_horizontal, T193_lc3_vertical, T193_lc3_leftOrAbove, T193_lc3_cached;
	double T193_lc3_m, T193_lc3_C, T193_lc3_borderX, T193_lc3_borderY;
	int T193_r, T193_g, T193_b, T193_lc1_lastY = Integer.MIN_VALUE, T193_lc2_lastY = Integer.MIN_VALUE, T193_lc3_lastY = Integer.MIN_VALUE;

	boolean T194_initializedWithValidData = false, T194_okay = false;
	double T194_sx, T194_sy, T194_minx, T194_miny, T194_maxx, T194_maxy;
	boolean T194_lc1_horizontal, T194_lc1_vertical, T194_lc1_leftOrAbove, T194_lc1_cached;
	double T194_lc1_m, T194_lc1_C, T194_lc1_borderX, T194_lc1_borderY;
	boolean T194_lc2_horizontal, T194_lc2_vertical, T194_lc2_leftOrAbove, T194_lc2_cached;
	double T194_lc2_m, T194_lc2_C, T194_lc2_borderX, T194_lc2_borderY;
	boolean T194_lc3_horizontal, T194_lc3_vertical, T194_lc3_leftOrAbove, T194_lc3_cached;
	double T194_lc3_m, T194_lc3_C, T194_lc3_borderX, T194_lc3_borderY;
	int T194_r, T194_g, T194_b, T194_lc1_lastY = Integer.MIN_VALUE, T194_lc2_lastY = Integer.MIN_VALUE, T194_lc3_lastY = Integer.MIN_VALUE;

	boolean T195_initializedWithValidData = false, T195_okay = false;
	double T195_sx, T195_sy, T195_minx, T195_miny, T195_maxx, T195_maxy;
	boolean T195_lc1_horizontal, T195_lc1_vertical, T195_lc1_leftOrAbove, T195_lc1_cached;
	double T195_lc1_m, T195_lc1_C, T195_lc1_borderX, T195_lc1_borderY;
	boolean T195_lc2_horizontal, T195_lc2_vertical, T195_lc2_leftOrAbove, T195_lc2_cached;
	double T195_lc2_m, T195_lc2_C, T195_lc2_borderX, T195_lc2_borderY;
	boolean T195_lc3_horizontal, T195_lc3_vertical, T195_lc3_leftOrAbove, T195_lc3_cached;
	double T195_lc3_m, T195_lc3_C, T195_lc3_borderX, T195_lc3_borderY;
	int T195_r, T195_g, T195_b, T195_lc1_lastY = Integer.MIN_VALUE, T195_lc2_lastY = Integer.MIN_VALUE, T195_lc3_lastY = Integer.MIN_VALUE;

	boolean T196_initializedWithValidData = false, T196_okay = false;
	double T196_sx, T196_sy, T196_minx, T196_miny, T196_maxx, T196_maxy;
	boolean T196_lc1_horizontal, T196_lc1_vertical, T196_lc1_leftOrAbove, T196_lc1_cached;
	double T196_lc1_m, T196_lc1_C, T196_lc1_borderX, T196_lc1_borderY;
	boolean T196_lc2_horizontal, T196_lc2_vertical, T196_lc2_leftOrAbove, T196_lc2_cached;
	double T196_lc2_m, T196_lc2_C, T196_lc2_borderX, T196_lc2_borderY;
	boolean T196_lc3_horizontal, T196_lc3_vertical, T196_lc3_leftOrAbove, T196_lc3_cached;
	double T196_lc3_m, T196_lc3_C, T196_lc3_borderX, T196_lc3_borderY;
	int T196_r, T196_g, T196_b, T196_lc1_lastY = Integer.MIN_VALUE, T196_lc2_lastY = Integer.MIN_VALUE, T196_lc3_lastY = Integer.MIN_VALUE;

	boolean T197_initializedWithValidData = false, T197_okay = false;
	double T197_sx, T197_sy, T197_minx, T197_miny, T197_maxx, T197_maxy;
	boolean T197_lc1_horizontal, T197_lc1_vertical, T197_lc1_leftOrAbove, T197_lc1_cached;
	double T197_lc1_m, T197_lc1_C, T197_lc1_borderX, T197_lc1_borderY;
	boolean T197_lc2_horizontal, T197_lc2_vertical, T197_lc2_leftOrAbove, T197_lc2_cached;
	double T197_lc2_m, T197_lc2_C, T197_lc2_borderX, T197_lc2_borderY;
	boolean T197_lc3_horizontal, T197_lc3_vertical, T197_lc3_leftOrAbove, T197_lc3_cached;
	double T197_lc3_m, T197_lc3_C, T197_lc3_borderX, T197_lc3_borderY;
	int T197_r, T197_g, T197_b, T197_lc1_lastY = Integer.MIN_VALUE, T197_lc2_lastY = Integer.MIN_VALUE, T197_lc3_lastY = Integer.MIN_VALUE;

	boolean T198_initializedWithValidData = false, T198_okay = false;
	double T198_sx, T198_sy, T198_minx, T198_miny, T198_maxx, T198_maxy;
	boolean T198_lc1_horizontal, T198_lc1_vertical, T198_lc1_leftOrAbove, T198_lc1_cached;
	double T198_lc1_m, T198_lc1_C, T198_lc1_borderX, T198_lc1_borderY;
	boolean T198_lc2_horizontal, T198_lc2_vertical, T198_lc2_leftOrAbove, T198_lc2_cached;
	double T198_lc2_m, T198_lc2_C, T198_lc2_borderX, T198_lc2_borderY;
	boolean T198_lc3_horizontal, T198_lc3_vertical, T198_lc3_leftOrAbove, T198_lc3_cached;
	double T198_lc3_m, T198_lc3_C, T198_lc3_borderX, T198_lc3_borderY;
	int T198_r, T198_g, T198_b, T198_lc1_lastY = Integer.MIN_VALUE, T198_lc2_lastY = Integer.MIN_VALUE, T198_lc3_lastY = Integer.MIN_VALUE;

	boolean T199_initializedWithValidData = false, T199_okay = false;
	double T199_sx, T199_sy, T199_minx, T199_miny, T199_maxx, T199_maxy;
	boolean T199_lc1_horizontal, T199_lc1_vertical, T199_lc1_leftOrAbove, T199_lc1_cached;
	double T199_lc1_m, T199_lc1_C, T199_lc1_borderX, T199_lc1_borderY;
	boolean T199_lc2_horizontal, T199_lc2_vertical, T199_lc2_leftOrAbove, T199_lc2_cached;
	double T199_lc2_m, T199_lc2_C, T199_lc2_borderX, T199_lc2_borderY;
	boolean T199_lc3_horizontal, T199_lc3_vertical, T199_lc3_leftOrAbove, T199_lc3_cached;
	double T199_lc3_m, T199_lc3_C, T199_lc3_borderX, T199_lc3_borderY;
	int T199_r, T199_g, T199_b, T199_lc1_lastY = Integer.MIN_VALUE, T199_lc2_lastY = Integer.MIN_VALUE, T199_lc3_lastY = Integer.MIN_VALUE;

	boolean T200_initializedWithValidData = false, T200_okay = false;
	double T200_sx, T200_sy, T200_minx, T200_miny, T200_maxx, T200_maxy;
	boolean T200_lc1_horizontal, T200_lc1_vertical, T200_lc1_leftOrAbove, T200_lc1_cached;
	double T200_lc1_m, T200_lc1_C, T200_lc1_borderX, T200_lc1_borderY;
	boolean T200_lc2_horizontal, T200_lc2_vertical, T200_lc2_leftOrAbove, T200_lc2_cached;
	double T200_lc2_m, T200_lc2_C, T200_lc2_borderX, T200_lc2_borderY;
	boolean T200_lc3_horizontal, T200_lc3_vertical, T200_lc3_leftOrAbove, T200_lc3_cached;
	double T200_lc3_m, T200_lc3_C, T200_lc3_borderX, T200_lc3_borderY;
	int T200_r, T200_g, T200_b, T200_lc1_lastY = Integer.MIN_VALUE, T200_lc2_lastY = Integer.MIN_VALUE, T200_lc3_lastY = Integer.MIN_VALUE;

	boolean T201_initializedWithValidData = false, T201_okay = false;
	double T201_sx, T201_sy, T201_minx, T201_miny, T201_maxx, T201_maxy;
	boolean T201_lc1_horizontal, T201_lc1_vertical, T201_lc1_leftOrAbove, T201_lc1_cached;
	double T201_lc1_m, T201_lc1_C, T201_lc1_borderX, T201_lc1_borderY;
	boolean T201_lc2_horizontal, T201_lc2_vertical, T201_lc2_leftOrAbove, T201_lc2_cached;
	double T201_lc2_m, T201_lc2_C, T201_lc2_borderX, T201_lc2_borderY;
	boolean T201_lc3_horizontal, T201_lc3_vertical, T201_lc3_leftOrAbove, T201_lc3_cached;
	double T201_lc3_m, T201_lc3_C, T201_lc3_borderX, T201_lc3_borderY;
	int T201_r, T201_g, T201_b, T201_lc1_lastY = Integer.MIN_VALUE, T201_lc2_lastY = Integer.MIN_VALUE, T201_lc3_lastY = Integer.MIN_VALUE;

	boolean T202_initializedWithValidData = false, T202_okay = false;
	double T202_sx, T202_sy, T202_minx, T202_miny, T202_maxx, T202_maxy;
	boolean T202_lc1_horizontal, T202_lc1_vertical, T202_lc1_leftOrAbove, T202_lc1_cached;
	double T202_lc1_m, T202_lc1_C, T202_lc1_borderX, T202_lc1_borderY;
	boolean T202_lc2_horizontal, T202_lc2_vertical, T202_lc2_leftOrAbove, T202_lc2_cached;
	double T202_lc2_m, T202_lc2_C, T202_lc2_borderX, T202_lc2_borderY;
	boolean T202_lc3_horizontal, T202_lc3_vertical, T202_lc3_leftOrAbove, T202_lc3_cached;
	double T202_lc3_m, T202_lc3_C, T202_lc3_borderX, T202_lc3_borderY;
	int T202_r, T202_g, T202_b, T202_lc1_lastY = Integer.MIN_VALUE, T202_lc2_lastY = Integer.MIN_VALUE, T202_lc3_lastY = Integer.MIN_VALUE;

	boolean T203_initializedWithValidData = false, T203_okay = false;
	double T203_sx, T203_sy, T203_minx, T203_miny, T203_maxx, T203_maxy;
	boolean T203_lc1_horizontal, T203_lc1_vertical, T203_lc1_leftOrAbove, T203_lc1_cached;
	double T203_lc1_m, T203_lc1_C, T203_lc1_borderX, T203_lc1_borderY;
	boolean T203_lc2_horizontal, T203_lc2_vertical, T203_lc2_leftOrAbove, T203_lc2_cached;
	double T203_lc2_m, T203_lc2_C, T203_lc2_borderX, T203_lc2_borderY;
	boolean T203_lc3_horizontal, T203_lc3_vertical, T203_lc3_leftOrAbove, T203_lc3_cached;
	double T203_lc3_m, T203_lc3_C, T203_lc3_borderX, T203_lc3_borderY;
	int T203_r, T203_g, T203_b, T203_lc1_lastY = Integer.MIN_VALUE, T203_lc2_lastY = Integer.MIN_VALUE, T203_lc3_lastY = Integer.MIN_VALUE;

	boolean T204_initializedWithValidData = false, T204_okay = false;
	double T204_sx, T204_sy, T204_minx, T204_miny, T204_maxx, T204_maxy;
	boolean T204_lc1_horizontal, T204_lc1_vertical, T204_lc1_leftOrAbove, T204_lc1_cached;
	double T204_lc1_m, T204_lc1_C, T204_lc1_borderX, T204_lc1_borderY;
	boolean T204_lc2_horizontal, T204_lc2_vertical, T204_lc2_leftOrAbove, T204_lc2_cached;
	double T204_lc2_m, T204_lc2_C, T204_lc2_borderX, T204_lc2_borderY;
	boolean T204_lc3_horizontal, T204_lc3_vertical, T204_lc3_leftOrAbove, T204_lc3_cached;
	double T204_lc3_m, T204_lc3_C, T204_lc3_borderX, T204_lc3_borderY;
	int T204_r, T204_g, T204_b, T204_lc1_lastY = Integer.MIN_VALUE, T204_lc2_lastY = Integer.MIN_VALUE, T204_lc3_lastY = Integer.MIN_VALUE;

	boolean T205_initializedWithValidData = false, T205_okay = false;
	double T205_sx, T205_sy, T205_minx, T205_miny, T205_maxx, T205_maxy;
	boolean T205_lc1_horizontal, T205_lc1_vertical, T205_lc1_leftOrAbove, T205_lc1_cached;
	double T205_lc1_m, T205_lc1_C, T205_lc1_borderX, T205_lc1_borderY;
	boolean T205_lc2_horizontal, T205_lc2_vertical, T205_lc2_leftOrAbove, T205_lc2_cached;
	double T205_lc2_m, T205_lc2_C, T205_lc2_borderX, T205_lc2_borderY;
	boolean T205_lc3_horizontal, T205_lc3_vertical, T205_lc3_leftOrAbove, T205_lc3_cached;
	double T205_lc3_m, T205_lc3_C, T205_lc3_borderX, T205_lc3_borderY;
	int T205_r, T205_g, T205_b, T205_lc1_lastY = Integer.MIN_VALUE, T205_lc2_lastY = Integer.MIN_VALUE, T205_lc3_lastY = Integer.MIN_VALUE;

	boolean T206_initializedWithValidData = false, T206_okay = false;
	double T206_sx, T206_sy, T206_minx, T206_miny, T206_maxx, T206_maxy;
	boolean T206_lc1_horizontal, T206_lc1_vertical, T206_lc1_leftOrAbove, T206_lc1_cached;
	double T206_lc1_m, T206_lc1_C, T206_lc1_borderX, T206_lc1_borderY;
	boolean T206_lc2_horizontal, T206_lc2_vertical, T206_lc2_leftOrAbove, T206_lc2_cached;
	double T206_lc2_m, T206_lc2_C, T206_lc2_borderX, T206_lc2_borderY;
	boolean T206_lc3_horizontal, T206_lc3_vertical, T206_lc3_leftOrAbove, T206_lc3_cached;
	double T206_lc3_m, T206_lc3_C, T206_lc3_borderX, T206_lc3_borderY;
	int T206_r, T206_g, T206_b, T206_lc1_lastY = Integer.MIN_VALUE, T206_lc2_lastY = Integer.MIN_VALUE, T206_lc3_lastY = Integer.MIN_VALUE;

	boolean T207_initializedWithValidData = false, T207_okay = false;
	double T207_sx, T207_sy, T207_minx, T207_miny, T207_maxx, T207_maxy;
	boolean T207_lc1_horizontal, T207_lc1_vertical, T207_lc1_leftOrAbove, T207_lc1_cached;
	double T207_lc1_m, T207_lc1_C, T207_lc1_borderX, T207_lc1_borderY;
	boolean T207_lc2_horizontal, T207_lc2_vertical, T207_lc2_leftOrAbove, T207_lc2_cached;
	double T207_lc2_m, T207_lc2_C, T207_lc2_borderX, T207_lc2_borderY;
	boolean T207_lc3_horizontal, T207_lc3_vertical, T207_lc3_leftOrAbove, T207_lc3_cached;
	double T207_lc3_m, T207_lc3_C, T207_lc3_borderX, T207_lc3_borderY;
	int T207_r, T207_g, T207_b, T207_lc1_lastY = Integer.MIN_VALUE, T207_lc2_lastY = Integer.MIN_VALUE, T207_lc3_lastY = Integer.MIN_VALUE;

	boolean T208_initializedWithValidData = false, T208_okay = false;
	double T208_sx, T208_sy, T208_minx, T208_miny, T208_maxx, T208_maxy;
	boolean T208_lc1_horizontal, T208_lc1_vertical, T208_lc1_leftOrAbove, T208_lc1_cached;
	double T208_lc1_m, T208_lc1_C, T208_lc1_borderX, T208_lc1_borderY;
	boolean T208_lc2_horizontal, T208_lc2_vertical, T208_lc2_leftOrAbove, T208_lc2_cached;
	double T208_lc2_m, T208_lc2_C, T208_lc2_borderX, T208_lc2_borderY;
	boolean T208_lc3_horizontal, T208_lc3_vertical, T208_lc3_leftOrAbove, T208_lc3_cached;
	double T208_lc3_m, T208_lc3_C, T208_lc3_borderX, T208_lc3_borderY;
	int T208_r, T208_g, T208_b, T208_lc1_lastY = Integer.MIN_VALUE, T208_lc2_lastY = Integer.MIN_VALUE, T208_lc3_lastY = Integer.MIN_VALUE;

	boolean T209_initializedWithValidData = false, T209_okay = false;
	double T209_sx, T209_sy, T209_minx, T209_miny, T209_maxx, T209_maxy;
	boolean T209_lc1_horizontal, T209_lc1_vertical, T209_lc1_leftOrAbove, T209_lc1_cached;
	double T209_lc1_m, T209_lc1_C, T209_lc1_borderX, T209_lc1_borderY;
	boolean T209_lc2_horizontal, T209_lc2_vertical, T209_lc2_leftOrAbove, T209_lc2_cached;
	double T209_lc2_m, T209_lc2_C, T209_lc2_borderX, T209_lc2_borderY;
	boolean T209_lc3_horizontal, T209_lc3_vertical, T209_lc3_leftOrAbove, T209_lc3_cached;
	double T209_lc3_m, T209_lc3_C, T209_lc3_borderX, T209_lc3_borderY;
	int T209_r, T209_g, T209_b, T209_lc1_lastY = Integer.MIN_VALUE, T209_lc2_lastY = Integer.MIN_VALUE, T209_lc3_lastY = Integer.MIN_VALUE;

	boolean T210_initializedWithValidData = false, T210_okay = false;
	double T210_sx, T210_sy, T210_minx, T210_miny, T210_maxx, T210_maxy;
	boolean T210_lc1_horizontal, T210_lc1_vertical, T210_lc1_leftOrAbove, T210_lc1_cached;
	double T210_lc1_m, T210_lc1_C, T210_lc1_borderX, T210_lc1_borderY;
	boolean T210_lc2_horizontal, T210_lc2_vertical, T210_lc2_leftOrAbove, T210_lc2_cached;
	double T210_lc2_m, T210_lc2_C, T210_lc2_borderX, T210_lc2_borderY;
	boolean T210_lc3_horizontal, T210_lc3_vertical, T210_lc3_leftOrAbove, T210_lc3_cached;
	double T210_lc3_m, T210_lc3_C, T210_lc3_borderX, T210_lc3_borderY;
	int T210_r, T210_g, T210_b, T210_lc1_lastY = Integer.MIN_VALUE, T210_lc2_lastY = Integer.MIN_VALUE, T210_lc3_lastY = Integer.MIN_VALUE;

	boolean T211_initializedWithValidData = false, T211_okay = false;
	double T211_sx, T211_sy, T211_minx, T211_miny, T211_maxx, T211_maxy;
	boolean T211_lc1_horizontal, T211_lc1_vertical, T211_lc1_leftOrAbove, T211_lc1_cached;
	double T211_lc1_m, T211_lc1_C, T211_lc1_borderX, T211_lc1_borderY;
	boolean T211_lc2_horizontal, T211_lc2_vertical, T211_lc2_leftOrAbove, T211_lc2_cached;
	double T211_lc2_m, T211_lc2_C, T211_lc2_borderX, T211_lc2_borderY;
	boolean T211_lc3_horizontal, T211_lc3_vertical, T211_lc3_leftOrAbove, T211_lc3_cached;
	double T211_lc3_m, T211_lc3_C, T211_lc3_borderX, T211_lc3_borderY;
	int T211_r, T211_g, T211_b, T211_lc1_lastY = Integer.MIN_VALUE, T211_lc2_lastY = Integer.MIN_VALUE, T211_lc3_lastY = Integer.MIN_VALUE;

	boolean T212_initializedWithValidData = false, T212_okay = false;
	double T212_sx, T212_sy, T212_minx, T212_miny, T212_maxx, T212_maxy;
	boolean T212_lc1_horizontal, T212_lc1_vertical, T212_lc1_leftOrAbove, T212_lc1_cached;
	double T212_lc1_m, T212_lc1_C, T212_lc1_borderX, T212_lc1_borderY;
	boolean T212_lc2_horizontal, T212_lc2_vertical, T212_lc2_leftOrAbove, T212_lc2_cached;
	double T212_lc2_m, T212_lc2_C, T212_lc2_borderX, T212_lc2_borderY;
	boolean T212_lc3_horizontal, T212_lc3_vertical, T212_lc3_leftOrAbove, T212_lc3_cached;
	double T212_lc3_m, T212_lc3_C, T212_lc3_borderX, T212_lc3_borderY;
	int T212_r, T212_g, T212_b, T212_lc1_lastY = Integer.MIN_VALUE, T212_lc2_lastY = Integer.MIN_VALUE, T212_lc3_lastY = Integer.MIN_VALUE;

	boolean T213_initializedWithValidData = false, T213_okay = false;
	double T213_sx, T213_sy, T213_minx, T213_miny, T213_maxx, T213_maxy;
	boolean T213_lc1_horizontal, T213_lc1_vertical, T213_lc1_leftOrAbove, T213_lc1_cached;
	double T213_lc1_m, T213_lc1_C, T213_lc1_borderX, T213_lc1_borderY;
	boolean T213_lc2_horizontal, T213_lc2_vertical, T213_lc2_leftOrAbove, T213_lc2_cached;
	double T213_lc2_m, T213_lc2_C, T213_lc2_borderX, T213_lc2_borderY;
	boolean T213_lc3_horizontal, T213_lc3_vertical, T213_lc3_leftOrAbove, T213_lc3_cached;
	double T213_lc3_m, T213_lc3_C, T213_lc3_borderX, T213_lc3_borderY;
	int T213_r, T213_g, T213_b, T213_lc1_lastY = Integer.MIN_VALUE, T213_lc2_lastY = Integer.MIN_VALUE, T213_lc3_lastY = Integer.MIN_VALUE;

	boolean T214_initializedWithValidData = false, T214_okay = false;
	double T214_sx, T214_sy, T214_minx, T214_miny, T214_maxx, T214_maxy;
	boolean T214_lc1_horizontal, T214_lc1_vertical, T214_lc1_leftOrAbove, T214_lc1_cached;
	double T214_lc1_m, T214_lc1_C, T214_lc1_borderX, T214_lc1_borderY;
	boolean T214_lc2_horizontal, T214_lc2_vertical, T214_lc2_leftOrAbove, T214_lc2_cached;
	double T214_lc2_m, T214_lc2_C, T214_lc2_borderX, T214_lc2_borderY;
	boolean T214_lc3_horizontal, T214_lc3_vertical, T214_lc3_leftOrAbove, T214_lc3_cached;
	double T214_lc3_m, T214_lc3_C, T214_lc3_borderX, T214_lc3_borderY;
	int T214_r, T214_g, T214_b, T214_lc1_lastY = Integer.MIN_VALUE, T214_lc2_lastY = Integer.MIN_VALUE, T214_lc3_lastY = Integer.MIN_VALUE;

	boolean T215_initializedWithValidData = false, T215_okay = false;
	double T215_sx, T215_sy, T215_minx, T215_miny, T215_maxx, T215_maxy;
	boolean T215_lc1_horizontal, T215_lc1_vertical, T215_lc1_leftOrAbove, T215_lc1_cached;
	double T215_lc1_m, T215_lc1_C, T215_lc1_borderX, T215_lc1_borderY;
	boolean T215_lc2_horizontal, T215_lc2_vertical, T215_lc2_leftOrAbove, T215_lc2_cached;
	double T215_lc2_m, T215_lc2_C, T215_lc2_borderX, T215_lc2_borderY;
	boolean T215_lc3_horizontal, T215_lc3_vertical, T215_lc3_leftOrAbove, T215_lc3_cached;
	double T215_lc3_m, T215_lc3_C, T215_lc3_borderX, T215_lc3_borderY;
	int T215_r, T215_g, T215_b, T215_lc1_lastY = Integer.MIN_VALUE, T215_lc2_lastY = Integer.MIN_VALUE, T215_lc3_lastY = Integer.MIN_VALUE;

	boolean T216_initializedWithValidData = false, T216_okay = false;
	double T216_sx, T216_sy, T216_minx, T216_miny, T216_maxx, T216_maxy;
	boolean T216_lc1_horizontal, T216_lc1_vertical, T216_lc1_leftOrAbove, T216_lc1_cached;
	double T216_lc1_m, T216_lc1_C, T216_lc1_borderX, T216_lc1_borderY;
	boolean T216_lc2_horizontal, T216_lc2_vertical, T216_lc2_leftOrAbove, T216_lc2_cached;
	double T216_lc2_m, T216_lc2_C, T216_lc2_borderX, T216_lc2_borderY;
	boolean T216_lc3_horizontal, T216_lc3_vertical, T216_lc3_leftOrAbove, T216_lc3_cached;
	double T216_lc3_m, T216_lc3_C, T216_lc3_borderX, T216_lc3_borderY;
	int T216_r, T216_g, T216_b, T216_lc1_lastY = Integer.MIN_VALUE, T216_lc2_lastY = Integer.MIN_VALUE, T216_lc3_lastY = Integer.MIN_VALUE;

	boolean T217_initializedWithValidData = false, T217_okay = false;
	double T217_sx, T217_sy, T217_minx, T217_miny, T217_maxx, T217_maxy;
	boolean T217_lc1_horizontal, T217_lc1_vertical, T217_lc1_leftOrAbove, T217_lc1_cached;
	double T217_lc1_m, T217_lc1_C, T217_lc1_borderX, T217_lc1_borderY;
	boolean T217_lc2_horizontal, T217_lc2_vertical, T217_lc2_leftOrAbove, T217_lc2_cached;
	double T217_lc2_m, T217_lc2_C, T217_lc2_borderX, T217_lc2_borderY;
	boolean T217_lc3_horizontal, T217_lc3_vertical, T217_lc3_leftOrAbove, T217_lc3_cached;
	double T217_lc3_m, T217_lc3_C, T217_lc3_borderX, T217_lc3_borderY;
	int T217_r, T217_g, T217_b, T217_lc1_lastY = Integer.MIN_VALUE, T217_lc2_lastY = Integer.MIN_VALUE, T217_lc3_lastY = Integer.MIN_VALUE;

	boolean T218_initializedWithValidData = false, T218_okay = false;
	double T218_sx, T218_sy, T218_minx, T218_miny, T218_maxx, T218_maxy;
	boolean T218_lc1_horizontal, T218_lc1_vertical, T218_lc1_leftOrAbove, T218_lc1_cached;
	double T218_lc1_m, T218_lc1_C, T218_lc1_borderX, T218_lc1_borderY;
	boolean T218_lc2_horizontal, T218_lc2_vertical, T218_lc2_leftOrAbove, T218_lc2_cached;
	double T218_lc2_m, T218_lc2_C, T218_lc2_borderX, T218_lc2_borderY;
	boolean T218_lc3_horizontal, T218_lc3_vertical, T218_lc3_leftOrAbove, T218_lc3_cached;
	double T218_lc3_m, T218_lc3_C, T218_lc3_borderX, T218_lc3_borderY;
	int T218_r, T218_g, T218_b, T218_lc1_lastY = Integer.MIN_VALUE, T218_lc2_lastY = Integer.MIN_VALUE, T218_lc3_lastY = Integer.MIN_VALUE;

	boolean T219_initializedWithValidData = false, T219_okay = false;
	double T219_sx, T219_sy, T219_minx, T219_miny, T219_maxx, T219_maxy;
	boolean T219_lc1_horizontal, T219_lc1_vertical, T219_lc1_leftOrAbove, T219_lc1_cached;
	double T219_lc1_m, T219_lc1_C, T219_lc1_borderX, T219_lc1_borderY;
	boolean T219_lc2_horizontal, T219_lc2_vertical, T219_lc2_leftOrAbove, T219_lc2_cached;
	double T219_lc2_m, T219_lc2_C, T219_lc2_borderX, T219_lc2_borderY;
	boolean T219_lc3_horizontal, T219_lc3_vertical, T219_lc3_leftOrAbove, T219_lc3_cached;
	double T219_lc3_m, T219_lc3_C, T219_lc3_borderX, T219_lc3_borderY;
	int T219_r, T219_g, T219_b, T219_lc1_lastY = Integer.MIN_VALUE, T219_lc2_lastY = Integer.MIN_VALUE, T219_lc3_lastY = Integer.MIN_VALUE;

	boolean T220_initializedWithValidData = false, T220_okay = false;
	double T220_sx, T220_sy, T220_minx, T220_miny, T220_maxx, T220_maxy;
	boolean T220_lc1_horizontal, T220_lc1_vertical, T220_lc1_leftOrAbove, T220_lc1_cached;
	double T220_lc1_m, T220_lc1_C, T220_lc1_borderX, T220_lc1_borderY;
	boolean T220_lc2_horizontal, T220_lc2_vertical, T220_lc2_leftOrAbove, T220_lc2_cached;
	double T220_lc2_m, T220_lc2_C, T220_lc2_borderX, T220_lc2_borderY;
	boolean T220_lc3_horizontal, T220_lc3_vertical, T220_lc3_leftOrAbove, T220_lc3_cached;
	double T220_lc3_m, T220_lc3_C, T220_lc3_borderX, T220_lc3_borderY;
	int T220_r, T220_g, T220_b, T220_lc1_lastY = Integer.MIN_VALUE, T220_lc2_lastY = Integer.MIN_VALUE, T220_lc3_lastY = Integer.MIN_VALUE;

	boolean T221_initializedWithValidData = false, T221_okay = false;
	double T221_sx, T221_sy, T221_minx, T221_miny, T221_maxx, T221_maxy;
	boolean T221_lc1_horizontal, T221_lc1_vertical, T221_lc1_leftOrAbove, T221_lc1_cached;
	double T221_lc1_m, T221_lc1_C, T221_lc1_borderX, T221_lc1_borderY;
	boolean T221_lc2_horizontal, T221_lc2_vertical, T221_lc2_leftOrAbove, T221_lc2_cached;
	double T221_lc2_m, T221_lc2_C, T221_lc2_borderX, T221_lc2_borderY;
	boolean T221_lc3_horizontal, T221_lc3_vertical, T221_lc3_leftOrAbove, T221_lc3_cached;
	double T221_lc3_m, T221_lc3_C, T221_lc3_borderX, T221_lc3_borderY;
	int T221_r, T221_g, T221_b, T221_lc1_lastY = Integer.MIN_VALUE, T221_lc2_lastY = Integer.MIN_VALUE, T221_lc3_lastY = Integer.MIN_VALUE;

	boolean T222_initializedWithValidData = false, T222_okay = false;
	double T222_sx, T222_sy, T222_minx, T222_miny, T222_maxx, T222_maxy;
	boolean T222_lc1_horizontal, T222_lc1_vertical, T222_lc1_leftOrAbove, T222_lc1_cached;
	double T222_lc1_m, T222_lc1_C, T222_lc1_borderX, T222_lc1_borderY;
	boolean T222_lc2_horizontal, T222_lc2_vertical, T222_lc2_leftOrAbove, T222_lc2_cached;
	double T222_lc2_m, T222_lc2_C, T222_lc2_borderX, T222_lc2_borderY;
	boolean T222_lc3_horizontal, T222_lc3_vertical, T222_lc3_leftOrAbove, T222_lc3_cached;
	double T222_lc3_m, T222_lc3_C, T222_lc3_borderX, T222_lc3_borderY;
	int T222_r, T222_g, T222_b, T222_lc1_lastY = Integer.MIN_VALUE, T222_lc2_lastY = Integer.MIN_VALUE, T222_lc3_lastY = Integer.MIN_VALUE;

	boolean T223_initializedWithValidData = false, T223_okay = false;
	double T223_sx, T223_sy, T223_minx, T223_miny, T223_maxx, T223_maxy;
	boolean T223_lc1_horizontal, T223_lc1_vertical, T223_lc1_leftOrAbove, T223_lc1_cached;
	double T223_lc1_m, T223_lc1_C, T223_lc1_borderX, T223_lc1_borderY;
	boolean T223_lc2_horizontal, T223_lc2_vertical, T223_lc2_leftOrAbove, T223_lc2_cached;
	double T223_lc2_m, T223_lc2_C, T223_lc2_borderX, T223_lc2_borderY;
	boolean T223_lc3_horizontal, T223_lc3_vertical, T223_lc3_leftOrAbove, T223_lc3_cached;
	double T223_lc3_m, T223_lc3_C, T223_lc3_borderX, T223_lc3_borderY;
	int T223_r, T223_g, T223_b, T223_lc1_lastY = Integer.MIN_VALUE, T223_lc2_lastY = Integer.MIN_VALUE, T223_lc3_lastY = Integer.MIN_VALUE;

	boolean T224_initializedWithValidData = false, T224_okay = false;
	double T224_sx, T224_sy, T224_minx, T224_miny, T224_maxx, T224_maxy;
	boolean T224_lc1_horizontal, T224_lc1_vertical, T224_lc1_leftOrAbove, T224_lc1_cached;
	double T224_lc1_m, T224_lc1_C, T224_lc1_borderX, T224_lc1_borderY;
	boolean T224_lc2_horizontal, T224_lc2_vertical, T224_lc2_leftOrAbove, T224_lc2_cached;
	double T224_lc2_m, T224_lc2_C, T224_lc2_borderX, T224_lc2_borderY;
	boolean T224_lc3_horizontal, T224_lc3_vertical, T224_lc3_leftOrAbove, T224_lc3_cached;
	double T224_lc3_m, T224_lc3_C, T224_lc3_borderX, T224_lc3_borderY;
	int T224_r, T224_g, T224_b, T224_lc1_lastY = Integer.MIN_VALUE, T224_lc2_lastY = Integer.MIN_VALUE, T224_lc3_lastY = Integer.MIN_VALUE;

	boolean T225_initializedWithValidData = false, T225_okay = false;
	double T225_sx, T225_sy, T225_minx, T225_miny, T225_maxx, T225_maxy;
	boolean T225_lc1_horizontal, T225_lc1_vertical, T225_lc1_leftOrAbove, T225_lc1_cached;
	double T225_lc1_m, T225_lc1_C, T225_lc1_borderX, T225_lc1_borderY;
	boolean T225_lc2_horizontal, T225_lc2_vertical, T225_lc2_leftOrAbove, T225_lc2_cached;
	double T225_lc2_m, T225_lc2_C, T225_lc2_borderX, T225_lc2_borderY;
	boolean T225_lc3_horizontal, T225_lc3_vertical, T225_lc3_leftOrAbove, T225_lc3_cached;
	double T225_lc3_m, T225_lc3_C, T225_lc3_borderX, T225_lc3_borderY;
	int T225_r, T225_g, T225_b, T225_lc1_lastY = Integer.MIN_VALUE, T225_lc2_lastY = Integer.MIN_VALUE, T225_lc3_lastY = Integer.MIN_VALUE;

	boolean T226_initializedWithValidData = false, T226_okay = false;
	double T226_sx, T226_sy, T226_minx, T226_miny, T226_maxx, T226_maxy;
	boolean T226_lc1_horizontal, T226_lc1_vertical, T226_lc1_leftOrAbove, T226_lc1_cached;
	double T226_lc1_m, T226_lc1_C, T226_lc1_borderX, T226_lc1_borderY;
	boolean T226_lc2_horizontal, T226_lc2_vertical, T226_lc2_leftOrAbove, T226_lc2_cached;
	double T226_lc2_m, T226_lc2_C, T226_lc2_borderX, T226_lc2_borderY;
	boolean T226_lc3_horizontal, T226_lc3_vertical, T226_lc3_leftOrAbove, T226_lc3_cached;
	double T226_lc3_m, T226_lc3_C, T226_lc3_borderX, T226_lc3_borderY;
	int T226_r, T226_g, T226_b, T226_lc1_lastY = Integer.MIN_VALUE, T226_lc2_lastY = Integer.MIN_VALUE, T226_lc3_lastY = Integer.MIN_VALUE;

	boolean T227_initializedWithValidData = false, T227_okay = false;
	double T227_sx, T227_sy, T227_minx, T227_miny, T227_maxx, T227_maxy;
	boolean T227_lc1_horizontal, T227_lc1_vertical, T227_lc1_leftOrAbove, T227_lc1_cached;
	double T227_lc1_m, T227_lc1_C, T227_lc1_borderX, T227_lc1_borderY;
	boolean T227_lc2_horizontal, T227_lc2_vertical, T227_lc2_leftOrAbove, T227_lc2_cached;
	double T227_lc2_m, T227_lc2_C, T227_lc2_borderX, T227_lc2_borderY;
	boolean T227_lc3_horizontal, T227_lc3_vertical, T227_lc3_leftOrAbove, T227_lc3_cached;
	double T227_lc3_m, T227_lc3_C, T227_lc3_borderX, T227_lc3_borderY;
	int T227_r, T227_g, T227_b, T227_lc1_lastY = Integer.MIN_VALUE, T227_lc2_lastY = Integer.MIN_VALUE, T227_lc3_lastY = Integer.MIN_VALUE;

	boolean T228_initializedWithValidData = false, T228_okay = false;
	double T228_sx, T228_sy, T228_minx, T228_miny, T228_maxx, T228_maxy;
	boolean T228_lc1_horizontal, T228_lc1_vertical, T228_lc1_leftOrAbove, T228_lc1_cached;
	double T228_lc1_m, T228_lc1_C, T228_lc1_borderX, T228_lc1_borderY;
	boolean T228_lc2_horizontal, T228_lc2_vertical, T228_lc2_leftOrAbove, T228_lc2_cached;
	double T228_lc2_m, T228_lc2_C, T228_lc2_borderX, T228_lc2_borderY;
	boolean T228_lc3_horizontal, T228_lc3_vertical, T228_lc3_leftOrAbove, T228_lc3_cached;
	double T228_lc3_m, T228_lc3_C, T228_lc3_borderX, T228_lc3_borderY;
	int T228_r, T228_g, T228_b, T228_lc1_lastY = Integer.MIN_VALUE, T228_lc2_lastY = Integer.MIN_VALUE, T228_lc3_lastY = Integer.MIN_VALUE;

	boolean T229_initializedWithValidData = false, T229_okay = false;
	double T229_sx, T229_sy, T229_minx, T229_miny, T229_maxx, T229_maxy;
	boolean T229_lc1_horizontal, T229_lc1_vertical, T229_lc1_leftOrAbove, T229_lc1_cached;
	double T229_lc1_m, T229_lc1_C, T229_lc1_borderX, T229_lc1_borderY;
	boolean T229_lc2_horizontal, T229_lc2_vertical, T229_lc2_leftOrAbove, T229_lc2_cached;
	double T229_lc2_m, T229_lc2_C, T229_lc2_borderX, T229_lc2_borderY;
	boolean T229_lc3_horizontal, T229_lc3_vertical, T229_lc3_leftOrAbove, T229_lc3_cached;
	double T229_lc3_m, T229_lc3_C, T229_lc3_borderX, T229_lc3_borderY;
	int T229_r, T229_g, T229_b, T229_lc1_lastY = Integer.MIN_VALUE, T229_lc2_lastY = Integer.MIN_VALUE, T229_lc3_lastY = Integer.MIN_VALUE;

	boolean T230_initializedWithValidData = false, T230_okay = false;
	double T230_sx, T230_sy, T230_minx, T230_miny, T230_maxx, T230_maxy;
	boolean T230_lc1_horizontal, T230_lc1_vertical, T230_lc1_leftOrAbove, T230_lc1_cached;
	double T230_lc1_m, T230_lc1_C, T230_lc1_borderX, T230_lc1_borderY;
	boolean T230_lc2_horizontal, T230_lc2_vertical, T230_lc2_leftOrAbove, T230_lc2_cached;
	double T230_lc2_m, T230_lc2_C, T230_lc2_borderX, T230_lc2_borderY;
	boolean T230_lc3_horizontal, T230_lc3_vertical, T230_lc3_leftOrAbove, T230_lc3_cached;
	double T230_lc3_m, T230_lc3_C, T230_lc3_borderX, T230_lc3_borderY;
	int T230_r, T230_g, T230_b, T230_lc1_lastY = Integer.MIN_VALUE, T230_lc2_lastY = Integer.MIN_VALUE, T230_lc3_lastY = Integer.MIN_VALUE;

	boolean T231_initializedWithValidData = false, T231_okay = false;
	double T231_sx, T231_sy, T231_minx, T231_miny, T231_maxx, T231_maxy;
	boolean T231_lc1_horizontal, T231_lc1_vertical, T231_lc1_leftOrAbove, T231_lc1_cached;
	double T231_lc1_m, T231_lc1_C, T231_lc1_borderX, T231_lc1_borderY;
	boolean T231_lc2_horizontal, T231_lc2_vertical, T231_lc2_leftOrAbove, T231_lc2_cached;
	double T231_lc2_m, T231_lc2_C, T231_lc2_borderX, T231_lc2_borderY;
	boolean T231_lc3_horizontal, T231_lc3_vertical, T231_lc3_leftOrAbove, T231_lc3_cached;
	double T231_lc3_m, T231_lc3_C, T231_lc3_borderX, T231_lc3_borderY;
	int T231_r, T231_g, T231_b, T231_lc1_lastY = Integer.MIN_VALUE, T231_lc2_lastY = Integer.MIN_VALUE, T231_lc3_lastY = Integer.MIN_VALUE;

	boolean T232_initializedWithValidData = false, T232_okay = false;
	double T232_sx, T232_sy, T232_minx, T232_miny, T232_maxx, T232_maxy;
	boolean T232_lc1_horizontal, T232_lc1_vertical, T232_lc1_leftOrAbove, T232_lc1_cached;
	double T232_lc1_m, T232_lc1_C, T232_lc1_borderX, T232_lc1_borderY;
	boolean T232_lc2_horizontal, T232_lc2_vertical, T232_lc2_leftOrAbove, T232_lc2_cached;
	double T232_lc2_m, T232_lc2_C, T232_lc2_borderX, T232_lc2_borderY;
	boolean T232_lc3_horizontal, T232_lc3_vertical, T232_lc3_leftOrAbove, T232_lc3_cached;
	double T232_lc3_m, T232_lc3_C, T232_lc3_borderX, T232_lc3_borderY;
	int T232_r, T232_g, T232_b, T232_lc1_lastY = Integer.MIN_VALUE, T232_lc2_lastY = Integer.MIN_VALUE, T232_lc3_lastY = Integer.MIN_VALUE;

	boolean T233_initializedWithValidData = false, T233_okay = false;
	double T233_sx, T233_sy, T233_minx, T233_miny, T233_maxx, T233_maxy;
	boolean T233_lc1_horizontal, T233_lc1_vertical, T233_lc1_leftOrAbove, T233_lc1_cached;
	double T233_lc1_m, T233_lc1_C, T233_lc1_borderX, T233_lc1_borderY;
	boolean T233_lc2_horizontal, T233_lc2_vertical, T233_lc2_leftOrAbove, T233_lc2_cached;
	double T233_lc2_m, T233_lc2_C, T233_lc2_borderX, T233_lc2_borderY;
	boolean T233_lc3_horizontal, T233_lc3_vertical, T233_lc3_leftOrAbove, T233_lc3_cached;
	double T233_lc3_m, T233_lc3_C, T233_lc3_borderX, T233_lc3_borderY;
	int T233_r, T233_g, T233_b, T233_lc1_lastY = Integer.MIN_VALUE, T233_lc2_lastY = Integer.MIN_VALUE, T233_lc3_lastY = Integer.MIN_VALUE;

	boolean T234_initializedWithValidData = false, T234_okay = false;
	double T234_sx, T234_sy, T234_minx, T234_miny, T234_maxx, T234_maxy;
	boolean T234_lc1_horizontal, T234_lc1_vertical, T234_lc1_leftOrAbove, T234_lc1_cached;
	double T234_lc1_m, T234_lc1_C, T234_lc1_borderX, T234_lc1_borderY;
	boolean T234_lc2_horizontal, T234_lc2_vertical, T234_lc2_leftOrAbove, T234_lc2_cached;
	double T234_lc2_m, T234_lc2_C, T234_lc2_borderX, T234_lc2_borderY;
	boolean T234_lc3_horizontal, T234_lc3_vertical, T234_lc3_leftOrAbove, T234_lc3_cached;
	double T234_lc3_m, T234_lc3_C, T234_lc3_borderX, T234_lc3_borderY;
	int T234_r, T234_g, T234_b, T234_lc1_lastY = Integer.MIN_VALUE, T234_lc2_lastY = Integer.MIN_VALUE, T234_lc3_lastY = Integer.MIN_VALUE;

	boolean T235_initializedWithValidData = false, T235_okay = false;
	double T235_sx, T235_sy, T235_minx, T235_miny, T235_maxx, T235_maxy;
	boolean T235_lc1_horizontal, T235_lc1_vertical, T235_lc1_leftOrAbove, T235_lc1_cached;
	double T235_lc1_m, T235_lc1_C, T235_lc1_borderX, T235_lc1_borderY;
	boolean T235_lc2_horizontal, T235_lc2_vertical, T235_lc2_leftOrAbove, T235_lc2_cached;
	double T235_lc2_m, T235_lc2_C, T235_lc2_borderX, T235_lc2_borderY;
	boolean T235_lc3_horizontal, T235_lc3_vertical, T235_lc3_leftOrAbove, T235_lc3_cached;
	double T235_lc3_m, T235_lc3_C, T235_lc3_borderX, T235_lc3_borderY;
	int T235_r, T235_g, T235_b, T235_lc1_lastY = Integer.MIN_VALUE, T235_lc2_lastY = Integer.MIN_VALUE, T235_lc3_lastY = Integer.MIN_VALUE;

	boolean T236_initializedWithValidData = false, T236_okay = false;
	double T236_sx, T236_sy, T236_minx, T236_miny, T236_maxx, T236_maxy;
	boolean T236_lc1_horizontal, T236_lc1_vertical, T236_lc1_leftOrAbove, T236_lc1_cached;
	double T236_lc1_m, T236_lc1_C, T236_lc1_borderX, T236_lc1_borderY;
	boolean T236_lc2_horizontal, T236_lc2_vertical, T236_lc2_leftOrAbove, T236_lc2_cached;
	double T236_lc2_m, T236_lc2_C, T236_lc2_borderX, T236_lc2_borderY;
	boolean T236_lc3_horizontal, T236_lc3_vertical, T236_lc3_leftOrAbove, T236_lc3_cached;
	double T236_lc3_m, T236_lc3_C, T236_lc3_borderX, T236_lc3_borderY;
	int T236_r, T236_g, T236_b, T236_lc1_lastY = Integer.MIN_VALUE, T236_lc2_lastY = Integer.MIN_VALUE, T236_lc3_lastY = Integer.MIN_VALUE;

	boolean T237_initializedWithValidData = false, T237_okay = false;
	double T237_sx, T237_sy, T237_minx, T237_miny, T237_maxx, T237_maxy;
	boolean T237_lc1_horizontal, T237_lc1_vertical, T237_lc1_leftOrAbove, T237_lc1_cached;
	double T237_lc1_m, T237_lc1_C, T237_lc1_borderX, T237_lc1_borderY;
	boolean T237_lc2_horizontal, T237_lc2_vertical, T237_lc2_leftOrAbove, T237_lc2_cached;
	double T237_lc2_m, T237_lc2_C, T237_lc2_borderX, T237_lc2_borderY;
	boolean T237_lc3_horizontal, T237_lc3_vertical, T237_lc3_leftOrAbove, T237_lc3_cached;
	double T237_lc3_m, T237_lc3_C, T237_lc3_borderX, T237_lc3_borderY;
	int T237_r, T237_g, T237_b, T237_lc1_lastY = Integer.MIN_VALUE, T237_lc2_lastY = Integer.MIN_VALUE, T237_lc3_lastY = Integer.MIN_VALUE;

	boolean T238_initializedWithValidData = false, T238_okay = false;
	double T238_sx, T238_sy, T238_minx, T238_miny, T238_maxx, T238_maxy;
	boolean T238_lc1_horizontal, T238_lc1_vertical, T238_lc1_leftOrAbove, T238_lc1_cached;
	double T238_lc1_m, T238_lc1_C, T238_lc1_borderX, T238_lc1_borderY;
	boolean T238_lc2_horizontal, T238_lc2_vertical, T238_lc2_leftOrAbove, T238_lc2_cached;
	double T238_lc2_m, T238_lc2_C, T238_lc2_borderX, T238_lc2_borderY;
	boolean T238_lc3_horizontal, T238_lc3_vertical, T238_lc3_leftOrAbove, T238_lc3_cached;
	double T238_lc3_m, T238_lc3_C, T238_lc3_borderX, T238_lc3_borderY;
	int T238_r, T238_g, T238_b, T238_lc1_lastY = Integer.MIN_VALUE, T238_lc2_lastY = Integer.MIN_VALUE, T238_lc3_lastY = Integer.MIN_VALUE;

	boolean T239_initializedWithValidData = false, T239_okay = false;
	double T239_sx, T239_sy, T239_minx, T239_miny, T239_maxx, T239_maxy;
	boolean T239_lc1_horizontal, T239_lc1_vertical, T239_lc1_leftOrAbove, T239_lc1_cached;
	double T239_lc1_m, T239_lc1_C, T239_lc1_borderX, T239_lc1_borderY;
	boolean T239_lc2_horizontal, T239_lc2_vertical, T239_lc2_leftOrAbove, T239_lc2_cached;
	double T239_lc2_m, T239_lc2_C, T239_lc2_borderX, T239_lc2_borderY;
	boolean T239_lc3_horizontal, T239_lc3_vertical, T239_lc3_leftOrAbove, T239_lc3_cached;
	double T239_lc3_m, T239_lc3_C, T239_lc3_borderX, T239_lc3_borderY;
	int T239_r, T239_g, T239_b, T239_lc1_lastY = Integer.MIN_VALUE, T239_lc2_lastY = Integer.MIN_VALUE, T239_lc3_lastY = Integer.MIN_VALUE;

	boolean T240_initializedWithValidData = false, T240_okay = false;
	double T240_sx, T240_sy, T240_minx, T240_miny, T240_maxx, T240_maxy;
	boolean T240_lc1_horizontal, T240_lc1_vertical, T240_lc1_leftOrAbove, T240_lc1_cached;
	double T240_lc1_m, T240_lc1_C, T240_lc1_borderX, T240_lc1_borderY;
	boolean T240_lc2_horizontal, T240_lc2_vertical, T240_lc2_leftOrAbove, T240_lc2_cached;
	double T240_lc2_m, T240_lc2_C, T240_lc2_borderX, T240_lc2_borderY;
	boolean T240_lc3_horizontal, T240_lc3_vertical, T240_lc3_leftOrAbove, T240_lc3_cached;
	double T240_lc3_m, T240_lc3_C, T240_lc3_borderX, T240_lc3_borderY;
	int T240_r, T240_g, T240_b, T240_lc1_lastY = Integer.MIN_VALUE, T240_lc2_lastY = Integer.MIN_VALUE, T240_lc3_lastY = Integer.MIN_VALUE;

	boolean T241_initializedWithValidData = false, T241_okay = false;
	double T241_sx, T241_sy, T241_minx, T241_miny, T241_maxx, T241_maxy;
	boolean T241_lc1_horizontal, T241_lc1_vertical, T241_lc1_leftOrAbove, T241_lc1_cached;
	double T241_lc1_m, T241_lc1_C, T241_lc1_borderX, T241_lc1_borderY;
	boolean T241_lc2_horizontal, T241_lc2_vertical, T241_lc2_leftOrAbove, T241_lc2_cached;
	double T241_lc2_m, T241_lc2_C, T241_lc2_borderX, T241_lc2_borderY;
	boolean T241_lc3_horizontal, T241_lc3_vertical, T241_lc3_leftOrAbove, T241_lc3_cached;
	double T241_lc3_m, T241_lc3_C, T241_lc3_borderX, T241_lc3_borderY;
	int T241_r, T241_g, T241_b, T241_lc1_lastY = Integer.MIN_VALUE, T241_lc2_lastY = Integer.MIN_VALUE, T241_lc3_lastY = Integer.MIN_VALUE;

	boolean T242_initializedWithValidData = false, T242_okay = false;
	double T242_sx, T242_sy, T242_minx, T242_miny, T242_maxx, T242_maxy;
	boolean T242_lc1_horizontal, T242_lc1_vertical, T242_lc1_leftOrAbove, T242_lc1_cached;
	double T242_lc1_m, T242_lc1_C, T242_lc1_borderX, T242_lc1_borderY;
	boolean T242_lc2_horizontal, T242_lc2_vertical, T242_lc2_leftOrAbove, T242_lc2_cached;
	double T242_lc2_m, T242_lc2_C, T242_lc2_borderX, T242_lc2_borderY;
	boolean T242_lc3_horizontal, T242_lc3_vertical, T242_lc3_leftOrAbove, T242_lc3_cached;
	double T242_lc3_m, T242_lc3_C, T242_lc3_borderX, T242_lc3_borderY;
	int T242_r, T242_g, T242_b, T242_lc1_lastY = Integer.MIN_VALUE, T242_lc2_lastY = Integer.MIN_VALUE, T242_lc3_lastY = Integer.MIN_VALUE;

	boolean T243_initializedWithValidData = false, T243_okay = false;
	double T243_sx, T243_sy, T243_minx, T243_miny, T243_maxx, T243_maxy;
	boolean T243_lc1_horizontal, T243_lc1_vertical, T243_lc1_leftOrAbove, T243_lc1_cached;
	double T243_lc1_m, T243_lc1_C, T243_lc1_borderX, T243_lc1_borderY;
	boolean T243_lc2_horizontal, T243_lc2_vertical, T243_lc2_leftOrAbove, T243_lc2_cached;
	double T243_lc2_m, T243_lc2_C, T243_lc2_borderX, T243_lc2_borderY;
	boolean T243_lc3_horizontal, T243_lc3_vertical, T243_lc3_leftOrAbove, T243_lc3_cached;
	double T243_lc3_m, T243_lc3_C, T243_lc3_borderX, T243_lc3_borderY;
	int T243_r, T243_g, T243_b, T243_lc1_lastY = Integer.MIN_VALUE, T243_lc2_lastY = Integer.MIN_VALUE, T243_lc3_lastY = Integer.MIN_VALUE;

	boolean T244_initializedWithValidData = false, T244_okay = false;
	double T244_sx, T244_sy, T244_minx, T244_miny, T244_maxx, T244_maxy;
	boolean T244_lc1_horizontal, T244_lc1_vertical, T244_lc1_leftOrAbove, T244_lc1_cached;
	double T244_lc1_m, T244_lc1_C, T244_lc1_borderX, T244_lc1_borderY;
	boolean T244_lc2_horizontal, T244_lc2_vertical, T244_lc2_leftOrAbove, T244_lc2_cached;
	double T244_lc2_m, T244_lc2_C, T244_lc2_borderX, T244_lc2_borderY;
	boolean T244_lc3_horizontal, T244_lc3_vertical, T244_lc3_leftOrAbove, T244_lc3_cached;
	double T244_lc3_m, T244_lc3_C, T244_lc3_borderX, T244_lc3_borderY;
	int T244_r, T244_g, T244_b, T244_lc1_lastY = Integer.MIN_VALUE, T244_lc2_lastY = Integer.MIN_VALUE, T244_lc3_lastY = Integer.MIN_VALUE;

	boolean T245_initializedWithValidData = false, T245_okay = false;
	double T245_sx, T245_sy, T245_minx, T245_miny, T245_maxx, T245_maxy;
	boolean T245_lc1_horizontal, T245_lc1_vertical, T245_lc1_leftOrAbove, T245_lc1_cached;
	double T245_lc1_m, T245_lc1_C, T245_lc1_borderX, T245_lc1_borderY;
	boolean T245_lc2_horizontal, T245_lc2_vertical, T245_lc2_leftOrAbove, T245_lc2_cached;
	double T245_lc2_m, T245_lc2_C, T245_lc2_borderX, T245_lc2_borderY;
	boolean T245_lc3_horizontal, T245_lc3_vertical, T245_lc3_leftOrAbove, T245_lc3_cached;
	double T245_lc3_m, T245_lc3_C, T245_lc3_borderX, T245_lc3_borderY;
	int T245_r, T245_g, T245_b, T245_lc1_lastY = Integer.MIN_VALUE, T245_lc2_lastY = Integer.MIN_VALUE, T245_lc3_lastY = Integer.MIN_VALUE;

	boolean T246_initializedWithValidData = false, T246_okay = false;
	double T246_sx, T246_sy, T246_minx, T246_miny, T246_maxx, T246_maxy;
	boolean T246_lc1_horizontal, T246_lc1_vertical, T246_lc1_leftOrAbove, T246_lc1_cached;
	double T246_lc1_m, T246_lc1_C, T246_lc1_borderX, T246_lc1_borderY;
	boolean T246_lc2_horizontal, T246_lc2_vertical, T246_lc2_leftOrAbove, T246_lc2_cached;
	double T246_lc2_m, T246_lc2_C, T246_lc2_borderX, T246_lc2_borderY;
	boolean T246_lc3_horizontal, T246_lc3_vertical, T246_lc3_leftOrAbove, T246_lc3_cached;
	double T246_lc3_m, T246_lc3_C, T246_lc3_borderX, T246_lc3_borderY;
	int T246_r, T246_g, T246_b, T246_lc1_lastY = Integer.MIN_VALUE, T246_lc2_lastY = Integer.MIN_VALUE, T246_lc3_lastY = Integer.MIN_VALUE;

	boolean T247_initializedWithValidData = false, T247_okay = false;
	double T247_sx, T247_sy, T247_minx, T247_miny, T247_maxx, T247_maxy;
	boolean T247_lc1_horizontal, T247_lc1_vertical, T247_lc1_leftOrAbove, T247_lc1_cached;
	double T247_lc1_m, T247_lc1_C, T247_lc1_borderX, T247_lc1_borderY;
	boolean T247_lc2_horizontal, T247_lc2_vertical, T247_lc2_leftOrAbove, T247_lc2_cached;
	double T247_lc2_m, T247_lc2_C, T247_lc2_borderX, T247_lc2_borderY;
	boolean T247_lc3_horizontal, T247_lc3_vertical, T247_lc3_leftOrAbove, T247_lc3_cached;
	double T247_lc3_m, T247_lc3_C, T247_lc3_borderX, T247_lc3_borderY;
	int T247_r, T247_g, T247_b, T247_lc1_lastY = Integer.MIN_VALUE, T247_lc2_lastY = Integer.MIN_VALUE, T247_lc3_lastY = Integer.MIN_VALUE;

	boolean T248_initializedWithValidData = false, T248_okay = false;
	double T248_sx, T248_sy, T248_minx, T248_miny, T248_maxx, T248_maxy;
	boolean T248_lc1_horizontal, T248_lc1_vertical, T248_lc1_leftOrAbove, T248_lc1_cached;
	double T248_lc1_m, T248_lc1_C, T248_lc1_borderX, T248_lc1_borderY;
	boolean T248_lc2_horizontal, T248_lc2_vertical, T248_lc2_leftOrAbove, T248_lc2_cached;
	double T248_lc2_m, T248_lc2_C, T248_lc2_borderX, T248_lc2_borderY;
	boolean T248_lc3_horizontal, T248_lc3_vertical, T248_lc3_leftOrAbove, T248_lc3_cached;
	double T248_lc3_m, T248_lc3_C, T248_lc3_borderX, T248_lc3_borderY;
	int T248_r, T248_g, T248_b, T248_lc1_lastY = Integer.MIN_VALUE, T248_lc2_lastY = Integer.MIN_VALUE, T248_lc3_lastY = Integer.MIN_VALUE;

	boolean T249_initializedWithValidData = false, T249_okay = false;
	double T249_sx, T249_sy, T249_minx, T249_miny, T249_maxx, T249_maxy;
	boolean T249_lc1_horizontal, T249_lc1_vertical, T249_lc1_leftOrAbove, T249_lc1_cached;
	double T249_lc1_m, T249_lc1_C, T249_lc1_borderX, T249_lc1_borderY;
	boolean T249_lc2_horizontal, T249_lc2_vertical, T249_lc2_leftOrAbove, T249_lc2_cached;
	double T249_lc2_m, T249_lc2_C, T249_lc2_borderX, T249_lc2_borderY;
	boolean T249_lc3_horizontal, T249_lc3_vertical, T249_lc3_leftOrAbove, T249_lc3_cached;
	double T249_lc3_m, T249_lc3_C, T249_lc3_borderX, T249_lc3_borderY;
	int T249_r, T249_g, T249_b, T249_lc1_lastY = Integer.MIN_VALUE, T249_lc2_lastY = Integer.MIN_VALUE, T249_lc3_lastY = Integer.MIN_VALUE;

	boolean T250_initializedWithValidData = false, T250_okay = false;
	double T250_sx, T250_sy, T250_minx, T250_miny, T250_maxx, T250_maxy;
	boolean T250_lc1_horizontal, T250_lc1_vertical, T250_lc1_leftOrAbove, T250_lc1_cached;
	double T250_lc1_m, T250_lc1_C, T250_lc1_borderX, T250_lc1_borderY;
	boolean T250_lc2_horizontal, T250_lc2_vertical, T250_lc2_leftOrAbove, T250_lc2_cached;
	double T250_lc2_m, T250_lc2_C, T250_lc2_borderX, T250_lc2_borderY;
	boolean T250_lc3_horizontal, T250_lc3_vertical, T250_lc3_leftOrAbove, T250_lc3_cached;
	double T250_lc3_m, T250_lc3_C, T250_lc3_borderX, T250_lc3_borderY;
	int T250_r, T250_g, T250_b, T250_lc1_lastY = Integer.MIN_VALUE, T250_lc2_lastY = Integer.MIN_VALUE, T250_lc3_lastY = Integer.MIN_VALUE;

	boolean T251_initializedWithValidData = false, T251_okay = false;
	double T251_sx, T251_sy, T251_minx, T251_miny, T251_maxx, T251_maxy;
	boolean T251_lc1_horizontal, T251_lc1_vertical, T251_lc1_leftOrAbove, T251_lc1_cached;
	double T251_lc1_m, T251_lc1_C, T251_lc1_borderX, T251_lc1_borderY;
	boolean T251_lc2_horizontal, T251_lc2_vertical, T251_lc2_leftOrAbove, T251_lc2_cached;
	double T251_lc2_m, T251_lc2_C, T251_lc2_borderX, T251_lc2_borderY;
	boolean T251_lc3_horizontal, T251_lc3_vertical, T251_lc3_leftOrAbove, T251_lc3_cached;
	double T251_lc3_m, T251_lc3_C, T251_lc3_borderX, T251_lc3_borderY;
	int T251_r, T251_g, T251_b, T251_lc1_lastY = Integer.MIN_VALUE, T251_lc2_lastY = Integer.MIN_VALUE, T251_lc3_lastY = Integer.MIN_VALUE;

	boolean T252_initializedWithValidData = false, T252_okay = false;
	double T252_sx, T252_sy, T252_minx, T252_miny, T252_maxx, T252_maxy;
	boolean T252_lc1_horizontal, T252_lc1_vertical, T252_lc1_leftOrAbove, T252_lc1_cached;
	double T252_lc1_m, T252_lc1_C, T252_lc1_borderX, T252_lc1_borderY;
	boolean T252_lc2_horizontal, T252_lc2_vertical, T252_lc2_leftOrAbove, T252_lc2_cached;
	double T252_lc2_m, T252_lc2_C, T252_lc2_borderX, T252_lc2_borderY;
	boolean T252_lc3_horizontal, T252_lc3_vertical, T252_lc3_leftOrAbove, T252_lc3_cached;
	double T252_lc3_m, T252_lc3_C, T252_lc3_borderX, T252_lc3_borderY;
	int T252_r, T252_g, T252_b, T252_lc1_lastY = Integer.MIN_VALUE, T252_lc2_lastY = Integer.MIN_VALUE, T252_lc3_lastY = Integer.MIN_VALUE;

	boolean T253_initializedWithValidData = false, T253_okay = false;
	double T253_sx, T253_sy, T253_minx, T253_miny, T253_maxx, T253_maxy;
	boolean T253_lc1_horizontal, T253_lc1_vertical, T253_lc1_leftOrAbove, T253_lc1_cached;
	double T253_lc1_m, T253_lc1_C, T253_lc1_borderX, T253_lc1_borderY;
	boolean T253_lc2_horizontal, T253_lc2_vertical, T253_lc2_leftOrAbove, T253_lc2_cached;
	double T253_lc2_m, T253_lc2_C, T253_lc2_borderX, T253_lc2_borderY;
	boolean T253_lc3_horizontal, T253_lc3_vertical, T253_lc3_leftOrAbove, T253_lc3_cached;
	double T253_lc3_m, T253_lc3_C, T253_lc3_borderX, T253_lc3_borderY;
	int T253_r, T253_g, T253_b, T253_lc1_lastY = Integer.MIN_VALUE, T253_lc2_lastY = Integer.MIN_VALUE, T253_lc3_lastY = Integer.MIN_VALUE;

	boolean T254_initializedWithValidData = false, T254_okay = false;
	double T254_sx, T254_sy, T254_minx, T254_miny, T254_maxx, T254_maxy;
	boolean T254_lc1_horizontal, T254_lc1_vertical, T254_lc1_leftOrAbove, T254_lc1_cached;
	double T254_lc1_m, T254_lc1_C, T254_lc1_borderX, T254_lc1_borderY;
	boolean T254_lc2_horizontal, T254_lc2_vertical, T254_lc2_leftOrAbove, T254_lc2_cached;
	double T254_lc2_m, T254_lc2_C, T254_lc2_borderX, T254_lc2_borderY;
	boolean T254_lc3_horizontal, T254_lc3_vertical, T254_lc3_leftOrAbove, T254_lc3_cached;
	double T254_lc3_m, T254_lc3_C, T254_lc3_borderX, T254_lc3_borderY;
	int T254_r, T254_g, T254_b, T254_lc1_lastY = Integer.MIN_VALUE, T254_lc2_lastY = Integer.MIN_VALUE, T254_lc3_lastY = Integer.MIN_VALUE;

	boolean T255_initializedWithValidData = false, T255_okay = false;
	double T255_sx, T255_sy, T255_minx, T255_miny, T255_maxx, T255_maxy;
	boolean T255_lc1_horizontal, T255_lc1_vertical, T255_lc1_leftOrAbove, T255_lc1_cached;
	double T255_lc1_m, T255_lc1_C, T255_lc1_borderX, T255_lc1_borderY;
	boolean T255_lc2_horizontal, T255_lc2_vertical, T255_lc2_leftOrAbove, T255_lc2_cached;
	double T255_lc2_m, T255_lc2_C, T255_lc2_borderX, T255_lc2_borderY;
	boolean T255_lc3_horizontal, T255_lc3_vertical, T255_lc3_leftOrAbove, T255_lc3_cached;
	double T255_lc3_m, T255_lc3_C, T255_lc3_borderX, T255_lc3_borderY;
	int T255_r, T255_g, T255_b, T255_lc1_lastY = Integer.MIN_VALUE, T255_lc2_lastY = Integer.MIN_VALUE, T255_lc3_lastY = Integer.MIN_VALUE;

	boolean T256_initializedWithValidData = false, T256_okay = false;
	double T256_sx, T256_sy, T256_minx, T256_miny, T256_maxx, T256_maxy;
	boolean T256_lc1_horizontal, T256_lc1_vertical, T256_lc1_leftOrAbove, T256_lc1_cached;
	double T256_lc1_m, T256_lc1_C, T256_lc1_borderX, T256_lc1_borderY;
	boolean T256_lc2_horizontal, T256_lc2_vertical, T256_lc2_leftOrAbove, T256_lc2_cached;
	double T256_lc2_m, T256_lc2_C, T256_lc2_borderX, T256_lc2_borderY;
	boolean T256_lc3_horizontal, T256_lc3_vertical, T256_lc3_leftOrAbove, T256_lc3_cached;
	double T256_lc3_m, T256_lc3_C, T256_lc3_borderX, T256_lc3_borderY;
	int T256_r, T256_g, T256_b, T256_lc1_lastY = Integer.MIN_VALUE, T256_lc2_lastY = Integer.MIN_VALUE, T256_lc3_lastY = Integer.MIN_VALUE;

	boolean T257_initializedWithValidData = false, T257_okay = false;
	double T257_sx, T257_sy, T257_minx, T257_miny, T257_maxx, T257_maxy;
	boolean T257_lc1_horizontal, T257_lc1_vertical, T257_lc1_leftOrAbove, T257_lc1_cached;
	double T257_lc1_m, T257_lc1_C, T257_lc1_borderX, T257_lc1_borderY;
	boolean T257_lc2_horizontal, T257_lc2_vertical, T257_lc2_leftOrAbove, T257_lc2_cached;
	double T257_lc2_m, T257_lc2_C, T257_lc2_borderX, T257_lc2_borderY;
	boolean T257_lc3_horizontal, T257_lc3_vertical, T257_lc3_leftOrAbove, T257_lc3_cached;
	double T257_lc3_m, T257_lc3_C, T257_lc3_borderX, T257_lc3_borderY;
	int T257_r, T257_g, T257_b, T257_lc1_lastY = Integer.MIN_VALUE, T257_lc2_lastY = Integer.MIN_VALUE, T257_lc3_lastY = Integer.MIN_VALUE;

	boolean T258_initializedWithValidData = false, T258_okay = false;
	double T258_sx, T258_sy, T258_minx, T258_miny, T258_maxx, T258_maxy;
	boolean T258_lc1_horizontal, T258_lc1_vertical, T258_lc1_leftOrAbove, T258_lc1_cached;
	double T258_lc1_m, T258_lc1_C, T258_lc1_borderX, T258_lc1_borderY;
	boolean T258_lc2_horizontal, T258_lc2_vertical, T258_lc2_leftOrAbove, T258_lc2_cached;
	double T258_lc2_m, T258_lc2_C, T258_lc2_borderX, T258_lc2_borderY;
	boolean T258_lc3_horizontal, T258_lc3_vertical, T258_lc3_leftOrAbove, T258_lc3_cached;
	double T258_lc3_m, T258_lc3_C, T258_lc3_borderX, T258_lc3_borderY;
	int T258_r, T258_g, T258_b, T258_lc1_lastY = Integer.MIN_VALUE, T258_lc2_lastY = Integer.MIN_VALUE, T258_lc3_lastY = Integer.MIN_VALUE;

	boolean T259_initializedWithValidData = false, T259_okay = false;
	double T259_sx, T259_sy, T259_minx, T259_miny, T259_maxx, T259_maxy;
	boolean T259_lc1_horizontal, T259_lc1_vertical, T259_lc1_leftOrAbove, T259_lc1_cached;
	double T259_lc1_m, T259_lc1_C, T259_lc1_borderX, T259_lc1_borderY;
	boolean T259_lc2_horizontal, T259_lc2_vertical, T259_lc2_leftOrAbove, T259_lc2_cached;
	double T259_lc2_m, T259_lc2_C, T259_lc2_borderX, T259_lc2_borderY;
	boolean T259_lc3_horizontal, T259_lc3_vertical, T259_lc3_leftOrAbove, T259_lc3_cached;
	double T259_lc3_m, T259_lc3_C, T259_lc3_borderX, T259_lc3_borderY;
	int T259_r, T259_g, T259_b, T259_lc1_lastY = Integer.MIN_VALUE, T259_lc2_lastY = Integer.MIN_VALUE, T259_lc3_lastY = Integer.MIN_VALUE;

	boolean T260_initializedWithValidData = false, T260_okay = false;
	double T260_sx, T260_sy, T260_minx, T260_miny, T260_maxx, T260_maxy;
	boolean T260_lc1_horizontal, T260_lc1_vertical, T260_lc1_leftOrAbove, T260_lc1_cached;
	double T260_lc1_m, T260_lc1_C, T260_lc1_borderX, T260_lc1_borderY;
	boolean T260_lc2_horizontal, T260_lc2_vertical, T260_lc2_leftOrAbove, T260_lc2_cached;
	double T260_lc2_m, T260_lc2_C, T260_lc2_borderX, T260_lc2_borderY;
	boolean T260_lc3_horizontal, T260_lc3_vertical, T260_lc3_leftOrAbove, T260_lc3_cached;
	double T260_lc3_m, T260_lc3_C, T260_lc3_borderX, T260_lc3_borderY;
	int T260_r, T260_g, T260_b, T260_lc1_lastY = Integer.MIN_VALUE, T260_lc2_lastY = Integer.MIN_VALUE, T260_lc3_lastY = Integer.MIN_VALUE;

	boolean T261_initializedWithValidData = false, T261_okay = false;
	double T261_sx, T261_sy, T261_minx, T261_miny, T261_maxx, T261_maxy;
	boolean T261_lc1_horizontal, T261_lc1_vertical, T261_lc1_leftOrAbove, T261_lc1_cached;
	double T261_lc1_m, T261_lc1_C, T261_lc1_borderX, T261_lc1_borderY;
	boolean T261_lc2_horizontal, T261_lc2_vertical, T261_lc2_leftOrAbove, T261_lc2_cached;
	double T261_lc2_m, T261_lc2_C, T261_lc2_borderX, T261_lc2_borderY;
	boolean T261_lc3_horizontal, T261_lc3_vertical, T261_lc3_leftOrAbove, T261_lc3_cached;
	double T261_lc3_m, T261_lc3_C, T261_lc3_borderX, T261_lc3_borderY;
	int T261_r, T261_g, T261_b, T261_lc1_lastY = Integer.MIN_VALUE, T261_lc2_lastY = Integer.MIN_VALUE, T261_lc3_lastY = Integer.MIN_VALUE;

	boolean T262_initializedWithValidData = false, T262_okay = false;
	double T262_sx, T262_sy, T262_minx, T262_miny, T262_maxx, T262_maxy;
	boolean T262_lc1_horizontal, T262_lc1_vertical, T262_lc1_leftOrAbove, T262_lc1_cached;
	double T262_lc1_m, T262_lc1_C, T262_lc1_borderX, T262_lc1_borderY;
	boolean T262_lc2_horizontal, T262_lc2_vertical, T262_lc2_leftOrAbove, T262_lc2_cached;
	double T262_lc2_m, T262_lc2_C, T262_lc2_borderX, T262_lc2_borderY;
	boolean T262_lc3_horizontal, T262_lc3_vertical, T262_lc3_leftOrAbove, T262_lc3_cached;
	double T262_lc3_m, T262_lc3_C, T262_lc3_borderX, T262_lc3_borderY;
	int T262_r, T262_g, T262_b, T262_lc1_lastY = Integer.MIN_VALUE, T262_lc2_lastY = Integer.MIN_VALUE, T262_lc3_lastY = Integer.MIN_VALUE;

	boolean T263_initializedWithValidData = false, T263_okay = false;
	double T263_sx, T263_sy, T263_minx, T263_miny, T263_maxx, T263_maxy;
	boolean T263_lc1_horizontal, T263_lc1_vertical, T263_lc1_leftOrAbove, T263_lc1_cached;
	double T263_lc1_m, T263_lc1_C, T263_lc1_borderX, T263_lc1_borderY;
	boolean T263_lc2_horizontal, T263_lc2_vertical, T263_lc2_leftOrAbove, T263_lc2_cached;
	double T263_lc2_m, T263_lc2_C, T263_lc2_borderX, T263_lc2_borderY;
	boolean T263_lc3_horizontal, T263_lc3_vertical, T263_lc3_leftOrAbove, T263_lc3_cached;
	double T263_lc3_m, T263_lc3_C, T263_lc3_borderX, T263_lc3_borderY;
	int T263_r, T263_g, T263_b, T263_lc1_lastY = Integer.MIN_VALUE, T263_lc2_lastY = Integer.MIN_VALUE, T263_lc3_lastY = Integer.MIN_VALUE;

	boolean T264_initializedWithValidData = false, T264_okay = false;
	double T264_sx, T264_sy, T264_minx, T264_miny, T264_maxx, T264_maxy;
	boolean T264_lc1_horizontal, T264_lc1_vertical, T264_lc1_leftOrAbove, T264_lc1_cached;
	double T264_lc1_m, T264_lc1_C, T264_lc1_borderX, T264_lc1_borderY;
	boolean T264_lc2_horizontal, T264_lc2_vertical, T264_lc2_leftOrAbove, T264_lc2_cached;
	double T264_lc2_m, T264_lc2_C, T264_lc2_borderX, T264_lc2_borderY;
	boolean T264_lc3_horizontal, T264_lc3_vertical, T264_lc3_leftOrAbove, T264_lc3_cached;
	double T264_lc3_m, T264_lc3_C, T264_lc3_borderX, T264_lc3_borderY;
	int T264_r, T264_g, T264_b, T264_lc1_lastY = Integer.MIN_VALUE, T264_lc2_lastY = Integer.MIN_VALUE, T264_lc3_lastY = Integer.MIN_VALUE;

	boolean T265_initializedWithValidData = false, T265_okay = false;
	double T265_sx, T265_sy, T265_minx, T265_miny, T265_maxx, T265_maxy;
	boolean T265_lc1_horizontal, T265_lc1_vertical, T265_lc1_leftOrAbove, T265_lc1_cached;
	double T265_lc1_m, T265_lc1_C, T265_lc1_borderX, T265_lc1_borderY;
	boolean T265_lc2_horizontal, T265_lc2_vertical, T265_lc2_leftOrAbove, T265_lc2_cached;
	double T265_lc2_m, T265_lc2_C, T265_lc2_borderX, T265_lc2_borderY;
	boolean T265_lc3_horizontal, T265_lc3_vertical, T265_lc3_leftOrAbove, T265_lc3_cached;
	double T265_lc3_m, T265_lc3_C, T265_lc3_borderX, T265_lc3_borderY;
	int T265_r, T265_g, T265_b, T265_lc1_lastY = Integer.MIN_VALUE, T265_lc2_lastY = Integer.MIN_VALUE, T265_lc3_lastY = Integer.MIN_VALUE;

	boolean T266_initializedWithValidData = false, T266_okay = false;
	double T266_sx, T266_sy, T266_minx, T266_miny, T266_maxx, T266_maxy;
	boolean T266_lc1_horizontal, T266_lc1_vertical, T266_lc1_leftOrAbove, T266_lc1_cached;
	double T266_lc1_m, T266_lc1_C, T266_lc1_borderX, T266_lc1_borderY;
	boolean T266_lc2_horizontal, T266_lc2_vertical, T266_lc2_leftOrAbove, T266_lc2_cached;
	double T266_lc2_m, T266_lc2_C, T266_lc2_borderX, T266_lc2_borderY;
	boolean T266_lc3_horizontal, T266_lc3_vertical, T266_lc3_leftOrAbove, T266_lc3_cached;
	double T266_lc3_m, T266_lc3_C, T266_lc3_borderX, T266_lc3_borderY;
	int T266_r, T266_g, T266_b, T266_lc1_lastY = Integer.MIN_VALUE, T266_lc2_lastY = Integer.MIN_VALUE, T266_lc3_lastY = Integer.MIN_VALUE;

	boolean T267_initializedWithValidData = false, T267_okay = false;
	double T267_sx, T267_sy, T267_minx, T267_miny, T267_maxx, T267_maxy;
	boolean T267_lc1_horizontal, T267_lc1_vertical, T267_lc1_leftOrAbove, T267_lc1_cached;
	double T267_lc1_m, T267_lc1_C, T267_lc1_borderX, T267_lc1_borderY;
	boolean T267_lc2_horizontal, T267_lc2_vertical, T267_lc2_leftOrAbove, T267_lc2_cached;
	double T267_lc2_m, T267_lc2_C, T267_lc2_borderX, T267_lc2_borderY;
	boolean T267_lc3_horizontal, T267_lc3_vertical, T267_lc3_leftOrAbove, T267_lc3_cached;
	double T267_lc3_m, T267_lc3_C, T267_lc3_borderX, T267_lc3_borderY;
	int T267_r, T267_g, T267_b, T267_lc1_lastY = Integer.MIN_VALUE, T267_lc2_lastY = Integer.MIN_VALUE, T267_lc3_lastY = Integer.MIN_VALUE;

	boolean T268_initializedWithValidData = false, T268_okay = false;
	double T268_sx, T268_sy, T268_minx, T268_miny, T268_maxx, T268_maxy;
	boolean T268_lc1_horizontal, T268_lc1_vertical, T268_lc1_leftOrAbove, T268_lc1_cached;
	double T268_lc1_m, T268_lc1_C, T268_lc1_borderX, T268_lc1_borderY;
	boolean T268_lc2_horizontal, T268_lc2_vertical, T268_lc2_leftOrAbove, T268_lc2_cached;
	double T268_lc2_m, T268_lc2_C, T268_lc2_borderX, T268_lc2_borderY;
	boolean T268_lc3_horizontal, T268_lc3_vertical, T268_lc3_leftOrAbove, T268_lc3_cached;
	double T268_lc3_m, T268_lc3_C, T268_lc3_borderX, T268_lc3_borderY;
	int T268_r, T268_g, T268_b, T268_lc1_lastY = Integer.MIN_VALUE, T268_lc2_lastY = Integer.MIN_VALUE, T268_lc3_lastY = Integer.MIN_VALUE;

	boolean T269_initializedWithValidData = false, T269_okay = false;
	double T269_sx, T269_sy, T269_minx, T269_miny, T269_maxx, T269_maxy;
	boolean T269_lc1_horizontal, T269_lc1_vertical, T269_lc1_leftOrAbove, T269_lc1_cached;
	double T269_lc1_m, T269_lc1_C, T269_lc1_borderX, T269_lc1_borderY;
	boolean T269_lc2_horizontal, T269_lc2_vertical, T269_lc2_leftOrAbove, T269_lc2_cached;
	double T269_lc2_m, T269_lc2_C, T269_lc2_borderX, T269_lc2_borderY;
	boolean T269_lc3_horizontal, T269_lc3_vertical, T269_lc3_leftOrAbove, T269_lc3_cached;
	double T269_lc3_m, T269_lc3_C, T269_lc3_borderX, T269_lc3_borderY;
	int T269_r, T269_g, T269_b, T269_lc1_lastY = Integer.MIN_VALUE, T269_lc2_lastY = Integer.MIN_VALUE, T269_lc3_lastY = Integer.MIN_VALUE;

	boolean T270_initializedWithValidData = false, T270_okay = false;
	double T270_sx, T270_sy, T270_minx, T270_miny, T270_maxx, T270_maxy;
	boolean T270_lc1_horizontal, T270_lc1_vertical, T270_lc1_leftOrAbove, T270_lc1_cached;
	double T270_lc1_m, T270_lc1_C, T270_lc1_borderX, T270_lc1_borderY;
	boolean T270_lc2_horizontal, T270_lc2_vertical, T270_lc2_leftOrAbove, T270_lc2_cached;
	double T270_lc2_m, T270_lc2_C, T270_lc2_borderX, T270_lc2_borderY;
	boolean T270_lc3_horizontal, T270_lc3_vertical, T270_lc3_leftOrAbove, T270_lc3_cached;
	double T270_lc3_m, T270_lc3_C, T270_lc3_borderX, T270_lc3_borderY;
	int T270_r, T270_g, T270_b, T270_lc1_lastY = Integer.MIN_VALUE, T270_lc2_lastY = Integer.MIN_VALUE, T270_lc3_lastY = Integer.MIN_VALUE;

	boolean T271_initializedWithValidData = false, T271_okay = false;
	double T271_sx, T271_sy, T271_minx, T271_miny, T271_maxx, T271_maxy;
	boolean T271_lc1_horizontal, T271_lc1_vertical, T271_lc1_leftOrAbove, T271_lc1_cached;
	double T271_lc1_m, T271_lc1_C, T271_lc1_borderX, T271_lc1_borderY;
	boolean T271_lc2_horizontal, T271_lc2_vertical, T271_lc2_leftOrAbove, T271_lc2_cached;
	double T271_lc2_m, T271_lc2_C, T271_lc2_borderX, T271_lc2_borderY;
	boolean T271_lc3_horizontal, T271_lc3_vertical, T271_lc3_leftOrAbove, T271_lc3_cached;
	double T271_lc3_m, T271_lc3_C, T271_lc3_borderX, T271_lc3_borderY;
	int T271_r, T271_g, T271_b, T271_lc1_lastY = Integer.MIN_VALUE, T271_lc2_lastY = Integer.MIN_VALUE, T271_lc3_lastY = Integer.MIN_VALUE;

	boolean T272_initializedWithValidData = false, T272_okay = false;
	double T272_sx, T272_sy, T272_minx, T272_miny, T272_maxx, T272_maxy;
	boolean T272_lc1_horizontal, T272_lc1_vertical, T272_lc1_leftOrAbove, T272_lc1_cached;
	double T272_lc1_m, T272_lc1_C, T272_lc1_borderX, T272_lc1_borderY;
	boolean T272_lc2_horizontal, T272_lc2_vertical, T272_lc2_leftOrAbove, T272_lc2_cached;
	double T272_lc2_m, T272_lc2_C, T272_lc2_borderX, T272_lc2_borderY;
	boolean T272_lc3_horizontal, T272_lc3_vertical, T272_lc3_leftOrAbove, T272_lc3_cached;
	double T272_lc3_m, T272_lc3_C, T272_lc3_borderX, T272_lc3_borderY;
	int T272_r, T272_g, T272_b, T272_lc1_lastY = Integer.MIN_VALUE, T272_lc2_lastY = Integer.MIN_VALUE, T272_lc3_lastY = Integer.MIN_VALUE;

	boolean T273_initializedWithValidData = false, T273_okay = false;
	double T273_sx, T273_sy, T273_minx, T273_miny, T273_maxx, T273_maxy;
	boolean T273_lc1_horizontal, T273_lc1_vertical, T273_lc1_leftOrAbove, T273_lc1_cached;
	double T273_lc1_m, T273_lc1_C, T273_lc1_borderX, T273_lc1_borderY;
	boolean T273_lc2_horizontal, T273_lc2_vertical, T273_lc2_leftOrAbove, T273_lc2_cached;
	double T273_lc2_m, T273_lc2_C, T273_lc2_borderX, T273_lc2_borderY;
	boolean T273_lc3_horizontal, T273_lc3_vertical, T273_lc3_leftOrAbove, T273_lc3_cached;
	double T273_lc3_m, T273_lc3_C, T273_lc3_borderX, T273_lc3_borderY;
	int T273_r, T273_g, T273_b, T273_lc1_lastY = Integer.MIN_VALUE, T273_lc2_lastY = Integer.MIN_VALUE, T273_lc3_lastY = Integer.MIN_VALUE;

	boolean T274_initializedWithValidData = false, T274_okay = false;
	double T274_sx, T274_sy, T274_minx, T274_miny, T274_maxx, T274_maxy;
	boolean T274_lc1_horizontal, T274_lc1_vertical, T274_lc1_leftOrAbove, T274_lc1_cached;
	double T274_lc1_m, T274_lc1_C, T274_lc1_borderX, T274_lc1_borderY;
	boolean T274_lc2_horizontal, T274_lc2_vertical, T274_lc2_leftOrAbove, T274_lc2_cached;
	double T274_lc2_m, T274_lc2_C, T274_lc2_borderX, T274_lc2_borderY;
	boolean T274_lc3_horizontal, T274_lc3_vertical, T274_lc3_leftOrAbove, T274_lc3_cached;
	double T274_lc3_m, T274_lc3_C, T274_lc3_borderX, T274_lc3_borderY;
	int T274_r, T274_g, T274_b, T274_lc1_lastY = Integer.MIN_VALUE, T274_lc2_lastY = Integer.MIN_VALUE, T274_lc3_lastY = Integer.MIN_VALUE;

	boolean T275_initializedWithValidData = false, T275_okay = false;
	double T275_sx, T275_sy, T275_minx, T275_miny, T275_maxx, T275_maxy;
	boolean T275_lc1_horizontal, T275_lc1_vertical, T275_lc1_leftOrAbove, T275_lc1_cached;
	double T275_lc1_m, T275_lc1_C, T275_lc1_borderX, T275_lc1_borderY;
	boolean T275_lc2_horizontal, T275_lc2_vertical, T275_lc2_leftOrAbove, T275_lc2_cached;
	double T275_lc2_m, T275_lc2_C, T275_lc2_borderX, T275_lc2_borderY;
	boolean T275_lc3_horizontal, T275_lc3_vertical, T275_lc3_leftOrAbove, T275_lc3_cached;
	double T275_lc3_m, T275_lc3_C, T275_lc3_borderX, T275_lc3_borderY;
	int T275_r, T275_g, T275_b, T275_lc1_lastY = Integer.MIN_VALUE, T275_lc2_lastY = Integer.MIN_VALUE, T275_lc3_lastY = Integer.MIN_VALUE;

	boolean T276_initializedWithValidData = false, T276_okay = false;
	double T276_sx, T276_sy, T276_minx, T276_miny, T276_maxx, T276_maxy;
	boolean T276_lc1_horizontal, T276_lc1_vertical, T276_lc1_leftOrAbove, T276_lc1_cached;
	double T276_lc1_m, T276_lc1_C, T276_lc1_borderX, T276_lc1_borderY;
	boolean T276_lc2_horizontal, T276_lc2_vertical, T276_lc2_leftOrAbove, T276_lc2_cached;
	double T276_lc2_m, T276_lc2_C, T276_lc2_borderX, T276_lc2_borderY;
	boolean T276_lc3_horizontal, T276_lc3_vertical, T276_lc3_leftOrAbove, T276_lc3_cached;
	double T276_lc3_m, T276_lc3_C, T276_lc3_borderX, T276_lc3_borderY;
	int T276_r, T276_g, T276_b, T276_lc1_lastY = Integer.MIN_VALUE, T276_lc2_lastY = Integer.MIN_VALUE, T276_lc3_lastY = Integer.MIN_VALUE;

	boolean T277_initializedWithValidData = false, T277_okay = false;
	double T277_sx, T277_sy, T277_minx, T277_miny, T277_maxx, T277_maxy;
	boolean T277_lc1_horizontal, T277_lc1_vertical, T277_lc1_leftOrAbove, T277_lc1_cached;
	double T277_lc1_m, T277_lc1_C, T277_lc1_borderX, T277_lc1_borderY;
	boolean T277_lc2_horizontal, T277_lc2_vertical, T277_lc2_leftOrAbove, T277_lc2_cached;
	double T277_lc2_m, T277_lc2_C, T277_lc2_borderX, T277_lc2_borderY;
	boolean T277_lc3_horizontal, T277_lc3_vertical, T277_lc3_leftOrAbove, T277_lc3_cached;
	double T277_lc3_m, T277_lc3_C, T277_lc3_borderX, T277_lc3_borderY;
	int T277_r, T277_g, T277_b, T277_lc1_lastY = Integer.MIN_VALUE, T277_lc2_lastY = Integer.MIN_VALUE, T277_lc3_lastY = Integer.MIN_VALUE;

	boolean T278_initializedWithValidData = false, T278_okay = false;
	double T278_sx, T278_sy, T278_minx, T278_miny, T278_maxx, T278_maxy;
	boolean T278_lc1_horizontal, T278_lc1_vertical, T278_lc1_leftOrAbove, T278_lc1_cached;
	double T278_lc1_m, T278_lc1_C, T278_lc1_borderX, T278_lc1_borderY;
	boolean T278_lc2_horizontal, T278_lc2_vertical, T278_lc2_leftOrAbove, T278_lc2_cached;
	double T278_lc2_m, T278_lc2_C, T278_lc2_borderX, T278_lc2_borderY;
	boolean T278_lc3_horizontal, T278_lc3_vertical, T278_lc3_leftOrAbove, T278_lc3_cached;
	double T278_lc3_m, T278_lc3_C, T278_lc3_borderX, T278_lc3_borderY;
	int T278_r, T278_g, T278_b, T278_lc1_lastY = Integer.MIN_VALUE, T278_lc2_lastY = Integer.MIN_VALUE, T278_lc3_lastY = Integer.MIN_VALUE;

	boolean T279_initializedWithValidData = false, T279_okay = false;
	double T279_sx, T279_sy, T279_minx, T279_miny, T279_maxx, T279_maxy;
	boolean T279_lc1_horizontal, T279_lc1_vertical, T279_lc1_leftOrAbove, T279_lc1_cached;
	double T279_lc1_m, T279_lc1_C, T279_lc1_borderX, T279_lc1_borderY;
	boolean T279_lc2_horizontal, T279_lc2_vertical, T279_lc2_leftOrAbove, T279_lc2_cached;
	double T279_lc2_m, T279_lc2_C, T279_lc2_borderX, T279_lc2_borderY;
	boolean T279_lc3_horizontal, T279_lc3_vertical, T279_lc3_leftOrAbove, T279_lc3_cached;
	double T279_lc3_m, T279_lc3_C, T279_lc3_borderX, T279_lc3_borderY;
	int T279_r, T279_g, T279_b, T279_lc1_lastY = Integer.MIN_VALUE, T279_lc2_lastY = Integer.MIN_VALUE, T279_lc3_lastY = Integer.MIN_VALUE;

	boolean T280_initializedWithValidData = false, T280_okay = false;
	double T280_sx, T280_sy, T280_minx, T280_miny, T280_maxx, T280_maxy;
	boolean T280_lc1_horizontal, T280_lc1_vertical, T280_lc1_leftOrAbove, T280_lc1_cached;
	double T280_lc1_m, T280_lc1_C, T280_lc1_borderX, T280_lc1_borderY;
	boolean T280_lc2_horizontal, T280_lc2_vertical, T280_lc2_leftOrAbove, T280_lc2_cached;
	double T280_lc2_m, T280_lc2_C, T280_lc2_borderX, T280_lc2_borderY;
	boolean T280_lc3_horizontal, T280_lc3_vertical, T280_lc3_leftOrAbove, T280_lc3_cached;
	double T280_lc3_m, T280_lc3_C, T280_lc3_borderX, T280_lc3_borderY;
	int T280_r, T280_g, T280_b, T280_lc1_lastY = Integer.MIN_VALUE, T280_lc2_lastY = Integer.MIN_VALUE, T280_lc3_lastY = Integer.MIN_VALUE;

	boolean T281_initializedWithValidData = false, T281_okay = false;
	double T281_sx, T281_sy, T281_minx, T281_miny, T281_maxx, T281_maxy;
	boolean T281_lc1_horizontal, T281_lc1_vertical, T281_lc1_leftOrAbove, T281_lc1_cached;
	double T281_lc1_m, T281_lc1_C, T281_lc1_borderX, T281_lc1_borderY;
	boolean T281_lc2_horizontal, T281_lc2_vertical, T281_lc2_leftOrAbove, T281_lc2_cached;
	double T281_lc2_m, T281_lc2_C, T281_lc2_borderX, T281_lc2_borderY;
	boolean T281_lc3_horizontal, T281_lc3_vertical, T281_lc3_leftOrAbove, T281_lc3_cached;
	double T281_lc3_m, T281_lc3_C, T281_lc3_borderX, T281_lc3_borderY;
	int T281_r, T281_g, T281_b, T281_lc1_lastY = Integer.MIN_VALUE, T281_lc2_lastY = Integer.MIN_VALUE, T281_lc3_lastY = Integer.MIN_VALUE;

	boolean T282_initializedWithValidData = false, T282_okay = false;
	double T282_sx, T282_sy, T282_minx, T282_miny, T282_maxx, T282_maxy;
	boolean T282_lc1_horizontal, T282_lc1_vertical, T282_lc1_leftOrAbove, T282_lc1_cached;
	double T282_lc1_m, T282_lc1_C, T282_lc1_borderX, T282_lc1_borderY;
	boolean T282_lc2_horizontal, T282_lc2_vertical, T282_lc2_leftOrAbove, T282_lc2_cached;
	double T282_lc2_m, T282_lc2_C, T282_lc2_borderX, T282_lc2_borderY;
	boolean T282_lc3_horizontal, T282_lc3_vertical, T282_lc3_leftOrAbove, T282_lc3_cached;
	double T282_lc3_m, T282_lc3_C, T282_lc3_borderX, T282_lc3_borderY;
	int T282_r, T282_g, T282_b, T282_lc1_lastY = Integer.MIN_VALUE, T282_lc2_lastY = Integer.MIN_VALUE, T282_lc3_lastY = Integer.MIN_VALUE;

	boolean T283_initializedWithValidData = false, T283_okay = false;
	double T283_sx, T283_sy, T283_minx, T283_miny, T283_maxx, T283_maxy;
	boolean T283_lc1_horizontal, T283_lc1_vertical, T283_lc1_leftOrAbove, T283_lc1_cached;
	double T283_lc1_m, T283_lc1_C, T283_lc1_borderX, T283_lc1_borderY;
	boolean T283_lc2_horizontal, T283_lc2_vertical, T283_lc2_leftOrAbove, T283_lc2_cached;
	double T283_lc2_m, T283_lc2_C, T283_lc2_borderX, T283_lc2_borderY;
	boolean T283_lc3_horizontal, T283_lc3_vertical, T283_lc3_leftOrAbove, T283_lc3_cached;
	double T283_lc3_m, T283_lc3_C, T283_lc3_borderX, T283_lc3_borderY;
	int T283_r, T283_g, T283_b, T283_lc1_lastY = Integer.MIN_VALUE, T283_lc2_lastY = Integer.MIN_VALUE, T283_lc3_lastY = Integer.MIN_VALUE;

	boolean T284_initializedWithValidData = false, T284_okay = false;
	double T284_sx, T284_sy, T284_minx, T284_miny, T284_maxx, T284_maxy;
	boolean T284_lc1_horizontal, T284_lc1_vertical, T284_lc1_leftOrAbove, T284_lc1_cached;
	double T284_lc1_m, T284_lc1_C, T284_lc1_borderX, T284_lc1_borderY;
	boolean T284_lc2_horizontal, T284_lc2_vertical, T284_lc2_leftOrAbove, T284_lc2_cached;
	double T284_lc2_m, T284_lc2_C, T284_lc2_borderX, T284_lc2_borderY;
	boolean T284_lc3_horizontal, T284_lc3_vertical, T284_lc3_leftOrAbove, T284_lc3_cached;
	double T284_lc3_m, T284_lc3_C, T284_lc3_borderX, T284_lc3_borderY;
	int T284_r, T284_g, T284_b, T284_lc1_lastY = Integer.MIN_VALUE, T284_lc2_lastY = Integer.MIN_VALUE, T284_lc3_lastY = Integer.MIN_VALUE;

	boolean T285_initializedWithValidData = false, T285_okay = false;
	double T285_sx, T285_sy, T285_minx, T285_miny, T285_maxx, T285_maxy;
	boolean T285_lc1_horizontal, T285_lc1_vertical, T285_lc1_leftOrAbove, T285_lc1_cached;
	double T285_lc1_m, T285_lc1_C, T285_lc1_borderX, T285_lc1_borderY;
	boolean T285_lc2_horizontal, T285_lc2_vertical, T285_lc2_leftOrAbove, T285_lc2_cached;
	double T285_lc2_m, T285_lc2_C, T285_lc2_borderX, T285_lc2_borderY;
	boolean T285_lc3_horizontal, T285_lc3_vertical, T285_lc3_leftOrAbove, T285_lc3_cached;
	double T285_lc3_m, T285_lc3_C, T285_lc3_borderX, T285_lc3_borderY;
	int T285_r, T285_g, T285_b, T285_lc1_lastY = Integer.MIN_VALUE, T285_lc2_lastY = Integer.MIN_VALUE, T285_lc3_lastY = Integer.MIN_VALUE;

	boolean T286_initializedWithValidData = false, T286_okay = false;
	double T286_sx, T286_sy, T286_minx, T286_miny, T286_maxx, T286_maxy;
	boolean T286_lc1_horizontal, T286_lc1_vertical, T286_lc1_leftOrAbove, T286_lc1_cached;
	double T286_lc1_m, T286_lc1_C, T286_lc1_borderX, T286_lc1_borderY;
	boolean T286_lc2_horizontal, T286_lc2_vertical, T286_lc2_leftOrAbove, T286_lc2_cached;
	double T286_lc2_m, T286_lc2_C, T286_lc2_borderX, T286_lc2_borderY;
	boolean T286_lc3_horizontal, T286_lc3_vertical, T286_lc3_leftOrAbove, T286_lc3_cached;
	double T286_lc3_m, T286_lc3_C, T286_lc3_borderX, T286_lc3_borderY;
	int T286_r, T286_g, T286_b, T286_lc1_lastY = Integer.MIN_VALUE, T286_lc2_lastY = Integer.MIN_VALUE, T286_lc3_lastY = Integer.MIN_VALUE;

	boolean T287_initializedWithValidData = false, T287_okay = false;
	double T287_sx, T287_sy, T287_minx, T287_miny, T287_maxx, T287_maxy;
	boolean T287_lc1_horizontal, T287_lc1_vertical, T287_lc1_leftOrAbove, T287_lc1_cached;
	double T287_lc1_m, T287_lc1_C, T287_lc1_borderX, T287_lc1_borderY;
	boolean T287_lc2_horizontal, T287_lc2_vertical, T287_lc2_leftOrAbove, T287_lc2_cached;
	double T287_lc2_m, T287_lc2_C, T287_lc2_borderX, T287_lc2_borderY;
	boolean T287_lc3_horizontal, T287_lc3_vertical, T287_lc3_leftOrAbove, T287_lc3_cached;
	double T287_lc3_m, T287_lc3_C, T287_lc3_borderX, T287_lc3_borderY;
	int T287_r, T287_g, T287_b, T287_lc1_lastY = Integer.MIN_VALUE, T287_lc2_lastY = Integer.MIN_VALUE, T287_lc3_lastY = Integer.MIN_VALUE;

	boolean T288_initializedWithValidData = false, T288_okay = false;
	double T288_sx, T288_sy, T288_minx, T288_miny, T288_maxx, T288_maxy;
	boolean T288_lc1_horizontal, T288_lc1_vertical, T288_lc1_leftOrAbove, T288_lc1_cached;
	double T288_lc1_m, T288_lc1_C, T288_lc1_borderX, T288_lc1_borderY;
	boolean T288_lc2_horizontal, T288_lc2_vertical, T288_lc2_leftOrAbove, T288_lc2_cached;
	double T288_lc2_m, T288_lc2_C, T288_lc2_borderX, T288_lc2_borderY;
	boolean T288_lc3_horizontal, T288_lc3_vertical, T288_lc3_leftOrAbove, T288_lc3_cached;
	double T288_lc3_m, T288_lc3_C, T288_lc3_borderX, T288_lc3_borderY;
	int T288_r, T288_g, T288_b, T288_lc1_lastY = Integer.MIN_VALUE, T288_lc2_lastY = Integer.MIN_VALUE, T288_lc3_lastY = Integer.MIN_VALUE;

	boolean T289_initializedWithValidData = false, T289_okay = false;
	double T289_sx, T289_sy, T289_minx, T289_miny, T289_maxx, T289_maxy;
	boolean T289_lc1_horizontal, T289_lc1_vertical, T289_lc1_leftOrAbove, T289_lc1_cached;
	double T289_lc1_m, T289_lc1_C, T289_lc1_borderX, T289_lc1_borderY;
	boolean T289_lc2_horizontal, T289_lc2_vertical, T289_lc2_leftOrAbove, T289_lc2_cached;
	double T289_lc2_m, T289_lc2_C, T289_lc2_borderX, T289_lc2_borderY;
	boolean T289_lc3_horizontal, T289_lc3_vertical, T289_lc3_leftOrAbove, T289_lc3_cached;
	double T289_lc3_m, T289_lc3_C, T289_lc3_borderX, T289_lc3_borderY;
	int T289_r, T289_g, T289_b, T289_lc1_lastY = Integer.MIN_VALUE, T289_lc2_lastY = Integer.MIN_VALUE, T289_lc3_lastY = Integer.MIN_VALUE;

	boolean T290_initializedWithValidData = false, T290_okay = false;
	double T290_sx, T290_sy, T290_minx, T290_miny, T290_maxx, T290_maxy;
	boolean T290_lc1_horizontal, T290_lc1_vertical, T290_lc1_leftOrAbove, T290_lc1_cached;
	double T290_lc1_m, T290_lc1_C, T290_lc1_borderX, T290_lc1_borderY;
	boolean T290_lc2_horizontal, T290_lc2_vertical, T290_lc2_leftOrAbove, T290_lc2_cached;
	double T290_lc2_m, T290_lc2_C, T290_lc2_borderX, T290_lc2_borderY;
	boolean T290_lc3_horizontal, T290_lc3_vertical, T290_lc3_leftOrAbove, T290_lc3_cached;
	double T290_lc3_m, T290_lc3_C, T290_lc3_borderX, T290_lc3_borderY;
	int T290_r, T290_g, T290_b, T290_lc1_lastY = Integer.MIN_VALUE, T290_lc2_lastY = Integer.MIN_VALUE, T290_lc3_lastY = Integer.MIN_VALUE;

	boolean T291_initializedWithValidData = false, T291_okay = false;
	double T291_sx, T291_sy, T291_minx, T291_miny, T291_maxx, T291_maxy;
	boolean T291_lc1_horizontal, T291_lc1_vertical, T291_lc1_leftOrAbove, T291_lc1_cached;
	double T291_lc1_m, T291_lc1_C, T291_lc1_borderX, T291_lc1_borderY;
	boolean T291_lc2_horizontal, T291_lc2_vertical, T291_lc2_leftOrAbove, T291_lc2_cached;
	double T291_lc2_m, T291_lc2_C, T291_lc2_borderX, T291_lc2_borderY;
	boolean T291_lc3_horizontal, T291_lc3_vertical, T291_lc3_leftOrAbove, T291_lc3_cached;
	double T291_lc3_m, T291_lc3_C, T291_lc3_borderX, T291_lc3_borderY;
	int T291_r, T291_g, T291_b, T291_lc1_lastY = Integer.MIN_VALUE, T291_lc2_lastY = Integer.MIN_VALUE, T291_lc3_lastY = Integer.MIN_VALUE;

	boolean T292_initializedWithValidData = false, T292_okay = false;
	double T292_sx, T292_sy, T292_minx, T292_miny, T292_maxx, T292_maxy;
	boolean T292_lc1_horizontal, T292_lc1_vertical, T292_lc1_leftOrAbove, T292_lc1_cached;
	double T292_lc1_m, T292_lc1_C, T292_lc1_borderX, T292_lc1_borderY;
	boolean T292_lc2_horizontal, T292_lc2_vertical, T292_lc2_leftOrAbove, T292_lc2_cached;
	double T292_lc2_m, T292_lc2_C, T292_lc2_borderX, T292_lc2_borderY;
	boolean T292_lc3_horizontal, T292_lc3_vertical, T292_lc3_leftOrAbove, T292_lc3_cached;
	double T292_lc3_m, T292_lc3_C, T292_lc3_borderX, T292_lc3_borderY;
	int T292_r, T292_g, T292_b, T292_lc1_lastY = Integer.MIN_VALUE, T292_lc2_lastY = Integer.MIN_VALUE, T292_lc3_lastY = Integer.MIN_VALUE;

	boolean T293_initializedWithValidData = false, T293_okay = false;
	double T293_sx, T293_sy, T293_minx, T293_miny, T293_maxx, T293_maxy;
	boolean T293_lc1_horizontal, T293_lc1_vertical, T293_lc1_leftOrAbove, T293_lc1_cached;
	double T293_lc1_m, T293_lc1_C, T293_lc1_borderX, T293_lc1_borderY;
	boolean T293_lc2_horizontal, T293_lc2_vertical, T293_lc2_leftOrAbove, T293_lc2_cached;
	double T293_lc2_m, T293_lc2_C, T293_lc2_borderX, T293_lc2_borderY;
	boolean T293_lc3_horizontal, T293_lc3_vertical, T293_lc3_leftOrAbove, T293_lc3_cached;
	double T293_lc3_m, T293_lc3_C, T293_lc3_borderX, T293_lc3_borderY;
	int T293_r, T293_g, T293_b, T293_lc1_lastY = Integer.MIN_VALUE, T293_lc2_lastY = Integer.MIN_VALUE, T293_lc3_lastY = Integer.MIN_VALUE;

	boolean T294_initializedWithValidData = false, T294_okay = false;
	double T294_sx, T294_sy, T294_minx, T294_miny, T294_maxx, T294_maxy;
	boolean T294_lc1_horizontal, T294_lc1_vertical, T294_lc1_leftOrAbove, T294_lc1_cached;
	double T294_lc1_m, T294_lc1_C, T294_lc1_borderX, T294_lc1_borderY;
	boolean T294_lc2_horizontal, T294_lc2_vertical, T294_lc2_leftOrAbove, T294_lc2_cached;
	double T294_lc2_m, T294_lc2_C, T294_lc2_borderX, T294_lc2_borderY;
	boolean T294_lc3_horizontal, T294_lc3_vertical, T294_lc3_leftOrAbove, T294_lc3_cached;
	double T294_lc3_m, T294_lc3_C, T294_lc3_borderX, T294_lc3_borderY;
	int T294_r, T294_g, T294_b, T294_lc1_lastY = Integer.MIN_VALUE, T294_lc2_lastY = Integer.MIN_VALUE, T294_lc3_lastY = Integer.MIN_VALUE;

	boolean T295_initializedWithValidData = false, T295_okay = false;
	double T295_sx, T295_sy, T295_minx, T295_miny, T295_maxx, T295_maxy;
	boolean T295_lc1_horizontal, T295_lc1_vertical, T295_lc1_leftOrAbove, T295_lc1_cached;
	double T295_lc1_m, T295_lc1_C, T295_lc1_borderX, T295_lc1_borderY;
	boolean T295_lc2_horizontal, T295_lc2_vertical, T295_lc2_leftOrAbove, T295_lc2_cached;
	double T295_lc2_m, T295_lc2_C, T295_lc2_borderX, T295_lc2_borderY;
	boolean T295_lc3_horizontal, T295_lc3_vertical, T295_lc3_leftOrAbove, T295_lc3_cached;
	double T295_lc3_m, T295_lc3_C, T295_lc3_borderX, T295_lc3_borderY;
	int T295_r, T295_g, T295_b, T295_lc1_lastY = Integer.MIN_VALUE, T295_lc2_lastY = Integer.MIN_VALUE, T295_lc3_lastY = Integer.MIN_VALUE;

	boolean T296_initializedWithValidData = false, T296_okay = false;
	double T296_sx, T296_sy, T296_minx, T296_miny, T296_maxx, T296_maxy;
	boolean T296_lc1_horizontal, T296_lc1_vertical, T296_lc1_leftOrAbove, T296_lc1_cached;
	double T296_lc1_m, T296_lc1_C, T296_lc1_borderX, T296_lc1_borderY;
	boolean T296_lc2_horizontal, T296_lc2_vertical, T296_lc2_leftOrAbove, T296_lc2_cached;
	double T296_lc2_m, T296_lc2_C, T296_lc2_borderX, T296_lc2_borderY;
	boolean T296_lc3_horizontal, T296_lc3_vertical, T296_lc3_leftOrAbove, T296_lc3_cached;
	double T296_lc3_m, T296_lc3_C, T296_lc3_borderX, T296_lc3_borderY;
	int T296_r, T296_g, T296_b, T296_lc1_lastY = Integer.MIN_VALUE, T296_lc2_lastY = Integer.MIN_VALUE, T296_lc3_lastY = Integer.MIN_VALUE;

	boolean T297_initializedWithValidData = false, T297_okay = false;
	double T297_sx, T297_sy, T297_minx, T297_miny, T297_maxx, T297_maxy;
	boolean T297_lc1_horizontal, T297_lc1_vertical, T297_lc1_leftOrAbove, T297_lc1_cached;
	double T297_lc1_m, T297_lc1_C, T297_lc1_borderX, T297_lc1_borderY;
	boolean T297_lc2_horizontal, T297_lc2_vertical, T297_lc2_leftOrAbove, T297_lc2_cached;
	double T297_lc2_m, T297_lc2_C, T297_lc2_borderX, T297_lc2_borderY;
	boolean T297_lc3_horizontal, T297_lc3_vertical, T297_lc3_leftOrAbove, T297_lc3_cached;
	double T297_lc3_m, T297_lc3_C, T297_lc3_borderX, T297_lc3_borderY;
	int T297_r, T297_g, T297_b, T297_lc1_lastY = Integer.MIN_VALUE, T297_lc2_lastY = Integer.MIN_VALUE, T297_lc3_lastY = Integer.MIN_VALUE;

	boolean T298_initializedWithValidData = false, T298_okay = false;
	double T298_sx, T298_sy, T298_minx, T298_miny, T298_maxx, T298_maxy;
	boolean T298_lc1_horizontal, T298_lc1_vertical, T298_lc1_leftOrAbove, T298_lc1_cached;
	double T298_lc1_m, T298_lc1_C, T298_lc1_borderX, T298_lc1_borderY;
	boolean T298_lc2_horizontal, T298_lc2_vertical, T298_lc2_leftOrAbove, T298_lc2_cached;
	double T298_lc2_m, T298_lc2_C, T298_lc2_borderX, T298_lc2_borderY;
	boolean T298_lc3_horizontal, T298_lc3_vertical, T298_lc3_leftOrAbove, T298_lc3_cached;
	double T298_lc3_m, T298_lc3_C, T298_lc3_borderX, T298_lc3_borderY;
	int T298_r, T298_g, T298_b, T298_lc1_lastY = Integer.MIN_VALUE, T298_lc2_lastY = Integer.MIN_VALUE, T298_lc3_lastY = Integer.MIN_VALUE;

	boolean T299_initializedWithValidData = false, T299_okay = false;
	double T299_sx, T299_sy, T299_minx, T299_miny, T299_maxx, T299_maxy;
	boolean T299_lc1_horizontal, T299_lc1_vertical, T299_lc1_leftOrAbove, T299_lc1_cached;
	double T299_lc1_m, T299_lc1_C, T299_lc1_borderX, T299_lc1_borderY;
	boolean T299_lc2_horizontal, T299_lc2_vertical, T299_lc2_leftOrAbove, T299_lc2_cached;
	double T299_lc2_m, T299_lc2_C, T299_lc2_borderX, T299_lc2_borderY;
	boolean T299_lc3_horizontal, T299_lc3_vertical, T299_lc3_leftOrAbove, T299_lc3_cached;
	double T299_lc3_m, T299_lc3_C, T299_lc3_borderX, T299_lc3_borderY;
	int T299_r, T299_g, T299_b, T299_lc1_lastY = Integer.MIN_VALUE, T299_lc2_lastY = Integer.MIN_VALUE, T299_lc3_lastY = Integer.MIN_VALUE;

	public void moveToY(int y) {
		moveToY1(y);
		moveToY2(y);
		moveToY3(y);
		moveToY4(y);
		moveToY5(y);
		moveToY6(y);
		moveToY7(y);
		moveToY8(y);
		moveToY9(y);
		moveToY10(y);
	}

	public void moveToY1(int y) {

		if(T0_initializedWithValidData) {
			if(y < T0_miny || y > T0_maxy) {
				T0_okay = false;
			} else {
				T0_okay = true;
				if(T0_lc1_horizontal) {
					T0_lc1_cached = (T0_lc1_leftOrAbove ? y <= T0_lc1_borderY : y >= T0_lc1_borderY);
				} else if(T0_lc1_vertical) {
					// nothing
				} else {
					if(T0_lc1_lastY == y - 1) {
						T0_lc1_borderX += T0_lc1_m;
						T0_lc1_lastY++;
					} else {
						T0_lc1_borderX = y*T0_lc1_m + T0_lc1_C;
						T0_lc1_lastY = y;
					}
				}
				if(T0_lc2_horizontal) {
					T0_lc2_cached = (T0_lc2_leftOrAbove ? y <= T0_lc2_borderY : y >= T0_lc2_borderY);
				} else if(T0_lc2_vertical) {
					// nothing
				} else {
					if(T0_lc2_lastY == y - 1) {
						T0_lc2_borderX += T0_lc2_m;
						T0_lc2_lastY++;
					} else {
						T0_lc2_borderX = y*T0_lc2_m + T0_lc2_C;
						T0_lc2_lastY = y;
					}
				}
				if(T0_lc3_horizontal) {
					T0_lc3_cached = (T0_lc3_leftOrAbove ? y <= T0_lc3_borderY : y >= T0_lc3_borderY);
				} else if(T0_lc3_vertical) {
					// nothing
				} else {
					if(T0_lc3_lastY == y - 1) {
						T0_lc3_borderX += T0_lc3_m;
						T0_lc3_lastY++;
					} else {
						T0_lc3_borderX = y*T0_lc3_m + T0_lc3_C;
						T0_lc3_lastY = y;
					}
				}
			}
		}

		if(T1_initializedWithValidData) {
			if(y < T1_miny || y > T1_maxy) {
				T1_okay = false;
			} else {
				T1_okay = true;
				if(T1_lc1_horizontal) {
					T1_lc1_cached = (T1_lc1_leftOrAbove ? y <= T1_lc1_borderY : y >= T1_lc1_borderY);
				} else if(T1_lc1_vertical) {
					// nothing
				} else {
					if(T1_lc1_lastY == y - 1) {
						T1_lc1_borderX += T1_lc1_m;
						T1_lc1_lastY++;
					} else {
						T1_lc1_borderX = y*T1_lc1_m + T1_lc1_C;
						T1_lc1_lastY = y;
					}
				}
				if(T1_lc2_horizontal) {
					T1_lc2_cached = (T1_lc2_leftOrAbove ? y <= T1_lc2_borderY : y >= T1_lc2_borderY);
				} else if(T1_lc2_vertical) {
					// nothing
				} else {
					if(T1_lc2_lastY == y - 1) {
						T1_lc2_borderX += T1_lc2_m;
						T1_lc2_lastY++;
					} else {
						T1_lc2_borderX = y*T1_lc2_m + T1_lc2_C;
						T1_lc2_lastY = y;
					}
				}
				if(T1_lc3_horizontal) {
					T1_lc3_cached = (T1_lc3_leftOrAbove ? y <= T1_lc3_borderY : y >= T1_lc3_borderY);
				} else if(T1_lc3_vertical) {
					// nothing
				} else {
					if(T1_lc3_lastY == y - 1) {
						T1_lc3_borderX += T1_lc3_m;
						T1_lc3_lastY++;
					} else {
						T1_lc3_borderX = y*T1_lc3_m + T1_lc3_C;
						T1_lc3_lastY = y;
					}
				}
			}
		}

		if(T2_initializedWithValidData) {
			if(y < T2_miny || y > T2_maxy) {
				T2_okay = false;
			} else {
				T2_okay = true;
				if(T2_lc1_horizontal) {
					T2_lc1_cached = (T2_lc1_leftOrAbove ? y <= T2_lc1_borderY : y >= T2_lc1_borderY);
				} else if(T2_lc1_vertical) {
					// nothing
				} else {
					if(T2_lc1_lastY == y - 1) {
						T2_lc1_borderX += T2_lc1_m;
						T2_lc1_lastY++;
					} else {
						T2_lc1_borderX = y*T2_lc1_m + T2_lc1_C;
						T2_lc1_lastY = y;
					}
				}
				if(T2_lc2_horizontal) {
					T2_lc2_cached = (T2_lc2_leftOrAbove ? y <= T2_lc2_borderY : y >= T2_lc2_borderY);
				} else if(T2_lc2_vertical) {
					// nothing
				} else {
					if(T2_lc2_lastY == y - 1) {
						T2_lc2_borderX += T2_lc2_m;
						T2_lc2_lastY++;
					} else {
						T2_lc2_borderX = y*T2_lc2_m + T2_lc2_C;
						T2_lc2_lastY = y;
					}
				}
				if(T2_lc3_horizontal) {
					T2_lc3_cached = (T2_lc3_leftOrAbove ? y <= T2_lc3_borderY : y >= T2_lc3_borderY);
				} else if(T2_lc3_vertical) {
					// nothing
				} else {
					if(T2_lc3_lastY == y - 1) {
						T2_lc3_borderX += T2_lc3_m;
						T2_lc3_lastY++;
					} else {
						T2_lc3_borderX = y*T2_lc3_m + T2_lc3_C;
						T2_lc3_lastY = y;
					}
				}
			}
		}

		if(T3_initializedWithValidData) {
			if(y < T3_miny || y > T3_maxy) {
				T3_okay = false;
			} else {
				T3_okay = true;
				if(T3_lc1_horizontal) {
					T3_lc1_cached = (T3_lc1_leftOrAbove ? y <= T3_lc1_borderY : y >= T3_lc1_borderY);
				} else if(T3_lc1_vertical) {
					// nothing
				} else {
					if(T3_lc1_lastY == y - 1) {
						T3_lc1_borderX += T3_lc1_m;
						T3_lc1_lastY++;
					} else {
						T3_lc1_borderX = y*T3_lc1_m + T3_lc1_C;
						T3_lc1_lastY = y;
					}
				}
				if(T3_lc2_horizontal) {
					T3_lc2_cached = (T3_lc2_leftOrAbove ? y <= T3_lc2_borderY : y >= T3_lc2_borderY);
				} else if(T3_lc2_vertical) {
					// nothing
				} else {
					if(T3_lc2_lastY == y - 1) {
						T3_lc2_borderX += T3_lc2_m;
						T3_lc2_lastY++;
					} else {
						T3_lc2_borderX = y*T3_lc2_m + T3_lc2_C;
						T3_lc2_lastY = y;
					}
				}
				if(T3_lc3_horizontal) {
					T3_lc3_cached = (T3_lc3_leftOrAbove ? y <= T3_lc3_borderY : y >= T3_lc3_borderY);
				} else if(T3_lc3_vertical) {
					// nothing
				} else {
					if(T3_lc3_lastY == y - 1) {
						T3_lc3_borderX += T3_lc3_m;
						T3_lc3_lastY++;
					} else {
						T3_lc3_borderX = y*T3_lc3_m + T3_lc3_C;
						T3_lc3_lastY = y;
					}
				}
			}
		}

		if(T4_initializedWithValidData) {
			if(y < T4_miny || y > T4_maxy) {
				T4_okay = false;
			} else {
				T4_okay = true;
				if(T4_lc1_horizontal) {
					T4_lc1_cached = (T4_lc1_leftOrAbove ? y <= T4_lc1_borderY : y >= T4_lc1_borderY);
				} else if(T4_lc1_vertical) {
					// nothing
				} else {
					if(T4_lc1_lastY == y - 1) {
						T4_lc1_borderX += T4_lc1_m;
						T4_lc1_lastY++;
					} else {
						T4_lc1_borderX = y*T4_lc1_m + T4_lc1_C;
						T4_lc1_lastY = y;
					}
				}
				if(T4_lc2_horizontal) {
					T4_lc2_cached = (T4_lc2_leftOrAbove ? y <= T4_lc2_borderY : y >= T4_lc2_borderY);
				} else if(T4_lc2_vertical) {
					// nothing
				} else {
					if(T4_lc2_lastY == y - 1) {
						T4_lc2_borderX += T4_lc2_m;
						T4_lc2_lastY++;
					} else {
						T4_lc2_borderX = y*T4_lc2_m + T4_lc2_C;
						T4_lc2_lastY = y;
					}
				}
				if(T4_lc3_horizontal) {
					T4_lc3_cached = (T4_lc3_leftOrAbove ? y <= T4_lc3_borderY : y >= T4_lc3_borderY);
				} else if(T4_lc3_vertical) {
					// nothing
				} else {
					if(T4_lc3_lastY == y - 1) {
						T4_lc3_borderX += T4_lc3_m;
						T4_lc3_lastY++;
					} else {
						T4_lc3_borderX = y*T4_lc3_m + T4_lc3_C;
						T4_lc3_lastY = y;
					}
				}
			}
		}

		if(T5_initializedWithValidData) {
			if(y < T5_miny || y > T5_maxy) {
				T5_okay = false;
			} else {
				T5_okay = true;
				if(T5_lc1_horizontal) {
					T5_lc1_cached = (T5_lc1_leftOrAbove ? y <= T5_lc1_borderY : y >= T5_lc1_borderY);
				} else if(T5_lc1_vertical) {
					// nothing
				} else {
					if(T5_lc1_lastY == y - 1) {
						T5_lc1_borderX += T5_lc1_m;
						T5_lc1_lastY++;
					} else {
						T5_lc1_borderX = y*T5_lc1_m + T5_lc1_C;
						T5_lc1_lastY = y;
					}
				}
				if(T5_lc2_horizontal) {
					T5_lc2_cached = (T5_lc2_leftOrAbove ? y <= T5_lc2_borderY : y >= T5_lc2_borderY);
				} else if(T5_lc2_vertical) {
					// nothing
				} else {
					if(T5_lc2_lastY == y - 1) {
						T5_lc2_borderX += T5_lc2_m;
						T5_lc2_lastY++;
					} else {
						T5_lc2_borderX = y*T5_lc2_m + T5_lc2_C;
						T5_lc2_lastY = y;
					}
				}
				if(T5_lc3_horizontal) {
					T5_lc3_cached = (T5_lc3_leftOrAbove ? y <= T5_lc3_borderY : y >= T5_lc3_borderY);
				} else if(T5_lc3_vertical) {
					// nothing
				} else {
					if(T5_lc3_lastY == y - 1) {
						T5_lc3_borderX += T5_lc3_m;
						T5_lc3_lastY++;
					} else {
						T5_lc3_borderX = y*T5_lc3_m + T5_lc3_C;
						T5_lc3_lastY = y;
					}
				}
			}
		}

		if(T6_initializedWithValidData) {
			if(y < T6_miny || y > T6_maxy) {
				T6_okay = false;
			} else {
				T6_okay = true;
				if(T6_lc1_horizontal) {
					T6_lc1_cached = (T6_lc1_leftOrAbove ? y <= T6_lc1_borderY : y >= T6_lc1_borderY);
				} else if(T6_lc1_vertical) {
					// nothing
				} else {
					if(T6_lc1_lastY == y - 1) {
						T6_lc1_borderX += T6_lc1_m;
						T6_lc1_lastY++;
					} else {
						T6_lc1_borderX = y*T6_lc1_m + T6_lc1_C;
						T6_lc1_lastY = y;
					}
				}
				if(T6_lc2_horizontal) {
					T6_lc2_cached = (T6_lc2_leftOrAbove ? y <= T6_lc2_borderY : y >= T6_lc2_borderY);
				} else if(T6_lc2_vertical) {
					// nothing
				} else {
					if(T6_lc2_lastY == y - 1) {
						T6_lc2_borderX += T6_lc2_m;
						T6_lc2_lastY++;
					} else {
						T6_lc2_borderX = y*T6_lc2_m + T6_lc2_C;
						T6_lc2_lastY = y;
					}
				}
				if(T6_lc3_horizontal) {
					T6_lc3_cached = (T6_lc3_leftOrAbove ? y <= T6_lc3_borderY : y >= T6_lc3_borderY);
				} else if(T6_lc3_vertical) {
					// nothing
				} else {
					if(T6_lc3_lastY == y - 1) {
						T6_lc3_borderX += T6_lc3_m;
						T6_lc3_lastY++;
					} else {
						T6_lc3_borderX = y*T6_lc3_m + T6_lc3_C;
						T6_lc3_lastY = y;
					}
				}
			}
		}

		if(T7_initializedWithValidData) {
			if(y < T7_miny || y > T7_maxy) {
				T7_okay = false;
			} else {
				T7_okay = true;
				if(T7_lc1_horizontal) {
					T7_lc1_cached = (T7_lc1_leftOrAbove ? y <= T7_lc1_borderY : y >= T7_lc1_borderY);
				} else if(T7_lc1_vertical) {
					// nothing
				} else {
					if(T7_lc1_lastY == y - 1) {
						T7_lc1_borderX += T7_lc1_m;
						T7_lc1_lastY++;
					} else {
						T7_lc1_borderX = y*T7_lc1_m + T7_lc1_C;
						T7_lc1_lastY = y;
					}
				}
				if(T7_lc2_horizontal) {
					T7_lc2_cached = (T7_lc2_leftOrAbove ? y <= T7_lc2_borderY : y >= T7_lc2_borderY);
				} else if(T7_lc2_vertical) {
					// nothing
				} else {
					if(T7_lc2_lastY == y - 1) {
						T7_lc2_borderX += T7_lc2_m;
						T7_lc2_lastY++;
					} else {
						T7_lc2_borderX = y*T7_lc2_m + T7_lc2_C;
						T7_lc2_lastY = y;
					}
				}
				if(T7_lc3_horizontal) {
					T7_lc3_cached = (T7_lc3_leftOrAbove ? y <= T7_lc3_borderY : y >= T7_lc3_borderY);
				} else if(T7_lc3_vertical) {
					// nothing
				} else {
					if(T7_lc3_lastY == y - 1) {
						T7_lc3_borderX += T7_lc3_m;
						T7_lc3_lastY++;
					} else {
						T7_lc3_borderX = y*T7_lc3_m + T7_lc3_C;
						T7_lc3_lastY = y;
					}
				}
			}
		}

		if(T8_initializedWithValidData) {
			if(y < T8_miny || y > T8_maxy) {
				T8_okay = false;
			} else {
				T8_okay = true;
				if(T8_lc1_horizontal) {
					T8_lc1_cached = (T8_lc1_leftOrAbove ? y <= T8_lc1_borderY : y >= T8_lc1_borderY);
				} else if(T8_lc1_vertical) {
					// nothing
				} else {
					if(T8_lc1_lastY == y - 1) {
						T8_lc1_borderX += T8_lc1_m;
						T8_lc1_lastY++;
					} else {
						T8_lc1_borderX = y*T8_lc1_m + T8_lc1_C;
						T8_lc1_lastY = y;
					}
				}
				if(T8_lc2_horizontal) {
					T8_lc2_cached = (T8_lc2_leftOrAbove ? y <= T8_lc2_borderY : y >= T8_lc2_borderY);
				} else if(T8_lc2_vertical) {
					// nothing
				} else {
					if(T8_lc2_lastY == y - 1) {
						T8_lc2_borderX += T8_lc2_m;
						T8_lc2_lastY++;
					} else {
						T8_lc2_borderX = y*T8_lc2_m + T8_lc2_C;
						T8_lc2_lastY = y;
					}
				}
				if(T8_lc3_horizontal) {
					T8_lc3_cached = (T8_lc3_leftOrAbove ? y <= T8_lc3_borderY : y >= T8_lc3_borderY);
				} else if(T8_lc3_vertical) {
					// nothing
				} else {
					if(T8_lc3_lastY == y - 1) {
						T8_lc3_borderX += T8_lc3_m;
						T8_lc3_lastY++;
					} else {
						T8_lc3_borderX = y*T8_lc3_m + T8_lc3_C;
						T8_lc3_lastY = y;
					}
				}
			}
		}

		if(T9_initializedWithValidData) {
			if(y < T9_miny || y > T9_maxy) {
				T9_okay = false;
			} else {
				T9_okay = true;
				if(T9_lc1_horizontal) {
					T9_lc1_cached = (T9_lc1_leftOrAbove ? y <= T9_lc1_borderY : y >= T9_lc1_borderY);
				} else if(T9_lc1_vertical) {
					// nothing
				} else {
					if(T9_lc1_lastY == y - 1) {
						T9_lc1_borderX += T9_lc1_m;
						T9_lc1_lastY++;
					} else {
						T9_lc1_borderX = y*T9_lc1_m + T9_lc1_C;
						T9_lc1_lastY = y;
					}
				}
				if(T9_lc2_horizontal) {
					T9_lc2_cached = (T9_lc2_leftOrAbove ? y <= T9_lc2_borderY : y >= T9_lc2_borderY);
				} else if(T9_lc2_vertical) {
					// nothing
				} else {
					if(T9_lc2_lastY == y - 1) {
						T9_lc2_borderX += T9_lc2_m;
						T9_lc2_lastY++;
					} else {
						T9_lc2_borderX = y*T9_lc2_m + T9_lc2_C;
						T9_lc2_lastY = y;
					}
				}
				if(T9_lc3_horizontal) {
					T9_lc3_cached = (T9_lc3_leftOrAbove ? y <= T9_lc3_borderY : y >= T9_lc3_borderY);
				} else if(T9_lc3_vertical) {
					// nothing
				} else {
					if(T9_lc3_lastY == y - 1) {
						T9_lc3_borderX += T9_lc3_m;
						T9_lc3_lastY++;
					} else {
						T9_lc3_borderX = y*T9_lc3_m + T9_lc3_C;
						T9_lc3_lastY = y;
					}
				}
			}
		}

		if(T10_initializedWithValidData) {
			if(y < T10_miny || y > T10_maxy) {
				T10_okay = false;
			} else {
				T10_okay = true;
				if(T10_lc1_horizontal) {
					T10_lc1_cached = (T10_lc1_leftOrAbove ? y <= T10_lc1_borderY : y >= T10_lc1_borderY);
				} else if(T10_lc1_vertical) {
					// nothing
				} else {
					if(T10_lc1_lastY == y - 1) {
						T10_lc1_borderX += T10_lc1_m;
						T10_lc1_lastY++;
					} else {
						T10_lc1_borderX = y*T10_lc1_m + T10_lc1_C;
						T10_lc1_lastY = y;
					}
				}
				if(T10_lc2_horizontal) {
					T10_lc2_cached = (T10_lc2_leftOrAbove ? y <= T10_lc2_borderY : y >= T10_lc2_borderY);
				} else if(T10_lc2_vertical) {
					// nothing
				} else {
					if(T10_lc2_lastY == y - 1) {
						T10_lc2_borderX += T10_lc2_m;
						T10_lc2_lastY++;
					} else {
						T10_lc2_borderX = y*T10_lc2_m + T10_lc2_C;
						T10_lc2_lastY = y;
					}
				}
				if(T10_lc3_horizontal) {
					T10_lc3_cached = (T10_lc3_leftOrAbove ? y <= T10_lc3_borderY : y >= T10_lc3_borderY);
				} else if(T10_lc3_vertical) {
					// nothing
				} else {
					if(T10_lc3_lastY == y - 1) {
						T10_lc3_borderX += T10_lc3_m;
						T10_lc3_lastY++;
					} else {
						T10_lc3_borderX = y*T10_lc3_m + T10_lc3_C;
						T10_lc3_lastY = y;
					}
				}
			}
		}

		if(T11_initializedWithValidData) {
			if(y < T11_miny || y > T11_maxy) {
				T11_okay = false;
			} else {
				T11_okay = true;
				if(T11_lc1_horizontal) {
					T11_lc1_cached = (T11_lc1_leftOrAbove ? y <= T11_lc1_borderY : y >= T11_lc1_borderY);
				} else if(T11_lc1_vertical) {
					// nothing
				} else {
					if(T11_lc1_lastY == y - 1) {
						T11_lc1_borderX += T11_lc1_m;
						T11_lc1_lastY++;
					} else {
						T11_lc1_borderX = y*T11_lc1_m + T11_lc1_C;
						T11_lc1_lastY = y;
					}
				}
				if(T11_lc2_horizontal) {
					T11_lc2_cached = (T11_lc2_leftOrAbove ? y <= T11_lc2_borderY : y >= T11_lc2_borderY);
				} else if(T11_lc2_vertical) {
					// nothing
				} else {
					if(T11_lc2_lastY == y - 1) {
						T11_lc2_borderX += T11_lc2_m;
						T11_lc2_lastY++;
					} else {
						T11_lc2_borderX = y*T11_lc2_m + T11_lc2_C;
						T11_lc2_lastY = y;
					}
				}
				if(T11_lc3_horizontal) {
					T11_lc3_cached = (T11_lc3_leftOrAbove ? y <= T11_lc3_borderY : y >= T11_lc3_borderY);
				} else if(T11_lc3_vertical) {
					// nothing
				} else {
					if(T11_lc3_lastY == y - 1) {
						T11_lc3_borderX += T11_lc3_m;
						T11_lc3_lastY++;
					} else {
						T11_lc3_borderX = y*T11_lc3_m + T11_lc3_C;
						T11_lc3_lastY = y;
					}
				}
			}
		}

		if(T12_initializedWithValidData) {
			if(y < T12_miny || y > T12_maxy) {
				T12_okay = false;
			} else {
				T12_okay = true;
				if(T12_lc1_horizontal) {
					T12_lc1_cached = (T12_lc1_leftOrAbove ? y <= T12_lc1_borderY : y >= T12_lc1_borderY);
				} else if(T12_lc1_vertical) {
					// nothing
				} else {
					if(T12_lc1_lastY == y - 1) {
						T12_lc1_borderX += T12_lc1_m;
						T12_lc1_lastY++;
					} else {
						T12_lc1_borderX = y*T12_lc1_m + T12_lc1_C;
						T12_lc1_lastY = y;
					}
				}
				if(T12_lc2_horizontal) {
					T12_lc2_cached = (T12_lc2_leftOrAbove ? y <= T12_lc2_borderY : y >= T12_lc2_borderY);
				} else if(T12_lc2_vertical) {
					// nothing
				} else {
					if(T12_lc2_lastY == y - 1) {
						T12_lc2_borderX += T12_lc2_m;
						T12_lc2_lastY++;
					} else {
						T12_lc2_borderX = y*T12_lc2_m + T12_lc2_C;
						T12_lc2_lastY = y;
					}
				}
				if(T12_lc3_horizontal) {
					T12_lc3_cached = (T12_lc3_leftOrAbove ? y <= T12_lc3_borderY : y >= T12_lc3_borderY);
				} else if(T12_lc3_vertical) {
					// nothing
				} else {
					if(T12_lc3_lastY == y - 1) {
						T12_lc3_borderX += T12_lc3_m;
						T12_lc3_lastY++;
					} else {
						T12_lc3_borderX = y*T12_lc3_m + T12_lc3_C;
						T12_lc3_lastY = y;
					}
				}
			}
		}

		if(T13_initializedWithValidData) {
			if(y < T13_miny || y > T13_maxy) {
				T13_okay = false;
			} else {
				T13_okay = true;
				if(T13_lc1_horizontal) {
					T13_lc1_cached = (T13_lc1_leftOrAbove ? y <= T13_lc1_borderY : y >= T13_lc1_borderY);
				} else if(T13_lc1_vertical) {
					// nothing
				} else {
					if(T13_lc1_lastY == y - 1) {
						T13_lc1_borderX += T13_lc1_m;
						T13_lc1_lastY++;
					} else {
						T13_lc1_borderX = y*T13_lc1_m + T13_lc1_C;
						T13_lc1_lastY = y;
					}
				}
				if(T13_lc2_horizontal) {
					T13_lc2_cached = (T13_lc2_leftOrAbove ? y <= T13_lc2_borderY : y >= T13_lc2_borderY);
				} else if(T13_lc2_vertical) {
					// nothing
				} else {
					if(T13_lc2_lastY == y - 1) {
						T13_lc2_borderX += T13_lc2_m;
						T13_lc2_lastY++;
					} else {
						T13_lc2_borderX = y*T13_lc2_m + T13_lc2_C;
						T13_lc2_lastY = y;
					}
				}
				if(T13_lc3_horizontal) {
					T13_lc3_cached = (T13_lc3_leftOrAbove ? y <= T13_lc3_borderY : y >= T13_lc3_borderY);
				} else if(T13_lc3_vertical) {
					// nothing
				} else {
					if(T13_lc3_lastY == y - 1) {
						T13_lc3_borderX += T13_lc3_m;
						T13_lc3_lastY++;
					} else {
						T13_lc3_borderX = y*T13_lc3_m + T13_lc3_C;
						T13_lc3_lastY = y;
					}
				}
			}
		}

		if(T14_initializedWithValidData) {
			if(y < T14_miny || y > T14_maxy) {
				T14_okay = false;
			} else {
				T14_okay = true;
				if(T14_lc1_horizontal) {
					T14_lc1_cached = (T14_lc1_leftOrAbove ? y <= T14_lc1_borderY : y >= T14_lc1_borderY);
				} else if(T14_lc1_vertical) {
					// nothing
				} else {
					if(T14_lc1_lastY == y - 1) {
						T14_lc1_borderX += T14_lc1_m;
						T14_lc1_lastY++;
					} else {
						T14_lc1_borderX = y*T14_lc1_m + T14_lc1_C;
						T14_lc1_lastY = y;
					}
				}
				if(T14_lc2_horizontal) {
					T14_lc2_cached = (T14_lc2_leftOrAbove ? y <= T14_lc2_borderY : y >= T14_lc2_borderY);
				} else if(T14_lc2_vertical) {
					// nothing
				} else {
					if(T14_lc2_lastY == y - 1) {
						T14_lc2_borderX += T14_lc2_m;
						T14_lc2_lastY++;
					} else {
						T14_lc2_borderX = y*T14_lc2_m + T14_lc2_C;
						T14_lc2_lastY = y;
					}
				}
				if(T14_lc3_horizontal) {
					T14_lc3_cached = (T14_lc3_leftOrAbove ? y <= T14_lc3_borderY : y >= T14_lc3_borderY);
				} else if(T14_lc3_vertical) {
					// nothing
				} else {
					if(T14_lc3_lastY == y - 1) {
						T14_lc3_borderX += T14_lc3_m;
						T14_lc3_lastY++;
					} else {
						T14_lc3_borderX = y*T14_lc3_m + T14_lc3_C;
						T14_lc3_lastY = y;
					}
				}
			}
		}

		if(T15_initializedWithValidData) {
			if(y < T15_miny || y > T15_maxy) {
				T15_okay = false;
			} else {
				T15_okay = true;
				if(T15_lc1_horizontal) {
					T15_lc1_cached = (T15_lc1_leftOrAbove ? y <= T15_lc1_borderY : y >= T15_lc1_borderY);
				} else if(T15_lc1_vertical) {
					// nothing
				} else {
					if(T15_lc1_lastY == y - 1) {
						T15_lc1_borderX += T15_lc1_m;
						T15_lc1_lastY++;
					} else {
						T15_lc1_borderX = y*T15_lc1_m + T15_lc1_C;
						T15_lc1_lastY = y;
					}
				}
				if(T15_lc2_horizontal) {
					T15_lc2_cached = (T15_lc2_leftOrAbove ? y <= T15_lc2_borderY : y >= T15_lc2_borderY);
				} else if(T15_lc2_vertical) {
					// nothing
				} else {
					if(T15_lc2_lastY == y - 1) {
						T15_lc2_borderX += T15_lc2_m;
						T15_lc2_lastY++;
					} else {
						T15_lc2_borderX = y*T15_lc2_m + T15_lc2_C;
						T15_lc2_lastY = y;
					}
				}
				if(T15_lc3_horizontal) {
					T15_lc3_cached = (T15_lc3_leftOrAbove ? y <= T15_lc3_borderY : y >= T15_lc3_borderY);
				} else if(T15_lc3_vertical) {
					// nothing
				} else {
					if(T15_lc3_lastY == y - 1) {
						T15_lc3_borderX += T15_lc3_m;
						T15_lc3_lastY++;
					} else {
						T15_lc3_borderX = y*T15_lc3_m + T15_lc3_C;
						T15_lc3_lastY = y;
					}
				}
			}
		}

		if(T16_initializedWithValidData) {
			if(y < T16_miny || y > T16_maxy) {
				T16_okay = false;
			} else {
				T16_okay = true;
				if(T16_lc1_horizontal) {
					T16_lc1_cached = (T16_lc1_leftOrAbove ? y <= T16_lc1_borderY : y >= T16_lc1_borderY);
				} else if(T16_lc1_vertical) {
					// nothing
				} else {
					if(T16_lc1_lastY == y - 1) {
						T16_lc1_borderX += T16_lc1_m;
						T16_lc1_lastY++;
					} else {
						T16_lc1_borderX = y*T16_lc1_m + T16_lc1_C;
						T16_lc1_lastY = y;
					}
				}
				if(T16_lc2_horizontal) {
					T16_lc2_cached = (T16_lc2_leftOrAbove ? y <= T16_lc2_borderY : y >= T16_lc2_borderY);
				} else if(T16_lc2_vertical) {
					// nothing
				} else {
					if(T16_lc2_lastY == y - 1) {
						T16_lc2_borderX += T16_lc2_m;
						T16_lc2_lastY++;
					} else {
						T16_lc2_borderX = y*T16_lc2_m + T16_lc2_C;
						T16_lc2_lastY = y;
					}
				}
				if(T16_lc3_horizontal) {
					T16_lc3_cached = (T16_lc3_leftOrAbove ? y <= T16_lc3_borderY : y >= T16_lc3_borderY);
				} else if(T16_lc3_vertical) {
					// nothing
				} else {
					if(T16_lc3_lastY == y - 1) {
						T16_lc3_borderX += T16_lc3_m;
						T16_lc3_lastY++;
					} else {
						T16_lc3_borderX = y*T16_lc3_m + T16_lc3_C;
						T16_lc3_lastY = y;
					}
				}
			}
		}

		if(T17_initializedWithValidData) {
			if(y < T17_miny || y > T17_maxy) {
				T17_okay = false;
			} else {
				T17_okay = true;
				if(T17_lc1_horizontal) {
					T17_lc1_cached = (T17_lc1_leftOrAbove ? y <= T17_lc1_borderY : y >= T17_lc1_borderY);
				} else if(T17_lc1_vertical) {
					// nothing
				} else {
					if(T17_lc1_lastY == y - 1) {
						T17_lc1_borderX += T17_lc1_m;
						T17_lc1_lastY++;
					} else {
						T17_lc1_borderX = y*T17_lc1_m + T17_lc1_C;
						T17_lc1_lastY = y;
					}
				}
				if(T17_lc2_horizontal) {
					T17_lc2_cached = (T17_lc2_leftOrAbove ? y <= T17_lc2_borderY : y >= T17_lc2_borderY);
				} else if(T17_lc2_vertical) {
					// nothing
				} else {
					if(T17_lc2_lastY == y - 1) {
						T17_lc2_borderX += T17_lc2_m;
						T17_lc2_lastY++;
					} else {
						T17_lc2_borderX = y*T17_lc2_m + T17_lc2_C;
						T17_lc2_lastY = y;
					}
				}
				if(T17_lc3_horizontal) {
					T17_lc3_cached = (T17_lc3_leftOrAbove ? y <= T17_lc3_borderY : y >= T17_lc3_borderY);
				} else if(T17_lc3_vertical) {
					// nothing
				} else {
					if(T17_lc3_lastY == y - 1) {
						T17_lc3_borderX += T17_lc3_m;
						T17_lc3_lastY++;
					} else {
						T17_lc3_borderX = y*T17_lc3_m + T17_lc3_C;
						T17_lc3_lastY = y;
					}
				}
			}
		}

		if(T18_initializedWithValidData) {
			if(y < T18_miny || y > T18_maxy) {
				T18_okay = false;
			} else {
				T18_okay = true;
				if(T18_lc1_horizontal) {
					T18_lc1_cached = (T18_lc1_leftOrAbove ? y <= T18_lc1_borderY : y >= T18_lc1_borderY);
				} else if(T18_lc1_vertical) {
					// nothing
				} else {
					if(T18_lc1_lastY == y - 1) {
						T18_lc1_borderX += T18_lc1_m;
						T18_lc1_lastY++;
					} else {
						T18_lc1_borderX = y*T18_lc1_m + T18_lc1_C;
						T18_lc1_lastY = y;
					}
				}
				if(T18_lc2_horizontal) {
					T18_lc2_cached = (T18_lc2_leftOrAbove ? y <= T18_lc2_borderY : y >= T18_lc2_borderY);
				} else if(T18_lc2_vertical) {
					// nothing
				} else {
					if(T18_lc2_lastY == y - 1) {
						T18_lc2_borderX += T18_lc2_m;
						T18_lc2_lastY++;
					} else {
						T18_lc2_borderX = y*T18_lc2_m + T18_lc2_C;
						T18_lc2_lastY = y;
					}
				}
				if(T18_lc3_horizontal) {
					T18_lc3_cached = (T18_lc3_leftOrAbove ? y <= T18_lc3_borderY : y >= T18_lc3_borderY);
				} else if(T18_lc3_vertical) {
					// nothing
				} else {
					if(T18_lc3_lastY == y - 1) {
						T18_lc3_borderX += T18_lc3_m;
						T18_lc3_lastY++;
					} else {
						T18_lc3_borderX = y*T18_lc3_m + T18_lc3_C;
						T18_lc3_lastY = y;
					}
				}
			}
		}

		if(T19_initializedWithValidData) {
			if(y < T19_miny || y > T19_maxy) {
				T19_okay = false;
			} else {
				T19_okay = true;
				if(T19_lc1_horizontal) {
					T19_lc1_cached = (T19_lc1_leftOrAbove ? y <= T19_lc1_borderY : y >= T19_lc1_borderY);
				} else if(T19_lc1_vertical) {
					// nothing
				} else {
					if(T19_lc1_lastY == y - 1) {
						T19_lc1_borderX += T19_lc1_m;
						T19_lc1_lastY++;
					} else {
						T19_lc1_borderX = y*T19_lc1_m + T19_lc1_C;
						T19_lc1_lastY = y;
					}
				}
				if(T19_lc2_horizontal) {
					T19_lc2_cached = (T19_lc2_leftOrAbove ? y <= T19_lc2_borderY : y >= T19_lc2_borderY);
				} else if(T19_lc2_vertical) {
					// nothing
				} else {
					if(T19_lc2_lastY == y - 1) {
						T19_lc2_borderX += T19_lc2_m;
						T19_lc2_lastY++;
					} else {
						T19_lc2_borderX = y*T19_lc2_m + T19_lc2_C;
						T19_lc2_lastY = y;
					}
				}
				if(T19_lc3_horizontal) {
					T19_lc3_cached = (T19_lc3_leftOrAbove ? y <= T19_lc3_borderY : y >= T19_lc3_borderY);
				} else if(T19_lc3_vertical) {
					// nothing
				} else {
					if(T19_lc3_lastY == y - 1) {
						T19_lc3_borderX += T19_lc3_m;
						T19_lc3_lastY++;
					} else {
						T19_lc3_borderX = y*T19_lc3_m + T19_lc3_C;
						T19_lc3_lastY = y;
					}
				}
			}
		}

		if(T20_initializedWithValidData) {
			if(y < T20_miny || y > T20_maxy) {
				T20_okay = false;
			} else {
				T20_okay = true;
				if(T20_lc1_horizontal) {
					T20_lc1_cached = (T20_lc1_leftOrAbove ? y <= T20_lc1_borderY : y >= T20_lc1_borderY);
				} else if(T20_lc1_vertical) {
					// nothing
				} else {
					if(T20_lc1_lastY == y - 1) {
						T20_lc1_borderX += T20_lc1_m;
						T20_lc1_lastY++;
					} else {
						T20_lc1_borderX = y*T20_lc1_m + T20_lc1_C;
						T20_lc1_lastY = y;
					}
				}
				if(T20_lc2_horizontal) {
					T20_lc2_cached = (T20_lc2_leftOrAbove ? y <= T20_lc2_borderY : y >= T20_lc2_borderY);
				} else if(T20_lc2_vertical) {
					// nothing
				} else {
					if(T20_lc2_lastY == y - 1) {
						T20_lc2_borderX += T20_lc2_m;
						T20_lc2_lastY++;
					} else {
						T20_lc2_borderX = y*T20_lc2_m + T20_lc2_C;
						T20_lc2_lastY = y;
					}
				}
				if(T20_lc3_horizontal) {
					T20_lc3_cached = (T20_lc3_leftOrAbove ? y <= T20_lc3_borderY : y >= T20_lc3_borderY);
				} else if(T20_lc3_vertical) {
					// nothing
				} else {
					if(T20_lc3_lastY == y - 1) {
						T20_lc3_borderX += T20_lc3_m;
						T20_lc3_lastY++;
					} else {
						T20_lc3_borderX = y*T20_lc3_m + T20_lc3_C;
						T20_lc3_lastY = y;
					}
				}
			}
		}

		if(T21_initializedWithValidData) {
			if(y < T21_miny || y > T21_maxy) {
				T21_okay = false;
			} else {
				T21_okay = true;
				if(T21_lc1_horizontal) {
					T21_lc1_cached = (T21_lc1_leftOrAbove ? y <= T21_lc1_borderY : y >= T21_lc1_borderY);
				} else if(T21_lc1_vertical) {
					// nothing
				} else {
					if(T21_lc1_lastY == y - 1) {
						T21_lc1_borderX += T21_lc1_m;
						T21_lc1_lastY++;
					} else {
						T21_lc1_borderX = y*T21_lc1_m + T21_lc1_C;
						T21_lc1_lastY = y;
					}
				}
				if(T21_lc2_horizontal) {
					T21_lc2_cached = (T21_lc2_leftOrAbove ? y <= T21_lc2_borderY : y >= T21_lc2_borderY);
				} else if(T21_lc2_vertical) {
					// nothing
				} else {
					if(T21_lc2_lastY == y - 1) {
						T21_lc2_borderX += T21_lc2_m;
						T21_lc2_lastY++;
					} else {
						T21_lc2_borderX = y*T21_lc2_m + T21_lc2_C;
						T21_lc2_lastY = y;
					}
				}
				if(T21_lc3_horizontal) {
					T21_lc3_cached = (T21_lc3_leftOrAbove ? y <= T21_lc3_borderY : y >= T21_lc3_borderY);
				} else if(T21_lc3_vertical) {
					// nothing
				} else {
					if(T21_lc3_lastY == y - 1) {
						T21_lc3_borderX += T21_lc3_m;
						T21_lc3_lastY++;
					} else {
						T21_lc3_borderX = y*T21_lc3_m + T21_lc3_C;
						T21_lc3_lastY = y;
					}
				}
			}
		}

		if(T22_initializedWithValidData) {
			if(y < T22_miny || y > T22_maxy) {
				T22_okay = false;
			} else {
				T22_okay = true;
				if(T22_lc1_horizontal) {
					T22_lc1_cached = (T22_lc1_leftOrAbove ? y <= T22_lc1_borderY : y >= T22_lc1_borderY);
				} else if(T22_lc1_vertical) {
					// nothing
				} else {
					if(T22_lc1_lastY == y - 1) {
						T22_lc1_borderX += T22_lc1_m;
						T22_lc1_lastY++;
					} else {
						T22_lc1_borderX = y*T22_lc1_m + T22_lc1_C;
						T22_lc1_lastY = y;
					}
				}
				if(T22_lc2_horizontal) {
					T22_lc2_cached = (T22_lc2_leftOrAbove ? y <= T22_lc2_borderY : y >= T22_lc2_borderY);
				} else if(T22_lc2_vertical) {
					// nothing
				} else {
					if(T22_lc2_lastY == y - 1) {
						T22_lc2_borderX += T22_lc2_m;
						T22_lc2_lastY++;
					} else {
						T22_lc2_borderX = y*T22_lc2_m + T22_lc2_C;
						T22_lc2_lastY = y;
					}
				}
				if(T22_lc3_horizontal) {
					T22_lc3_cached = (T22_lc3_leftOrAbove ? y <= T22_lc3_borderY : y >= T22_lc3_borderY);
				} else if(T22_lc3_vertical) {
					// nothing
				} else {
					if(T22_lc3_lastY == y - 1) {
						T22_lc3_borderX += T22_lc3_m;
						T22_lc3_lastY++;
					} else {
						T22_lc3_borderX = y*T22_lc3_m + T22_lc3_C;
						T22_lc3_lastY = y;
					}
				}
			}
		}

		if(T23_initializedWithValidData) {
			if(y < T23_miny || y > T23_maxy) {
				T23_okay = false;
			} else {
				T23_okay = true;
				if(T23_lc1_horizontal) {
					T23_lc1_cached = (T23_lc1_leftOrAbove ? y <= T23_lc1_borderY : y >= T23_lc1_borderY);
				} else if(T23_lc1_vertical) {
					// nothing
				} else {
					if(T23_lc1_lastY == y - 1) {
						T23_lc1_borderX += T23_lc1_m;
						T23_lc1_lastY++;
					} else {
						T23_lc1_borderX = y*T23_lc1_m + T23_lc1_C;
						T23_lc1_lastY = y;
					}
				}
				if(T23_lc2_horizontal) {
					T23_lc2_cached = (T23_lc2_leftOrAbove ? y <= T23_lc2_borderY : y >= T23_lc2_borderY);
				} else if(T23_lc2_vertical) {
					// nothing
				} else {
					if(T23_lc2_lastY == y - 1) {
						T23_lc2_borderX += T23_lc2_m;
						T23_lc2_lastY++;
					} else {
						T23_lc2_borderX = y*T23_lc2_m + T23_lc2_C;
						T23_lc2_lastY = y;
					}
				}
				if(T23_lc3_horizontal) {
					T23_lc3_cached = (T23_lc3_leftOrAbove ? y <= T23_lc3_borderY : y >= T23_lc3_borderY);
				} else if(T23_lc3_vertical) {
					// nothing
				} else {
					if(T23_lc3_lastY == y - 1) {
						T23_lc3_borderX += T23_lc3_m;
						T23_lc3_lastY++;
					} else {
						T23_lc3_borderX = y*T23_lc3_m + T23_lc3_C;
						T23_lc3_lastY = y;
					}
				}
			}
		}

		if(T24_initializedWithValidData) {
			if(y < T24_miny || y > T24_maxy) {
				T24_okay = false;
			} else {
				T24_okay = true;
				if(T24_lc1_horizontal) {
					T24_lc1_cached = (T24_lc1_leftOrAbove ? y <= T24_lc1_borderY : y >= T24_lc1_borderY);
				} else if(T24_lc1_vertical) {
					// nothing
				} else {
					if(T24_lc1_lastY == y - 1) {
						T24_lc1_borderX += T24_lc1_m;
						T24_lc1_lastY++;
					} else {
						T24_lc1_borderX = y*T24_lc1_m + T24_lc1_C;
						T24_lc1_lastY = y;
					}
				}
				if(T24_lc2_horizontal) {
					T24_lc2_cached = (T24_lc2_leftOrAbove ? y <= T24_lc2_borderY : y >= T24_lc2_borderY);
				} else if(T24_lc2_vertical) {
					// nothing
				} else {
					if(T24_lc2_lastY == y - 1) {
						T24_lc2_borderX += T24_lc2_m;
						T24_lc2_lastY++;
					} else {
						T24_lc2_borderX = y*T24_lc2_m + T24_lc2_C;
						T24_lc2_lastY = y;
					}
				}
				if(T24_lc3_horizontal) {
					T24_lc3_cached = (T24_lc3_leftOrAbove ? y <= T24_lc3_borderY : y >= T24_lc3_borderY);
				} else if(T24_lc3_vertical) {
					// nothing
				} else {
					if(T24_lc3_lastY == y - 1) {
						T24_lc3_borderX += T24_lc3_m;
						T24_lc3_lastY++;
					} else {
						T24_lc3_borderX = y*T24_lc3_m + T24_lc3_C;
						T24_lc3_lastY = y;
					}
				}
			}
		}

		if(T25_initializedWithValidData) {
			if(y < T25_miny || y > T25_maxy) {
				T25_okay = false;
			} else {
				T25_okay = true;
				if(T25_lc1_horizontal) {
					T25_lc1_cached = (T25_lc1_leftOrAbove ? y <= T25_lc1_borderY : y >= T25_lc1_borderY);
				} else if(T25_lc1_vertical) {
					// nothing
				} else {
					if(T25_lc1_lastY == y - 1) {
						T25_lc1_borderX += T25_lc1_m;
						T25_lc1_lastY++;
					} else {
						T25_lc1_borderX = y*T25_lc1_m + T25_lc1_C;
						T25_lc1_lastY = y;
					}
				}
				if(T25_lc2_horizontal) {
					T25_lc2_cached = (T25_lc2_leftOrAbove ? y <= T25_lc2_borderY : y >= T25_lc2_borderY);
				} else if(T25_lc2_vertical) {
					// nothing
				} else {
					if(T25_lc2_lastY == y - 1) {
						T25_lc2_borderX += T25_lc2_m;
						T25_lc2_lastY++;
					} else {
						T25_lc2_borderX = y*T25_lc2_m + T25_lc2_C;
						T25_lc2_lastY = y;
					}
				}
				if(T25_lc3_horizontal) {
					T25_lc3_cached = (T25_lc3_leftOrAbove ? y <= T25_lc3_borderY : y >= T25_lc3_borderY);
				} else if(T25_lc3_vertical) {
					// nothing
				} else {
					if(T25_lc3_lastY == y - 1) {
						T25_lc3_borderX += T25_lc3_m;
						T25_lc3_lastY++;
					} else {
						T25_lc3_borderX = y*T25_lc3_m + T25_lc3_C;
						T25_lc3_lastY = y;
					}
				}
			}
		}

		if(T26_initializedWithValidData) {
			if(y < T26_miny || y > T26_maxy) {
				T26_okay = false;
			} else {
				T26_okay = true;
				if(T26_lc1_horizontal) {
					T26_lc1_cached = (T26_lc1_leftOrAbove ? y <= T26_lc1_borderY : y >= T26_lc1_borderY);
				} else if(T26_lc1_vertical) {
					// nothing
				} else {
					if(T26_lc1_lastY == y - 1) {
						T26_lc1_borderX += T26_lc1_m;
						T26_lc1_lastY++;
					} else {
						T26_lc1_borderX = y*T26_lc1_m + T26_lc1_C;
						T26_lc1_lastY = y;
					}
				}
				if(T26_lc2_horizontal) {
					T26_lc2_cached = (T26_lc2_leftOrAbove ? y <= T26_lc2_borderY : y >= T26_lc2_borderY);
				} else if(T26_lc2_vertical) {
					// nothing
				} else {
					if(T26_lc2_lastY == y - 1) {
						T26_lc2_borderX += T26_lc2_m;
						T26_lc2_lastY++;
					} else {
						T26_lc2_borderX = y*T26_lc2_m + T26_lc2_C;
						T26_lc2_lastY = y;
					}
				}
				if(T26_lc3_horizontal) {
					T26_lc3_cached = (T26_lc3_leftOrAbove ? y <= T26_lc3_borderY : y >= T26_lc3_borderY);
				} else if(T26_lc3_vertical) {
					// nothing
				} else {
					if(T26_lc3_lastY == y - 1) {
						T26_lc3_borderX += T26_lc3_m;
						T26_lc3_lastY++;
					} else {
						T26_lc3_borderX = y*T26_lc3_m + T26_lc3_C;
						T26_lc3_lastY = y;
					}
				}
			}
		}

		if(T27_initializedWithValidData) {
			if(y < T27_miny || y > T27_maxy) {
				T27_okay = false;
			} else {
				T27_okay = true;
				if(T27_lc1_horizontal) {
					T27_lc1_cached = (T27_lc1_leftOrAbove ? y <= T27_lc1_borderY : y >= T27_lc1_borderY);
				} else if(T27_lc1_vertical) {
					// nothing
				} else {
					if(T27_lc1_lastY == y - 1) {
						T27_lc1_borderX += T27_lc1_m;
						T27_lc1_lastY++;
					} else {
						T27_lc1_borderX = y*T27_lc1_m + T27_lc1_C;
						T27_lc1_lastY = y;
					}
				}
				if(T27_lc2_horizontal) {
					T27_lc2_cached = (T27_lc2_leftOrAbove ? y <= T27_lc2_borderY : y >= T27_lc2_borderY);
				} else if(T27_lc2_vertical) {
					// nothing
				} else {
					if(T27_lc2_lastY == y - 1) {
						T27_lc2_borderX += T27_lc2_m;
						T27_lc2_lastY++;
					} else {
						T27_lc2_borderX = y*T27_lc2_m + T27_lc2_C;
						T27_lc2_lastY = y;
					}
				}
				if(T27_lc3_horizontal) {
					T27_lc3_cached = (T27_lc3_leftOrAbove ? y <= T27_lc3_borderY : y >= T27_lc3_borderY);
				} else if(T27_lc3_vertical) {
					// nothing
				} else {
					if(T27_lc3_lastY == y - 1) {
						T27_lc3_borderX += T27_lc3_m;
						T27_lc3_lastY++;
					} else {
						T27_lc3_borderX = y*T27_lc3_m + T27_lc3_C;
						T27_lc3_lastY = y;
					}
				}
			}
		}

		if(T28_initializedWithValidData) {
			if(y < T28_miny || y > T28_maxy) {
				T28_okay = false;
			} else {
				T28_okay = true;
				if(T28_lc1_horizontal) {
					T28_lc1_cached = (T28_lc1_leftOrAbove ? y <= T28_lc1_borderY : y >= T28_lc1_borderY);
				} else if(T28_lc1_vertical) {
					// nothing
				} else {
					if(T28_lc1_lastY == y - 1) {
						T28_lc1_borderX += T28_lc1_m;
						T28_lc1_lastY++;
					} else {
						T28_lc1_borderX = y*T28_lc1_m + T28_lc1_C;
						T28_lc1_lastY = y;
					}
				}
				if(T28_lc2_horizontal) {
					T28_lc2_cached = (T28_lc2_leftOrAbove ? y <= T28_lc2_borderY : y >= T28_lc2_borderY);
				} else if(T28_lc2_vertical) {
					// nothing
				} else {
					if(T28_lc2_lastY == y - 1) {
						T28_lc2_borderX += T28_lc2_m;
						T28_lc2_lastY++;
					} else {
						T28_lc2_borderX = y*T28_lc2_m + T28_lc2_C;
						T28_lc2_lastY = y;
					}
				}
				if(T28_lc3_horizontal) {
					T28_lc3_cached = (T28_lc3_leftOrAbove ? y <= T28_lc3_borderY : y >= T28_lc3_borderY);
				} else if(T28_lc3_vertical) {
					// nothing
				} else {
					if(T28_lc3_lastY == y - 1) {
						T28_lc3_borderX += T28_lc3_m;
						T28_lc3_lastY++;
					} else {
						T28_lc3_borderX = y*T28_lc3_m + T28_lc3_C;
						T28_lc3_lastY = y;
					}
				}
			}
		}

		if(T29_initializedWithValidData) {
			if(y < T29_miny || y > T29_maxy) {
				T29_okay = false;
			} else {
				T29_okay = true;
				if(T29_lc1_horizontal) {
					T29_lc1_cached = (T29_lc1_leftOrAbove ? y <= T29_lc1_borderY : y >= T29_lc1_borderY);
				} else if(T29_lc1_vertical) {
					// nothing
				} else {
					if(T29_lc1_lastY == y - 1) {
						T29_lc1_borderX += T29_lc1_m;
						T29_lc1_lastY++;
					} else {
						T29_lc1_borderX = y*T29_lc1_m + T29_lc1_C;
						T29_lc1_lastY = y;
					}
				}
				if(T29_lc2_horizontal) {
					T29_lc2_cached = (T29_lc2_leftOrAbove ? y <= T29_lc2_borderY : y >= T29_lc2_borderY);
				} else if(T29_lc2_vertical) {
					// nothing
				} else {
					if(T29_lc2_lastY == y - 1) {
						T29_lc2_borderX += T29_lc2_m;
						T29_lc2_lastY++;
					} else {
						T29_lc2_borderX = y*T29_lc2_m + T29_lc2_C;
						T29_lc2_lastY = y;
					}
				}
				if(T29_lc3_horizontal) {
					T29_lc3_cached = (T29_lc3_leftOrAbove ? y <= T29_lc3_borderY : y >= T29_lc3_borderY);
				} else if(T29_lc3_vertical) {
					// nothing
				} else {
					if(T29_lc3_lastY == y - 1) {
						T29_lc3_borderX += T29_lc3_m;
						T29_lc3_lastY++;
					} else {
						T29_lc3_borderX = y*T29_lc3_m + T29_lc3_C;
						T29_lc3_lastY = y;
					}
				}
			}
		}
	}

	public void moveToY2(int y) {

		if(T30_initializedWithValidData) {
			if(y < T30_miny || y > T30_maxy) {
				T30_okay = false;
			} else {
				T30_okay = true;
				if(T30_lc1_horizontal) {
					T30_lc1_cached = (T30_lc1_leftOrAbove ? y <= T30_lc1_borderY : y >= T30_lc1_borderY);
				} else if(T30_lc1_vertical) {
					// nothing
				} else {
					if(T30_lc1_lastY == y - 1) {
						T30_lc1_borderX += T30_lc1_m;
						T30_lc1_lastY++;
					} else {
						T30_lc1_borderX = y*T30_lc1_m + T30_lc1_C;
						T30_lc1_lastY = y;
					}
				}
				if(T30_lc2_horizontal) {
					T30_lc2_cached = (T30_lc2_leftOrAbove ? y <= T30_lc2_borderY : y >= T30_lc2_borderY);
				} else if(T30_lc2_vertical) {
					// nothing
				} else {
					if(T30_lc2_lastY == y - 1) {
						T30_lc2_borderX += T30_lc2_m;
						T30_lc2_lastY++;
					} else {
						T30_lc2_borderX = y*T30_lc2_m + T30_lc2_C;
						T30_lc2_lastY = y;
					}
				}
				if(T30_lc3_horizontal) {
					T30_lc3_cached = (T30_lc3_leftOrAbove ? y <= T30_lc3_borderY : y >= T30_lc3_borderY);
				} else if(T30_lc3_vertical) {
					// nothing
				} else {
					if(T30_lc3_lastY == y - 1) {
						T30_lc3_borderX += T30_lc3_m;
						T30_lc3_lastY++;
					} else {
						T30_lc3_borderX = y*T30_lc3_m + T30_lc3_C;
						T30_lc3_lastY = y;
					}
				}
			}
		}

		if(T31_initializedWithValidData) {
			if(y < T31_miny || y > T31_maxy) {
				T31_okay = false;
			} else {
				T31_okay = true;
				if(T31_lc1_horizontal) {
					T31_lc1_cached = (T31_lc1_leftOrAbove ? y <= T31_lc1_borderY : y >= T31_lc1_borderY);
				} else if(T31_lc1_vertical) {
					// nothing
				} else {
					if(T31_lc1_lastY == y - 1) {
						T31_lc1_borderX += T31_lc1_m;
						T31_lc1_lastY++;
					} else {
						T31_lc1_borderX = y*T31_lc1_m + T31_lc1_C;
						T31_lc1_lastY = y;
					}
				}
				if(T31_lc2_horizontal) {
					T31_lc2_cached = (T31_lc2_leftOrAbove ? y <= T31_lc2_borderY : y >= T31_lc2_borderY);
				} else if(T31_lc2_vertical) {
					// nothing
				} else {
					if(T31_lc2_lastY == y - 1) {
						T31_lc2_borderX += T31_lc2_m;
						T31_lc2_lastY++;
					} else {
						T31_lc2_borderX = y*T31_lc2_m + T31_lc2_C;
						T31_lc2_lastY = y;
					}
				}
				if(T31_lc3_horizontal) {
					T31_lc3_cached = (T31_lc3_leftOrAbove ? y <= T31_lc3_borderY : y >= T31_lc3_borderY);
				} else if(T31_lc3_vertical) {
					// nothing
				} else {
					if(T31_lc3_lastY == y - 1) {
						T31_lc3_borderX += T31_lc3_m;
						T31_lc3_lastY++;
					} else {
						T31_lc3_borderX = y*T31_lc3_m + T31_lc3_C;
						T31_lc3_lastY = y;
					}
				}
			}
		}

		if(T32_initializedWithValidData) {
			if(y < T32_miny || y > T32_maxy) {
				T32_okay = false;
			} else {
				T32_okay = true;
				if(T32_lc1_horizontal) {
					T32_lc1_cached = (T32_lc1_leftOrAbove ? y <= T32_lc1_borderY : y >= T32_lc1_borderY);
				} else if(T32_lc1_vertical) {
					// nothing
				} else {
					if(T32_lc1_lastY == y - 1) {
						T32_lc1_borderX += T32_lc1_m;
						T32_lc1_lastY++;
					} else {
						T32_lc1_borderX = y*T32_lc1_m + T32_lc1_C;
						T32_lc1_lastY = y;
					}
				}
				if(T32_lc2_horizontal) {
					T32_lc2_cached = (T32_lc2_leftOrAbove ? y <= T32_lc2_borderY : y >= T32_lc2_borderY);
				} else if(T32_lc2_vertical) {
					// nothing
				} else {
					if(T32_lc2_lastY == y - 1) {
						T32_lc2_borderX += T32_lc2_m;
						T32_lc2_lastY++;
					} else {
						T32_lc2_borderX = y*T32_lc2_m + T32_lc2_C;
						T32_lc2_lastY = y;
					}
				}
				if(T32_lc3_horizontal) {
					T32_lc3_cached = (T32_lc3_leftOrAbove ? y <= T32_lc3_borderY : y >= T32_lc3_borderY);
				} else if(T32_lc3_vertical) {
					// nothing
				} else {
					if(T32_lc3_lastY == y - 1) {
						T32_lc3_borderX += T32_lc3_m;
						T32_lc3_lastY++;
					} else {
						T32_lc3_borderX = y*T32_lc3_m + T32_lc3_C;
						T32_lc3_lastY = y;
					}
				}
			}
		}

		if(T33_initializedWithValidData) {
			if(y < T33_miny || y > T33_maxy) {
				T33_okay = false;
			} else {
				T33_okay = true;
				if(T33_lc1_horizontal) {
					T33_lc1_cached = (T33_lc1_leftOrAbove ? y <= T33_lc1_borderY : y >= T33_lc1_borderY);
				} else if(T33_lc1_vertical) {
					// nothing
				} else {
					if(T33_lc1_lastY == y - 1) {
						T33_lc1_borderX += T33_lc1_m;
						T33_lc1_lastY++;
					} else {
						T33_lc1_borderX = y*T33_lc1_m + T33_lc1_C;
						T33_lc1_lastY = y;
					}
				}
				if(T33_lc2_horizontal) {
					T33_lc2_cached = (T33_lc2_leftOrAbove ? y <= T33_lc2_borderY : y >= T33_lc2_borderY);
				} else if(T33_lc2_vertical) {
					// nothing
				} else {
					if(T33_lc2_lastY == y - 1) {
						T33_lc2_borderX += T33_lc2_m;
						T33_lc2_lastY++;
					} else {
						T33_lc2_borderX = y*T33_lc2_m + T33_lc2_C;
						T33_lc2_lastY = y;
					}
				}
				if(T33_lc3_horizontal) {
					T33_lc3_cached = (T33_lc3_leftOrAbove ? y <= T33_lc3_borderY : y >= T33_lc3_borderY);
				} else if(T33_lc3_vertical) {
					// nothing
				} else {
					if(T33_lc3_lastY == y - 1) {
						T33_lc3_borderX += T33_lc3_m;
						T33_lc3_lastY++;
					} else {
						T33_lc3_borderX = y*T33_lc3_m + T33_lc3_C;
						T33_lc3_lastY = y;
					}
				}
			}
		}

		if(T34_initializedWithValidData) {
			if(y < T34_miny || y > T34_maxy) {
				T34_okay = false;
			} else {
				T34_okay = true;
				if(T34_lc1_horizontal) {
					T34_lc1_cached = (T34_lc1_leftOrAbove ? y <= T34_lc1_borderY : y >= T34_lc1_borderY);
				} else if(T34_lc1_vertical) {
					// nothing
				} else {
					if(T34_lc1_lastY == y - 1) {
						T34_lc1_borderX += T34_lc1_m;
						T34_lc1_lastY++;
					} else {
						T34_lc1_borderX = y*T34_lc1_m + T34_lc1_C;
						T34_lc1_lastY = y;
					}
				}
				if(T34_lc2_horizontal) {
					T34_lc2_cached = (T34_lc2_leftOrAbove ? y <= T34_lc2_borderY : y >= T34_lc2_borderY);
				} else if(T34_lc2_vertical) {
					// nothing
				} else {
					if(T34_lc2_lastY == y - 1) {
						T34_lc2_borderX += T34_lc2_m;
						T34_lc2_lastY++;
					} else {
						T34_lc2_borderX = y*T34_lc2_m + T34_lc2_C;
						T34_lc2_lastY = y;
					}
				}
				if(T34_lc3_horizontal) {
					T34_lc3_cached = (T34_lc3_leftOrAbove ? y <= T34_lc3_borderY : y >= T34_lc3_borderY);
				} else if(T34_lc3_vertical) {
					// nothing
				} else {
					if(T34_lc3_lastY == y - 1) {
						T34_lc3_borderX += T34_lc3_m;
						T34_lc3_lastY++;
					} else {
						T34_lc3_borderX = y*T34_lc3_m + T34_lc3_C;
						T34_lc3_lastY = y;
					}
				}
			}
		}

		if(T35_initializedWithValidData) {
			if(y < T35_miny || y > T35_maxy) {
				T35_okay = false;
			} else {
				T35_okay = true;
				if(T35_lc1_horizontal) {
					T35_lc1_cached = (T35_lc1_leftOrAbove ? y <= T35_lc1_borderY : y >= T35_lc1_borderY);
				} else if(T35_lc1_vertical) {
					// nothing
				} else {
					if(T35_lc1_lastY == y - 1) {
						T35_lc1_borderX += T35_lc1_m;
						T35_lc1_lastY++;
					} else {
						T35_lc1_borderX = y*T35_lc1_m + T35_lc1_C;
						T35_lc1_lastY = y;
					}
				}
				if(T35_lc2_horizontal) {
					T35_lc2_cached = (T35_lc2_leftOrAbove ? y <= T35_lc2_borderY : y >= T35_lc2_borderY);
				} else if(T35_lc2_vertical) {
					// nothing
				} else {
					if(T35_lc2_lastY == y - 1) {
						T35_lc2_borderX += T35_lc2_m;
						T35_lc2_lastY++;
					} else {
						T35_lc2_borderX = y*T35_lc2_m + T35_lc2_C;
						T35_lc2_lastY = y;
					}
				}
				if(T35_lc3_horizontal) {
					T35_lc3_cached = (T35_lc3_leftOrAbove ? y <= T35_lc3_borderY : y >= T35_lc3_borderY);
				} else if(T35_lc3_vertical) {
					// nothing
				} else {
					if(T35_lc3_lastY == y - 1) {
						T35_lc3_borderX += T35_lc3_m;
						T35_lc3_lastY++;
					} else {
						T35_lc3_borderX = y*T35_lc3_m + T35_lc3_C;
						T35_lc3_lastY = y;
					}
				}
			}
		}

		if(T36_initializedWithValidData) {
			if(y < T36_miny || y > T36_maxy) {
				T36_okay = false;
			} else {
				T36_okay = true;
				if(T36_lc1_horizontal) {
					T36_lc1_cached = (T36_lc1_leftOrAbove ? y <= T36_lc1_borderY : y >= T36_lc1_borderY);
				} else if(T36_lc1_vertical) {
					// nothing
				} else {
					if(T36_lc1_lastY == y - 1) {
						T36_lc1_borderX += T36_lc1_m;
						T36_lc1_lastY++;
					} else {
						T36_lc1_borderX = y*T36_lc1_m + T36_lc1_C;
						T36_lc1_lastY = y;
					}
				}
				if(T36_lc2_horizontal) {
					T36_lc2_cached = (T36_lc2_leftOrAbove ? y <= T36_lc2_borderY : y >= T36_lc2_borderY);
				} else if(T36_lc2_vertical) {
					// nothing
				} else {
					if(T36_lc2_lastY == y - 1) {
						T36_lc2_borderX += T36_lc2_m;
						T36_lc2_lastY++;
					} else {
						T36_lc2_borderX = y*T36_lc2_m + T36_lc2_C;
						T36_lc2_lastY = y;
					}
				}
				if(T36_lc3_horizontal) {
					T36_lc3_cached = (T36_lc3_leftOrAbove ? y <= T36_lc3_borderY : y >= T36_lc3_borderY);
				} else if(T36_lc3_vertical) {
					// nothing
				} else {
					if(T36_lc3_lastY == y - 1) {
						T36_lc3_borderX += T36_lc3_m;
						T36_lc3_lastY++;
					} else {
						T36_lc3_borderX = y*T36_lc3_m + T36_lc3_C;
						T36_lc3_lastY = y;
					}
				}
			}
		}

		if(T37_initializedWithValidData) {
			if(y < T37_miny || y > T37_maxy) {
				T37_okay = false;
			} else {
				T37_okay = true;
				if(T37_lc1_horizontal) {
					T37_lc1_cached = (T37_lc1_leftOrAbove ? y <= T37_lc1_borderY : y >= T37_lc1_borderY);
				} else if(T37_lc1_vertical) {
					// nothing
				} else {
					if(T37_lc1_lastY == y - 1) {
						T37_lc1_borderX += T37_lc1_m;
						T37_lc1_lastY++;
					} else {
						T37_lc1_borderX = y*T37_lc1_m + T37_lc1_C;
						T37_lc1_lastY = y;
					}
				}
				if(T37_lc2_horizontal) {
					T37_lc2_cached = (T37_lc2_leftOrAbove ? y <= T37_lc2_borderY : y >= T37_lc2_borderY);
				} else if(T37_lc2_vertical) {
					// nothing
				} else {
					if(T37_lc2_lastY == y - 1) {
						T37_lc2_borderX += T37_lc2_m;
						T37_lc2_lastY++;
					} else {
						T37_lc2_borderX = y*T37_lc2_m + T37_lc2_C;
						T37_lc2_lastY = y;
					}
				}
				if(T37_lc3_horizontal) {
					T37_lc3_cached = (T37_lc3_leftOrAbove ? y <= T37_lc3_borderY : y >= T37_lc3_borderY);
				} else if(T37_lc3_vertical) {
					// nothing
				} else {
					if(T37_lc3_lastY == y - 1) {
						T37_lc3_borderX += T37_lc3_m;
						T37_lc3_lastY++;
					} else {
						T37_lc3_borderX = y*T37_lc3_m + T37_lc3_C;
						T37_lc3_lastY = y;
					}
				}
			}
		}

		if(T38_initializedWithValidData) {
			if(y < T38_miny || y > T38_maxy) {
				T38_okay = false;
			} else {
				T38_okay = true;
				if(T38_lc1_horizontal) {
					T38_lc1_cached = (T38_lc1_leftOrAbove ? y <= T38_lc1_borderY : y >= T38_lc1_borderY);
				} else if(T38_lc1_vertical) {
					// nothing
				} else {
					if(T38_lc1_lastY == y - 1) {
						T38_lc1_borderX += T38_lc1_m;
						T38_lc1_lastY++;
					} else {
						T38_lc1_borderX = y*T38_lc1_m + T38_lc1_C;
						T38_lc1_lastY = y;
					}
				}
				if(T38_lc2_horizontal) {
					T38_lc2_cached = (T38_lc2_leftOrAbove ? y <= T38_lc2_borderY : y >= T38_lc2_borderY);
				} else if(T38_lc2_vertical) {
					// nothing
				} else {
					if(T38_lc2_lastY == y - 1) {
						T38_lc2_borderX += T38_lc2_m;
						T38_lc2_lastY++;
					} else {
						T38_lc2_borderX = y*T38_lc2_m + T38_lc2_C;
						T38_lc2_lastY = y;
					}
				}
				if(T38_lc3_horizontal) {
					T38_lc3_cached = (T38_lc3_leftOrAbove ? y <= T38_lc3_borderY : y >= T38_lc3_borderY);
				} else if(T38_lc3_vertical) {
					// nothing
				} else {
					if(T38_lc3_lastY == y - 1) {
						T38_lc3_borderX += T38_lc3_m;
						T38_lc3_lastY++;
					} else {
						T38_lc3_borderX = y*T38_lc3_m + T38_lc3_C;
						T38_lc3_lastY = y;
					}
				}
			}
		}

		if(T39_initializedWithValidData) {
			if(y < T39_miny || y > T39_maxy) {
				T39_okay = false;
			} else {
				T39_okay = true;
				if(T39_lc1_horizontal) {
					T39_lc1_cached = (T39_lc1_leftOrAbove ? y <= T39_lc1_borderY : y >= T39_lc1_borderY);
				} else if(T39_lc1_vertical) {
					// nothing
				} else {
					if(T39_lc1_lastY == y - 1) {
						T39_lc1_borderX += T39_lc1_m;
						T39_lc1_lastY++;
					} else {
						T39_lc1_borderX = y*T39_lc1_m + T39_lc1_C;
						T39_lc1_lastY = y;
					}
				}
				if(T39_lc2_horizontal) {
					T39_lc2_cached = (T39_lc2_leftOrAbove ? y <= T39_lc2_borderY : y >= T39_lc2_borderY);
				} else if(T39_lc2_vertical) {
					// nothing
				} else {
					if(T39_lc2_lastY == y - 1) {
						T39_lc2_borderX += T39_lc2_m;
						T39_lc2_lastY++;
					} else {
						T39_lc2_borderX = y*T39_lc2_m + T39_lc2_C;
						T39_lc2_lastY = y;
					}
				}
				if(T39_lc3_horizontal) {
					T39_lc3_cached = (T39_lc3_leftOrAbove ? y <= T39_lc3_borderY : y >= T39_lc3_borderY);
				} else if(T39_lc3_vertical) {
					// nothing
				} else {
					if(T39_lc3_lastY == y - 1) {
						T39_lc3_borderX += T39_lc3_m;
						T39_lc3_lastY++;
					} else {
						T39_lc3_borderX = y*T39_lc3_m + T39_lc3_C;
						T39_lc3_lastY = y;
					}
				}
			}
		}

		if(T40_initializedWithValidData) {
			if(y < T40_miny || y > T40_maxy) {
				T40_okay = false;
			} else {
				T40_okay = true;
				if(T40_lc1_horizontal) {
					T40_lc1_cached = (T40_lc1_leftOrAbove ? y <= T40_lc1_borderY : y >= T40_lc1_borderY);
				} else if(T40_lc1_vertical) {
					// nothing
				} else {
					if(T40_lc1_lastY == y - 1) {
						T40_lc1_borderX += T40_lc1_m;
						T40_lc1_lastY++;
					} else {
						T40_lc1_borderX = y*T40_lc1_m + T40_lc1_C;
						T40_lc1_lastY = y;
					}
				}
				if(T40_lc2_horizontal) {
					T40_lc2_cached = (T40_lc2_leftOrAbove ? y <= T40_lc2_borderY : y >= T40_lc2_borderY);
				} else if(T40_lc2_vertical) {
					// nothing
				} else {
					if(T40_lc2_lastY == y - 1) {
						T40_lc2_borderX += T40_lc2_m;
						T40_lc2_lastY++;
					} else {
						T40_lc2_borderX = y*T40_lc2_m + T40_lc2_C;
						T40_lc2_lastY = y;
					}
				}
				if(T40_lc3_horizontal) {
					T40_lc3_cached = (T40_lc3_leftOrAbove ? y <= T40_lc3_borderY : y >= T40_lc3_borderY);
				} else if(T40_lc3_vertical) {
					// nothing
				} else {
					if(T40_lc3_lastY == y - 1) {
						T40_lc3_borderX += T40_lc3_m;
						T40_lc3_lastY++;
					} else {
						T40_lc3_borderX = y*T40_lc3_m + T40_lc3_C;
						T40_lc3_lastY = y;
					}
				}
			}
		}

		if(T41_initializedWithValidData) {
			if(y < T41_miny || y > T41_maxy) {
				T41_okay = false;
			} else {
				T41_okay = true;
				if(T41_lc1_horizontal) {
					T41_lc1_cached = (T41_lc1_leftOrAbove ? y <= T41_lc1_borderY : y >= T41_lc1_borderY);
				} else if(T41_lc1_vertical) {
					// nothing
				} else {
					if(T41_lc1_lastY == y - 1) {
						T41_lc1_borderX += T41_lc1_m;
						T41_lc1_lastY++;
					} else {
						T41_lc1_borderX = y*T41_lc1_m + T41_lc1_C;
						T41_lc1_lastY = y;
					}
				}
				if(T41_lc2_horizontal) {
					T41_lc2_cached = (T41_lc2_leftOrAbove ? y <= T41_lc2_borderY : y >= T41_lc2_borderY);
				} else if(T41_lc2_vertical) {
					// nothing
				} else {
					if(T41_lc2_lastY == y - 1) {
						T41_lc2_borderX += T41_lc2_m;
						T41_lc2_lastY++;
					} else {
						T41_lc2_borderX = y*T41_lc2_m + T41_lc2_C;
						T41_lc2_lastY = y;
					}
				}
				if(T41_lc3_horizontal) {
					T41_lc3_cached = (T41_lc3_leftOrAbove ? y <= T41_lc3_borderY : y >= T41_lc3_borderY);
				} else if(T41_lc3_vertical) {
					// nothing
				} else {
					if(T41_lc3_lastY == y - 1) {
						T41_lc3_borderX += T41_lc3_m;
						T41_lc3_lastY++;
					} else {
						T41_lc3_borderX = y*T41_lc3_m + T41_lc3_C;
						T41_lc3_lastY = y;
					}
				}
			}
		}

		if(T42_initializedWithValidData) {
			if(y < T42_miny || y > T42_maxy) {
				T42_okay = false;
			} else {
				T42_okay = true;
				if(T42_lc1_horizontal) {
					T42_lc1_cached = (T42_lc1_leftOrAbove ? y <= T42_lc1_borderY : y >= T42_lc1_borderY);
				} else if(T42_lc1_vertical) {
					// nothing
				} else {
					if(T42_lc1_lastY == y - 1) {
						T42_lc1_borderX += T42_lc1_m;
						T42_lc1_lastY++;
					} else {
						T42_lc1_borderX = y*T42_lc1_m + T42_lc1_C;
						T42_lc1_lastY = y;
					}
				}
				if(T42_lc2_horizontal) {
					T42_lc2_cached = (T42_lc2_leftOrAbove ? y <= T42_lc2_borderY : y >= T42_lc2_borderY);
				} else if(T42_lc2_vertical) {
					// nothing
				} else {
					if(T42_lc2_lastY == y - 1) {
						T42_lc2_borderX += T42_lc2_m;
						T42_lc2_lastY++;
					} else {
						T42_lc2_borderX = y*T42_lc2_m + T42_lc2_C;
						T42_lc2_lastY = y;
					}
				}
				if(T42_lc3_horizontal) {
					T42_lc3_cached = (T42_lc3_leftOrAbove ? y <= T42_lc3_borderY : y >= T42_lc3_borderY);
				} else if(T42_lc3_vertical) {
					// nothing
				} else {
					if(T42_lc3_lastY == y - 1) {
						T42_lc3_borderX += T42_lc3_m;
						T42_lc3_lastY++;
					} else {
						T42_lc3_borderX = y*T42_lc3_m + T42_lc3_C;
						T42_lc3_lastY = y;
					}
				}
			}
		}

		if(T43_initializedWithValidData) {
			if(y < T43_miny || y > T43_maxy) {
				T43_okay = false;
			} else {
				T43_okay = true;
				if(T43_lc1_horizontal) {
					T43_lc1_cached = (T43_lc1_leftOrAbove ? y <= T43_lc1_borderY : y >= T43_lc1_borderY);
				} else if(T43_lc1_vertical) {
					// nothing
				} else {
					if(T43_lc1_lastY == y - 1) {
						T43_lc1_borderX += T43_lc1_m;
						T43_lc1_lastY++;
					} else {
						T43_lc1_borderX = y*T43_lc1_m + T43_lc1_C;
						T43_lc1_lastY = y;
					}
				}
				if(T43_lc2_horizontal) {
					T43_lc2_cached = (T43_lc2_leftOrAbove ? y <= T43_lc2_borderY : y >= T43_lc2_borderY);
				} else if(T43_lc2_vertical) {
					// nothing
				} else {
					if(T43_lc2_lastY == y - 1) {
						T43_lc2_borderX += T43_lc2_m;
						T43_lc2_lastY++;
					} else {
						T43_lc2_borderX = y*T43_lc2_m + T43_lc2_C;
						T43_lc2_lastY = y;
					}
				}
				if(T43_lc3_horizontal) {
					T43_lc3_cached = (T43_lc3_leftOrAbove ? y <= T43_lc3_borderY : y >= T43_lc3_borderY);
				} else if(T43_lc3_vertical) {
					// nothing
				} else {
					if(T43_lc3_lastY == y - 1) {
						T43_lc3_borderX += T43_lc3_m;
						T43_lc3_lastY++;
					} else {
						T43_lc3_borderX = y*T43_lc3_m + T43_lc3_C;
						T43_lc3_lastY = y;
					}
				}
			}
		}

		if(T44_initializedWithValidData) {
			if(y < T44_miny || y > T44_maxy) {
				T44_okay = false;
			} else {
				T44_okay = true;
				if(T44_lc1_horizontal) {
					T44_lc1_cached = (T44_lc1_leftOrAbove ? y <= T44_lc1_borderY : y >= T44_lc1_borderY);
				} else if(T44_lc1_vertical) {
					// nothing
				} else {
					if(T44_lc1_lastY == y - 1) {
						T44_lc1_borderX += T44_lc1_m;
						T44_lc1_lastY++;
					} else {
						T44_lc1_borderX = y*T44_lc1_m + T44_lc1_C;
						T44_lc1_lastY = y;
					}
				}
				if(T44_lc2_horizontal) {
					T44_lc2_cached = (T44_lc2_leftOrAbove ? y <= T44_lc2_borderY : y >= T44_lc2_borderY);
				} else if(T44_lc2_vertical) {
					// nothing
				} else {
					if(T44_lc2_lastY == y - 1) {
						T44_lc2_borderX += T44_lc2_m;
						T44_lc2_lastY++;
					} else {
						T44_lc2_borderX = y*T44_lc2_m + T44_lc2_C;
						T44_lc2_lastY = y;
					}
				}
				if(T44_lc3_horizontal) {
					T44_lc3_cached = (T44_lc3_leftOrAbove ? y <= T44_lc3_borderY : y >= T44_lc3_borderY);
				} else if(T44_lc3_vertical) {
					// nothing
				} else {
					if(T44_lc3_lastY == y - 1) {
						T44_lc3_borderX += T44_lc3_m;
						T44_lc3_lastY++;
					} else {
						T44_lc3_borderX = y*T44_lc3_m + T44_lc3_C;
						T44_lc3_lastY = y;
					}
				}
			}
		}

		if(T45_initializedWithValidData) {
			if(y < T45_miny || y > T45_maxy) {
				T45_okay = false;
			} else {
				T45_okay = true;
				if(T45_lc1_horizontal) {
					T45_lc1_cached = (T45_lc1_leftOrAbove ? y <= T45_lc1_borderY : y >= T45_lc1_borderY);
				} else if(T45_lc1_vertical) {
					// nothing
				} else {
					if(T45_lc1_lastY == y - 1) {
						T45_lc1_borderX += T45_lc1_m;
						T45_lc1_lastY++;
					} else {
						T45_lc1_borderX = y*T45_lc1_m + T45_lc1_C;
						T45_lc1_lastY = y;
					}
				}
				if(T45_lc2_horizontal) {
					T45_lc2_cached = (T45_lc2_leftOrAbove ? y <= T45_lc2_borderY : y >= T45_lc2_borderY);
				} else if(T45_lc2_vertical) {
					// nothing
				} else {
					if(T45_lc2_lastY == y - 1) {
						T45_lc2_borderX += T45_lc2_m;
						T45_lc2_lastY++;
					} else {
						T45_lc2_borderX = y*T45_lc2_m + T45_lc2_C;
						T45_lc2_lastY = y;
					}
				}
				if(T45_lc3_horizontal) {
					T45_lc3_cached = (T45_lc3_leftOrAbove ? y <= T45_lc3_borderY : y >= T45_lc3_borderY);
				} else if(T45_lc3_vertical) {
					// nothing
				} else {
					if(T45_lc3_lastY == y - 1) {
						T45_lc3_borderX += T45_lc3_m;
						T45_lc3_lastY++;
					} else {
						T45_lc3_borderX = y*T45_lc3_m + T45_lc3_C;
						T45_lc3_lastY = y;
					}
				}
			}
		}

		if(T46_initializedWithValidData) {
			if(y < T46_miny || y > T46_maxy) {
				T46_okay = false;
			} else {
				T46_okay = true;
				if(T46_lc1_horizontal) {
					T46_lc1_cached = (T46_lc1_leftOrAbove ? y <= T46_lc1_borderY : y >= T46_lc1_borderY);
				} else if(T46_lc1_vertical) {
					// nothing
				} else {
					if(T46_lc1_lastY == y - 1) {
						T46_lc1_borderX += T46_lc1_m;
						T46_lc1_lastY++;
					} else {
						T46_lc1_borderX = y*T46_lc1_m + T46_lc1_C;
						T46_lc1_lastY = y;
					}
				}
				if(T46_lc2_horizontal) {
					T46_lc2_cached = (T46_lc2_leftOrAbove ? y <= T46_lc2_borderY : y >= T46_lc2_borderY);
				} else if(T46_lc2_vertical) {
					// nothing
				} else {
					if(T46_lc2_lastY == y - 1) {
						T46_lc2_borderX += T46_lc2_m;
						T46_lc2_lastY++;
					} else {
						T46_lc2_borderX = y*T46_lc2_m + T46_lc2_C;
						T46_lc2_lastY = y;
					}
				}
				if(T46_lc3_horizontal) {
					T46_lc3_cached = (T46_lc3_leftOrAbove ? y <= T46_lc3_borderY : y >= T46_lc3_borderY);
				} else if(T46_lc3_vertical) {
					// nothing
				} else {
					if(T46_lc3_lastY == y - 1) {
						T46_lc3_borderX += T46_lc3_m;
						T46_lc3_lastY++;
					} else {
						T46_lc3_borderX = y*T46_lc3_m + T46_lc3_C;
						T46_lc3_lastY = y;
					}
				}
			}
		}

		if(T47_initializedWithValidData) {
			if(y < T47_miny || y > T47_maxy) {
				T47_okay = false;
			} else {
				T47_okay = true;
				if(T47_lc1_horizontal) {
					T47_lc1_cached = (T47_lc1_leftOrAbove ? y <= T47_lc1_borderY : y >= T47_lc1_borderY);
				} else if(T47_lc1_vertical) {
					// nothing
				} else {
					if(T47_lc1_lastY == y - 1) {
						T47_lc1_borderX += T47_lc1_m;
						T47_lc1_lastY++;
					} else {
						T47_lc1_borderX = y*T47_lc1_m + T47_lc1_C;
						T47_lc1_lastY = y;
					}
				}
				if(T47_lc2_horizontal) {
					T47_lc2_cached = (T47_lc2_leftOrAbove ? y <= T47_lc2_borderY : y >= T47_lc2_borderY);
				} else if(T47_lc2_vertical) {
					// nothing
				} else {
					if(T47_lc2_lastY == y - 1) {
						T47_lc2_borderX += T47_lc2_m;
						T47_lc2_lastY++;
					} else {
						T47_lc2_borderX = y*T47_lc2_m + T47_lc2_C;
						T47_lc2_lastY = y;
					}
				}
				if(T47_lc3_horizontal) {
					T47_lc3_cached = (T47_lc3_leftOrAbove ? y <= T47_lc3_borderY : y >= T47_lc3_borderY);
				} else if(T47_lc3_vertical) {
					// nothing
				} else {
					if(T47_lc3_lastY == y - 1) {
						T47_lc3_borderX += T47_lc3_m;
						T47_lc3_lastY++;
					} else {
						T47_lc3_borderX = y*T47_lc3_m + T47_lc3_C;
						T47_lc3_lastY = y;
					}
				}
			}
		}

		if(T48_initializedWithValidData) {
			if(y < T48_miny || y > T48_maxy) {
				T48_okay = false;
			} else {
				T48_okay = true;
				if(T48_lc1_horizontal) {
					T48_lc1_cached = (T48_lc1_leftOrAbove ? y <= T48_lc1_borderY : y >= T48_lc1_borderY);
				} else if(T48_lc1_vertical) {
					// nothing
				} else {
					if(T48_lc1_lastY == y - 1) {
						T48_lc1_borderX += T48_lc1_m;
						T48_lc1_lastY++;
					} else {
						T48_lc1_borderX = y*T48_lc1_m + T48_lc1_C;
						T48_lc1_lastY = y;
					}
				}
				if(T48_lc2_horizontal) {
					T48_lc2_cached = (T48_lc2_leftOrAbove ? y <= T48_lc2_borderY : y >= T48_lc2_borderY);
				} else if(T48_lc2_vertical) {
					// nothing
				} else {
					if(T48_lc2_lastY == y - 1) {
						T48_lc2_borderX += T48_lc2_m;
						T48_lc2_lastY++;
					} else {
						T48_lc2_borderX = y*T48_lc2_m + T48_lc2_C;
						T48_lc2_lastY = y;
					}
				}
				if(T48_lc3_horizontal) {
					T48_lc3_cached = (T48_lc3_leftOrAbove ? y <= T48_lc3_borderY : y >= T48_lc3_borderY);
				} else if(T48_lc3_vertical) {
					// nothing
				} else {
					if(T48_lc3_lastY == y - 1) {
						T48_lc3_borderX += T48_lc3_m;
						T48_lc3_lastY++;
					} else {
						T48_lc3_borderX = y*T48_lc3_m + T48_lc3_C;
						T48_lc3_lastY = y;
					}
				}
			}
		}

		if(T49_initializedWithValidData) {
			if(y < T49_miny || y > T49_maxy) {
				T49_okay = false;
			} else {
				T49_okay = true;
				if(T49_lc1_horizontal) {
					T49_lc1_cached = (T49_lc1_leftOrAbove ? y <= T49_lc1_borderY : y >= T49_lc1_borderY);
				} else if(T49_lc1_vertical) {
					// nothing
				} else {
					if(T49_lc1_lastY == y - 1) {
						T49_lc1_borderX += T49_lc1_m;
						T49_lc1_lastY++;
					} else {
						T49_lc1_borderX = y*T49_lc1_m + T49_lc1_C;
						T49_lc1_lastY = y;
					}
				}
				if(T49_lc2_horizontal) {
					T49_lc2_cached = (T49_lc2_leftOrAbove ? y <= T49_lc2_borderY : y >= T49_lc2_borderY);
				} else if(T49_lc2_vertical) {
					// nothing
				} else {
					if(T49_lc2_lastY == y - 1) {
						T49_lc2_borderX += T49_lc2_m;
						T49_lc2_lastY++;
					} else {
						T49_lc2_borderX = y*T49_lc2_m + T49_lc2_C;
						T49_lc2_lastY = y;
					}
				}
				if(T49_lc3_horizontal) {
					T49_lc3_cached = (T49_lc3_leftOrAbove ? y <= T49_lc3_borderY : y >= T49_lc3_borderY);
				} else if(T49_lc3_vertical) {
					// nothing
				} else {
					if(T49_lc3_lastY == y - 1) {
						T49_lc3_borderX += T49_lc3_m;
						T49_lc3_lastY++;
					} else {
						T49_lc3_borderX = y*T49_lc3_m + T49_lc3_C;
						T49_lc3_lastY = y;
					}
				}
			}
		}

		if(T50_initializedWithValidData) {
			if(y < T50_miny || y > T50_maxy) {
				T50_okay = false;
			} else {
				T50_okay = true;
				if(T50_lc1_horizontal) {
					T50_lc1_cached = (T50_lc1_leftOrAbove ? y <= T50_lc1_borderY : y >= T50_lc1_borderY);
				} else if(T50_lc1_vertical) {
					// nothing
				} else {
					if(T50_lc1_lastY == y - 1) {
						T50_lc1_borderX += T50_lc1_m;
						T50_lc1_lastY++;
					} else {
						T50_lc1_borderX = y*T50_lc1_m + T50_lc1_C;
						T50_lc1_lastY = y;
					}
				}
				if(T50_lc2_horizontal) {
					T50_lc2_cached = (T50_lc2_leftOrAbove ? y <= T50_lc2_borderY : y >= T50_lc2_borderY);
				} else if(T50_lc2_vertical) {
					// nothing
				} else {
					if(T50_lc2_lastY == y - 1) {
						T50_lc2_borderX += T50_lc2_m;
						T50_lc2_lastY++;
					} else {
						T50_lc2_borderX = y*T50_lc2_m + T50_lc2_C;
						T50_lc2_lastY = y;
					}
				}
				if(T50_lc3_horizontal) {
					T50_lc3_cached = (T50_lc3_leftOrAbove ? y <= T50_lc3_borderY : y >= T50_lc3_borderY);
				} else if(T50_lc3_vertical) {
					// nothing
				} else {
					if(T50_lc3_lastY == y - 1) {
						T50_lc3_borderX += T50_lc3_m;
						T50_lc3_lastY++;
					} else {
						T50_lc3_borderX = y*T50_lc3_m + T50_lc3_C;
						T50_lc3_lastY = y;
					}
				}
			}
		}

		if(T51_initializedWithValidData) {
			if(y < T51_miny || y > T51_maxy) {
				T51_okay = false;
			} else {
				T51_okay = true;
				if(T51_lc1_horizontal) {
					T51_lc1_cached = (T51_lc1_leftOrAbove ? y <= T51_lc1_borderY : y >= T51_lc1_borderY);
				} else if(T51_lc1_vertical) {
					// nothing
				} else {
					if(T51_lc1_lastY == y - 1) {
						T51_lc1_borderX += T51_lc1_m;
						T51_lc1_lastY++;
					} else {
						T51_lc1_borderX = y*T51_lc1_m + T51_lc1_C;
						T51_lc1_lastY = y;
					}
				}
				if(T51_lc2_horizontal) {
					T51_lc2_cached = (T51_lc2_leftOrAbove ? y <= T51_lc2_borderY : y >= T51_lc2_borderY);
				} else if(T51_lc2_vertical) {
					// nothing
				} else {
					if(T51_lc2_lastY == y - 1) {
						T51_lc2_borderX += T51_lc2_m;
						T51_lc2_lastY++;
					} else {
						T51_lc2_borderX = y*T51_lc2_m + T51_lc2_C;
						T51_lc2_lastY = y;
					}
				}
				if(T51_lc3_horizontal) {
					T51_lc3_cached = (T51_lc3_leftOrAbove ? y <= T51_lc3_borderY : y >= T51_lc3_borderY);
				} else if(T51_lc3_vertical) {
					// nothing
				} else {
					if(T51_lc3_lastY == y - 1) {
						T51_lc3_borderX += T51_lc3_m;
						T51_lc3_lastY++;
					} else {
						T51_lc3_borderX = y*T51_lc3_m + T51_lc3_C;
						T51_lc3_lastY = y;
					}
				}
			}
		}

		if(T52_initializedWithValidData) {
			if(y < T52_miny || y > T52_maxy) {
				T52_okay = false;
			} else {
				T52_okay = true;
				if(T52_lc1_horizontal) {
					T52_lc1_cached = (T52_lc1_leftOrAbove ? y <= T52_lc1_borderY : y >= T52_lc1_borderY);
				} else if(T52_lc1_vertical) {
					// nothing
				} else {
					if(T52_lc1_lastY == y - 1) {
						T52_lc1_borderX += T52_lc1_m;
						T52_lc1_lastY++;
					} else {
						T52_lc1_borderX = y*T52_lc1_m + T52_lc1_C;
						T52_lc1_lastY = y;
					}
				}
				if(T52_lc2_horizontal) {
					T52_lc2_cached = (T52_lc2_leftOrAbove ? y <= T52_lc2_borderY : y >= T52_lc2_borderY);
				} else if(T52_lc2_vertical) {
					// nothing
				} else {
					if(T52_lc2_lastY == y - 1) {
						T52_lc2_borderX += T52_lc2_m;
						T52_lc2_lastY++;
					} else {
						T52_lc2_borderX = y*T52_lc2_m + T52_lc2_C;
						T52_lc2_lastY = y;
					}
				}
				if(T52_lc3_horizontal) {
					T52_lc3_cached = (T52_lc3_leftOrAbove ? y <= T52_lc3_borderY : y >= T52_lc3_borderY);
				} else if(T52_lc3_vertical) {
					// nothing
				} else {
					if(T52_lc3_lastY == y - 1) {
						T52_lc3_borderX += T52_lc3_m;
						T52_lc3_lastY++;
					} else {
						T52_lc3_borderX = y*T52_lc3_m + T52_lc3_C;
						T52_lc3_lastY = y;
					}
				}
			}
		}

		if(T53_initializedWithValidData) {
			if(y < T53_miny || y > T53_maxy) {
				T53_okay = false;
			} else {
				T53_okay = true;
				if(T53_lc1_horizontal) {
					T53_lc1_cached = (T53_lc1_leftOrAbove ? y <= T53_lc1_borderY : y >= T53_lc1_borderY);
				} else if(T53_lc1_vertical) {
					// nothing
				} else {
					if(T53_lc1_lastY == y - 1) {
						T53_lc1_borderX += T53_lc1_m;
						T53_lc1_lastY++;
					} else {
						T53_lc1_borderX = y*T53_lc1_m + T53_lc1_C;
						T53_lc1_lastY = y;
					}
				}
				if(T53_lc2_horizontal) {
					T53_lc2_cached = (T53_lc2_leftOrAbove ? y <= T53_lc2_borderY : y >= T53_lc2_borderY);
				} else if(T53_lc2_vertical) {
					// nothing
				} else {
					if(T53_lc2_lastY == y - 1) {
						T53_lc2_borderX += T53_lc2_m;
						T53_lc2_lastY++;
					} else {
						T53_lc2_borderX = y*T53_lc2_m + T53_lc2_C;
						T53_lc2_lastY = y;
					}
				}
				if(T53_lc3_horizontal) {
					T53_lc3_cached = (T53_lc3_leftOrAbove ? y <= T53_lc3_borderY : y >= T53_lc3_borderY);
				} else if(T53_lc3_vertical) {
					// nothing
				} else {
					if(T53_lc3_lastY == y - 1) {
						T53_lc3_borderX += T53_lc3_m;
						T53_lc3_lastY++;
					} else {
						T53_lc3_borderX = y*T53_lc3_m + T53_lc3_C;
						T53_lc3_lastY = y;
					}
				}
			}
		}

		if(T54_initializedWithValidData) {
			if(y < T54_miny || y > T54_maxy) {
				T54_okay = false;
			} else {
				T54_okay = true;
				if(T54_lc1_horizontal) {
					T54_lc1_cached = (T54_lc1_leftOrAbove ? y <= T54_lc1_borderY : y >= T54_lc1_borderY);
				} else if(T54_lc1_vertical) {
					// nothing
				} else {
					if(T54_lc1_lastY == y - 1) {
						T54_lc1_borderX += T54_lc1_m;
						T54_lc1_lastY++;
					} else {
						T54_lc1_borderX = y*T54_lc1_m + T54_lc1_C;
						T54_lc1_lastY = y;
					}
				}
				if(T54_lc2_horizontal) {
					T54_lc2_cached = (T54_lc2_leftOrAbove ? y <= T54_lc2_borderY : y >= T54_lc2_borderY);
				} else if(T54_lc2_vertical) {
					// nothing
				} else {
					if(T54_lc2_lastY == y - 1) {
						T54_lc2_borderX += T54_lc2_m;
						T54_lc2_lastY++;
					} else {
						T54_lc2_borderX = y*T54_lc2_m + T54_lc2_C;
						T54_lc2_lastY = y;
					}
				}
				if(T54_lc3_horizontal) {
					T54_lc3_cached = (T54_lc3_leftOrAbove ? y <= T54_lc3_borderY : y >= T54_lc3_borderY);
				} else if(T54_lc3_vertical) {
					// nothing
				} else {
					if(T54_lc3_lastY == y - 1) {
						T54_lc3_borderX += T54_lc3_m;
						T54_lc3_lastY++;
					} else {
						T54_lc3_borderX = y*T54_lc3_m + T54_lc3_C;
						T54_lc3_lastY = y;
					}
				}
			}
		}

		if(T55_initializedWithValidData) {
			if(y < T55_miny || y > T55_maxy) {
				T55_okay = false;
			} else {
				T55_okay = true;
				if(T55_lc1_horizontal) {
					T55_lc1_cached = (T55_lc1_leftOrAbove ? y <= T55_lc1_borderY : y >= T55_lc1_borderY);
				} else if(T55_lc1_vertical) {
					// nothing
				} else {
					if(T55_lc1_lastY == y - 1) {
						T55_lc1_borderX += T55_lc1_m;
						T55_lc1_lastY++;
					} else {
						T55_lc1_borderX = y*T55_lc1_m + T55_lc1_C;
						T55_lc1_lastY = y;
					}
				}
				if(T55_lc2_horizontal) {
					T55_lc2_cached = (T55_lc2_leftOrAbove ? y <= T55_lc2_borderY : y >= T55_lc2_borderY);
				} else if(T55_lc2_vertical) {
					// nothing
				} else {
					if(T55_lc2_lastY == y - 1) {
						T55_lc2_borderX += T55_lc2_m;
						T55_lc2_lastY++;
					} else {
						T55_lc2_borderX = y*T55_lc2_m + T55_lc2_C;
						T55_lc2_lastY = y;
					}
				}
				if(T55_lc3_horizontal) {
					T55_lc3_cached = (T55_lc3_leftOrAbove ? y <= T55_lc3_borderY : y >= T55_lc3_borderY);
				} else if(T55_lc3_vertical) {
					// nothing
				} else {
					if(T55_lc3_lastY == y - 1) {
						T55_lc3_borderX += T55_lc3_m;
						T55_lc3_lastY++;
					} else {
						T55_lc3_borderX = y*T55_lc3_m + T55_lc3_C;
						T55_lc3_lastY = y;
					}
				}
			}
		}

		if(T56_initializedWithValidData) {
			if(y < T56_miny || y > T56_maxy) {
				T56_okay = false;
			} else {
				T56_okay = true;
				if(T56_lc1_horizontal) {
					T56_lc1_cached = (T56_lc1_leftOrAbove ? y <= T56_lc1_borderY : y >= T56_lc1_borderY);
				} else if(T56_lc1_vertical) {
					// nothing
				} else {
					if(T56_lc1_lastY == y - 1) {
						T56_lc1_borderX += T56_lc1_m;
						T56_lc1_lastY++;
					} else {
						T56_lc1_borderX = y*T56_lc1_m + T56_lc1_C;
						T56_lc1_lastY = y;
					}
				}
				if(T56_lc2_horizontal) {
					T56_lc2_cached = (T56_lc2_leftOrAbove ? y <= T56_lc2_borderY : y >= T56_lc2_borderY);
				} else if(T56_lc2_vertical) {
					// nothing
				} else {
					if(T56_lc2_lastY == y - 1) {
						T56_lc2_borderX += T56_lc2_m;
						T56_lc2_lastY++;
					} else {
						T56_lc2_borderX = y*T56_lc2_m + T56_lc2_C;
						T56_lc2_lastY = y;
					}
				}
				if(T56_lc3_horizontal) {
					T56_lc3_cached = (T56_lc3_leftOrAbove ? y <= T56_lc3_borderY : y >= T56_lc3_borderY);
				} else if(T56_lc3_vertical) {
					// nothing
				} else {
					if(T56_lc3_lastY == y - 1) {
						T56_lc3_borderX += T56_lc3_m;
						T56_lc3_lastY++;
					} else {
						T56_lc3_borderX = y*T56_lc3_m + T56_lc3_C;
						T56_lc3_lastY = y;
					}
				}
			}
		}

		if(T57_initializedWithValidData) {
			if(y < T57_miny || y > T57_maxy) {
				T57_okay = false;
			} else {
				T57_okay = true;
				if(T57_lc1_horizontal) {
					T57_lc1_cached = (T57_lc1_leftOrAbove ? y <= T57_lc1_borderY : y >= T57_lc1_borderY);
				} else if(T57_lc1_vertical) {
					// nothing
				} else {
					if(T57_lc1_lastY == y - 1) {
						T57_lc1_borderX += T57_lc1_m;
						T57_lc1_lastY++;
					} else {
						T57_lc1_borderX = y*T57_lc1_m + T57_lc1_C;
						T57_lc1_lastY = y;
					}
				}
				if(T57_lc2_horizontal) {
					T57_lc2_cached = (T57_lc2_leftOrAbove ? y <= T57_lc2_borderY : y >= T57_lc2_borderY);
				} else if(T57_lc2_vertical) {
					// nothing
				} else {
					if(T57_lc2_lastY == y - 1) {
						T57_lc2_borderX += T57_lc2_m;
						T57_lc2_lastY++;
					} else {
						T57_lc2_borderX = y*T57_lc2_m + T57_lc2_C;
						T57_lc2_lastY = y;
					}
				}
				if(T57_lc3_horizontal) {
					T57_lc3_cached = (T57_lc3_leftOrAbove ? y <= T57_lc3_borderY : y >= T57_lc3_borderY);
				} else if(T57_lc3_vertical) {
					// nothing
				} else {
					if(T57_lc3_lastY == y - 1) {
						T57_lc3_borderX += T57_lc3_m;
						T57_lc3_lastY++;
					} else {
						T57_lc3_borderX = y*T57_lc3_m + T57_lc3_C;
						T57_lc3_lastY = y;
					}
				}
			}
		}

		if(T58_initializedWithValidData) {
			if(y < T58_miny || y > T58_maxy) {
				T58_okay = false;
			} else {
				T58_okay = true;
				if(T58_lc1_horizontal) {
					T58_lc1_cached = (T58_lc1_leftOrAbove ? y <= T58_lc1_borderY : y >= T58_lc1_borderY);
				} else if(T58_lc1_vertical) {
					// nothing
				} else {
					if(T58_lc1_lastY == y - 1) {
						T58_lc1_borderX += T58_lc1_m;
						T58_lc1_lastY++;
					} else {
						T58_lc1_borderX = y*T58_lc1_m + T58_lc1_C;
						T58_lc1_lastY = y;
					}
				}
				if(T58_lc2_horizontal) {
					T58_lc2_cached = (T58_lc2_leftOrAbove ? y <= T58_lc2_borderY : y >= T58_lc2_borderY);
				} else if(T58_lc2_vertical) {
					// nothing
				} else {
					if(T58_lc2_lastY == y - 1) {
						T58_lc2_borderX += T58_lc2_m;
						T58_lc2_lastY++;
					} else {
						T58_lc2_borderX = y*T58_lc2_m + T58_lc2_C;
						T58_lc2_lastY = y;
					}
				}
				if(T58_lc3_horizontal) {
					T58_lc3_cached = (T58_lc3_leftOrAbove ? y <= T58_lc3_borderY : y >= T58_lc3_borderY);
				} else if(T58_lc3_vertical) {
					// nothing
				} else {
					if(T58_lc3_lastY == y - 1) {
						T58_lc3_borderX += T58_lc3_m;
						T58_lc3_lastY++;
					} else {
						T58_lc3_borderX = y*T58_lc3_m + T58_lc3_C;
						T58_lc3_lastY = y;
					}
				}
			}
		}

		if(T59_initializedWithValidData) {
			if(y < T59_miny || y > T59_maxy) {
				T59_okay = false;
			} else {
				T59_okay = true;
				if(T59_lc1_horizontal) {
					T59_lc1_cached = (T59_lc1_leftOrAbove ? y <= T59_lc1_borderY : y >= T59_lc1_borderY);
				} else if(T59_lc1_vertical) {
					// nothing
				} else {
					if(T59_lc1_lastY == y - 1) {
						T59_lc1_borderX += T59_lc1_m;
						T59_lc1_lastY++;
					} else {
						T59_lc1_borderX = y*T59_lc1_m + T59_lc1_C;
						T59_lc1_lastY = y;
					}
				}
				if(T59_lc2_horizontal) {
					T59_lc2_cached = (T59_lc2_leftOrAbove ? y <= T59_lc2_borderY : y >= T59_lc2_borderY);
				} else if(T59_lc2_vertical) {
					// nothing
				} else {
					if(T59_lc2_lastY == y - 1) {
						T59_lc2_borderX += T59_lc2_m;
						T59_lc2_lastY++;
					} else {
						T59_lc2_borderX = y*T59_lc2_m + T59_lc2_C;
						T59_lc2_lastY = y;
					}
				}
				if(T59_lc3_horizontal) {
					T59_lc3_cached = (T59_lc3_leftOrAbove ? y <= T59_lc3_borderY : y >= T59_lc3_borderY);
				} else if(T59_lc3_vertical) {
					// nothing
				} else {
					if(T59_lc3_lastY == y - 1) {
						T59_lc3_borderX += T59_lc3_m;
						T59_lc3_lastY++;
					} else {
						T59_lc3_borderX = y*T59_lc3_m + T59_lc3_C;
						T59_lc3_lastY = y;
					}
				}
			}
		}
	}

	public void moveToY3(int y) {

		if(T60_initializedWithValidData) {
			if(y < T60_miny || y > T60_maxy) {
				T60_okay = false;
			} else {
				T60_okay = true;
				if(T60_lc1_horizontal) {
					T60_lc1_cached = (T60_lc1_leftOrAbove ? y <= T60_lc1_borderY : y >= T60_lc1_borderY);
				} else if(T60_lc1_vertical) {
					// nothing
				} else {
					if(T60_lc1_lastY == y - 1) {
						T60_lc1_borderX += T60_lc1_m;
						T60_lc1_lastY++;
					} else {
						T60_lc1_borderX = y*T60_lc1_m + T60_lc1_C;
						T60_lc1_lastY = y;
					}
				}
				if(T60_lc2_horizontal) {
					T60_lc2_cached = (T60_lc2_leftOrAbove ? y <= T60_lc2_borderY : y >= T60_lc2_borderY);
				} else if(T60_lc2_vertical) {
					// nothing
				} else {
					if(T60_lc2_lastY == y - 1) {
						T60_lc2_borderX += T60_lc2_m;
						T60_lc2_lastY++;
					} else {
						T60_lc2_borderX = y*T60_lc2_m + T60_lc2_C;
						T60_lc2_lastY = y;
					}
				}
				if(T60_lc3_horizontal) {
					T60_lc3_cached = (T60_lc3_leftOrAbove ? y <= T60_lc3_borderY : y >= T60_lc3_borderY);
				} else if(T60_lc3_vertical) {
					// nothing
				} else {
					if(T60_lc3_lastY == y - 1) {
						T60_lc3_borderX += T60_lc3_m;
						T60_lc3_lastY++;
					} else {
						T60_lc3_borderX = y*T60_lc3_m + T60_lc3_C;
						T60_lc3_lastY = y;
					}
				}
			}
		}

		if(T61_initializedWithValidData) {
			if(y < T61_miny || y > T61_maxy) {
				T61_okay = false;
			} else {
				T61_okay = true;
				if(T61_lc1_horizontal) {
					T61_lc1_cached = (T61_lc1_leftOrAbove ? y <= T61_lc1_borderY : y >= T61_lc1_borderY);
				} else if(T61_lc1_vertical) {
					// nothing
				} else {
					if(T61_lc1_lastY == y - 1) {
						T61_lc1_borderX += T61_lc1_m;
						T61_lc1_lastY++;
					} else {
						T61_lc1_borderX = y*T61_lc1_m + T61_lc1_C;
						T61_lc1_lastY = y;
					}
				}
				if(T61_lc2_horizontal) {
					T61_lc2_cached = (T61_lc2_leftOrAbove ? y <= T61_lc2_borderY : y >= T61_lc2_borderY);
				} else if(T61_lc2_vertical) {
					// nothing
				} else {
					if(T61_lc2_lastY == y - 1) {
						T61_lc2_borderX += T61_lc2_m;
						T61_lc2_lastY++;
					} else {
						T61_lc2_borderX = y*T61_lc2_m + T61_lc2_C;
						T61_lc2_lastY = y;
					}
				}
				if(T61_lc3_horizontal) {
					T61_lc3_cached = (T61_lc3_leftOrAbove ? y <= T61_lc3_borderY : y >= T61_lc3_borderY);
				} else if(T61_lc3_vertical) {
					// nothing
				} else {
					if(T61_lc3_lastY == y - 1) {
						T61_lc3_borderX += T61_lc3_m;
						T61_lc3_lastY++;
					} else {
						T61_lc3_borderX = y*T61_lc3_m + T61_lc3_C;
						T61_lc3_lastY = y;
					}
				}
			}
		}

		if(T62_initializedWithValidData) {
			if(y < T62_miny || y > T62_maxy) {
				T62_okay = false;
			} else {
				T62_okay = true;
				if(T62_lc1_horizontal) {
					T62_lc1_cached = (T62_lc1_leftOrAbove ? y <= T62_lc1_borderY : y >= T62_lc1_borderY);
				} else if(T62_lc1_vertical) {
					// nothing
				} else {
					if(T62_lc1_lastY == y - 1) {
						T62_lc1_borderX += T62_lc1_m;
						T62_lc1_lastY++;
					} else {
						T62_lc1_borderX = y*T62_lc1_m + T62_lc1_C;
						T62_lc1_lastY = y;
					}
				}
				if(T62_lc2_horizontal) {
					T62_lc2_cached = (T62_lc2_leftOrAbove ? y <= T62_lc2_borderY : y >= T62_lc2_borderY);
				} else if(T62_lc2_vertical) {
					// nothing
				} else {
					if(T62_lc2_lastY == y - 1) {
						T62_lc2_borderX += T62_lc2_m;
						T62_lc2_lastY++;
					} else {
						T62_lc2_borderX = y*T62_lc2_m + T62_lc2_C;
						T62_lc2_lastY = y;
					}
				}
				if(T62_lc3_horizontal) {
					T62_lc3_cached = (T62_lc3_leftOrAbove ? y <= T62_lc3_borderY : y >= T62_lc3_borderY);
				} else if(T62_lc3_vertical) {
					// nothing
				} else {
					if(T62_lc3_lastY == y - 1) {
						T62_lc3_borderX += T62_lc3_m;
						T62_lc3_lastY++;
					} else {
						T62_lc3_borderX = y*T62_lc3_m + T62_lc3_C;
						T62_lc3_lastY = y;
					}
				}
			}
		}

		if(T63_initializedWithValidData) {
			if(y < T63_miny || y > T63_maxy) {
				T63_okay = false;
			} else {
				T63_okay = true;
				if(T63_lc1_horizontal) {
					T63_lc1_cached = (T63_lc1_leftOrAbove ? y <= T63_lc1_borderY : y >= T63_lc1_borderY);
				} else if(T63_lc1_vertical) {
					// nothing
				} else {
					if(T63_lc1_lastY == y - 1) {
						T63_lc1_borderX += T63_lc1_m;
						T63_lc1_lastY++;
					} else {
						T63_lc1_borderX = y*T63_lc1_m + T63_lc1_C;
						T63_lc1_lastY = y;
					}
				}
				if(T63_lc2_horizontal) {
					T63_lc2_cached = (T63_lc2_leftOrAbove ? y <= T63_lc2_borderY : y >= T63_lc2_borderY);
				} else if(T63_lc2_vertical) {
					// nothing
				} else {
					if(T63_lc2_lastY == y - 1) {
						T63_lc2_borderX += T63_lc2_m;
						T63_lc2_lastY++;
					} else {
						T63_lc2_borderX = y*T63_lc2_m + T63_lc2_C;
						T63_lc2_lastY = y;
					}
				}
				if(T63_lc3_horizontal) {
					T63_lc3_cached = (T63_lc3_leftOrAbove ? y <= T63_lc3_borderY : y >= T63_lc3_borderY);
				} else if(T63_lc3_vertical) {
					// nothing
				} else {
					if(T63_lc3_lastY == y - 1) {
						T63_lc3_borderX += T63_lc3_m;
						T63_lc3_lastY++;
					} else {
						T63_lc3_borderX = y*T63_lc3_m + T63_lc3_C;
						T63_lc3_lastY = y;
					}
				}
			}
		}

		if(T64_initializedWithValidData) {
			if(y < T64_miny || y > T64_maxy) {
				T64_okay = false;
			} else {
				T64_okay = true;
				if(T64_lc1_horizontal) {
					T64_lc1_cached = (T64_lc1_leftOrAbove ? y <= T64_lc1_borderY : y >= T64_lc1_borderY);
				} else if(T64_lc1_vertical) {
					// nothing
				} else {
					if(T64_lc1_lastY == y - 1) {
						T64_lc1_borderX += T64_lc1_m;
						T64_lc1_lastY++;
					} else {
						T64_lc1_borderX = y*T64_lc1_m + T64_lc1_C;
						T64_lc1_lastY = y;
					}
				}
				if(T64_lc2_horizontal) {
					T64_lc2_cached = (T64_lc2_leftOrAbove ? y <= T64_lc2_borderY : y >= T64_lc2_borderY);
				} else if(T64_lc2_vertical) {
					// nothing
				} else {
					if(T64_lc2_lastY == y - 1) {
						T64_lc2_borderX += T64_lc2_m;
						T64_lc2_lastY++;
					} else {
						T64_lc2_borderX = y*T64_lc2_m + T64_lc2_C;
						T64_lc2_lastY = y;
					}
				}
				if(T64_lc3_horizontal) {
					T64_lc3_cached = (T64_lc3_leftOrAbove ? y <= T64_lc3_borderY : y >= T64_lc3_borderY);
				} else if(T64_lc3_vertical) {
					// nothing
				} else {
					if(T64_lc3_lastY == y - 1) {
						T64_lc3_borderX += T64_lc3_m;
						T64_lc3_lastY++;
					} else {
						T64_lc3_borderX = y*T64_lc3_m + T64_lc3_C;
						T64_lc3_lastY = y;
					}
				}
			}
		}

		if(T65_initializedWithValidData) {
			if(y < T65_miny || y > T65_maxy) {
				T65_okay = false;
			} else {
				T65_okay = true;
				if(T65_lc1_horizontal) {
					T65_lc1_cached = (T65_lc1_leftOrAbove ? y <= T65_lc1_borderY : y >= T65_lc1_borderY);
				} else if(T65_lc1_vertical) {
					// nothing
				} else {
					if(T65_lc1_lastY == y - 1) {
						T65_lc1_borderX += T65_lc1_m;
						T65_lc1_lastY++;
					} else {
						T65_lc1_borderX = y*T65_lc1_m + T65_lc1_C;
						T65_lc1_lastY = y;
					}
				}
				if(T65_lc2_horizontal) {
					T65_lc2_cached = (T65_lc2_leftOrAbove ? y <= T65_lc2_borderY : y >= T65_lc2_borderY);
				} else if(T65_lc2_vertical) {
					// nothing
				} else {
					if(T65_lc2_lastY == y - 1) {
						T65_lc2_borderX += T65_lc2_m;
						T65_lc2_lastY++;
					} else {
						T65_lc2_borderX = y*T65_lc2_m + T65_lc2_C;
						T65_lc2_lastY = y;
					}
				}
				if(T65_lc3_horizontal) {
					T65_lc3_cached = (T65_lc3_leftOrAbove ? y <= T65_lc3_borderY : y >= T65_lc3_borderY);
				} else if(T65_lc3_vertical) {
					// nothing
				} else {
					if(T65_lc3_lastY == y - 1) {
						T65_lc3_borderX += T65_lc3_m;
						T65_lc3_lastY++;
					} else {
						T65_lc3_borderX = y*T65_lc3_m + T65_lc3_C;
						T65_lc3_lastY = y;
					}
				}
			}
		}

		if(T66_initializedWithValidData) {
			if(y < T66_miny || y > T66_maxy) {
				T66_okay = false;
			} else {
				T66_okay = true;
				if(T66_lc1_horizontal) {
					T66_lc1_cached = (T66_lc1_leftOrAbove ? y <= T66_lc1_borderY : y >= T66_lc1_borderY);
				} else if(T66_lc1_vertical) {
					// nothing
				} else {
					if(T66_lc1_lastY == y - 1) {
						T66_lc1_borderX += T66_lc1_m;
						T66_lc1_lastY++;
					} else {
						T66_lc1_borderX = y*T66_lc1_m + T66_lc1_C;
						T66_lc1_lastY = y;
					}
				}
				if(T66_lc2_horizontal) {
					T66_lc2_cached = (T66_lc2_leftOrAbove ? y <= T66_lc2_borderY : y >= T66_lc2_borderY);
				} else if(T66_lc2_vertical) {
					// nothing
				} else {
					if(T66_lc2_lastY == y - 1) {
						T66_lc2_borderX += T66_lc2_m;
						T66_lc2_lastY++;
					} else {
						T66_lc2_borderX = y*T66_lc2_m + T66_lc2_C;
						T66_lc2_lastY = y;
					}
				}
				if(T66_lc3_horizontal) {
					T66_lc3_cached = (T66_lc3_leftOrAbove ? y <= T66_lc3_borderY : y >= T66_lc3_borderY);
				} else if(T66_lc3_vertical) {
					// nothing
				} else {
					if(T66_lc3_lastY == y - 1) {
						T66_lc3_borderX += T66_lc3_m;
						T66_lc3_lastY++;
					} else {
						T66_lc3_borderX = y*T66_lc3_m + T66_lc3_C;
						T66_lc3_lastY = y;
					}
				}
			}
		}

		if(T67_initializedWithValidData) {
			if(y < T67_miny || y > T67_maxy) {
				T67_okay = false;
			} else {
				T67_okay = true;
				if(T67_lc1_horizontal) {
					T67_lc1_cached = (T67_lc1_leftOrAbove ? y <= T67_lc1_borderY : y >= T67_lc1_borderY);
				} else if(T67_lc1_vertical) {
					// nothing
				} else {
					if(T67_lc1_lastY == y - 1) {
						T67_lc1_borderX += T67_lc1_m;
						T67_lc1_lastY++;
					} else {
						T67_lc1_borderX = y*T67_lc1_m + T67_lc1_C;
						T67_lc1_lastY = y;
					}
				}
				if(T67_lc2_horizontal) {
					T67_lc2_cached = (T67_lc2_leftOrAbove ? y <= T67_lc2_borderY : y >= T67_lc2_borderY);
				} else if(T67_lc2_vertical) {
					// nothing
				} else {
					if(T67_lc2_lastY == y - 1) {
						T67_lc2_borderX += T67_lc2_m;
						T67_lc2_lastY++;
					} else {
						T67_lc2_borderX = y*T67_lc2_m + T67_lc2_C;
						T67_lc2_lastY = y;
					}
				}
				if(T67_lc3_horizontal) {
					T67_lc3_cached = (T67_lc3_leftOrAbove ? y <= T67_lc3_borderY : y >= T67_lc3_borderY);
				} else if(T67_lc3_vertical) {
					// nothing
				} else {
					if(T67_lc3_lastY == y - 1) {
						T67_lc3_borderX += T67_lc3_m;
						T67_lc3_lastY++;
					} else {
						T67_lc3_borderX = y*T67_lc3_m + T67_lc3_C;
						T67_lc3_lastY = y;
					}
				}
			}
		}

		if(T68_initializedWithValidData) {
			if(y < T68_miny || y > T68_maxy) {
				T68_okay = false;
			} else {
				T68_okay = true;
				if(T68_lc1_horizontal) {
					T68_lc1_cached = (T68_lc1_leftOrAbove ? y <= T68_lc1_borderY : y >= T68_lc1_borderY);
				} else if(T68_lc1_vertical) {
					// nothing
				} else {
					if(T68_lc1_lastY == y - 1) {
						T68_lc1_borderX += T68_lc1_m;
						T68_lc1_lastY++;
					} else {
						T68_lc1_borderX = y*T68_lc1_m + T68_lc1_C;
						T68_lc1_lastY = y;
					}
				}
				if(T68_lc2_horizontal) {
					T68_lc2_cached = (T68_lc2_leftOrAbove ? y <= T68_lc2_borderY : y >= T68_lc2_borderY);
				} else if(T68_lc2_vertical) {
					// nothing
				} else {
					if(T68_lc2_lastY == y - 1) {
						T68_lc2_borderX += T68_lc2_m;
						T68_lc2_lastY++;
					} else {
						T68_lc2_borderX = y*T68_lc2_m + T68_lc2_C;
						T68_lc2_lastY = y;
					}
				}
				if(T68_lc3_horizontal) {
					T68_lc3_cached = (T68_lc3_leftOrAbove ? y <= T68_lc3_borderY : y >= T68_lc3_borderY);
				} else if(T68_lc3_vertical) {
					// nothing
				} else {
					if(T68_lc3_lastY == y - 1) {
						T68_lc3_borderX += T68_lc3_m;
						T68_lc3_lastY++;
					} else {
						T68_lc3_borderX = y*T68_lc3_m + T68_lc3_C;
						T68_lc3_lastY = y;
					}
				}
			}
		}

		if(T69_initializedWithValidData) {
			if(y < T69_miny || y > T69_maxy) {
				T69_okay = false;
			} else {
				T69_okay = true;
				if(T69_lc1_horizontal) {
					T69_lc1_cached = (T69_lc1_leftOrAbove ? y <= T69_lc1_borderY : y >= T69_lc1_borderY);
				} else if(T69_lc1_vertical) {
					// nothing
				} else {
					if(T69_lc1_lastY == y - 1) {
						T69_lc1_borderX += T69_lc1_m;
						T69_lc1_lastY++;
					} else {
						T69_lc1_borderX = y*T69_lc1_m + T69_lc1_C;
						T69_lc1_lastY = y;
					}
				}
				if(T69_lc2_horizontal) {
					T69_lc2_cached = (T69_lc2_leftOrAbove ? y <= T69_lc2_borderY : y >= T69_lc2_borderY);
				} else if(T69_lc2_vertical) {
					// nothing
				} else {
					if(T69_lc2_lastY == y - 1) {
						T69_lc2_borderX += T69_lc2_m;
						T69_lc2_lastY++;
					} else {
						T69_lc2_borderX = y*T69_lc2_m + T69_lc2_C;
						T69_lc2_lastY = y;
					}
				}
				if(T69_lc3_horizontal) {
					T69_lc3_cached = (T69_lc3_leftOrAbove ? y <= T69_lc3_borderY : y >= T69_lc3_borderY);
				} else if(T69_lc3_vertical) {
					// nothing
				} else {
					if(T69_lc3_lastY == y - 1) {
						T69_lc3_borderX += T69_lc3_m;
						T69_lc3_lastY++;
					} else {
						T69_lc3_borderX = y*T69_lc3_m + T69_lc3_C;
						T69_lc3_lastY = y;
					}
				}
			}
		}

		if(T70_initializedWithValidData) {
			if(y < T70_miny || y > T70_maxy) {
				T70_okay = false;
			} else {
				T70_okay = true;
				if(T70_lc1_horizontal) {
					T70_lc1_cached = (T70_lc1_leftOrAbove ? y <= T70_lc1_borderY : y >= T70_lc1_borderY);
				} else if(T70_lc1_vertical) {
					// nothing
				} else {
					if(T70_lc1_lastY == y - 1) {
						T70_lc1_borderX += T70_lc1_m;
						T70_lc1_lastY++;
					} else {
						T70_lc1_borderX = y*T70_lc1_m + T70_lc1_C;
						T70_lc1_lastY = y;
					}
				}
				if(T70_lc2_horizontal) {
					T70_lc2_cached = (T70_lc2_leftOrAbove ? y <= T70_lc2_borderY : y >= T70_lc2_borderY);
				} else if(T70_lc2_vertical) {
					// nothing
				} else {
					if(T70_lc2_lastY == y - 1) {
						T70_lc2_borderX += T70_lc2_m;
						T70_lc2_lastY++;
					} else {
						T70_lc2_borderX = y*T70_lc2_m + T70_lc2_C;
						T70_lc2_lastY = y;
					}
				}
				if(T70_lc3_horizontal) {
					T70_lc3_cached = (T70_lc3_leftOrAbove ? y <= T70_lc3_borderY : y >= T70_lc3_borderY);
				} else if(T70_lc3_vertical) {
					// nothing
				} else {
					if(T70_lc3_lastY == y - 1) {
						T70_lc3_borderX += T70_lc3_m;
						T70_lc3_lastY++;
					} else {
						T70_lc3_borderX = y*T70_lc3_m + T70_lc3_C;
						T70_lc3_lastY = y;
					}
				}
			}
		}

		if(T71_initializedWithValidData) {
			if(y < T71_miny || y > T71_maxy) {
				T71_okay = false;
			} else {
				T71_okay = true;
				if(T71_lc1_horizontal) {
					T71_lc1_cached = (T71_lc1_leftOrAbove ? y <= T71_lc1_borderY : y >= T71_lc1_borderY);
				} else if(T71_lc1_vertical) {
					// nothing
				} else {
					if(T71_lc1_lastY == y - 1) {
						T71_lc1_borderX += T71_lc1_m;
						T71_lc1_lastY++;
					} else {
						T71_lc1_borderX = y*T71_lc1_m + T71_lc1_C;
						T71_lc1_lastY = y;
					}
				}
				if(T71_lc2_horizontal) {
					T71_lc2_cached = (T71_lc2_leftOrAbove ? y <= T71_lc2_borderY : y >= T71_lc2_borderY);
				} else if(T71_lc2_vertical) {
					// nothing
				} else {
					if(T71_lc2_lastY == y - 1) {
						T71_lc2_borderX += T71_lc2_m;
						T71_lc2_lastY++;
					} else {
						T71_lc2_borderX = y*T71_lc2_m + T71_lc2_C;
						T71_lc2_lastY = y;
					}
				}
				if(T71_lc3_horizontal) {
					T71_lc3_cached = (T71_lc3_leftOrAbove ? y <= T71_lc3_borderY : y >= T71_lc3_borderY);
				} else if(T71_lc3_vertical) {
					// nothing
				} else {
					if(T71_lc3_lastY == y - 1) {
						T71_lc3_borderX += T71_lc3_m;
						T71_lc3_lastY++;
					} else {
						T71_lc3_borderX = y*T71_lc3_m + T71_lc3_C;
						T71_lc3_lastY = y;
					}
				}
			}
		}

		if(T72_initializedWithValidData) {
			if(y < T72_miny || y > T72_maxy) {
				T72_okay = false;
			} else {
				T72_okay = true;
				if(T72_lc1_horizontal) {
					T72_lc1_cached = (T72_lc1_leftOrAbove ? y <= T72_lc1_borderY : y >= T72_lc1_borderY);
				} else if(T72_lc1_vertical) {
					// nothing
				} else {
					if(T72_lc1_lastY == y - 1) {
						T72_lc1_borderX += T72_lc1_m;
						T72_lc1_lastY++;
					} else {
						T72_lc1_borderX = y*T72_lc1_m + T72_lc1_C;
						T72_lc1_lastY = y;
					}
				}
				if(T72_lc2_horizontal) {
					T72_lc2_cached = (T72_lc2_leftOrAbove ? y <= T72_lc2_borderY : y >= T72_lc2_borderY);
				} else if(T72_lc2_vertical) {
					// nothing
				} else {
					if(T72_lc2_lastY == y - 1) {
						T72_lc2_borderX += T72_lc2_m;
						T72_lc2_lastY++;
					} else {
						T72_lc2_borderX = y*T72_lc2_m + T72_lc2_C;
						T72_lc2_lastY = y;
					}
				}
				if(T72_lc3_horizontal) {
					T72_lc3_cached = (T72_lc3_leftOrAbove ? y <= T72_lc3_borderY : y >= T72_lc3_borderY);
				} else if(T72_lc3_vertical) {
					// nothing
				} else {
					if(T72_lc3_lastY == y - 1) {
						T72_lc3_borderX += T72_lc3_m;
						T72_lc3_lastY++;
					} else {
						T72_lc3_borderX = y*T72_lc3_m + T72_lc3_C;
						T72_lc3_lastY = y;
					}
				}
			}
		}

		if(T73_initializedWithValidData) {
			if(y < T73_miny || y > T73_maxy) {
				T73_okay = false;
			} else {
				T73_okay = true;
				if(T73_lc1_horizontal) {
					T73_lc1_cached = (T73_lc1_leftOrAbove ? y <= T73_lc1_borderY : y >= T73_lc1_borderY);
				} else if(T73_lc1_vertical) {
					// nothing
				} else {
					if(T73_lc1_lastY == y - 1) {
						T73_lc1_borderX += T73_lc1_m;
						T73_lc1_lastY++;
					} else {
						T73_lc1_borderX = y*T73_lc1_m + T73_lc1_C;
						T73_lc1_lastY = y;
					}
				}
				if(T73_lc2_horizontal) {
					T73_lc2_cached = (T73_lc2_leftOrAbove ? y <= T73_lc2_borderY : y >= T73_lc2_borderY);
				} else if(T73_lc2_vertical) {
					// nothing
				} else {
					if(T73_lc2_lastY == y - 1) {
						T73_lc2_borderX += T73_lc2_m;
						T73_lc2_lastY++;
					} else {
						T73_lc2_borderX = y*T73_lc2_m + T73_lc2_C;
						T73_lc2_lastY = y;
					}
				}
				if(T73_lc3_horizontal) {
					T73_lc3_cached = (T73_lc3_leftOrAbove ? y <= T73_lc3_borderY : y >= T73_lc3_borderY);
				} else if(T73_lc3_vertical) {
					// nothing
				} else {
					if(T73_lc3_lastY == y - 1) {
						T73_lc3_borderX += T73_lc3_m;
						T73_lc3_lastY++;
					} else {
						T73_lc3_borderX = y*T73_lc3_m + T73_lc3_C;
						T73_lc3_lastY = y;
					}
				}
			}
		}

		if(T74_initializedWithValidData) {
			if(y < T74_miny || y > T74_maxy) {
				T74_okay = false;
			} else {
				T74_okay = true;
				if(T74_lc1_horizontal) {
					T74_lc1_cached = (T74_lc1_leftOrAbove ? y <= T74_lc1_borderY : y >= T74_lc1_borderY);
				} else if(T74_lc1_vertical) {
					// nothing
				} else {
					if(T74_lc1_lastY == y - 1) {
						T74_lc1_borderX += T74_lc1_m;
						T74_lc1_lastY++;
					} else {
						T74_lc1_borderX = y*T74_lc1_m + T74_lc1_C;
						T74_lc1_lastY = y;
					}
				}
				if(T74_lc2_horizontal) {
					T74_lc2_cached = (T74_lc2_leftOrAbove ? y <= T74_lc2_borderY : y >= T74_lc2_borderY);
				} else if(T74_lc2_vertical) {
					// nothing
				} else {
					if(T74_lc2_lastY == y - 1) {
						T74_lc2_borderX += T74_lc2_m;
						T74_lc2_lastY++;
					} else {
						T74_lc2_borderX = y*T74_lc2_m + T74_lc2_C;
						T74_lc2_lastY = y;
					}
				}
				if(T74_lc3_horizontal) {
					T74_lc3_cached = (T74_lc3_leftOrAbove ? y <= T74_lc3_borderY : y >= T74_lc3_borderY);
				} else if(T74_lc3_vertical) {
					// nothing
				} else {
					if(T74_lc3_lastY == y - 1) {
						T74_lc3_borderX += T74_lc3_m;
						T74_lc3_lastY++;
					} else {
						T74_lc3_borderX = y*T74_lc3_m + T74_lc3_C;
						T74_lc3_lastY = y;
					}
				}
			}
		}

		if(T75_initializedWithValidData) {
			if(y < T75_miny || y > T75_maxy) {
				T75_okay = false;
			} else {
				T75_okay = true;
				if(T75_lc1_horizontal) {
					T75_lc1_cached = (T75_lc1_leftOrAbove ? y <= T75_lc1_borderY : y >= T75_lc1_borderY);
				} else if(T75_lc1_vertical) {
					// nothing
				} else {
					if(T75_lc1_lastY == y - 1) {
						T75_lc1_borderX += T75_lc1_m;
						T75_lc1_lastY++;
					} else {
						T75_lc1_borderX = y*T75_lc1_m + T75_lc1_C;
						T75_lc1_lastY = y;
					}
				}
				if(T75_lc2_horizontal) {
					T75_lc2_cached = (T75_lc2_leftOrAbove ? y <= T75_lc2_borderY : y >= T75_lc2_borderY);
				} else if(T75_lc2_vertical) {
					// nothing
				} else {
					if(T75_lc2_lastY == y - 1) {
						T75_lc2_borderX += T75_lc2_m;
						T75_lc2_lastY++;
					} else {
						T75_lc2_borderX = y*T75_lc2_m + T75_lc2_C;
						T75_lc2_lastY = y;
					}
				}
				if(T75_lc3_horizontal) {
					T75_lc3_cached = (T75_lc3_leftOrAbove ? y <= T75_lc3_borderY : y >= T75_lc3_borderY);
				} else if(T75_lc3_vertical) {
					// nothing
				} else {
					if(T75_lc3_lastY == y - 1) {
						T75_lc3_borderX += T75_lc3_m;
						T75_lc3_lastY++;
					} else {
						T75_lc3_borderX = y*T75_lc3_m + T75_lc3_C;
						T75_lc3_lastY = y;
					}
				}
			}
		}

		if(T76_initializedWithValidData) {
			if(y < T76_miny || y > T76_maxy) {
				T76_okay = false;
			} else {
				T76_okay = true;
				if(T76_lc1_horizontal) {
					T76_lc1_cached = (T76_lc1_leftOrAbove ? y <= T76_lc1_borderY : y >= T76_lc1_borderY);
				} else if(T76_lc1_vertical) {
					// nothing
				} else {
					if(T76_lc1_lastY == y - 1) {
						T76_lc1_borderX += T76_lc1_m;
						T76_lc1_lastY++;
					} else {
						T76_lc1_borderX = y*T76_lc1_m + T76_lc1_C;
						T76_lc1_lastY = y;
					}
				}
				if(T76_lc2_horizontal) {
					T76_lc2_cached = (T76_lc2_leftOrAbove ? y <= T76_lc2_borderY : y >= T76_lc2_borderY);
				} else if(T76_lc2_vertical) {
					// nothing
				} else {
					if(T76_lc2_lastY == y - 1) {
						T76_lc2_borderX += T76_lc2_m;
						T76_lc2_lastY++;
					} else {
						T76_lc2_borderX = y*T76_lc2_m + T76_lc2_C;
						T76_lc2_lastY = y;
					}
				}
				if(T76_lc3_horizontal) {
					T76_lc3_cached = (T76_lc3_leftOrAbove ? y <= T76_lc3_borderY : y >= T76_lc3_borderY);
				} else if(T76_lc3_vertical) {
					// nothing
				} else {
					if(T76_lc3_lastY == y - 1) {
						T76_lc3_borderX += T76_lc3_m;
						T76_lc3_lastY++;
					} else {
						T76_lc3_borderX = y*T76_lc3_m + T76_lc3_C;
						T76_lc3_lastY = y;
					}
				}
			}
		}

		if(T77_initializedWithValidData) {
			if(y < T77_miny || y > T77_maxy) {
				T77_okay = false;
			} else {
				T77_okay = true;
				if(T77_lc1_horizontal) {
					T77_lc1_cached = (T77_lc1_leftOrAbove ? y <= T77_lc1_borderY : y >= T77_lc1_borderY);
				} else if(T77_lc1_vertical) {
					// nothing
				} else {
					if(T77_lc1_lastY == y - 1) {
						T77_lc1_borderX += T77_lc1_m;
						T77_lc1_lastY++;
					} else {
						T77_lc1_borderX = y*T77_lc1_m + T77_lc1_C;
						T77_lc1_lastY = y;
					}
				}
				if(T77_lc2_horizontal) {
					T77_lc2_cached = (T77_lc2_leftOrAbove ? y <= T77_lc2_borderY : y >= T77_lc2_borderY);
				} else if(T77_lc2_vertical) {
					// nothing
				} else {
					if(T77_lc2_lastY == y - 1) {
						T77_lc2_borderX += T77_lc2_m;
						T77_lc2_lastY++;
					} else {
						T77_lc2_borderX = y*T77_lc2_m + T77_lc2_C;
						T77_lc2_lastY = y;
					}
				}
				if(T77_lc3_horizontal) {
					T77_lc3_cached = (T77_lc3_leftOrAbove ? y <= T77_lc3_borderY : y >= T77_lc3_borderY);
				} else if(T77_lc3_vertical) {
					// nothing
				} else {
					if(T77_lc3_lastY == y - 1) {
						T77_lc3_borderX += T77_lc3_m;
						T77_lc3_lastY++;
					} else {
						T77_lc3_borderX = y*T77_lc3_m + T77_lc3_C;
						T77_lc3_lastY = y;
					}
				}
			}
		}

		if(T78_initializedWithValidData) {
			if(y < T78_miny || y > T78_maxy) {
				T78_okay = false;
			} else {
				T78_okay = true;
				if(T78_lc1_horizontal) {
					T78_lc1_cached = (T78_lc1_leftOrAbove ? y <= T78_lc1_borderY : y >= T78_lc1_borderY);
				} else if(T78_lc1_vertical) {
					// nothing
				} else {
					if(T78_lc1_lastY == y - 1) {
						T78_lc1_borderX += T78_lc1_m;
						T78_lc1_lastY++;
					} else {
						T78_lc1_borderX = y*T78_lc1_m + T78_lc1_C;
						T78_lc1_lastY = y;
					}
				}
				if(T78_lc2_horizontal) {
					T78_lc2_cached = (T78_lc2_leftOrAbove ? y <= T78_lc2_borderY : y >= T78_lc2_borderY);
				} else if(T78_lc2_vertical) {
					// nothing
				} else {
					if(T78_lc2_lastY == y - 1) {
						T78_lc2_borderX += T78_lc2_m;
						T78_lc2_lastY++;
					} else {
						T78_lc2_borderX = y*T78_lc2_m + T78_lc2_C;
						T78_lc2_lastY = y;
					}
				}
				if(T78_lc3_horizontal) {
					T78_lc3_cached = (T78_lc3_leftOrAbove ? y <= T78_lc3_borderY : y >= T78_lc3_borderY);
				} else if(T78_lc3_vertical) {
					// nothing
				} else {
					if(T78_lc3_lastY == y - 1) {
						T78_lc3_borderX += T78_lc3_m;
						T78_lc3_lastY++;
					} else {
						T78_lc3_borderX = y*T78_lc3_m + T78_lc3_C;
						T78_lc3_lastY = y;
					}
				}
			}
		}

		if(T79_initializedWithValidData) {
			if(y < T79_miny || y > T79_maxy) {
				T79_okay = false;
			} else {
				T79_okay = true;
				if(T79_lc1_horizontal) {
					T79_lc1_cached = (T79_lc1_leftOrAbove ? y <= T79_lc1_borderY : y >= T79_lc1_borderY);
				} else if(T79_lc1_vertical) {
					// nothing
				} else {
					if(T79_lc1_lastY == y - 1) {
						T79_lc1_borderX += T79_lc1_m;
						T79_lc1_lastY++;
					} else {
						T79_lc1_borderX = y*T79_lc1_m + T79_lc1_C;
						T79_lc1_lastY = y;
					}
				}
				if(T79_lc2_horizontal) {
					T79_lc2_cached = (T79_lc2_leftOrAbove ? y <= T79_lc2_borderY : y >= T79_lc2_borderY);
				} else if(T79_lc2_vertical) {
					// nothing
				} else {
					if(T79_lc2_lastY == y - 1) {
						T79_lc2_borderX += T79_lc2_m;
						T79_lc2_lastY++;
					} else {
						T79_lc2_borderX = y*T79_lc2_m + T79_lc2_C;
						T79_lc2_lastY = y;
					}
				}
				if(T79_lc3_horizontal) {
					T79_lc3_cached = (T79_lc3_leftOrAbove ? y <= T79_lc3_borderY : y >= T79_lc3_borderY);
				} else if(T79_lc3_vertical) {
					// nothing
				} else {
					if(T79_lc3_lastY == y - 1) {
						T79_lc3_borderX += T79_lc3_m;
						T79_lc3_lastY++;
					} else {
						T79_lc3_borderX = y*T79_lc3_m + T79_lc3_C;
						T79_lc3_lastY = y;
					}
				}
			}
		}

		if(T80_initializedWithValidData) {
			if(y < T80_miny || y > T80_maxy) {
				T80_okay = false;
			} else {
				T80_okay = true;
				if(T80_lc1_horizontal) {
					T80_lc1_cached = (T80_lc1_leftOrAbove ? y <= T80_lc1_borderY : y >= T80_lc1_borderY);
				} else if(T80_lc1_vertical) {
					// nothing
				} else {
					if(T80_lc1_lastY == y - 1) {
						T80_lc1_borderX += T80_lc1_m;
						T80_lc1_lastY++;
					} else {
						T80_lc1_borderX = y*T80_lc1_m + T80_lc1_C;
						T80_lc1_lastY = y;
					}
				}
				if(T80_lc2_horizontal) {
					T80_lc2_cached = (T80_lc2_leftOrAbove ? y <= T80_lc2_borderY : y >= T80_lc2_borderY);
				} else if(T80_lc2_vertical) {
					// nothing
				} else {
					if(T80_lc2_lastY == y - 1) {
						T80_lc2_borderX += T80_lc2_m;
						T80_lc2_lastY++;
					} else {
						T80_lc2_borderX = y*T80_lc2_m + T80_lc2_C;
						T80_lc2_lastY = y;
					}
				}
				if(T80_lc3_horizontal) {
					T80_lc3_cached = (T80_lc3_leftOrAbove ? y <= T80_lc3_borderY : y >= T80_lc3_borderY);
				} else if(T80_lc3_vertical) {
					// nothing
				} else {
					if(T80_lc3_lastY == y - 1) {
						T80_lc3_borderX += T80_lc3_m;
						T80_lc3_lastY++;
					} else {
						T80_lc3_borderX = y*T80_lc3_m + T80_lc3_C;
						T80_lc3_lastY = y;
					}
				}
			}
		}

		if(T81_initializedWithValidData) {
			if(y < T81_miny || y > T81_maxy) {
				T81_okay = false;
			} else {
				T81_okay = true;
				if(T81_lc1_horizontal) {
					T81_lc1_cached = (T81_lc1_leftOrAbove ? y <= T81_lc1_borderY : y >= T81_lc1_borderY);
				} else if(T81_lc1_vertical) {
					// nothing
				} else {
					if(T81_lc1_lastY == y - 1) {
						T81_lc1_borderX += T81_lc1_m;
						T81_lc1_lastY++;
					} else {
						T81_lc1_borderX = y*T81_lc1_m + T81_lc1_C;
						T81_lc1_lastY = y;
					}
				}
				if(T81_lc2_horizontal) {
					T81_lc2_cached = (T81_lc2_leftOrAbove ? y <= T81_lc2_borderY : y >= T81_lc2_borderY);
				} else if(T81_lc2_vertical) {
					// nothing
				} else {
					if(T81_lc2_lastY == y - 1) {
						T81_lc2_borderX += T81_lc2_m;
						T81_lc2_lastY++;
					} else {
						T81_lc2_borderX = y*T81_lc2_m + T81_lc2_C;
						T81_lc2_lastY = y;
					}
				}
				if(T81_lc3_horizontal) {
					T81_lc3_cached = (T81_lc3_leftOrAbove ? y <= T81_lc3_borderY : y >= T81_lc3_borderY);
				} else if(T81_lc3_vertical) {
					// nothing
				} else {
					if(T81_lc3_lastY == y - 1) {
						T81_lc3_borderX += T81_lc3_m;
						T81_lc3_lastY++;
					} else {
						T81_lc3_borderX = y*T81_lc3_m + T81_lc3_C;
						T81_lc3_lastY = y;
					}
				}
			}
		}

		if(T82_initializedWithValidData) {
			if(y < T82_miny || y > T82_maxy) {
				T82_okay = false;
			} else {
				T82_okay = true;
				if(T82_lc1_horizontal) {
					T82_lc1_cached = (T82_lc1_leftOrAbove ? y <= T82_lc1_borderY : y >= T82_lc1_borderY);
				} else if(T82_lc1_vertical) {
					// nothing
				} else {
					if(T82_lc1_lastY == y - 1) {
						T82_lc1_borderX += T82_lc1_m;
						T82_lc1_lastY++;
					} else {
						T82_lc1_borderX = y*T82_lc1_m + T82_lc1_C;
						T82_lc1_lastY = y;
					}
				}
				if(T82_lc2_horizontal) {
					T82_lc2_cached = (T82_lc2_leftOrAbove ? y <= T82_lc2_borderY : y >= T82_lc2_borderY);
				} else if(T82_lc2_vertical) {
					// nothing
				} else {
					if(T82_lc2_lastY == y - 1) {
						T82_lc2_borderX += T82_lc2_m;
						T82_lc2_lastY++;
					} else {
						T82_lc2_borderX = y*T82_lc2_m + T82_lc2_C;
						T82_lc2_lastY = y;
					}
				}
				if(T82_lc3_horizontal) {
					T82_lc3_cached = (T82_lc3_leftOrAbove ? y <= T82_lc3_borderY : y >= T82_lc3_borderY);
				} else if(T82_lc3_vertical) {
					// nothing
				} else {
					if(T82_lc3_lastY == y - 1) {
						T82_lc3_borderX += T82_lc3_m;
						T82_lc3_lastY++;
					} else {
						T82_lc3_borderX = y*T82_lc3_m + T82_lc3_C;
						T82_lc3_lastY = y;
					}
				}
			}
		}

		if(T83_initializedWithValidData) {
			if(y < T83_miny || y > T83_maxy) {
				T83_okay = false;
			} else {
				T83_okay = true;
				if(T83_lc1_horizontal) {
					T83_lc1_cached = (T83_lc1_leftOrAbove ? y <= T83_lc1_borderY : y >= T83_lc1_borderY);
				} else if(T83_lc1_vertical) {
					// nothing
				} else {
					if(T83_lc1_lastY == y - 1) {
						T83_lc1_borderX += T83_lc1_m;
						T83_lc1_lastY++;
					} else {
						T83_lc1_borderX = y*T83_lc1_m + T83_lc1_C;
						T83_lc1_lastY = y;
					}
				}
				if(T83_lc2_horizontal) {
					T83_lc2_cached = (T83_lc2_leftOrAbove ? y <= T83_lc2_borderY : y >= T83_lc2_borderY);
				} else if(T83_lc2_vertical) {
					// nothing
				} else {
					if(T83_lc2_lastY == y - 1) {
						T83_lc2_borderX += T83_lc2_m;
						T83_lc2_lastY++;
					} else {
						T83_lc2_borderX = y*T83_lc2_m + T83_lc2_C;
						T83_lc2_lastY = y;
					}
				}
				if(T83_lc3_horizontal) {
					T83_lc3_cached = (T83_lc3_leftOrAbove ? y <= T83_lc3_borderY : y >= T83_lc3_borderY);
				} else if(T83_lc3_vertical) {
					// nothing
				} else {
					if(T83_lc3_lastY == y - 1) {
						T83_lc3_borderX += T83_lc3_m;
						T83_lc3_lastY++;
					} else {
						T83_lc3_borderX = y*T83_lc3_m + T83_lc3_C;
						T83_lc3_lastY = y;
					}
				}
			}
		}

		if(T84_initializedWithValidData) {
			if(y < T84_miny || y > T84_maxy) {
				T84_okay = false;
			} else {
				T84_okay = true;
				if(T84_lc1_horizontal) {
					T84_lc1_cached = (T84_lc1_leftOrAbove ? y <= T84_lc1_borderY : y >= T84_lc1_borderY);
				} else if(T84_lc1_vertical) {
					// nothing
				} else {
					if(T84_lc1_lastY == y - 1) {
						T84_lc1_borderX += T84_lc1_m;
						T84_lc1_lastY++;
					} else {
						T84_lc1_borderX = y*T84_lc1_m + T84_lc1_C;
						T84_lc1_lastY = y;
					}
				}
				if(T84_lc2_horizontal) {
					T84_lc2_cached = (T84_lc2_leftOrAbove ? y <= T84_lc2_borderY : y >= T84_lc2_borderY);
				} else if(T84_lc2_vertical) {
					// nothing
				} else {
					if(T84_lc2_lastY == y - 1) {
						T84_lc2_borderX += T84_lc2_m;
						T84_lc2_lastY++;
					} else {
						T84_lc2_borderX = y*T84_lc2_m + T84_lc2_C;
						T84_lc2_lastY = y;
					}
				}
				if(T84_lc3_horizontal) {
					T84_lc3_cached = (T84_lc3_leftOrAbove ? y <= T84_lc3_borderY : y >= T84_lc3_borderY);
				} else if(T84_lc3_vertical) {
					// nothing
				} else {
					if(T84_lc3_lastY == y - 1) {
						T84_lc3_borderX += T84_lc3_m;
						T84_lc3_lastY++;
					} else {
						T84_lc3_borderX = y*T84_lc3_m + T84_lc3_C;
						T84_lc3_lastY = y;
					}
				}
			}
		}

		if(T85_initializedWithValidData) {
			if(y < T85_miny || y > T85_maxy) {
				T85_okay = false;
			} else {
				T85_okay = true;
				if(T85_lc1_horizontal) {
					T85_lc1_cached = (T85_lc1_leftOrAbove ? y <= T85_lc1_borderY : y >= T85_lc1_borderY);
				} else if(T85_lc1_vertical) {
					// nothing
				} else {
					if(T85_lc1_lastY == y - 1) {
						T85_lc1_borderX += T85_lc1_m;
						T85_lc1_lastY++;
					} else {
						T85_lc1_borderX = y*T85_lc1_m + T85_lc1_C;
						T85_lc1_lastY = y;
					}
				}
				if(T85_lc2_horizontal) {
					T85_lc2_cached = (T85_lc2_leftOrAbove ? y <= T85_lc2_borderY : y >= T85_lc2_borderY);
				} else if(T85_lc2_vertical) {
					// nothing
				} else {
					if(T85_lc2_lastY == y - 1) {
						T85_lc2_borderX += T85_lc2_m;
						T85_lc2_lastY++;
					} else {
						T85_lc2_borderX = y*T85_lc2_m + T85_lc2_C;
						T85_lc2_lastY = y;
					}
				}
				if(T85_lc3_horizontal) {
					T85_lc3_cached = (T85_lc3_leftOrAbove ? y <= T85_lc3_borderY : y >= T85_lc3_borderY);
				} else if(T85_lc3_vertical) {
					// nothing
				} else {
					if(T85_lc3_lastY == y - 1) {
						T85_lc3_borderX += T85_lc3_m;
						T85_lc3_lastY++;
					} else {
						T85_lc3_borderX = y*T85_lc3_m + T85_lc3_C;
						T85_lc3_lastY = y;
					}
				}
			}
		}

		if(T86_initializedWithValidData) {
			if(y < T86_miny || y > T86_maxy) {
				T86_okay = false;
			} else {
				T86_okay = true;
				if(T86_lc1_horizontal) {
					T86_lc1_cached = (T86_lc1_leftOrAbove ? y <= T86_lc1_borderY : y >= T86_lc1_borderY);
				} else if(T86_lc1_vertical) {
					// nothing
				} else {
					if(T86_lc1_lastY == y - 1) {
						T86_lc1_borderX += T86_lc1_m;
						T86_lc1_lastY++;
					} else {
						T86_lc1_borderX = y*T86_lc1_m + T86_lc1_C;
						T86_lc1_lastY = y;
					}
				}
				if(T86_lc2_horizontal) {
					T86_lc2_cached = (T86_lc2_leftOrAbove ? y <= T86_lc2_borderY : y >= T86_lc2_borderY);
				} else if(T86_lc2_vertical) {
					// nothing
				} else {
					if(T86_lc2_lastY == y - 1) {
						T86_lc2_borderX += T86_lc2_m;
						T86_lc2_lastY++;
					} else {
						T86_lc2_borderX = y*T86_lc2_m + T86_lc2_C;
						T86_lc2_lastY = y;
					}
				}
				if(T86_lc3_horizontal) {
					T86_lc3_cached = (T86_lc3_leftOrAbove ? y <= T86_lc3_borderY : y >= T86_lc3_borderY);
				} else if(T86_lc3_vertical) {
					// nothing
				} else {
					if(T86_lc3_lastY == y - 1) {
						T86_lc3_borderX += T86_lc3_m;
						T86_lc3_lastY++;
					} else {
						T86_lc3_borderX = y*T86_lc3_m + T86_lc3_C;
						T86_lc3_lastY = y;
					}
				}
			}
		}

		if(T87_initializedWithValidData) {
			if(y < T87_miny || y > T87_maxy) {
				T87_okay = false;
			} else {
				T87_okay = true;
				if(T87_lc1_horizontal) {
					T87_lc1_cached = (T87_lc1_leftOrAbove ? y <= T87_lc1_borderY : y >= T87_lc1_borderY);
				} else if(T87_lc1_vertical) {
					// nothing
				} else {
					if(T87_lc1_lastY == y - 1) {
						T87_lc1_borderX += T87_lc1_m;
						T87_lc1_lastY++;
					} else {
						T87_lc1_borderX = y*T87_lc1_m + T87_lc1_C;
						T87_lc1_lastY = y;
					}
				}
				if(T87_lc2_horizontal) {
					T87_lc2_cached = (T87_lc2_leftOrAbove ? y <= T87_lc2_borderY : y >= T87_lc2_borderY);
				} else if(T87_lc2_vertical) {
					// nothing
				} else {
					if(T87_lc2_lastY == y - 1) {
						T87_lc2_borderX += T87_lc2_m;
						T87_lc2_lastY++;
					} else {
						T87_lc2_borderX = y*T87_lc2_m + T87_lc2_C;
						T87_lc2_lastY = y;
					}
				}
				if(T87_lc3_horizontal) {
					T87_lc3_cached = (T87_lc3_leftOrAbove ? y <= T87_lc3_borderY : y >= T87_lc3_borderY);
				} else if(T87_lc3_vertical) {
					// nothing
				} else {
					if(T87_lc3_lastY == y - 1) {
						T87_lc3_borderX += T87_lc3_m;
						T87_lc3_lastY++;
					} else {
						T87_lc3_borderX = y*T87_lc3_m + T87_lc3_C;
						T87_lc3_lastY = y;
					}
				}
			}
		}

		if(T88_initializedWithValidData) {
			if(y < T88_miny || y > T88_maxy) {
				T88_okay = false;
			} else {
				T88_okay = true;
				if(T88_lc1_horizontal) {
					T88_lc1_cached = (T88_lc1_leftOrAbove ? y <= T88_lc1_borderY : y >= T88_lc1_borderY);
				} else if(T88_lc1_vertical) {
					// nothing
				} else {
					if(T88_lc1_lastY == y - 1) {
						T88_lc1_borderX += T88_lc1_m;
						T88_lc1_lastY++;
					} else {
						T88_lc1_borderX = y*T88_lc1_m + T88_lc1_C;
						T88_lc1_lastY = y;
					}
				}
				if(T88_lc2_horizontal) {
					T88_lc2_cached = (T88_lc2_leftOrAbove ? y <= T88_lc2_borderY : y >= T88_lc2_borderY);
				} else if(T88_lc2_vertical) {
					// nothing
				} else {
					if(T88_lc2_lastY == y - 1) {
						T88_lc2_borderX += T88_lc2_m;
						T88_lc2_lastY++;
					} else {
						T88_lc2_borderX = y*T88_lc2_m + T88_lc2_C;
						T88_lc2_lastY = y;
					}
				}
				if(T88_lc3_horizontal) {
					T88_lc3_cached = (T88_lc3_leftOrAbove ? y <= T88_lc3_borderY : y >= T88_lc3_borderY);
				} else if(T88_lc3_vertical) {
					// nothing
				} else {
					if(T88_lc3_lastY == y - 1) {
						T88_lc3_borderX += T88_lc3_m;
						T88_lc3_lastY++;
					} else {
						T88_lc3_borderX = y*T88_lc3_m + T88_lc3_C;
						T88_lc3_lastY = y;
					}
				}
			}
		}

		if(T89_initializedWithValidData) {
			if(y < T89_miny || y > T89_maxy) {
				T89_okay = false;
			} else {
				T89_okay = true;
				if(T89_lc1_horizontal) {
					T89_lc1_cached = (T89_lc1_leftOrAbove ? y <= T89_lc1_borderY : y >= T89_lc1_borderY);
				} else if(T89_lc1_vertical) {
					// nothing
				} else {
					if(T89_lc1_lastY == y - 1) {
						T89_lc1_borderX += T89_lc1_m;
						T89_lc1_lastY++;
					} else {
						T89_lc1_borderX = y*T89_lc1_m + T89_lc1_C;
						T89_lc1_lastY = y;
					}
				}
				if(T89_lc2_horizontal) {
					T89_lc2_cached = (T89_lc2_leftOrAbove ? y <= T89_lc2_borderY : y >= T89_lc2_borderY);
				} else if(T89_lc2_vertical) {
					// nothing
				} else {
					if(T89_lc2_lastY == y - 1) {
						T89_lc2_borderX += T89_lc2_m;
						T89_lc2_lastY++;
					} else {
						T89_lc2_borderX = y*T89_lc2_m + T89_lc2_C;
						T89_lc2_lastY = y;
					}
				}
				if(T89_lc3_horizontal) {
					T89_lc3_cached = (T89_lc3_leftOrAbove ? y <= T89_lc3_borderY : y >= T89_lc3_borderY);
				} else if(T89_lc3_vertical) {
					// nothing
				} else {
					if(T89_lc3_lastY == y - 1) {
						T89_lc3_borderX += T89_lc3_m;
						T89_lc3_lastY++;
					} else {
						T89_lc3_borderX = y*T89_lc3_m + T89_lc3_C;
						T89_lc3_lastY = y;
					}
				}
			}
		}
	}

	public void moveToY4(int y) {

		if(T90_initializedWithValidData) {
			if(y < T90_miny || y > T90_maxy) {
				T90_okay = false;
			} else {
				T90_okay = true;
				if(T90_lc1_horizontal) {
					T90_lc1_cached = (T90_lc1_leftOrAbove ? y <= T90_lc1_borderY : y >= T90_lc1_borderY);
				} else if(T90_lc1_vertical) {
					// nothing
				} else {
					if(T90_lc1_lastY == y - 1) {
						T90_lc1_borderX += T90_lc1_m;
						T90_lc1_lastY++;
					} else {
						T90_lc1_borderX = y*T90_lc1_m + T90_lc1_C;
						T90_lc1_lastY = y;
					}
				}
				if(T90_lc2_horizontal) {
					T90_lc2_cached = (T90_lc2_leftOrAbove ? y <= T90_lc2_borderY : y >= T90_lc2_borderY);
				} else if(T90_lc2_vertical) {
					// nothing
				} else {
					if(T90_lc2_lastY == y - 1) {
						T90_lc2_borderX += T90_lc2_m;
						T90_lc2_lastY++;
					} else {
						T90_lc2_borderX = y*T90_lc2_m + T90_lc2_C;
						T90_lc2_lastY = y;
					}
				}
				if(T90_lc3_horizontal) {
					T90_lc3_cached = (T90_lc3_leftOrAbove ? y <= T90_lc3_borderY : y >= T90_lc3_borderY);
				} else if(T90_lc3_vertical) {
					// nothing
				} else {
					if(T90_lc3_lastY == y - 1) {
						T90_lc3_borderX += T90_lc3_m;
						T90_lc3_lastY++;
					} else {
						T90_lc3_borderX = y*T90_lc3_m + T90_lc3_C;
						T90_lc3_lastY = y;
					}
				}
			}
		}

		if(T91_initializedWithValidData) {
			if(y < T91_miny || y > T91_maxy) {
				T91_okay = false;
			} else {
				T91_okay = true;
				if(T91_lc1_horizontal) {
					T91_lc1_cached = (T91_lc1_leftOrAbove ? y <= T91_lc1_borderY : y >= T91_lc1_borderY);
				} else if(T91_lc1_vertical) {
					// nothing
				} else {
					if(T91_lc1_lastY == y - 1) {
						T91_lc1_borderX += T91_lc1_m;
						T91_lc1_lastY++;
					} else {
						T91_lc1_borderX = y*T91_lc1_m + T91_lc1_C;
						T91_lc1_lastY = y;
					}
				}
				if(T91_lc2_horizontal) {
					T91_lc2_cached = (T91_lc2_leftOrAbove ? y <= T91_lc2_borderY : y >= T91_lc2_borderY);
				} else if(T91_lc2_vertical) {
					// nothing
				} else {
					if(T91_lc2_lastY == y - 1) {
						T91_lc2_borderX += T91_lc2_m;
						T91_lc2_lastY++;
					} else {
						T91_lc2_borderX = y*T91_lc2_m + T91_lc2_C;
						T91_lc2_lastY = y;
					}
				}
				if(T91_lc3_horizontal) {
					T91_lc3_cached = (T91_lc3_leftOrAbove ? y <= T91_lc3_borderY : y >= T91_lc3_borderY);
				} else if(T91_lc3_vertical) {
					// nothing
				} else {
					if(T91_lc3_lastY == y - 1) {
						T91_lc3_borderX += T91_lc3_m;
						T91_lc3_lastY++;
					} else {
						T91_lc3_borderX = y*T91_lc3_m + T91_lc3_C;
						T91_lc3_lastY = y;
					}
				}
			}
		}

		if(T92_initializedWithValidData) {
			if(y < T92_miny || y > T92_maxy) {
				T92_okay = false;
			} else {
				T92_okay = true;
				if(T92_lc1_horizontal) {
					T92_lc1_cached = (T92_lc1_leftOrAbove ? y <= T92_lc1_borderY : y >= T92_lc1_borderY);
				} else if(T92_lc1_vertical) {
					// nothing
				} else {
					if(T92_lc1_lastY == y - 1) {
						T92_lc1_borderX += T92_lc1_m;
						T92_lc1_lastY++;
					} else {
						T92_lc1_borderX = y*T92_lc1_m + T92_lc1_C;
						T92_lc1_lastY = y;
					}
				}
				if(T92_lc2_horizontal) {
					T92_lc2_cached = (T92_lc2_leftOrAbove ? y <= T92_lc2_borderY : y >= T92_lc2_borderY);
				} else if(T92_lc2_vertical) {
					// nothing
				} else {
					if(T92_lc2_lastY == y - 1) {
						T92_lc2_borderX += T92_lc2_m;
						T92_lc2_lastY++;
					} else {
						T92_lc2_borderX = y*T92_lc2_m + T92_lc2_C;
						T92_lc2_lastY = y;
					}
				}
				if(T92_lc3_horizontal) {
					T92_lc3_cached = (T92_lc3_leftOrAbove ? y <= T92_lc3_borderY : y >= T92_lc3_borderY);
				} else if(T92_lc3_vertical) {
					// nothing
				} else {
					if(T92_lc3_lastY == y - 1) {
						T92_lc3_borderX += T92_lc3_m;
						T92_lc3_lastY++;
					} else {
						T92_lc3_borderX = y*T92_lc3_m + T92_lc3_C;
						T92_lc3_lastY = y;
					}
				}
			}
		}

		if(T93_initializedWithValidData) {
			if(y < T93_miny || y > T93_maxy) {
				T93_okay = false;
			} else {
				T93_okay = true;
				if(T93_lc1_horizontal) {
					T93_lc1_cached = (T93_lc1_leftOrAbove ? y <= T93_lc1_borderY : y >= T93_lc1_borderY);
				} else if(T93_lc1_vertical) {
					// nothing
				} else {
					if(T93_lc1_lastY == y - 1) {
						T93_lc1_borderX += T93_lc1_m;
						T93_lc1_lastY++;
					} else {
						T93_lc1_borderX = y*T93_lc1_m + T93_lc1_C;
						T93_lc1_lastY = y;
					}
				}
				if(T93_lc2_horizontal) {
					T93_lc2_cached = (T93_lc2_leftOrAbove ? y <= T93_lc2_borderY : y >= T93_lc2_borderY);
				} else if(T93_lc2_vertical) {
					// nothing
				} else {
					if(T93_lc2_lastY == y - 1) {
						T93_lc2_borderX += T93_lc2_m;
						T93_lc2_lastY++;
					} else {
						T93_lc2_borderX = y*T93_lc2_m + T93_lc2_C;
						T93_lc2_lastY = y;
					}
				}
				if(T93_lc3_horizontal) {
					T93_lc3_cached = (T93_lc3_leftOrAbove ? y <= T93_lc3_borderY : y >= T93_lc3_borderY);
				} else if(T93_lc3_vertical) {
					// nothing
				} else {
					if(T93_lc3_lastY == y - 1) {
						T93_lc3_borderX += T93_lc3_m;
						T93_lc3_lastY++;
					} else {
						T93_lc3_borderX = y*T93_lc3_m + T93_lc3_C;
						T93_lc3_lastY = y;
					}
				}
			}
		}

		if(T94_initializedWithValidData) {
			if(y < T94_miny || y > T94_maxy) {
				T94_okay = false;
			} else {
				T94_okay = true;
				if(T94_lc1_horizontal) {
					T94_lc1_cached = (T94_lc1_leftOrAbove ? y <= T94_lc1_borderY : y >= T94_lc1_borderY);
				} else if(T94_lc1_vertical) {
					// nothing
				} else {
					if(T94_lc1_lastY == y - 1) {
						T94_lc1_borderX += T94_lc1_m;
						T94_lc1_lastY++;
					} else {
						T94_lc1_borderX = y*T94_lc1_m + T94_lc1_C;
						T94_lc1_lastY = y;
					}
				}
				if(T94_lc2_horizontal) {
					T94_lc2_cached = (T94_lc2_leftOrAbove ? y <= T94_lc2_borderY : y >= T94_lc2_borderY);
				} else if(T94_lc2_vertical) {
					// nothing
				} else {
					if(T94_lc2_lastY == y - 1) {
						T94_lc2_borderX += T94_lc2_m;
						T94_lc2_lastY++;
					} else {
						T94_lc2_borderX = y*T94_lc2_m + T94_lc2_C;
						T94_lc2_lastY = y;
					}
				}
				if(T94_lc3_horizontal) {
					T94_lc3_cached = (T94_lc3_leftOrAbove ? y <= T94_lc3_borderY : y >= T94_lc3_borderY);
				} else if(T94_lc3_vertical) {
					// nothing
				} else {
					if(T94_lc3_lastY == y - 1) {
						T94_lc3_borderX += T94_lc3_m;
						T94_lc3_lastY++;
					} else {
						T94_lc3_borderX = y*T94_lc3_m + T94_lc3_C;
						T94_lc3_lastY = y;
					}
				}
			}
		}

		if(T95_initializedWithValidData) {
			if(y < T95_miny || y > T95_maxy) {
				T95_okay = false;
			} else {
				T95_okay = true;
				if(T95_lc1_horizontal) {
					T95_lc1_cached = (T95_lc1_leftOrAbove ? y <= T95_lc1_borderY : y >= T95_lc1_borderY);
				} else if(T95_lc1_vertical) {
					// nothing
				} else {
					if(T95_lc1_lastY == y - 1) {
						T95_lc1_borderX += T95_lc1_m;
						T95_lc1_lastY++;
					} else {
						T95_lc1_borderX = y*T95_lc1_m + T95_lc1_C;
						T95_lc1_lastY = y;
					}
				}
				if(T95_lc2_horizontal) {
					T95_lc2_cached = (T95_lc2_leftOrAbove ? y <= T95_lc2_borderY : y >= T95_lc2_borderY);
				} else if(T95_lc2_vertical) {
					// nothing
				} else {
					if(T95_lc2_lastY == y - 1) {
						T95_lc2_borderX += T95_lc2_m;
						T95_lc2_lastY++;
					} else {
						T95_lc2_borderX = y*T95_lc2_m + T95_lc2_C;
						T95_lc2_lastY = y;
					}
				}
				if(T95_lc3_horizontal) {
					T95_lc3_cached = (T95_lc3_leftOrAbove ? y <= T95_lc3_borderY : y >= T95_lc3_borderY);
				} else if(T95_lc3_vertical) {
					// nothing
				} else {
					if(T95_lc3_lastY == y - 1) {
						T95_lc3_borderX += T95_lc3_m;
						T95_lc3_lastY++;
					} else {
						T95_lc3_borderX = y*T95_lc3_m + T95_lc3_C;
						T95_lc3_lastY = y;
					}
				}
			}
		}

		if(T96_initializedWithValidData) {
			if(y < T96_miny || y > T96_maxy) {
				T96_okay = false;
			} else {
				T96_okay = true;
				if(T96_lc1_horizontal) {
					T96_lc1_cached = (T96_lc1_leftOrAbove ? y <= T96_lc1_borderY : y >= T96_lc1_borderY);
				} else if(T96_lc1_vertical) {
					// nothing
				} else {
					if(T96_lc1_lastY == y - 1) {
						T96_lc1_borderX += T96_lc1_m;
						T96_lc1_lastY++;
					} else {
						T96_lc1_borderX = y*T96_lc1_m + T96_lc1_C;
						T96_lc1_lastY = y;
					}
				}
				if(T96_lc2_horizontal) {
					T96_lc2_cached = (T96_lc2_leftOrAbove ? y <= T96_lc2_borderY : y >= T96_lc2_borderY);
				} else if(T96_lc2_vertical) {
					// nothing
				} else {
					if(T96_lc2_lastY == y - 1) {
						T96_lc2_borderX += T96_lc2_m;
						T96_lc2_lastY++;
					} else {
						T96_lc2_borderX = y*T96_lc2_m + T96_lc2_C;
						T96_lc2_lastY = y;
					}
				}
				if(T96_lc3_horizontal) {
					T96_lc3_cached = (T96_lc3_leftOrAbove ? y <= T96_lc3_borderY : y >= T96_lc3_borderY);
				} else if(T96_lc3_vertical) {
					// nothing
				} else {
					if(T96_lc3_lastY == y - 1) {
						T96_lc3_borderX += T96_lc3_m;
						T96_lc3_lastY++;
					} else {
						T96_lc3_borderX = y*T96_lc3_m + T96_lc3_C;
						T96_lc3_lastY = y;
					}
				}
			}
		}

		if(T97_initializedWithValidData) {
			if(y < T97_miny || y > T97_maxy) {
				T97_okay = false;
			} else {
				T97_okay = true;
				if(T97_lc1_horizontal) {
					T97_lc1_cached = (T97_lc1_leftOrAbove ? y <= T97_lc1_borderY : y >= T97_lc1_borderY);
				} else if(T97_lc1_vertical) {
					// nothing
				} else {
					if(T97_lc1_lastY == y - 1) {
						T97_lc1_borderX += T97_lc1_m;
						T97_lc1_lastY++;
					} else {
						T97_lc1_borderX = y*T97_lc1_m + T97_lc1_C;
						T97_lc1_lastY = y;
					}
				}
				if(T97_lc2_horizontal) {
					T97_lc2_cached = (T97_lc2_leftOrAbove ? y <= T97_lc2_borderY : y >= T97_lc2_borderY);
				} else if(T97_lc2_vertical) {
					// nothing
				} else {
					if(T97_lc2_lastY == y - 1) {
						T97_lc2_borderX += T97_lc2_m;
						T97_lc2_lastY++;
					} else {
						T97_lc2_borderX = y*T97_lc2_m + T97_lc2_C;
						T97_lc2_lastY = y;
					}
				}
				if(T97_lc3_horizontal) {
					T97_lc3_cached = (T97_lc3_leftOrAbove ? y <= T97_lc3_borderY : y >= T97_lc3_borderY);
				} else if(T97_lc3_vertical) {
					// nothing
				} else {
					if(T97_lc3_lastY == y - 1) {
						T97_lc3_borderX += T97_lc3_m;
						T97_lc3_lastY++;
					} else {
						T97_lc3_borderX = y*T97_lc3_m + T97_lc3_C;
						T97_lc3_lastY = y;
					}
				}
			}
		}

		if(T98_initializedWithValidData) {
			if(y < T98_miny || y > T98_maxy) {
				T98_okay = false;
			} else {
				T98_okay = true;
				if(T98_lc1_horizontal) {
					T98_lc1_cached = (T98_lc1_leftOrAbove ? y <= T98_lc1_borderY : y >= T98_lc1_borderY);
				} else if(T98_lc1_vertical) {
					// nothing
				} else {
					if(T98_lc1_lastY == y - 1) {
						T98_lc1_borderX += T98_lc1_m;
						T98_lc1_lastY++;
					} else {
						T98_lc1_borderX = y*T98_lc1_m + T98_lc1_C;
						T98_lc1_lastY = y;
					}
				}
				if(T98_lc2_horizontal) {
					T98_lc2_cached = (T98_lc2_leftOrAbove ? y <= T98_lc2_borderY : y >= T98_lc2_borderY);
				} else if(T98_lc2_vertical) {
					// nothing
				} else {
					if(T98_lc2_lastY == y - 1) {
						T98_lc2_borderX += T98_lc2_m;
						T98_lc2_lastY++;
					} else {
						T98_lc2_borderX = y*T98_lc2_m + T98_lc2_C;
						T98_lc2_lastY = y;
					}
				}
				if(T98_lc3_horizontal) {
					T98_lc3_cached = (T98_lc3_leftOrAbove ? y <= T98_lc3_borderY : y >= T98_lc3_borderY);
				} else if(T98_lc3_vertical) {
					// nothing
				} else {
					if(T98_lc3_lastY == y - 1) {
						T98_lc3_borderX += T98_lc3_m;
						T98_lc3_lastY++;
					} else {
						T98_lc3_borderX = y*T98_lc3_m + T98_lc3_C;
						T98_lc3_lastY = y;
					}
				}
			}
		}

		if(T99_initializedWithValidData) {
			if(y < T99_miny || y > T99_maxy) {
				T99_okay = false;
			} else {
				T99_okay = true;
				if(T99_lc1_horizontal) {
					T99_lc1_cached = (T99_lc1_leftOrAbove ? y <= T99_lc1_borderY : y >= T99_lc1_borderY);
				} else if(T99_lc1_vertical) {
					// nothing
				} else {
					if(T99_lc1_lastY == y - 1) {
						T99_lc1_borderX += T99_lc1_m;
						T99_lc1_lastY++;
					} else {
						T99_lc1_borderX = y*T99_lc1_m + T99_lc1_C;
						T99_lc1_lastY = y;
					}
				}
				if(T99_lc2_horizontal) {
					T99_lc2_cached = (T99_lc2_leftOrAbove ? y <= T99_lc2_borderY : y >= T99_lc2_borderY);
				} else if(T99_lc2_vertical) {
					// nothing
				} else {
					if(T99_lc2_lastY == y - 1) {
						T99_lc2_borderX += T99_lc2_m;
						T99_lc2_lastY++;
					} else {
						T99_lc2_borderX = y*T99_lc2_m + T99_lc2_C;
						T99_lc2_lastY = y;
					}
				}
				if(T99_lc3_horizontal) {
					T99_lc3_cached = (T99_lc3_leftOrAbove ? y <= T99_lc3_borderY : y >= T99_lc3_borderY);
				} else if(T99_lc3_vertical) {
					// nothing
				} else {
					if(T99_lc3_lastY == y - 1) {
						T99_lc3_borderX += T99_lc3_m;
						T99_lc3_lastY++;
					} else {
						T99_lc3_borderX = y*T99_lc3_m + T99_lc3_C;
						T99_lc3_lastY = y;
					}
				}
			}
		}

		if(T100_initializedWithValidData) {
			if(y < T100_miny || y > T100_maxy) {
				T100_okay = false;
			} else {
				T100_okay = true;
				if(T100_lc1_horizontal) {
					T100_lc1_cached = (T100_lc1_leftOrAbove ? y <= T100_lc1_borderY : y >= T100_lc1_borderY);
				} else if(T100_lc1_vertical) {
					// nothing
				} else {
					if(T100_lc1_lastY == y - 1) {
						T100_lc1_borderX += T100_lc1_m;
						T100_lc1_lastY++;
					} else {
						T100_lc1_borderX = y*T100_lc1_m + T100_lc1_C;
						T100_lc1_lastY = y;
					}
				}
				if(T100_lc2_horizontal) {
					T100_lc2_cached = (T100_lc2_leftOrAbove ? y <= T100_lc2_borderY : y >= T100_lc2_borderY);
				} else if(T100_lc2_vertical) {
					// nothing
				} else {
					if(T100_lc2_lastY == y - 1) {
						T100_lc2_borderX += T100_lc2_m;
						T100_lc2_lastY++;
					} else {
						T100_lc2_borderX = y*T100_lc2_m + T100_lc2_C;
						T100_lc2_lastY = y;
					}
				}
				if(T100_lc3_horizontal) {
					T100_lc3_cached = (T100_lc3_leftOrAbove ? y <= T100_lc3_borderY : y >= T100_lc3_borderY);
				} else if(T100_lc3_vertical) {
					// nothing
				} else {
					if(T100_lc3_lastY == y - 1) {
						T100_lc3_borderX += T100_lc3_m;
						T100_lc3_lastY++;
					} else {
						T100_lc3_borderX = y*T100_lc3_m + T100_lc3_C;
						T100_lc3_lastY = y;
					}
				}
			}
		}

		if(T101_initializedWithValidData) {
			if(y < T101_miny || y > T101_maxy) {
				T101_okay = false;
			} else {
				T101_okay = true;
				if(T101_lc1_horizontal) {
					T101_lc1_cached = (T101_lc1_leftOrAbove ? y <= T101_lc1_borderY : y >= T101_lc1_borderY);
				} else if(T101_lc1_vertical) {
					// nothing
				} else {
					if(T101_lc1_lastY == y - 1) {
						T101_lc1_borderX += T101_lc1_m;
						T101_lc1_lastY++;
					} else {
						T101_lc1_borderX = y*T101_lc1_m + T101_lc1_C;
						T101_lc1_lastY = y;
					}
				}
				if(T101_lc2_horizontal) {
					T101_lc2_cached = (T101_lc2_leftOrAbove ? y <= T101_lc2_borderY : y >= T101_lc2_borderY);
				} else if(T101_lc2_vertical) {
					// nothing
				} else {
					if(T101_lc2_lastY == y - 1) {
						T101_lc2_borderX += T101_lc2_m;
						T101_lc2_lastY++;
					} else {
						T101_lc2_borderX = y*T101_lc2_m + T101_lc2_C;
						T101_lc2_lastY = y;
					}
				}
				if(T101_lc3_horizontal) {
					T101_lc3_cached = (T101_lc3_leftOrAbove ? y <= T101_lc3_borderY : y >= T101_lc3_borderY);
				} else if(T101_lc3_vertical) {
					// nothing
				} else {
					if(T101_lc3_lastY == y - 1) {
						T101_lc3_borderX += T101_lc3_m;
						T101_lc3_lastY++;
					} else {
						T101_lc3_borderX = y*T101_lc3_m + T101_lc3_C;
						T101_lc3_lastY = y;
					}
				}
			}
		}

		if(T102_initializedWithValidData) {
			if(y < T102_miny || y > T102_maxy) {
				T102_okay = false;
			} else {
				T102_okay = true;
				if(T102_lc1_horizontal) {
					T102_lc1_cached = (T102_lc1_leftOrAbove ? y <= T102_lc1_borderY : y >= T102_lc1_borderY);
				} else if(T102_lc1_vertical) {
					// nothing
				} else {
					if(T102_lc1_lastY == y - 1) {
						T102_lc1_borderX += T102_lc1_m;
						T102_lc1_lastY++;
					} else {
						T102_lc1_borderX = y*T102_lc1_m + T102_lc1_C;
						T102_lc1_lastY = y;
					}
				}
				if(T102_lc2_horizontal) {
					T102_lc2_cached = (T102_lc2_leftOrAbove ? y <= T102_lc2_borderY : y >= T102_lc2_borderY);
				} else if(T102_lc2_vertical) {
					// nothing
				} else {
					if(T102_lc2_lastY == y - 1) {
						T102_lc2_borderX += T102_lc2_m;
						T102_lc2_lastY++;
					} else {
						T102_lc2_borderX = y*T102_lc2_m + T102_lc2_C;
						T102_lc2_lastY = y;
					}
				}
				if(T102_lc3_horizontal) {
					T102_lc3_cached = (T102_lc3_leftOrAbove ? y <= T102_lc3_borderY : y >= T102_lc3_borderY);
				} else if(T102_lc3_vertical) {
					// nothing
				} else {
					if(T102_lc3_lastY == y - 1) {
						T102_lc3_borderX += T102_lc3_m;
						T102_lc3_lastY++;
					} else {
						T102_lc3_borderX = y*T102_lc3_m + T102_lc3_C;
						T102_lc3_lastY = y;
					}
				}
			}
		}

		if(T103_initializedWithValidData) {
			if(y < T103_miny || y > T103_maxy) {
				T103_okay = false;
			} else {
				T103_okay = true;
				if(T103_lc1_horizontal) {
					T103_lc1_cached = (T103_lc1_leftOrAbove ? y <= T103_lc1_borderY : y >= T103_lc1_borderY);
				} else if(T103_lc1_vertical) {
					// nothing
				} else {
					if(T103_lc1_lastY == y - 1) {
						T103_lc1_borderX += T103_lc1_m;
						T103_lc1_lastY++;
					} else {
						T103_lc1_borderX = y*T103_lc1_m + T103_lc1_C;
						T103_lc1_lastY = y;
					}
				}
				if(T103_lc2_horizontal) {
					T103_lc2_cached = (T103_lc2_leftOrAbove ? y <= T103_lc2_borderY : y >= T103_lc2_borderY);
				} else if(T103_lc2_vertical) {
					// nothing
				} else {
					if(T103_lc2_lastY == y - 1) {
						T103_lc2_borderX += T103_lc2_m;
						T103_lc2_lastY++;
					} else {
						T103_lc2_borderX = y*T103_lc2_m + T103_lc2_C;
						T103_lc2_lastY = y;
					}
				}
				if(T103_lc3_horizontal) {
					T103_lc3_cached = (T103_lc3_leftOrAbove ? y <= T103_lc3_borderY : y >= T103_lc3_borderY);
				} else if(T103_lc3_vertical) {
					// nothing
				} else {
					if(T103_lc3_lastY == y - 1) {
						T103_lc3_borderX += T103_lc3_m;
						T103_lc3_lastY++;
					} else {
						T103_lc3_borderX = y*T103_lc3_m + T103_lc3_C;
						T103_lc3_lastY = y;
					}
				}
			}
		}

		if(T104_initializedWithValidData) {
			if(y < T104_miny || y > T104_maxy) {
				T104_okay = false;
			} else {
				T104_okay = true;
				if(T104_lc1_horizontal) {
					T104_lc1_cached = (T104_lc1_leftOrAbove ? y <= T104_lc1_borderY : y >= T104_lc1_borderY);
				} else if(T104_lc1_vertical) {
					// nothing
				} else {
					if(T104_lc1_lastY == y - 1) {
						T104_lc1_borderX += T104_lc1_m;
						T104_lc1_lastY++;
					} else {
						T104_lc1_borderX = y*T104_lc1_m + T104_lc1_C;
						T104_lc1_lastY = y;
					}
				}
				if(T104_lc2_horizontal) {
					T104_lc2_cached = (T104_lc2_leftOrAbove ? y <= T104_lc2_borderY : y >= T104_lc2_borderY);
				} else if(T104_lc2_vertical) {
					// nothing
				} else {
					if(T104_lc2_lastY == y - 1) {
						T104_lc2_borderX += T104_lc2_m;
						T104_lc2_lastY++;
					} else {
						T104_lc2_borderX = y*T104_lc2_m + T104_lc2_C;
						T104_lc2_lastY = y;
					}
				}
				if(T104_lc3_horizontal) {
					T104_lc3_cached = (T104_lc3_leftOrAbove ? y <= T104_lc3_borderY : y >= T104_lc3_borderY);
				} else if(T104_lc3_vertical) {
					// nothing
				} else {
					if(T104_lc3_lastY == y - 1) {
						T104_lc3_borderX += T104_lc3_m;
						T104_lc3_lastY++;
					} else {
						T104_lc3_borderX = y*T104_lc3_m + T104_lc3_C;
						T104_lc3_lastY = y;
					}
				}
			}
		}

		if(T105_initializedWithValidData) {
			if(y < T105_miny || y > T105_maxy) {
				T105_okay = false;
			} else {
				T105_okay = true;
				if(T105_lc1_horizontal) {
					T105_lc1_cached = (T105_lc1_leftOrAbove ? y <= T105_lc1_borderY : y >= T105_lc1_borderY);
				} else if(T105_lc1_vertical) {
					// nothing
				} else {
					if(T105_lc1_lastY == y - 1) {
						T105_lc1_borderX += T105_lc1_m;
						T105_lc1_lastY++;
					} else {
						T105_lc1_borderX = y*T105_lc1_m + T105_lc1_C;
						T105_lc1_lastY = y;
					}
				}
				if(T105_lc2_horizontal) {
					T105_lc2_cached = (T105_lc2_leftOrAbove ? y <= T105_lc2_borderY : y >= T105_lc2_borderY);
				} else if(T105_lc2_vertical) {
					// nothing
				} else {
					if(T105_lc2_lastY == y - 1) {
						T105_lc2_borderX += T105_lc2_m;
						T105_lc2_lastY++;
					} else {
						T105_lc2_borderX = y*T105_lc2_m + T105_lc2_C;
						T105_lc2_lastY = y;
					}
				}
				if(T105_lc3_horizontal) {
					T105_lc3_cached = (T105_lc3_leftOrAbove ? y <= T105_lc3_borderY : y >= T105_lc3_borderY);
				} else if(T105_lc3_vertical) {
					// nothing
				} else {
					if(T105_lc3_lastY == y - 1) {
						T105_lc3_borderX += T105_lc3_m;
						T105_lc3_lastY++;
					} else {
						T105_lc3_borderX = y*T105_lc3_m + T105_lc3_C;
						T105_lc3_lastY = y;
					}
				}
			}
		}

		if(T106_initializedWithValidData) {
			if(y < T106_miny || y > T106_maxy) {
				T106_okay = false;
			} else {
				T106_okay = true;
				if(T106_lc1_horizontal) {
					T106_lc1_cached = (T106_lc1_leftOrAbove ? y <= T106_lc1_borderY : y >= T106_lc1_borderY);
				} else if(T106_lc1_vertical) {
					// nothing
				} else {
					if(T106_lc1_lastY == y - 1) {
						T106_lc1_borderX += T106_lc1_m;
						T106_lc1_lastY++;
					} else {
						T106_lc1_borderX = y*T106_lc1_m + T106_lc1_C;
						T106_lc1_lastY = y;
					}
				}
				if(T106_lc2_horizontal) {
					T106_lc2_cached = (T106_lc2_leftOrAbove ? y <= T106_lc2_borderY : y >= T106_lc2_borderY);
				} else if(T106_lc2_vertical) {
					// nothing
				} else {
					if(T106_lc2_lastY == y - 1) {
						T106_lc2_borderX += T106_lc2_m;
						T106_lc2_lastY++;
					} else {
						T106_lc2_borderX = y*T106_lc2_m + T106_lc2_C;
						T106_lc2_lastY = y;
					}
				}
				if(T106_lc3_horizontal) {
					T106_lc3_cached = (T106_lc3_leftOrAbove ? y <= T106_lc3_borderY : y >= T106_lc3_borderY);
				} else if(T106_lc3_vertical) {
					// nothing
				} else {
					if(T106_lc3_lastY == y - 1) {
						T106_lc3_borderX += T106_lc3_m;
						T106_lc3_lastY++;
					} else {
						T106_lc3_borderX = y*T106_lc3_m + T106_lc3_C;
						T106_lc3_lastY = y;
					}
				}
			}
		}

		if(T107_initializedWithValidData) {
			if(y < T107_miny || y > T107_maxy) {
				T107_okay = false;
			} else {
				T107_okay = true;
				if(T107_lc1_horizontal) {
					T107_lc1_cached = (T107_lc1_leftOrAbove ? y <= T107_lc1_borderY : y >= T107_lc1_borderY);
				} else if(T107_lc1_vertical) {
					// nothing
				} else {
					if(T107_lc1_lastY == y - 1) {
						T107_lc1_borderX += T107_lc1_m;
						T107_lc1_lastY++;
					} else {
						T107_lc1_borderX = y*T107_lc1_m + T107_lc1_C;
						T107_lc1_lastY = y;
					}
				}
				if(T107_lc2_horizontal) {
					T107_lc2_cached = (T107_lc2_leftOrAbove ? y <= T107_lc2_borderY : y >= T107_lc2_borderY);
				} else if(T107_lc2_vertical) {
					// nothing
				} else {
					if(T107_lc2_lastY == y - 1) {
						T107_lc2_borderX += T107_lc2_m;
						T107_lc2_lastY++;
					} else {
						T107_lc2_borderX = y*T107_lc2_m + T107_lc2_C;
						T107_lc2_lastY = y;
					}
				}
				if(T107_lc3_horizontal) {
					T107_lc3_cached = (T107_lc3_leftOrAbove ? y <= T107_lc3_borderY : y >= T107_lc3_borderY);
				} else if(T107_lc3_vertical) {
					// nothing
				} else {
					if(T107_lc3_lastY == y - 1) {
						T107_lc3_borderX += T107_lc3_m;
						T107_lc3_lastY++;
					} else {
						T107_lc3_borderX = y*T107_lc3_m + T107_lc3_C;
						T107_lc3_lastY = y;
					}
				}
			}
		}

		if(T108_initializedWithValidData) {
			if(y < T108_miny || y > T108_maxy) {
				T108_okay = false;
			} else {
				T108_okay = true;
				if(T108_lc1_horizontal) {
					T108_lc1_cached = (T108_lc1_leftOrAbove ? y <= T108_lc1_borderY : y >= T108_lc1_borderY);
				} else if(T108_lc1_vertical) {
					// nothing
				} else {
					if(T108_lc1_lastY == y - 1) {
						T108_lc1_borderX += T108_lc1_m;
						T108_lc1_lastY++;
					} else {
						T108_lc1_borderX = y*T108_lc1_m + T108_lc1_C;
						T108_lc1_lastY = y;
					}
				}
				if(T108_lc2_horizontal) {
					T108_lc2_cached = (T108_lc2_leftOrAbove ? y <= T108_lc2_borderY : y >= T108_lc2_borderY);
				} else if(T108_lc2_vertical) {
					// nothing
				} else {
					if(T108_lc2_lastY == y - 1) {
						T108_lc2_borderX += T108_lc2_m;
						T108_lc2_lastY++;
					} else {
						T108_lc2_borderX = y*T108_lc2_m + T108_lc2_C;
						T108_lc2_lastY = y;
					}
				}
				if(T108_lc3_horizontal) {
					T108_lc3_cached = (T108_lc3_leftOrAbove ? y <= T108_lc3_borderY : y >= T108_lc3_borderY);
				} else if(T108_lc3_vertical) {
					// nothing
				} else {
					if(T108_lc3_lastY == y - 1) {
						T108_lc3_borderX += T108_lc3_m;
						T108_lc3_lastY++;
					} else {
						T108_lc3_borderX = y*T108_lc3_m + T108_lc3_C;
						T108_lc3_lastY = y;
					}
				}
			}
		}

		if(T109_initializedWithValidData) {
			if(y < T109_miny || y > T109_maxy) {
				T109_okay = false;
			} else {
				T109_okay = true;
				if(T109_lc1_horizontal) {
					T109_lc1_cached = (T109_lc1_leftOrAbove ? y <= T109_lc1_borderY : y >= T109_lc1_borderY);
				} else if(T109_lc1_vertical) {
					// nothing
				} else {
					if(T109_lc1_lastY == y - 1) {
						T109_lc1_borderX += T109_lc1_m;
						T109_lc1_lastY++;
					} else {
						T109_lc1_borderX = y*T109_lc1_m + T109_lc1_C;
						T109_lc1_lastY = y;
					}
				}
				if(T109_lc2_horizontal) {
					T109_lc2_cached = (T109_lc2_leftOrAbove ? y <= T109_lc2_borderY : y >= T109_lc2_borderY);
				} else if(T109_lc2_vertical) {
					// nothing
				} else {
					if(T109_lc2_lastY == y - 1) {
						T109_lc2_borderX += T109_lc2_m;
						T109_lc2_lastY++;
					} else {
						T109_lc2_borderX = y*T109_lc2_m + T109_lc2_C;
						T109_lc2_lastY = y;
					}
				}
				if(T109_lc3_horizontal) {
					T109_lc3_cached = (T109_lc3_leftOrAbove ? y <= T109_lc3_borderY : y >= T109_lc3_borderY);
				} else if(T109_lc3_vertical) {
					// nothing
				} else {
					if(T109_lc3_lastY == y - 1) {
						T109_lc3_borderX += T109_lc3_m;
						T109_lc3_lastY++;
					} else {
						T109_lc3_borderX = y*T109_lc3_m + T109_lc3_C;
						T109_lc3_lastY = y;
					}
				}
			}
		}

		if(T110_initializedWithValidData) {
			if(y < T110_miny || y > T110_maxy) {
				T110_okay = false;
			} else {
				T110_okay = true;
				if(T110_lc1_horizontal) {
					T110_lc1_cached = (T110_lc1_leftOrAbove ? y <= T110_lc1_borderY : y >= T110_lc1_borderY);
				} else if(T110_lc1_vertical) {
					// nothing
				} else {
					if(T110_lc1_lastY == y - 1) {
						T110_lc1_borderX += T110_lc1_m;
						T110_lc1_lastY++;
					} else {
						T110_lc1_borderX = y*T110_lc1_m + T110_lc1_C;
						T110_lc1_lastY = y;
					}
				}
				if(T110_lc2_horizontal) {
					T110_lc2_cached = (T110_lc2_leftOrAbove ? y <= T110_lc2_borderY : y >= T110_lc2_borderY);
				} else if(T110_lc2_vertical) {
					// nothing
				} else {
					if(T110_lc2_lastY == y - 1) {
						T110_lc2_borderX += T110_lc2_m;
						T110_lc2_lastY++;
					} else {
						T110_lc2_borderX = y*T110_lc2_m + T110_lc2_C;
						T110_lc2_lastY = y;
					}
				}
				if(T110_lc3_horizontal) {
					T110_lc3_cached = (T110_lc3_leftOrAbove ? y <= T110_lc3_borderY : y >= T110_lc3_borderY);
				} else if(T110_lc3_vertical) {
					// nothing
				} else {
					if(T110_lc3_lastY == y - 1) {
						T110_lc3_borderX += T110_lc3_m;
						T110_lc3_lastY++;
					} else {
						T110_lc3_borderX = y*T110_lc3_m + T110_lc3_C;
						T110_lc3_lastY = y;
					}
				}
			}
		}

		if(T111_initializedWithValidData) {
			if(y < T111_miny || y > T111_maxy) {
				T111_okay = false;
			} else {
				T111_okay = true;
				if(T111_lc1_horizontal) {
					T111_lc1_cached = (T111_lc1_leftOrAbove ? y <= T111_lc1_borderY : y >= T111_lc1_borderY);
				} else if(T111_lc1_vertical) {
					// nothing
				} else {
					if(T111_lc1_lastY == y - 1) {
						T111_lc1_borderX += T111_lc1_m;
						T111_lc1_lastY++;
					} else {
						T111_lc1_borderX = y*T111_lc1_m + T111_lc1_C;
						T111_lc1_lastY = y;
					}
				}
				if(T111_lc2_horizontal) {
					T111_lc2_cached = (T111_lc2_leftOrAbove ? y <= T111_lc2_borderY : y >= T111_lc2_borderY);
				} else if(T111_lc2_vertical) {
					// nothing
				} else {
					if(T111_lc2_lastY == y - 1) {
						T111_lc2_borderX += T111_lc2_m;
						T111_lc2_lastY++;
					} else {
						T111_lc2_borderX = y*T111_lc2_m + T111_lc2_C;
						T111_lc2_lastY = y;
					}
				}
				if(T111_lc3_horizontal) {
					T111_lc3_cached = (T111_lc3_leftOrAbove ? y <= T111_lc3_borderY : y >= T111_lc3_borderY);
				} else if(T111_lc3_vertical) {
					// nothing
				} else {
					if(T111_lc3_lastY == y - 1) {
						T111_lc3_borderX += T111_lc3_m;
						T111_lc3_lastY++;
					} else {
						T111_lc3_borderX = y*T111_lc3_m + T111_lc3_C;
						T111_lc3_lastY = y;
					}
				}
			}
		}

		if(T112_initializedWithValidData) {
			if(y < T112_miny || y > T112_maxy) {
				T112_okay = false;
			} else {
				T112_okay = true;
				if(T112_lc1_horizontal) {
					T112_lc1_cached = (T112_lc1_leftOrAbove ? y <= T112_lc1_borderY : y >= T112_lc1_borderY);
				} else if(T112_lc1_vertical) {
					// nothing
				} else {
					if(T112_lc1_lastY == y - 1) {
						T112_lc1_borderX += T112_lc1_m;
						T112_lc1_lastY++;
					} else {
						T112_lc1_borderX = y*T112_lc1_m + T112_lc1_C;
						T112_lc1_lastY = y;
					}
				}
				if(T112_lc2_horizontal) {
					T112_lc2_cached = (T112_lc2_leftOrAbove ? y <= T112_lc2_borderY : y >= T112_lc2_borderY);
				} else if(T112_lc2_vertical) {
					// nothing
				} else {
					if(T112_lc2_lastY == y - 1) {
						T112_lc2_borderX += T112_lc2_m;
						T112_lc2_lastY++;
					} else {
						T112_lc2_borderX = y*T112_lc2_m + T112_lc2_C;
						T112_lc2_lastY = y;
					}
				}
				if(T112_lc3_horizontal) {
					T112_lc3_cached = (T112_lc3_leftOrAbove ? y <= T112_lc3_borderY : y >= T112_lc3_borderY);
				} else if(T112_lc3_vertical) {
					// nothing
				} else {
					if(T112_lc3_lastY == y - 1) {
						T112_lc3_borderX += T112_lc3_m;
						T112_lc3_lastY++;
					} else {
						T112_lc3_borderX = y*T112_lc3_m + T112_lc3_C;
						T112_lc3_lastY = y;
					}
				}
			}
		}

		if(T113_initializedWithValidData) {
			if(y < T113_miny || y > T113_maxy) {
				T113_okay = false;
			} else {
				T113_okay = true;
				if(T113_lc1_horizontal) {
					T113_lc1_cached = (T113_lc1_leftOrAbove ? y <= T113_lc1_borderY : y >= T113_lc1_borderY);
				} else if(T113_lc1_vertical) {
					// nothing
				} else {
					if(T113_lc1_lastY == y - 1) {
						T113_lc1_borderX += T113_lc1_m;
						T113_lc1_lastY++;
					} else {
						T113_lc1_borderX = y*T113_lc1_m + T113_lc1_C;
						T113_lc1_lastY = y;
					}
				}
				if(T113_lc2_horizontal) {
					T113_lc2_cached = (T113_lc2_leftOrAbove ? y <= T113_lc2_borderY : y >= T113_lc2_borderY);
				} else if(T113_lc2_vertical) {
					// nothing
				} else {
					if(T113_lc2_lastY == y - 1) {
						T113_lc2_borderX += T113_lc2_m;
						T113_lc2_lastY++;
					} else {
						T113_lc2_borderX = y*T113_lc2_m + T113_lc2_C;
						T113_lc2_lastY = y;
					}
				}
				if(T113_lc3_horizontal) {
					T113_lc3_cached = (T113_lc3_leftOrAbove ? y <= T113_lc3_borderY : y >= T113_lc3_borderY);
				} else if(T113_lc3_vertical) {
					// nothing
				} else {
					if(T113_lc3_lastY == y - 1) {
						T113_lc3_borderX += T113_lc3_m;
						T113_lc3_lastY++;
					} else {
						T113_lc3_borderX = y*T113_lc3_m + T113_lc3_C;
						T113_lc3_lastY = y;
					}
				}
			}
		}

		if(T114_initializedWithValidData) {
			if(y < T114_miny || y > T114_maxy) {
				T114_okay = false;
			} else {
				T114_okay = true;
				if(T114_lc1_horizontal) {
					T114_lc1_cached = (T114_lc1_leftOrAbove ? y <= T114_lc1_borderY : y >= T114_lc1_borderY);
				} else if(T114_lc1_vertical) {
					// nothing
				} else {
					if(T114_lc1_lastY == y - 1) {
						T114_lc1_borderX += T114_lc1_m;
						T114_lc1_lastY++;
					} else {
						T114_lc1_borderX = y*T114_lc1_m + T114_lc1_C;
						T114_lc1_lastY = y;
					}
				}
				if(T114_lc2_horizontal) {
					T114_lc2_cached = (T114_lc2_leftOrAbove ? y <= T114_lc2_borderY : y >= T114_lc2_borderY);
				} else if(T114_lc2_vertical) {
					// nothing
				} else {
					if(T114_lc2_lastY == y - 1) {
						T114_lc2_borderX += T114_lc2_m;
						T114_lc2_lastY++;
					} else {
						T114_lc2_borderX = y*T114_lc2_m + T114_lc2_C;
						T114_lc2_lastY = y;
					}
				}
				if(T114_lc3_horizontal) {
					T114_lc3_cached = (T114_lc3_leftOrAbove ? y <= T114_lc3_borderY : y >= T114_lc3_borderY);
				} else if(T114_lc3_vertical) {
					// nothing
				} else {
					if(T114_lc3_lastY == y - 1) {
						T114_lc3_borderX += T114_lc3_m;
						T114_lc3_lastY++;
					} else {
						T114_lc3_borderX = y*T114_lc3_m + T114_lc3_C;
						T114_lc3_lastY = y;
					}
				}
			}
		}

		if(T115_initializedWithValidData) {
			if(y < T115_miny || y > T115_maxy) {
				T115_okay = false;
			} else {
				T115_okay = true;
				if(T115_lc1_horizontal) {
					T115_lc1_cached = (T115_lc1_leftOrAbove ? y <= T115_lc1_borderY : y >= T115_lc1_borderY);
				} else if(T115_lc1_vertical) {
					// nothing
				} else {
					if(T115_lc1_lastY == y - 1) {
						T115_lc1_borderX += T115_lc1_m;
						T115_lc1_lastY++;
					} else {
						T115_lc1_borderX = y*T115_lc1_m + T115_lc1_C;
						T115_lc1_lastY = y;
					}
				}
				if(T115_lc2_horizontal) {
					T115_lc2_cached = (T115_lc2_leftOrAbove ? y <= T115_lc2_borderY : y >= T115_lc2_borderY);
				} else if(T115_lc2_vertical) {
					// nothing
				} else {
					if(T115_lc2_lastY == y - 1) {
						T115_lc2_borderX += T115_lc2_m;
						T115_lc2_lastY++;
					} else {
						T115_lc2_borderX = y*T115_lc2_m + T115_lc2_C;
						T115_lc2_lastY = y;
					}
				}
				if(T115_lc3_horizontal) {
					T115_lc3_cached = (T115_lc3_leftOrAbove ? y <= T115_lc3_borderY : y >= T115_lc3_borderY);
				} else if(T115_lc3_vertical) {
					// nothing
				} else {
					if(T115_lc3_lastY == y - 1) {
						T115_lc3_borderX += T115_lc3_m;
						T115_lc3_lastY++;
					} else {
						T115_lc3_borderX = y*T115_lc3_m + T115_lc3_C;
						T115_lc3_lastY = y;
					}
				}
			}
		}

		if(T116_initializedWithValidData) {
			if(y < T116_miny || y > T116_maxy) {
				T116_okay = false;
			} else {
				T116_okay = true;
				if(T116_lc1_horizontal) {
					T116_lc1_cached = (T116_lc1_leftOrAbove ? y <= T116_lc1_borderY : y >= T116_lc1_borderY);
				} else if(T116_lc1_vertical) {
					// nothing
				} else {
					if(T116_lc1_lastY == y - 1) {
						T116_lc1_borderX += T116_lc1_m;
						T116_lc1_lastY++;
					} else {
						T116_lc1_borderX = y*T116_lc1_m + T116_lc1_C;
						T116_lc1_lastY = y;
					}
				}
				if(T116_lc2_horizontal) {
					T116_lc2_cached = (T116_lc2_leftOrAbove ? y <= T116_lc2_borderY : y >= T116_lc2_borderY);
				} else if(T116_lc2_vertical) {
					// nothing
				} else {
					if(T116_lc2_lastY == y - 1) {
						T116_lc2_borderX += T116_lc2_m;
						T116_lc2_lastY++;
					} else {
						T116_lc2_borderX = y*T116_lc2_m + T116_lc2_C;
						T116_lc2_lastY = y;
					}
				}
				if(T116_lc3_horizontal) {
					T116_lc3_cached = (T116_lc3_leftOrAbove ? y <= T116_lc3_borderY : y >= T116_lc3_borderY);
				} else if(T116_lc3_vertical) {
					// nothing
				} else {
					if(T116_lc3_lastY == y - 1) {
						T116_lc3_borderX += T116_lc3_m;
						T116_lc3_lastY++;
					} else {
						T116_lc3_borderX = y*T116_lc3_m + T116_lc3_C;
						T116_lc3_lastY = y;
					}
				}
			}
		}

		if(T117_initializedWithValidData) {
			if(y < T117_miny || y > T117_maxy) {
				T117_okay = false;
			} else {
				T117_okay = true;
				if(T117_lc1_horizontal) {
					T117_lc1_cached = (T117_lc1_leftOrAbove ? y <= T117_lc1_borderY : y >= T117_lc1_borderY);
				} else if(T117_lc1_vertical) {
					// nothing
				} else {
					if(T117_lc1_lastY == y - 1) {
						T117_lc1_borderX += T117_lc1_m;
						T117_lc1_lastY++;
					} else {
						T117_lc1_borderX = y*T117_lc1_m + T117_lc1_C;
						T117_lc1_lastY = y;
					}
				}
				if(T117_lc2_horizontal) {
					T117_lc2_cached = (T117_lc2_leftOrAbove ? y <= T117_lc2_borderY : y >= T117_lc2_borderY);
				} else if(T117_lc2_vertical) {
					// nothing
				} else {
					if(T117_lc2_lastY == y - 1) {
						T117_lc2_borderX += T117_lc2_m;
						T117_lc2_lastY++;
					} else {
						T117_lc2_borderX = y*T117_lc2_m + T117_lc2_C;
						T117_lc2_lastY = y;
					}
				}
				if(T117_lc3_horizontal) {
					T117_lc3_cached = (T117_lc3_leftOrAbove ? y <= T117_lc3_borderY : y >= T117_lc3_borderY);
				} else if(T117_lc3_vertical) {
					// nothing
				} else {
					if(T117_lc3_lastY == y - 1) {
						T117_lc3_borderX += T117_lc3_m;
						T117_lc3_lastY++;
					} else {
						T117_lc3_borderX = y*T117_lc3_m + T117_lc3_C;
						T117_lc3_lastY = y;
					}
				}
			}
		}

		if(T118_initializedWithValidData) {
			if(y < T118_miny || y > T118_maxy) {
				T118_okay = false;
			} else {
				T118_okay = true;
				if(T118_lc1_horizontal) {
					T118_lc1_cached = (T118_lc1_leftOrAbove ? y <= T118_lc1_borderY : y >= T118_lc1_borderY);
				} else if(T118_lc1_vertical) {
					// nothing
				} else {
					if(T118_lc1_lastY == y - 1) {
						T118_lc1_borderX += T118_lc1_m;
						T118_lc1_lastY++;
					} else {
						T118_lc1_borderX = y*T118_lc1_m + T118_lc1_C;
						T118_lc1_lastY = y;
					}
				}
				if(T118_lc2_horizontal) {
					T118_lc2_cached = (T118_lc2_leftOrAbove ? y <= T118_lc2_borderY : y >= T118_lc2_borderY);
				} else if(T118_lc2_vertical) {
					// nothing
				} else {
					if(T118_lc2_lastY == y - 1) {
						T118_lc2_borderX += T118_lc2_m;
						T118_lc2_lastY++;
					} else {
						T118_lc2_borderX = y*T118_lc2_m + T118_lc2_C;
						T118_lc2_lastY = y;
					}
				}
				if(T118_lc3_horizontal) {
					T118_lc3_cached = (T118_lc3_leftOrAbove ? y <= T118_lc3_borderY : y >= T118_lc3_borderY);
				} else if(T118_lc3_vertical) {
					// nothing
				} else {
					if(T118_lc3_lastY == y - 1) {
						T118_lc3_borderX += T118_lc3_m;
						T118_lc3_lastY++;
					} else {
						T118_lc3_borderX = y*T118_lc3_m + T118_lc3_C;
						T118_lc3_lastY = y;
					}
				}
			}
		}

		if(T119_initializedWithValidData) {
			if(y < T119_miny || y > T119_maxy) {
				T119_okay = false;
			} else {
				T119_okay = true;
				if(T119_lc1_horizontal) {
					T119_lc1_cached = (T119_lc1_leftOrAbove ? y <= T119_lc1_borderY : y >= T119_lc1_borderY);
				} else if(T119_lc1_vertical) {
					// nothing
				} else {
					if(T119_lc1_lastY == y - 1) {
						T119_lc1_borderX += T119_lc1_m;
						T119_lc1_lastY++;
					} else {
						T119_lc1_borderX = y*T119_lc1_m + T119_lc1_C;
						T119_lc1_lastY = y;
					}
				}
				if(T119_lc2_horizontal) {
					T119_lc2_cached = (T119_lc2_leftOrAbove ? y <= T119_lc2_borderY : y >= T119_lc2_borderY);
				} else if(T119_lc2_vertical) {
					// nothing
				} else {
					if(T119_lc2_lastY == y - 1) {
						T119_lc2_borderX += T119_lc2_m;
						T119_lc2_lastY++;
					} else {
						T119_lc2_borderX = y*T119_lc2_m + T119_lc2_C;
						T119_lc2_lastY = y;
					}
				}
				if(T119_lc3_horizontal) {
					T119_lc3_cached = (T119_lc3_leftOrAbove ? y <= T119_lc3_borderY : y >= T119_lc3_borderY);
				} else if(T119_lc3_vertical) {
					// nothing
				} else {
					if(T119_lc3_lastY == y - 1) {
						T119_lc3_borderX += T119_lc3_m;
						T119_lc3_lastY++;
					} else {
						T119_lc3_borderX = y*T119_lc3_m + T119_lc3_C;
						T119_lc3_lastY = y;
					}
				}
			}
		}
	}

	public void moveToY5(int y) {

		if(T120_initializedWithValidData) {
			if(y < T120_miny || y > T120_maxy) {
				T120_okay = false;
			} else {
				T120_okay = true;
				if(T120_lc1_horizontal) {
					T120_lc1_cached = (T120_lc1_leftOrAbove ? y <= T120_lc1_borderY : y >= T120_lc1_borderY);
				} else if(T120_lc1_vertical) {
					// nothing
				} else {
					if(T120_lc1_lastY == y - 1) {
						T120_lc1_borderX += T120_lc1_m;
						T120_lc1_lastY++;
					} else {
						T120_lc1_borderX = y*T120_lc1_m + T120_lc1_C;
						T120_lc1_lastY = y;
					}
				}
				if(T120_lc2_horizontal) {
					T120_lc2_cached = (T120_lc2_leftOrAbove ? y <= T120_lc2_borderY : y >= T120_lc2_borderY);
				} else if(T120_lc2_vertical) {
					// nothing
				} else {
					if(T120_lc2_lastY == y - 1) {
						T120_lc2_borderX += T120_lc2_m;
						T120_lc2_lastY++;
					} else {
						T120_lc2_borderX = y*T120_lc2_m + T120_lc2_C;
						T120_lc2_lastY = y;
					}
				}
				if(T120_lc3_horizontal) {
					T120_lc3_cached = (T120_lc3_leftOrAbove ? y <= T120_lc3_borderY : y >= T120_lc3_borderY);
				} else if(T120_lc3_vertical) {
					// nothing
				} else {
					if(T120_lc3_lastY == y - 1) {
						T120_lc3_borderX += T120_lc3_m;
						T120_lc3_lastY++;
					} else {
						T120_lc3_borderX = y*T120_lc3_m + T120_lc3_C;
						T120_lc3_lastY = y;
					}
				}
			}
		}

		if(T121_initializedWithValidData) {
			if(y < T121_miny || y > T121_maxy) {
				T121_okay = false;
			} else {
				T121_okay = true;
				if(T121_lc1_horizontal) {
					T121_lc1_cached = (T121_lc1_leftOrAbove ? y <= T121_lc1_borderY : y >= T121_lc1_borderY);
				} else if(T121_lc1_vertical) {
					// nothing
				} else {
					if(T121_lc1_lastY == y - 1) {
						T121_lc1_borderX += T121_lc1_m;
						T121_lc1_lastY++;
					} else {
						T121_lc1_borderX = y*T121_lc1_m + T121_lc1_C;
						T121_lc1_lastY = y;
					}
				}
				if(T121_lc2_horizontal) {
					T121_lc2_cached = (T121_lc2_leftOrAbove ? y <= T121_lc2_borderY : y >= T121_lc2_borderY);
				} else if(T121_lc2_vertical) {
					// nothing
				} else {
					if(T121_lc2_lastY == y - 1) {
						T121_lc2_borderX += T121_lc2_m;
						T121_lc2_lastY++;
					} else {
						T121_lc2_borderX = y*T121_lc2_m + T121_lc2_C;
						T121_lc2_lastY = y;
					}
				}
				if(T121_lc3_horizontal) {
					T121_lc3_cached = (T121_lc3_leftOrAbove ? y <= T121_lc3_borderY : y >= T121_lc3_borderY);
				} else if(T121_lc3_vertical) {
					// nothing
				} else {
					if(T121_lc3_lastY == y - 1) {
						T121_lc3_borderX += T121_lc3_m;
						T121_lc3_lastY++;
					} else {
						T121_lc3_borderX = y*T121_lc3_m + T121_lc3_C;
						T121_lc3_lastY = y;
					}
				}
			}
		}

		if(T122_initializedWithValidData) {
			if(y < T122_miny || y > T122_maxy) {
				T122_okay = false;
			} else {
				T122_okay = true;
				if(T122_lc1_horizontal) {
					T122_lc1_cached = (T122_lc1_leftOrAbove ? y <= T122_lc1_borderY : y >= T122_lc1_borderY);
				} else if(T122_lc1_vertical) {
					// nothing
				} else {
					if(T122_lc1_lastY == y - 1) {
						T122_lc1_borderX += T122_lc1_m;
						T122_lc1_lastY++;
					} else {
						T122_lc1_borderX = y*T122_lc1_m + T122_lc1_C;
						T122_lc1_lastY = y;
					}
				}
				if(T122_lc2_horizontal) {
					T122_lc2_cached = (T122_lc2_leftOrAbove ? y <= T122_lc2_borderY : y >= T122_lc2_borderY);
				} else if(T122_lc2_vertical) {
					// nothing
				} else {
					if(T122_lc2_lastY == y - 1) {
						T122_lc2_borderX += T122_lc2_m;
						T122_lc2_lastY++;
					} else {
						T122_lc2_borderX = y*T122_lc2_m + T122_lc2_C;
						T122_lc2_lastY = y;
					}
				}
				if(T122_lc3_horizontal) {
					T122_lc3_cached = (T122_lc3_leftOrAbove ? y <= T122_lc3_borderY : y >= T122_lc3_borderY);
				} else if(T122_lc3_vertical) {
					// nothing
				} else {
					if(T122_lc3_lastY == y - 1) {
						T122_lc3_borderX += T122_lc3_m;
						T122_lc3_lastY++;
					} else {
						T122_lc3_borderX = y*T122_lc3_m + T122_lc3_C;
						T122_lc3_lastY = y;
					}
				}
			}
		}

		if(T123_initializedWithValidData) {
			if(y < T123_miny || y > T123_maxy) {
				T123_okay = false;
			} else {
				T123_okay = true;
				if(T123_lc1_horizontal) {
					T123_lc1_cached = (T123_lc1_leftOrAbove ? y <= T123_lc1_borderY : y >= T123_lc1_borderY);
				} else if(T123_lc1_vertical) {
					// nothing
				} else {
					if(T123_lc1_lastY == y - 1) {
						T123_lc1_borderX += T123_lc1_m;
						T123_lc1_lastY++;
					} else {
						T123_lc1_borderX = y*T123_lc1_m + T123_lc1_C;
						T123_lc1_lastY = y;
					}
				}
				if(T123_lc2_horizontal) {
					T123_lc2_cached = (T123_lc2_leftOrAbove ? y <= T123_lc2_borderY : y >= T123_lc2_borderY);
				} else if(T123_lc2_vertical) {
					// nothing
				} else {
					if(T123_lc2_lastY == y - 1) {
						T123_lc2_borderX += T123_lc2_m;
						T123_lc2_lastY++;
					} else {
						T123_lc2_borderX = y*T123_lc2_m + T123_lc2_C;
						T123_lc2_lastY = y;
					}
				}
				if(T123_lc3_horizontal) {
					T123_lc3_cached = (T123_lc3_leftOrAbove ? y <= T123_lc3_borderY : y >= T123_lc3_borderY);
				} else if(T123_lc3_vertical) {
					// nothing
				} else {
					if(T123_lc3_lastY == y - 1) {
						T123_lc3_borderX += T123_lc3_m;
						T123_lc3_lastY++;
					} else {
						T123_lc3_borderX = y*T123_lc3_m + T123_lc3_C;
						T123_lc3_lastY = y;
					}
				}
			}
		}

		if(T124_initializedWithValidData) {
			if(y < T124_miny || y > T124_maxy) {
				T124_okay = false;
			} else {
				T124_okay = true;
				if(T124_lc1_horizontal) {
					T124_lc1_cached = (T124_lc1_leftOrAbove ? y <= T124_lc1_borderY : y >= T124_lc1_borderY);
				} else if(T124_lc1_vertical) {
					// nothing
				} else {
					if(T124_lc1_lastY == y - 1) {
						T124_lc1_borderX += T124_lc1_m;
						T124_lc1_lastY++;
					} else {
						T124_lc1_borderX = y*T124_lc1_m + T124_lc1_C;
						T124_lc1_lastY = y;
					}
				}
				if(T124_lc2_horizontal) {
					T124_lc2_cached = (T124_lc2_leftOrAbove ? y <= T124_lc2_borderY : y >= T124_lc2_borderY);
				} else if(T124_lc2_vertical) {
					// nothing
				} else {
					if(T124_lc2_lastY == y - 1) {
						T124_lc2_borderX += T124_lc2_m;
						T124_lc2_lastY++;
					} else {
						T124_lc2_borderX = y*T124_lc2_m + T124_lc2_C;
						T124_lc2_lastY = y;
					}
				}
				if(T124_lc3_horizontal) {
					T124_lc3_cached = (T124_lc3_leftOrAbove ? y <= T124_lc3_borderY : y >= T124_lc3_borderY);
				} else if(T124_lc3_vertical) {
					// nothing
				} else {
					if(T124_lc3_lastY == y - 1) {
						T124_lc3_borderX += T124_lc3_m;
						T124_lc3_lastY++;
					} else {
						T124_lc3_borderX = y*T124_lc3_m + T124_lc3_C;
						T124_lc3_lastY = y;
					}
				}
			}
		}

		if(T125_initializedWithValidData) {
			if(y < T125_miny || y > T125_maxy) {
				T125_okay = false;
			} else {
				T125_okay = true;
				if(T125_lc1_horizontal) {
					T125_lc1_cached = (T125_lc1_leftOrAbove ? y <= T125_lc1_borderY : y >= T125_lc1_borderY);
				} else if(T125_lc1_vertical) {
					// nothing
				} else {
					if(T125_lc1_lastY == y - 1) {
						T125_lc1_borderX += T125_lc1_m;
						T125_lc1_lastY++;
					} else {
						T125_lc1_borderX = y*T125_lc1_m + T125_lc1_C;
						T125_lc1_lastY = y;
					}
				}
				if(T125_lc2_horizontal) {
					T125_lc2_cached = (T125_lc2_leftOrAbove ? y <= T125_lc2_borderY : y >= T125_lc2_borderY);
				} else if(T125_lc2_vertical) {
					// nothing
				} else {
					if(T125_lc2_lastY == y - 1) {
						T125_lc2_borderX += T125_lc2_m;
						T125_lc2_lastY++;
					} else {
						T125_lc2_borderX = y*T125_lc2_m + T125_lc2_C;
						T125_lc2_lastY = y;
					}
				}
				if(T125_lc3_horizontal) {
					T125_lc3_cached = (T125_lc3_leftOrAbove ? y <= T125_lc3_borderY : y >= T125_lc3_borderY);
				} else if(T125_lc3_vertical) {
					// nothing
				} else {
					if(T125_lc3_lastY == y - 1) {
						T125_lc3_borderX += T125_lc3_m;
						T125_lc3_lastY++;
					} else {
						T125_lc3_borderX = y*T125_lc3_m + T125_lc3_C;
						T125_lc3_lastY = y;
					}
				}
			}
		}

		if(T126_initializedWithValidData) {
			if(y < T126_miny || y > T126_maxy) {
				T126_okay = false;
			} else {
				T126_okay = true;
				if(T126_lc1_horizontal) {
					T126_lc1_cached = (T126_lc1_leftOrAbove ? y <= T126_lc1_borderY : y >= T126_lc1_borderY);
				} else if(T126_lc1_vertical) {
					// nothing
				} else {
					if(T126_lc1_lastY == y - 1) {
						T126_lc1_borderX += T126_lc1_m;
						T126_lc1_lastY++;
					} else {
						T126_lc1_borderX = y*T126_lc1_m + T126_lc1_C;
						T126_lc1_lastY = y;
					}
				}
				if(T126_lc2_horizontal) {
					T126_lc2_cached = (T126_lc2_leftOrAbove ? y <= T126_lc2_borderY : y >= T126_lc2_borderY);
				} else if(T126_lc2_vertical) {
					// nothing
				} else {
					if(T126_lc2_lastY == y - 1) {
						T126_lc2_borderX += T126_lc2_m;
						T126_lc2_lastY++;
					} else {
						T126_lc2_borderX = y*T126_lc2_m + T126_lc2_C;
						T126_lc2_lastY = y;
					}
				}
				if(T126_lc3_horizontal) {
					T126_lc3_cached = (T126_lc3_leftOrAbove ? y <= T126_lc3_borderY : y >= T126_lc3_borderY);
				} else if(T126_lc3_vertical) {
					// nothing
				} else {
					if(T126_lc3_lastY == y - 1) {
						T126_lc3_borderX += T126_lc3_m;
						T126_lc3_lastY++;
					} else {
						T126_lc3_borderX = y*T126_lc3_m + T126_lc3_C;
						T126_lc3_lastY = y;
					}
				}
			}
		}

		if(T127_initializedWithValidData) {
			if(y < T127_miny || y > T127_maxy) {
				T127_okay = false;
			} else {
				T127_okay = true;
				if(T127_lc1_horizontal) {
					T127_lc1_cached = (T127_lc1_leftOrAbove ? y <= T127_lc1_borderY : y >= T127_lc1_borderY);
				} else if(T127_lc1_vertical) {
					// nothing
				} else {
					if(T127_lc1_lastY == y - 1) {
						T127_lc1_borderX += T127_lc1_m;
						T127_lc1_lastY++;
					} else {
						T127_lc1_borderX = y*T127_lc1_m + T127_lc1_C;
						T127_lc1_lastY = y;
					}
				}
				if(T127_lc2_horizontal) {
					T127_lc2_cached = (T127_lc2_leftOrAbove ? y <= T127_lc2_borderY : y >= T127_lc2_borderY);
				} else if(T127_lc2_vertical) {
					// nothing
				} else {
					if(T127_lc2_lastY == y - 1) {
						T127_lc2_borderX += T127_lc2_m;
						T127_lc2_lastY++;
					} else {
						T127_lc2_borderX = y*T127_lc2_m + T127_lc2_C;
						T127_lc2_lastY = y;
					}
				}
				if(T127_lc3_horizontal) {
					T127_lc3_cached = (T127_lc3_leftOrAbove ? y <= T127_lc3_borderY : y >= T127_lc3_borderY);
				} else if(T127_lc3_vertical) {
					// nothing
				} else {
					if(T127_lc3_lastY == y - 1) {
						T127_lc3_borderX += T127_lc3_m;
						T127_lc3_lastY++;
					} else {
						T127_lc3_borderX = y*T127_lc3_m + T127_lc3_C;
						T127_lc3_lastY = y;
					}
				}
			}
		}

		if(T128_initializedWithValidData) {
			if(y < T128_miny || y > T128_maxy) {
				T128_okay = false;
			} else {
				T128_okay = true;
				if(T128_lc1_horizontal) {
					T128_lc1_cached = (T128_lc1_leftOrAbove ? y <= T128_lc1_borderY : y >= T128_lc1_borderY);
				} else if(T128_lc1_vertical) {
					// nothing
				} else {
					if(T128_lc1_lastY == y - 1) {
						T128_lc1_borderX += T128_lc1_m;
						T128_lc1_lastY++;
					} else {
						T128_lc1_borderX = y*T128_lc1_m + T128_lc1_C;
						T128_lc1_lastY = y;
					}
				}
				if(T128_lc2_horizontal) {
					T128_lc2_cached = (T128_lc2_leftOrAbove ? y <= T128_lc2_borderY : y >= T128_lc2_borderY);
				} else if(T128_lc2_vertical) {
					// nothing
				} else {
					if(T128_lc2_lastY == y - 1) {
						T128_lc2_borderX += T128_lc2_m;
						T128_lc2_lastY++;
					} else {
						T128_lc2_borderX = y*T128_lc2_m + T128_lc2_C;
						T128_lc2_lastY = y;
					}
				}
				if(T128_lc3_horizontal) {
					T128_lc3_cached = (T128_lc3_leftOrAbove ? y <= T128_lc3_borderY : y >= T128_lc3_borderY);
				} else if(T128_lc3_vertical) {
					// nothing
				} else {
					if(T128_lc3_lastY == y - 1) {
						T128_lc3_borderX += T128_lc3_m;
						T128_lc3_lastY++;
					} else {
						T128_lc3_borderX = y*T128_lc3_m + T128_lc3_C;
						T128_lc3_lastY = y;
					}
				}
			}
		}

		if(T129_initializedWithValidData) {
			if(y < T129_miny || y > T129_maxy) {
				T129_okay = false;
			} else {
				T129_okay = true;
				if(T129_lc1_horizontal) {
					T129_lc1_cached = (T129_lc1_leftOrAbove ? y <= T129_lc1_borderY : y >= T129_lc1_borderY);
				} else if(T129_lc1_vertical) {
					// nothing
				} else {
					if(T129_lc1_lastY == y - 1) {
						T129_lc1_borderX += T129_lc1_m;
						T129_lc1_lastY++;
					} else {
						T129_lc1_borderX = y*T129_lc1_m + T129_lc1_C;
						T129_lc1_lastY = y;
					}
				}
				if(T129_lc2_horizontal) {
					T129_lc2_cached = (T129_lc2_leftOrAbove ? y <= T129_lc2_borderY : y >= T129_lc2_borderY);
				} else if(T129_lc2_vertical) {
					// nothing
				} else {
					if(T129_lc2_lastY == y - 1) {
						T129_lc2_borderX += T129_lc2_m;
						T129_lc2_lastY++;
					} else {
						T129_lc2_borderX = y*T129_lc2_m + T129_lc2_C;
						T129_lc2_lastY = y;
					}
				}
				if(T129_lc3_horizontal) {
					T129_lc3_cached = (T129_lc3_leftOrAbove ? y <= T129_lc3_borderY : y >= T129_lc3_borderY);
				} else if(T129_lc3_vertical) {
					// nothing
				} else {
					if(T129_lc3_lastY == y - 1) {
						T129_lc3_borderX += T129_lc3_m;
						T129_lc3_lastY++;
					} else {
						T129_lc3_borderX = y*T129_lc3_m + T129_lc3_C;
						T129_lc3_lastY = y;
					}
				}
			}
		}

		if(T130_initializedWithValidData) {
			if(y < T130_miny || y > T130_maxy) {
				T130_okay = false;
			} else {
				T130_okay = true;
				if(T130_lc1_horizontal) {
					T130_lc1_cached = (T130_lc1_leftOrAbove ? y <= T130_lc1_borderY : y >= T130_lc1_borderY);
				} else if(T130_lc1_vertical) {
					// nothing
				} else {
					if(T130_lc1_lastY == y - 1) {
						T130_lc1_borderX += T130_lc1_m;
						T130_lc1_lastY++;
					} else {
						T130_lc1_borderX = y*T130_lc1_m + T130_lc1_C;
						T130_lc1_lastY = y;
					}
				}
				if(T130_lc2_horizontal) {
					T130_lc2_cached = (T130_lc2_leftOrAbove ? y <= T130_lc2_borderY : y >= T130_lc2_borderY);
				} else if(T130_lc2_vertical) {
					// nothing
				} else {
					if(T130_lc2_lastY == y - 1) {
						T130_lc2_borderX += T130_lc2_m;
						T130_lc2_lastY++;
					} else {
						T130_lc2_borderX = y*T130_lc2_m + T130_lc2_C;
						T130_lc2_lastY = y;
					}
				}
				if(T130_lc3_horizontal) {
					T130_lc3_cached = (T130_lc3_leftOrAbove ? y <= T130_lc3_borderY : y >= T130_lc3_borderY);
				} else if(T130_lc3_vertical) {
					// nothing
				} else {
					if(T130_lc3_lastY == y - 1) {
						T130_lc3_borderX += T130_lc3_m;
						T130_lc3_lastY++;
					} else {
						T130_lc3_borderX = y*T130_lc3_m + T130_lc3_C;
						T130_lc3_lastY = y;
					}
				}
			}
		}

		if(T131_initializedWithValidData) {
			if(y < T131_miny || y > T131_maxy) {
				T131_okay = false;
			} else {
				T131_okay = true;
				if(T131_lc1_horizontal) {
					T131_lc1_cached = (T131_lc1_leftOrAbove ? y <= T131_lc1_borderY : y >= T131_lc1_borderY);
				} else if(T131_lc1_vertical) {
					// nothing
				} else {
					if(T131_lc1_lastY == y - 1) {
						T131_lc1_borderX += T131_lc1_m;
						T131_lc1_lastY++;
					} else {
						T131_lc1_borderX = y*T131_lc1_m + T131_lc1_C;
						T131_lc1_lastY = y;
					}
				}
				if(T131_lc2_horizontal) {
					T131_lc2_cached = (T131_lc2_leftOrAbove ? y <= T131_lc2_borderY : y >= T131_lc2_borderY);
				} else if(T131_lc2_vertical) {
					// nothing
				} else {
					if(T131_lc2_lastY == y - 1) {
						T131_lc2_borderX += T131_lc2_m;
						T131_lc2_lastY++;
					} else {
						T131_lc2_borderX = y*T131_lc2_m + T131_lc2_C;
						T131_lc2_lastY = y;
					}
				}
				if(T131_lc3_horizontal) {
					T131_lc3_cached = (T131_lc3_leftOrAbove ? y <= T131_lc3_borderY : y >= T131_lc3_borderY);
				} else if(T131_lc3_vertical) {
					// nothing
				} else {
					if(T131_lc3_lastY == y - 1) {
						T131_lc3_borderX += T131_lc3_m;
						T131_lc3_lastY++;
					} else {
						T131_lc3_borderX = y*T131_lc3_m + T131_lc3_C;
						T131_lc3_lastY = y;
					}
				}
			}
		}

		if(T132_initializedWithValidData) {
			if(y < T132_miny || y > T132_maxy) {
				T132_okay = false;
			} else {
				T132_okay = true;
				if(T132_lc1_horizontal) {
					T132_lc1_cached = (T132_lc1_leftOrAbove ? y <= T132_lc1_borderY : y >= T132_lc1_borderY);
				} else if(T132_lc1_vertical) {
					// nothing
				} else {
					if(T132_lc1_lastY == y - 1) {
						T132_lc1_borderX += T132_lc1_m;
						T132_lc1_lastY++;
					} else {
						T132_lc1_borderX = y*T132_lc1_m + T132_lc1_C;
						T132_lc1_lastY = y;
					}
				}
				if(T132_lc2_horizontal) {
					T132_lc2_cached = (T132_lc2_leftOrAbove ? y <= T132_lc2_borderY : y >= T132_lc2_borderY);
				} else if(T132_lc2_vertical) {
					// nothing
				} else {
					if(T132_lc2_lastY == y - 1) {
						T132_lc2_borderX += T132_lc2_m;
						T132_lc2_lastY++;
					} else {
						T132_lc2_borderX = y*T132_lc2_m + T132_lc2_C;
						T132_lc2_lastY = y;
					}
				}
				if(T132_lc3_horizontal) {
					T132_lc3_cached = (T132_lc3_leftOrAbove ? y <= T132_lc3_borderY : y >= T132_lc3_borderY);
				} else if(T132_lc3_vertical) {
					// nothing
				} else {
					if(T132_lc3_lastY == y - 1) {
						T132_lc3_borderX += T132_lc3_m;
						T132_lc3_lastY++;
					} else {
						T132_lc3_borderX = y*T132_lc3_m + T132_lc3_C;
						T132_lc3_lastY = y;
					}
				}
			}
		}

		if(T133_initializedWithValidData) {
			if(y < T133_miny || y > T133_maxy) {
				T133_okay = false;
			} else {
				T133_okay = true;
				if(T133_lc1_horizontal) {
					T133_lc1_cached = (T133_lc1_leftOrAbove ? y <= T133_lc1_borderY : y >= T133_lc1_borderY);
				} else if(T133_lc1_vertical) {
					// nothing
				} else {
					if(T133_lc1_lastY == y - 1) {
						T133_lc1_borderX += T133_lc1_m;
						T133_lc1_lastY++;
					} else {
						T133_lc1_borderX = y*T133_lc1_m + T133_lc1_C;
						T133_lc1_lastY = y;
					}
				}
				if(T133_lc2_horizontal) {
					T133_lc2_cached = (T133_lc2_leftOrAbove ? y <= T133_lc2_borderY : y >= T133_lc2_borderY);
				} else if(T133_lc2_vertical) {
					// nothing
				} else {
					if(T133_lc2_lastY == y - 1) {
						T133_lc2_borderX += T133_lc2_m;
						T133_lc2_lastY++;
					} else {
						T133_lc2_borderX = y*T133_lc2_m + T133_lc2_C;
						T133_lc2_lastY = y;
					}
				}
				if(T133_lc3_horizontal) {
					T133_lc3_cached = (T133_lc3_leftOrAbove ? y <= T133_lc3_borderY : y >= T133_lc3_borderY);
				} else if(T133_lc3_vertical) {
					// nothing
				} else {
					if(T133_lc3_lastY == y - 1) {
						T133_lc3_borderX += T133_lc3_m;
						T133_lc3_lastY++;
					} else {
						T133_lc3_borderX = y*T133_lc3_m + T133_lc3_C;
						T133_lc3_lastY = y;
					}
				}
			}
		}

		if(T134_initializedWithValidData) {
			if(y < T134_miny || y > T134_maxy) {
				T134_okay = false;
			} else {
				T134_okay = true;
				if(T134_lc1_horizontal) {
					T134_lc1_cached = (T134_lc1_leftOrAbove ? y <= T134_lc1_borderY : y >= T134_lc1_borderY);
				} else if(T134_lc1_vertical) {
					// nothing
				} else {
					if(T134_lc1_lastY == y - 1) {
						T134_lc1_borderX += T134_lc1_m;
						T134_lc1_lastY++;
					} else {
						T134_lc1_borderX = y*T134_lc1_m + T134_lc1_C;
						T134_lc1_lastY = y;
					}
				}
				if(T134_lc2_horizontal) {
					T134_lc2_cached = (T134_lc2_leftOrAbove ? y <= T134_lc2_borderY : y >= T134_lc2_borderY);
				} else if(T134_lc2_vertical) {
					// nothing
				} else {
					if(T134_lc2_lastY == y - 1) {
						T134_lc2_borderX += T134_lc2_m;
						T134_lc2_lastY++;
					} else {
						T134_lc2_borderX = y*T134_lc2_m + T134_lc2_C;
						T134_lc2_lastY = y;
					}
				}
				if(T134_lc3_horizontal) {
					T134_lc3_cached = (T134_lc3_leftOrAbove ? y <= T134_lc3_borderY : y >= T134_lc3_borderY);
				} else if(T134_lc3_vertical) {
					// nothing
				} else {
					if(T134_lc3_lastY == y - 1) {
						T134_lc3_borderX += T134_lc3_m;
						T134_lc3_lastY++;
					} else {
						T134_lc3_borderX = y*T134_lc3_m + T134_lc3_C;
						T134_lc3_lastY = y;
					}
				}
			}
		}

		if(T135_initializedWithValidData) {
			if(y < T135_miny || y > T135_maxy) {
				T135_okay = false;
			} else {
				T135_okay = true;
				if(T135_lc1_horizontal) {
					T135_lc1_cached = (T135_lc1_leftOrAbove ? y <= T135_lc1_borderY : y >= T135_lc1_borderY);
				} else if(T135_lc1_vertical) {
					// nothing
				} else {
					if(T135_lc1_lastY == y - 1) {
						T135_lc1_borderX += T135_lc1_m;
						T135_lc1_lastY++;
					} else {
						T135_lc1_borderX = y*T135_lc1_m + T135_lc1_C;
						T135_lc1_lastY = y;
					}
				}
				if(T135_lc2_horizontal) {
					T135_lc2_cached = (T135_lc2_leftOrAbove ? y <= T135_lc2_borderY : y >= T135_lc2_borderY);
				} else if(T135_lc2_vertical) {
					// nothing
				} else {
					if(T135_lc2_lastY == y - 1) {
						T135_lc2_borderX += T135_lc2_m;
						T135_lc2_lastY++;
					} else {
						T135_lc2_borderX = y*T135_lc2_m + T135_lc2_C;
						T135_lc2_lastY = y;
					}
				}
				if(T135_lc3_horizontal) {
					T135_lc3_cached = (T135_lc3_leftOrAbove ? y <= T135_lc3_borderY : y >= T135_lc3_borderY);
				} else if(T135_lc3_vertical) {
					// nothing
				} else {
					if(T135_lc3_lastY == y - 1) {
						T135_lc3_borderX += T135_lc3_m;
						T135_lc3_lastY++;
					} else {
						T135_lc3_borderX = y*T135_lc3_m + T135_lc3_C;
						T135_lc3_lastY = y;
					}
				}
			}
		}

		if(T136_initializedWithValidData) {
			if(y < T136_miny || y > T136_maxy) {
				T136_okay = false;
			} else {
				T136_okay = true;
				if(T136_lc1_horizontal) {
					T136_lc1_cached = (T136_lc1_leftOrAbove ? y <= T136_lc1_borderY : y >= T136_lc1_borderY);
				} else if(T136_lc1_vertical) {
					// nothing
				} else {
					if(T136_lc1_lastY == y - 1) {
						T136_lc1_borderX += T136_lc1_m;
						T136_lc1_lastY++;
					} else {
						T136_lc1_borderX = y*T136_lc1_m + T136_lc1_C;
						T136_lc1_lastY = y;
					}
				}
				if(T136_lc2_horizontal) {
					T136_lc2_cached = (T136_lc2_leftOrAbove ? y <= T136_lc2_borderY : y >= T136_lc2_borderY);
				} else if(T136_lc2_vertical) {
					// nothing
				} else {
					if(T136_lc2_lastY == y - 1) {
						T136_lc2_borderX += T136_lc2_m;
						T136_lc2_lastY++;
					} else {
						T136_lc2_borderX = y*T136_lc2_m + T136_lc2_C;
						T136_lc2_lastY = y;
					}
				}
				if(T136_lc3_horizontal) {
					T136_lc3_cached = (T136_lc3_leftOrAbove ? y <= T136_lc3_borderY : y >= T136_lc3_borderY);
				} else if(T136_lc3_vertical) {
					// nothing
				} else {
					if(T136_lc3_lastY == y - 1) {
						T136_lc3_borderX += T136_lc3_m;
						T136_lc3_lastY++;
					} else {
						T136_lc3_borderX = y*T136_lc3_m + T136_lc3_C;
						T136_lc3_lastY = y;
					}
				}
			}
		}

		if(T137_initializedWithValidData) {
			if(y < T137_miny || y > T137_maxy) {
				T137_okay = false;
			} else {
				T137_okay = true;
				if(T137_lc1_horizontal) {
					T137_lc1_cached = (T137_lc1_leftOrAbove ? y <= T137_lc1_borderY : y >= T137_lc1_borderY);
				} else if(T137_lc1_vertical) {
					// nothing
				} else {
					if(T137_lc1_lastY == y - 1) {
						T137_lc1_borderX += T137_lc1_m;
						T137_lc1_lastY++;
					} else {
						T137_lc1_borderX = y*T137_lc1_m + T137_lc1_C;
						T137_lc1_lastY = y;
					}
				}
				if(T137_lc2_horizontal) {
					T137_lc2_cached = (T137_lc2_leftOrAbove ? y <= T137_lc2_borderY : y >= T137_lc2_borderY);
				} else if(T137_lc2_vertical) {
					// nothing
				} else {
					if(T137_lc2_lastY == y - 1) {
						T137_lc2_borderX += T137_lc2_m;
						T137_lc2_lastY++;
					} else {
						T137_lc2_borderX = y*T137_lc2_m + T137_lc2_C;
						T137_lc2_lastY = y;
					}
				}
				if(T137_lc3_horizontal) {
					T137_lc3_cached = (T137_lc3_leftOrAbove ? y <= T137_lc3_borderY : y >= T137_lc3_borderY);
				} else if(T137_lc3_vertical) {
					// nothing
				} else {
					if(T137_lc3_lastY == y - 1) {
						T137_lc3_borderX += T137_lc3_m;
						T137_lc3_lastY++;
					} else {
						T137_lc3_borderX = y*T137_lc3_m + T137_lc3_C;
						T137_lc3_lastY = y;
					}
				}
			}
		}

		if(T138_initializedWithValidData) {
			if(y < T138_miny || y > T138_maxy) {
				T138_okay = false;
			} else {
				T138_okay = true;
				if(T138_lc1_horizontal) {
					T138_lc1_cached = (T138_lc1_leftOrAbove ? y <= T138_lc1_borderY : y >= T138_lc1_borderY);
				} else if(T138_lc1_vertical) {
					// nothing
				} else {
					if(T138_lc1_lastY == y - 1) {
						T138_lc1_borderX += T138_lc1_m;
						T138_lc1_lastY++;
					} else {
						T138_lc1_borderX = y*T138_lc1_m + T138_lc1_C;
						T138_lc1_lastY = y;
					}
				}
				if(T138_lc2_horizontal) {
					T138_lc2_cached = (T138_lc2_leftOrAbove ? y <= T138_lc2_borderY : y >= T138_lc2_borderY);
				} else if(T138_lc2_vertical) {
					// nothing
				} else {
					if(T138_lc2_lastY == y - 1) {
						T138_lc2_borderX += T138_lc2_m;
						T138_lc2_lastY++;
					} else {
						T138_lc2_borderX = y*T138_lc2_m + T138_lc2_C;
						T138_lc2_lastY = y;
					}
				}
				if(T138_lc3_horizontal) {
					T138_lc3_cached = (T138_lc3_leftOrAbove ? y <= T138_lc3_borderY : y >= T138_lc3_borderY);
				} else if(T138_lc3_vertical) {
					// nothing
				} else {
					if(T138_lc3_lastY == y - 1) {
						T138_lc3_borderX += T138_lc3_m;
						T138_lc3_lastY++;
					} else {
						T138_lc3_borderX = y*T138_lc3_m + T138_lc3_C;
						T138_lc3_lastY = y;
					}
				}
			}
		}

		if(T139_initializedWithValidData) {
			if(y < T139_miny || y > T139_maxy) {
				T139_okay = false;
			} else {
				T139_okay = true;
				if(T139_lc1_horizontal) {
					T139_lc1_cached = (T139_lc1_leftOrAbove ? y <= T139_lc1_borderY : y >= T139_lc1_borderY);
				} else if(T139_lc1_vertical) {
					// nothing
				} else {
					if(T139_lc1_lastY == y - 1) {
						T139_lc1_borderX += T139_lc1_m;
						T139_lc1_lastY++;
					} else {
						T139_lc1_borderX = y*T139_lc1_m + T139_lc1_C;
						T139_lc1_lastY = y;
					}
				}
				if(T139_lc2_horizontal) {
					T139_lc2_cached = (T139_lc2_leftOrAbove ? y <= T139_lc2_borderY : y >= T139_lc2_borderY);
				} else if(T139_lc2_vertical) {
					// nothing
				} else {
					if(T139_lc2_lastY == y - 1) {
						T139_lc2_borderX += T139_lc2_m;
						T139_lc2_lastY++;
					} else {
						T139_lc2_borderX = y*T139_lc2_m + T139_lc2_C;
						T139_lc2_lastY = y;
					}
				}
				if(T139_lc3_horizontal) {
					T139_lc3_cached = (T139_lc3_leftOrAbove ? y <= T139_lc3_borderY : y >= T139_lc3_borderY);
				} else if(T139_lc3_vertical) {
					// nothing
				} else {
					if(T139_lc3_lastY == y - 1) {
						T139_lc3_borderX += T139_lc3_m;
						T139_lc3_lastY++;
					} else {
						T139_lc3_borderX = y*T139_lc3_m + T139_lc3_C;
						T139_lc3_lastY = y;
					}
				}
			}
		}

		if(T140_initializedWithValidData) {
			if(y < T140_miny || y > T140_maxy) {
				T140_okay = false;
			} else {
				T140_okay = true;
				if(T140_lc1_horizontal) {
					T140_lc1_cached = (T140_lc1_leftOrAbove ? y <= T140_lc1_borderY : y >= T140_lc1_borderY);
				} else if(T140_lc1_vertical) {
					// nothing
				} else {
					if(T140_lc1_lastY == y - 1) {
						T140_lc1_borderX += T140_lc1_m;
						T140_lc1_lastY++;
					} else {
						T140_lc1_borderX = y*T140_lc1_m + T140_lc1_C;
						T140_lc1_lastY = y;
					}
				}
				if(T140_lc2_horizontal) {
					T140_lc2_cached = (T140_lc2_leftOrAbove ? y <= T140_lc2_borderY : y >= T140_lc2_borderY);
				} else if(T140_lc2_vertical) {
					// nothing
				} else {
					if(T140_lc2_lastY == y - 1) {
						T140_lc2_borderX += T140_lc2_m;
						T140_lc2_lastY++;
					} else {
						T140_lc2_borderX = y*T140_lc2_m + T140_lc2_C;
						T140_lc2_lastY = y;
					}
				}
				if(T140_lc3_horizontal) {
					T140_lc3_cached = (T140_lc3_leftOrAbove ? y <= T140_lc3_borderY : y >= T140_lc3_borderY);
				} else if(T140_lc3_vertical) {
					// nothing
				} else {
					if(T140_lc3_lastY == y - 1) {
						T140_lc3_borderX += T140_lc3_m;
						T140_lc3_lastY++;
					} else {
						T140_lc3_borderX = y*T140_lc3_m + T140_lc3_C;
						T140_lc3_lastY = y;
					}
				}
			}
		}

		if(T141_initializedWithValidData) {
			if(y < T141_miny || y > T141_maxy) {
				T141_okay = false;
			} else {
				T141_okay = true;
				if(T141_lc1_horizontal) {
					T141_lc1_cached = (T141_lc1_leftOrAbove ? y <= T141_lc1_borderY : y >= T141_lc1_borderY);
				} else if(T141_lc1_vertical) {
					// nothing
				} else {
					if(T141_lc1_lastY == y - 1) {
						T141_lc1_borderX += T141_lc1_m;
						T141_lc1_lastY++;
					} else {
						T141_lc1_borderX = y*T141_lc1_m + T141_lc1_C;
						T141_lc1_lastY = y;
					}
				}
				if(T141_lc2_horizontal) {
					T141_lc2_cached = (T141_lc2_leftOrAbove ? y <= T141_lc2_borderY : y >= T141_lc2_borderY);
				} else if(T141_lc2_vertical) {
					// nothing
				} else {
					if(T141_lc2_lastY == y - 1) {
						T141_lc2_borderX += T141_lc2_m;
						T141_lc2_lastY++;
					} else {
						T141_lc2_borderX = y*T141_lc2_m + T141_lc2_C;
						T141_lc2_lastY = y;
					}
				}
				if(T141_lc3_horizontal) {
					T141_lc3_cached = (T141_lc3_leftOrAbove ? y <= T141_lc3_borderY : y >= T141_lc3_borderY);
				} else if(T141_lc3_vertical) {
					// nothing
				} else {
					if(T141_lc3_lastY == y - 1) {
						T141_lc3_borderX += T141_lc3_m;
						T141_lc3_lastY++;
					} else {
						T141_lc3_borderX = y*T141_lc3_m + T141_lc3_C;
						T141_lc3_lastY = y;
					}
				}
			}
		}

		if(T142_initializedWithValidData) {
			if(y < T142_miny || y > T142_maxy) {
				T142_okay = false;
			} else {
				T142_okay = true;
				if(T142_lc1_horizontal) {
					T142_lc1_cached = (T142_lc1_leftOrAbove ? y <= T142_lc1_borderY : y >= T142_lc1_borderY);
				} else if(T142_lc1_vertical) {
					// nothing
				} else {
					if(T142_lc1_lastY == y - 1) {
						T142_lc1_borderX += T142_lc1_m;
						T142_lc1_lastY++;
					} else {
						T142_lc1_borderX = y*T142_lc1_m + T142_lc1_C;
						T142_lc1_lastY = y;
					}
				}
				if(T142_lc2_horizontal) {
					T142_lc2_cached = (T142_lc2_leftOrAbove ? y <= T142_lc2_borderY : y >= T142_lc2_borderY);
				} else if(T142_lc2_vertical) {
					// nothing
				} else {
					if(T142_lc2_lastY == y - 1) {
						T142_lc2_borderX += T142_lc2_m;
						T142_lc2_lastY++;
					} else {
						T142_lc2_borderX = y*T142_lc2_m + T142_lc2_C;
						T142_lc2_lastY = y;
					}
				}
				if(T142_lc3_horizontal) {
					T142_lc3_cached = (T142_lc3_leftOrAbove ? y <= T142_lc3_borderY : y >= T142_lc3_borderY);
				} else if(T142_lc3_vertical) {
					// nothing
				} else {
					if(T142_lc3_lastY == y - 1) {
						T142_lc3_borderX += T142_lc3_m;
						T142_lc3_lastY++;
					} else {
						T142_lc3_borderX = y*T142_lc3_m + T142_lc3_C;
						T142_lc3_lastY = y;
					}
				}
			}
		}

		if(T143_initializedWithValidData) {
			if(y < T143_miny || y > T143_maxy) {
				T143_okay = false;
			} else {
				T143_okay = true;
				if(T143_lc1_horizontal) {
					T143_lc1_cached = (T143_lc1_leftOrAbove ? y <= T143_lc1_borderY : y >= T143_lc1_borderY);
				} else if(T143_lc1_vertical) {
					// nothing
				} else {
					if(T143_lc1_lastY == y - 1) {
						T143_lc1_borderX += T143_lc1_m;
						T143_lc1_lastY++;
					} else {
						T143_lc1_borderX = y*T143_lc1_m + T143_lc1_C;
						T143_lc1_lastY = y;
					}
				}
				if(T143_lc2_horizontal) {
					T143_lc2_cached = (T143_lc2_leftOrAbove ? y <= T143_lc2_borderY : y >= T143_lc2_borderY);
				} else if(T143_lc2_vertical) {
					// nothing
				} else {
					if(T143_lc2_lastY == y - 1) {
						T143_lc2_borderX += T143_lc2_m;
						T143_lc2_lastY++;
					} else {
						T143_lc2_borderX = y*T143_lc2_m + T143_lc2_C;
						T143_lc2_lastY = y;
					}
				}
				if(T143_lc3_horizontal) {
					T143_lc3_cached = (T143_lc3_leftOrAbove ? y <= T143_lc3_borderY : y >= T143_lc3_borderY);
				} else if(T143_lc3_vertical) {
					// nothing
				} else {
					if(T143_lc3_lastY == y - 1) {
						T143_lc3_borderX += T143_lc3_m;
						T143_lc3_lastY++;
					} else {
						T143_lc3_borderX = y*T143_lc3_m + T143_lc3_C;
						T143_lc3_lastY = y;
					}
				}
			}
		}

		if(T144_initializedWithValidData) {
			if(y < T144_miny || y > T144_maxy) {
				T144_okay = false;
			} else {
				T144_okay = true;
				if(T144_lc1_horizontal) {
					T144_lc1_cached = (T144_lc1_leftOrAbove ? y <= T144_lc1_borderY : y >= T144_lc1_borderY);
				} else if(T144_lc1_vertical) {
					// nothing
				} else {
					if(T144_lc1_lastY == y - 1) {
						T144_lc1_borderX += T144_lc1_m;
						T144_lc1_lastY++;
					} else {
						T144_lc1_borderX = y*T144_lc1_m + T144_lc1_C;
						T144_lc1_lastY = y;
					}
				}
				if(T144_lc2_horizontal) {
					T144_lc2_cached = (T144_lc2_leftOrAbove ? y <= T144_lc2_borderY : y >= T144_lc2_borderY);
				} else if(T144_lc2_vertical) {
					// nothing
				} else {
					if(T144_lc2_lastY == y - 1) {
						T144_lc2_borderX += T144_lc2_m;
						T144_lc2_lastY++;
					} else {
						T144_lc2_borderX = y*T144_lc2_m + T144_lc2_C;
						T144_lc2_lastY = y;
					}
				}
				if(T144_lc3_horizontal) {
					T144_lc3_cached = (T144_lc3_leftOrAbove ? y <= T144_lc3_borderY : y >= T144_lc3_borderY);
				} else if(T144_lc3_vertical) {
					// nothing
				} else {
					if(T144_lc3_lastY == y - 1) {
						T144_lc3_borderX += T144_lc3_m;
						T144_lc3_lastY++;
					} else {
						T144_lc3_borderX = y*T144_lc3_m + T144_lc3_C;
						T144_lc3_lastY = y;
					}
				}
			}
		}

		if(T145_initializedWithValidData) {
			if(y < T145_miny || y > T145_maxy) {
				T145_okay = false;
			} else {
				T145_okay = true;
				if(T145_lc1_horizontal) {
					T145_lc1_cached = (T145_lc1_leftOrAbove ? y <= T145_lc1_borderY : y >= T145_lc1_borderY);
				} else if(T145_lc1_vertical) {
					// nothing
				} else {
					if(T145_lc1_lastY == y - 1) {
						T145_lc1_borderX += T145_lc1_m;
						T145_lc1_lastY++;
					} else {
						T145_lc1_borderX = y*T145_lc1_m + T145_lc1_C;
						T145_lc1_lastY = y;
					}
				}
				if(T145_lc2_horizontal) {
					T145_lc2_cached = (T145_lc2_leftOrAbove ? y <= T145_lc2_borderY : y >= T145_lc2_borderY);
				} else if(T145_lc2_vertical) {
					// nothing
				} else {
					if(T145_lc2_lastY == y - 1) {
						T145_lc2_borderX += T145_lc2_m;
						T145_lc2_lastY++;
					} else {
						T145_lc2_borderX = y*T145_lc2_m + T145_lc2_C;
						T145_lc2_lastY = y;
					}
				}
				if(T145_lc3_horizontal) {
					T145_lc3_cached = (T145_lc3_leftOrAbove ? y <= T145_lc3_borderY : y >= T145_lc3_borderY);
				} else if(T145_lc3_vertical) {
					// nothing
				} else {
					if(T145_lc3_lastY == y - 1) {
						T145_lc3_borderX += T145_lc3_m;
						T145_lc3_lastY++;
					} else {
						T145_lc3_borderX = y*T145_lc3_m + T145_lc3_C;
						T145_lc3_lastY = y;
					}
				}
			}
		}

		if(T146_initializedWithValidData) {
			if(y < T146_miny || y > T146_maxy) {
				T146_okay = false;
			} else {
				T146_okay = true;
				if(T146_lc1_horizontal) {
					T146_lc1_cached = (T146_lc1_leftOrAbove ? y <= T146_lc1_borderY : y >= T146_lc1_borderY);
				} else if(T146_lc1_vertical) {
					// nothing
				} else {
					if(T146_lc1_lastY == y - 1) {
						T146_lc1_borderX += T146_lc1_m;
						T146_lc1_lastY++;
					} else {
						T146_lc1_borderX = y*T146_lc1_m + T146_lc1_C;
						T146_lc1_lastY = y;
					}
				}
				if(T146_lc2_horizontal) {
					T146_lc2_cached = (T146_lc2_leftOrAbove ? y <= T146_lc2_borderY : y >= T146_lc2_borderY);
				} else if(T146_lc2_vertical) {
					// nothing
				} else {
					if(T146_lc2_lastY == y - 1) {
						T146_lc2_borderX += T146_lc2_m;
						T146_lc2_lastY++;
					} else {
						T146_lc2_borderX = y*T146_lc2_m + T146_lc2_C;
						T146_lc2_lastY = y;
					}
				}
				if(T146_lc3_horizontal) {
					T146_lc3_cached = (T146_lc3_leftOrAbove ? y <= T146_lc3_borderY : y >= T146_lc3_borderY);
				} else if(T146_lc3_vertical) {
					// nothing
				} else {
					if(T146_lc3_lastY == y - 1) {
						T146_lc3_borderX += T146_lc3_m;
						T146_lc3_lastY++;
					} else {
						T146_lc3_borderX = y*T146_lc3_m + T146_lc3_C;
						T146_lc3_lastY = y;
					}
				}
			}
		}

		if(T147_initializedWithValidData) {
			if(y < T147_miny || y > T147_maxy) {
				T147_okay = false;
			} else {
				T147_okay = true;
				if(T147_lc1_horizontal) {
					T147_lc1_cached = (T147_lc1_leftOrAbove ? y <= T147_lc1_borderY : y >= T147_lc1_borderY);
				} else if(T147_lc1_vertical) {
					// nothing
				} else {
					if(T147_lc1_lastY == y - 1) {
						T147_lc1_borderX += T147_lc1_m;
						T147_lc1_lastY++;
					} else {
						T147_lc1_borderX = y*T147_lc1_m + T147_lc1_C;
						T147_lc1_lastY = y;
					}
				}
				if(T147_lc2_horizontal) {
					T147_lc2_cached = (T147_lc2_leftOrAbove ? y <= T147_lc2_borderY : y >= T147_lc2_borderY);
				} else if(T147_lc2_vertical) {
					// nothing
				} else {
					if(T147_lc2_lastY == y - 1) {
						T147_lc2_borderX += T147_lc2_m;
						T147_lc2_lastY++;
					} else {
						T147_lc2_borderX = y*T147_lc2_m + T147_lc2_C;
						T147_lc2_lastY = y;
					}
				}
				if(T147_lc3_horizontal) {
					T147_lc3_cached = (T147_lc3_leftOrAbove ? y <= T147_lc3_borderY : y >= T147_lc3_borderY);
				} else if(T147_lc3_vertical) {
					// nothing
				} else {
					if(T147_lc3_lastY == y - 1) {
						T147_lc3_borderX += T147_lc3_m;
						T147_lc3_lastY++;
					} else {
						T147_lc3_borderX = y*T147_lc3_m + T147_lc3_C;
						T147_lc3_lastY = y;
					}
				}
			}
		}

		if(T148_initializedWithValidData) {
			if(y < T148_miny || y > T148_maxy) {
				T148_okay = false;
			} else {
				T148_okay = true;
				if(T148_lc1_horizontal) {
					T148_lc1_cached = (T148_lc1_leftOrAbove ? y <= T148_lc1_borderY : y >= T148_lc1_borderY);
				} else if(T148_lc1_vertical) {
					// nothing
				} else {
					if(T148_lc1_lastY == y - 1) {
						T148_lc1_borderX += T148_lc1_m;
						T148_lc1_lastY++;
					} else {
						T148_lc1_borderX = y*T148_lc1_m + T148_lc1_C;
						T148_lc1_lastY = y;
					}
				}
				if(T148_lc2_horizontal) {
					T148_lc2_cached = (T148_lc2_leftOrAbove ? y <= T148_lc2_borderY : y >= T148_lc2_borderY);
				} else if(T148_lc2_vertical) {
					// nothing
				} else {
					if(T148_lc2_lastY == y - 1) {
						T148_lc2_borderX += T148_lc2_m;
						T148_lc2_lastY++;
					} else {
						T148_lc2_borderX = y*T148_lc2_m + T148_lc2_C;
						T148_lc2_lastY = y;
					}
				}
				if(T148_lc3_horizontal) {
					T148_lc3_cached = (T148_lc3_leftOrAbove ? y <= T148_lc3_borderY : y >= T148_lc3_borderY);
				} else if(T148_lc3_vertical) {
					// nothing
				} else {
					if(T148_lc3_lastY == y - 1) {
						T148_lc3_borderX += T148_lc3_m;
						T148_lc3_lastY++;
					} else {
						T148_lc3_borderX = y*T148_lc3_m + T148_lc3_C;
						T148_lc3_lastY = y;
					}
				}
			}
		}

		if(T149_initializedWithValidData) {
			if(y < T149_miny || y > T149_maxy) {
				T149_okay = false;
			} else {
				T149_okay = true;
				if(T149_lc1_horizontal) {
					T149_lc1_cached = (T149_lc1_leftOrAbove ? y <= T149_lc1_borderY : y >= T149_lc1_borderY);
				} else if(T149_lc1_vertical) {
					// nothing
				} else {
					if(T149_lc1_lastY == y - 1) {
						T149_lc1_borderX += T149_lc1_m;
						T149_lc1_lastY++;
					} else {
						T149_lc1_borderX = y*T149_lc1_m + T149_lc1_C;
						T149_lc1_lastY = y;
					}
				}
				if(T149_lc2_horizontal) {
					T149_lc2_cached = (T149_lc2_leftOrAbove ? y <= T149_lc2_borderY : y >= T149_lc2_borderY);
				} else if(T149_lc2_vertical) {
					// nothing
				} else {
					if(T149_lc2_lastY == y - 1) {
						T149_lc2_borderX += T149_lc2_m;
						T149_lc2_lastY++;
					} else {
						T149_lc2_borderX = y*T149_lc2_m + T149_lc2_C;
						T149_lc2_lastY = y;
					}
				}
				if(T149_lc3_horizontal) {
					T149_lc3_cached = (T149_lc3_leftOrAbove ? y <= T149_lc3_borderY : y >= T149_lc3_borderY);
				} else if(T149_lc3_vertical) {
					// nothing
				} else {
					if(T149_lc3_lastY == y - 1) {
						T149_lc3_borderX += T149_lc3_m;
						T149_lc3_lastY++;
					} else {
						T149_lc3_borderX = y*T149_lc3_m + T149_lc3_C;
						T149_lc3_lastY = y;
					}
				}
			}
		}
	}

	public void moveToY6(int y) {

		if(T150_initializedWithValidData) {
			if(y < T150_miny || y > T150_maxy) {
				T150_okay = false;
			} else {
				T150_okay = true;
				if(T150_lc1_horizontal) {
					T150_lc1_cached = (T150_lc1_leftOrAbove ? y <= T150_lc1_borderY : y >= T150_lc1_borderY);
				} else if(T150_lc1_vertical) {
					// nothing
				} else {
					if(T150_lc1_lastY == y - 1) {
						T150_lc1_borderX += T150_lc1_m;
						T150_lc1_lastY++;
					} else {
						T150_lc1_borderX = y*T150_lc1_m + T150_lc1_C;
						T150_lc1_lastY = y;
					}
				}
				if(T150_lc2_horizontal) {
					T150_lc2_cached = (T150_lc2_leftOrAbove ? y <= T150_lc2_borderY : y >= T150_lc2_borderY);
				} else if(T150_lc2_vertical) {
					// nothing
				} else {
					if(T150_lc2_lastY == y - 1) {
						T150_lc2_borderX += T150_lc2_m;
						T150_lc2_lastY++;
					} else {
						T150_lc2_borderX = y*T150_lc2_m + T150_lc2_C;
						T150_lc2_lastY = y;
					}
				}
				if(T150_lc3_horizontal) {
					T150_lc3_cached = (T150_lc3_leftOrAbove ? y <= T150_lc3_borderY : y >= T150_lc3_borderY);
				} else if(T150_lc3_vertical) {
					// nothing
				} else {
					if(T150_lc3_lastY == y - 1) {
						T150_lc3_borderX += T150_lc3_m;
						T150_lc3_lastY++;
					} else {
						T150_lc3_borderX = y*T150_lc3_m + T150_lc3_C;
						T150_lc3_lastY = y;
					}
				}
			}
		}

		if(T151_initializedWithValidData) {
			if(y < T151_miny || y > T151_maxy) {
				T151_okay = false;
			} else {
				T151_okay = true;
				if(T151_lc1_horizontal) {
					T151_lc1_cached = (T151_lc1_leftOrAbove ? y <= T151_lc1_borderY : y >= T151_lc1_borderY);
				} else if(T151_lc1_vertical) {
					// nothing
				} else {
					if(T151_lc1_lastY == y - 1) {
						T151_lc1_borderX += T151_lc1_m;
						T151_lc1_lastY++;
					} else {
						T151_lc1_borderX = y*T151_lc1_m + T151_lc1_C;
						T151_lc1_lastY = y;
					}
				}
				if(T151_lc2_horizontal) {
					T151_lc2_cached = (T151_lc2_leftOrAbove ? y <= T151_lc2_borderY : y >= T151_lc2_borderY);
				} else if(T151_lc2_vertical) {
					// nothing
				} else {
					if(T151_lc2_lastY == y - 1) {
						T151_lc2_borderX += T151_lc2_m;
						T151_lc2_lastY++;
					} else {
						T151_lc2_borderX = y*T151_lc2_m + T151_lc2_C;
						T151_lc2_lastY = y;
					}
				}
				if(T151_lc3_horizontal) {
					T151_lc3_cached = (T151_lc3_leftOrAbove ? y <= T151_lc3_borderY : y >= T151_lc3_borderY);
				} else if(T151_lc3_vertical) {
					// nothing
				} else {
					if(T151_lc3_lastY == y - 1) {
						T151_lc3_borderX += T151_lc3_m;
						T151_lc3_lastY++;
					} else {
						T151_lc3_borderX = y*T151_lc3_m + T151_lc3_C;
						T151_lc3_lastY = y;
					}
				}
			}
		}

		if(T152_initializedWithValidData) {
			if(y < T152_miny || y > T152_maxy) {
				T152_okay = false;
			} else {
				T152_okay = true;
				if(T152_lc1_horizontal) {
					T152_lc1_cached = (T152_lc1_leftOrAbove ? y <= T152_lc1_borderY : y >= T152_lc1_borderY);
				} else if(T152_lc1_vertical) {
					// nothing
				} else {
					if(T152_lc1_lastY == y - 1) {
						T152_lc1_borderX += T152_lc1_m;
						T152_lc1_lastY++;
					} else {
						T152_lc1_borderX = y*T152_lc1_m + T152_lc1_C;
						T152_lc1_lastY = y;
					}
				}
				if(T152_lc2_horizontal) {
					T152_lc2_cached = (T152_lc2_leftOrAbove ? y <= T152_lc2_borderY : y >= T152_lc2_borderY);
				} else if(T152_lc2_vertical) {
					// nothing
				} else {
					if(T152_lc2_lastY == y - 1) {
						T152_lc2_borderX += T152_lc2_m;
						T152_lc2_lastY++;
					} else {
						T152_lc2_borderX = y*T152_lc2_m + T152_lc2_C;
						T152_lc2_lastY = y;
					}
				}
				if(T152_lc3_horizontal) {
					T152_lc3_cached = (T152_lc3_leftOrAbove ? y <= T152_lc3_borderY : y >= T152_lc3_borderY);
				} else if(T152_lc3_vertical) {
					// nothing
				} else {
					if(T152_lc3_lastY == y - 1) {
						T152_lc3_borderX += T152_lc3_m;
						T152_lc3_lastY++;
					} else {
						T152_lc3_borderX = y*T152_lc3_m + T152_lc3_C;
						T152_lc3_lastY = y;
					}
				}
			}
		}

		if(T153_initializedWithValidData) {
			if(y < T153_miny || y > T153_maxy) {
				T153_okay = false;
			} else {
				T153_okay = true;
				if(T153_lc1_horizontal) {
					T153_lc1_cached = (T153_lc1_leftOrAbove ? y <= T153_lc1_borderY : y >= T153_lc1_borderY);
				} else if(T153_lc1_vertical) {
					// nothing
				} else {
					if(T153_lc1_lastY == y - 1) {
						T153_lc1_borderX += T153_lc1_m;
						T153_lc1_lastY++;
					} else {
						T153_lc1_borderX = y*T153_lc1_m + T153_lc1_C;
						T153_lc1_lastY = y;
					}
				}
				if(T153_lc2_horizontal) {
					T153_lc2_cached = (T153_lc2_leftOrAbove ? y <= T153_lc2_borderY : y >= T153_lc2_borderY);
				} else if(T153_lc2_vertical) {
					// nothing
				} else {
					if(T153_lc2_lastY == y - 1) {
						T153_lc2_borderX += T153_lc2_m;
						T153_lc2_lastY++;
					} else {
						T153_lc2_borderX = y*T153_lc2_m + T153_lc2_C;
						T153_lc2_lastY = y;
					}
				}
				if(T153_lc3_horizontal) {
					T153_lc3_cached = (T153_lc3_leftOrAbove ? y <= T153_lc3_borderY : y >= T153_lc3_borderY);
				} else if(T153_lc3_vertical) {
					// nothing
				} else {
					if(T153_lc3_lastY == y - 1) {
						T153_lc3_borderX += T153_lc3_m;
						T153_lc3_lastY++;
					} else {
						T153_lc3_borderX = y*T153_lc3_m + T153_lc3_C;
						T153_lc3_lastY = y;
					}
				}
			}
		}

		if(T154_initializedWithValidData) {
			if(y < T154_miny || y > T154_maxy) {
				T154_okay = false;
			} else {
				T154_okay = true;
				if(T154_lc1_horizontal) {
					T154_lc1_cached = (T154_lc1_leftOrAbove ? y <= T154_lc1_borderY : y >= T154_lc1_borderY);
				} else if(T154_lc1_vertical) {
					// nothing
				} else {
					if(T154_lc1_lastY == y - 1) {
						T154_lc1_borderX += T154_lc1_m;
						T154_lc1_lastY++;
					} else {
						T154_lc1_borderX = y*T154_lc1_m + T154_lc1_C;
						T154_lc1_lastY = y;
					}
				}
				if(T154_lc2_horizontal) {
					T154_lc2_cached = (T154_lc2_leftOrAbove ? y <= T154_lc2_borderY : y >= T154_lc2_borderY);
				} else if(T154_lc2_vertical) {
					// nothing
				} else {
					if(T154_lc2_lastY == y - 1) {
						T154_lc2_borderX += T154_lc2_m;
						T154_lc2_lastY++;
					} else {
						T154_lc2_borderX = y*T154_lc2_m + T154_lc2_C;
						T154_lc2_lastY = y;
					}
				}
				if(T154_lc3_horizontal) {
					T154_lc3_cached = (T154_lc3_leftOrAbove ? y <= T154_lc3_borderY : y >= T154_lc3_borderY);
				} else if(T154_lc3_vertical) {
					// nothing
				} else {
					if(T154_lc3_lastY == y - 1) {
						T154_lc3_borderX += T154_lc3_m;
						T154_lc3_lastY++;
					} else {
						T154_lc3_borderX = y*T154_lc3_m + T154_lc3_C;
						T154_lc3_lastY = y;
					}
				}
			}
		}

		if(T155_initializedWithValidData) {
			if(y < T155_miny || y > T155_maxy) {
				T155_okay = false;
			} else {
				T155_okay = true;
				if(T155_lc1_horizontal) {
					T155_lc1_cached = (T155_lc1_leftOrAbove ? y <= T155_lc1_borderY : y >= T155_lc1_borderY);
				} else if(T155_lc1_vertical) {
					// nothing
				} else {
					if(T155_lc1_lastY == y - 1) {
						T155_lc1_borderX += T155_lc1_m;
						T155_lc1_lastY++;
					} else {
						T155_lc1_borderX = y*T155_lc1_m + T155_lc1_C;
						T155_lc1_lastY = y;
					}
				}
				if(T155_lc2_horizontal) {
					T155_lc2_cached = (T155_lc2_leftOrAbove ? y <= T155_lc2_borderY : y >= T155_lc2_borderY);
				} else if(T155_lc2_vertical) {
					// nothing
				} else {
					if(T155_lc2_lastY == y - 1) {
						T155_lc2_borderX += T155_lc2_m;
						T155_lc2_lastY++;
					} else {
						T155_lc2_borderX = y*T155_lc2_m + T155_lc2_C;
						T155_lc2_lastY = y;
					}
				}
				if(T155_lc3_horizontal) {
					T155_lc3_cached = (T155_lc3_leftOrAbove ? y <= T155_lc3_borderY : y >= T155_lc3_borderY);
				} else if(T155_lc3_vertical) {
					// nothing
				} else {
					if(T155_lc3_lastY == y - 1) {
						T155_lc3_borderX += T155_lc3_m;
						T155_lc3_lastY++;
					} else {
						T155_lc3_borderX = y*T155_lc3_m + T155_lc3_C;
						T155_lc3_lastY = y;
					}
				}
			}
		}

		if(T156_initializedWithValidData) {
			if(y < T156_miny || y > T156_maxy) {
				T156_okay = false;
			} else {
				T156_okay = true;
				if(T156_lc1_horizontal) {
					T156_lc1_cached = (T156_lc1_leftOrAbove ? y <= T156_lc1_borderY : y >= T156_lc1_borderY);
				} else if(T156_lc1_vertical) {
					// nothing
				} else {
					if(T156_lc1_lastY == y - 1) {
						T156_lc1_borderX += T156_lc1_m;
						T156_lc1_lastY++;
					} else {
						T156_lc1_borderX = y*T156_lc1_m + T156_lc1_C;
						T156_lc1_lastY = y;
					}
				}
				if(T156_lc2_horizontal) {
					T156_lc2_cached = (T156_lc2_leftOrAbove ? y <= T156_lc2_borderY : y >= T156_lc2_borderY);
				} else if(T156_lc2_vertical) {
					// nothing
				} else {
					if(T156_lc2_lastY == y - 1) {
						T156_lc2_borderX += T156_lc2_m;
						T156_lc2_lastY++;
					} else {
						T156_lc2_borderX = y*T156_lc2_m + T156_lc2_C;
						T156_lc2_lastY = y;
					}
				}
				if(T156_lc3_horizontal) {
					T156_lc3_cached = (T156_lc3_leftOrAbove ? y <= T156_lc3_borderY : y >= T156_lc3_borderY);
				} else if(T156_lc3_vertical) {
					// nothing
				} else {
					if(T156_lc3_lastY == y - 1) {
						T156_lc3_borderX += T156_lc3_m;
						T156_lc3_lastY++;
					} else {
						T156_lc3_borderX = y*T156_lc3_m + T156_lc3_C;
						T156_lc3_lastY = y;
					}
				}
			}
		}

		if(T157_initializedWithValidData) {
			if(y < T157_miny || y > T157_maxy) {
				T157_okay = false;
			} else {
				T157_okay = true;
				if(T157_lc1_horizontal) {
					T157_lc1_cached = (T157_lc1_leftOrAbove ? y <= T157_lc1_borderY : y >= T157_lc1_borderY);
				} else if(T157_lc1_vertical) {
					// nothing
				} else {
					if(T157_lc1_lastY == y - 1) {
						T157_lc1_borderX += T157_lc1_m;
						T157_lc1_lastY++;
					} else {
						T157_lc1_borderX = y*T157_lc1_m + T157_lc1_C;
						T157_lc1_lastY = y;
					}
				}
				if(T157_lc2_horizontal) {
					T157_lc2_cached = (T157_lc2_leftOrAbove ? y <= T157_lc2_borderY : y >= T157_lc2_borderY);
				} else if(T157_lc2_vertical) {
					// nothing
				} else {
					if(T157_lc2_lastY == y - 1) {
						T157_lc2_borderX += T157_lc2_m;
						T157_lc2_lastY++;
					} else {
						T157_lc2_borderX = y*T157_lc2_m + T157_lc2_C;
						T157_lc2_lastY = y;
					}
				}
				if(T157_lc3_horizontal) {
					T157_lc3_cached = (T157_lc3_leftOrAbove ? y <= T157_lc3_borderY : y >= T157_lc3_borderY);
				} else if(T157_lc3_vertical) {
					// nothing
				} else {
					if(T157_lc3_lastY == y - 1) {
						T157_lc3_borderX += T157_lc3_m;
						T157_lc3_lastY++;
					} else {
						T157_lc3_borderX = y*T157_lc3_m + T157_lc3_C;
						T157_lc3_lastY = y;
					}
				}
			}
		}

		if(T158_initializedWithValidData) {
			if(y < T158_miny || y > T158_maxy) {
				T158_okay = false;
			} else {
				T158_okay = true;
				if(T158_lc1_horizontal) {
					T158_lc1_cached = (T158_lc1_leftOrAbove ? y <= T158_lc1_borderY : y >= T158_lc1_borderY);
				} else if(T158_lc1_vertical) {
					// nothing
				} else {
					if(T158_lc1_lastY == y - 1) {
						T158_lc1_borderX += T158_lc1_m;
						T158_lc1_lastY++;
					} else {
						T158_lc1_borderX = y*T158_lc1_m + T158_lc1_C;
						T158_lc1_lastY = y;
					}
				}
				if(T158_lc2_horizontal) {
					T158_lc2_cached = (T158_lc2_leftOrAbove ? y <= T158_lc2_borderY : y >= T158_lc2_borderY);
				} else if(T158_lc2_vertical) {
					// nothing
				} else {
					if(T158_lc2_lastY == y - 1) {
						T158_lc2_borderX += T158_lc2_m;
						T158_lc2_lastY++;
					} else {
						T158_lc2_borderX = y*T158_lc2_m + T158_lc2_C;
						T158_lc2_lastY = y;
					}
				}
				if(T158_lc3_horizontal) {
					T158_lc3_cached = (T158_lc3_leftOrAbove ? y <= T158_lc3_borderY : y >= T158_lc3_borderY);
				} else if(T158_lc3_vertical) {
					// nothing
				} else {
					if(T158_lc3_lastY == y - 1) {
						T158_lc3_borderX += T158_lc3_m;
						T158_lc3_lastY++;
					} else {
						T158_lc3_borderX = y*T158_lc3_m + T158_lc3_C;
						T158_lc3_lastY = y;
					}
				}
			}
		}

		if(T159_initializedWithValidData) {
			if(y < T159_miny || y > T159_maxy) {
				T159_okay = false;
			} else {
				T159_okay = true;
				if(T159_lc1_horizontal) {
					T159_lc1_cached = (T159_lc1_leftOrAbove ? y <= T159_lc1_borderY : y >= T159_lc1_borderY);
				} else if(T159_lc1_vertical) {
					// nothing
				} else {
					if(T159_lc1_lastY == y - 1) {
						T159_lc1_borderX += T159_lc1_m;
						T159_lc1_lastY++;
					} else {
						T159_lc1_borderX = y*T159_lc1_m + T159_lc1_C;
						T159_lc1_lastY = y;
					}
				}
				if(T159_lc2_horizontal) {
					T159_lc2_cached = (T159_lc2_leftOrAbove ? y <= T159_lc2_borderY : y >= T159_lc2_borderY);
				} else if(T159_lc2_vertical) {
					// nothing
				} else {
					if(T159_lc2_lastY == y - 1) {
						T159_lc2_borderX += T159_lc2_m;
						T159_lc2_lastY++;
					} else {
						T159_lc2_borderX = y*T159_lc2_m + T159_lc2_C;
						T159_lc2_lastY = y;
					}
				}
				if(T159_lc3_horizontal) {
					T159_lc3_cached = (T159_lc3_leftOrAbove ? y <= T159_lc3_borderY : y >= T159_lc3_borderY);
				} else if(T159_lc3_vertical) {
					// nothing
				} else {
					if(T159_lc3_lastY == y - 1) {
						T159_lc3_borderX += T159_lc3_m;
						T159_lc3_lastY++;
					} else {
						T159_lc3_borderX = y*T159_lc3_m + T159_lc3_C;
						T159_lc3_lastY = y;
					}
				}
			}
		}

		if(T160_initializedWithValidData) {
			if(y < T160_miny || y > T160_maxy) {
				T160_okay = false;
			} else {
				T160_okay = true;
				if(T160_lc1_horizontal) {
					T160_lc1_cached = (T160_lc1_leftOrAbove ? y <= T160_lc1_borderY : y >= T160_lc1_borderY);
				} else if(T160_lc1_vertical) {
					// nothing
				} else {
					if(T160_lc1_lastY == y - 1) {
						T160_lc1_borderX += T160_lc1_m;
						T160_lc1_lastY++;
					} else {
						T160_lc1_borderX = y*T160_lc1_m + T160_lc1_C;
						T160_lc1_lastY = y;
					}
				}
				if(T160_lc2_horizontal) {
					T160_lc2_cached = (T160_lc2_leftOrAbove ? y <= T160_lc2_borderY : y >= T160_lc2_borderY);
				} else if(T160_lc2_vertical) {
					// nothing
				} else {
					if(T160_lc2_lastY == y - 1) {
						T160_lc2_borderX += T160_lc2_m;
						T160_lc2_lastY++;
					} else {
						T160_lc2_borderX = y*T160_lc2_m + T160_lc2_C;
						T160_lc2_lastY = y;
					}
				}
				if(T160_lc3_horizontal) {
					T160_lc3_cached = (T160_lc3_leftOrAbove ? y <= T160_lc3_borderY : y >= T160_lc3_borderY);
				} else if(T160_lc3_vertical) {
					// nothing
				} else {
					if(T160_lc3_lastY == y - 1) {
						T160_lc3_borderX += T160_lc3_m;
						T160_lc3_lastY++;
					} else {
						T160_lc3_borderX = y*T160_lc3_m + T160_lc3_C;
						T160_lc3_lastY = y;
					}
				}
			}
		}

		if(T161_initializedWithValidData) {
			if(y < T161_miny || y > T161_maxy) {
				T161_okay = false;
			} else {
				T161_okay = true;
				if(T161_lc1_horizontal) {
					T161_lc1_cached = (T161_lc1_leftOrAbove ? y <= T161_lc1_borderY : y >= T161_lc1_borderY);
				} else if(T161_lc1_vertical) {
					// nothing
				} else {
					if(T161_lc1_lastY == y - 1) {
						T161_lc1_borderX += T161_lc1_m;
						T161_lc1_lastY++;
					} else {
						T161_lc1_borderX = y*T161_lc1_m + T161_lc1_C;
						T161_lc1_lastY = y;
					}
				}
				if(T161_lc2_horizontal) {
					T161_lc2_cached = (T161_lc2_leftOrAbove ? y <= T161_lc2_borderY : y >= T161_lc2_borderY);
				} else if(T161_lc2_vertical) {
					// nothing
				} else {
					if(T161_lc2_lastY == y - 1) {
						T161_lc2_borderX += T161_lc2_m;
						T161_lc2_lastY++;
					} else {
						T161_lc2_borderX = y*T161_lc2_m + T161_lc2_C;
						T161_lc2_lastY = y;
					}
				}
				if(T161_lc3_horizontal) {
					T161_lc3_cached = (T161_lc3_leftOrAbove ? y <= T161_lc3_borderY : y >= T161_lc3_borderY);
				} else if(T161_lc3_vertical) {
					// nothing
				} else {
					if(T161_lc3_lastY == y - 1) {
						T161_lc3_borderX += T161_lc3_m;
						T161_lc3_lastY++;
					} else {
						T161_lc3_borderX = y*T161_lc3_m + T161_lc3_C;
						T161_lc3_lastY = y;
					}
				}
			}
		}

		if(T162_initializedWithValidData) {
			if(y < T162_miny || y > T162_maxy) {
				T162_okay = false;
			} else {
				T162_okay = true;
				if(T162_lc1_horizontal) {
					T162_lc1_cached = (T162_lc1_leftOrAbove ? y <= T162_lc1_borderY : y >= T162_lc1_borderY);
				} else if(T162_lc1_vertical) {
					// nothing
				} else {
					if(T162_lc1_lastY == y - 1) {
						T162_lc1_borderX += T162_lc1_m;
						T162_lc1_lastY++;
					} else {
						T162_lc1_borderX = y*T162_lc1_m + T162_lc1_C;
						T162_lc1_lastY = y;
					}
				}
				if(T162_lc2_horizontal) {
					T162_lc2_cached = (T162_lc2_leftOrAbove ? y <= T162_lc2_borderY : y >= T162_lc2_borderY);
				} else if(T162_lc2_vertical) {
					// nothing
				} else {
					if(T162_lc2_lastY == y - 1) {
						T162_lc2_borderX += T162_lc2_m;
						T162_lc2_lastY++;
					} else {
						T162_lc2_borderX = y*T162_lc2_m + T162_lc2_C;
						T162_lc2_lastY = y;
					}
				}
				if(T162_lc3_horizontal) {
					T162_lc3_cached = (T162_lc3_leftOrAbove ? y <= T162_lc3_borderY : y >= T162_lc3_borderY);
				} else if(T162_lc3_vertical) {
					// nothing
				} else {
					if(T162_lc3_lastY == y - 1) {
						T162_lc3_borderX += T162_lc3_m;
						T162_lc3_lastY++;
					} else {
						T162_lc3_borderX = y*T162_lc3_m + T162_lc3_C;
						T162_lc3_lastY = y;
					}
				}
			}
		}

		if(T163_initializedWithValidData) {
			if(y < T163_miny || y > T163_maxy) {
				T163_okay = false;
			} else {
				T163_okay = true;
				if(T163_lc1_horizontal) {
					T163_lc1_cached = (T163_lc1_leftOrAbove ? y <= T163_lc1_borderY : y >= T163_lc1_borderY);
				} else if(T163_lc1_vertical) {
					// nothing
				} else {
					if(T163_lc1_lastY == y - 1) {
						T163_lc1_borderX += T163_lc1_m;
						T163_lc1_lastY++;
					} else {
						T163_lc1_borderX = y*T163_lc1_m + T163_lc1_C;
						T163_lc1_lastY = y;
					}
				}
				if(T163_lc2_horizontal) {
					T163_lc2_cached = (T163_lc2_leftOrAbove ? y <= T163_lc2_borderY : y >= T163_lc2_borderY);
				} else if(T163_lc2_vertical) {
					// nothing
				} else {
					if(T163_lc2_lastY == y - 1) {
						T163_lc2_borderX += T163_lc2_m;
						T163_lc2_lastY++;
					} else {
						T163_lc2_borderX = y*T163_lc2_m + T163_lc2_C;
						T163_lc2_lastY = y;
					}
				}
				if(T163_lc3_horizontal) {
					T163_lc3_cached = (T163_lc3_leftOrAbove ? y <= T163_lc3_borderY : y >= T163_lc3_borderY);
				} else if(T163_lc3_vertical) {
					// nothing
				} else {
					if(T163_lc3_lastY == y - 1) {
						T163_lc3_borderX += T163_lc3_m;
						T163_lc3_lastY++;
					} else {
						T163_lc3_borderX = y*T163_lc3_m + T163_lc3_C;
						T163_lc3_lastY = y;
					}
				}
			}
		}

		if(T164_initializedWithValidData) {
			if(y < T164_miny || y > T164_maxy) {
				T164_okay = false;
			} else {
				T164_okay = true;
				if(T164_lc1_horizontal) {
					T164_lc1_cached = (T164_lc1_leftOrAbove ? y <= T164_lc1_borderY : y >= T164_lc1_borderY);
				} else if(T164_lc1_vertical) {
					// nothing
				} else {
					if(T164_lc1_lastY == y - 1) {
						T164_lc1_borderX += T164_lc1_m;
						T164_lc1_lastY++;
					} else {
						T164_lc1_borderX = y*T164_lc1_m + T164_lc1_C;
						T164_lc1_lastY = y;
					}
				}
				if(T164_lc2_horizontal) {
					T164_lc2_cached = (T164_lc2_leftOrAbove ? y <= T164_lc2_borderY : y >= T164_lc2_borderY);
				} else if(T164_lc2_vertical) {
					// nothing
				} else {
					if(T164_lc2_lastY == y - 1) {
						T164_lc2_borderX += T164_lc2_m;
						T164_lc2_lastY++;
					} else {
						T164_lc2_borderX = y*T164_lc2_m + T164_lc2_C;
						T164_lc2_lastY = y;
					}
				}
				if(T164_lc3_horizontal) {
					T164_lc3_cached = (T164_lc3_leftOrAbove ? y <= T164_lc3_borderY : y >= T164_lc3_borderY);
				} else if(T164_lc3_vertical) {
					// nothing
				} else {
					if(T164_lc3_lastY == y - 1) {
						T164_lc3_borderX += T164_lc3_m;
						T164_lc3_lastY++;
					} else {
						T164_lc3_borderX = y*T164_lc3_m + T164_lc3_C;
						T164_lc3_lastY = y;
					}
				}
			}
		}

		if(T165_initializedWithValidData) {
			if(y < T165_miny || y > T165_maxy) {
				T165_okay = false;
			} else {
				T165_okay = true;
				if(T165_lc1_horizontal) {
					T165_lc1_cached = (T165_lc1_leftOrAbove ? y <= T165_lc1_borderY : y >= T165_lc1_borderY);
				} else if(T165_lc1_vertical) {
					// nothing
				} else {
					if(T165_lc1_lastY == y - 1) {
						T165_lc1_borderX += T165_lc1_m;
						T165_lc1_lastY++;
					} else {
						T165_lc1_borderX = y*T165_lc1_m + T165_lc1_C;
						T165_lc1_lastY = y;
					}
				}
				if(T165_lc2_horizontal) {
					T165_lc2_cached = (T165_lc2_leftOrAbove ? y <= T165_lc2_borderY : y >= T165_lc2_borderY);
				} else if(T165_lc2_vertical) {
					// nothing
				} else {
					if(T165_lc2_lastY == y - 1) {
						T165_lc2_borderX += T165_lc2_m;
						T165_lc2_lastY++;
					} else {
						T165_lc2_borderX = y*T165_lc2_m + T165_lc2_C;
						T165_lc2_lastY = y;
					}
				}
				if(T165_lc3_horizontal) {
					T165_lc3_cached = (T165_lc3_leftOrAbove ? y <= T165_lc3_borderY : y >= T165_lc3_borderY);
				} else if(T165_lc3_vertical) {
					// nothing
				} else {
					if(T165_lc3_lastY == y - 1) {
						T165_lc3_borderX += T165_lc3_m;
						T165_lc3_lastY++;
					} else {
						T165_lc3_borderX = y*T165_lc3_m + T165_lc3_C;
						T165_lc3_lastY = y;
					}
				}
			}
		}

		if(T166_initializedWithValidData) {
			if(y < T166_miny || y > T166_maxy) {
				T166_okay = false;
			} else {
				T166_okay = true;
				if(T166_lc1_horizontal) {
					T166_lc1_cached = (T166_lc1_leftOrAbove ? y <= T166_lc1_borderY : y >= T166_lc1_borderY);
				} else if(T166_lc1_vertical) {
					// nothing
				} else {
					if(T166_lc1_lastY == y - 1) {
						T166_lc1_borderX += T166_lc1_m;
						T166_lc1_lastY++;
					} else {
						T166_lc1_borderX = y*T166_lc1_m + T166_lc1_C;
						T166_lc1_lastY = y;
					}
				}
				if(T166_lc2_horizontal) {
					T166_lc2_cached = (T166_lc2_leftOrAbove ? y <= T166_lc2_borderY : y >= T166_lc2_borderY);
				} else if(T166_lc2_vertical) {
					// nothing
				} else {
					if(T166_lc2_lastY == y - 1) {
						T166_lc2_borderX += T166_lc2_m;
						T166_lc2_lastY++;
					} else {
						T166_lc2_borderX = y*T166_lc2_m + T166_lc2_C;
						T166_lc2_lastY = y;
					}
				}
				if(T166_lc3_horizontal) {
					T166_lc3_cached = (T166_lc3_leftOrAbove ? y <= T166_lc3_borderY : y >= T166_lc3_borderY);
				} else if(T166_lc3_vertical) {
					// nothing
				} else {
					if(T166_lc3_lastY == y - 1) {
						T166_lc3_borderX += T166_lc3_m;
						T166_lc3_lastY++;
					} else {
						T166_lc3_borderX = y*T166_lc3_m + T166_lc3_C;
						T166_lc3_lastY = y;
					}
				}
			}
		}

		if(T167_initializedWithValidData) {
			if(y < T167_miny || y > T167_maxy) {
				T167_okay = false;
			} else {
				T167_okay = true;
				if(T167_lc1_horizontal) {
					T167_lc1_cached = (T167_lc1_leftOrAbove ? y <= T167_lc1_borderY : y >= T167_lc1_borderY);
				} else if(T167_lc1_vertical) {
					// nothing
				} else {
					if(T167_lc1_lastY == y - 1) {
						T167_lc1_borderX += T167_lc1_m;
						T167_lc1_lastY++;
					} else {
						T167_lc1_borderX = y*T167_lc1_m + T167_lc1_C;
						T167_lc1_lastY = y;
					}
				}
				if(T167_lc2_horizontal) {
					T167_lc2_cached = (T167_lc2_leftOrAbove ? y <= T167_lc2_borderY : y >= T167_lc2_borderY);
				} else if(T167_lc2_vertical) {
					// nothing
				} else {
					if(T167_lc2_lastY == y - 1) {
						T167_lc2_borderX += T167_lc2_m;
						T167_lc2_lastY++;
					} else {
						T167_lc2_borderX = y*T167_lc2_m + T167_lc2_C;
						T167_lc2_lastY = y;
					}
				}
				if(T167_lc3_horizontal) {
					T167_lc3_cached = (T167_lc3_leftOrAbove ? y <= T167_lc3_borderY : y >= T167_lc3_borderY);
				} else if(T167_lc3_vertical) {
					// nothing
				} else {
					if(T167_lc3_lastY == y - 1) {
						T167_lc3_borderX += T167_lc3_m;
						T167_lc3_lastY++;
					} else {
						T167_lc3_borderX = y*T167_lc3_m + T167_lc3_C;
						T167_lc3_lastY = y;
					}
				}
			}
		}

		if(T168_initializedWithValidData) {
			if(y < T168_miny || y > T168_maxy) {
				T168_okay = false;
			} else {
				T168_okay = true;
				if(T168_lc1_horizontal) {
					T168_lc1_cached = (T168_lc1_leftOrAbove ? y <= T168_lc1_borderY : y >= T168_lc1_borderY);
				} else if(T168_lc1_vertical) {
					// nothing
				} else {
					if(T168_lc1_lastY == y - 1) {
						T168_lc1_borderX += T168_lc1_m;
						T168_lc1_lastY++;
					} else {
						T168_lc1_borderX = y*T168_lc1_m + T168_lc1_C;
						T168_lc1_lastY = y;
					}
				}
				if(T168_lc2_horizontal) {
					T168_lc2_cached = (T168_lc2_leftOrAbove ? y <= T168_lc2_borderY : y >= T168_lc2_borderY);
				} else if(T168_lc2_vertical) {
					// nothing
				} else {
					if(T168_lc2_lastY == y - 1) {
						T168_lc2_borderX += T168_lc2_m;
						T168_lc2_lastY++;
					} else {
						T168_lc2_borderX = y*T168_lc2_m + T168_lc2_C;
						T168_lc2_lastY = y;
					}
				}
				if(T168_lc3_horizontal) {
					T168_lc3_cached = (T168_lc3_leftOrAbove ? y <= T168_lc3_borderY : y >= T168_lc3_borderY);
				} else if(T168_lc3_vertical) {
					// nothing
				} else {
					if(T168_lc3_lastY == y - 1) {
						T168_lc3_borderX += T168_lc3_m;
						T168_lc3_lastY++;
					} else {
						T168_lc3_borderX = y*T168_lc3_m + T168_lc3_C;
						T168_lc3_lastY = y;
					}
				}
			}
		}

		if(T169_initializedWithValidData) {
			if(y < T169_miny || y > T169_maxy) {
				T169_okay = false;
			} else {
				T169_okay = true;
				if(T169_lc1_horizontal) {
					T169_lc1_cached = (T169_lc1_leftOrAbove ? y <= T169_lc1_borderY : y >= T169_lc1_borderY);
				} else if(T169_lc1_vertical) {
					// nothing
				} else {
					if(T169_lc1_lastY == y - 1) {
						T169_lc1_borderX += T169_lc1_m;
						T169_lc1_lastY++;
					} else {
						T169_lc1_borderX = y*T169_lc1_m + T169_lc1_C;
						T169_lc1_lastY = y;
					}
				}
				if(T169_lc2_horizontal) {
					T169_lc2_cached = (T169_lc2_leftOrAbove ? y <= T169_lc2_borderY : y >= T169_lc2_borderY);
				} else if(T169_lc2_vertical) {
					// nothing
				} else {
					if(T169_lc2_lastY == y - 1) {
						T169_lc2_borderX += T169_lc2_m;
						T169_lc2_lastY++;
					} else {
						T169_lc2_borderX = y*T169_lc2_m + T169_lc2_C;
						T169_lc2_lastY = y;
					}
				}
				if(T169_lc3_horizontal) {
					T169_lc3_cached = (T169_lc3_leftOrAbove ? y <= T169_lc3_borderY : y >= T169_lc3_borderY);
				} else if(T169_lc3_vertical) {
					// nothing
				} else {
					if(T169_lc3_lastY == y - 1) {
						T169_lc3_borderX += T169_lc3_m;
						T169_lc3_lastY++;
					} else {
						T169_lc3_borderX = y*T169_lc3_m + T169_lc3_C;
						T169_lc3_lastY = y;
					}
				}
			}
		}

		if(T170_initializedWithValidData) {
			if(y < T170_miny || y > T170_maxy) {
				T170_okay = false;
			} else {
				T170_okay = true;
				if(T170_lc1_horizontal) {
					T170_lc1_cached = (T170_lc1_leftOrAbove ? y <= T170_lc1_borderY : y >= T170_lc1_borderY);
				} else if(T170_lc1_vertical) {
					// nothing
				} else {
					if(T170_lc1_lastY == y - 1) {
						T170_lc1_borderX += T170_lc1_m;
						T170_lc1_lastY++;
					} else {
						T170_lc1_borderX = y*T170_lc1_m + T170_lc1_C;
						T170_lc1_lastY = y;
					}
				}
				if(T170_lc2_horizontal) {
					T170_lc2_cached = (T170_lc2_leftOrAbove ? y <= T170_lc2_borderY : y >= T170_lc2_borderY);
				} else if(T170_lc2_vertical) {
					// nothing
				} else {
					if(T170_lc2_lastY == y - 1) {
						T170_lc2_borderX += T170_lc2_m;
						T170_lc2_lastY++;
					} else {
						T170_lc2_borderX = y*T170_lc2_m + T170_lc2_C;
						T170_lc2_lastY = y;
					}
				}
				if(T170_lc3_horizontal) {
					T170_lc3_cached = (T170_lc3_leftOrAbove ? y <= T170_lc3_borderY : y >= T170_lc3_borderY);
				} else if(T170_lc3_vertical) {
					// nothing
				} else {
					if(T170_lc3_lastY == y - 1) {
						T170_lc3_borderX += T170_lc3_m;
						T170_lc3_lastY++;
					} else {
						T170_lc3_borderX = y*T170_lc3_m + T170_lc3_C;
						T170_lc3_lastY = y;
					}
				}
			}
		}

		if(T171_initializedWithValidData) {
			if(y < T171_miny || y > T171_maxy) {
				T171_okay = false;
			} else {
				T171_okay = true;
				if(T171_lc1_horizontal) {
					T171_lc1_cached = (T171_lc1_leftOrAbove ? y <= T171_lc1_borderY : y >= T171_lc1_borderY);
				} else if(T171_lc1_vertical) {
					// nothing
				} else {
					if(T171_lc1_lastY == y - 1) {
						T171_lc1_borderX += T171_lc1_m;
						T171_lc1_lastY++;
					} else {
						T171_lc1_borderX = y*T171_lc1_m + T171_lc1_C;
						T171_lc1_lastY = y;
					}
				}
				if(T171_lc2_horizontal) {
					T171_lc2_cached = (T171_lc2_leftOrAbove ? y <= T171_lc2_borderY : y >= T171_lc2_borderY);
				} else if(T171_lc2_vertical) {
					// nothing
				} else {
					if(T171_lc2_lastY == y - 1) {
						T171_lc2_borderX += T171_lc2_m;
						T171_lc2_lastY++;
					} else {
						T171_lc2_borderX = y*T171_lc2_m + T171_lc2_C;
						T171_lc2_lastY = y;
					}
				}
				if(T171_lc3_horizontal) {
					T171_lc3_cached = (T171_lc3_leftOrAbove ? y <= T171_lc3_borderY : y >= T171_lc3_borderY);
				} else if(T171_lc3_vertical) {
					// nothing
				} else {
					if(T171_lc3_lastY == y - 1) {
						T171_lc3_borderX += T171_lc3_m;
						T171_lc3_lastY++;
					} else {
						T171_lc3_borderX = y*T171_lc3_m + T171_lc3_C;
						T171_lc3_lastY = y;
					}
				}
			}
		}

		if(T172_initializedWithValidData) {
			if(y < T172_miny || y > T172_maxy) {
				T172_okay = false;
			} else {
				T172_okay = true;
				if(T172_lc1_horizontal) {
					T172_lc1_cached = (T172_lc1_leftOrAbove ? y <= T172_lc1_borderY : y >= T172_lc1_borderY);
				} else if(T172_lc1_vertical) {
					// nothing
				} else {
					if(T172_lc1_lastY == y - 1) {
						T172_lc1_borderX += T172_lc1_m;
						T172_lc1_lastY++;
					} else {
						T172_lc1_borderX = y*T172_lc1_m + T172_lc1_C;
						T172_lc1_lastY = y;
					}
				}
				if(T172_lc2_horizontal) {
					T172_lc2_cached = (T172_lc2_leftOrAbove ? y <= T172_lc2_borderY : y >= T172_lc2_borderY);
				} else if(T172_lc2_vertical) {
					// nothing
				} else {
					if(T172_lc2_lastY == y - 1) {
						T172_lc2_borderX += T172_lc2_m;
						T172_lc2_lastY++;
					} else {
						T172_lc2_borderX = y*T172_lc2_m + T172_lc2_C;
						T172_lc2_lastY = y;
					}
				}
				if(T172_lc3_horizontal) {
					T172_lc3_cached = (T172_lc3_leftOrAbove ? y <= T172_lc3_borderY : y >= T172_lc3_borderY);
				} else if(T172_lc3_vertical) {
					// nothing
				} else {
					if(T172_lc3_lastY == y - 1) {
						T172_lc3_borderX += T172_lc3_m;
						T172_lc3_lastY++;
					} else {
						T172_lc3_borderX = y*T172_lc3_m + T172_lc3_C;
						T172_lc3_lastY = y;
					}
				}
			}
		}

		if(T173_initializedWithValidData) {
			if(y < T173_miny || y > T173_maxy) {
				T173_okay = false;
			} else {
				T173_okay = true;
				if(T173_lc1_horizontal) {
					T173_lc1_cached = (T173_lc1_leftOrAbove ? y <= T173_lc1_borderY : y >= T173_lc1_borderY);
				} else if(T173_lc1_vertical) {
					// nothing
				} else {
					if(T173_lc1_lastY == y - 1) {
						T173_lc1_borderX += T173_lc1_m;
						T173_lc1_lastY++;
					} else {
						T173_lc1_borderX = y*T173_lc1_m + T173_lc1_C;
						T173_lc1_lastY = y;
					}
				}
				if(T173_lc2_horizontal) {
					T173_lc2_cached = (T173_lc2_leftOrAbove ? y <= T173_lc2_borderY : y >= T173_lc2_borderY);
				} else if(T173_lc2_vertical) {
					// nothing
				} else {
					if(T173_lc2_lastY == y - 1) {
						T173_lc2_borderX += T173_lc2_m;
						T173_lc2_lastY++;
					} else {
						T173_lc2_borderX = y*T173_lc2_m + T173_lc2_C;
						T173_lc2_lastY = y;
					}
				}
				if(T173_lc3_horizontal) {
					T173_lc3_cached = (T173_lc3_leftOrAbove ? y <= T173_lc3_borderY : y >= T173_lc3_borderY);
				} else if(T173_lc3_vertical) {
					// nothing
				} else {
					if(T173_lc3_lastY == y - 1) {
						T173_lc3_borderX += T173_lc3_m;
						T173_lc3_lastY++;
					} else {
						T173_lc3_borderX = y*T173_lc3_m + T173_lc3_C;
						T173_lc3_lastY = y;
					}
				}
			}
		}

		if(T174_initializedWithValidData) {
			if(y < T174_miny || y > T174_maxy) {
				T174_okay = false;
			} else {
				T174_okay = true;
				if(T174_lc1_horizontal) {
					T174_lc1_cached = (T174_lc1_leftOrAbove ? y <= T174_lc1_borderY : y >= T174_lc1_borderY);
				} else if(T174_lc1_vertical) {
					// nothing
				} else {
					if(T174_lc1_lastY == y - 1) {
						T174_lc1_borderX += T174_lc1_m;
						T174_lc1_lastY++;
					} else {
						T174_lc1_borderX = y*T174_lc1_m + T174_lc1_C;
						T174_lc1_lastY = y;
					}
				}
				if(T174_lc2_horizontal) {
					T174_lc2_cached = (T174_lc2_leftOrAbove ? y <= T174_lc2_borderY : y >= T174_lc2_borderY);
				} else if(T174_lc2_vertical) {
					// nothing
				} else {
					if(T174_lc2_lastY == y - 1) {
						T174_lc2_borderX += T174_lc2_m;
						T174_lc2_lastY++;
					} else {
						T174_lc2_borderX = y*T174_lc2_m + T174_lc2_C;
						T174_lc2_lastY = y;
					}
				}
				if(T174_lc3_horizontal) {
					T174_lc3_cached = (T174_lc3_leftOrAbove ? y <= T174_lc3_borderY : y >= T174_lc3_borderY);
				} else if(T174_lc3_vertical) {
					// nothing
				} else {
					if(T174_lc3_lastY == y - 1) {
						T174_lc3_borderX += T174_lc3_m;
						T174_lc3_lastY++;
					} else {
						T174_lc3_borderX = y*T174_lc3_m + T174_lc3_C;
						T174_lc3_lastY = y;
					}
				}
			}
		}

		if(T175_initializedWithValidData) {
			if(y < T175_miny || y > T175_maxy) {
				T175_okay = false;
			} else {
				T175_okay = true;
				if(T175_lc1_horizontal) {
					T175_lc1_cached = (T175_lc1_leftOrAbove ? y <= T175_lc1_borderY : y >= T175_lc1_borderY);
				} else if(T175_lc1_vertical) {
					// nothing
				} else {
					if(T175_lc1_lastY == y - 1) {
						T175_lc1_borderX += T175_lc1_m;
						T175_lc1_lastY++;
					} else {
						T175_lc1_borderX = y*T175_lc1_m + T175_lc1_C;
						T175_lc1_lastY = y;
					}
				}
				if(T175_lc2_horizontal) {
					T175_lc2_cached = (T175_lc2_leftOrAbove ? y <= T175_lc2_borderY : y >= T175_lc2_borderY);
				} else if(T175_lc2_vertical) {
					// nothing
				} else {
					if(T175_lc2_lastY == y - 1) {
						T175_lc2_borderX += T175_lc2_m;
						T175_lc2_lastY++;
					} else {
						T175_lc2_borderX = y*T175_lc2_m + T175_lc2_C;
						T175_lc2_lastY = y;
					}
				}
				if(T175_lc3_horizontal) {
					T175_lc3_cached = (T175_lc3_leftOrAbove ? y <= T175_lc3_borderY : y >= T175_lc3_borderY);
				} else if(T175_lc3_vertical) {
					// nothing
				} else {
					if(T175_lc3_lastY == y - 1) {
						T175_lc3_borderX += T175_lc3_m;
						T175_lc3_lastY++;
					} else {
						T175_lc3_borderX = y*T175_lc3_m + T175_lc3_C;
						T175_lc3_lastY = y;
					}
				}
			}
		}

		if(T176_initializedWithValidData) {
			if(y < T176_miny || y > T176_maxy) {
				T176_okay = false;
			} else {
				T176_okay = true;
				if(T176_lc1_horizontal) {
					T176_lc1_cached = (T176_lc1_leftOrAbove ? y <= T176_lc1_borderY : y >= T176_lc1_borderY);
				} else if(T176_lc1_vertical) {
					// nothing
				} else {
					if(T176_lc1_lastY == y - 1) {
						T176_lc1_borderX += T176_lc1_m;
						T176_lc1_lastY++;
					} else {
						T176_lc1_borderX = y*T176_lc1_m + T176_lc1_C;
						T176_lc1_lastY = y;
					}
				}
				if(T176_lc2_horizontal) {
					T176_lc2_cached = (T176_lc2_leftOrAbove ? y <= T176_lc2_borderY : y >= T176_lc2_borderY);
				} else if(T176_lc2_vertical) {
					// nothing
				} else {
					if(T176_lc2_lastY == y - 1) {
						T176_lc2_borderX += T176_lc2_m;
						T176_lc2_lastY++;
					} else {
						T176_lc2_borderX = y*T176_lc2_m + T176_lc2_C;
						T176_lc2_lastY = y;
					}
				}
				if(T176_lc3_horizontal) {
					T176_lc3_cached = (T176_lc3_leftOrAbove ? y <= T176_lc3_borderY : y >= T176_lc3_borderY);
				} else if(T176_lc3_vertical) {
					// nothing
				} else {
					if(T176_lc3_lastY == y - 1) {
						T176_lc3_borderX += T176_lc3_m;
						T176_lc3_lastY++;
					} else {
						T176_lc3_borderX = y*T176_lc3_m + T176_lc3_C;
						T176_lc3_lastY = y;
					}
				}
			}
		}

		if(T177_initializedWithValidData) {
			if(y < T177_miny || y > T177_maxy) {
				T177_okay = false;
			} else {
				T177_okay = true;
				if(T177_lc1_horizontal) {
					T177_lc1_cached = (T177_lc1_leftOrAbove ? y <= T177_lc1_borderY : y >= T177_lc1_borderY);
				} else if(T177_lc1_vertical) {
					// nothing
				} else {
					if(T177_lc1_lastY == y - 1) {
						T177_lc1_borderX += T177_lc1_m;
						T177_lc1_lastY++;
					} else {
						T177_lc1_borderX = y*T177_lc1_m + T177_lc1_C;
						T177_lc1_lastY = y;
					}
				}
				if(T177_lc2_horizontal) {
					T177_lc2_cached = (T177_lc2_leftOrAbove ? y <= T177_lc2_borderY : y >= T177_lc2_borderY);
				} else if(T177_lc2_vertical) {
					// nothing
				} else {
					if(T177_lc2_lastY == y - 1) {
						T177_lc2_borderX += T177_lc2_m;
						T177_lc2_lastY++;
					} else {
						T177_lc2_borderX = y*T177_lc2_m + T177_lc2_C;
						T177_lc2_lastY = y;
					}
				}
				if(T177_lc3_horizontal) {
					T177_lc3_cached = (T177_lc3_leftOrAbove ? y <= T177_lc3_borderY : y >= T177_lc3_borderY);
				} else if(T177_lc3_vertical) {
					// nothing
				} else {
					if(T177_lc3_lastY == y - 1) {
						T177_lc3_borderX += T177_lc3_m;
						T177_lc3_lastY++;
					} else {
						T177_lc3_borderX = y*T177_lc3_m + T177_lc3_C;
						T177_lc3_lastY = y;
					}
				}
			}
		}

		if(T178_initializedWithValidData) {
			if(y < T178_miny || y > T178_maxy) {
				T178_okay = false;
			} else {
				T178_okay = true;
				if(T178_lc1_horizontal) {
					T178_lc1_cached = (T178_lc1_leftOrAbove ? y <= T178_lc1_borderY : y >= T178_lc1_borderY);
				} else if(T178_lc1_vertical) {
					// nothing
				} else {
					if(T178_lc1_lastY == y - 1) {
						T178_lc1_borderX += T178_lc1_m;
						T178_lc1_lastY++;
					} else {
						T178_lc1_borderX = y*T178_lc1_m + T178_lc1_C;
						T178_lc1_lastY = y;
					}
				}
				if(T178_lc2_horizontal) {
					T178_lc2_cached = (T178_lc2_leftOrAbove ? y <= T178_lc2_borderY : y >= T178_lc2_borderY);
				} else if(T178_lc2_vertical) {
					// nothing
				} else {
					if(T178_lc2_lastY == y - 1) {
						T178_lc2_borderX += T178_lc2_m;
						T178_lc2_lastY++;
					} else {
						T178_lc2_borderX = y*T178_lc2_m + T178_lc2_C;
						T178_lc2_lastY = y;
					}
				}
				if(T178_lc3_horizontal) {
					T178_lc3_cached = (T178_lc3_leftOrAbove ? y <= T178_lc3_borderY : y >= T178_lc3_borderY);
				} else if(T178_lc3_vertical) {
					// nothing
				} else {
					if(T178_lc3_lastY == y - 1) {
						T178_lc3_borderX += T178_lc3_m;
						T178_lc3_lastY++;
					} else {
						T178_lc3_borderX = y*T178_lc3_m + T178_lc3_C;
						T178_lc3_lastY = y;
					}
				}
			}
		}

		if(T179_initializedWithValidData) {
			if(y < T179_miny || y > T179_maxy) {
				T179_okay = false;
			} else {
				T179_okay = true;
				if(T179_lc1_horizontal) {
					T179_lc1_cached = (T179_lc1_leftOrAbove ? y <= T179_lc1_borderY : y >= T179_lc1_borderY);
				} else if(T179_lc1_vertical) {
					// nothing
				} else {
					if(T179_lc1_lastY == y - 1) {
						T179_lc1_borderX += T179_lc1_m;
						T179_lc1_lastY++;
					} else {
						T179_lc1_borderX = y*T179_lc1_m + T179_lc1_C;
						T179_lc1_lastY = y;
					}
				}
				if(T179_lc2_horizontal) {
					T179_lc2_cached = (T179_lc2_leftOrAbove ? y <= T179_lc2_borderY : y >= T179_lc2_borderY);
				} else if(T179_lc2_vertical) {
					// nothing
				} else {
					if(T179_lc2_lastY == y - 1) {
						T179_lc2_borderX += T179_lc2_m;
						T179_lc2_lastY++;
					} else {
						T179_lc2_borderX = y*T179_lc2_m + T179_lc2_C;
						T179_lc2_lastY = y;
					}
				}
				if(T179_lc3_horizontal) {
					T179_lc3_cached = (T179_lc3_leftOrAbove ? y <= T179_lc3_borderY : y >= T179_lc3_borderY);
				} else if(T179_lc3_vertical) {
					// nothing
				} else {
					if(T179_lc3_lastY == y - 1) {
						T179_lc3_borderX += T179_lc3_m;
						T179_lc3_lastY++;
					} else {
						T179_lc3_borderX = y*T179_lc3_m + T179_lc3_C;
						T179_lc3_lastY = y;
					}
				}
			}
		}
	}

	public void moveToY7(int y) {

		if(T180_initializedWithValidData) {
			if(y < T180_miny || y > T180_maxy) {
				T180_okay = false;
			} else {
				T180_okay = true;
				if(T180_lc1_horizontal) {
					T180_lc1_cached = (T180_lc1_leftOrAbove ? y <= T180_lc1_borderY : y >= T180_lc1_borderY);
				} else if(T180_lc1_vertical) {
					// nothing
				} else {
					if(T180_lc1_lastY == y - 1) {
						T180_lc1_borderX += T180_lc1_m;
						T180_lc1_lastY++;
					} else {
						T180_lc1_borderX = y*T180_lc1_m + T180_lc1_C;
						T180_lc1_lastY = y;
					}
				}
				if(T180_lc2_horizontal) {
					T180_lc2_cached = (T180_lc2_leftOrAbove ? y <= T180_lc2_borderY : y >= T180_lc2_borderY);
				} else if(T180_lc2_vertical) {
					// nothing
				} else {
					if(T180_lc2_lastY == y - 1) {
						T180_lc2_borderX += T180_lc2_m;
						T180_lc2_lastY++;
					} else {
						T180_lc2_borderX = y*T180_lc2_m + T180_lc2_C;
						T180_lc2_lastY = y;
					}
				}
				if(T180_lc3_horizontal) {
					T180_lc3_cached = (T180_lc3_leftOrAbove ? y <= T180_lc3_borderY : y >= T180_lc3_borderY);
				} else if(T180_lc3_vertical) {
					// nothing
				} else {
					if(T180_lc3_lastY == y - 1) {
						T180_lc3_borderX += T180_lc3_m;
						T180_lc3_lastY++;
					} else {
						T180_lc3_borderX = y*T180_lc3_m + T180_lc3_C;
						T180_lc3_lastY = y;
					}
				}
			}
		}

		if(T181_initializedWithValidData) {
			if(y < T181_miny || y > T181_maxy) {
				T181_okay = false;
			} else {
				T181_okay = true;
				if(T181_lc1_horizontal) {
					T181_lc1_cached = (T181_lc1_leftOrAbove ? y <= T181_lc1_borderY : y >= T181_lc1_borderY);
				} else if(T181_lc1_vertical) {
					// nothing
				} else {
					if(T181_lc1_lastY == y - 1) {
						T181_lc1_borderX += T181_lc1_m;
						T181_lc1_lastY++;
					} else {
						T181_lc1_borderX = y*T181_lc1_m + T181_lc1_C;
						T181_lc1_lastY = y;
					}
				}
				if(T181_lc2_horizontal) {
					T181_lc2_cached = (T181_lc2_leftOrAbove ? y <= T181_lc2_borderY : y >= T181_lc2_borderY);
				} else if(T181_lc2_vertical) {
					// nothing
				} else {
					if(T181_lc2_lastY == y - 1) {
						T181_lc2_borderX += T181_lc2_m;
						T181_lc2_lastY++;
					} else {
						T181_lc2_borderX = y*T181_lc2_m + T181_lc2_C;
						T181_lc2_lastY = y;
					}
				}
				if(T181_lc3_horizontal) {
					T181_lc3_cached = (T181_lc3_leftOrAbove ? y <= T181_lc3_borderY : y >= T181_lc3_borderY);
				} else if(T181_lc3_vertical) {
					// nothing
				} else {
					if(T181_lc3_lastY == y - 1) {
						T181_lc3_borderX += T181_lc3_m;
						T181_lc3_lastY++;
					} else {
						T181_lc3_borderX = y*T181_lc3_m + T181_lc3_C;
						T181_lc3_lastY = y;
					}
				}
			}
		}

		if(T182_initializedWithValidData) {
			if(y < T182_miny || y > T182_maxy) {
				T182_okay = false;
			} else {
				T182_okay = true;
				if(T182_lc1_horizontal) {
					T182_lc1_cached = (T182_lc1_leftOrAbove ? y <= T182_lc1_borderY : y >= T182_lc1_borderY);
				} else if(T182_lc1_vertical) {
					// nothing
				} else {
					if(T182_lc1_lastY == y - 1) {
						T182_lc1_borderX += T182_lc1_m;
						T182_lc1_lastY++;
					} else {
						T182_lc1_borderX = y*T182_lc1_m + T182_lc1_C;
						T182_lc1_lastY = y;
					}
				}
				if(T182_lc2_horizontal) {
					T182_lc2_cached = (T182_lc2_leftOrAbove ? y <= T182_lc2_borderY : y >= T182_lc2_borderY);
				} else if(T182_lc2_vertical) {
					// nothing
				} else {
					if(T182_lc2_lastY == y - 1) {
						T182_lc2_borderX += T182_lc2_m;
						T182_lc2_lastY++;
					} else {
						T182_lc2_borderX = y*T182_lc2_m + T182_lc2_C;
						T182_lc2_lastY = y;
					}
				}
				if(T182_lc3_horizontal) {
					T182_lc3_cached = (T182_lc3_leftOrAbove ? y <= T182_lc3_borderY : y >= T182_lc3_borderY);
				} else if(T182_lc3_vertical) {
					// nothing
				} else {
					if(T182_lc3_lastY == y - 1) {
						T182_lc3_borderX += T182_lc3_m;
						T182_lc3_lastY++;
					} else {
						T182_lc3_borderX = y*T182_lc3_m + T182_lc3_C;
						T182_lc3_lastY = y;
					}
				}
			}
		}

		if(T183_initializedWithValidData) {
			if(y < T183_miny || y > T183_maxy) {
				T183_okay = false;
			} else {
				T183_okay = true;
				if(T183_lc1_horizontal) {
					T183_lc1_cached = (T183_lc1_leftOrAbove ? y <= T183_lc1_borderY : y >= T183_lc1_borderY);
				} else if(T183_lc1_vertical) {
					// nothing
				} else {
					if(T183_lc1_lastY == y - 1) {
						T183_lc1_borderX += T183_lc1_m;
						T183_lc1_lastY++;
					} else {
						T183_lc1_borderX = y*T183_lc1_m + T183_lc1_C;
						T183_lc1_lastY = y;
					}
				}
				if(T183_lc2_horizontal) {
					T183_lc2_cached = (T183_lc2_leftOrAbove ? y <= T183_lc2_borderY : y >= T183_lc2_borderY);
				} else if(T183_lc2_vertical) {
					// nothing
				} else {
					if(T183_lc2_lastY == y - 1) {
						T183_lc2_borderX += T183_lc2_m;
						T183_lc2_lastY++;
					} else {
						T183_lc2_borderX = y*T183_lc2_m + T183_lc2_C;
						T183_lc2_lastY = y;
					}
				}
				if(T183_lc3_horizontal) {
					T183_lc3_cached = (T183_lc3_leftOrAbove ? y <= T183_lc3_borderY : y >= T183_lc3_borderY);
				} else if(T183_lc3_vertical) {
					// nothing
				} else {
					if(T183_lc3_lastY == y - 1) {
						T183_lc3_borderX += T183_lc3_m;
						T183_lc3_lastY++;
					} else {
						T183_lc3_borderX = y*T183_lc3_m + T183_lc3_C;
						T183_lc3_lastY = y;
					}
				}
			}
		}

		if(T184_initializedWithValidData) {
			if(y < T184_miny || y > T184_maxy) {
				T184_okay = false;
			} else {
				T184_okay = true;
				if(T184_lc1_horizontal) {
					T184_lc1_cached = (T184_lc1_leftOrAbove ? y <= T184_lc1_borderY : y >= T184_lc1_borderY);
				} else if(T184_lc1_vertical) {
					// nothing
				} else {
					if(T184_lc1_lastY == y - 1) {
						T184_lc1_borderX += T184_lc1_m;
						T184_lc1_lastY++;
					} else {
						T184_lc1_borderX = y*T184_lc1_m + T184_lc1_C;
						T184_lc1_lastY = y;
					}
				}
				if(T184_lc2_horizontal) {
					T184_lc2_cached = (T184_lc2_leftOrAbove ? y <= T184_lc2_borderY : y >= T184_lc2_borderY);
				} else if(T184_lc2_vertical) {
					// nothing
				} else {
					if(T184_lc2_lastY == y - 1) {
						T184_lc2_borderX += T184_lc2_m;
						T184_lc2_lastY++;
					} else {
						T184_lc2_borderX = y*T184_lc2_m + T184_lc2_C;
						T184_lc2_lastY = y;
					}
				}
				if(T184_lc3_horizontal) {
					T184_lc3_cached = (T184_lc3_leftOrAbove ? y <= T184_lc3_borderY : y >= T184_lc3_borderY);
				} else if(T184_lc3_vertical) {
					// nothing
				} else {
					if(T184_lc3_lastY == y - 1) {
						T184_lc3_borderX += T184_lc3_m;
						T184_lc3_lastY++;
					} else {
						T184_lc3_borderX = y*T184_lc3_m + T184_lc3_C;
						T184_lc3_lastY = y;
					}
				}
			}
		}

		if(T185_initializedWithValidData) {
			if(y < T185_miny || y > T185_maxy) {
				T185_okay = false;
			} else {
				T185_okay = true;
				if(T185_lc1_horizontal) {
					T185_lc1_cached = (T185_lc1_leftOrAbove ? y <= T185_lc1_borderY : y >= T185_lc1_borderY);
				} else if(T185_lc1_vertical) {
					// nothing
				} else {
					if(T185_lc1_lastY == y - 1) {
						T185_lc1_borderX += T185_lc1_m;
						T185_lc1_lastY++;
					} else {
						T185_lc1_borderX = y*T185_lc1_m + T185_lc1_C;
						T185_lc1_lastY = y;
					}
				}
				if(T185_lc2_horizontal) {
					T185_lc2_cached = (T185_lc2_leftOrAbove ? y <= T185_lc2_borderY : y >= T185_lc2_borderY);
				} else if(T185_lc2_vertical) {
					// nothing
				} else {
					if(T185_lc2_lastY == y - 1) {
						T185_lc2_borderX += T185_lc2_m;
						T185_lc2_lastY++;
					} else {
						T185_lc2_borderX = y*T185_lc2_m + T185_lc2_C;
						T185_lc2_lastY = y;
					}
				}
				if(T185_lc3_horizontal) {
					T185_lc3_cached = (T185_lc3_leftOrAbove ? y <= T185_lc3_borderY : y >= T185_lc3_borderY);
				} else if(T185_lc3_vertical) {
					// nothing
				} else {
					if(T185_lc3_lastY == y - 1) {
						T185_lc3_borderX += T185_lc3_m;
						T185_lc3_lastY++;
					} else {
						T185_lc3_borderX = y*T185_lc3_m + T185_lc3_C;
						T185_lc3_lastY = y;
					}
				}
			}
		}

		if(T186_initializedWithValidData) {
			if(y < T186_miny || y > T186_maxy) {
				T186_okay = false;
			} else {
				T186_okay = true;
				if(T186_lc1_horizontal) {
					T186_lc1_cached = (T186_lc1_leftOrAbove ? y <= T186_lc1_borderY : y >= T186_lc1_borderY);
				} else if(T186_lc1_vertical) {
					// nothing
				} else {
					if(T186_lc1_lastY == y - 1) {
						T186_lc1_borderX += T186_lc1_m;
						T186_lc1_lastY++;
					} else {
						T186_lc1_borderX = y*T186_lc1_m + T186_lc1_C;
						T186_lc1_lastY = y;
					}
				}
				if(T186_lc2_horizontal) {
					T186_lc2_cached = (T186_lc2_leftOrAbove ? y <= T186_lc2_borderY : y >= T186_lc2_borderY);
				} else if(T186_lc2_vertical) {
					// nothing
				} else {
					if(T186_lc2_lastY == y - 1) {
						T186_lc2_borderX += T186_lc2_m;
						T186_lc2_lastY++;
					} else {
						T186_lc2_borderX = y*T186_lc2_m + T186_lc2_C;
						T186_lc2_lastY = y;
					}
				}
				if(T186_lc3_horizontal) {
					T186_lc3_cached = (T186_lc3_leftOrAbove ? y <= T186_lc3_borderY : y >= T186_lc3_borderY);
				} else if(T186_lc3_vertical) {
					// nothing
				} else {
					if(T186_lc3_lastY == y - 1) {
						T186_lc3_borderX += T186_lc3_m;
						T186_lc3_lastY++;
					} else {
						T186_lc3_borderX = y*T186_lc3_m + T186_lc3_C;
						T186_lc3_lastY = y;
					}
				}
			}
		}

		if(T187_initializedWithValidData) {
			if(y < T187_miny || y > T187_maxy) {
				T187_okay = false;
			} else {
				T187_okay = true;
				if(T187_lc1_horizontal) {
					T187_lc1_cached = (T187_lc1_leftOrAbove ? y <= T187_lc1_borderY : y >= T187_lc1_borderY);
				} else if(T187_lc1_vertical) {
					// nothing
				} else {
					if(T187_lc1_lastY == y - 1) {
						T187_lc1_borderX += T187_lc1_m;
						T187_lc1_lastY++;
					} else {
						T187_lc1_borderX = y*T187_lc1_m + T187_lc1_C;
						T187_lc1_lastY = y;
					}
				}
				if(T187_lc2_horizontal) {
					T187_lc2_cached = (T187_lc2_leftOrAbove ? y <= T187_lc2_borderY : y >= T187_lc2_borderY);
				} else if(T187_lc2_vertical) {
					// nothing
				} else {
					if(T187_lc2_lastY == y - 1) {
						T187_lc2_borderX += T187_lc2_m;
						T187_lc2_lastY++;
					} else {
						T187_lc2_borderX = y*T187_lc2_m + T187_lc2_C;
						T187_lc2_lastY = y;
					}
				}
				if(T187_lc3_horizontal) {
					T187_lc3_cached = (T187_lc3_leftOrAbove ? y <= T187_lc3_borderY : y >= T187_lc3_borderY);
				} else if(T187_lc3_vertical) {
					// nothing
				} else {
					if(T187_lc3_lastY == y - 1) {
						T187_lc3_borderX += T187_lc3_m;
						T187_lc3_lastY++;
					} else {
						T187_lc3_borderX = y*T187_lc3_m + T187_lc3_C;
						T187_lc3_lastY = y;
					}
				}
			}
		}

		if(T188_initializedWithValidData) {
			if(y < T188_miny || y > T188_maxy) {
				T188_okay = false;
			} else {
				T188_okay = true;
				if(T188_lc1_horizontal) {
					T188_lc1_cached = (T188_lc1_leftOrAbove ? y <= T188_lc1_borderY : y >= T188_lc1_borderY);
				} else if(T188_lc1_vertical) {
					// nothing
				} else {
					if(T188_lc1_lastY == y - 1) {
						T188_lc1_borderX += T188_lc1_m;
						T188_lc1_lastY++;
					} else {
						T188_lc1_borderX = y*T188_lc1_m + T188_lc1_C;
						T188_lc1_lastY = y;
					}
				}
				if(T188_lc2_horizontal) {
					T188_lc2_cached = (T188_lc2_leftOrAbove ? y <= T188_lc2_borderY : y >= T188_lc2_borderY);
				} else if(T188_lc2_vertical) {
					// nothing
				} else {
					if(T188_lc2_lastY == y - 1) {
						T188_lc2_borderX += T188_lc2_m;
						T188_lc2_lastY++;
					} else {
						T188_lc2_borderX = y*T188_lc2_m + T188_lc2_C;
						T188_lc2_lastY = y;
					}
				}
				if(T188_lc3_horizontal) {
					T188_lc3_cached = (T188_lc3_leftOrAbove ? y <= T188_lc3_borderY : y >= T188_lc3_borderY);
				} else if(T188_lc3_vertical) {
					// nothing
				} else {
					if(T188_lc3_lastY == y - 1) {
						T188_lc3_borderX += T188_lc3_m;
						T188_lc3_lastY++;
					} else {
						T188_lc3_borderX = y*T188_lc3_m + T188_lc3_C;
						T188_lc3_lastY = y;
					}
				}
			}
		}

		if(T189_initializedWithValidData) {
			if(y < T189_miny || y > T189_maxy) {
				T189_okay = false;
			} else {
				T189_okay = true;
				if(T189_lc1_horizontal) {
					T189_lc1_cached = (T189_lc1_leftOrAbove ? y <= T189_lc1_borderY : y >= T189_lc1_borderY);
				} else if(T189_lc1_vertical) {
					// nothing
				} else {
					if(T189_lc1_lastY == y - 1) {
						T189_lc1_borderX += T189_lc1_m;
						T189_lc1_lastY++;
					} else {
						T189_lc1_borderX = y*T189_lc1_m + T189_lc1_C;
						T189_lc1_lastY = y;
					}
				}
				if(T189_lc2_horizontal) {
					T189_lc2_cached = (T189_lc2_leftOrAbove ? y <= T189_lc2_borderY : y >= T189_lc2_borderY);
				} else if(T189_lc2_vertical) {
					// nothing
				} else {
					if(T189_lc2_lastY == y - 1) {
						T189_lc2_borderX += T189_lc2_m;
						T189_lc2_lastY++;
					} else {
						T189_lc2_borderX = y*T189_lc2_m + T189_lc2_C;
						T189_lc2_lastY = y;
					}
				}
				if(T189_lc3_horizontal) {
					T189_lc3_cached = (T189_lc3_leftOrAbove ? y <= T189_lc3_borderY : y >= T189_lc3_borderY);
				} else if(T189_lc3_vertical) {
					// nothing
				} else {
					if(T189_lc3_lastY == y - 1) {
						T189_lc3_borderX += T189_lc3_m;
						T189_lc3_lastY++;
					} else {
						T189_lc3_borderX = y*T189_lc3_m + T189_lc3_C;
						T189_lc3_lastY = y;
					}
				}
			}
		}

		if(T190_initializedWithValidData) {
			if(y < T190_miny || y > T190_maxy) {
				T190_okay = false;
			} else {
				T190_okay = true;
				if(T190_lc1_horizontal) {
					T190_lc1_cached = (T190_lc1_leftOrAbove ? y <= T190_lc1_borderY : y >= T190_lc1_borderY);
				} else if(T190_lc1_vertical) {
					// nothing
				} else {
					if(T190_lc1_lastY == y - 1) {
						T190_lc1_borderX += T190_lc1_m;
						T190_lc1_lastY++;
					} else {
						T190_lc1_borderX = y*T190_lc1_m + T190_lc1_C;
						T190_lc1_lastY = y;
					}
				}
				if(T190_lc2_horizontal) {
					T190_lc2_cached = (T190_lc2_leftOrAbove ? y <= T190_lc2_borderY : y >= T190_lc2_borderY);
				} else if(T190_lc2_vertical) {
					// nothing
				} else {
					if(T190_lc2_lastY == y - 1) {
						T190_lc2_borderX += T190_lc2_m;
						T190_lc2_lastY++;
					} else {
						T190_lc2_borderX = y*T190_lc2_m + T190_lc2_C;
						T190_lc2_lastY = y;
					}
				}
				if(T190_lc3_horizontal) {
					T190_lc3_cached = (T190_lc3_leftOrAbove ? y <= T190_lc3_borderY : y >= T190_lc3_borderY);
				} else if(T190_lc3_vertical) {
					// nothing
				} else {
					if(T190_lc3_lastY == y - 1) {
						T190_lc3_borderX += T190_lc3_m;
						T190_lc3_lastY++;
					} else {
						T190_lc3_borderX = y*T190_lc3_m + T190_lc3_C;
						T190_lc3_lastY = y;
					}
				}
			}
		}

		if(T191_initializedWithValidData) {
			if(y < T191_miny || y > T191_maxy) {
				T191_okay = false;
			} else {
				T191_okay = true;
				if(T191_lc1_horizontal) {
					T191_lc1_cached = (T191_lc1_leftOrAbove ? y <= T191_lc1_borderY : y >= T191_lc1_borderY);
				} else if(T191_lc1_vertical) {
					// nothing
				} else {
					if(T191_lc1_lastY == y - 1) {
						T191_lc1_borderX += T191_lc1_m;
						T191_lc1_lastY++;
					} else {
						T191_lc1_borderX = y*T191_lc1_m + T191_lc1_C;
						T191_lc1_lastY = y;
					}
				}
				if(T191_lc2_horizontal) {
					T191_lc2_cached = (T191_lc2_leftOrAbove ? y <= T191_lc2_borderY : y >= T191_lc2_borderY);
				} else if(T191_lc2_vertical) {
					// nothing
				} else {
					if(T191_lc2_lastY == y - 1) {
						T191_lc2_borderX += T191_lc2_m;
						T191_lc2_lastY++;
					} else {
						T191_lc2_borderX = y*T191_lc2_m + T191_lc2_C;
						T191_lc2_lastY = y;
					}
				}
				if(T191_lc3_horizontal) {
					T191_lc3_cached = (T191_lc3_leftOrAbove ? y <= T191_lc3_borderY : y >= T191_lc3_borderY);
				} else if(T191_lc3_vertical) {
					// nothing
				} else {
					if(T191_lc3_lastY == y - 1) {
						T191_lc3_borderX += T191_lc3_m;
						T191_lc3_lastY++;
					} else {
						T191_lc3_borderX = y*T191_lc3_m + T191_lc3_C;
						T191_lc3_lastY = y;
					}
				}
			}
		}

		if(T192_initializedWithValidData) {
			if(y < T192_miny || y > T192_maxy) {
				T192_okay = false;
			} else {
				T192_okay = true;
				if(T192_lc1_horizontal) {
					T192_lc1_cached = (T192_lc1_leftOrAbove ? y <= T192_lc1_borderY : y >= T192_lc1_borderY);
				} else if(T192_lc1_vertical) {
					// nothing
				} else {
					if(T192_lc1_lastY == y - 1) {
						T192_lc1_borderX += T192_lc1_m;
						T192_lc1_lastY++;
					} else {
						T192_lc1_borderX = y*T192_lc1_m + T192_lc1_C;
						T192_lc1_lastY = y;
					}
				}
				if(T192_lc2_horizontal) {
					T192_lc2_cached = (T192_lc2_leftOrAbove ? y <= T192_lc2_borderY : y >= T192_lc2_borderY);
				} else if(T192_lc2_vertical) {
					// nothing
				} else {
					if(T192_lc2_lastY == y - 1) {
						T192_lc2_borderX += T192_lc2_m;
						T192_lc2_lastY++;
					} else {
						T192_lc2_borderX = y*T192_lc2_m + T192_lc2_C;
						T192_lc2_lastY = y;
					}
				}
				if(T192_lc3_horizontal) {
					T192_lc3_cached = (T192_lc3_leftOrAbove ? y <= T192_lc3_borderY : y >= T192_lc3_borderY);
				} else if(T192_lc3_vertical) {
					// nothing
				} else {
					if(T192_lc3_lastY == y - 1) {
						T192_lc3_borderX += T192_lc3_m;
						T192_lc3_lastY++;
					} else {
						T192_lc3_borderX = y*T192_lc3_m + T192_lc3_C;
						T192_lc3_lastY = y;
					}
				}
			}
		}

		if(T193_initializedWithValidData) {
			if(y < T193_miny || y > T193_maxy) {
				T193_okay = false;
			} else {
				T193_okay = true;
				if(T193_lc1_horizontal) {
					T193_lc1_cached = (T193_lc1_leftOrAbove ? y <= T193_lc1_borderY : y >= T193_lc1_borderY);
				} else if(T193_lc1_vertical) {
					// nothing
				} else {
					if(T193_lc1_lastY == y - 1) {
						T193_lc1_borderX += T193_lc1_m;
						T193_lc1_lastY++;
					} else {
						T193_lc1_borderX = y*T193_lc1_m + T193_lc1_C;
						T193_lc1_lastY = y;
					}
				}
				if(T193_lc2_horizontal) {
					T193_lc2_cached = (T193_lc2_leftOrAbove ? y <= T193_lc2_borderY : y >= T193_lc2_borderY);
				} else if(T193_lc2_vertical) {
					// nothing
				} else {
					if(T193_lc2_lastY == y - 1) {
						T193_lc2_borderX += T193_lc2_m;
						T193_lc2_lastY++;
					} else {
						T193_lc2_borderX = y*T193_lc2_m + T193_lc2_C;
						T193_lc2_lastY = y;
					}
				}
				if(T193_lc3_horizontal) {
					T193_lc3_cached = (T193_lc3_leftOrAbove ? y <= T193_lc3_borderY : y >= T193_lc3_borderY);
				} else if(T193_lc3_vertical) {
					// nothing
				} else {
					if(T193_lc3_lastY == y - 1) {
						T193_lc3_borderX += T193_lc3_m;
						T193_lc3_lastY++;
					} else {
						T193_lc3_borderX = y*T193_lc3_m + T193_lc3_C;
						T193_lc3_lastY = y;
					}
				}
			}
		}

		if(T194_initializedWithValidData) {
			if(y < T194_miny || y > T194_maxy) {
				T194_okay = false;
			} else {
				T194_okay = true;
				if(T194_lc1_horizontal) {
					T194_lc1_cached = (T194_lc1_leftOrAbove ? y <= T194_lc1_borderY : y >= T194_lc1_borderY);
				} else if(T194_lc1_vertical) {
					// nothing
				} else {
					if(T194_lc1_lastY == y - 1) {
						T194_lc1_borderX += T194_lc1_m;
						T194_lc1_lastY++;
					} else {
						T194_lc1_borderX = y*T194_lc1_m + T194_lc1_C;
						T194_lc1_lastY = y;
					}
				}
				if(T194_lc2_horizontal) {
					T194_lc2_cached = (T194_lc2_leftOrAbove ? y <= T194_lc2_borderY : y >= T194_lc2_borderY);
				} else if(T194_lc2_vertical) {
					// nothing
				} else {
					if(T194_lc2_lastY == y - 1) {
						T194_lc2_borderX += T194_lc2_m;
						T194_lc2_lastY++;
					} else {
						T194_lc2_borderX = y*T194_lc2_m + T194_lc2_C;
						T194_lc2_lastY = y;
					}
				}
				if(T194_lc3_horizontal) {
					T194_lc3_cached = (T194_lc3_leftOrAbove ? y <= T194_lc3_borderY : y >= T194_lc3_borderY);
				} else if(T194_lc3_vertical) {
					// nothing
				} else {
					if(T194_lc3_lastY == y - 1) {
						T194_lc3_borderX += T194_lc3_m;
						T194_lc3_lastY++;
					} else {
						T194_lc3_borderX = y*T194_lc3_m + T194_lc3_C;
						T194_lc3_lastY = y;
					}
				}
			}
		}

		if(T195_initializedWithValidData) {
			if(y < T195_miny || y > T195_maxy) {
				T195_okay = false;
			} else {
				T195_okay = true;
				if(T195_lc1_horizontal) {
					T195_lc1_cached = (T195_lc1_leftOrAbove ? y <= T195_lc1_borderY : y >= T195_lc1_borderY);
				} else if(T195_lc1_vertical) {
					// nothing
				} else {
					if(T195_lc1_lastY == y - 1) {
						T195_lc1_borderX += T195_lc1_m;
						T195_lc1_lastY++;
					} else {
						T195_lc1_borderX = y*T195_lc1_m + T195_lc1_C;
						T195_lc1_lastY = y;
					}
				}
				if(T195_lc2_horizontal) {
					T195_lc2_cached = (T195_lc2_leftOrAbove ? y <= T195_lc2_borderY : y >= T195_lc2_borderY);
				} else if(T195_lc2_vertical) {
					// nothing
				} else {
					if(T195_lc2_lastY == y - 1) {
						T195_lc2_borderX += T195_lc2_m;
						T195_lc2_lastY++;
					} else {
						T195_lc2_borderX = y*T195_lc2_m + T195_lc2_C;
						T195_lc2_lastY = y;
					}
				}
				if(T195_lc3_horizontal) {
					T195_lc3_cached = (T195_lc3_leftOrAbove ? y <= T195_lc3_borderY : y >= T195_lc3_borderY);
				} else if(T195_lc3_vertical) {
					// nothing
				} else {
					if(T195_lc3_lastY == y - 1) {
						T195_lc3_borderX += T195_lc3_m;
						T195_lc3_lastY++;
					} else {
						T195_lc3_borderX = y*T195_lc3_m + T195_lc3_C;
						T195_lc3_lastY = y;
					}
				}
			}
		}

		if(T196_initializedWithValidData) {
			if(y < T196_miny || y > T196_maxy) {
				T196_okay = false;
			} else {
				T196_okay = true;
				if(T196_lc1_horizontal) {
					T196_lc1_cached = (T196_lc1_leftOrAbove ? y <= T196_lc1_borderY : y >= T196_lc1_borderY);
				} else if(T196_lc1_vertical) {
					// nothing
				} else {
					if(T196_lc1_lastY == y - 1) {
						T196_lc1_borderX += T196_lc1_m;
						T196_lc1_lastY++;
					} else {
						T196_lc1_borderX = y*T196_lc1_m + T196_lc1_C;
						T196_lc1_lastY = y;
					}
				}
				if(T196_lc2_horizontal) {
					T196_lc2_cached = (T196_lc2_leftOrAbove ? y <= T196_lc2_borderY : y >= T196_lc2_borderY);
				} else if(T196_lc2_vertical) {
					// nothing
				} else {
					if(T196_lc2_lastY == y - 1) {
						T196_lc2_borderX += T196_lc2_m;
						T196_lc2_lastY++;
					} else {
						T196_lc2_borderX = y*T196_lc2_m + T196_lc2_C;
						T196_lc2_lastY = y;
					}
				}
				if(T196_lc3_horizontal) {
					T196_lc3_cached = (T196_lc3_leftOrAbove ? y <= T196_lc3_borderY : y >= T196_lc3_borderY);
				} else if(T196_lc3_vertical) {
					// nothing
				} else {
					if(T196_lc3_lastY == y - 1) {
						T196_lc3_borderX += T196_lc3_m;
						T196_lc3_lastY++;
					} else {
						T196_lc3_borderX = y*T196_lc3_m + T196_lc3_C;
						T196_lc3_lastY = y;
					}
				}
			}
		}

		if(T197_initializedWithValidData) {
			if(y < T197_miny || y > T197_maxy) {
				T197_okay = false;
			} else {
				T197_okay = true;
				if(T197_lc1_horizontal) {
					T197_lc1_cached = (T197_lc1_leftOrAbove ? y <= T197_lc1_borderY : y >= T197_lc1_borderY);
				} else if(T197_lc1_vertical) {
					// nothing
				} else {
					if(T197_lc1_lastY == y - 1) {
						T197_lc1_borderX += T197_lc1_m;
						T197_lc1_lastY++;
					} else {
						T197_lc1_borderX = y*T197_lc1_m + T197_lc1_C;
						T197_lc1_lastY = y;
					}
				}
				if(T197_lc2_horizontal) {
					T197_lc2_cached = (T197_lc2_leftOrAbove ? y <= T197_lc2_borderY : y >= T197_lc2_borderY);
				} else if(T197_lc2_vertical) {
					// nothing
				} else {
					if(T197_lc2_lastY == y - 1) {
						T197_lc2_borderX += T197_lc2_m;
						T197_lc2_lastY++;
					} else {
						T197_lc2_borderX = y*T197_lc2_m + T197_lc2_C;
						T197_lc2_lastY = y;
					}
				}
				if(T197_lc3_horizontal) {
					T197_lc3_cached = (T197_lc3_leftOrAbove ? y <= T197_lc3_borderY : y >= T197_lc3_borderY);
				} else if(T197_lc3_vertical) {
					// nothing
				} else {
					if(T197_lc3_lastY == y - 1) {
						T197_lc3_borderX += T197_lc3_m;
						T197_lc3_lastY++;
					} else {
						T197_lc3_borderX = y*T197_lc3_m + T197_lc3_C;
						T197_lc3_lastY = y;
					}
				}
			}
		}

		if(T198_initializedWithValidData) {
			if(y < T198_miny || y > T198_maxy) {
				T198_okay = false;
			} else {
				T198_okay = true;
				if(T198_lc1_horizontal) {
					T198_lc1_cached = (T198_lc1_leftOrAbove ? y <= T198_lc1_borderY : y >= T198_lc1_borderY);
				} else if(T198_lc1_vertical) {
					// nothing
				} else {
					if(T198_lc1_lastY == y - 1) {
						T198_lc1_borderX += T198_lc1_m;
						T198_lc1_lastY++;
					} else {
						T198_lc1_borderX = y*T198_lc1_m + T198_lc1_C;
						T198_lc1_lastY = y;
					}
				}
				if(T198_lc2_horizontal) {
					T198_lc2_cached = (T198_lc2_leftOrAbove ? y <= T198_lc2_borderY : y >= T198_lc2_borderY);
				} else if(T198_lc2_vertical) {
					// nothing
				} else {
					if(T198_lc2_lastY == y - 1) {
						T198_lc2_borderX += T198_lc2_m;
						T198_lc2_lastY++;
					} else {
						T198_lc2_borderX = y*T198_lc2_m + T198_lc2_C;
						T198_lc2_lastY = y;
					}
				}
				if(T198_lc3_horizontal) {
					T198_lc3_cached = (T198_lc3_leftOrAbove ? y <= T198_lc3_borderY : y >= T198_lc3_borderY);
				} else if(T198_lc3_vertical) {
					// nothing
				} else {
					if(T198_lc3_lastY == y - 1) {
						T198_lc3_borderX += T198_lc3_m;
						T198_lc3_lastY++;
					} else {
						T198_lc3_borderX = y*T198_lc3_m + T198_lc3_C;
						T198_lc3_lastY = y;
					}
				}
			}
		}

		if(T199_initializedWithValidData) {
			if(y < T199_miny || y > T199_maxy) {
				T199_okay = false;
			} else {
				T199_okay = true;
				if(T199_lc1_horizontal) {
					T199_lc1_cached = (T199_lc1_leftOrAbove ? y <= T199_lc1_borderY : y >= T199_lc1_borderY);
				} else if(T199_lc1_vertical) {
					// nothing
				} else {
					if(T199_lc1_lastY == y - 1) {
						T199_lc1_borderX += T199_lc1_m;
						T199_lc1_lastY++;
					} else {
						T199_lc1_borderX = y*T199_lc1_m + T199_lc1_C;
						T199_lc1_lastY = y;
					}
				}
				if(T199_lc2_horizontal) {
					T199_lc2_cached = (T199_lc2_leftOrAbove ? y <= T199_lc2_borderY : y >= T199_lc2_borderY);
				} else if(T199_lc2_vertical) {
					// nothing
				} else {
					if(T199_lc2_lastY == y - 1) {
						T199_lc2_borderX += T199_lc2_m;
						T199_lc2_lastY++;
					} else {
						T199_lc2_borderX = y*T199_lc2_m + T199_lc2_C;
						T199_lc2_lastY = y;
					}
				}
				if(T199_lc3_horizontal) {
					T199_lc3_cached = (T199_lc3_leftOrAbove ? y <= T199_lc3_borderY : y >= T199_lc3_borderY);
				} else if(T199_lc3_vertical) {
					// nothing
				} else {
					if(T199_lc3_lastY == y - 1) {
						T199_lc3_borderX += T199_lc3_m;
						T199_lc3_lastY++;
					} else {
						T199_lc3_borderX = y*T199_lc3_m + T199_lc3_C;
						T199_lc3_lastY = y;
					}
				}
			}
		}

		if(T200_initializedWithValidData) {
			if(y < T200_miny || y > T200_maxy) {
				T200_okay = false;
			} else {
				T200_okay = true;
				if(T200_lc1_horizontal) {
					T200_lc1_cached = (T200_lc1_leftOrAbove ? y <= T200_lc1_borderY : y >= T200_lc1_borderY);
				} else if(T200_lc1_vertical) {
					// nothing
				} else {
					if(T200_lc1_lastY == y - 1) {
						T200_lc1_borderX += T200_lc1_m;
						T200_lc1_lastY++;
					} else {
						T200_lc1_borderX = y*T200_lc1_m + T200_lc1_C;
						T200_lc1_lastY = y;
					}
				}
				if(T200_lc2_horizontal) {
					T200_lc2_cached = (T200_lc2_leftOrAbove ? y <= T200_lc2_borderY : y >= T200_lc2_borderY);
				} else if(T200_lc2_vertical) {
					// nothing
				} else {
					if(T200_lc2_lastY == y - 1) {
						T200_lc2_borderX += T200_lc2_m;
						T200_lc2_lastY++;
					} else {
						T200_lc2_borderX = y*T200_lc2_m + T200_lc2_C;
						T200_lc2_lastY = y;
					}
				}
				if(T200_lc3_horizontal) {
					T200_lc3_cached = (T200_lc3_leftOrAbove ? y <= T200_lc3_borderY : y >= T200_lc3_borderY);
				} else if(T200_lc3_vertical) {
					// nothing
				} else {
					if(T200_lc3_lastY == y - 1) {
						T200_lc3_borderX += T200_lc3_m;
						T200_lc3_lastY++;
					} else {
						T200_lc3_borderX = y*T200_lc3_m + T200_lc3_C;
						T200_lc3_lastY = y;
					}
				}
			}
		}

		if(T201_initializedWithValidData) {
			if(y < T201_miny || y > T201_maxy) {
				T201_okay = false;
			} else {
				T201_okay = true;
				if(T201_lc1_horizontal) {
					T201_lc1_cached = (T201_lc1_leftOrAbove ? y <= T201_lc1_borderY : y >= T201_lc1_borderY);
				} else if(T201_lc1_vertical) {
					// nothing
				} else {
					if(T201_lc1_lastY == y - 1) {
						T201_lc1_borderX += T201_lc1_m;
						T201_lc1_lastY++;
					} else {
						T201_lc1_borderX = y*T201_lc1_m + T201_lc1_C;
						T201_lc1_lastY = y;
					}
				}
				if(T201_lc2_horizontal) {
					T201_lc2_cached = (T201_lc2_leftOrAbove ? y <= T201_lc2_borderY : y >= T201_lc2_borderY);
				} else if(T201_lc2_vertical) {
					// nothing
				} else {
					if(T201_lc2_lastY == y - 1) {
						T201_lc2_borderX += T201_lc2_m;
						T201_lc2_lastY++;
					} else {
						T201_lc2_borderX = y*T201_lc2_m + T201_lc2_C;
						T201_lc2_lastY = y;
					}
				}
				if(T201_lc3_horizontal) {
					T201_lc3_cached = (T201_lc3_leftOrAbove ? y <= T201_lc3_borderY : y >= T201_lc3_borderY);
				} else if(T201_lc3_vertical) {
					// nothing
				} else {
					if(T201_lc3_lastY == y - 1) {
						T201_lc3_borderX += T201_lc3_m;
						T201_lc3_lastY++;
					} else {
						T201_lc3_borderX = y*T201_lc3_m + T201_lc3_C;
						T201_lc3_lastY = y;
					}
				}
			}
		}

		if(T202_initializedWithValidData) {
			if(y < T202_miny || y > T202_maxy) {
				T202_okay = false;
			} else {
				T202_okay = true;
				if(T202_lc1_horizontal) {
					T202_lc1_cached = (T202_lc1_leftOrAbove ? y <= T202_lc1_borderY : y >= T202_lc1_borderY);
				} else if(T202_lc1_vertical) {
					// nothing
				} else {
					if(T202_lc1_lastY == y - 1) {
						T202_lc1_borderX += T202_lc1_m;
						T202_lc1_lastY++;
					} else {
						T202_lc1_borderX = y*T202_lc1_m + T202_lc1_C;
						T202_lc1_lastY = y;
					}
				}
				if(T202_lc2_horizontal) {
					T202_lc2_cached = (T202_lc2_leftOrAbove ? y <= T202_lc2_borderY : y >= T202_lc2_borderY);
				} else if(T202_lc2_vertical) {
					// nothing
				} else {
					if(T202_lc2_lastY == y - 1) {
						T202_lc2_borderX += T202_lc2_m;
						T202_lc2_lastY++;
					} else {
						T202_lc2_borderX = y*T202_lc2_m + T202_lc2_C;
						T202_lc2_lastY = y;
					}
				}
				if(T202_lc3_horizontal) {
					T202_lc3_cached = (T202_lc3_leftOrAbove ? y <= T202_lc3_borderY : y >= T202_lc3_borderY);
				} else if(T202_lc3_vertical) {
					// nothing
				} else {
					if(T202_lc3_lastY == y - 1) {
						T202_lc3_borderX += T202_lc3_m;
						T202_lc3_lastY++;
					} else {
						T202_lc3_borderX = y*T202_lc3_m + T202_lc3_C;
						T202_lc3_lastY = y;
					}
				}
			}
		}

		if(T203_initializedWithValidData) {
			if(y < T203_miny || y > T203_maxy) {
				T203_okay = false;
			} else {
				T203_okay = true;
				if(T203_lc1_horizontal) {
					T203_lc1_cached = (T203_lc1_leftOrAbove ? y <= T203_lc1_borderY : y >= T203_lc1_borderY);
				} else if(T203_lc1_vertical) {
					// nothing
				} else {
					if(T203_lc1_lastY == y - 1) {
						T203_lc1_borderX += T203_lc1_m;
						T203_lc1_lastY++;
					} else {
						T203_lc1_borderX = y*T203_lc1_m + T203_lc1_C;
						T203_lc1_lastY = y;
					}
				}
				if(T203_lc2_horizontal) {
					T203_lc2_cached = (T203_lc2_leftOrAbove ? y <= T203_lc2_borderY : y >= T203_lc2_borderY);
				} else if(T203_lc2_vertical) {
					// nothing
				} else {
					if(T203_lc2_lastY == y - 1) {
						T203_lc2_borderX += T203_lc2_m;
						T203_lc2_lastY++;
					} else {
						T203_lc2_borderX = y*T203_lc2_m + T203_lc2_C;
						T203_lc2_lastY = y;
					}
				}
				if(T203_lc3_horizontal) {
					T203_lc3_cached = (T203_lc3_leftOrAbove ? y <= T203_lc3_borderY : y >= T203_lc3_borderY);
				} else if(T203_lc3_vertical) {
					// nothing
				} else {
					if(T203_lc3_lastY == y - 1) {
						T203_lc3_borderX += T203_lc3_m;
						T203_lc3_lastY++;
					} else {
						T203_lc3_borderX = y*T203_lc3_m + T203_lc3_C;
						T203_lc3_lastY = y;
					}
				}
			}
		}

		if(T204_initializedWithValidData) {
			if(y < T204_miny || y > T204_maxy) {
				T204_okay = false;
			} else {
				T204_okay = true;
				if(T204_lc1_horizontal) {
					T204_lc1_cached = (T204_lc1_leftOrAbove ? y <= T204_lc1_borderY : y >= T204_lc1_borderY);
				} else if(T204_lc1_vertical) {
					// nothing
				} else {
					if(T204_lc1_lastY == y - 1) {
						T204_lc1_borderX += T204_lc1_m;
						T204_lc1_lastY++;
					} else {
						T204_lc1_borderX = y*T204_lc1_m + T204_lc1_C;
						T204_lc1_lastY = y;
					}
				}
				if(T204_lc2_horizontal) {
					T204_lc2_cached = (T204_lc2_leftOrAbove ? y <= T204_lc2_borderY : y >= T204_lc2_borderY);
				} else if(T204_lc2_vertical) {
					// nothing
				} else {
					if(T204_lc2_lastY == y - 1) {
						T204_lc2_borderX += T204_lc2_m;
						T204_lc2_lastY++;
					} else {
						T204_lc2_borderX = y*T204_lc2_m + T204_lc2_C;
						T204_lc2_lastY = y;
					}
				}
				if(T204_lc3_horizontal) {
					T204_lc3_cached = (T204_lc3_leftOrAbove ? y <= T204_lc3_borderY : y >= T204_lc3_borderY);
				} else if(T204_lc3_vertical) {
					// nothing
				} else {
					if(T204_lc3_lastY == y - 1) {
						T204_lc3_borderX += T204_lc3_m;
						T204_lc3_lastY++;
					} else {
						T204_lc3_borderX = y*T204_lc3_m + T204_lc3_C;
						T204_lc3_lastY = y;
					}
				}
			}
		}

		if(T205_initializedWithValidData) {
			if(y < T205_miny || y > T205_maxy) {
				T205_okay = false;
			} else {
				T205_okay = true;
				if(T205_lc1_horizontal) {
					T205_lc1_cached = (T205_lc1_leftOrAbove ? y <= T205_lc1_borderY : y >= T205_lc1_borderY);
				} else if(T205_lc1_vertical) {
					// nothing
				} else {
					if(T205_lc1_lastY == y - 1) {
						T205_lc1_borderX += T205_lc1_m;
						T205_lc1_lastY++;
					} else {
						T205_lc1_borderX = y*T205_lc1_m + T205_lc1_C;
						T205_lc1_lastY = y;
					}
				}
				if(T205_lc2_horizontal) {
					T205_lc2_cached = (T205_lc2_leftOrAbove ? y <= T205_lc2_borderY : y >= T205_lc2_borderY);
				} else if(T205_lc2_vertical) {
					// nothing
				} else {
					if(T205_lc2_lastY == y - 1) {
						T205_lc2_borderX += T205_lc2_m;
						T205_lc2_lastY++;
					} else {
						T205_lc2_borderX = y*T205_lc2_m + T205_lc2_C;
						T205_lc2_lastY = y;
					}
				}
				if(T205_lc3_horizontal) {
					T205_lc3_cached = (T205_lc3_leftOrAbove ? y <= T205_lc3_borderY : y >= T205_lc3_borderY);
				} else if(T205_lc3_vertical) {
					// nothing
				} else {
					if(T205_lc3_lastY == y - 1) {
						T205_lc3_borderX += T205_lc3_m;
						T205_lc3_lastY++;
					} else {
						T205_lc3_borderX = y*T205_lc3_m + T205_lc3_C;
						T205_lc3_lastY = y;
					}
				}
			}
		}

		if(T206_initializedWithValidData) {
			if(y < T206_miny || y > T206_maxy) {
				T206_okay = false;
			} else {
				T206_okay = true;
				if(T206_lc1_horizontal) {
					T206_lc1_cached = (T206_lc1_leftOrAbove ? y <= T206_lc1_borderY : y >= T206_lc1_borderY);
				} else if(T206_lc1_vertical) {
					// nothing
				} else {
					if(T206_lc1_lastY == y - 1) {
						T206_lc1_borderX += T206_lc1_m;
						T206_lc1_lastY++;
					} else {
						T206_lc1_borderX = y*T206_lc1_m + T206_lc1_C;
						T206_lc1_lastY = y;
					}
				}
				if(T206_lc2_horizontal) {
					T206_lc2_cached = (T206_lc2_leftOrAbove ? y <= T206_lc2_borderY : y >= T206_lc2_borderY);
				} else if(T206_lc2_vertical) {
					// nothing
				} else {
					if(T206_lc2_lastY == y - 1) {
						T206_lc2_borderX += T206_lc2_m;
						T206_lc2_lastY++;
					} else {
						T206_lc2_borderX = y*T206_lc2_m + T206_lc2_C;
						T206_lc2_lastY = y;
					}
				}
				if(T206_lc3_horizontal) {
					T206_lc3_cached = (T206_lc3_leftOrAbove ? y <= T206_lc3_borderY : y >= T206_lc3_borderY);
				} else if(T206_lc3_vertical) {
					// nothing
				} else {
					if(T206_lc3_lastY == y - 1) {
						T206_lc3_borderX += T206_lc3_m;
						T206_lc3_lastY++;
					} else {
						T206_lc3_borderX = y*T206_lc3_m + T206_lc3_C;
						T206_lc3_lastY = y;
					}
				}
			}
		}

		if(T207_initializedWithValidData) {
			if(y < T207_miny || y > T207_maxy) {
				T207_okay = false;
			} else {
				T207_okay = true;
				if(T207_lc1_horizontal) {
					T207_lc1_cached = (T207_lc1_leftOrAbove ? y <= T207_lc1_borderY : y >= T207_lc1_borderY);
				} else if(T207_lc1_vertical) {
					// nothing
				} else {
					if(T207_lc1_lastY == y - 1) {
						T207_lc1_borderX += T207_lc1_m;
						T207_lc1_lastY++;
					} else {
						T207_lc1_borderX = y*T207_lc1_m + T207_lc1_C;
						T207_lc1_lastY = y;
					}
				}
				if(T207_lc2_horizontal) {
					T207_lc2_cached = (T207_lc2_leftOrAbove ? y <= T207_lc2_borderY : y >= T207_lc2_borderY);
				} else if(T207_lc2_vertical) {
					// nothing
				} else {
					if(T207_lc2_lastY == y - 1) {
						T207_lc2_borderX += T207_lc2_m;
						T207_lc2_lastY++;
					} else {
						T207_lc2_borderX = y*T207_lc2_m + T207_lc2_C;
						T207_lc2_lastY = y;
					}
				}
				if(T207_lc3_horizontal) {
					T207_lc3_cached = (T207_lc3_leftOrAbove ? y <= T207_lc3_borderY : y >= T207_lc3_borderY);
				} else if(T207_lc3_vertical) {
					// nothing
				} else {
					if(T207_lc3_lastY == y - 1) {
						T207_lc3_borderX += T207_lc3_m;
						T207_lc3_lastY++;
					} else {
						T207_lc3_borderX = y*T207_lc3_m + T207_lc3_C;
						T207_lc3_lastY = y;
					}
				}
			}
		}

		if(T208_initializedWithValidData) {
			if(y < T208_miny || y > T208_maxy) {
				T208_okay = false;
			} else {
				T208_okay = true;
				if(T208_lc1_horizontal) {
					T208_lc1_cached = (T208_lc1_leftOrAbove ? y <= T208_lc1_borderY : y >= T208_lc1_borderY);
				} else if(T208_lc1_vertical) {
					// nothing
				} else {
					if(T208_lc1_lastY == y - 1) {
						T208_lc1_borderX += T208_lc1_m;
						T208_lc1_lastY++;
					} else {
						T208_lc1_borderX = y*T208_lc1_m + T208_lc1_C;
						T208_lc1_lastY = y;
					}
				}
				if(T208_lc2_horizontal) {
					T208_lc2_cached = (T208_lc2_leftOrAbove ? y <= T208_lc2_borderY : y >= T208_lc2_borderY);
				} else if(T208_lc2_vertical) {
					// nothing
				} else {
					if(T208_lc2_lastY == y - 1) {
						T208_lc2_borderX += T208_lc2_m;
						T208_lc2_lastY++;
					} else {
						T208_lc2_borderX = y*T208_lc2_m + T208_lc2_C;
						T208_lc2_lastY = y;
					}
				}
				if(T208_lc3_horizontal) {
					T208_lc3_cached = (T208_lc3_leftOrAbove ? y <= T208_lc3_borderY : y >= T208_lc3_borderY);
				} else if(T208_lc3_vertical) {
					// nothing
				} else {
					if(T208_lc3_lastY == y - 1) {
						T208_lc3_borderX += T208_lc3_m;
						T208_lc3_lastY++;
					} else {
						T208_lc3_borderX = y*T208_lc3_m + T208_lc3_C;
						T208_lc3_lastY = y;
					}
				}
			}
		}

		if(T209_initializedWithValidData) {
			if(y < T209_miny || y > T209_maxy) {
				T209_okay = false;
			} else {
				T209_okay = true;
				if(T209_lc1_horizontal) {
					T209_lc1_cached = (T209_lc1_leftOrAbove ? y <= T209_lc1_borderY : y >= T209_lc1_borderY);
				} else if(T209_lc1_vertical) {
					// nothing
				} else {
					if(T209_lc1_lastY == y - 1) {
						T209_lc1_borderX += T209_lc1_m;
						T209_lc1_lastY++;
					} else {
						T209_lc1_borderX = y*T209_lc1_m + T209_lc1_C;
						T209_lc1_lastY = y;
					}
				}
				if(T209_lc2_horizontal) {
					T209_lc2_cached = (T209_lc2_leftOrAbove ? y <= T209_lc2_borderY : y >= T209_lc2_borderY);
				} else if(T209_lc2_vertical) {
					// nothing
				} else {
					if(T209_lc2_lastY == y - 1) {
						T209_lc2_borderX += T209_lc2_m;
						T209_lc2_lastY++;
					} else {
						T209_lc2_borderX = y*T209_lc2_m + T209_lc2_C;
						T209_lc2_lastY = y;
					}
				}
				if(T209_lc3_horizontal) {
					T209_lc3_cached = (T209_lc3_leftOrAbove ? y <= T209_lc3_borderY : y >= T209_lc3_borderY);
				} else if(T209_lc3_vertical) {
					// nothing
				} else {
					if(T209_lc3_lastY == y - 1) {
						T209_lc3_borderX += T209_lc3_m;
						T209_lc3_lastY++;
					} else {
						T209_lc3_borderX = y*T209_lc3_m + T209_lc3_C;
						T209_lc3_lastY = y;
					}
				}
			}
		}
	}

	public void moveToY8(int y) {

		if(T210_initializedWithValidData) {
			if(y < T210_miny || y > T210_maxy) {
				T210_okay = false;
			} else {
				T210_okay = true;
				if(T210_lc1_horizontal) {
					T210_lc1_cached = (T210_lc1_leftOrAbove ? y <= T210_lc1_borderY : y >= T210_lc1_borderY);
				} else if(T210_lc1_vertical) {
					// nothing
				} else {
					if(T210_lc1_lastY == y - 1) {
						T210_lc1_borderX += T210_lc1_m;
						T210_lc1_lastY++;
					} else {
						T210_lc1_borderX = y*T210_lc1_m + T210_lc1_C;
						T210_lc1_lastY = y;
					}
				}
				if(T210_lc2_horizontal) {
					T210_lc2_cached = (T210_lc2_leftOrAbove ? y <= T210_lc2_borderY : y >= T210_lc2_borderY);
				} else if(T210_lc2_vertical) {
					// nothing
				} else {
					if(T210_lc2_lastY == y - 1) {
						T210_lc2_borderX += T210_lc2_m;
						T210_lc2_lastY++;
					} else {
						T210_lc2_borderX = y*T210_lc2_m + T210_lc2_C;
						T210_lc2_lastY = y;
					}
				}
				if(T210_lc3_horizontal) {
					T210_lc3_cached = (T210_lc3_leftOrAbove ? y <= T210_lc3_borderY : y >= T210_lc3_borderY);
				} else if(T210_lc3_vertical) {
					// nothing
				} else {
					if(T210_lc3_lastY == y - 1) {
						T210_lc3_borderX += T210_lc3_m;
						T210_lc3_lastY++;
					} else {
						T210_lc3_borderX = y*T210_lc3_m + T210_lc3_C;
						T210_lc3_lastY = y;
					}
				}
			}
		}

		if(T211_initializedWithValidData) {
			if(y < T211_miny || y > T211_maxy) {
				T211_okay = false;
			} else {
				T211_okay = true;
				if(T211_lc1_horizontal) {
					T211_lc1_cached = (T211_lc1_leftOrAbove ? y <= T211_lc1_borderY : y >= T211_lc1_borderY);
				} else if(T211_lc1_vertical) {
					// nothing
				} else {
					if(T211_lc1_lastY == y - 1) {
						T211_lc1_borderX += T211_lc1_m;
						T211_lc1_lastY++;
					} else {
						T211_lc1_borderX = y*T211_lc1_m + T211_lc1_C;
						T211_lc1_lastY = y;
					}
				}
				if(T211_lc2_horizontal) {
					T211_lc2_cached = (T211_lc2_leftOrAbove ? y <= T211_lc2_borderY : y >= T211_lc2_borderY);
				} else if(T211_lc2_vertical) {
					// nothing
				} else {
					if(T211_lc2_lastY == y - 1) {
						T211_lc2_borderX += T211_lc2_m;
						T211_lc2_lastY++;
					} else {
						T211_lc2_borderX = y*T211_lc2_m + T211_lc2_C;
						T211_lc2_lastY = y;
					}
				}
				if(T211_lc3_horizontal) {
					T211_lc3_cached = (T211_lc3_leftOrAbove ? y <= T211_lc3_borderY : y >= T211_lc3_borderY);
				} else if(T211_lc3_vertical) {
					// nothing
				} else {
					if(T211_lc3_lastY == y - 1) {
						T211_lc3_borderX += T211_lc3_m;
						T211_lc3_lastY++;
					} else {
						T211_lc3_borderX = y*T211_lc3_m + T211_lc3_C;
						T211_lc3_lastY = y;
					}
				}
			}
		}

		if(T212_initializedWithValidData) {
			if(y < T212_miny || y > T212_maxy) {
				T212_okay = false;
			} else {
				T212_okay = true;
				if(T212_lc1_horizontal) {
					T212_lc1_cached = (T212_lc1_leftOrAbove ? y <= T212_lc1_borderY : y >= T212_lc1_borderY);
				} else if(T212_lc1_vertical) {
					// nothing
				} else {
					if(T212_lc1_lastY == y - 1) {
						T212_lc1_borderX += T212_lc1_m;
						T212_lc1_lastY++;
					} else {
						T212_lc1_borderX = y*T212_lc1_m + T212_lc1_C;
						T212_lc1_lastY = y;
					}
				}
				if(T212_lc2_horizontal) {
					T212_lc2_cached = (T212_lc2_leftOrAbove ? y <= T212_lc2_borderY : y >= T212_lc2_borderY);
				} else if(T212_lc2_vertical) {
					// nothing
				} else {
					if(T212_lc2_lastY == y - 1) {
						T212_lc2_borderX += T212_lc2_m;
						T212_lc2_lastY++;
					} else {
						T212_lc2_borderX = y*T212_lc2_m + T212_lc2_C;
						T212_lc2_lastY = y;
					}
				}
				if(T212_lc3_horizontal) {
					T212_lc3_cached = (T212_lc3_leftOrAbove ? y <= T212_lc3_borderY : y >= T212_lc3_borderY);
				} else if(T212_lc3_vertical) {
					// nothing
				} else {
					if(T212_lc3_lastY == y - 1) {
						T212_lc3_borderX += T212_lc3_m;
						T212_lc3_lastY++;
					} else {
						T212_lc3_borderX = y*T212_lc3_m + T212_lc3_C;
						T212_lc3_lastY = y;
					}
				}
			}
		}

		if(T213_initializedWithValidData) {
			if(y < T213_miny || y > T213_maxy) {
				T213_okay = false;
			} else {
				T213_okay = true;
				if(T213_lc1_horizontal) {
					T213_lc1_cached = (T213_lc1_leftOrAbove ? y <= T213_lc1_borderY : y >= T213_lc1_borderY);
				} else if(T213_lc1_vertical) {
					// nothing
				} else {
					if(T213_lc1_lastY == y - 1) {
						T213_lc1_borderX += T213_lc1_m;
						T213_lc1_lastY++;
					} else {
						T213_lc1_borderX = y*T213_lc1_m + T213_lc1_C;
						T213_lc1_lastY = y;
					}
				}
				if(T213_lc2_horizontal) {
					T213_lc2_cached = (T213_lc2_leftOrAbove ? y <= T213_lc2_borderY : y >= T213_lc2_borderY);
				} else if(T213_lc2_vertical) {
					// nothing
				} else {
					if(T213_lc2_lastY == y - 1) {
						T213_lc2_borderX += T213_lc2_m;
						T213_lc2_lastY++;
					} else {
						T213_lc2_borderX = y*T213_lc2_m + T213_lc2_C;
						T213_lc2_lastY = y;
					}
				}
				if(T213_lc3_horizontal) {
					T213_lc3_cached = (T213_lc3_leftOrAbove ? y <= T213_lc3_borderY : y >= T213_lc3_borderY);
				} else if(T213_lc3_vertical) {
					// nothing
				} else {
					if(T213_lc3_lastY == y - 1) {
						T213_lc3_borderX += T213_lc3_m;
						T213_lc3_lastY++;
					} else {
						T213_lc3_borderX = y*T213_lc3_m + T213_lc3_C;
						T213_lc3_lastY = y;
					}
				}
			}
		}

		if(T214_initializedWithValidData) {
			if(y < T214_miny || y > T214_maxy) {
				T214_okay = false;
			} else {
				T214_okay = true;
				if(T214_lc1_horizontal) {
					T214_lc1_cached = (T214_lc1_leftOrAbove ? y <= T214_lc1_borderY : y >= T214_lc1_borderY);
				} else if(T214_lc1_vertical) {
					// nothing
				} else {
					if(T214_lc1_lastY == y - 1) {
						T214_lc1_borderX += T214_lc1_m;
						T214_lc1_lastY++;
					} else {
						T214_lc1_borderX = y*T214_lc1_m + T214_lc1_C;
						T214_lc1_lastY = y;
					}
				}
				if(T214_lc2_horizontal) {
					T214_lc2_cached = (T214_lc2_leftOrAbove ? y <= T214_lc2_borderY : y >= T214_lc2_borderY);
				} else if(T214_lc2_vertical) {
					// nothing
				} else {
					if(T214_lc2_lastY == y - 1) {
						T214_lc2_borderX += T214_lc2_m;
						T214_lc2_lastY++;
					} else {
						T214_lc2_borderX = y*T214_lc2_m + T214_lc2_C;
						T214_lc2_lastY = y;
					}
				}
				if(T214_lc3_horizontal) {
					T214_lc3_cached = (T214_lc3_leftOrAbove ? y <= T214_lc3_borderY : y >= T214_lc3_borderY);
				} else if(T214_lc3_vertical) {
					// nothing
				} else {
					if(T214_lc3_lastY == y - 1) {
						T214_lc3_borderX += T214_lc3_m;
						T214_lc3_lastY++;
					} else {
						T214_lc3_borderX = y*T214_lc3_m + T214_lc3_C;
						T214_lc3_lastY = y;
					}
				}
			}
		}

		if(T215_initializedWithValidData) {
			if(y < T215_miny || y > T215_maxy) {
				T215_okay = false;
			} else {
				T215_okay = true;
				if(T215_lc1_horizontal) {
					T215_lc1_cached = (T215_lc1_leftOrAbove ? y <= T215_lc1_borderY : y >= T215_lc1_borderY);
				} else if(T215_lc1_vertical) {
					// nothing
				} else {
					if(T215_lc1_lastY == y - 1) {
						T215_lc1_borderX += T215_lc1_m;
						T215_lc1_lastY++;
					} else {
						T215_lc1_borderX = y*T215_lc1_m + T215_lc1_C;
						T215_lc1_lastY = y;
					}
				}
				if(T215_lc2_horizontal) {
					T215_lc2_cached = (T215_lc2_leftOrAbove ? y <= T215_lc2_borderY : y >= T215_lc2_borderY);
				} else if(T215_lc2_vertical) {
					// nothing
				} else {
					if(T215_lc2_lastY == y - 1) {
						T215_lc2_borderX += T215_lc2_m;
						T215_lc2_lastY++;
					} else {
						T215_lc2_borderX = y*T215_lc2_m + T215_lc2_C;
						T215_lc2_lastY = y;
					}
				}
				if(T215_lc3_horizontal) {
					T215_lc3_cached = (T215_lc3_leftOrAbove ? y <= T215_lc3_borderY : y >= T215_lc3_borderY);
				} else if(T215_lc3_vertical) {
					// nothing
				} else {
					if(T215_lc3_lastY == y - 1) {
						T215_lc3_borderX += T215_lc3_m;
						T215_lc3_lastY++;
					} else {
						T215_lc3_borderX = y*T215_lc3_m + T215_lc3_C;
						T215_lc3_lastY = y;
					}
				}
			}
		}

		if(T216_initializedWithValidData) {
			if(y < T216_miny || y > T216_maxy) {
				T216_okay = false;
			} else {
				T216_okay = true;
				if(T216_lc1_horizontal) {
					T216_lc1_cached = (T216_lc1_leftOrAbove ? y <= T216_lc1_borderY : y >= T216_lc1_borderY);
				} else if(T216_lc1_vertical) {
					// nothing
				} else {
					if(T216_lc1_lastY == y - 1) {
						T216_lc1_borderX += T216_lc1_m;
						T216_lc1_lastY++;
					} else {
						T216_lc1_borderX = y*T216_lc1_m + T216_lc1_C;
						T216_lc1_lastY = y;
					}
				}
				if(T216_lc2_horizontal) {
					T216_lc2_cached = (T216_lc2_leftOrAbove ? y <= T216_lc2_borderY : y >= T216_lc2_borderY);
				} else if(T216_lc2_vertical) {
					// nothing
				} else {
					if(T216_lc2_lastY == y - 1) {
						T216_lc2_borderX += T216_lc2_m;
						T216_lc2_lastY++;
					} else {
						T216_lc2_borderX = y*T216_lc2_m + T216_lc2_C;
						T216_lc2_lastY = y;
					}
				}
				if(T216_lc3_horizontal) {
					T216_lc3_cached = (T216_lc3_leftOrAbove ? y <= T216_lc3_borderY : y >= T216_lc3_borderY);
				} else if(T216_lc3_vertical) {
					// nothing
				} else {
					if(T216_lc3_lastY == y - 1) {
						T216_lc3_borderX += T216_lc3_m;
						T216_lc3_lastY++;
					} else {
						T216_lc3_borderX = y*T216_lc3_m + T216_lc3_C;
						T216_lc3_lastY = y;
					}
				}
			}
		}

		if(T217_initializedWithValidData) {
			if(y < T217_miny || y > T217_maxy) {
				T217_okay = false;
			} else {
				T217_okay = true;
				if(T217_lc1_horizontal) {
					T217_lc1_cached = (T217_lc1_leftOrAbove ? y <= T217_lc1_borderY : y >= T217_lc1_borderY);
				} else if(T217_lc1_vertical) {
					// nothing
				} else {
					if(T217_lc1_lastY == y - 1) {
						T217_lc1_borderX += T217_lc1_m;
						T217_lc1_lastY++;
					} else {
						T217_lc1_borderX = y*T217_lc1_m + T217_lc1_C;
						T217_lc1_lastY = y;
					}
				}
				if(T217_lc2_horizontal) {
					T217_lc2_cached = (T217_lc2_leftOrAbove ? y <= T217_lc2_borderY : y >= T217_lc2_borderY);
				} else if(T217_lc2_vertical) {
					// nothing
				} else {
					if(T217_lc2_lastY == y - 1) {
						T217_lc2_borderX += T217_lc2_m;
						T217_lc2_lastY++;
					} else {
						T217_lc2_borderX = y*T217_lc2_m + T217_lc2_C;
						T217_lc2_lastY = y;
					}
				}
				if(T217_lc3_horizontal) {
					T217_lc3_cached = (T217_lc3_leftOrAbove ? y <= T217_lc3_borderY : y >= T217_lc3_borderY);
				} else if(T217_lc3_vertical) {
					// nothing
				} else {
					if(T217_lc3_lastY == y - 1) {
						T217_lc3_borderX += T217_lc3_m;
						T217_lc3_lastY++;
					} else {
						T217_lc3_borderX = y*T217_lc3_m + T217_lc3_C;
						T217_lc3_lastY = y;
					}
				}
			}
		}

		if(T218_initializedWithValidData) {
			if(y < T218_miny || y > T218_maxy) {
				T218_okay = false;
			} else {
				T218_okay = true;
				if(T218_lc1_horizontal) {
					T218_lc1_cached = (T218_lc1_leftOrAbove ? y <= T218_lc1_borderY : y >= T218_lc1_borderY);
				} else if(T218_lc1_vertical) {
					// nothing
				} else {
					if(T218_lc1_lastY == y - 1) {
						T218_lc1_borderX += T218_lc1_m;
						T218_lc1_lastY++;
					} else {
						T218_lc1_borderX = y*T218_lc1_m + T218_lc1_C;
						T218_lc1_lastY = y;
					}
				}
				if(T218_lc2_horizontal) {
					T218_lc2_cached = (T218_lc2_leftOrAbove ? y <= T218_lc2_borderY : y >= T218_lc2_borderY);
				} else if(T218_lc2_vertical) {
					// nothing
				} else {
					if(T218_lc2_lastY == y - 1) {
						T218_lc2_borderX += T218_lc2_m;
						T218_lc2_lastY++;
					} else {
						T218_lc2_borderX = y*T218_lc2_m + T218_lc2_C;
						T218_lc2_lastY = y;
					}
				}
				if(T218_lc3_horizontal) {
					T218_lc3_cached = (T218_lc3_leftOrAbove ? y <= T218_lc3_borderY : y >= T218_lc3_borderY);
				} else if(T218_lc3_vertical) {
					// nothing
				} else {
					if(T218_lc3_lastY == y - 1) {
						T218_lc3_borderX += T218_lc3_m;
						T218_lc3_lastY++;
					} else {
						T218_lc3_borderX = y*T218_lc3_m + T218_lc3_C;
						T218_lc3_lastY = y;
					}
				}
			}
		}

		if(T219_initializedWithValidData) {
			if(y < T219_miny || y > T219_maxy) {
				T219_okay = false;
			} else {
				T219_okay = true;
				if(T219_lc1_horizontal) {
					T219_lc1_cached = (T219_lc1_leftOrAbove ? y <= T219_lc1_borderY : y >= T219_lc1_borderY);
				} else if(T219_lc1_vertical) {
					// nothing
				} else {
					if(T219_lc1_lastY == y - 1) {
						T219_lc1_borderX += T219_lc1_m;
						T219_lc1_lastY++;
					} else {
						T219_lc1_borderX = y*T219_lc1_m + T219_lc1_C;
						T219_lc1_lastY = y;
					}
				}
				if(T219_lc2_horizontal) {
					T219_lc2_cached = (T219_lc2_leftOrAbove ? y <= T219_lc2_borderY : y >= T219_lc2_borderY);
				} else if(T219_lc2_vertical) {
					// nothing
				} else {
					if(T219_lc2_lastY == y - 1) {
						T219_lc2_borderX += T219_lc2_m;
						T219_lc2_lastY++;
					} else {
						T219_lc2_borderX = y*T219_lc2_m + T219_lc2_C;
						T219_lc2_lastY = y;
					}
				}
				if(T219_lc3_horizontal) {
					T219_lc3_cached = (T219_lc3_leftOrAbove ? y <= T219_lc3_borderY : y >= T219_lc3_borderY);
				} else if(T219_lc3_vertical) {
					// nothing
				} else {
					if(T219_lc3_lastY == y - 1) {
						T219_lc3_borderX += T219_lc3_m;
						T219_lc3_lastY++;
					} else {
						T219_lc3_borderX = y*T219_lc3_m + T219_lc3_C;
						T219_lc3_lastY = y;
					}
				}
			}
		}

		if(T220_initializedWithValidData) {
			if(y < T220_miny || y > T220_maxy) {
				T220_okay = false;
			} else {
				T220_okay = true;
				if(T220_lc1_horizontal) {
					T220_lc1_cached = (T220_lc1_leftOrAbove ? y <= T220_lc1_borderY : y >= T220_lc1_borderY);
				} else if(T220_lc1_vertical) {
					// nothing
				} else {
					if(T220_lc1_lastY == y - 1) {
						T220_lc1_borderX += T220_lc1_m;
						T220_lc1_lastY++;
					} else {
						T220_lc1_borderX = y*T220_lc1_m + T220_lc1_C;
						T220_lc1_lastY = y;
					}
				}
				if(T220_lc2_horizontal) {
					T220_lc2_cached = (T220_lc2_leftOrAbove ? y <= T220_lc2_borderY : y >= T220_lc2_borderY);
				} else if(T220_lc2_vertical) {
					// nothing
				} else {
					if(T220_lc2_lastY == y - 1) {
						T220_lc2_borderX += T220_lc2_m;
						T220_lc2_lastY++;
					} else {
						T220_lc2_borderX = y*T220_lc2_m + T220_lc2_C;
						T220_lc2_lastY = y;
					}
				}
				if(T220_lc3_horizontal) {
					T220_lc3_cached = (T220_lc3_leftOrAbove ? y <= T220_lc3_borderY : y >= T220_lc3_borderY);
				} else if(T220_lc3_vertical) {
					// nothing
				} else {
					if(T220_lc3_lastY == y - 1) {
						T220_lc3_borderX += T220_lc3_m;
						T220_lc3_lastY++;
					} else {
						T220_lc3_borderX = y*T220_lc3_m + T220_lc3_C;
						T220_lc3_lastY = y;
					}
				}
			}
		}

		if(T221_initializedWithValidData) {
			if(y < T221_miny || y > T221_maxy) {
				T221_okay = false;
			} else {
				T221_okay = true;
				if(T221_lc1_horizontal) {
					T221_lc1_cached = (T221_lc1_leftOrAbove ? y <= T221_lc1_borderY : y >= T221_lc1_borderY);
				} else if(T221_lc1_vertical) {
					// nothing
				} else {
					if(T221_lc1_lastY == y - 1) {
						T221_lc1_borderX += T221_lc1_m;
						T221_lc1_lastY++;
					} else {
						T221_lc1_borderX = y*T221_lc1_m + T221_lc1_C;
						T221_lc1_lastY = y;
					}
				}
				if(T221_lc2_horizontal) {
					T221_lc2_cached = (T221_lc2_leftOrAbove ? y <= T221_lc2_borderY : y >= T221_lc2_borderY);
				} else if(T221_lc2_vertical) {
					// nothing
				} else {
					if(T221_lc2_lastY == y - 1) {
						T221_lc2_borderX += T221_lc2_m;
						T221_lc2_lastY++;
					} else {
						T221_lc2_borderX = y*T221_lc2_m + T221_lc2_C;
						T221_lc2_lastY = y;
					}
				}
				if(T221_lc3_horizontal) {
					T221_lc3_cached = (T221_lc3_leftOrAbove ? y <= T221_lc3_borderY : y >= T221_lc3_borderY);
				} else if(T221_lc3_vertical) {
					// nothing
				} else {
					if(T221_lc3_lastY == y - 1) {
						T221_lc3_borderX += T221_lc3_m;
						T221_lc3_lastY++;
					} else {
						T221_lc3_borderX = y*T221_lc3_m + T221_lc3_C;
						T221_lc3_lastY = y;
					}
				}
			}
		}

		if(T222_initializedWithValidData) {
			if(y < T222_miny || y > T222_maxy) {
				T222_okay = false;
			} else {
				T222_okay = true;
				if(T222_lc1_horizontal) {
					T222_lc1_cached = (T222_lc1_leftOrAbove ? y <= T222_lc1_borderY : y >= T222_lc1_borderY);
				} else if(T222_lc1_vertical) {
					// nothing
				} else {
					if(T222_lc1_lastY == y - 1) {
						T222_lc1_borderX += T222_lc1_m;
						T222_lc1_lastY++;
					} else {
						T222_lc1_borderX = y*T222_lc1_m + T222_lc1_C;
						T222_lc1_lastY = y;
					}
				}
				if(T222_lc2_horizontal) {
					T222_lc2_cached = (T222_lc2_leftOrAbove ? y <= T222_lc2_borderY : y >= T222_lc2_borderY);
				} else if(T222_lc2_vertical) {
					// nothing
				} else {
					if(T222_lc2_lastY == y - 1) {
						T222_lc2_borderX += T222_lc2_m;
						T222_lc2_lastY++;
					} else {
						T222_lc2_borderX = y*T222_lc2_m + T222_lc2_C;
						T222_lc2_lastY = y;
					}
				}
				if(T222_lc3_horizontal) {
					T222_lc3_cached = (T222_lc3_leftOrAbove ? y <= T222_lc3_borderY : y >= T222_lc3_borderY);
				} else if(T222_lc3_vertical) {
					// nothing
				} else {
					if(T222_lc3_lastY == y - 1) {
						T222_lc3_borderX += T222_lc3_m;
						T222_lc3_lastY++;
					} else {
						T222_lc3_borderX = y*T222_lc3_m + T222_lc3_C;
						T222_lc3_lastY = y;
					}
				}
			}
		}

		if(T223_initializedWithValidData) {
			if(y < T223_miny || y > T223_maxy) {
				T223_okay = false;
			} else {
				T223_okay = true;
				if(T223_lc1_horizontal) {
					T223_lc1_cached = (T223_lc1_leftOrAbove ? y <= T223_lc1_borderY : y >= T223_lc1_borderY);
				} else if(T223_lc1_vertical) {
					// nothing
				} else {
					if(T223_lc1_lastY == y - 1) {
						T223_lc1_borderX += T223_lc1_m;
						T223_lc1_lastY++;
					} else {
						T223_lc1_borderX = y*T223_lc1_m + T223_lc1_C;
						T223_lc1_lastY = y;
					}
				}
				if(T223_lc2_horizontal) {
					T223_lc2_cached = (T223_lc2_leftOrAbove ? y <= T223_lc2_borderY : y >= T223_lc2_borderY);
				} else if(T223_lc2_vertical) {
					// nothing
				} else {
					if(T223_lc2_lastY == y - 1) {
						T223_lc2_borderX += T223_lc2_m;
						T223_lc2_lastY++;
					} else {
						T223_lc2_borderX = y*T223_lc2_m + T223_lc2_C;
						T223_lc2_lastY = y;
					}
				}
				if(T223_lc3_horizontal) {
					T223_lc3_cached = (T223_lc3_leftOrAbove ? y <= T223_lc3_borderY : y >= T223_lc3_borderY);
				} else if(T223_lc3_vertical) {
					// nothing
				} else {
					if(T223_lc3_lastY == y - 1) {
						T223_lc3_borderX += T223_lc3_m;
						T223_lc3_lastY++;
					} else {
						T223_lc3_borderX = y*T223_lc3_m + T223_lc3_C;
						T223_lc3_lastY = y;
					}
				}
			}
		}

		if(T224_initializedWithValidData) {
			if(y < T224_miny || y > T224_maxy) {
				T224_okay = false;
			} else {
				T224_okay = true;
				if(T224_lc1_horizontal) {
					T224_lc1_cached = (T224_lc1_leftOrAbove ? y <= T224_lc1_borderY : y >= T224_lc1_borderY);
				} else if(T224_lc1_vertical) {
					// nothing
				} else {
					if(T224_lc1_lastY == y - 1) {
						T224_lc1_borderX += T224_lc1_m;
						T224_lc1_lastY++;
					} else {
						T224_lc1_borderX = y*T224_lc1_m + T224_lc1_C;
						T224_lc1_lastY = y;
					}
				}
				if(T224_lc2_horizontal) {
					T224_lc2_cached = (T224_lc2_leftOrAbove ? y <= T224_lc2_borderY : y >= T224_lc2_borderY);
				} else if(T224_lc2_vertical) {
					// nothing
				} else {
					if(T224_lc2_lastY == y - 1) {
						T224_lc2_borderX += T224_lc2_m;
						T224_lc2_lastY++;
					} else {
						T224_lc2_borderX = y*T224_lc2_m + T224_lc2_C;
						T224_lc2_lastY = y;
					}
				}
				if(T224_lc3_horizontal) {
					T224_lc3_cached = (T224_lc3_leftOrAbove ? y <= T224_lc3_borderY : y >= T224_lc3_borderY);
				} else if(T224_lc3_vertical) {
					// nothing
				} else {
					if(T224_lc3_lastY == y - 1) {
						T224_lc3_borderX += T224_lc3_m;
						T224_lc3_lastY++;
					} else {
						T224_lc3_borderX = y*T224_lc3_m + T224_lc3_C;
						T224_lc3_lastY = y;
					}
				}
			}
		}

		if(T225_initializedWithValidData) {
			if(y < T225_miny || y > T225_maxy) {
				T225_okay = false;
			} else {
				T225_okay = true;
				if(T225_lc1_horizontal) {
					T225_lc1_cached = (T225_lc1_leftOrAbove ? y <= T225_lc1_borderY : y >= T225_lc1_borderY);
				} else if(T225_lc1_vertical) {
					// nothing
				} else {
					if(T225_lc1_lastY == y - 1) {
						T225_lc1_borderX += T225_lc1_m;
						T225_lc1_lastY++;
					} else {
						T225_lc1_borderX = y*T225_lc1_m + T225_lc1_C;
						T225_lc1_lastY = y;
					}
				}
				if(T225_lc2_horizontal) {
					T225_lc2_cached = (T225_lc2_leftOrAbove ? y <= T225_lc2_borderY : y >= T225_lc2_borderY);
				} else if(T225_lc2_vertical) {
					// nothing
				} else {
					if(T225_lc2_lastY == y - 1) {
						T225_lc2_borderX += T225_lc2_m;
						T225_lc2_lastY++;
					} else {
						T225_lc2_borderX = y*T225_lc2_m + T225_lc2_C;
						T225_lc2_lastY = y;
					}
				}
				if(T225_lc3_horizontal) {
					T225_lc3_cached = (T225_lc3_leftOrAbove ? y <= T225_lc3_borderY : y >= T225_lc3_borderY);
				} else if(T225_lc3_vertical) {
					// nothing
				} else {
					if(T225_lc3_lastY == y - 1) {
						T225_lc3_borderX += T225_lc3_m;
						T225_lc3_lastY++;
					} else {
						T225_lc3_borderX = y*T225_lc3_m + T225_lc3_C;
						T225_lc3_lastY = y;
					}
				}
			}
		}

		if(T226_initializedWithValidData) {
			if(y < T226_miny || y > T226_maxy) {
				T226_okay = false;
			} else {
				T226_okay = true;
				if(T226_lc1_horizontal) {
					T226_lc1_cached = (T226_lc1_leftOrAbove ? y <= T226_lc1_borderY : y >= T226_lc1_borderY);
				} else if(T226_lc1_vertical) {
					// nothing
				} else {
					if(T226_lc1_lastY == y - 1) {
						T226_lc1_borderX += T226_lc1_m;
						T226_lc1_lastY++;
					} else {
						T226_lc1_borderX = y*T226_lc1_m + T226_lc1_C;
						T226_lc1_lastY = y;
					}
				}
				if(T226_lc2_horizontal) {
					T226_lc2_cached = (T226_lc2_leftOrAbove ? y <= T226_lc2_borderY : y >= T226_lc2_borderY);
				} else if(T226_lc2_vertical) {
					// nothing
				} else {
					if(T226_lc2_lastY == y - 1) {
						T226_lc2_borderX += T226_lc2_m;
						T226_lc2_lastY++;
					} else {
						T226_lc2_borderX = y*T226_lc2_m + T226_lc2_C;
						T226_lc2_lastY = y;
					}
				}
				if(T226_lc3_horizontal) {
					T226_lc3_cached = (T226_lc3_leftOrAbove ? y <= T226_lc3_borderY : y >= T226_lc3_borderY);
				} else if(T226_lc3_vertical) {
					// nothing
				} else {
					if(T226_lc3_lastY == y - 1) {
						T226_lc3_borderX += T226_lc3_m;
						T226_lc3_lastY++;
					} else {
						T226_lc3_borderX = y*T226_lc3_m + T226_lc3_C;
						T226_lc3_lastY = y;
					}
				}
			}
		}

		if(T227_initializedWithValidData) {
			if(y < T227_miny || y > T227_maxy) {
				T227_okay = false;
			} else {
				T227_okay = true;
				if(T227_lc1_horizontal) {
					T227_lc1_cached = (T227_lc1_leftOrAbove ? y <= T227_lc1_borderY : y >= T227_lc1_borderY);
				} else if(T227_lc1_vertical) {
					// nothing
				} else {
					if(T227_lc1_lastY == y - 1) {
						T227_lc1_borderX += T227_lc1_m;
						T227_lc1_lastY++;
					} else {
						T227_lc1_borderX = y*T227_lc1_m + T227_lc1_C;
						T227_lc1_lastY = y;
					}
				}
				if(T227_lc2_horizontal) {
					T227_lc2_cached = (T227_lc2_leftOrAbove ? y <= T227_lc2_borderY : y >= T227_lc2_borderY);
				} else if(T227_lc2_vertical) {
					// nothing
				} else {
					if(T227_lc2_lastY == y - 1) {
						T227_lc2_borderX += T227_lc2_m;
						T227_lc2_lastY++;
					} else {
						T227_lc2_borderX = y*T227_lc2_m + T227_lc2_C;
						T227_lc2_lastY = y;
					}
				}
				if(T227_lc3_horizontal) {
					T227_lc3_cached = (T227_lc3_leftOrAbove ? y <= T227_lc3_borderY : y >= T227_lc3_borderY);
				} else if(T227_lc3_vertical) {
					// nothing
				} else {
					if(T227_lc3_lastY == y - 1) {
						T227_lc3_borderX += T227_lc3_m;
						T227_lc3_lastY++;
					} else {
						T227_lc3_borderX = y*T227_lc3_m + T227_lc3_C;
						T227_lc3_lastY = y;
					}
				}
			}
		}

		if(T228_initializedWithValidData) {
			if(y < T228_miny || y > T228_maxy) {
				T228_okay = false;
			} else {
				T228_okay = true;
				if(T228_lc1_horizontal) {
					T228_lc1_cached = (T228_lc1_leftOrAbove ? y <= T228_lc1_borderY : y >= T228_lc1_borderY);
				} else if(T228_lc1_vertical) {
					// nothing
				} else {
					if(T228_lc1_lastY == y - 1) {
						T228_lc1_borderX += T228_lc1_m;
						T228_lc1_lastY++;
					} else {
						T228_lc1_borderX = y*T228_lc1_m + T228_lc1_C;
						T228_lc1_lastY = y;
					}
				}
				if(T228_lc2_horizontal) {
					T228_lc2_cached = (T228_lc2_leftOrAbove ? y <= T228_lc2_borderY : y >= T228_lc2_borderY);
				} else if(T228_lc2_vertical) {
					// nothing
				} else {
					if(T228_lc2_lastY == y - 1) {
						T228_lc2_borderX += T228_lc2_m;
						T228_lc2_lastY++;
					} else {
						T228_lc2_borderX = y*T228_lc2_m + T228_lc2_C;
						T228_lc2_lastY = y;
					}
				}
				if(T228_lc3_horizontal) {
					T228_lc3_cached = (T228_lc3_leftOrAbove ? y <= T228_lc3_borderY : y >= T228_lc3_borderY);
				} else if(T228_lc3_vertical) {
					// nothing
				} else {
					if(T228_lc3_lastY == y - 1) {
						T228_lc3_borderX += T228_lc3_m;
						T228_lc3_lastY++;
					} else {
						T228_lc3_borderX = y*T228_lc3_m + T228_lc3_C;
						T228_lc3_lastY = y;
					}
				}
			}
		}

		if(T229_initializedWithValidData) {
			if(y < T229_miny || y > T229_maxy) {
				T229_okay = false;
			} else {
				T229_okay = true;
				if(T229_lc1_horizontal) {
					T229_lc1_cached = (T229_lc1_leftOrAbove ? y <= T229_lc1_borderY : y >= T229_lc1_borderY);
				} else if(T229_lc1_vertical) {
					// nothing
				} else {
					if(T229_lc1_lastY == y - 1) {
						T229_lc1_borderX += T229_lc1_m;
						T229_lc1_lastY++;
					} else {
						T229_lc1_borderX = y*T229_lc1_m + T229_lc1_C;
						T229_lc1_lastY = y;
					}
				}
				if(T229_lc2_horizontal) {
					T229_lc2_cached = (T229_lc2_leftOrAbove ? y <= T229_lc2_borderY : y >= T229_lc2_borderY);
				} else if(T229_lc2_vertical) {
					// nothing
				} else {
					if(T229_lc2_lastY == y - 1) {
						T229_lc2_borderX += T229_lc2_m;
						T229_lc2_lastY++;
					} else {
						T229_lc2_borderX = y*T229_lc2_m + T229_lc2_C;
						T229_lc2_lastY = y;
					}
				}
				if(T229_lc3_horizontal) {
					T229_lc3_cached = (T229_lc3_leftOrAbove ? y <= T229_lc3_borderY : y >= T229_lc3_borderY);
				} else if(T229_lc3_vertical) {
					// nothing
				} else {
					if(T229_lc3_lastY == y - 1) {
						T229_lc3_borderX += T229_lc3_m;
						T229_lc3_lastY++;
					} else {
						T229_lc3_borderX = y*T229_lc3_m + T229_lc3_C;
						T229_lc3_lastY = y;
					}
				}
			}
		}

		if(T230_initializedWithValidData) {
			if(y < T230_miny || y > T230_maxy) {
				T230_okay = false;
			} else {
				T230_okay = true;
				if(T230_lc1_horizontal) {
					T230_lc1_cached = (T230_lc1_leftOrAbove ? y <= T230_lc1_borderY : y >= T230_lc1_borderY);
				} else if(T230_lc1_vertical) {
					// nothing
				} else {
					if(T230_lc1_lastY == y - 1) {
						T230_lc1_borderX += T230_lc1_m;
						T230_lc1_lastY++;
					} else {
						T230_lc1_borderX = y*T230_lc1_m + T230_lc1_C;
						T230_lc1_lastY = y;
					}
				}
				if(T230_lc2_horizontal) {
					T230_lc2_cached = (T230_lc2_leftOrAbove ? y <= T230_lc2_borderY : y >= T230_lc2_borderY);
				} else if(T230_lc2_vertical) {
					// nothing
				} else {
					if(T230_lc2_lastY == y - 1) {
						T230_lc2_borderX += T230_lc2_m;
						T230_lc2_lastY++;
					} else {
						T230_lc2_borderX = y*T230_lc2_m + T230_lc2_C;
						T230_lc2_lastY = y;
					}
				}
				if(T230_lc3_horizontal) {
					T230_lc3_cached = (T230_lc3_leftOrAbove ? y <= T230_lc3_borderY : y >= T230_lc3_borderY);
				} else if(T230_lc3_vertical) {
					// nothing
				} else {
					if(T230_lc3_lastY == y - 1) {
						T230_lc3_borderX += T230_lc3_m;
						T230_lc3_lastY++;
					} else {
						T230_lc3_borderX = y*T230_lc3_m + T230_lc3_C;
						T230_lc3_lastY = y;
					}
				}
			}
		}

		if(T231_initializedWithValidData) {
			if(y < T231_miny || y > T231_maxy) {
				T231_okay = false;
			} else {
				T231_okay = true;
				if(T231_lc1_horizontal) {
					T231_lc1_cached = (T231_lc1_leftOrAbove ? y <= T231_lc1_borderY : y >= T231_lc1_borderY);
				} else if(T231_lc1_vertical) {
					// nothing
				} else {
					if(T231_lc1_lastY == y - 1) {
						T231_lc1_borderX += T231_lc1_m;
						T231_lc1_lastY++;
					} else {
						T231_lc1_borderX = y*T231_lc1_m + T231_lc1_C;
						T231_lc1_lastY = y;
					}
				}
				if(T231_lc2_horizontal) {
					T231_lc2_cached = (T231_lc2_leftOrAbove ? y <= T231_lc2_borderY : y >= T231_lc2_borderY);
				} else if(T231_lc2_vertical) {
					// nothing
				} else {
					if(T231_lc2_lastY == y - 1) {
						T231_lc2_borderX += T231_lc2_m;
						T231_lc2_lastY++;
					} else {
						T231_lc2_borderX = y*T231_lc2_m + T231_lc2_C;
						T231_lc2_lastY = y;
					}
				}
				if(T231_lc3_horizontal) {
					T231_lc3_cached = (T231_lc3_leftOrAbove ? y <= T231_lc3_borderY : y >= T231_lc3_borderY);
				} else if(T231_lc3_vertical) {
					// nothing
				} else {
					if(T231_lc3_lastY == y - 1) {
						T231_lc3_borderX += T231_lc3_m;
						T231_lc3_lastY++;
					} else {
						T231_lc3_borderX = y*T231_lc3_m + T231_lc3_C;
						T231_lc3_lastY = y;
					}
				}
			}
		}

		if(T232_initializedWithValidData) {
			if(y < T232_miny || y > T232_maxy) {
				T232_okay = false;
			} else {
				T232_okay = true;
				if(T232_lc1_horizontal) {
					T232_lc1_cached = (T232_lc1_leftOrAbove ? y <= T232_lc1_borderY : y >= T232_lc1_borderY);
				} else if(T232_lc1_vertical) {
					// nothing
				} else {
					if(T232_lc1_lastY == y - 1) {
						T232_lc1_borderX += T232_lc1_m;
						T232_lc1_lastY++;
					} else {
						T232_lc1_borderX = y*T232_lc1_m + T232_lc1_C;
						T232_lc1_lastY = y;
					}
				}
				if(T232_lc2_horizontal) {
					T232_lc2_cached = (T232_lc2_leftOrAbove ? y <= T232_lc2_borderY : y >= T232_lc2_borderY);
				} else if(T232_lc2_vertical) {
					// nothing
				} else {
					if(T232_lc2_lastY == y - 1) {
						T232_lc2_borderX += T232_lc2_m;
						T232_lc2_lastY++;
					} else {
						T232_lc2_borderX = y*T232_lc2_m + T232_lc2_C;
						T232_lc2_lastY = y;
					}
				}
				if(T232_lc3_horizontal) {
					T232_lc3_cached = (T232_lc3_leftOrAbove ? y <= T232_lc3_borderY : y >= T232_lc3_borderY);
				} else if(T232_lc3_vertical) {
					// nothing
				} else {
					if(T232_lc3_lastY == y - 1) {
						T232_lc3_borderX += T232_lc3_m;
						T232_lc3_lastY++;
					} else {
						T232_lc3_borderX = y*T232_lc3_m + T232_lc3_C;
						T232_lc3_lastY = y;
					}
				}
			}
		}

		if(T233_initializedWithValidData) {
			if(y < T233_miny || y > T233_maxy) {
				T233_okay = false;
			} else {
				T233_okay = true;
				if(T233_lc1_horizontal) {
					T233_lc1_cached = (T233_lc1_leftOrAbove ? y <= T233_lc1_borderY : y >= T233_lc1_borderY);
				} else if(T233_lc1_vertical) {
					// nothing
				} else {
					if(T233_lc1_lastY == y - 1) {
						T233_lc1_borderX += T233_lc1_m;
						T233_lc1_lastY++;
					} else {
						T233_lc1_borderX = y*T233_lc1_m + T233_lc1_C;
						T233_lc1_lastY = y;
					}
				}
				if(T233_lc2_horizontal) {
					T233_lc2_cached = (T233_lc2_leftOrAbove ? y <= T233_lc2_borderY : y >= T233_lc2_borderY);
				} else if(T233_lc2_vertical) {
					// nothing
				} else {
					if(T233_lc2_lastY == y - 1) {
						T233_lc2_borderX += T233_lc2_m;
						T233_lc2_lastY++;
					} else {
						T233_lc2_borderX = y*T233_lc2_m + T233_lc2_C;
						T233_lc2_lastY = y;
					}
				}
				if(T233_lc3_horizontal) {
					T233_lc3_cached = (T233_lc3_leftOrAbove ? y <= T233_lc3_borderY : y >= T233_lc3_borderY);
				} else if(T233_lc3_vertical) {
					// nothing
				} else {
					if(T233_lc3_lastY == y - 1) {
						T233_lc3_borderX += T233_lc3_m;
						T233_lc3_lastY++;
					} else {
						T233_lc3_borderX = y*T233_lc3_m + T233_lc3_C;
						T233_lc3_lastY = y;
					}
				}
			}
		}

		if(T234_initializedWithValidData) {
			if(y < T234_miny || y > T234_maxy) {
				T234_okay = false;
			} else {
				T234_okay = true;
				if(T234_lc1_horizontal) {
					T234_lc1_cached = (T234_lc1_leftOrAbove ? y <= T234_lc1_borderY : y >= T234_lc1_borderY);
				} else if(T234_lc1_vertical) {
					// nothing
				} else {
					if(T234_lc1_lastY == y - 1) {
						T234_lc1_borderX += T234_lc1_m;
						T234_lc1_lastY++;
					} else {
						T234_lc1_borderX = y*T234_lc1_m + T234_lc1_C;
						T234_lc1_lastY = y;
					}
				}
				if(T234_lc2_horizontal) {
					T234_lc2_cached = (T234_lc2_leftOrAbove ? y <= T234_lc2_borderY : y >= T234_lc2_borderY);
				} else if(T234_lc2_vertical) {
					// nothing
				} else {
					if(T234_lc2_lastY == y - 1) {
						T234_lc2_borderX += T234_lc2_m;
						T234_lc2_lastY++;
					} else {
						T234_lc2_borderX = y*T234_lc2_m + T234_lc2_C;
						T234_lc2_lastY = y;
					}
				}
				if(T234_lc3_horizontal) {
					T234_lc3_cached = (T234_lc3_leftOrAbove ? y <= T234_lc3_borderY : y >= T234_lc3_borderY);
				} else if(T234_lc3_vertical) {
					// nothing
				} else {
					if(T234_lc3_lastY == y - 1) {
						T234_lc3_borderX += T234_lc3_m;
						T234_lc3_lastY++;
					} else {
						T234_lc3_borderX = y*T234_lc3_m + T234_lc3_C;
						T234_lc3_lastY = y;
					}
				}
			}
		}

		if(T235_initializedWithValidData) {
			if(y < T235_miny || y > T235_maxy) {
				T235_okay = false;
			} else {
				T235_okay = true;
				if(T235_lc1_horizontal) {
					T235_lc1_cached = (T235_lc1_leftOrAbove ? y <= T235_lc1_borderY : y >= T235_lc1_borderY);
				} else if(T235_lc1_vertical) {
					// nothing
				} else {
					if(T235_lc1_lastY == y - 1) {
						T235_lc1_borderX += T235_lc1_m;
						T235_lc1_lastY++;
					} else {
						T235_lc1_borderX = y*T235_lc1_m + T235_lc1_C;
						T235_lc1_lastY = y;
					}
				}
				if(T235_lc2_horizontal) {
					T235_lc2_cached = (T235_lc2_leftOrAbove ? y <= T235_lc2_borderY : y >= T235_lc2_borderY);
				} else if(T235_lc2_vertical) {
					// nothing
				} else {
					if(T235_lc2_lastY == y - 1) {
						T235_lc2_borderX += T235_lc2_m;
						T235_lc2_lastY++;
					} else {
						T235_lc2_borderX = y*T235_lc2_m + T235_lc2_C;
						T235_lc2_lastY = y;
					}
				}
				if(T235_lc3_horizontal) {
					T235_lc3_cached = (T235_lc3_leftOrAbove ? y <= T235_lc3_borderY : y >= T235_lc3_borderY);
				} else if(T235_lc3_vertical) {
					// nothing
				} else {
					if(T235_lc3_lastY == y - 1) {
						T235_lc3_borderX += T235_lc3_m;
						T235_lc3_lastY++;
					} else {
						T235_lc3_borderX = y*T235_lc3_m + T235_lc3_C;
						T235_lc3_lastY = y;
					}
				}
			}
		}

		if(T236_initializedWithValidData) {
			if(y < T236_miny || y > T236_maxy) {
				T236_okay = false;
			} else {
				T236_okay = true;
				if(T236_lc1_horizontal) {
					T236_lc1_cached = (T236_lc1_leftOrAbove ? y <= T236_lc1_borderY : y >= T236_lc1_borderY);
				} else if(T236_lc1_vertical) {
					// nothing
				} else {
					if(T236_lc1_lastY == y - 1) {
						T236_lc1_borderX += T236_lc1_m;
						T236_lc1_lastY++;
					} else {
						T236_lc1_borderX = y*T236_lc1_m + T236_lc1_C;
						T236_lc1_lastY = y;
					}
				}
				if(T236_lc2_horizontal) {
					T236_lc2_cached = (T236_lc2_leftOrAbove ? y <= T236_lc2_borderY : y >= T236_lc2_borderY);
				} else if(T236_lc2_vertical) {
					// nothing
				} else {
					if(T236_lc2_lastY == y - 1) {
						T236_lc2_borderX += T236_lc2_m;
						T236_lc2_lastY++;
					} else {
						T236_lc2_borderX = y*T236_lc2_m + T236_lc2_C;
						T236_lc2_lastY = y;
					}
				}
				if(T236_lc3_horizontal) {
					T236_lc3_cached = (T236_lc3_leftOrAbove ? y <= T236_lc3_borderY : y >= T236_lc3_borderY);
				} else if(T236_lc3_vertical) {
					// nothing
				} else {
					if(T236_lc3_lastY == y - 1) {
						T236_lc3_borderX += T236_lc3_m;
						T236_lc3_lastY++;
					} else {
						T236_lc3_borderX = y*T236_lc3_m + T236_lc3_C;
						T236_lc3_lastY = y;
					}
				}
			}
		}

		if(T237_initializedWithValidData) {
			if(y < T237_miny || y > T237_maxy) {
				T237_okay = false;
			} else {
				T237_okay = true;
				if(T237_lc1_horizontal) {
					T237_lc1_cached = (T237_lc1_leftOrAbove ? y <= T237_lc1_borderY : y >= T237_lc1_borderY);
				} else if(T237_lc1_vertical) {
					// nothing
				} else {
					if(T237_lc1_lastY == y - 1) {
						T237_lc1_borderX += T237_lc1_m;
						T237_lc1_lastY++;
					} else {
						T237_lc1_borderX = y*T237_lc1_m + T237_lc1_C;
						T237_lc1_lastY = y;
					}
				}
				if(T237_lc2_horizontal) {
					T237_lc2_cached = (T237_lc2_leftOrAbove ? y <= T237_lc2_borderY : y >= T237_lc2_borderY);
				} else if(T237_lc2_vertical) {
					// nothing
				} else {
					if(T237_lc2_lastY == y - 1) {
						T237_lc2_borderX += T237_lc2_m;
						T237_lc2_lastY++;
					} else {
						T237_lc2_borderX = y*T237_lc2_m + T237_lc2_C;
						T237_lc2_lastY = y;
					}
				}
				if(T237_lc3_horizontal) {
					T237_lc3_cached = (T237_lc3_leftOrAbove ? y <= T237_lc3_borderY : y >= T237_lc3_borderY);
				} else if(T237_lc3_vertical) {
					// nothing
				} else {
					if(T237_lc3_lastY == y - 1) {
						T237_lc3_borderX += T237_lc3_m;
						T237_lc3_lastY++;
					} else {
						T237_lc3_borderX = y*T237_lc3_m + T237_lc3_C;
						T237_lc3_lastY = y;
					}
				}
			}
		}

		if(T238_initializedWithValidData) {
			if(y < T238_miny || y > T238_maxy) {
				T238_okay = false;
			} else {
				T238_okay = true;
				if(T238_lc1_horizontal) {
					T238_lc1_cached = (T238_lc1_leftOrAbove ? y <= T238_lc1_borderY : y >= T238_lc1_borderY);
				} else if(T238_lc1_vertical) {
					// nothing
				} else {
					if(T238_lc1_lastY == y - 1) {
						T238_lc1_borderX += T238_lc1_m;
						T238_lc1_lastY++;
					} else {
						T238_lc1_borderX = y*T238_lc1_m + T238_lc1_C;
						T238_lc1_lastY = y;
					}
				}
				if(T238_lc2_horizontal) {
					T238_lc2_cached = (T238_lc2_leftOrAbove ? y <= T238_lc2_borderY : y >= T238_lc2_borderY);
				} else if(T238_lc2_vertical) {
					// nothing
				} else {
					if(T238_lc2_lastY == y - 1) {
						T238_lc2_borderX += T238_lc2_m;
						T238_lc2_lastY++;
					} else {
						T238_lc2_borderX = y*T238_lc2_m + T238_lc2_C;
						T238_lc2_lastY = y;
					}
				}
				if(T238_lc3_horizontal) {
					T238_lc3_cached = (T238_lc3_leftOrAbove ? y <= T238_lc3_borderY : y >= T238_lc3_borderY);
				} else if(T238_lc3_vertical) {
					// nothing
				} else {
					if(T238_lc3_lastY == y - 1) {
						T238_lc3_borderX += T238_lc3_m;
						T238_lc3_lastY++;
					} else {
						T238_lc3_borderX = y*T238_lc3_m + T238_lc3_C;
						T238_lc3_lastY = y;
					}
				}
			}
		}

		if(T239_initializedWithValidData) {
			if(y < T239_miny || y > T239_maxy) {
				T239_okay = false;
			} else {
				T239_okay = true;
				if(T239_lc1_horizontal) {
					T239_lc1_cached = (T239_lc1_leftOrAbove ? y <= T239_lc1_borderY : y >= T239_lc1_borderY);
				} else if(T239_lc1_vertical) {
					// nothing
				} else {
					if(T239_lc1_lastY == y - 1) {
						T239_lc1_borderX += T239_lc1_m;
						T239_lc1_lastY++;
					} else {
						T239_lc1_borderX = y*T239_lc1_m + T239_lc1_C;
						T239_lc1_lastY = y;
					}
				}
				if(T239_lc2_horizontal) {
					T239_lc2_cached = (T239_lc2_leftOrAbove ? y <= T239_lc2_borderY : y >= T239_lc2_borderY);
				} else if(T239_lc2_vertical) {
					// nothing
				} else {
					if(T239_lc2_lastY == y - 1) {
						T239_lc2_borderX += T239_lc2_m;
						T239_lc2_lastY++;
					} else {
						T239_lc2_borderX = y*T239_lc2_m + T239_lc2_C;
						T239_lc2_lastY = y;
					}
				}
				if(T239_lc3_horizontal) {
					T239_lc3_cached = (T239_lc3_leftOrAbove ? y <= T239_lc3_borderY : y >= T239_lc3_borderY);
				} else if(T239_lc3_vertical) {
					// nothing
				} else {
					if(T239_lc3_lastY == y - 1) {
						T239_lc3_borderX += T239_lc3_m;
						T239_lc3_lastY++;
					} else {
						T239_lc3_borderX = y*T239_lc3_m + T239_lc3_C;
						T239_lc3_lastY = y;
					}
				}
			}
		}
	}

	public void moveToY9(int y) {

		if(T240_initializedWithValidData) {
			if(y < T240_miny || y > T240_maxy) {
				T240_okay = false;
			} else {
				T240_okay = true;
				if(T240_lc1_horizontal) {
					T240_lc1_cached = (T240_lc1_leftOrAbove ? y <= T240_lc1_borderY : y >= T240_lc1_borderY);
				} else if(T240_lc1_vertical) {
					// nothing
				} else {
					if(T240_lc1_lastY == y - 1) {
						T240_lc1_borderX += T240_lc1_m;
						T240_lc1_lastY++;
					} else {
						T240_lc1_borderX = y*T240_lc1_m + T240_lc1_C;
						T240_lc1_lastY = y;
					}
				}
				if(T240_lc2_horizontal) {
					T240_lc2_cached = (T240_lc2_leftOrAbove ? y <= T240_lc2_borderY : y >= T240_lc2_borderY);
				} else if(T240_lc2_vertical) {
					// nothing
				} else {
					if(T240_lc2_lastY == y - 1) {
						T240_lc2_borderX += T240_lc2_m;
						T240_lc2_lastY++;
					} else {
						T240_lc2_borderX = y*T240_lc2_m + T240_lc2_C;
						T240_lc2_lastY = y;
					}
				}
				if(T240_lc3_horizontal) {
					T240_lc3_cached = (T240_lc3_leftOrAbove ? y <= T240_lc3_borderY : y >= T240_lc3_borderY);
				} else if(T240_lc3_vertical) {
					// nothing
				} else {
					if(T240_lc3_lastY == y - 1) {
						T240_lc3_borderX += T240_lc3_m;
						T240_lc3_lastY++;
					} else {
						T240_lc3_borderX = y*T240_lc3_m + T240_lc3_C;
						T240_lc3_lastY = y;
					}
				}
			}
		}

		if(T241_initializedWithValidData) {
			if(y < T241_miny || y > T241_maxy) {
				T241_okay = false;
			} else {
				T241_okay = true;
				if(T241_lc1_horizontal) {
					T241_lc1_cached = (T241_lc1_leftOrAbove ? y <= T241_lc1_borderY : y >= T241_lc1_borderY);
				} else if(T241_lc1_vertical) {
					// nothing
				} else {
					if(T241_lc1_lastY == y - 1) {
						T241_lc1_borderX += T241_lc1_m;
						T241_lc1_lastY++;
					} else {
						T241_lc1_borderX = y*T241_lc1_m + T241_lc1_C;
						T241_lc1_lastY = y;
					}
				}
				if(T241_lc2_horizontal) {
					T241_lc2_cached = (T241_lc2_leftOrAbove ? y <= T241_lc2_borderY : y >= T241_lc2_borderY);
				} else if(T241_lc2_vertical) {
					// nothing
				} else {
					if(T241_lc2_lastY == y - 1) {
						T241_lc2_borderX += T241_lc2_m;
						T241_lc2_lastY++;
					} else {
						T241_lc2_borderX = y*T241_lc2_m + T241_lc2_C;
						T241_lc2_lastY = y;
					}
				}
				if(T241_lc3_horizontal) {
					T241_lc3_cached = (T241_lc3_leftOrAbove ? y <= T241_lc3_borderY : y >= T241_lc3_borderY);
				} else if(T241_lc3_vertical) {
					// nothing
				} else {
					if(T241_lc3_lastY == y - 1) {
						T241_lc3_borderX += T241_lc3_m;
						T241_lc3_lastY++;
					} else {
						T241_lc3_borderX = y*T241_lc3_m + T241_lc3_C;
						T241_lc3_lastY = y;
					}
				}
			}
		}

		if(T242_initializedWithValidData) {
			if(y < T242_miny || y > T242_maxy) {
				T242_okay = false;
			} else {
				T242_okay = true;
				if(T242_lc1_horizontal) {
					T242_lc1_cached = (T242_lc1_leftOrAbove ? y <= T242_lc1_borderY : y >= T242_lc1_borderY);
				} else if(T242_lc1_vertical) {
					// nothing
				} else {
					if(T242_lc1_lastY == y - 1) {
						T242_lc1_borderX += T242_lc1_m;
						T242_lc1_lastY++;
					} else {
						T242_lc1_borderX = y*T242_lc1_m + T242_lc1_C;
						T242_lc1_lastY = y;
					}
				}
				if(T242_lc2_horizontal) {
					T242_lc2_cached = (T242_lc2_leftOrAbove ? y <= T242_lc2_borderY : y >= T242_lc2_borderY);
				} else if(T242_lc2_vertical) {
					// nothing
				} else {
					if(T242_lc2_lastY == y - 1) {
						T242_lc2_borderX += T242_lc2_m;
						T242_lc2_lastY++;
					} else {
						T242_lc2_borderX = y*T242_lc2_m + T242_lc2_C;
						T242_lc2_lastY = y;
					}
				}
				if(T242_lc3_horizontal) {
					T242_lc3_cached = (T242_lc3_leftOrAbove ? y <= T242_lc3_borderY : y >= T242_lc3_borderY);
				} else if(T242_lc3_vertical) {
					// nothing
				} else {
					if(T242_lc3_lastY == y - 1) {
						T242_lc3_borderX += T242_lc3_m;
						T242_lc3_lastY++;
					} else {
						T242_lc3_borderX = y*T242_lc3_m + T242_lc3_C;
						T242_lc3_lastY = y;
					}
				}
			}
		}

		if(T243_initializedWithValidData) {
			if(y < T243_miny || y > T243_maxy) {
				T243_okay = false;
			} else {
				T243_okay = true;
				if(T243_lc1_horizontal) {
					T243_lc1_cached = (T243_lc1_leftOrAbove ? y <= T243_lc1_borderY : y >= T243_lc1_borderY);
				} else if(T243_lc1_vertical) {
					// nothing
				} else {
					if(T243_lc1_lastY == y - 1) {
						T243_lc1_borderX += T243_lc1_m;
						T243_lc1_lastY++;
					} else {
						T243_lc1_borderX = y*T243_lc1_m + T243_lc1_C;
						T243_lc1_lastY = y;
					}
				}
				if(T243_lc2_horizontal) {
					T243_lc2_cached = (T243_lc2_leftOrAbove ? y <= T243_lc2_borderY : y >= T243_lc2_borderY);
				} else if(T243_lc2_vertical) {
					// nothing
				} else {
					if(T243_lc2_lastY == y - 1) {
						T243_lc2_borderX += T243_lc2_m;
						T243_lc2_lastY++;
					} else {
						T243_lc2_borderX = y*T243_lc2_m + T243_lc2_C;
						T243_lc2_lastY = y;
					}
				}
				if(T243_lc3_horizontal) {
					T243_lc3_cached = (T243_lc3_leftOrAbove ? y <= T243_lc3_borderY : y >= T243_lc3_borderY);
				} else if(T243_lc3_vertical) {
					// nothing
				} else {
					if(T243_lc3_lastY == y - 1) {
						T243_lc3_borderX += T243_lc3_m;
						T243_lc3_lastY++;
					} else {
						T243_lc3_borderX = y*T243_lc3_m + T243_lc3_C;
						T243_lc3_lastY = y;
					}
				}
			}
		}

		if(T244_initializedWithValidData) {
			if(y < T244_miny || y > T244_maxy) {
				T244_okay = false;
			} else {
				T244_okay = true;
				if(T244_lc1_horizontal) {
					T244_lc1_cached = (T244_lc1_leftOrAbove ? y <= T244_lc1_borderY : y >= T244_lc1_borderY);
				} else if(T244_lc1_vertical) {
					// nothing
				} else {
					if(T244_lc1_lastY == y - 1) {
						T244_lc1_borderX += T244_lc1_m;
						T244_lc1_lastY++;
					} else {
						T244_lc1_borderX = y*T244_lc1_m + T244_lc1_C;
						T244_lc1_lastY = y;
					}
				}
				if(T244_lc2_horizontal) {
					T244_lc2_cached = (T244_lc2_leftOrAbove ? y <= T244_lc2_borderY : y >= T244_lc2_borderY);
				} else if(T244_lc2_vertical) {
					// nothing
				} else {
					if(T244_lc2_lastY == y - 1) {
						T244_lc2_borderX += T244_lc2_m;
						T244_lc2_lastY++;
					} else {
						T244_lc2_borderX = y*T244_lc2_m + T244_lc2_C;
						T244_lc2_lastY = y;
					}
				}
				if(T244_lc3_horizontal) {
					T244_lc3_cached = (T244_lc3_leftOrAbove ? y <= T244_lc3_borderY : y >= T244_lc3_borderY);
				} else if(T244_lc3_vertical) {
					// nothing
				} else {
					if(T244_lc3_lastY == y - 1) {
						T244_lc3_borderX += T244_lc3_m;
						T244_lc3_lastY++;
					} else {
						T244_lc3_borderX = y*T244_lc3_m + T244_lc3_C;
						T244_lc3_lastY = y;
					}
				}
			}
		}

		if(T245_initializedWithValidData) {
			if(y < T245_miny || y > T245_maxy) {
				T245_okay = false;
			} else {
				T245_okay = true;
				if(T245_lc1_horizontal) {
					T245_lc1_cached = (T245_lc1_leftOrAbove ? y <= T245_lc1_borderY : y >= T245_lc1_borderY);
				} else if(T245_lc1_vertical) {
					// nothing
				} else {
					if(T245_lc1_lastY == y - 1) {
						T245_lc1_borderX += T245_lc1_m;
						T245_lc1_lastY++;
					} else {
						T245_lc1_borderX = y*T245_lc1_m + T245_lc1_C;
						T245_lc1_lastY = y;
					}
				}
				if(T245_lc2_horizontal) {
					T245_lc2_cached = (T245_lc2_leftOrAbove ? y <= T245_lc2_borderY : y >= T245_lc2_borderY);
				} else if(T245_lc2_vertical) {
					// nothing
				} else {
					if(T245_lc2_lastY == y - 1) {
						T245_lc2_borderX += T245_lc2_m;
						T245_lc2_lastY++;
					} else {
						T245_lc2_borderX = y*T245_lc2_m + T245_lc2_C;
						T245_lc2_lastY = y;
					}
				}
				if(T245_lc3_horizontal) {
					T245_lc3_cached = (T245_lc3_leftOrAbove ? y <= T245_lc3_borderY : y >= T245_lc3_borderY);
				} else if(T245_lc3_vertical) {
					// nothing
				} else {
					if(T245_lc3_lastY == y - 1) {
						T245_lc3_borderX += T245_lc3_m;
						T245_lc3_lastY++;
					} else {
						T245_lc3_borderX = y*T245_lc3_m + T245_lc3_C;
						T245_lc3_lastY = y;
					}
				}
			}
		}

		if(T246_initializedWithValidData) {
			if(y < T246_miny || y > T246_maxy) {
				T246_okay = false;
			} else {
				T246_okay = true;
				if(T246_lc1_horizontal) {
					T246_lc1_cached = (T246_lc1_leftOrAbove ? y <= T246_lc1_borderY : y >= T246_lc1_borderY);
				} else if(T246_lc1_vertical) {
					// nothing
				} else {
					if(T246_lc1_lastY == y - 1) {
						T246_lc1_borderX += T246_lc1_m;
						T246_lc1_lastY++;
					} else {
						T246_lc1_borderX = y*T246_lc1_m + T246_lc1_C;
						T246_lc1_lastY = y;
					}
				}
				if(T246_lc2_horizontal) {
					T246_lc2_cached = (T246_lc2_leftOrAbove ? y <= T246_lc2_borderY : y >= T246_lc2_borderY);
				} else if(T246_lc2_vertical) {
					// nothing
				} else {
					if(T246_lc2_lastY == y - 1) {
						T246_lc2_borderX += T246_lc2_m;
						T246_lc2_lastY++;
					} else {
						T246_lc2_borderX = y*T246_lc2_m + T246_lc2_C;
						T246_lc2_lastY = y;
					}
				}
				if(T246_lc3_horizontal) {
					T246_lc3_cached = (T246_lc3_leftOrAbove ? y <= T246_lc3_borderY : y >= T246_lc3_borderY);
				} else if(T246_lc3_vertical) {
					// nothing
				} else {
					if(T246_lc3_lastY == y - 1) {
						T246_lc3_borderX += T246_lc3_m;
						T246_lc3_lastY++;
					} else {
						T246_lc3_borderX = y*T246_lc3_m + T246_lc3_C;
						T246_lc3_lastY = y;
					}
				}
			}
		}

		if(T247_initializedWithValidData) {
			if(y < T247_miny || y > T247_maxy) {
				T247_okay = false;
			} else {
				T247_okay = true;
				if(T247_lc1_horizontal) {
					T247_lc1_cached = (T247_lc1_leftOrAbove ? y <= T247_lc1_borderY : y >= T247_lc1_borderY);
				} else if(T247_lc1_vertical) {
					// nothing
				} else {
					if(T247_lc1_lastY == y - 1) {
						T247_lc1_borderX += T247_lc1_m;
						T247_lc1_lastY++;
					} else {
						T247_lc1_borderX = y*T247_lc1_m + T247_lc1_C;
						T247_lc1_lastY = y;
					}
				}
				if(T247_lc2_horizontal) {
					T247_lc2_cached = (T247_lc2_leftOrAbove ? y <= T247_lc2_borderY : y >= T247_lc2_borderY);
				} else if(T247_lc2_vertical) {
					// nothing
				} else {
					if(T247_lc2_lastY == y - 1) {
						T247_lc2_borderX += T247_lc2_m;
						T247_lc2_lastY++;
					} else {
						T247_lc2_borderX = y*T247_lc2_m + T247_lc2_C;
						T247_lc2_lastY = y;
					}
				}
				if(T247_lc3_horizontal) {
					T247_lc3_cached = (T247_lc3_leftOrAbove ? y <= T247_lc3_borderY : y >= T247_lc3_borderY);
				} else if(T247_lc3_vertical) {
					// nothing
				} else {
					if(T247_lc3_lastY == y - 1) {
						T247_lc3_borderX += T247_lc3_m;
						T247_lc3_lastY++;
					} else {
						T247_lc3_borderX = y*T247_lc3_m + T247_lc3_C;
						T247_lc3_lastY = y;
					}
				}
			}
		}

		if(T248_initializedWithValidData) {
			if(y < T248_miny || y > T248_maxy) {
				T248_okay = false;
			} else {
				T248_okay = true;
				if(T248_lc1_horizontal) {
					T248_lc1_cached = (T248_lc1_leftOrAbove ? y <= T248_lc1_borderY : y >= T248_lc1_borderY);
				} else if(T248_lc1_vertical) {
					// nothing
				} else {
					if(T248_lc1_lastY == y - 1) {
						T248_lc1_borderX += T248_lc1_m;
						T248_lc1_lastY++;
					} else {
						T248_lc1_borderX = y*T248_lc1_m + T248_lc1_C;
						T248_lc1_lastY = y;
					}
				}
				if(T248_lc2_horizontal) {
					T248_lc2_cached = (T248_lc2_leftOrAbove ? y <= T248_lc2_borderY : y >= T248_lc2_borderY);
				} else if(T248_lc2_vertical) {
					// nothing
				} else {
					if(T248_lc2_lastY == y - 1) {
						T248_lc2_borderX += T248_lc2_m;
						T248_lc2_lastY++;
					} else {
						T248_lc2_borderX = y*T248_lc2_m + T248_lc2_C;
						T248_lc2_lastY = y;
					}
				}
				if(T248_lc3_horizontal) {
					T248_lc3_cached = (T248_lc3_leftOrAbove ? y <= T248_lc3_borderY : y >= T248_lc3_borderY);
				} else if(T248_lc3_vertical) {
					// nothing
				} else {
					if(T248_lc3_lastY == y - 1) {
						T248_lc3_borderX += T248_lc3_m;
						T248_lc3_lastY++;
					} else {
						T248_lc3_borderX = y*T248_lc3_m + T248_lc3_C;
						T248_lc3_lastY = y;
					}
				}
			}
		}

		if(T249_initializedWithValidData) {
			if(y < T249_miny || y > T249_maxy) {
				T249_okay = false;
			} else {
				T249_okay = true;
				if(T249_lc1_horizontal) {
					T249_lc1_cached = (T249_lc1_leftOrAbove ? y <= T249_lc1_borderY : y >= T249_lc1_borderY);
				} else if(T249_lc1_vertical) {
					// nothing
				} else {
					if(T249_lc1_lastY == y - 1) {
						T249_lc1_borderX += T249_lc1_m;
						T249_lc1_lastY++;
					} else {
						T249_lc1_borderX = y*T249_lc1_m + T249_lc1_C;
						T249_lc1_lastY = y;
					}
				}
				if(T249_lc2_horizontal) {
					T249_lc2_cached = (T249_lc2_leftOrAbove ? y <= T249_lc2_borderY : y >= T249_lc2_borderY);
				} else if(T249_lc2_vertical) {
					// nothing
				} else {
					if(T249_lc2_lastY == y - 1) {
						T249_lc2_borderX += T249_lc2_m;
						T249_lc2_lastY++;
					} else {
						T249_lc2_borderX = y*T249_lc2_m + T249_lc2_C;
						T249_lc2_lastY = y;
					}
				}
				if(T249_lc3_horizontal) {
					T249_lc3_cached = (T249_lc3_leftOrAbove ? y <= T249_lc3_borderY : y >= T249_lc3_borderY);
				} else if(T249_lc3_vertical) {
					// nothing
				} else {
					if(T249_lc3_lastY == y - 1) {
						T249_lc3_borderX += T249_lc3_m;
						T249_lc3_lastY++;
					} else {
						T249_lc3_borderX = y*T249_lc3_m + T249_lc3_C;
						T249_lc3_lastY = y;
					}
				}
			}
		}

		if(T250_initializedWithValidData) {
			if(y < T250_miny || y > T250_maxy) {
				T250_okay = false;
			} else {
				T250_okay = true;
				if(T250_lc1_horizontal) {
					T250_lc1_cached = (T250_lc1_leftOrAbove ? y <= T250_lc1_borderY : y >= T250_lc1_borderY);
				} else if(T250_lc1_vertical) {
					// nothing
				} else {
					if(T250_lc1_lastY == y - 1) {
						T250_lc1_borderX += T250_lc1_m;
						T250_lc1_lastY++;
					} else {
						T250_lc1_borderX = y*T250_lc1_m + T250_lc1_C;
						T250_lc1_lastY = y;
					}
				}
				if(T250_lc2_horizontal) {
					T250_lc2_cached = (T250_lc2_leftOrAbove ? y <= T250_lc2_borderY : y >= T250_lc2_borderY);
				} else if(T250_lc2_vertical) {
					// nothing
				} else {
					if(T250_lc2_lastY == y - 1) {
						T250_lc2_borderX += T250_lc2_m;
						T250_lc2_lastY++;
					} else {
						T250_lc2_borderX = y*T250_lc2_m + T250_lc2_C;
						T250_lc2_lastY = y;
					}
				}
				if(T250_lc3_horizontal) {
					T250_lc3_cached = (T250_lc3_leftOrAbove ? y <= T250_lc3_borderY : y >= T250_lc3_borderY);
				} else if(T250_lc3_vertical) {
					// nothing
				} else {
					if(T250_lc3_lastY == y - 1) {
						T250_lc3_borderX += T250_lc3_m;
						T250_lc3_lastY++;
					} else {
						T250_lc3_borderX = y*T250_lc3_m + T250_lc3_C;
						T250_lc3_lastY = y;
					}
				}
			}
		}

		if(T251_initializedWithValidData) {
			if(y < T251_miny || y > T251_maxy) {
				T251_okay = false;
			} else {
				T251_okay = true;
				if(T251_lc1_horizontal) {
					T251_lc1_cached = (T251_lc1_leftOrAbove ? y <= T251_lc1_borderY : y >= T251_lc1_borderY);
				} else if(T251_lc1_vertical) {
					// nothing
				} else {
					if(T251_lc1_lastY == y - 1) {
						T251_lc1_borderX += T251_lc1_m;
						T251_lc1_lastY++;
					} else {
						T251_lc1_borderX = y*T251_lc1_m + T251_lc1_C;
						T251_lc1_lastY = y;
					}
				}
				if(T251_lc2_horizontal) {
					T251_lc2_cached = (T251_lc2_leftOrAbove ? y <= T251_lc2_borderY : y >= T251_lc2_borderY);
				} else if(T251_lc2_vertical) {
					// nothing
				} else {
					if(T251_lc2_lastY == y - 1) {
						T251_lc2_borderX += T251_lc2_m;
						T251_lc2_lastY++;
					} else {
						T251_lc2_borderX = y*T251_lc2_m + T251_lc2_C;
						T251_lc2_lastY = y;
					}
				}
				if(T251_lc3_horizontal) {
					T251_lc3_cached = (T251_lc3_leftOrAbove ? y <= T251_lc3_borderY : y >= T251_lc3_borderY);
				} else if(T251_lc3_vertical) {
					// nothing
				} else {
					if(T251_lc3_lastY == y - 1) {
						T251_lc3_borderX += T251_lc3_m;
						T251_lc3_lastY++;
					} else {
						T251_lc3_borderX = y*T251_lc3_m + T251_lc3_C;
						T251_lc3_lastY = y;
					}
				}
			}
		}

		if(T252_initializedWithValidData) {
			if(y < T252_miny || y > T252_maxy) {
				T252_okay = false;
			} else {
				T252_okay = true;
				if(T252_lc1_horizontal) {
					T252_lc1_cached = (T252_lc1_leftOrAbove ? y <= T252_lc1_borderY : y >= T252_lc1_borderY);
				} else if(T252_lc1_vertical) {
					// nothing
				} else {
					if(T252_lc1_lastY == y - 1) {
						T252_lc1_borderX += T252_lc1_m;
						T252_lc1_lastY++;
					} else {
						T252_lc1_borderX = y*T252_lc1_m + T252_lc1_C;
						T252_lc1_lastY = y;
					}
				}
				if(T252_lc2_horizontal) {
					T252_lc2_cached = (T252_lc2_leftOrAbove ? y <= T252_lc2_borderY : y >= T252_lc2_borderY);
				} else if(T252_lc2_vertical) {
					// nothing
				} else {
					if(T252_lc2_lastY == y - 1) {
						T252_lc2_borderX += T252_lc2_m;
						T252_lc2_lastY++;
					} else {
						T252_lc2_borderX = y*T252_lc2_m + T252_lc2_C;
						T252_lc2_lastY = y;
					}
				}
				if(T252_lc3_horizontal) {
					T252_lc3_cached = (T252_lc3_leftOrAbove ? y <= T252_lc3_borderY : y >= T252_lc3_borderY);
				} else if(T252_lc3_vertical) {
					// nothing
				} else {
					if(T252_lc3_lastY == y - 1) {
						T252_lc3_borderX += T252_lc3_m;
						T252_lc3_lastY++;
					} else {
						T252_lc3_borderX = y*T252_lc3_m + T252_lc3_C;
						T252_lc3_lastY = y;
					}
				}
			}
		}

		if(T253_initializedWithValidData) {
			if(y < T253_miny || y > T253_maxy) {
				T253_okay = false;
			} else {
				T253_okay = true;
				if(T253_lc1_horizontal) {
					T253_lc1_cached = (T253_lc1_leftOrAbove ? y <= T253_lc1_borderY : y >= T253_lc1_borderY);
				} else if(T253_lc1_vertical) {
					// nothing
				} else {
					if(T253_lc1_lastY == y - 1) {
						T253_lc1_borderX += T253_lc1_m;
						T253_lc1_lastY++;
					} else {
						T253_lc1_borderX = y*T253_lc1_m + T253_lc1_C;
						T253_lc1_lastY = y;
					}
				}
				if(T253_lc2_horizontal) {
					T253_lc2_cached = (T253_lc2_leftOrAbove ? y <= T253_lc2_borderY : y >= T253_lc2_borderY);
				} else if(T253_lc2_vertical) {
					// nothing
				} else {
					if(T253_lc2_lastY == y - 1) {
						T253_lc2_borderX += T253_lc2_m;
						T253_lc2_lastY++;
					} else {
						T253_lc2_borderX = y*T253_lc2_m + T253_lc2_C;
						T253_lc2_lastY = y;
					}
				}
				if(T253_lc3_horizontal) {
					T253_lc3_cached = (T253_lc3_leftOrAbove ? y <= T253_lc3_borderY : y >= T253_lc3_borderY);
				} else if(T253_lc3_vertical) {
					// nothing
				} else {
					if(T253_lc3_lastY == y - 1) {
						T253_lc3_borderX += T253_lc3_m;
						T253_lc3_lastY++;
					} else {
						T253_lc3_borderX = y*T253_lc3_m + T253_lc3_C;
						T253_lc3_lastY = y;
					}
				}
			}
		}

		if(T254_initializedWithValidData) {
			if(y < T254_miny || y > T254_maxy) {
				T254_okay = false;
			} else {
				T254_okay = true;
				if(T254_lc1_horizontal) {
					T254_lc1_cached = (T254_lc1_leftOrAbove ? y <= T254_lc1_borderY : y >= T254_lc1_borderY);
				} else if(T254_lc1_vertical) {
					// nothing
				} else {
					if(T254_lc1_lastY == y - 1) {
						T254_lc1_borderX += T254_lc1_m;
						T254_lc1_lastY++;
					} else {
						T254_lc1_borderX = y*T254_lc1_m + T254_lc1_C;
						T254_lc1_lastY = y;
					}
				}
				if(T254_lc2_horizontal) {
					T254_lc2_cached = (T254_lc2_leftOrAbove ? y <= T254_lc2_borderY : y >= T254_lc2_borderY);
				} else if(T254_lc2_vertical) {
					// nothing
				} else {
					if(T254_lc2_lastY == y - 1) {
						T254_lc2_borderX += T254_lc2_m;
						T254_lc2_lastY++;
					} else {
						T254_lc2_borderX = y*T254_lc2_m + T254_lc2_C;
						T254_lc2_lastY = y;
					}
				}
				if(T254_lc3_horizontal) {
					T254_lc3_cached = (T254_lc3_leftOrAbove ? y <= T254_lc3_borderY : y >= T254_lc3_borderY);
				} else if(T254_lc3_vertical) {
					// nothing
				} else {
					if(T254_lc3_lastY == y - 1) {
						T254_lc3_borderX += T254_lc3_m;
						T254_lc3_lastY++;
					} else {
						T254_lc3_borderX = y*T254_lc3_m + T254_lc3_C;
						T254_lc3_lastY = y;
					}
				}
			}
		}

		if(T255_initializedWithValidData) {
			if(y < T255_miny || y > T255_maxy) {
				T255_okay = false;
			} else {
				T255_okay = true;
				if(T255_lc1_horizontal) {
					T255_lc1_cached = (T255_lc1_leftOrAbove ? y <= T255_lc1_borderY : y >= T255_lc1_borderY);
				} else if(T255_lc1_vertical) {
					// nothing
				} else {
					if(T255_lc1_lastY == y - 1) {
						T255_lc1_borderX += T255_lc1_m;
						T255_lc1_lastY++;
					} else {
						T255_lc1_borderX = y*T255_lc1_m + T255_lc1_C;
						T255_lc1_lastY = y;
					}
				}
				if(T255_lc2_horizontal) {
					T255_lc2_cached = (T255_lc2_leftOrAbove ? y <= T255_lc2_borderY : y >= T255_lc2_borderY);
				} else if(T255_lc2_vertical) {
					// nothing
				} else {
					if(T255_lc2_lastY == y - 1) {
						T255_lc2_borderX += T255_lc2_m;
						T255_lc2_lastY++;
					} else {
						T255_lc2_borderX = y*T255_lc2_m + T255_lc2_C;
						T255_lc2_lastY = y;
					}
				}
				if(T255_lc3_horizontal) {
					T255_lc3_cached = (T255_lc3_leftOrAbove ? y <= T255_lc3_borderY : y >= T255_lc3_borderY);
				} else if(T255_lc3_vertical) {
					// nothing
				} else {
					if(T255_lc3_lastY == y - 1) {
						T255_lc3_borderX += T255_lc3_m;
						T255_lc3_lastY++;
					} else {
						T255_lc3_borderX = y*T255_lc3_m + T255_lc3_C;
						T255_lc3_lastY = y;
					}
				}
			}
		}

		if(T256_initializedWithValidData) {
			if(y < T256_miny || y > T256_maxy) {
				T256_okay = false;
			} else {
				T256_okay = true;
				if(T256_lc1_horizontal) {
					T256_lc1_cached = (T256_lc1_leftOrAbove ? y <= T256_lc1_borderY : y >= T256_lc1_borderY);
				} else if(T256_lc1_vertical) {
					// nothing
				} else {
					if(T256_lc1_lastY == y - 1) {
						T256_lc1_borderX += T256_lc1_m;
						T256_lc1_lastY++;
					} else {
						T256_lc1_borderX = y*T256_lc1_m + T256_lc1_C;
						T256_lc1_lastY = y;
					}
				}
				if(T256_lc2_horizontal) {
					T256_lc2_cached = (T256_lc2_leftOrAbove ? y <= T256_lc2_borderY : y >= T256_lc2_borderY);
				} else if(T256_lc2_vertical) {
					// nothing
				} else {
					if(T256_lc2_lastY == y - 1) {
						T256_lc2_borderX += T256_lc2_m;
						T256_lc2_lastY++;
					} else {
						T256_lc2_borderX = y*T256_lc2_m + T256_lc2_C;
						T256_lc2_lastY = y;
					}
				}
				if(T256_lc3_horizontal) {
					T256_lc3_cached = (T256_lc3_leftOrAbove ? y <= T256_lc3_borderY : y >= T256_lc3_borderY);
				} else if(T256_lc3_vertical) {
					// nothing
				} else {
					if(T256_lc3_lastY == y - 1) {
						T256_lc3_borderX += T256_lc3_m;
						T256_lc3_lastY++;
					} else {
						T256_lc3_borderX = y*T256_lc3_m + T256_lc3_C;
						T256_lc3_lastY = y;
					}
				}
			}
		}

		if(T257_initializedWithValidData) {
			if(y < T257_miny || y > T257_maxy) {
				T257_okay = false;
			} else {
				T257_okay = true;
				if(T257_lc1_horizontal) {
					T257_lc1_cached = (T257_lc1_leftOrAbove ? y <= T257_lc1_borderY : y >= T257_lc1_borderY);
				} else if(T257_lc1_vertical) {
					// nothing
				} else {
					if(T257_lc1_lastY == y - 1) {
						T257_lc1_borderX += T257_lc1_m;
						T257_lc1_lastY++;
					} else {
						T257_lc1_borderX = y*T257_lc1_m + T257_lc1_C;
						T257_lc1_lastY = y;
					}
				}
				if(T257_lc2_horizontal) {
					T257_lc2_cached = (T257_lc2_leftOrAbove ? y <= T257_lc2_borderY : y >= T257_lc2_borderY);
				} else if(T257_lc2_vertical) {
					// nothing
				} else {
					if(T257_lc2_lastY == y - 1) {
						T257_lc2_borderX += T257_lc2_m;
						T257_lc2_lastY++;
					} else {
						T257_lc2_borderX = y*T257_lc2_m + T257_lc2_C;
						T257_lc2_lastY = y;
					}
				}
				if(T257_lc3_horizontal) {
					T257_lc3_cached = (T257_lc3_leftOrAbove ? y <= T257_lc3_borderY : y >= T257_lc3_borderY);
				} else if(T257_lc3_vertical) {
					// nothing
				} else {
					if(T257_lc3_lastY == y - 1) {
						T257_lc3_borderX += T257_lc3_m;
						T257_lc3_lastY++;
					} else {
						T257_lc3_borderX = y*T257_lc3_m + T257_lc3_C;
						T257_lc3_lastY = y;
					}
				}
			}
		}

		if(T258_initializedWithValidData) {
			if(y < T258_miny || y > T258_maxy) {
				T258_okay = false;
			} else {
				T258_okay = true;
				if(T258_lc1_horizontal) {
					T258_lc1_cached = (T258_lc1_leftOrAbove ? y <= T258_lc1_borderY : y >= T258_lc1_borderY);
				} else if(T258_lc1_vertical) {
					// nothing
				} else {
					if(T258_lc1_lastY == y - 1) {
						T258_lc1_borderX += T258_lc1_m;
						T258_lc1_lastY++;
					} else {
						T258_lc1_borderX = y*T258_lc1_m + T258_lc1_C;
						T258_lc1_lastY = y;
					}
				}
				if(T258_lc2_horizontal) {
					T258_lc2_cached = (T258_lc2_leftOrAbove ? y <= T258_lc2_borderY : y >= T258_lc2_borderY);
				} else if(T258_lc2_vertical) {
					// nothing
				} else {
					if(T258_lc2_lastY == y - 1) {
						T258_lc2_borderX += T258_lc2_m;
						T258_lc2_lastY++;
					} else {
						T258_lc2_borderX = y*T258_lc2_m + T258_lc2_C;
						T258_lc2_lastY = y;
					}
				}
				if(T258_lc3_horizontal) {
					T258_lc3_cached = (T258_lc3_leftOrAbove ? y <= T258_lc3_borderY : y >= T258_lc3_borderY);
				} else if(T258_lc3_vertical) {
					// nothing
				} else {
					if(T258_lc3_lastY == y - 1) {
						T258_lc3_borderX += T258_lc3_m;
						T258_lc3_lastY++;
					} else {
						T258_lc3_borderX = y*T258_lc3_m + T258_lc3_C;
						T258_lc3_lastY = y;
					}
				}
			}
		}

		if(T259_initializedWithValidData) {
			if(y < T259_miny || y > T259_maxy) {
				T259_okay = false;
			} else {
				T259_okay = true;
				if(T259_lc1_horizontal) {
					T259_lc1_cached = (T259_lc1_leftOrAbove ? y <= T259_lc1_borderY : y >= T259_lc1_borderY);
				} else if(T259_lc1_vertical) {
					// nothing
				} else {
					if(T259_lc1_lastY == y - 1) {
						T259_lc1_borderX += T259_lc1_m;
						T259_lc1_lastY++;
					} else {
						T259_lc1_borderX = y*T259_lc1_m + T259_lc1_C;
						T259_lc1_lastY = y;
					}
				}
				if(T259_lc2_horizontal) {
					T259_lc2_cached = (T259_lc2_leftOrAbove ? y <= T259_lc2_borderY : y >= T259_lc2_borderY);
				} else if(T259_lc2_vertical) {
					// nothing
				} else {
					if(T259_lc2_lastY == y - 1) {
						T259_lc2_borderX += T259_lc2_m;
						T259_lc2_lastY++;
					} else {
						T259_lc2_borderX = y*T259_lc2_m + T259_lc2_C;
						T259_lc2_lastY = y;
					}
				}
				if(T259_lc3_horizontal) {
					T259_lc3_cached = (T259_lc3_leftOrAbove ? y <= T259_lc3_borderY : y >= T259_lc3_borderY);
				} else if(T259_lc3_vertical) {
					// nothing
				} else {
					if(T259_lc3_lastY == y - 1) {
						T259_lc3_borderX += T259_lc3_m;
						T259_lc3_lastY++;
					} else {
						T259_lc3_borderX = y*T259_lc3_m + T259_lc3_C;
						T259_lc3_lastY = y;
					}
				}
			}
		}

		if(T260_initializedWithValidData) {
			if(y < T260_miny || y > T260_maxy) {
				T260_okay = false;
			} else {
				T260_okay = true;
				if(T260_lc1_horizontal) {
					T260_lc1_cached = (T260_lc1_leftOrAbove ? y <= T260_lc1_borderY : y >= T260_lc1_borderY);
				} else if(T260_lc1_vertical) {
					// nothing
				} else {
					if(T260_lc1_lastY == y - 1) {
						T260_lc1_borderX += T260_lc1_m;
						T260_lc1_lastY++;
					} else {
						T260_lc1_borderX = y*T260_lc1_m + T260_lc1_C;
						T260_lc1_lastY = y;
					}
				}
				if(T260_lc2_horizontal) {
					T260_lc2_cached = (T260_lc2_leftOrAbove ? y <= T260_lc2_borderY : y >= T260_lc2_borderY);
				} else if(T260_lc2_vertical) {
					// nothing
				} else {
					if(T260_lc2_lastY == y - 1) {
						T260_lc2_borderX += T260_lc2_m;
						T260_lc2_lastY++;
					} else {
						T260_lc2_borderX = y*T260_lc2_m + T260_lc2_C;
						T260_lc2_lastY = y;
					}
				}
				if(T260_lc3_horizontal) {
					T260_lc3_cached = (T260_lc3_leftOrAbove ? y <= T260_lc3_borderY : y >= T260_lc3_borderY);
				} else if(T260_lc3_vertical) {
					// nothing
				} else {
					if(T260_lc3_lastY == y - 1) {
						T260_lc3_borderX += T260_lc3_m;
						T260_lc3_lastY++;
					} else {
						T260_lc3_borderX = y*T260_lc3_m + T260_lc3_C;
						T260_lc3_lastY = y;
					}
				}
			}
		}

		if(T261_initializedWithValidData) {
			if(y < T261_miny || y > T261_maxy) {
				T261_okay = false;
			} else {
				T261_okay = true;
				if(T261_lc1_horizontal) {
					T261_lc1_cached = (T261_lc1_leftOrAbove ? y <= T261_lc1_borderY : y >= T261_lc1_borderY);
				} else if(T261_lc1_vertical) {
					// nothing
				} else {
					if(T261_lc1_lastY == y - 1) {
						T261_lc1_borderX += T261_lc1_m;
						T261_lc1_lastY++;
					} else {
						T261_lc1_borderX = y*T261_lc1_m + T261_lc1_C;
						T261_lc1_lastY = y;
					}
				}
				if(T261_lc2_horizontal) {
					T261_lc2_cached = (T261_lc2_leftOrAbove ? y <= T261_lc2_borderY : y >= T261_lc2_borderY);
				} else if(T261_lc2_vertical) {
					// nothing
				} else {
					if(T261_lc2_lastY == y - 1) {
						T261_lc2_borderX += T261_lc2_m;
						T261_lc2_lastY++;
					} else {
						T261_lc2_borderX = y*T261_lc2_m + T261_lc2_C;
						T261_lc2_lastY = y;
					}
				}
				if(T261_lc3_horizontal) {
					T261_lc3_cached = (T261_lc3_leftOrAbove ? y <= T261_lc3_borderY : y >= T261_lc3_borderY);
				} else if(T261_lc3_vertical) {
					// nothing
				} else {
					if(T261_lc3_lastY == y - 1) {
						T261_lc3_borderX += T261_lc3_m;
						T261_lc3_lastY++;
					} else {
						T261_lc3_borderX = y*T261_lc3_m + T261_lc3_C;
						T261_lc3_lastY = y;
					}
				}
			}
		}

		if(T262_initializedWithValidData) {
			if(y < T262_miny || y > T262_maxy) {
				T262_okay = false;
			} else {
				T262_okay = true;
				if(T262_lc1_horizontal) {
					T262_lc1_cached = (T262_lc1_leftOrAbove ? y <= T262_lc1_borderY : y >= T262_lc1_borderY);
				} else if(T262_lc1_vertical) {
					// nothing
				} else {
					if(T262_lc1_lastY == y - 1) {
						T262_lc1_borderX += T262_lc1_m;
						T262_lc1_lastY++;
					} else {
						T262_lc1_borderX = y*T262_lc1_m + T262_lc1_C;
						T262_lc1_lastY = y;
					}
				}
				if(T262_lc2_horizontal) {
					T262_lc2_cached = (T262_lc2_leftOrAbove ? y <= T262_lc2_borderY : y >= T262_lc2_borderY);
				} else if(T262_lc2_vertical) {
					// nothing
				} else {
					if(T262_lc2_lastY == y - 1) {
						T262_lc2_borderX += T262_lc2_m;
						T262_lc2_lastY++;
					} else {
						T262_lc2_borderX = y*T262_lc2_m + T262_lc2_C;
						T262_lc2_lastY = y;
					}
				}
				if(T262_lc3_horizontal) {
					T262_lc3_cached = (T262_lc3_leftOrAbove ? y <= T262_lc3_borderY : y >= T262_lc3_borderY);
				} else if(T262_lc3_vertical) {
					// nothing
				} else {
					if(T262_lc3_lastY == y - 1) {
						T262_lc3_borderX += T262_lc3_m;
						T262_lc3_lastY++;
					} else {
						T262_lc3_borderX = y*T262_lc3_m + T262_lc3_C;
						T262_lc3_lastY = y;
					}
				}
			}
		}

		if(T263_initializedWithValidData) {
			if(y < T263_miny || y > T263_maxy) {
				T263_okay = false;
			} else {
				T263_okay = true;
				if(T263_lc1_horizontal) {
					T263_lc1_cached = (T263_lc1_leftOrAbove ? y <= T263_lc1_borderY : y >= T263_lc1_borderY);
				} else if(T263_lc1_vertical) {
					// nothing
				} else {
					if(T263_lc1_lastY == y - 1) {
						T263_lc1_borderX += T263_lc1_m;
						T263_lc1_lastY++;
					} else {
						T263_lc1_borderX = y*T263_lc1_m + T263_lc1_C;
						T263_lc1_lastY = y;
					}
				}
				if(T263_lc2_horizontal) {
					T263_lc2_cached = (T263_lc2_leftOrAbove ? y <= T263_lc2_borderY : y >= T263_lc2_borderY);
				} else if(T263_lc2_vertical) {
					// nothing
				} else {
					if(T263_lc2_lastY == y - 1) {
						T263_lc2_borderX += T263_lc2_m;
						T263_lc2_lastY++;
					} else {
						T263_lc2_borderX = y*T263_lc2_m + T263_lc2_C;
						T263_lc2_lastY = y;
					}
				}
				if(T263_lc3_horizontal) {
					T263_lc3_cached = (T263_lc3_leftOrAbove ? y <= T263_lc3_borderY : y >= T263_lc3_borderY);
				} else if(T263_lc3_vertical) {
					// nothing
				} else {
					if(T263_lc3_lastY == y - 1) {
						T263_lc3_borderX += T263_lc3_m;
						T263_lc3_lastY++;
					} else {
						T263_lc3_borderX = y*T263_lc3_m + T263_lc3_C;
						T263_lc3_lastY = y;
					}
				}
			}
		}

		if(T264_initializedWithValidData) {
			if(y < T264_miny || y > T264_maxy) {
				T264_okay = false;
			} else {
				T264_okay = true;
				if(T264_lc1_horizontal) {
					T264_lc1_cached = (T264_lc1_leftOrAbove ? y <= T264_lc1_borderY : y >= T264_lc1_borderY);
				} else if(T264_lc1_vertical) {
					// nothing
				} else {
					if(T264_lc1_lastY == y - 1) {
						T264_lc1_borderX += T264_lc1_m;
						T264_lc1_lastY++;
					} else {
						T264_lc1_borderX = y*T264_lc1_m + T264_lc1_C;
						T264_lc1_lastY = y;
					}
				}
				if(T264_lc2_horizontal) {
					T264_lc2_cached = (T264_lc2_leftOrAbove ? y <= T264_lc2_borderY : y >= T264_lc2_borderY);
				} else if(T264_lc2_vertical) {
					// nothing
				} else {
					if(T264_lc2_lastY == y - 1) {
						T264_lc2_borderX += T264_lc2_m;
						T264_lc2_lastY++;
					} else {
						T264_lc2_borderX = y*T264_lc2_m + T264_lc2_C;
						T264_lc2_lastY = y;
					}
				}
				if(T264_lc3_horizontal) {
					T264_lc3_cached = (T264_lc3_leftOrAbove ? y <= T264_lc3_borderY : y >= T264_lc3_borderY);
				} else if(T264_lc3_vertical) {
					// nothing
				} else {
					if(T264_lc3_lastY == y - 1) {
						T264_lc3_borderX += T264_lc3_m;
						T264_lc3_lastY++;
					} else {
						T264_lc3_borderX = y*T264_lc3_m + T264_lc3_C;
						T264_lc3_lastY = y;
					}
				}
			}
		}

		if(T265_initializedWithValidData) {
			if(y < T265_miny || y > T265_maxy) {
				T265_okay = false;
			} else {
				T265_okay = true;
				if(T265_lc1_horizontal) {
					T265_lc1_cached = (T265_lc1_leftOrAbove ? y <= T265_lc1_borderY : y >= T265_lc1_borderY);
				} else if(T265_lc1_vertical) {
					// nothing
				} else {
					if(T265_lc1_lastY == y - 1) {
						T265_lc1_borderX += T265_lc1_m;
						T265_lc1_lastY++;
					} else {
						T265_lc1_borderX = y*T265_lc1_m + T265_lc1_C;
						T265_lc1_lastY = y;
					}
				}
				if(T265_lc2_horizontal) {
					T265_lc2_cached = (T265_lc2_leftOrAbove ? y <= T265_lc2_borderY : y >= T265_lc2_borderY);
				} else if(T265_lc2_vertical) {
					// nothing
				} else {
					if(T265_lc2_lastY == y - 1) {
						T265_lc2_borderX += T265_lc2_m;
						T265_lc2_lastY++;
					} else {
						T265_lc2_borderX = y*T265_lc2_m + T265_lc2_C;
						T265_lc2_lastY = y;
					}
				}
				if(T265_lc3_horizontal) {
					T265_lc3_cached = (T265_lc3_leftOrAbove ? y <= T265_lc3_borderY : y >= T265_lc3_borderY);
				} else if(T265_lc3_vertical) {
					// nothing
				} else {
					if(T265_lc3_lastY == y - 1) {
						T265_lc3_borderX += T265_lc3_m;
						T265_lc3_lastY++;
					} else {
						T265_lc3_borderX = y*T265_lc3_m + T265_lc3_C;
						T265_lc3_lastY = y;
					}
				}
			}
		}

		if(T266_initializedWithValidData) {
			if(y < T266_miny || y > T266_maxy) {
				T266_okay = false;
			} else {
				T266_okay = true;
				if(T266_lc1_horizontal) {
					T266_lc1_cached = (T266_lc1_leftOrAbove ? y <= T266_lc1_borderY : y >= T266_lc1_borderY);
				} else if(T266_lc1_vertical) {
					// nothing
				} else {
					if(T266_lc1_lastY == y - 1) {
						T266_lc1_borderX += T266_lc1_m;
						T266_lc1_lastY++;
					} else {
						T266_lc1_borderX = y*T266_lc1_m + T266_lc1_C;
						T266_lc1_lastY = y;
					}
				}
				if(T266_lc2_horizontal) {
					T266_lc2_cached = (T266_lc2_leftOrAbove ? y <= T266_lc2_borderY : y >= T266_lc2_borderY);
				} else if(T266_lc2_vertical) {
					// nothing
				} else {
					if(T266_lc2_lastY == y - 1) {
						T266_lc2_borderX += T266_lc2_m;
						T266_lc2_lastY++;
					} else {
						T266_lc2_borderX = y*T266_lc2_m + T266_lc2_C;
						T266_lc2_lastY = y;
					}
				}
				if(T266_lc3_horizontal) {
					T266_lc3_cached = (T266_lc3_leftOrAbove ? y <= T266_lc3_borderY : y >= T266_lc3_borderY);
				} else if(T266_lc3_vertical) {
					// nothing
				} else {
					if(T266_lc3_lastY == y - 1) {
						T266_lc3_borderX += T266_lc3_m;
						T266_lc3_lastY++;
					} else {
						T266_lc3_borderX = y*T266_lc3_m + T266_lc3_C;
						T266_lc3_lastY = y;
					}
				}
			}
		}

		if(T267_initializedWithValidData) {
			if(y < T267_miny || y > T267_maxy) {
				T267_okay = false;
			} else {
				T267_okay = true;
				if(T267_lc1_horizontal) {
					T267_lc1_cached = (T267_lc1_leftOrAbove ? y <= T267_lc1_borderY : y >= T267_lc1_borderY);
				} else if(T267_lc1_vertical) {
					// nothing
				} else {
					if(T267_lc1_lastY == y - 1) {
						T267_lc1_borderX += T267_lc1_m;
						T267_lc1_lastY++;
					} else {
						T267_lc1_borderX = y*T267_lc1_m + T267_lc1_C;
						T267_lc1_lastY = y;
					}
				}
				if(T267_lc2_horizontal) {
					T267_lc2_cached = (T267_lc2_leftOrAbove ? y <= T267_lc2_borderY : y >= T267_lc2_borderY);
				} else if(T267_lc2_vertical) {
					// nothing
				} else {
					if(T267_lc2_lastY == y - 1) {
						T267_lc2_borderX += T267_lc2_m;
						T267_lc2_lastY++;
					} else {
						T267_lc2_borderX = y*T267_lc2_m + T267_lc2_C;
						T267_lc2_lastY = y;
					}
				}
				if(T267_lc3_horizontal) {
					T267_lc3_cached = (T267_lc3_leftOrAbove ? y <= T267_lc3_borderY : y >= T267_lc3_borderY);
				} else if(T267_lc3_vertical) {
					// nothing
				} else {
					if(T267_lc3_lastY == y - 1) {
						T267_lc3_borderX += T267_lc3_m;
						T267_lc3_lastY++;
					} else {
						T267_lc3_borderX = y*T267_lc3_m + T267_lc3_C;
						T267_lc3_lastY = y;
					}
				}
			}
		}

		if(T268_initializedWithValidData) {
			if(y < T268_miny || y > T268_maxy) {
				T268_okay = false;
			} else {
				T268_okay = true;
				if(T268_lc1_horizontal) {
					T268_lc1_cached = (T268_lc1_leftOrAbove ? y <= T268_lc1_borderY : y >= T268_lc1_borderY);
				} else if(T268_lc1_vertical) {
					// nothing
				} else {
					if(T268_lc1_lastY == y - 1) {
						T268_lc1_borderX += T268_lc1_m;
						T268_lc1_lastY++;
					} else {
						T268_lc1_borderX = y*T268_lc1_m + T268_lc1_C;
						T268_lc1_lastY = y;
					}
				}
				if(T268_lc2_horizontal) {
					T268_lc2_cached = (T268_lc2_leftOrAbove ? y <= T268_lc2_borderY : y >= T268_lc2_borderY);
				} else if(T268_lc2_vertical) {
					// nothing
				} else {
					if(T268_lc2_lastY == y - 1) {
						T268_lc2_borderX += T268_lc2_m;
						T268_lc2_lastY++;
					} else {
						T268_lc2_borderX = y*T268_lc2_m + T268_lc2_C;
						T268_lc2_lastY = y;
					}
				}
				if(T268_lc3_horizontal) {
					T268_lc3_cached = (T268_lc3_leftOrAbove ? y <= T268_lc3_borderY : y >= T268_lc3_borderY);
				} else if(T268_lc3_vertical) {
					// nothing
				} else {
					if(T268_lc3_lastY == y - 1) {
						T268_lc3_borderX += T268_lc3_m;
						T268_lc3_lastY++;
					} else {
						T268_lc3_borderX = y*T268_lc3_m + T268_lc3_C;
						T268_lc3_lastY = y;
					}
				}
			}
		}

		if(T269_initializedWithValidData) {
			if(y < T269_miny || y > T269_maxy) {
				T269_okay = false;
			} else {
				T269_okay = true;
				if(T269_lc1_horizontal) {
					T269_lc1_cached = (T269_lc1_leftOrAbove ? y <= T269_lc1_borderY : y >= T269_lc1_borderY);
				} else if(T269_lc1_vertical) {
					// nothing
				} else {
					if(T269_lc1_lastY == y - 1) {
						T269_lc1_borderX += T269_lc1_m;
						T269_lc1_lastY++;
					} else {
						T269_lc1_borderX = y*T269_lc1_m + T269_lc1_C;
						T269_lc1_lastY = y;
					}
				}
				if(T269_lc2_horizontal) {
					T269_lc2_cached = (T269_lc2_leftOrAbove ? y <= T269_lc2_borderY : y >= T269_lc2_borderY);
				} else if(T269_lc2_vertical) {
					// nothing
				} else {
					if(T269_lc2_lastY == y - 1) {
						T269_lc2_borderX += T269_lc2_m;
						T269_lc2_lastY++;
					} else {
						T269_lc2_borderX = y*T269_lc2_m + T269_lc2_C;
						T269_lc2_lastY = y;
					}
				}
				if(T269_lc3_horizontal) {
					T269_lc3_cached = (T269_lc3_leftOrAbove ? y <= T269_lc3_borderY : y >= T269_lc3_borderY);
				} else if(T269_lc3_vertical) {
					// nothing
				} else {
					if(T269_lc3_lastY == y - 1) {
						T269_lc3_borderX += T269_lc3_m;
						T269_lc3_lastY++;
					} else {
						T269_lc3_borderX = y*T269_lc3_m + T269_lc3_C;
						T269_lc3_lastY = y;
					}
				}
			}
		}
	}

	public void moveToY10(int y) {

		if(T270_initializedWithValidData) {
			if(y < T270_miny || y > T270_maxy) {
				T270_okay = false;
			} else {
				T270_okay = true;
				if(T270_lc1_horizontal) {
					T270_lc1_cached = (T270_lc1_leftOrAbove ? y <= T270_lc1_borderY : y >= T270_lc1_borderY);
				} else if(T270_lc1_vertical) {
					// nothing
				} else {
					if(T270_lc1_lastY == y - 1) {
						T270_lc1_borderX += T270_lc1_m;
						T270_lc1_lastY++;
					} else {
						T270_lc1_borderX = y*T270_lc1_m + T270_lc1_C;
						T270_lc1_lastY = y;
					}
				}
				if(T270_lc2_horizontal) {
					T270_lc2_cached = (T270_lc2_leftOrAbove ? y <= T270_lc2_borderY : y >= T270_lc2_borderY);
				} else if(T270_lc2_vertical) {
					// nothing
				} else {
					if(T270_lc2_lastY == y - 1) {
						T270_lc2_borderX += T270_lc2_m;
						T270_lc2_lastY++;
					} else {
						T270_lc2_borderX = y*T270_lc2_m + T270_lc2_C;
						T270_lc2_lastY = y;
					}
				}
				if(T270_lc3_horizontal) {
					T270_lc3_cached = (T270_lc3_leftOrAbove ? y <= T270_lc3_borderY : y >= T270_lc3_borderY);
				} else if(T270_lc3_vertical) {
					// nothing
				} else {
					if(T270_lc3_lastY == y - 1) {
						T270_lc3_borderX += T270_lc3_m;
						T270_lc3_lastY++;
					} else {
						T270_lc3_borderX = y*T270_lc3_m + T270_lc3_C;
						T270_lc3_lastY = y;
					}
				}
			}
		}

		if(T271_initializedWithValidData) {
			if(y < T271_miny || y > T271_maxy) {
				T271_okay = false;
			} else {
				T271_okay = true;
				if(T271_lc1_horizontal) {
					T271_lc1_cached = (T271_lc1_leftOrAbove ? y <= T271_lc1_borderY : y >= T271_lc1_borderY);
				} else if(T271_lc1_vertical) {
					// nothing
				} else {
					if(T271_lc1_lastY == y - 1) {
						T271_lc1_borderX += T271_lc1_m;
						T271_lc1_lastY++;
					} else {
						T271_lc1_borderX = y*T271_lc1_m + T271_lc1_C;
						T271_lc1_lastY = y;
					}
				}
				if(T271_lc2_horizontal) {
					T271_lc2_cached = (T271_lc2_leftOrAbove ? y <= T271_lc2_borderY : y >= T271_lc2_borderY);
				} else if(T271_lc2_vertical) {
					// nothing
				} else {
					if(T271_lc2_lastY == y - 1) {
						T271_lc2_borderX += T271_lc2_m;
						T271_lc2_lastY++;
					} else {
						T271_lc2_borderX = y*T271_lc2_m + T271_lc2_C;
						T271_lc2_lastY = y;
					}
				}
				if(T271_lc3_horizontal) {
					T271_lc3_cached = (T271_lc3_leftOrAbove ? y <= T271_lc3_borderY : y >= T271_lc3_borderY);
				} else if(T271_lc3_vertical) {
					// nothing
				} else {
					if(T271_lc3_lastY == y - 1) {
						T271_lc3_borderX += T271_lc3_m;
						T271_lc3_lastY++;
					} else {
						T271_lc3_borderX = y*T271_lc3_m + T271_lc3_C;
						T271_lc3_lastY = y;
					}
				}
			}
		}

		if(T272_initializedWithValidData) {
			if(y < T272_miny || y > T272_maxy) {
				T272_okay = false;
			} else {
				T272_okay = true;
				if(T272_lc1_horizontal) {
					T272_lc1_cached = (T272_lc1_leftOrAbove ? y <= T272_lc1_borderY : y >= T272_lc1_borderY);
				} else if(T272_lc1_vertical) {
					// nothing
				} else {
					if(T272_lc1_lastY == y - 1) {
						T272_lc1_borderX += T272_lc1_m;
						T272_lc1_lastY++;
					} else {
						T272_lc1_borderX = y*T272_lc1_m + T272_lc1_C;
						T272_lc1_lastY = y;
					}
				}
				if(T272_lc2_horizontal) {
					T272_lc2_cached = (T272_lc2_leftOrAbove ? y <= T272_lc2_borderY : y >= T272_lc2_borderY);
				} else if(T272_lc2_vertical) {
					// nothing
				} else {
					if(T272_lc2_lastY == y - 1) {
						T272_lc2_borderX += T272_lc2_m;
						T272_lc2_lastY++;
					} else {
						T272_lc2_borderX = y*T272_lc2_m + T272_lc2_C;
						T272_lc2_lastY = y;
					}
				}
				if(T272_lc3_horizontal) {
					T272_lc3_cached = (T272_lc3_leftOrAbove ? y <= T272_lc3_borderY : y >= T272_lc3_borderY);
				} else if(T272_lc3_vertical) {
					// nothing
				} else {
					if(T272_lc3_lastY == y - 1) {
						T272_lc3_borderX += T272_lc3_m;
						T272_lc3_lastY++;
					} else {
						T272_lc3_borderX = y*T272_lc3_m + T272_lc3_C;
						T272_lc3_lastY = y;
					}
				}
			}
		}

		if(T273_initializedWithValidData) {
			if(y < T273_miny || y > T273_maxy) {
				T273_okay = false;
			} else {
				T273_okay = true;
				if(T273_lc1_horizontal) {
					T273_lc1_cached = (T273_lc1_leftOrAbove ? y <= T273_lc1_borderY : y >= T273_lc1_borderY);
				} else if(T273_lc1_vertical) {
					// nothing
				} else {
					if(T273_lc1_lastY == y - 1) {
						T273_lc1_borderX += T273_lc1_m;
						T273_lc1_lastY++;
					} else {
						T273_lc1_borderX = y*T273_lc1_m + T273_lc1_C;
						T273_lc1_lastY = y;
					}
				}
				if(T273_lc2_horizontal) {
					T273_lc2_cached = (T273_lc2_leftOrAbove ? y <= T273_lc2_borderY : y >= T273_lc2_borderY);
				} else if(T273_lc2_vertical) {
					// nothing
				} else {
					if(T273_lc2_lastY == y - 1) {
						T273_lc2_borderX += T273_lc2_m;
						T273_lc2_lastY++;
					} else {
						T273_lc2_borderX = y*T273_lc2_m + T273_lc2_C;
						T273_lc2_lastY = y;
					}
				}
				if(T273_lc3_horizontal) {
					T273_lc3_cached = (T273_lc3_leftOrAbove ? y <= T273_lc3_borderY : y >= T273_lc3_borderY);
				} else if(T273_lc3_vertical) {
					// nothing
				} else {
					if(T273_lc3_lastY == y - 1) {
						T273_lc3_borderX += T273_lc3_m;
						T273_lc3_lastY++;
					} else {
						T273_lc3_borderX = y*T273_lc3_m + T273_lc3_C;
						T273_lc3_lastY = y;
					}
				}
			}
		}

		if(T274_initializedWithValidData) {
			if(y < T274_miny || y > T274_maxy) {
				T274_okay = false;
			} else {
				T274_okay = true;
				if(T274_lc1_horizontal) {
					T274_lc1_cached = (T274_lc1_leftOrAbove ? y <= T274_lc1_borderY : y >= T274_lc1_borderY);
				} else if(T274_lc1_vertical) {
					// nothing
				} else {
					if(T274_lc1_lastY == y - 1) {
						T274_lc1_borderX += T274_lc1_m;
						T274_lc1_lastY++;
					} else {
						T274_lc1_borderX = y*T274_lc1_m + T274_lc1_C;
						T274_lc1_lastY = y;
					}
				}
				if(T274_lc2_horizontal) {
					T274_lc2_cached = (T274_lc2_leftOrAbove ? y <= T274_lc2_borderY : y >= T274_lc2_borderY);
				} else if(T274_lc2_vertical) {
					// nothing
				} else {
					if(T274_lc2_lastY == y - 1) {
						T274_lc2_borderX += T274_lc2_m;
						T274_lc2_lastY++;
					} else {
						T274_lc2_borderX = y*T274_lc2_m + T274_lc2_C;
						T274_lc2_lastY = y;
					}
				}
				if(T274_lc3_horizontal) {
					T274_lc3_cached = (T274_lc3_leftOrAbove ? y <= T274_lc3_borderY : y >= T274_lc3_borderY);
				} else if(T274_lc3_vertical) {
					// nothing
				} else {
					if(T274_lc3_lastY == y - 1) {
						T274_lc3_borderX += T274_lc3_m;
						T274_lc3_lastY++;
					} else {
						T274_lc3_borderX = y*T274_lc3_m + T274_lc3_C;
						T274_lc3_lastY = y;
					}
				}
			}
		}

		if(T275_initializedWithValidData) {
			if(y < T275_miny || y > T275_maxy) {
				T275_okay = false;
			} else {
				T275_okay = true;
				if(T275_lc1_horizontal) {
					T275_lc1_cached = (T275_lc1_leftOrAbove ? y <= T275_lc1_borderY : y >= T275_lc1_borderY);
				} else if(T275_lc1_vertical) {
					// nothing
				} else {
					if(T275_lc1_lastY == y - 1) {
						T275_lc1_borderX += T275_lc1_m;
						T275_lc1_lastY++;
					} else {
						T275_lc1_borderX = y*T275_lc1_m + T275_lc1_C;
						T275_lc1_lastY = y;
					}
				}
				if(T275_lc2_horizontal) {
					T275_lc2_cached = (T275_lc2_leftOrAbove ? y <= T275_lc2_borderY : y >= T275_lc2_borderY);
				} else if(T275_lc2_vertical) {
					// nothing
				} else {
					if(T275_lc2_lastY == y - 1) {
						T275_lc2_borderX += T275_lc2_m;
						T275_lc2_lastY++;
					} else {
						T275_lc2_borderX = y*T275_lc2_m + T275_lc2_C;
						T275_lc2_lastY = y;
					}
				}
				if(T275_lc3_horizontal) {
					T275_lc3_cached = (T275_lc3_leftOrAbove ? y <= T275_lc3_borderY : y >= T275_lc3_borderY);
				} else if(T275_lc3_vertical) {
					// nothing
				} else {
					if(T275_lc3_lastY == y - 1) {
						T275_lc3_borderX += T275_lc3_m;
						T275_lc3_lastY++;
					} else {
						T275_lc3_borderX = y*T275_lc3_m + T275_lc3_C;
						T275_lc3_lastY = y;
					}
				}
			}
		}

		if(T276_initializedWithValidData) {
			if(y < T276_miny || y > T276_maxy) {
				T276_okay = false;
			} else {
				T276_okay = true;
				if(T276_lc1_horizontal) {
					T276_lc1_cached = (T276_lc1_leftOrAbove ? y <= T276_lc1_borderY : y >= T276_lc1_borderY);
				} else if(T276_lc1_vertical) {
					// nothing
				} else {
					if(T276_lc1_lastY == y - 1) {
						T276_lc1_borderX += T276_lc1_m;
						T276_lc1_lastY++;
					} else {
						T276_lc1_borderX = y*T276_lc1_m + T276_lc1_C;
						T276_lc1_lastY = y;
					}
				}
				if(T276_lc2_horizontal) {
					T276_lc2_cached = (T276_lc2_leftOrAbove ? y <= T276_lc2_borderY : y >= T276_lc2_borderY);
				} else if(T276_lc2_vertical) {
					// nothing
				} else {
					if(T276_lc2_lastY == y - 1) {
						T276_lc2_borderX += T276_lc2_m;
						T276_lc2_lastY++;
					} else {
						T276_lc2_borderX = y*T276_lc2_m + T276_lc2_C;
						T276_lc2_lastY = y;
					}
				}
				if(T276_lc3_horizontal) {
					T276_lc3_cached = (T276_lc3_leftOrAbove ? y <= T276_lc3_borderY : y >= T276_lc3_borderY);
				} else if(T276_lc3_vertical) {
					// nothing
				} else {
					if(T276_lc3_lastY == y - 1) {
						T276_lc3_borderX += T276_lc3_m;
						T276_lc3_lastY++;
					} else {
						T276_lc3_borderX = y*T276_lc3_m + T276_lc3_C;
						T276_lc3_lastY = y;
					}
				}
			}
		}

		if(T277_initializedWithValidData) {
			if(y < T277_miny || y > T277_maxy) {
				T277_okay = false;
			} else {
				T277_okay = true;
				if(T277_lc1_horizontal) {
					T277_lc1_cached = (T277_lc1_leftOrAbove ? y <= T277_lc1_borderY : y >= T277_lc1_borderY);
				} else if(T277_lc1_vertical) {
					// nothing
				} else {
					if(T277_lc1_lastY == y - 1) {
						T277_lc1_borderX += T277_lc1_m;
						T277_lc1_lastY++;
					} else {
						T277_lc1_borderX = y*T277_lc1_m + T277_lc1_C;
						T277_lc1_lastY = y;
					}
				}
				if(T277_lc2_horizontal) {
					T277_lc2_cached = (T277_lc2_leftOrAbove ? y <= T277_lc2_borderY : y >= T277_lc2_borderY);
				} else if(T277_lc2_vertical) {
					// nothing
				} else {
					if(T277_lc2_lastY == y - 1) {
						T277_lc2_borderX += T277_lc2_m;
						T277_lc2_lastY++;
					} else {
						T277_lc2_borderX = y*T277_lc2_m + T277_lc2_C;
						T277_lc2_lastY = y;
					}
				}
				if(T277_lc3_horizontal) {
					T277_lc3_cached = (T277_lc3_leftOrAbove ? y <= T277_lc3_borderY : y >= T277_lc3_borderY);
				} else if(T277_lc3_vertical) {
					// nothing
				} else {
					if(T277_lc3_lastY == y - 1) {
						T277_lc3_borderX += T277_lc3_m;
						T277_lc3_lastY++;
					} else {
						T277_lc3_borderX = y*T277_lc3_m + T277_lc3_C;
						T277_lc3_lastY = y;
					}
				}
			}
		}

		if(T278_initializedWithValidData) {
			if(y < T278_miny || y > T278_maxy) {
				T278_okay = false;
			} else {
				T278_okay = true;
				if(T278_lc1_horizontal) {
					T278_lc1_cached = (T278_lc1_leftOrAbove ? y <= T278_lc1_borderY : y >= T278_lc1_borderY);
				} else if(T278_lc1_vertical) {
					// nothing
				} else {
					if(T278_lc1_lastY == y - 1) {
						T278_lc1_borderX += T278_lc1_m;
						T278_lc1_lastY++;
					} else {
						T278_lc1_borderX = y*T278_lc1_m + T278_lc1_C;
						T278_lc1_lastY = y;
					}
				}
				if(T278_lc2_horizontal) {
					T278_lc2_cached = (T278_lc2_leftOrAbove ? y <= T278_lc2_borderY : y >= T278_lc2_borderY);
				} else if(T278_lc2_vertical) {
					// nothing
				} else {
					if(T278_lc2_lastY == y - 1) {
						T278_lc2_borderX += T278_lc2_m;
						T278_lc2_lastY++;
					} else {
						T278_lc2_borderX = y*T278_lc2_m + T278_lc2_C;
						T278_lc2_lastY = y;
					}
				}
				if(T278_lc3_horizontal) {
					T278_lc3_cached = (T278_lc3_leftOrAbove ? y <= T278_lc3_borderY : y >= T278_lc3_borderY);
				} else if(T278_lc3_vertical) {
					// nothing
				} else {
					if(T278_lc3_lastY == y - 1) {
						T278_lc3_borderX += T278_lc3_m;
						T278_lc3_lastY++;
					} else {
						T278_lc3_borderX = y*T278_lc3_m + T278_lc3_C;
						T278_lc3_lastY = y;
					}
				}
			}
		}

		if(T279_initializedWithValidData) {
			if(y < T279_miny || y > T279_maxy) {
				T279_okay = false;
			} else {
				T279_okay = true;
				if(T279_lc1_horizontal) {
					T279_lc1_cached = (T279_lc1_leftOrAbove ? y <= T279_lc1_borderY : y >= T279_lc1_borderY);
				} else if(T279_lc1_vertical) {
					// nothing
				} else {
					if(T279_lc1_lastY == y - 1) {
						T279_lc1_borderX += T279_lc1_m;
						T279_lc1_lastY++;
					} else {
						T279_lc1_borderX = y*T279_lc1_m + T279_lc1_C;
						T279_lc1_lastY = y;
					}
				}
				if(T279_lc2_horizontal) {
					T279_lc2_cached = (T279_lc2_leftOrAbove ? y <= T279_lc2_borderY : y >= T279_lc2_borderY);
				} else if(T279_lc2_vertical) {
					// nothing
				} else {
					if(T279_lc2_lastY == y - 1) {
						T279_lc2_borderX += T279_lc2_m;
						T279_lc2_lastY++;
					} else {
						T279_lc2_borderX = y*T279_lc2_m + T279_lc2_C;
						T279_lc2_lastY = y;
					}
				}
				if(T279_lc3_horizontal) {
					T279_lc3_cached = (T279_lc3_leftOrAbove ? y <= T279_lc3_borderY : y >= T279_lc3_borderY);
				} else if(T279_lc3_vertical) {
					// nothing
				} else {
					if(T279_lc3_lastY == y - 1) {
						T279_lc3_borderX += T279_lc3_m;
						T279_lc3_lastY++;
					} else {
						T279_lc3_borderX = y*T279_lc3_m + T279_lc3_C;
						T279_lc3_lastY = y;
					}
				}
			}
		}

		if(T280_initializedWithValidData) {
			if(y < T280_miny || y > T280_maxy) {
				T280_okay = false;
			} else {
				T280_okay = true;
				if(T280_lc1_horizontal) {
					T280_lc1_cached = (T280_lc1_leftOrAbove ? y <= T280_lc1_borderY : y >= T280_lc1_borderY);
				} else if(T280_lc1_vertical) {
					// nothing
				} else {
					if(T280_lc1_lastY == y - 1) {
						T280_lc1_borderX += T280_lc1_m;
						T280_lc1_lastY++;
					} else {
						T280_lc1_borderX = y*T280_lc1_m + T280_lc1_C;
						T280_lc1_lastY = y;
					}
				}
				if(T280_lc2_horizontal) {
					T280_lc2_cached = (T280_lc2_leftOrAbove ? y <= T280_lc2_borderY : y >= T280_lc2_borderY);
				} else if(T280_lc2_vertical) {
					// nothing
				} else {
					if(T280_lc2_lastY == y - 1) {
						T280_lc2_borderX += T280_lc2_m;
						T280_lc2_lastY++;
					} else {
						T280_lc2_borderX = y*T280_lc2_m + T280_lc2_C;
						T280_lc2_lastY = y;
					}
				}
				if(T280_lc3_horizontal) {
					T280_lc3_cached = (T280_lc3_leftOrAbove ? y <= T280_lc3_borderY : y >= T280_lc3_borderY);
				} else if(T280_lc3_vertical) {
					// nothing
				} else {
					if(T280_lc3_lastY == y - 1) {
						T280_lc3_borderX += T280_lc3_m;
						T280_lc3_lastY++;
					} else {
						T280_lc3_borderX = y*T280_lc3_m + T280_lc3_C;
						T280_lc3_lastY = y;
					}
				}
			}
		}

		if(T281_initializedWithValidData) {
			if(y < T281_miny || y > T281_maxy) {
				T281_okay = false;
			} else {
				T281_okay = true;
				if(T281_lc1_horizontal) {
					T281_lc1_cached = (T281_lc1_leftOrAbove ? y <= T281_lc1_borderY : y >= T281_lc1_borderY);
				} else if(T281_lc1_vertical) {
					// nothing
				} else {
					if(T281_lc1_lastY == y - 1) {
						T281_lc1_borderX += T281_lc1_m;
						T281_lc1_lastY++;
					} else {
						T281_lc1_borderX = y*T281_lc1_m + T281_lc1_C;
						T281_lc1_lastY = y;
					}
				}
				if(T281_lc2_horizontal) {
					T281_lc2_cached = (T281_lc2_leftOrAbove ? y <= T281_lc2_borderY : y >= T281_lc2_borderY);
				} else if(T281_lc2_vertical) {
					// nothing
				} else {
					if(T281_lc2_lastY == y - 1) {
						T281_lc2_borderX += T281_lc2_m;
						T281_lc2_lastY++;
					} else {
						T281_lc2_borderX = y*T281_lc2_m + T281_lc2_C;
						T281_lc2_lastY = y;
					}
				}
				if(T281_lc3_horizontal) {
					T281_lc3_cached = (T281_lc3_leftOrAbove ? y <= T281_lc3_borderY : y >= T281_lc3_borderY);
				} else if(T281_lc3_vertical) {
					// nothing
				} else {
					if(T281_lc3_lastY == y - 1) {
						T281_lc3_borderX += T281_lc3_m;
						T281_lc3_lastY++;
					} else {
						T281_lc3_borderX = y*T281_lc3_m + T281_lc3_C;
						T281_lc3_lastY = y;
					}
				}
			}
		}

		if(T282_initializedWithValidData) {
			if(y < T282_miny || y > T282_maxy) {
				T282_okay = false;
			} else {
				T282_okay = true;
				if(T282_lc1_horizontal) {
					T282_lc1_cached = (T282_lc1_leftOrAbove ? y <= T282_lc1_borderY : y >= T282_lc1_borderY);
				} else if(T282_lc1_vertical) {
					// nothing
				} else {
					if(T282_lc1_lastY == y - 1) {
						T282_lc1_borderX += T282_lc1_m;
						T282_lc1_lastY++;
					} else {
						T282_lc1_borderX = y*T282_lc1_m + T282_lc1_C;
						T282_lc1_lastY = y;
					}
				}
				if(T282_lc2_horizontal) {
					T282_lc2_cached = (T282_lc2_leftOrAbove ? y <= T282_lc2_borderY : y >= T282_lc2_borderY);
				} else if(T282_lc2_vertical) {
					// nothing
				} else {
					if(T282_lc2_lastY == y - 1) {
						T282_lc2_borderX += T282_lc2_m;
						T282_lc2_lastY++;
					} else {
						T282_lc2_borderX = y*T282_lc2_m + T282_lc2_C;
						T282_lc2_lastY = y;
					}
				}
				if(T282_lc3_horizontal) {
					T282_lc3_cached = (T282_lc3_leftOrAbove ? y <= T282_lc3_borderY : y >= T282_lc3_borderY);
				} else if(T282_lc3_vertical) {
					// nothing
				} else {
					if(T282_lc3_lastY == y - 1) {
						T282_lc3_borderX += T282_lc3_m;
						T282_lc3_lastY++;
					} else {
						T282_lc3_borderX = y*T282_lc3_m + T282_lc3_C;
						T282_lc3_lastY = y;
					}
				}
			}
		}

		if(T283_initializedWithValidData) {
			if(y < T283_miny || y > T283_maxy) {
				T283_okay = false;
			} else {
				T283_okay = true;
				if(T283_lc1_horizontal) {
					T283_lc1_cached = (T283_lc1_leftOrAbove ? y <= T283_lc1_borderY : y >= T283_lc1_borderY);
				} else if(T283_lc1_vertical) {
					// nothing
				} else {
					if(T283_lc1_lastY == y - 1) {
						T283_lc1_borderX += T283_lc1_m;
						T283_lc1_lastY++;
					} else {
						T283_lc1_borderX = y*T283_lc1_m + T283_lc1_C;
						T283_lc1_lastY = y;
					}
				}
				if(T283_lc2_horizontal) {
					T283_lc2_cached = (T283_lc2_leftOrAbove ? y <= T283_lc2_borderY : y >= T283_lc2_borderY);
				} else if(T283_lc2_vertical) {
					// nothing
				} else {
					if(T283_lc2_lastY == y - 1) {
						T283_lc2_borderX += T283_lc2_m;
						T283_lc2_lastY++;
					} else {
						T283_lc2_borderX = y*T283_lc2_m + T283_lc2_C;
						T283_lc2_lastY = y;
					}
				}
				if(T283_lc3_horizontal) {
					T283_lc3_cached = (T283_lc3_leftOrAbove ? y <= T283_lc3_borderY : y >= T283_lc3_borderY);
				} else if(T283_lc3_vertical) {
					// nothing
				} else {
					if(T283_lc3_lastY == y - 1) {
						T283_lc3_borderX += T283_lc3_m;
						T283_lc3_lastY++;
					} else {
						T283_lc3_borderX = y*T283_lc3_m + T283_lc3_C;
						T283_lc3_lastY = y;
					}
				}
			}
		}

		if(T284_initializedWithValidData) {
			if(y < T284_miny || y > T284_maxy) {
				T284_okay = false;
			} else {
				T284_okay = true;
				if(T284_lc1_horizontal) {
					T284_lc1_cached = (T284_lc1_leftOrAbove ? y <= T284_lc1_borderY : y >= T284_lc1_borderY);
				} else if(T284_lc1_vertical) {
					// nothing
				} else {
					if(T284_lc1_lastY == y - 1) {
						T284_lc1_borderX += T284_lc1_m;
						T284_lc1_lastY++;
					} else {
						T284_lc1_borderX = y*T284_lc1_m + T284_lc1_C;
						T284_lc1_lastY = y;
					}
				}
				if(T284_lc2_horizontal) {
					T284_lc2_cached = (T284_lc2_leftOrAbove ? y <= T284_lc2_borderY : y >= T284_lc2_borderY);
				} else if(T284_lc2_vertical) {
					// nothing
				} else {
					if(T284_lc2_lastY == y - 1) {
						T284_lc2_borderX += T284_lc2_m;
						T284_lc2_lastY++;
					} else {
						T284_lc2_borderX = y*T284_lc2_m + T284_lc2_C;
						T284_lc2_lastY = y;
					}
				}
				if(T284_lc3_horizontal) {
					T284_lc3_cached = (T284_lc3_leftOrAbove ? y <= T284_lc3_borderY : y >= T284_lc3_borderY);
				} else if(T284_lc3_vertical) {
					// nothing
				} else {
					if(T284_lc3_lastY == y - 1) {
						T284_lc3_borderX += T284_lc3_m;
						T284_lc3_lastY++;
					} else {
						T284_lc3_borderX = y*T284_lc3_m + T284_lc3_C;
						T284_lc3_lastY = y;
					}
				}
			}
		}

		if(T285_initializedWithValidData) {
			if(y < T285_miny || y > T285_maxy) {
				T285_okay = false;
			} else {
				T285_okay = true;
				if(T285_lc1_horizontal) {
					T285_lc1_cached = (T285_lc1_leftOrAbove ? y <= T285_lc1_borderY : y >= T285_lc1_borderY);
				} else if(T285_lc1_vertical) {
					// nothing
				} else {
					if(T285_lc1_lastY == y - 1) {
						T285_lc1_borderX += T285_lc1_m;
						T285_lc1_lastY++;
					} else {
						T285_lc1_borderX = y*T285_lc1_m + T285_lc1_C;
						T285_lc1_lastY = y;
					}
				}
				if(T285_lc2_horizontal) {
					T285_lc2_cached = (T285_lc2_leftOrAbove ? y <= T285_lc2_borderY : y >= T285_lc2_borderY);
				} else if(T285_lc2_vertical) {
					// nothing
				} else {
					if(T285_lc2_lastY == y - 1) {
						T285_lc2_borderX += T285_lc2_m;
						T285_lc2_lastY++;
					} else {
						T285_lc2_borderX = y*T285_lc2_m + T285_lc2_C;
						T285_lc2_lastY = y;
					}
				}
				if(T285_lc3_horizontal) {
					T285_lc3_cached = (T285_lc3_leftOrAbove ? y <= T285_lc3_borderY : y >= T285_lc3_borderY);
				} else if(T285_lc3_vertical) {
					// nothing
				} else {
					if(T285_lc3_lastY == y - 1) {
						T285_lc3_borderX += T285_lc3_m;
						T285_lc3_lastY++;
					} else {
						T285_lc3_borderX = y*T285_lc3_m + T285_lc3_C;
						T285_lc3_lastY = y;
					}
				}
			}
		}

		if(T286_initializedWithValidData) {
			if(y < T286_miny || y > T286_maxy) {
				T286_okay = false;
			} else {
				T286_okay = true;
				if(T286_lc1_horizontal) {
					T286_lc1_cached = (T286_lc1_leftOrAbove ? y <= T286_lc1_borderY : y >= T286_lc1_borderY);
				} else if(T286_lc1_vertical) {
					// nothing
				} else {
					if(T286_lc1_lastY == y - 1) {
						T286_lc1_borderX += T286_lc1_m;
						T286_lc1_lastY++;
					} else {
						T286_lc1_borderX = y*T286_lc1_m + T286_lc1_C;
						T286_lc1_lastY = y;
					}
				}
				if(T286_lc2_horizontal) {
					T286_lc2_cached = (T286_lc2_leftOrAbove ? y <= T286_lc2_borderY : y >= T286_lc2_borderY);
				} else if(T286_lc2_vertical) {
					// nothing
				} else {
					if(T286_lc2_lastY == y - 1) {
						T286_lc2_borderX += T286_lc2_m;
						T286_lc2_lastY++;
					} else {
						T286_lc2_borderX = y*T286_lc2_m + T286_lc2_C;
						T286_lc2_lastY = y;
					}
				}
				if(T286_lc3_horizontal) {
					T286_lc3_cached = (T286_lc3_leftOrAbove ? y <= T286_lc3_borderY : y >= T286_lc3_borderY);
				} else if(T286_lc3_vertical) {
					// nothing
				} else {
					if(T286_lc3_lastY == y - 1) {
						T286_lc3_borderX += T286_lc3_m;
						T286_lc3_lastY++;
					} else {
						T286_lc3_borderX = y*T286_lc3_m + T286_lc3_C;
						T286_lc3_lastY = y;
					}
				}
			}
		}

		if(T287_initializedWithValidData) {
			if(y < T287_miny || y > T287_maxy) {
				T287_okay = false;
			} else {
				T287_okay = true;
				if(T287_lc1_horizontal) {
					T287_lc1_cached = (T287_lc1_leftOrAbove ? y <= T287_lc1_borderY : y >= T287_lc1_borderY);
				} else if(T287_lc1_vertical) {
					// nothing
				} else {
					if(T287_lc1_lastY == y - 1) {
						T287_lc1_borderX += T287_lc1_m;
						T287_lc1_lastY++;
					} else {
						T287_lc1_borderX = y*T287_lc1_m + T287_lc1_C;
						T287_lc1_lastY = y;
					}
				}
				if(T287_lc2_horizontal) {
					T287_lc2_cached = (T287_lc2_leftOrAbove ? y <= T287_lc2_borderY : y >= T287_lc2_borderY);
				} else if(T287_lc2_vertical) {
					// nothing
				} else {
					if(T287_lc2_lastY == y - 1) {
						T287_lc2_borderX += T287_lc2_m;
						T287_lc2_lastY++;
					} else {
						T287_lc2_borderX = y*T287_lc2_m + T287_lc2_C;
						T287_lc2_lastY = y;
					}
				}
				if(T287_lc3_horizontal) {
					T287_lc3_cached = (T287_lc3_leftOrAbove ? y <= T287_lc3_borderY : y >= T287_lc3_borderY);
				} else if(T287_lc3_vertical) {
					// nothing
				} else {
					if(T287_lc3_lastY == y - 1) {
						T287_lc3_borderX += T287_lc3_m;
						T287_lc3_lastY++;
					} else {
						T287_lc3_borderX = y*T287_lc3_m + T287_lc3_C;
						T287_lc3_lastY = y;
					}
				}
			}
		}

		if(T288_initializedWithValidData) {
			if(y < T288_miny || y > T288_maxy) {
				T288_okay = false;
			} else {
				T288_okay = true;
				if(T288_lc1_horizontal) {
					T288_lc1_cached = (T288_lc1_leftOrAbove ? y <= T288_lc1_borderY : y >= T288_lc1_borderY);
				} else if(T288_lc1_vertical) {
					// nothing
				} else {
					if(T288_lc1_lastY == y - 1) {
						T288_lc1_borderX += T288_lc1_m;
						T288_lc1_lastY++;
					} else {
						T288_lc1_borderX = y*T288_lc1_m + T288_lc1_C;
						T288_lc1_lastY = y;
					}
				}
				if(T288_lc2_horizontal) {
					T288_lc2_cached = (T288_lc2_leftOrAbove ? y <= T288_lc2_borderY : y >= T288_lc2_borderY);
				} else if(T288_lc2_vertical) {
					// nothing
				} else {
					if(T288_lc2_lastY == y - 1) {
						T288_lc2_borderX += T288_lc2_m;
						T288_lc2_lastY++;
					} else {
						T288_lc2_borderX = y*T288_lc2_m + T288_lc2_C;
						T288_lc2_lastY = y;
					}
				}
				if(T288_lc3_horizontal) {
					T288_lc3_cached = (T288_lc3_leftOrAbove ? y <= T288_lc3_borderY : y >= T288_lc3_borderY);
				} else if(T288_lc3_vertical) {
					// nothing
				} else {
					if(T288_lc3_lastY == y - 1) {
						T288_lc3_borderX += T288_lc3_m;
						T288_lc3_lastY++;
					} else {
						T288_lc3_borderX = y*T288_lc3_m + T288_lc3_C;
						T288_lc3_lastY = y;
					}
				}
			}
		}

		if(T289_initializedWithValidData) {
			if(y < T289_miny || y > T289_maxy) {
				T289_okay = false;
			} else {
				T289_okay = true;
				if(T289_lc1_horizontal) {
					T289_lc1_cached = (T289_lc1_leftOrAbove ? y <= T289_lc1_borderY : y >= T289_lc1_borderY);
				} else if(T289_lc1_vertical) {
					// nothing
				} else {
					if(T289_lc1_lastY == y - 1) {
						T289_lc1_borderX += T289_lc1_m;
						T289_lc1_lastY++;
					} else {
						T289_lc1_borderX = y*T289_lc1_m + T289_lc1_C;
						T289_lc1_lastY = y;
					}
				}
				if(T289_lc2_horizontal) {
					T289_lc2_cached = (T289_lc2_leftOrAbove ? y <= T289_lc2_borderY : y >= T289_lc2_borderY);
				} else if(T289_lc2_vertical) {
					// nothing
				} else {
					if(T289_lc2_lastY == y - 1) {
						T289_lc2_borderX += T289_lc2_m;
						T289_lc2_lastY++;
					} else {
						T289_lc2_borderX = y*T289_lc2_m + T289_lc2_C;
						T289_lc2_lastY = y;
					}
				}
				if(T289_lc3_horizontal) {
					T289_lc3_cached = (T289_lc3_leftOrAbove ? y <= T289_lc3_borderY : y >= T289_lc3_borderY);
				} else if(T289_lc3_vertical) {
					// nothing
				} else {
					if(T289_lc3_lastY == y - 1) {
						T289_lc3_borderX += T289_lc3_m;
						T289_lc3_lastY++;
					} else {
						T289_lc3_borderX = y*T289_lc3_m + T289_lc3_C;
						T289_lc3_lastY = y;
					}
				}
			}
		}

		if(T290_initializedWithValidData) {
			if(y < T290_miny || y > T290_maxy) {
				T290_okay = false;
			} else {
				T290_okay = true;
				if(T290_lc1_horizontal) {
					T290_lc1_cached = (T290_lc1_leftOrAbove ? y <= T290_lc1_borderY : y >= T290_lc1_borderY);
				} else if(T290_lc1_vertical) {
					// nothing
				} else {
					if(T290_lc1_lastY == y - 1) {
						T290_lc1_borderX += T290_lc1_m;
						T290_lc1_lastY++;
					} else {
						T290_lc1_borderX = y*T290_lc1_m + T290_lc1_C;
						T290_lc1_lastY = y;
					}
				}
				if(T290_lc2_horizontal) {
					T290_lc2_cached = (T290_lc2_leftOrAbove ? y <= T290_lc2_borderY : y >= T290_lc2_borderY);
				} else if(T290_lc2_vertical) {
					// nothing
				} else {
					if(T290_lc2_lastY == y - 1) {
						T290_lc2_borderX += T290_lc2_m;
						T290_lc2_lastY++;
					} else {
						T290_lc2_borderX = y*T290_lc2_m + T290_lc2_C;
						T290_lc2_lastY = y;
					}
				}
				if(T290_lc3_horizontal) {
					T290_lc3_cached = (T290_lc3_leftOrAbove ? y <= T290_lc3_borderY : y >= T290_lc3_borderY);
				} else if(T290_lc3_vertical) {
					// nothing
				} else {
					if(T290_lc3_lastY == y - 1) {
						T290_lc3_borderX += T290_lc3_m;
						T290_lc3_lastY++;
					} else {
						T290_lc3_borderX = y*T290_lc3_m + T290_lc3_C;
						T290_lc3_lastY = y;
					}
				}
			}
		}

		if(T291_initializedWithValidData) {
			if(y < T291_miny || y > T291_maxy) {
				T291_okay = false;
			} else {
				T291_okay = true;
				if(T291_lc1_horizontal) {
					T291_lc1_cached = (T291_lc1_leftOrAbove ? y <= T291_lc1_borderY : y >= T291_lc1_borderY);
				} else if(T291_lc1_vertical) {
					// nothing
				} else {
					if(T291_lc1_lastY == y - 1) {
						T291_lc1_borderX += T291_lc1_m;
						T291_lc1_lastY++;
					} else {
						T291_lc1_borderX = y*T291_lc1_m + T291_lc1_C;
						T291_lc1_lastY = y;
					}
				}
				if(T291_lc2_horizontal) {
					T291_lc2_cached = (T291_lc2_leftOrAbove ? y <= T291_lc2_borderY : y >= T291_lc2_borderY);
				} else if(T291_lc2_vertical) {
					// nothing
				} else {
					if(T291_lc2_lastY == y - 1) {
						T291_lc2_borderX += T291_lc2_m;
						T291_lc2_lastY++;
					} else {
						T291_lc2_borderX = y*T291_lc2_m + T291_lc2_C;
						T291_lc2_lastY = y;
					}
				}
				if(T291_lc3_horizontal) {
					T291_lc3_cached = (T291_lc3_leftOrAbove ? y <= T291_lc3_borderY : y >= T291_lc3_borderY);
				} else if(T291_lc3_vertical) {
					// nothing
				} else {
					if(T291_lc3_lastY == y - 1) {
						T291_lc3_borderX += T291_lc3_m;
						T291_lc3_lastY++;
					} else {
						T291_lc3_borderX = y*T291_lc3_m + T291_lc3_C;
						T291_lc3_lastY = y;
					}
				}
			}
		}

		if(T292_initializedWithValidData) {
			if(y < T292_miny || y > T292_maxy) {
				T292_okay = false;
			} else {
				T292_okay = true;
				if(T292_lc1_horizontal) {
					T292_lc1_cached = (T292_lc1_leftOrAbove ? y <= T292_lc1_borderY : y >= T292_lc1_borderY);
				} else if(T292_lc1_vertical) {
					// nothing
				} else {
					if(T292_lc1_lastY == y - 1) {
						T292_lc1_borderX += T292_lc1_m;
						T292_lc1_lastY++;
					} else {
						T292_lc1_borderX = y*T292_lc1_m + T292_lc1_C;
						T292_lc1_lastY = y;
					}
				}
				if(T292_lc2_horizontal) {
					T292_lc2_cached = (T292_lc2_leftOrAbove ? y <= T292_lc2_borderY : y >= T292_lc2_borderY);
				} else if(T292_lc2_vertical) {
					// nothing
				} else {
					if(T292_lc2_lastY == y - 1) {
						T292_lc2_borderX += T292_lc2_m;
						T292_lc2_lastY++;
					} else {
						T292_lc2_borderX = y*T292_lc2_m + T292_lc2_C;
						T292_lc2_lastY = y;
					}
				}
				if(T292_lc3_horizontal) {
					T292_lc3_cached = (T292_lc3_leftOrAbove ? y <= T292_lc3_borderY : y >= T292_lc3_borderY);
				} else if(T292_lc3_vertical) {
					// nothing
				} else {
					if(T292_lc3_lastY == y - 1) {
						T292_lc3_borderX += T292_lc3_m;
						T292_lc3_lastY++;
					} else {
						T292_lc3_borderX = y*T292_lc3_m + T292_lc3_C;
						T292_lc3_lastY = y;
					}
				}
			}
		}

		if(T293_initializedWithValidData) {
			if(y < T293_miny || y > T293_maxy) {
				T293_okay = false;
			} else {
				T293_okay = true;
				if(T293_lc1_horizontal) {
					T293_lc1_cached = (T293_lc1_leftOrAbove ? y <= T293_lc1_borderY : y >= T293_lc1_borderY);
				} else if(T293_lc1_vertical) {
					// nothing
				} else {
					if(T293_lc1_lastY == y - 1) {
						T293_lc1_borderX += T293_lc1_m;
						T293_lc1_lastY++;
					} else {
						T293_lc1_borderX = y*T293_lc1_m + T293_lc1_C;
						T293_lc1_lastY = y;
					}
				}
				if(T293_lc2_horizontal) {
					T293_lc2_cached = (T293_lc2_leftOrAbove ? y <= T293_lc2_borderY : y >= T293_lc2_borderY);
				} else if(T293_lc2_vertical) {
					// nothing
				} else {
					if(T293_lc2_lastY == y - 1) {
						T293_lc2_borderX += T293_lc2_m;
						T293_lc2_lastY++;
					} else {
						T293_lc2_borderX = y*T293_lc2_m + T293_lc2_C;
						T293_lc2_lastY = y;
					}
				}
				if(T293_lc3_horizontal) {
					T293_lc3_cached = (T293_lc3_leftOrAbove ? y <= T293_lc3_borderY : y >= T293_lc3_borderY);
				} else if(T293_lc3_vertical) {
					// nothing
				} else {
					if(T293_lc3_lastY == y - 1) {
						T293_lc3_borderX += T293_lc3_m;
						T293_lc3_lastY++;
					} else {
						T293_lc3_borderX = y*T293_lc3_m + T293_lc3_C;
						T293_lc3_lastY = y;
					}
				}
			}
		}

		if(T294_initializedWithValidData) {
			if(y < T294_miny || y > T294_maxy) {
				T294_okay = false;
			} else {
				T294_okay = true;
				if(T294_lc1_horizontal) {
					T294_lc1_cached = (T294_lc1_leftOrAbove ? y <= T294_lc1_borderY : y >= T294_lc1_borderY);
				} else if(T294_lc1_vertical) {
					// nothing
				} else {
					if(T294_lc1_lastY == y - 1) {
						T294_lc1_borderX += T294_lc1_m;
						T294_lc1_lastY++;
					} else {
						T294_lc1_borderX = y*T294_lc1_m + T294_lc1_C;
						T294_lc1_lastY = y;
					}
				}
				if(T294_lc2_horizontal) {
					T294_lc2_cached = (T294_lc2_leftOrAbove ? y <= T294_lc2_borderY : y >= T294_lc2_borderY);
				} else if(T294_lc2_vertical) {
					// nothing
				} else {
					if(T294_lc2_lastY == y - 1) {
						T294_lc2_borderX += T294_lc2_m;
						T294_lc2_lastY++;
					} else {
						T294_lc2_borderX = y*T294_lc2_m + T294_lc2_C;
						T294_lc2_lastY = y;
					}
				}
				if(T294_lc3_horizontal) {
					T294_lc3_cached = (T294_lc3_leftOrAbove ? y <= T294_lc3_borderY : y >= T294_lc3_borderY);
				} else if(T294_lc3_vertical) {
					// nothing
				} else {
					if(T294_lc3_lastY == y - 1) {
						T294_lc3_borderX += T294_lc3_m;
						T294_lc3_lastY++;
					} else {
						T294_lc3_borderX = y*T294_lc3_m + T294_lc3_C;
						T294_lc3_lastY = y;
					}
				}
			}
		}

		if(T295_initializedWithValidData) {
			if(y < T295_miny || y > T295_maxy) {
				T295_okay = false;
			} else {
				T295_okay = true;
				if(T295_lc1_horizontal) {
					T295_lc1_cached = (T295_lc1_leftOrAbove ? y <= T295_lc1_borderY : y >= T295_lc1_borderY);
				} else if(T295_lc1_vertical) {
					// nothing
				} else {
					if(T295_lc1_lastY == y - 1) {
						T295_lc1_borderX += T295_lc1_m;
						T295_lc1_lastY++;
					} else {
						T295_lc1_borderX = y*T295_lc1_m + T295_lc1_C;
						T295_lc1_lastY = y;
					}
				}
				if(T295_lc2_horizontal) {
					T295_lc2_cached = (T295_lc2_leftOrAbove ? y <= T295_lc2_borderY : y >= T295_lc2_borderY);
				} else if(T295_lc2_vertical) {
					// nothing
				} else {
					if(T295_lc2_lastY == y - 1) {
						T295_lc2_borderX += T295_lc2_m;
						T295_lc2_lastY++;
					} else {
						T295_lc2_borderX = y*T295_lc2_m + T295_lc2_C;
						T295_lc2_lastY = y;
					}
				}
				if(T295_lc3_horizontal) {
					T295_lc3_cached = (T295_lc3_leftOrAbove ? y <= T295_lc3_borderY : y >= T295_lc3_borderY);
				} else if(T295_lc3_vertical) {
					// nothing
				} else {
					if(T295_lc3_lastY == y - 1) {
						T295_lc3_borderX += T295_lc3_m;
						T295_lc3_lastY++;
					} else {
						T295_lc3_borderX = y*T295_lc3_m + T295_lc3_C;
						T295_lc3_lastY = y;
					}
				}
			}
		}

		if(T296_initializedWithValidData) {
			if(y < T296_miny || y > T296_maxy) {
				T296_okay = false;
			} else {
				T296_okay = true;
				if(T296_lc1_horizontal) {
					T296_lc1_cached = (T296_lc1_leftOrAbove ? y <= T296_lc1_borderY : y >= T296_lc1_borderY);
				} else if(T296_lc1_vertical) {
					// nothing
				} else {
					if(T296_lc1_lastY == y - 1) {
						T296_lc1_borderX += T296_lc1_m;
						T296_lc1_lastY++;
					} else {
						T296_lc1_borderX = y*T296_lc1_m + T296_lc1_C;
						T296_lc1_lastY = y;
					}
				}
				if(T296_lc2_horizontal) {
					T296_lc2_cached = (T296_lc2_leftOrAbove ? y <= T296_lc2_borderY : y >= T296_lc2_borderY);
				} else if(T296_lc2_vertical) {
					// nothing
				} else {
					if(T296_lc2_lastY == y - 1) {
						T296_lc2_borderX += T296_lc2_m;
						T296_lc2_lastY++;
					} else {
						T296_lc2_borderX = y*T296_lc2_m + T296_lc2_C;
						T296_lc2_lastY = y;
					}
				}
				if(T296_lc3_horizontal) {
					T296_lc3_cached = (T296_lc3_leftOrAbove ? y <= T296_lc3_borderY : y >= T296_lc3_borderY);
				} else if(T296_lc3_vertical) {
					// nothing
				} else {
					if(T296_lc3_lastY == y - 1) {
						T296_lc3_borderX += T296_lc3_m;
						T296_lc3_lastY++;
					} else {
						T296_lc3_borderX = y*T296_lc3_m + T296_lc3_C;
						T296_lc3_lastY = y;
					}
				}
			}
		}

		if(T297_initializedWithValidData) {
			if(y < T297_miny || y > T297_maxy) {
				T297_okay = false;
			} else {
				T297_okay = true;
				if(T297_lc1_horizontal) {
					T297_lc1_cached = (T297_lc1_leftOrAbove ? y <= T297_lc1_borderY : y >= T297_lc1_borderY);
				} else if(T297_lc1_vertical) {
					// nothing
				} else {
					if(T297_lc1_lastY == y - 1) {
						T297_lc1_borderX += T297_lc1_m;
						T297_lc1_lastY++;
					} else {
						T297_lc1_borderX = y*T297_lc1_m + T297_lc1_C;
						T297_lc1_lastY = y;
					}
				}
				if(T297_lc2_horizontal) {
					T297_lc2_cached = (T297_lc2_leftOrAbove ? y <= T297_lc2_borderY : y >= T297_lc2_borderY);
				} else if(T297_lc2_vertical) {
					// nothing
				} else {
					if(T297_lc2_lastY == y - 1) {
						T297_lc2_borderX += T297_lc2_m;
						T297_lc2_lastY++;
					} else {
						T297_lc2_borderX = y*T297_lc2_m + T297_lc2_C;
						T297_lc2_lastY = y;
					}
				}
				if(T297_lc3_horizontal) {
					T297_lc3_cached = (T297_lc3_leftOrAbove ? y <= T297_lc3_borderY : y >= T297_lc3_borderY);
				} else if(T297_lc3_vertical) {
					// nothing
				} else {
					if(T297_lc3_lastY == y - 1) {
						T297_lc3_borderX += T297_lc3_m;
						T297_lc3_lastY++;
					} else {
						T297_lc3_borderX = y*T297_lc3_m + T297_lc3_C;
						T297_lc3_lastY = y;
					}
				}
			}
		}

		if(T298_initializedWithValidData) {
			if(y < T298_miny || y > T298_maxy) {
				T298_okay = false;
			} else {
				T298_okay = true;
				if(T298_lc1_horizontal) {
					T298_lc1_cached = (T298_lc1_leftOrAbove ? y <= T298_lc1_borderY : y >= T298_lc1_borderY);
				} else if(T298_lc1_vertical) {
					// nothing
				} else {
					if(T298_lc1_lastY == y - 1) {
						T298_lc1_borderX += T298_lc1_m;
						T298_lc1_lastY++;
					} else {
						T298_lc1_borderX = y*T298_lc1_m + T298_lc1_C;
						T298_lc1_lastY = y;
					}
				}
				if(T298_lc2_horizontal) {
					T298_lc2_cached = (T298_lc2_leftOrAbove ? y <= T298_lc2_borderY : y >= T298_lc2_borderY);
				} else if(T298_lc2_vertical) {
					// nothing
				} else {
					if(T298_lc2_lastY == y - 1) {
						T298_lc2_borderX += T298_lc2_m;
						T298_lc2_lastY++;
					} else {
						T298_lc2_borderX = y*T298_lc2_m + T298_lc2_C;
						T298_lc2_lastY = y;
					}
				}
				if(T298_lc3_horizontal) {
					T298_lc3_cached = (T298_lc3_leftOrAbove ? y <= T298_lc3_borderY : y >= T298_lc3_borderY);
				} else if(T298_lc3_vertical) {
					// nothing
				} else {
					if(T298_lc3_lastY == y - 1) {
						T298_lc3_borderX += T298_lc3_m;
						T298_lc3_lastY++;
					} else {
						T298_lc3_borderX = y*T298_lc3_m + T298_lc3_C;
						T298_lc3_lastY = y;
					}
				}
			}
		}

		if(T299_initializedWithValidData) {
			if(y < T299_miny || y > T299_maxy) {
				T299_okay = false;
			} else {
				T299_okay = true;
				if(T299_lc1_horizontal) {
					T299_lc1_cached = (T299_lc1_leftOrAbove ? y <= T299_lc1_borderY : y >= T299_lc1_borderY);
				} else if(T299_lc1_vertical) {
					// nothing
				} else {
					if(T299_lc1_lastY == y - 1) {
						T299_lc1_borderX += T299_lc1_m;
						T299_lc1_lastY++;
					} else {
						T299_lc1_borderX = y*T299_lc1_m + T299_lc1_C;
						T299_lc1_lastY = y;
					}
				}
				if(T299_lc2_horizontal) {
					T299_lc2_cached = (T299_lc2_leftOrAbove ? y <= T299_lc2_borderY : y >= T299_lc2_borderY);
				} else if(T299_lc2_vertical) {
					// nothing
				} else {
					if(T299_lc2_lastY == y - 1) {
						T299_lc2_borderX += T299_lc2_m;
						T299_lc2_lastY++;
					} else {
						T299_lc2_borderX = y*T299_lc2_m + T299_lc2_C;
						T299_lc2_lastY = y;
					}
				}
				if(T299_lc3_horizontal) {
					T299_lc3_cached = (T299_lc3_leftOrAbove ? y <= T299_lc3_borderY : y >= T299_lc3_borderY);
				} else if(T299_lc3_vertical) {
					// nothing
				} else {
					if(T299_lc3_lastY == y - 1) {
						T299_lc3_borderX += T299_lc3_m;
						T299_lc3_lastY++;
					} else {
						T299_lc3_borderX = y*T299_lc3_m + T299_lc3_C;
						T299_lc3_lastY = y;
					}
				}
			}
		}
	}

	private boolean drawPart1() {
		if(T299_okay && x >= T299_minx && x <= T299_maxx
		&& (T299_lc1_horizontal ? T299_lc1_cached : (T299_lc1_leftOrAbove ? x <= T299_lc1_borderX : x >= T299_lc1_borderX))
		&& (T299_lc2_horizontal ? T299_lc2_cached : (T299_lc2_leftOrAbove ? x <= T299_lc2_borderX : x >= T299_lc2_borderX))
		&& (T299_lc3_horizontal ? T299_lc3_cached : (T299_lc3_leftOrAbove ? x <= T299_lc3_borderX : x >= T299_lc3_borderX))
		) { r = T299_r; g = T299_g; b = T299_b; return true; } 

		if(T298_okay && x >= T298_minx && x <= T298_maxx
		&& (T298_lc1_horizontal ? T298_lc1_cached : (T298_lc1_leftOrAbove ? x <= T298_lc1_borderX : x >= T298_lc1_borderX))
		&& (T298_lc2_horizontal ? T298_lc2_cached : (T298_lc2_leftOrAbove ? x <= T298_lc2_borderX : x >= T298_lc2_borderX))
		&& (T298_lc3_horizontal ? T298_lc3_cached : (T298_lc3_leftOrAbove ? x <= T298_lc3_borderX : x >= T298_lc3_borderX))
		) { r = T298_r; g = T298_g; b = T298_b; return true; } 

		if(T297_okay && x >= T297_minx && x <= T297_maxx
		&& (T297_lc1_horizontal ? T297_lc1_cached : (T297_lc1_leftOrAbove ? x <= T297_lc1_borderX : x >= T297_lc1_borderX))
		&& (T297_lc2_horizontal ? T297_lc2_cached : (T297_lc2_leftOrAbove ? x <= T297_lc2_borderX : x >= T297_lc2_borderX))
		&& (T297_lc3_horizontal ? T297_lc3_cached : (T297_lc3_leftOrAbove ? x <= T297_lc3_borderX : x >= T297_lc3_borderX))
		) { r = T297_r; g = T297_g; b = T297_b; return true; } 

		if(T296_okay && x >= T296_minx && x <= T296_maxx
		&& (T296_lc1_horizontal ? T296_lc1_cached : (T296_lc1_leftOrAbove ? x <= T296_lc1_borderX : x >= T296_lc1_borderX))
		&& (T296_lc2_horizontal ? T296_lc2_cached : (T296_lc2_leftOrAbove ? x <= T296_lc2_borderX : x >= T296_lc2_borderX))
		&& (T296_lc3_horizontal ? T296_lc3_cached : (T296_lc3_leftOrAbove ? x <= T296_lc3_borderX : x >= T296_lc3_borderX))
		) { r = T296_r; g = T296_g; b = T296_b; return true; } 

		if(T295_okay && x >= T295_minx && x <= T295_maxx
		&& (T295_lc1_horizontal ? T295_lc1_cached : (T295_lc1_leftOrAbove ? x <= T295_lc1_borderX : x >= T295_lc1_borderX))
		&& (T295_lc2_horizontal ? T295_lc2_cached : (T295_lc2_leftOrAbove ? x <= T295_lc2_borderX : x >= T295_lc2_borderX))
		&& (T295_lc3_horizontal ? T295_lc3_cached : (T295_lc3_leftOrAbove ? x <= T295_lc3_borderX : x >= T295_lc3_borderX))
		) { r = T295_r; g = T295_g; b = T295_b; return true; } 

		if(T294_okay && x >= T294_minx && x <= T294_maxx
		&& (T294_lc1_horizontal ? T294_lc1_cached : (T294_lc1_leftOrAbove ? x <= T294_lc1_borderX : x >= T294_lc1_borderX))
		&& (T294_lc2_horizontal ? T294_lc2_cached : (T294_lc2_leftOrAbove ? x <= T294_lc2_borderX : x >= T294_lc2_borderX))
		&& (T294_lc3_horizontal ? T294_lc3_cached : (T294_lc3_leftOrAbove ? x <= T294_lc3_borderX : x >= T294_lc3_borderX))
		) { r = T294_r; g = T294_g; b = T294_b; return true; } 

		if(T293_okay && x >= T293_minx && x <= T293_maxx
		&& (T293_lc1_horizontal ? T293_lc1_cached : (T293_lc1_leftOrAbove ? x <= T293_lc1_borderX : x >= T293_lc1_borderX))
		&& (T293_lc2_horizontal ? T293_lc2_cached : (T293_lc2_leftOrAbove ? x <= T293_lc2_borderX : x >= T293_lc2_borderX))
		&& (T293_lc3_horizontal ? T293_lc3_cached : (T293_lc3_leftOrAbove ? x <= T293_lc3_borderX : x >= T293_lc3_borderX))
		) { r = T293_r; g = T293_g; b = T293_b; return true; } 

		if(T292_okay && x >= T292_minx && x <= T292_maxx
		&& (T292_lc1_horizontal ? T292_lc1_cached : (T292_lc1_leftOrAbove ? x <= T292_lc1_borderX : x >= T292_lc1_borderX))
		&& (T292_lc2_horizontal ? T292_lc2_cached : (T292_lc2_leftOrAbove ? x <= T292_lc2_borderX : x >= T292_lc2_borderX))
		&& (T292_lc3_horizontal ? T292_lc3_cached : (T292_lc3_leftOrAbove ? x <= T292_lc3_borderX : x >= T292_lc3_borderX))
		) { r = T292_r; g = T292_g; b = T292_b; return true; } 

		if(T291_okay && x >= T291_minx && x <= T291_maxx
		&& (T291_lc1_horizontal ? T291_lc1_cached : (T291_lc1_leftOrAbove ? x <= T291_lc1_borderX : x >= T291_lc1_borderX))
		&& (T291_lc2_horizontal ? T291_lc2_cached : (T291_lc2_leftOrAbove ? x <= T291_lc2_borderX : x >= T291_lc2_borderX))
		&& (T291_lc3_horizontal ? T291_lc3_cached : (T291_lc3_leftOrAbove ? x <= T291_lc3_borderX : x >= T291_lc3_borderX))
		) { r = T291_r; g = T291_g; b = T291_b; return true; } 

		if(T290_okay && x >= T290_minx && x <= T290_maxx
		&& (T290_lc1_horizontal ? T290_lc1_cached : (T290_lc1_leftOrAbove ? x <= T290_lc1_borderX : x >= T290_lc1_borderX))
		&& (T290_lc2_horizontal ? T290_lc2_cached : (T290_lc2_leftOrAbove ? x <= T290_lc2_borderX : x >= T290_lc2_borderX))
		&& (T290_lc3_horizontal ? T290_lc3_cached : (T290_lc3_leftOrAbove ? x <= T290_lc3_borderX : x >= T290_lc3_borderX))
		) { r = T290_r; g = T290_g; b = T290_b; return true; } 

		if(T289_okay && x >= T289_minx && x <= T289_maxx
		&& (T289_lc1_horizontal ? T289_lc1_cached : (T289_lc1_leftOrAbove ? x <= T289_lc1_borderX : x >= T289_lc1_borderX))
		&& (T289_lc2_horizontal ? T289_lc2_cached : (T289_lc2_leftOrAbove ? x <= T289_lc2_borderX : x >= T289_lc2_borderX))
		&& (T289_lc3_horizontal ? T289_lc3_cached : (T289_lc3_leftOrAbove ? x <= T289_lc3_borderX : x >= T289_lc3_borderX))
		) { r = T289_r; g = T289_g; b = T289_b; return true; } 

		if(T288_okay && x >= T288_minx && x <= T288_maxx
		&& (T288_lc1_horizontal ? T288_lc1_cached : (T288_lc1_leftOrAbove ? x <= T288_lc1_borderX : x >= T288_lc1_borderX))
		&& (T288_lc2_horizontal ? T288_lc2_cached : (T288_lc2_leftOrAbove ? x <= T288_lc2_borderX : x >= T288_lc2_borderX))
		&& (T288_lc3_horizontal ? T288_lc3_cached : (T288_lc3_leftOrAbove ? x <= T288_lc3_borderX : x >= T288_lc3_borderX))
		) { r = T288_r; g = T288_g; b = T288_b; return true; } 

		if(T287_okay && x >= T287_minx && x <= T287_maxx
		&& (T287_lc1_horizontal ? T287_lc1_cached : (T287_lc1_leftOrAbove ? x <= T287_lc1_borderX : x >= T287_lc1_borderX))
		&& (T287_lc2_horizontal ? T287_lc2_cached : (T287_lc2_leftOrAbove ? x <= T287_lc2_borderX : x >= T287_lc2_borderX))
		&& (T287_lc3_horizontal ? T287_lc3_cached : (T287_lc3_leftOrAbove ? x <= T287_lc3_borderX : x >= T287_lc3_borderX))
		) { r = T287_r; g = T287_g; b = T287_b; return true; } 

		if(T286_okay && x >= T286_minx && x <= T286_maxx
		&& (T286_lc1_horizontal ? T286_lc1_cached : (T286_lc1_leftOrAbove ? x <= T286_lc1_borderX : x >= T286_lc1_borderX))
		&& (T286_lc2_horizontal ? T286_lc2_cached : (T286_lc2_leftOrAbove ? x <= T286_lc2_borderX : x >= T286_lc2_borderX))
		&& (T286_lc3_horizontal ? T286_lc3_cached : (T286_lc3_leftOrAbove ? x <= T286_lc3_borderX : x >= T286_lc3_borderX))
		) { r = T286_r; g = T286_g; b = T286_b; return true; } 

		if(T285_okay && x >= T285_minx && x <= T285_maxx
		&& (T285_lc1_horizontal ? T285_lc1_cached : (T285_lc1_leftOrAbove ? x <= T285_lc1_borderX : x >= T285_lc1_borderX))
		&& (T285_lc2_horizontal ? T285_lc2_cached : (T285_lc2_leftOrAbove ? x <= T285_lc2_borderX : x >= T285_lc2_borderX))
		&& (T285_lc3_horizontal ? T285_lc3_cached : (T285_lc3_leftOrAbove ? x <= T285_lc3_borderX : x >= T285_lc3_borderX))
		) { r = T285_r; g = T285_g; b = T285_b; return true; } 

		if(T284_okay && x >= T284_minx && x <= T284_maxx
		&& (T284_lc1_horizontal ? T284_lc1_cached : (T284_lc1_leftOrAbove ? x <= T284_lc1_borderX : x >= T284_lc1_borderX))
		&& (T284_lc2_horizontal ? T284_lc2_cached : (T284_lc2_leftOrAbove ? x <= T284_lc2_borderX : x >= T284_lc2_borderX))
		&& (T284_lc3_horizontal ? T284_lc3_cached : (T284_lc3_leftOrAbove ? x <= T284_lc3_borderX : x >= T284_lc3_borderX))
		) { r = T284_r; g = T284_g; b = T284_b; return true; } 

		if(T283_okay && x >= T283_minx && x <= T283_maxx
		&& (T283_lc1_horizontal ? T283_lc1_cached : (T283_lc1_leftOrAbove ? x <= T283_lc1_borderX : x >= T283_lc1_borderX))
		&& (T283_lc2_horizontal ? T283_lc2_cached : (T283_lc2_leftOrAbove ? x <= T283_lc2_borderX : x >= T283_lc2_borderX))
		&& (T283_lc3_horizontal ? T283_lc3_cached : (T283_lc3_leftOrAbove ? x <= T283_lc3_borderX : x >= T283_lc3_borderX))
		) { r = T283_r; g = T283_g; b = T283_b; return true; } 

		if(T282_okay && x >= T282_minx && x <= T282_maxx
		&& (T282_lc1_horizontal ? T282_lc1_cached : (T282_lc1_leftOrAbove ? x <= T282_lc1_borderX : x >= T282_lc1_borderX))
		&& (T282_lc2_horizontal ? T282_lc2_cached : (T282_lc2_leftOrAbove ? x <= T282_lc2_borderX : x >= T282_lc2_borderX))
		&& (T282_lc3_horizontal ? T282_lc3_cached : (T282_lc3_leftOrAbove ? x <= T282_lc3_borderX : x >= T282_lc3_borderX))
		) { r = T282_r; g = T282_g; b = T282_b; return true; } 

		if(T281_okay && x >= T281_minx && x <= T281_maxx
		&& (T281_lc1_horizontal ? T281_lc1_cached : (T281_lc1_leftOrAbove ? x <= T281_lc1_borderX : x >= T281_lc1_borderX))
		&& (T281_lc2_horizontal ? T281_lc2_cached : (T281_lc2_leftOrAbove ? x <= T281_lc2_borderX : x >= T281_lc2_borderX))
		&& (T281_lc3_horizontal ? T281_lc3_cached : (T281_lc3_leftOrAbove ? x <= T281_lc3_borderX : x >= T281_lc3_borderX))
		) { r = T281_r; g = T281_g; b = T281_b; return true; } 

		if(T280_okay && x >= T280_minx && x <= T280_maxx
		&& (T280_lc1_horizontal ? T280_lc1_cached : (T280_lc1_leftOrAbove ? x <= T280_lc1_borderX : x >= T280_lc1_borderX))
		&& (T280_lc2_horizontal ? T280_lc2_cached : (T280_lc2_leftOrAbove ? x <= T280_lc2_borderX : x >= T280_lc2_borderX))
		&& (T280_lc3_horizontal ? T280_lc3_cached : (T280_lc3_leftOrAbove ? x <= T280_lc3_borderX : x >= T280_lc3_borderX))
		) { r = T280_r; g = T280_g; b = T280_b; return true; } 

		if(T279_okay && x >= T279_minx && x <= T279_maxx
		&& (T279_lc1_horizontal ? T279_lc1_cached : (T279_lc1_leftOrAbove ? x <= T279_lc1_borderX : x >= T279_lc1_borderX))
		&& (T279_lc2_horizontal ? T279_lc2_cached : (T279_lc2_leftOrAbove ? x <= T279_lc2_borderX : x >= T279_lc2_borderX))
		&& (T279_lc3_horizontal ? T279_lc3_cached : (T279_lc3_leftOrAbove ? x <= T279_lc3_borderX : x >= T279_lc3_borderX))
		) { r = T279_r; g = T279_g; b = T279_b; return true; } 

		if(T278_okay && x >= T278_minx && x <= T278_maxx
		&& (T278_lc1_horizontal ? T278_lc1_cached : (T278_lc1_leftOrAbove ? x <= T278_lc1_borderX : x >= T278_lc1_borderX))
		&& (T278_lc2_horizontal ? T278_lc2_cached : (T278_lc2_leftOrAbove ? x <= T278_lc2_borderX : x >= T278_lc2_borderX))
		&& (T278_lc3_horizontal ? T278_lc3_cached : (T278_lc3_leftOrAbove ? x <= T278_lc3_borderX : x >= T278_lc3_borderX))
		) { r = T278_r; g = T278_g; b = T278_b; return true; } 

		if(T277_okay && x >= T277_minx && x <= T277_maxx
		&& (T277_lc1_horizontal ? T277_lc1_cached : (T277_lc1_leftOrAbove ? x <= T277_lc1_borderX : x >= T277_lc1_borderX))
		&& (T277_lc2_horizontal ? T277_lc2_cached : (T277_lc2_leftOrAbove ? x <= T277_lc2_borderX : x >= T277_lc2_borderX))
		&& (T277_lc3_horizontal ? T277_lc3_cached : (T277_lc3_leftOrAbove ? x <= T277_lc3_borderX : x >= T277_lc3_borderX))
		) { r = T277_r; g = T277_g; b = T277_b; return true; } 

		if(T276_okay && x >= T276_minx && x <= T276_maxx
		&& (T276_lc1_horizontal ? T276_lc1_cached : (T276_lc1_leftOrAbove ? x <= T276_lc1_borderX : x >= T276_lc1_borderX))
		&& (T276_lc2_horizontal ? T276_lc2_cached : (T276_lc2_leftOrAbove ? x <= T276_lc2_borderX : x >= T276_lc2_borderX))
		&& (T276_lc3_horizontal ? T276_lc3_cached : (T276_lc3_leftOrAbove ? x <= T276_lc3_borderX : x >= T276_lc3_borderX))
		) { r = T276_r; g = T276_g; b = T276_b; return true; } 

		if(T275_okay && x >= T275_minx && x <= T275_maxx
		&& (T275_lc1_horizontal ? T275_lc1_cached : (T275_lc1_leftOrAbove ? x <= T275_lc1_borderX : x >= T275_lc1_borderX))
		&& (T275_lc2_horizontal ? T275_lc2_cached : (T275_lc2_leftOrAbove ? x <= T275_lc2_borderX : x >= T275_lc2_borderX))
		&& (T275_lc3_horizontal ? T275_lc3_cached : (T275_lc3_leftOrAbove ? x <= T275_lc3_borderX : x >= T275_lc3_borderX))
		) { r = T275_r; g = T275_g; b = T275_b; return true; } 

		if(T274_okay && x >= T274_minx && x <= T274_maxx
		&& (T274_lc1_horizontal ? T274_lc1_cached : (T274_lc1_leftOrAbove ? x <= T274_lc1_borderX : x >= T274_lc1_borderX))
		&& (T274_lc2_horizontal ? T274_lc2_cached : (T274_lc2_leftOrAbove ? x <= T274_lc2_borderX : x >= T274_lc2_borderX))
		&& (T274_lc3_horizontal ? T274_lc3_cached : (T274_lc3_leftOrAbove ? x <= T274_lc3_borderX : x >= T274_lc3_borderX))
		) { r = T274_r; g = T274_g; b = T274_b; return true; } 

		if(T273_okay && x >= T273_minx && x <= T273_maxx
		&& (T273_lc1_horizontal ? T273_lc1_cached : (T273_lc1_leftOrAbove ? x <= T273_lc1_borderX : x >= T273_lc1_borderX))
		&& (T273_lc2_horizontal ? T273_lc2_cached : (T273_lc2_leftOrAbove ? x <= T273_lc2_borderX : x >= T273_lc2_borderX))
		&& (T273_lc3_horizontal ? T273_lc3_cached : (T273_lc3_leftOrAbove ? x <= T273_lc3_borderX : x >= T273_lc3_borderX))
		) { r = T273_r; g = T273_g; b = T273_b; return true; } 

		if(T272_okay && x >= T272_minx && x <= T272_maxx
		&& (T272_lc1_horizontal ? T272_lc1_cached : (T272_lc1_leftOrAbove ? x <= T272_lc1_borderX : x >= T272_lc1_borderX))
		&& (T272_lc2_horizontal ? T272_lc2_cached : (T272_lc2_leftOrAbove ? x <= T272_lc2_borderX : x >= T272_lc2_borderX))
		&& (T272_lc3_horizontal ? T272_lc3_cached : (T272_lc3_leftOrAbove ? x <= T272_lc3_borderX : x >= T272_lc3_borderX))
		) { r = T272_r; g = T272_g; b = T272_b; return true; } 

		if(T271_okay && x >= T271_minx && x <= T271_maxx
		&& (T271_lc1_horizontal ? T271_lc1_cached : (T271_lc1_leftOrAbove ? x <= T271_lc1_borderX : x >= T271_lc1_borderX))
		&& (T271_lc2_horizontal ? T271_lc2_cached : (T271_lc2_leftOrAbove ? x <= T271_lc2_borderX : x >= T271_lc2_borderX))
		&& (T271_lc3_horizontal ? T271_lc3_cached : (T271_lc3_leftOrAbove ? x <= T271_lc3_borderX : x >= T271_lc3_borderX))
		) { r = T271_r; g = T271_g; b = T271_b; return true; } 

		if(T270_okay && x >= T270_minx && x <= T270_maxx
		&& (T270_lc1_horizontal ? T270_lc1_cached : (T270_lc1_leftOrAbove ? x <= T270_lc1_borderX : x >= T270_lc1_borderX))
		&& (T270_lc2_horizontal ? T270_lc2_cached : (T270_lc2_leftOrAbove ? x <= T270_lc2_borderX : x >= T270_lc2_borderX))
		&& (T270_lc3_horizontal ? T270_lc3_cached : (T270_lc3_leftOrAbove ? x <= T270_lc3_borderX : x >= T270_lc3_borderX))
		) { r = T270_r; g = T270_g; b = T270_b; return true; } 

		return false;
	}

	private boolean drawPart2() {
		if(T269_okay && x >= T269_minx && x <= T269_maxx
		&& (T269_lc1_horizontal ? T269_lc1_cached : (T269_lc1_leftOrAbove ? x <= T269_lc1_borderX : x >= T269_lc1_borderX))
		&& (T269_lc2_horizontal ? T269_lc2_cached : (T269_lc2_leftOrAbove ? x <= T269_lc2_borderX : x >= T269_lc2_borderX))
		&& (T269_lc3_horizontal ? T269_lc3_cached : (T269_lc3_leftOrAbove ? x <= T269_lc3_borderX : x >= T269_lc3_borderX))
		) { r = T269_r; g = T269_g; b = T269_b; return true; } 

		if(T268_okay && x >= T268_minx && x <= T268_maxx
		&& (T268_lc1_horizontal ? T268_lc1_cached : (T268_lc1_leftOrAbove ? x <= T268_lc1_borderX : x >= T268_lc1_borderX))
		&& (T268_lc2_horizontal ? T268_lc2_cached : (T268_lc2_leftOrAbove ? x <= T268_lc2_borderX : x >= T268_lc2_borderX))
		&& (T268_lc3_horizontal ? T268_lc3_cached : (T268_lc3_leftOrAbove ? x <= T268_lc3_borderX : x >= T268_lc3_borderX))
		) { r = T268_r; g = T268_g; b = T268_b; return true; } 

		if(T267_okay && x >= T267_minx && x <= T267_maxx
		&& (T267_lc1_horizontal ? T267_lc1_cached : (T267_lc1_leftOrAbove ? x <= T267_lc1_borderX : x >= T267_lc1_borderX))
		&& (T267_lc2_horizontal ? T267_lc2_cached : (T267_lc2_leftOrAbove ? x <= T267_lc2_borderX : x >= T267_lc2_borderX))
		&& (T267_lc3_horizontal ? T267_lc3_cached : (T267_lc3_leftOrAbove ? x <= T267_lc3_borderX : x >= T267_lc3_borderX))
		) { r = T267_r; g = T267_g; b = T267_b; return true; } 

		if(T266_okay && x >= T266_minx && x <= T266_maxx
		&& (T266_lc1_horizontal ? T266_lc1_cached : (T266_lc1_leftOrAbove ? x <= T266_lc1_borderX : x >= T266_lc1_borderX))
		&& (T266_lc2_horizontal ? T266_lc2_cached : (T266_lc2_leftOrAbove ? x <= T266_lc2_borderX : x >= T266_lc2_borderX))
		&& (T266_lc3_horizontal ? T266_lc3_cached : (T266_lc3_leftOrAbove ? x <= T266_lc3_borderX : x >= T266_lc3_borderX))
		) { r = T266_r; g = T266_g; b = T266_b; return true; } 

		if(T265_okay && x >= T265_minx && x <= T265_maxx
		&& (T265_lc1_horizontal ? T265_lc1_cached : (T265_lc1_leftOrAbove ? x <= T265_lc1_borderX : x >= T265_lc1_borderX))
		&& (T265_lc2_horizontal ? T265_lc2_cached : (T265_lc2_leftOrAbove ? x <= T265_lc2_borderX : x >= T265_lc2_borderX))
		&& (T265_lc3_horizontal ? T265_lc3_cached : (T265_lc3_leftOrAbove ? x <= T265_lc3_borderX : x >= T265_lc3_borderX))
		) { r = T265_r; g = T265_g; b = T265_b; return true; } 

		if(T264_okay && x >= T264_minx && x <= T264_maxx
		&& (T264_lc1_horizontal ? T264_lc1_cached : (T264_lc1_leftOrAbove ? x <= T264_lc1_borderX : x >= T264_lc1_borderX))
		&& (T264_lc2_horizontal ? T264_lc2_cached : (T264_lc2_leftOrAbove ? x <= T264_lc2_borderX : x >= T264_lc2_borderX))
		&& (T264_lc3_horizontal ? T264_lc3_cached : (T264_lc3_leftOrAbove ? x <= T264_lc3_borderX : x >= T264_lc3_borderX))
		) { r = T264_r; g = T264_g; b = T264_b; return true; } 

		if(T263_okay && x >= T263_minx && x <= T263_maxx
		&& (T263_lc1_horizontal ? T263_lc1_cached : (T263_lc1_leftOrAbove ? x <= T263_lc1_borderX : x >= T263_lc1_borderX))
		&& (T263_lc2_horizontal ? T263_lc2_cached : (T263_lc2_leftOrAbove ? x <= T263_lc2_borderX : x >= T263_lc2_borderX))
		&& (T263_lc3_horizontal ? T263_lc3_cached : (T263_lc3_leftOrAbove ? x <= T263_lc3_borderX : x >= T263_lc3_borderX))
		) { r = T263_r; g = T263_g; b = T263_b; return true; } 

		if(T262_okay && x >= T262_minx && x <= T262_maxx
		&& (T262_lc1_horizontal ? T262_lc1_cached : (T262_lc1_leftOrAbove ? x <= T262_lc1_borderX : x >= T262_lc1_borderX))
		&& (T262_lc2_horizontal ? T262_lc2_cached : (T262_lc2_leftOrAbove ? x <= T262_lc2_borderX : x >= T262_lc2_borderX))
		&& (T262_lc3_horizontal ? T262_lc3_cached : (T262_lc3_leftOrAbove ? x <= T262_lc3_borderX : x >= T262_lc3_borderX))
		) { r = T262_r; g = T262_g; b = T262_b; return true; } 

		if(T261_okay && x >= T261_minx && x <= T261_maxx
		&& (T261_lc1_horizontal ? T261_lc1_cached : (T261_lc1_leftOrAbove ? x <= T261_lc1_borderX : x >= T261_lc1_borderX))
		&& (T261_lc2_horizontal ? T261_lc2_cached : (T261_lc2_leftOrAbove ? x <= T261_lc2_borderX : x >= T261_lc2_borderX))
		&& (T261_lc3_horizontal ? T261_lc3_cached : (T261_lc3_leftOrAbove ? x <= T261_lc3_borderX : x >= T261_lc3_borderX))
		) { r = T261_r; g = T261_g; b = T261_b; return true; } 

		if(T260_okay && x >= T260_minx && x <= T260_maxx
		&& (T260_lc1_horizontal ? T260_lc1_cached : (T260_lc1_leftOrAbove ? x <= T260_lc1_borderX : x >= T260_lc1_borderX))
		&& (T260_lc2_horizontal ? T260_lc2_cached : (T260_lc2_leftOrAbove ? x <= T260_lc2_borderX : x >= T260_lc2_borderX))
		&& (T260_lc3_horizontal ? T260_lc3_cached : (T260_lc3_leftOrAbove ? x <= T260_lc3_borderX : x >= T260_lc3_borderX))
		) { r = T260_r; g = T260_g; b = T260_b; return true; } 

		if(T259_okay && x >= T259_minx && x <= T259_maxx
		&& (T259_lc1_horizontal ? T259_lc1_cached : (T259_lc1_leftOrAbove ? x <= T259_lc1_borderX : x >= T259_lc1_borderX))
		&& (T259_lc2_horizontal ? T259_lc2_cached : (T259_lc2_leftOrAbove ? x <= T259_lc2_borderX : x >= T259_lc2_borderX))
		&& (T259_lc3_horizontal ? T259_lc3_cached : (T259_lc3_leftOrAbove ? x <= T259_lc3_borderX : x >= T259_lc3_borderX))
		) { r = T259_r; g = T259_g; b = T259_b; return true; } 

		if(T258_okay && x >= T258_minx && x <= T258_maxx
		&& (T258_lc1_horizontal ? T258_lc1_cached : (T258_lc1_leftOrAbove ? x <= T258_lc1_borderX : x >= T258_lc1_borderX))
		&& (T258_lc2_horizontal ? T258_lc2_cached : (T258_lc2_leftOrAbove ? x <= T258_lc2_borderX : x >= T258_lc2_borderX))
		&& (T258_lc3_horizontal ? T258_lc3_cached : (T258_lc3_leftOrAbove ? x <= T258_lc3_borderX : x >= T258_lc3_borderX))
		) { r = T258_r; g = T258_g; b = T258_b; return true; } 

		if(T257_okay && x >= T257_minx && x <= T257_maxx
		&& (T257_lc1_horizontal ? T257_lc1_cached : (T257_lc1_leftOrAbove ? x <= T257_lc1_borderX : x >= T257_lc1_borderX))
		&& (T257_lc2_horizontal ? T257_lc2_cached : (T257_lc2_leftOrAbove ? x <= T257_lc2_borderX : x >= T257_lc2_borderX))
		&& (T257_lc3_horizontal ? T257_lc3_cached : (T257_lc3_leftOrAbove ? x <= T257_lc3_borderX : x >= T257_lc3_borderX))
		) { r = T257_r; g = T257_g; b = T257_b; return true; } 

		if(T256_okay && x >= T256_minx && x <= T256_maxx
		&& (T256_lc1_horizontal ? T256_lc1_cached : (T256_lc1_leftOrAbove ? x <= T256_lc1_borderX : x >= T256_lc1_borderX))
		&& (T256_lc2_horizontal ? T256_lc2_cached : (T256_lc2_leftOrAbove ? x <= T256_lc2_borderX : x >= T256_lc2_borderX))
		&& (T256_lc3_horizontal ? T256_lc3_cached : (T256_lc3_leftOrAbove ? x <= T256_lc3_borderX : x >= T256_lc3_borderX))
		) { r = T256_r; g = T256_g; b = T256_b; return true; } 

		if(T255_okay && x >= T255_minx && x <= T255_maxx
		&& (T255_lc1_horizontal ? T255_lc1_cached : (T255_lc1_leftOrAbove ? x <= T255_lc1_borderX : x >= T255_lc1_borderX))
		&& (T255_lc2_horizontal ? T255_lc2_cached : (T255_lc2_leftOrAbove ? x <= T255_lc2_borderX : x >= T255_lc2_borderX))
		&& (T255_lc3_horizontal ? T255_lc3_cached : (T255_lc3_leftOrAbove ? x <= T255_lc3_borderX : x >= T255_lc3_borderX))
		) { r = T255_r; g = T255_g; b = T255_b; return true; } 

		if(T254_okay && x >= T254_minx && x <= T254_maxx
		&& (T254_lc1_horizontal ? T254_lc1_cached : (T254_lc1_leftOrAbove ? x <= T254_lc1_borderX : x >= T254_lc1_borderX))
		&& (T254_lc2_horizontal ? T254_lc2_cached : (T254_lc2_leftOrAbove ? x <= T254_lc2_borderX : x >= T254_lc2_borderX))
		&& (T254_lc3_horizontal ? T254_lc3_cached : (T254_lc3_leftOrAbove ? x <= T254_lc3_borderX : x >= T254_lc3_borderX))
		) { r = T254_r; g = T254_g; b = T254_b; return true; } 

		if(T253_okay && x >= T253_minx && x <= T253_maxx
		&& (T253_lc1_horizontal ? T253_lc1_cached : (T253_lc1_leftOrAbove ? x <= T253_lc1_borderX : x >= T253_lc1_borderX))
		&& (T253_lc2_horizontal ? T253_lc2_cached : (T253_lc2_leftOrAbove ? x <= T253_lc2_borderX : x >= T253_lc2_borderX))
		&& (T253_lc3_horizontal ? T253_lc3_cached : (T253_lc3_leftOrAbove ? x <= T253_lc3_borderX : x >= T253_lc3_borderX))
		) { r = T253_r; g = T253_g; b = T253_b; return true; } 

		if(T252_okay && x >= T252_minx && x <= T252_maxx
		&& (T252_lc1_horizontal ? T252_lc1_cached : (T252_lc1_leftOrAbove ? x <= T252_lc1_borderX : x >= T252_lc1_borderX))
		&& (T252_lc2_horizontal ? T252_lc2_cached : (T252_lc2_leftOrAbove ? x <= T252_lc2_borderX : x >= T252_lc2_borderX))
		&& (T252_lc3_horizontal ? T252_lc3_cached : (T252_lc3_leftOrAbove ? x <= T252_lc3_borderX : x >= T252_lc3_borderX))
		) { r = T252_r; g = T252_g; b = T252_b; return true; } 

		if(T251_okay && x >= T251_minx && x <= T251_maxx
		&& (T251_lc1_horizontal ? T251_lc1_cached : (T251_lc1_leftOrAbove ? x <= T251_lc1_borderX : x >= T251_lc1_borderX))
		&& (T251_lc2_horizontal ? T251_lc2_cached : (T251_lc2_leftOrAbove ? x <= T251_lc2_borderX : x >= T251_lc2_borderX))
		&& (T251_lc3_horizontal ? T251_lc3_cached : (T251_lc3_leftOrAbove ? x <= T251_lc3_borderX : x >= T251_lc3_borderX))
		) { r = T251_r; g = T251_g; b = T251_b; return true; } 

		if(T250_okay && x >= T250_minx && x <= T250_maxx
		&& (T250_lc1_horizontal ? T250_lc1_cached : (T250_lc1_leftOrAbove ? x <= T250_lc1_borderX : x >= T250_lc1_borderX))
		&& (T250_lc2_horizontal ? T250_lc2_cached : (T250_lc2_leftOrAbove ? x <= T250_lc2_borderX : x >= T250_lc2_borderX))
		&& (T250_lc3_horizontal ? T250_lc3_cached : (T250_lc3_leftOrAbove ? x <= T250_lc3_borderX : x >= T250_lc3_borderX))
		) { r = T250_r; g = T250_g; b = T250_b; return true; } 

		if(T249_okay && x >= T249_minx && x <= T249_maxx
		&& (T249_lc1_horizontal ? T249_lc1_cached : (T249_lc1_leftOrAbove ? x <= T249_lc1_borderX : x >= T249_lc1_borderX))
		&& (T249_lc2_horizontal ? T249_lc2_cached : (T249_lc2_leftOrAbove ? x <= T249_lc2_borderX : x >= T249_lc2_borderX))
		&& (T249_lc3_horizontal ? T249_lc3_cached : (T249_lc3_leftOrAbove ? x <= T249_lc3_borderX : x >= T249_lc3_borderX))
		) { r = T249_r; g = T249_g; b = T249_b; return true; } 

		if(T248_okay && x >= T248_minx && x <= T248_maxx
		&& (T248_lc1_horizontal ? T248_lc1_cached : (T248_lc1_leftOrAbove ? x <= T248_lc1_borderX : x >= T248_lc1_borderX))
		&& (T248_lc2_horizontal ? T248_lc2_cached : (T248_lc2_leftOrAbove ? x <= T248_lc2_borderX : x >= T248_lc2_borderX))
		&& (T248_lc3_horizontal ? T248_lc3_cached : (T248_lc3_leftOrAbove ? x <= T248_lc3_borderX : x >= T248_lc3_borderX))
		) { r = T248_r; g = T248_g; b = T248_b; return true; } 

		if(T247_okay && x >= T247_minx && x <= T247_maxx
		&& (T247_lc1_horizontal ? T247_lc1_cached : (T247_lc1_leftOrAbove ? x <= T247_lc1_borderX : x >= T247_lc1_borderX))
		&& (T247_lc2_horizontal ? T247_lc2_cached : (T247_lc2_leftOrAbove ? x <= T247_lc2_borderX : x >= T247_lc2_borderX))
		&& (T247_lc3_horizontal ? T247_lc3_cached : (T247_lc3_leftOrAbove ? x <= T247_lc3_borderX : x >= T247_lc3_borderX))
		) { r = T247_r; g = T247_g; b = T247_b; return true; } 

		if(T246_okay && x >= T246_minx && x <= T246_maxx
		&& (T246_lc1_horizontal ? T246_lc1_cached : (T246_lc1_leftOrAbove ? x <= T246_lc1_borderX : x >= T246_lc1_borderX))
		&& (T246_lc2_horizontal ? T246_lc2_cached : (T246_lc2_leftOrAbove ? x <= T246_lc2_borderX : x >= T246_lc2_borderX))
		&& (T246_lc3_horizontal ? T246_lc3_cached : (T246_lc3_leftOrAbove ? x <= T246_lc3_borderX : x >= T246_lc3_borderX))
		) { r = T246_r; g = T246_g; b = T246_b; return true; } 

		if(T245_okay && x >= T245_minx && x <= T245_maxx
		&& (T245_lc1_horizontal ? T245_lc1_cached : (T245_lc1_leftOrAbove ? x <= T245_lc1_borderX : x >= T245_lc1_borderX))
		&& (T245_lc2_horizontal ? T245_lc2_cached : (T245_lc2_leftOrAbove ? x <= T245_lc2_borderX : x >= T245_lc2_borderX))
		&& (T245_lc3_horizontal ? T245_lc3_cached : (T245_lc3_leftOrAbove ? x <= T245_lc3_borderX : x >= T245_lc3_borderX))
		) { r = T245_r; g = T245_g; b = T245_b; return true; } 

		if(T244_okay && x >= T244_minx && x <= T244_maxx
		&& (T244_lc1_horizontal ? T244_lc1_cached : (T244_lc1_leftOrAbove ? x <= T244_lc1_borderX : x >= T244_lc1_borderX))
		&& (T244_lc2_horizontal ? T244_lc2_cached : (T244_lc2_leftOrAbove ? x <= T244_lc2_borderX : x >= T244_lc2_borderX))
		&& (T244_lc3_horizontal ? T244_lc3_cached : (T244_lc3_leftOrAbove ? x <= T244_lc3_borderX : x >= T244_lc3_borderX))
		) { r = T244_r; g = T244_g; b = T244_b; return true; } 

		if(T243_okay && x >= T243_minx && x <= T243_maxx
		&& (T243_lc1_horizontal ? T243_lc1_cached : (T243_lc1_leftOrAbove ? x <= T243_lc1_borderX : x >= T243_lc1_borderX))
		&& (T243_lc2_horizontal ? T243_lc2_cached : (T243_lc2_leftOrAbove ? x <= T243_lc2_borderX : x >= T243_lc2_borderX))
		&& (T243_lc3_horizontal ? T243_lc3_cached : (T243_lc3_leftOrAbove ? x <= T243_lc3_borderX : x >= T243_lc3_borderX))
		) { r = T243_r; g = T243_g; b = T243_b; return true; } 

		if(T242_okay && x >= T242_minx && x <= T242_maxx
		&& (T242_lc1_horizontal ? T242_lc1_cached : (T242_lc1_leftOrAbove ? x <= T242_lc1_borderX : x >= T242_lc1_borderX))
		&& (T242_lc2_horizontal ? T242_lc2_cached : (T242_lc2_leftOrAbove ? x <= T242_lc2_borderX : x >= T242_lc2_borderX))
		&& (T242_lc3_horizontal ? T242_lc3_cached : (T242_lc3_leftOrAbove ? x <= T242_lc3_borderX : x >= T242_lc3_borderX))
		) { r = T242_r; g = T242_g; b = T242_b; return true; } 

		if(T241_okay && x >= T241_minx && x <= T241_maxx
		&& (T241_lc1_horizontal ? T241_lc1_cached : (T241_lc1_leftOrAbove ? x <= T241_lc1_borderX : x >= T241_lc1_borderX))
		&& (T241_lc2_horizontal ? T241_lc2_cached : (T241_lc2_leftOrAbove ? x <= T241_lc2_borderX : x >= T241_lc2_borderX))
		&& (T241_lc3_horizontal ? T241_lc3_cached : (T241_lc3_leftOrAbove ? x <= T241_lc3_borderX : x >= T241_lc3_borderX))
		) { r = T241_r; g = T241_g; b = T241_b; return true; } 

		if(T240_okay && x >= T240_minx && x <= T240_maxx
		&& (T240_lc1_horizontal ? T240_lc1_cached : (T240_lc1_leftOrAbove ? x <= T240_lc1_borderX : x >= T240_lc1_borderX))
		&& (T240_lc2_horizontal ? T240_lc2_cached : (T240_lc2_leftOrAbove ? x <= T240_lc2_borderX : x >= T240_lc2_borderX))
		&& (T240_lc3_horizontal ? T240_lc3_cached : (T240_lc3_leftOrAbove ? x <= T240_lc3_borderX : x >= T240_lc3_borderX))
		) { r = T240_r; g = T240_g; b = T240_b; return true; } 

		return false;
	}

	private boolean drawPart3() {
		if(T239_okay && x >= T239_minx && x <= T239_maxx
		&& (T239_lc1_horizontal ? T239_lc1_cached : (T239_lc1_leftOrAbove ? x <= T239_lc1_borderX : x >= T239_lc1_borderX))
		&& (T239_lc2_horizontal ? T239_lc2_cached : (T239_lc2_leftOrAbove ? x <= T239_lc2_borderX : x >= T239_lc2_borderX))
		&& (T239_lc3_horizontal ? T239_lc3_cached : (T239_lc3_leftOrAbove ? x <= T239_lc3_borderX : x >= T239_lc3_borderX))
		) { r = T239_r; g = T239_g; b = T239_b; return true; } 

		if(T238_okay && x >= T238_minx && x <= T238_maxx
		&& (T238_lc1_horizontal ? T238_lc1_cached : (T238_lc1_leftOrAbove ? x <= T238_lc1_borderX : x >= T238_lc1_borderX))
		&& (T238_lc2_horizontal ? T238_lc2_cached : (T238_lc2_leftOrAbove ? x <= T238_lc2_borderX : x >= T238_lc2_borderX))
		&& (T238_lc3_horizontal ? T238_lc3_cached : (T238_lc3_leftOrAbove ? x <= T238_lc3_borderX : x >= T238_lc3_borderX))
		) { r = T238_r; g = T238_g; b = T238_b; return true; } 

		if(T237_okay && x >= T237_minx && x <= T237_maxx
		&& (T237_lc1_horizontal ? T237_lc1_cached : (T237_lc1_leftOrAbove ? x <= T237_lc1_borderX : x >= T237_lc1_borderX))
		&& (T237_lc2_horizontal ? T237_lc2_cached : (T237_lc2_leftOrAbove ? x <= T237_lc2_borderX : x >= T237_lc2_borderX))
		&& (T237_lc3_horizontal ? T237_lc3_cached : (T237_lc3_leftOrAbove ? x <= T237_lc3_borderX : x >= T237_lc3_borderX))
		) { r = T237_r; g = T237_g; b = T237_b; return true; } 

		if(T236_okay && x >= T236_minx && x <= T236_maxx
		&& (T236_lc1_horizontal ? T236_lc1_cached : (T236_lc1_leftOrAbove ? x <= T236_lc1_borderX : x >= T236_lc1_borderX))
		&& (T236_lc2_horizontal ? T236_lc2_cached : (T236_lc2_leftOrAbove ? x <= T236_lc2_borderX : x >= T236_lc2_borderX))
		&& (T236_lc3_horizontal ? T236_lc3_cached : (T236_lc3_leftOrAbove ? x <= T236_lc3_borderX : x >= T236_lc3_borderX))
		) { r = T236_r; g = T236_g; b = T236_b; return true; } 

		if(T235_okay && x >= T235_minx && x <= T235_maxx
		&& (T235_lc1_horizontal ? T235_lc1_cached : (T235_lc1_leftOrAbove ? x <= T235_lc1_borderX : x >= T235_lc1_borderX))
		&& (T235_lc2_horizontal ? T235_lc2_cached : (T235_lc2_leftOrAbove ? x <= T235_lc2_borderX : x >= T235_lc2_borderX))
		&& (T235_lc3_horizontal ? T235_lc3_cached : (T235_lc3_leftOrAbove ? x <= T235_lc3_borderX : x >= T235_lc3_borderX))
		) { r = T235_r; g = T235_g; b = T235_b; return true; } 

		if(T234_okay && x >= T234_minx && x <= T234_maxx
		&& (T234_lc1_horizontal ? T234_lc1_cached : (T234_lc1_leftOrAbove ? x <= T234_lc1_borderX : x >= T234_lc1_borderX))
		&& (T234_lc2_horizontal ? T234_lc2_cached : (T234_lc2_leftOrAbove ? x <= T234_lc2_borderX : x >= T234_lc2_borderX))
		&& (T234_lc3_horizontal ? T234_lc3_cached : (T234_lc3_leftOrAbove ? x <= T234_lc3_borderX : x >= T234_lc3_borderX))
		) { r = T234_r; g = T234_g; b = T234_b; return true; } 

		if(T233_okay && x >= T233_minx && x <= T233_maxx
		&& (T233_lc1_horizontal ? T233_lc1_cached : (T233_lc1_leftOrAbove ? x <= T233_lc1_borderX : x >= T233_lc1_borderX))
		&& (T233_lc2_horizontal ? T233_lc2_cached : (T233_lc2_leftOrAbove ? x <= T233_lc2_borderX : x >= T233_lc2_borderX))
		&& (T233_lc3_horizontal ? T233_lc3_cached : (T233_lc3_leftOrAbove ? x <= T233_lc3_borderX : x >= T233_lc3_borderX))
		) { r = T233_r; g = T233_g; b = T233_b; return true; } 

		if(T232_okay && x >= T232_minx && x <= T232_maxx
		&& (T232_lc1_horizontal ? T232_lc1_cached : (T232_lc1_leftOrAbove ? x <= T232_lc1_borderX : x >= T232_lc1_borderX))
		&& (T232_lc2_horizontal ? T232_lc2_cached : (T232_lc2_leftOrAbove ? x <= T232_lc2_borderX : x >= T232_lc2_borderX))
		&& (T232_lc3_horizontal ? T232_lc3_cached : (T232_lc3_leftOrAbove ? x <= T232_lc3_borderX : x >= T232_lc3_borderX))
		) { r = T232_r; g = T232_g; b = T232_b; return true; } 

		if(T231_okay && x >= T231_minx && x <= T231_maxx
		&& (T231_lc1_horizontal ? T231_lc1_cached : (T231_lc1_leftOrAbove ? x <= T231_lc1_borderX : x >= T231_lc1_borderX))
		&& (T231_lc2_horizontal ? T231_lc2_cached : (T231_lc2_leftOrAbove ? x <= T231_lc2_borderX : x >= T231_lc2_borderX))
		&& (T231_lc3_horizontal ? T231_lc3_cached : (T231_lc3_leftOrAbove ? x <= T231_lc3_borderX : x >= T231_lc3_borderX))
		) { r = T231_r; g = T231_g; b = T231_b; return true; } 

		if(T230_okay && x >= T230_minx && x <= T230_maxx
		&& (T230_lc1_horizontal ? T230_lc1_cached : (T230_lc1_leftOrAbove ? x <= T230_lc1_borderX : x >= T230_lc1_borderX))
		&& (T230_lc2_horizontal ? T230_lc2_cached : (T230_lc2_leftOrAbove ? x <= T230_lc2_borderX : x >= T230_lc2_borderX))
		&& (T230_lc3_horizontal ? T230_lc3_cached : (T230_lc3_leftOrAbove ? x <= T230_lc3_borderX : x >= T230_lc3_borderX))
		) { r = T230_r; g = T230_g; b = T230_b; return true; } 

		if(T229_okay && x >= T229_minx && x <= T229_maxx
		&& (T229_lc1_horizontal ? T229_lc1_cached : (T229_lc1_leftOrAbove ? x <= T229_lc1_borderX : x >= T229_lc1_borderX))
		&& (T229_lc2_horizontal ? T229_lc2_cached : (T229_lc2_leftOrAbove ? x <= T229_lc2_borderX : x >= T229_lc2_borderX))
		&& (T229_lc3_horizontal ? T229_lc3_cached : (T229_lc3_leftOrAbove ? x <= T229_lc3_borderX : x >= T229_lc3_borderX))
		) { r = T229_r; g = T229_g; b = T229_b; return true; } 

		if(T228_okay && x >= T228_minx && x <= T228_maxx
		&& (T228_lc1_horizontal ? T228_lc1_cached : (T228_lc1_leftOrAbove ? x <= T228_lc1_borderX : x >= T228_lc1_borderX))
		&& (T228_lc2_horizontal ? T228_lc2_cached : (T228_lc2_leftOrAbove ? x <= T228_lc2_borderX : x >= T228_lc2_borderX))
		&& (T228_lc3_horizontal ? T228_lc3_cached : (T228_lc3_leftOrAbove ? x <= T228_lc3_borderX : x >= T228_lc3_borderX))
		) { r = T228_r; g = T228_g; b = T228_b; return true; } 

		if(T227_okay && x >= T227_minx && x <= T227_maxx
		&& (T227_lc1_horizontal ? T227_lc1_cached : (T227_lc1_leftOrAbove ? x <= T227_lc1_borderX : x >= T227_lc1_borderX))
		&& (T227_lc2_horizontal ? T227_lc2_cached : (T227_lc2_leftOrAbove ? x <= T227_lc2_borderX : x >= T227_lc2_borderX))
		&& (T227_lc3_horizontal ? T227_lc3_cached : (T227_lc3_leftOrAbove ? x <= T227_lc3_borderX : x >= T227_lc3_borderX))
		) { r = T227_r; g = T227_g; b = T227_b; return true; } 

		if(T226_okay && x >= T226_minx && x <= T226_maxx
		&& (T226_lc1_horizontal ? T226_lc1_cached : (T226_lc1_leftOrAbove ? x <= T226_lc1_borderX : x >= T226_lc1_borderX))
		&& (T226_lc2_horizontal ? T226_lc2_cached : (T226_lc2_leftOrAbove ? x <= T226_lc2_borderX : x >= T226_lc2_borderX))
		&& (T226_lc3_horizontal ? T226_lc3_cached : (T226_lc3_leftOrAbove ? x <= T226_lc3_borderX : x >= T226_lc3_borderX))
		) { r = T226_r; g = T226_g; b = T226_b; return true; } 

		if(T225_okay && x >= T225_minx && x <= T225_maxx
		&& (T225_lc1_horizontal ? T225_lc1_cached : (T225_lc1_leftOrAbove ? x <= T225_lc1_borderX : x >= T225_lc1_borderX))
		&& (T225_lc2_horizontal ? T225_lc2_cached : (T225_lc2_leftOrAbove ? x <= T225_lc2_borderX : x >= T225_lc2_borderX))
		&& (T225_lc3_horizontal ? T225_lc3_cached : (T225_lc3_leftOrAbove ? x <= T225_lc3_borderX : x >= T225_lc3_borderX))
		) { r = T225_r; g = T225_g; b = T225_b; return true; } 

		if(T224_okay && x >= T224_minx && x <= T224_maxx
		&& (T224_lc1_horizontal ? T224_lc1_cached : (T224_lc1_leftOrAbove ? x <= T224_lc1_borderX : x >= T224_lc1_borderX))
		&& (T224_lc2_horizontal ? T224_lc2_cached : (T224_lc2_leftOrAbove ? x <= T224_lc2_borderX : x >= T224_lc2_borderX))
		&& (T224_lc3_horizontal ? T224_lc3_cached : (T224_lc3_leftOrAbove ? x <= T224_lc3_borderX : x >= T224_lc3_borderX))
		) { r = T224_r; g = T224_g; b = T224_b; return true; } 

		if(T223_okay && x >= T223_minx && x <= T223_maxx
		&& (T223_lc1_horizontal ? T223_lc1_cached : (T223_lc1_leftOrAbove ? x <= T223_lc1_borderX : x >= T223_lc1_borderX))
		&& (T223_lc2_horizontal ? T223_lc2_cached : (T223_lc2_leftOrAbove ? x <= T223_lc2_borderX : x >= T223_lc2_borderX))
		&& (T223_lc3_horizontal ? T223_lc3_cached : (T223_lc3_leftOrAbove ? x <= T223_lc3_borderX : x >= T223_lc3_borderX))
		) { r = T223_r; g = T223_g; b = T223_b; return true; } 

		if(T222_okay && x >= T222_minx && x <= T222_maxx
		&& (T222_lc1_horizontal ? T222_lc1_cached : (T222_lc1_leftOrAbove ? x <= T222_lc1_borderX : x >= T222_lc1_borderX))
		&& (T222_lc2_horizontal ? T222_lc2_cached : (T222_lc2_leftOrAbove ? x <= T222_lc2_borderX : x >= T222_lc2_borderX))
		&& (T222_lc3_horizontal ? T222_lc3_cached : (T222_lc3_leftOrAbove ? x <= T222_lc3_borderX : x >= T222_lc3_borderX))
		) { r = T222_r; g = T222_g; b = T222_b; return true; } 

		if(T221_okay && x >= T221_minx && x <= T221_maxx
		&& (T221_lc1_horizontal ? T221_lc1_cached : (T221_lc1_leftOrAbove ? x <= T221_lc1_borderX : x >= T221_lc1_borderX))
		&& (T221_lc2_horizontal ? T221_lc2_cached : (T221_lc2_leftOrAbove ? x <= T221_lc2_borderX : x >= T221_lc2_borderX))
		&& (T221_lc3_horizontal ? T221_lc3_cached : (T221_lc3_leftOrAbove ? x <= T221_lc3_borderX : x >= T221_lc3_borderX))
		) { r = T221_r; g = T221_g; b = T221_b; return true; } 

		if(T220_okay && x >= T220_minx && x <= T220_maxx
		&& (T220_lc1_horizontal ? T220_lc1_cached : (T220_lc1_leftOrAbove ? x <= T220_lc1_borderX : x >= T220_lc1_borderX))
		&& (T220_lc2_horizontal ? T220_lc2_cached : (T220_lc2_leftOrAbove ? x <= T220_lc2_borderX : x >= T220_lc2_borderX))
		&& (T220_lc3_horizontal ? T220_lc3_cached : (T220_lc3_leftOrAbove ? x <= T220_lc3_borderX : x >= T220_lc3_borderX))
		) { r = T220_r; g = T220_g; b = T220_b; return true; } 

		if(T219_okay && x >= T219_minx && x <= T219_maxx
		&& (T219_lc1_horizontal ? T219_lc1_cached : (T219_lc1_leftOrAbove ? x <= T219_lc1_borderX : x >= T219_lc1_borderX))
		&& (T219_lc2_horizontal ? T219_lc2_cached : (T219_lc2_leftOrAbove ? x <= T219_lc2_borderX : x >= T219_lc2_borderX))
		&& (T219_lc3_horizontal ? T219_lc3_cached : (T219_lc3_leftOrAbove ? x <= T219_lc3_borderX : x >= T219_lc3_borderX))
		) { r = T219_r; g = T219_g; b = T219_b; return true; } 

		if(T218_okay && x >= T218_minx && x <= T218_maxx
		&& (T218_lc1_horizontal ? T218_lc1_cached : (T218_lc1_leftOrAbove ? x <= T218_lc1_borderX : x >= T218_lc1_borderX))
		&& (T218_lc2_horizontal ? T218_lc2_cached : (T218_lc2_leftOrAbove ? x <= T218_lc2_borderX : x >= T218_lc2_borderX))
		&& (T218_lc3_horizontal ? T218_lc3_cached : (T218_lc3_leftOrAbove ? x <= T218_lc3_borderX : x >= T218_lc3_borderX))
		) { r = T218_r; g = T218_g; b = T218_b; return true; } 

		if(T217_okay && x >= T217_minx && x <= T217_maxx
		&& (T217_lc1_horizontal ? T217_lc1_cached : (T217_lc1_leftOrAbove ? x <= T217_lc1_borderX : x >= T217_lc1_borderX))
		&& (T217_lc2_horizontal ? T217_lc2_cached : (T217_lc2_leftOrAbove ? x <= T217_lc2_borderX : x >= T217_lc2_borderX))
		&& (T217_lc3_horizontal ? T217_lc3_cached : (T217_lc3_leftOrAbove ? x <= T217_lc3_borderX : x >= T217_lc3_borderX))
		) { r = T217_r; g = T217_g; b = T217_b; return true; } 

		if(T216_okay && x >= T216_minx && x <= T216_maxx
		&& (T216_lc1_horizontal ? T216_lc1_cached : (T216_lc1_leftOrAbove ? x <= T216_lc1_borderX : x >= T216_lc1_borderX))
		&& (T216_lc2_horizontal ? T216_lc2_cached : (T216_lc2_leftOrAbove ? x <= T216_lc2_borderX : x >= T216_lc2_borderX))
		&& (T216_lc3_horizontal ? T216_lc3_cached : (T216_lc3_leftOrAbove ? x <= T216_lc3_borderX : x >= T216_lc3_borderX))
		) { r = T216_r; g = T216_g; b = T216_b; return true; } 

		if(T215_okay && x >= T215_minx && x <= T215_maxx
		&& (T215_lc1_horizontal ? T215_lc1_cached : (T215_lc1_leftOrAbove ? x <= T215_lc1_borderX : x >= T215_lc1_borderX))
		&& (T215_lc2_horizontal ? T215_lc2_cached : (T215_lc2_leftOrAbove ? x <= T215_lc2_borderX : x >= T215_lc2_borderX))
		&& (T215_lc3_horizontal ? T215_lc3_cached : (T215_lc3_leftOrAbove ? x <= T215_lc3_borderX : x >= T215_lc3_borderX))
		) { r = T215_r; g = T215_g; b = T215_b; return true; } 

		if(T214_okay && x >= T214_minx && x <= T214_maxx
		&& (T214_lc1_horizontal ? T214_lc1_cached : (T214_lc1_leftOrAbove ? x <= T214_lc1_borderX : x >= T214_lc1_borderX))
		&& (T214_lc2_horizontal ? T214_lc2_cached : (T214_lc2_leftOrAbove ? x <= T214_lc2_borderX : x >= T214_lc2_borderX))
		&& (T214_lc3_horizontal ? T214_lc3_cached : (T214_lc3_leftOrAbove ? x <= T214_lc3_borderX : x >= T214_lc3_borderX))
		) { r = T214_r; g = T214_g; b = T214_b; return true; } 

		if(T213_okay && x >= T213_minx && x <= T213_maxx
		&& (T213_lc1_horizontal ? T213_lc1_cached : (T213_lc1_leftOrAbove ? x <= T213_lc1_borderX : x >= T213_lc1_borderX))
		&& (T213_lc2_horizontal ? T213_lc2_cached : (T213_lc2_leftOrAbove ? x <= T213_lc2_borderX : x >= T213_lc2_borderX))
		&& (T213_lc3_horizontal ? T213_lc3_cached : (T213_lc3_leftOrAbove ? x <= T213_lc3_borderX : x >= T213_lc3_borderX))
		) { r = T213_r; g = T213_g; b = T213_b; return true; } 

		if(T212_okay && x >= T212_minx && x <= T212_maxx
		&& (T212_lc1_horizontal ? T212_lc1_cached : (T212_lc1_leftOrAbove ? x <= T212_lc1_borderX : x >= T212_lc1_borderX))
		&& (T212_lc2_horizontal ? T212_lc2_cached : (T212_lc2_leftOrAbove ? x <= T212_lc2_borderX : x >= T212_lc2_borderX))
		&& (T212_lc3_horizontal ? T212_lc3_cached : (T212_lc3_leftOrAbove ? x <= T212_lc3_borderX : x >= T212_lc3_borderX))
		) { r = T212_r; g = T212_g; b = T212_b; return true; } 

		if(T211_okay && x >= T211_minx && x <= T211_maxx
		&& (T211_lc1_horizontal ? T211_lc1_cached : (T211_lc1_leftOrAbove ? x <= T211_lc1_borderX : x >= T211_lc1_borderX))
		&& (T211_lc2_horizontal ? T211_lc2_cached : (T211_lc2_leftOrAbove ? x <= T211_lc2_borderX : x >= T211_lc2_borderX))
		&& (T211_lc3_horizontal ? T211_lc3_cached : (T211_lc3_leftOrAbove ? x <= T211_lc3_borderX : x >= T211_lc3_borderX))
		) { r = T211_r; g = T211_g; b = T211_b; return true; } 

		if(T210_okay && x >= T210_minx && x <= T210_maxx
		&& (T210_lc1_horizontal ? T210_lc1_cached : (T210_lc1_leftOrAbove ? x <= T210_lc1_borderX : x >= T210_lc1_borderX))
		&& (T210_lc2_horizontal ? T210_lc2_cached : (T210_lc2_leftOrAbove ? x <= T210_lc2_borderX : x >= T210_lc2_borderX))
		&& (T210_lc3_horizontal ? T210_lc3_cached : (T210_lc3_leftOrAbove ? x <= T210_lc3_borderX : x >= T210_lc3_borderX))
		) { r = T210_r; g = T210_g; b = T210_b; return true; } 

		return false;
	}

	private boolean drawPart4() {
		if(T209_okay && x >= T209_minx && x <= T209_maxx
		&& (T209_lc1_horizontal ? T209_lc1_cached : (T209_lc1_leftOrAbove ? x <= T209_lc1_borderX : x >= T209_lc1_borderX))
		&& (T209_lc2_horizontal ? T209_lc2_cached : (T209_lc2_leftOrAbove ? x <= T209_lc2_borderX : x >= T209_lc2_borderX))
		&& (T209_lc3_horizontal ? T209_lc3_cached : (T209_lc3_leftOrAbove ? x <= T209_lc3_borderX : x >= T209_lc3_borderX))
		) { r = T209_r; g = T209_g; b = T209_b; return true; } 

		if(T208_okay && x >= T208_minx && x <= T208_maxx
		&& (T208_lc1_horizontal ? T208_lc1_cached : (T208_lc1_leftOrAbove ? x <= T208_lc1_borderX : x >= T208_lc1_borderX))
		&& (T208_lc2_horizontal ? T208_lc2_cached : (T208_lc2_leftOrAbove ? x <= T208_lc2_borderX : x >= T208_lc2_borderX))
		&& (T208_lc3_horizontal ? T208_lc3_cached : (T208_lc3_leftOrAbove ? x <= T208_lc3_borderX : x >= T208_lc3_borderX))
		) { r = T208_r; g = T208_g; b = T208_b; return true; } 

		if(T207_okay && x >= T207_minx && x <= T207_maxx
		&& (T207_lc1_horizontal ? T207_lc1_cached : (T207_lc1_leftOrAbove ? x <= T207_lc1_borderX : x >= T207_lc1_borderX))
		&& (T207_lc2_horizontal ? T207_lc2_cached : (T207_lc2_leftOrAbove ? x <= T207_lc2_borderX : x >= T207_lc2_borderX))
		&& (T207_lc3_horizontal ? T207_lc3_cached : (T207_lc3_leftOrAbove ? x <= T207_lc3_borderX : x >= T207_lc3_borderX))
		) { r = T207_r; g = T207_g; b = T207_b; return true; } 

		if(T206_okay && x >= T206_minx && x <= T206_maxx
		&& (T206_lc1_horizontal ? T206_lc1_cached : (T206_lc1_leftOrAbove ? x <= T206_lc1_borderX : x >= T206_lc1_borderX))
		&& (T206_lc2_horizontal ? T206_lc2_cached : (T206_lc2_leftOrAbove ? x <= T206_lc2_borderX : x >= T206_lc2_borderX))
		&& (T206_lc3_horizontal ? T206_lc3_cached : (T206_lc3_leftOrAbove ? x <= T206_lc3_borderX : x >= T206_lc3_borderX))
		) { r = T206_r; g = T206_g; b = T206_b; return true; } 

		if(T205_okay && x >= T205_minx && x <= T205_maxx
		&& (T205_lc1_horizontal ? T205_lc1_cached : (T205_lc1_leftOrAbove ? x <= T205_lc1_borderX : x >= T205_lc1_borderX))
		&& (T205_lc2_horizontal ? T205_lc2_cached : (T205_lc2_leftOrAbove ? x <= T205_lc2_borderX : x >= T205_lc2_borderX))
		&& (T205_lc3_horizontal ? T205_lc3_cached : (T205_lc3_leftOrAbove ? x <= T205_lc3_borderX : x >= T205_lc3_borderX))
		) { r = T205_r; g = T205_g; b = T205_b; return true; } 

		if(T204_okay && x >= T204_minx && x <= T204_maxx
		&& (T204_lc1_horizontal ? T204_lc1_cached : (T204_lc1_leftOrAbove ? x <= T204_lc1_borderX : x >= T204_lc1_borderX))
		&& (T204_lc2_horizontal ? T204_lc2_cached : (T204_lc2_leftOrAbove ? x <= T204_lc2_borderX : x >= T204_lc2_borderX))
		&& (T204_lc3_horizontal ? T204_lc3_cached : (T204_lc3_leftOrAbove ? x <= T204_lc3_borderX : x >= T204_lc3_borderX))
		) { r = T204_r; g = T204_g; b = T204_b; return true; } 

		if(T203_okay && x >= T203_minx && x <= T203_maxx
		&& (T203_lc1_horizontal ? T203_lc1_cached : (T203_lc1_leftOrAbove ? x <= T203_lc1_borderX : x >= T203_lc1_borderX))
		&& (T203_lc2_horizontal ? T203_lc2_cached : (T203_lc2_leftOrAbove ? x <= T203_lc2_borderX : x >= T203_lc2_borderX))
		&& (T203_lc3_horizontal ? T203_lc3_cached : (T203_lc3_leftOrAbove ? x <= T203_lc3_borderX : x >= T203_lc3_borderX))
		) { r = T203_r; g = T203_g; b = T203_b; return true; } 

		if(T202_okay && x >= T202_minx && x <= T202_maxx
		&& (T202_lc1_horizontal ? T202_lc1_cached : (T202_lc1_leftOrAbove ? x <= T202_lc1_borderX : x >= T202_lc1_borderX))
		&& (T202_lc2_horizontal ? T202_lc2_cached : (T202_lc2_leftOrAbove ? x <= T202_lc2_borderX : x >= T202_lc2_borderX))
		&& (T202_lc3_horizontal ? T202_lc3_cached : (T202_lc3_leftOrAbove ? x <= T202_lc3_borderX : x >= T202_lc3_borderX))
		) { r = T202_r; g = T202_g; b = T202_b; return true; } 

		if(T201_okay && x >= T201_minx && x <= T201_maxx
		&& (T201_lc1_horizontal ? T201_lc1_cached : (T201_lc1_leftOrAbove ? x <= T201_lc1_borderX : x >= T201_lc1_borderX))
		&& (T201_lc2_horizontal ? T201_lc2_cached : (T201_lc2_leftOrAbove ? x <= T201_lc2_borderX : x >= T201_lc2_borderX))
		&& (T201_lc3_horizontal ? T201_lc3_cached : (T201_lc3_leftOrAbove ? x <= T201_lc3_borderX : x >= T201_lc3_borderX))
		) { r = T201_r; g = T201_g; b = T201_b; return true; } 

		if(T200_okay && x >= T200_minx && x <= T200_maxx
		&& (T200_lc1_horizontal ? T200_lc1_cached : (T200_lc1_leftOrAbove ? x <= T200_lc1_borderX : x >= T200_lc1_borderX))
		&& (T200_lc2_horizontal ? T200_lc2_cached : (T200_lc2_leftOrAbove ? x <= T200_lc2_borderX : x >= T200_lc2_borderX))
		&& (T200_lc3_horizontal ? T200_lc3_cached : (T200_lc3_leftOrAbove ? x <= T200_lc3_borderX : x >= T200_lc3_borderX))
		) { r = T200_r; g = T200_g; b = T200_b; return true; } 

		if(T199_okay && x >= T199_minx && x <= T199_maxx
		&& (T199_lc1_horizontal ? T199_lc1_cached : (T199_lc1_leftOrAbove ? x <= T199_lc1_borderX : x >= T199_lc1_borderX))
		&& (T199_lc2_horizontal ? T199_lc2_cached : (T199_lc2_leftOrAbove ? x <= T199_lc2_borderX : x >= T199_lc2_borderX))
		&& (T199_lc3_horizontal ? T199_lc3_cached : (T199_lc3_leftOrAbove ? x <= T199_lc3_borderX : x >= T199_lc3_borderX))
		) { r = T199_r; g = T199_g; b = T199_b; return true; } 

		if(T198_okay && x >= T198_minx && x <= T198_maxx
		&& (T198_lc1_horizontal ? T198_lc1_cached : (T198_lc1_leftOrAbove ? x <= T198_lc1_borderX : x >= T198_lc1_borderX))
		&& (T198_lc2_horizontal ? T198_lc2_cached : (T198_lc2_leftOrAbove ? x <= T198_lc2_borderX : x >= T198_lc2_borderX))
		&& (T198_lc3_horizontal ? T198_lc3_cached : (T198_lc3_leftOrAbove ? x <= T198_lc3_borderX : x >= T198_lc3_borderX))
		) { r = T198_r; g = T198_g; b = T198_b; return true; } 

		if(T197_okay && x >= T197_minx && x <= T197_maxx
		&& (T197_lc1_horizontal ? T197_lc1_cached : (T197_lc1_leftOrAbove ? x <= T197_lc1_borderX : x >= T197_lc1_borderX))
		&& (T197_lc2_horizontal ? T197_lc2_cached : (T197_lc2_leftOrAbove ? x <= T197_lc2_borderX : x >= T197_lc2_borderX))
		&& (T197_lc3_horizontal ? T197_lc3_cached : (T197_lc3_leftOrAbove ? x <= T197_lc3_borderX : x >= T197_lc3_borderX))
		) { r = T197_r; g = T197_g; b = T197_b; return true; } 

		if(T196_okay && x >= T196_minx && x <= T196_maxx
		&& (T196_lc1_horizontal ? T196_lc1_cached : (T196_lc1_leftOrAbove ? x <= T196_lc1_borderX : x >= T196_lc1_borderX))
		&& (T196_lc2_horizontal ? T196_lc2_cached : (T196_lc2_leftOrAbove ? x <= T196_lc2_borderX : x >= T196_lc2_borderX))
		&& (T196_lc3_horizontal ? T196_lc3_cached : (T196_lc3_leftOrAbove ? x <= T196_lc3_borderX : x >= T196_lc3_borderX))
		) { r = T196_r; g = T196_g; b = T196_b; return true; } 

		if(T195_okay && x >= T195_minx && x <= T195_maxx
		&& (T195_lc1_horizontal ? T195_lc1_cached : (T195_lc1_leftOrAbove ? x <= T195_lc1_borderX : x >= T195_lc1_borderX))
		&& (T195_lc2_horizontal ? T195_lc2_cached : (T195_lc2_leftOrAbove ? x <= T195_lc2_borderX : x >= T195_lc2_borderX))
		&& (T195_lc3_horizontal ? T195_lc3_cached : (T195_lc3_leftOrAbove ? x <= T195_lc3_borderX : x >= T195_lc3_borderX))
		) { r = T195_r; g = T195_g; b = T195_b; return true; } 

		if(T194_okay && x >= T194_minx && x <= T194_maxx
		&& (T194_lc1_horizontal ? T194_lc1_cached : (T194_lc1_leftOrAbove ? x <= T194_lc1_borderX : x >= T194_lc1_borderX))
		&& (T194_lc2_horizontal ? T194_lc2_cached : (T194_lc2_leftOrAbove ? x <= T194_lc2_borderX : x >= T194_lc2_borderX))
		&& (T194_lc3_horizontal ? T194_lc3_cached : (T194_lc3_leftOrAbove ? x <= T194_lc3_borderX : x >= T194_lc3_borderX))
		) { r = T194_r; g = T194_g; b = T194_b; return true; } 

		if(T193_okay && x >= T193_minx && x <= T193_maxx
		&& (T193_lc1_horizontal ? T193_lc1_cached : (T193_lc1_leftOrAbove ? x <= T193_lc1_borderX : x >= T193_lc1_borderX))
		&& (T193_lc2_horizontal ? T193_lc2_cached : (T193_lc2_leftOrAbove ? x <= T193_lc2_borderX : x >= T193_lc2_borderX))
		&& (T193_lc3_horizontal ? T193_lc3_cached : (T193_lc3_leftOrAbove ? x <= T193_lc3_borderX : x >= T193_lc3_borderX))
		) { r = T193_r; g = T193_g; b = T193_b; return true; } 

		if(T192_okay && x >= T192_minx && x <= T192_maxx
		&& (T192_lc1_horizontal ? T192_lc1_cached : (T192_lc1_leftOrAbove ? x <= T192_lc1_borderX : x >= T192_lc1_borderX))
		&& (T192_lc2_horizontal ? T192_lc2_cached : (T192_lc2_leftOrAbove ? x <= T192_lc2_borderX : x >= T192_lc2_borderX))
		&& (T192_lc3_horizontal ? T192_lc3_cached : (T192_lc3_leftOrAbove ? x <= T192_lc3_borderX : x >= T192_lc3_borderX))
		) { r = T192_r; g = T192_g; b = T192_b; return true; } 

		if(T191_okay && x >= T191_minx && x <= T191_maxx
		&& (T191_lc1_horizontal ? T191_lc1_cached : (T191_lc1_leftOrAbove ? x <= T191_lc1_borderX : x >= T191_lc1_borderX))
		&& (T191_lc2_horizontal ? T191_lc2_cached : (T191_lc2_leftOrAbove ? x <= T191_lc2_borderX : x >= T191_lc2_borderX))
		&& (T191_lc3_horizontal ? T191_lc3_cached : (T191_lc3_leftOrAbove ? x <= T191_lc3_borderX : x >= T191_lc3_borderX))
		) { r = T191_r; g = T191_g; b = T191_b; return true; } 

		if(T190_okay && x >= T190_minx && x <= T190_maxx
		&& (T190_lc1_horizontal ? T190_lc1_cached : (T190_lc1_leftOrAbove ? x <= T190_lc1_borderX : x >= T190_lc1_borderX))
		&& (T190_lc2_horizontal ? T190_lc2_cached : (T190_lc2_leftOrAbove ? x <= T190_lc2_borderX : x >= T190_lc2_borderX))
		&& (T190_lc3_horizontal ? T190_lc3_cached : (T190_lc3_leftOrAbove ? x <= T190_lc3_borderX : x >= T190_lc3_borderX))
		) { r = T190_r; g = T190_g; b = T190_b; return true; } 

		if(T189_okay && x >= T189_minx && x <= T189_maxx
		&& (T189_lc1_horizontal ? T189_lc1_cached : (T189_lc1_leftOrAbove ? x <= T189_lc1_borderX : x >= T189_lc1_borderX))
		&& (T189_lc2_horizontal ? T189_lc2_cached : (T189_lc2_leftOrAbove ? x <= T189_lc2_borderX : x >= T189_lc2_borderX))
		&& (T189_lc3_horizontal ? T189_lc3_cached : (T189_lc3_leftOrAbove ? x <= T189_lc3_borderX : x >= T189_lc3_borderX))
		) { r = T189_r; g = T189_g; b = T189_b; return true; } 

		if(T188_okay && x >= T188_minx && x <= T188_maxx
		&& (T188_lc1_horizontal ? T188_lc1_cached : (T188_lc1_leftOrAbove ? x <= T188_lc1_borderX : x >= T188_lc1_borderX))
		&& (T188_lc2_horizontal ? T188_lc2_cached : (T188_lc2_leftOrAbove ? x <= T188_lc2_borderX : x >= T188_lc2_borderX))
		&& (T188_lc3_horizontal ? T188_lc3_cached : (T188_lc3_leftOrAbove ? x <= T188_lc3_borderX : x >= T188_lc3_borderX))
		) { r = T188_r; g = T188_g; b = T188_b; return true; } 

		if(T187_okay && x >= T187_minx && x <= T187_maxx
		&& (T187_lc1_horizontal ? T187_lc1_cached : (T187_lc1_leftOrAbove ? x <= T187_lc1_borderX : x >= T187_lc1_borderX))
		&& (T187_lc2_horizontal ? T187_lc2_cached : (T187_lc2_leftOrAbove ? x <= T187_lc2_borderX : x >= T187_lc2_borderX))
		&& (T187_lc3_horizontal ? T187_lc3_cached : (T187_lc3_leftOrAbove ? x <= T187_lc3_borderX : x >= T187_lc3_borderX))
		) { r = T187_r; g = T187_g; b = T187_b; return true; } 

		if(T186_okay && x >= T186_minx && x <= T186_maxx
		&& (T186_lc1_horizontal ? T186_lc1_cached : (T186_lc1_leftOrAbove ? x <= T186_lc1_borderX : x >= T186_lc1_borderX))
		&& (T186_lc2_horizontal ? T186_lc2_cached : (T186_lc2_leftOrAbove ? x <= T186_lc2_borderX : x >= T186_lc2_borderX))
		&& (T186_lc3_horizontal ? T186_lc3_cached : (T186_lc3_leftOrAbove ? x <= T186_lc3_borderX : x >= T186_lc3_borderX))
		) { r = T186_r; g = T186_g; b = T186_b; return true; } 

		if(T185_okay && x >= T185_minx && x <= T185_maxx
		&& (T185_lc1_horizontal ? T185_lc1_cached : (T185_lc1_leftOrAbove ? x <= T185_lc1_borderX : x >= T185_lc1_borderX))
		&& (T185_lc2_horizontal ? T185_lc2_cached : (T185_lc2_leftOrAbove ? x <= T185_lc2_borderX : x >= T185_lc2_borderX))
		&& (T185_lc3_horizontal ? T185_lc3_cached : (T185_lc3_leftOrAbove ? x <= T185_lc3_borderX : x >= T185_lc3_borderX))
		) { r = T185_r; g = T185_g; b = T185_b; return true; } 

		if(T184_okay && x >= T184_minx && x <= T184_maxx
		&& (T184_lc1_horizontal ? T184_lc1_cached : (T184_lc1_leftOrAbove ? x <= T184_lc1_borderX : x >= T184_lc1_borderX))
		&& (T184_lc2_horizontal ? T184_lc2_cached : (T184_lc2_leftOrAbove ? x <= T184_lc2_borderX : x >= T184_lc2_borderX))
		&& (T184_lc3_horizontal ? T184_lc3_cached : (T184_lc3_leftOrAbove ? x <= T184_lc3_borderX : x >= T184_lc3_borderX))
		) { r = T184_r; g = T184_g; b = T184_b; return true; } 

		if(T183_okay && x >= T183_minx && x <= T183_maxx
		&& (T183_lc1_horizontal ? T183_lc1_cached : (T183_lc1_leftOrAbove ? x <= T183_lc1_borderX : x >= T183_lc1_borderX))
		&& (T183_lc2_horizontal ? T183_lc2_cached : (T183_lc2_leftOrAbove ? x <= T183_lc2_borderX : x >= T183_lc2_borderX))
		&& (T183_lc3_horizontal ? T183_lc3_cached : (T183_lc3_leftOrAbove ? x <= T183_lc3_borderX : x >= T183_lc3_borderX))
		) { r = T183_r; g = T183_g; b = T183_b; return true; } 

		if(T182_okay && x >= T182_minx && x <= T182_maxx
		&& (T182_lc1_horizontal ? T182_lc1_cached : (T182_lc1_leftOrAbove ? x <= T182_lc1_borderX : x >= T182_lc1_borderX))
		&& (T182_lc2_horizontal ? T182_lc2_cached : (T182_lc2_leftOrAbove ? x <= T182_lc2_borderX : x >= T182_lc2_borderX))
		&& (T182_lc3_horizontal ? T182_lc3_cached : (T182_lc3_leftOrAbove ? x <= T182_lc3_borderX : x >= T182_lc3_borderX))
		) { r = T182_r; g = T182_g; b = T182_b; return true; } 

		if(T181_okay && x >= T181_minx && x <= T181_maxx
		&& (T181_lc1_horizontal ? T181_lc1_cached : (T181_lc1_leftOrAbove ? x <= T181_lc1_borderX : x >= T181_lc1_borderX))
		&& (T181_lc2_horizontal ? T181_lc2_cached : (T181_lc2_leftOrAbove ? x <= T181_lc2_borderX : x >= T181_lc2_borderX))
		&& (T181_lc3_horizontal ? T181_lc3_cached : (T181_lc3_leftOrAbove ? x <= T181_lc3_borderX : x >= T181_lc3_borderX))
		) { r = T181_r; g = T181_g; b = T181_b; return true; } 

		if(T180_okay && x >= T180_minx && x <= T180_maxx
		&& (T180_lc1_horizontal ? T180_lc1_cached : (T180_lc1_leftOrAbove ? x <= T180_lc1_borderX : x >= T180_lc1_borderX))
		&& (T180_lc2_horizontal ? T180_lc2_cached : (T180_lc2_leftOrAbove ? x <= T180_lc2_borderX : x >= T180_lc2_borderX))
		&& (T180_lc3_horizontal ? T180_lc3_cached : (T180_lc3_leftOrAbove ? x <= T180_lc3_borderX : x >= T180_lc3_borderX))
		) { r = T180_r; g = T180_g; b = T180_b; return true; } 

		return false;
	}

	private boolean drawPart5() {
		if(T179_okay && x >= T179_minx && x <= T179_maxx
		&& (T179_lc1_horizontal ? T179_lc1_cached : (T179_lc1_leftOrAbove ? x <= T179_lc1_borderX : x >= T179_lc1_borderX))
		&& (T179_lc2_horizontal ? T179_lc2_cached : (T179_lc2_leftOrAbove ? x <= T179_lc2_borderX : x >= T179_lc2_borderX))
		&& (T179_lc3_horizontal ? T179_lc3_cached : (T179_lc3_leftOrAbove ? x <= T179_lc3_borderX : x >= T179_lc3_borderX))
		) { r = T179_r; g = T179_g; b = T179_b; return true; } 

		if(T178_okay && x >= T178_minx && x <= T178_maxx
		&& (T178_lc1_horizontal ? T178_lc1_cached : (T178_lc1_leftOrAbove ? x <= T178_lc1_borderX : x >= T178_lc1_borderX))
		&& (T178_lc2_horizontal ? T178_lc2_cached : (T178_lc2_leftOrAbove ? x <= T178_lc2_borderX : x >= T178_lc2_borderX))
		&& (T178_lc3_horizontal ? T178_lc3_cached : (T178_lc3_leftOrAbove ? x <= T178_lc3_borderX : x >= T178_lc3_borderX))
		) { r = T178_r; g = T178_g; b = T178_b; return true; } 

		if(T177_okay && x >= T177_minx && x <= T177_maxx
		&& (T177_lc1_horizontal ? T177_lc1_cached : (T177_lc1_leftOrAbove ? x <= T177_lc1_borderX : x >= T177_lc1_borderX))
		&& (T177_lc2_horizontal ? T177_lc2_cached : (T177_lc2_leftOrAbove ? x <= T177_lc2_borderX : x >= T177_lc2_borderX))
		&& (T177_lc3_horizontal ? T177_lc3_cached : (T177_lc3_leftOrAbove ? x <= T177_lc3_borderX : x >= T177_lc3_borderX))
		) { r = T177_r; g = T177_g; b = T177_b; return true; } 

		if(T176_okay && x >= T176_minx && x <= T176_maxx
		&& (T176_lc1_horizontal ? T176_lc1_cached : (T176_lc1_leftOrAbove ? x <= T176_lc1_borderX : x >= T176_lc1_borderX))
		&& (T176_lc2_horizontal ? T176_lc2_cached : (T176_lc2_leftOrAbove ? x <= T176_lc2_borderX : x >= T176_lc2_borderX))
		&& (T176_lc3_horizontal ? T176_lc3_cached : (T176_lc3_leftOrAbove ? x <= T176_lc3_borderX : x >= T176_lc3_borderX))
		) { r = T176_r; g = T176_g; b = T176_b; return true; } 

		if(T175_okay && x >= T175_minx && x <= T175_maxx
		&& (T175_lc1_horizontal ? T175_lc1_cached : (T175_lc1_leftOrAbove ? x <= T175_lc1_borderX : x >= T175_lc1_borderX))
		&& (T175_lc2_horizontal ? T175_lc2_cached : (T175_lc2_leftOrAbove ? x <= T175_lc2_borderX : x >= T175_lc2_borderX))
		&& (T175_lc3_horizontal ? T175_lc3_cached : (T175_lc3_leftOrAbove ? x <= T175_lc3_borderX : x >= T175_lc3_borderX))
		) { r = T175_r; g = T175_g; b = T175_b; return true; } 

		if(T174_okay && x >= T174_minx && x <= T174_maxx
		&& (T174_lc1_horizontal ? T174_lc1_cached : (T174_lc1_leftOrAbove ? x <= T174_lc1_borderX : x >= T174_lc1_borderX))
		&& (T174_lc2_horizontal ? T174_lc2_cached : (T174_lc2_leftOrAbove ? x <= T174_lc2_borderX : x >= T174_lc2_borderX))
		&& (T174_lc3_horizontal ? T174_lc3_cached : (T174_lc3_leftOrAbove ? x <= T174_lc3_borderX : x >= T174_lc3_borderX))
		) { r = T174_r; g = T174_g; b = T174_b; return true; } 

		if(T173_okay && x >= T173_minx && x <= T173_maxx
		&& (T173_lc1_horizontal ? T173_lc1_cached : (T173_lc1_leftOrAbove ? x <= T173_lc1_borderX : x >= T173_lc1_borderX))
		&& (T173_lc2_horizontal ? T173_lc2_cached : (T173_lc2_leftOrAbove ? x <= T173_lc2_borderX : x >= T173_lc2_borderX))
		&& (T173_lc3_horizontal ? T173_lc3_cached : (T173_lc3_leftOrAbove ? x <= T173_lc3_borderX : x >= T173_lc3_borderX))
		) { r = T173_r; g = T173_g; b = T173_b; return true; } 

		if(T172_okay && x >= T172_minx && x <= T172_maxx
		&& (T172_lc1_horizontal ? T172_lc1_cached : (T172_lc1_leftOrAbove ? x <= T172_lc1_borderX : x >= T172_lc1_borderX))
		&& (T172_lc2_horizontal ? T172_lc2_cached : (T172_lc2_leftOrAbove ? x <= T172_lc2_borderX : x >= T172_lc2_borderX))
		&& (T172_lc3_horizontal ? T172_lc3_cached : (T172_lc3_leftOrAbove ? x <= T172_lc3_borderX : x >= T172_lc3_borderX))
		) { r = T172_r; g = T172_g; b = T172_b; return true; } 

		if(T171_okay && x >= T171_minx && x <= T171_maxx
		&& (T171_lc1_horizontal ? T171_lc1_cached : (T171_lc1_leftOrAbove ? x <= T171_lc1_borderX : x >= T171_lc1_borderX))
		&& (T171_lc2_horizontal ? T171_lc2_cached : (T171_lc2_leftOrAbove ? x <= T171_lc2_borderX : x >= T171_lc2_borderX))
		&& (T171_lc3_horizontal ? T171_lc3_cached : (T171_lc3_leftOrAbove ? x <= T171_lc3_borderX : x >= T171_lc3_borderX))
		) { r = T171_r; g = T171_g; b = T171_b; return true; } 

		if(T170_okay && x >= T170_minx && x <= T170_maxx
		&& (T170_lc1_horizontal ? T170_lc1_cached : (T170_lc1_leftOrAbove ? x <= T170_lc1_borderX : x >= T170_lc1_borderX))
		&& (T170_lc2_horizontal ? T170_lc2_cached : (T170_lc2_leftOrAbove ? x <= T170_lc2_borderX : x >= T170_lc2_borderX))
		&& (T170_lc3_horizontal ? T170_lc3_cached : (T170_lc3_leftOrAbove ? x <= T170_lc3_borderX : x >= T170_lc3_borderX))
		) { r = T170_r; g = T170_g; b = T170_b; return true; } 

		if(T169_okay && x >= T169_minx && x <= T169_maxx
		&& (T169_lc1_horizontal ? T169_lc1_cached : (T169_lc1_leftOrAbove ? x <= T169_lc1_borderX : x >= T169_lc1_borderX))
		&& (T169_lc2_horizontal ? T169_lc2_cached : (T169_lc2_leftOrAbove ? x <= T169_lc2_borderX : x >= T169_lc2_borderX))
		&& (T169_lc3_horizontal ? T169_lc3_cached : (T169_lc3_leftOrAbove ? x <= T169_lc3_borderX : x >= T169_lc3_borderX))
		) { r = T169_r; g = T169_g; b = T169_b; return true; } 

		if(T168_okay && x >= T168_minx && x <= T168_maxx
		&& (T168_lc1_horizontal ? T168_lc1_cached : (T168_lc1_leftOrAbove ? x <= T168_lc1_borderX : x >= T168_lc1_borderX))
		&& (T168_lc2_horizontal ? T168_lc2_cached : (T168_lc2_leftOrAbove ? x <= T168_lc2_borderX : x >= T168_lc2_borderX))
		&& (T168_lc3_horizontal ? T168_lc3_cached : (T168_lc3_leftOrAbove ? x <= T168_lc3_borderX : x >= T168_lc3_borderX))
		) { r = T168_r; g = T168_g; b = T168_b; return true; } 

		if(T167_okay && x >= T167_minx && x <= T167_maxx
		&& (T167_lc1_horizontal ? T167_lc1_cached : (T167_lc1_leftOrAbove ? x <= T167_lc1_borderX : x >= T167_lc1_borderX))
		&& (T167_lc2_horizontal ? T167_lc2_cached : (T167_lc2_leftOrAbove ? x <= T167_lc2_borderX : x >= T167_lc2_borderX))
		&& (T167_lc3_horizontal ? T167_lc3_cached : (T167_lc3_leftOrAbove ? x <= T167_lc3_borderX : x >= T167_lc3_borderX))
		) { r = T167_r; g = T167_g; b = T167_b; return true; } 

		if(T166_okay && x >= T166_minx && x <= T166_maxx
		&& (T166_lc1_horizontal ? T166_lc1_cached : (T166_lc1_leftOrAbove ? x <= T166_lc1_borderX : x >= T166_lc1_borderX))
		&& (T166_lc2_horizontal ? T166_lc2_cached : (T166_lc2_leftOrAbove ? x <= T166_lc2_borderX : x >= T166_lc2_borderX))
		&& (T166_lc3_horizontal ? T166_lc3_cached : (T166_lc3_leftOrAbove ? x <= T166_lc3_borderX : x >= T166_lc3_borderX))
		) { r = T166_r; g = T166_g; b = T166_b; return true; } 

		if(T165_okay && x >= T165_minx && x <= T165_maxx
		&& (T165_lc1_horizontal ? T165_lc1_cached : (T165_lc1_leftOrAbove ? x <= T165_lc1_borderX : x >= T165_lc1_borderX))
		&& (T165_lc2_horizontal ? T165_lc2_cached : (T165_lc2_leftOrAbove ? x <= T165_lc2_borderX : x >= T165_lc2_borderX))
		&& (T165_lc3_horizontal ? T165_lc3_cached : (T165_lc3_leftOrAbove ? x <= T165_lc3_borderX : x >= T165_lc3_borderX))
		) { r = T165_r; g = T165_g; b = T165_b; return true; } 

		if(T164_okay && x >= T164_minx && x <= T164_maxx
		&& (T164_lc1_horizontal ? T164_lc1_cached : (T164_lc1_leftOrAbove ? x <= T164_lc1_borderX : x >= T164_lc1_borderX))
		&& (T164_lc2_horizontal ? T164_lc2_cached : (T164_lc2_leftOrAbove ? x <= T164_lc2_borderX : x >= T164_lc2_borderX))
		&& (T164_lc3_horizontal ? T164_lc3_cached : (T164_lc3_leftOrAbove ? x <= T164_lc3_borderX : x >= T164_lc3_borderX))
		) { r = T164_r; g = T164_g; b = T164_b; return true; } 

		if(T163_okay && x >= T163_minx && x <= T163_maxx
		&& (T163_lc1_horizontal ? T163_lc1_cached : (T163_lc1_leftOrAbove ? x <= T163_lc1_borderX : x >= T163_lc1_borderX))
		&& (T163_lc2_horizontal ? T163_lc2_cached : (T163_lc2_leftOrAbove ? x <= T163_lc2_borderX : x >= T163_lc2_borderX))
		&& (T163_lc3_horizontal ? T163_lc3_cached : (T163_lc3_leftOrAbove ? x <= T163_lc3_borderX : x >= T163_lc3_borderX))
		) { r = T163_r; g = T163_g; b = T163_b; return true; } 

		if(T162_okay && x >= T162_minx && x <= T162_maxx
		&& (T162_lc1_horizontal ? T162_lc1_cached : (T162_lc1_leftOrAbove ? x <= T162_lc1_borderX : x >= T162_lc1_borderX))
		&& (T162_lc2_horizontal ? T162_lc2_cached : (T162_lc2_leftOrAbove ? x <= T162_lc2_borderX : x >= T162_lc2_borderX))
		&& (T162_lc3_horizontal ? T162_lc3_cached : (T162_lc3_leftOrAbove ? x <= T162_lc3_borderX : x >= T162_lc3_borderX))
		) { r = T162_r; g = T162_g; b = T162_b; return true; } 

		if(T161_okay && x >= T161_minx && x <= T161_maxx
		&& (T161_lc1_horizontal ? T161_lc1_cached : (T161_lc1_leftOrAbove ? x <= T161_lc1_borderX : x >= T161_lc1_borderX))
		&& (T161_lc2_horizontal ? T161_lc2_cached : (T161_lc2_leftOrAbove ? x <= T161_lc2_borderX : x >= T161_lc2_borderX))
		&& (T161_lc3_horizontal ? T161_lc3_cached : (T161_lc3_leftOrAbove ? x <= T161_lc3_borderX : x >= T161_lc3_borderX))
		) { r = T161_r; g = T161_g; b = T161_b; return true; } 

		if(T160_okay && x >= T160_minx && x <= T160_maxx
		&& (T160_lc1_horizontal ? T160_lc1_cached : (T160_lc1_leftOrAbove ? x <= T160_lc1_borderX : x >= T160_lc1_borderX))
		&& (T160_lc2_horizontal ? T160_lc2_cached : (T160_lc2_leftOrAbove ? x <= T160_lc2_borderX : x >= T160_lc2_borderX))
		&& (T160_lc3_horizontal ? T160_lc3_cached : (T160_lc3_leftOrAbove ? x <= T160_lc3_borderX : x >= T160_lc3_borderX))
		) { r = T160_r; g = T160_g; b = T160_b; return true; } 

		if(T159_okay && x >= T159_minx && x <= T159_maxx
		&& (T159_lc1_horizontal ? T159_lc1_cached : (T159_lc1_leftOrAbove ? x <= T159_lc1_borderX : x >= T159_lc1_borderX))
		&& (T159_lc2_horizontal ? T159_lc2_cached : (T159_lc2_leftOrAbove ? x <= T159_lc2_borderX : x >= T159_lc2_borderX))
		&& (T159_lc3_horizontal ? T159_lc3_cached : (T159_lc3_leftOrAbove ? x <= T159_lc3_borderX : x >= T159_lc3_borderX))
		) { r = T159_r; g = T159_g; b = T159_b; return true; } 

		if(T158_okay && x >= T158_minx && x <= T158_maxx
		&& (T158_lc1_horizontal ? T158_lc1_cached : (T158_lc1_leftOrAbove ? x <= T158_lc1_borderX : x >= T158_lc1_borderX))
		&& (T158_lc2_horizontal ? T158_lc2_cached : (T158_lc2_leftOrAbove ? x <= T158_lc2_borderX : x >= T158_lc2_borderX))
		&& (T158_lc3_horizontal ? T158_lc3_cached : (T158_lc3_leftOrAbove ? x <= T158_lc3_borderX : x >= T158_lc3_borderX))
		) { r = T158_r; g = T158_g; b = T158_b; return true; } 

		if(T157_okay && x >= T157_minx && x <= T157_maxx
		&& (T157_lc1_horizontal ? T157_lc1_cached : (T157_lc1_leftOrAbove ? x <= T157_lc1_borderX : x >= T157_lc1_borderX))
		&& (T157_lc2_horizontal ? T157_lc2_cached : (T157_lc2_leftOrAbove ? x <= T157_lc2_borderX : x >= T157_lc2_borderX))
		&& (T157_lc3_horizontal ? T157_lc3_cached : (T157_lc3_leftOrAbove ? x <= T157_lc3_borderX : x >= T157_lc3_borderX))
		) { r = T157_r; g = T157_g; b = T157_b; return true; } 

		if(T156_okay && x >= T156_minx && x <= T156_maxx
		&& (T156_lc1_horizontal ? T156_lc1_cached : (T156_lc1_leftOrAbove ? x <= T156_lc1_borderX : x >= T156_lc1_borderX))
		&& (T156_lc2_horizontal ? T156_lc2_cached : (T156_lc2_leftOrAbove ? x <= T156_lc2_borderX : x >= T156_lc2_borderX))
		&& (T156_lc3_horizontal ? T156_lc3_cached : (T156_lc3_leftOrAbove ? x <= T156_lc3_borderX : x >= T156_lc3_borderX))
		) { r = T156_r; g = T156_g; b = T156_b; return true; } 

		if(T155_okay && x >= T155_minx && x <= T155_maxx
		&& (T155_lc1_horizontal ? T155_lc1_cached : (T155_lc1_leftOrAbove ? x <= T155_lc1_borderX : x >= T155_lc1_borderX))
		&& (T155_lc2_horizontal ? T155_lc2_cached : (T155_lc2_leftOrAbove ? x <= T155_lc2_borderX : x >= T155_lc2_borderX))
		&& (T155_lc3_horizontal ? T155_lc3_cached : (T155_lc3_leftOrAbove ? x <= T155_lc3_borderX : x >= T155_lc3_borderX))
		) { r = T155_r; g = T155_g; b = T155_b; return true; } 

		if(T154_okay && x >= T154_minx && x <= T154_maxx
		&& (T154_lc1_horizontal ? T154_lc1_cached : (T154_lc1_leftOrAbove ? x <= T154_lc1_borderX : x >= T154_lc1_borderX))
		&& (T154_lc2_horizontal ? T154_lc2_cached : (T154_lc2_leftOrAbove ? x <= T154_lc2_borderX : x >= T154_lc2_borderX))
		&& (T154_lc3_horizontal ? T154_lc3_cached : (T154_lc3_leftOrAbove ? x <= T154_lc3_borderX : x >= T154_lc3_borderX))
		) { r = T154_r; g = T154_g; b = T154_b; return true; } 

		if(T153_okay && x >= T153_minx && x <= T153_maxx
		&& (T153_lc1_horizontal ? T153_lc1_cached : (T153_lc1_leftOrAbove ? x <= T153_lc1_borderX : x >= T153_lc1_borderX))
		&& (T153_lc2_horizontal ? T153_lc2_cached : (T153_lc2_leftOrAbove ? x <= T153_lc2_borderX : x >= T153_lc2_borderX))
		&& (T153_lc3_horizontal ? T153_lc3_cached : (T153_lc3_leftOrAbove ? x <= T153_lc3_borderX : x >= T153_lc3_borderX))
		) { r = T153_r; g = T153_g; b = T153_b; return true; } 

		if(T152_okay && x >= T152_minx && x <= T152_maxx
		&& (T152_lc1_horizontal ? T152_lc1_cached : (T152_lc1_leftOrAbove ? x <= T152_lc1_borderX : x >= T152_lc1_borderX))
		&& (T152_lc2_horizontal ? T152_lc2_cached : (T152_lc2_leftOrAbove ? x <= T152_lc2_borderX : x >= T152_lc2_borderX))
		&& (T152_lc3_horizontal ? T152_lc3_cached : (T152_lc3_leftOrAbove ? x <= T152_lc3_borderX : x >= T152_lc3_borderX))
		) { r = T152_r; g = T152_g; b = T152_b; return true; } 

		if(T151_okay && x >= T151_minx && x <= T151_maxx
		&& (T151_lc1_horizontal ? T151_lc1_cached : (T151_lc1_leftOrAbove ? x <= T151_lc1_borderX : x >= T151_lc1_borderX))
		&& (T151_lc2_horizontal ? T151_lc2_cached : (T151_lc2_leftOrAbove ? x <= T151_lc2_borderX : x >= T151_lc2_borderX))
		&& (T151_lc3_horizontal ? T151_lc3_cached : (T151_lc3_leftOrAbove ? x <= T151_lc3_borderX : x >= T151_lc3_borderX))
		) { r = T151_r; g = T151_g; b = T151_b; return true; } 

		if(T150_okay && x >= T150_minx && x <= T150_maxx
		&& (T150_lc1_horizontal ? T150_lc1_cached : (T150_lc1_leftOrAbove ? x <= T150_lc1_borderX : x >= T150_lc1_borderX))
		&& (T150_lc2_horizontal ? T150_lc2_cached : (T150_lc2_leftOrAbove ? x <= T150_lc2_borderX : x >= T150_lc2_borderX))
		&& (T150_lc3_horizontal ? T150_lc3_cached : (T150_lc3_leftOrAbove ? x <= T150_lc3_borderX : x >= T150_lc3_borderX))
		) { r = T150_r; g = T150_g; b = T150_b; return true; } 

		return false;
	}

	private boolean drawPart6() {
		if(T149_okay && x >= T149_minx && x <= T149_maxx
		&& (T149_lc1_horizontal ? T149_lc1_cached : (T149_lc1_leftOrAbove ? x <= T149_lc1_borderX : x >= T149_lc1_borderX))
		&& (T149_lc2_horizontal ? T149_lc2_cached : (T149_lc2_leftOrAbove ? x <= T149_lc2_borderX : x >= T149_lc2_borderX))
		&& (T149_lc3_horizontal ? T149_lc3_cached : (T149_lc3_leftOrAbove ? x <= T149_lc3_borderX : x >= T149_lc3_borderX))
		) { r = T149_r; g = T149_g; b = T149_b; return true; } 

		if(T148_okay && x >= T148_minx && x <= T148_maxx
		&& (T148_lc1_horizontal ? T148_lc1_cached : (T148_lc1_leftOrAbove ? x <= T148_lc1_borderX : x >= T148_lc1_borderX))
		&& (T148_lc2_horizontal ? T148_lc2_cached : (T148_lc2_leftOrAbove ? x <= T148_lc2_borderX : x >= T148_lc2_borderX))
		&& (T148_lc3_horizontal ? T148_lc3_cached : (T148_lc3_leftOrAbove ? x <= T148_lc3_borderX : x >= T148_lc3_borderX))
		) { r = T148_r; g = T148_g; b = T148_b; return true; } 

		if(T147_okay && x >= T147_minx && x <= T147_maxx
		&& (T147_lc1_horizontal ? T147_lc1_cached : (T147_lc1_leftOrAbove ? x <= T147_lc1_borderX : x >= T147_lc1_borderX))
		&& (T147_lc2_horizontal ? T147_lc2_cached : (T147_lc2_leftOrAbove ? x <= T147_lc2_borderX : x >= T147_lc2_borderX))
		&& (T147_lc3_horizontal ? T147_lc3_cached : (T147_lc3_leftOrAbove ? x <= T147_lc3_borderX : x >= T147_lc3_borderX))
		) { r = T147_r; g = T147_g; b = T147_b; return true; } 

		if(T146_okay && x >= T146_minx && x <= T146_maxx
		&& (T146_lc1_horizontal ? T146_lc1_cached : (T146_lc1_leftOrAbove ? x <= T146_lc1_borderX : x >= T146_lc1_borderX))
		&& (T146_lc2_horizontal ? T146_lc2_cached : (T146_lc2_leftOrAbove ? x <= T146_lc2_borderX : x >= T146_lc2_borderX))
		&& (T146_lc3_horizontal ? T146_lc3_cached : (T146_lc3_leftOrAbove ? x <= T146_lc3_borderX : x >= T146_lc3_borderX))
		) { r = T146_r; g = T146_g; b = T146_b; return true; } 

		if(T145_okay && x >= T145_minx && x <= T145_maxx
		&& (T145_lc1_horizontal ? T145_lc1_cached : (T145_lc1_leftOrAbove ? x <= T145_lc1_borderX : x >= T145_lc1_borderX))
		&& (T145_lc2_horizontal ? T145_lc2_cached : (T145_lc2_leftOrAbove ? x <= T145_lc2_borderX : x >= T145_lc2_borderX))
		&& (T145_lc3_horizontal ? T145_lc3_cached : (T145_lc3_leftOrAbove ? x <= T145_lc3_borderX : x >= T145_lc3_borderX))
		) { r = T145_r; g = T145_g; b = T145_b; return true; } 

		if(T144_okay && x >= T144_minx && x <= T144_maxx
		&& (T144_lc1_horizontal ? T144_lc1_cached : (T144_lc1_leftOrAbove ? x <= T144_lc1_borderX : x >= T144_lc1_borderX))
		&& (T144_lc2_horizontal ? T144_lc2_cached : (T144_lc2_leftOrAbove ? x <= T144_lc2_borderX : x >= T144_lc2_borderX))
		&& (T144_lc3_horizontal ? T144_lc3_cached : (T144_lc3_leftOrAbove ? x <= T144_lc3_borderX : x >= T144_lc3_borderX))
		) { r = T144_r; g = T144_g; b = T144_b; return true; } 

		if(T143_okay && x >= T143_minx && x <= T143_maxx
		&& (T143_lc1_horizontal ? T143_lc1_cached : (T143_lc1_leftOrAbove ? x <= T143_lc1_borderX : x >= T143_lc1_borderX))
		&& (T143_lc2_horizontal ? T143_lc2_cached : (T143_lc2_leftOrAbove ? x <= T143_lc2_borderX : x >= T143_lc2_borderX))
		&& (T143_lc3_horizontal ? T143_lc3_cached : (T143_lc3_leftOrAbove ? x <= T143_lc3_borderX : x >= T143_lc3_borderX))
		) { r = T143_r; g = T143_g; b = T143_b; return true; } 

		if(T142_okay && x >= T142_minx && x <= T142_maxx
		&& (T142_lc1_horizontal ? T142_lc1_cached : (T142_lc1_leftOrAbove ? x <= T142_lc1_borderX : x >= T142_lc1_borderX))
		&& (T142_lc2_horizontal ? T142_lc2_cached : (T142_lc2_leftOrAbove ? x <= T142_lc2_borderX : x >= T142_lc2_borderX))
		&& (T142_lc3_horizontal ? T142_lc3_cached : (T142_lc3_leftOrAbove ? x <= T142_lc3_borderX : x >= T142_lc3_borderX))
		) { r = T142_r; g = T142_g; b = T142_b; return true; } 

		if(T141_okay && x >= T141_minx && x <= T141_maxx
		&& (T141_lc1_horizontal ? T141_lc1_cached : (T141_lc1_leftOrAbove ? x <= T141_lc1_borderX : x >= T141_lc1_borderX))
		&& (T141_lc2_horizontal ? T141_lc2_cached : (T141_lc2_leftOrAbove ? x <= T141_lc2_borderX : x >= T141_lc2_borderX))
		&& (T141_lc3_horizontal ? T141_lc3_cached : (T141_lc3_leftOrAbove ? x <= T141_lc3_borderX : x >= T141_lc3_borderX))
		) { r = T141_r; g = T141_g; b = T141_b; return true; } 

		if(T140_okay && x >= T140_minx && x <= T140_maxx
		&& (T140_lc1_horizontal ? T140_lc1_cached : (T140_lc1_leftOrAbove ? x <= T140_lc1_borderX : x >= T140_lc1_borderX))
		&& (T140_lc2_horizontal ? T140_lc2_cached : (T140_lc2_leftOrAbove ? x <= T140_lc2_borderX : x >= T140_lc2_borderX))
		&& (T140_lc3_horizontal ? T140_lc3_cached : (T140_lc3_leftOrAbove ? x <= T140_lc3_borderX : x >= T140_lc3_borderX))
		) { r = T140_r; g = T140_g; b = T140_b; return true; } 

		if(T139_okay && x >= T139_minx && x <= T139_maxx
		&& (T139_lc1_horizontal ? T139_lc1_cached : (T139_lc1_leftOrAbove ? x <= T139_lc1_borderX : x >= T139_lc1_borderX))
		&& (T139_lc2_horizontal ? T139_lc2_cached : (T139_lc2_leftOrAbove ? x <= T139_lc2_borderX : x >= T139_lc2_borderX))
		&& (T139_lc3_horizontal ? T139_lc3_cached : (T139_lc3_leftOrAbove ? x <= T139_lc3_borderX : x >= T139_lc3_borderX))
		) { r = T139_r; g = T139_g; b = T139_b; return true; } 

		if(T138_okay && x >= T138_minx && x <= T138_maxx
		&& (T138_lc1_horizontal ? T138_lc1_cached : (T138_lc1_leftOrAbove ? x <= T138_lc1_borderX : x >= T138_lc1_borderX))
		&& (T138_lc2_horizontal ? T138_lc2_cached : (T138_lc2_leftOrAbove ? x <= T138_lc2_borderX : x >= T138_lc2_borderX))
		&& (T138_lc3_horizontal ? T138_lc3_cached : (T138_lc3_leftOrAbove ? x <= T138_lc3_borderX : x >= T138_lc3_borderX))
		) { r = T138_r; g = T138_g; b = T138_b; return true; } 

		if(T137_okay && x >= T137_minx && x <= T137_maxx
		&& (T137_lc1_horizontal ? T137_lc1_cached : (T137_lc1_leftOrAbove ? x <= T137_lc1_borderX : x >= T137_lc1_borderX))
		&& (T137_lc2_horizontal ? T137_lc2_cached : (T137_lc2_leftOrAbove ? x <= T137_lc2_borderX : x >= T137_lc2_borderX))
		&& (T137_lc3_horizontal ? T137_lc3_cached : (T137_lc3_leftOrAbove ? x <= T137_lc3_borderX : x >= T137_lc3_borderX))
		) { r = T137_r; g = T137_g; b = T137_b; return true; } 

		if(T136_okay && x >= T136_minx && x <= T136_maxx
		&& (T136_lc1_horizontal ? T136_lc1_cached : (T136_lc1_leftOrAbove ? x <= T136_lc1_borderX : x >= T136_lc1_borderX))
		&& (T136_lc2_horizontal ? T136_lc2_cached : (T136_lc2_leftOrAbove ? x <= T136_lc2_borderX : x >= T136_lc2_borderX))
		&& (T136_lc3_horizontal ? T136_lc3_cached : (T136_lc3_leftOrAbove ? x <= T136_lc3_borderX : x >= T136_lc3_borderX))
		) { r = T136_r; g = T136_g; b = T136_b; return true; } 

		if(T135_okay && x >= T135_minx && x <= T135_maxx
		&& (T135_lc1_horizontal ? T135_lc1_cached : (T135_lc1_leftOrAbove ? x <= T135_lc1_borderX : x >= T135_lc1_borderX))
		&& (T135_lc2_horizontal ? T135_lc2_cached : (T135_lc2_leftOrAbove ? x <= T135_lc2_borderX : x >= T135_lc2_borderX))
		&& (T135_lc3_horizontal ? T135_lc3_cached : (T135_lc3_leftOrAbove ? x <= T135_lc3_borderX : x >= T135_lc3_borderX))
		) { r = T135_r; g = T135_g; b = T135_b; return true; } 

		if(T134_okay && x >= T134_minx && x <= T134_maxx
		&& (T134_lc1_horizontal ? T134_lc1_cached : (T134_lc1_leftOrAbove ? x <= T134_lc1_borderX : x >= T134_lc1_borderX))
		&& (T134_lc2_horizontal ? T134_lc2_cached : (T134_lc2_leftOrAbove ? x <= T134_lc2_borderX : x >= T134_lc2_borderX))
		&& (T134_lc3_horizontal ? T134_lc3_cached : (T134_lc3_leftOrAbove ? x <= T134_lc3_borderX : x >= T134_lc3_borderX))
		) { r = T134_r; g = T134_g; b = T134_b; return true; } 

		if(T133_okay && x >= T133_minx && x <= T133_maxx
		&& (T133_lc1_horizontal ? T133_lc1_cached : (T133_lc1_leftOrAbove ? x <= T133_lc1_borderX : x >= T133_lc1_borderX))
		&& (T133_lc2_horizontal ? T133_lc2_cached : (T133_lc2_leftOrAbove ? x <= T133_lc2_borderX : x >= T133_lc2_borderX))
		&& (T133_lc3_horizontal ? T133_lc3_cached : (T133_lc3_leftOrAbove ? x <= T133_lc3_borderX : x >= T133_lc3_borderX))
		) { r = T133_r; g = T133_g; b = T133_b; return true; } 

		if(T132_okay && x >= T132_minx && x <= T132_maxx
		&& (T132_lc1_horizontal ? T132_lc1_cached : (T132_lc1_leftOrAbove ? x <= T132_lc1_borderX : x >= T132_lc1_borderX))
		&& (T132_lc2_horizontal ? T132_lc2_cached : (T132_lc2_leftOrAbove ? x <= T132_lc2_borderX : x >= T132_lc2_borderX))
		&& (T132_lc3_horizontal ? T132_lc3_cached : (T132_lc3_leftOrAbove ? x <= T132_lc3_borderX : x >= T132_lc3_borderX))
		) { r = T132_r; g = T132_g; b = T132_b; return true; } 

		if(T131_okay && x >= T131_minx && x <= T131_maxx
		&& (T131_lc1_horizontal ? T131_lc1_cached : (T131_lc1_leftOrAbove ? x <= T131_lc1_borderX : x >= T131_lc1_borderX))
		&& (T131_lc2_horizontal ? T131_lc2_cached : (T131_lc2_leftOrAbove ? x <= T131_lc2_borderX : x >= T131_lc2_borderX))
		&& (T131_lc3_horizontal ? T131_lc3_cached : (T131_lc3_leftOrAbove ? x <= T131_lc3_borderX : x >= T131_lc3_borderX))
		) { r = T131_r; g = T131_g; b = T131_b; return true; } 

		if(T130_okay && x >= T130_minx && x <= T130_maxx
		&& (T130_lc1_horizontal ? T130_lc1_cached : (T130_lc1_leftOrAbove ? x <= T130_lc1_borderX : x >= T130_lc1_borderX))
		&& (T130_lc2_horizontal ? T130_lc2_cached : (T130_lc2_leftOrAbove ? x <= T130_lc2_borderX : x >= T130_lc2_borderX))
		&& (T130_lc3_horizontal ? T130_lc3_cached : (T130_lc3_leftOrAbove ? x <= T130_lc3_borderX : x >= T130_lc3_borderX))
		) { r = T130_r; g = T130_g; b = T130_b; return true; } 

		if(T129_okay && x >= T129_minx && x <= T129_maxx
		&& (T129_lc1_horizontal ? T129_lc1_cached : (T129_lc1_leftOrAbove ? x <= T129_lc1_borderX : x >= T129_lc1_borderX))
		&& (T129_lc2_horizontal ? T129_lc2_cached : (T129_lc2_leftOrAbove ? x <= T129_lc2_borderX : x >= T129_lc2_borderX))
		&& (T129_lc3_horizontal ? T129_lc3_cached : (T129_lc3_leftOrAbove ? x <= T129_lc3_borderX : x >= T129_lc3_borderX))
		) { r = T129_r; g = T129_g; b = T129_b; return true; } 

		if(T128_okay && x >= T128_minx && x <= T128_maxx
		&& (T128_lc1_horizontal ? T128_lc1_cached : (T128_lc1_leftOrAbove ? x <= T128_lc1_borderX : x >= T128_lc1_borderX))
		&& (T128_lc2_horizontal ? T128_lc2_cached : (T128_lc2_leftOrAbove ? x <= T128_lc2_borderX : x >= T128_lc2_borderX))
		&& (T128_lc3_horizontal ? T128_lc3_cached : (T128_lc3_leftOrAbove ? x <= T128_lc3_borderX : x >= T128_lc3_borderX))
		) { r = T128_r; g = T128_g; b = T128_b; return true; } 

		if(T127_okay && x >= T127_minx && x <= T127_maxx
		&& (T127_lc1_horizontal ? T127_lc1_cached : (T127_lc1_leftOrAbove ? x <= T127_lc1_borderX : x >= T127_lc1_borderX))
		&& (T127_lc2_horizontal ? T127_lc2_cached : (T127_lc2_leftOrAbove ? x <= T127_lc2_borderX : x >= T127_lc2_borderX))
		&& (T127_lc3_horizontal ? T127_lc3_cached : (T127_lc3_leftOrAbove ? x <= T127_lc3_borderX : x >= T127_lc3_borderX))
		) { r = T127_r; g = T127_g; b = T127_b; return true; } 

		if(T126_okay && x >= T126_minx && x <= T126_maxx
		&& (T126_lc1_horizontal ? T126_lc1_cached : (T126_lc1_leftOrAbove ? x <= T126_lc1_borderX : x >= T126_lc1_borderX))
		&& (T126_lc2_horizontal ? T126_lc2_cached : (T126_lc2_leftOrAbove ? x <= T126_lc2_borderX : x >= T126_lc2_borderX))
		&& (T126_lc3_horizontal ? T126_lc3_cached : (T126_lc3_leftOrAbove ? x <= T126_lc3_borderX : x >= T126_lc3_borderX))
		) { r = T126_r; g = T126_g; b = T126_b; return true; } 

		if(T125_okay && x >= T125_minx && x <= T125_maxx
		&& (T125_lc1_horizontal ? T125_lc1_cached : (T125_lc1_leftOrAbove ? x <= T125_lc1_borderX : x >= T125_lc1_borderX))
		&& (T125_lc2_horizontal ? T125_lc2_cached : (T125_lc2_leftOrAbove ? x <= T125_lc2_borderX : x >= T125_lc2_borderX))
		&& (T125_lc3_horizontal ? T125_lc3_cached : (T125_lc3_leftOrAbove ? x <= T125_lc3_borderX : x >= T125_lc3_borderX))
		) { r = T125_r; g = T125_g; b = T125_b; return true; } 

		if(T124_okay && x >= T124_minx && x <= T124_maxx
		&& (T124_lc1_horizontal ? T124_lc1_cached : (T124_lc1_leftOrAbove ? x <= T124_lc1_borderX : x >= T124_lc1_borderX))
		&& (T124_lc2_horizontal ? T124_lc2_cached : (T124_lc2_leftOrAbove ? x <= T124_lc2_borderX : x >= T124_lc2_borderX))
		&& (T124_lc3_horizontal ? T124_lc3_cached : (T124_lc3_leftOrAbove ? x <= T124_lc3_borderX : x >= T124_lc3_borderX))
		) { r = T124_r; g = T124_g; b = T124_b; return true; } 

		if(T123_okay && x >= T123_minx && x <= T123_maxx
		&& (T123_lc1_horizontal ? T123_lc1_cached : (T123_lc1_leftOrAbove ? x <= T123_lc1_borderX : x >= T123_lc1_borderX))
		&& (T123_lc2_horizontal ? T123_lc2_cached : (T123_lc2_leftOrAbove ? x <= T123_lc2_borderX : x >= T123_lc2_borderX))
		&& (T123_lc3_horizontal ? T123_lc3_cached : (T123_lc3_leftOrAbove ? x <= T123_lc3_borderX : x >= T123_lc3_borderX))
		) { r = T123_r; g = T123_g; b = T123_b; return true; } 

		if(T122_okay && x >= T122_minx && x <= T122_maxx
		&& (T122_lc1_horizontal ? T122_lc1_cached : (T122_lc1_leftOrAbove ? x <= T122_lc1_borderX : x >= T122_lc1_borderX))
		&& (T122_lc2_horizontal ? T122_lc2_cached : (T122_lc2_leftOrAbove ? x <= T122_lc2_borderX : x >= T122_lc2_borderX))
		&& (T122_lc3_horizontal ? T122_lc3_cached : (T122_lc3_leftOrAbove ? x <= T122_lc3_borderX : x >= T122_lc3_borderX))
		) { r = T122_r; g = T122_g; b = T122_b; return true; } 

		if(T121_okay && x >= T121_minx && x <= T121_maxx
		&& (T121_lc1_horizontal ? T121_lc1_cached : (T121_lc1_leftOrAbove ? x <= T121_lc1_borderX : x >= T121_lc1_borderX))
		&& (T121_lc2_horizontal ? T121_lc2_cached : (T121_lc2_leftOrAbove ? x <= T121_lc2_borderX : x >= T121_lc2_borderX))
		&& (T121_lc3_horizontal ? T121_lc3_cached : (T121_lc3_leftOrAbove ? x <= T121_lc3_borderX : x >= T121_lc3_borderX))
		) { r = T121_r; g = T121_g; b = T121_b; return true; } 

		if(T120_okay && x >= T120_minx && x <= T120_maxx
		&& (T120_lc1_horizontal ? T120_lc1_cached : (T120_lc1_leftOrAbove ? x <= T120_lc1_borderX : x >= T120_lc1_borderX))
		&& (T120_lc2_horizontal ? T120_lc2_cached : (T120_lc2_leftOrAbove ? x <= T120_lc2_borderX : x >= T120_lc2_borderX))
		&& (T120_lc3_horizontal ? T120_lc3_cached : (T120_lc3_leftOrAbove ? x <= T120_lc3_borderX : x >= T120_lc3_borderX))
		) { r = T120_r; g = T120_g; b = T120_b; return true; } 

		return false;
	}

	private boolean drawPart7() {
		if(T119_okay && x >= T119_minx && x <= T119_maxx
		&& (T119_lc1_horizontal ? T119_lc1_cached : (T119_lc1_leftOrAbove ? x <= T119_lc1_borderX : x >= T119_lc1_borderX))
		&& (T119_lc2_horizontal ? T119_lc2_cached : (T119_lc2_leftOrAbove ? x <= T119_lc2_borderX : x >= T119_lc2_borderX))
		&& (T119_lc3_horizontal ? T119_lc3_cached : (T119_lc3_leftOrAbove ? x <= T119_lc3_borderX : x >= T119_lc3_borderX))
		) { r = T119_r; g = T119_g; b = T119_b; return true; } 

		if(T118_okay && x >= T118_minx && x <= T118_maxx
		&& (T118_lc1_horizontal ? T118_lc1_cached : (T118_lc1_leftOrAbove ? x <= T118_lc1_borderX : x >= T118_lc1_borderX))
		&& (T118_lc2_horizontal ? T118_lc2_cached : (T118_lc2_leftOrAbove ? x <= T118_lc2_borderX : x >= T118_lc2_borderX))
		&& (T118_lc3_horizontal ? T118_lc3_cached : (T118_lc3_leftOrAbove ? x <= T118_lc3_borderX : x >= T118_lc3_borderX))
		) { r = T118_r; g = T118_g; b = T118_b; return true; } 

		if(T117_okay && x >= T117_minx && x <= T117_maxx
		&& (T117_lc1_horizontal ? T117_lc1_cached : (T117_lc1_leftOrAbove ? x <= T117_lc1_borderX : x >= T117_lc1_borderX))
		&& (T117_lc2_horizontal ? T117_lc2_cached : (T117_lc2_leftOrAbove ? x <= T117_lc2_borderX : x >= T117_lc2_borderX))
		&& (T117_lc3_horizontal ? T117_lc3_cached : (T117_lc3_leftOrAbove ? x <= T117_lc3_borderX : x >= T117_lc3_borderX))
		) { r = T117_r; g = T117_g; b = T117_b; return true; } 

		if(T116_okay && x >= T116_minx && x <= T116_maxx
		&& (T116_lc1_horizontal ? T116_lc1_cached : (T116_lc1_leftOrAbove ? x <= T116_lc1_borderX : x >= T116_lc1_borderX))
		&& (T116_lc2_horizontal ? T116_lc2_cached : (T116_lc2_leftOrAbove ? x <= T116_lc2_borderX : x >= T116_lc2_borderX))
		&& (T116_lc3_horizontal ? T116_lc3_cached : (T116_lc3_leftOrAbove ? x <= T116_lc3_borderX : x >= T116_lc3_borderX))
		) { r = T116_r; g = T116_g; b = T116_b; return true; } 

		if(T115_okay && x >= T115_minx && x <= T115_maxx
		&& (T115_lc1_horizontal ? T115_lc1_cached : (T115_lc1_leftOrAbove ? x <= T115_lc1_borderX : x >= T115_lc1_borderX))
		&& (T115_lc2_horizontal ? T115_lc2_cached : (T115_lc2_leftOrAbove ? x <= T115_lc2_borderX : x >= T115_lc2_borderX))
		&& (T115_lc3_horizontal ? T115_lc3_cached : (T115_lc3_leftOrAbove ? x <= T115_lc3_borderX : x >= T115_lc3_borderX))
		) { r = T115_r; g = T115_g; b = T115_b; return true; } 

		if(T114_okay && x >= T114_minx && x <= T114_maxx
		&& (T114_lc1_horizontal ? T114_lc1_cached : (T114_lc1_leftOrAbove ? x <= T114_lc1_borderX : x >= T114_lc1_borderX))
		&& (T114_lc2_horizontal ? T114_lc2_cached : (T114_lc2_leftOrAbove ? x <= T114_lc2_borderX : x >= T114_lc2_borderX))
		&& (T114_lc3_horizontal ? T114_lc3_cached : (T114_lc3_leftOrAbove ? x <= T114_lc3_borderX : x >= T114_lc3_borderX))
		) { r = T114_r; g = T114_g; b = T114_b; return true; } 

		if(T113_okay && x >= T113_minx && x <= T113_maxx
		&& (T113_lc1_horizontal ? T113_lc1_cached : (T113_lc1_leftOrAbove ? x <= T113_lc1_borderX : x >= T113_lc1_borderX))
		&& (T113_lc2_horizontal ? T113_lc2_cached : (T113_lc2_leftOrAbove ? x <= T113_lc2_borderX : x >= T113_lc2_borderX))
		&& (T113_lc3_horizontal ? T113_lc3_cached : (T113_lc3_leftOrAbove ? x <= T113_lc3_borderX : x >= T113_lc3_borderX))
		) { r = T113_r; g = T113_g; b = T113_b; return true; } 

		if(T112_okay && x >= T112_minx && x <= T112_maxx
		&& (T112_lc1_horizontal ? T112_lc1_cached : (T112_lc1_leftOrAbove ? x <= T112_lc1_borderX : x >= T112_lc1_borderX))
		&& (T112_lc2_horizontal ? T112_lc2_cached : (T112_lc2_leftOrAbove ? x <= T112_lc2_borderX : x >= T112_lc2_borderX))
		&& (T112_lc3_horizontal ? T112_lc3_cached : (T112_lc3_leftOrAbove ? x <= T112_lc3_borderX : x >= T112_lc3_borderX))
		) { r = T112_r; g = T112_g; b = T112_b; return true; } 

		if(T111_okay && x >= T111_minx && x <= T111_maxx
		&& (T111_lc1_horizontal ? T111_lc1_cached : (T111_lc1_leftOrAbove ? x <= T111_lc1_borderX : x >= T111_lc1_borderX))
		&& (T111_lc2_horizontal ? T111_lc2_cached : (T111_lc2_leftOrAbove ? x <= T111_lc2_borderX : x >= T111_lc2_borderX))
		&& (T111_lc3_horizontal ? T111_lc3_cached : (T111_lc3_leftOrAbove ? x <= T111_lc3_borderX : x >= T111_lc3_borderX))
		) { r = T111_r; g = T111_g; b = T111_b; return true; } 

		if(T110_okay && x >= T110_minx && x <= T110_maxx
		&& (T110_lc1_horizontal ? T110_lc1_cached : (T110_lc1_leftOrAbove ? x <= T110_lc1_borderX : x >= T110_lc1_borderX))
		&& (T110_lc2_horizontal ? T110_lc2_cached : (T110_lc2_leftOrAbove ? x <= T110_lc2_borderX : x >= T110_lc2_borderX))
		&& (T110_lc3_horizontal ? T110_lc3_cached : (T110_lc3_leftOrAbove ? x <= T110_lc3_borderX : x >= T110_lc3_borderX))
		) { r = T110_r; g = T110_g; b = T110_b; return true; } 

		if(T109_okay && x >= T109_minx && x <= T109_maxx
		&& (T109_lc1_horizontal ? T109_lc1_cached : (T109_lc1_leftOrAbove ? x <= T109_lc1_borderX : x >= T109_lc1_borderX))
		&& (T109_lc2_horizontal ? T109_lc2_cached : (T109_lc2_leftOrAbove ? x <= T109_lc2_borderX : x >= T109_lc2_borderX))
		&& (T109_lc3_horizontal ? T109_lc3_cached : (T109_lc3_leftOrAbove ? x <= T109_lc3_borderX : x >= T109_lc3_borderX))
		) { r = T109_r; g = T109_g; b = T109_b; return true; } 

		if(T108_okay && x >= T108_minx && x <= T108_maxx
		&& (T108_lc1_horizontal ? T108_lc1_cached : (T108_lc1_leftOrAbove ? x <= T108_lc1_borderX : x >= T108_lc1_borderX))
		&& (T108_lc2_horizontal ? T108_lc2_cached : (T108_lc2_leftOrAbove ? x <= T108_lc2_borderX : x >= T108_lc2_borderX))
		&& (T108_lc3_horizontal ? T108_lc3_cached : (T108_lc3_leftOrAbove ? x <= T108_lc3_borderX : x >= T108_lc3_borderX))
		) { r = T108_r; g = T108_g; b = T108_b; return true; } 

		if(T107_okay && x >= T107_minx && x <= T107_maxx
		&& (T107_lc1_horizontal ? T107_lc1_cached : (T107_lc1_leftOrAbove ? x <= T107_lc1_borderX : x >= T107_lc1_borderX))
		&& (T107_lc2_horizontal ? T107_lc2_cached : (T107_lc2_leftOrAbove ? x <= T107_lc2_borderX : x >= T107_lc2_borderX))
		&& (T107_lc3_horizontal ? T107_lc3_cached : (T107_lc3_leftOrAbove ? x <= T107_lc3_borderX : x >= T107_lc3_borderX))
		) { r = T107_r; g = T107_g; b = T107_b; return true; } 

		if(T106_okay && x >= T106_minx && x <= T106_maxx
		&& (T106_lc1_horizontal ? T106_lc1_cached : (T106_lc1_leftOrAbove ? x <= T106_lc1_borderX : x >= T106_lc1_borderX))
		&& (T106_lc2_horizontal ? T106_lc2_cached : (T106_lc2_leftOrAbove ? x <= T106_lc2_borderX : x >= T106_lc2_borderX))
		&& (T106_lc3_horizontal ? T106_lc3_cached : (T106_lc3_leftOrAbove ? x <= T106_lc3_borderX : x >= T106_lc3_borderX))
		) { r = T106_r; g = T106_g; b = T106_b; return true; } 

		if(T105_okay && x >= T105_minx && x <= T105_maxx
		&& (T105_lc1_horizontal ? T105_lc1_cached : (T105_lc1_leftOrAbove ? x <= T105_lc1_borderX : x >= T105_lc1_borderX))
		&& (T105_lc2_horizontal ? T105_lc2_cached : (T105_lc2_leftOrAbove ? x <= T105_lc2_borderX : x >= T105_lc2_borderX))
		&& (T105_lc3_horizontal ? T105_lc3_cached : (T105_lc3_leftOrAbove ? x <= T105_lc3_borderX : x >= T105_lc3_borderX))
		) { r = T105_r; g = T105_g; b = T105_b; return true; } 

		if(T104_okay && x >= T104_minx && x <= T104_maxx
		&& (T104_lc1_horizontal ? T104_lc1_cached : (T104_lc1_leftOrAbove ? x <= T104_lc1_borderX : x >= T104_lc1_borderX))
		&& (T104_lc2_horizontal ? T104_lc2_cached : (T104_lc2_leftOrAbove ? x <= T104_lc2_borderX : x >= T104_lc2_borderX))
		&& (T104_lc3_horizontal ? T104_lc3_cached : (T104_lc3_leftOrAbove ? x <= T104_lc3_borderX : x >= T104_lc3_borderX))
		) { r = T104_r; g = T104_g; b = T104_b; return true; } 

		if(T103_okay && x >= T103_minx && x <= T103_maxx
		&& (T103_lc1_horizontal ? T103_lc1_cached : (T103_lc1_leftOrAbove ? x <= T103_lc1_borderX : x >= T103_lc1_borderX))
		&& (T103_lc2_horizontal ? T103_lc2_cached : (T103_lc2_leftOrAbove ? x <= T103_lc2_borderX : x >= T103_lc2_borderX))
		&& (T103_lc3_horizontal ? T103_lc3_cached : (T103_lc3_leftOrAbove ? x <= T103_lc3_borderX : x >= T103_lc3_borderX))
		) { r = T103_r; g = T103_g; b = T103_b; return true; } 

		if(T102_okay && x >= T102_minx && x <= T102_maxx
		&& (T102_lc1_horizontal ? T102_lc1_cached : (T102_lc1_leftOrAbove ? x <= T102_lc1_borderX : x >= T102_lc1_borderX))
		&& (T102_lc2_horizontal ? T102_lc2_cached : (T102_lc2_leftOrAbove ? x <= T102_lc2_borderX : x >= T102_lc2_borderX))
		&& (T102_lc3_horizontal ? T102_lc3_cached : (T102_lc3_leftOrAbove ? x <= T102_lc3_borderX : x >= T102_lc3_borderX))
		) { r = T102_r; g = T102_g; b = T102_b; return true; } 

		if(T101_okay && x >= T101_minx && x <= T101_maxx
		&& (T101_lc1_horizontal ? T101_lc1_cached : (T101_lc1_leftOrAbove ? x <= T101_lc1_borderX : x >= T101_lc1_borderX))
		&& (T101_lc2_horizontal ? T101_lc2_cached : (T101_lc2_leftOrAbove ? x <= T101_lc2_borderX : x >= T101_lc2_borderX))
		&& (T101_lc3_horizontal ? T101_lc3_cached : (T101_lc3_leftOrAbove ? x <= T101_lc3_borderX : x >= T101_lc3_borderX))
		) { r = T101_r; g = T101_g; b = T101_b; return true; } 

		if(T100_okay && x >= T100_minx && x <= T100_maxx
		&& (T100_lc1_horizontal ? T100_lc1_cached : (T100_lc1_leftOrAbove ? x <= T100_lc1_borderX : x >= T100_lc1_borderX))
		&& (T100_lc2_horizontal ? T100_lc2_cached : (T100_lc2_leftOrAbove ? x <= T100_lc2_borderX : x >= T100_lc2_borderX))
		&& (T100_lc3_horizontal ? T100_lc3_cached : (T100_lc3_leftOrAbove ? x <= T100_lc3_borderX : x >= T100_lc3_borderX))
		) { r = T100_r; g = T100_g; b = T100_b; return true; } 

		if(T99_okay && x >= T99_minx && x <= T99_maxx
		&& (T99_lc1_horizontal ? T99_lc1_cached : (T99_lc1_leftOrAbove ? x <= T99_lc1_borderX : x >= T99_lc1_borderX))
		&& (T99_lc2_horizontal ? T99_lc2_cached : (T99_lc2_leftOrAbove ? x <= T99_lc2_borderX : x >= T99_lc2_borderX))
		&& (T99_lc3_horizontal ? T99_lc3_cached : (T99_lc3_leftOrAbove ? x <= T99_lc3_borderX : x >= T99_lc3_borderX))
		) { r = T99_r; g = T99_g; b = T99_b; return true; } 

		if(T98_okay && x >= T98_minx && x <= T98_maxx
		&& (T98_lc1_horizontal ? T98_lc1_cached : (T98_lc1_leftOrAbove ? x <= T98_lc1_borderX : x >= T98_lc1_borderX))
		&& (T98_lc2_horizontal ? T98_lc2_cached : (T98_lc2_leftOrAbove ? x <= T98_lc2_borderX : x >= T98_lc2_borderX))
		&& (T98_lc3_horizontal ? T98_lc3_cached : (T98_lc3_leftOrAbove ? x <= T98_lc3_borderX : x >= T98_lc3_borderX))
		) { r = T98_r; g = T98_g; b = T98_b; return true; } 

		if(T97_okay && x >= T97_minx && x <= T97_maxx
		&& (T97_lc1_horizontal ? T97_lc1_cached : (T97_lc1_leftOrAbove ? x <= T97_lc1_borderX : x >= T97_lc1_borderX))
		&& (T97_lc2_horizontal ? T97_lc2_cached : (T97_lc2_leftOrAbove ? x <= T97_lc2_borderX : x >= T97_lc2_borderX))
		&& (T97_lc3_horizontal ? T97_lc3_cached : (T97_lc3_leftOrAbove ? x <= T97_lc3_borderX : x >= T97_lc3_borderX))
		) { r = T97_r; g = T97_g; b = T97_b; return true; } 

		if(T96_okay && x >= T96_minx && x <= T96_maxx
		&& (T96_lc1_horizontal ? T96_lc1_cached : (T96_lc1_leftOrAbove ? x <= T96_lc1_borderX : x >= T96_lc1_borderX))
		&& (T96_lc2_horizontal ? T96_lc2_cached : (T96_lc2_leftOrAbove ? x <= T96_lc2_borderX : x >= T96_lc2_borderX))
		&& (T96_lc3_horizontal ? T96_lc3_cached : (T96_lc3_leftOrAbove ? x <= T96_lc3_borderX : x >= T96_lc3_borderX))
		) { r = T96_r; g = T96_g; b = T96_b; return true; } 

		if(T95_okay && x >= T95_minx && x <= T95_maxx
		&& (T95_lc1_horizontal ? T95_lc1_cached : (T95_lc1_leftOrAbove ? x <= T95_lc1_borderX : x >= T95_lc1_borderX))
		&& (T95_lc2_horizontal ? T95_lc2_cached : (T95_lc2_leftOrAbove ? x <= T95_lc2_borderX : x >= T95_lc2_borderX))
		&& (T95_lc3_horizontal ? T95_lc3_cached : (T95_lc3_leftOrAbove ? x <= T95_lc3_borderX : x >= T95_lc3_borderX))
		) { r = T95_r; g = T95_g; b = T95_b; return true; } 

		if(T94_okay && x >= T94_minx && x <= T94_maxx
		&& (T94_lc1_horizontal ? T94_lc1_cached : (T94_lc1_leftOrAbove ? x <= T94_lc1_borderX : x >= T94_lc1_borderX))
		&& (T94_lc2_horizontal ? T94_lc2_cached : (T94_lc2_leftOrAbove ? x <= T94_lc2_borderX : x >= T94_lc2_borderX))
		&& (T94_lc3_horizontal ? T94_lc3_cached : (T94_lc3_leftOrAbove ? x <= T94_lc3_borderX : x >= T94_lc3_borderX))
		) { r = T94_r; g = T94_g; b = T94_b; return true; } 

		if(T93_okay && x >= T93_minx && x <= T93_maxx
		&& (T93_lc1_horizontal ? T93_lc1_cached : (T93_lc1_leftOrAbove ? x <= T93_lc1_borderX : x >= T93_lc1_borderX))
		&& (T93_lc2_horizontal ? T93_lc2_cached : (T93_lc2_leftOrAbove ? x <= T93_lc2_borderX : x >= T93_lc2_borderX))
		&& (T93_lc3_horizontal ? T93_lc3_cached : (T93_lc3_leftOrAbove ? x <= T93_lc3_borderX : x >= T93_lc3_borderX))
		) { r = T93_r; g = T93_g; b = T93_b; return true; } 

		if(T92_okay && x >= T92_minx && x <= T92_maxx
		&& (T92_lc1_horizontal ? T92_lc1_cached : (T92_lc1_leftOrAbove ? x <= T92_lc1_borderX : x >= T92_lc1_borderX))
		&& (T92_lc2_horizontal ? T92_lc2_cached : (T92_lc2_leftOrAbove ? x <= T92_lc2_borderX : x >= T92_lc2_borderX))
		&& (T92_lc3_horizontal ? T92_lc3_cached : (T92_lc3_leftOrAbove ? x <= T92_lc3_borderX : x >= T92_lc3_borderX))
		) { r = T92_r; g = T92_g; b = T92_b; return true; } 

		if(T91_okay && x >= T91_minx && x <= T91_maxx
		&& (T91_lc1_horizontal ? T91_lc1_cached : (T91_lc1_leftOrAbove ? x <= T91_lc1_borderX : x >= T91_lc1_borderX))
		&& (T91_lc2_horizontal ? T91_lc2_cached : (T91_lc2_leftOrAbove ? x <= T91_lc2_borderX : x >= T91_lc2_borderX))
		&& (T91_lc3_horizontal ? T91_lc3_cached : (T91_lc3_leftOrAbove ? x <= T91_lc3_borderX : x >= T91_lc3_borderX))
		) { r = T91_r; g = T91_g; b = T91_b; return true; } 

		if(T90_okay && x >= T90_minx && x <= T90_maxx
		&& (T90_lc1_horizontal ? T90_lc1_cached : (T90_lc1_leftOrAbove ? x <= T90_lc1_borderX : x >= T90_lc1_borderX))
		&& (T90_lc2_horizontal ? T90_lc2_cached : (T90_lc2_leftOrAbove ? x <= T90_lc2_borderX : x >= T90_lc2_borderX))
		&& (T90_lc3_horizontal ? T90_lc3_cached : (T90_lc3_leftOrAbove ? x <= T90_lc3_borderX : x >= T90_lc3_borderX))
		) { r = T90_r; g = T90_g; b = T90_b; return true; } 

		return false;
	}

	private boolean drawPart8() {
		if(T89_okay && x >= T89_minx && x <= T89_maxx
		&& (T89_lc1_horizontal ? T89_lc1_cached : (T89_lc1_leftOrAbove ? x <= T89_lc1_borderX : x >= T89_lc1_borderX))
		&& (T89_lc2_horizontal ? T89_lc2_cached : (T89_lc2_leftOrAbove ? x <= T89_lc2_borderX : x >= T89_lc2_borderX))
		&& (T89_lc3_horizontal ? T89_lc3_cached : (T89_lc3_leftOrAbove ? x <= T89_lc3_borderX : x >= T89_lc3_borderX))
		) { r = T89_r; g = T89_g; b = T89_b; return true; } 

		if(T88_okay && x >= T88_minx && x <= T88_maxx
		&& (T88_lc1_horizontal ? T88_lc1_cached : (T88_lc1_leftOrAbove ? x <= T88_lc1_borderX : x >= T88_lc1_borderX))
		&& (T88_lc2_horizontal ? T88_lc2_cached : (T88_lc2_leftOrAbove ? x <= T88_lc2_borderX : x >= T88_lc2_borderX))
		&& (T88_lc3_horizontal ? T88_lc3_cached : (T88_lc3_leftOrAbove ? x <= T88_lc3_borderX : x >= T88_lc3_borderX))
		) { r = T88_r; g = T88_g; b = T88_b; return true; } 

		if(T87_okay && x >= T87_minx && x <= T87_maxx
		&& (T87_lc1_horizontal ? T87_lc1_cached : (T87_lc1_leftOrAbove ? x <= T87_lc1_borderX : x >= T87_lc1_borderX))
		&& (T87_lc2_horizontal ? T87_lc2_cached : (T87_lc2_leftOrAbove ? x <= T87_lc2_borderX : x >= T87_lc2_borderX))
		&& (T87_lc3_horizontal ? T87_lc3_cached : (T87_lc3_leftOrAbove ? x <= T87_lc3_borderX : x >= T87_lc3_borderX))
		) { r = T87_r; g = T87_g; b = T87_b; return true; } 

		if(T86_okay && x >= T86_minx && x <= T86_maxx
		&& (T86_lc1_horizontal ? T86_lc1_cached : (T86_lc1_leftOrAbove ? x <= T86_lc1_borderX : x >= T86_lc1_borderX))
		&& (T86_lc2_horizontal ? T86_lc2_cached : (T86_lc2_leftOrAbove ? x <= T86_lc2_borderX : x >= T86_lc2_borderX))
		&& (T86_lc3_horizontal ? T86_lc3_cached : (T86_lc3_leftOrAbove ? x <= T86_lc3_borderX : x >= T86_lc3_borderX))
		) { r = T86_r; g = T86_g; b = T86_b; return true; } 

		if(T85_okay && x >= T85_minx && x <= T85_maxx
		&& (T85_lc1_horizontal ? T85_lc1_cached : (T85_lc1_leftOrAbove ? x <= T85_lc1_borderX : x >= T85_lc1_borderX))
		&& (T85_lc2_horizontal ? T85_lc2_cached : (T85_lc2_leftOrAbove ? x <= T85_lc2_borderX : x >= T85_lc2_borderX))
		&& (T85_lc3_horizontal ? T85_lc3_cached : (T85_lc3_leftOrAbove ? x <= T85_lc3_borderX : x >= T85_lc3_borderX))
		) { r = T85_r; g = T85_g; b = T85_b; return true; } 

		if(T84_okay && x >= T84_minx && x <= T84_maxx
		&& (T84_lc1_horizontal ? T84_lc1_cached : (T84_lc1_leftOrAbove ? x <= T84_lc1_borderX : x >= T84_lc1_borderX))
		&& (T84_lc2_horizontal ? T84_lc2_cached : (T84_lc2_leftOrAbove ? x <= T84_lc2_borderX : x >= T84_lc2_borderX))
		&& (T84_lc3_horizontal ? T84_lc3_cached : (T84_lc3_leftOrAbove ? x <= T84_lc3_borderX : x >= T84_lc3_borderX))
		) { r = T84_r; g = T84_g; b = T84_b; return true; } 

		if(T83_okay && x >= T83_minx && x <= T83_maxx
		&& (T83_lc1_horizontal ? T83_lc1_cached : (T83_lc1_leftOrAbove ? x <= T83_lc1_borderX : x >= T83_lc1_borderX))
		&& (T83_lc2_horizontal ? T83_lc2_cached : (T83_lc2_leftOrAbove ? x <= T83_lc2_borderX : x >= T83_lc2_borderX))
		&& (T83_lc3_horizontal ? T83_lc3_cached : (T83_lc3_leftOrAbove ? x <= T83_lc3_borderX : x >= T83_lc3_borderX))
		) { r = T83_r; g = T83_g; b = T83_b; return true; } 

		if(T82_okay && x >= T82_minx && x <= T82_maxx
		&& (T82_lc1_horizontal ? T82_lc1_cached : (T82_lc1_leftOrAbove ? x <= T82_lc1_borderX : x >= T82_lc1_borderX))
		&& (T82_lc2_horizontal ? T82_lc2_cached : (T82_lc2_leftOrAbove ? x <= T82_lc2_borderX : x >= T82_lc2_borderX))
		&& (T82_lc3_horizontal ? T82_lc3_cached : (T82_lc3_leftOrAbove ? x <= T82_lc3_borderX : x >= T82_lc3_borderX))
		) { r = T82_r; g = T82_g; b = T82_b; return true; } 

		if(T81_okay && x >= T81_minx && x <= T81_maxx
		&& (T81_lc1_horizontal ? T81_lc1_cached : (T81_lc1_leftOrAbove ? x <= T81_lc1_borderX : x >= T81_lc1_borderX))
		&& (T81_lc2_horizontal ? T81_lc2_cached : (T81_lc2_leftOrAbove ? x <= T81_lc2_borderX : x >= T81_lc2_borderX))
		&& (T81_lc3_horizontal ? T81_lc3_cached : (T81_lc3_leftOrAbove ? x <= T81_lc3_borderX : x >= T81_lc3_borderX))
		) { r = T81_r; g = T81_g; b = T81_b; return true; } 

		if(T80_okay && x >= T80_minx && x <= T80_maxx
		&& (T80_lc1_horizontal ? T80_lc1_cached : (T80_lc1_leftOrAbove ? x <= T80_lc1_borderX : x >= T80_lc1_borderX))
		&& (T80_lc2_horizontal ? T80_lc2_cached : (T80_lc2_leftOrAbove ? x <= T80_lc2_borderX : x >= T80_lc2_borderX))
		&& (T80_lc3_horizontal ? T80_lc3_cached : (T80_lc3_leftOrAbove ? x <= T80_lc3_borderX : x >= T80_lc3_borderX))
		) { r = T80_r; g = T80_g; b = T80_b; return true; } 

		if(T79_okay && x >= T79_minx && x <= T79_maxx
		&& (T79_lc1_horizontal ? T79_lc1_cached : (T79_lc1_leftOrAbove ? x <= T79_lc1_borderX : x >= T79_lc1_borderX))
		&& (T79_lc2_horizontal ? T79_lc2_cached : (T79_lc2_leftOrAbove ? x <= T79_lc2_borderX : x >= T79_lc2_borderX))
		&& (T79_lc3_horizontal ? T79_lc3_cached : (T79_lc3_leftOrAbove ? x <= T79_lc3_borderX : x >= T79_lc3_borderX))
		) { r = T79_r; g = T79_g; b = T79_b; return true; } 

		if(T78_okay && x >= T78_minx && x <= T78_maxx
		&& (T78_lc1_horizontal ? T78_lc1_cached : (T78_lc1_leftOrAbove ? x <= T78_lc1_borderX : x >= T78_lc1_borderX))
		&& (T78_lc2_horizontal ? T78_lc2_cached : (T78_lc2_leftOrAbove ? x <= T78_lc2_borderX : x >= T78_lc2_borderX))
		&& (T78_lc3_horizontal ? T78_lc3_cached : (T78_lc3_leftOrAbove ? x <= T78_lc3_borderX : x >= T78_lc3_borderX))
		) { r = T78_r; g = T78_g; b = T78_b; return true; } 

		if(T77_okay && x >= T77_minx && x <= T77_maxx
		&& (T77_lc1_horizontal ? T77_lc1_cached : (T77_lc1_leftOrAbove ? x <= T77_lc1_borderX : x >= T77_lc1_borderX))
		&& (T77_lc2_horizontal ? T77_lc2_cached : (T77_lc2_leftOrAbove ? x <= T77_lc2_borderX : x >= T77_lc2_borderX))
		&& (T77_lc3_horizontal ? T77_lc3_cached : (T77_lc3_leftOrAbove ? x <= T77_lc3_borderX : x >= T77_lc3_borderX))
		) { r = T77_r; g = T77_g; b = T77_b; return true; } 

		if(T76_okay && x >= T76_minx && x <= T76_maxx
		&& (T76_lc1_horizontal ? T76_lc1_cached : (T76_lc1_leftOrAbove ? x <= T76_lc1_borderX : x >= T76_lc1_borderX))
		&& (T76_lc2_horizontal ? T76_lc2_cached : (T76_lc2_leftOrAbove ? x <= T76_lc2_borderX : x >= T76_lc2_borderX))
		&& (T76_lc3_horizontal ? T76_lc3_cached : (T76_lc3_leftOrAbove ? x <= T76_lc3_borderX : x >= T76_lc3_borderX))
		) { r = T76_r; g = T76_g; b = T76_b; return true; } 

		if(T75_okay && x >= T75_minx && x <= T75_maxx
		&& (T75_lc1_horizontal ? T75_lc1_cached : (T75_lc1_leftOrAbove ? x <= T75_lc1_borderX : x >= T75_lc1_borderX))
		&& (T75_lc2_horizontal ? T75_lc2_cached : (T75_lc2_leftOrAbove ? x <= T75_lc2_borderX : x >= T75_lc2_borderX))
		&& (T75_lc3_horizontal ? T75_lc3_cached : (T75_lc3_leftOrAbove ? x <= T75_lc3_borderX : x >= T75_lc3_borderX))
		) { r = T75_r; g = T75_g; b = T75_b; return true; } 

		if(T74_okay && x >= T74_minx && x <= T74_maxx
		&& (T74_lc1_horizontal ? T74_lc1_cached : (T74_lc1_leftOrAbove ? x <= T74_lc1_borderX : x >= T74_lc1_borderX))
		&& (T74_lc2_horizontal ? T74_lc2_cached : (T74_lc2_leftOrAbove ? x <= T74_lc2_borderX : x >= T74_lc2_borderX))
		&& (T74_lc3_horizontal ? T74_lc3_cached : (T74_lc3_leftOrAbove ? x <= T74_lc3_borderX : x >= T74_lc3_borderX))
		) { r = T74_r; g = T74_g; b = T74_b; return true; } 

		if(T73_okay && x >= T73_minx && x <= T73_maxx
		&& (T73_lc1_horizontal ? T73_lc1_cached : (T73_lc1_leftOrAbove ? x <= T73_lc1_borderX : x >= T73_lc1_borderX))
		&& (T73_lc2_horizontal ? T73_lc2_cached : (T73_lc2_leftOrAbove ? x <= T73_lc2_borderX : x >= T73_lc2_borderX))
		&& (T73_lc3_horizontal ? T73_lc3_cached : (T73_lc3_leftOrAbove ? x <= T73_lc3_borderX : x >= T73_lc3_borderX))
		) { r = T73_r; g = T73_g; b = T73_b; return true; } 

		if(T72_okay && x >= T72_minx && x <= T72_maxx
		&& (T72_lc1_horizontal ? T72_lc1_cached : (T72_lc1_leftOrAbove ? x <= T72_lc1_borderX : x >= T72_lc1_borderX))
		&& (T72_lc2_horizontal ? T72_lc2_cached : (T72_lc2_leftOrAbove ? x <= T72_lc2_borderX : x >= T72_lc2_borderX))
		&& (T72_lc3_horizontal ? T72_lc3_cached : (T72_lc3_leftOrAbove ? x <= T72_lc3_borderX : x >= T72_lc3_borderX))
		) { r = T72_r; g = T72_g; b = T72_b; return true; } 

		if(T71_okay && x >= T71_minx && x <= T71_maxx
		&& (T71_lc1_horizontal ? T71_lc1_cached : (T71_lc1_leftOrAbove ? x <= T71_lc1_borderX : x >= T71_lc1_borderX))
		&& (T71_lc2_horizontal ? T71_lc2_cached : (T71_lc2_leftOrAbove ? x <= T71_lc2_borderX : x >= T71_lc2_borderX))
		&& (T71_lc3_horizontal ? T71_lc3_cached : (T71_lc3_leftOrAbove ? x <= T71_lc3_borderX : x >= T71_lc3_borderX))
		) { r = T71_r; g = T71_g; b = T71_b; return true; } 

		if(T70_okay && x >= T70_minx && x <= T70_maxx
		&& (T70_lc1_horizontal ? T70_lc1_cached : (T70_lc1_leftOrAbove ? x <= T70_lc1_borderX : x >= T70_lc1_borderX))
		&& (T70_lc2_horizontal ? T70_lc2_cached : (T70_lc2_leftOrAbove ? x <= T70_lc2_borderX : x >= T70_lc2_borderX))
		&& (T70_lc3_horizontal ? T70_lc3_cached : (T70_lc3_leftOrAbove ? x <= T70_lc3_borderX : x >= T70_lc3_borderX))
		) { r = T70_r; g = T70_g; b = T70_b; return true; } 

		if(T69_okay && x >= T69_minx && x <= T69_maxx
		&& (T69_lc1_horizontal ? T69_lc1_cached : (T69_lc1_leftOrAbove ? x <= T69_lc1_borderX : x >= T69_lc1_borderX))
		&& (T69_lc2_horizontal ? T69_lc2_cached : (T69_lc2_leftOrAbove ? x <= T69_lc2_borderX : x >= T69_lc2_borderX))
		&& (T69_lc3_horizontal ? T69_lc3_cached : (T69_lc3_leftOrAbove ? x <= T69_lc3_borderX : x >= T69_lc3_borderX))
		) { r = T69_r; g = T69_g; b = T69_b; return true; } 

		if(T68_okay && x >= T68_minx && x <= T68_maxx
		&& (T68_lc1_horizontal ? T68_lc1_cached : (T68_lc1_leftOrAbove ? x <= T68_lc1_borderX : x >= T68_lc1_borderX))
		&& (T68_lc2_horizontal ? T68_lc2_cached : (T68_lc2_leftOrAbove ? x <= T68_lc2_borderX : x >= T68_lc2_borderX))
		&& (T68_lc3_horizontal ? T68_lc3_cached : (T68_lc3_leftOrAbove ? x <= T68_lc3_borderX : x >= T68_lc3_borderX))
		) { r = T68_r; g = T68_g; b = T68_b; return true; } 

		if(T67_okay && x >= T67_minx && x <= T67_maxx
		&& (T67_lc1_horizontal ? T67_lc1_cached : (T67_lc1_leftOrAbove ? x <= T67_lc1_borderX : x >= T67_lc1_borderX))
		&& (T67_lc2_horizontal ? T67_lc2_cached : (T67_lc2_leftOrAbove ? x <= T67_lc2_borderX : x >= T67_lc2_borderX))
		&& (T67_lc3_horizontal ? T67_lc3_cached : (T67_lc3_leftOrAbove ? x <= T67_lc3_borderX : x >= T67_lc3_borderX))
		) { r = T67_r; g = T67_g; b = T67_b; return true; } 

		if(T66_okay && x >= T66_minx && x <= T66_maxx
		&& (T66_lc1_horizontal ? T66_lc1_cached : (T66_lc1_leftOrAbove ? x <= T66_lc1_borderX : x >= T66_lc1_borderX))
		&& (T66_lc2_horizontal ? T66_lc2_cached : (T66_lc2_leftOrAbove ? x <= T66_lc2_borderX : x >= T66_lc2_borderX))
		&& (T66_lc3_horizontal ? T66_lc3_cached : (T66_lc3_leftOrAbove ? x <= T66_lc3_borderX : x >= T66_lc3_borderX))
		) { r = T66_r; g = T66_g; b = T66_b; return true; } 

		if(T65_okay && x >= T65_minx && x <= T65_maxx
		&& (T65_lc1_horizontal ? T65_lc1_cached : (T65_lc1_leftOrAbove ? x <= T65_lc1_borderX : x >= T65_lc1_borderX))
		&& (T65_lc2_horizontal ? T65_lc2_cached : (T65_lc2_leftOrAbove ? x <= T65_lc2_borderX : x >= T65_lc2_borderX))
		&& (T65_lc3_horizontal ? T65_lc3_cached : (T65_lc3_leftOrAbove ? x <= T65_lc3_borderX : x >= T65_lc3_borderX))
		) { r = T65_r; g = T65_g; b = T65_b; return true; } 

		if(T64_okay && x >= T64_minx && x <= T64_maxx
		&& (T64_lc1_horizontal ? T64_lc1_cached : (T64_lc1_leftOrAbove ? x <= T64_lc1_borderX : x >= T64_lc1_borderX))
		&& (T64_lc2_horizontal ? T64_lc2_cached : (T64_lc2_leftOrAbove ? x <= T64_lc2_borderX : x >= T64_lc2_borderX))
		&& (T64_lc3_horizontal ? T64_lc3_cached : (T64_lc3_leftOrAbove ? x <= T64_lc3_borderX : x >= T64_lc3_borderX))
		) { r = T64_r; g = T64_g; b = T64_b; return true; } 

		if(T63_okay && x >= T63_minx && x <= T63_maxx
		&& (T63_lc1_horizontal ? T63_lc1_cached : (T63_lc1_leftOrAbove ? x <= T63_lc1_borderX : x >= T63_lc1_borderX))
		&& (T63_lc2_horizontal ? T63_lc2_cached : (T63_lc2_leftOrAbove ? x <= T63_lc2_borderX : x >= T63_lc2_borderX))
		&& (T63_lc3_horizontal ? T63_lc3_cached : (T63_lc3_leftOrAbove ? x <= T63_lc3_borderX : x >= T63_lc3_borderX))
		) { r = T63_r; g = T63_g; b = T63_b; return true; } 

		if(T62_okay && x >= T62_minx && x <= T62_maxx
		&& (T62_lc1_horizontal ? T62_lc1_cached : (T62_lc1_leftOrAbove ? x <= T62_lc1_borderX : x >= T62_lc1_borderX))
		&& (T62_lc2_horizontal ? T62_lc2_cached : (T62_lc2_leftOrAbove ? x <= T62_lc2_borderX : x >= T62_lc2_borderX))
		&& (T62_lc3_horizontal ? T62_lc3_cached : (T62_lc3_leftOrAbove ? x <= T62_lc3_borderX : x >= T62_lc3_borderX))
		) { r = T62_r; g = T62_g; b = T62_b; return true; } 

		if(T61_okay && x >= T61_minx && x <= T61_maxx
		&& (T61_lc1_horizontal ? T61_lc1_cached : (T61_lc1_leftOrAbove ? x <= T61_lc1_borderX : x >= T61_lc1_borderX))
		&& (T61_lc2_horizontal ? T61_lc2_cached : (T61_lc2_leftOrAbove ? x <= T61_lc2_borderX : x >= T61_lc2_borderX))
		&& (T61_lc3_horizontal ? T61_lc3_cached : (T61_lc3_leftOrAbove ? x <= T61_lc3_borderX : x >= T61_lc3_borderX))
		) { r = T61_r; g = T61_g; b = T61_b; return true; } 

		if(T60_okay && x >= T60_minx && x <= T60_maxx
		&& (T60_lc1_horizontal ? T60_lc1_cached : (T60_lc1_leftOrAbove ? x <= T60_lc1_borderX : x >= T60_lc1_borderX))
		&& (T60_lc2_horizontal ? T60_lc2_cached : (T60_lc2_leftOrAbove ? x <= T60_lc2_borderX : x >= T60_lc2_borderX))
		&& (T60_lc3_horizontal ? T60_lc3_cached : (T60_lc3_leftOrAbove ? x <= T60_lc3_borderX : x >= T60_lc3_borderX))
		) { r = T60_r; g = T60_g; b = T60_b; return true; } 

		return false;
	}

	private boolean drawPart9() {
		if(T59_okay && x >= T59_minx && x <= T59_maxx
		&& (T59_lc1_horizontal ? T59_lc1_cached : (T59_lc1_leftOrAbove ? x <= T59_lc1_borderX : x >= T59_lc1_borderX))
		&& (T59_lc2_horizontal ? T59_lc2_cached : (T59_lc2_leftOrAbove ? x <= T59_lc2_borderX : x >= T59_lc2_borderX))
		&& (T59_lc3_horizontal ? T59_lc3_cached : (T59_lc3_leftOrAbove ? x <= T59_lc3_borderX : x >= T59_lc3_borderX))
		) { r = T59_r; g = T59_g; b = T59_b; return true; } 

		if(T58_okay && x >= T58_minx && x <= T58_maxx
		&& (T58_lc1_horizontal ? T58_lc1_cached : (T58_lc1_leftOrAbove ? x <= T58_lc1_borderX : x >= T58_lc1_borderX))
		&& (T58_lc2_horizontal ? T58_lc2_cached : (T58_lc2_leftOrAbove ? x <= T58_lc2_borderX : x >= T58_lc2_borderX))
		&& (T58_lc3_horizontal ? T58_lc3_cached : (T58_lc3_leftOrAbove ? x <= T58_lc3_borderX : x >= T58_lc3_borderX))
		) { r = T58_r; g = T58_g; b = T58_b; return true; } 

		if(T57_okay && x >= T57_minx && x <= T57_maxx
		&& (T57_lc1_horizontal ? T57_lc1_cached : (T57_lc1_leftOrAbove ? x <= T57_lc1_borderX : x >= T57_lc1_borderX))
		&& (T57_lc2_horizontal ? T57_lc2_cached : (T57_lc2_leftOrAbove ? x <= T57_lc2_borderX : x >= T57_lc2_borderX))
		&& (T57_lc3_horizontal ? T57_lc3_cached : (T57_lc3_leftOrAbove ? x <= T57_lc3_borderX : x >= T57_lc3_borderX))
		) { r = T57_r; g = T57_g; b = T57_b; return true; } 

		if(T56_okay && x >= T56_minx && x <= T56_maxx
		&& (T56_lc1_horizontal ? T56_lc1_cached : (T56_lc1_leftOrAbove ? x <= T56_lc1_borderX : x >= T56_lc1_borderX))
		&& (T56_lc2_horizontal ? T56_lc2_cached : (T56_lc2_leftOrAbove ? x <= T56_lc2_borderX : x >= T56_lc2_borderX))
		&& (T56_lc3_horizontal ? T56_lc3_cached : (T56_lc3_leftOrAbove ? x <= T56_lc3_borderX : x >= T56_lc3_borderX))
		) { r = T56_r; g = T56_g; b = T56_b; return true; } 

		if(T55_okay && x >= T55_minx && x <= T55_maxx
		&& (T55_lc1_horizontal ? T55_lc1_cached : (T55_lc1_leftOrAbove ? x <= T55_lc1_borderX : x >= T55_lc1_borderX))
		&& (T55_lc2_horizontal ? T55_lc2_cached : (T55_lc2_leftOrAbove ? x <= T55_lc2_borderX : x >= T55_lc2_borderX))
		&& (T55_lc3_horizontal ? T55_lc3_cached : (T55_lc3_leftOrAbove ? x <= T55_lc3_borderX : x >= T55_lc3_borderX))
		) { r = T55_r; g = T55_g; b = T55_b; return true; } 

		if(T54_okay && x >= T54_minx && x <= T54_maxx
		&& (T54_lc1_horizontal ? T54_lc1_cached : (T54_lc1_leftOrAbove ? x <= T54_lc1_borderX : x >= T54_lc1_borderX))
		&& (T54_lc2_horizontal ? T54_lc2_cached : (T54_lc2_leftOrAbove ? x <= T54_lc2_borderX : x >= T54_lc2_borderX))
		&& (T54_lc3_horizontal ? T54_lc3_cached : (T54_lc3_leftOrAbove ? x <= T54_lc3_borderX : x >= T54_lc3_borderX))
		) { r = T54_r; g = T54_g; b = T54_b; return true; } 

		if(T53_okay && x >= T53_minx && x <= T53_maxx
		&& (T53_lc1_horizontal ? T53_lc1_cached : (T53_lc1_leftOrAbove ? x <= T53_lc1_borderX : x >= T53_lc1_borderX))
		&& (T53_lc2_horizontal ? T53_lc2_cached : (T53_lc2_leftOrAbove ? x <= T53_lc2_borderX : x >= T53_lc2_borderX))
		&& (T53_lc3_horizontal ? T53_lc3_cached : (T53_lc3_leftOrAbove ? x <= T53_lc3_borderX : x >= T53_lc3_borderX))
		) { r = T53_r; g = T53_g; b = T53_b; return true; } 

		if(T52_okay && x >= T52_minx && x <= T52_maxx
		&& (T52_lc1_horizontal ? T52_lc1_cached : (T52_lc1_leftOrAbove ? x <= T52_lc1_borderX : x >= T52_lc1_borderX))
		&& (T52_lc2_horizontal ? T52_lc2_cached : (T52_lc2_leftOrAbove ? x <= T52_lc2_borderX : x >= T52_lc2_borderX))
		&& (T52_lc3_horizontal ? T52_lc3_cached : (T52_lc3_leftOrAbove ? x <= T52_lc3_borderX : x >= T52_lc3_borderX))
		) { r = T52_r; g = T52_g; b = T52_b; return true; } 

		if(T51_okay && x >= T51_minx && x <= T51_maxx
		&& (T51_lc1_horizontal ? T51_lc1_cached : (T51_lc1_leftOrAbove ? x <= T51_lc1_borderX : x >= T51_lc1_borderX))
		&& (T51_lc2_horizontal ? T51_lc2_cached : (T51_lc2_leftOrAbove ? x <= T51_lc2_borderX : x >= T51_lc2_borderX))
		&& (T51_lc3_horizontal ? T51_lc3_cached : (T51_lc3_leftOrAbove ? x <= T51_lc3_borderX : x >= T51_lc3_borderX))
		) { r = T51_r; g = T51_g; b = T51_b; return true; } 

		if(T50_okay && x >= T50_minx && x <= T50_maxx
		&& (T50_lc1_horizontal ? T50_lc1_cached : (T50_lc1_leftOrAbove ? x <= T50_lc1_borderX : x >= T50_lc1_borderX))
		&& (T50_lc2_horizontal ? T50_lc2_cached : (T50_lc2_leftOrAbove ? x <= T50_lc2_borderX : x >= T50_lc2_borderX))
		&& (T50_lc3_horizontal ? T50_lc3_cached : (T50_lc3_leftOrAbove ? x <= T50_lc3_borderX : x >= T50_lc3_borderX))
		) { r = T50_r; g = T50_g; b = T50_b; return true; } 

		if(T49_okay && x >= T49_minx && x <= T49_maxx
		&& (T49_lc1_horizontal ? T49_lc1_cached : (T49_lc1_leftOrAbove ? x <= T49_lc1_borderX : x >= T49_lc1_borderX))
		&& (T49_lc2_horizontal ? T49_lc2_cached : (T49_lc2_leftOrAbove ? x <= T49_lc2_borderX : x >= T49_lc2_borderX))
		&& (T49_lc3_horizontal ? T49_lc3_cached : (T49_lc3_leftOrAbove ? x <= T49_lc3_borderX : x >= T49_lc3_borderX))
		) { r = T49_r; g = T49_g; b = T49_b; return true; } 

		if(T48_okay && x >= T48_minx && x <= T48_maxx
		&& (T48_lc1_horizontal ? T48_lc1_cached : (T48_lc1_leftOrAbove ? x <= T48_lc1_borderX : x >= T48_lc1_borderX))
		&& (T48_lc2_horizontal ? T48_lc2_cached : (T48_lc2_leftOrAbove ? x <= T48_lc2_borderX : x >= T48_lc2_borderX))
		&& (T48_lc3_horizontal ? T48_lc3_cached : (T48_lc3_leftOrAbove ? x <= T48_lc3_borderX : x >= T48_lc3_borderX))
		) { r = T48_r; g = T48_g; b = T48_b; return true; } 

		if(T47_okay && x >= T47_minx && x <= T47_maxx
		&& (T47_lc1_horizontal ? T47_lc1_cached : (T47_lc1_leftOrAbove ? x <= T47_lc1_borderX : x >= T47_lc1_borderX))
		&& (T47_lc2_horizontal ? T47_lc2_cached : (T47_lc2_leftOrAbove ? x <= T47_lc2_borderX : x >= T47_lc2_borderX))
		&& (T47_lc3_horizontal ? T47_lc3_cached : (T47_lc3_leftOrAbove ? x <= T47_lc3_borderX : x >= T47_lc3_borderX))
		) { r = T47_r; g = T47_g; b = T47_b; return true; } 

		if(T46_okay && x >= T46_minx && x <= T46_maxx
		&& (T46_lc1_horizontal ? T46_lc1_cached : (T46_lc1_leftOrAbove ? x <= T46_lc1_borderX : x >= T46_lc1_borderX))
		&& (T46_lc2_horizontal ? T46_lc2_cached : (T46_lc2_leftOrAbove ? x <= T46_lc2_borderX : x >= T46_lc2_borderX))
		&& (T46_lc3_horizontal ? T46_lc3_cached : (T46_lc3_leftOrAbove ? x <= T46_lc3_borderX : x >= T46_lc3_borderX))
		) { r = T46_r; g = T46_g; b = T46_b; return true; } 

		if(T45_okay && x >= T45_minx && x <= T45_maxx
		&& (T45_lc1_horizontal ? T45_lc1_cached : (T45_lc1_leftOrAbove ? x <= T45_lc1_borderX : x >= T45_lc1_borderX))
		&& (T45_lc2_horizontal ? T45_lc2_cached : (T45_lc2_leftOrAbove ? x <= T45_lc2_borderX : x >= T45_lc2_borderX))
		&& (T45_lc3_horizontal ? T45_lc3_cached : (T45_lc3_leftOrAbove ? x <= T45_lc3_borderX : x >= T45_lc3_borderX))
		) { r = T45_r; g = T45_g; b = T45_b; return true; } 

		if(T44_okay && x >= T44_minx && x <= T44_maxx
		&& (T44_lc1_horizontal ? T44_lc1_cached : (T44_lc1_leftOrAbove ? x <= T44_lc1_borderX : x >= T44_lc1_borderX))
		&& (T44_lc2_horizontal ? T44_lc2_cached : (T44_lc2_leftOrAbove ? x <= T44_lc2_borderX : x >= T44_lc2_borderX))
		&& (T44_lc3_horizontal ? T44_lc3_cached : (T44_lc3_leftOrAbove ? x <= T44_lc3_borderX : x >= T44_lc3_borderX))
		) { r = T44_r; g = T44_g; b = T44_b; return true; } 

		if(T43_okay && x >= T43_minx && x <= T43_maxx
		&& (T43_lc1_horizontal ? T43_lc1_cached : (T43_lc1_leftOrAbove ? x <= T43_lc1_borderX : x >= T43_lc1_borderX))
		&& (T43_lc2_horizontal ? T43_lc2_cached : (T43_lc2_leftOrAbove ? x <= T43_lc2_borderX : x >= T43_lc2_borderX))
		&& (T43_lc3_horizontal ? T43_lc3_cached : (T43_lc3_leftOrAbove ? x <= T43_lc3_borderX : x >= T43_lc3_borderX))
		) { r = T43_r; g = T43_g; b = T43_b; return true; } 

		if(T42_okay && x >= T42_minx && x <= T42_maxx
		&& (T42_lc1_horizontal ? T42_lc1_cached : (T42_lc1_leftOrAbove ? x <= T42_lc1_borderX : x >= T42_lc1_borderX))
		&& (T42_lc2_horizontal ? T42_lc2_cached : (T42_lc2_leftOrAbove ? x <= T42_lc2_borderX : x >= T42_lc2_borderX))
		&& (T42_lc3_horizontal ? T42_lc3_cached : (T42_lc3_leftOrAbove ? x <= T42_lc3_borderX : x >= T42_lc3_borderX))
		) { r = T42_r; g = T42_g; b = T42_b; return true; } 

		if(T41_okay && x >= T41_minx && x <= T41_maxx
		&& (T41_lc1_horizontal ? T41_lc1_cached : (T41_lc1_leftOrAbove ? x <= T41_lc1_borderX : x >= T41_lc1_borderX))
		&& (T41_lc2_horizontal ? T41_lc2_cached : (T41_lc2_leftOrAbove ? x <= T41_lc2_borderX : x >= T41_lc2_borderX))
		&& (T41_lc3_horizontal ? T41_lc3_cached : (T41_lc3_leftOrAbove ? x <= T41_lc3_borderX : x >= T41_lc3_borderX))
		) { r = T41_r; g = T41_g; b = T41_b; return true; } 

		if(T40_okay && x >= T40_minx && x <= T40_maxx
		&& (T40_lc1_horizontal ? T40_lc1_cached : (T40_lc1_leftOrAbove ? x <= T40_lc1_borderX : x >= T40_lc1_borderX))
		&& (T40_lc2_horizontal ? T40_lc2_cached : (T40_lc2_leftOrAbove ? x <= T40_lc2_borderX : x >= T40_lc2_borderX))
		&& (T40_lc3_horizontal ? T40_lc3_cached : (T40_lc3_leftOrAbove ? x <= T40_lc3_borderX : x >= T40_lc3_borderX))
		) { r = T40_r; g = T40_g; b = T40_b; return true; } 

		if(T39_okay && x >= T39_minx && x <= T39_maxx
		&& (T39_lc1_horizontal ? T39_lc1_cached : (T39_lc1_leftOrAbove ? x <= T39_lc1_borderX : x >= T39_lc1_borderX))
		&& (T39_lc2_horizontal ? T39_lc2_cached : (T39_lc2_leftOrAbove ? x <= T39_lc2_borderX : x >= T39_lc2_borderX))
		&& (T39_lc3_horizontal ? T39_lc3_cached : (T39_lc3_leftOrAbove ? x <= T39_lc3_borderX : x >= T39_lc3_borderX))
		) { r = T39_r; g = T39_g; b = T39_b; return true; } 

		if(T38_okay && x >= T38_minx && x <= T38_maxx
		&& (T38_lc1_horizontal ? T38_lc1_cached : (T38_lc1_leftOrAbove ? x <= T38_lc1_borderX : x >= T38_lc1_borderX))
		&& (T38_lc2_horizontal ? T38_lc2_cached : (T38_lc2_leftOrAbove ? x <= T38_lc2_borderX : x >= T38_lc2_borderX))
		&& (T38_lc3_horizontal ? T38_lc3_cached : (T38_lc3_leftOrAbove ? x <= T38_lc3_borderX : x >= T38_lc3_borderX))
		) { r = T38_r; g = T38_g; b = T38_b; return true; } 

		if(T37_okay && x >= T37_minx && x <= T37_maxx
		&& (T37_lc1_horizontal ? T37_lc1_cached : (T37_lc1_leftOrAbove ? x <= T37_lc1_borderX : x >= T37_lc1_borderX))
		&& (T37_lc2_horizontal ? T37_lc2_cached : (T37_lc2_leftOrAbove ? x <= T37_lc2_borderX : x >= T37_lc2_borderX))
		&& (T37_lc3_horizontal ? T37_lc3_cached : (T37_lc3_leftOrAbove ? x <= T37_lc3_borderX : x >= T37_lc3_borderX))
		) { r = T37_r; g = T37_g; b = T37_b; return true; } 

		if(T36_okay && x >= T36_minx && x <= T36_maxx
		&& (T36_lc1_horizontal ? T36_lc1_cached : (T36_lc1_leftOrAbove ? x <= T36_lc1_borderX : x >= T36_lc1_borderX))
		&& (T36_lc2_horizontal ? T36_lc2_cached : (T36_lc2_leftOrAbove ? x <= T36_lc2_borderX : x >= T36_lc2_borderX))
		&& (T36_lc3_horizontal ? T36_lc3_cached : (T36_lc3_leftOrAbove ? x <= T36_lc3_borderX : x >= T36_lc3_borderX))
		) { r = T36_r; g = T36_g; b = T36_b; return true; } 

		if(T35_okay && x >= T35_minx && x <= T35_maxx
		&& (T35_lc1_horizontal ? T35_lc1_cached : (T35_lc1_leftOrAbove ? x <= T35_lc1_borderX : x >= T35_lc1_borderX))
		&& (T35_lc2_horizontal ? T35_lc2_cached : (T35_lc2_leftOrAbove ? x <= T35_lc2_borderX : x >= T35_lc2_borderX))
		&& (T35_lc3_horizontal ? T35_lc3_cached : (T35_lc3_leftOrAbove ? x <= T35_lc3_borderX : x >= T35_lc3_borderX))
		) { r = T35_r; g = T35_g; b = T35_b; return true; } 

		if(T34_okay && x >= T34_minx && x <= T34_maxx
		&& (T34_lc1_horizontal ? T34_lc1_cached : (T34_lc1_leftOrAbove ? x <= T34_lc1_borderX : x >= T34_lc1_borderX))
		&& (T34_lc2_horizontal ? T34_lc2_cached : (T34_lc2_leftOrAbove ? x <= T34_lc2_borderX : x >= T34_lc2_borderX))
		&& (T34_lc3_horizontal ? T34_lc3_cached : (T34_lc3_leftOrAbove ? x <= T34_lc3_borderX : x >= T34_lc3_borderX))
		) { r = T34_r; g = T34_g; b = T34_b; return true; } 

		if(T33_okay && x >= T33_minx && x <= T33_maxx
		&& (T33_lc1_horizontal ? T33_lc1_cached : (T33_lc1_leftOrAbove ? x <= T33_lc1_borderX : x >= T33_lc1_borderX))
		&& (T33_lc2_horizontal ? T33_lc2_cached : (T33_lc2_leftOrAbove ? x <= T33_lc2_borderX : x >= T33_lc2_borderX))
		&& (T33_lc3_horizontal ? T33_lc3_cached : (T33_lc3_leftOrAbove ? x <= T33_lc3_borderX : x >= T33_lc3_borderX))
		) { r = T33_r; g = T33_g; b = T33_b; return true; } 

		if(T32_okay && x >= T32_minx && x <= T32_maxx
		&& (T32_lc1_horizontal ? T32_lc1_cached : (T32_lc1_leftOrAbove ? x <= T32_lc1_borderX : x >= T32_lc1_borderX))
		&& (T32_lc2_horizontal ? T32_lc2_cached : (T32_lc2_leftOrAbove ? x <= T32_lc2_borderX : x >= T32_lc2_borderX))
		&& (T32_lc3_horizontal ? T32_lc3_cached : (T32_lc3_leftOrAbove ? x <= T32_lc3_borderX : x >= T32_lc3_borderX))
		) { r = T32_r; g = T32_g; b = T32_b; return true; } 

		if(T31_okay && x >= T31_minx && x <= T31_maxx
		&& (T31_lc1_horizontal ? T31_lc1_cached : (T31_lc1_leftOrAbove ? x <= T31_lc1_borderX : x >= T31_lc1_borderX))
		&& (T31_lc2_horizontal ? T31_lc2_cached : (T31_lc2_leftOrAbove ? x <= T31_lc2_borderX : x >= T31_lc2_borderX))
		&& (T31_lc3_horizontal ? T31_lc3_cached : (T31_lc3_leftOrAbove ? x <= T31_lc3_borderX : x >= T31_lc3_borderX))
		) { r = T31_r; g = T31_g; b = T31_b; return true; } 

		if(T30_okay && x >= T30_minx && x <= T30_maxx
		&& (T30_lc1_horizontal ? T30_lc1_cached : (T30_lc1_leftOrAbove ? x <= T30_lc1_borderX : x >= T30_lc1_borderX))
		&& (T30_lc2_horizontal ? T30_lc2_cached : (T30_lc2_leftOrAbove ? x <= T30_lc2_borderX : x >= T30_lc2_borderX))
		&& (T30_lc3_horizontal ? T30_lc3_cached : (T30_lc3_leftOrAbove ? x <= T30_lc3_borderX : x >= T30_lc3_borderX))
		) { r = T30_r; g = T30_g; b = T30_b; return true; } 

		return false;
	}

	private boolean drawPart10() {
		if(T29_okay && x >= T29_minx && x <= T29_maxx
		&& (T29_lc1_horizontal ? T29_lc1_cached : (T29_lc1_leftOrAbove ? x <= T29_lc1_borderX : x >= T29_lc1_borderX))
		&& (T29_lc2_horizontal ? T29_lc2_cached : (T29_lc2_leftOrAbove ? x <= T29_lc2_borderX : x >= T29_lc2_borderX))
		&& (T29_lc3_horizontal ? T29_lc3_cached : (T29_lc3_leftOrAbove ? x <= T29_lc3_borderX : x >= T29_lc3_borderX))
		) { r = T29_r; g = T29_g; b = T29_b; return true; } 

		if(T28_okay && x >= T28_minx && x <= T28_maxx
		&& (T28_lc1_horizontal ? T28_lc1_cached : (T28_lc1_leftOrAbove ? x <= T28_lc1_borderX : x >= T28_lc1_borderX))
		&& (T28_lc2_horizontal ? T28_lc2_cached : (T28_lc2_leftOrAbove ? x <= T28_lc2_borderX : x >= T28_lc2_borderX))
		&& (T28_lc3_horizontal ? T28_lc3_cached : (T28_lc3_leftOrAbove ? x <= T28_lc3_borderX : x >= T28_lc3_borderX))
		) { r = T28_r; g = T28_g; b = T28_b; return true; } 

		if(T27_okay && x >= T27_minx && x <= T27_maxx
		&& (T27_lc1_horizontal ? T27_lc1_cached : (T27_lc1_leftOrAbove ? x <= T27_lc1_borderX : x >= T27_lc1_borderX))
		&& (T27_lc2_horizontal ? T27_lc2_cached : (T27_lc2_leftOrAbove ? x <= T27_lc2_borderX : x >= T27_lc2_borderX))
		&& (T27_lc3_horizontal ? T27_lc3_cached : (T27_lc3_leftOrAbove ? x <= T27_lc3_borderX : x >= T27_lc3_borderX))
		) { r = T27_r; g = T27_g; b = T27_b; return true; } 

		if(T26_okay && x >= T26_minx && x <= T26_maxx
		&& (T26_lc1_horizontal ? T26_lc1_cached : (T26_lc1_leftOrAbove ? x <= T26_lc1_borderX : x >= T26_lc1_borderX))
		&& (T26_lc2_horizontal ? T26_lc2_cached : (T26_lc2_leftOrAbove ? x <= T26_lc2_borderX : x >= T26_lc2_borderX))
		&& (T26_lc3_horizontal ? T26_lc3_cached : (T26_lc3_leftOrAbove ? x <= T26_lc3_borderX : x >= T26_lc3_borderX))
		) { r = T26_r; g = T26_g; b = T26_b; return true; } 

		if(T25_okay && x >= T25_minx && x <= T25_maxx
		&& (T25_lc1_horizontal ? T25_lc1_cached : (T25_lc1_leftOrAbove ? x <= T25_lc1_borderX : x >= T25_lc1_borderX))
		&& (T25_lc2_horizontal ? T25_lc2_cached : (T25_lc2_leftOrAbove ? x <= T25_lc2_borderX : x >= T25_lc2_borderX))
		&& (T25_lc3_horizontal ? T25_lc3_cached : (T25_lc3_leftOrAbove ? x <= T25_lc3_borderX : x >= T25_lc3_borderX))
		) { r = T25_r; g = T25_g; b = T25_b; return true; } 

		if(T24_okay && x >= T24_minx && x <= T24_maxx
		&& (T24_lc1_horizontal ? T24_lc1_cached : (T24_lc1_leftOrAbove ? x <= T24_lc1_borderX : x >= T24_lc1_borderX))
		&& (T24_lc2_horizontal ? T24_lc2_cached : (T24_lc2_leftOrAbove ? x <= T24_lc2_borderX : x >= T24_lc2_borderX))
		&& (T24_lc3_horizontal ? T24_lc3_cached : (T24_lc3_leftOrAbove ? x <= T24_lc3_borderX : x >= T24_lc3_borderX))
		) { r = T24_r; g = T24_g; b = T24_b; return true; } 

		if(T23_okay && x >= T23_minx && x <= T23_maxx
		&& (T23_lc1_horizontal ? T23_lc1_cached : (T23_lc1_leftOrAbove ? x <= T23_lc1_borderX : x >= T23_lc1_borderX))
		&& (T23_lc2_horizontal ? T23_lc2_cached : (T23_lc2_leftOrAbove ? x <= T23_lc2_borderX : x >= T23_lc2_borderX))
		&& (T23_lc3_horizontal ? T23_lc3_cached : (T23_lc3_leftOrAbove ? x <= T23_lc3_borderX : x >= T23_lc3_borderX))
		) { r = T23_r; g = T23_g; b = T23_b; return true; } 

		if(T22_okay && x >= T22_minx && x <= T22_maxx
		&& (T22_lc1_horizontal ? T22_lc1_cached : (T22_lc1_leftOrAbove ? x <= T22_lc1_borderX : x >= T22_lc1_borderX))
		&& (T22_lc2_horizontal ? T22_lc2_cached : (T22_lc2_leftOrAbove ? x <= T22_lc2_borderX : x >= T22_lc2_borderX))
		&& (T22_lc3_horizontal ? T22_lc3_cached : (T22_lc3_leftOrAbove ? x <= T22_lc3_borderX : x >= T22_lc3_borderX))
		) { r = T22_r; g = T22_g; b = T22_b; return true; } 

		if(T21_okay && x >= T21_minx && x <= T21_maxx
		&& (T21_lc1_horizontal ? T21_lc1_cached : (T21_lc1_leftOrAbove ? x <= T21_lc1_borderX : x >= T21_lc1_borderX))
		&& (T21_lc2_horizontal ? T21_lc2_cached : (T21_lc2_leftOrAbove ? x <= T21_lc2_borderX : x >= T21_lc2_borderX))
		&& (T21_lc3_horizontal ? T21_lc3_cached : (T21_lc3_leftOrAbove ? x <= T21_lc3_borderX : x >= T21_lc3_borderX))
		) { r = T21_r; g = T21_g; b = T21_b; return true; } 

		if(T20_okay && x >= T20_minx && x <= T20_maxx
		&& (T20_lc1_horizontal ? T20_lc1_cached : (T20_lc1_leftOrAbove ? x <= T20_lc1_borderX : x >= T20_lc1_borderX))
		&& (T20_lc2_horizontal ? T20_lc2_cached : (T20_lc2_leftOrAbove ? x <= T20_lc2_borderX : x >= T20_lc2_borderX))
		&& (T20_lc3_horizontal ? T20_lc3_cached : (T20_lc3_leftOrAbove ? x <= T20_lc3_borderX : x >= T20_lc3_borderX))
		) { r = T20_r; g = T20_g; b = T20_b; return true; } 

		if(T19_okay && x >= T19_minx && x <= T19_maxx
		&& (T19_lc1_horizontal ? T19_lc1_cached : (T19_lc1_leftOrAbove ? x <= T19_lc1_borderX : x >= T19_lc1_borderX))
		&& (T19_lc2_horizontal ? T19_lc2_cached : (T19_lc2_leftOrAbove ? x <= T19_lc2_borderX : x >= T19_lc2_borderX))
		&& (T19_lc3_horizontal ? T19_lc3_cached : (T19_lc3_leftOrAbove ? x <= T19_lc3_borderX : x >= T19_lc3_borderX))
		) { r = T19_r; g = T19_g; b = T19_b; return true; } 

		if(T18_okay && x >= T18_minx && x <= T18_maxx
		&& (T18_lc1_horizontal ? T18_lc1_cached : (T18_lc1_leftOrAbove ? x <= T18_lc1_borderX : x >= T18_lc1_borderX))
		&& (T18_lc2_horizontal ? T18_lc2_cached : (T18_lc2_leftOrAbove ? x <= T18_lc2_borderX : x >= T18_lc2_borderX))
		&& (T18_lc3_horizontal ? T18_lc3_cached : (T18_lc3_leftOrAbove ? x <= T18_lc3_borderX : x >= T18_lc3_borderX))
		) { r = T18_r; g = T18_g; b = T18_b; return true; } 

		if(T17_okay && x >= T17_minx && x <= T17_maxx
		&& (T17_lc1_horizontal ? T17_lc1_cached : (T17_lc1_leftOrAbove ? x <= T17_lc1_borderX : x >= T17_lc1_borderX))
		&& (T17_lc2_horizontal ? T17_lc2_cached : (T17_lc2_leftOrAbove ? x <= T17_lc2_borderX : x >= T17_lc2_borderX))
		&& (T17_lc3_horizontal ? T17_lc3_cached : (T17_lc3_leftOrAbove ? x <= T17_lc3_borderX : x >= T17_lc3_borderX))
		) { r = T17_r; g = T17_g; b = T17_b; return true; } 

		if(T16_okay && x >= T16_minx && x <= T16_maxx
		&& (T16_lc1_horizontal ? T16_lc1_cached : (T16_lc1_leftOrAbove ? x <= T16_lc1_borderX : x >= T16_lc1_borderX))
		&& (T16_lc2_horizontal ? T16_lc2_cached : (T16_lc2_leftOrAbove ? x <= T16_lc2_borderX : x >= T16_lc2_borderX))
		&& (T16_lc3_horizontal ? T16_lc3_cached : (T16_lc3_leftOrAbove ? x <= T16_lc3_borderX : x >= T16_lc3_borderX))
		) { r = T16_r; g = T16_g; b = T16_b; return true; } 

		if(T15_okay && x >= T15_minx && x <= T15_maxx
		&& (T15_lc1_horizontal ? T15_lc1_cached : (T15_lc1_leftOrAbove ? x <= T15_lc1_borderX : x >= T15_lc1_borderX))
		&& (T15_lc2_horizontal ? T15_lc2_cached : (T15_lc2_leftOrAbove ? x <= T15_lc2_borderX : x >= T15_lc2_borderX))
		&& (T15_lc3_horizontal ? T15_lc3_cached : (T15_lc3_leftOrAbove ? x <= T15_lc3_borderX : x >= T15_lc3_borderX))
		) { r = T15_r; g = T15_g; b = T15_b; return true; } 

		if(T14_okay && x >= T14_minx && x <= T14_maxx
		&& (T14_lc1_horizontal ? T14_lc1_cached : (T14_lc1_leftOrAbove ? x <= T14_lc1_borderX : x >= T14_lc1_borderX))
		&& (T14_lc2_horizontal ? T14_lc2_cached : (T14_lc2_leftOrAbove ? x <= T14_lc2_borderX : x >= T14_lc2_borderX))
		&& (T14_lc3_horizontal ? T14_lc3_cached : (T14_lc3_leftOrAbove ? x <= T14_lc3_borderX : x >= T14_lc3_borderX))
		) { r = T14_r; g = T14_g; b = T14_b; return true; } 

		if(T13_okay && x >= T13_minx && x <= T13_maxx
		&& (T13_lc1_horizontal ? T13_lc1_cached : (T13_lc1_leftOrAbove ? x <= T13_lc1_borderX : x >= T13_lc1_borderX))
		&& (T13_lc2_horizontal ? T13_lc2_cached : (T13_lc2_leftOrAbove ? x <= T13_lc2_borderX : x >= T13_lc2_borderX))
		&& (T13_lc3_horizontal ? T13_lc3_cached : (T13_lc3_leftOrAbove ? x <= T13_lc3_borderX : x >= T13_lc3_borderX))
		) { r = T13_r; g = T13_g; b = T13_b; return true; } 

		if(T12_okay && x >= T12_minx && x <= T12_maxx
		&& (T12_lc1_horizontal ? T12_lc1_cached : (T12_lc1_leftOrAbove ? x <= T12_lc1_borderX : x >= T12_lc1_borderX))
		&& (T12_lc2_horizontal ? T12_lc2_cached : (T12_lc2_leftOrAbove ? x <= T12_lc2_borderX : x >= T12_lc2_borderX))
		&& (T12_lc3_horizontal ? T12_lc3_cached : (T12_lc3_leftOrAbove ? x <= T12_lc3_borderX : x >= T12_lc3_borderX))
		) { r = T12_r; g = T12_g; b = T12_b; return true; } 

		if(T11_okay && x >= T11_minx && x <= T11_maxx
		&& (T11_lc1_horizontal ? T11_lc1_cached : (T11_lc1_leftOrAbove ? x <= T11_lc1_borderX : x >= T11_lc1_borderX))
		&& (T11_lc2_horizontal ? T11_lc2_cached : (T11_lc2_leftOrAbove ? x <= T11_lc2_borderX : x >= T11_lc2_borderX))
		&& (T11_lc3_horizontal ? T11_lc3_cached : (T11_lc3_leftOrAbove ? x <= T11_lc3_borderX : x >= T11_lc3_borderX))
		) { r = T11_r; g = T11_g; b = T11_b; return true; } 

		if(T10_okay && x >= T10_minx && x <= T10_maxx
		&& (T10_lc1_horizontal ? T10_lc1_cached : (T10_lc1_leftOrAbove ? x <= T10_lc1_borderX : x >= T10_lc1_borderX))
		&& (T10_lc2_horizontal ? T10_lc2_cached : (T10_lc2_leftOrAbove ? x <= T10_lc2_borderX : x >= T10_lc2_borderX))
		&& (T10_lc3_horizontal ? T10_lc3_cached : (T10_lc3_leftOrAbove ? x <= T10_lc3_borderX : x >= T10_lc3_borderX))
		) { r = T10_r; g = T10_g; b = T10_b; return true; } 

		if(T9_okay && x >= T9_minx && x <= T9_maxx
		&& (T9_lc1_horizontal ? T9_lc1_cached : (T9_lc1_leftOrAbove ? x <= T9_lc1_borderX : x >= T9_lc1_borderX))
		&& (T9_lc2_horizontal ? T9_lc2_cached : (T9_lc2_leftOrAbove ? x <= T9_lc2_borderX : x >= T9_lc2_borderX))
		&& (T9_lc3_horizontal ? T9_lc3_cached : (T9_lc3_leftOrAbove ? x <= T9_lc3_borderX : x >= T9_lc3_borderX))
		) { r = T9_r; g = T9_g; b = T9_b; return true; } 

		if(T8_okay && x >= T8_minx && x <= T8_maxx
		&& (T8_lc1_horizontal ? T8_lc1_cached : (T8_lc1_leftOrAbove ? x <= T8_lc1_borderX : x >= T8_lc1_borderX))
		&& (T8_lc2_horizontal ? T8_lc2_cached : (T8_lc2_leftOrAbove ? x <= T8_lc2_borderX : x >= T8_lc2_borderX))
		&& (T8_lc3_horizontal ? T8_lc3_cached : (T8_lc3_leftOrAbove ? x <= T8_lc3_borderX : x >= T8_lc3_borderX))
		) { r = T8_r; g = T8_g; b = T8_b; return true; } 

		if(T7_okay && x >= T7_minx && x <= T7_maxx
		&& (T7_lc1_horizontal ? T7_lc1_cached : (T7_lc1_leftOrAbove ? x <= T7_lc1_borderX : x >= T7_lc1_borderX))
		&& (T7_lc2_horizontal ? T7_lc2_cached : (T7_lc2_leftOrAbove ? x <= T7_lc2_borderX : x >= T7_lc2_borderX))
		&& (T7_lc3_horizontal ? T7_lc3_cached : (T7_lc3_leftOrAbove ? x <= T7_lc3_borderX : x >= T7_lc3_borderX))
		) { r = T7_r; g = T7_g; b = T7_b; return true; } 

		if(T6_okay && x >= T6_minx && x <= T6_maxx
		&& (T6_lc1_horizontal ? T6_lc1_cached : (T6_lc1_leftOrAbove ? x <= T6_lc1_borderX : x >= T6_lc1_borderX))
		&& (T6_lc2_horizontal ? T6_lc2_cached : (T6_lc2_leftOrAbove ? x <= T6_lc2_borderX : x >= T6_lc2_borderX))
		&& (T6_lc3_horizontal ? T6_lc3_cached : (T6_lc3_leftOrAbove ? x <= T6_lc3_borderX : x >= T6_lc3_borderX))
		) { r = T6_r; g = T6_g; b = T6_b; return true; } 

		if(T5_okay && x >= T5_minx && x <= T5_maxx
		&& (T5_lc1_horizontal ? T5_lc1_cached : (T5_lc1_leftOrAbove ? x <= T5_lc1_borderX : x >= T5_lc1_borderX))
		&& (T5_lc2_horizontal ? T5_lc2_cached : (T5_lc2_leftOrAbove ? x <= T5_lc2_borderX : x >= T5_lc2_borderX))
		&& (T5_lc3_horizontal ? T5_lc3_cached : (T5_lc3_leftOrAbove ? x <= T5_lc3_borderX : x >= T5_lc3_borderX))
		) { r = T5_r; g = T5_g; b = T5_b; return true; } 

		if(T4_okay && x >= T4_minx && x <= T4_maxx
		&& (T4_lc1_horizontal ? T4_lc1_cached : (T4_lc1_leftOrAbove ? x <= T4_lc1_borderX : x >= T4_lc1_borderX))
		&& (T4_lc2_horizontal ? T4_lc2_cached : (T4_lc2_leftOrAbove ? x <= T4_lc2_borderX : x >= T4_lc2_borderX))
		&& (T4_lc3_horizontal ? T4_lc3_cached : (T4_lc3_leftOrAbove ? x <= T4_lc3_borderX : x >= T4_lc3_borderX))
		) { r = T4_r; g = T4_g; b = T4_b; return true; } 

		if(T3_okay && x >= T3_minx && x <= T3_maxx
		&& (T3_lc1_horizontal ? T3_lc1_cached : (T3_lc1_leftOrAbove ? x <= T3_lc1_borderX : x >= T3_lc1_borderX))
		&& (T3_lc2_horizontal ? T3_lc2_cached : (T3_lc2_leftOrAbove ? x <= T3_lc2_borderX : x >= T3_lc2_borderX))
		&& (T3_lc3_horizontal ? T3_lc3_cached : (T3_lc3_leftOrAbove ? x <= T3_lc3_borderX : x >= T3_lc3_borderX))
		) { r = T3_r; g = T3_g; b = T3_b; return true; } 

		if(T2_okay && x >= T2_minx && x <= T2_maxx
		&& (T2_lc1_horizontal ? T2_lc1_cached : (T2_lc1_leftOrAbove ? x <= T2_lc1_borderX : x >= T2_lc1_borderX))
		&& (T2_lc2_horizontal ? T2_lc2_cached : (T2_lc2_leftOrAbove ? x <= T2_lc2_borderX : x >= T2_lc2_borderX))
		&& (T2_lc3_horizontal ? T2_lc3_cached : (T2_lc3_leftOrAbove ? x <= T2_lc3_borderX : x >= T2_lc3_borderX))
		) { r = T2_r; g = T2_g; b = T2_b; return true; } 

		if(T1_okay && x >= T1_minx && x <= T1_maxx
		&& (T1_lc1_horizontal ? T1_lc1_cached : (T1_lc1_leftOrAbove ? x <= T1_lc1_borderX : x >= T1_lc1_borderX))
		&& (T1_lc2_horizontal ? T1_lc2_cached : (T1_lc2_leftOrAbove ? x <= T1_lc2_borderX : x >= T1_lc2_borderX))
		&& (T1_lc3_horizontal ? T1_lc3_cached : (T1_lc3_leftOrAbove ? x <= T1_lc3_borderX : x >= T1_lc3_borderX))
		) { r = T1_r; g = T1_g; b = T1_b; return true; } 

		if(T0_okay && x >= T0_minx && x <= T0_maxx
		&& (T0_lc1_horizontal ? T0_lc1_cached : (T0_lc1_leftOrAbove ? x <= T0_lc1_borderX : x >= T0_lc1_borderX))
		&& (T0_lc2_horizontal ? T0_lc2_cached : (T0_lc2_leftOrAbove ? x <= T0_lc2_borderX : x >= T0_lc2_borderX))
		&& (T0_lc3_horizontal ? T0_lc3_cached : (T0_lc3_leftOrAbove ? x <= T0_lc3_borderX : x >= T0_lc3_borderX))
		) { r = T0_r; g = T0_g; b = T0_b; return true; } 

		return false;
	}

	public void draw(int[] rgb, int width, int height, MultipleTriangles mt, int clearR, int clearG, int clearB) {
		SingleTriangle[] triangles = mt.triangles;
		loader.loadTriangles(triangles);

		offset = 0;
		for(y = 0; y < height; y++) {
			moveToY(y);

			for(x = 0; x < width; x++) {
				r = clearR; g = clearG; b = clearB;
				if(!drawPart1())
				if(!drawPart2())
				if(!drawPart3())
				if(!drawPart4())
				if(!drawPart5())
				if(!drawPart6())
				if(!drawPart7())
				if(!drawPart8())
				if(!drawPart9())
				drawPart10();
				rgb[offset++] = r; rgb[offset++] = g; rgb[offset++] = b;
			}

		}

	}
}
