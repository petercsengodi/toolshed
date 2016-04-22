package hu.csega.web.components.common;

import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;

public class DummyRequest {

	public DummyRequest(HttpServletRequest request, String content) {
		@SuppressWarnings("unchecked")
		Enumeration<String> parameterNames = request.getParameterNames();
		while(parameterNames.hasMoreElements()) {
			String name = parameterNames.nextElement();
			parameters.put(name, request.getParameter(name));
		}

		try {
			if(content != null && content.length() > 0) {
				StringTokenizer tokens = new StringTokenizer(content, "&");
				while(tokens.hasMoreTokens()) {
					String token = tokens.nextToken();
					int index = token.indexOf('=');
					if(index > 0) {
						String name = token.substring(0, index);
						String value = URLDecoder.decode(token.substring(index + 1), "UTF_8");
						parameters.put(name, value);
					}
				}
			}
		} catch(Exception ex) {
		}
	}

	public String getParameter(String name) {
		return parameters.get(name);
	}

	private Map<String, String> parameters = new HashMap<>();

}
