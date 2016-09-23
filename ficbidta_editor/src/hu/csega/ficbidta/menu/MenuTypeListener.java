package hu.csega.ficbidta.menu;

import hu.csega.ficbidta.FicbidtaTypeDialog;
import hu.csega.ficbidta.model.ModelNetwork;
import hu.csega.ficbidta.model.ModelObject;
import hu.csega.toolshed.AbstractTool;
import hu.csega.toolshed.ToolComponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuTypeListener extends ToolComponent implements ActionListener {

	public MenuTypeListener(AbstractTool tool) {
		super(tool);
	}
	
	public void actionPerformed(ActionEvent event) {
		ModelObject object = getComponent(ModelNetwork.class).getSelectedObject();
		if(object == null) {
			getWindow().showMessage("There can be only one (selected)!");
			return;
		}
		
		getComponent(FicbidtaTypeDialog.class).setLocationRelativeTo(getWindow().getAwtWindow());
		getComponent(FicbidtaTypeDialog.class).open(object);
	}
}
