package hu.csega.ficbidta.model.operations;

import java.util.TreeMap;

import hu.csega.ficbidta.model.ModelObject;

public class ModelOperationChangeProperties extends ModelOperation {

	public ModelObject object;
	public TreeMap<String, String> oldProperties;
	public TreeMap<String, String> newProperties;
	
	@Override
	public void doOperation() {
		object.properties = newProperties;
	}

	@Override
	public void undoOperation() {
		object.properties = oldProperties;
	}

}
