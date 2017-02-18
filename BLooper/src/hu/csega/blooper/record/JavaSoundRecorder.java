package hu.csega.blooper.record;

import javax.sound.sampled.*;

import hu.csega.blooper.BLooperMain;

import java.io.*;

/**
 * @author www.codejava.net, peter
 */
public class JavaSoundRecorder {

	public JavaSoundRecorder(BLooperMain looper) {
		this.looper = looper;
	}

    // record duration, in milliseconds
    static final long RECORD_TIME = 5000;

    // path of the wav file
    File wavFile = new File(BLooperMain.TEMP_FILE);

    // format of audio file
    AudioFileFormat.Type fileType = AudioFileFormat.Type.WAVE;

    // the line from which audio data is captured
    TargetDataLine line;

    /**
     * Defines an audio format
     */
    public static AudioFormat getAudioFormat() {
        // float sampleRate = 16000;
    	// float sampleRate = 64000;
    	float sampleRate = 190000;
        int sampleSizeInBits = 8;
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

            AudioInputStream ais = new AudioInputStream(line);

            System.out.println("Start recording...");

            // start recording
            AudioSystem.write(ais, fileType, wavFile);

            return true;
        } catch (LineUnavailableException ex) {
            ex.printStackTrace();
            looper.setStatus(ERROR_LINE_BUSY);
        } catch (IOException ioe) {
            ioe.printStackTrace();
            looper.setStatus(BLooperMain.ERROR);
        }

        return false;
    }

    /**
     * Closes the target data line to finish capturing and recording
     */
   public  void finish() {
        line.stop();
        line.close();
        System.out.println("Finished");
    }

    public void timeout(final long millis) {

        // creates a new thread that waits for a specified
        // of time before stopping
        Thread stopper = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(millis);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }

                finish();
            }
        });

        stopper.start();
    }

    private BLooperMain looper;

    private static final String ERROR_SUPPORT = "Line not supported.";
    private static final String ERROR_LINE_BUSY = "Line unavailable.";
}