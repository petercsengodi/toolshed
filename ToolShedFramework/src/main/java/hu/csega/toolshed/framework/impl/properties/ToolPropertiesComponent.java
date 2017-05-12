package hu.csega.toolshed.framework.impl.properties;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

import hu.csega.toolshed.framework.ToolProperty;

public class ToolPropertiesComponent extends JPanel {

	Object backingBean;
	Class<?> backingBeanClass;
	Map<String, String> labels = new TreeMap<>();
	Map<String, Class<?>> classes = new HashMap<>();

	private JScrollPane scrollPane;
	private JTable table;
	private TableModel tableModel;

	public ToolPropertiesComponent() {
		setupComponents();
	}

	public ToolPropertiesComponent(Object backingBean) {
		this.backingBean = backingBean;
		refreshPropertyMap();
		setupComponents();
	}

	private void setupComponents() {
		tableModel = new ToolPropertyTableModel(this);
		table = new JTable(tableModel);
		scrollPane = new JScrollPane(table);
		this.add(scrollPane);
	}

	private void refreshPropertyMap() {
		labels.clear();
		classes.clear();

		this.backingBeanClass = (backingBean == null ? null : backingBean.getClass());

		if(backingBean != null) {
			Field[] fields = backingBean.getClass().getDeclaredFields();
			if(fields == null) {
				return;
			}

			for(Field field : fields) {
				ToolProperty p = field.getAnnotation(ToolProperty.class);
				if(p != null && p.value() != null) {
					String name = field.getName();
					String label = p.value();
					labels.put(label, name);
					classes.put(name, field.getType());
				}
			}
		}
	}

	void setValue(String field, Object value) {
		if(backingBean == null)
			return;

		Class<?> type = classes.get(field);
		if(type == null) {
			throw new RuntimeException("Field \"" + field + "\" does not exist.");
		}

		try {
			String setterName = "set" + Character.toUpperCase(field.charAt(0)) + field.substring(1);
			Method method = backingBeanClass.getMethod(setterName, type);
			method.invoke(backingBean, value);
		} catch (Exception ex) {
			throw new RuntimeException("Field \"" + field + "\" could not be set.", ex);
		}
	}

	Object getValue(String field) {
		if(backingBean == null)
			return null;

		Class<?> type = classes.get(field);
		if(type == null) {
			throw new RuntimeException("Field \"" + field + "\" does not exist.");
		}

		try {
			Method method = null;

			if(type.equals(boolean.class)) {
				try {
					String getterName = "is" + Character.toUpperCase(field.charAt(0)) + field.substring(1);
					method = backingBeanClass.getMethod(getterName);
				} catch(NoSuchMethodException ex) {
					// retry with get...()
				}
			}

			if(method == null) {
				String getterName = "get" + Character.toUpperCase(field.charAt(0)) + field.substring(1);
				method = backingBeanClass.getMethod(getterName);
			}


			return method.invoke(backingBean);
		} catch (Exception ex) {
			throw new RuntimeException("Value of field \"" + field + "\" could not be get.", ex);
		}
	}

	private static final long serialVersionUID = 1L;
}
