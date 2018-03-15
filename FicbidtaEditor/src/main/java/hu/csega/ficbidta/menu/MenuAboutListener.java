package hu.csega.ficbidta.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import hu.csega.ficbidta.FicbidtaEditor;
import hu.csega.toolshed.framework.components.ToolComponent;
import hu.csega.toolshed.framework.impl.AbstractTool;

public class MenuAboutListener extends ToolComponent implements ActionListener {

	public MenuAboutListener(AbstractTool tool) {
		super(tool);
	}

	public void actionPerformed(ActionEvent event) {
		getWindow().showMessage("v" + FicbidtaEditor.VERSION);
	}
}
