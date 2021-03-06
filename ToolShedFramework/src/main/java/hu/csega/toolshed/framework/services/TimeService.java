package hu.csega.toolshed.framework.services;

import hu.csega.units.DefaultImplementation;
import hu.csega.units.Unit;

import java.util.Date;

@Unit
@DefaultImplementation(TimeServiceImpl.class)
public interface TimeService {

	Date currentDate();

	void sleep(long millis) throws InterruptedException;

}
