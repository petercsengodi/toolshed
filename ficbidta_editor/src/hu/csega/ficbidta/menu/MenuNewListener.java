package hu.csega.ficbidta.menu;

import hu.csega.ficbidta.FicbidtaCanvas;
import hu.csega.ficbidta.model.ModelNetwork;
import hu.csega.ficbidta.view.SimpleView;
import hu.csega.toolshed.AbstractTool;
import hu.csega.toolshed.ToolComponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
