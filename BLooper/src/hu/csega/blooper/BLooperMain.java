package hu.csega.blooper;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.swing.JFrame;
import hu.csega.blooper.play.SoundManager;
import hu.csega.blooper.ui.BLooperRecordPanel;

public class BLooperMain extends JFrame implements ActionListener, WindowListener, KeyListener {

	public static void main(String[] args) {
		BLooperMain main = new BLooperMain();
		main.setVisible(true);
		main.init();
	}

	private static final int NUMBER_OF_LOOPER_PANELS = 9; // min: 1 max: 9
	private static final String PROPERTIES_FILE = "loops/properties.ini";

	private SoundManager soundManager;
	private BLooperRecordPanel[] panels;
	private Map<Character, BLooperRecordPanel> map = new HashMap<>();
	private Properties panelProperties = new Properties();

	private boolean holdingControl = false;

	public BLooperMain() {
		super("(B)Looper");
		// this.player = new JavaSoundPlayer(this);
		this.soundManager = new SoundManager( );

		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(NUMBER_OF_LOOPER_PANELS, 1));

		try (FileInputStream in = new FileInputStream(PROPERTIES_FILE)) {
			this.panelProperties.load(in);
		} catch(IOException ex) {
			ex.printStackTrace();
		}

		panels = new BLooperRecordPanel[NUMBER_OF_LOOPER_PANELS];
		for(int i = 0; i < NUMBER_OF_LOOPER_PANELS; i++) {
			BLooperRecordPanel panel = new BLooperRecordPanel(i+1, soundManager);
			panels[i] = panel;
			contentPane.add(panel);
			panel.addKeyListener(this);
			map.put(panel.getKeyChar(), panel);

			if(panel.hasClip()) {
				panel.setLoopStart(panelProperties.get("start-" + i));
				panel.setLoopEnd(panelProperties.get("end-" + i));
				panel.setLoop(panelProperties.get("loop-" + i));
			}
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
		for(int i = 0; i < NUMBER_OF_LOOPER_PANELS; i++) {
			BLooperRecordPanel panel = panels[i];
			panelProperties.put("start-" + i, panel.getLoopStart());
			panelProperties.put("end-" + i, panel.getLoopEnd());
			panelProperties.put("loop-" + i, panel.getLoop());
		}

		try (FileOutputStream out = new FileOutputStream(PROPERTIES_FILE)) {
			panelProperties.store(out, "Properties for panels");
		} catch(IOException ex) {
			ex.printStackTrace();
		}

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
		if(e.getKeyCode() == KeyEvent.VK_CONTROL) {
			holdingControl = true;
		}

		char c = e.getKeyChar();
		BLooperRecordPanel panel = map.get(c);
		if(panel != null) {
			if(holdingControl) {
				panel.recordOrStop();
			} else {
				panel.playOrStop();
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_CONTROL) {
			holdingControl = false;
		}
	}

	private static final long serialVersionUID = 1L;
}
