package hu.csega.toolshed.framework.services;

import java.util.Random;

public class RandomServiceImpl implements RandomService {

	private Random random = new Random(System.currentTimeMillis());

	@Override
	public int nextInt() {
		return random.nextInt();
	}

}
