package hu.csega.toolshed.framework.impl.scrollable;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class ScrollableToolCanvasLayoutManager implements LayoutManager {

	public static final String VERTICAL_SCROLL_BAR = "verticalScrollBar";
	public static final String HORIZONTAL_SCROLL_BAR = "horizontalScrollBar";
	public static final String CORNER = "corner";
	public static final String VIEW_PORT = "viewPort";

	private Map<String, Component> map = new HashMap<>();

	@Override
	public void addLayoutComponent(String name, Component comp) {
		map.put(name, comp);
	}

	@Override
	public void removeLayoutComponent(Component comp) {
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		return new Dimension(800, 600);
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		return new Dimension(SCROLL_BAR_SIZE * 2, SCROLL_BAR_SIZE * 2);
	}

	@Override
	public void layoutContainer(Container parent) {
		// System.out.println("container" + parent);

		Component viewPort = map.get(VIEW_PORT);
		JPanel corner = (JPanel) map.get(CORNER);
		JScrollBar horizontalScrollBar = (JScrollBar) map.get(HORIZONTAL_SCROLL_BAR);
		JScrollBar verticalScrollBar = (JScrollBar) map.get(VERTICAL_SCROLL_BAR);

		int width = parent.getWidth();
		int height = parent.getHeight();

		viewPort.setBounds(0, 0, width - SCROLL_BAR_SIZE, height - SCROLL_BAR_SIZE);
		corner.setBounds(width - SCROLL_BAR_SIZE, height - SCROLL_BAR_SIZE, SCROLL_BAR_SIZE, SCROLL_BAR_SIZE);
		horizontalScrollBar.setBounds(0, height - SCROLL_BAR_SIZE, width - SCROLL_BAR_SIZE, SCROLL_BAR_SIZE);
		verticalScrollBar.setBounds(width - SCROLL_BAR_SIZE, 0, SCROLL_BAR_SIZE, height - SCROLL_BAR_SIZE);

		ScrollableToolCanvas canvas = (ScrollableToolCanvas)parent;
		canvas.setViewState();
	}

	private static final int SCROLL_BAR_SIZE = 20;
}
