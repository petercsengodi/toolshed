package hu.csega.ficbidta.menu;

import hu.csega.ficbidta.code.generation.CodeGeneratingTool;
import hu.csega.toolshed.AbstractTool;
import hu.csega.toolshed.ToolComponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;

public class MenuGenerateListener extends ToolComponent implements ActionListener {

	public MenuGenerateListener(AbstractTool tool) {
		super(tool);
	}

	public void actionPerformed(ActionEvent event) {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		if (fileChooser.showOpenDialog(getWindow().getAwtWindow()) == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();

			if(!file.isDirectory()) {
				getWindow().showMessage("You need to select a directory!");
				return;
			}

			try {
				getComponent(CodeGeneratingTool.class).generateModelIntoDirectory(file);
				getWindow().showMessage("No error occurred during generation.");
			} catch (Exception ex) {
				ex.printStackTrace();
				getWindow().showMessage("Generation failed :-(");
			}
		}
	}
}
