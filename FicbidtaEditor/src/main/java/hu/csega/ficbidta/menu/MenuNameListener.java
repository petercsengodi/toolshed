package hu.csega.ficbidta.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import hu.csega.ficbidta.model.ModelNetwork;
import hu.csega.ficbidta.model.ModelObject;
import hu.csega.ficbidta.window.FicbidtaNameDialog;
import hu.csega.toolshed.framework.components.ToolComponent;
import hu.csega.toolshed.framework.impl.AbstractTool;

public class MenuNameListener extends ToolComponent implements ActionListener {

	public MenuNameListener(AbstractTool tool) {
		super(tool);
	}
	
	public void actionPerformed(ActionEvent event) {
		ModelObject object = getComponent(ModelNetwork.class).getSelectedObject();
		if(object == null) {
			getWindow().showMessage( "There can be only one (selected)!");
			return;
		}
		
		getComponent(FicbidtaNameDialog.class).setLocationRelativeTo(getWindow().getAwtWindow());
		getComponent(FicbidtaNameDialog.class).open(object);
	}
}
