package hu.csega.image.degrader;

import java.awt.Image;

import hu.csega.units.DefaultImplementation;
import hu.csega.units.Unit;

@Unit
@DefaultImplementation(ImageEffectServiceImpl.class)
public interface ImageEffectService {

	Image loadImage(String fileName);

	Image degradeBySimpleAlgorithm(Image input);

	ImageGeneticAlgorithmContainer createGeneticAlgorithmContainer();

}
