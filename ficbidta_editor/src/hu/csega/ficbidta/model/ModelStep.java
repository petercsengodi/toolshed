package hu.csega.ficbidta.model;

import java.util.ArrayList;
import java.util.List;

import hu.csega.ficbidta.model.operations.ModelOperation;

public class ModelStep {

	public List<ModelOperation> operations = new ArrayList<ModelOperation>();
	
	public void doOperations(){
		if(operations != null && operations.size() > 0) {
			for(int i = 0; i < operations.size(); i++) {
				operations.get(i).doOperation();
			}
		}
	}
	
	public void undoOperations(){
		if(operations != null && operations.size() > 0) {
			for(int i = operations.size() - 1; i >= 0; i--) {
				operations.get(i).undoOperation();
			}
		}
	}
	
}
