package hu.csega.web.components.common;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class StateRenderer {

	public static void renderState(HttpServletRequest req, PrintWriter writer, DummyResponse response) throws IOException {
		String title = response.getTitle();
		writer.append("\n\n<h1>" + title + "</h1>\n\n");

		List<String> states = response.getStates();
		String current = response.getCurrentState();

		writer.append("\n\n" + renderState(states, current));
	}

	public static String renderState(List<String> states, String current) {
		if(current == null || current.length() == 0 || states == null || states.isEmpty())
			return "";

		StringBuffer buffer = new StringBuffer("<div class=\"breadcrumbs\">\n");

		int counter = 0;
		for(String state : states) {
			if(counter != 0) {
				buffer.append(" → \n");
			}

			if(current.equals(state)) {
				buffer.append("<b>" + state + "</b>");
			} else {
				buffer.append(state);
			}

			counter++;
		}

		buffer.append("</div>\n\n");
		return buffer.toString();
	}

}
