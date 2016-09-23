package hu.csega.ficbidta.model;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import hu.csega.ficbidta.FicbidtaCanvas;
import hu.csega.toolshed.AbstractTool;
import hu.csega.toolshed.ToolComponent;
import hu.csega.toolshed.simple.parser.SimpleParser;
import hu.csega.toolshed.simple.parser.SimpleParserImpl;
import hu.csega.toolshed.simple.parser.SimpleParserUtil;
import hu.csega.toolshed.simple.parser.helper.ExpressionWithPositions;
import hu.csega.toolshed.simple.parser.helper.NumberExpression;
import hu.csega.toolshed.simple.parser.helper.OperatorExpression;
import hu.csega.toolshed.simple.parser.helper.UnprocessedText;
import hu.csega.toolshed.simple.parser.preprocessor.PreProcessorException;
import hu.csega.units.UnitStore;

public class ModelLoader extends ToolComponent {

	public ModelLoader(AbstractTool tool) {
		super(tool);
	}

	public void loadModelFromString(String text) {
		UnprocessedText content = SimpleParserUtil.loadString(text);
		loadModelFromUnprocessedText(content);
	}

	public void loadModelFromFile(File file) {
		try {
			UnprocessedText content = SimpleParserUtil.loadFile(file);
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

			SimpleParser parser = UnitStore.instance(SimpleParser.class);
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
					lastObject.name = SimpleParserImpl.readStringFromEscaped(it.next().getContent(text));
				}

				// Load model object type
				if(type.equals("type")) {
					lastObject.type = SimpleParserImpl.readStringFromEscaped(it.next().getContent(text));
				}

				// Load model object type
				if(type.equals("property")) {
					String propertyName = SimpleParserImpl.readStringFromEscaped(it.next().getContent(text));
					String propertyValue = SimpleParserImpl.readStringFromEscaped(it.next().getContent(text));
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
