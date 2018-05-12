package hu.csega.encryption;

import java.util.Random;

import org.apache.commons.codec.binary.Base64;

public class GenerateKeys {

	public static void main(String[] args) {
		byte[] key = new byte[128];
		RANDOM.nextBytes(key);
		String keyString = Base64.encodeBase64String(key);
		System.out.println("encryption.key=" + keyString);

		byte[] iv = new byte[128];
		RANDOM.nextBytes(iv);
		String ivString = Base64.encodeBase64String(iv);
		System.out.println("encryption.iv=" + ivString);
	}

	private static final Random RANDOM = new Random(System.currentTimeMillis());
}
