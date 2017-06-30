package hu.csega.blooper;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import hu.csega.blooper.play.SoundManager;
import hu.csega.blooper.ui.BLooperRecordPanel;

public class BLooperMain extends JFrame implements ActionListener, WindowListener, KeyListener {

	public static void main(String[] args) {
		BLooperMain main = new BLooperMain();
		main.setVisible(true);
		main.init();
	}

	private static final int NUMBER_OF_LOOPER_PANELS = 5;

	private SoundManager soundManager;
	private Map<Character, BLooperRecordPanel> map = new HashMap<>();

	public BLooperMain() {
		super("(B)Looper");
		// this.player = new JavaSoundPlayer(this);
		this.soundManager = new SoundManager( );

		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(NUMBER_OF_LOOPER_PANELS, 1));

		for(int i = 1; i <= NUMBER_OF_LOOPER_PANELS; i++) {
			BLooperRecordPanel panel = new BLooperRecordPanel(i, soundManager);
			contentPane.add(panel);
			panel.addKeyListener(this);
			map.put(panel.getKeyChar(), panel);
		}

		addWindowListener(this);
		addKeyListener(this);
		pack();
	}

	public void init() {
		//		player.init();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
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

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		char c = e.getKeyChar();
		BLooperRecordPanel panel = map.get(c);
		if(panel != null)
			panel.play();
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	public static final String ERROR = "Error.";

	private static final long serialVersionUID = 1L;
}
