package hu.csega.encryption;

import java.io.ByteArrayOutputStream;
import java.util.Random;

import org.apache.commons.codec.binary.Base64;

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
		System.out.println(Base64.encodeBase64String(result));


		String encrypted = "...";
		byte[] input2 = Base64.decodeBase64(encrypted);
		result = encryptor.decrypt(input2);

		int index = 0;
		while(result[index] != (byte)('|'))
			index++;

		int size = Integer.parseInt(new String(result, 0, index, EncryptBytes.UTF8));
		System.out.println(size);

		index++;
		int offset = index;
		while(result[index] != (byte)('|'))
			index++;

		String contentType2 = new String(result, offset, index - offset, EncryptBytes.UTF8);
		System.out.println(contentType2);

		String content2 = new String(result, index+1, size, EncryptBytes.UTF8);
		System.out.println(content2);
	}

	private static final Random RANDOM = new Random(System.currentTimeMillis());
}
