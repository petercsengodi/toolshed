package hu.csega.ficbidta.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import hu.csega.toolshed.framework.components.ToolComponent;
import hu.csega.toolshed.framework.impl.AbstractTool;

public class MenuExitListener extends ToolComponent implements ActionListener {

	public MenuExitListener(AbstractTool tool) {
		super(tool);
	}
	
	public void actionPerformed(ActionEvent event) {
		getWindow().finish();
	}
}
