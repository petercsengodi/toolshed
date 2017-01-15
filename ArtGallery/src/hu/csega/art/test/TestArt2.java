package hu.csega.art.test;

import java.awt.Color;
import java.awt.Graphics2D;

import hu.csega.art.Art;
import hu.csega.art.ArtEnvironment;
import hu.csega.art.IArt;

@Art(id="test", title="Test Art 2")
public class TestArt2 implements IArt {

	@Override
	public void paint(Graphics2D g, ArtEnvironment env) {
		g.setColor(Color.black);
		g.fillRect(0,  0, env.getWidth(), env.getHeight());
		g.setColor(Color.white);
		g.drawLine(0,  env.getHeight() / 2, env.getWidth(), env.getHeight() / 2);
		g.drawLine(env.getWidth() / 2,  env.getHeight(), env.getWidth() / 2, 0);
	}

}
