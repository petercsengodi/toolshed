package hu.csega.moap;

import static hu.csega.moap.Util.emptyToNull;
import static hu.csega.moap.Util.nullToEmpty;
import static hu.csega.moap.Util.readPayload;
import static hu.csega.moap.Util.convertPayloadToProperties;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		showSessionDataAndForm(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		byte[] payload = readPayload(request);
		Properties params = convertPayloadToProperties(payload);

		String variable = emptyToNull(params.getProperty("variable"));

		if(variable == null)
			session.removeAttribute("variable");
		else
			session.setAttribute("variable", variable);

		showSessionDataAndForm(request, response);
	}

	protected void showSessionDataAndForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String variable = nullToEmpty(session.getAttribute("variable"));

		try (PrintWriter writer = new PrintWriter(response.getOutputStream())) {
			writer.println("<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"/>");
			writer.println("<title>Mother Of All Projects</title>\n</head>\n<body>");

			writer.println("<h1>Current value in session data</h1>");
			writer.println("<p>" + variable + "&nbsp;</p>");

			writer.println("<h1>Set variable</h1>");
			writer.println("<form method=\"post\" enctype=\"application/x-www-form-urlencoded\">");
			writer.println("Value: <input name=\"variable\" maxlength=\"100\" style=\"width: 200px;\" /><br/>");
			writer.println("<button type=\"submit\">OK</button>");
			writer.println("</form>");

			writer.println("</body>\n</html>");
		}
	}

}
