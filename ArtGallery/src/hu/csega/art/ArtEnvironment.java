package hu.csega.art;

public class ArtEnvironment {

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public long getStartedTimeStamp() {
		return startedTimeStamp;
	}

	public void setStartedTimeStamp(long startedTimeStamp) {
		this.startedTimeStamp = startedTimeStamp;
	}

	public long getCurrentTimeStamp() {
		return currentTimeStamp;
	}

	public void setCurrentTimeStamp(long currentTimeStamp) {
		this.currentTimeStamp = currentTimeStamp;
	}

	public long getDeltaSinceLastTime() {
		return deltaSinceLastTime;
	}

	public void setDeltaSinceLastTime(long deltaSinceLastTime) {
		this.deltaSinceLastTime = deltaSinceLastTime;
	}

	private int width;
	private int height;
	private long startedTimeStamp;
	private long currentTimeStamp;
	private long deltaSinceLastTime;

}
