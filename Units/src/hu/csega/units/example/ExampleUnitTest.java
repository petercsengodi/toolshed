package hu.csega.units.example;

import hu.csega.units.UnitStateListener;
import hu.csega.units.UnitStore;

import org.junit.Test;

public class ExampleUnitTest {

	@Test
	public void test() {
		
		ExampleUnit example = UnitStore.createOrGetUnit(ExampleUnit.class);
		
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
