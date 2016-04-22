package hu.csega.units.example;

import hu.csega.units.DefaultImplementation;

import java.util.Date;

@DefaultImplementation(TimeServiceImpl.class)
public interface TimeService {

	Date currentDate();
	
	void sleep(long millis) throws InterruptedException;
	
}
