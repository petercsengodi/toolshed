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
import hu.csega.ficbidta.window.FicbidtaAbstractObjectProvider;
import hu.csega.ficbidta.window.FicbidtaCanvas;
import hu.csega.ficbidta.window.FicbidtaNameDialog;
import hu.csega.ficbidta.window.FicbidtaPropertyDialog;
import hu.csega.ficbidta.window.FicbidtaTypeDialog;
import hu.csega.toolshed.framework.Tool;
import hu.csega.toolshed.framework.ToolCallback;
import hu.csega.toolshed.framework.ToolMessage;
import hu.csega.toolshed.framework.ToolWindow;
import hu.csega.toolshed.framework.impl.AbstractTool;
import hu.csega.toolshed.framework.impl.ToolMessageImpl;
import hu.csega.units.UnitStore;

@Tool(name = "Ficbidta Editor")
public class FicbidtaEditor extends AbstractTool {

	private static final String APPLICATION_TITLE =
			"FICBIDTA - Fuck, I can't believe I'm doing this again";
	public static final String VERSION = "00.00.0001";

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

	public void initialize(ToolWindow window) {
		createComponents();

		MenuCreator menuCreator = new MenuCreator(this);
		menuCreator.createMenuBar();

		window.addComponent(getComponent(FicbidtaCanvas.class));
		getComponent(GraphicalController.class).apply();
	}

	public static void main(String[] args) {
		//		embedded();
		startFrame();
	}

	public static void startFrame() {
		ToolMessage msg = new ToolMessageImpl("", new ToolCallback() {
			public void call(ToolMessage message) {
				if(message.isResponseProvided()) {
					System.out.println(message.getResponse());
				}
			}
		});

		ToolWindow toolFrame = UnitStore.instance(ToolWindow.class);
		AbstractTool tool = new FicbidtaEditor();
		tool.setMessage(msg);
		toolFrame.embed(tool);
		toolFrame.start();
	}

	public static void embedded() {
		ToolWindow toolFrame = UnitStore.instance(ToolWindow.class);
		toolFrame.embed(new FicbidtaEditor());
		toolFrame.start();
	}

}
