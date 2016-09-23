package hu.csega.ficbidta;

import java.awt.Canvas;

import hu.csega.ficbidta.basic.FicbidtaBasicObjectProvider;
import hu.csega.ficbidta.code.generation.CodeGeneratingTool;
import hu.csega.ficbidta.controller.GraphicalController;
import hu.csega.ficbidta.menu.MenuCreator;
import hu.csega.ficbidta.model.ModelLoader;
import hu.csega.ficbidta.model.ModelNetwork;
import hu.csega.ficbidta.model.ModelSaver;
import hu.csega.ficbidta.view.ModelConnectionRenderer;
import hu.csega.ficbidta.view.ModelNodeRenderer;
import hu.csega.ficbidta.view.SimpleView;
import hu.csega.toolshed.AbstractTool;
import hu.csega.toolshed.Tool;
import hu.csega.toolshed.ToolCallback;
import hu.csega.toolshed.ToolFrame;
import hu.csega.toolshed.ToolMessage;
import hu.csega.toolshed.ToolWindow;

@Tool(name = "Ficbidta Editor")
public class FicbidtaEditor extends AbstractTool {

	private static final String APPLICATION_TITLE =
			"FICBIDTA - Fuck, I can't believe I'm doing this again";
	public static final String VERSION = "00.00.0001";


	@Override
	public String getTitle() {
		return APPLICATION_TITLE;
	}

	public void createComponents() {
		registerComponent(this);

		FicbidtaCanvas canvas = new FicbidtaCanvas(this);
		registerComponent(canvas);
		registerComponent(Canvas.class, canvas);

		registerComponent(new ModelNetwork(this));
		registerComponent(new SimpleView(this));
		registerComponent(new GraphicalController(this));
		registerComponent(new FicbidtaPropertyDialog(this));
		registerComponent(new FicbidtaNameDialog(this));
		registerComponent(new FicbidtaTypeDialog(this));
		registerComponent(new ModelLoader(this));
		registerComponent(new ModelSaver(this));
		registerComponent(new ModelNodeRenderer(this));
		registerComponent(new ModelConnectionRenderer(this));
		registerComponent(new CodeGeneratingTool(this));

		// TODO: change in some way
		registerComponent(FicbidtaAbstractObjectProvider.class,
				new FicbidtaBasicObjectProvider());
	}

	@Override
	public void initialize(ToolWindow window) {
		createComponents();

		MenuCreator menuCreator = new MenuCreator(this);
		menuCreator.createMenuBar();

		window.getContentPane().add(getComponent(FicbidtaCanvas.class));
		getComponent(GraphicalController.class).apply();
	}

	public static void main(String[] args) {
		//		embedded();
		startFrame();
	}

	public static void startFrame() {
		ToolMessage msg = new ToolMessage("", new ToolCallback() {
			public void call(ToolMessage message) {
				if(message.isResponseProvided()) {
					System.out.println(message.getResponse());
				}
			}
		});

		ToolFrame toolFrame = new ToolFrame();
		AbstractTool tool = new FicbidtaEditor();
		tool.setMessage(msg);
		toolFrame.embed(tool);
		toolFrame.start();
	}

	public static void embedded() {
		ToolFrame toolFrame = new ToolFrame();
		toolFrame.embed(new FicbidtaEditor());
		toolFrame.start();
	}

}
