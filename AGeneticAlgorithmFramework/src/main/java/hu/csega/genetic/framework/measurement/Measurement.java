package hu.csega.genetic.framework.measurement;

public interface Measurement {

	boolean finished();
	boolean timeToLog();
	boolean autoSave();

}
