package hu.csega.genetic.framework;

public interface ChromosomeReceiver {

	/**
	 * @return Zero, if lenght is unknown forehand.
	 */
	int sizeInBytes();

	void fillFromChromosome(Chromosome chromosome);

	String printableMessage();

}
