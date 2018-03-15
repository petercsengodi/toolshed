package hu.csega.ficbidta.basic.generation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Set;

import hu.csega.ficbidta.code.generation.CodeGenerator;
import hu.csega.ficbidta.model.ModelConnection;
import hu.csega.ficbidta.model.ModelNetwork;
import hu.csega.ficbidta.model.ModelNode;

public class SampleCodeGenerator implements CodeGenerator {

	public void generate(ModelNetwork model, File chosenDirectory) {
		for(ModelNode node : model.nodes) {
			if(node.name == null || node.name.length() == 0) {
				continue;
			}

			File nodeFile = new File(chosenDirectory, node.name + ".java");
			OutputStreamWriter writer = null;
			try {
				writer = new OutputStreamWriter(new FileOutputStream(nodeFile));

				writer.write("\npublic class " + node.name + " {\n");

				Set<ModelConnection> connections = model.connectionStarts.getSet(node.id);
				for(ModelConnection connection : connections) {
					if(connection.name == null || connection.name.length() == 0) {
						continue;
					}

					ModelNode endNode = model.nodeMap.get(connection.end);
					if(endNode.name != null && endNode.name.length() > 0) {
						writer.write("\t\n");
						writer.write("\tprivate " + endNode.name + " " + connection.name + ";\n");
					}
				}

				writer.write("\t\n");
				writer.write("}");

			} catch (FileNotFoundException ex) {
				ex.printStackTrace();
			} catch (IOException ex) {
				ex.printStackTrace();
			} finally {
				if(writer != null) {
					try {
						writer.close();
					} catch(Exception ex) {
						ex.printStackTrace();
					}
				}
			} // end of try
		}
	}

}
