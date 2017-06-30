package hu.csega.blooper.play;

import javax.sound.sampled.Clip;

public class PlayClipThread extends Thread {

	private Clip clip;

	public PlayClipThread(Clip clip) {
		this.clip = clip;
	}

	@Override
	public void run() {
		try {
			clip.start();
			long waitInMillis = clip.getMicrosecondLength() / 1000;
			Thread.sleep(waitInMillis);
			clip.close();
		} catch(InterruptedException ex) {
			throw new RuntimeException(ex);
		}
	}

}
