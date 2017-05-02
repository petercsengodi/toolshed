package hu.csega.image.degrader;

import java.awt.Image;

public interface ImageGeneticAlgorithmContainer {

	void doOneCycle();

	Image bestFit();

	void loadFromFile(String fileName);

	void saveIntoFile(String fileName);

}
