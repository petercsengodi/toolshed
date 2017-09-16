package hu.csega.image.generate.tiangledrawing;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

import hu.csega.image.triangles.MultipleTriangles;
import hu.csega.image.triangles.SingleTriangle;

public class GenerateTriangleDrawingAlgorithm {

	private static final int PIECES_IN_A_BLOCK = 30;
	private static final int NUMBER_OF_BLOCKS = 10;
	private static final int NUMBER_OF_TRIANGLES = NUMBER_OF_BLOCKS * PIECES_IN_A_BLOCK; // 300
	private static final String GENERATED_JAVA_DRAWER = "/AnImageDegrader/src/main/java/hu/csega/image/triangles/GeneratedTriangleDrawer.java";
	private static final String GENERATED_JAVA_LOADER = "/AnImageDegrader/src/main/java/hu/csega/image/triangles/GeneratedTriangleLoader.java";
	private static final String GENERATED_CPP_DRAWER = "/AlgorithmsInCpp/src/GeneratedTriangleDrawer.cpp";
	
	private static final Charset CHARSET;
	
	static {
		CHARSET = Charset.forName("UTF-8");
	}

	private static OutputStreamWriter writer;
	
	public static void print(String s) {
		try {
			writer.write(s);
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}
	
	public static void print(int tabs, String s) {
		try {
			for(int i = 0; i < tabs; i++)
				writer.write("\t");
			writer.write(s);
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}

	public static void print(int tabs, String s, Object... objects) {
		try {
			for(int i = 0; i < tabs; i++)
				writer.write("\t");

			if(objects != null) {
				for(int i = 0; i < objects.length; i++) {
					Object o = objects[i];
					s = s.replace("$" + (i+1), o == null ? "null" : o.toString());
				}
			}
			
			writer.write(s);
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}

	public static void println() {
		try {
			writer.write("\n");
			writer.flush();
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}
	
	public static void println(String s) {
		try {
			writer.write(s);
			writer.write("\n");
			writer.flush();
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}

	public static void println(int tabs, String s) {
		try {
			for(int i = 0; i < tabs; i++)
				writer.write("\t");
			writer.write(s);
			writer.write("\n");
			writer.flush();
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}

	public static void println(int tabs, String s, Object... objects) {
		try {
			for(int i = 0; i < tabs; i++)
				writer.write("\t");

			if(objects != null) {
				for(int i = 0; i < objects.length; i++) {
					Object o = objects[i];
					s = s.replace("$" + (i+1), o == null ? "null" : o.toString());
				}
			}
			
			writer.write(s);
			writer.write("\n");
			writer.flush();
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}

	public static void main(String[] args) {
		File f = new File(System.getProperty("user.dir"));
		String rootPath = f.getAbsolutePath();
		System.out.println("Current folder: " + rootPath);
		int index = rootPath.indexOf("/AnImageDegrader");
		if(index > 0) {
			rootPath = rootPath.substring(0, index);
		}

		System.out.println("Root Path: " + rootPath);
		String filename;
		
		filename = rootPath + GENERATED_JAVA_DRAWER;		
		try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(filename), CHARSET)) {
			GenerateTriangleDrawingAlgorithm.writer = writer;
			generateJavaAlgorithm();
		} catch(Throwable t) {
			t.printStackTrace();
		}
		
		GenerateTriangleDrawingAlgorithm.writer = null;
		System.out.println("Generated: " + filename);
		
		filename = rootPath + GENERATED_JAVA_LOADER;
		try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(rootPath + GENERATED_JAVA_LOADER), CHARSET)) {
			GenerateTriangleDrawingAlgorithm.writer = writer;
			generateJavaLoader();
		} catch(Throwable t) {
			t.printStackTrace();
		}
		
		GenerateTriangleDrawingAlgorithm.writer = null; 
		System.out.println("Generated: " + filename);

		filename = rootPath + GENERATED_CPP_DRAWER;
		try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(rootPath + GENERATED_CPP_DRAWER), CHARSET)) {
			GenerateTriangleDrawingAlgorithm.writer = writer;
			generateCppAlgorithm();
		} catch(Throwable t) {
			t.printStackTrace();
		}
		
		GenerateTriangleDrawingAlgorithm.writer = null; 
		System.out.println("Generated: " + filename);
	}

	private static void generateCppAlgorithm() {
		println("using namespace std;");
		println();
		println("class GeneratedTriangleDrawer {");
		
		println("private:");
		int TAB = 1;
		
		for(int i = 0; i < NUMBER_OF_TRIANGLES; i++) {
			println();
			println(TAB, "int T$1_initializedWithValidData = false, T$1_okay = false;", i);
			println(TAB, "double T$1_sx, T$1_sy, T$1_minx, T$1_miny, T$1_maxx, T$1_maxy;", i);
			println();
			println(TAB, "int T$1_lc1_horizontal, T$1_lc1_vertical, T$1_lc1_leftOrAbove, T$1_lc1_cached;", i);
			println(TAB, "double T$1_lc1_m, T$1_lc1_C, T$1_lc1_borderX, T$1_lc1_borderY;", i);
			println();
			println(TAB, "int T$1_lc2_horizontal, T$1_lc2_vertical, T$1_lc2_leftOrAbove, T$1_lc2_cached;", i);
			println(TAB, "double T$1_lc2_m, T$1_lc2_C, T$1_lc2_borderX, T$1_lc2_borderY;", i);
			println();
			println(TAB, "int T$1_lc3_horizontal, T$1_lc3_vertical, T$1_lc3_leftOrAbove, T$1_lc3_cached;", i);
			println(TAB, "double T$1_lc3_m, T$1_lc3_C, T$1_lc3_borderX, T$1_lc3_borderY;", i);
			println();
			println(TAB, "int T$1_lc1_lastY = Integer.MIN_VALUE, T$1_lc2_lastY = Integer.MIN_VALUE, T$1_lc3_lastY = Integer.MIN_VALUE;", i);
			println(TAB, "int T$1_r, T$1_g, T$1_b;", i);
		}
		
		println("};");
	}

	private static void generateJavaAlgorithm() {
		println("package hu.csega.image.triangles;");
		println();
		println("/** not thread-safe */");
		println("public class GeneratedTriangleDrawer {");
	
		int TAB = 1;

		println();
		println(TAB, "private GeneratedTriangleLoader loader;");

		println();
		println(TAB, "public GeneratedTriangleDrawer() {");
		println(TAB+1, "loader = new GeneratedTriangleLoader();");
		println(TAB+1, "loader.drawer = this;");
		println(TAB, "}");
		
		println();
		println(TAB, "int offset = 0, r, g, b, x, y;");
		
		for(int i = 0; i < NUMBER_OF_TRIANGLES; i++) {
			println();
			println(TAB, "boolean T$1_initializedWithValidData = false, T$1_okay = false;", i);
			println(TAB, "double T$1_sx, T$1_sy, T$1_minx, T$1_miny, T$1_maxx, T$1_maxy;", i);
			println(TAB, "boolean T$1_lc1_horizontal, T$1_lc1_vertical, T$1_lc1_leftOrAbove, T$1_lc1_cached;", i);
			println(TAB, "double T$1_lc1_m, T$1_lc1_C, T$1_lc1_borderX, T$1_lc1_borderY;", i);
			println(TAB, "boolean T$1_lc2_horizontal, T$1_lc2_vertical, T$1_lc2_leftOrAbove, T$1_lc2_cached;", i);
			println(TAB, "double T$1_lc2_m, T$1_lc2_C, T$1_lc2_borderX, T$1_lc2_borderY;", i);
			println(TAB, "boolean T$1_lc3_horizontal, T$1_lc3_vertical, T$1_lc3_leftOrAbove, T$1_lc3_cached;", i);
			println(TAB, "double T$1_lc3_m, T$1_lc3_C, T$1_lc3_borderX, T$1_lc3_borderY;", i);
			println(TAB, "int T$1_r, T$1_g, T$1_b, T$1_lc1_lastY = Integer.MIN_VALUE, T$1_lc2_lastY = Integer.MIN_VALUE, T$1_lc3_lastY = Integer.MIN_VALUE;", i);
		}

		int block = 0;

		println();
		println(TAB, "public void moveToY(int y) {");
		for(int j = 0; j < NUMBER_OF_BLOCKS; j++) {
			println(TAB+1, "moveToY$1(y);", j+1);
		}
		println(TAB, "}");

		for(int i = 0; i < NUMBER_OF_TRIANGLES; i++) {
			
			if(i % PIECES_IN_A_BLOCK == 0) {
		 		println();
		 		block++;
				println(TAB, "public void moveToY$1(int y) {", block);
				TAB++;
			}
			
			println();

			println(TAB, "if(T$1_initializedWithValidData) {", i);
			println(TAB+1, "if(y < T$1_miny || y > T$1_maxy) {", i);
			println(TAB+2, "T$1_okay = false;", i);
			println(TAB+1, "} else {", i);
			println(TAB+2, "T$1_okay = true;", i);
			println(TAB+2, "if(T$1_lc1_horizontal) {", i);
			println(TAB+3, "T$1_lc1_cached = (T$1_lc1_leftOrAbove ? y <= T$1_lc1_borderY : y >= T$1_lc1_borderY);", i);
			println(TAB+2, "} else if(T$1_lc1_vertical) {", i);
			println(TAB+3, "// nothing", i);
			println(TAB+2, "} else {", i);
			println(TAB+3, "if(T$1_lc1_lastY == y - 1) {", i);
			println(TAB+4, "T$1_lc1_borderX += T$1_lc1_m;", i);
			println(TAB+4, "T$1_lc1_lastY++;", i);
			println(TAB+3, "} else {", i);
			println(TAB+4, "T$1_lc1_borderX = y*T$1_lc1_m + T$1_lc1_C;", i);
			println(TAB+4, "T$1_lc1_lastY = y;", i);
			println(TAB+3, "}", i);
			println(TAB+2, "}", i);
			println(TAB+2, "if(T$1_lc2_horizontal) {", i);
			println(TAB+3, "T$1_lc2_cached = (T$1_lc2_leftOrAbove ? y <= T$1_lc2_borderY : y >= T$1_lc2_borderY);", i);
			println(TAB+2, "} else if(T$1_lc2_vertical) {", i);
			println(TAB+3, "// nothing", i);
			println(TAB+2, "} else {", i);
			println(TAB+3, "if(T$1_lc2_lastY == y - 1) {", i);
			println(TAB+4, "T$1_lc2_borderX += T$1_lc2_m;", i);
			println(TAB+4, "T$1_lc2_lastY++;", i);
			println(TAB+3, "} else {", i);
			println(TAB+4, "T$1_lc2_borderX = y*T$1_lc2_m + T$1_lc2_C;", i);
			println(TAB+4, "T$1_lc2_lastY = y;", i);
			println(TAB+3, "}", i);
			println(TAB+2, "}", i);
			println(TAB+2, "if(T$1_lc3_horizontal) {", i);
			println(TAB+3, "T$1_lc3_cached = (T$1_lc3_leftOrAbove ? y <= T$1_lc3_borderY : y >= T$1_lc3_borderY);", i);
			println(TAB+2, "} else if(T$1_lc3_vertical) {", i);
			println(TAB+3, "// nothing", i);
			println(TAB+2, "} else {", i);
			println(TAB+3, "if(T$1_lc3_lastY == y - 1) {", i);
			println(TAB+4, "T$1_lc3_borderX += T$1_lc3_m;", i);
			println(TAB+4, "T$1_lc3_lastY++;", i);
			println(TAB+3, "} else {", i);
			println(TAB+4, "T$1_lc3_borderX = y*T$1_lc3_m + T$1_lc3_C;", i);
			println(TAB+4, "T$1_lc3_lastY = y;", i);
			println(TAB+3, "}", i);
			println(TAB+2, "}", i);
			println(TAB+1, "}", i);
			println(TAB, "}", i);

			if((i+1) % PIECES_IN_A_BLOCK == 0) {
				TAB--;
				println(TAB, "}"); // end of moveToY
			}
			
		}

		block = 0;
		
		for(int i = NUMBER_OF_TRIANGLES-1; i >= 0; i--) { // we check with the last triangle first
			if((i+1) % PIECES_IN_A_BLOCK == 0) {
				block++;
				println();
				println(TAB, "private boolean drawPart$1() {", block);
				TAB++;
			}

			println(TAB, "if(T$1_okay && x >= T$1_minx && x <= T$1_maxx", i);
			println(TAB, "&& (T$1_lc1_horizontal ? T$1_lc1_cached : (T$1_lc1_leftOrAbove ? x <= T$1_lc1_borderX : x >= T$1_lc1_borderX))", i);
			println(TAB, "&& (T$1_lc2_horizontal ? T$1_lc2_cached : (T$1_lc2_leftOrAbove ? x <= T$1_lc2_borderX : x >= T$1_lc2_borderX))", i);
			println(TAB, "&& (T$1_lc3_horizontal ? T$1_lc3_cached : (T$1_lc3_leftOrAbove ? x <= T$1_lc3_borderX : x >= T$1_lc3_borderX))", i);
			println(TAB, ") { r = T$1_r; g = T$1_g; b = T$1_b; return true; } ", i);
			println();

			
			if(i % PIECES_IN_A_BLOCK == 0) {
				println(TAB, "return false;");
				TAB--;
				println(TAB, "}"); // end of drawPart
			}
			
		}

		
		println();
		println(TAB, "public void draw(int[] rgb, int width, int height, MultipleTriangles mt, int clearR, int clearG, int clearB) {");
		println(TAB+1, "SingleTriangle[] triangles = mt.triangles;");
		println(TAB+1, "loader.loadTriangles(triangles);");
		println();
		println(TAB+1, "offset = 0;");
		println(TAB+1, "for(y = 0; y < height; y++) {");
		println(TAB+2, "moveToY(y);");
		println();
		println(TAB+2, "for(x = 0; x < width; x++) {");
		println(TAB+3, "r = clearR; g = clearG; b = clearB;");
		
		for(int j = 0; j < NUMBER_OF_BLOCKS; j++) {
			if(j == NUMBER_OF_BLOCKS - 1) {
				println(TAB+3, "drawPart$1();", j+1);
				break;
			}
			println(TAB+3, "if(!drawPart$1())", j+1);
		}
		
		println(TAB+3, "rgb[offset++] = r; rgb[offset++] = g; rgb[offset++] = b;");
		println(TAB+2, "}");
		println();
		println(TAB+1, "}");
		println();
		println(TAB, "}"); // end if draw

		
		println("}");
	}

	private static void generateJavaLoader() {
		println("package hu.csega.image.triangles;");
		println();
		println("public class GeneratedTriangleLoader {");
	
		int TAB = 1;
		
		println();
		println(TAB, "GeneratedTriangleDrawer drawer;");

		println();
		println(TAB, "public void loadTriangles(SingleTriangle[] triangles) {");
		for(int j = 0; j < NUMBER_OF_BLOCKS; j++) {
			println(TAB+1, "loadTriangles$1(triangles);", j+1);
		}
		println(TAB, "}");

		int block = 0;

		for(int i = 0; i < NUMBER_OF_TRIANGLES; i++) {
			
			if(i % PIECES_IN_A_BLOCK == 0) {
		 		println();
		 		block++;
				println(TAB, "public void loadTriangles$1(SingleTriangle[] triangles) {", block);
				TAB++;
				println(TAB, "int x1, y1, x2, y2, x3, y3;");
				println(TAB, "SingleTriangle t;");
			}
			
			println();
			println(TAB, "t = triangles[$1]; x1 = t.x[0]; x2 = t.x[1]; x3 = t.x[2]; y1 = t.y[0]; y2 = t.y[1]; y3 = t.y[2]; drawer.T$1_r = t.r; drawer.T$1_g = t.g; drawer.T$1_b = t.b;", i);
			println();
			println(TAB, "if((x1 == x2 && y1 == y2) || (x1 == x3 && y1 == y3) || (x3 == x2 && y3 == y2)) {", i);
			println(TAB+1, "drawer.T$1_initializedWithValidData = false;", i);
			println(TAB, "} else {", i); TAB++;
			println();
			println(TAB, "drawer.T$1_sx = (x1 + x2 + x3) / 3.0;", i);
			println(TAB, "drawer.T$1_sy = (y1 + y2 + y3) / 3.0;", i);
			println();
			println(TAB, "if(y1 == y2) {", i);
			println(TAB+1, "drawer.T$1_lc1_horizontal = true;", i);
			println(TAB+1, "drawer.T$1_lc1_vertical = false;", i);
			println(TAB+1, "drawer.T$1_lc1_borderY = y1;", i);
			println(TAB+1, "drawer.T$1_lc1_leftOrAbove = (drawer.T$1_sy <= y1);", i);
			println(TAB, "} else if(x1 == x2) {", i);
			println(TAB+1, "drawer.T$1_lc1_horizontal = false;", i);
			println(TAB+1, "drawer.T$1_lc1_vertical = true;", i);
			println(TAB+1, "drawer.T$1_lc1_borderX = x1;", i);
			println(TAB+1, "drawer.T$1_lc1_leftOrAbove = (drawer.T$1_sx <= x1);", i);
			println(TAB, "} else {", i);
			println(TAB+1, "drawer.T$1_lc1_horizontal = false;", i);
			println(TAB+1, "drawer.T$1_lc1_vertical = false;", i);
			println(TAB+1, "drawer.T$1_lc1_m = (x2 - x1) / (double)(y2 - y1);", i);
			println(TAB+1, "drawer.T$1_lc1_C = x1 - drawer.T$1_lc1_m * y1;", i);
			println(TAB+1, "drawer.T$1_lc1_leftOrAbove = (drawer.T$1_sx < drawer.T$1_lc1_m*drawer.T$1_sy + drawer.T$1_lc1_C);", i);
			println(TAB, "}", i);
			println();
			println(TAB, "if(y2 == y3) {", i);
			println(TAB+1, "drawer.T$1_lc2_horizontal = true;", i);
			println(TAB+1, "drawer.T$1_lc2_vertical = false;", i);
			println(TAB+1, "drawer.T$1_lc2_borderY = y2;", i);
			println(TAB+1, "drawer.T$1_lc2_leftOrAbove = (drawer.T$1_sy <= y2);", i);
			println(TAB, "} else if(x2 == x3) {", i);
			println(TAB+1, "drawer.T$1_lc2_horizontal = false;", i);
			println(TAB+1, "drawer.T$1_lc2_vertical = true;", i);
			println(TAB+1, "drawer.T$1_lc2_borderX = x2;", i);
			println(TAB+1, "drawer.T$1_lc2_leftOrAbove = (drawer.T$1_sx <= x2);", i);
			println(TAB, "} else {", i);
			println(TAB+1, "drawer.T$1_lc2_horizontal = false;", i);
			println(TAB+1, "drawer.T$1_lc2_vertical = false;", i);
			println(TAB+1, "drawer.T$1_lc2_m = (x3 - x2) / (double)(y3 - y2);", i);
			println(TAB+1, "drawer.T$1_lc2_C = x2 - drawer.T$1_lc2_m * y2;", i);
			println(TAB+1, "drawer.T$1_lc2_leftOrAbove = (drawer.T$1_sx < drawer.T$1_lc2_m*drawer.T$1_sy + drawer.T$1_lc2_C);", i);
			println(TAB, "}", i);
			println();
			println(TAB, "if(y3 == y1) {", i);
			println(TAB+1, "drawer.T$1_lc3_horizontal = true;", i);
			println(TAB+1, "drawer.T$1_lc3_vertical = false;", i);
			println(TAB+1, "drawer.T$1_lc3_borderY = y3;", i);
			println(TAB+1, "drawer.T$1_lc3_leftOrAbove = (drawer.T$1_sy <= y3);", i);
			println(TAB, "} else if(x3 == x1) {", i);
			println(TAB+1, "drawer.T$1_lc3_horizontal = false;", i);
			println(TAB+1, "drawer.T$1_lc3_vertical = true;", i);
			println(TAB+1, "drawer.T$1_lc3_borderX = x3;", i);
			println(TAB+1, "drawer.T$1_lc3_leftOrAbove = (drawer.T$1_sx <= x3);", i);
			println(TAB, "} else {", i);
			println(TAB+1, "drawer.T$1_lc3_horizontal = false;", i);
			println(TAB+1, "drawer.T$1_lc3_vertical = false;", i);
			println(TAB+1, "drawer.T$1_lc3_m = (x1 - x3) / (double)(y1 - y3);", i);
			println(TAB+1, "drawer.T$1_lc3_C = x3 - drawer.T$1_lc3_m * y3;", i);
			println(TAB+1, "drawer.T$1_lc3_leftOrAbove = (drawer.T$1_sx < drawer.T$1_lc3_m*drawer.T$1_sy + drawer.T$1_lc3_C);", i);
			println(TAB, "}", i);
			println();
			println(TAB, "drawer.T$1_minx = Math.min(Math.min(x1, x2), x3);", i);
			println(TAB, "drawer.T$1_miny = Math.min(Math.min(y1, y2), y3);", i);
			println(TAB, "drawer.T$1_maxx = Math.max(Math.max(x1, x2), x3);", i);
			println(TAB, "drawer.T$1_maxy = Math.max(Math.max(y1, y2), y3);", i);
			println();
			println(TAB, "drawer.T$1_initializedWithValidData = true;", i);
			TAB--; println(TAB, "}", i);

			if((i+1) % PIECES_IN_A_BLOCK == 0) {
				TAB--;
				println(TAB, "}"); // end of loadTriangles
			}
			
		}
		
		println("}");
	}
	
}
