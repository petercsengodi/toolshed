package hu.csega.ficbidta.menu;

import hu.csega.ficbidta.FicbidtaEditor;
import hu.csega.toolshed.AbstractTool;
import hu.csega.toolshed.ToolComponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuAboutListener extends ToolComponent implements ActionListener {

	public MenuAboutListener(AbstractTool tool) {
		super(tool);
	}

	public void actionPerformed(ActionEvent event) {
		getWindow().showMessage("v" + FicbidtaEditor.VERSION);
	}
}
