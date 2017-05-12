package hu.csega.toolshed.framework.impl.properties.converters;

import hu.csega.toolshed.framework.impl.properties.ToolPropertyConverter;

public class ToolPropertyConvertString implements ToolPropertyConverter {

	@Override
	public Object convertFromString(String input) {
		if(input == null)
			return null;
		return input;
	}

	@Override
	public String convertToString(Object object) {
		if(object == null)
			return "";
		String ret = object.toString();
		return (ret == null ? "" : ret);
	}

}
