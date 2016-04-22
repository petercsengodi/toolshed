package hu.csega.web.components.renderer;

import static hu.csega.web.components.common.Files.readFile;

import java.io.IOException;
import java.util.regex.Matcher;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import hu.csega.web.components.common.Files;
import hu.csega.web.components.common.StateRenderer;
import hu.csega.web.components.component.WebButton;
import hu.csega.web.components.component.WebComponent;
import hu.csega.web.components.component.WebContainer;
import hu.csega.web.components.component.WebField;
import hu.csega.web.components.component.WebForm;
import hu.csega.web.components.component.WebFrame;
import hu.csega.web.components.component.WebHiddenField;
import hu.csega.web.components.component.WebHtml;
import hu.csega.web.components.component.WebInput;
import hu.csega.web.components.component.WebInputWithLabel;
import hu.csega.web.components.component.WebLink;
import hu.csega.web.components.component.WebOption;
import hu.csega.web.components.component.WebSelectBox;
import hu.csega.web.components.component.WebText;
import hu.csega.web.components.servlets.Servlet;

class WebJsonRenderer implements WebRenderer {

	@Override
	public String render(WebComponent component) {
		if(component instanceof WebFrame) {
			WebFrame frame = (WebFrame) component;

			JSONArray array = new JSONArray();
			for (WebComponent c : frame) {
				array.put(json(c));
			}

			String title = frame.getTitle();
			String script = array.toJSONString();

			try {
				String menu = readFile("menu.html", .class);
				String content = Files.readFile("webframe.html", WebJsonRenderer.class);
				String breadcrumbs = StateRenderer.renderState(frame.getStates(), frame.getCurrentState());

				content = content.replaceAll("##timestamp##", String.valueOf(System.currentTimeMillis()));
				content = content.replaceAll("##title##", Matcher.quoteReplacement(title));
				content = content.replaceAll("##menu##", Matcher.quoteReplacement(menu));
				content = content.replaceAll("##script##", Matcher.quoteReplacement(script));
				content = content.replaceAll("##breadcrumbs##", Matcher.quoteReplacement(breadcrumbs));
				return content;
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		}

		return json(component).toJSONString();
	}

	public JSONObject json(WebComponent component) {
		JSONObject object = new JSONObject();

		try {

			if (component instanceof WebContainer) {
				WebContainer container = (WebContainer) component;
				object.put("tag", "div");

				JSONArray array = new JSONArray();
				for (WebComponent c : container) {
					array.put(json(c));
				}

				object.put("children", array);
			}

			if (component instanceof WebForm) {
				WebForm form = (WebForm) component;
				object.put("tag", "form");

				Servlet servlet = form.getServlet();
				String prefix = (servlet != null ? servlet.getUrl() + "/" : "");
				object.put("action", prefix + form.getAction());
				object.put("method", form.getMethod().name().toLowerCase());
			}

			if (component instanceof WebButton) {
				WebButton button = (WebButton) component;
				object.put("tag", "button");
				object.put("type", button.getType());
				object.put("value", button.getValue());
				object.put("text", button.getLabel());
			}

			if (component instanceof WebLink) {
				WebLink link = (WebLink) component;
				object.put("tag", "a");
				object.put("text", link.getText());

				String href;
				if(link.getServlet() != null) {
					href = link.getServlet().getUrl();
					if(link.getAction() != null)
						href += "/" + link.getAction();
				} else {
					href = link.getUrl();
				}

				object.put("href", href);
				if(link.isNewTab())
					object.put("target", "_blank");
			}

			if (component instanceof WebInputWithLabel) {
				WebInputWithLabel comp = (WebInputWithLabel) component;
				object.put("label", comp.getLabel());
			}

			if (component instanceof WebInput) {
				WebInput input = (WebInput) component;
				object.put("name", input.getName());
				object.put("value", input.getValue());;
			}

			if (component instanceof WebOption) {
				WebOption option = (WebOption) component;
				object.put("label", option.getLabel());
				object.put("value", option.getValue());;
			}

			if (component instanceof WebHiddenField) {
				object.put("tag", "input");
				object.put("type", "hidden");
			}

			if (component instanceof WebField) {
				object.put("tag", "input");
			}

			if (component instanceof WebSelectBox) {
				WebSelectBox select = (WebSelectBox) component;
				object.put("tag", "select");

				JSONArray array = new JSONArray();
				for (WebOption option : select) {
					array.put(json(option));
				}

				object.put("options", array);
			}

			if (component instanceof WebText) {
				WebText text = (WebText) component;
				object.put("tag", "p");
				object.put("text", text.getText());
			}

			if (component instanceof WebHtml) {
				WebHtml html = (WebHtml) component;
				object.put("html", html.getHtml());
			}

		} catch(JSONException ex) {
			ex.printStackTrace();
		}

		return object;
	}
}
