package hu.csega.encryption;

import java.nio.charset.Charset;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import hu.csega.virtual.space.VirtualSpaceProperties;

public class EncryptBytes {

	public static final int BLOCK_SIZE = 2048;

	public static final Charset UTF8 = Charset.forName("UTF-8");

	private byte[] keyBytes;
	private byte[] ivBytes;

	public EncryptBytes() {
		this.keyBytes = VirtualSpaceProperties.ENCRYPTION_KEY;
		this.ivBytes = VirtualSpaceProperties.ENCRYPTION_IV;
	}

	public byte[] encrypt(byte[] input) {
		try {
			SecretKeySpec key = new SecretKeySpec(keyBytes, "AES");
			IvParameterSpec iv = new IvParameterSpec(ivBytes);
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, key, iv);

            byte[] encrypted = cipher.doFinal(input);
			return encrypted;
		} catch(Exception ex) {
			throw new RuntimeException("Error during encryption!", ex);
		}
	}

	public byte[] decrypt(byte[] input) {
		try {
	        SecretKeySpec skeySpec = new SecretKeySpec(keyBytes, "AES");
	        IvParameterSpec iv = new IvParameterSpec(ivBytes);

	        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
	        cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);

	        byte[] original = cipher.doFinal(input);
			return original;
		} catch(Exception ex) {
			throw new RuntimeException("Error during encryption!", ex);
		}
	}
}
