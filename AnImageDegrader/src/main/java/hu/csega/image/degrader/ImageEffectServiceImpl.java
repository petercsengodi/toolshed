package hu.csega.image.degrader;

import java.awt.Image;

public class ImageEffectServiceImpl implements ImageEffectService {

	@Override
	public Image loadImage(String fileName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Image degradeBySimpleAlgorithm(Image input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ImageGeneticAlgorithmContainer createGeneticAlgorithmContainer() {
		// TODO Auto-generated method stub
		return new ImageGeneticAlgorithmContainerImpl();
	}

}
