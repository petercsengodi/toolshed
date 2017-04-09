package hu.csega.genetic.framework.measurement;

public class CountMeasurement implements Measurement {

	private int current;
	private int count;

	public CountMeasurement(int count) {
		this.count = count;
		this.current = 0;
	}

	@Override
	public boolean finished() {
		return current++ >= count;
	}

	@Override
	public boolean timeToLog() {
		int div = count / 10;
		return ((count + 1) % div == 0);
	}

}
