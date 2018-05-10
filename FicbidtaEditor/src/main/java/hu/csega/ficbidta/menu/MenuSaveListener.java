package hu.csega.ficbidta.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;

import hu.csega.ficbidta.model.ModelSaver;
import hu.csega.toolshed.framework.components.ToolComponent;
import hu.csega.toolshed.framework.impl.AbstractTool;

public class MenuSaveListener extends ToolComponent implements ActionListener {

	public MenuSaveListener(AbstractTool tool) {
		super(tool);
	}

	public void actionPerformed(ActionEvent event) {
		JFileChooser fileChooser = new JFileChooser();
		if (fileChooser.showOpenDialog(getWindow().getAwtWindow()) == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();

			try {
				getComponent(ModelSaver.class).saveModelIntoFile(file);
			} catch (IOException ex) {
				getWindow().showMessage("Saving failed :-(");
			}
		}
	}
}
