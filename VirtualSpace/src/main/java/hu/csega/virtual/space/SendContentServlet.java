package hu.csega.virtual.space;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendContentServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Cache-Control", "no-cache, must-revalidate");
		response.setHeader("Expires", "Expires: Sat, 26 Jul 1997 05:00:00 GMT");
		response.setHeader("Pragma", "no-cache");

		response.setHeader("Content-type", "text/html; charset=utf-8");

		try (PrintWriter writer = new PrintWriter(response.getOutputStream())) {
			PrintWriterUploadLogger logger = new PrintWriterUploadLogger(writer);
			writer.println("<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>");
			writer.println("<title>Virtual Space -- Sending Content</title>\n</head>\n<body>");
			UploadData.list(logger);
			writer.println("</body>\n</html>");
		}
	}

	private static final long serialVersionUID = 1L;
}
