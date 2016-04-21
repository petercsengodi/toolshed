package hu.csega.units.example;

import hu.csega.units.UnitStateListener;

import org.junit.Test;

public class ExampleUnitTest {

	@Test
	public void test() {
		
		ExampleUnit example = new ExampleUnit();
		
		example.registerStateListener(new UnitStateListener<ExampleUnit, ExampleState>() {
			
			@Override
			public void onState(ExampleUnit unit, ExampleState state) {
				System.out.println("### listener state: " + state.name() +
						" status: " + unit.getStateInfo());
				
			}

		});
		
		example.run();
	}

}
