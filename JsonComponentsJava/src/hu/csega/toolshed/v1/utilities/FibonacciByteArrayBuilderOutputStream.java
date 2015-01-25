package hu.csega.toolshed.v1.utilities;

public class FibonacciByteArrayBuilderOutputStream extends SimpleByteArrayBuilderOutputStream {

	private int fibo1 = 0;
	private int fibo2 = 1;
	
	public FibonacciByteArrayBuilderOutputStream() {
		this(65536);
	}
	
	public FibonacciByteArrayBuilderOutputStream(int blockSize) {
		super(blockSize);
	}
	
	@Override
	protected int getNextBlockSize() {
		int prev = fibo2;
		fibo2 = fibo1 + fibo2;
		fibo1 = prev;
		return prev;
	}
}
