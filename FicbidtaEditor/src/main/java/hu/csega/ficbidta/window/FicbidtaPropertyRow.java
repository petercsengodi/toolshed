package hu.csega.ficbidta.window;

import hu.csega.ficbidta.properties.FicbidtaAbstractProperty;


public class FicbidtaPropertyRow implements Comparable<FicbidtaPropertyRow> {

	public String propertyName;
	public String propertyDisplayName;
	public String propertyValue;
	public String propertyDisplayValue;
	public FicbidtaAbstractProperty property;
	
	public int compareTo(FicbidtaPropertyRow o) {
		return propertyDisplayValue.compareTo(o.propertyDisplayName);
	}
	
}
