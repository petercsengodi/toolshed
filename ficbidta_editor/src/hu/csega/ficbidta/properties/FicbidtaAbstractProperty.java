package hu.csega.ficbidta.properties;


public abstract class FicbidtaAbstractProperty {

	public abstract Object convertFromString(String data, Class<?> type) throws IllegalArgumentException;
	public abstract String convertToString(Object value, Class<?> type);
	public abstract String display(Object value, Class<?> type);
	
}
