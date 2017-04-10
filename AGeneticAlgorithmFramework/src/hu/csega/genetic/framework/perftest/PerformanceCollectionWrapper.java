package hu.csega.genetic.framework.perftest;

import java.util.Iterator;

public interface PerformanceCollectionWrapper {

	String type();
	void init();
	void add(Double d);
	Double first();
	Iterator<Double> iterator();

}
