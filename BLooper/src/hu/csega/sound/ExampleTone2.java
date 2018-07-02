package hu.csega.sound;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.LineUnavailableException;

public class ExampleTone2 {

	public static void main(String[] args) {

		try {
			ExampleTone2.createTone(262, 440, 100);
		} catch (LineUnavailableException lue) {
			System.out.println(lue);
		}
	}

	/**
	 * parameters are frequency in Hertz and volume
	 **/
	public static void createTone(int Hertz1, int Hertz2, int volume) throws LineUnavailableException {
		/** Exception is thrown when line cannot be opened */

		double A = volume, B = volume;

		float rate = 44100;
		byte[] buf;
		AudioFormat audioF;

		buf = new byte[1];
		audioF = new AudioFormat(rate, 8, 1, true, false);
		// sampleRate, sampleSizeInBits,channels,signed,bigEndian

		SourceDataLine sourceDL1 = AudioSystem.getSourceDataLine(audioF);
		sourceDL1 = AudioSystem.getSourceDataLine(audioF);
		sourceDL1.open(audioF);
		sourceDL1.start();

		SourceDataLine sourceDL2 = AudioSystem.getSourceDataLine(audioF);
		sourceDL2 = AudioSystem.getSourceDataLine(audioF);
		sourceDL2.open(audioF);
		sourceDL2.start();

		for (int i = 0; i < rate; i++) {
			double angle1 = (i / rate) * Hertz1 * 2.0 * Math.PI;
			double angle2 = (i / rate) * Hertz1 * 2.0 * Math.PI;
			buf[0] = (byte) (A * Math.sin(angle1));
			sourceDL1.write(buf, 0, 1);
			buf[0] = (byte) (B * Math.sin(angle2));
			sourceDL2.write(buf, 0, 1);
		}


		sourceDL1.drain();
		sourceDL1.stop();
		sourceDL1.close();

		sourceDL2.drain();
		sourceDL2.stop();
		sourceDL2.close();
	}
}
