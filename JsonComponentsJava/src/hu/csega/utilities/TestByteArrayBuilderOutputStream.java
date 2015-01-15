package hu.csega.utilities;

import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestByteArrayBuilderOutputStream {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBlockBoundary() throws Exception {
		int[] sizes = new int[] {900, 1000, 1000};
		for(int blockSize : sizes) {
			SimpleByteArrayBuilderOutputStream stream = new SimpleByteArrayBuilderOutputStream(blockSize);
			
			for(int i = 0; i < blockSize; i++) {
				stream.write(1);
			}
			
			stream.close();
			byte[] ret = stream.buildByteArray();
			check(ret, blockSize);
		}
	}
	
	@Test
	public void testBricks() throws Exception {
		int[] sizes = new int[] {200, 300, 400};
		for(int brickSize : sizes) {
			byte[] brick = create(brickSize);
			int blockSize = 1000;
			SimpleByteArrayBuilderOutputStream stream = new SimpleByteArrayBuilderOutputStream(blockSize);
			
			for(int i = 0; i < 5; i++) {
				stream.write(brick);
			}
			
			stream.close();
			byte[] ret = stream.buildByteArray();
			check(ret, 5 * brickSize);
		}
	}
	
	@Test
	public void testBricks2() throws Exception {
		int[] sizes = new int[] {200, 300, 400};
		for(int brickSize : sizes) {
			byte[] brick = create(brickSize + 2);
			brick[0] = 0;
			brick[brickSize + 1] = 0;
			
			int blockSize = 1000;
			SimpleByteArrayBuilderOutputStream stream = new SimpleByteArrayBuilderOutputStream(blockSize);
			
			for(int i = 0; i < 5; i++) {
				stream.write(brick, 1, brickSize);
			}

			stream.close();
			byte[] ret = stream.buildByteArray();
			check(ret, 5 * brickSize);
		}
	}
	private static byte[] create(int len) {
		byte[] ret = new byte[len];
		
		for(int i = 0; i < len; i++) {
			ret[i] = 1;
		}
		
		return ret;
	}
	
	private static void check(byte[] array, int len) {
		if(array.length != len) {
			fail("Length is not ok.");
		}
		
		for(int i = 0; i < len; i ++) {
			if(array[i] != 1) {
				fail("Byte at " + i + " is not 1.");
			}
		}
	}
	
	/** -Xmx512m */
	public static void main(String[] args) throws Exception {
		for(int n = 0; n < 3; n++) {
			main2(args);
			System.gc();
		}
	}
	
	public static void main2(String[] args) throws Exception {
		ByteArrayBuilderOutputStream[] implementations = 
			{
				new WrapperByteArrayBuilderOutputStream(),
				new SimpleByteArrayBuilderOutputStream(60_000),
				new SimpleByteArrayBuilderOutputStream(250_000),
				new FibonacciByteArrayBuilderOutputStream(250_000),
				new FibonacciByteArrayBuilderOutputStream(1_000_000)
			};
		
		int length = 90_600_000;

		for(ByteArrayBuilderOutputStream impl : implementations) {
			try {
				long start = System.currentTimeMillis();
				
				for(int len = 0; len < length; len ++) {
					impl.write(len % 128);
				}
				
				System.out.println(impl.buildByteArray().length + " OK");
				
				long end = System.currentTimeMillis();
				System.out.println(impl.getClass().getSimpleName() + ": " + ((end - start) / 1000.0) + " sec");
				impl.dispose();
			} catch(OutOfMemoryError e) {
				System.out.println(impl.getClass().getSimpleName() + ": error");
			}
			System.gc();
		}
		
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			long start = System.currentTimeMillis();
			
			for(int i = 0; i < length; i++) {
				stream.write(i % 128);
			}
			
			System.out.println(stream.toByteArray().length + " OK");
			
			long end = System.currentTimeMillis();
			System.out.println(stream.getClass().getSimpleName() + ": " + ((end - start) / 1000.0) + " sec");
		} catch(OutOfMemoryError e) {
			System.out.println(ByteArrayOutputStream.class.getSimpleName() + ": error");
		}

		
		System.gc();
		
		byte[] tmp = create(300);
		int size = length / 300;
		
		implementations = 
			new ByteArrayBuilderOutputStream[] {
				new WrapperByteArrayBuilderOutputStream(),
				new SimpleByteArrayBuilderOutputStream(60_000),
				new SimpleByteArrayBuilderOutputStream(250_000),
				new FibonacciByteArrayBuilderOutputStream(250_000),
				new FibonacciByteArrayBuilderOutputStream(1_000_000)
			};
		
		for(ByteArrayBuilderOutputStream impl : implementations) {
			try {
				long start = System.currentTimeMillis();
				
				for(int i = 0; i < size; i++) {
					impl.write(tmp);
				}
				
				System.out.println(impl.buildByteArray().length + " OK");
				
				long end = System.currentTimeMillis();
				System.out.println(impl.getClass().getSimpleName() + ": " + ((end - start) / 1000.0) + " sec");
				impl.dispose();
			} catch(OutOfMemoryError e) {
				System.out.println(impl.getClass().getSimpleName() + ": error");
			}
			System.gc();
		}
		
		try {
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			long start = System.currentTimeMillis();
			
			for(int i = 0; i < size; i++) {
				stream.write(tmp);
			}
			
			System.out.println(stream.toByteArray().length + " OK");
			
			long end = System.currentTimeMillis();
			System.out.println(stream.getClass().getSimpleName() + ": " + ((end - start) / 1000.0) + " sec");
		} catch(OutOfMemoryError e) {
			System.out.println(ByteArrayOutputStream.class.getSimpleName() + ": error");
		}
	}

}
