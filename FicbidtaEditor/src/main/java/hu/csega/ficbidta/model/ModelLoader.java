package hu.csega.ficbidta.model;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import hu.csega.ficbidta.window.FicbidtaCanvas;
import hu.csega.toolshed.framework.components.ToolComponent;
import hu.csega.toolshed.framework.impl.AbstractTool;
import hu.csega.toolshed.parser.preprocessor.PreProcessor;
import hu.csega.toolshed.parser.preprocessor.PreProcessorImpl;
import hu.csega.toolshed.parser.preprocessor.PreProcessorUtil;
import hu.csega.toolshed.parser.preprocessor.helper.ExpressionWithPositions;
import hu.csega.toolshed.parser.preprocessor.helper.NumberExpression;
import hu.csega.toolshed.parser.preprocessor.helper.OperatorExpression;
import hu.csega.toolshed.parser.preprocessor.helper.UnprocessedText;
import hu.csega.toolshed.parser.preprocessor.impl.PreProcessorException;
import hu.csega.units.UnitStore;

public class ModelLoader extends ToolComponent {

	public ModelLoader(AbstractTool tool) {
		super(tool);
	}

	public void loadModelFromString(String text) {
		UnprocessedText content = PreProcessorUtil.loadString(text);
		loadModelFromUnprocessedText(content);
	}

	public void loadModelFromFile(File file) {
		try {
			UnprocessedText content = PreProcessorUtil.loadFile(file);
			loadModelFromUnprocessedText(content);
		} catch (IOException e) {
			ModelNetwork model = getComponent(ModelNetwork.class);
			model.clear();
			model.messages.add("Error: " + e.getMessage());
		} catch (PreProcessorException e) {
			ModelNetwork model = getComponent(ModelNetwork.class);
			model.clear();
			model.messages.add("Error: " + e.getMessage());
		}
	}

	private void loadModelFromUnprocessedText(UnprocessedText text) {
		ModelNetwork model = getComponent(ModelNetwork.class);

		try {
			model.clear();
			getComponent(FicbidtaCanvas.class).resetMarkings();

			PreProcessor parser = UnitStore.instance(PreProcessor.class);
			List<ExpressionWithPositions> expressions = parser.parseText(text);
			ExpressionWithPositions tmp;
			ModelObject lastObject = null;

			Iterator<ExpressionWithPositions> it = expressions.iterator();
			while(it.hasNext()) {
				String type = it.next().getContent(text);

				// Load model nodes
				if(type.equals("node")) {
					ModelNode node = new ModelNode();
					node.id = Integer.parseInt(it.next().getContent(text));

					tmp = it.next();
					if(tmp instanceof NumberExpression) {
						node.x = Integer.parseInt(tmp.getContent(text));
					} else if(tmp instanceof OperatorExpression && tmp.getContent(text).equals("-")) {
						node.x = -Integer.parseInt(it.next().getContent(text));
					} else {
						throw new PreProcessorException(tmp.getStartColumn(), tmp.getStartRow());
					}

					tmp = it.next();
					if(tmp instanceof NumberExpression) {
						node.y = Integer.parseInt(tmp.getContent(text));
					} else if(tmp instanceof OperatorExpression && tmp.getContent(text).equals("-")) {
						node.y = -Integer.parseInt(it.next().getContent(text));
					} else {
						throw new PreProcessorException(tmp.getStartColumn(), tmp.getStartRow());
					}

					model.addNode(node);
					lastObject = node;
				}

				// Load model connections
				if(type.equals("connection")) {
					ModelConnection connection = new ModelConnection();
					connection.id = Integer.parseInt(it.next().getContent(text));
					connection.start = Integer.parseInt(it.next().getContent(text));
					connection.end = Integer.parseInt(it.next().getContent(text));
					model.addConnection(connection);
					lastObject = connection;
				}

				// Load model object name
				if(type.equals("name")) {
					lastObject.name = PreProcessorImpl.readStringFromEscaped(it.next().getContent(text));
				}

				// Load model object type
				if(type.equals("type")) {
					lastObject.type = PreProcessorImpl.readStringFromEscaped(it.next().getContent(text));
				}

				// Load model object type
				if(type.equals("property")) {
					String propertyName = PreProcessorImpl.readStringFromEscaped(it.next().getContent(text));
					String propertyValue = PreProcessorImpl.readStringFromEscaped(it.next().getContent(text));
					lastObject.properties.put(propertyName, propertyValue);
				}
			}
		} catch (PreProcessorException e) {
			model.clear();
			model.messages.add("Error: " + e.getMessage() + " row: " +
					e.getRow() + " column: " + e.getColumn());
		}
	}

}
