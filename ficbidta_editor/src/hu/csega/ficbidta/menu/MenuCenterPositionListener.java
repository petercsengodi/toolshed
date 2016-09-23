package hu.csega.ficbidta.menu;

import hu.csega.ficbidta.FicbidtaCanvas;
import hu.csega.ficbidta.view.SimpleView;
import hu.csega.toolshed.AbstractTool;
import hu.csega.toolshed.ToolComponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuCenterPositionListener extends ToolComponent implements ActionListener {

	public MenuCenterPositionListener(AbstractTool tool) {
		super(tool);
	}

	public void actionPerformed(ActionEvent event) {
		getComponent(SimpleView.class).resetViewPort();
		getComponent(FicbidtaCanvas.class).repaint();
	}

}
