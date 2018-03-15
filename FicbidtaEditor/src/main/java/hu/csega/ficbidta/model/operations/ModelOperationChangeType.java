package hu.csega.ficbidta.model.operations;

import java.util.TreeMap;

import hu.csega.ficbidta.model.ModelObject;

public class ModelOperationChangeType extends ModelOperation {

	public ModelObject object;
	public String oldType;
	public TreeMap<String, String> oldProperties;
	public String newType;
	public TreeMap<String, String> newProperties;
	
	@Override
	public void doOperation() {
		object.type = newType;
		object.properties = newProperties;
	}

	@Override
	public void undoOperation() {
		object.type = oldType;
		object.properties = oldProperties;
	}

}
