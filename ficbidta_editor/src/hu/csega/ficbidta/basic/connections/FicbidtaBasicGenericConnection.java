package hu.csega.ficbidta.basic.connections;

import hu.csega.ficbidta.properties.FicbidtaObject;
import hu.csega.ficbidta.properties.FicbidtaProperty;
import hu.csega.ficbidta.properties.FicbidtaStringProperty;

@FicbidtaObject(name = "Generic Connection")
public class FicbidtaBasicGenericConnection {

	@FicbidtaProperty(name = "Description", property = FicbidtaStringProperty.class)
	public String description;

	@FicbidtaProperty(name = "Comment", property = FicbidtaStringProperty.class)
	public String comment;
	
}
