package hu.csega.web.components.component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WebContainer extends WebComponent implements Iterable<WebComponent> {

	public WebContainer addComponent(WebComponent component) {
		this.components.add(component);
		return this;
	}

	public WebContainer addHtml(String... html) {
		for(String s : html)
			this.addComponent(new WebHtml(s));
		return this;
	}

	public WebContainer addText(String... text) {
		for(String s : text)
			this.addComponent(new WebText(s));
		return this;
	}

	public WebContainer addBreak() {
		addComponent(new WebHtml("<br/>"));
		return this;
	}

	public WebContainer addSeparator() {
		addComponent(new WebHtml("<br/><hr/><br/>"));
		return this;
	}

	public WebContainer addSpace() {
		addInContainer(new WebHtml("&nbsp;"));
		return this;
	}

	public WebContainer addInContainer(WebComponent... component) {
		WebContainer container = new WebContainer();
		for(WebComponent c : component)
			container.addComponent(c);
		this.addComponent(container);
		return this;
	}

	@Override
	public Iterator<WebComponent> iterator() {
		return components.iterator();
	}

	private List<WebComponent> components = new ArrayList<>();
}
