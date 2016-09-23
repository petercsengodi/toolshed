package hu.csega.ficbidta.code.generation;

import java.io.File;

import hu.csega.ficbidta.model.ModelNetwork;

public interface CodeGenerator {

	void generate(ModelNetwork model, File chosenDirectory);

}
