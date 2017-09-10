package hu.csega.image.degrader;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;

import hu.csega.units.DefaultImplementation;
import hu.csega.units.Unit;

@Unit
@DefaultImplementation(ImageEffectServiceImpl.class)
public interface ImageEffectService {

	Image loadImage(String fileName);

	BufferedImage loadBufferedImage(String fileName, int width, int height, Color clearColor);

	void imageToRGBArray(BufferedImage image, int result[]);

	ImageGeneticAlgorithmContainer createGeneticAlgorithmContainer();

}
