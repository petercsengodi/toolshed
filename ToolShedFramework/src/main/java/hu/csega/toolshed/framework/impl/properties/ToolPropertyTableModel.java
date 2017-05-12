package hu.csega.toolshed.framework.impl.properties;

import java.util.Map;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class ToolPropertyTableModel implements TableModel {

	private ToolPropertiesComponent component;
	private String[] propertyLabels;
	private String[] propertyFields;

	ToolPropertyTableModel(ToolPropertiesComponent component) {
		this.component = component;
		this.propertyLabels = new String[component.labels.size()];
		this.propertyFields = new String[component.labels.size()];

		int counter = 0;
		for(Map.Entry<String, String> entry : component.labels.entrySet()) {
			propertyLabels[counter] = entry.getKey();
			propertyFields[counter] = entry.getValue();
			counter++;
		}
	}

	@Override
	public int getRowCount() {
		return component.labels.size();
	}

	@Override
	public int getColumnCount() {
		return 2;
	}

	@Override
	public String getColumnName(int columnIndex) {
		if(columnIndex == 0) {
			return "Name";
		} else {
			return "Value";
		}
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return columnIndex == 1;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		if(columnIndex == 0) {
			return propertyLabels[rowIndex];
		} else {
			String key = propertyFields[rowIndex];
			Object value = component.getValue(key);
			return (value == null ? null : value.toString());
		}
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		if(columnIndex != 1) {
			throw new RuntimeException("Column at index " + columnIndex + " are not to write!");
		}

		String key = propertyFields[rowIndex];

		// TODO handle value type
		String value = (aValue == null ? null : aValue.toString());
		component.setValue(key, value);
	}

	@Override
	public void addTableModelListener(TableModelListener l) {
	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
	}

}
