package hu.csega.toolshed.framework.time;

import java.util.Date;

import hu.csega.units.DefaultImplementation;
import hu.csega.units.Unit;

@Unit
@DefaultImplementation(TimeServiceImpl.class)
public interface TimeService {

	Date currentDate();

	void sleep(long millis) throws InterruptedException;

}
