package hu.csega.toolshed.framework.impl.properties;

import java.awt.Color;
import java.awt.Dimension;
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
import hu.csega.toolshed.framework.impl.properties.converters.ToolPropertyConvertColor;
import hu.csega.toolshed.framework.impl.properties.converters.ToolPropertyConvertString;

public class ToolPropertiesComponent extends JPanel {

	private static final Map<Class<?>, ToolPropertyConverter> CONVERSION_MAP = new HashMap<>();
	private static final ToolPropertyConverter DEFAULT_CONVERTER = new ToolPropertyConvertString();

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
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setPreferredSize(this.getPreferredSize());

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

	void setValue(String field, String value) {
		if(backingBean == null)
			return;

		Class<?> type = classes.get(field);
		if(type == null) {
			throw new RuntimeException("Field \"" + field + "\" does not exist.");
		}

		try {
			String setterName = "set" + Character.toUpperCase(field.charAt(0)) + field.substring(1);
			Method method = backingBeanClass.getMethod(setterName, type);

			ToolPropertyConverter converter = converterOf(type);
			Object convertedValue = converter.convertFromString(value);
			method.invoke(backingBean, convertedValue);
		} catch (Exception ex) {
			throw new RuntimeException("Field \"" + field + "\" could not be set.", ex);
		}
	}

	String getValue(String field) {
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

			Object value = method.invoke(backingBean);
			ToolPropertyConverter converter = converterOf(type);
			String ret = converter.convertToString(value);
			return ret;
		} catch (Exception ex) {
			throw new RuntimeException("Value of field \"" + field + "\" could not be get.", ex);
		}
	}

	private ToolPropertyConverter converterOf(Class<?> type) {
		ToolPropertyConverter converter = CONVERSION_MAP.get(type);
		if(converter == null) {
			converter = DEFAULT_CONVERTER;
		}

		return converter;
	}

	@Override
	public void setSize(Dimension d) {
		super.setSize(d);
		scrollPane.setSize(d);
	}

	@Override
	public void setSize(int width, int height) {
		super.setSize(width, height);
		scrollPane.setSize(width, height);
	}

	@Override
	public void setMaximumSize(Dimension maximumSize) {
		super.setMaximumSize(maximumSize);
		scrollPane.setMaximumSize(maximumSize);
	}

	@Override
	public void setMinimumSize(Dimension minimumSize) {
		super.setMinimumSize(minimumSize);
		scrollPane.setMinimumSize(minimumSize);
	}

	@Override
	public void setPreferredSize(Dimension preferredSize) {
		super.setPreferredSize(preferredSize);
		scrollPane.setPreferredSize(preferredSize);
	}

	static {
		CONVERSION_MAP.put(String.class, new ToolPropertyConvertString());
		CONVERSION_MAP.put(Color.class, new ToolPropertyConvertColor());
	}

	private static final long serialVersionUID = 1L;
}
