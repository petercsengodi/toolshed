package hu.csega.toolshed.v1.similarities;

import java.util.Arrays;

public class Converter {

	private int length;
	private int bits;
	
	public Converter(int length, int bits) {
		this.length = length;
		this.bits = bits;
	}

	
	Long[] createLongArray(byte[] array) {
		int len = array.length;
		Long[] ret = new Long[len];
		
		for(int offset = 0; offset < len; offset++) {
			ret[offset] = createLong(array, offset);
		}
		
		return ret;
	}
	
	long createLong(byte[] array, int offset) {
		int len = array.length;
		Double[] tmp = new Double[length];
		
		for(int i = 0; i < length; i++) {
			tmp[i] = (double)array[(offset + i) % len];
		}
		
		// System.out.println("0.: " + Arrays.asList(tmp));
		
		// 1. számsorozat középre tolása
		{
			double min = tmp[0];
			double max = tmp[0];
			for(int i = 1; i < length; i++) {
				min = Math.min(min, tmp[i]);
				max = Math.max(max, tmp[i]);
			}
			
			double avg = (max + min) / 2;
			for(int i = 0; i < length; i++) {
				tmp[i] -= avg; 
			}
			
			// System.out.println("1.: " + Arrays.asList(tmp));
		}
		
		// 2. összezsugorítás
		{
			double max = tmp[0];
			for(int i = 1; i < length; i++) {
				max = Math.max(max, tmp[i]);
			}
			
			if(max != 0) {
				for(int i = 0; i < length; i++) {
					tmp[i] /= max; 
				}
			}
			
			// System.out.println("2.: " + Arrays.asList(tmp));
		}

		// 3. a legelső elemet kivonjuk mindből 
		{
			double val = tmp[0];
			for(int i = 0; i < length; i++) {
				tmp[i] -= val; 
			}
			
			// System.out.println("3.: " + Arrays.asList(tmp));
		}

		// 4. mindből kivonjuk az előtte lévő elemet 
		{
			for(int i = length - 1; i > 0; i--) {
				tmp[i] -= tmp[i - 1]; 
			}
			
			// System.out.println("4.: " + Arrays.asList(tmp));
		}

		// 5. összezsugorítás (2)
		{
			double max = Math.abs(tmp[0]);
			for(int i = 1; i < length; i++) {
				max = Math.max(max, Math.abs(tmp[i]));
			}
			
			if(max != 0) {
				for(int i = 0; i < length; i++) {
					tmp[i] = (tmp[i] / max / 2) + 0.5; ; 
				}
			}
			
			// System.out.println("5.: " + Arrays.asList(tmp));
		}
		
		// 6. a 0 és 1 közötti értékeket bits számon ábrázoljuk
		// és összesítjük
		long acc = 0;

		{
			double limit = 1.0;
			for(int b = 0; b < bits; b++) {
				limit /= 2;
				for(int i = 0; i < length; i++) {
					acc = addbit(acc, tmp[i] > limit);
					if(tmp[i] > limit) {
						tmp[i] -= limit;
					}
				}

				// System.out.println("6. (" + limit + "): " + Arrays.asList(tmp) + " [" + acc + "]");
			}
		}

		return acc;
	}
	
	private long addbit(long acc, boolean bit) {
		return acc * 2 + (bit ? 1 : 0);
	}
	
}
