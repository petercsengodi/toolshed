package hu.csega.ficbidta.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuCreateNodeListener implements ActionListener {

	private GraphicalController controller;
	
	public MenuCreateNodeListener(GraphicalController controller) {
		this.controller = controller;
	}

	public void actionPerformed(ActionEvent arg0) {
		int x = controller.contextMenuX;
		int y = controller.contextMenuY;
		controller.model().createNode(x, y);
		controller.canvas().repaint();
	}

}
