package hu.csega.blooper.record;

import javax.sound.sampled.*;

import hu.csega.blooper.ui.BLooperRecordPanel;

import java.io.*;

/**
 * @author www.codejava.net, peter
 */
public class JavaSoundRecorder {

	private static final long RECORD_TIME = 5000;
	private static final String ERROR_SUPPORT = "Line not supported.";
	private static final String ERROR_LINE_BUSY = "Line unavailable.";

	private final File wavFile;
	private BLooperRecordPanel looper;

	private AudioFileFormat.Type fileType = AudioFileFormat.Type.WAVE;
	private TargetDataLine line;

	public JavaSoundRecorder(BLooperRecordPanel looper, String filename) {
		this.looper = looper;
		this.wavFile = new File(filename);
	}

	/**
	 * Defines an audio format
	 */
	public static AudioFormat getAudioFormat() {
		// float sampleRate = 16000;
		// float sampleRate = 64000;
		float sampleRate = 190000;
		int sampleSizeInBits = 32; // 8
		int channels = 2;
		boolean signed = true;
		boolean bigEndian = true;
		AudioFormat format = new AudioFormat(sampleRate, sampleSizeInBits,
				channels, signed, bigEndian);
		return format;
	}

	/**
	 * Captures the sound and record into a WAV file
	 */
	public boolean start() {
		timeout(RECORD_TIME);

		try {
			AudioFormat format = getAudioFormat();
			DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);

			// checks if system supports the data line
			if (!AudioSystem.isLineSupported(info)) {
				System.out.println(ERROR_SUPPORT);
				looper.setStatus(ERROR_SUPPORT);
				return false;
			}

			line = (TargetDataLine) AudioSystem.getLine(info);
			line.open(format);
			line.start();   // start capturing

			System.out.println("Start capturing...");

			final AudioInputStream ais = new AudioInputStream(line);

			System.out.println("Start recording...");
			looper.setStatus(BLooperRecordPanel.RECORDING);


			new Thread() {
				@Override
				public void run() {
					try {
						// start recording
						AudioSystem.write(ais, fileType, wavFile);
					} catch (IOException ex) {
						ex.printStackTrace();
						looper.setStatus(BLooperRecordPanel.ERROR);
					}

				}
			}.start();

			return true;
		} catch (LineUnavailableException ex) {
			ex.printStackTrace();
			looper.setStatus(ERROR_LINE_BUSY);
		}

		return false;
	}

	/**
	 * Closes the target data line to finish capturing and recording
	 */
	public  void finish() {
		line.stop();
		line.close();
		looper.setStatus(BLooperRecordPanel.NOTHING);

		new Thread() {
			@Override
			public void run() {

				try {
					Thread.sleep(2000);
					looper.reload();
				} catch(InterruptedException ex) {
					// ...
				}
			}
		}.start();

	}

	public void timeout(final long millis) {

		final int recordingIndex = looper.getRecordingIndex();

		// creates a new thread that waits for a specified
		// of time before stopping
		Thread stopper = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(millis);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}

				if(recordingIndex == looper.getRecordingIndex()) {
					looper.finishRecording();
					System.out.println("Recording finished by stop timer.");
				}
			}
		});

		stopper.start();
	}
}
