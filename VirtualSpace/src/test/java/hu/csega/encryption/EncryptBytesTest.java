package hu.csega.encryption;

import java.io.ByteArrayOutputStream;
import java.util.Random;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

import junit.framework.TestCase;

public class EncryptBytesTest extends TestCase {

	public static void main(String[] args) {
		String text = "<html></html>";
		byte[] bytes = text.getBytes(EncryptBytes.UTF8);

		int contentLength = bytes.length;
		String contentType = "text/html; charset=utf-8";
		String header = contentLength + "|" + contentType + "|";
		byte[] headerBytes = header.getBytes(EncryptBytes.UTF8);

		int length = 0;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(headerBytes, 0, headerBytes.length);
		length += headerBytes.length;
		baos.write(bytes, 0, bytes.length);
		length += bytes.length;
		int modulo = length % EncryptBytes.BLOCK_SIZE;
		if(modulo != 0) {
			int remainingBytes = EncryptBytes.BLOCK_SIZE - modulo;
			byte[] rest = new byte[remainingBytes];
			RANDOM.nextBytes(rest);
			baos.write(rest, 0, rest.length);
		}

		byte[] input = baos.toByteArray();
		System.out.println(input.length);

		EncryptBytes encryptor = new EncryptBytes();
		byte[] result = encryptor.encrypt(input);
		System.out.println(Base64.encode(result));
	}

	private static final Random RANDOM = new Random(System.currentTimeMillis());
}
