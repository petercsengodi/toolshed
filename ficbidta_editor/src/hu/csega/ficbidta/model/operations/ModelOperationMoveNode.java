package hu.csega.ficbidta.model.operations;

import hu.csega.ficbidta.model.ModelNode;

public class ModelOperationMoveNode extends ModelOperation {

	public ModelNode node;
	public int oldX;
	public int oldY;
	public int newX;
	public int newY;
	
	@Override
	public void doOperation() {
		node.x = newX;
		node.y = newY;
	}

	@Override
	public void undoOperation() {
		node.x = oldX;
		node.y = oldY;
	}

}
