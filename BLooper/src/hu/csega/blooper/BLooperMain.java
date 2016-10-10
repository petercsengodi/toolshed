package hu.csega.blooper;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import hu.csega.blooper.play.SoundManager;
import hu.csega.blooper.record.JavaSoundRecorder;

public class BLooperMain extends JFrame implements ActionListener, WindowListener {

	public static void main(String[] args) {
		BLooperMain main = new BLooperMain();
		main.setVisible(true);
		main.init();
	}

	public BLooperMain() {
		super("(B)Looper");
		this.recorder = new JavaSoundRecorder(this);
		// this.player = new JavaSoundPlayer(this);
		this.manager = new SoundManager();

		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());

		record = new JButton("record");
		record.addActionListener(this);
		contentPane.add(record);

		stop = new JButton("stop");
		stop.addActionListener(this);
		contentPane.add(stop);

		replay = new JButton("replay");
		replay.addActionListener(this);
		contentPane.add(replay);

		status = new JLabel(NOTHING);
		status.setPreferredSize(new Dimension(150, 50));
		contentPane.add(status);

		addWindowListener(this);
		pack();
	}

	public void init() {
//		player.init();
	}

	public void setStatus(String msg) {
		status.setText(msg);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();

		if(source == record) {
			if(!recorderStarted && recorder.start()) {
				playIndex = -1;
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
//			player.init();
//			if(!playerStarted && player.start()) {
//				playerStarted = true;
//				setStatus(PLAYING);
//			}
			if(playIndex < 0) {
				playIndex = manager.addClip(TEMP_FILE);
			}
			manager.playSound(playIndex);
		}
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// player.close();
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

	private JButton record;
	private JButton stop;
	private JButton replay;
	private JLabel status;

	private JavaSoundRecorder recorder;
//	private JavaSoundPlayer player;
	private SoundManager manager;
	private int playIndex = -1;
	private boolean recorderStarted = false;
	private boolean playerStarted = false;

	private static final String NOTHING = "Nothing.";
	private static final String RECORDING = "Recording.";
	private static final String PLAYING = "Playing.";

	public static final String ERROR = "Error.";
	public static final String TEMP_FILE = "RecordAudio.wav";

	/**
	 * Default serial version UID.
	 */
	private static final long serialVersionUID = 1L;
}
