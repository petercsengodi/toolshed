package hu.csega.virtual.space;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowServlet extends HttpServlet {

	private static final String PREFIX = "/VirtualSpace/show/";

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Cache-Control", "no-cache, must-revalidate");
		response.setHeader("Expires", "Expires: Sat, 26 Jul 1997 05:00:00 GMT");
		response.setHeader("Pragma", "no-cache");

		// If the specified path doesn't start with the appropriate prefix,
		// we redirect the user to the main page of the confidential content.
		String uri = request.getRequestURI();
		if(!uri.startsWith(PREFIX)) {
			response.sendRedirect(PREFIX);
			return;
		}

		String path;
		if(uri == null || uri.length() <= PREFIX.length()) {
			path = "/";
		} else {
			path = "/" + uri.substring(PREFIX.length());
		}

		DownloadData.load(response, path, null, null);
	}

	private static final long serialVersionUID = 1L;
}
