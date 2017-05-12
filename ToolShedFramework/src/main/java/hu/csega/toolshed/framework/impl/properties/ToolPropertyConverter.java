package hu.csega.toolshed.framework.impl.properties;

public interface ToolPropertyConverter {

	Object convertFromString(String input);
	String convertToString(Object object);

}
