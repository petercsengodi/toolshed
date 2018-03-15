package hu.csega.ficbidta.window;

import java.util.List;

import hu.csega.ficbidta.code.generation.CodeGenerator;

public abstract class FicbidtaAbstractObjectProvider {

	public abstract String name();

	public abstract List<Class<?>> nodeTypes();

	public abstract List<Class<?>> connectionTypes();

	public abstract List<CodeGenerator> codeGenerators();
}
