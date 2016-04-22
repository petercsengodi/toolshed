package hu.csega.units.example;

import java.util.Calendar;
import java.util.Date;

import hu.csega.units.UnitStateListener;
import hu.csega.units.UnitStore;

import org.junit.Assert;
import org.junit.Test;

public class ExampleUnitTest {

	@Test
	public void testRealComponents() {
		ExampleUnit example = UnitStore.createOrGetUnit(null, ExampleUnit.class);
		ExampleUnitImpl impl = ((ExampleUnitImpl)example); 
		
		impl.registerStateListener(new UnitStateListener<ExampleUnitImpl, ExampleState>() {
			
			@Override
			public void onState(ExampleUnitImpl unit, ExampleState state) {
				System.out.println("### listener state: " + state.name() +
						" status: " + unit.getStateInfo());
				if(state == ExampleState.MIDDLE) {
					long elapsed = unit.getElapsed();
					boolean	ok = Math.abs(elapsed - 1000) < 100;
					System.out.println("Slept: " + elapsed + " " + (ok ? "OK" : "NOT OK"));
					Assert.assertTrue(ok);
				}
			}

		});
		
		example.run();
	}

	@Test
	public void testTooMuchSleep() {

		ExampleUnitImpl impl = new ExampleUnitImpl();
		
		impl.setExtraUnit(new ExtraUnitImpl());
		
		impl.setTimeService(new TimeService() {
			
			@Override
			public void sleep(long millis) throws InterruptedException {
				Thread.sleep(2*millis);
			}
			
			@Override
			public Date currentDate() {
				return Calendar.getInstance().getTime();
			}
		});
		
		impl.registerStateListener(new UnitStateListener<ExampleUnitImpl, ExampleState>() {
			
			@Override
			public void onState(ExampleUnitImpl unit, ExampleState state) {
				System.out.println("### listener state: " + state.name() +
						" status: " + unit.getStateInfo());
				if(state == ExampleState.MIDDLE) {
					long elapsed = unit.getElapsed();
					boolean	ok = Math.abs(elapsed - 1000) < 100;
					System.out.println("Slept: " + elapsed + " " + (ok ? "OK" : "NOT OK"));
					Assert.assertFalse(ok);
				}			
			}

		});
		
		impl.run();
	}

	@Test
	public void testInvalidTime() {

		ExampleUnitImpl impl = new ExampleUnitImpl();
		
		impl.setExtraUnit(new ExtraUnitImpl());
		
		impl.setTimeService(new TimeService() {
			
			@Override
			public void sleep(long millis) throws InterruptedException {
				Thread.sleep(millis);
			}
			
			@Override
			public Date currentDate() {
				return new Date(0);
			}
		});
		
		impl.registerStateListener(new UnitStateListener<ExampleUnitImpl, ExampleState>() {
			
			@Override
			public void onState(ExampleUnitImpl unit, ExampleState state) {
				System.out.println("### listener state: " + state.name() +
						" status: " + unit.getStateInfo());
				if(state == ExampleState.MIDDLE) {
					long elapsed = unit.getElapsed();
					boolean	ok = Math.abs(elapsed - 1000) < 100;
					System.out.println("Slept: " + elapsed + " " + (ok ? "OK" : "NOT OK"));
					Assert.assertFalse(ok);
				}
			}

		});
		
		impl.run();
	}
}
