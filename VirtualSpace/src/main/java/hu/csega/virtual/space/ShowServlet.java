package hu.csega.virtual.space;

import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hu.csega.data.batcher.DataConnection;
import hu.csega.encryption.DecryptedContent;

public class ShowServlet extends HttpServlet {

	private static final String PREFIX = "/VirtualSpace/show/";

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Cache-Control", "no-cache, must-revalidate");
		response.setHeader("Expires", "Expires: Sat, 26 Jul 1997 05:00:00 GMT");
		response.setHeader("Pragma", "no-cache");

		String uri = request.getRequestURI();
		if(!uri.startsWith(PREFIX)) {
			response.sendRedirect(PREFIX);
			return;
		}

		if(uri == null || uri.length() <= PREFIX.length()) {
			uri = "/";
		} else {
			uri = "/" + uri.substring(PREFIX.length());
		}

		DecryptedContent page = DataConnection.INSTANCE.load(uri);
		String contentType = page.getContentType();
		response.setHeader("Content-type", contentType);

		try (OutputStream stream = response.getOutputStream()) {
			stream.write(page.asBytes());
		}
	}

	private static final long serialVersionUID = 1L;
}
