package hu.csega.ficbidta.controller;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

class FicbidtaContextMenu extends JPopupMenu {

	JMenuItem createNode;

	public FicbidtaContextMenu(GraphicalController controller) {
		createNode = new JMenuItem("Create Node Here");
		createNode.addActionListener(new MenuCreateNodeListener(controller));
		add(createNode);
	}

	private static final long serialVersionUID = 1L;
}