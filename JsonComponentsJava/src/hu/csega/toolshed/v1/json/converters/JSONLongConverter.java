package hu.csega.toolshed.v1.json.converters;

public class JSONLongConverter implements JSONValueConverter {

	@Override
	public Object fromJSONValue(Object jsonValue) {
		if(jsonValue == null)
			return null;

		try {
			return Long.valueOf(jsonValue.toString());
		} catch(Exception ex) {
			return null;
		}
	}

	@Override
	public Object toJSONValue(Object value) {
		return (value == null ? null : value.toString());
	}

}
