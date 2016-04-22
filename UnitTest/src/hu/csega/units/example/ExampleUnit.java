package hu.csega.units.example;

import hu.csega.units.DefaultImplementation;
import hu.csega.units.Unit;

@Unit
@DefaultImplementation(ExampleUnitImpl.class)
public interface ExampleUnit {

	void run();

}
