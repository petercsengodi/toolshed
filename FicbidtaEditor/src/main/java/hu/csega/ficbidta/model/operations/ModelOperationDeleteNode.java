package hu.csega.ficbidta.model.operations;

import hu.csega.ficbidta.model.ModelNode;

public class ModelOperationDeleteNode extends ModelOperation {

	public ModelNode node;
	
	@Override
	public void doOperation() {
		model.nodeMap.remove(node.id);
		model.nodes.remove(node);
		model.selectedItems.clear();
	}

	@Override
	public void undoOperation() {
		model.nodes.add(node);
		model.nodeMap.put(node.id, node);
		model.selectedItems.clear();
		model.selectedItems.add(node.id);
	}
}
