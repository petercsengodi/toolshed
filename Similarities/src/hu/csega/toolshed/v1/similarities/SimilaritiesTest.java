package hu.csega.toolshed.v1.similarities;

import java.util.Arrays;

public class SimilaritiesTest {

	public static void main(String[] args) throws Exception {
		byte[] test1 = new byte[] {1, 2, 3, 4, 3, 2, 1, 6, 3, 1, 3, 5, 2, 2};

		byte[] test2 = new byte[] {4, 0, 1, 3, 4, 3, 5, 7, 9, 7, 5, 3, 4, 5};
		
		int counter = 0;
		long l = Long.MAX_VALUE;
		while(l > 0) {
			counter ++;
			l = l / 2;
		}
		
		System.out.println(counter );
		
		Converter converter = new Converter(6, 6);
		converter.createLong(test1, 0);
		Long[] test1l = converter.createLongArray(test1);
		Long[] test2l = converter.createLongArray(test2);
		for(int i = 0; i < test1l.length; i++) {
			for(int j = 0; j < test2l.length; j++) {
				if(Math.abs(test2l[j] - test1l[i]) < 100) {
					System.out.println("Pos1: " + i + " Pos2: " + j);
				}
			}
		}
	}

}
