package hu.csega.ficbidta.model.operations;

import hu.csega.ficbidta.model.ModelNetwork;

public abstract class ModelOperation {

	public ModelNetwork model;
	
	public abstract void doOperation();
	public abstract void undoOperation();
}
