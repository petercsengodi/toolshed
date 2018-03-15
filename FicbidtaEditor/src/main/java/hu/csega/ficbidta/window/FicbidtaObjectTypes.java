package hu.csega.ficbidta.window;

import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

import hu.csega.ficbidta.properties.FicbidtaObject;

public class FicbidtaObjectTypes implements ComboBoxModel<String> {

	public String[] values = null;
	public String[] displayValues = null;
	public int selectedIndex = 0;

	public String getElementAt(int index) {
		if(values == null || values.length <= index) {
			return null;
		}

		return displayValues[index];
	}

	public int getSize() {
		if(values == null) {
			return 0;
		}

		return values.length;
	}

	public Object getSelectedItem() {
		if(displayValues == null || selectedIndex < 0 || selectedIndex >= displayValues.length) {
			return null;
		}

		return displayValues[selectedIndex];
	}

	public void setSelectedItem(Object arg0) {
		if(values == null) {
			return;
		}

		selectedIndex = 0;
		for(int i = 0; i < displayValues.length; i++) {
			if(arg0.equals(displayValues[i])) {
				selectedIndex = i;
				break;
			}
		}
	}

	public void loadList(List<Class<?>> types, String oldType) {
		if(types == null) {
			throw new NullPointerException("possibleValues must not be null");
		}

		int length = types.size();
		if(length == 0) {
			throw new IllegalArgumentException("possibleValues must not be empty");
		}

		this.values = new String[length + 1];
		this.displayValues = new String[length + 1];

		this.values[0] = "";
		this.displayValues[0] = "< no type >";

		for(int i = 0; i < length; i++) {
			Class<?> classValue = types.get(i);
			String name = classValue.getName();
			this.values[i + 1] = name;

			FicbidtaObject ann = classValue.getAnnotation(FicbidtaObject.class);
			name = (ann == null ? name : ann.name());
			this.displayValues[i + 1] = name;
		}

		selectedIndex = 0;
		for(int i = 0; i < length + 1; i++) {
			if(this.values[i].equals(oldType)) {
				selectedIndex = i;
			}
		}
	}

	public String getSelectedValue() {
		if(selectedIndex > -1 && selectedIndex < this.values.length) {
			return this.values[selectedIndex];
		}

		return null;
	}

	public void addListDataListener(ListDataListener arg0) {
	}

	public void removeListDataListener(ListDataListener arg0) {
	}


}
