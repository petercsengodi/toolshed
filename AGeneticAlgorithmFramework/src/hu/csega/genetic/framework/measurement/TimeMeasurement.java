package hu.csega.genetic.framework.measurement;

public class TimeMeasurement implements Measurement {

	private long allTimeInMillis;
	private long startedAt;
	private long block;
	private long lastLogged = 0;

	public TimeMeasurement(long allTimeInMinutes) {
		this.allTimeInMillis = allTimeInMinutes * 60_000;
		this.startedAt = System.currentTimeMillis();
		this.block = allTimeInMillis / 20;
		this.lastLogged = 0;
	}

	@Override
	public boolean finished() {
		long allDurationInMillis = System.currentTimeMillis() - startedAt;
		return allDurationInMillis >= allTimeInMillis;
	}

	@Override
	public boolean timeToLog() {
		long b = currentBlock();
		if(b > lastLogged) {
			lastLogged = b;
			return true;
		}

		return false;
	}

	private long currentBlock() {
		long allDurationInMillis = System.currentTimeMillis() - startedAt;
		return allDurationInMillis / block;
	}
}
