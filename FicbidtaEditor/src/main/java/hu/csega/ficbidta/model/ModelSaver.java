package hu.csega.ficbidta.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Map;

import hu.csega.toolshed.framework.components.ToolComponent;
import hu.csega.toolshed.framework.impl.AbstractTool;
import hu.csega.toolshed.parser.preprocessor.impl.PreProcessorImpl;

public class ModelSaver extends ToolComponent {

	public ModelSaver(AbstractTool tool) {
		super(tool);
	}


	public String saveModelIntoString() {
		StringBuilder builder = new StringBuilder();
		ModelSaverWriter writer = new ModelSaverWriter(builder);
		saveModel(writer);
		return builder.toString();
	}

	public void saveModelIntoFile(File file) throws IOException {
		OutputStreamWriter streamWriter = new OutputStreamWriter(new FileOutputStream(file));
		ModelSaverWriter writer = new ModelSaverWriter(streamWriter);
		saveModel(writer);
		streamWriter.close();
	}

	public void saveModel(ModelSaverWriter writer) {

		// Save model nodes
		ModelNetwork model = getComponent(ModelNetwork.class);
		for(ModelNode node : model.nodes) {
			writer.write("node");
			writer.write(" ");
			writer.write(String.valueOf(node.id));
			writer.write(" ");
			writer.write(String.valueOf(node.x));
			writer.write(" ");
			writer.write(String.valueOf(node.y));
			writer.write("\n");

			writer.write("name ");
			writer.write(PreProcessorImpl.writeStringEscaped(node.name));
			writer.write("\n");

			writer.write("type ");
			writer.write(PreProcessorImpl.writeStringEscaped(node.type));
			writer.write("\n");

			for(Map.Entry<String, String> entry : node.properties.entrySet()) {
				String propertyName = entry.getKey();
				String propertyValue = entry.getValue();
				writer.write("property ");
				writer.write(PreProcessorImpl.writeStringEscaped(propertyName));
				writer.write(" ");
				writer.write(PreProcessorImpl.writeStringEscaped(propertyValue));
				writer.write("\n");
			}

			writer.flush();
		}

		// Save model connections
		for(ModelConnection connection : model.connections) {
			writer.write("connection");
			writer.write(" ");
			writer.write(String.valueOf(connection.id));
			writer.write(" ");
			writer.write(String.valueOf(connection.start));
			writer.write(" ");
			writer.write(String.valueOf(connection.end));
			writer.write("\n");

			writer.write("name ");
			writer.write(PreProcessorImpl.writeStringEscaped(connection.name));
			writer.write("\n");

			writer.write("type ");
			writer.write(PreProcessorImpl.writeStringEscaped(connection.type));
			writer.write("\n");

			for(Map.Entry<String, String> entry : connection.properties.entrySet()) {
				String propertyName = entry.getKey();
				String propertyValue = entry.getValue();
				writer.write("property ");
				writer.write(PreProcessorImpl.writeStringEscaped(propertyName));
				writer.write(" ");
				writer.write(PreProcessorImpl.writeStringEscaped(propertyValue));
				writer.write("\n");
			}

			writer.flush();
		}
	}
}
