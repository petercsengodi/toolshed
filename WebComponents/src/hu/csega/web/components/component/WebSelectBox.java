package hu.csega.web.components.component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WebSelectBox extends WebInputWithLabel implements Iterable<WebOption> {

	public void addOption(String value, String label) {
		WebOption option = new WebOption();
		option.setValue(value);
		option.setLabel(label);
		options.add(option);
	}

	@Override
	public Iterator<WebOption> iterator() {
		return options.iterator();
	}

	public void setOptionObjects(Iterable<?> iterable) {
		for(Object o : iterable) {
			String value = (o == null ? "null" : o.toString());
			addOption(value, value);
		}
	}

	private List<WebOption> options = new ArrayList<>();
}
