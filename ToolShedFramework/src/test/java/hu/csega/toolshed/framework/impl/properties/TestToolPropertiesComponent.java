package hu.csega.toolshed.framework.impl.properties;

import java.awt.Dimension;

import javax.swing.JFrame;

public class TestToolPropertiesComponent {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Test Properties Component");

		ExampleToolBackingBean backingBean = new ExampleToolBackingBean();
		backingBean.setAuthor("csega");

		ToolPropertiesComponent properties = new ToolPropertiesComponent(backingBean);
		properties.setPreferredSize(new Dimension(200, 200));
		frame.getContentPane().add(properties);

		frame.pack();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
