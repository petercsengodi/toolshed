package hu.csega.units.example;

import hu.csega.units.AbstractUnit;
import hu.csega.units.Parent;

public class ExtraUnitImpl extends AbstractUnit implements ExtraUnit {
	
	@Parent
	public void setParent(ExampleUnit parent) {
		this.parent = parent;
		System.out.println("Parent set: " + parent.getClass().getSimpleName());
	}
	
	@SuppressWarnings("unused")
	private ExampleUnit parent;
}
