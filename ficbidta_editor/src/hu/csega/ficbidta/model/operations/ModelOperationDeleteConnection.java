package hu.csega.ficbidta.model.operations;

import hu.csega.ficbidta.model.ModelConnection;

public class ModelOperationDeleteConnection extends ModelOperation {

	public ModelConnection connection;
	
	@Override
	public void doOperation() {
		model.connections.remove(connection);
		model.connectionMap.remove(connection.id);
		model.connectionStarts.removeValue(connection.start, connection);
		model.connectionEnds.removeValue(connection.end, connection);
	}

	@Override
	public void undoOperation() {
		model.connections.add(connection);
		model.connectionMap.put(connection.id, connection);
		model.connectionStarts.add(connection.start, connection);
		model.connectionEnds.add(connection.end, connection);
	}

}
