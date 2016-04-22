package hu.csega.units.example;

import hu.csega.units.DefaultImplementation;

@DefaultImplementation(ExampleUnitImpl.class)
public interface ExampleUnit {
	
	void run();

}
