package hu.csega.ficbidta.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import hu.csega.ficbidta.model.ModelNetwork;
import hu.csega.ficbidta.model.ModelObject;
import hu.csega.ficbidta.window.FicbidtaPropertyDialog;
import hu.csega.toolshed.framework.components.ToolComponent;
import hu.csega.toolshed.framework.impl.AbstractTool;

public class MenuPropertiesListener extends ToolComponent implements ActionListener {

	public MenuPropertiesListener(AbstractTool tool) {
		super(tool);
	}
	
	public void actionPerformed(ActionEvent event) {
		ModelObject object = getComponent(ModelNetwork.class).getSelectedObject();
		if(object == null) {
			getWindow().showMessage("There can be only one (selected)!");
			return;
		}
		
		getComponent(FicbidtaPropertyDialog.class).setLocationRelativeTo(getWindow().getAwtWindow());
		getComponent(FicbidtaPropertyDialog.class).open(object);
	}
}
