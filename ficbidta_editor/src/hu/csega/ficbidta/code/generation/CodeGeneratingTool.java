package hu.csega.ficbidta.code.generation;

import hu.csega.ficbidta.FicbidtaAbstractObjectProvider;
import hu.csega.ficbidta.model.ModelNetwork;
import hu.csega.toolshed.AbstractTool;
import hu.csega.toolshed.ToolComponent;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class CodeGeneratingTool extends ToolComponent {

	public CodeGeneratingTool(AbstractTool tool) {
		super(tool);
	}

	public void generateModelIntoDirectory(File chosenDirectory) throws IOException {
		ModelNetwork model = getComponent(ModelNetwork.class);
		FicbidtaAbstractObjectProvider provider = getComponent(FicbidtaAbstractObjectProvider.class);
		List<CodeGenerator> codeGenerators = provider.codeGenerators();

		if(codeGenerators != null) {
			for(CodeGenerator codeGenerator : codeGenerators) {
				codeGenerator.generate(model, chosenDirectory);
			}
		}
	}
}
