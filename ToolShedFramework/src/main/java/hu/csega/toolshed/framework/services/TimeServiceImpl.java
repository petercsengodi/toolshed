package hu.csega.toolshed.framework.services;

import java.util.Calendar;
import java.util.Date;

public class TimeServiceImpl implements TimeService {

	@Override
	public Date currentDate() {
		return Calendar.getInstance().getTime();
	}

	@Override
	public void sleep(long millis) throws InterruptedException {
		Thread.sleep(millis);
	}

}
