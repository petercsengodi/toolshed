package hu.csega.ficbidta.window;

import java.util.List;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class FicbidtaPropertyModel implements TableModel {

	public List<FicbidtaPropertyRow> rows;
	
	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	public int getColumnCount() {
		return 2;
	}

	public String getColumnName(int columnIndex) {
		switch(columnIndex) {
		case 0: 
			return "Property Name";
		case 1:
			return "Property Value";
		default:
			return "";
		}
	}

	public int getRowCount() {
		return (rows != null ? rows.size() : 0);
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		if(columnIndex == 0) {
			return rows.get(rowIndex).propertyDisplayName;
		}
		
		if(columnIndex == 1) {
			return rows.get(rowIndex).propertyDisplayValue;
		}
		
		return "";
	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
	}

	public void removeTableModelListener(TableModelListener l) {
	}

	public void addTableModelListener(TableModelListener l) {
	}


}
