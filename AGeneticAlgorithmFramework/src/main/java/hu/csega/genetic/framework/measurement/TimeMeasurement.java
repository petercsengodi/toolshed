package hu.csega.genetic.framework.measurement;

public class TimeMeasurement implements Measurement {

	private long allTimeInMillis;
	private long startedAt;
	private long block;
	private long lastLogged;

	private long saveBlock;
	private long lastAutoSaved;

	public TimeMeasurement(long allTimeInMinutes, long autoSaveInMinutes) {
		this.startedAt = System.currentTimeMillis();
		this.allTimeInMillis = allTimeInMinutes * 60_000;
		this.block = allTimeInMillis / 20;
		this.lastLogged = 0;

		this.saveBlock = autoSaveInMinutes * 60_000;
		this.lastAutoSaved = 0;
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

	@Override
	public boolean autoSave() {
		long b = currentAutoSaveBlock();
		if(b > lastAutoSaved) {
			lastAutoSaved = b;
			return true;
		}

		return false;
	}

	private long currentBlock() {
		long allDurationInMillis = System.currentTimeMillis() - startedAt;
		return allDurationInMillis / block;
	}

	private long currentAutoSaveBlock() {
		long duration = System.currentTimeMillis() - startedAt;
		return duration / saveBlock;
	}
}
