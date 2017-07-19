package hu.csega.toolshed.framework.impl.tree;

import java.awt.Dimension;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;

import hu.csega.toolshed.framework.ToolProperty;

public class TestTreeViewComponent {

	public static class TestTreeNode {

		@ToolProperty("name")
		private String name;

		@ToolProperty("children")
		private List<TestTreeSubNode> children;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<TestTreeSubNode> getChildren() {
			return children;
		}

		public void setChildren(List<TestTreeSubNode> children) {
			this.children = children;
		}
	}

	public static class TestTreeSubNode {

		@ToolProperty("name")
		private String name;

		@ToolProperty("value")
		private String value;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

	}

	public static void main(String[] args) {
		TestTreeSubNode subNode1 = new TestTreeSubNode();
		subNode1.setName("Title");
		subNode1.setValue("The man with a heart");

		TestTreeSubNode subNode2 = new TestTreeSubNode();
		subNode2.setName("Published");
		subNode2.setValue("2017");

		TestTreeNode node = new TestTreeNode();
		node.setName("Root");
		node.setChildren(Arrays.asList(subNode1, subNode2));

		JFrame frame = new JFrame("Test TreeView Component");

		ToolTreeViewComponent treeView = new ToolTreeViewComponent(node);
		treeView.setPreferredSize(new Dimension(200, 200));
		frame.getContentPane().add(treeView);

		frame.pack();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
