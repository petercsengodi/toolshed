package hu.csega.genetic.framework;

public interface ChromosomeReceiver {

	void fillFromChromosome(Chromosome chromosome);

	String printableMessage();

}
