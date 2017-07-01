package hu.csega.blooper.ui;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.io.File;

import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import hu.csega.blooper.play.SoundManager;
import hu.csega.blooper.record.JavaSoundRecorder;

public class BLooperRecordPanel extends JPanel implements ActionListener {

	public static final String NOT_LOADED = "Not loaded.";
	public static final String NOTHING = "Nothing.";
	public static final String RECORDING = "Recording.";
	public static final String PLAYING = "Playing.";
	public static final String ERROR = "Error.";

	private char keyChar;
	private String filename;
	private File file;

	private JButton record;
	private JButton stop;
	private JButton replay;
	private JCheckBox loop;
	private JLabel status;
	private JTextField loopStart;
	private JTextField loopEnd;

	private Clip clip = null;
	private boolean playerStarted = false;
	private boolean recorderStarted = false;
	private JavaSoundRecorder recorder;
	private SoundManager soundManager;

	public int recordingIndex = 0;

	public BLooperRecordPanel(int index, SoundManager soundManager) {
		this.keyChar = (char) ( '0' + index);
		this.filename = "loops/loop-" + index + ".wav";
		this.file = new File(this.filename);
		this.recorder = new JavaSoundRecorder(this, this.filename);
		this.soundManager = soundManager;

		this.setLayout(new FlowLayout());

		record = new JButton("record");
		record.addActionListener(this);
		this.add(record);

		stop = new JButton("stop");
		stop.addActionListener(this);
		this.add(stop);

		replay = new JButton("replay");
		replay.addActionListener(this);
		this.add(replay);

		loop = new JCheckBox("Loop");
		loop.setSelected(true);
		this.add(loop);

		status = new JLabel(NOT_LOADED);
		status.setPreferredSize(new Dimension(90, 50));
		this.add(status);

		JLabel startFrame = new JLabel("Start frame:");
		startFrame.setPreferredSize(new Dimension(90, 50));
		this.add(startFrame);

		loopStart = new JTextField();
		loopStart.setPreferredSize(new Dimension(90, 25));
		this.add(loopStart);

		JLabel endFrame = new JLabel("End frame:");
		endFrame.setPreferredSize(new Dimension(90, 50));
		this.add(endFrame);

		loopEnd = new JTextField();
		loopEnd.setPreferredSize(new Dimension(90, 25));
		this.add(loopEnd);

		reload();
	}

	public void setStatus(String msg) {
		status.setText(msg);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();

		if(source == record) {
			if(!recorderStarted && startRecording()) {
				if(clip != null) {
					clip.close();
					clip = null;
				}
				recorderStarted = true;
			}
		}

		if(source == stop) {
			if(recorderStarted) {
				finishRecording();
				System.out.println("Recording finished by stop button.");
			}

			if(playerStarted) {
				stopPlaying();
			}

		}

		if(source == replay) {
			play();
		}
	}

	public char getKeyChar() {
		return keyChar;
	}

	public void playLoop() {
		if(clip == null) {
			reload();
		}

		if(clip != null) {
			clip.stop();
			int start = Integer.parseInt(loopStart.getText());
			int end = Integer.parseInt(loopEnd.getText());
			clip.setFramePosition(start);
			clip.setLoopPoints(start, end);
			clip.loop(Clip.LOOP_CONTINUOUSLY);
			playerStarted = true;
			setStatus(PLAYING);
		}
	}

	public void playOnce() {
		if(clip == null) {
			reload();
		}

		if(clip != null) {
			clip.stop();
			int start = Integer.parseInt(loopStart.getText());
			clip.setFramePosition(start);
			clip.start();
			playerStarted = false;
		}
	}

	@Override
	public synchronized void addKeyListener(KeyListener l) {
		super.addKeyListener(l);
		for(Component c : this.getComponents()) {
			if(c instanceof JButton || c instanceof JLabel || c instanceof JCheckBox) {
				c.addKeyListener(l);
			}
		}
	}

	public void reload() {
		if(file.exists()) {
			clip = soundManager.addClip(filename);
			loopStart.setText(String.valueOf(0));
			loopEnd.setText(String.valueOf(clip.getFrameLength() - 1));
			System.out.println("Loaded looper file: " + filename);
		}

		recorderStarted = false;
		setStatus(NOTHING);
	}

	public void play() {
		if(loop.isSelected())
			playLoop();
		else
			playOnce();
	}

	public void recordOrStop() {
		if(playerStarted) {
			stopPlaying();
		}

		if(recorderStarted) {
			finishRecording();
			System.out.println("Recording finished by stop key.");
		} else {
			if(clip != null) {
				clip.close();
				clip = null;
			}

			if(startRecording()) {
				recorderStarted = true;
			}
		}
	}

	public void playOrStop() {
		if(recorderStarted) {
			finishRecording();
			System.out.println("Recording finished by stop key.");
		}

		if(playerStarted) {
			stopPlaying();
		} else {
			play();
		}
	}

	private void stopPlaying() {
		if(clip != null) {
			clip.stop();
			clip.setFramePosition(0);
		}
		playerStarted = false;
		setStatus(NOTHING);
	}

	public void finishRecording() {
		recordingIndex++;
		recorder.finish();
	}

	public boolean startRecording() {
		recordingIndex++;
		return recorder.start();
	}

	public int getRecordingIndex() {
		return recordingIndex;
	}

	public boolean hasClip() {
		return clip != null;
	}

	public String getLoop() {
		return String.valueOf(loop.isSelected());
	}

	public void setLoop(Object loop) {
		this.loop.setSelected("true".equals(loop));
	}

	public String getLoopStart() {
		return loopStart.getText();
	}

	public void setLoopStart(Object loopStart) {
		String tmp = (loopStart == null ? "" : loopStart.toString());
		this.loopStart.setText(tmp);
	}

	public String getLoopEnd() {
		return loopEnd.getText();
	}

	public void setLoopEnd(Object loopEnd) {
		String tmp = (loopEnd == null ? "" : loopEnd.toString());
		this.loopEnd.setText(tmp);
	}

	private static final long serialVersionUID = 1L;
}
