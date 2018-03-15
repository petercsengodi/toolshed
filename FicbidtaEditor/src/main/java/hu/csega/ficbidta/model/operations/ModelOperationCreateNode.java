package hu.csega.ficbidta.model.operations;

import hu.csega.ficbidta.model.ModelNode;

public class ModelOperationCreateNode extends ModelOperation {

	public ModelNode node;
	
	@Override
	public void doOperation() {
		model.nodes.add(node);
		model.nodeMap.put(node.id, node);
		model.selectedItems.clear();
		model.selectedItems.add(node.id);
	}

	@Override
	public void undoOperation() {
		model.nodeMap.remove(node.id);
		model.nodes.remove(node);
		model.selectedItems.clear();
	}

}
