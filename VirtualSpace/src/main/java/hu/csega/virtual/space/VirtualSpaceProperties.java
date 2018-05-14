package hu.csega.virtual.space;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.codec.binary.Base64;

public class VirtualSpaceProperties {

	private static final Properties PROPERTIES = new Properties();

	public static final String CONNECTION_USERNAME;
	public static final String CONNECTION_PASSWORD;
	public static final String CONNECTION_ENDPOINT;
	public static final byte[] ENCRYPTION_KEY;
	public static final byte[] ENCRYPTION_IV;

	static {
		try (InputStream is = new FileInputStream("config/config.properties")) {
			PROPERTIES.load(is);

			CONNECTION_USERNAME = PROPERTIES.getProperty("connection.username");
			CONNECTION_PASSWORD = PROPERTIES.getProperty("connection.password");
			CONNECTION_ENDPOINT = PROPERTIES.getProperty("connection.endpoint");
			ENCRYPTION_KEY = Base64.decodeBase64(PROPERTIES.getProperty("encryption.key"));
			ENCRYPTION_IV = Base64.decodeBase64(PROPERTIES.getProperty("encryption.iv"));
		} catch(Exception ex) {
			throw new RuntimeException("Error loading properties!", ex);
		}
	}

}
