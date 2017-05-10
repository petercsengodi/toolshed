package hu.csega.toolshed.framework;

import hu.csega.toolshed.framework.impl.ToolCanvasImpl;
import hu.csega.toolshed.framework.impl.ViewPortStateProvider;
import hu.csega.units.DefaultImplementation;
import hu.csega.units.Unit;

@Unit
@DefaultImplementation(ToolCanvasImpl.class)
public interface ToolCanvas {

	ToolView getToolView();
	void setToolView(ToolView view);
	void setViewPortStateProvider(ViewPortStateProvider viewPortStateProvider);
	void repaint();

}
