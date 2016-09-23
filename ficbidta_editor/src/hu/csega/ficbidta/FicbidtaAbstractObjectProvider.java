package hu.csega.ficbidta;

import java.util.List;

public abstract class FicbidtaAbstractObjectProvider {

	public abstract String name();
	
	public abstract List<Class<?>> nodeTypes();

	public abstract List<Class<?>> connectionTypes();
	
	
}
