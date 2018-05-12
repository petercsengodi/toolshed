package hu.csega.encryption;

import java.nio.charset.Charset;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EncryptBytes {

	public static final int BLOCK_SIZE = 2048;

	public static final Charset UTF8 = Charset.forName("UTF-8");

	private byte[] input;
	private byte[] keyBytes;
	private byte[] ivBytes;

	public byte[] encrypt(byte[] input) {
		try {
			SecretKeySpec key = new SecretKeySpec(keyBytes, "DES");
			IvParameterSpec ivSpec = new IvParameterSpec(ivBytes);
			Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");

			cipher.init(Cipher.ENCRYPT_MODE, key, ivSpec);
			byte[] encrypted = new byte[cipher.getOutputSize(input.length)];
			return encrypted;
		} catch(Exception ex) {
			throw new RuntimeException("Error during encryption!", ex);
		}
	}
}
