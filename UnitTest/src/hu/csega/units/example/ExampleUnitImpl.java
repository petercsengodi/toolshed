package hu.csega.units.example;

import hu.csega.units.AbstractUnitWithState;
import hu.csega.units.New;
import hu.csega.units.Unit;

public class ExampleUnitImpl extends AbstractUnitWithState<ExampleUnitImpl, ExampleState> implements ExampleUnit {

	@Unit
	public void setExtraUnit(ExtraUnit extra) {
		this.extra = extra;
	}
	
	@New
	public void setTimeService(TimeService timeService) {
		this.timeService = timeService;
	}
	
	@Override
	public void run() {
		System.out.println("extra: " + extra);
		
		stateInfo = "started";
		
		naturalStoppingPoint(ExampleState.INIT);
		
		System.out.println("Before middle.");
		
		stateInfo = "processing";
		
		long start = timeService.currentDate().getTime();
		
		try {
			timeService.sleep(1000l);
		} catch(InterruptedException ex) {
			throw new RuntimeException(ex);
		}
		
		long end = timeService.currentDate().getTime();
		
		elapsed = end - start;
		
		naturalStoppingPoint(ExampleState.MIDDLE);
		
		System.out.println("After middle.");
		
		stateInfo = "finished";
		
		naturalStoppingPoint(ExampleState.END);
	}
	
	public String getStateInfo() {
		return stateInfo;
	}
	
	public long getElapsed() {
		return elapsed;
	}

	private ExtraUnit extra;
	private TimeService timeService;
	
	private long elapsed;
	private String stateInfo;
}
