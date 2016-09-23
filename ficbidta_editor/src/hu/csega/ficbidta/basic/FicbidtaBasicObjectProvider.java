package hu.csega.ficbidta.basic;

import hu.csega.ficbidta.FicbidtaAbstractObjectProvider;
import hu.csega.ficbidta.basic.connections.FicbidtaBasicGenericConnection;
import hu.csega.ficbidta.basic.nodes.FicbidtaBasicGenericNode;

import java.util.Arrays;
import java.util.List;
 
public class FicbidtaBasicObjectProvider extends FicbidtaAbstractObjectProvider {

	private Class<?>[] nodeTypeArray = { FicbidtaBasicGenericNode.class };
	private Class<?>[] connectionTypeArray = { FicbidtaBasicGenericConnection.class };

	public String name() {
		return "Basic";
	}

	public List<Class<?>> nodeTypes() {
		return Arrays.asList(nodeTypeArray);
	}

	public List<Class<?>> connectionTypes() {
		return Arrays.asList(connectionTypeArray);
	}

}
