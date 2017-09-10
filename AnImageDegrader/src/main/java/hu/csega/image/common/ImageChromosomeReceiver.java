package hu.csega.image.common;

import java.awt.Color;
import java.awt.Image;

import hu.csega.genetic.framework.ChromosomeReceiver;

public interface ImageChromosomeReceiver extends ChromosomeReceiver {

	void draw(Image tmpImage, Color clearColor);

}
