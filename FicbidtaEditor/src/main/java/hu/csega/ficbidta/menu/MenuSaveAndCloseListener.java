package hu.csega.ficbidta.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import hu.csega.ficbidta.model.ModelSaver;
import hu.csega.toolshed.framework.components.ToolComponent;
import hu.csega.toolshed.framework.impl.AbstractTool;

public class MenuSaveAndCloseListener extends ToolComponent implements ActionListener {

	public MenuSaveAndCloseListener(AbstractTool tool) {
		super(tool);
	}
	
	public void actionPerformed(ActionEvent event) {
		String ret = getComponent(ModelSaver.class).saveModelIntoString();
		getTool().getMessage().provideRespones(ret);
		getWindow().finish();
	}
}
