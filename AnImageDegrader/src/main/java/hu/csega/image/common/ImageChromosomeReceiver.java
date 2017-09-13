package hu.csega.image.common;

import java.awt.Color;
import java.awt.Image;

import hu.csega.genetic.framework.ChromosomeReceiver;

public interface ImageChromosomeReceiver extends ChromosomeReceiver {

	void draw(Image tmpImage, Color clearColor);
	void draw(int[] buffer, int width, int height, int clearR, int clearG, int clearB);

}
