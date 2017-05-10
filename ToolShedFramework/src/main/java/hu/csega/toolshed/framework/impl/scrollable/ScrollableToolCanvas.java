package hu.csega.toolshed.framework.impl.scrollable;

import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import hu.csega.toolshed.framework.ToolCanvas;
import hu.csega.toolshed.framework.ToolView;
import hu.csega.toolshed.framework.impl.ViewPortStateProvider;
import hu.csega.units.UnitStore;

public class ScrollableToolCanvas extends JPanel implements ToolCanvas, ViewPortStateProvider, AdjustmentListener {

	private int contentWidth;
	private int contentHeight;
	private Rectangle viewState = new Rectangle();

	private ToolCanvas toolCanvas;
	private JScrollBar horizontal = new JScrollBar(JScrollBar.HORIZONTAL);
	private JScrollBar vertical = new JScrollBar(JScrollBar.VERTICAL);

	private boolean notifyToolCanvas = true;

	public ScrollableToolCanvas(int contentWidth, int contentHeight) {
		this.contentWidth = contentWidth;
		this.contentHeight = contentHeight;

		this.toolCanvas = UnitStore.instance(ToolCanvas.class);
		this.toolCanvas.setViewPortStateProvider(this);
		this.setLayout(new ScrollableToolCanvasLayoutManager());

		this.horizontal.addAdjustmentListener(this);
		this.vertical.addAdjustmentListener(this);

		JPanel corner = new JPanel();
		this.add(ScrollableToolCanvasLayoutManager.VIEW_PORT, (Component)this.toolCanvas);
		this.add(ScrollableToolCanvasLayoutManager.VERTICAL_SCROLL_BAR, vertical);
		this.add(ScrollableToolCanvasLayoutManager.HORIZONTAL_SCROLL_BAR, horizontal);
		this.add(ScrollableToolCanvasLayoutManager.CORNER, corner);

		Component canvas = (Component)this.toolCanvas;
		canvas.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				resizeScrollBars();
			}
		});
	}

	@Override
	public Rectangle getVisibleRectangle() {
		return viewState;
	}

	@Override
	public void setToolView(ToolView view) {
		toolCanvas.setToolView(view);
	}

	@Override
	public ToolView getToolView() {
		return toolCanvas.getToolView();
	}

	@Override
	public void setViewPortStateProvider(ViewPortStateProvider arg0) {
		throw new UnsupportedOperationException("setViewPortStateProvider");
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		adjustViewState();
		if(notifyToolCanvas)
			toolCanvas.repaint();
	}

	public void setViewState() {
		setUpScrollBars();
		adjustViewState();
	}

	private void adjustViewState() {
		Component canvas = (Component)this.toolCanvas;
		viewState.setBounds(horizontal.getValue(), vertical.getValue(), canvas.getWidth(), canvas.getHeight());
	}

	private void setUpScrollBars() {
		horizontal.setMinimum(0);
		horizontal.setUnitIncrement(10);
		horizontal.setBlockIncrement(100);

		vertical.setMinimum(0);
		vertical.setUnitIncrement(10);
		vertical.setBlockIncrement(100);

		resizeScrollBars();
	}

	private void resizeScrollBars() {
		synchronized (this) {
			notifyToolCanvas = false;

			Component canvas = (Component)toolCanvas;
			int maximum = contentWidth - canvas.getWidth();
			horizontal.setMaximum(maximum);
			if(horizontal.getValue() > maximum)
				horizontal.setValue(maximum);

			maximum = contentHeight - canvas.getHeight();
			vertical.setMaximum(maximum);
			if(vertical.getValue() > maximum)
				vertical.setValue(maximum);

			notifyToolCanvas = true;
		}

		toolCanvas.repaint();
	}

	private static final long serialVersionUID = 1L;
}
