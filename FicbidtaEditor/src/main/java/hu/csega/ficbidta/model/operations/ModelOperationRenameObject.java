package hu.csega.ficbidta.model.operations;

import hu.csega.ficbidta.model.ModelObject;

public class ModelOperationRenameObject extends ModelOperation {

	public ModelObject object;
	public String oldName;
	public String newName;
	
	@Override
	public void doOperation() {
		object.name = newName;
	}

	@Override
	public void undoOperation() {
		object.name = oldName;
	}

}
