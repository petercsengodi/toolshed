package hu.csega.web.components.renderer;


public class WebRendererFactory {

	public static WebRenderer getRenderer() {
		return new WebJsonRenderer();
	}
}
