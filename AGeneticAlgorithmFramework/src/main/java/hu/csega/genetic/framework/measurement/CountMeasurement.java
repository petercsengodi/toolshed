package hu.csega.genetic.framework.measurement;

public class CountMeasurement implements Measurement {

	private int current;
	private int count;
	private int autoSaveBlock;

	public CountMeasurement(int count, int autoSave) {
		this.count = count;
		this.current = 0;
		this.autoSaveBlock = autoSave;
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

	@Override
	public boolean autoSave() {
		return ((count + 1) % autoSaveBlock == 0);
	}
}
