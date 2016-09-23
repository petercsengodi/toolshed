package hu.csega.ficbidta.model;

import hu.csega.ficbidta.model.operations.ModelOperation;
import hu.csega.ficbidta.model.operations.ModelOperationChangeProperties;
import hu.csega.ficbidta.model.operations.ModelOperationChangeType;
import hu.csega.ficbidta.model.operations.ModelOperationCreateConnection;
import hu.csega.ficbidta.model.operations.ModelOperationCreateNode;
import hu.csega.ficbidta.model.operations.ModelOperationDeleteConnection;
import hu.csega.ficbidta.model.operations.ModelOperationDeleteNode;
import hu.csega.ficbidta.model.operations.ModelOperationMoveNode;
import hu.csega.ficbidta.model.operations.ModelOperationRenameObject;
import hu.csega.ficbidta.view.SimpleView;
import hu.csega.toolshed.AbstractTool;
import hu.csega.toolshed.ToolComponent;
import hu.csega.toolshed.util.SetTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class ModelNetwork extends ToolComponent {

	public ModelNetwork(AbstractTool tool) {
		super(tool);
	}

	public List<ModelNode> nodes = new ArrayList<ModelNode>();
	public Hashtable<Integer, ModelNode> nodeMap = new Hashtable<Integer, ModelNode>();
	public List<ModelConnection> connections = new ArrayList<ModelConnection>();
	public Hashtable<Integer, ModelConnection> connectionMap = new Hashtable<Integer, ModelConnection>();
	public SetTable<Integer, ModelConnection> connectionStarts = new SetTable<Integer, ModelConnection>();
	public SetTable<Integer, ModelConnection> connectionEnds = new SetTable<Integer, ModelConnection>();
	public Set<Integer> selectedItems = new HashSet<Integer>();
	
	public int maxKey = 1;
	
	public List<String> messages = new ArrayList<String>();
	
	public ModelStepStack stepStack = new ModelStepStack();
	
	public ModelObject getSelectedObject() {
		if(selectedItems.size() == 1) {
			int id = selectedItems.iterator().next();
			
			ModelNode node = nodeMap.get(id);
			if(node != null) {
				return node;
			}
			
			ModelConnection connection = connectionMap.get(id);
			if(connection != null) {
				return connection;
			}
		}
		
		return null;		
	}

	public void createNode(int x, int y) {
		ModelNode node = new ModelNode();
		node.id = ++maxKey;
		node.x = x;
		node.y = y;
		
		ModelOperationCreateNode op = new ModelOperationCreateNode();
		op.model = this;
		op.node = node;
		stepStack.doOperation(op);
	}

	public void createConnection(int from, int to) {
		ModelConnection connection = new ModelConnection();
		connection.id = ++maxKey;
		connection.start = from;
		connection.end = to;
		
		ModelOperationCreateConnection op = new ModelOperationCreateConnection();
		op.model = this;
		op.connection = connection;
		stepStack.doOperation(op);
	}
	
	public void addNode(ModelNode node) {
		nodes.add(node);
		nodeMap.put(node.id, node);
		maxKey = Math.max(maxKey, node.id);
	}
	
	public void addConnection(ModelConnection connection) {
		connections.add(connection);
		connectionMap.put(connection.id, connection);
		connectionStarts.add(connection.start, connection);
		connectionEnds.add(connection.end, connection);
		maxKey = Math.max(maxKey, connection.id);
	}
	
	public void clear() {
		maxKey = 1;
		nodes.clear();
		nodeMap.clear();
		connections.clear();
		connectionMap.clear();
		connectionStarts.clear();
		connectionEnds.clear();
		messages.clear();
		selectedItems.clear();
		stepStack.clear();
	}

	public void deleteSelection() {
		if(selectedItems.size() == 0) {
			return;
		}
		
		List<ModelOperation> operations = new ArrayList<ModelOperation>();
		
		Set<Integer> connectionsToDelete = new HashSet<Integer>();
		
		// Delete selected connections
		for(Integer key : selectedItems) {
			ModelConnection connection = connectionMap.get(key);
			if(connection != null) {
				connectionsToDelete.add(connection.id);
			}
		}
		
		// Delete ajoined connections
		for(Integer key : selectedItems) {
			ModelNode node = nodeMap.get(key);
			if(node != null) {
				Set<ModelConnection> connections = connectionStarts.getSet(node.id);
				for(ModelConnection connection : connections) {
					connectionsToDelete.add(connection.id);
				}
				
				connections = connectionEnds.getSet(node.id);
				for(ModelConnection connection : connections) {
					connectionsToDelete.add(connection.id);
				}
			}
		}
		
		// Do actual delete on connections
		for(Integer key : connectionsToDelete) {
			ModelConnection connection = connectionMap.get(key);
			if(connection != null) {
				ModelOperationDeleteConnection op = new ModelOperationDeleteConnection();
				op.model = this;
				op.connection = connection;
				operations.add(op);
			}
		}
		
		// Delete selected nodes
		for(Integer key : selectedItems) {
			ModelNode node = nodeMap.get(key);
			if(node != null) {
				ModelOperationDeleteNode op = new ModelOperationDeleteNode();
				op.model = this;
				op.node = node;
				operations.add(op);
			}
		}
		
		// Passing to stack
		stepStack.doOperations(operations);
	}

	public void moveSelected(int tx, int ty) {
		if(tx == 0 && ty == 0) {
			return;
		}
		
		List<ModelOperation> operations = new ArrayList<ModelOperation>();
		
		for(Integer key : selectedItems) {
			ModelNode node = nodeMap.get(key);
			if(node != null) {
				ModelOperationMoveNode op = new ModelOperationMoveNode();
				op.model = this;
				op.node = node;
				op.oldX = node.x;
				op.oldY = node.y;
				
				op.newX = node.x + tx;
				if(op.newX > SimpleView.MAX_X) {
					op.newX = SimpleView.MAX_X;
				} else if(op.newX < SimpleView.MIN_X) {
					op.newX = SimpleView.MIN_X;
				}
				
				op.newY = node.y + ty;
				if(op.newY > SimpleView.MAX_Y) {
					op.newY = SimpleView.MAX_Y;
				} else if(op.newY < SimpleView.MIN_Y) {
					op.newY = SimpleView.MIN_Y;
				}
				
				operations.add(op);
			}
		}
		
		if(operations.size() > 0) {
			stepStack.doOperations(operations);
		}
	}
	
	public void renameObject(ModelObject object, String name) {
		ModelOperationRenameObject op = new ModelOperationRenameObject();
		op.model = this;
		op.object = object;
		op.oldName = object.name;
		op.newName = name;
		stepStack.doOperation(op);
	}
	
	public void changeObjectType(ModelObject object, String type, 
			TreeMap<String, String> newProperties) {
		ModelOperationChangeType op = new ModelOperationChangeType();
		op.model = this;
		op.object = object;
		op.oldType = object.type;
		op.newType = type;
		op.oldProperties = new TreeMap<String, String>(object.properties);
		op.newProperties = newProperties;
		stepStack.doOperation(op);
	}
	
	public void changeProperties(ModelObject object, TreeMap<String, String> properties) {
		ModelOperationChangeProperties op = new ModelOperationChangeProperties();
		op.model = this;
		op.object = object;
		op.oldProperties = new TreeMap<String, String>(object.properties);
		op.newProperties = new TreeMap<String, String>(properties);
		stepStack.doOperation(op);
	}
	
}
