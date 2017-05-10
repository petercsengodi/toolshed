package hu.csega.toolshed.framework.impl.scrollable;

import javax.swing.JFrame;

public class TestScrollableCanvas {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Test Scrollable Canvas");

		ScrollableToolCanvas canvas = new ScrollableToolCanvas(3000, 3000);
		canvas.setToolView(new ExampleView());
		frame.getContentPane().add(canvas);

		frame.pack();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
