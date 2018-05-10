package hu.csega.ficbidta.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import hu.csega.ficbidta.model.ModelNetwork;
import hu.csega.ficbidta.view.SimpleView;
import hu.csega.ficbidta.window.FicbidtaCanvas;
import hu.csega.toolshed.framework.components.ToolComponent;
import hu.csega.toolshed.framework.impl.AbstractTool;

public class MenuNewListener extends ToolComponent implements ActionListener {

	public MenuNewListener(AbstractTool tool) {
		super(tool);
	}

	public void actionPerformed(ActionEvent event) {
		getComponent(ModelNetwork.class).clear();
		getComponent(SimpleView.class).resetViewPort();
		getComponent(FicbidtaCanvas.class).repaint();
	}

}
