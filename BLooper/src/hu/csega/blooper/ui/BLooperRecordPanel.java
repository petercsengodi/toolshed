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
import javax.swing.JLabel;
import javax.swing.JPanel;

import hu.csega.blooper.play.SoundManager;
import hu.csega.blooper.record.JavaSoundRecorder;

public class BLooperRecordPanel extends JPanel implements ActionListener {

	private static final String NOTHING = "Nothing.";
	private static final String RECORDING = "Recording.";
	private static final String PLAYING = "Playing.";

	private char keyChar;
	private String filename;
	private File file;

	private JButton record;
	private JButton stop;
	private JButton replay;
	private JLabel status;

	private Clip clip = null;
	private boolean playerStarted = false;
	private boolean recorderStarted = false;
	private JavaSoundRecorder recorder;
	private SoundManager soundManager;

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

		status = new JLabel(NOTHING);
		status.setPreferredSize(new Dimension(150, 50));
		this.add(status);
	}

	public void setStatus(String msg) {
		status.setText(msg);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();

		if(source == record) {
			if(!recorderStarted && recorder.start()) {
				if(clip != null) {
					clip.close();
					clip = null;
				}
				recorderStarted = true;
				setStatus(RECORDING);
			}
		}

		if(source == stop) {
			if(recorderStarted) {
				recorder.finish();
				recorderStarted = false;
			}

			if(playerStarted) {
				playerStarted = false;
			}

			setStatus(NOTHING);
		}

		if(source == replay) {
			play();
		}
	}

	public char getKeyChar() {
		return keyChar;
	}

	public void play() {
		if(file.exists() && clip == null) {
			// player.init();
			// if(!playerStarted && player.start()) {
			// 	playerStarted = true;
			// 	setStatus(PLAYING);
			// }

			clip = soundManager.addClip(filename);
		}

		if(clip != null) {
			clip.stop();
			clip.setFramePosition(0);
			clip.start();
		}
	}

	@Override
	public synchronized void addKeyListener(KeyListener l) {
		super.addKeyListener(l);
		for(Component c : this.getComponents())
			c.addKeyListener(l);
	}

	private static final long serialVersionUID = 1L;
}
