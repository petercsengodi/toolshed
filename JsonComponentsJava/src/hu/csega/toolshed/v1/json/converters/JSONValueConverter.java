package hu.csega.toolshed.v1.json.converters;

public interface JSONValueConverter {

	Object fromJSONValue(Object from);
	Object toJSONValue(Object to);

}
