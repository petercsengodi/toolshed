package hu.csega.ficbidta.controller;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

class FicbidtaContextMenu extends JPopupMenu {
	
	/**
	 * Default serial version uid. 
	 */
	private static final long serialVersionUID = 1L;
	JMenuItem createNode;

	public FicbidtaContextMenu(GraphicalController controller) {
		createNode = new JMenuItem("Create Node Here");
		createNode.addActionListener(new MenuCreateNodeListener(controller));
		add(createNode);
	}
}