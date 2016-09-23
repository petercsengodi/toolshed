package hu.csega.ficbidta.properties;

public class FicbidtaStringProperty extends FicbidtaAbstractProperty {

	@Override
	public Object convertFromString(String data, Class<?> type)
			throws IllegalArgumentException {
		return data;
	}

	@Override
	public String convertToString(Object value, Class<?> type) {
		return value.toString();
	}

	@Override
	public String display(Object value, Class<?> type) {
		return value.toString();
	}

}
