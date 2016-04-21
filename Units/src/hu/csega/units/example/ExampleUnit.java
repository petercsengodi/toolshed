package hu.csega.units.example;

import hu.csega.units.AbstractUnit;
import hu.csega.units.Unit;

public class ExampleUnit extends AbstractUnit<ExampleUnit, ExampleState> {

	@Unit
	public void setExtraUnit(ExtraUnit extra) {
		this.extra = extra;
	}
	
	public void run() {
		System.out.println("extra: " + extra);
		
		stateInfo = "started";
		
		naturalStoppingPoint(ExampleState.INIT);
		
		System.out.println("Before middle.");
		
		stateInfo = "processing";
		
		naturalStoppingPoint(ExampleState.MIDDLE);
		
		System.out.println("After middle.");
		
		stateInfo = "finished";
		
		naturalStoppingPoint(ExampleState.END);
	}
	
	public String getStateInfo() {
		return stateInfo;
	}

	private ExtraUnit extra;
	
	private String stateInfo;
}
