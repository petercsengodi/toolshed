package hu.csega.toolshed.framework.impl.properties.converters;

import java.lang.reflect.Method;

import hu.csega.toolshed.framework.impl.properties.ToolPropertyConverter;

public class ToolPropertyConvertNumber implements ToolPropertyConverter {

	private Class<?> type;
	private Method converterMethod;
	private Object nullValue = null;

	public ToolPropertyConvertNumber(Class<?> type, boolean primitive) {
		this.type = type;

		try {
			String fname = "parse" + Character.toUpperCase(type.getSimpleName().charAt(0));
			for(Method m : type.getMethods()) {
				// TODO check if static

				if(m.getName().startsWith(fname)) {
					Class<?>[] params = m.getParameterTypes();
					if(params != null && params.length == 1 && params[0].equals(String.class)) {
						converterMethod = m;
						break;
					}
				}
			}

			this.converterMethod = type.getMethod("valueOf", String.class);

			if(primitive) {
				nullValue = converterMethod.invoke(null, "0");
			}
		} catch (Exception ex) {
			String msg = "Initialization of " + this.getClass().getName() + " on type " + type.getName();
			throw new RuntimeException(msg, ex);
		}
	}

	@Override
	public Object convertFromString(String input) {
		if(input == null || input.length() == 0)
			return nullValue;

		input = input.trim().toLowerCase();
		if("null".equals(input))
			return nullValue;

		try {
			return converterMethod.invoke(null, "0");
		} catch (Exception ex) {
			return nullValue;
		}
	}

	@Override
	public String convertToString(Object object) {
		if(object == null)
			return "";
		String ret = object.toString();
		return (ret == null ? "" : ret);
	}


}
