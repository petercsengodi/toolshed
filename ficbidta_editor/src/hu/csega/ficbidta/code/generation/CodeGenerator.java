package hu.csega.ficbidta.code.generation;

import java.io.File;

import hu.csega.ficbidta.model.ModelNetwork;
import hu.csega.units.DefaultImplementation;
import hu.csega.units.Unit;

@Unit
@DefaultImplementation(SampleCodeGenerator.class)
public interface CodeGenerator {

	void generate(ModelNetwork model, File chosenDirectory);

}
