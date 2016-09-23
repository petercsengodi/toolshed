package hu.csega.ficbidta.basic.nodes;

import hu.csega.ficbidta.properties.FicbidtaObject;
import hu.csega.ficbidta.properties.FicbidtaProperty;
import hu.csega.ficbidta.properties.FicbidtaStringProperty;

@FicbidtaObject(name = "Class")
public class FicbidtaBasicGenericNode {

	@FicbidtaProperty(name = "Description", property = FicbidtaStringProperty.class)
	public String description;

	@FicbidtaProperty(name = "Comment", property = FicbidtaStringProperty.class)
	public String comment;

}
