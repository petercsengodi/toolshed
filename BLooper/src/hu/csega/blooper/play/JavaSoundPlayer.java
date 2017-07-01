package hu.csega.blooper.play;

import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

import hu.csega.blooper.ui.BLooperRecordPanel;

/**
 * @author stackoverflow, peter
 */
@Deprecated
public class JavaSoundPlayer {

	private BLooperRecordPanel looper;
	private String filename;

	private File soundFile;
	private AudioInputStream audioStream;
	private AudioFormat audioFormat;
	private SourceDataLine sourceLine;

	private final int BUFFER_SIZE = 128000;

	public JavaSoundPlayer(BLooperRecordPanel looper, String filename) {
		this.looper = looper;
		this.filename = filename;
	}

	public boolean start() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				playSound(filename);
			}

		}).start();

		return false;
	}

	public void init() {

		if(audioFormat != null)
			return;

		audioFormat = getAudioFormat();

		DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
		try {
			sourceLine = (SourceDataLine) AudioSystem.getLine(info);
			sourceLine.open(audioFormat);
		} catch (LineUnavailableException e) {
			e.printStackTrace();
			looper.setStatus(BLooperRecordPanel.ERROR);
		} catch (Exception e) {
			e.printStackTrace();
			looper.setStatus(BLooperRecordPanel.ERROR);
		}

		sourceLine.start();
	}

	/**
	 * @param filename the name of the file that is going to be played
	 */
	public boolean playSound(String strFilename){

		try {

			soundFile = new File(strFilename);
			audioStream = AudioSystem.getAudioInputStream(soundFile);

			int nBytesRead = 0;
			byte[] abData = new byte[BUFFER_SIZE];
			while (nBytesRead != -1) {
				nBytesRead = audioStream.read(abData, 0, abData.length);
				if (nBytesRead >= 0) {
					@SuppressWarnings("unused")
					int nBytesWritten = sourceLine.write(abData, 0, nBytesRead);
				}
			}

		} catch (Exception e){
			e.printStackTrace();
			looper.setStatus(BLooperRecordPanel.ERROR);
			return false;
		}

		return false;
	}

	public void close() {
		sourceLine.drain();
		sourceLine.close();
	}

	private AudioFormat getAudioFormat() {
		try {
			File soundFile = new File(filename);
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
			AudioFormat audioFormat = audioStream.getFormat();
			audioStream.close();

			return audioFormat;
		} catch (Exception e){
			e.printStackTrace();
			return null;
		}

	}
}