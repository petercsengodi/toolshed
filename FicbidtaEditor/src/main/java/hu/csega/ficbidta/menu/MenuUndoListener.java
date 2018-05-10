package hu.csega.ficbidta.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import hu.csega.ficbidta.model.ModelNetwork;
import hu.csega.ficbidta.window.FicbidtaCanvas;
import hu.csega.toolshed.framework.components.ToolComponent;
import hu.csega.toolshed.framework.impl.AbstractTool;

public class MenuUndoListener extends ToolComponent implements ActionListener {

	public MenuUndoListener(AbstractTool tool) {
		super(tool);
	}

	public void actionPerformed(ActionEvent event) {
		getComponent(ModelNetwork.class).stepStack.undoOneStep();
		getComponent(FicbidtaCanvas.class).repaint();
	}

}
