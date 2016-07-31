package hu.csega.toolshed.v1.json.converters;

public class JSONStringConverter implements JSONValueConverter {

	@Override
	public Object fromJSONValue(Object jsonValue) {
		if(jsonValue == null)
			return null;

		return jsonValue.toString();
	}

	@Override
	public Object toJSONValue(Object value) {
		return (value == null ? null : value.toString());
	}

}
