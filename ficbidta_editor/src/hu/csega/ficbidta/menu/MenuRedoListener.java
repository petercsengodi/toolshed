package hu.csega.ficbidta.menu;

import hu.csega.ficbidta.FicbidtaCanvas;
import hu.csega.ficbidta.model.ModelNetwork;
import hu.csega.toolshed.AbstractTool;
import hu.csega.toolshed.ToolComponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuRedoListener extends ToolComponent implements ActionListener {

	public MenuRedoListener(AbstractTool tool) {
		super(tool);
	}

	public void actionPerformed(ActionEvent event) {
		getComponent(ModelNetwork.class).stepStack.redoOneStep();
		getComponent(FicbidtaCanvas.class).repaint();
	}

}
