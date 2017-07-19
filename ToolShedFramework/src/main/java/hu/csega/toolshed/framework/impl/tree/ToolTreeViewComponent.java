package hu.csega.toolshed.framework.impl.tree;

import javax.swing.JTree;

public class ToolTreeViewComponent extends JTree {

	Object backingBean;

	public ToolTreeViewComponent() {
	}

	public ToolTreeViewComponent(Object backingBean) {
		this.backingBean = backingBean;
	}

	private static final long serialVersionUID = 1L;
}
