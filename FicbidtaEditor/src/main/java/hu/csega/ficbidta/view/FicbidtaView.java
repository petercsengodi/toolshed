package hu.csega.ficbidta.view;

import java.awt.Graphics2D;

import hu.csega.ficbidta.model.ModelNetwork;

public interface FicbidtaView {

	void paint(Graphics2D g, ModelNetwork model);
	
}
