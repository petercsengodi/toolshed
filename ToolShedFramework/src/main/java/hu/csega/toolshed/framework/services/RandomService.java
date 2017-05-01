package hu.csega.toolshed.framework.services;

import hu.csega.units.DefaultImplementation;
import hu.csega.units.Unit;

@Unit
@DefaultImplementation(RandomServiceImpl.class)
public interface RandomService {

	int nextInt();

}
