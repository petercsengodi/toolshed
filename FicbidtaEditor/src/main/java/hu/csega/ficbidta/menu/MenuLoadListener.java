package hu.csega.ficbidta.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;

import hu.csega.ficbidta.model.ModelLoader;
import hu.csega.ficbidta.view.SimpleView;
import hu.csega.ficbidta.window.FicbidtaCanvas;
import hu.csega.toolshed.framework.components.ToolComponent;
import hu.csega.toolshed.framework.impl.AbstractTool;

public class MenuLoadListener extends ToolComponent implements ActionListener {

	public MenuLoadListener(AbstractTool tool) {
		super(tool);
	}

	public void actionPerformed(ActionEvent event) {
		JFileChooser fileChooser = new JFileChooser();
		if (fileChooser.showOpenDialog(getWindow().getAwtWindow()) == JFileChooser.APPROVE_OPTION) {
		  File file = fileChooser.getSelectedFile();
		  
		  if(file.exists()) {
			  getComponent(ModelLoader.class).loadModelFromFile(file);
			  getComponent(SimpleView.class).resetViewPort();
			  getComponent(FicbidtaCanvas.class).repaint();
		  }
		}
	}

}
