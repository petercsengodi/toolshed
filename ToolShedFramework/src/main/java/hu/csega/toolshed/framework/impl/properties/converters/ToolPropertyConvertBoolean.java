package hu.csega.toolshed.framework.impl.properties.converters;

import hu.csega.toolshed.framework.impl.properties.ToolPropertyConverter;

public class ToolPropertyConvertBoolean implements ToolPropertyConverter {

	private boolean primitive;

	public ToolPropertyConvertBoolean(boolean primitive) {
		this.primitive = primitive;
	}

	@Override
	public Object convertFromString(String input) {
		if(input == null || input.length() == 0)
			return primitive ? false : null;

		input = input.trim().toLowerCase();
		if("null".equals(input))
			return primitive ? false : null;

		try {
			return Boolean.parseBoolean(input);
		} catch (Exception e) {
			return primitive ? false : null;
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
