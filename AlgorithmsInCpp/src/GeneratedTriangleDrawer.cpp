using namespace std;

class GeneratedTriangleDrawer {
private:

	int T0_initializedWithValidData = false, T0_okay = false;
	double T0_sx, T0_sy, T0_minx, T0_miny, T0_maxx, T0_maxy;

	int T0_lc1_horizontal, T0_lc1_vertical, T0_lc1_leftOrAbove, T0_lc1_cached;
	double T0_lc1_m, T0_lc1_C, T0_lc1_borderX, T0_lc1_borderY;

	int T0_lc2_horizontal, T0_lc2_vertical, T0_lc2_leftOrAbove, T0_lc2_cached;
	double T0_lc2_m, T0_lc2_C, T0_lc2_borderX, T0_lc2_borderY;

	int T0_lc3_horizontal, T0_lc3_vertical, T0_lc3_leftOrAbove, T0_lc3_cached;
	double T0_lc3_m, T0_lc3_C, T0_lc3_borderX, T0_lc3_borderY;

	int T0_lc1_lastY = Integer.MIN_VALUE, T0_lc2_lastY = Integer.MIN_VALUE, T0_lc3_lastY = Integer.MIN_VALUE;
	int T0_r, T0_g, T0_b;

	int T1_initializedWithValidData = false, T1_okay = false;
	double T1_sx, T1_sy, T1_minx, T1_miny, T1_maxx, T1_maxy;

	int T1_lc1_horizontal, T1_lc1_vertical, T1_lc1_leftOrAbove, T1_lc1_cached;
	double T1_lc1_m, T1_lc1_C, T1_lc1_borderX, T1_lc1_borderY;

	int T1_lc2_horizontal, T1_lc2_vertical, T1_lc2_leftOrAbove, T1_lc2_cached;
	double T1_lc2_m, T1_lc2_C, T1_lc2_borderX, T1_lc2_borderY;

	int T1_lc3_horizontal, T1_lc3_vertical, T1_lc3_leftOrAbove, T1_lc3_cached;
	double T1_lc3_m, T1_lc3_C, T1_lc3_borderX, T1_lc3_borderY;

	int T1_lc1_lastY = Integer.MIN_VALUE, T1_lc2_lastY = Integer.MIN_VALUE, T1_lc3_lastY = Integer.MIN_VALUE;
	int T1_r, T1_g, T1_b;

	int T2_initializedWithValidData = false, T2_okay = false;
	double T2_sx, T2_sy, T2_minx, T2_miny, T2_maxx, T2_maxy;

	int T2_lc1_horizontal, T2_lc1_vertical, T2_lc1_leftOrAbove, T2_lc1_cached;
	double T2_lc1_m, T2_lc1_C, T2_lc1_borderX, T2_lc1_borderY;

	int T2_lc2_horizontal, T2_lc2_vertical, T2_lc2_leftOrAbove, T2_lc2_cached;
	double T2_lc2_m, T2_lc2_C, T2_lc2_borderX, T2_lc2_borderY;

	int T2_lc3_horizontal, T2_lc3_vertical, T2_lc3_leftOrAbove, T2_lc3_cached;
	double T2_lc3_m, T2_lc3_C, T2_lc3_borderX, T2_lc3_borderY;

	int T2_lc1_lastY = Integer.MIN_VALUE, T2_lc2_lastY = Integer.MIN_VALUE, T2_lc3_lastY = Integer.MIN_VALUE;
	int T2_r, T2_g, T2_b;

	int T3_initializedWithValidData = false, T3_okay = false;
	double T3_sx, T3_sy, T3_minx, T3_miny, T3_maxx, T3_maxy;

	int T3_lc1_horizontal, T3_lc1_vertical, T3_lc1_leftOrAbove, T3_lc1_cached;
	double T3_lc1_m, T3_lc1_C, T3_lc1_borderX, T3_lc1_borderY;

	int T3_lc2_horizontal, T3_lc2_vertical, T3_lc2_leftOrAbove, T3_lc2_cached;
	double T3_lc2_m, T3_lc2_C, T3_lc2_borderX, T3_lc2_borderY;

	int T3_lc3_horizontal, T3_lc3_vertical, T3_lc3_leftOrAbove, T3_lc3_cached;
	double T3_lc3_m, T3_lc3_C, T3_lc3_borderX, T3_lc3_borderY;

	int T3_lc1_lastY = Integer.MIN_VALUE, T3_lc2_lastY = Integer.MIN_VALUE, T3_lc3_lastY = Integer.MIN_VALUE;
	int T3_r, T3_g, T3_b;

	int T4_initializedWithValidData = false, T4_okay = false;
	double T4_sx, T4_sy, T4_minx, T4_miny, T4_maxx, T4_maxy;

	int T4_lc1_horizontal, T4_lc1_vertical, T4_lc1_leftOrAbove, T4_lc1_cached;
	double T4_lc1_m, T4_lc1_C, T4_lc1_borderX, T4_lc1_borderY;

	int T4_lc2_horizontal, T4_lc2_vertical, T4_lc2_leftOrAbove, T4_lc2_cached;
	double T4_lc2_m, T4_lc2_C, T4_lc2_borderX, T4_lc2_borderY;

	int T4_lc3_horizontal, T4_lc3_vertical, T4_lc3_leftOrAbove, T4_lc3_cached;
	double T4_lc3_m, T4_lc3_C, T4_lc3_borderX, T4_lc3_borderY;

	int T4_lc1_lastY = Integer.MIN_VALUE, T4_lc2_lastY = Integer.MIN_VALUE, T4_lc3_lastY = Integer.MIN_VALUE;
	int T4_r, T4_g, T4_b;

	int T5_initializedWithValidData = false, T5_okay = false;
	double T5_sx, T5_sy, T5_minx, T5_miny, T5_maxx, T5_maxy;

	int T5_lc1_horizontal, T5_lc1_vertical, T5_lc1_leftOrAbove, T5_lc1_cached;
	double T5_lc1_m, T5_lc1_C, T5_lc1_borderX, T5_lc1_borderY;

	int T5_lc2_horizontal, T5_lc2_vertical, T5_lc2_leftOrAbove, T5_lc2_cached;
	double T5_lc2_m, T5_lc2_C, T5_lc2_borderX, T5_lc2_borderY;

	int T5_lc3_horizontal, T5_lc3_vertical, T5_lc3_leftOrAbove, T5_lc3_cached;
	double T5_lc3_m, T5_lc3_C, T5_lc3_borderX, T5_lc3_borderY;

	int T5_lc1_lastY = Integer.MIN_VALUE, T5_lc2_lastY = Integer.MIN_VALUE, T5_lc3_lastY = Integer.MIN_VALUE;
	int T5_r, T5_g, T5_b;

	int T6_initializedWithValidData = false, T6_okay = false;
	double T6_sx, T6_sy, T6_minx, T6_miny, T6_maxx, T6_maxy;

	int T6_lc1_horizontal, T6_lc1_vertical, T6_lc1_leftOrAbove, T6_lc1_cached;
	double T6_lc1_m, T6_lc1_C, T6_lc1_borderX, T6_lc1_borderY;

	int T6_lc2_horizontal, T6_lc2_vertical, T6_lc2_leftOrAbove, T6_lc2_cached;
	double T6_lc2_m, T6_lc2_C, T6_lc2_borderX, T6_lc2_borderY;

	int T6_lc3_horizontal, T6_lc3_vertical, T6_lc3_leftOrAbove, T6_lc3_cached;
	double T6_lc3_m, T6_lc3_C, T6_lc3_borderX, T6_lc3_borderY;

	int T6_lc1_lastY = Integer.MIN_VALUE, T6_lc2_lastY = Integer.MIN_VALUE, T6_lc3_lastY = Integer.MIN_VALUE;
	int T6_r, T6_g, T6_b;

	int T7_initializedWithValidData = false, T7_okay = false;
	double T7_sx, T7_sy, T7_minx, T7_miny, T7_maxx, T7_maxy;

	int T7_lc1_horizontal, T7_lc1_vertical, T7_lc1_leftOrAbove, T7_lc1_cached;
	double T7_lc1_m, T7_lc1_C, T7_lc1_borderX, T7_lc1_borderY;

	int T7_lc2_horizontal, T7_lc2_vertical, T7_lc2_leftOrAbove, T7_lc2_cached;
	double T7_lc2_m, T7_lc2_C, T7_lc2_borderX, T7_lc2_borderY;

	int T7_lc3_horizontal, T7_lc3_vertical, T7_lc3_leftOrAbove, T7_lc3_cached;
	double T7_lc3_m, T7_lc3_C, T7_lc3_borderX, T7_lc3_borderY;

	int T7_lc1_lastY = Integer.MIN_VALUE, T7_lc2_lastY = Integer.MIN_VALUE, T7_lc3_lastY = Integer.MIN_VALUE;
	int T7_r, T7_g, T7_b;

	int T8_initializedWithValidData = false, T8_okay = false;
	double T8_sx, T8_sy, T8_minx, T8_miny, T8_maxx, T8_maxy;

	int T8_lc1_horizontal, T8_lc1_vertical, T8_lc1_leftOrAbove, T8_lc1_cached;
	double T8_lc1_m, T8_lc1_C, T8_lc1_borderX, T8_lc1_borderY;

	int T8_lc2_horizontal, T8_lc2_vertical, T8_lc2_leftOrAbove, T8_lc2_cached;
	double T8_lc2_m, T8_lc2_C, T8_lc2_borderX, T8_lc2_borderY;

	int T8_lc3_horizontal, T8_lc3_vertical, T8_lc3_leftOrAbove, T8_lc3_cached;
	double T8_lc3_m, T8_lc3_C, T8_lc3_borderX, T8_lc3_borderY;

	int T8_lc1_lastY = Integer.MIN_VALUE, T8_lc2_lastY = Integer.MIN_VALUE, T8_lc3_lastY = Integer.MIN_VALUE;
	int T8_r, T8_g, T8_b;

	int T9_initializedWithValidData = false, T9_okay = false;
	double T9_sx, T9_sy, T9_minx, T9_miny, T9_maxx, T9_maxy;

	int T9_lc1_horizontal, T9_lc1_vertical, T9_lc1_leftOrAbove, T9_lc1_cached;
	double T9_lc1_m, T9_lc1_C, T9_lc1_borderX, T9_lc1_borderY;

	int T9_lc2_horizontal, T9_lc2_vertical, T9_lc2_leftOrAbove, T9_lc2_cached;
	double T9_lc2_m, T9_lc2_C, T9_lc2_borderX, T9_lc2_borderY;

	int T9_lc3_horizontal, T9_lc3_vertical, T9_lc3_leftOrAbove, T9_lc3_cached;
	double T9_lc3_m, T9_lc3_C, T9_lc3_borderX, T9_lc3_borderY;

	int T9_lc1_lastY = Integer.MIN_VALUE, T9_lc2_lastY = Integer.MIN_VALUE, T9_lc3_lastY = Integer.MIN_VALUE;
	int T9_r, T9_g, T9_b;

	int T10_initializedWithValidData = false, T10_okay = false;
	double T10_sx, T10_sy, T10_minx, T10_miny, T10_maxx, T10_maxy;

	int T10_lc1_horizontal, T10_lc1_vertical, T10_lc1_leftOrAbove, T10_lc1_cached;
	double T10_lc1_m, T10_lc1_C, T10_lc1_borderX, T10_lc1_borderY;

	int T10_lc2_horizontal, T10_lc2_vertical, T10_lc2_leftOrAbove, T10_lc2_cached;
	double T10_lc2_m, T10_lc2_C, T10_lc2_borderX, T10_lc2_borderY;

	int T10_lc3_horizontal, T10_lc3_vertical, T10_lc3_leftOrAbove, T10_lc3_cached;
	double T10_lc3_m, T10_lc3_C, T10_lc3_borderX, T10_lc3_borderY;

	int T10_lc1_lastY = Integer.MIN_VALUE, T10_lc2_lastY = Integer.MIN_VALUE, T10_lc3_lastY = Integer.MIN_VALUE;
	int T10_r, T10_g, T10_b;

	int T11_initializedWithValidData = false, T11_okay = false;
	double T11_sx, T11_sy, T11_minx, T11_miny, T11_maxx, T11_maxy;

	int T11_lc1_horizontal, T11_lc1_vertical, T11_lc1_leftOrAbove, T11_lc1_cached;
	double T11_lc1_m, T11_lc1_C, T11_lc1_borderX, T11_lc1_borderY;

	int T11_lc2_horizontal, T11_lc2_vertical, T11_lc2_leftOrAbove, T11_lc2_cached;
	double T11_lc2_m, T11_lc2_C, T11_lc2_borderX, T11_lc2_borderY;

	int T11_lc3_horizontal, T11_lc3_vertical, T11_lc3_leftOrAbove, T11_lc3_cached;
	double T11_lc3_m, T11_lc3_C, T11_lc3_borderX, T11_lc3_borderY;

	int T11_lc1_lastY = Integer.MIN_VALUE, T11_lc2_lastY = Integer.MIN_VALUE, T11_lc3_lastY = Integer.MIN_VALUE;
	int T11_r, T11_g, T11_b;

	int T12_initializedWithValidData = false, T12_okay = false;
	double T12_sx, T12_sy, T12_minx, T12_miny, T12_maxx, T12_maxy;

	int T12_lc1_horizontal, T12_lc1_vertical, T12_lc1_leftOrAbove, T12_lc1_cached;
	double T12_lc1_m, T12_lc1_C, T12_lc1_borderX, T12_lc1_borderY;

	int T12_lc2_horizontal, T12_lc2_vertical, T12_lc2_leftOrAbove, T12_lc2_cached;
	double T12_lc2_m, T12_lc2_C, T12_lc2_borderX, T12_lc2_borderY;

	int T12_lc3_horizontal, T12_lc3_vertical, T12_lc3_leftOrAbove, T12_lc3_cached;
	double T12_lc3_m, T12_lc3_C, T12_lc3_borderX, T12_lc3_borderY;

	int T12_lc1_lastY = Integer.MIN_VALUE, T12_lc2_lastY = Integer.MIN_VALUE, T12_lc3_lastY = Integer.MIN_VALUE;
	int T12_r, T12_g, T12_b;

	int T13_initializedWithValidData = false, T13_okay = false;
	double T13_sx, T13_sy, T13_minx, T13_miny, T13_maxx, T13_maxy;

	int T13_lc1_horizontal, T13_lc1_vertical, T13_lc1_leftOrAbove, T13_lc1_cached;
	double T13_lc1_m, T13_lc1_C, T13_lc1_borderX, T13_lc1_borderY;

	int T13_lc2_horizontal, T13_lc2_vertical, T13_lc2_leftOrAbove, T13_lc2_cached;
	double T13_lc2_m, T13_lc2_C, T13_lc2_borderX, T13_lc2_borderY;

	int T13_lc3_horizontal, T13_lc3_vertical, T13_lc3_leftOrAbove, T13_lc3_cached;
	double T13_lc3_m, T13_lc3_C, T13_lc3_borderX, T13_lc3_borderY;

	int T13_lc1_lastY = Integer.MIN_VALUE, T13_lc2_lastY = Integer.MIN_VALUE, T13_lc3_lastY = Integer.MIN_VALUE;
	int T13_r, T13_g, T13_b;

	int T14_initializedWithValidData = false, T14_okay = false;
	double T14_sx, T14_sy, T14_minx, T14_miny, T14_maxx, T14_maxy;

	int T14_lc1_horizontal, T14_lc1_vertical, T14_lc1_leftOrAbove, T14_lc1_cached;
	double T14_lc1_m, T14_lc1_C, T14_lc1_borderX, T14_lc1_borderY;

	int T14_lc2_horizontal, T14_lc2_vertical, T14_lc2_leftOrAbove, T14_lc2_cached;
	double T14_lc2_m, T14_lc2_C, T14_lc2_borderX, T14_lc2_borderY;

	int T14_lc3_horizontal, T14_lc3_vertical, T14_lc3_leftOrAbove, T14_lc3_cached;
	double T14_lc3_m, T14_lc3_C, T14_lc3_borderX, T14_lc3_borderY;

	int T14_lc1_lastY = Integer.MIN_VALUE, T14_lc2_lastY = Integer.MIN_VALUE, T14_lc3_lastY = Integer.MIN_VALUE;
	int T14_r, T14_g, T14_b;

	int T15_initializedWithValidData = false, T15_okay = false;
	double T15_sx, T15_sy, T15_minx, T15_miny, T15_maxx, T15_maxy;

	int T15_lc1_horizontal, T15_lc1_vertical, T15_lc1_leftOrAbove, T15_lc1_cached;
	double T15_lc1_m, T15_lc1_C, T15_lc1_borderX, T15_lc1_borderY;

	int T15_lc2_horizontal, T15_lc2_vertical, T15_lc2_leftOrAbove, T15_lc2_cached;
	double T15_lc2_m, T15_lc2_C, T15_lc2_borderX, T15_lc2_borderY;

	int T15_lc3_horizontal, T15_lc3_vertical, T15_lc3_leftOrAbove, T15_lc3_cached;
	double T15_lc3_m, T15_lc3_C, T15_lc3_borderX, T15_lc3_borderY;

	int T15_lc1_lastY = Integer.MIN_VALUE, T15_lc2_lastY = Integer.MIN_VALUE, T15_lc3_lastY = Integer.MIN_VALUE;
	int T15_r, T15_g, T15_b;

	int T16_initializedWithValidData = false, T16_okay = false;
	double T16_sx, T16_sy, T16_minx, T16_miny, T16_maxx, T16_maxy;

	int T16_lc1_horizontal, T16_lc1_vertical, T16_lc1_leftOrAbove, T16_lc1_cached;
	double T16_lc1_m, T16_lc1_C, T16_lc1_borderX, T16_lc1_borderY;

	int T16_lc2_horizontal, T16_lc2_vertical, T16_lc2_leftOrAbove, T16_lc2_cached;
	double T16_lc2_m, T16_lc2_C, T16_lc2_borderX, T16_lc2_borderY;

	int T16_lc3_horizontal, T16_lc3_vertical, T16_lc3_leftOrAbove, T16_lc3_cached;
	double T16_lc3_m, T16_lc3_C, T16_lc3_borderX, T16_lc3_borderY;

	int T16_lc1_lastY = Integer.MIN_VALUE, T16_lc2_lastY = Integer.MIN_VALUE, T16_lc3_lastY = Integer.MIN_VALUE;
	int T16_r, T16_g, T16_b;

	int T17_initializedWithValidData = false, T17_okay = false;
	double T17_sx, T17_sy, T17_minx, T17_miny, T17_maxx, T17_maxy;

	int T17_lc1_horizontal, T17_lc1_vertical, T17_lc1_leftOrAbove, T17_lc1_cached;
	double T17_lc1_m, T17_lc1_C, T17_lc1_borderX, T17_lc1_borderY;

	int T17_lc2_horizontal, T17_lc2_vertical, T17_lc2_leftOrAbove, T17_lc2_cached;
	double T17_lc2_m, T17_lc2_C, T17_lc2_borderX, T17_lc2_borderY;

	int T17_lc3_horizontal, T17_lc3_vertical, T17_lc3_leftOrAbove, T17_lc3_cached;
	double T17_lc3_m, T17_lc3_C, T17_lc3_borderX, T17_lc3_borderY;

	int T17_lc1_lastY = Integer.MIN_VALUE, T17_lc2_lastY = Integer.MIN_VALUE, T17_lc3_lastY = Integer.MIN_VALUE;
	int T17_r, T17_g, T17_b;

	int T18_initializedWithValidData = false, T18_okay = false;
	double T18_sx, T18_sy, T18_minx, T18_miny, T18_maxx, T18_maxy;

	int T18_lc1_horizontal, T18_lc1_vertical, T18_lc1_leftOrAbove, T18_lc1_cached;
	double T18_lc1_m, T18_lc1_C, T18_lc1_borderX, T18_lc1_borderY;

	int T18_lc2_horizontal, T18_lc2_vertical, T18_lc2_leftOrAbove, T18_lc2_cached;
	double T18_lc2_m, T18_lc2_C, T18_lc2_borderX, T18_lc2_borderY;

	int T18_lc3_horizontal, T18_lc3_vertical, T18_lc3_leftOrAbove, T18_lc3_cached;
	double T18_lc3_m, T18_lc3_C, T18_lc3_borderX, T18_lc3_borderY;

	int T18_lc1_lastY = Integer.MIN_VALUE, T18_lc2_lastY = Integer.MIN_VALUE, T18_lc3_lastY = Integer.MIN_VALUE;
	int T18_r, T18_g, T18_b;

	int T19_initializedWithValidData = false, T19_okay = false;
	double T19_sx, T19_sy, T19_minx, T19_miny, T19_maxx, T19_maxy;

	int T19_lc1_horizontal, T19_lc1_vertical, T19_lc1_leftOrAbove, T19_lc1_cached;
	double T19_lc1_m, T19_lc1_C, T19_lc1_borderX, T19_lc1_borderY;

	int T19_lc2_horizontal, T19_lc2_vertical, T19_lc2_leftOrAbove, T19_lc2_cached;
	double T19_lc2_m, T19_lc2_C, T19_lc2_borderX, T19_lc2_borderY;

	int T19_lc3_horizontal, T19_lc3_vertical, T19_lc3_leftOrAbove, T19_lc3_cached;
	double T19_lc3_m, T19_lc3_C, T19_lc3_borderX, T19_lc3_borderY;

	int T19_lc1_lastY = Integer.MIN_VALUE, T19_lc2_lastY = Integer.MIN_VALUE, T19_lc3_lastY = Integer.MIN_VALUE;
	int T19_r, T19_g, T19_b;

	int T20_initializedWithValidData = false, T20_okay = false;
	double T20_sx, T20_sy, T20_minx, T20_miny, T20_maxx, T20_maxy;

	int T20_lc1_horizontal, T20_lc1_vertical, T20_lc1_leftOrAbove, T20_lc1_cached;
	double T20_lc1_m, T20_lc1_C, T20_lc1_borderX, T20_lc1_borderY;

	int T20_lc2_horizontal, T20_lc2_vertical, T20_lc2_leftOrAbove, T20_lc2_cached;
	double T20_lc2_m, T20_lc2_C, T20_lc2_borderX, T20_lc2_borderY;

	int T20_lc3_horizontal, T20_lc3_vertical, T20_lc3_leftOrAbove, T20_lc3_cached;
	double T20_lc3_m, T20_lc3_C, T20_lc3_borderX, T20_lc3_borderY;

	int T20_lc1_lastY = Integer.MIN_VALUE, T20_lc2_lastY = Integer.MIN_VALUE, T20_lc3_lastY = Integer.MIN_VALUE;
	int T20_r, T20_g, T20_b;

	int T21_initializedWithValidData = false, T21_okay = false;
	double T21_sx, T21_sy, T21_minx, T21_miny, T21_maxx, T21_maxy;

	int T21_lc1_horizontal, T21_lc1_vertical, T21_lc1_leftOrAbove, T21_lc1_cached;
	double T21_lc1_m, T21_lc1_C, T21_lc1_borderX, T21_lc1_borderY;

	int T21_lc2_horizontal, T21_lc2_vertical, T21_lc2_leftOrAbove, T21_lc2_cached;
	double T21_lc2_m, T21_lc2_C, T21_lc2_borderX, T21_lc2_borderY;

	int T21_lc3_horizontal, T21_lc3_vertical, T21_lc3_leftOrAbove, T21_lc3_cached;
	double T21_lc3_m, T21_lc3_C, T21_lc3_borderX, T21_lc3_borderY;

	int T21_lc1_lastY = Integer.MIN_VALUE, T21_lc2_lastY = Integer.MIN_VALUE, T21_lc3_lastY = Integer.MIN_VALUE;
	int T21_r, T21_g, T21_b;

	int T22_initializedWithValidData = false, T22_okay = false;
	double T22_sx, T22_sy, T22_minx, T22_miny, T22_maxx, T22_maxy;

	int T22_lc1_horizontal, T22_lc1_vertical, T22_lc1_leftOrAbove, T22_lc1_cached;
	double T22_lc1_m, T22_lc1_C, T22_lc1_borderX, T22_lc1_borderY;

	int T22_lc2_horizontal, T22_lc2_vertical, T22_lc2_leftOrAbove, T22_lc2_cached;
	double T22_lc2_m, T22_lc2_C, T22_lc2_borderX, T22_lc2_borderY;

	int T22_lc3_horizontal, T22_lc3_vertical, T22_lc3_leftOrAbove, T22_lc3_cached;
	double T22_lc3_m, T22_lc3_C, T22_lc3_borderX, T22_lc3_borderY;

	int T22_lc1_lastY = Integer.MIN_VALUE, T22_lc2_lastY = Integer.MIN_VALUE, T22_lc3_lastY = Integer.MIN_VALUE;
	int T22_r, T22_g, T22_b;

	int T23_initializedWithValidData = false, T23_okay = false;
	double T23_sx, T23_sy, T23_minx, T23_miny, T23_maxx, T23_maxy;

	int T23_lc1_horizontal, T23_lc1_vertical, T23_lc1_leftOrAbove, T23_lc1_cached;
	double T23_lc1_m, T23_lc1_C, T23_lc1_borderX, T23_lc1_borderY;

	int T23_lc2_horizontal, T23_lc2_vertical, T23_lc2_leftOrAbove, T23_lc2_cached;
	double T23_lc2_m, T23_lc2_C, T23_lc2_borderX, T23_lc2_borderY;

	int T23_lc3_horizontal, T23_lc3_vertical, T23_lc3_leftOrAbove, T23_lc3_cached;
	double T23_lc3_m, T23_lc3_C, T23_lc3_borderX, T23_lc3_borderY;

	int T23_lc1_lastY = Integer.MIN_VALUE, T23_lc2_lastY = Integer.MIN_VALUE, T23_lc3_lastY = Integer.MIN_VALUE;
	int T23_r, T23_g, T23_b;

	int T24_initializedWithValidData = false, T24_okay = false;
	double T24_sx, T24_sy, T24_minx, T24_miny, T24_maxx, T24_maxy;

	int T24_lc1_horizontal, T24_lc1_vertical, T24_lc1_leftOrAbove, T24_lc1_cached;
	double T24_lc1_m, T24_lc1_C, T24_lc1_borderX, T24_lc1_borderY;

	int T24_lc2_horizontal, T24_lc2_vertical, T24_lc2_leftOrAbove, T24_lc2_cached;
	double T24_lc2_m, T24_lc2_C, T24_lc2_borderX, T24_lc2_borderY;

	int T24_lc3_horizontal, T24_lc3_vertical, T24_lc3_leftOrAbove, T24_lc3_cached;
	double T24_lc3_m, T24_lc3_C, T24_lc3_borderX, T24_lc3_borderY;

	int T24_lc1_lastY = Integer.MIN_VALUE, T24_lc2_lastY = Integer.MIN_VALUE, T24_lc3_lastY = Integer.MIN_VALUE;
	int T24_r, T24_g, T24_b;

	int T25_initializedWithValidData = false, T25_okay = false;
	double T25_sx, T25_sy, T25_minx, T25_miny, T25_maxx, T25_maxy;

	int T25_lc1_horizontal, T25_lc1_vertical, T25_lc1_leftOrAbove, T25_lc1_cached;
	double T25_lc1_m, T25_lc1_C, T25_lc1_borderX, T25_lc1_borderY;

	int T25_lc2_horizontal, T25_lc2_vertical, T25_lc2_leftOrAbove, T25_lc2_cached;
	double T25_lc2_m, T25_lc2_C, T25_lc2_borderX, T25_lc2_borderY;

	int T25_lc3_horizontal, T25_lc3_vertical, T25_lc3_leftOrAbove, T25_lc3_cached;
	double T25_lc3_m, T25_lc3_C, T25_lc3_borderX, T25_lc3_borderY;

	int T25_lc1_lastY = Integer.MIN_VALUE, T25_lc2_lastY = Integer.MIN_VALUE, T25_lc3_lastY = Integer.MIN_VALUE;
	int T25_r, T25_g, T25_b;

	int T26_initializedWithValidData = false, T26_okay = false;
	double T26_sx, T26_sy, T26_minx, T26_miny, T26_maxx, T26_maxy;

	int T26_lc1_horizontal, T26_lc1_vertical, T26_lc1_leftOrAbove, T26_lc1_cached;
	double T26_lc1_m, T26_lc1_C, T26_lc1_borderX, T26_lc1_borderY;

	int T26_lc2_horizontal, T26_lc2_vertical, T26_lc2_leftOrAbove, T26_lc2_cached;
	double T26_lc2_m, T26_lc2_C, T26_lc2_borderX, T26_lc2_borderY;

	int T26_lc3_horizontal, T26_lc3_vertical, T26_lc3_leftOrAbove, T26_lc3_cached;
	double T26_lc3_m, T26_lc3_C, T26_lc3_borderX, T26_lc3_borderY;

	int T26_lc1_lastY = Integer.MIN_VALUE, T26_lc2_lastY = Integer.MIN_VALUE, T26_lc3_lastY = Integer.MIN_VALUE;
	int T26_r, T26_g, T26_b;

	int T27_initializedWithValidData = false, T27_okay = false;
	double T27_sx, T27_sy, T27_minx, T27_miny, T27_maxx, T27_maxy;

	int T27_lc1_horizontal, T27_lc1_vertical, T27_lc1_leftOrAbove, T27_lc1_cached;
	double T27_lc1_m, T27_lc1_C, T27_lc1_borderX, T27_lc1_borderY;

	int T27_lc2_horizontal, T27_lc2_vertical, T27_lc2_leftOrAbove, T27_lc2_cached;
	double T27_lc2_m, T27_lc2_C, T27_lc2_borderX, T27_lc2_borderY;

	int T27_lc3_horizontal, T27_lc3_vertical, T27_lc3_leftOrAbove, T27_lc3_cached;
	double T27_lc3_m, T27_lc3_C, T27_lc3_borderX, T27_lc3_borderY;

	int T27_lc1_lastY = Integer.MIN_VALUE, T27_lc2_lastY = Integer.MIN_VALUE, T27_lc3_lastY = Integer.MIN_VALUE;
	int T27_r, T27_g, T27_b;

	int T28_initializedWithValidData = false, T28_okay = false;
	double T28_sx, T28_sy, T28_minx, T28_miny, T28_maxx, T28_maxy;

	int T28_lc1_horizontal, T28_lc1_vertical, T28_lc1_leftOrAbove, T28_lc1_cached;
	double T28_lc1_m, T28_lc1_C, T28_lc1_borderX, T28_lc1_borderY;

	int T28_lc2_horizontal, T28_lc2_vertical, T28_lc2_leftOrAbove, T28_lc2_cached;
	double T28_lc2_m, T28_lc2_C, T28_lc2_borderX, T28_lc2_borderY;

	int T28_lc3_horizontal, T28_lc3_vertical, T28_lc3_leftOrAbove, T28_lc3_cached;
	double T28_lc3_m, T28_lc3_C, T28_lc3_borderX, T28_lc3_borderY;

	int T28_lc1_lastY = Integer.MIN_VALUE, T28_lc2_lastY = Integer.MIN_VALUE, T28_lc3_lastY = Integer.MIN_VALUE;
	int T28_r, T28_g, T28_b;

	int T29_initializedWithValidData = false, T29_okay = false;
	double T29_sx, T29_sy, T29_minx, T29_miny, T29_maxx, T29_maxy;

	int T29_lc1_horizontal, T29_lc1_vertical, T29_lc1_leftOrAbove, T29_lc1_cached;
	double T29_lc1_m, T29_lc1_C, T29_lc1_borderX, T29_lc1_borderY;

	int T29_lc2_horizontal, T29_lc2_vertical, T29_lc2_leftOrAbove, T29_lc2_cached;
	double T29_lc2_m, T29_lc2_C, T29_lc2_borderX, T29_lc2_borderY;

	int T29_lc3_horizontal, T29_lc3_vertical, T29_lc3_leftOrAbove, T29_lc3_cached;
	double T29_lc3_m, T29_lc3_C, T29_lc3_borderX, T29_lc3_borderY;

	int T29_lc1_lastY = Integer.MIN_VALUE, T29_lc2_lastY = Integer.MIN_VALUE, T29_lc3_lastY = Integer.MIN_VALUE;
	int T29_r, T29_g, T29_b;

	int T30_initializedWithValidData = false, T30_okay = false;
	double T30_sx, T30_sy, T30_minx, T30_miny, T30_maxx, T30_maxy;

	int T30_lc1_horizontal, T30_lc1_vertical, T30_lc1_leftOrAbove, T30_lc1_cached;
	double T30_lc1_m, T30_lc1_C, T30_lc1_borderX, T30_lc1_borderY;

	int T30_lc2_horizontal, T30_lc2_vertical, T30_lc2_leftOrAbove, T30_lc2_cached;
	double T30_lc2_m, T30_lc2_C, T30_lc2_borderX, T30_lc2_borderY;

	int T30_lc3_horizontal, T30_lc3_vertical, T30_lc3_leftOrAbove, T30_lc3_cached;
	double T30_lc3_m, T30_lc3_C, T30_lc3_borderX, T30_lc3_borderY;

	int T30_lc1_lastY = Integer.MIN_VALUE, T30_lc2_lastY = Integer.MIN_VALUE, T30_lc3_lastY = Integer.MIN_VALUE;
	int T30_r, T30_g, T30_b;

	int T31_initializedWithValidData = false, T31_okay = false;
	double T31_sx, T31_sy, T31_minx, T31_miny, T31_maxx, T31_maxy;

	int T31_lc1_horizontal, T31_lc1_vertical, T31_lc1_leftOrAbove, T31_lc1_cached;
	double T31_lc1_m, T31_lc1_C, T31_lc1_borderX, T31_lc1_borderY;

	int T31_lc2_horizontal, T31_lc2_vertical, T31_lc2_leftOrAbove, T31_lc2_cached;
	double T31_lc2_m, T31_lc2_C, T31_lc2_borderX, T31_lc2_borderY;

	int T31_lc3_horizontal, T31_lc3_vertical, T31_lc3_leftOrAbove, T31_lc3_cached;
	double T31_lc3_m, T31_lc3_C, T31_lc3_borderX, T31_lc3_borderY;

	int T31_lc1_lastY = Integer.MIN_VALUE, T31_lc2_lastY = Integer.MIN_VALUE, T31_lc3_lastY = Integer.MIN_VALUE;
	int T31_r, T31_g, T31_b;

	int T32_initializedWithValidData = false, T32_okay = false;
	double T32_sx, T32_sy, T32_minx, T32_miny, T32_maxx, T32_maxy;

	int T32_lc1_horizontal, T32_lc1_vertical, T32_lc1_leftOrAbove, T32_lc1_cached;
	double T32_lc1_m, T32_lc1_C, T32_lc1_borderX, T32_lc1_borderY;

	int T32_lc2_horizontal, T32_lc2_vertical, T32_lc2_leftOrAbove, T32_lc2_cached;
	double T32_lc2_m, T32_lc2_C, T32_lc2_borderX, T32_lc2_borderY;

	int T32_lc3_horizontal, T32_lc3_vertical, T32_lc3_leftOrAbove, T32_lc3_cached;
	double T32_lc3_m, T32_lc3_C, T32_lc3_borderX, T32_lc3_borderY;

	int T32_lc1_lastY = Integer.MIN_VALUE, T32_lc2_lastY = Integer.MIN_VALUE, T32_lc3_lastY = Integer.MIN_VALUE;
	int T32_r, T32_g, T32_b;

	int T33_initializedWithValidData = false, T33_okay = false;
	double T33_sx, T33_sy, T33_minx, T33_miny, T33_maxx, T33_maxy;

	int T33_lc1_horizontal, T33_lc1_vertical, T33_lc1_leftOrAbove, T33_lc1_cached;
	double T33_lc1_m, T33_lc1_C, T33_lc1_borderX, T33_lc1_borderY;

	int T33_lc2_horizontal, T33_lc2_vertical, T33_lc2_leftOrAbove, T33_lc2_cached;
	double T33_lc2_m, T33_lc2_C, T33_lc2_borderX, T33_lc2_borderY;

	int T33_lc3_horizontal, T33_lc3_vertical, T33_lc3_leftOrAbove, T33_lc3_cached;
	double T33_lc3_m, T33_lc3_C, T33_lc3_borderX, T33_lc3_borderY;

	int T33_lc1_lastY = Integer.MIN_VALUE, T33_lc2_lastY = Integer.MIN_VALUE, T33_lc3_lastY = Integer.MIN_VALUE;
	int T33_r, T33_g, T33_b;

	int T34_initializedWithValidData = false, T34_okay = false;
	double T34_sx, T34_sy, T34_minx, T34_miny, T34_maxx, T34_maxy;

	int T34_lc1_horizontal, T34_lc1_vertical, T34_lc1_leftOrAbove, T34_lc1_cached;
	double T34_lc1_m, T34_lc1_C, T34_lc1_borderX, T34_lc1_borderY;

	int T34_lc2_horizontal, T34_lc2_vertical, T34_lc2_leftOrAbove, T34_lc2_cached;
	double T34_lc2_m, T34_lc2_C, T34_lc2_borderX, T34_lc2_borderY;

	int T34_lc3_horizontal, T34_lc3_vertical, T34_lc3_leftOrAbove, T34_lc3_cached;
	double T34_lc3_m, T34_lc3_C, T34_lc3_borderX, T34_lc3_borderY;

	int T34_lc1_lastY = Integer.MIN_VALUE, T34_lc2_lastY = Integer.MIN_VALUE, T34_lc3_lastY = Integer.MIN_VALUE;
	int T34_r, T34_g, T34_b;

	int T35_initializedWithValidData = false, T35_okay = false;
	double T35_sx, T35_sy, T35_minx, T35_miny, T35_maxx, T35_maxy;

	int T35_lc1_horizontal, T35_lc1_vertical, T35_lc1_leftOrAbove, T35_lc1_cached;
	double T35_lc1_m, T35_lc1_C, T35_lc1_borderX, T35_lc1_borderY;

	int T35_lc2_horizontal, T35_lc2_vertical, T35_lc2_leftOrAbove, T35_lc2_cached;
	double T35_lc2_m, T35_lc2_C, T35_lc2_borderX, T35_lc2_borderY;

	int T35_lc3_horizontal, T35_lc3_vertical, T35_lc3_leftOrAbove, T35_lc3_cached;
	double T35_lc3_m, T35_lc3_C, T35_lc3_borderX, T35_lc3_borderY;

	int T35_lc1_lastY = Integer.MIN_VALUE, T35_lc2_lastY = Integer.MIN_VALUE, T35_lc3_lastY = Integer.MIN_VALUE;
	int T35_r, T35_g, T35_b;

	int T36_initializedWithValidData = false, T36_okay = false;
	double T36_sx, T36_sy, T36_minx, T36_miny, T36_maxx, T36_maxy;

	int T36_lc1_horizontal, T36_lc1_vertical, T36_lc1_leftOrAbove, T36_lc1_cached;
	double T36_lc1_m, T36_lc1_C, T36_lc1_borderX, T36_lc1_borderY;

	int T36_lc2_horizontal, T36_lc2_vertical, T36_lc2_leftOrAbove, T36_lc2_cached;
	double T36_lc2_m, T36_lc2_C, T36_lc2_borderX, T36_lc2_borderY;

	int T36_lc3_horizontal, T36_lc3_vertical, T36_lc3_leftOrAbove, T36_lc3_cached;
	double T36_lc3_m, T36_lc3_C, T36_lc3_borderX, T36_lc3_borderY;

	int T36_lc1_lastY = Integer.MIN_VALUE, T36_lc2_lastY = Integer.MIN_VALUE, T36_lc3_lastY = Integer.MIN_VALUE;
	int T36_r, T36_g, T36_b;

	int T37_initializedWithValidData = false, T37_okay = false;
	double T37_sx, T37_sy, T37_minx, T37_miny, T37_maxx, T37_maxy;

	int T37_lc1_horizontal, T37_lc1_vertical, T37_lc1_leftOrAbove, T37_lc1_cached;
	double T37_lc1_m, T37_lc1_C, T37_lc1_borderX, T37_lc1_borderY;

	int T37_lc2_horizontal, T37_lc2_vertical, T37_lc2_leftOrAbove, T37_lc2_cached;
	double T37_lc2_m, T37_lc2_C, T37_lc2_borderX, T37_lc2_borderY;

	int T37_lc3_horizontal, T37_lc3_vertical, T37_lc3_leftOrAbove, T37_lc3_cached;
	double T37_lc3_m, T37_lc3_C, T37_lc3_borderX, T37_lc3_borderY;

	int T37_lc1_lastY = Integer.MIN_VALUE, T37_lc2_lastY = Integer.MIN_VALUE, T37_lc3_lastY = Integer.MIN_VALUE;
	int T37_r, T37_g, T37_b;

	int T38_initializedWithValidData = false, T38_okay = false;
	double T38_sx, T38_sy, T38_minx, T38_miny, T38_maxx, T38_maxy;

	int T38_lc1_horizontal, T38_lc1_vertical, T38_lc1_leftOrAbove, T38_lc1_cached;
	double T38_lc1_m, T38_lc1_C, T38_lc1_borderX, T38_lc1_borderY;

	int T38_lc2_horizontal, T38_lc2_vertical, T38_lc2_leftOrAbove, T38_lc2_cached;
	double T38_lc2_m, T38_lc2_C, T38_lc2_borderX, T38_lc2_borderY;

	int T38_lc3_horizontal, T38_lc3_vertical, T38_lc3_leftOrAbove, T38_lc3_cached;
	double T38_lc3_m, T38_lc3_C, T38_lc3_borderX, T38_lc3_borderY;

	int T38_lc1_lastY = Integer.MIN_VALUE, T38_lc2_lastY = Integer.MIN_VALUE, T38_lc3_lastY = Integer.MIN_VALUE;
	int T38_r, T38_g, T38_b;

	int T39_initializedWithValidData = false, T39_okay = false;
	double T39_sx, T39_sy, T39_minx, T39_miny, T39_maxx, T39_maxy;

	int T39_lc1_horizontal, T39_lc1_vertical, T39_lc1_leftOrAbove, T39_lc1_cached;
	double T39_lc1_m, T39_lc1_C, T39_lc1_borderX, T39_lc1_borderY;

	int T39_lc2_horizontal, T39_lc2_vertical, T39_lc2_leftOrAbove, T39_lc2_cached;
	double T39_lc2_m, T39_lc2_C, T39_lc2_borderX, T39_lc2_borderY;

	int T39_lc3_horizontal, T39_lc3_vertical, T39_lc3_leftOrAbove, T39_lc3_cached;
	double T39_lc3_m, T39_lc3_C, T39_lc3_borderX, T39_lc3_borderY;

	int T39_lc1_lastY = Integer.MIN_VALUE, T39_lc2_lastY = Integer.MIN_VALUE, T39_lc3_lastY = Integer.MIN_VALUE;
	int T39_r, T39_g, T39_b;

	int T40_initializedWithValidData = false, T40_okay = false;
	double T40_sx, T40_sy, T40_minx, T40_miny, T40_maxx, T40_maxy;

	int T40_lc1_horizontal, T40_lc1_vertical, T40_lc1_leftOrAbove, T40_lc1_cached;
	double T40_lc1_m, T40_lc1_C, T40_lc1_borderX, T40_lc1_borderY;

	int T40_lc2_horizontal, T40_lc2_vertical, T40_lc2_leftOrAbove, T40_lc2_cached;
	double T40_lc2_m, T40_lc2_C, T40_lc2_borderX, T40_lc2_borderY;

	int T40_lc3_horizontal, T40_lc3_vertical, T40_lc3_leftOrAbove, T40_lc3_cached;
	double T40_lc3_m, T40_lc3_C, T40_lc3_borderX, T40_lc3_borderY;

	int T40_lc1_lastY = Integer.MIN_VALUE, T40_lc2_lastY = Integer.MIN_VALUE, T40_lc3_lastY = Integer.MIN_VALUE;
	int T40_r, T40_g, T40_b;

	int T41_initializedWithValidData = false, T41_okay = false;
	double T41_sx, T41_sy, T41_minx, T41_miny, T41_maxx, T41_maxy;

	int T41_lc1_horizontal, T41_lc1_vertical, T41_lc1_leftOrAbove, T41_lc1_cached;
	double T41_lc1_m, T41_lc1_C, T41_lc1_borderX, T41_lc1_borderY;

	int T41_lc2_horizontal, T41_lc2_vertical, T41_lc2_leftOrAbove, T41_lc2_cached;
	double T41_lc2_m, T41_lc2_C, T41_lc2_borderX, T41_lc2_borderY;

	int T41_lc3_horizontal, T41_lc3_vertical, T41_lc3_leftOrAbove, T41_lc3_cached;
	double T41_lc3_m, T41_lc3_C, T41_lc3_borderX, T41_lc3_borderY;

	int T41_lc1_lastY = Integer.MIN_VALUE, T41_lc2_lastY = Integer.MIN_VALUE, T41_lc3_lastY = Integer.MIN_VALUE;
	int T41_r, T41_g, T41_b;

	int T42_initializedWithValidData = false, T42_okay = false;
	double T42_sx, T42_sy, T42_minx, T42_miny, T42_maxx, T42_maxy;

	int T42_lc1_horizontal, T42_lc1_vertical, T42_lc1_leftOrAbove, T42_lc1_cached;
	double T42_lc1_m, T42_lc1_C, T42_lc1_borderX, T42_lc1_borderY;

	int T42_lc2_horizontal, T42_lc2_vertical, T42_lc2_leftOrAbove, T42_lc2_cached;
	double T42_lc2_m, T42_lc2_C, T42_lc2_borderX, T42_lc2_borderY;

	int T42_lc3_horizontal, T42_lc3_vertical, T42_lc3_leftOrAbove, T42_lc3_cached;
	double T42_lc3_m, T42_lc3_C, T42_lc3_borderX, T42_lc3_borderY;

	int T42_lc1_lastY = Integer.MIN_VALUE, T42_lc2_lastY = Integer.MIN_VALUE, T42_lc3_lastY = Integer.MIN_VALUE;
	int T42_r, T42_g, T42_b;

	int T43_initializedWithValidData = false, T43_okay = false;
	double T43_sx, T43_sy, T43_minx, T43_miny, T43_maxx, T43_maxy;

	int T43_lc1_horizontal, T43_lc1_vertical, T43_lc1_leftOrAbove, T43_lc1_cached;
	double T43_lc1_m, T43_lc1_C, T43_lc1_borderX, T43_lc1_borderY;

	int T43_lc2_horizontal, T43_lc2_vertical, T43_lc2_leftOrAbove, T43_lc2_cached;
	double T43_lc2_m, T43_lc2_C, T43_lc2_borderX, T43_lc2_borderY;

	int T43_lc3_horizontal, T43_lc3_vertical, T43_lc3_leftOrAbove, T43_lc3_cached;
	double T43_lc3_m, T43_lc3_C, T43_lc3_borderX, T43_lc3_borderY;

	int T43_lc1_lastY = Integer.MIN_VALUE, T43_lc2_lastY = Integer.MIN_VALUE, T43_lc3_lastY = Integer.MIN_VALUE;
	int T43_r, T43_g, T43_b;

	int T44_initializedWithValidData = false, T44_okay = false;
	double T44_sx, T44_sy, T44_minx, T44_miny, T44_maxx, T44_maxy;

	int T44_lc1_horizontal, T44_lc1_vertical, T44_lc1_leftOrAbove, T44_lc1_cached;
	double T44_lc1_m, T44_lc1_C, T44_lc1_borderX, T44_lc1_borderY;

	int T44_lc2_horizontal, T44_lc2_vertical, T44_lc2_leftOrAbove, T44_lc2_cached;
	double T44_lc2_m, T44_lc2_C, T44_lc2_borderX, T44_lc2_borderY;

	int T44_lc3_horizontal, T44_lc3_vertical, T44_lc3_leftOrAbove, T44_lc3_cached;
	double T44_lc3_m, T44_lc3_C, T44_lc3_borderX, T44_lc3_borderY;

	int T44_lc1_lastY = Integer.MIN_VALUE, T44_lc2_lastY = Integer.MIN_VALUE, T44_lc3_lastY = Integer.MIN_VALUE;
	int T44_r, T44_g, T44_b;

	int T45_initializedWithValidData = false, T45_okay = false;
	double T45_sx, T45_sy, T45_minx, T45_miny, T45_maxx, T45_maxy;

	int T45_lc1_horizontal, T45_lc1_vertical, T45_lc1_leftOrAbove, T45_lc1_cached;
	double T45_lc1_m, T45_lc1_C, T45_lc1_borderX, T45_lc1_borderY;

	int T45_lc2_horizontal, T45_lc2_vertical, T45_lc2_leftOrAbove, T45_lc2_cached;
	double T45_lc2_m, T45_lc2_C, T45_lc2_borderX, T45_lc2_borderY;

	int T45_lc3_horizontal, T45_lc3_vertical, T45_lc3_leftOrAbove, T45_lc3_cached;
	double T45_lc3_m, T45_lc3_C, T45_lc3_borderX, T45_lc3_borderY;

	int T45_lc1_lastY = Integer.MIN_VALUE, T45_lc2_lastY = Integer.MIN_VALUE, T45_lc3_lastY = Integer.MIN_VALUE;
	int T45_r, T45_g, T45_b;

	int T46_initializedWithValidData = false, T46_okay = false;
	double T46_sx, T46_sy, T46_minx, T46_miny, T46_maxx, T46_maxy;

	int T46_lc1_horizontal, T46_lc1_vertical, T46_lc1_leftOrAbove, T46_lc1_cached;
	double T46_lc1_m, T46_lc1_C, T46_lc1_borderX, T46_lc1_borderY;

	int T46_lc2_horizontal, T46_lc2_vertical, T46_lc2_leftOrAbove, T46_lc2_cached;
	double T46_lc2_m, T46_lc2_C, T46_lc2_borderX, T46_lc2_borderY;

	int T46_lc3_horizontal, T46_lc3_vertical, T46_lc3_leftOrAbove, T46_lc3_cached;
	double T46_lc3_m, T46_lc3_C, T46_lc3_borderX, T46_lc3_borderY;

	int T46_lc1_lastY = Integer.MIN_VALUE, T46_lc2_lastY = Integer.MIN_VALUE, T46_lc3_lastY = Integer.MIN_VALUE;
	int T46_r, T46_g, T46_b;

	int T47_initializedWithValidData = false, T47_okay = false;
	double T47_sx, T47_sy, T47_minx, T47_miny, T47_maxx, T47_maxy;

	int T47_lc1_horizontal, T47_lc1_vertical, T47_lc1_leftOrAbove, T47_lc1_cached;
	double T47_lc1_m, T47_lc1_C, T47_lc1_borderX, T47_lc1_borderY;

	int T47_lc2_horizontal, T47_lc2_vertical, T47_lc2_leftOrAbove, T47_lc2_cached;
	double T47_lc2_m, T47_lc2_C, T47_lc2_borderX, T47_lc2_borderY;

	int T47_lc3_horizontal, T47_lc3_vertical, T47_lc3_leftOrAbove, T47_lc3_cached;
	double T47_lc3_m, T47_lc3_C, T47_lc3_borderX, T47_lc3_borderY;

	int T47_lc1_lastY = Integer.MIN_VALUE, T47_lc2_lastY = Integer.MIN_VALUE, T47_lc3_lastY = Integer.MIN_VALUE;
	int T47_r, T47_g, T47_b;

	int T48_initializedWithValidData = false, T48_okay = false;
	double T48_sx, T48_sy, T48_minx, T48_miny, T48_maxx, T48_maxy;

	int T48_lc1_horizontal, T48_lc1_vertical, T48_lc1_leftOrAbove, T48_lc1_cached;
	double T48_lc1_m, T48_lc1_C, T48_lc1_borderX, T48_lc1_borderY;

	int T48_lc2_horizontal, T48_lc2_vertical, T48_lc2_leftOrAbove, T48_lc2_cached;
	double T48_lc2_m, T48_lc2_C, T48_lc2_borderX, T48_lc2_borderY;

	int T48_lc3_horizontal, T48_lc3_vertical, T48_lc3_leftOrAbove, T48_lc3_cached;
	double T48_lc3_m, T48_lc3_C, T48_lc3_borderX, T48_lc3_borderY;

	int T48_lc1_lastY = Integer.MIN_VALUE, T48_lc2_lastY = Integer.MIN_VALUE, T48_lc3_lastY = Integer.MIN_VALUE;
	int T48_r, T48_g, T48_b;

	int T49_initializedWithValidData = false, T49_okay = false;
	double T49_sx, T49_sy, T49_minx, T49_miny, T49_maxx, T49_maxy;

	int T49_lc1_horizontal, T49_lc1_vertical, T49_lc1_leftOrAbove, T49_lc1_cached;
	double T49_lc1_m, T49_lc1_C, T49_lc1_borderX, T49_lc1_borderY;

	int T49_lc2_horizontal, T49_lc2_vertical, T49_lc2_leftOrAbove, T49_lc2_cached;
	double T49_lc2_m, T49_lc2_C, T49_lc2_borderX, T49_lc2_borderY;

	int T49_lc3_horizontal, T49_lc3_vertical, T49_lc3_leftOrAbove, T49_lc3_cached;
	double T49_lc3_m, T49_lc3_C, T49_lc3_borderX, T49_lc3_borderY;

	int T49_lc1_lastY = Integer.MIN_VALUE, T49_lc2_lastY = Integer.MIN_VALUE, T49_lc3_lastY = Integer.MIN_VALUE;
	int T49_r, T49_g, T49_b;

	int T50_initializedWithValidData = false, T50_okay = false;
	double T50_sx, T50_sy, T50_minx, T50_miny, T50_maxx, T50_maxy;

	int T50_lc1_horizontal, T50_lc1_vertical, T50_lc1_leftOrAbove, T50_lc1_cached;
	double T50_lc1_m, T50_lc1_C, T50_lc1_borderX, T50_lc1_borderY;

	int T50_lc2_horizontal, T50_lc2_vertical, T50_lc2_leftOrAbove, T50_lc2_cached;
	double T50_lc2_m, T50_lc2_C, T50_lc2_borderX, T50_lc2_borderY;

	int T50_lc3_horizontal, T50_lc3_vertical, T50_lc3_leftOrAbove, T50_lc3_cached;
	double T50_lc3_m, T50_lc3_C, T50_lc3_borderX, T50_lc3_borderY;

	int T50_lc1_lastY = Integer.MIN_VALUE, T50_lc2_lastY = Integer.MIN_VALUE, T50_lc3_lastY = Integer.MIN_VALUE;
	int T50_r, T50_g, T50_b;

	int T51_initializedWithValidData = false, T51_okay = false;
	double T51_sx, T51_sy, T51_minx, T51_miny, T51_maxx, T51_maxy;

	int T51_lc1_horizontal, T51_lc1_vertical, T51_lc1_leftOrAbove, T51_lc1_cached;
	double T51_lc1_m, T51_lc1_C, T51_lc1_borderX, T51_lc1_borderY;

	int T51_lc2_horizontal, T51_lc2_vertical, T51_lc2_leftOrAbove, T51_lc2_cached;
	double T51_lc2_m, T51_lc2_C, T51_lc2_borderX, T51_lc2_borderY;

	int T51_lc3_horizontal, T51_lc3_vertical, T51_lc3_leftOrAbove, T51_lc3_cached;
	double T51_lc3_m, T51_lc3_C, T51_lc3_borderX, T51_lc3_borderY;

	int T51_lc1_lastY = Integer.MIN_VALUE, T51_lc2_lastY = Integer.MIN_VALUE, T51_lc3_lastY = Integer.MIN_VALUE;
	int T51_r, T51_g, T51_b;

	int T52_initializedWithValidData = false, T52_okay = false;
	double T52_sx, T52_sy, T52_minx, T52_miny, T52_maxx, T52_maxy;

	int T52_lc1_horizontal, T52_lc1_vertical, T52_lc1_leftOrAbove, T52_lc1_cached;
	double T52_lc1_m, T52_lc1_C, T52_lc1_borderX, T52_lc1_borderY;

	int T52_lc2_horizontal, T52_lc2_vertical, T52_lc2_leftOrAbove, T52_lc2_cached;
	double T52_lc2_m, T52_lc2_C, T52_lc2_borderX, T52_lc2_borderY;

	int T52_lc3_horizontal, T52_lc3_vertical, T52_lc3_leftOrAbove, T52_lc3_cached;
	double T52_lc3_m, T52_lc3_C, T52_lc3_borderX, T52_lc3_borderY;

	int T52_lc1_lastY = Integer.MIN_VALUE, T52_lc2_lastY = Integer.MIN_VALUE, T52_lc3_lastY = Integer.MIN_VALUE;
	int T52_r, T52_g, T52_b;

	int T53_initializedWithValidData = false, T53_okay = false;
	double T53_sx, T53_sy, T53_minx, T53_miny, T53_maxx, T53_maxy;

	int T53_lc1_horizontal, T53_lc1_vertical, T53_lc1_leftOrAbove, T53_lc1_cached;
	double T53_lc1_m, T53_lc1_C, T53_lc1_borderX, T53_lc1_borderY;

	int T53_lc2_horizontal, T53_lc2_vertical, T53_lc2_leftOrAbove, T53_lc2_cached;
	double T53_lc2_m, T53_lc2_C, T53_lc2_borderX, T53_lc2_borderY;

	int T53_lc3_horizontal, T53_lc3_vertical, T53_lc3_leftOrAbove, T53_lc3_cached;
	double T53_lc3_m, T53_lc3_C, T53_lc3_borderX, T53_lc3_borderY;

	int T53_lc1_lastY = Integer.MIN_VALUE, T53_lc2_lastY = Integer.MIN_VALUE, T53_lc3_lastY = Integer.MIN_VALUE;
	int T53_r, T53_g, T53_b;

	int T54_initializedWithValidData = false, T54_okay = false;
	double T54_sx, T54_sy, T54_minx, T54_miny, T54_maxx, T54_maxy;

	int T54_lc1_horizontal, T54_lc1_vertical, T54_lc1_leftOrAbove, T54_lc1_cached;
	double T54_lc1_m, T54_lc1_C, T54_lc1_borderX, T54_lc1_borderY;

	int T54_lc2_horizontal, T54_lc2_vertical, T54_lc2_leftOrAbove, T54_lc2_cached;
	double T54_lc2_m, T54_lc2_C, T54_lc2_borderX, T54_lc2_borderY;

	int T54_lc3_horizontal, T54_lc3_vertical, T54_lc3_leftOrAbove, T54_lc3_cached;
	double T54_lc3_m, T54_lc3_C, T54_lc3_borderX, T54_lc3_borderY;

	int T54_lc1_lastY = Integer.MIN_VALUE, T54_lc2_lastY = Integer.MIN_VALUE, T54_lc3_lastY = Integer.MIN_VALUE;
	int T54_r, T54_g, T54_b;

	int T55_initializedWithValidData = false, T55_okay = false;
	double T55_sx, T55_sy, T55_minx, T55_miny, T55_maxx, T55_maxy;

	int T55_lc1_horizontal, T55_lc1_vertical, T55_lc1_leftOrAbove, T55_lc1_cached;
	double T55_lc1_m, T55_lc1_C, T55_lc1_borderX, T55_lc1_borderY;

	int T55_lc2_horizontal, T55_lc2_vertical, T55_lc2_leftOrAbove, T55_lc2_cached;
	double T55_lc2_m, T55_lc2_C, T55_lc2_borderX, T55_lc2_borderY;

	int T55_lc3_horizontal, T55_lc3_vertical, T55_lc3_leftOrAbove, T55_lc3_cached;
	double T55_lc3_m, T55_lc3_C, T55_lc3_borderX, T55_lc3_borderY;

	int T55_lc1_lastY = Integer.MIN_VALUE, T55_lc2_lastY = Integer.MIN_VALUE, T55_lc3_lastY = Integer.MIN_VALUE;
	int T55_r, T55_g, T55_b;

	int T56_initializedWithValidData = false, T56_okay = false;
	double T56_sx, T56_sy, T56_minx, T56_miny, T56_maxx, T56_maxy;

	int T56_lc1_horizontal, T56_lc1_vertical, T56_lc1_leftOrAbove, T56_lc1_cached;
	double T56_lc1_m, T56_lc1_C, T56_lc1_borderX, T56_lc1_borderY;

	int T56_lc2_horizontal, T56_lc2_vertical, T56_lc2_leftOrAbove, T56_lc2_cached;
	double T56_lc2_m, T56_lc2_C, T56_lc2_borderX, T56_lc2_borderY;

	int T56_lc3_horizontal, T56_lc3_vertical, T56_lc3_leftOrAbove, T56_lc3_cached;
	double T56_lc3_m, T56_lc3_C, T56_lc3_borderX, T56_lc3_borderY;

	int T56_lc1_lastY = Integer.MIN_VALUE, T56_lc2_lastY = Integer.MIN_VALUE, T56_lc3_lastY = Integer.MIN_VALUE;
	int T56_r, T56_g, T56_b;

	int T57_initializedWithValidData = false, T57_okay = false;
	double T57_sx, T57_sy, T57_minx, T57_miny, T57_maxx, T57_maxy;

	int T57_lc1_horizontal, T57_lc1_vertical, T57_lc1_leftOrAbove, T57_lc1_cached;
	double T57_lc1_m, T57_lc1_C, T57_lc1_borderX, T57_lc1_borderY;

	int T57_lc2_horizontal, T57_lc2_vertical, T57_lc2_leftOrAbove, T57_lc2_cached;
	double T57_lc2_m, T57_lc2_C, T57_lc2_borderX, T57_lc2_borderY;

	int T57_lc3_horizontal, T57_lc3_vertical, T57_lc3_leftOrAbove, T57_lc3_cached;
	double T57_lc3_m, T57_lc3_C, T57_lc3_borderX, T57_lc3_borderY;

	int T57_lc1_lastY = Integer.MIN_VALUE, T57_lc2_lastY = Integer.MIN_VALUE, T57_lc3_lastY = Integer.MIN_VALUE;
	int T57_r, T57_g, T57_b;

	int T58_initializedWithValidData = false, T58_okay = false;
	double T58_sx, T58_sy, T58_minx, T58_miny, T58_maxx, T58_maxy;

	int T58_lc1_horizontal, T58_lc1_vertical, T58_lc1_leftOrAbove, T58_lc1_cached;
	double T58_lc1_m, T58_lc1_C, T58_lc1_borderX, T58_lc1_borderY;

	int T58_lc2_horizontal, T58_lc2_vertical, T58_lc2_leftOrAbove, T58_lc2_cached;
	double T58_lc2_m, T58_lc2_C, T58_lc2_borderX, T58_lc2_borderY;

	int T58_lc3_horizontal, T58_lc3_vertical, T58_lc3_leftOrAbove, T58_lc3_cached;
	double T58_lc3_m, T58_lc3_C, T58_lc3_borderX, T58_lc3_borderY;

	int T58_lc1_lastY = Integer.MIN_VALUE, T58_lc2_lastY = Integer.MIN_VALUE, T58_lc3_lastY = Integer.MIN_VALUE;
	int T58_r, T58_g, T58_b;

	int T59_initializedWithValidData = false, T59_okay = false;
	double T59_sx, T59_sy, T59_minx, T59_miny, T59_maxx, T59_maxy;

	int T59_lc1_horizontal, T59_lc1_vertical, T59_lc1_leftOrAbove, T59_lc1_cached;
	double T59_lc1_m, T59_lc1_C, T59_lc1_borderX, T59_lc1_borderY;

	int T59_lc2_horizontal, T59_lc2_vertical, T59_lc2_leftOrAbove, T59_lc2_cached;
	double T59_lc2_m, T59_lc2_C, T59_lc2_borderX, T59_lc2_borderY;

	int T59_lc3_horizontal, T59_lc3_vertical, T59_lc3_leftOrAbove, T59_lc3_cached;
	double T59_lc3_m, T59_lc3_C, T59_lc3_borderX, T59_lc3_borderY;

	int T59_lc1_lastY = Integer.MIN_VALUE, T59_lc2_lastY = Integer.MIN_VALUE, T59_lc3_lastY = Integer.MIN_VALUE;
	int T59_r, T59_g, T59_b;

	int T60_initializedWithValidData = false, T60_okay = false;
	double T60_sx, T60_sy, T60_minx, T60_miny, T60_maxx, T60_maxy;

	int T60_lc1_horizontal, T60_lc1_vertical, T60_lc1_leftOrAbove, T60_lc1_cached;
	double T60_lc1_m, T60_lc1_C, T60_lc1_borderX, T60_lc1_borderY;

	int T60_lc2_horizontal, T60_lc2_vertical, T60_lc2_leftOrAbove, T60_lc2_cached;
	double T60_lc2_m, T60_lc2_C, T60_lc2_borderX, T60_lc2_borderY;

	int T60_lc3_horizontal, T60_lc3_vertical, T60_lc3_leftOrAbove, T60_lc3_cached;
	double T60_lc3_m, T60_lc3_C, T60_lc3_borderX, T60_lc3_borderY;

	int T60_lc1_lastY = Integer.MIN_VALUE, T60_lc2_lastY = Integer.MIN_VALUE, T60_lc3_lastY = Integer.MIN_VALUE;
	int T60_r, T60_g, T60_b;

	int T61_initializedWithValidData = false, T61_okay = false;
	double T61_sx, T61_sy, T61_minx, T61_miny, T61_maxx, T61_maxy;

	int T61_lc1_horizontal, T61_lc1_vertical, T61_lc1_leftOrAbove, T61_lc1_cached;
	double T61_lc1_m, T61_lc1_C, T61_lc1_borderX, T61_lc1_borderY;

	int T61_lc2_horizontal, T61_lc2_vertical, T61_lc2_leftOrAbove, T61_lc2_cached;
	double T61_lc2_m, T61_lc2_C, T61_lc2_borderX, T61_lc2_borderY;

	int T61_lc3_horizontal, T61_lc3_vertical, T61_lc3_leftOrAbove, T61_lc3_cached;
	double T61_lc3_m, T61_lc3_C, T61_lc3_borderX, T61_lc3_borderY;

	int T61_lc1_lastY = Integer.MIN_VALUE, T61_lc2_lastY = Integer.MIN_VALUE, T61_lc3_lastY = Integer.MIN_VALUE;
	int T61_r, T61_g, T61_b;

	int T62_initializedWithValidData = false, T62_okay = false;
	double T62_sx, T62_sy, T62_minx, T62_miny, T62_maxx, T62_maxy;

	int T62_lc1_horizontal, T62_lc1_vertical, T62_lc1_leftOrAbove, T62_lc1_cached;
	double T62_lc1_m, T62_lc1_C, T62_lc1_borderX, T62_lc1_borderY;

	int T62_lc2_horizontal, T62_lc2_vertical, T62_lc2_leftOrAbove, T62_lc2_cached;
	double T62_lc2_m, T62_lc2_C, T62_lc2_borderX, T62_lc2_borderY;

	int T62_lc3_horizontal, T62_lc3_vertical, T62_lc3_leftOrAbove, T62_lc3_cached;
	double T62_lc3_m, T62_lc3_C, T62_lc3_borderX, T62_lc3_borderY;

	int T62_lc1_lastY = Integer.MIN_VALUE, T62_lc2_lastY = Integer.MIN_VALUE, T62_lc3_lastY = Integer.MIN_VALUE;
	int T62_r, T62_g, T62_b;

	int T63_initializedWithValidData = false, T63_okay = false;
	double T63_sx, T63_sy, T63_minx, T63_miny, T63_maxx, T63_maxy;

	int T63_lc1_horizontal, T63_lc1_vertical, T63_lc1_leftOrAbove, T63_lc1_cached;
	double T63_lc1_m, T63_lc1_C, T63_lc1_borderX, T63_lc1_borderY;

	int T63_lc2_horizontal, T63_lc2_vertical, T63_lc2_leftOrAbove, T63_lc2_cached;
	double T63_lc2_m, T63_lc2_C, T63_lc2_borderX, T63_lc2_borderY;

	int T63_lc3_horizontal, T63_lc3_vertical, T63_lc3_leftOrAbove, T63_lc3_cached;
	double T63_lc3_m, T63_lc3_C, T63_lc3_borderX, T63_lc3_borderY;

	int T63_lc1_lastY = Integer.MIN_VALUE, T63_lc2_lastY = Integer.MIN_VALUE, T63_lc3_lastY = Integer.MIN_VALUE;
	int T63_r, T63_g, T63_b;

	int T64_initializedWithValidData = false, T64_okay = false;
	double T64_sx, T64_sy, T64_minx, T64_miny, T64_maxx, T64_maxy;

	int T64_lc1_horizontal, T64_lc1_vertical, T64_lc1_leftOrAbove, T64_lc1_cached;
	double T64_lc1_m, T64_lc1_C, T64_lc1_borderX, T64_lc1_borderY;

	int T64_lc2_horizontal, T64_lc2_vertical, T64_lc2_leftOrAbove, T64_lc2_cached;
	double T64_lc2_m, T64_lc2_C, T64_lc2_borderX, T64_lc2_borderY;

	int T64_lc3_horizontal, T64_lc3_vertical, T64_lc3_leftOrAbove, T64_lc3_cached;
	double T64_lc3_m, T64_lc3_C, T64_lc3_borderX, T64_lc3_borderY;

	int T64_lc1_lastY = Integer.MIN_VALUE, T64_lc2_lastY = Integer.MIN_VALUE, T64_lc3_lastY = Integer.MIN_VALUE;
	int T64_r, T64_g, T64_b;

	int T65_initializedWithValidData = false, T65_okay = false;
	double T65_sx, T65_sy, T65_minx, T65_miny, T65_maxx, T65_maxy;

	int T65_lc1_horizontal, T65_lc1_vertical, T65_lc1_leftOrAbove, T65_lc1_cached;
	double T65_lc1_m, T65_lc1_C, T65_lc1_borderX, T65_lc1_borderY;

	int T65_lc2_horizontal, T65_lc2_vertical, T65_lc2_leftOrAbove, T65_lc2_cached;
	double T65_lc2_m, T65_lc2_C, T65_lc2_borderX, T65_lc2_borderY;

	int T65_lc3_horizontal, T65_lc3_vertical, T65_lc3_leftOrAbove, T65_lc3_cached;
	double T65_lc3_m, T65_lc3_C, T65_lc3_borderX, T65_lc3_borderY;

	int T65_lc1_lastY = Integer.MIN_VALUE, T65_lc2_lastY = Integer.MIN_VALUE, T65_lc3_lastY = Integer.MIN_VALUE;
	int T65_r, T65_g, T65_b;

	int T66_initializedWithValidData = false, T66_okay = false;
	double T66_sx, T66_sy, T66_minx, T66_miny, T66_maxx, T66_maxy;

	int T66_lc1_horizontal, T66_lc1_vertical, T66_lc1_leftOrAbove, T66_lc1_cached;
	double T66_lc1_m, T66_lc1_C, T66_lc1_borderX, T66_lc1_borderY;

	int T66_lc2_horizontal, T66_lc2_vertical, T66_lc2_leftOrAbove, T66_lc2_cached;
	double T66_lc2_m, T66_lc2_C, T66_lc2_borderX, T66_lc2_borderY;

	int T66_lc3_horizontal, T66_lc3_vertical, T66_lc3_leftOrAbove, T66_lc3_cached;
	double T66_lc3_m, T66_lc3_C, T66_lc3_borderX, T66_lc3_borderY;

	int T66_lc1_lastY = Integer.MIN_VALUE, T66_lc2_lastY = Integer.MIN_VALUE, T66_lc3_lastY = Integer.MIN_VALUE;
	int T66_r, T66_g, T66_b;

	int T67_initializedWithValidData = false, T67_okay = false;
	double T67_sx, T67_sy, T67_minx, T67_miny, T67_maxx, T67_maxy;

	int T67_lc1_horizontal, T67_lc1_vertical, T67_lc1_leftOrAbove, T67_lc1_cached;
	double T67_lc1_m, T67_lc1_C, T67_lc1_borderX, T67_lc1_borderY;

	int T67_lc2_horizontal, T67_lc2_vertical, T67_lc2_leftOrAbove, T67_lc2_cached;
	double T67_lc2_m, T67_lc2_C, T67_lc2_borderX, T67_lc2_borderY;

	int T67_lc3_horizontal, T67_lc3_vertical, T67_lc3_leftOrAbove, T67_lc3_cached;
	double T67_lc3_m, T67_lc3_C, T67_lc3_borderX, T67_lc3_borderY;

	int T67_lc1_lastY = Integer.MIN_VALUE, T67_lc2_lastY = Integer.MIN_VALUE, T67_lc3_lastY = Integer.MIN_VALUE;
	int T67_r, T67_g, T67_b;

	int T68_initializedWithValidData = false, T68_okay = false;
	double T68_sx, T68_sy, T68_minx, T68_miny, T68_maxx, T68_maxy;

	int T68_lc1_horizontal, T68_lc1_vertical, T68_lc1_leftOrAbove, T68_lc1_cached;
	double T68_lc1_m, T68_lc1_C, T68_lc1_borderX, T68_lc1_borderY;

	int T68_lc2_horizontal, T68_lc2_vertical, T68_lc2_leftOrAbove, T68_lc2_cached;
	double T68_lc2_m, T68_lc2_C, T68_lc2_borderX, T68_lc2_borderY;

	int T68_lc3_horizontal, T68_lc3_vertical, T68_lc3_leftOrAbove, T68_lc3_cached;
	double T68_lc3_m, T68_lc3_C, T68_lc3_borderX, T68_lc3_borderY;

	int T68_lc1_lastY = Integer.MIN_VALUE, T68_lc2_lastY = Integer.MIN_VALUE, T68_lc3_lastY = Integer.MIN_VALUE;
	int T68_r, T68_g, T68_b;

	int T69_initializedWithValidData = false, T69_okay = false;
	double T69_sx, T69_sy, T69_minx, T69_miny, T69_maxx, T69_maxy;

	int T69_lc1_horizontal, T69_lc1_vertical, T69_lc1_leftOrAbove, T69_lc1_cached;
	double T69_lc1_m, T69_lc1_C, T69_lc1_borderX, T69_lc1_borderY;

	int T69_lc2_horizontal, T69_lc2_vertical, T69_lc2_leftOrAbove, T69_lc2_cached;
	double T69_lc2_m, T69_lc2_C, T69_lc2_borderX, T69_lc2_borderY;

	int T69_lc3_horizontal, T69_lc3_vertical, T69_lc3_leftOrAbove, T69_lc3_cached;
	double T69_lc3_m, T69_lc3_C, T69_lc3_borderX, T69_lc3_borderY;

	int T69_lc1_lastY = Integer.MIN_VALUE, T69_lc2_lastY = Integer.MIN_VALUE, T69_lc3_lastY = Integer.MIN_VALUE;
	int T69_r, T69_g, T69_b;

	int T70_initializedWithValidData = false, T70_okay = false;
	double T70_sx, T70_sy, T70_minx, T70_miny, T70_maxx, T70_maxy;

	int T70_lc1_horizontal, T70_lc1_vertical, T70_lc1_leftOrAbove, T70_lc1_cached;
	double T70_lc1_m, T70_lc1_C, T70_lc1_borderX, T70_lc1_borderY;

	int T70_lc2_horizontal, T70_lc2_vertical, T70_lc2_leftOrAbove, T70_lc2_cached;
	double T70_lc2_m, T70_lc2_C, T70_lc2_borderX, T70_lc2_borderY;

	int T70_lc3_horizontal, T70_lc3_vertical, T70_lc3_leftOrAbove, T70_lc3_cached;
	double T70_lc3_m, T70_lc3_C, T70_lc3_borderX, T70_lc3_borderY;

	int T70_lc1_lastY = Integer.MIN_VALUE, T70_lc2_lastY = Integer.MIN_VALUE, T70_lc3_lastY = Integer.MIN_VALUE;
	int T70_r, T70_g, T70_b;

	int T71_initializedWithValidData = false, T71_okay = false;
	double T71_sx, T71_sy, T71_minx, T71_miny, T71_maxx, T71_maxy;

	int T71_lc1_horizontal, T71_lc1_vertical, T71_lc1_leftOrAbove, T71_lc1_cached;
	double T71_lc1_m, T71_lc1_C, T71_lc1_borderX, T71_lc1_borderY;

	int T71_lc2_horizontal, T71_lc2_vertical, T71_lc2_leftOrAbove, T71_lc2_cached;
	double T71_lc2_m, T71_lc2_C, T71_lc2_borderX, T71_lc2_borderY;

	int T71_lc3_horizontal, T71_lc3_vertical, T71_lc3_leftOrAbove, T71_lc3_cached;
	double T71_lc3_m, T71_lc3_C, T71_lc3_borderX, T71_lc3_borderY;

	int T71_lc1_lastY = Integer.MIN_VALUE, T71_lc2_lastY = Integer.MIN_VALUE, T71_lc3_lastY = Integer.MIN_VALUE;
	int T71_r, T71_g, T71_b;

	int T72_initializedWithValidData = false, T72_okay = false;
	double T72_sx, T72_sy, T72_minx, T72_miny, T72_maxx, T72_maxy;

	int T72_lc1_horizontal, T72_lc1_vertical, T72_lc1_leftOrAbove, T72_lc1_cached;
	double T72_lc1_m, T72_lc1_C, T72_lc1_borderX, T72_lc1_borderY;

	int T72_lc2_horizontal, T72_lc2_vertical, T72_lc2_leftOrAbove, T72_lc2_cached;
	double T72_lc2_m, T72_lc2_C, T72_lc2_borderX, T72_lc2_borderY;

	int T72_lc3_horizontal, T72_lc3_vertical, T72_lc3_leftOrAbove, T72_lc3_cached;
	double T72_lc3_m, T72_lc3_C, T72_lc3_borderX, T72_lc3_borderY;

	int T72_lc1_lastY = Integer.MIN_VALUE, T72_lc2_lastY = Integer.MIN_VALUE, T72_lc3_lastY = Integer.MIN_VALUE;
	int T72_r, T72_g, T72_b;

	int T73_initializedWithValidData = false, T73_okay = false;
	double T73_sx, T73_sy, T73_minx, T73_miny, T73_maxx, T73_maxy;

	int T73_lc1_horizontal, T73_lc1_vertical, T73_lc1_leftOrAbove, T73_lc1_cached;
	double T73_lc1_m, T73_lc1_C, T73_lc1_borderX, T73_lc1_borderY;

	int T73_lc2_horizontal, T73_lc2_vertical, T73_lc2_leftOrAbove, T73_lc2_cached;
	double T73_lc2_m, T73_lc2_C, T73_lc2_borderX, T73_lc2_borderY;

	int T73_lc3_horizontal, T73_lc3_vertical, T73_lc3_leftOrAbove, T73_lc3_cached;
	double T73_lc3_m, T73_lc3_C, T73_lc3_borderX, T73_lc3_borderY;

	int T73_lc1_lastY = Integer.MIN_VALUE, T73_lc2_lastY = Integer.MIN_VALUE, T73_lc3_lastY = Integer.MIN_VALUE;
	int T73_r, T73_g, T73_b;

	int T74_initializedWithValidData = false, T74_okay = false;
	double T74_sx, T74_sy, T74_minx, T74_miny, T74_maxx, T74_maxy;

	int T74_lc1_horizontal, T74_lc1_vertical, T74_lc1_leftOrAbove, T74_lc1_cached;
	double T74_lc1_m, T74_lc1_C, T74_lc1_borderX, T74_lc1_borderY;

	int T74_lc2_horizontal, T74_lc2_vertical, T74_lc2_leftOrAbove, T74_lc2_cached;
	double T74_lc2_m, T74_lc2_C, T74_lc2_borderX, T74_lc2_borderY;

	int T74_lc3_horizontal, T74_lc3_vertical, T74_lc3_leftOrAbove, T74_lc3_cached;
	double T74_lc3_m, T74_lc3_C, T74_lc3_borderX, T74_lc3_borderY;

	int T74_lc1_lastY = Integer.MIN_VALUE, T74_lc2_lastY = Integer.MIN_VALUE, T74_lc3_lastY = Integer.MIN_VALUE;
	int T74_r, T74_g, T74_b;

	int T75_initializedWithValidData = false, T75_okay = false;
	double T75_sx, T75_sy, T75_minx, T75_miny, T75_maxx, T75_maxy;

	int T75_lc1_horizontal, T75_lc1_vertical, T75_lc1_leftOrAbove, T75_lc1_cached;
	double T75_lc1_m, T75_lc1_C, T75_lc1_borderX, T75_lc1_borderY;

	int T75_lc2_horizontal, T75_lc2_vertical, T75_lc2_leftOrAbove, T75_lc2_cached;
	double T75_lc2_m, T75_lc2_C, T75_lc2_borderX, T75_lc2_borderY;

	int T75_lc3_horizontal, T75_lc3_vertical, T75_lc3_leftOrAbove, T75_lc3_cached;
	double T75_lc3_m, T75_lc3_C, T75_lc3_borderX, T75_lc3_borderY;

	int T75_lc1_lastY = Integer.MIN_VALUE, T75_lc2_lastY = Integer.MIN_VALUE, T75_lc3_lastY = Integer.MIN_VALUE;
	int T75_r, T75_g, T75_b;

	int T76_initializedWithValidData = false, T76_okay = false;
	double T76_sx, T76_sy, T76_minx, T76_miny, T76_maxx, T76_maxy;

	int T76_lc1_horizontal, T76_lc1_vertical, T76_lc1_leftOrAbove, T76_lc1_cached;
	double T76_lc1_m, T76_lc1_C, T76_lc1_borderX, T76_lc1_borderY;

	int T76_lc2_horizontal, T76_lc2_vertical, T76_lc2_leftOrAbove, T76_lc2_cached;
	double T76_lc2_m, T76_lc2_C, T76_lc2_borderX, T76_lc2_borderY;

	int T76_lc3_horizontal, T76_lc3_vertical, T76_lc3_leftOrAbove, T76_lc3_cached;
	double T76_lc3_m, T76_lc3_C, T76_lc3_borderX, T76_lc3_borderY;

	int T76_lc1_lastY = Integer.MIN_VALUE, T76_lc2_lastY = Integer.MIN_VALUE, T76_lc3_lastY = Integer.MIN_VALUE;
	int T76_r, T76_g, T76_b;

	int T77_initializedWithValidData = false, T77_okay = false;
	double T77_sx, T77_sy, T77_minx, T77_miny, T77_maxx, T77_maxy;

	int T77_lc1_horizontal, T77_lc1_vertical, T77_lc1_leftOrAbove, T77_lc1_cached;
	double T77_lc1_m, T77_lc1_C, T77_lc1_borderX, T77_lc1_borderY;

	int T77_lc2_horizontal, T77_lc2_vertical, T77_lc2_leftOrAbove, T77_lc2_cached;
	double T77_lc2_m, T77_lc2_C, T77_lc2_borderX, T77_lc2_borderY;

	int T77_lc3_horizontal, T77_lc3_vertical, T77_lc3_leftOrAbove, T77_lc3_cached;
	double T77_lc3_m, T77_lc3_C, T77_lc3_borderX, T77_lc3_borderY;

	int T77_lc1_lastY = Integer.MIN_VALUE, T77_lc2_lastY = Integer.MIN_VALUE, T77_lc3_lastY = Integer.MIN_VALUE;
	int T77_r, T77_g, T77_b;

	int T78_initializedWithValidData = false, T78_okay = false;
	double T78_sx, T78_sy, T78_minx, T78_miny, T78_maxx, T78_maxy;

	int T78_lc1_horizontal, T78_lc1_vertical, T78_lc1_leftOrAbove, T78_lc1_cached;
	double T78_lc1_m, T78_lc1_C, T78_lc1_borderX, T78_lc1_borderY;

	int T78_lc2_horizontal, T78_lc2_vertical, T78_lc2_leftOrAbove, T78_lc2_cached;
	double T78_lc2_m, T78_lc2_C, T78_lc2_borderX, T78_lc2_borderY;

	int T78_lc3_horizontal, T78_lc3_vertical, T78_lc3_leftOrAbove, T78_lc3_cached;
	double T78_lc3_m, T78_lc3_C, T78_lc3_borderX, T78_lc3_borderY;

	int T78_lc1_lastY = Integer.MIN_VALUE, T78_lc2_lastY = Integer.MIN_VALUE, T78_lc3_lastY = Integer.MIN_VALUE;
	int T78_r, T78_g, T78_b;

	int T79_initializedWithValidData = false, T79_okay = false;
	double T79_sx, T79_sy, T79_minx, T79_miny, T79_maxx, T79_maxy;

	int T79_lc1_horizontal, T79_lc1_vertical, T79_lc1_leftOrAbove, T79_lc1_cached;
	double T79_lc1_m, T79_lc1_C, T79_lc1_borderX, T79_lc1_borderY;

	int T79_lc2_horizontal, T79_lc2_vertical, T79_lc2_leftOrAbove, T79_lc2_cached;
	double T79_lc2_m, T79_lc2_C, T79_lc2_borderX, T79_lc2_borderY;

	int T79_lc3_horizontal, T79_lc3_vertical, T79_lc3_leftOrAbove, T79_lc3_cached;
	double T79_lc3_m, T79_lc3_C, T79_lc3_borderX, T79_lc3_borderY;

	int T79_lc1_lastY = Integer.MIN_VALUE, T79_lc2_lastY = Integer.MIN_VALUE, T79_lc3_lastY = Integer.MIN_VALUE;
	int T79_r, T79_g, T79_b;

	int T80_initializedWithValidData = false, T80_okay = false;
	double T80_sx, T80_sy, T80_minx, T80_miny, T80_maxx, T80_maxy;

	int T80_lc1_horizontal, T80_lc1_vertical, T80_lc1_leftOrAbove, T80_lc1_cached;
	double T80_lc1_m, T80_lc1_C, T80_lc1_borderX, T80_lc1_borderY;

	int T80_lc2_horizontal, T80_lc2_vertical, T80_lc2_leftOrAbove, T80_lc2_cached;
	double T80_lc2_m, T80_lc2_C, T80_lc2_borderX, T80_lc2_borderY;

	int T80_lc3_horizontal, T80_lc3_vertical, T80_lc3_leftOrAbove, T80_lc3_cached;
	double T80_lc3_m, T80_lc3_C, T80_lc3_borderX, T80_lc3_borderY;

	int T80_lc1_lastY = Integer.MIN_VALUE, T80_lc2_lastY = Integer.MIN_VALUE, T80_lc3_lastY = Integer.MIN_VALUE;
	int T80_r, T80_g, T80_b;

	int T81_initializedWithValidData = false, T81_okay = false;
	double T81_sx, T81_sy, T81_minx, T81_miny, T81_maxx, T81_maxy;

	int T81_lc1_horizontal, T81_lc1_vertical, T81_lc1_leftOrAbove, T81_lc1_cached;
	double T81_lc1_m, T81_lc1_C, T81_lc1_borderX, T81_lc1_borderY;

	int T81_lc2_horizontal, T81_lc2_vertical, T81_lc2_leftOrAbove, T81_lc2_cached;
	double T81_lc2_m, T81_lc2_C, T81_lc2_borderX, T81_lc2_borderY;

	int T81_lc3_horizontal, T81_lc3_vertical, T81_lc3_leftOrAbove, T81_lc3_cached;
	double T81_lc3_m, T81_lc3_C, T81_lc3_borderX, T81_lc3_borderY;

	int T81_lc1_lastY = Integer.MIN_VALUE, T81_lc2_lastY = Integer.MIN_VALUE, T81_lc3_lastY = Integer.MIN_VALUE;
	int T81_r, T81_g, T81_b;

	int T82_initializedWithValidData = false, T82_okay = false;
	double T82_sx, T82_sy, T82_minx, T82_miny, T82_maxx, T82_maxy;

	int T82_lc1_horizontal, T82_lc1_vertical, T82_lc1_leftOrAbove, T82_lc1_cached;
	double T82_lc1_m, T82_lc1_C, T82_lc1_borderX, T82_lc1_borderY;

	int T82_lc2_horizontal, T82_lc2_vertical, T82_lc2_leftOrAbove, T82_lc2_cached;
	double T82_lc2_m, T82_lc2_C, T82_lc2_borderX, T82_lc2_borderY;

	int T82_lc3_horizontal, T82_lc3_vertical, T82_lc3_leftOrAbove, T82_lc3_cached;
	double T82_lc3_m, T82_lc3_C, T82_lc3_borderX, T82_lc3_borderY;

	int T82_lc1_lastY = Integer.MIN_VALUE, T82_lc2_lastY = Integer.MIN_VALUE, T82_lc3_lastY = Integer.MIN_VALUE;
	int T82_r, T82_g, T82_b;

	int T83_initializedWithValidData = false, T83_okay = false;
	double T83_sx, T83_sy, T83_minx, T83_miny, T83_maxx, T83_maxy;

	int T83_lc1_horizontal, T83_lc1_vertical, T83_lc1_leftOrAbove, T83_lc1_cached;
	double T83_lc1_m, T83_lc1_C, T83_lc1_borderX, T83_lc1_borderY;

	int T83_lc2_horizontal, T83_lc2_vertical, T83_lc2_leftOrAbove, T83_lc2_cached;
	double T83_lc2_m, T83_lc2_C, T83_lc2_borderX, T83_lc2_borderY;

	int T83_lc3_horizontal, T83_lc3_vertical, T83_lc3_leftOrAbove, T83_lc3_cached;
	double T83_lc3_m, T83_lc3_C, T83_lc3_borderX, T83_lc3_borderY;

	int T83_lc1_lastY = Integer.MIN_VALUE, T83_lc2_lastY = Integer.MIN_VALUE, T83_lc3_lastY = Integer.MIN_VALUE;
	int T83_r, T83_g, T83_b;

	int T84_initializedWithValidData = false, T84_okay = false;
	double T84_sx, T84_sy, T84_minx, T84_miny, T84_maxx, T84_maxy;

	int T84_lc1_horizontal, T84_lc1_vertical, T84_lc1_leftOrAbove, T84_lc1_cached;
	double T84_lc1_m, T84_lc1_C, T84_lc1_borderX, T84_lc1_borderY;

	int T84_lc2_horizontal, T84_lc2_vertical, T84_lc2_leftOrAbove, T84_lc2_cached;
	double T84_lc2_m, T84_lc2_C, T84_lc2_borderX, T84_lc2_borderY;

	int T84_lc3_horizontal, T84_lc3_vertical, T84_lc3_leftOrAbove, T84_lc3_cached;
	double T84_lc3_m, T84_lc3_C, T84_lc3_borderX, T84_lc3_borderY;

	int T84_lc1_lastY = Integer.MIN_VALUE, T84_lc2_lastY = Integer.MIN_VALUE, T84_lc3_lastY = Integer.MIN_VALUE;
	int T84_r, T84_g, T84_b;

	int T85_initializedWithValidData = false, T85_okay = false;
	double T85_sx, T85_sy, T85_minx, T85_miny, T85_maxx, T85_maxy;

	int T85_lc1_horizontal, T85_lc1_vertical, T85_lc1_leftOrAbove, T85_lc1_cached;
	double T85_lc1_m, T85_lc1_C, T85_lc1_borderX, T85_lc1_borderY;

	int T85_lc2_horizontal, T85_lc2_vertical, T85_lc2_leftOrAbove, T85_lc2_cached;
	double T85_lc2_m, T85_lc2_C, T85_lc2_borderX, T85_lc2_borderY;

	int T85_lc3_horizontal, T85_lc3_vertical, T85_lc3_leftOrAbove, T85_lc3_cached;
	double T85_lc3_m, T85_lc3_C, T85_lc3_borderX, T85_lc3_borderY;

	int T85_lc1_lastY = Integer.MIN_VALUE, T85_lc2_lastY = Integer.MIN_VALUE, T85_lc3_lastY = Integer.MIN_VALUE;
	int T85_r, T85_g, T85_b;

	int T86_initializedWithValidData = false, T86_okay = false;
	double T86_sx, T86_sy, T86_minx, T86_miny, T86_maxx, T86_maxy;

	int T86_lc1_horizontal, T86_lc1_vertical, T86_lc1_leftOrAbove, T86_lc1_cached;
	double T86_lc1_m, T86_lc1_C, T86_lc1_borderX, T86_lc1_borderY;

	int T86_lc2_horizontal, T86_lc2_vertical, T86_lc2_leftOrAbove, T86_lc2_cached;
	double T86_lc2_m, T86_lc2_C, T86_lc2_borderX, T86_lc2_borderY;

	int T86_lc3_horizontal, T86_lc3_vertical, T86_lc3_leftOrAbove, T86_lc3_cached;
	double T86_lc3_m, T86_lc3_C, T86_lc3_borderX, T86_lc3_borderY;

	int T86_lc1_lastY = Integer.MIN_VALUE, T86_lc2_lastY = Integer.MIN_VALUE, T86_lc3_lastY = Integer.MIN_VALUE;
	int T86_r, T86_g, T86_b;

	int T87_initializedWithValidData = false, T87_okay = false;
	double T87_sx, T87_sy, T87_minx, T87_miny, T87_maxx, T87_maxy;

	int T87_lc1_horizontal, T87_lc1_vertical, T87_lc1_leftOrAbove, T87_lc1_cached;
	double T87_lc1_m, T87_lc1_C, T87_lc1_borderX, T87_lc1_borderY;

	int T87_lc2_horizontal, T87_lc2_vertical, T87_lc2_leftOrAbove, T87_lc2_cached;
	double T87_lc2_m, T87_lc2_C, T87_lc2_borderX, T87_lc2_borderY;

	int T87_lc3_horizontal, T87_lc3_vertical, T87_lc3_leftOrAbove, T87_lc3_cached;
	double T87_lc3_m, T87_lc3_C, T87_lc3_borderX, T87_lc3_borderY;

	int T87_lc1_lastY = Integer.MIN_VALUE, T87_lc2_lastY = Integer.MIN_VALUE, T87_lc3_lastY = Integer.MIN_VALUE;
	int T87_r, T87_g, T87_b;

	int T88_initializedWithValidData = false, T88_okay = false;
	double T88_sx, T88_sy, T88_minx, T88_miny, T88_maxx, T88_maxy;

	int T88_lc1_horizontal, T88_lc1_vertical, T88_lc1_leftOrAbove, T88_lc1_cached;
	double T88_lc1_m, T88_lc1_C, T88_lc1_borderX, T88_lc1_borderY;

	int T88_lc2_horizontal, T88_lc2_vertical, T88_lc2_leftOrAbove, T88_lc2_cached;
	double T88_lc2_m, T88_lc2_C, T88_lc2_borderX, T88_lc2_borderY;

	int T88_lc3_horizontal, T88_lc3_vertical, T88_lc3_leftOrAbove, T88_lc3_cached;
	double T88_lc3_m, T88_lc3_C, T88_lc3_borderX, T88_lc3_borderY;

	int T88_lc1_lastY = Integer.MIN_VALUE, T88_lc2_lastY = Integer.MIN_VALUE, T88_lc3_lastY = Integer.MIN_VALUE;
	int T88_r, T88_g, T88_b;

	int T89_initializedWithValidData = false, T89_okay = false;
	double T89_sx, T89_sy, T89_minx, T89_miny, T89_maxx, T89_maxy;

	int T89_lc1_horizontal, T89_lc1_vertical, T89_lc1_leftOrAbove, T89_lc1_cached;
	double T89_lc1_m, T89_lc1_C, T89_lc1_borderX, T89_lc1_borderY;

	int T89_lc2_horizontal, T89_lc2_vertical, T89_lc2_leftOrAbove, T89_lc2_cached;
	double T89_lc2_m, T89_lc2_C, T89_lc2_borderX, T89_lc2_borderY;

	int T89_lc3_horizontal, T89_lc3_vertical, T89_lc3_leftOrAbove, T89_lc3_cached;
	double T89_lc3_m, T89_lc3_C, T89_lc3_borderX, T89_lc3_borderY;

	int T89_lc1_lastY = Integer.MIN_VALUE, T89_lc2_lastY = Integer.MIN_VALUE, T89_lc3_lastY = Integer.MIN_VALUE;
	int T89_r, T89_g, T89_b;

	int T90_initializedWithValidData = false, T90_okay = false;
	double T90_sx, T90_sy, T90_minx, T90_miny, T90_maxx, T90_maxy;

	int T90_lc1_horizontal, T90_lc1_vertical, T90_lc1_leftOrAbove, T90_lc1_cached;
	double T90_lc1_m, T90_lc1_C, T90_lc1_borderX, T90_lc1_borderY;

	int T90_lc2_horizontal, T90_lc2_vertical, T90_lc2_leftOrAbove, T90_lc2_cached;
	double T90_lc2_m, T90_lc2_C, T90_lc2_borderX, T90_lc2_borderY;

	int T90_lc3_horizontal, T90_lc3_vertical, T90_lc3_leftOrAbove, T90_lc3_cached;
	double T90_lc3_m, T90_lc3_C, T90_lc3_borderX, T90_lc3_borderY;

	int T90_lc1_lastY = Integer.MIN_VALUE, T90_lc2_lastY = Integer.MIN_VALUE, T90_lc3_lastY = Integer.MIN_VALUE;
	int T90_r, T90_g, T90_b;

	int T91_initializedWithValidData = false, T91_okay = false;
	double T91_sx, T91_sy, T91_minx, T91_miny, T91_maxx, T91_maxy;

	int T91_lc1_horizontal, T91_lc1_vertical, T91_lc1_leftOrAbove, T91_lc1_cached;
	double T91_lc1_m, T91_lc1_C, T91_lc1_borderX, T91_lc1_borderY;

	int T91_lc2_horizontal, T91_lc2_vertical, T91_lc2_leftOrAbove, T91_lc2_cached;
	double T91_lc2_m, T91_lc2_C, T91_lc2_borderX, T91_lc2_borderY;

	int T91_lc3_horizontal, T91_lc3_vertical, T91_lc3_leftOrAbove, T91_lc3_cached;
	double T91_lc3_m, T91_lc3_C, T91_lc3_borderX, T91_lc3_borderY;

	int T91_lc1_lastY = Integer.MIN_VALUE, T91_lc2_lastY = Integer.MIN_VALUE, T91_lc3_lastY = Integer.MIN_VALUE;
	int T91_r, T91_g, T91_b;

	int T92_initializedWithValidData = false, T92_okay = false;
	double T92_sx, T92_sy, T92_minx, T92_miny, T92_maxx, T92_maxy;

	int T92_lc1_horizontal, T92_lc1_vertical, T92_lc1_leftOrAbove, T92_lc1_cached;
	double T92_lc1_m, T92_lc1_C, T92_lc1_borderX, T92_lc1_borderY;

	int T92_lc2_horizontal, T92_lc2_vertical, T92_lc2_leftOrAbove, T92_lc2_cached;
	double T92_lc2_m, T92_lc2_C, T92_lc2_borderX, T92_lc2_borderY;

	int T92_lc3_horizontal, T92_lc3_vertical, T92_lc3_leftOrAbove, T92_lc3_cached;
	double T92_lc3_m, T92_lc3_C, T92_lc3_borderX, T92_lc3_borderY;

	int T92_lc1_lastY = Integer.MIN_VALUE, T92_lc2_lastY = Integer.MIN_VALUE, T92_lc3_lastY = Integer.MIN_VALUE;
	int T92_r, T92_g, T92_b;

	int T93_initializedWithValidData = false, T93_okay = false;
	double T93_sx, T93_sy, T93_minx, T93_miny, T93_maxx, T93_maxy;

	int T93_lc1_horizontal, T93_lc1_vertical, T93_lc1_leftOrAbove, T93_lc1_cached;
	double T93_lc1_m, T93_lc1_C, T93_lc1_borderX, T93_lc1_borderY;

	int T93_lc2_horizontal, T93_lc2_vertical, T93_lc2_leftOrAbove, T93_lc2_cached;
	double T93_lc2_m, T93_lc2_C, T93_lc2_borderX, T93_lc2_borderY;

	int T93_lc3_horizontal, T93_lc3_vertical, T93_lc3_leftOrAbove, T93_lc3_cached;
	double T93_lc3_m, T93_lc3_C, T93_lc3_borderX, T93_lc3_borderY;

	int T93_lc1_lastY = Integer.MIN_VALUE, T93_lc2_lastY = Integer.MIN_VALUE, T93_lc3_lastY = Integer.MIN_VALUE;
	int T93_r, T93_g, T93_b;

	int T94_initializedWithValidData = false, T94_okay = false;
	double T94_sx, T94_sy, T94_minx, T94_miny, T94_maxx, T94_maxy;

	int T94_lc1_horizontal, T94_lc1_vertical, T94_lc1_leftOrAbove, T94_lc1_cached;
	double T94_lc1_m, T94_lc1_C, T94_lc1_borderX, T94_lc1_borderY;

	int T94_lc2_horizontal, T94_lc2_vertical, T94_lc2_leftOrAbove, T94_lc2_cached;
	double T94_lc2_m, T94_lc2_C, T94_lc2_borderX, T94_lc2_borderY;

	int T94_lc3_horizontal, T94_lc3_vertical, T94_lc3_leftOrAbove, T94_lc3_cached;
	double T94_lc3_m, T94_lc3_C, T94_lc3_borderX, T94_lc3_borderY;

	int T94_lc1_lastY = Integer.MIN_VALUE, T94_lc2_lastY = Integer.MIN_VALUE, T94_lc3_lastY = Integer.MIN_VALUE;
	int T94_r, T94_g, T94_b;

	int T95_initializedWithValidData = false, T95_okay = false;
	double T95_sx, T95_sy, T95_minx, T95_miny, T95_maxx, T95_maxy;

	int T95_lc1_horizontal, T95_lc1_vertical, T95_lc1_leftOrAbove, T95_lc1_cached;
	double T95_lc1_m, T95_lc1_C, T95_lc1_borderX, T95_lc1_borderY;

	int T95_lc2_horizontal, T95_lc2_vertical, T95_lc2_leftOrAbove, T95_lc2_cached;
	double T95_lc2_m, T95_lc2_C, T95_lc2_borderX, T95_lc2_borderY;

	int T95_lc3_horizontal, T95_lc3_vertical, T95_lc3_leftOrAbove, T95_lc3_cached;
	double T95_lc3_m, T95_lc3_C, T95_lc3_borderX, T95_lc3_borderY;

	int T95_lc1_lastY = Integer.MIN_VALUE, T95_lc2_lastY = Integer.MIN_VALUE, T95_lc3_lastY = Integer.MIN_VALUE;
	int T95_r, T95_g, T95_b;

	int T96_initializedWithValidData = false, T96_okay = false;
	double T96_sx, T96_sy, T96_minx, T96_miny, T96_maxx, T96_maxy;

	int T96_lc1_horizontal, T96_lc1_vertical, T96_lc1_leftOrAbove, T96_lc1_cached;
	double T96_lc1_m, T96_lc1_C, T96_lc1_borderX, T96_lc1_borderY;

	int T96_lc2_horizontal, T96_lc2_vertical, T96_lc2_leftOrAbove, T96_lc2_cached;
	double T96_lc2_m, T96_lc2_C, T96_lc2_borderX, T96_lc2_borderY;

	int T96_lc3_horizontal, T96_lc3_vertical, T96_lc3_leftOrAbove, T96_lc3_cached;
	double T96_lc3_m, T96_lc3_C, T96_lc3_borderX, T96_lc3_borderY;

	int T96_lc1_lastY = Integer.MIN_VALUE, T96_lc2_lastY = Integer.MIN_VALUE, T96_lc3_lastY = Integer.MIN_VALUE;
	int T96_r, T96_g, T96_b;

	int T97_initializedWithValidData = false, T97_okay = false;
	double T97_sx, T97_sy, T97_minx, T97_miny, T97_maxx, T97_maxy;

	int T97_lc1_horizontal, T97_lc1_vertical, T97_lc1_leftOrAbove, T97_lc1_cached;
	double T97_lc1_m, T97_lc1_C, T97_lc1_borderX, T97_lc1_borderY;

	int T97_lc2_horizontal, T97_lc2_vertical, T97_lc2_leftOrAbove, T97_lc2_cached;
	double T97_lc2_m, T97_lc2_C, T97_lc2_borderX, T97_lc2_borderY;

	int T97_lc3_horizontal, T97_lc3_vertical, T97_lc3_leftOrAbove, T97_lc3_cached;
	double T97_lc3_m, T97_lc3_C, T97_lc3_borderX, T97_lc3_borderY;

	int T97_lc1_lastY = Integer.MIN_VALUE, T97_lc2_lastY = Integer.MIN_VALUE, T97_lc3_lastY = Integer.MIN_VALUE;
	int T97_r, T97_g, T97_b;

	int T98_initializedWithValidData = false, T98_okay = false;
	double T98_sx, T98_sy, T98_minx, T98_miny, T98_maxx, T98_maxy;

	int T98_lc1_horizontal, T98_lc1_vertical, T98_lc1_leftOrAbove, T98_lc1_cached;
	double T98_lc1_m, T98_lc1_C, T98_lc1_borderX, T98_lc1_borderY;

	int T98_lc2_horizontal, T98_lc2_vertical, T98_lc2_leftOrAbove, T98_lc2_cached;
	double T98_lc2_m, T98_lc2_C, T98_lc2_borderX, T98_lc2_borderY;

	int T98_lc3_horizontal, T98_lc3_vertical, T98_lc3_leftOrAbove, T98_lc3_cached;
	double T98_lc3_m, T98_lc3_C, T98_lc3_borderX, T98_lc3_borderY;

	int T98_lc1_lastY = Integer.MIN_VALUE, T98_lc2_lastY = Integer.MIN_VALUE, T98_lc3_lastY = Integer.MIN_VALUE;
	int T98_r, T98_g, T98_b;

	int T99_initializedWithValidData = false, T99_okay = false;
	double T99_sx, T99_sy, T99_minx, T99_miny, T99_maxx, T99_maxy;

	int T99_lc1_horizontal, T99_lc1_vertical, T99_lc1_leftOrAbove, T99_lc1_cached;
	double T99_lc1_m, T99_lc1_C, T99_lc1_borderX, T99_lc1_borderY;

	int T99_lc2_horizontal, T99_lc2_vertical, T99_lc2_leftOrAbove, T99_lc2_cached;
	double T99_lc2_m, T99_lc2_C, T99_lc2_borderX, T99_lc2_borderY;

	int T99_lc3_horizontal, T99_lc3_vertical, T99_lc3_leftOrAbove, T99_lc3_cached;
	double T99_lc3_m, T99_lc3_C, T99_lc3_borderX, T99_lc3_borderY;

	int T99_lc1_lastY = Integer.MIN_VALUE, T99_lc2_lastY = Integer.MIN_VALUE, T99_lc3_lastY = Integer.MIN_VALUE;
	int T99_r, T99_g, T99_b;

	int T100_initializedWithValidData = false, T100_okay = false;
	double T100_sx, T100_sy, T100_minx, T100_miny, T100_maxx, T100_maxy;

	int T100_lc1_horizontal, T100_lc1_vertical, T100_lc1_leftOrAbove, T100_lc1_cached;
	double T100_lc1_m, T100_lc1_C, T100_lc1_borderX, T100_lc1_borderY;

	int T100_lc2_horizontal, T100_lc2_vertical, T100_lc2_leftOrAbove, T100_lc2_cached;
	double T100_lc2_m, T100_lc2_C, T100_lc2_borderX, T100_lc2_borderY;

	int T100_lc3_horizontal, T100_lc3_vertical, T100_lc3_leftOrAbove, T100_lc3_cached;
	double T100_lc3_m, T100_lc3_C, T100_lc3_borderX, T100_lc3_borderY;

	int T100_lc1_lastY = Integer.MIN_VALUE, T100_lc2_lastY = Integer.MIN_VALUE, T100_lc3_lastY = Integer.MIN_VALUE;
	int T100_r, T100_g, T100_b;

	int T101_initializedWithValidData = false, T101_okay = false;
	double T101_sx, T101_sy, T101_minx, T101_miny, T101_maxx, T101_maxy;

	int T101_lc1_horizontal, T101_lc1_vertical, T101_lc1_leftOrAbove, T101_lc1_cached;
	double T101_lc1_m, T101_lc1_C, T101_lc1_borderX, T101_lc1_borderY;

	int T101_lc2_horizontal, T101_lc2_vertical, T101_lc2_leftOrAbove, T101_lc2_cached;
	double T101_lc2_m, T101_lc2_C, T101_lc2_borderX, T101_lc2_borderY;

	int T101_lc3_horizontal, T101_lc3_vertical, T101_lc3_leftOrAbove, T101_lc3_cached;
	double T101_lc3_m, T101_lc3_C, T101_lc3_borderX, T101_lc3_borderY;

	int T101_lc1_lastY = Integer.MIN_VALUE, T101_lc2_lastY = Integer.MIN_VALUE, T101_lc3_lastY = Integer.MIN_VALUE;
	int T101_r, T101_g, T101_b;

	int T102_initializedWithValidData = false, T102_okay = false;
	double T102_sx, T102_sy, T102_minx, T102_miny, T102_maxx, T102_maxy;

	int T102_lc1_horizontal, T102_lc1_vertical, T102_lc1_leftOrAbove, T102_lc1_cached;
	double T102_lc1_m, T102_lc1_C, T102_lc1_borderX, T102_lc1_borderY;

	int T102_lc2_horizontal, T102_lc2_vertical, T102_lc2_leftOrAbove, T102_lc2_cached;
	double T102_lc2_m, T102_lc2_C, T102_lc2_borderX, T102_lc2_borderY;

	int T102_lc3_horizontal, T102_lc3_vertical, T102_lc3_leftOrAbove, T102_lc3_cached;
	double T102_lc3_m, T102_lc3_C, T102_lc3_borderX, T102_lc3_borderY;

	int T102_lc1_lastY = Integer.MIN_VALUE, T102_lc2_lastY = Integer.MIN_VALUE, T102_lc3_lastY = Integer.MIN_VALUE;
	int T102_r, T102_g, T102_b;

	int T103_initializedWithValidData = false, T103_okay = false;
	double T103_sx, T103_sy, T103_minx, T103_miny, T103_maxx, T103_maxy;

	int T103_lc1_horizontal, T103_lc1_vertical, T103_lc1_leftOrAbove, T103_lc1_cached;
	double T103_lc1_m, T103_lc1_C, T103_lc1_borderX, T103_lc1_borderY;

	int T103_lc2_horizontal, T103_lc2_vertical, T103_lc2_leftOrAbove, T103_lc2_cached;
	double T103_lc2_m, T103_lc2_C, T103_lc2_borderX, T103_lc2_borderY;

	int T103_lc3_horizontal, T103_lc3_vertical, T103_lc3_leftOrAbove, T103_lc3_cached;
	double T103_lc3_m, T103_lc3_C, T103_lc3_borderX, T103_lc3_borderY;

	int T103_lc1_lastY = Integer.MIN_VALUE, T103_lc2_lastY = Integer.MIN_VALUE, T103_lc3_lastY = Integer.MIN_VALUE;
	int T103_r, T103_g, T103_b;

	int T104_initializedWithValidData = false, T104_okay = false;
	double T104_sx, T104_sy, T104_minx, T104_miny, T104_maxx, T104_maxy;

	int T104_lc1_horizontal, T104_lc1_vertical, T104_lc1_leftOrAbove, T104_lc1_cached;
	double T104_lc1_m, T104_lc1_C, T104_lc1_borderX, T104_lc1_borderY;

	int T104_lc2_horizontal, T104_lc2_vertical, T104_lc2_leftOrAbove, T104_lc2_cached;
	double T104_lc2_m, T104_lc2_C, T104_lc2_borderX, T104_lc2_borderY;

	int T104_lc3_horizontal, T104_lc3_vertical, T104_lc3_leftOrAbove, T104_lc3_cached;
	double T104_lc3_m, T104_lc3_C, T104_lc3_borderX, T104_lc3_borderY;

	int T104_lc1_lastY = Integer.MIN_VALUE, T104_lc2_lastY = Integer.MIN_VALUE, T104_lc3_lastY = Integer.MIN_VALUE;
	int T104_r, T104_g, T104_b;

	int T105_initializedWithValidData = false, T105_okay = false;
	double T105_sx, T105_sy, T105_minx, T105_miny, T105_maxx, T105_maxy;

	int T105_lc1_horizontal, T105_lc1_vertical, T105_lc1_leftOrAbove, T105_lc1_cached;
	double T105_lc1_m, T105_lc1_C, T105_lc1_borderX, T105_lc1_borderY;

	int T105_lc2_horizontal, T105_lc2_vertical, T105_lc2_leftOrAbove, T105_lc2_cached;
	double T105_lc2_m, T105_lc2_C, T105_lc2_borderX, T105_lc2_borderY;

	int T105_lc3_horizontal, T105_lc3_vertical, T105_lc3_leftOrAbove, T105_lc3_cached;
	double T105_lc3_m, T105_lc3_C, T105_lc3_borderX, T105_lc3_borderY;

	int T105_lc1_lastY = Integer.MIN_VALUE, T105_lc2_lastY = Integer.MIN_VALUE, T105_lc3_lastY = Integer.MIN_VALUE;
	int T105_r, T105_g, T105_b;

	int T106_initializedWithValidData = false, T106_okay = false;
	double T106_sx, T106_sy, T106_minx, T106_miny, T106_maxx, T106_maxy;

	int T106_lc1_horizontal, T106_lc1_vertical, T106_lc1_leftOrAbove, T106_lc1_cached;
	double T106_lc1_m, T106_lc1_C, T106_lc1_borderX, T106_lc1_borderY;

	int T106_lc2_horizontal, T106_lc2_vertical, T106_lc2_leftOrAbove, T106_lc2_cached;
	double T106_lc2_m, T106_lc2_C, T106_lc2_borderX, T106_lc2_borderY;

	int T106_lc3_horizontal, T106_lc3_vertical, T106_lc3_leftOrAbove, T106_lc3_cached;
	double T106_lc3_m, T106_lc3_C, T106_lc3_borderX, T106_lc3_borderY;

	int T106_lc1_lastY = Integer.MIN_VALUE, T106_lc2_lastY = Integer.MIN_VALUE, T106_lc3_lastY = Integer.MIN_VALUE;
	int T106_r, T106_g, T106_b;

	int T107_initializedWithValidData = false, T107_okay = false;
	double T107_sx, T107_sy, T107_minx, T107_miny, T107_maxx, T107_maxy;

	int T107_lc1_horizontal, T107_lc1_vertical, T107_lc1_leftOrAbove, T107_lc1_cached;
	double T107_lc1_m, T107_lc1_C, T107_lc1_borderX, T107_lc1_borderY;

	int T107_lc2_horizontal, T107_lc2_vertical, T107_lc2_leftOrAbove, T107_lc2_cached;
	double T107_lc2_m, T107_lc2_C, T107_lc2_borderX, T107_lc2_borderY;

	int T107_lc3_horizontal, T107_lc3_vertical, T107_lc3_leftOrAbove, T107_lc3_cached;
	double T107_lc3_m, T107_lc3_C, T107_lc3_borderX, T107_lc3_borderY;

	int T107_lc1_lastY = Integer.MIN_VALUE, T107_lc2_lastY = Integer.MIN_VALUE, T107_lc3_lastY = Integer.MIN_VALUE;
	int T107_r, T107_g, T107_b;

	int T108_initializedWithValidData = false, T108_okay = false;
	double T108_sx, T108_sy, T108_minx, T108_miny, T108_maxx, T108_maxy;

	int T108_lc1_horizontal, T108_lc1_vertical, T108_lc1_leftOrAbove, T108_lc1_cached;
	double T108_lc1_m, T108_lc1_C, T108_lc1_borderX, T108_lc1_borderY;

	int T108_lc2_horizontal, T108_lc2_vertical, T108_lc2_leftOrAbove, T108_lc2_cached;
	double T108_lc2_m, T108_lc2_C, T108_lc2_borderX, T108_lc2_borderY;

	int T108_lc3_horizontal, T108_lc3_vertical, T108_lc3_leftOrAbove, T108_lc3_cached;
	double T108_lc3_m, T108_lc3_C, T108_lc3_borderX, T108_lc3_borderY;

	int T108_lc1_lastY = Integer.MIN_VALUE, T108_lc2_lastY = Integer.MIN_VALUE, T108_lc3_lastY = Integer.MIN_VALUE;
	int T108_r, T108_g, T108_b;

	int T109_initializedWithValidData = false, T109_okay = false;
	double T109_sx, T109_sy, T109_minx, T109_miny, T109_maxx, T109_maxy;

	int T109_lc1_horizontal, T109_lc1_vertical, T109_lc1_leftOrAbove, T109_lc1_cached;
	double T109_lc1_m, T109_lc1_C, T109_lc1_borderX, T109_lc1_borderY;

	int T109_lc2_horizontal, T109_lc2_vertical, T109_lc2_leftOrAbove, T109_lc2_cached;
	double T109_lc2_m, T109_lc2_C, T109_lc2_borderX, T109_lc2_borderY;

	int T109_lc3_horizontal, T109_lc3_vertical, T109_lc3_leftOrAbove, T109_lc3_cached;
	double T109_lc3_m, T109_lc3_C, T109_lc3_borderX, T109_lc3_borderY;

	int T109_lc1_lastY = Integer.MIN_VALUE, T109_lc2_lastY = Integer.MIN_VALUE, T109_lc3_lastY = Integer.MIN_VALUE;
	int T109_r, T109_g, T109_b;

	int T110_initializedWithValidData = false, T110_okay = false;
	double T110_sx, T110_sy, T110_minx, T110_miny, T110_maxx, T110_maxy;

	int T110_lc1_horizontal, T110_lc1_vertical, T110_lc1_leftOrAbove, T110_lc1_cached;
	double T110_lc1_m, T110_lc1_C, T110_lc1_borderX, T110_lc1_borderY;

	int T110_lc2_horizontal, T110_lc2_vertical, T110_lc2_leftOrAbove, T110_lc2_cached;
	double T110_lc2_m, T110_lc2_C, T110_lc2_borderX, T110_lc2_borderY;

	int T110_lc3_horizontal, T110_lc3_vertical, T110_lc3_leftOrAbove, T110_lc3_cached;
	double T110_lc3_m, T110_lc3_C, T110_lc3_borderX, T110_lc3_borderY;

	int T110_lc1_lastY = Integer.MIN_VALUE, T110_lc2_lastY = Integer.MIN_VALUE, T110_lc3_lastY = Integer.MIN_VALUE;
	int T110_r, T110_g, T110_b;

	int T111_initializedWithValidData = false, T111_okay = false;
	double T111_sx, T111_sy, T111_minx, T111_miny, T111_maxx, T111_maxy;

	int T111_lc1_horizontal, T111_lc1_vertical, T111_lc1_leftOrAbove, T111_lc1_cached;
	double T111_lc1_m, T111_lc1_C, T111_lc1_borderX, T111_lc1_borderY;

	int T111_lc2_horizontal, T111_lc2_vertical, T111_lc2_leftOrAbove, T111_lc2_cached;
	double T111_lc2_m, T111_lc2_C, T111_lc2_borderX, T111_lc2_borderY;

	int T111_lc3_horizontal, T111_lc3_vertical, T111_lc3_leftOrAbove, T111_lc3_cached;
	double T111_lc3_m, T111_lc3_C, T111_lc3_borderX, T111_lc3_borderY;

	int T111_lc1_lastY = Integer.MIN_VALUE, T111_lc2_lastY = Integer.MIN_VALUE, T111_lc3_lastY = Integer.MIN_VALUE;
	int T111_r, T111_g, T111_b;

	int T112_initializedWithValidData = false, T112_okay = false;
	double T112_sx, T112_sy, T112_minx, T112_miny, T112_maxx, T112_maxy;

	int T112_lc1_horizontal, T112_lc1_vertical, T112_lc1_leftOrAbove, T112_lc1_cached;
	double T112_lc1_m, T112_lc1_C, T112_lc1_borderX, T112_lc1_borderY;

	int T112_lc2_horizontal, T112_lc2_vertical, T112_lc2_leftOrAbove, T112_lc2_cached;
	double T112_lc2_m, T112_lc2_C, T112_lc2_borderX, T112_lc2_borderY;

	int T112_lc3_horizontal, T112_lc3_vertical, T112_lc3_leftOrAbove, T112_lc3_cached;
	double T112_lc3_m, T112_lc3_C, T112_lc3_borderX, T112_lc3_borderY;

	int T112_lc1_lastY = Integer.MIN_VALUE, T112_lc2_lastY = Integer.MIN_VALUE, T112_lc3_lastY = Integer.MIN_VALUE;
	int T112_r, T112_g, T112_b;

	int T113_initializedWithValidData = false, T113_okay = false;
	double T113_sx, T113_sy, T113_minx, T113_miny, T113_maxx, T113_maxy;

	int T113_lc1_horizontal, T113_lc1_vertical, T113_lc1_leftOrAbove, T113_lc1_cached;
	double T113_lc1_m, T113_lc1_C, T113_lc1_borderX, T113_lc1_borderY;

	int T113_lc2_horizontal, T113_lc2_vertical, T113_lc2_leftOrAbove, T113_lc2_cached;
	double T113_lc2_m, T113_lc2_C, T113_lc2_borderX, T113_lc2_borderY;

	int T113_lc3_horizontal, T113_lc3_vertical, T113_lc3_leftOrAbove, T113_lc3_cached;
	double T113_lc3_m, T113_lc3_C, T113_lc3_borderX, T113_lc3_borderY;

	int T113_lc1_lastY = Integer.MIN_VALUE, T113_lc2_lastY = Integer.MIN_VALUE, T113_lc3_lastY = Integer.MIN_VALUE;
	int T113_r, T113_g, T113_b;

	int T114_initializedWithValidData = false, T114_okay = false;
	double T114_sx, T114_sy, T114_minx, T114_miny, T114_maxx, T114_maxy;

	int T114_lc1_horizontal, T114_lc1_vertical, T114_lc1_leftOrAbove, T114_lc1_cached;
	double T114_lc1_m, T114_lc1_C, T114_lc1_borderX, T114_lc1_borderY;

	int T114_lc2_horizontal, T114_lc2_vertical, T114_lc2_leftOrAbove, T114_lc2_cached;
	double T114_lc2_m, T114_lc2_C, T114_lc2_borderX, T114_lc2_borderY;

	int T114_lc3_horizontal, T114_lc3_vertical, T114_lc3_leftOrAbove, T114_lc3_cached;
	double T114_lc3_m, T114_lc3_C, T114_lc3_borderX, T114_lc3_borderY;

	int T114_lc1_lastY = Integer.MIN_VALUE, T114_lc2_lastY = Integer.MIN_VALUE, T114_lc3_lastY = Integer.MIN_VALUE;
	int T114_r, T114_g, T114_b;

	int T115_initializedWithValidData = false, T115_okay = false;
	double T115_sx, T115_sy, T115_minx, T115_miny, T115_maxx, T115_maxy;

	int T115_lc1_horizontal, T115_lc1_vertical, T115_lc1_leftOrAbove, T115_lc1_cached;
	double T115_lc1_m, T115_lc1_C, T115_lc1_borderX, T115_lc1_borderY;

	int T115_lc2_horizontal, T115_lc2_vertical, T115_lc2_leftOrAbove, T115_lc2_cached;
	double T115_lc2_m, T115_lc2_C, T115_lc2_borderX, T115_lc2_borderY;

	int T115_lc3_horizontal, T115_lc3_vertical, T115_lc3_leftOrAbove, T115_lc3_cached;
	double T115_lc3_m, T115_lc3_C, T115_lc3_borderX, T115_lc3_borderY;

	int T115_lc1_lastY = Integer.MIN_VALUE, T115_lc2_lastY = Integer.MIN_VALUE, T115_lc3_lastY = Integer.MIN_VALUE;
	int T115_r, T115_g, T115_b;

	int T116_initializedWithValidData = false, T116_okay = false;
	double T116_sx, T116_sy, T116_minx, T116_miny, T116_maxx, T116_maxy;

	int T116_lc1_horizontal, T116_lc1_vertical, T116_lc1_leftOrAbove, T116_lc1_cached;
	double T116_lc1_m, T116_lc1_C, T116_lc1_borderX, T116_lc1_borderY;

	int T116_lc2_horizontal, T116_lc2_vertical, T116_lc2_leftOrAbove, T116_lc2_cached;
	double T116_lc2_m, T116_lc2_C, T116_lc2_borderX, T116_lc2_borderY;

	int T116_lc3_horizontal, T116_lc3_vertical, T116_lc3_leftOrAbove, T116_lc3_cached;
	double T116_lc3_m, T116_lc3_C, T116_lc3_borderX, T116_lc3_borderY;

	int T116_lc1_lastY = Integer.MIN_VALUE, T116_lc2_lastY = Integer.MIN_VALUE, T116_lc3_lastY = Integer.MIN_VALUE;
	int T116_r, T116_g, T116_b;

	int T117_initializedWithValidData = false, T117_okay = false;
	double T117_sx, T117_sy, T117_minx, T117_miny, T117_maxx, T117_maxy;

	int T117_lc1_horizontal, T117_lc1_vertical, T117_lc1_leftOrAbove, T117_lc1_cached;
	double T117_lc1_m, T117_lc1_C, T117_lc1_borderX, T117_lc1_borderY;

	int T117_lc2_horizontal, T117_lc2_vertical, T117_lc2_leftOrAbove, T117_lc2_cached;
	double T117_lc2_m, T117_lc2_C, T117_lc2_borderX, T117_lc2_borderY;

	int T117_lc3_horizontal, T117_lc3_vertical, T117_lc3_leftOrAbove, T117_lc3_cached;
	double T117_lc3_m, T117_lc3_C, T117_lc3_borderX, T117_lc3_borderY;

	int T117_lc1_lastY = Integer.MIN_VALUE, T117_lc2_lastY = Integer.MIN_VALUE, T117_lc3_lastY = Integer.MIN_VALUE;
	int T117_r, T117_g, T117_b;

	int T118_initializedWithValidData = false, T118_okay = false;
	double T118_sx, T118_sy, T118_minx, T118_miny, T118_maxx, T118_maxy;

	int T118_lc1_horizontal, T118_lc1_vertical, T118_lc1_leftOrAbove, T118_lc1_cached;
	double T118_lc1_m, T118_lc1_C, T118_lc1_borderX, T118_lc1_borderY;

	int T118_lc2_horizontal, T118_lc2_vertical, T118_lc2_leftOrAbove, T118_lc2_cached;
	double T118_lc2_m, T118_lc2_C, T118_lc2_borderX, T118_lc2_borderY;

	int T118_lc3_horizontal, T118_lc3_vertical, T118_lc3_leftOrAbove, T118_lc3_cached;
	double T118_lc3_m, T118_lc3_C, T118_lc3_borderX, T118_lc3_borderY;

	int T118_lc1_lastY = Integer.MIN_VALUE, T118_lc2_lastY = Integer.MIN_VALUE, T118_lc3_lastY = Integer.MIN_VALUE;
	int T118_r, T118_g, T118_b;

	int T119_initializedWithValidData = false, T119_okay = false;
	double T119_sx, T119_sy, T119_minx, T119_miny, T119_maxx, T119_maxy;

	int T119_lc1_horizontal, T119_lc1_vertical, T119_lc1_leftOrAbove, T119_lc1_cached;
	double T119_lc1_m, T119_lc1_C, T119_lc1_borderX, T119_lc1_borderY;

	int T119_lc2_horizontal, T119_lc2_vertical, T119_lc2_leftOrAbove, T119_lc2_cached;
	double T119_lc2_m, T119_lc2_C, T119_lc2_borderX, T119_lc2_borderY;

	int T119_lc3_horizontal, T119_lc3_vertical, T119_lc3_leftOrAbove, T119_lc3_cached;
	double T119_lc3_m, T119_lc3_C, T119_lc3_borderX, T119_lc3_borderY;

	int T119_lc1_lastY = Integer.MIN_VALUE, T119_lc2_lastY = Integer.MIN_VALUE, T119_lc3_lastY = Integer.MIN_VALUE;
	int T119_r, T119_g, T119_b;

	int T120_initializedWithValidData = false, T120_okay = false;
	double T120_sx, T120_sy, T120_minx, T120_miny, T120_maxx, T120_maxy;

	int T120_lc1_horizontal, T120_lc1_vertical, T120_lc1_leftOrAbove, T120_lc1_cached;
	double T120_lc1_m, T120_lc1_C, T120_lc1_borderX, T120_lc1_borderY;

	int T120_lc2_horizontal, T120_lc2_vertical, T120_lc2_leftOrAbove, T120_lc2_cached;
	double T120_lc2_m, T120_lc2_C, T120_lc2_borderX, T120_lc2_borderY;

	int T120_lc3_horizontal, T120_lc3_vertical, T120_lc3_leftOrAbove, T120_lc3_cached;
	double T120_lc3_m, T120_lc3_C, T120_lc3_borderX, T120_lc3_borderY;

	int T120_lc1_lastY = Integer.MIN_VALUE, T120_lc2_lastY = Integer.MIN_VALUE, T120_lc3_lastY = Integer.MIN_VALUE;
	int T120_r, T120_g, T120_b;

	int T121_initializedWithValidData = false, T121_okay = false;
	double T121_sx, T121_sy, T121_minx, T121_miny, T121_maxx, T121_maxy;

	int T121_lc1_horizontal, T121_lc1_vertical, T121_lc1_leftOrAbove, T121_lc1_cached;
	double T121_lc1_m, T121_lc1_C, T121_lc1_borderX, T121_lc1_borderY;

	int T121_lc2_horizontal, T121_lc2_vertical, T121_lc2_leftOrAbove, T121_lc2_cached;
	double T121_lc2_m, T121_lc2_C, T121_lc2_borderX, T121_lc2_borderY;

	int T121_lc3_horizontal, T121_lc3_vertical, T121_lc3_leftOrAbove, T121_lc3_cached;
	double T121_lc3_m, T121_lc3_C, T121_lc3_borderX, T121_lc3_borderY;

	int T121_lc1_lastY = Integer.MIN_VALUE, T121_lc2_lastY = Integer.MIN_VALUE, T121_lc3_lastY = Integer.MIN_VALUE;
	int T121_r, T121_g, T121_b;

	int T122_initializedWithValidData = false, T122_okay = false;
	double T122_sx, T122_sy, T122_minx, T122_miny, T122_maxx, T122_maxy;

	int T122_lc1_horizontal, T122_lc1_vertical, T122_lc1_leftOrAbove, T122_lc1_cached;
	double T122_lc1_m, T122_lc1_C, T122_lc1_borderX, T122_lc1_borderY;

	int T122_lc2_horizontal, T122_lc2_vertical, T122_lc2_leftOrAbove, T122_lc2_cached;
	double T122_lc2_m, T122_lc2_C, T122_lc2_borderX, T122_lc2_borderY;

	int T122_lc3_horizontal, T122_lc3_vertical, T122_lc3_leftOrAbove, T122_lc3_cached;
	double T122_lc3_m, T122_lc3_C, T122_lc3_borderX, T122_lc3_borderY;

	int T122_lc1_lastY = Integer.MIN_VALUE, T122_lc2_lastY = Integer.MIN_VALUE, T122_lc3_lastY = Integer.MIN_VALUE;
	int T122_r, T122_g, T122_b;

	int T123_initializedWithValidData = false, T123_okay = false;
	double T123_sx, T123_sy, T123_minx, T123_miny, T123_maxx, T123_maxy;

	int T123_lc1_horizontal, T123_lc1_vertical, T123_lc1_leftOrAbove, T123_lc1_cached;
	double T123_lc1_m, T123_lc1_C, T123_lc1_borderX, T123_lc1_borderY;

	int T123_lc2_horizontal, T123_lc2_vertical, T123_lc2_leftOrAbove, T123_lc2_cached;
	double T123_lc2_m, T123_lc2_C, T123_lc2_borderX, T123_lc2_borderY;

	int T123_lc3_horizontal, T123_lc3_vertical, T123_lc3_leftOrAbove, T123_lc3_cached;
	double T123_lc3_m, T123_lc3_C, T123_lc3_borderX, T123_lc3_borderY;

	int T123_lc1_lastY = Integer.MIN_VALUE, T123_lc2_lastY = Integer.MIN_VALUE, T123_lc3_lastY = Integer.MIN_VALUE;
	int T123_r, T123_g, T123_b;

	int T124_initializedWithValidData = false, T124_okay = false;
	double T124_sx, T124_sy, T124_minx, T124_miny, T124_maxx, T124_maxy;

	int T124_lc1_horizontal, T124_lc1_vertical, T124_lc1_leftOrAbove, T124_lc1_cached;
	double T124_lc1_m, T124_lc1_C, T124_lc1_borderX, T124_lc1_borderY;

	int T124_lc2_horizontal, T124_lc2_vertical, T124_lc2_leftOrAbove, T124_lc2_cached;
	double T124_lc2_m, T124_lc2_C, T124_lc2_borderX, T124_lc2_borderY;

	int T124_lc3_horizontal, T124_lc3_vertical, T124_lc3_leftOrAbove, T124_lc3_cached;
	double T124_lc3_m, T124_lc3_C, T124_lc3_borderX, T124_lc3_borderY;

	int T124_lc1_lastY = Integer.MIN_VALUE, T124_lc2_lastY = Integer.MIN_VALUE, T124_lc3_lastY = Integer.MIN_VALUE;
	int T124_r, T124_g, T124_b;

	int T125_initializedWithValidData = false, T125_okay = false;
	double T125_sx, T125_sy, T125_minx, T125_miny, T125_maxx, T125_maxy;

	int T125_lc1_horizontal, T125_lc1_vertical, T125_lc1_leftOrAbove, T125_lc1_cached;
	double T125_lc1_m, T125_lc1_C, T125_lc1_borderX, T125_lc1_borderY;

	int T125_lc2_horizontal, T125_lc2_vertical, T125_lc2_leftOrAbove, T125_lc2_cached;
	double T125_lc2_m, T125_lc2_C, T125_lc2_borderX, T125_lc2_borderY;

	int T125_lc3_horizontal, T125_lc3_vertical, T125_lc3_leftOrAbove, T125_lc3_cached;
	double T125_lc3_m, T125_lc3_C, T125_lc3_borderX, T125_lc3_borderY;

	int T125_lc1_lastY = Integer.MIN_VALUE, T125_lc2_lastY = Integer.MIN_VALUE, T125_lc3_lastY = Integer.MIN_VALUE;
	int T125_r, T125_g, T125_b;

	int T126_initializedWithValidData = false, T126_okay = false;
	double T126_sx, T126_sy, T126_minx, T126_miny, T126_maxx, T126_maxy;

	int T126_lc1_horizontal, T126_lc1_vertical, T126_lc1_leftOrAbove, T126_lc1_cached;
	double T126_lc1_m, T126_lc1_C, T126_lc1_borderX, T126_lc1_borderY;

	int T126_lc2_horizontal, T126_lc2_vertical, T126_lc2_leftOrAbove, T126_lc2_cached;
	double T126_lc2_m, T126_lc2_C, T126_lc2_borderX, T126_lc2_borderY;

	int T126_lc3_horizontal, T126_lc3_vertical, T126_lc3_leftOrAbove, T126_lc3_cached;
	double T126_lc3_m, T126_lc3_C, T126_lc3_borderX, T126_lc3_borderY;

	int T126_lc1_lastY = Integer.MIN_VALUE, T126_lc2_lastY = Integer.MIN_VALUE, T126_lc3_lastY = Integer.MIN_VALUE;
	int T126_r, T126_g, T126_b;

	int T127_initializedWithValidData = false, T127_okay = false;
	double T127_sx, T127_sy, T127_minx, T127_miny, T127_maxx, T127_maxy;

	int T127_lc1_horizontal, T127_lc1_vertical, T127_lc1_leftOrAbove, T127_lc1_cached;
	double T127_lc1_m, T127_lc1_C, T127_lc1_borderX, T127_lc1_borderY;

	int T127_lc2_horizontal, T127_lc2_vertical, T127_lc2_leftOrAbove, T127_lc2_cached;
	double T127_lc2_m, T127_lc2_C, T127_lc2_borderX, T127_lc2_borderY;

	int T127_lc3_horizontal, T127_lc3_vertical, T127_lc3_leftOrAbove, T127_lc3_cached;
	double T127_lc3_m, T127_lc3_C, T127_lc3_borderX, T127_lc3_borderY;

	int T127_lc1_lastY = Integer.MIN_VALUE, T127_lc2_lastY = Integer.MIN_VALUE, T127_lc3_lastY = Integer.MIN_VALUE;
	int T127_r, T127_g, T127_b;

	int T128_initializedWithValidData = false, T128_okay = false;
	double T128_sx, T128_sy, T128_minx, T128_miny, T128_maxx, T128_maxy;

	int T128_lc1_horizontal, T128_lc1_vertical, T128_lc1_leftOrAbove, T128_lc1_cached;
	double T128_lc1_m, T128_lc1_C, T128_lc1_borderX, T128_lc1_borderY;

	int T128_lc2_horizontal, T128_lc2_vertical, T128_lc2_leftOrAbove, T128_lc2_cached;
	double T128_lc2_m, T128_lc2_C, T128_lc2_borderX, T128_lc2_borderY;

	int T128_lc3_horizontal, T128_lc3_vertical, T128_lc3_leftOrAbove, T128_lc3_cached;
	double T128_lc3_m, T128_lc3_C, T128_lc3_borderX, T128_lc3_borderY;

	int T128_lc1_lastY = Integer.MIN_VALUE, T128_lc2_lastY = Integer.MIN_VALUE, T128_lc3_lastY = Integer.MIN_VALUE;
	int T128_r, T128_g, T128_b;

	int T129_initializedWithValidData = false, T129_okay = false;
	double T129_sx, T129_sy, T129_minx, T129_miny, T129_maxx, T129_maxy;

	int T129_lc1_horizontal, T129_lc1_vertical, T129_lc1_leftOrAbove, T129_lc1_cached;
	double T129_lc1_m, T129_lc1_C, T129_lc1_borderX, T129_lc1_borderY;

	int T129_lc2_horizontal, T129_lc2_vertical, T129_lc2_leftOrAbove, T129_lc2_cached;
	double T129_lc2_m, T129_lc2_C, T129_lc2_borderX, T129_lc2_borderY;

	int T129_lc3_horizontal, T129_lc3_vertical, T129_lc3_leftOrAbove, T129_lc3_cached;
	double T129_lc3_m, T129_lc3_C, T129_lc3_borderX, T129_lc3_borderY;

	int T129_lc1_lastY = Integer.MIN_VALUE, T129_lc2_lastY = Integer.MIN_VALUE, T129_lc3_lastY = Integer.MIN_VALUE;
	int T129_r, T129_g, T129_b;

	int T130_initializedWithValidData = false, T130_okay = false;
	double T130_sx, T130_sy, T130_minx, T130_miny, T130_maxx, T130_maxy;

	int T130_lc1_horizontal, T130_lc1_vertical, T130_lc1_leftOrAbove, T130_lc1_cached;
	double T130_lc1_m, T130_lc1_C, T130_lc1_borderX, T130_lc1_borderY;

	int T130_lc2_horizontal, T130_lc2_vertical, T130_lc2_leftOrAbove, T130_lc2_cached;
	double T130_lc2_m, T130_lc2_C, T130_lc2_borderX, T130_lc2_borderY;

	int T130_lc3_horizontal, T130_lc3_vertical, T130_lc3_leftOrAbove, T130_lc3_cached;
	double T130_lc3_m, T130_lc3_C, T130_lc3_borderX, T130_lc3_borderY;

	int T130_lc1_lastY = Integer.MIN_VALUE, T130_lc2_lastY = Integer.MIN_VALUE, T130_lc3_lastY = Integer.MIN_VALUE;
	int T130_r, T130_g, T130_b;

	int T131_initializedWithValidData = false, T131_okay = false;
	double T131_sx, T131_sy, T131_minx, T131_miny, T131_maxx, T131_maxy;

	int T131_lc1_horizontal, T131_lc1_vertical, T131_lc1_leftOrAbove, T131_lc1_cached;
	double T131_lc1_m, T131_lc1_C, T131_lc1_borderX, T131_lc1_borderY;

	int T131_lc2_horizontal, T131_lc2_vertical, T131_lc2_leftOrAbove, T131_lc2_cached;
	double T131_lc2_m, T131_lc2_C, T131_lc2_borderX, T131_lc2_borderY;

	int T131_lc3_horizontal, T131_lc3_vertical, T131_lc3_leftOrAbove, T131_lc3_cached;
	double T131_lc3_m, T131_lc3_C, T131_lc3_borderX, T131_lc3_borderY;

	int T131_lc1_lastY = Integer.MIN_VALUE, T131_lc2_lastY = Integer.MIN_VALUE, T131_lc3_lastY = Integer.MIN_VALUE;
	int T131_r, T131_g, T131_b;

	int T132_initializedWithValidData = false, T132_okay = false;
	double T132_sx, T132_sy, T132_minx, T132_miny, T132_maxx, T132_maxy;

	int T132_lc1_horizontal, T132_lc1_vertical, T132_lc1_leftOrAbove, T132_lc1_cached;
	double T132_lc1_m, T132_lc1_C, T132_lc1_borderX, T132_lc1_borderY;

	int T132_lc2_horizontal, T132_lc2_vertical, T132_lc2_leftOrAbove, T132_lc2_cached;
	double T132_lc2_m, T132_lc2_C, T132_lc2_borderX, T132_lc2_borderY;

	int T132_lc3_horizontal, T132_lc3_vertical, T132_lc3_leftOrAbove, T132_lc3_cached;
	double T132_lc3_m, T132_lc3_C, T132_lc3_borderX, T132_lc3_borderY;

	int T132_lc1_lastY = Integer.MIN_VALUE, T132_lc2_lastY = Integer.MIN_VALUE, T132_lc3_lastY = Integer.MIN_VALUE;
	int T132_r, T132_g, T132_b;

	int T133_initializedWithValidData = false, T133_okay = false;
	double T133_sx, T133_sy, T133_minx, T133_miny, T133_maxx, T133_maxy;

	int T133_lc1_horizontal, T133_lc1_vertical, T133_lc1_leftOrAbove, T133_lc1_cached;
	double T133_lc1_m, T133_lc1_C, T133_lc1_borderX, T133_lc1_borderY;

	int T133_lc2_horizontal, T133_lc2_vertical, T133_lc2_leftOrAbove, T133_lc2_cached;
	double T133_lc2_m, T133_lc2_C, T133_lc2_borderX, T133_lc2_borderY;

	int T133_lc3_horizontal, T133_lc3_vertical, T133_lc3_leftOrAbove, T133_lc3_cached;
	double T133_lc3_m, T133_lc3_C, T133_lc3_borderX, T133_lc3_borderY;

	int T133_lc1_lastY = Integer.MIN_VALUE, T133_lc2_lastY = Integer.MIN_VALUE, T133_lc3_lastY = Integer.MIN_VALUE;
	int T133_r, T133_g, T133_b;

	int T134_initializedWithValidData = false, T134_okay = false;
	double T134_sx, T134_sy, T134_minx, T134_miny, T134_maxx, T134_maxy;

	int T134_lc1_horizontal, T134_lc1_vertical, T134_lc1_leftOrAbove, T134_lc1_cached;
	double T134_lc1_m, T134_lc1_C, T134_lc1_borderX, T134_lc1_borderY;

	int T134_lc2_horizontal, T134_lc2_vertical, T134_lc2_leftOrAbove, T134_lc2_cached;
	double T134_lc2_m, T134_lc2_C, T134_lc2_borderX, T134_lc2_borderY;

	int T134_lc3_horizontal, T134_lc3_vertical, T134_lc3_leftOrAbove, T134_lc3_cached;
	double T134_lc3_m, T134_lc3_C, T134_lc3_borderX, T134_lc3_borderY;

	int T134_lc1_lastY = Integer.MIN_VALUE, T134_lc2_lastY = Integer.MIN_VALUE, T134_lc3_lastY = Integer.MIN_VALUE;
	int T134_r, T134_g, T134_b;

	int T135_initializedWithValidData = false, T135_okay = false;
	double T135_sx, T135_sy, T135_minx, T135_miny, T135_maxx, T135_maxy;

	int T135_lc1_horizontal, T135_lc1_vertical, T135_lc1_leftOrAbove, T135_lc1_cached;
	double T135_lc1_m, T135_lc1_C, T135_lc1_borderX, T135_lc1_borderY;

	int T135_lc2_horizontal, T135_lc2_vertical, T135_lc2_leftOrAbove, T135_lc2_cached;
	double T135_lc2_m, T135_lc2_C, T135_lc2_borderX, T135_lc2_borderY;

	int T135_lc3_horizontal, T135_lc3_vertical, T135_lc3_leftOrAbove, T135_lc3_cached;
	double T135_lc3_m, T135_lc3_C, T135_lc3_borderX, T135_lc3_borderY;

	int T135_lc1_lastY = Integer.MIN_VALUE, T135_lc2_lastY = Integer.MIN_VALUE, T135_lc3_lastY = Integer.MIN_VALUE;
	int T135_r, T135_g, T135_b;

	int T136_initializedWithValidData = false, T136_okay = false;
	double T136_sx, T136_sy, T136_minx, T136_miny, T136_maxx, T136_maxy;

	int T136_lc1_horizontal, T136_lc1_vertical, T136_lc1_leftOrAbove, T136_lc1_cached;
	double T136_lc1_m, T136_lc1_C, T136_lc1_borderX, T136_lc1_borderY;

	int T136_lc2_horizontal, T136_lc2_vertical, T136_lc2_leftOrAbove, T136_lc2_cached;
	double T136_lc2_m, T136_lc2_C, T136_lc2_borderX, T136_lc2_borderY;

	int T136_lc3_horizontal, T136_lc3_vertical, T136_lc3_leftOrAbove, T136_lc3_cached;
	double T136_lc3_m, T136_lc3_C, T136_lc3_borderX, T136_lc3_borderY;

	int T136_lc1_lastY = Integer.MIN_VALUE, T136_lc2_lastY = Integer.MIN_VALUE, T136_lc3_lastY = Integer.MIN_VALUE;
	int T136_r, T136_g, T136_b;

	int T137_initializedWithValidData = false, T137_okay = false;
	double T137_sx, T137_sy, T137_minx, T137_miny, T137_maxx, T137_maxy;

	int T137_lc1_horizontal, T137_lc1_vertical, T137_lc1_leftOrAbove, T137_lc1_cached;
	double T137_lc1_m, T137_lc1_C, T137_lc1_borderX, T137_lc1_borderY;

	int T137_lc2_horizontal, T137_lc2_vertical, T137_lc2_leftOrAbove, T137_lc2_cached;
	double T137_lc2_m, T137_lc2_C, T137_lc2_borderX, T137_lc2_borderY;

	int T137_lc3_horizontal, T137_lc3_vertical, T137_lc3_leftOrAbove, T137_lc3_cached;
	double T137_lc3_m, T137_lc3_C, T137_lc3_borderX, T137_lc3_borderY;

	int T137_lc1_lastY = Integer.MIN_VALUE, T137_lc2_lastY = Integer.MIN_VALUE, T137_lc3_lastY = Integer.MIN_VALUE;
	int T137_r, T137_g, T137_b;

	int T138_initializedWithValidData = false, T138_okay = false;
	double T138_sx, T138_sy, T138_minx, T138_miny, T138_maxx, T138_maxy;

	int T138_lc1_horizontal, T138_lc1_vertical, T138_lc1_leftOrAbove, T138_lc1_cached;
	double T138_lc1_m, T138_lc1_C, T138_lc1_borderX, T138_lc1_borderY;

	int T138_lc2_horizontal, T138_lc2_vertical, T138_lc2_leftOrAbove, T138_lc2_cached;
	double T138_lc2_m, T138_lc2_C, T138_lc2_borderX, T138_lc2_borderY;

	int T138_lc3_horizontal, T138_lc3_vertical, T138_lc3_leftOrAbove, T138_lc3_cached;
	double T138_lc3_m, T138_lc3_C, T138_lc3_borderX, T138_lc3_borderY;

	int T138_lc1_lastY = Integer.MIN_VALUE, T138_lc2_lastY = Integer.MIN_VALUE, T138_lc3_lastY = Integer.MIN_VALUE;
	int T138_r, T138_g, T138_b;

	int T139_initializedWithValidData = false, T139_okay = false;
	double T139_sx, T139_sy, T139_minx, T139_miny, T139_maxx, T139_maxy;

	int T139_lc1_horizontal, T139_lc1_vertical, T139_lc1_leftOrAbove, T139_lc1_cached;
	double T139_lc1_m, T139_lc1_C, T139_lc1_borderX, T139_lc1_borderY;

	int T139_lc2_horizontal, T139_lc2_vertical, T139_lc2_leftOrAbove, T139_lc2_cached;
	double T139_lc2_m, T139_lc2_C, T139_lc2_borderX, T139_lc2_borderY;

	int T139_lc3_horizontal, T139_lc3_vertical, T139_lc3_leftOrAbove, T139_lc3_cached;
	double T139_lc3_m, T139_lc3_C, T139_lc3_borderX, T139_lc3_borderY;

	int T139_lc1_lastY = Integer.MIN_VALUE, T139_lc2_lastY = Integer.MIN_VALUE, T139_lc3_lastY = Integer.MIN_VALUE;
	int T139_r, T139_g, T139_b;

	int T140_initializedWithValidData = false, T140_okay = false;
	double T140_sx, T140_sy, T140_minx, T140_miny, T140_maxx, T140_maxy;

	int T140_lc1_horizontal, T140_lc1_vertical, T140_lc1_leftOrAbove, T140_lc1_cached;
	double T140_lc1_m, T140_lc1_C, T140_lc1_borderX, T140_lc1_borderY;

	int T140_lc2_horizontal, T140_lc2_vertical, T140_lc2_leftOrAbove, T140_lc2_cached;
	double T140_lc2_m, T140_lc2_C, T140_lc2_borderX, T140_lc2_borderY;

	int T140_lc3_horizontal, T140_lc3_vertical, T140_lc3_leftOrAbove, T140_lc3_cached;
	double T140_lc3_m, T140_lc3_C, T140_lc3_borderX, T140_lc3_borderY;

	int T140_lc1_lastY = Integer.MIN_VALUE, T140_lc2_lastY = Integer.MIN_VALUE, T140_lc3_lastY = Integer.MIN_VALUE;
	int T140_r, T140_g, T140_b;

	int T141_initializedWithValidData = false, T141_okay = false;
	double T141_sx, T141_sy, T141_minx, T141_miny, T141_maxx, T141_maxy;

	int T141_lc1_horizontal, T141_lc1_vertical, T141_lc1_leftOrAbove, T141_lc1_cached;
	double T141_lc1_m, T141_lc1_C, T141_lc1_borderX, T141_lc1_borderY;

	int T141_lc2_horizontal, T141_lc2_vertical, T141_lc2_leftOrAbove, T141_lc2_cached;
	double T141_lc2_m, T141_lc2_C, T141_lc2_borderX, T141_lc2_borderY;

	int T141_lc3_horizontal, T141_lc3_vertical, T141_lc3_leftOrAbove, T141_lc3_cached;
	double T141_lc3_m, T141_lc3_C, T141_lc3_borderX, T141_lc3_borderY;

	int T141_lc1_lastY = Integer.MIN_VALUE, T141_lc2_lastY = Integer.MIN_VALUE, T141_lc3_lastY = Integer.MIN_VALUE;
	int T141_r, T141_g, T141_b;

	int T142_initializedWithValidData = false, T142_okay = false;
	double T142_sx, T142_sy, T142_minx, T142_miny, T142_maxx, T142_maxy;

	int T142_lc1_horizontal, T142_lc1_vertical, T142_lc1_leftOrAbove, T142_lc1_cached;
	double T142_lc1_m, T142_lc1_C, T142_lc1_borderX, T142_lc1_borderY;

	int T142_lc2_horizontal, T142_lc2_vertical, T142_lc2_leftOrAbove, T142_lc2_cached;
	double T142_lc2_m, T142_lc2_C, T142_lc2_borderX, T142_lc2_borderY;

	int T142_lc3_horizontal, T142_lc3_vertical, T142_lc3_leftOrAbove, T142_lc3_cached;
	double T142_lc3_m, T142_lc3_C, T142_lc3_borderX, T142_lc3_borderY;

	int T142_lc1_lastY = Integer.MIN_VALUE, T142_lc2_lastY = Integer.MIN_VALUE, T142_lc3_lastY = Integer.MIN_VALUE;
	int T142_r, T142_g, T142_b;

	int T143_initializedWithValidData = false, T143_okay = false;
	double T143_sx, T143_sy, T143_minx, T143_miny, T143_maxx, T143_maxy;

	int T143_lc1_horizontal, T143_lc1_vertical, T143_lc1_leftOrAbove, T143_lc1_cached;
	double T143_lc1_m, T143_lc1_C, T143_lc1_borderX, T143_lc1_borderY;

	int T143_lc2_horizontal, T143_lc2_vertical, T143_lc2_leftOrAbove, T143_lc2_cached;
	double T143_lc2_m, T143_lc2_C, T143_lc2_borderX, T143_lc2_borderY;

	int T143_lc3_horizontal, T143_lc3_vertical, T143_lc3_leftOrAbove, T143_lc3_cached;
	double T143_lc3_m, T143_lc3_C, T143_lc3_borderX, T143_lc3_borderY;

	int T143_lc1_lastY = Integer.MIN_VALUE, T143_lc2_lastY = Integer.MIN_VALUE, T143_lc3_lastY = Integer.MIN_VALUE;
	int T143_r, T143_g, T143_b;

	int T144_initializedWithValidData = false, T144_okay = false;
	double T144_sx, T144_sy, T144_minx, T144_miny, T144_maxx, T144_maxy;

	int T144_lc1_horizontal, T144_lc1_vertical, T144_lc1_leftOrAbove, T144_lc1_cached;
	double T144_lc1_m, T144_lc1_C, T144_lc1_borderX, T144_lc1_borderY;

	int T144_lc2_horizontal, T144_lc2_vertical, T144_lc2_leftOrAbove, T144_lc2_cached;
	double T144_lc2_m, T144_lc2_C, T144_lc2_borderX, T144_lc2_borderY;

	int T144_lc3_horizontal, T144_lc3_vertical, T144_lc3_leftOrAbove, T144_lc3_cached;
	double T144_lc3_m, T144_lc3_C, T144_lc3_borderX, T144_lc3_borderY;

	int T144_lc1_lastY = Integer.MIN_VALUE, T144_lc2_lastY = Integer.MIN_VALUE, T144_lc3_lastY = Integer.MIN_VALUE;
	int T144_r, T144_g, T144_b;

	int T145_initializedWithValidData = false, T145_okay = false;
	double T145_sx, T145_sy, T145_minx, T145_miny, T145_maxx, T145_maxy;

	int T145_lc1_horizontal, T145_lc1_vertical, T145_lc1_leftOrAbove, T145_lc1_cached;
	double T145_lc1_m, T145_lc1_C, T145_lc1_borderX, T145_lc1_borderY;

	int T145_lc2_horizontal, T145_lc2_vertical, T145_lc2_leftOrAbove, T145_lc2_cached;
	double T145_lc2_m, T145_lc2_C, T145_lc2_borderX, T145_lc2_borderY;

	int T145_lc3_horizontal, T145_lc3_vertical, T145_lc3_leftOrAbove, T145_lc3_cached;
	double T145_lc3_m, T145_lc3_C, T145_lc3_borderX, T145_lc3_borderY;

	int T145_lc1_lastY = Integer.MIN_VALUE, T145_lc2_lastY = Integer.MIN_VALUE, T145_lc3_lastY = Integer.MIN_VALUE;
	int T145_r, T145_g, T145_b;

	int T146_initializedWithValidData = false, T146_okay = false;
	double T146_sx, T146_sy, T146_minx, T146_miny, T146_maxx, T146_maxy;

	int T146_lc1_horizontal, T146_lc1_vertical, T146_lc1_leftOrAbove, T146_lc1_cached;
	double T146_lc1_m, T146_lc1_C, T146_lc1_borderX, T146_lc1_borderY;

	int T146_lc2_horizontal, T146_lc2_vertical, T146_lc2_leftOrAbove, T146_lc2_cached;
	double T146_lc2_m, T146_lc2_C, T146_lc2_borderX, T146_lc2_borderY;

	int T146_lc3_horizontal, T146_lc3_vertical, T146_lc3_leftOrAbove, T146_lc3_cached;
	double T146_lc3_m, T146_lc3_C, T146_lc3_borderX, T146_lc3_borderY;

	int T146_lc1_lastY = Integer.MIN_VALUE, T146_lc2_lastY = Integer.MIN_VALUE, T146_lc3_lastY = Integer.MIN_VALUE;
	int T146_r, T146_g, T146_b;

	int T147_initializedWithValidData = false, T147_okay = false;
	double T147_sx, T147_sy, T147_minx, T147_miny, T147_maxx, T147_maxy;

	int T147_lc1_horizontal, T147_lc1_vertical, T147_lc1_leftOrAbove, T147_lc1_cached;
	double T147_lc1_m, T147_lc1_C, T147_lc1_borderX, T147_lc1_borderY;

	int T147_lc2_horizontal, T147_lc2_vertical, T147_lc2_leftOrAbove, T147_lc2_cached;
	double T147_lc2_m, T147_lc2_C, T147_lc2_borderX, T147_lc2_borderY;

	int T147_lc3_horizontal, T147_lc3_vertical, T147_lc3_leftOrAbove, T147_lc3_cached;
	double T147_lc3_m, T147_lc3_C, T147_lc3_borderX, T147_lc3_borderY;

	int T147_lc1_lastY = Integer.MIN_VALUE, T147_lc2_lastY = Integer.MIN_VALUE, T147_lc3_lastY = Integer.MIN_VALUE;
	int T147_r, T147_g, T147_b;

	int T148_initializedWithValidData = false, T148_okay = false;
	double T148_sx, T148_sy, T148_minx, T148_miny, T148_maxx, T148_maxy;

	int T148_lc1_horizontal, T148_lc1_vertical, T148_lc1_leftOrAbove, T148_lc1_cached;
	double T148_lc1_m, T148_lc1_C, T148_lc1_borderX, T148_lc1_borderY;

	int T148_lc2_horizontal, T148_lc2_vertical, T148_lc2_leftOrAbove, T148_lc2_cached;
	double T148_lc2_m, T148_lc2_C, T148_lc2_borderX, T148_lc2_borderY;

	int T148_lc3_horizontal, T148_lc3_vertical, T148_lc3_leftOrAbove, T148_lc3_cached;
	double T148_lc3_m, T148_lc3_C, T148_lc3_borderX, T148_lc3_borderY;

	int T148_lc1_lastY = Integer.MIN_VALUE, T148_lc2_lastY = Integer.MIN_VALUE, T148_lc3_lastY = Integer.MIN_VALUE;
	int T148_r, T148_g, T148_b;

	int T149_initializedWithValidData = false, T149_okay = false;
	double T149_sx, T149_sy, T149_minx, T149_miny, T149_maxx, T149_maxy;

	int T149_lc1_horizontal, T149_lc1_vertical, T149_lc1_leftOrAbove, T149_lc1_cached;
	double T149_lc1_m, T149_lc1_C, T149_lc1_borderX, T149_lc1_borderY;

	int T149_lc2_horizontal, T149_lc2_vertical, T149_lc2_leftOrAbove, T149_lc2_cached;
	double T149_lc2_m, T149_lc2_C, T149_lc2_borderX, T149_lc2_borderY;

	int T149_lc3_horizontal, T149_lc3_vertical, T149_lc3_leftOrAbove, T149_lc3_cached;
	double T149_lc3_m, T149_lc3_C, T149_lc3_borderX, T149_lc3_borderY;

	int T149_lc1_lastY = Integer.MIN_VALUE, T149_lc2_lastY = Integer.MIN_VALUE, T149_lc3_lastY = Integer.MIN_VALUE;
	int T149_r, T149_g, T149_b;

	int T150_initializedWithValidData = false, T150_okay = false;
	double T150_sx, T150_sy, T150_minx, T150_miny, T150_maxx, T150_maxy;

	int T150_lc1_horizontal, T150_lc1_vertical, T150_lc1_leftOrAbove, T150_lc1_cached;
	double T150_lc1_m, T150_lc1_C, T150_lc1_borderX, T150_lc1_borderY;

	int T150_lc2_horizontal, T150_lc2_vertical, T150_lc2_leftOrAbove, T150_lc2_cached;
	double T150_lc2_m, T150_lc2_C, T150_lc2_borderX, T150_lc2_borderY;

	int T150_lc3_horizontal, T150_lc3_vertical, T150_lc3_leftOrAbove, T150_lc3_cached;
	double T150_lc3_m, T150_lc3_C, T150_lc3_borderX, T150_lc3_borderY;

	int T150_lc1_lastY = Integer.MIN_VALUE, T150_lc2_lastY = Integer.MIN_VALUE, T150_lc3_lastY = Integer.MIN_VALUE;
	int T150_r, T150_g, T150_b;

	int T151_initializedWithValidData = false, T151_okay = false;
	double T151_sx, T151_sy, T151_minx, T151_miny, T151_maxx, T151_maxy;

	int T151_lc1_horizontal, T151_lc1_vertical, T151_lc1_leftOrAbove, T151_lc1_cached;
	double T151_lc1_m, T151_lc1_C, T151_lc1_borderX, T151_lc1_borderY;

	int T151_lc2_horizontal, T151_lc2_vertical, T151_lc2_leftOrAbove, T151_lc2_cached;
	double T151_lc2_m, T151_lc2_C, T151_lc2_borderX, T151_lc2_borderY;

	int T151_lc3_horizontal, T151_lc3_vertical, T151_lc3_leftOrAbove, T151_lc3_cached;
	double T151_lc3_m, T151_lc3_C, T151_lc3_borderX, T151_lc3_borderY;

	int T151_lc1_lastY = Integer.MIN_VALUE, T151_lc2_lastY = Integer.MIN_VALUE, T151_lc3_lastY = Integer.MIN_VALUE;
	int T151_r, T151_g, T151_b;

	int T152_initializedWithValidData = false, T152_okay = false;
	double T152_sx, T152_sy, T152_minx, T152_miny, T152_maxx, T152_maxy;

	int T152_lc1_horizontal, T152_lc1_vertical, T152_lc1_leftOrAbove, T152_lc1_cached;
	double T152_lc1_m, T152_lc1_C, T152_lc1_borderX, T152_lc1_borderY;

	int T152_lc2_horizontal, T152_lc2_vertical, T152_lc2_leftOrAbove, T152_lc2_cached;
	double T152_lc2_m, T152_lc2_C, T152_lc2_borderX, T152_lc2_borderY;

	int T152_lc3_horizontal, T152_lc3_vertical, T152_lc3_leftOrAbove, T152_lc3_cached;
	double T152_lc3_m, T152_lc3_C, T152_lc3_borderX, T152_lc3_borderY;

	int T152_lc1_lastY = Integer.MIN_VALUE, T152_lc2_lastY = Integer.MIN_VALUE, T152_lc3_lastY = Integer.MIN_VALUE;
	int T152_r, T152_g, T152_b;

	int T153_initializedWithValidData = false, T153_okay = false;
	double T153_sx, T153_sy, T153_minx, T153_miny, T153_maxx, T153_maxy;

	int T153_lc1_horizontal, T153_lc1_vertical, T153_lc1_leftOrAbove, T153_lc1_cached;
	double T153_lc1_m, T153_lc1_C, T153_lc1_borderX, T153_lc1_borderY;

	int T153_lc2_horizontal, T153_lc2_vertical, T153_lc2_leftOrAbove, T153_lc2_cached;
	double T153_lc2_m, T153_lc2_C, T153_lc2_borderX, T153_lc2_borderY;

	int T153_lc3_horizontal, T153_lc3_vertical, T153_lc3_leftOrAbove, T153_lc3_cached;
	double T153_lc3_m, T153_lc3_C, T153_lc3_borderX, T153_lc3_borderY;

	int T153_lc1_lastY = Integer.MIN_VALUE, T153_lc2_lastY = Integer.MIN_VALUE, T153_lc3_lastY = Integer.MIN_VALUE;
	int T153_r, T153_g, T153_b;

	int T154_initializedWithValidData = false, T154_okay = false;
	double T154_sx, T154_sy, T154_minx, T154_miny, T154_maxx, T154_maxy;

	int T154_lc1_horizontal, T154_lc1_vertical, T154_lc1_leftOrAbove, T154_lc1_cached;
	double T154_lc1_m, T154_lc1_C, T154_lc1_borderX, T154_lc1_borderY;

	int T154_lc2_horizontal, T154_lc2_vertical, T154_lc2_leftOrAbove, T154_lc2_cached;
	double T154_lc2_m, T154_lc2_C, T154_lc2_borderX, T154_lc2_borderY;

	int T154_lc3_horizontal, T154_lc3_vertical, T154_lc3_leftOrAbove, T154_lc3_cached;
	double T154_lc3_m, T154_lc3_C, T154_lc3_borderX, T154_lc3_borderY;

	int T154_lc1_lastY = Integer.MIN_VALUE, T154_lc2_lastY = Integer.MIN_VALUE, T154_lc3_lastY = Integer.MIN_VALUE;
	int T154_r, T154_g, T154_b;

	int T155_initializedWithValidData = false, T155_okay = false;
	double T155_sx, T155_sy, T155_minx, T155_miny, T155_maxx, T155_maxy;

	int T155_lc1_horizontal, T155_lc1_vertical, T155_lc1_leftOrAbove, T155_lc1_cached;
	double T155_lc1_m, T155_lc1_C, T155_lc1_borderX, T155_lc1_borderY;

	int T155_lc2_horizontal, T155_lc2_vertical, T155_lc2_leftOrAbove, T155_lc2_cached;
	double T155_lc2_m, T155_lc2_C, T155_lc2_borderX, T155_lc2_borderY;

	int T155_lc3_horizontal, T155_lc3_vertical, T155_lc3_leftOrAbove, T155_lc3_cached;
	double T155_lc3_m, T155_lc3_C, T155_lc3_borderX, T155_lc3_borderY;

	int T155_lc1_lastY = Integer.MIN_VALUE, T155_lc2_lastY = Integer.MIN_VALUE, T155_lc3_lastY = Integer.MIN_VALUE;
	int T155_r, T155_g, T155_b;

	int T156_initializedWithValidData = false, T156_okay = false;
	double T156_sx, T156_sy, T156_minx, T156_miny, T156_maxx, T156_maxy;

	int T156_lc1_horizontal, T156_lc1_vertical, T156_lc1_leftOrAbove, T156_lc1_cached;
	double T156_lc1_m, T156_lc1_C, T156_lc1_borderX, T156_lc1_borderY;

	int T156_lc2_horizontal, T156_lc2_vertical, T156_lc2_leftOrAbove, T156_lc2_cached;
	double T156_lc2_m, T156_lc2_C, T156_lc2_borderX, T156_lc2_borderY;

	int T156_lc3_horizontal, T156_lc3_vertical, T156_lc3_leftOrAbove, T156_lc3_cached;
	double T156_lc3_m, T156_lc3_C, T156_lc3_borderX, T156_lc3_borderY;

	int T156_lc1_lastY = Integer.MIN_VALUE, T156_lc2_lastY = Integer.MIN_VALUE, T156_lc3_lastY = Integer.MIN_VALUE;
	int T156_r, T156_g, T156_b;

	int T157_initializedWithValidData = false, T157_okay = false;
	double T157_sx, T157_sy, T157_minx, T157_miny, T157_maxx, T157_maxy;

	int T157_lc1_horizontal, T157_lc1_vertical, T157_lc1_leftOrAbove, T157_lc1_cached;
	double T157_lc1_m, T157_lc1_C, T157_lc1_borderX, T157_lc1_borderY;

	int T157_lc2_horizontal, T157_lc2_vertical, T157_lc2_leftOrAbove, T157_lc2_cached;
	double T157_lc2_m, T157_lc2_C, T157_lc2_borderX, T157_lc2_borderY;

	int T157_lc3_horizontal, T157_lc3_vertical, T157_lc3_leftOrAbove, T157_lc3_cached;
	double T157_lc3_m, T157_lc3_C, T157_lc3_borderX, T157_lc3_borderY;

	int T157_lc1_lastY = Integer.MIN_VALUE, T157_lc2_lastY = Integer.MIN_VALUE, T157_lc3_lastY = Integer.MIN_VALUE;
	int T157_r, T157_g, T157_b;

	int T158_initializedWithValidData = false, T158_okay = false;
	double T158_sx, T158_sy, T158_minx, T158_miny, T158_maxx, T158_maxy;

	int T158_lc1_horizontal, T158_lc1_vertical, T158_lc1_leftOrAbove, T158_lc1_cached;
	double T158_lc1_m, T158_lc1_C, T158_lc1_borderX, T158_lc1_borderY;

	int T158_lc2_horizontal, T158_lc2_vertical, T158_lc2_leftOrAbove, T158_lc2_cached;
	double T158_lc2_m, T158_lc2_C, T158_lc2_borderX, T158_lc2_borderY;

	int T158_lc3_horizontal, T158_lc3_vertical, T158_lc3_leftOrAbove, T158_lc3_cached;
	double T158_lc3_m, T158_lc3_C, T158_lc3_borderX, T158_lc3_borderY;

	int T158_lc1_lastY = Integer.MIN_VALUE, T158_lc2_lastY = Integer.MIN_VALUE, T158_lc3_lastY = Integer.MIN_VALUE;
	int T158_r, T158_g, T158_b;

	int T159_initializedWithValidData = false, T159_okay = false;
	double T159_sx, T159_sy, T159_minx, T159_miny, T159_maxx, T159_maxy;

	int T159_lc1_horizontal, T159_lc1_vertical, T159_lc1_leftOrAbove, T159_lc1_cached;
	double T159_lc1_m, T159_lc1_C, T159_lc1_borderX, T159_lc1_borderY;

	int T159_lc2_horizontal, T159_lc2_vertical, T159_lc2_leftOrAbove, T159_lc2_cached;
	double T159_lc2_m, T159_lc2_C, T159_lc2_borderX, T159_lc2_borderY;

	int T159_lc3_horizontal, T159_lc3_vertical, T159_lc3_leftOrAbove, T159_lc3_cached;
	double T159_lc3_m, T159_lc3_C, T159_lc3_borderX, T159_lc3_borderY;

	int T159_lc1_lastY = Integer.MIN_VALUE, T159_lc2_lastY = Integer.MIN_VALUE, T159_lc3_lastY = Integer.MIN_VALUE;
	int T159_r, T159_g, T159_b;

	int T160_initializedWithValidData = false, T160_okay = false;
	double T160_sx, T160_sy, T160_minx, T160_miny, T160_maxx, T160_maxy;

	int T160_lc1_horizontal, T160_lc1_vertical, T160_lc1_leftOrAbove, T160_lc1_cached;
	double T160_lc1_m, T160_lc1_C, T160_lc1_borderX, T160_lc1_borderY;

	int T160_lc2_horizontal, T160_lc2_vertical, T160_lc2_leftOrAbove, T160_lc2_cached;
	double T160_lc2_m, T160_lc2_C, T160_lc2_borderX, T160_lc2_borderY;

	int T160_lc3_horizontal, T160_lc3_vertical, T160_lc3_leftOrAbove, T160_lc3_cached;
	double T160_lc3_m, T160_lc3_C, T160_lc3_borderX, T160_lc3_borderY;

	int T160_lc1_lastY = Integer.MIN_VALUE, T160_lc2_lastY = Integer.MIN_VALUE, T160_lc3_lastY = Integer.MIN_VALUE;
	int T160_r, T160_g, T160_b;

	int T161_initializedWithValidData = false, T161_okay = false;
	double T161_sx, T161_sy, T161_minx, T161_miny, T161_maxx, T161_maxy;

	int T161_lc1_horizontal, T161_lc1_vertical, T161_lc1_leftOrAbove, T161_lc1_cached;
	double T161_lc1_m, T161_lc1_C, T161_lc1_borderX, T161_lc1_borderY;

	int T161_lc2_horizontal, T161_lc2_vertical, T161_lc2_leftOrAbove, T161_lc2_cached;
	double T161_lc2_m, T161_lc2_C, T161_lc2_borderX, T161_lc2_borderY;

	int T161_lc3_horizontal, T161_lc3_vertical, T161_lc3_leftOrAbove, T161_lc3_cached;
	double T161_lc3_m, T161_lc3_C, T161_lc3_borderX, T161_lc3_borderY;

	int T161_lc1_lastY = Integer.MIN_VALUE, T161_lc2_lastY = Integer.MIN_VALUE, T161_lc3_lastY = Integer.MIN_VALUE;
	int T161_r, T161_g, T161_b;

	int T162_initializedWithValidData = false, T162_okay = false;
	double T162_sx, T162_sy, T162_minx, T162_miny, T162_maxx, T162_maxy;

	int T162_lc1_horizontal, T162_lc1_vertical, T162_lc1_leftOrAbove, T162_lc1_cached;
	double T162_lc1_m, T162_lc1_C, T162_lc1_borderX, T162_lc1_borderY;

	int T162_lc2_horizontal, T162_lc2_vertical, T162_lc2_leftOrAbove, T162_lc2_cached;
	double T162_lc2_m, T162_lc2_C, T162_lc2_borderX, T162_lc2_borderY;

	int T162_lc3_horizontal, T162_lc3_vertical, T162_lc3_leftOrAbove, T162_lc3_cached;
	double T162_lc3_m, T162_lc3_C, T162_lc3_borderX, T162_lc3_borderY;

	int T162_lc1_lastY = Integer.MIN_VALUE, T162_lc2_lastY = Integer.MIN_VALUE, T162_lc3_lastY = Integer.MIN_VALUE;
	int T162_r, T162_g, T162_b;

	int T163_initializedWithValidData = false, T163_okay = false;
	double T163_sx, T163_sy, T163_minx, T163_miny, T163_maxx, T163_maxy;

	int T163_lc1_horizontal, T163_lc1_vertical, T163_lc1_leftOrAbove, T163_lc1_cached;
	double T163_lc1_m, T163_lc1_C, T163_lc1_borderX, T163_lc1_borderY;

	int T163_lc2_horizontal, T163_lc2_vertical, T163_lc2_leftOrAbove, T163_lc2_cached;
	double T163_lc2_m, T163_lc2_C, T163_lc2_borderX, T163_lc2_borderY;

	int T163_lc3_horizontal, T163_lc3_vertical, T163_lc3_leftOrAbove, T163_lc3_cached;
	double T163_lc3_m, T163_lc3_C, T163_lc3_borderX, T163_lc3_borderY;

	int T163_lc1_lastY = Integer.MIN_VALUE, T163_lc2_lastY = Integer.MIN_VALUE, T163_lc3_lastY = Integer.MIN_VALUE;
	int T163_r, T163_g, T163_b;

	int T164_initializedWithValidData = false, T164_okay = false;
	double T164_sx, T164_sy, T164_minx, T164_miny, T164_maxx, T164_maxy;

	int T164_lc1_horizontal, T164_lc1_vertical, T164_lc1_leftOrAbove, T164_lc1_cached;
	double T164_lc1_m, T164_lc1_C, T164_lc1_borderX, T164_lc1_borderY;

	int T164_lc2_horizontal, T164_lc2_vertical, T164_lc2_leftOrAbove, T164_lc2_cached;
	double T164_lc2_m, T164_lc2_C, T164_lc2_borderX, T164_lc2_borderY;

	int T164_lc3_horizontal, T164_lc3_vertical, T164_lc3_leftOrAbove, T164_lc3_cached;
	double T164_lc3_m, T164_lc3_C, T164_lc3_borderX, T164_lc3_borderY;

	int T164_lc1_lastY = Integer.MIN_VALUE, T164_lc2_lastY = Integer.MIN_VALUE, T164_lc3_lastY = Integer.MIN_VALUE;
	int T164_r, T164_g, T164_b;

	int T165_initializedWithValidData = false, T165_okay = false;
	double T165_sx, T165_sy, T165_minx, T165_miny, T165_maxx, T165_maxy;

	int T165_lc1_horizontal, T165_lc1_vertical, T165_lc1_leftOrAbove, T165_lc1_cached;
	double T165_lc1_m, T165_lc1_C, T165_lc1_borderX, T165_lc1_borderY;

	int T165_lc2_horizontal, T165_lc2_vertical, T165_lc2_leftOrAbove, T165_lc2_cached;
	double T165_lc2_m, T165_lc2_C, T165_lc2_borderX, T165_lc2_borderY;

	int T165_lc3_horizontal, T165_lc3_vertical, T165_lc3_leftOrAbove, T165_lc3_cached;
	double T165_lc3_m, T165_lc3_C, T165_lc3_borderX, T165_lc3_borderY;

	int T165_lc1_lastY = Integer.MIN_VALUE, T165_lc2_lastY = Integer.MIN_VALUE, T165_lc3_lastY = Integer.MIN_VALUE;
	int T165_r, T165_g, T165_b;

	int T166_initializedWithValidData = false, T166_okay = false;
	double T166_sx, T166_sy, T166_minx, T166_miny, T166_maxx, T166_maxy;

	int T166_lc1_horizontal, T166_lc1_vertical, T166_lc1_leftOrAbove, T166_lc1_cached;
	double T166_lc1_m, T166_lc1_C, T166_lc1_borderX, T166_lc1_borderY;

	int T166_lc2_horizontal, T166_lc2_vertical, T166_lc2_leftOrAbove, T166_lc2_cached;
	double T166_lc2_m, T166_lc2_C, T166_lc2_borderX, T166_lc2_borderY;

	int T166_lc3_horizontal, T166_lc3_vertical, T166_lc3_leftOrAbove, T166_lc3_cached;
	double T166_lc3_m, T166_lc3_C, T166_lc3_borderX, T166_lc3_borderY;

	int T166_lc1_lastY = Integer.MIN_VALUE, T166_lc2_lastY = Integer.MIN_VALUE, T166_lc3_lastY = Integer.MIN_VALUE;
	int T166_r, T166_g, T166_b;

	int T167_initializedWithValidData = false, T167_okay = false;
	double T167_sx, T167_sy, T167_minx, T167_miny, T167_maxx, T167_maxy;

	int T167_lc1_horizontal, T167_lc1_vertical, T167_lc1_leftOrAbove, T167_lc1_cached;
	double T167_lc1_m, T167_lc1_C, T167_lc1_borderX, T167_lc1_borderY;

	int T167_lc2_horizontal, T167_lc2_vertical, T167_lc2_leftOrAbove, T167_lc2_cached;
	double T167_lc2_m, T167_lc2_C, T167_lc2_borderX, T167_lc2_borderY;

	int T167_lc3_horizontal, T167_lc3_vertical, T167_lc3_leftOrAbove, T167_lc3_cached;
	double T167_lc3_m, T167_lc3_C, T167_lc3_borderX, T167_lc3_borderY;

	int T167_lc1_lastY = Integer.MIN_VALUE, T167_lc2_lastY = Integer.MIN_VALUE, T167_lc3_lastY = Integer.MIN_VALUE;
	int T167_r, T167_g, T167_b;

	int T168_initializedWithValidData = false, T168_okay = false;
	double T168_sx, T168_sy, T168_minx, T168_miny, T168_maxx, T168_maxy;

	int T168_lc1_horizontal, T168_lc1_vertical, T168_lc1_leftOrAbove, T168_lc1_cached;
	double T168_lc1_m, T168_lc1_C, T168_lc1_borderX, T168_lc1_borderY;

	int T168_lc2_horizontal, T168_lc2_vertical, T168_lc2_leftOrAbove, T168_lc2_cached;
	double T168_lc2_m, T168_lc2_C, T168_lc2_borderX, T168_lc2_borderY;

	int T168_lc3_horizontal, T168_lc3_vertical, T168_lc3_leftOrAbove, T168_lc3_cached;
	double T168_lc3_m, T168_lc3_C, T168_lc3_borderX, T168_lc3_borderY;

	int T168_lc1_lastY = Integer.MIN_VALUE, T168_lc2_lastY = Integer.MIN_VALUE, T168_lc3_lastY = Integer.MIN_VALUE;
	int T168_r, T168_g, T168_b;

	int T169_initializedWithValidData = false, T169_okay = false;
	double T169_sx, T169_sy, T169_minx, T169_miny, T169_maxx, T169_maxy;

	int T169_lc1_horizontal, T169_lc1_vertical, T169_lc1_leftOrAbove, T169_lc1_cached;
	double T169_lc1_m, T169_lc1_C, T169_lc1_borderX, T169_lc1_borderY;

	int T169_lc2_horizontal, T169_lc2_vertical, T169_lc2_leftOrAbove, T169_lc2_cached;
	double T169_lc2_m, T169_lc2_C, T169_lc2_borderX, T169_lc2_borderY;

	int T169_lc3_horizontal, T169_lc3_vertical, T169_lc3_leftOrAbove, T169_lc3_cached;
	double T169_lc3_m, T169_lc3_C, T169_lc3_borderX, T169_lc3_borderY;

	int T169_lc1_lastY = Integer.MIN_VALUE, T169_lc2_lastY = Integer.MIN_VALUE, T169_lc3_lastY = Integer.MIN_VALUE;
	int T169_r, T169_g, T169_b;

	int T170_initializedWithValidData = false, T170_okay = false;
	double T170_sx, T170_sy, T170_minx, T170_miny, T170_maxx, T170_maxy;

	int T170_lc1_horizontal, T170_lc1_vertical, T170_lc1_leftOrAbove, T170_lc1_cached;
	double T170_lc1_m, T170_lc1_C, T170_lc1_borderX, T170_lc1_borderY;

	int T170_lc2_horizontal, T170_lc2_vertical, T170_lc2_leftOrAbove, T170_lc2_cached;
	double T170_lc2_m, T170_lc2_C, T170_lc2_borderX, T170_lc2_borderY;

	int T170_lc3_horizontal, T170_lc3_vertical, T170_lc3_leftOrAbove, T170_lc3_cached;
	double T170_lc3_m, T170_lc3_C, T170_lc3_borderX, T170_lc3_borderY;

	int T170_lc1_lastY = Integer.MIN_VALUE, T170_lc2_lastY = Integer.MIN_VALUE, T170_lc3_lastY = Integer.MIN_VALUE;
	int T170_r, T170_g, T170_b;

	int T171_initializedWithValidData = false, T171_okay = false;
	double T171_sx, T171_sy, T171_minx, T171_miny, T171_maxx, T171_maxy;

	int T171_lc1_horizontal, T171_lc1_vertical, T171_lc1_leftOrAbove, T171_lc1_cached;
	double T171_lc1_m, T171_lc1_C, T171_lc1_borderX, T171_lc1_borderY;

	int T171_lc2_horizontal, T171_lc2_vertical, T171_lc2_leftOrAbove, T171_lc2_cached;
	double T171_lc2_m, T171_lc2_C, T171_lc2_borderX, T171_lc2_borderY;

	int T171_lc3_horizontal, T171_lc3_vertical, T171_lc3_leftOrAbove, T171_lc3_cached;
	double T171_lc3_m, T171_lc3_C, T171_lc3_borderX, T171_lc3_borderY;

	int T171_lc1_lastY = Integer.MIN_VALUE, T171_lc2_lastY = Integer.MIN_VALUE, T171_lc3_lastY = Integer.MIN_VALUE;
	int T171_r, T171_g, T171_b;

	int T172_initializedWithValidData = false, T172_okay = false;
	double T172_sx, T172_sy, T172_minx, T172_miny, T172_maxx, T172_maxy;

	int T172_lc1_horizontal, T172_lc1_vertical, T172_lc1_leftOrAbove, T172_lc1_cached;
	double T172_lc1_m, T172_lc1_C, T172_lc1_borderX, T172_lc1_borderY;

	int T172_lc2_horizontal, T172_lc2_vertical, T172_lc2_leftOrAbove, T172_lc2_cached;
	double T172_lc2_m, T172_lc2_C, T172_lc2_borderX, T172_lc2_borderY;

	int T172_lc3_horizontal, T172_lc3_vertical, T172_lc3_leftOrAbove, T172_lc3_cached;
	double T172_lc3_m, T172_lc3_C, T172_lc3_borderX, T172_lc3_borderY;

	int T172_lc1_lastY = Integer.MIN_VALUE, T172_lc2_lastY = Integer.MIN_VALUE, T172_lc3_lastY = Integer.MIN_VALUE;
	int T172_r, T172_g, T172_b;

	int T173_initializedWithValidData = false, T173_okay = false;
	double T173_sx, T173_sy, T173_minx, T173_miny, T173_maxx, T173_maxy;

	int T173_lc1_horizontal, T173_lc1_vertical, T173_lc1_leftOrAbove, T173_lc1_cached;
	double T173_lc1_m, T173_lc1_C, T173_lc1_borderX, T173_lc1_borderY;

	int T173_lc2_horizontal, T173_lc2_vertical, T173_lc2_leftOrAbove, T173_lc2_cached;
	double T173_lc2_m, T173_lc2_C, T173_lc2_borderX, T173_lc2_borderY;

	int T173_lc3_horizontal, T173_lc3_vertical, T173_lc3_leftOrAbove, T173_lc3_cached;
	double T173_lc3_m, T173_lc3_C, T173_lc3_borderX, T173_lc3_borderY;

	int T173_lc1_lastY = Integer.MIN_VALUE, T173_lc2_lastY = Integer.MIN_VALUE, T173_lc3_lastY = Integer.MIN_VALUE;
	int T173_r, T173_g, T173_b;

	int T174_initializedWithValidData = false, T174_okay = false;
	double T174_sx, T174_sy, T174_minx, T174_miny, T174_maxx, T174_maxy;

	int T174_lc1_horizontal, T174_lc1_vertical, T174_lc1_leftOrAbove, T174_lc1_cached;
	double T174_lc1_m, T174_lc1_C, T174_lc1_borderX, T174_lc1_borderY;

	int T174_lc2_horizontal, T174_lc2_vertical, T174_lc2_leftOrAbove, T174_lc2_cached;
	double T174_lc2_m, T174_lc2_C, T174_lc2_borderX, T174_lc2_borderY;

	int T174_lc3_horizontal, T174_lc3_vertical, T174_lc3_leftOrAbove, T174_lc3_cached;
	double T174_lc3_m, T174_lc3_C, T174_lc3_borderX, T174_lc3_borderY;

	int T174_lc1_lastY = Integer.MIN_VALUE, T174_lc2_lastY = Integer.MIN_VALUE, T174_lc3_lastY = Integer.MIN_VALUE;
	int T174_r, T174_g, T174_b;

	int T175_initializedWithValidData = false, T175_okay = false;
	double T175_sx, T175_sy, T175_minx, T175_miny, T175_maxx, T175_maxy;

	int T175_lc1_horizontal, T175_lc1_vertical, T175_lc1_leftOrAbove, T175_lc1_cached;
	double T175_lc1_m, T175_lc1_C, T175_lc1_borderX, T175_lc1_borderY;

	int T175_lc2_horizontal, T175_lc2_vertical, T175_lc2_leftOrAbove, T175_lc2_cached;
	double T175_lc2_m, T175_lc2_C, T175_lc2_borderX, T175_lc2_borderY;

	int T175_lc3_horizontal, T175_lc3_vertical, T175_lc3_leftOrAbove, T175_lc3_cached;
	double T175_lc3_m, T175_lc3_C, T175_lc3_borderX, T175_lc3_borderY;

	int T175_lc1_lastY = Integer.MIN_VALUE, T175_lc2_lastY = Integer.MIN_VALUE, T175_lc3_lastY = Integer.MIN_VALUE;
	int T175_r, T175_g, T175_b;

	int T176_initializedWithValidData = false, T176_okay = false;
	double T176_sx, T176_sy, T176_minx, T176_miny, T176_maxx, T176_maxy;

	int T176_lc1_horizontal, T176_lc1_vertical, T176_lc1_leftOrAbove, T176_lc1_cached;
	double T176_lc1_m, T176_lc1_C, T176_lc1_borderX, T176_lc1_borderY;

	int T176_lc2_horizontal, T176_lc2_vertical, T176_lc2_leftOrAbove, T176_lc2_cached;
	double T176_lc2_m, T176_lc2_C, T176_lc2_borderX, T176_lc2_borderY;

	int T176_lc3_horizontal, T176_lc3_vertical, T176_lc3_leftOrAbove, T176_lc3_cached;
	double T176_lc3_m, T176_lc3_C, T176_lc3_borderX, T176_lc3_borderY;

	int T176_lc1_lastY = Integer.MIN_VALUE, T176_lc2_lastY = Integer.MIN_VALUE, T176_lc3_lastY = Integer.MIN_VALUE;
	int T176_r, T176_g, T176_b;

	int T177_initializedWithValidData = false, T177_okay = false;
	double T177_sx, T177_sy, T177_minx, T177_miny, T177_maxx, T177_maxy;

	int T177_lc1_horizontal, T177_lc1_vertical, T177_lc1_leftOrAbove, T177_lc1_cached;
	double T177_lc1_m, T177_lc1_C, T177_lc1_borderX, T177_lc1_borderY;

	int T177_lc2_horizontal, T177_lc2_vertical, T177_lc2_leftOrAbove, T177_lc2_cached;
	double T177_lc2_m, T177_lc2_C, T177_lc2_borderX, T177_lc2_borderY;

	int T177_lc3_horizontal, T177_lc3_vertical, T177_lc3_leftOrAbove, T177_lc3_cached;
	double T177_lc3_m, T177_lc3_C, T177_lc3_borderX, T177_lc3_borderY;

	int T177_lc1_lastY = Integer.MIN_VALUE, T177_lc2_lastY = Integer.MIN_VALUE, T177_lc3_lastY = Integer.MIN_VALUE;
	int T177_r, T177_g, T177_b;

	int T178_initializedWithValidData = false, T178_okay = false;
	double T178_sx, T178_sy, T178_minx, T178_miny, T178_maxx, T178_maxy;

	int T178_lc1_horizontal, T178_lc1_vertical, T178_lc1_leftOrAbove, T178_lc1_cached;
	double T178_lc1_m, T178_lc1_C, T178_lc1_borderX, T178_lc1_borderY;

	int T178_lc2_horizontal, T178_lc2_vertical, T178_lc2_leftOrAbove, T178_lc2_cached;
	double T178_lc2_m, T178_lc2_C, T178_lc2_borderX, T178_lc2_borderY;

	int T178_lc3_horizontal, T178_lc3_vertical, T178_lc3_leftOrAbove, T178_lc3_cached;
	double T178_lc3_m, T178_lc3_C, T178_lc3_borderX, T178_lc3_borderY;

	int T178_lc1_lastY = Integer.MIN_VALUE, T178_lc2_lastY = Integer.MIN_VALUE, T178_lc3_lastY = Integer.MIN_VALUE;
	int T178_r, T178_g, T178_b;

	int T179_initializedWithValidData = false, T179_okay = false;
	double T179_sx, T179_sy, T179_minx, T179_miny, T179_maxx, T179_maxy;

	int T179_lc1_horizontal, T179_lc1_vertical, T179_lc1_leftOrAbove, T179_lc1_cached;
	double T179_lc1_m, T179_lc1_C, T179_lc1_borderX, T179_lc1_borderY;

	int T179_lc2_horizontal, T179_lc2_vertical, T179_lc2_leftOrAbove, T179_lc2_cached;
	double T179_lc2_m, T179_lc2_C, T179_lc2_borderX, T179_lc2_borderY;

	int T179_lc3_horizontal, T179_lc3_vertical, T179_lc3_leftOrAbove, T179_lc3_cached;
	double T179_lc3_m, T179_lc3_C, T179_lc3_borderX, T179_lc3_borderY;

	int T179_lc1_lastY = Integer.MIN_VALUE, T179_lc2_lastY = Integer.MIN_VALUE, T179_lc3_lastY = Integer.MIN_VALUE;
	int T179_r, T179_g, T179_b;

	int T180_initializedWithValidData = false, T180_okay = false;
	double T180_sx, T180_sy, T180_minx, T180_miny, T180_maxx, T180_maxy;

	int T180_lc1_horizontal, T180_lc1_vertical, T180_lc1_leftOrAbove, T180_lc1_cached;
	double T180_lc1_m, T180_lc1_C, T180_lc1_borderX, T180_lc1_borderY;

	int T180_lc2_horizontal, T180_lc2_vertical, T180_lc2_leftOrAbove, T180_lc2_cached;
	double T180_lc2_m, T180_lc2_C, T180_lc2_borderX, T180_lc2_borderY;

	int T180_lc3_horizontal, T180_lc3_vertical, T180_lc3_leftOrAbove, T180_lc3_cached;
	double T180_lc3_m, T180_lc3_C, T180_lc3_borderX, T180_lc3_borderY;

	int T180_lc1_lastY = Integer.MIN_VALUE, T180_lc2_lastY = Integer.MIN_VALUE, T180_lc3_lastY = Integer.MIN_VALUE;
	int T180_r, T180_g, T180_b;

	int T181_initializedWithValidData = false, T181_okay = false;
	double T181_sx, T181_sy, T181_minx, T181_miny, T181_maxx, T181_maxy;

	int T181_lc1_horizontal, T181_lc1_vertical, T181_lc1_leftOrAbove, T181_lc1_cached;
	double T181_lc1_m, T181_lc1_C, T181_lc1_borderX, T181_lc1_borderY;

	int T181_lc2_horizontal, T181_lc2_vertical, T181_lc2_leftOrAbove, T181_lc2_cached;
	double T181_lc2_m, T181_lc2_C, T181_lc2_borderX, T181_lc2_borderY;

	int T181_lc3_horizontal, T181_lc3_vertical, T181_lc3_leftOrAbove, T181_lc3_cached;
	double T181_lc3_m, T181_lc3_C, T181_lc3_borderX, T181_lc3_borderY;

	int T181_lc1_lastY = Integer.MIN_VALUE, T181_lc2_lastY = Integer.MIN_VALUE, T181_lc3_lastY = Integer.MIN_VALUE;
	int T181_r, T181_g, T181_b;

	int T182_initializedWithValidData = false, T182_okay = false;
	double T182_sx, T182_sy, T182_minx, T182_miny, T182_maxx, T182_maxy;

	int T182_lc1_horizontal, T182_lc1_vertical, T182_lc1_leftOrAbove, T182_lc1_cached;
	double T182_lc1_m, T182_lc1_C, T182_lc1_borderX, T182_lc1_borderY;

	int T182_lc2_horizontal, T182_lc2_vertical, T182_lc2_leftOrAbove, T182_lc2_cached;
	double T182_lc2_m, T182_lc2_C, T182_lc2_borderX, T182_lc2_borderY;

	int T182_lc3_horizontal, T182_lc3_vertical, T182_lc3_leftOrAbove, T182_lc3_cached;
	double T182_lc3_m, T182_lc3_C, T182_lc3_borderX, T182_lc3_borderY;

	int T182_lc1_lastY = Integer.MIN_VALUE, T182_lc2_lastY = Integer.MIN_VALUE, T182_lc3_lastY = Integer.MIN_VALUE;
	int T182_r, T182_g, T182_b;

	int T183_initializedWithValidData = false, T183_okay = false;
	double T183_sx, T183_sy, T183_minx, T183_miny, T183_maxx, T183_maxy;

	int T183_lc1_horizontal, T183_lc1_vertical, T183_lc1_leftOrAbove, T183_lc1_cached;
	double T183_lc1_m, T183_lc1_C, T183_lc1_borderX, T183_lc1_borderY;

	int T183_lc2_horizontal, T183_lc2_vertical, T183_lc2_leftOrAbove, T183_lc2_cached;
	double T183_lc2_m, T183_lc2_C, T183_lc2_borderX, T183_lc2_borderY;

	int T183_lc3_horizontal, T183_lc3_vertical, T183_lc3_leftOrAbove, T183_lc3_cached;
	double T183_lc3_m, T183_lc3_C, T183_lc3_borderX, T183_lc3_borderY;

	int T183_lc1_lastY = Integer.MIN_VALUE, T183_lc2_lastY = Integer.MIN_VALUE, T183_lc3_lastY = Integer.MIN_VALUE;
	int T183_r, T183_g, T183_b;

	int T184_initializedWithValidData = false, T184_okay = false;
	double T184_sx, T184_sy, T184_minx, T184_miny, T184_maxx, T184_maxy;

	int T184_lc1_horizontal, T184_lc1_vertical, T184_lc1_leftOrAbove, T184_lc1_cached;
	double T184_lc1_m, T184_lc1_C, T184_lc1_borderX, T184_lc1_borderY;

	int T184_lc2_horizontal, T184_lc2_vertical, T184_lc2_leftOrAbove, T184_lc2_cached;
	double T184_lc2_m, T184_lc2_C, T184_lc2_borderX, T184_lc2_borderY;

	int T184_lc3_horizontal, T184_lc3_vertical, T184_lc3_leftOrAbove, T184_lc3_cached;
	double T184_lc3_m, T184_lc3_C, T184_lc3_borderX, T184_lc3_borderY;

	int T184_lc1_lastY = Integer.MIN_VALUE, T184_lc2_lastY = Integer.MIN_VALUE, T184_lc3_lastY = Integer.MIN_VALUE;
	int T184_r, T184_g, T184_b;

	int T185_initializedWithValidData = false, T185_okay = false;
	double T185_sx, T185_sy, T185_minx, T185_miny, T185_maxx, T185_maxy;

	int T185_lc1_horizontal, T185_lc1_vertical, T185_lc1_leftOrAbove, T185_lc1_cached;
	double T185_lc1_m, T185_lc1_C, T185_lc1_borderX, T185_lc1_borderY;

	int T185_lc2_horizontal, T185_lc2_vertical, T185_lc2_leftOrAbove, T185_lc2_cached;
	double T185_lc2_m, T185_lc2_C, T185_lc2_borderX, T185_lc2_borderY;

	int T185_lc3_horizontal, T185_lc3_vertical, T185_lc3_leftOrAbove, T185_lc3_cached;
	double T185_lc3_m, T185_lc3_C, T185_lc3_borderX, T185_lc3_borderY;

	int T185_lc1_lastY = Integer.MIN_VALUE, T185_lc2_lastY = Integer.MIN_VALUE, T185_lc3_lastY = Integer.MIN_VALUE;
	int T185_r, T185_g, T185_b;

	int T186_initializedWithValidData = false, T186_okay = false;
	double T186_sx, T186_sy, T186_minx, T186_miny, T186_maxx, T186_maxy;

	int T186_lc1_horizontal, T186_lc1_vertical, T186_lc1_leftOrAbove, T186_lc1_cached;
	double T186_lc1_m, T186_lc1_C, T186_lc1_borderX, T186_lc1_borderY;

	int T186_lc2_horizontal, T186_lc2_vertical, T186_lc2_leftOrAbove, T186_lc2_cached;
	double T186_lc2_m, T186_lc2_C, T186_lc2_borderX, T186_lc2_borderY;

	int T186_lc3_horizontal, T186_lc3_vertical, T186_lc3_leftOrAbove, T186_lc3_cached;
	double T186_lc3_m, T186_lc3_C, T186_lc3_borderX, T186_lc3_borderY;

	int T186_lc1_lastY = Integer.MIN_VALUE, T186_lc2_lastY = Integer.MIN_VALUE, T186_lc3_lastY = Integer.MIN_VALUE;
	int T186_r, T186_g, T186_b;

	int T187_initializedWithValidData = false, T187_okay = false;
	double T187_sx, T187_sy, T187_minx, T187_miny, T187_maxx, T187_maxy;

	int T187_lc1_horizontal, T187_lc1_vertical, T187_lc1_leftOrAbove, T187_lc1_cached;
	double T187_lc1_m, T187_lc1_C, T187_lc1_borderX, T187_lc1_borderY;

	int T187_lc2_horizontal, T187_lc2_vertical, T187_lc2_leftOrAbove, T187_lc2_cached;
	double T187_lc2_m, T187_lc2_C, T187_lc2_borderX, T187_lc2_borderY;

	int T187_lc3_horizontal, T187_lc3_vertical, T187_lc3_leftOrAbove, T187_lc3_cached;
	double T187_lc3_m, T187_lc3_C, T187_lc3_borderX, T187_lc3_borderY;

	int T187_lc1_lastY = Integer.MIN_VALUE, T187_lc2_lastY = Integer.MIN_VALUE, T187_lc3_lastY = Integer.MIN_VALUE;
	int T187_r, T187_g, T187_b;

	int T188_initializedWithValidData = false, T188_okay = false;
	double T188_sx, T188_sy, T188_minx, T188_miny, T188_maxx, T188_maxy;

	int T188_lc1_horizontal, T188_lc1_vertical, T188_lc1_leftOrAbove, T188_lc1_cached;
	double T188_lc1_m, T188_lc1_C, T188_lc1_borderX, T188_lc1_borderY;

	int T188_lc2_horizontal, T188_lc2_vertical, T188_lc2_leftOrAbove, T188_lc2_cached;
	double T188_lc2_m, T188_lc2_C, T188_lc2_borderX, T188_lc2_borderY;

	int T188_lc3_horizontal, T188_lc3_vertical, T188_lc3_leftOrAbove, T188_lc3_cached;
	double T188_lc3_m, T188_lc3_C, T188_lc3_borderX, T188_lc3_borderY;

	int T188_lc1_lastY = Integer.MIN_VALUE, T188_lc2_lastY = Integer.MIN_VALUE, T188_lc3_lastY = Integer.MIN_VALUE;
	int T188_r, T188_g, T188_b;

	int T189_initializedWithValidData = false, T189_okay = false;
	double T189_sx, T189_sy, T189_minx, T189_miny, T189_maxx, T189_maxy;

	int T189_lc1_horizontal, T189_lc1_vertical, T189_lc1_leftOrAbove, T189_lc1_cached;
	double T189_lc1_m, T189_lc1_C, T189_lc1_borderX, T189_lc1_borderY;

	int T189_lc2_horizontal, T189_lc2_vertical, T189_lc2_leftOrAbove, T189_lc2_cached;
	double T189_lc2_m, T189_lc2_C, T189_lc2_borderX, T189_lc2_borderY;

	int T189_lc3_horizontal, T189_lc3_vertical, T189_lc3_leftOrAbove, T189_lc3_cached;
	double T189_lc3_m, T189_lc3_C, T189_lc3_borderX, T189_lc3_borderY;

	int T189_lc1_lastY = Integer.MIN_VALUE, T189_lc2_lastY = Integer.MIN_VALUE, T189_lc3_lastY = Integer.MIN_VALUE;
	int T189_r, T189_g, T189_b;

	int T190_initializedWithValidData = false, T190_okay = false;
	double T190_sx, T190_sy, T190_minx, T190_miny, T190_maxx, T190_maxy;

	int T190_lc1_horizontal, T190_lc1_vertical, T190_lc1_leftOrAbove, T190_lc1_cached;
	double T190_lc1_m, T190_lc1_C, T190_lc1_borderX, T190_lc1_borderY;

	int T190_lc2_horizontal, T190_lc2_vertical, T190_lc2_leftOrAbove, T190_lc2_cached;
	double T190_lc2_m, T190_lc2_C, T190_lc2_borderX, T190_lc2_borderY;

	int T190_lc3_horizontal, T190_lc3_vertical, T190_lc3_leftOrAbove, T190_lc3_cached;
	double T190_lc3_m, T190_lc3_C, T190_lc3_borderX, T190_lc3_borderY;

	int T190_lc1_lastY = Integer.MIN_VALUE, T190_lc2_lastY = Integer.MIN_VALUE, T190_lc3_lastY = Integer.MIN_VALUE;
	int T190_r, T190_g, T190_b;

	int T191_initializedWithValidData = false, T191_okay = false;
	double T191_sx, T191_sy, T191_minx, T191_miny, T191_maxx, T191_maxy;

	int T191_lc1_horizontal, T191_lc1_vertical, T191_lc1_leftOrAbove, T191_lc1_cached;
	double T191_lc1_m, T191_lc1_C, T191_lc1_borderX, T191_lc1_borderY;

	int T191_lc2_horizontal, T191_lc2_vertical, T191_lc2_leftOrAbove, T191_lc2_cached;
	double T191_lc2_m, T191_lc2_C, T191_lc2_borderX, T191_lc2_borderY;

	int T191_lc3_horizontal, T191_lc3_vertical, T191_lc3_leftOrAbove, T191_lc3_cached;
	double T191_lc3_m, T191_lc3_C, T191_lc3_borderX, T191_lc3_borderY;

	int T191_lc1_lastY = Integer.MIN_VALUE, T191_lc2_lastY = Integer.MIN_VALUE, T191_lc3_lastY = Integer.MIN_VALUE;
	int T191_r, T191_g, T191_b;

	int T192_initializedWithValidData = false, T192_okay = false;
	double T192_sx, T192_sy, T192_minx, T192_miny, T192_maxx, T192_maxy;

	int T192_lc1_horizontal, T192_lc1_vertical, T192_lc1_leftOrAbove, T192_lc1_cached;
	double T192_lc1_m, T192_lc1_C, T192_lc1_borderX, T192_lc1_borderY;

	int T192_lc2_horizontal, T192_lc2_vertical, T192_lc2_leftOrAbove, T192_lc2_cached;
	double T192_lc2_m, T192_lc2_C, T192_lc2_borderX, T192_lc2_borderY;

	int T192_lc3_horizontal, T192_lc3_vertical, T192_lc3_leftOrAbove, T192_lc3_cached;
	double T192_lc3_m, T192_lc3_C, T192_lc3_borderX, T192_lc3_borderY;

	int T192_lc1_lastY = Integer.MIN_VALUE, T192_lc2_lastY = Integer.MIN_VALUE, T192_lc3_lastY = Integer.MIN_VALUE;
	int T192_r, T192_g, T192_b;

	int T193_initializedWithValidData = false, T193_okay = false;
	double T193_sx, T193_sy, T193_minx, T193_miny, T193_maxx, T193_maxy;

	int T193_lc1_horizontal, T193_lc1_vertical, T193_lc1_leftOrAbove, T193_lc1_cached;
	double T193_lc1_m, T193_lc1_C, T193_lc1_borderX, T193_lc1_borderY;

	int T193_lc2_horizontal, T193_lc2_vertical, T193_lc2_leftOrAbove, T193_lc2_cached;
	double T193_lc2_m, T193_lc2_C, T193_lc2_borderX, T193_lc2_borderY;

	int T193_lc3_horizontal, T193_lc3_vertical, T193_lc3_leftOrAbove, T193_lc3_cached;
	double T193_lc3_m, T193_lc3_C, T193_lc3_borderX, T193_lc3_borderY;

	int T193_lc1_lastY = Integer.MIN_VALUE, T193_lc2_lastY = Integer.MIN_VALUE, T193_lc3_lastY = Integer.MIN_VALUE;
	int T193_r, T193_g, T193_b;

	int T194_initializedWithValidData = false, T194_okay = false;
	double T194_sx, T194_sy, T194_minx, T194_miny, T194_maxx, T194_maxy;

	int T194_lc1_horizontal, T194_lc1_vertical, T194_lc1_leftOrAbove, T194_lc1_cached;
	double T194_lc1_m, T194_lc1_C, T194_lc1_borderX, T194_lc1_borderY;

	int T194_lc2_horizontal, T194_lc2_vertical, T194_lc2_leftOrAbove, T194_lc2_cached;
	double T194_lc2_m, T194_lc2_C, T194_lc2_borderX, T194_lc2_borderY;

	int T194_lc3_horizontal, T194_lc3_vertical, T194_lc3_leftOrAbove, T194_lc3_cached;
	double T194_lc3_m, T194_lc3_C, T194_lc3_borderX, T194_lc3_borderY;

	int T194_lc1_lastY = Integer.MIN_VALUE, T194_lc2_lastY = Integer.MIN_VALUE, T194_lc3_lastY = Integer.MIN_VALUE;
	int T194_r, T194_g, T194_b;

	int T195_initializedWithValidData = false, T195_okay = false;
	double T195_sx, T195_sy, T195_minx, T195_miny, T195_maxx, T195_maxy;

	int T195_lc1_horizontal, T195_lc1_vertical, T195_lc1_leftOrAbove, T195_lc1_cached;
	double T195_lc1_m, T195_lc1_C, T195_lc1_borderX, T195_lc1_borderY;

	int T195_lc2_horizontal, T195_lc2_vertical, T195_lc2_leftOrAbove, T195_lc2_cached;
	double T195_lc2_m, T195_lc2_C, T195_lc2_borderX, T195_lc2_borderY;

	int T195_lc3_horizontal, T195_lc3_vertical, T195_lc3_leftOrAbove, T195_lc3_cached;
	double T195_lc3_m, T195_lc3_C, T195_lc3_borderX, T195_lc3_borderY;

	int T195_lc1_lastY = Integer.MIN_VALUE, T195_lc2_lastY = Integer.MIN_VALUE, T195_lc3_lastY = Integer.MIN_VALUE;
	int T195_r, T195_g, T195_b;

	int T196_initializedWithValidData = false, T196_okay = false;
	double T196_sx, T196_sy, T196_minx, T196_miny, T196_maxx, T196_maxy;

	int T196_lc1_horizontal, T196_lc1_vertical, T196_lc1_leftOrAbove, T196_lc1_cached;
	double T196_lc1_m, T196_lc1_C, T196_lc1_borderX, T196_lc1_borderY;

	int T196_lc2_horizontal, T196_lc2_vertical, T196_lc2_leftOrAbove, T196_lc2_cached;
	double T196_lc2_m, T196_lc2_C, T196_lc2_borderX, T196_lc2_borderY;

	int T196_lc3_horizontal, T196_lc3_vertical, T196_lc3_leftOrAbove, T196_lc3_cached;
	double T196_lc3_m, T196_lc3_C, T196_lc3_borderX, T196_lc3_borderY;

	int T196_lc1_lastY = Integer.MIN_VALUE, T196_lc2_lastY = Integer.MIN_VALUE, T196_lc3_lastY = Integer.MIN_VALUE;
	int T196_r, T196_g, T196_b;

	int T197_initializedWithValidData = false, T197_okay = false;
	double T197_sx, T197_sy, T197_minx, T197_miny, T197_maxx, T197_maxy;

	int T197_lc1_horizontal, T197_lc1_vertical, T197_lc1_leftOrAbove, T197_lc1_cached;
	double T197_lc1_m, T197_lc1_C, T197_lc1_borderX, T197_lc1_borderY;

	int T197_lc2_horizontal, T197_lc2_vertical, T197_lc2_leftOrAbove, T197_lc2_cached;
	double T197_lc2_m, T197_lc2_C, T197_lc2_borderX, T197_lc2_borderY;

	int T197_lc3_horizontal, T197_lc3_vertical, T197_lc3_leftOrAbove, T197_lc3_cached;
	double T197_lc3_m, T197_lc3_C, T197_lc3_borderX, T197_lc3_borderY;

	int T197_lc1_lastY = Integer.MIN_VALUE, T197_lc2_lastY = Integer.MIN_VALUE, T197_lc3_lastY = Integer.MIN_VALUE;
	int T197_r, T197_g, T197_b;

	int T198_initializedWithValidData = false, T198_okay = false;
	double T198_sx, T198_sy, T198_minx, T198_miny, T198_maxx, T198_maxy;

	int T198_lc1_horizontal, T198_lc1_vertical, T198_lc1_leftOrAbove, T198_lc1_cached;
	double T198_lc1_m, T198_lc1_C, T198_lc1_borderX, T198_lc1_borderY;

	int T198_lc2_horizontal, T198_lc2_vertical, T198_lc2_leftOrAbove, T198_lc2_cached;
	double T198_lc2_m, T198_lc2_C, T198_lc2_borderX, T198_lc2_borderY;

	int T198_lc3_horizontal, T198_lc3_vertical, T198_lc3_leftOrAbove, T198_lc3_cached;
	double T198_lc3_m, T198_lc3_C, T198_lc3_borderX, T198_lc3_borderY;

	int T198_lc1_lastY = Integer.MIN_VALUE, T198_lc2_lastY = Integer.MIN_VALUE, T198_lc3_lastY = Integer.MIN_VALUE;
	int T198_r, T198_g, T198_b;

	int T199_initializedWithValidData = false, T199_okay = false;
	double T199_sx, T199_sy, T199_minx, T199_miny, T199_maxx, T199_maxy;

	int T199_lc1_horizontal, T199_lc1_vertical, T199_lc1_leftOrAbove, T199_lc1_cached;
	double T199_lc1_m, T199_lc1_C, T199_lc1_borderX, T199_lc1_borderY;

	int T199_lc2_horizontal, T199_lc2_vertical, T199_lc2_leftOrAbove, T199_lc2_cached;
	double T199_lc2_m, T199_lc2_C, T199_lc2_borderX, T199_lc2_borderY;

	int T199_lc3_horizontal, T199_lc3_vertical, T199_lc3_leftOrAbove, T199_lc3_cached;
	double T199_lc3_m, T199_lc3_C, T199_lc3_borderX, T199_lc3_borderY;

	int T199_lc1_lastY = Integer.MIN_VALUE, T199_lc2_lastY = Integer.MIN_VALUE, T199_lc3_lastY = Integer.MIN_VALUE;
	int T199_r, T199_g, T199_b;

	int T200_initializedWithValidData = false, T200_okay = false;
	double T200_sx, T200_sy, T200_minx, T200_miny, T200_maxx, T200_maxy;

	int T200_lc1_horizontal, T200_lc1_vertical, T200_lc1_leftOrAbove, T200_lc1_cached;
	double T200_lc1_m, T200_lc1_C, T200_lc1_borderX, T200_lc1_borderY;

	int T200_lc2_horizontal, T200_lc2_vertical, T200_lc2_leftOrAbove, T200_lc2_cached;
	double T200_lc2_m, T200_lc2_C, T200_lc2_borderX, T200_lc2_borderY;

	int T200_lc3_horizontal, T200_lc3_vertical, T200_lc3_leftOrAbove, T200_lc3_cached;
	double T200_lc3_m, T200_lc3_C, T200_lc3_borderX, T200_lc3_borderY;

	int T200_lc1_lastY = Integer.MIN_VALUE, T200_lc2_lastY = Integer.MIN_VALUE, T200_lc3_lastY = Integer.MIN_VALUE;
	int T200_r, T200_g, T200_b;

	int T201_initializedWithValidData = false, T201_okay = false;
	double T201_sx, T201_sy, T201_minx, T201_miny, T201_maxx, T201_maxy;

	int T201_lc1_horizontal, T201_lc1_vertical, T201_lc1_leftOrAbove, T201_lc1_cached;
	double T201_lc1_m, T201_lc1_C, T201_lc1_borderX, T201_lc1_borderY;

	int T201_lc2_horizontal, T201_lc2_vertical, T201_lc2_leftOrAbove, T201_lc2_cached;
	double T201_lc2_m, T201_lc2_C, T201_lc2_borderX, T201_lc2_borderY;

	int T201_lc3_horizontal, T201_lc3_vertical, T201_lc3_leftOrAbove, T201_lc3_cached;
	double T201_lc3_m, T201_lc3_C, T201_lc3_borderX, T201_lc3_borderY;

	int T201_lc1_lastY = Integer.MIN_VALUE, T201_lc2_lastY = Integer.MIN_VALUE, T201_lc3_lastY = Integer.MIN_VALUE;
	int T201_r, T201_g, T201_b;

	int T202_initializedWithValidData = false, T202_okay = false;
	double T202_sx, T202_sy, T202_minx, T202_miny, T202_maxx, T202_maxy;

	int T202_lc1_horizontal, T202_lc1_vertical, T202_lc1_leftOrAbove, T202_lc1_cached;
	double T202_lc1_m, T202_lc1_C, T202_lc1_borderX, T202_lc1_borderY;

	int T202_lc2_horizontal, T202_lc2_vertical, T202_lc2_leftOrAbove, T202_lc2_cached;
	double T202_lc2_m, T202_lc2_C, T202_lc2_borderX, T202_lc2_borderY;

	int T202_lc3_horizontal, T202_lc3_vertical, T202_lc3_leftOrAbove, T202_lc3_cached;
	double T202_lc3_m, T202_lc3_C, T202_lc3_borderX, T202_lc3_borderY;

	int T202_lc1_lastY = Integer.MIN_VALUE, T202_lc2_lastY = Integer.MIN_VALUE, T202_lc3_lastY = Integer.MIN_VALUE;
	int T202_r, T202_g, T202_b;

	int T203_initializedWithValidData = false, T203_okay = false;
	double T203_sx, T203_sy, T203_minx, T203_miny, T203_maxx, T203_maxy;

	int T203_lc1_horizontal, T203_lc1_vertical, T203_lc1_leftOrAbove, T203_lc1_cached;
	double T203_lc1_m, T203_lc1_C, T203_lc1_borderX, T203_lc1_borderY;

	int T203_lc2_horizontal, T203_lc2_vertical, T203_lc2_leftOrAbove, T203_lc2_cached;
	double T203_lc2_m, T203_lc2_C, T203_lc2_borderX, T203_lc2_borderY;

	int T203_lc3_horizontal, T203_lc3_vertical, T203_lc3_leftOrAbove, T203_lc3_cached;
	double T203_lc3_m, T203_lc3_C, T203_lc3_borderX, T203_lc3_borderY;

	int T203_lc1_lastY = Integer.MIN_VALUE, T203_lc2_lastY = Integer.MIN_VALUE, T203_lc3_lastY = Integer.MIN_VALUE;
	int T203_r, T203_g, T203_b;

	int T204_initializedWithValidData = false, T204_okay = false;
	double T204_sx, T204_sy, T204_minx, T204_miny, T204_maxx, T204_maxy;

	int T204_lc1_horizontal, T204_lc1_vertical, T204_lc1_leftOrAbove, T204_lc1_cached;
	double T204_lc1_m, T204_lc1_C, T204_lc1_borderX, T204_lc1_borderY;

	int T204_lc2_horizontal, T204_lc2_vertical, T204_lc2_leftOrAbove, T204_lc2_cached;
	double T204_lc2_m, T204_lc2_C, T204_lc2_borderX, T204_lc2_borderY;

	int T204_lc3_horizontal, T204_lc3_vertical, T204_lc3_leftOrAbove, T204_lc3_cached;
	double T204_lc3_m, T204_lc3_C, T204_lc3_borderX, T204_lc3_borderY;

	int T204_lc1_lastY = Integer.MIN_VALUE, T204_lc2_lastY = Integer.MIN_VALUE, T204_lc3_lastY = Integer.MIN_VALUE;
	int T204_r, T204_g, T204_b;

	int T205_initializedWithValidData = false, T205_okay = false;
	double T205_sx, T205_sy, T205_minx, T205_miny, T205_maxx, T205_maxy;

	int T205_lc1_horizontal, T205_lc1_vertical, T205_lc1_leftOrAbove, T205_lc1_cached;
	double T205_lc1_m, T205_lc1_C, T205_lc1_borderX, T205_lc1_borderY;

	int T205_lc2_horizontal, T205_lc2_vertical, T205_lc2_leftOrAbove, T205_lc2_cached;
	double T205_lc2_m, T205_lc2_C, T205_lc2_borderX, T205_lc2_borderY;

	int T205_lc3_horizontal, T205_lc3_vertical, T205_lc3_leftOrAbove, T205_lc3_cached;
	double T205_lc3_m, T205_lc3_C, T205_lc3_borderX, T205_lc3_borderY;

	int T205_lc1_lastY = Integer.MIN_VALUE, T205_lc2_lastY = Integer.MIN_VALUE, T205_lc3_lastY = Integer.MIN_VALUE;
	int T205_r, T205_g, T205_b;

	int T206_initializedWithValidData = false, T206_okay = false;
	double T206_sx, T206_sy, T206_minx, T206_miny, T206_maxx, T206_maxy;

	int T206_lc1_horizontal, T206_lc1_vertical, T206_lc1_leftOrAbove, T206_lc1_cached;
	double T206_lc1_m, T206_lc1_C, T206_lc1_borderX, T206_lc1_borderY;

	int T206_lc2_horizontal, T206_lc2_vertical, T206_lc2_leftOrAbove, T206_lc2_cached;
	double T206_lc2_m, T206_lc2_C, T206_lc2_borderX, T206_lc2_borderY;

	int T206_lc3_horizontal, T206_lc3_vertical, T206_lc3_leftOrAbove, T206_lc3_cached;
	double T206_lc3_m, T206_lc3_C, T206_lc3_borderX, T206_lc3_borderY;

	int T206_lc1_lastY = Integer.MIN_VALUE, T206_lc2_lastY = Integer.MIN_VALUE, T206_lc3_lastY = Integer.MIN_VALUE;
	int T206_r, T206_g, T206_b;

	int T207_initializedWithValidData = false, T207_okay = false;
	double T207_sx, T207_sy, T207_minx, T207_miny, T207_maxx, T207_maxy;

	int T207_lc1_horizontal, T207_lc1_vertical, T207_lc1_leftOrAbove, T207_lc1_cached;
	double T207_lc1_m, T207_lc1_C, T207_lc1_borderX, T207_lc1_borderY;

	int T207_lc2_horizontal, T207_lc2_vertical, T207_lc2_leftOrAbove, T207_lc2_cached;
	double T207_lc2_m, T207_lc2_C, T207_lc2_borderX, T207_lc2_borderY;

	int T207_lc3_horizontal, T207_lc3_vertical, T207_lc3_leftOrAbove, T207_lc3_cached;
	double T207_lc3_m, T207_lc3_C, T207_lc3_borderX, T207_lc3_borderY;

	int T207_lc1_lastY = Integer.MIN_VALUE, T207_lc2_lastY = Integer.MIN_VALUE, T207_lc3_lastY = Integer.MIN_VALUE;
	int T207_r, T207_g, T207_b;

	int T208_initializedWithValidData = false, T208_okay = false;
	double T208_sx, T208_sy, T208_minx, T208_miny, T208_maxx, T208_maxy;

	int T208_lc1_horizontal, T208_lc1_vertical, T208_lc1_leftOrAbove, T208_lc1_cached;
	double T208_lc1_m, T208_lc1_C, T208_lc1_borderX, T208_lc1_borderY;

	int T208_lc2_horizontal, T208_lc2_vertical, T208_lc2_leftOrAbove, T208_lc2_cached;
	double T208_lc2_m, T208_lc2_C, T208_lc2_borderX, T208_lc2_borderY;

	int T208_lc3_horizontal, T208_lc3_vertical, T208_lc3_leftOrAbove, T208_lc3_cached;
	double T208_lc3_m, T208_lc3_C, T208_lc3_borderX, T208_lc3_borderY;

	int T208_lc1_lastY = Integer.MIN_VALUE, T208_lc2_lastY = Integer.MIN_VALUE, T208_lc3_lastY = Integer.MIN_VALUE;
	int T208_r, T208_g, T208_b;

	int T209_initializedWithValidData = false, T209_okay = false;
	double T209_sx, T209_sy, T209_minx, T209_miny, T209_maxx, T209_maxy;

	int T209_lc1_horizontal, T209_lc1_vertical, T209_lc1_leftOrAbove, T209_lc1_cached;
	double T209_lc1_m, T209_lc1_C, T209_lc1_borderX, T209_lc1_borderY;

	int T209_lc2_horizontal, T209_lc2_vertical, T209_lc2_leftOrAbove, T209_lc2_cached;
	double T209_lc2_m, T209_lc2_C, T209_lc2_borderX, T209_lc2_borderY;

	int T209_lc3_horizontal, T209_lc3_vertical, T209_lc3_leftOrAbove, T209_lc3_cached;
	double T209_lc3_m, T209_lc3_C, T209_lc3_borderX, T209_lc3_borderY;

	int T209_lc1_lastY = Integer.MIN_VALUE, T209_lc2_lastY = Integer.MIN_VALUE, T209_lc3_lastY = Integer.MIN_VALUE;
	int T209_r, T209_g, T209_b;

	int T210_initializedWithValidData = false, T210_okay = false;
	double T210_sx, T210_sy, T210_minx, T210_miny, T210_maxx, T210_maxy;

	int T210_lc1_horizontal, T210_lc1_vertical, T210_lc1_leftOrAbove, T210_lc1_cached;
	double T210_lc1_m, T210_lc1_C, T210_lc1_borderX, T210_lc1_borderY;

	int T210_lc2_horizontal, T210_lc2_vertical, T210_lc2_leftOrAbove, T210_lc2_cached;
	double T210_lc2_m, T210_lc2_C, T210_lc2_borderX, T210_lc2_borderY;

	int T210_lc3_horizontal, T210_lc3_vertical, T210_lc3_leftOrAbove, T210_lc3_cached;
	double T210_lc3_m, T210_lc3_C, T210_lc3_borderX, T210_lc3_borderY;

	int T210_lc1_lastY = Integer.MIN_VALUE, T210_lc2_lastY = Integer.MIN_VALUE, T210_lc3_lastY = Integer.MIN_VALUE;
	int T210_r, T210_g, T210_b;

	int T211_initializedWithValidData = false, T211_okay = false;
	double T211_sx, T211_sy, T211_minx, T211_miny, T211_maxx, T211_maxy;

	int T211_lc1_horizontal, T211_lc1_vertical, T211_lc1_leftOrAbove, T211_lc1_cached;
	double T211_lc1_m, T211_lc1_C, T211_lc1_borderX, T211_lc1_borderY;

	int T211_lc2_horizontal, T211_lc2_vertical, T211_lc2_leftOrAbove, T211_lc2_cached;
	double T211_lc2_m, T211_lc2_C, T211_lc2_borderX, T211_lc2_borderY;

	int T211_lc3_horizontal, T211_lc3_vertical, T211_lc3_leftOrAbove, T211_lc3_cached;
	double T211_lc3_m, T211_lc3_C, T211_lc3_borderX, T211_lc3_borderY;

	int T211_lc1_lastY = Integer.MIN_VALUE, T211_lc2_lastY = Integer.MIN_VALUE, T211_lc3_lastY = Integer.MIN_VALUE;
	int T211_r, T211_g, T211_b;

	int T212_initializedWithValidData = false, T212_okay = false;
	double T212_sx, T212_sy, T212_minx, T212_miny, T212_maxx, T212_maxy;

	int T212_lc1_horizontal, T212_lc1_vertical, T212_lc1_leftOrAbove, T212_lc1_cached;
	double T212_lc1_m, T212_lc1_C, T212_lc1_borderX, T212_lc1_borderY;

	int T212_lc2_horizontal, T212_lc2_vertical, T212_lc2_leftOrAbove, T212_lc2_cached;
	double T212_lc2_m, T212_lc2_C, T212_lc2_borderX, T212_lc2_borderY;

	int T212_lc3_horizontal, T212_lc3_vertical, T212_lc3_leftOrAbove, T212_lc3_cached;
	double T212_lc3_m, T212_lc3_C, T212_lc3_borderX, T212_lc3_borderY;

	int T212_lc1_lastY = Integer.MIN_VALUE, T212_lc2_lastY = Integer.MIN_VALUE, T212_lc3_lastY = Integer.MIN_VALUE;
	int T212_r, T212_g, T212_b;

	int T213_initializedWithValidData = false, T213_okay = false;
	double T213_sx, T213_sy, T213_minx, T213_miny, T213_maxx, T213_maxy;

	int T213_lc1_horizontal, T213_lc1_vertical, T213_lc1_leftOrAbove, T213_lc1_cached;
	double T213_lc1_m, T213_lc1_C, T213_lc1_borderX, T213_lc1_borderY;

	int T213_lc2_horizontal, T213_lc2_vertical, T213_lc2_leftOrAbove, T213_lc2_cached;
	double T213_lc2_m, T213_lc2_C, T213_lc2_borderX, T213_lc2_borderY;

	int T213_lc3_horizontal, T213_lc3_vertical, T213_lc3_leftOrAbove, T213_lc3_cached;
	double T213_lc3_m, T213_lc3_C, T213_lc3_borderX, T213_lc3_borderY;

	int T213_lc1_lastY = Integer.MIN_VALUE, T213_lc2_lastY = Integer.MIN_VALUE, T213_lc3_lastY = Integer.MIN_VALUE;
	int T213_r, T213_g, T213_b;

	int T214_initializedWithValidData = false, T214_okay = false;
	double T214_sx, T214_sy, T214_minx, T214_miny, T214_maxx, T214_maxy;

	int T214_lc1_horizontal, T214_lc1_vertical, T214_lc1_leftOrAbove, T214_lc1_cached;
	double T214_lc1_m, T214_lc1_C, T214_lc1_borderX, T214_lc1_borderY;

	int T214_lc2_horizontal, T214_lc2_vertical, T214_lc2_leftOrAbove, T214_lc2_cached;
	double T214_lc2_m, T214_lc2_C, T214_lc2_borderX, T214_lc2_borderY;

	int T214_lc3_horizontal, T214_lc3_vertical, T214_lc3_leftOrAbove, T214_lc3_cached;
	double T214_lc3_m, T214_lc3_C, T214_lc3_borderX, T214_lc3_borderY;

	int T214_lc1_lastY = Integer.MIN_VALUE, T214_lc2_lastY = Integer.MIN_VALUE, T214_lc3_lastY = Integer.MIN_VALUE;
	int T214_r, T214_g, T214_b;

	int T215_initializedWithValidData = false, T215_okay = false;
	double T215_sx, T215_sy, T215_minx, T215_miny, T215_maxx, T215_maxy;

	int T215_lc1_horizontal, T215_lc1_vertical, T215_lc1_leftOrAbove, T215_lc1_cached;
	double T215_lc1_m, T215_lc1_C, T215_lc1_borderX, T215_lc1_borderY;

	int T215_lc2_horizontal, T215_lc2_vertical, T215_lc2_leftOrAbove, T215_lc2_cached;
	double T215_lc2_m, T215_lc2_C, T215_lc2_borderX, T215_lc2_borderY;

	int T215_lc3_horizontal, T215_lc3_vertical, T215_lc3_leftOrAbove, T215_lc3_cached;
	double T215_lc3_m, T215_lc3_C, T215_lc3_borderX, T215_lc3_borderY;

	int T215_lc1_lastY = Integer.MIN_VALUE, T215_lc2_lastY = Integer.MIN_VALUE, T215_lc3_lastY = Integer.MIN_VALUE;
	int T215_r, T215_g, T215_b;

	int T216_initializedWithValidData = false, T216_okay = false;
	double T216_sx, T216_sy, T216_minx, T216_miny, T216_maxx, T216_maxy;

	int T216_lc1_horizontal, T216_lc1_vertical, T216_lc1_leftOrAbove, T216_lc1_cached;
	double T216_lc1_m, T216_lc1_C, T216_lc1_borderX, T216_lc1_borderY;

	int T216_lc2_horizontal, T216_lc2_vertical, T216_lc2_leftOrAbove, T216_lc2_cached;
	double T216_lc2_m, T216_lc2_C, T216_lc2_borderX, T216_lc2_borderY;

	int T216_lc3_horizontal, T216_lc3_vertical, T216_lc3_leftOrAbove, T216_lc3_cached;
	double T216_lc3_m, T216_lc3_C, T216_lc3_borderX, T216_lc3_borderY;

	int T216_lc1_lastY = Integer.MIN_VALUE, T216_lc2_lastY = Integer.MIN_VALUE, T216_lc3_lastY = Integer.MIN_VALUE;
	int T216_r, T216_g, T216_b;

	int T217_initializedWithValidData = false, T217_okay = false;
	double T217_sx, T217_sy, T217_minx, T217_miny, T217_maxx, T217_maxy;

	int T217_lc1_horizontal, T217_lc1_vertical, T217_lc1_leftOrAbove, T217_lc1_cached;
	double T217_lc1_m, T217_lc1_C, T217_lc1_borderX, T217_lc1_borderY;

	int T217_lc2_horizontal, T217_lc2_vertical, T217_lc2_leftOrAbove, T217_lc2_cached;
	double T217_lc2_m, T217_lc2_C, T217_lc2_borderX, T217_lc2_borderY;

	int T217_lc3_horizontal, T217_lc3_vertical, T217_lc3_leftOrAbove, T217_lc3_cached;
	double T217_lc3_m, T217_lc3_C, T217_lc3_borderX, T217_lc3_borderY;

	int T217_lc1_lastY = Integer.MIN_VALUE, T217_lc2_lastY = Integer.MIN_VALUE, T217_lc3_lastY = Integer.MIN_VALUE;
	int T217_r, T217_g, T217_b;

	int T218_initializedWithValidData = false, T218_okay = false;
	double T218_sx, T218_sy, T218_minx, T218_miny, T218_maxx, T218_maxy;

	int T218_lc1_horizontal, T218_lc1_vertical, T218_lc1_leftOrAbove, T218_lc1_cached;
	double T218_lc1_m, T218_lc1_C, T218_lc1_borderX, T218_lc1_borderY;

	int T218_lc2_horizontal, T218_lc2_vertical, T218_lc2_leftOrAbove, T218_lc2_cached;
	double T218_lc2_m, T218_lc2_C, T218_lc2_borderX, T218_lc2_borderY;

	int T218_lc3_horizontal, T218_lc3_vertical, T218_lc3_leftOrAbove, T218_lc3_cached;
	double T218_lc3_m, T218_lc3_C, T218_lc3_borderX, T218_lc3_borderY;

	int T218_lc1_lastY = Integer.MIN_VALUE, T218_lc2_lastY = Integer.MIN_VALUE, T218_lc3_lastY = Integer.MIN_VALUE;
	int T218_r, T218_g, T218_b;

	int T219_initializedWithValidData = false, T219_okay = false;
	double T219_sx, T219_sy, T219_minx, T219_miny, T219_maxx, T219_maxy;

	int T219_lc1_horizontal, T219_lc1_vertical, T219_lc1_leftOrAbove, T219_lc1_cached;
	double T219_lc1_m, T219_lc1_C, T219_lc1_borderX, T219_lc1_borderY;

	int T219_lc2_horizontal, T219_lc2_vertical, T219_lc2_leftOrAbove, T219_lc2_cached;
	double T219_lc2_m, T219_lc2_C, T219_lc2_borderX, T219_lc2_borderY;

	int T219_lc3_horizontal, T219_lc3_vertical, T219_lc3_leftOrAbove, T219_lc3_cached;
	double T219_lc3_m, T219_lc3_C, T219_lc3_borderX, T219_lc3_borderY;

	int T219_lc1_lastY = Integer.MIN_VALUE, T219_lc2_lastY = Integer.MIN_VALUE, T219_lc3_lastY = Integer.MIN_VALUE;
	int T219_r, T219_g, T219_b;

	int T220_initializedWithValidData = false, T220_okay = false;
	double T220_sx, T220_sy, T220_minx, T220_miny, T220_maxx, T220_maxy;

	int T220_lc1_horizontal, T220_lc1_vertical, T220_lc1_leftOrAbove, T220_lc1_cached;
	double T220_lc1_m, T220_lc1_C, T220_lc1_borderX, T220_lc1_borderY;

	int T220_lc2_horizontal, T220_lc2_vertical, T220_lc2_leftOrAbove, T220_lc2_cached;
	double T220_lc2_m, T220_lc2_C, T220_lc2_borderX, T220_lc2_borderY;

	int T220_lc3_horizontal, T220_lc3_vertical, T220_lc3_leftOrAbove, T220_lc3_cached;
	double T220_lc3_m, T220_lc3_C, T220_lc3_borderX, T220_lc3_borderY;

	int T220_lc1_lastY = Integer.MIN_VALUE, T220_lc2_lastY = Integer.MIN_VALUE, T220_lc3_lastY = Integer.MIN_VALUE;
	int T220_r, T220_g, T220_b;

	int T221_initializedWithValidData = false, T221_okay = false;
	double T221_sx, T221_sy, T221_minx, T221_miny, T221_maxx, T221_maxy;

	int T221_lc1_horizontal, T221_lc1_vertical, T221_lc1_leftOrAbove, T221_lc1_cached;
	double T221_lc1_m, T221_lc1_C, T221_lc1_borderX, T221_lc1_borderY;

	int T221_lc2_horizontal, T221_lc2_vertical, T221_lc2_leftOrAbove, T221_lc2_cached;
	double T221_lc2_m, T221_lc2_C, T221_lc2_borderX, T221_lc2_borderY;

	int T221_lc3_horizontal, T221_lc3_vertical, T221_lc3_leftOrAbove, T221_lc3_cached;
	double T221_lc3_m, T221_lc3_C, T221_lc3_borderX, T221_lc3_borderY;

	int T221_lc1_lastY = Integer.MIN_VALUE, T221_lc2_lastY = Integer.MIN_VALUE, T221_lc3_lastY = Integer.MIN_VALUE;
	int T221_r, T221_g, T221_b;

	int T222_initializedWithValidData = false, T222_okay = false;
	double T222_sx, T222_sy, T222_minx, T222_miny, T222_maxx, T222_maxy;

	int T222_lc1_horizontal, T222_lc1_vertical, T222_lc1_leftOrAbove, T222_lc1_cached;
	double T222_lc1_m, T222_lc1_C, T222_lc1_borderX, T222_lc1_borderY;

	int T222_lc2_horizontal, T222_lc2_vertical, T222_lc2_leftOrAbove, T222_lc2_cached;
	double T222_lc2_m, T222_lc2_C, T222_lc2_borderX, T222_lc2_borderY;

	int T222_lc3_horizontal, T222_lc3_vertical, T222_lc3_leftOrAbove, T222_lc3_cached;
	double T222_lc3_m, T222_lc3_C, T222_lc3_borderX, T222_lc3_borderY;

	int T222_lc1_lastY = Integer.MIN_VALUE, T222_lc2_lastY = Integer.MIN_VALUE, T222_lc3_lastY = Integer.MIN_VALUE;
	int T222_r, T222_g, T222_b;

	int T223_initializedWithValidData = false, T223_okay = false;
	double T223_sx, T223_sy, T223_minx, T223_miny, T223_maxx, T223_maxy;

	int T223_lc1_horizontal, T223_lc1_vertical, T223_lc1_leftOrAbove, T223_lc1_cached;
	double T223_lc1_m, T223_lc1_C, T223_lc1_borderX, T223_lc1_borderY;

	int T223_lc2_horizontal, T223_lc2_vertical, T223_lc2_leftOrAbove, T223_lc2_cached;
	double T223_lc2_m, T223_lc2_C, T223_lc2_borderX, T223_lc2_borderY;

	int T223_lc3_horizontal, T223_lc3_vertical, T223_lc3_leftOrAbove, T223_lc3_cached;
	double T223_lc3_m, T223_lc3_C, T223_lc3_borderX, T223_lc3_borderY;

	int T223_lc1_lastY = Integer.MIN_VALUE, T223_lc2_lastY = Integer.MIN_VALUE, T223_lc3_lastY = Integer.MIN_VALUE;
	int T223_r, T223_g, T223_b;

	int T224_initializedWithValidData = false, T224_okay = false;
	double T224_sx, T224_sy, T224_minx, T224_miny, T224_maxx, T224_maxy;

	int T224_lc1_horizontal, T224_lc1_vertical, T224_lc1_leftOrAbove, T224_lc1_cached;
	double T224_lc1_m, T224_lc1_C, T224_lc1_borderX, T224_lc1_borderY;

	int T224_lc2_horizontal, T224_lc2_vertical, T224_lc2_leftOrAbove, T224_lc2_cached;
	double T224_lc2_m, T224_lc2_C, T224_lc2_borderX, T224_lc2_borderY;

	int T224_lc3_horizontal, T224_lc3_vertical, T224_lc3_leftOrAbove, T224_lc3_cached;
	double T224_lc3_m, T224_lc3_C, T224_lc3_borderX, T224_lc3_borderY;

	int T224_lc1_lastY = Integer.MIN_VALUE, T224_lc2_lastY = Integer.MIN_VALUE, T224_lc3_lastY = Integer.MIN_VALUE;
	int T224_r, T224_g, T224_b;

	int T225_initializedWithValidData = false, T225_okay = false;
	double T225_sx, T225_sy, T225_minx, T225_miny, T225_maxx, T225_maxy;

	int T225_lc1_horizontal, T225_lc1_vertical, T225_lc1_leftOrAbove, T225_lc1_cached;
	double T225_lc1_m, T225_lc1_C, T225_lc1_borderX, T225_lc1_borderY;

	int T225_lc2_horizontal, T225_lc2_vertical, T225_lc2_leftOrAbove, T225_lc2_cached;
	double T225_lc2_m, T225_lc2_C, T225_lc2_borderX, T225_lc2_borderY;

	int T225_lc3_horizontal, T225_lc3_vertical, T225_lc3_leftOrAbove, T225_lc3_cached;
	double T225_lc3_m, T225_lc3_C, T225_lc3_borderX, T225_lc3_borderY;

	int T225_lc1_lastY = Integer.MIN_VALUE, T225_lc2_lastY = Integer.MIN_VALUE, T225_lc3_lastY = Integer.MIN_VALUE;
	int T225_r, T225_g, T225_b;

	int T226_initializedWithValidData = false, T226_okay = false;
	double T226_sx, T226_sy, T226_minx, T226_miny, T226_maxx, T226_maxy;

	int T226_lc1_horizontal, T226_lc1_vertical, T226_lc1_leftOrAbove, T226_lc1_cached;
	double T226_lc1_m, T226_lc1_C, T226_lc1_borderX, T226_lc1_borderY;

	int T226_lc2_horizontal, T226_lc2_vertical, T226_lc2_leftOrAbove, T226_lc2_cached;
	double T226_lc2_m, T226_lc2_C, T226_lc2_borderX, T226_lc2_borderY;

	int T226_lc3_horizontal, T226_lc3_vertical, T226_lc3_leftOrAbove, T226_lc3_cached;
	double T226_lc3_m, T226_lc3_C, T226_lc3_borderX, T226_lc3_borderY;

	int T226_lc1_lastY = Integer.MIN_VALUE, T226_lc2_lastY = Integer.MIN_VALUE, T226_lc3_lastY = Integer.MIN_VALUE;
	int T226_r, T226_g, T226_b;

	int T227_initializedWithValidData = false, T227_okay = false;
	double T227_sx, T227_sy, T227_minx, T227_miny, T227_maxx, T227_maxy;

	int T227_lc1_horizontal, T227_lc1_vertical, T227_lc1_leftOrAbove, T227_lc1_cached;
	double T227_lc1_m, T227_lc1_C, T227_lc1_borderX, T227_lc1_borderY;

	int T227_lc2_horizontal, T227_lc2_vertical, T227_lc2_leftOrAbove, T227_lc2_cached;
	double T227_lc2_m, T227_lc2_C, T227_lc2_borderX, T227_lc2_borderY;

	int T227_lc3_horizontal, T227_lc3_vertical, T227_lc3_leftOrAbove, T227_lc3_cached;
	double T227_lc3_m, T227_lc3_C, T227_lc3_borderX, T227_lc3_borderY;

	int T227_lc1_lastY = Integer.MIN_VALUE, T227_lc2_lastY = Integer.MIN_VALUE, T227_lc3_lastY = Integer.MIN_VALUE;
	int T227_r, T227_g, T227_b;

	int T228_initializedWithValidData = false, T228_okay = false;
	double T228_sx, T228_sy, T228_minx, T228_miny, T228_maxx, T228_maxy;

	int T228_lc1_horizontal, T228_lc1_vertical, T228_lc1_leftOrAbove, T228_lc1_cached;
	double T228_lc1_m, T228_lc1_C, T228_lc1_borderX, T228_lc1_borderY;

	int T228_lc2_horizontal, T228_lc2_vertical, T228_lc2_leftOrAbove, T228_lc2_cached;
	double T228_lc2_m, T228_lc2_C, T228_lc2_borderX, T228_lc2_borderY;

	int T228_lc3_horizontal, T228_lc3_vertical, T228_lc3_leftOrAbove, T228_lc3_cached;
	double T228_lc3_m, T228_lc3_C, T228_lc3_borderX, T228_lc3_borderY;

	int T228_lc1_lastY = Integer.MIN_VALUE, T228_lc2_lastY = Integer.MIN_VALUE, T228_lc3_lastY = Integer.MIN_VALUE;
	int T228_r, T228_g, T228_b;

	int T229_initializedWithValidData = false, T229_okay = false;
	double T229_sx, T229_sy, T229_minx, T229_miny, T229_maxx, T229_maxy;

	int T229_lc1_horizontal, T229_lc1_vertical, T229_lc1_leftOrAbove, T229_lc1_cached;
	double T229_lc1_m, T229_lc1_C, T229_lc1_borderX, T229_lc1_borderY;

	int T229_lc2_horizontal, T229_lc2_vertical, T229_lc2_leftOrAbove, T229_lc2_cached;
	double T229_lc2_m, T229_lc2_C, T229_lc2_borderX, T229_lc2_borderY;

	int T229_lc3_horizontal, T229_lc3_vertical, T229_lc3_leftOrAbove, T229_lc3_cached;
	double T229_lc3_m, T229_lc3_C, T229_lc3_borderX, T229_lc3_borderY;

	int T229_lc1_lastY = Integer.MIN_VALUE, T229_lc2_lastY = Integer.MIN_VALUE, T229_lc3_lastY = Integer.MIN_VALUE;
	int T229_r, T229_g, T229_b;

	int T230_initializedWithValidData = false, T230_okay = false;
	double T230_sx, T230_sy, T230_minx, T230_miny, T230_maxx, T230_maxy;

	int T230_lc1_horizontal, T230_lc1_vertical, T230_lc1_leftOrAbove, T230_lc1_cached;
	double T230_lc1_m, T230_lc1_C, T230_lc1_borderX, T230_lc1_borderY;

	int T230_lc2_horizontal, T230_lc2_vertical, T230_lc2_leftOrAbove, T230_lc2_cached;
	double T230_lc2_m, T230_lc2_C, T230_lc2_borderX, T230_lc2_borderY;

	int T230_lc3_horizontal, T230_lc3_vertical, T230_lc3_leftOrAbove, T230_lc3_cached;
	double T230_lc3_m, T230_lc3_C, T230_lc3_borderX, T230_lc3_borderY;

	int T230_lc1_lastY = Integer.MIN_VALUE, T230_lc2_lastY = Integer.MIN_VALUE, T230_lc3_lastY = Integer.MIN_VALUE;
	int T230_r, T230_g, T230_b;

	int T231_initializedWithValidData = false, T231_okay = false;
	double T231_sx, T231_sy, T231_minx, T231_miny, T231_maxx, T231_maxy;

	int T231_lc1_horizontal, T231_lc1_vertical, T231_lc1_leftOrAbove, T231_lc1_cached;
	double T231_lc1_m, T231_lc1_C, T231_lc1_borderX, T231_lc1_borderY;

	int T231_lc2_horizontal, T231_lc2_vertical, T231_lc2_leftOrAbove, T231_lc2_cached;
	double T231_lc2_m, T231_lc2_C, T231_lc2_borderX, T231_lc2_borderY;

	int T231_lc3_horizontal, T231_lc3_vertical, T231_lc3_leftOrAbove, T231_lc3_cached;
	double T231_lc3_m, T231_lc3_C, T231_lc3_borderX, T231_lc3_borderY;

	int T231_lc1_lastY = Integer.MIN_VALUE, T231_lc2_lastY = Integer.MIN_VALUE, T231_lc3_lastY = Integer.MIN_VALUE;
	int T231_r, T231_g, T231_b;

	int T232_initializedWithValidData = false, T232_okay = false;
	double T232_sx, T232_sy, T232_minx, T232_miny, T232_maxx, T232_maxy;

	int T232_lc1_horizontal, T232_lc1_vertical, T232_lc1_leftOrAbove, T232_lc1_cached;
	double T232_lc1_m, T232_lc1_C, T232_lc1_borderX, T232_lc1_borderY;

	int T232_lc2_horizontal, T232_lc2_vertical, T232_lc2_leftOrAbove, T232_lc2_cached;
	double T232_lc2_m, T232_lc2_C, T232_lc2_borderX, T232_lc2_borderY;

	int T232_lc3_horizontal, T232_lc3_vertical, T232_lc3_leftOrAbove, T232_lc3_cached;
	double T232_lc3_m, T232_lc3_C, T232_lc3_borderX, T232_lc3_borderY;

	int T232_lc1_lastY = Integer.MIN_VALUE, T232_lc2_lastY = Integer.MIN_VALUE, T232_lc3_lastY = Integer.MIN_VALUE;
	int T232_r, T232_g, T232_b;

	int T233_initializedWithValidData = false, T233_okay = false;
	double T233_sx, T233_sy, T233_minx, T233_miny, T233_maxx, T233_maxy;

	int T233_lc1_horizontal, T233_lc1_vertical, T233_lc1_leftOrAbove, T233_lc1_cached;
	double T233_lc1_m, T233_lc1_C, T233_lc1_borderX, T233_lc1_borderY;

	int T233_lc2_horizontal, T233_lc2_vertical, T233_lc2_leftOrAbove, T233_lc2_cached;
	double T233_lc2_m, T233_lc2_C, T233_lc2_borderX, T233_lc2_borderY;

	int T233_lc3_horizontal, T233_lc3_vertical, T233_lc3_leftOrAbove, T233_lc3_cached;
	double T233_lc3_m, T233_lc3_C, T233_lc3_borderX, T233_lc3_borderY;

	int T233_lc1_lastY = Integer.MIN_VALUE, T233_lc2_lastY = Integer.MIN_VALUE, T233_lc3_lastY = Integer.MIN_VALUE;
	int T233_r, T233_g, T233_b;

	int T234_initializedWithValidData = false, T234_okay = false;
	double T234_sx, T234_sy, T234_minx, T234_miny, T234_maxx, T234_maxy;

	int T234_lc1_horizontal, T234_lc1_vertical, T234_lc1_leftOrAbove, T234_lc1_cached;
	double T234_lc1_m, T234_lc1_C, T234_lc1_borderX, T234_lc1_borderY;

	int T234_lc2_horizontal, T234_lc2_vertical, T234_lc2_leftOrAbove, T234_lc2_cached;
	double T234_lc2_m, T234_lc2_C, T234_lc2_borderX, T234_lc2_borderY;

	int T234_lc3_horizontal, T234_lc3_vertical, T234_lc3_leftOrAbove, T234_lc3_cached;
	double T234_lc3_m, T234_lc3_C, T234_lc3_borderX, T234_lc3_borderY;

	int T234_lc1_lastY = Integer.MIN_VALUE, T234_lc2_lastY = Integer.MIN_VALUE, T234_lc3_lastY = Integer.MIN_VALUE;
	int T234_r, T234_g, T234_b;

	int T235_initializedWithValidData = false, T235_okay = false;
	double T235_sx, T235_sy, T235_minx, T235_miny, T235_maxx, T235_maxy;

	int T235_lc1_horizontal, T235_lc1_vertical, T235_lc1_leftOrAbove, T235_lc1_cached;
	double T235_lc1_m, T235_lc1_C, T235_lc1_borderX, T235_lc1_borderY;

	int T235_lc2_horizontal, T235_lc2_vertical, T235_lc2_leftOrAbove, T235_lc2_cached;
	double T235_lc2_m, T235_lc2_C, T235_lc2_borderX, T235_lc2_borderY;

	int T235_lc3_horizontal, T235_lc3_vertical, T235_lc3_leftOrAbove, T235_lc3_cached;
	double T235_lc3_m, T235_lc3_C, T235_lc3_borderX, T235_lc3_borderY;

	int T235_lc1_lastY = Integer.MIN_VALUE, T235_lc2_lastY = Integer.MIN_VALUE, T235_lc3_lastY = Integer.MIN_VALUE;
	int T235_r, T235_g, T235_b;

	int T236_initializedWithValidData = false, T236_okay = false;
	double T236_sx, T236_sy, T236_minx, T236_miny, T236_maxx, T236_maxy;

	int T236_lc1_horizontal, T236_lc1_vertical, T236_lc1_leftOrAbove, T236_lc1_cached;
	double T236_lc1_m, T236_lc1_C, T236_lc1_borderX, T236_lc1_borderY;

	int T236_lc2_horizontal, T236_lc2_vertical, T236_lc2_leftOrAbove, T236_lc2_cached;
	double T236_lc2_m, T236_lc2_C, T236_lc2_borderX, T236_lc2_borderY;

	int T236_lc3_horizontal, T236_lc3_vertical, T236_lc3_leftOrAbove, T236_lc3_cached;
	double T236_lc3_m, T236_lc3_C, T236_lc3_borderX, T236_lc3_borderY;

	int T236_lc1_lastY = Integer.MIN_VALUE, T236_lc2_lastY = Integer.MIN_VALUE, T236_lc3_lastY = Integer.MIN_VALUE;
	int T236_r, T236_g, T236_b;

	int T237_initializedWithValidData = false, T237_okay = false;
	double T237_sx, T237_sy, T237_minx, T237_miny, T237_maxx, T237_maxy;

	int T237_lc1_horizontal, T237_lc1_vertical, T237_lc1_leftOrAbove, T237_lc1_cached;
	double T237_lc1_m, T237_lc1_C, T237_lc1_borderX, T237_lc1_borderY;

	int T237_lc2_horizontal, T237_lc2_vertical, T237_lc2_leftOrAbove, T237_lc2_cached;
	double T237_lc2_m, T237_lc2_C, T237_lc2_borderX, T237_lc2_borderY;

	int T237_lc3_horizontal, T237_lc3_vertical, T237_lc3_leftOrAbove, T237_lc3_cached;
	double T237_lc3_m, T237_lc3_C, T237_lc3_borderX, T237_lc3_borderY;

	int T237_lc1_lastY = Integer.MIN_VALUE, T237_lc2_lastY = Integer.MIN_VALUE, T237_lc3_lastY = Integer.MIN_VALUE;
	int T237_r, T237_g, T237_b;

	int T238_initializedWithValidData = false, T238_okay = false;
	double T238_sx, T238_sy, T238_minx, T238_miny, T238_maxx, T238_maxy;

	int T238_lc1_horizontal, T238_lc1_vertical, T238_lc1_leftOrAbove, T238_lc1_cached;
	double T238_lc1_m, T238_lc1_C, T238_lc1_borderX, T238_lc1_borderY;

	int T238_lc2_horizontal, T238_lc2_vertical, T238_lc2_leftOrAbove, T238_lc2_cached;
	double T238_lc2_m, T238_lc2_C, T238_lc2_borderX, T238_lc2_borderY;

	int T238_lc3_horizontal, T238_lc3_vertical, T238_lc3_leftOrAbove, T238_lc3_cached;
	double T238_lc3_m, T238_lc3_C, T238_lc3_borderX, T238_lc3_borderY;

	int T238_lc1_lastY = Integer.MIN_VALUE, T238_lc2_lastY = Integer.MIN_VALUE, T238_lc3_lastY = Integer.MIN_VALUE;
	int T238_r, T238_g, T238_b;

	int T239_initializedWithValidData = false, T239_okay = false;
	double T239_sx, T239_sy, T239_minx, T239_miny, T239_maxx, T239_maxy;

	int T239_lc1_horizontal, T239_lc1_vertical, T239_lc1_leftOrAbove, T239_lc1_cached;
	double T239_lc1_m, T239_lc1_C, T239_lc1_borderX, T239_lc1_borderY;

	int T239_lc2_horizontal, T239_lc2_vertical, T239_lc2_leftOrAbove, T239_lc2_cached;
	double T239_lc2_m, T239_lc2_C, T239_lc2_borderX, T239_lc2_borderY;

	int T239_lc3_horizontal, T239_lc3_vertical, T239_lc3_leftOrAbove, T239_lc3_cached;
	double T239_lc3_m, T239_lc3_C, T239_lc3_borderX, T239_lc3_borderY;

	int T239_lc1_lastY = Integer.MIN_VALUE, T239_lc2_lastY = Integer.MIN_VALUE, T239_lc3_lastY = Integer.MIN_VALUE;
	int T239_r, T239_g, T239_b;

	int T240_initializedWithValidData = false, T240_okay = false;
	double T240_sx, T240_sy, T240_minx, T240_miny, T240_maxx, T240_maxy;

	int T240_lc1_horizontal, T240_lc1_vertical, T240_lc1_leftOrAbove, T240_lc1_cached;
	double T240_lc1_m, T240_lc1_C, T240_lc1_borderX, T240_lc1_borderY;

	int T240_lc2_horizontal, T240_lc2_vertical, T240_lc2_leftOrAbove, T240_lc2_cached;
	double T240_lc2_m, T240_lc2_C, T240_lc2_borderX, T240_lc2_borderY;

	int T240_lc3_horizontal, T240_lc3_vertical, T240_lc3_leftOrAbove, T240_lc3_cached;
	double T240_lc3_m, T240_lc3_C, T240_lc3_borderX, T240_lc3_borderY;

	int T240_lc1_lastY = Integer.MIN_VALUE, T240_lc2_lastY = Integer.MIN_VALUE, T240_lc3_lastY = Integer.MIN_VALUE;
	int T240_r, T240_g, T240_b;

	int T241_initializedWithValidData = false, T241_okay = false;
	double T241_sx, T241_sy, T241_minx, T241_miny, T241_maxx, T241_maxy;

	int T241_lc1_horizontal, T241_lc1_vertical, T241_lc1_leftOrAbove, T241_lc1_cached;
	double T241_lc1_m, T241_lc1_C, T241_lc1_borderX, T241_lc1_borderY;

	int T241_lc2_horizontal, T241_lc2_vertical, T241_lc2_leftOrAbove, T241_lc2_cached;
	double T241_lc2_m, T241_lc2_C, T241_lc2_borderX, T241_lc2_borderY;

	int T241_lc3_horizontal, T241_lc3_vertical, T241_lc3_leftOrAbove, T241_lc3_cached;
	double T241_lc3_m, T241_lc3_C, T241_lc3_borderX, T241_lc3_borderY;

	int T241_lc1_lastY = Integer.MIN_VALUE, T241_lc2_lastY = Integer.MIN_VALUE, T241_lc3_lastY = Integer.MIN_VALUE;
	int T241_r, T241_g, T241_b;

	int T242_initializedWithValidData = false, T242_okay = false;
	double T242_sx, T242_sy, T242_minx, T242_miny, T242_maxx, T242_maxy;

	int T242_lc1_horizontal, T242_lc1_vertical, T242_lc1_leftOrAbove, T242_lc1_cached;
	double T242_lc1_m, T242_lc1_C, T242_lc1_borderX, T242_lc1_borderY;

	int T242_lc2_horizontal, T242_lc2_vertical, T242_lc2_leftOrAbove, T242_lc2_cached;
	double T242_lc2_m, T242_lc2_C, T242_lc2_borderX, T242_lc2_borderY;

	int T242_lc3_horizontal, T242_lc3_vertical, T242_lc3_leftOrAbove, T242_lc3_cached;
	double T242_lc3_m, T242_lc3_C, T242_lc3_borderX, T242_lc3_borderY;

	int T242_lc1_lastY = Integer.MIN_VALUE, T242_lc2_lastY = Integer.MIN_VALUE, T242_lc3_lastY = Integer.MIN_VALUE;
	int T242_r, T242_g, T242_b;

	int T243_initializedWithValidData = false, T243_okay = false;
	double T243_sx, T243_sy, T243_minx, T243_miny, T243_maxx, T243_maxy;

	int T243_lc1_horizontal, T243_lc1_vertical, T243_lc1_leftOrAbove, T243_lc1_cached;
	double T243_lc1_m, T243_lc1_C, T243_lc1_borderX, T243_lc1_borderY;

	int T243_lc2_horizontal, T243_lc2_vertical, T243_lc2_leftOrAbove, T243_lc2_cached;
	double T243_lc2_m, T243_lc2_C, T243_lc2_borderX, T243_lc2_borderY;

	int T243_lc3_horizontal, T243_lc3_vertical, T243_lc3_leftOrAbove, T243_lc3_cached;
	double T243_lc3_m, T243_lc3_C, T243_lc3_borderX, T243_lc3_borderY;

	int T243_lc1_lastY = Integer.MIN_VALUE, T243_lc2_lastY = Integer.MIN_VALUE, T243_lc3_lastY = Integer.MIN_VALUE;
	int T243_r, T243_g, T243_b;

	int T244_initializedWithValidData = false, T244_okay = false;
	double T244_sx, T244_sy, T244_minx, T244_miny, T244_maxx, T244_maxy;

	int T244_lc1_horizontal, T244_lc1_vertical, T244_lc1_leftOrAbove, T244_lc1_cached;
	double T244_lc1_m, T244_lc1_C, T244_lc1_borderX, T244_lc1_borderY;

	int T244_lc2_horizontal, T244_lc2_vertical, T244_lc2_leftOrAbove, T244_lc2_cached;
	double T244_lc2_m, T244_lc2_C, T244_lc2_borderX, T244_lc2_borderY;

	int T244_lc3_horizontal, T244_lc3_vertical, T244_lc3_leftOrAbove, T244_lc3_cached;
	double T244_lc3_m, T244_lc3_C, T244_lc3_borderX, T244_lc3_borderY;

	int T244_lc1_lastY = Integer.MIN_VALUE, T244_lc2_lastY = Integer.MIN_VALUE, T244_lc3_lastY = Integer.MIN_VALUE;
	int T244_r, T244_g, T244_b;

	int T245_initializedWithValidData = false, T245_okay = false;
	double T245_sx, T245_sy, T245_minx, T245_miny, T245_maxx, T245_maxy;

	int T245_lc1_horizontal, T245_lc1_vertical, T245_lc1_leftOrAbove, T245_lc1_cached;
	double T245_lc1_m, T245_lc1_C, T245_lc1_borderX, T245_lc1_borderY;

	int T245_lc2_horizontal, T245_lc2_vertical, T245_lc2_leftOrAbove, T245_lc2_cached;
	double T245_lc2_m, T245_lc2_C, T245_lc2_borderX, T245_lc2_borderY;

	int T245_lc3_horizontal, T245_lc3_vertical, T245_lc3_leftOrAbove, T245_lc3_cached;
	double T245_lc3_m, T245_lc3_C, T245_lc3_borderX, T245_lc3_borderY;

	int T245_lc1_lastY = Integer.MIN_VALUE, T245_lc2_lastY = Integer.MIN_VALUE, T245_lc3_lastY = Integer.MIN_VALUE;
	int T245_r, T245_g, T245_b;

	int T246_initializedWithValidData = false, T246_okay = false;
	double T246_sx, T246_sy, T246_minx, T246_miny, T246_maxx, T246_maxy;

	int T246_lc1_horizontal, T246_lc1_vertical, T246_lc1_leftOrAbove, T246_lc1_cached;
	double T246_lc1_m, T246_lc1_C, T246_lc1_borderX, T246_lc1_borderY;

	int T246_lc2_horizontal, T246_lc2_vertical, T246_lc2_leftOrAbove, T246_lc2_cached;
	double T246_lc2_m, T246_lc2_C, T246_lc2_borderX, T246_lc2_borderY;

	int T246_lc3_horizontal, T246_lc3_vertical, T246_lc3_leftOrAbove, T246_lc3_cached;
	double T246_lc3_m, T246_lc3_C, T246_lc3_borderX, T246_lc3_borderY;

	int T246_lc1_lastY = Integer.MIN_VALUE, T246_lc2_lastY = Integer.MIN_VALUE, T246_lc3_lastY = Integer.MIN_VALUE;
	int T246_r, T246_g, T246_b;

	int T247_initializedWithValidData = false, T247_okay = false;
	double T247_sx, T247_sy, T247_minx, T247_miny, T247_maxx, T247_maxy;

	int T247_lc1_horizontal, T247_lc1_vertical, T247_lc1_leftOrAbove, T247_lc1_cached;
	double T247_lc1_m, T247_lc1_C, T247_lc1_borderX, T247_lc1_borderY;

	int T247_lc2_horizontal, T247_lc2_vertical, T247_lc2_leftOrAbove, T247_lc2_cached;
	double T247_lc2_m, T247_lc2_C, T247_lc2_borderX, T247_lc2_borderY;

	int T247_lc3_horizontal, T247_lc3_vertical, T247_lc3_leftOrAbove, T247_lc3_cached;
	double T247_lc3_m, T247_lc3_C, T247_lc3_borderX, T247_lc3_borderY;

	int T247_lc1_lastY = Integer.MIN_VALUE, T247_lc2_lastY = Integer.MIN_VALUE, T247_lc3_lastY = Integer.MIN_VALUE;
	int T247_r, T247_g, T247_b;

	int T248_initializedWithValidData = false, T248_okay = false;
	double T248_sx, T248_sy, T248_minx, T248_miny, T248_maxx, T248_maxy;

	int T248_lc1_horizontal, T248_lc1_vertical, T248_lc1_leftOrAbove, T248_lc1_cached;
	double T248_lc1_m, T248_lc1_C, T248_lc1_borderX, T248_lc1_borderY;

	int T248_lc2_horizontal, T248_lc2_vertical, T248_lc2_leftOrAbove, T248_lc2_cached;
	double T248_lc2_m, T248_lc2_C, T248_lc2_borderX, T248_lc2_borderY;

	int T248_lc3_horizontal, T248_lc3_vertical, T248_lc3_leftOrAbove, T248_lc3_cached;
	double T248_lc3_m, T248_lc3_C, T248_lc3_borderX, T248_lc3_borderY;

	int T248_lc1_lastY = Integer.MIN_VALUE, T248_lc2_lastY = Integer.MIN_VALUE, T248_lc3_lastY = Integer.MIN_VALUE;
	int T248_r, T248_g, T248_b;

	int T249_initializedWithValidData = false, T249_okay = false;
	double T249_sx, T249_sy, T249_minx, T249_miny, T249_maxx, T249_maxy;

	int T249_lc1_horizontal, T249_lc1_vertical, T249_lc1_leftOrAbove, T249_lc1_cached;
	double T249_lc1_m, T249_lc1_C, T249_lc1_borderX, T249_lc1_borderY;

	int T249_lc2_horizontal, T249_lc2_vertical, T249_lc2_leftOrAbove, T249_lc2_cached;
	double T249_lc2_m, T249_lc2_C, T249_lc2_borderX, T249_lc2_borderY;

	int T249_lc3_horizontal, T249_lc3_vertical, T249_lc3_leftOrAbove, T249_lc3_cached;
	double T249_lc3_m, T249_lc3_C, T249_lc3_borderX, T249_lc3_borderY;

	int T249_lc1_lastY = Integer.MIN_VALUE, T249_lc2_lastY = Integer.MIN_VALUE, T249_lc3_lastY = Integer.MIN_VALUE;
	int T249_r, T249_g, T249_b;

	int T250_initializedWithValidData = false, T250_okay = false;
	double T250_sx, T250_sy, T250_minx, T250_miny, T250_maxx, T250_maxy;

	int T250_lc1_horizontal, T250_lc1_vertical, T250_lc1_leftOrAbove, T250_lc1_cached;
	double T250_lc1_m, T250_lc1_C, T250_lc1_borderX, T250_lc1_borderY;

	int T250_lc2_horizontal, T250_lc2_vertical, T250_lc2_leftOrAbove, T250_lc2_cached;
	double T250_lc2_m, T250_lc2_C, T250_lc2_borderX, T250_lc2_borderY;

	int T250_lc3_horizontal, T250_lc3_vertical, T250_lc3_leftOrAbove, T250_lc3_cached;
	double T250_lc3_m, T250_lc3_C, T250_lc3_borderX, T250_lc3_borderY;

	int T250_lc1_lastY = Integer.MIN_VALUE, T250_lc2_lastY = Integer.MIN_VALUE, T250_lc3_lastY = Integer.MIN_VALUE;
	int T250_r, T250_g, T250_b;

	int T251_initializedWithValidData = false, T251_okay = false;
	double T251_sx, T251_sy, T251_minx, T251_miny, T251_maxx, T251_maxy;

	int T251_lc1_horizontal, T251_lc1_vertical, T251_lc1_leftOrAbove, T251_lc1_cached;
	double T251_lc1_m, T251_lc1_C, T251_lc1_borderX, T251_lc1_borderY;

	int T251_lc2_horizontal, T251_lc2_vertical, T251_lc2_leftOrAbove, T251_lc2_cached;
	double T251_lc2_m, T251_lc2_C, T251_lc2_borderX, T251_lc2_borderY;

	int T251_lc3_horizontal, T251_lc3_vertical, T251_lc3_leftOrAbove, T251_lc3_cached;
	double T251_lc3_m, T251_lc3_C, T251_lc3_borderX, T251_lc3_borderY;

	int T251_lc1_lastY = Integer.MIN_VALUE, T251_lc2_lastY = Integer.MIN_VALUE, T251_lc3_lastY = Integer.MIN_VALUE;
	int T251_r, T251_g, T251_b;

	int T252_initializedWithValidData = false, T252_okay = false;
	double T252_sx, T252_sy, T252_minx, T252_miny, T252_maxx, T252_maxy;

	int T252_lc1_horizontal, T252_lc1_vertical, T252_lc1_leftOrAbove, T252_lc1_cached;
	double T252_lc1_m, T252_lc1_C, T252_lc1_borderX, T252_lc1_borderY;

	int T252_lc2_horizontal, T252_lc2_vertical, T252_lc2_leftOrAbove, T252_lc2_cached;
	double T252_lc2_m, T252_lc2_C, T252_lc2_borderX, T252_lc2_borderY;

	int T252_lc3_horizontal, T252_lc3_vertical, T252_lc3_leftOrAbove, T252_lc3_cached;
	double T252_lc3_m, T252_lc3_C, T252_lc3_borderX, T252_lc3_borderY;

	int T252_lc1_lastY = Integer.MIN_VALUE, T252_lc2_lastY = Integer.MIN_VALUE, T252_lc3_lastY = Integer.MIN_VALUE;
	int T252_r, T252_g, T252_b;

	int T253_initializedWithValidData = false, T253_okay = false;
	double T253_sx, T253_sy, T253_minx, T253_miny, T253_maxx, T253_maxy;

	int T253_lc1_horizontal, T253_lc1_vertical, T253_lc1_leftOrAbove, T253_lc1_cached;
	double T253_lc1_m, T253_lc1_C, T253_lc1_borderX, T253_lc1_borderY;

	int T253_lc2_horizontal, T253_lc2_vertical, T253_lc2_leftOrAbove, T253_lc2_cached;
	double T253_lc2_m, T253_lc2_C, T253_lc2_borderX, T253_lc2_borderY;

	int T253_lc3_horizontal, T253_lc3_vertical, T253_lc3_leftOrAbove, T253_lc3_cached;
	double T253_lc3_m, T253_lc3_C, T253_lc3_borderX, T253_lc3_borderY;

	int T253_lc1_lastY = Integer.MIN_VALUE, T253_lc2_lastY = Integer.MIN_VALUE, T253_lc3_lastY = Integer.MIN_VALUE;
	int T253_r, T253_g, T253_b;

	int T254_initializedWithValidData = false, T254_okay = false;
	double T254_sx, T254_sy, T254_minx, T254_miny, T254_maxx, T254_maxy;

	int T254_lc1_horizontal, T254_lc1_vertical, T254_lc1_leftOrAbove, T254_lc1_cached;
	double T254_lc1_m, T254_lc1_C, T254_lc1_borderX, T254_lc1_borderY;

	int T254_lc2_horizontal, T254_lc2_vertical, T254_lc2_leftOrAbove, T254_lc2_cached;
	double T254_lc2_m, T254_lc2_C, T254_lc2_borderX, T254_lc2_borderY;

	int T254_lc3_horizontal, T254_lc3_vertical, T254_lc3_leftOrAbove, T254_lc3_cached;
	double T254_lc3_m, T254_lc3_C, T254_lc3_borderX, T254_lc3_borderY;

	int T254_lc1_lastY = Integer.MIN_VALUE, T254_lc2_lastY = Integer.MIN_VALUE, T254_lc3_lastY = Integer.MIN_VALUE;
	int T254_r, T254_g, T254_b;

	int T255_initializedWithValidData = false, T255_okay = false;
	double T255_sx, T255_sy, T255_minx, T255_miny, T255_maxx, T255_maxy;

	int T255_lc1_horizontal, T255_lc1_vertical, T255_lc1_leftOrAbove, T255_lc1_cached;
	double T255_lc1_m, T255_lc1_C, T255_lc1_borderX, T255_lc1_borderY;

	int T255_lc2_horizontal, T255_lc2_vertical, T255_lc2_leftOrAbove, T255_lc2_cached;
	double T255_lc2_m, T255_lc2_C, T255_lc2_borderX, T255_lc2_borderY;

	int T255_lc3_horizontal, T255_lc3_vertical, T255_lc3_leftOrAbove, T255_lc3_cached;
	double T255_lc3_m, T255_lc3_C, T255_lc3_borderX, T255_lc3_borderY;

	int T255_lc1_lastY = Integer.MIN_VALUE, T255_lc2_lastY = Integer.MIN_VALUE, T255_lc3_lastY = Integer.MIN_VALUE;
	int T255_r, T255_g, T255_b;

	int T256_initializedWithValidData = false, T256_okay = false;
	double T256_sx, T256_sy, T256_minx, T256_miny, T256_maxx, T256_maxy;

	int T256_lc1_horizontal, T256_lc1_vertical, T256_lc1_leftOrAbove, T256_lc1_cached;
	double T256_lc1_m, T256_lc1_C, T256_lc1_borderX, T256_lc1_borderY;

	int T256_lc2_horizontal, T256_lc2_vertical, T256_lc2_leftOrAbove, T256_lc2_cached;
	double T256_lc2_m, T256_lc2_C, T256_lc2_borderX, T256_lc2_borderY;

	int T256_lc3_horizontal, T256_lc3_vertical, T256_lc3_leftOrAbove, T256_lc3_cached;
	double T256_lc3_m, T256_lc3_C, T256_lc3_borderX, T256_lc3_borderY;

	int T256_lc1_lastY = Integer.MIN_VALUE, T256_lc2_lastY = Integer.MIN_VALUE, T256_lc3_lastY = Integer.MIN_VALUE;
	int T256_r, T256_g, T256_b;

	int T257_initializedWithValidData = false, T257_okay = false;
	double T257_sx, T257_sy, T257_minx, T257_miny, T257_maxx, T257_maxy;

	int T257_lc1_horizontal, T257_lc1_vertical, T257_lc1_leftOrAbove, T257_lc1_cached;
	double T257_lc1_m, T257_lc1_C, T257_lc1_borderX, T257_lc1_borderY;

	int T257_lc2_horizontal, T257_lc2_vertical, T257_lc2_leftOrAbove, T257_lc2_cached;
	double T257_lc2_m, T257_lc2_C, T257_lc2_borderX, T257_lc2_borderY;

	int T257_lc3_horizontal, T257_lc3_vertical, T257_lc3_leftOrAbove, T257_lc3_cached;
	double T257_lc3_m, T257_lc3_C, T257_lc3_borderX, T257_lc3_borderY;

	int T257_lc1_lastY = Integer.MIN_VALUE, T257_lc2_lastY = Integer.MIN_VALUE, T257_lc3_lastY = Integer.MIN_VALUE;
	int T257_r, T257_g, T257_b;

	int T258_initializedWithValidData = false, T258_okay = false;
	double T258_sx, T258_sy, T258_minx, T258_miny, T258_maxx, T258_maxy;

	int T258_lc1_horizontal, T258_lc1_vertical, T258_lc1_leftOrAbove, T258_lc1_cached;
	double T258_lc1_m, T258_lc1_C, T258_lc1_borderX, T258_lc1_borderY;

	int T258_lc2_horizontal, T258_lc2_vertical, T258_lc2_leftOrAbove, T258_lc2_cached;
	double T258_lc2_m, T258_lc2_C, T258_lc2_borderX, T258_lc2_borderY;

	int T258_lc3_horizontal, T258_lc3_vertical, T258_lc3_leftOrAbove, T258_lc3_cached;
	double T258_lc3_m, T258_lc3_C, T258_lc3_borderX, T258_lc3_borderY;

	int T258_lc1_lastY = Integer.MIN_VALUE, T258_lc2_lastY = Integer.MIN_VALUE, T258_lc3_lastY = Integer.MIN_VALUE;
	int T258_r, T258_g, T258_b;

	int T259_initializedWithValidData = false, T259_okay = false;
	double T259_sx, T259_sy, T259_minx, T259_miny, T259_maxx, T259_maxy;

	int T259_lc1_horizontal, T259_lc1_vertical, T259_lc1_leftOrAbove, T259_lc1_cached;
	double T259_lc1_m, T259_lc1_C, T259_lc1_borderX, T259_lc1_borderY;

	int T259_lc2_horizontal, T259_lc2_vertical, T259_lc2_leftOrAbove, T259_lc2_cached;
	double T259_lc2_m, T259_lc2_C, T259_lc2_borderX, T259_lc2_borderY;

	int T259_lc3_horizontal, T259_lc3_vertical, T259_lc3_leftOrAbove, T259_lc3_cached;
	double T259_lc3_m, T259_lc3_C, T259_lc3_borderX, T259_lc3_borderY;

	int T259_lc1_lastY = Integer.MIN_VALUE, T259_lc2_lastY = Integer.MIN_VALUE, T259_lc3_lastY = Integer.MIN_VALUE;
	int T259_r, T259_g, T259_b;

	int T260_initializedWithValidData = false, T260_okay = false;
	double T260_sx, T260_sy, T260_minx, T260_miny, T260_maxx, T260_maxy;

	int T260_lc1_horizontal, T260_lc1_vertical, T260_lc1_leftOrAbove, T260_lc1_cached;
	double T260_lc1_m, T260_lc1_C, T260_lc1_borderX, T260_lc1_borderY;

	int T260_lc2_horizontal, T260_lc2_vertical, T260_lc2_leftOrAbove, T260_lc2_cached;
	double T260_lc2_m, T260_lc2_C, T260_lc2_borderX, T260_lc2_borderY;

	int T260_lc3_horizontal, T260_lc3_vertical, T260_lc3_leftOrAbove, T260_lc3_cached;
	double T260_lc3_m, T260_lc3_C, T260_lc3_borderX, T260_lc3_borderY;

	int T260_lc1_lastY = Integer.MIN_VALUE, T260_lc2_lastY = Integer.MIN_VALUE, T260_lc3_lastY = Integer.MIN_VALUE;
	int T260_r, T260_g, T260_b;

	int T261_initializedWithValidData = false, T261_okay = false;
	double T261_sx, T261_sy, T261_minx, T261_miny, T261_maxx, T261_maxy;

	int T261_lc1_horizontal, T261_lc1_vertical, T261_lc1_leftOrAbove, T261_lc1_cached;
	double T261_lc1_m, T261_lc1_C, T261_lc1_borderX, T261_lc1_borderY;

	int T261_lc2_horizontal, T261_lc2_vertical, T261_lc2_leftOrAbove, T261_lc2_cached;
	double T261_lc2_m, T261_lc2_C, T261_lc2_borderX, T261_lc2_borderY;

	int T261_lc3_horizontal, T261_lc3_vertical, T261_lc3_leftOrAbove, T261_lc3_cached;
	double T261_lc3_m, T261_lc3_C, T261_lc3_borderX, T261_lc3_borderY;

	int T261_lc1_lastY = Integer.MIN_VALUE, T261_lc2_lastY = Integer.MIN_VALUE, T261_lc3_lastY = Integer.MIN_VALUE;
	int T261_r, T261_g, T261_b;

	int T262_initializedWithValidData = false, T262_okay = false;
	double T262_sx, T262_sy, T262_minx, T262_miny, T262_maxx, T262_maxy;

	int T262_lc1_horizontal, T262_lc1_vertical, T262_lc1_leftOrAbove, T262_lc1_cached;
	double T262_lc1_m, T262_lc1_C, T262_lc1_borderX, T262_lc1_borderY;

	int T262_lc2_horizontal, T262_lc2_vertical, T262_lc2_leftOrAbove, T262_lc2_cached;
	double T262_lc2_m, T262_lc2_C, T262_lc2_borderX, T262_lc2_borderY;

	int T262_lc3_horizontal, T262_lc3_vertical, T262_lc3_leftOrAbove, T262_lc3_cached;
	double T262_lc3_m, T262_lc3_C, T262_lc3_borderX, T262_lc3_borderY;

	int T262_lc1_lastY = Integer.MIN_VALUE, T262_lc2_lastY = Integer.MIN_VALUE, T262_lc3_lastY = Integer.MIN_VALUE;
	int T262_r, T262_g, T262_b;

	int T263_initializedWithValidData = false, T263_okay = false;
	double T263_sx, T263_sy, T263_minx, T263_miny, T263_maxx, T263_maxy;

	int T263_lc1_horizontal, T263_lc1_vertical, T263_lc1_leftOrAbove, T263_lc1_cached;
	double T263_lc1_m, T263_lc1_C, T263_lc1_borderX, T263_lc1_borderY;

	int T263_lc2_horizontal, T263_lc2_vertical, T263_lc2_leftOrAbove, T263_lc2_cached;
	double T263_lc2_m, T263_lc2_C, T263_lc2_borderX, T263_lc2_borderY;

	int T263_lc3_horizontal, T263_lc3_vertical, T263_lc3_leftOrAbove, T263_lc3_cached;
	double T263_lc3_m, T263_lc3_C, T263_lc3_borderX, T263_lc3_borderY;

	int T263_lc1_lastY = Integer.MIN_VALUE, T263_lc2_lastY = Integer.MIN_VALUE, T263_lc3_lastY = Integer.MIN_VALUE;
	int T263_r, T263_g, T263_b;

	int T264_initializedWithValidData = false, T264_okay = false;
	double T264_sx, T264_sy, T264_minx, T264_miny, T264_maxx, T264_maxy;

	int T264_lc1_horizontal, T264_lc1_vertical, T264_lc1_leftOrAbove, T264_lc1_cached;
	double T264_lc1_m, T264_lc1_C, T264_lc1_borderX, T264_lc1_borderY;

	int T264_lc2_horizontal, T264_lc2_vertical, T264_lc2_leftOrAbove, T264_lc2_cached;
	double T264_lc2_m, T264_lc2_C, T264_lc2_borderX, T264_lc2_borderY;

	int T264_lc3_horizontal, T264_lc3_vertical, T264_lc3_leftOrAbove, T264_lc3_cached;
	double T264_lc3_m, T264_lc3_C, T264_lc3_borderX, T264_lc3_borderY;

	int T264_lc1_lastY = Integer.MIN_VALUE, T264_lc2_lastY = Integer.MIN_VALUE, T264_lc3_lastY = Integer.MIN_VALUE;
	int T264_r, T264_g, T264_b;

	int T265_initializedWithValidData = false, T265_okay = false;
	double T265_sx, T265_sy, T265_minx, T265_miny, T265_maxx, T265_maxy;

	int T265_lc1_horizontal, T265_lc1_vertical, T265_lc1_leftOrAbove, T265_lc1_cached;
	double T265_lc1_m, T265_lc1_C, T265_lc1_borderX, T265_lc1_borderY;

	int T265_lc2_horizontal, T265_lc2_vertical, T265_lc2_leftOrAbove, T265_lc2_cached;
	double T265_lc2_m, T265_lc2_C, T265_lc2_borderX, T265_lc2_borderY;

	int T265_lc3_horizontal, T265_lc3_vertical, T265_lc3_leftOrAbove, T265_lc3_cached;
	double T265_lc3_m, T265_lc3_C, T265_lc3_borderX, T265_lc3_borderY;

	int T265_lc1_lastY = Integer.MIN_VALUE, T265_lc2_lastY = Integer.MIN_VALUE, T265_lc3_lastY = Integer.MIN_VALUE;
	int T265_r, T265_g, T265_b;

	int T266_initializedWithValidData = false, T266_okay = false;
	double T266_sx, T266_sy, T266_minx, T266_miny, T266_maxx, T266_maxy;

	int T266_lc1_horizontal, T266_lc1_vertical, T266_lc1_leftOrAbove, T266_lc1_cached;
	double T266_lc1_m, T266_lc1_C, T266_lc1_borderX, T266_lc1_borderY;

	int T266_lc2_horizontal, T266_lc2_vertical, T266_lc2_leftOrAbove, T266_lc2_cached;
	double T266_lc2_m, T266_lc2_C, T266_lc2_borderX, T266_lc2_borderY;

	int T266_lc3_horizontal, T266_lc3_vertical, T266_lc3_leftOrAbove, T266_lc3_cached;
	double T266_lc3_m, T266_lc3_C, T266_lc3_borderX, T266_lc3_borderY;

	int T266_lc1_lastY = Integer.MIN_VALUE, T266_lc2_lastY = Integer.MIN_VALUE, T266_lc3_lastY = Integer.MIN_VALUE;
	int T266_r, T266_g, T266_b;

	int T267_initializedWithValidData = false, T267_okay = false;
	double T267_sx, T267_sy, T267_minx, T267_miny, T267_maxx, T267_maxy;

	int T267_lc1_horizontal, T267_lc1_vertical, T267_lc1_leftOrAbove, T267_lc1_cached;
	double T267_lc1_m, T267_lc1_C, T267_lc1_borderX, T267_lc1_borderY;

	int T267_lc2_horizontal, T267_lc2_vertical, T267_lc2_leftOrAbove, T267_lc2_cached;
	double T267_lc2_m, T267_lc2_C, T267_lc2_borderX, T267_lc2_borderY;

	int T267_lc3_horizontal, T267_lc3_vertical, T267_lc3_leftOrAbove, T267_lc3_cached;
	double T267_lc3_m, T267_lc3_C, T267_lc3_borderX, T267_lc3_borderY;

	int T267_lc1_lastY = Integer.MIN_VALUE, T267_lc2_lastY = Integer.MIN_VALUE, T267_lc3_lastY = Integer.MIN_VALUE;
	int T267_r, T267_g, T267_b;

	int T268_initializedWithValidData = false, T268_okay = false;
	double T268_sx, T268_sy, T268_minx, T268_miny, T268_maxx, T268_maxy;

	int T268_lc1_horizontal, T268_lc1_vertical, T268_lc1_leftOrAbove, T268_lc1_cached;
	double T268_lc1_m, T268_lc1_C, T268_lc1_borderX, T268_lc1_borderY;

	int T268_lc2_horizontal, T268_lc2_vertical, T268_lc2_leftOrAbove, T268_lc2_cached;
	double T268_lc2_m, T268_lc2_C, T268_lc2_borderX, T268_lc2_borderY;

	int T268_lc3_horizontal, T268_lc3_vertical, T268_lc3_leftOrAbove, T268_lc3_cached;
	double T268_lc3_m, T268_lc3_C, T268_lc3_borderX, T268_lc3_borderY;

	int T268_lc1_lastY = Integer.MIN_VALUE, T268_lc2_lastY = Integer.MIN_VALUE, T268_lc3_lastY = Integer.MIN_VALUE;
	int T268_r, T268_g, T268_b;

	int T269_initializedWithValidData = false, T269_okay = false;
	double T269_sx, T269_sy, T269_minx, T269_miny, T269_maxx, T269_maxy;

	int T269_lc1_horizontal, T269_lc1_vertical, T269_lc1_leftOrAbove, T269_lc1_cached;
	double T269_lc1_m, T269_lc1_C, T269_lc1_borderX, T269_lc1_borderY;

	int T269_lc2_horizontal, T269_lc2_vertical, T269_lc2_leftOrAbove, T269_lc2_cached;
	double T269_lc2_m, T269_lc2_C, T269_lc2_borderX, T269_lc2_borderY;

	int T269_lc3_horizontal, T269_lc3_vertical, T269_lc3_leftOrAbove, T269_lc3_cached;
	double T269_lc3_m, T269_lc3_C, T269_lc3_borderX, T269_lc3_borderY;

	int T269_lc1_lastY = Integer.MIN_VALUE, T269_lc2_lastY = Integer.MIN_VALUE, T269_lc3_lastY = Integer.MIN_VALUE;
	int T269_r, T269_g, T269_b;

	int T270_initializedWithValidData = false, T270_okay = false;
	double T270_sx, T270_sy, T270_minx, T270_miny, T270_maxx, T270_maxy;

	int T270_lc1_horizontal, T270_lc1_vertical, T270_lc1_leftOrAbove, T270_lc1_cached;
	double T270_lc1_m, T270_lc1_C, T270_lc1_borderX, T270_lc1_borderY;

	int T270_lc2_horizontal, T270_lc2_vertical, T270_lc2_leftOrAbove, T270_lc2_cached;
	double T270_lc2_m, T270_lc2_C, T270_lc2_borderX, T270_lc2_borderY;

	int T270_lc3_horizontal, T270_lc3_vertical, T270_lc3_leftOrAbove, T270_lc3_cached;
	double T270_lc3_m, T270_lc3_C, T270_lc3_borderX, T270_lc3_borderY;

	int T270_lc1_lastY = Integer.MIN_VALUE, T270_lc2_lastY = Integer.MIN_VALUE, T270_lc3_lastY = Integer.MIN_VALUE;
	int T270_r, T270_g, T270_b;

	int T271_initializedWithValidData = false, T271_okay = false;
	double T271_sx, T271_sy, T271_minx, T271_miny, T271_maxx, T271_maxy;

	int T271_lc1_horizontal, T271_lc1_vertical, T271_lc1_leftOrAbove, T271_lc1_cached;
	double T271_lc1_m, T271_lc1_C, T271_lc1_borderX, T271_lc1_borderY;

	int T271_lc2_horizontal, T271_lc2_vertical, T271_lc2_leftOrAbove, T271_lc2_cached;
	double T271_lc2_m, T271_lc2_C, T271_lc2_borderX, T271_lc2_borderY;

	int T271_lc3_horizontal, T271_lc3_vertical, T271_lc3_leftOrAbove, T271_lc3_cached;
	double T271_lc3_m, T271_lc3_C, T271_lc3_borderX, T271_lc3_borderY;

	int T271_lc1_lastY = Integer.MIN_VALUE, T271_lc2_lastY = Integer.MIN_VALUE, T271_lc3_lastY = Integer.MIN_VALUE;
	int T271_r, T271_g, T271_b;

	int T272_initializedWithValidData = false, T272_okay = false;
	double T272_sx, T272_sy, T272_minx, T272_miny, T272_maxx, T272_maxy;

	int T272_lc1_horizontal, T272_lc1_vertical, T272_lc1_leftOrAbove, T272_lc1_cached;
	double T272_lc1_m, T272_lc1_C, T272_lc1_borderX, T272_lc1_borderY;

	int T272_lc2_horizontal, T272_lc2_vertical, T272_lc2_leftOrAbove, T272_lc2_cached;
	double T272_lc2_m, T272_lc2_C, T272_lc2_borderX, T272_lc2_borderY;

	int T272_lc3_horizontal, T272_lc3_vertical, T272_lc3_leftOrAbove, T272_lc3_cached;
	double T272_lc3_m, T272_lc3_C, T272_lc3_borderX, T272_lc3_borderY;

	int T272_lc1_lastY = Integer.MIN_VALUE, T272_lc2_lastY = Integer.MIN_VALUE, T272_lc3_lastY = Integer.MIN_VALUE;
	int T272_r, T272_g, T272_b;

	int T273_initializedWithValidData = false, T273_okay = false;
	double T273_sx, T273_sy, T273_minx, T273_miny, T273_maxx, T273_maxy;

	int T273_lc1_horizontal, T273_lc1_vertical, T273_lc1_leftOrAbove, T273_lc1_cached;
	double T273_lc1_m, T273_lc1_C, T273_lc1_borderX, T273_lc1_borderY;

	int T273_lc2_horizontal, T273_lc2_vertical, T273_lc2_leftOrAbove, T273_lc2_cached;
	double T273_lc2_m, T273_lc2_C, T273_lc2_borderX, T273_lc2_borderY;

	int T273_lc3_horizontal, T273_lc3_vertical, T273_lc3_leftOrAbove, T273_lc3_cached;
	double T273_lc3_m, T273_lc3_C, T273_lc3_borderX, T273_lc3_borderY;

	int T273_lc1_lastY = Integer.MIN_VALUE, T273_lc2_lastY = Integer.MIN_VALUE, T273_lc3_lastY = Integer.MIN_VALUE;
	int T273_r, T273_g, T273_b;

	int T274_initializedWithValidData = false, T274_okay = false;
	double T274_sx, T274_sy, T274_minx, T274_miny, T274_maxx, T274_maxy;

	int T274_lc1_horizontal, T274_lc1_vertical, T274_lc1_leftOrAbove, T274_lc1_cached;
	double T274_lc1_m, T274_lc1_C, T274_lc1_borderX, T274_lc1_borderY;

	int T274_lc2_horizontal, T274_lc2_vertical, T274_lc2_leftOrAbove, T274_lc2_cached;
	double T274_lc2_m, T274_lc2_C, T274_lc2_borderX, T274_lc2_borderY;

	int T274_lc3_horizontal, T274_lc3_vertical, T274_lc3_leftOrAbove, T274_lc3_cached;
	double T274_lc3_m, T274_lc3_C, T274_lc3_borderX, T274_lc3_borderY;

	int T274_lc1_lastY = Integer.MIN_VALUE, T274_lc2_lastY = Integer.MIN_VALUE, T274_lc3_lastY = Integer.MIN_VALUE;
	int T274_r, T274_g, T274_b;

	int T275_initializedWithValidData = false, T275_okay = false;
	double T275_sx, T275_sy, T275_minx, T275_miny, T275_maxx, T275_maxy;

	int T275_lc1_horizontal, T275_lc1_vertical, T275_lc1_leftOrAbove, T275_lc1_cached;
	double T275_lc1_m, T275_lc1_C, T275_lc1_borderX, T275_lc1_borderY;

	int T275_lc2_horizontal, T275_lc2_vertical, T275_lc2_leftOrAbove, T275_lc2_cached;
	double T275_lc2_m, T275_lc2_C, T275_lc2_borderX, T275_lc2_borderY;

	int T275_lc3_horizontal, T275_lc3_vertical, T275_lc3_leftOrAbove, T275_lc3_cached;
	double T275_lc3_m, T275_lc3_C, T275_lc3_borderX, T275_lc3_borderY;

	int T275_lc1_lastY = Integer.MIN_VALUE, T275_lc2_lastY = Integer.MIN_VALUE, T275_lc3_lastY = Integer.MIN_VALUE;
	int T275_r, T275_g, T275_b;

	int T276_initializedWithValidData = false, T276_okay = false;
	double T276_sx, T276_sy, T276_minx, T276_miny, T276_maxx, T276_maxy;

	int T276_lc1_horizontal, T276_lc1_vertical, T276_lc1_leftOrAbove, T276_lc1_cached;
	double T276_lc1_m, T276_lc1_C, T276_lc1_borderX, T276_lc1_borderY;

	int T276_lc2_horizontal, T276_lc2_vertical, T276_lc2_leftOrAbove, T276_lc2_cached;
	double T276_lc2_m, T276_lc2_C, T276_lc2_borderX, T276_lc2_borderY;

	int T276_lc3_horizontal, T276_lc3_vertical, T276_lc3_leftOrAbove, T276_lc3_cached;
	double T276_lc3_m, T276_lc3_C, T276_lc3_borderX, T276_lc3_borderY;

	int T276_lc1_lastY = Integer.MIN_VALUE, T276_lc2_lastY = Integer.MIN_VALUE, T276_lc3_lastY = Integer.MIN_VALUE;
	int T276_r, T276_g, T276_b;

	int T277_initializedWithValidData = false, T277_okay = false;
	double T277_sx, T277_sy, T277_minx, T277_miny, T277_maxx, T277_maxy;

	int T277_lc1_horizontal, T277_lc1_vertical, T277_lc1_leftOrAbove, T277_lc1_cached;
	double T277_lc1_m, T277_lc1_C, T277_lc1_borderX, T277_lc1_borderY;

	int T277_lc2_horizontal, T277_lc2_vertical, T277_lc2_leftOrAbove, T277_lc2_cached;
	double T277_lc2_m, T277_lc2_C, T277_lc2_borderX, T277_lc2_borderY;

	int T277_lc3_horizontal, T277_lc3_vertical, T277_lc3_leftOrAbove, T277_lc3_cached;
	double T277_lc3_m, T277_lc3_C, T277_lc3_borderX, T277_lc3_borderY;

	int T277_lc1_lastY = Integer.MIN_VALUE, T277_lc2_lastY = Integer.MIN_VALUE, T277_lc3_lastY = Integer.MIN_VALUE;
	int T277_r, T277_g, T277_b;

	int T278_initializedWithValidData = false, T278_okay = false;
	double T278_sx, T278_sy, T278_minx, T278_miny, T278_maxx, T278_maxy;

	int T278_lc1_horizontal, T278_lc1_vertical, T278_lc1_leftOrAbove, T278_lc1_cached;
	double T278_lc1_m, T278_lc1_C, T278_lc1_borderX, T278_lc1_borderY;

	int T278_lc2_horizontal, T278_lc2_vertical, T278_lc2_leftOrAbove, T278_lc2_cached;
	double T278_lc2_m, T278_lc2_C, T278_lc2_borderX, T278_lc2_borderY;

	int T278_lc3_horizontal, T278_lc3_vertical, T278_lc3_leftOrAbove, T278_lc3_cached;
	double T278_lc3_m, T278_lc3_C, T278_lc3_borderX, T278_lc3_borderY;

	int T278_lc1_lastY = Integer.MIN_VALUE, T278_lc2_lastY = Integer.MIN_VALUE, T278_lc3_lastY = Integer.MIN_VALUE;
	int T278_r, T278_g, T278_b;

	int T279_initializedWithValidData = false, T279_okay = false;
	double T279_sx, T279_sy, T279_minx, T279_miny, T279_maxx, T279_maxy;

	int T279_lc1_horizontal, T279_lc1_vertical, T279_lc1_leftOrAbove, T279_lc1_cached;
	double T279_lc1_m, T279_lc1_C, T279_lc1_borderX, T279_lc1_borderY;

	int T279_lc2_horizontal, T279_lc2_vertical, T279_lc2_leftOrAbove, T279_lc2_cached;
	double T279_lc2_m, T279_lc2_C, T279_lc2_borderX, T279_lc2_borderY;

	int T279_lc3_horizontal, T279_lc3_vertical, T279_lc3_leftOrAbove, T279_lc3_cached;
	double T279_lc3_m, T279_lc3_C, T279_lc3_borderX, T279_lc3_borderY;

	int T279_lc1_lastY = Integer.MIN_VALUE, T279_lc2_lastY = Integer.MIN_VALUE, T279_lc3_lastY = Integer.MIN_VALUE;
	int T279_r, T279_g, T279_b;

	int T280_initializedWithValidData = false, T280_okay = false;
	double T280_sx, T280_sy, T280_minx, T280_miny, T280_maxx, T280_maxy;

	int T280_lc1_horizontal, T280_lc1_vertical, T280_lc1_leftOrAbove, T280_lc1_cached;
	double T280_lc1_m, T280_lc1_C, T280_lc1_borderX, T280_lc1_borderY;

	int T280_lc2_horizontal, T280_lc2_vertical, T280_lc2_leftOrAbove, T280_lc2_cached;
	double T280_lc2_m, T280_lc2_C, T280_lc2_borderX, T280_lc2_borderY;

	int T280_lc3_horizontal, T280_lc3_vertical, T280_lc3_leftOrAbove, T280_lc3_cached;
	double T280_lc3_m, T280_lc3_C, T280_lc3_borderX, T280_lc3_borderY;

	int T280_lc1_lastY = Integer.MIN_VALUE, T280_lc2_lastY = Integer.MIN_VALUE, T280_lc3_lastY = Integer.MIN_VALUE;
	int T280_r, T280_g, T280_b;

	int T281_initializedWithValidData = false, T281_okay = false;
	double T281_sx, T281_sy, T281_minx, T281_miny, T281_maxx, T281_maxy;

	int T281_lc1_horizontal, T281_lc1_vertical, T281_lc1_leftOrAbove, T281_lc1_cached;
	double T281_lc1_m, T281_lc1_C, T281_lc1_borderX, T281_lc1_borderY;

	int T281_lc2_horizontal, T281_lc2_vertical, T281_lc2_leftOrAbove, T281_lc2_cached;
	double T281_lc2_m, T281_lc2_C, T281_lc2_borderX, T281_lc2_borderY;

	int T281_lc3_horizontal, T281_lc3_vertical, T281_lc3_leftOrAbove, T281_lc3_cached;
	double T281_lc3_m, T281_lc3_C, T281_lc3_borderX, T281_lc3_borderY;

	int T281_lc1_lastY = Integer.MIN_VALUE, T281_lc2_lastY = Integer.MIN_VALUE, T281_lc3_lastY = Integer.MIN_VALUE;
	int T281_r, T281_g, T281_b;

	int T282_initializedWithValidData = false, T282_okay = false;
	double T282_sx, T282_sy, T282_minx, T282_miny, T282_maxx, T282_maxy;

	int T282_lc1_horizontal, T282_lc1_vertical, T282_lc1_leftOrAbove, T282_lc1_cached;
	double T282_lc1_m, T282_lc1_C, T282_lc1_borderX, T282_lc1_borderY;

	int T282_lc2_horizontal, T282_lc2_vertical, T282_lc2_leftOrAbove, T282_lc2_cached;
	double T282_lc2_m, T282_lc2_C, T282_lc2_borderX, T282_lc2_borderY;

	int T282_lc3_horizontal, T282_lc3_vertical, T282_lc3_leftOrAbove, T282_lc3_cached;
	double T282_lc3_m, T282_lc3_C, T282_lc3_borderX, T282_lc3_borderY;

	int T282_lc1_lastY = Integer.MIN_VALUE, T282_lc2_lastY = Integer.MIN_VALUE, T282_lc3_lastY = Integer.MIN_VALUE;
	int T282_r, T282_g, T282_b;

	int T283_initializedWithValidData = false, T283_okay = false;
	double T283_sx, T283_sy, T283_minx, T283_miny, T283_maxx, T283_maxy;

	int T283_lc1_horizontal, T283_lc1_vertical, T283_lc1_leftOrAbove, T283_lc1_cached;
	double T283_lc1_m, T283_lc1_C, T283_lc1_borderX, T283_lc1_borderY;

	int T283_lc2_horizontal, T283_lc2_vertical, T283_lc2_leftOrAbove, T283_lc2_cached;
	double T283_lc2_m, T283_lc2_C, T283_lc2_borderX, T283_lc2_borderY;

	int T283_lc3_horizontal, T283_lc3_vertical, T283_lc3_leftOrAbove, T283_lc3_cached;
	double T283_lc3_m, T283_lc3_C, T283_lc3_borderX, T283_lc3_borderY;

	int T283_lc1_lastY = Integer.MIN_VALUE, T283_lc2_lastY = Integer.MIN_VALUE, T283_lc3_lastY = Integer.MIN_VALUE;
	int T283_r, T283_g, T283_b;

	int T284_initializedWithValidData = false, T284_okay = false;
	double T284_sx, T284_sy, T284_minx, T284_miny, T284_maxx, T284_maxy;

	int T284_lc1_horizontal, T284_lc1_vertical, T284_lc1_leftOrAbove, T284_lc1_cached;
	double T284_lc1_m, T284_lc1_C, T284_lc1_borderX, T284_lc1_borderY;

	int T284_lc2_horizontal, T284_lc2_vertical, T284_lc2_leftOrAbove, T284_lc2_cached;
	double T284_lc2_m, T284_lc2_C, T284_lc2_borderX, T284_lc2_borderY;

	int T284_lc3_horizontal, T284_lc3_vertical, T284_lc3_leftOrAbove, T284_lc3_cached;
	double T284_lc3_m, T284_lc3_C, T284_lc3_borderX, T284_lc3_borderY;

	int T284_lc1_lastY = Integer.MIN_VALUE, T284_lc2_lastY = Integer.MIN_VALUE, T284_lc3_lastY = Integer.MIN_VALUE;
	int T284_r, T284_g, T284_b;

	int T285_initializedWithValidData = false, T285_okay = false;
	double T285_sx, T285_sy, T285_minx, T285_miny, T285_maxx, T285_maxy;

	int T285_lc1_horizontal, T285_lc1_vertical, T285_lc1_leftOrAbove, T285_lc1_cached;
	double T285_lc1_m, T285_lc1_C, T285_lc1_borderX, T285_lc1_borderY;

	int T285_lc2_horizontal, T285_lc2_vertical, T285_lc2_leftOrAbove, T285_lc2_cached;
	double T285_lc2_m, T285_lc2_C, T285_lc2_borderX, T285_lc2_borderY;

	int T285_lc3_horizontal, T285_lc3_vertical, T285_lc3_leftOrAbove, T285_lc3_cached;
	double T285_lc3_m, T285_lc3_C, T285_lc3_borderX, T285_lc3_borderY;

	int T285_lc1_lastY = Integer.MIN_VALUE, T285_lc2_lastY = Integer.MIN_VALUE, T285_lc3_lastY = Integer.MIN_VALUE;
	int T285_r, T285_g, T285_b;

	int T286_initializedWithValidData = false, T286_okay = false;
	double T286_sx, T286_sy, T286_minx, T286_miny, T286_maxx, T286_maxy;

	int T286_lc1_horizontal, T286_lc1_vertical, T286_lc1_leftOrAbove, T286_lc1_cached;
	double T286_lc1_m, T286_lc1_C, T286_lc1_borderX, T286_lc1_borderY;

	int T286_lc2_horizontal, T286_lc2_vertical, T286_lc2_leftOrAbove, T286_lc2_cached;
	double T286_lc2_m, T286_lc2_C, T286_lc2_borderX, T286_lc2_borderY;

	int T286_lc3_horizontal, T286_lc3_vertical, T286_lc3_leftOrAbove, T286_lc3_cached;
	double T286_lc3_m, T286_lc3_C, T286_lc3_borderX, T286_lc3_borderY;

	int T286_lc1_lastY = Integer.MIN_VALUE, T286_lc2_lastY = Integer.MIN_VALUE, T286_lc3_lastY = Integer.MIN_VALUE;
	int T286_r, T286_g, T286_b;

	int T287_initializedWithValidData = false, T287_okay = false;
	double T287_sx, T287_sy, T287_minx, T287_miny, T287_maxx, T287_maxy;

	int T287_lc1_horizontal, T287_lc1_vertical, T287_lc1_leftOrAbove, T287_lc1_cached;
	double T287_lc1_m, T287_lc1_C, T287_lc1_borderX, T287_lc1_borderY;

	int T287_lc2_horizontal, T287_lc2_vertical, T287_lc2_leftOrAbove, T287_lc2_cached;
	double T287_lc2_m, T287_lc2_C, T287_lc2_borderX, T287_lc2_borderY;

	int T287_lc3_horizontal, T287_lc3_vertical, T287_lc3_leftOrAbove, T287_lc3_cached;
	double T287_lc3_m, T287_lc3_C, T287_lc3_borderX, T287_lc3_borderY;

	int T287_lc1_lastY = Integer.MIN_VALUE, T287_lc2_lastY = Integer.MIN_VALUE, T287_lc3_lastY = Integer.MIN_VALUE;
	int T287_r, T287_g, T287_b;

	int T288_initializedWithValidData = false, T288_okay = false;
	double T288_sx, T288_sy, T288_minx, T288_miny, T288_maxx, T288_maxy;

	int T288_lc1_horizontal, T288_lc1_vertical, T288_lc1_leftOrAbove, T288_lc1_cached;
	double T288_lc1_m, T288_lc1_C, T288_lc1_borderX, T288_lc1_borderY;

	int T288_lc2_horizontal, T288_lc2_vertical, T288_lc2_leftOrAbove, T288_lc2_cached;
	double T288_lc2_m, T288_lc2_C, T288_lc2_borderX, T288_lc2_borderY;

	int T288_lc3_horizontal, T288_lc3_vertical, T288_lc3_leftOrAbove, T288_lc3_cached;
	double T288_lc3_m, T288_lc3_C, T288_lc3_borderX, T288_lc3_borderY;

	int T288_lc1_lastY = Integer.MIN_VALUE, T288_lc2_lastY = Integer.MIN_VALUE, T288_lc3_lastY = Integer.MIN_VALUE;
	int T288_r, T288_g, T288_b;

	int T289_initializedWithValidData = false, T289_okay = false;
	double T289_sx, T289_sy, T289_minx, T289_miny, T289_maxx, T289_maxy;

	int T289_lc1_horizontal, T289_lc1_vertical, T289_lc1_leftOrAbove, T289_lc1_cached;
	double T289_lc1_m, T289_lc1_C, T289_lc1_borderX, T289_lc1_borderY;

	int T289_lc2_horizontal, T289_lc2_vertical, T289_lc2_leftOrAbove, T289_lc2_cached;
	double T289_lc2_m, T289_lc2_C, T289_lc2_borderX, T289_lc2_borderY;

	int T289_lc3_horizontal, T289_lc3_vertical, T289_lc3_leftOrAbove, T289_lc3_cached;
	double T289_lc3_m, T289_lc3_C, T289_lc3_borderX, T289_lc3_borderY;

	int T289_lc1_lastY = Integer.MIN_VALUE, T289_lc2_lastY = Integer.MIN_VALUE, T289_lc3_lastY = Integer.MIN_VALUE;
	int T289_r, T289_g, T289_b;

	int T290_initializedWithValidData = false, T290_okay = false;
	double T290_sx, T290_sy, T290_minx, T290_miny, T290_maxx, T290_maxy;

	int T290_lc1_horizontal, T290_lc1_vertical, T290_lc1_leftOrAbove, T290_lc1_cached;
	double T290_lc1_m, T290_lc1_C, T290_lc1_borderX, T290_lc1_borderY;

	int T290_lc2_horizontal, T290_lc2_vertical, T290_lc2_leftOrAbove, T290_lc2_cached;
	double T290_lc2_m, T290_lc2_C, T290_lc2_borderX, T290_lc2_borderY;

	int T290_lc3_horizontal, T290_lc3_vertical, T290_lc3_leftOrAbove, T290_lc3_cached;
	double T290_lc3_m, T290_lc3_C, T290_lc3_borderX, T290_lc3_borderY;

	int T290_lc1_lastY = Integer.MIN_VALUE, T290_lc2_lastY = Integer.MIN_VALUE, T290_lc3_lastY = Integer.MIN_VALUE;
	int T290_r, T290_g, T290_b;

	int T291_initializedWithValidData = false, T291_okay = false;
	double T291_sx, T291_sy, T291_minx, T291_miny, T291_maxx, T291_maxy;

	int T291_lc1_horizontal, T291_lc1_vertical, T291_lc1_leftOrAbove, T291_lc1_cached;
	double T291_lc1_m, T291_lc1_C, T291_lc1_borderX, T291_lc1_borderY;

	int T291_lc2_horizontal, T291_lc2_vertical, T291_lc2_leftOrAbove, T291_lc2_cached;
	double T291_lc2_m, T291_lc2_C, T291_lc2_borderX, T291_lc2_borderY;

	int T291_lc3_horizontal, T291_lc3_vertical, T291_lc3_leftOrAbove, T291_lc3_cached;
	double T291_lc3_m, T291_lc3_C, T291_lc3_borderX, T291_lc3_borderY;

	int T291_lc1_lastY = Integer.MIN_VALUE, T291_lc2_lastY = Integer.MIN_VALUE, T291_lc3_lastY = Integer.MIN_VALUE;
	int T291_r, T291_g, T291_b;

	int T292_initializedWithValidData = false, T292_okay = false;
	double T292_sx, T292_sy, T292_minx, T292_miny, T292_maxx, T292_maxy;

	int T292_lc1_horizontal, T292_lc1_vertical, T292_lc1_leftOrAbove, T292_lc1_cached;
	double T292_lc1_m, T292_lc1_C, T292_lc1_borderX, T292_lc1_borderY;

	int T292_lc2_horizontal, T292_lc2_vertical, T292_lc2_leftOrAbove, T292_lc2_cached;
	double T292_lc2_m, T292_lc2_C, T292_lc2_borderX, T292_lc2_borderY;

	int T292_lc3_horizontal, T292_lc3_vertical, T292_lc3_leftOrAbove, T292_lc3_cached;
	double T292_lc3_m, T292_lc3_C, T292_lc3_borderX, T292_lc3_borderY;

	int T292_lc1_lastY = Integer.MIN_VALUE, T292_lc2_lastY = Integer.MIN_VALUE, T292_lc3_lastY = Integer.MIN_VALUE;
	int T292_r, T292_g, T292_b;

	int T293_initializedWithValidData = false, T293_okay = false;
	double T293_sx, T293_sy, T293_minx, T293_miny, T293_maxx, T293_maxy;

	int T293_lc1_horizontal, T293_lc1_vertical, T293_lc1_leftOrAbove, T293_lc1_cached;
	double T293_lc1_m, T293_lc1_C, T293_lc1_borderX, T293_lc1_borderY;

	int T293_lc2_horizontal, T293_lc2_vertical, T293_lc2_leftOrAbove, T293_lc2_cached;
	double T293_lc2_m, T293_lc2_C, T293_lc2_borderX, T293_lc2_borderY;

	int T293_lc3_horizontal, T293_lc3_vertical, T293_lc3_leftOrAbove, T293_lc3_cached;
	double T293_lc3_m, T293_lc3_C, T293_lc3_borderX, T293_lc3_borderY;

	int T293_lc1_lastY = Integer.MIN_VALUE, T293_lc2_lastY = Integer.MIN_VALUE, T293_lc3_lastY = Integer.MIN_VALUE;
	int T293_r, T293_g, T293_b;

	int T294_initializedWithValidData = false, T294_okay = false;
	double T294_sx, T294_sy, T294_minx, T294_miny, T294_maxx, T294_maxy;

	int T294_lc1_horizontal, T294_lc1_vertical, T294_lc1_leftOrAbove, T294_lc1_cached;
	double T294_lc1_m, T294_lc1_C, T294_lc1_borderX, T294_lc1_borderY;

	int T294_lc2_horizontal, T294_lc2_vertical, T294_lc2_leftOrAbove, T294_lc2_cached;
	double T294_lc2_m, T294_lc2_C, T294_lc2_borderX, T294_lc2_borderY;

	int T294_lc3_horizontal, T294_lc3_vertical, T294_lc3_leftOrAbove, T294_lc3_cached;
	double T294_lc3_m, T294_lc3_C, T294_lc3_borderX, T294_lc3_borderY;

	int T294_lc1_lastY = Integer.MIN_VALUE, T294_lc2_lastY = Integer.MIN_VALUE, T294_lc3_lastY = Integer.MIN_VALUE;
	int T294_r, T294_g, T294_b;

	int T295_initializedWithValidData = false, T295_okay = false;
	double T295_sx, T295_sy, T295_minx, T295_miny, T295_maxx, T295_maxy;

	int T295_lc1_horizontal, T295_lc1_vertical, T295_lc1_leftOrAbove, T295_lc1_cached;
	double T295_lc1_m, T295_lc1_C, T295_lc1_borderX, T295_lc1_borderY;

	int T295_lc2_horizontal, T295_lc2_vertical, T295_lc2_leftOrAbove, T295_lc2_cached;
	double T295_lc2_m, T295_lc2_C, T295_lc2_borderX, T295_lc2_borderY;

	int T295_lc3_horizontal, T295_lc3_vertical, T295_lc3_leftOrAbove, T295_lc3_cached;
	double T295_lc3_m, T295_lc3_C, T295_lc3_borderX, T295_lc3_borderY;

	int T295_lc1_lastY = Integer.MIN_VALUE, T295_lc2_lastY = Integer.MIN_VALUE, T295_lc3_lastY = Integer.MIN_VALUE;
	int T295_r, T295_g, T295_b;

	int T296_initializedWithValidData = false, T296_okay = false;
	double T296_sx, T296_sy, T296_minx, T296_miny, T296_maxx, T296_maxy;

	int T296_lc1_horizontal, T296_lc1_vertical, T296_lc1_leftOrAbove, T296_lc1_cached;
	double T296_lc1_m, T296_lc1_C, T296_lc1_borderX, T296_lc1_borderY;

	int T296_lc2_horizontal, T296_lc2_vertical, T296_lc2_leftOrAbove, T296_lc2_cached;
	double T296_lc2_m, T296_lc2_C, T296_lc2_borderX, T296_lc2_borderY;

	int T296_lc3_horizontal, T296_lc3_vertical, T296_lc3_leftOrAbove, T296_lc3_cached;
	double T296_lc3_m, T296_lc3_C, T296_lc3_borderX, T296_lc3_borderY;

	int T296_lc1_lastY = Integer.MIN_VALUE, T296_lc2_lastY = Integer.MIN_VALUE, T296_lc3_lastY = Integer.MIN_VALUE;
	int T296_r, T296_g, T296_b;

	int T297_initializedWithValidData = false, T297_okay = false;
	double T297_sx, T297_sy, T297_minx, T297_miny, T297_maxx, T297_maxy;

	int T297_lc1_horizontal, T297_lc1_vertical, T297_lc1_leftOrAbove, T297_lc1_cached;
	double T297_lc1_m, T297_lc1_C, T297_lc1_borderX, T297_lc1_borderY;

	int T297_lc2_horizontal, T297_lc2_vertical, T297_lc2_leftOrAbove, T297_lc2_cached;
	double T297_lc2_m, T297_lc2_C, T297_lc2_borderX, T297_lc2_borderY;

	int T297_lc3_horizontal, T297_lc3_vertical, T297_lc3_leftOrAbove, T297_lc3_cached;
	double T297_lc3_m, T297_lc3_C, T297_lc3_borderX, T297_lc3_borderY;

	int T297_lc1_lastY = Integer.MIN_VALUE, T297_lc2_lastY = Integer.MIN_VALUE, T297_lc3_lastY = Integer.MIN_VALUE;
	int T297_r, T297_g, T297_b;

	int T298_initializedWithValidData = false, T298_okay = false;
	double T298_sx, T298_sy, T298_minx, T298_miny, T298_maxx, T298_maxy;

	int T298_lc1_horizontal, T298_lc1_vertical, T298_lc1_leftOrAbove, T298_lc1_cached;
	double T298_lc1_m, T298_lc1_C, T298_lc1_borderX, T298_lc1_borderY;

	int T298_lc2_horizontal, T298_lc2_vertical, T298_lc2_leftOrAbove, T298_lc2_cached;
	double T298_lc2_m, T298_lc2_C, T298_lc2_borderX, T298_lc2_borderY;

	int T298_lc3_horizontal, T298_lc3_vertical, T298_lc3_leftOrAbove, T298_lc3_cached;
	double T298_lc3_m, T298_lc3_C, T298_lc3_borderX, T298_lc3_borderY;

	int T298_lc1_lastY = Integer.MIN_VALUE, T298_lc2_lastY = Integer.MIN_VALUE, T298_lc3_lastY = Integer.MIN_VALUE;
	int T298_r, T298_g, T298_b;

	int T299_initializedWithValidData = false, T299_okay = false;
	double T299_sx, T299_sy, T299_minx, T299_miny, T299_maxx, T299_maxy;

	int T299_lc1_horizontal, T299_lc1_vertical, T299_lc1_leftOrAbove, T299_lc1_cached;
	double T299_lc1_m, T299_lc1_C, T299_lc1_borderX, T299_lc1_borderY;

	int T299_lc2_horizontal, T299_lc2_vertical, T299_lc2_leftOrAbove, T299_lc2_cached;
	double T299_lc2_m, T299_lc2_C, T299_lc2_borderX, T299_lc2_borderY;

	int T299_lc3_horizontal, T299_lc3_vertical, T299_lc3_leftOrAbove, T299_lc3_cached;
	double T299_lc3_m, T299_lc3_C, T299_lc3_borderX, T299_lc3_borderY;

	int T299_lc1_lastY = Integer.MIN_VALUE, T299_lc2_lastY = Integer.MIN_VALUE, T299_lc3_lastY = Integer.MIN_VALUE;
	int T299_r, T299_g, T299_b;
};
