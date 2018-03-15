package hu.csega.ficbidta.window;

import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

import hu.csega.ficbidta.properties.FicbidtaAbstractProperty;

public class FicbidtaComboBoxModel implements ComboBoxModel<String> {

	public String[] possibleValues = null;
	public Object[] values = null;
	public String[] displayValues = null;
	public int selectedIndex = -1;

	public String getElementAt(int index) {
		if(possibleValues == null || possibleValues.length <= index) {
			return null;
		}

		return possibleValues[index];
	}

	public int getSize() {
		if(possibleValues == null) {
			return 0;
		}

		return possibleValues.length;
	}

	public Object getSelectedItem() {
		if(selectedIndex == -1) {
			return null;
		}

		return values[selectedIndex];
	}

	public void setSelectedItem(Object arg0) {
		if(possibleValues == null) {
			return;
		}

		selectedIndex = -1;
		for(int i = 0; i < displayValues.length; i++) {
			if(arg0.equals(displayValues[i])) {
				selectedIndex = i;
				break;
			}
		}
	}

	public void loadList(FicbidtaAbstractProperty property, Class<?> type, String[] possibleValues) {
		if(possibleValues == null) {
			throw new NullPointerException("possibleValues must not be null");
		}

		int length = possibleValues.length;
		if(length == 0) {
			throw new IllegalArgumentException("possibleValues must not be empty");
		}

		this.possibleValues = new String[length];
		this.displayValues = new String[length];
		this.values = new Object[length];

		for(int i = 0; i < length; i++) {
			String stringValue = possibleValues[i];
			this.possibleValues[i] = stringValue;
			this.values[i] = property.convertFromString(stringValue, type);
			this.displayValues[i] = property.display(this.values[i], type);
		}
	}

	public void addListDataListener(ListDataListener arg0) {
	}

	public void removeListDataListener(ListDataListener arg0) {
	}


}
