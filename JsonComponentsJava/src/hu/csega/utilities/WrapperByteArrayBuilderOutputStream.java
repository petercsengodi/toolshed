package hu.csega.utilities;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class WrapperByteArrayBuilderOutputStream extends ByteArrayBuilderOutputStream {

	private ByteArrayOutputStream stream;
	
	public WrapperByteArrayBuilderOutputStream() {
		stream = new ByteArrayOutputStream();
	}
	
	@Override
	public void write(int b) throws IOException {
		stream.write(b);
	}

	@Override
	public byte[] buildByteArray() {
		return stream.toByteArray();
	}

	@Override
	public void write(byte[] b, int off, int len) throws IOException {
		stream.write(b, off, len);
	}
}
