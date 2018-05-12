package hu.csega.moap;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Properties;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;

public class Util {

	public static String downloadContent(String url) throws IOException, MalformedURLException {
		String documentContent;
    	try (InputStream stream = new URL(url).openStream()) {
    		byte[] payload = Util.readPayload(stream);
    		documentContent = new String(payload, Util.CHARSET_UTF_8);
    	}
		return documentContent;
	}

	public static byte[] readPayload(HttpServletRequest request) {
    	try (InputStream inputStream = request.getInputStream()) {
    		return readPayload(inputStream);
    	} catch (IOException ex) {
			throw new RuntimeException("Error reading the payload!", ex);
		}
	}

	public static byte[] readPayload(InputStream inputStream) throws IOException {
    	ByteArrayOutputStream ostream = new ByteArrayOutputStream();

		int read;
		while((read = inputStream.read()) > -1) {
			ostream.write(read);
		}

    	return ostream.toByteArray();
    }

	public static Properties convertPayloadToProperties(byte[] payload) {
		Properties props = new Properties();

		String str = new String(payload, CHARSET_UTF_8);
		StringTokenizer outerTokenizer = new StringTokenizer(str, "&");

		try {

			while(outerTokenizer.hasMoreTokens()) {

				String pair = outerTokenizer.nextToken();
				StringTokenizer innerTokenizer = new StringTokenizer(pair, "=");

				String key = URLDecoder.decode(innerTokenizer.nextToken(), "UTF-8");
				String value = URLDecoder.decode(innerTokenizer.nextToken(), "UTF-8");

				props.setProperty(key, value);
			}

		} catch(UnsupportedEncodingException ex) {
			throw new RuntimeException("Error reading key-value pairs!", ex);
		}

		return props;
	}

	public static String emptyToNull(Object obj) {
    	if(obj == null)
    		return null;

    	String str = obj.toString();
    	str = str.trim();
    	return (str.length() == 0) ? null : str;
    }

	public static String nullToEmpty(Object obj) {
    	String str = (obj == null ? null : obj.toString());
    	return str == null ? "" : str;
    }

	public static String realURL(HttpServletRequest request, String path) {
		if(path == null || path.length() == 0)
			path = "/";
		else if(!path.startsWith("/"))
			path = "/" + path;

    	String scheme = request.getScheme();
    	String host = request.getServerName();
    	int port = request.getServerPort();
    	String servlet = request.getContextPath();

    	String portString;
    	if("http".equals(scheme) && port == 80 || "https".equals(scheme) && port == 443) {
    		portString = "";
    	} else {
    		portString = ":" + port;
    	}

	    return scheme + "://" + host + portString + servlet + path;
	}

	public static String urlEncode(String str) {
		try {
			return URLEncoder.encode(str, "UTF-8");
		} catch (UnsupportedEncodingException ex) {
			throw new RuntimeException("Error when using URL encoder!", ex);
		}
	}

	public static String urlDecode(String str) {
		try {
			return URLDecoder.decode(str, "UTF-8");
		} catch (UnsupportedEncodingException ex) {
			throw new RuntimeException("Error when using URL decoder!", ex);
		}
	}

	public static final Charset CHARSET_UTF_8;

	static {
		try {
			CHARSET_UTF_8 = Charset.forName("UTF-8");
		} catch(Exception ex) {
			throw new RuntimeException("Couldn't get UTF-8 charset!", ex);
		}
	}
}
