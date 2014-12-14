package hu.csega.toolshed.servlet;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JsonConnectServlet
 */
public class JsonConnectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public JsonConnectServlet() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(null, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String json = request.getParameter("json");
		process(json, response);
	}

	
	protected void process(String json, HttpServletResponse response) throws ServletException {
		try {
			if(json != null) {
				// TODO
			} else {
				JsonObjectBuilder object = Json.createObjectBuilder();
				object.add("version", "JsonComponentsServlet v0.0.1");
				
				response.setContentType("application/json; charset=utf-8");
				PrintWriter writer = response.getWriter();
				writer.println(object.build());
				writer.close();
			}
		} catch(Throwable t) {
			try {
				ByteArrayOutputStream stream = new ByteArrayOutputStream();
				PrintStream print = new PrintStream(stream);
				t.printStackTrace(print);
				String stackTrace = new String(stream.toByteArray(), StandardCharsets.UTF_8);
				print.close();
				
				JsonObjectBuilder object = Json.createObjectBuilder();
				object.add("error", "Fatal error!");
				object.add("error_message", t.getMessage());
				object.add("stack_trace", stackTrace);
	
				response.setContentType("application/json; charset=utf-8");
				PrintWriter writer = response.getWriter();
				writer.println(object.build());
				writer.close();
			} catch(Throwable t2) {
				throw new ServletException(t2);
			}
		}
	}
	
	
}
