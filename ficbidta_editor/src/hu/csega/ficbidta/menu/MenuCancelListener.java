package hu.csega.ficbidta.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import hu.csega.toolshed.AbstractTool;
import hu.csega.toolshed.ToolComponent;

public class MenuCancelListener extends ToolComponent implements ActionListener {

	public MenuCancelListener(AbstractTool tool) {
		super(tool);
	}
	
	public void actionPerformed(ActionEvent event) {
		getTool().getMessage().cancelProcess();
		getWindow().finish();
	}
}
