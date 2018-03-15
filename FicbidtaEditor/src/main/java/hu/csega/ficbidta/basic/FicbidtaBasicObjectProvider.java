package hu.csega.ficbidta.basic;

import hu.csega.ficbidta.basic.connections.FicbidtaBasicGenericConnection;
import hu.csega.ficbidta.basic.generation.SampleCodeGenerator;
import hu.csega.ficbidta.basic.nodes.FicbidtaBasicGenericNode;
import hu.csega.ficbidta.code.generation.CodeGenerator;
import hu.csega.ficbidta.window.FicbidtaAbstractObjectProvider;

import java.util.Arrays;
import java.util.List;

public class FicbidtaBasicObjectProvider extends FicbidtaAbstractObjectProvider {

	private Class<?>[] nodeTypeArray = { FicbidtaBasicGenericNode.class };
	private Class<?>[] connectionTypeArray = { FicbidtaBasicGenericConnection.class };
	private List<CodeGenerator> codeGenerators = Arrays.asList((CodeGenerator)new SampleCodeGenerator());

	@Override
	public String name() {
		return "Basic";
	}

	@Override
	public List<Class<?>> nodeTypes() {
		return Arrays.asList(nodeTypeArray);
	}

	@Override
	public List<Class<?>> connectionTypes() {
		return Arrays.asList(connectionTypeArray);
	}

	@Override
	public List<CodeGenerator> codeGenerators() {
		return codeGenerators;
	}

}
