package hu.csega.ficbidta.model;

import java.util.Map;
import java.util.TreeMap;

import hu.csega.ficbidta.properties.FicbidtaObject;

public abstract class ModelObject {

	public String name;
	public String type;
	public Map<String, String> properties = new TreeMap<String, String>();
	
	public String getTypeDisplayName() {
		if(type == null || type.length() == 0) {
			return null;
		}
		
		Class<?> typeClass;
		
		try {
			typeClass = getClass().getClassLoader().loadClass(type);
		} catch(ClassNotFoundException ex) {
			return null;
		}
		
		FicbidtaObject desc = typeClass.getAnnotation(FicbidtaObject.class);
		if(desc == null) {
			return null;
		}
		
		String n = desc.name();
		return (n == null || n.length() == 0) ? null : n;
	}
}
