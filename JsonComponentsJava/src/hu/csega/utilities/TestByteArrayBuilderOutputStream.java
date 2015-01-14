package hu.csega.utilities;

public class TestByteArrayBuilderOutputStream {

	public static void main(String[] args) throws Exception {
		ByteArrayBuilderOutputStream[] implementations = 
			{
				new SimpleByteArrayBuilderOutputStream(),
				new WrapperByteArrayBuilderOutputStream(),
				new FibonacciByteArrayBuilderOutputStream(400)
			};
		
		for(ByteArrayBuilderOutputStream impl : implementations) {
			long start = System.currentTimeMillis();
			
			for(int len = 0; len < 56_600_000; len ++) {
				impl.write(len % 128);
			}
			
			System.out.println(impl.buildByteArray().length + " OK");
			
			long end = System.currentTimeMillis();
			System.out.println(impl.getClass().getSimpleName() + ": " + ((end - start) / 1000.0) + " sec");
			System.gc();
		}
	}

}
