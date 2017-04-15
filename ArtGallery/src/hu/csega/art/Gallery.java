package hu.csega.art;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.Map;
import java.util.Set;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.scannotation.AnnotationDB;
import org.scannotation.ClasspathUrlFinder;

public class Gallery extends JPanel {

	public static void main(String[] args) throws Exception {
		URL url = ClasspathUrlFinder.findClassBase(Gallery.class);
		AnnotationDB db = new AnnotationDB();
		db.setScanClassAnnotations(true);
		db.setScanFieldAnnotations(false);
		db.setScanMethodAnnotations(false);
		db.setScanParameterAnnotations(false);
		db.scanArchives(url);

		Map<String, Set<String>> annotationIndex = db.getAnnotationIndex();
		Set<String> arts = annotationIndex.get(Art.class.getName());

		for (String className : arts) {
			System.out.println("Found: " + className);
		} // end for className

		final Gallery gallery = new Gallery();
		gallery.setPreferredSize(PREFERRED_SIZE);

		gallery.len = (arts != null ? arts.size() : 0);
		gallery.artIds = new String[gallery.len];
		gallery.artTitles = new String[gallery.len];
		gallery.artObject = new IArt[gallery.len];

		ClassLoader cl = Gallery.class.getClassLoader();

		if(gallery.len > 0) {
			int i = 0;
			for(String className : arts) {

				Class<?> artClass = cl.loadClass(className);
				Art annotation = artClass.getAnnotation(Art.class);
				gallery.artIds[i] = annotation.id();
				gallery.artTitles[i] = annotation.title();
				gallery.artObject[i] = (IArt)artClass.newInstance();
				i++;

			} // end for className
		} // end if len > 0

		final JComboBox<String> artList = new JComboBox<>(gallery.artTitles);

		ActionListener actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				int index = artList.getSelectedIndex();
				if(index >= 0 && index < gallery.len)
					gallery.currentArtObject = gallery.artObject[index];
			}
		}; // end of action listener

		artList.addActionListener(actionListener);
		actionListener.actionPerformed(null);

		JFrame frame = new JFrame("Art Gallery");

		Container cp = frame.getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(artList, BorderLayout.NORTH);
		cp.add(gallery, BorderLayout.SOUTH);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

		Thread paintThread = new Thread(new Runnable() {

			@Override
			public void run() {
				while(true) {

					gallery.repaint();

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						return;
					}
				}
			}
		}); // end of runnable class

		paintThread.start();

	} // end of main

	@Override
	public void update(Graphics g) {
		paint(g);
	}

	@Override
	public void paint(Graphics g) {
		if(currentArtObject == null)
			return;

		long now = System.currentTimeMillis();

		ArtEnvironment env = new ArtEnvironment();
		env.setStartedTimeStamp(started);
		env.setCurrentTimeStamp(now);
		env.setDeltaSinceLastTime(now - last);
		env.setWidth(PREFERRED_SIZE.width);
		env.setHeight(PREFERRED_SIZE.height);

		last = now;

		Graphics2D g2d = (Graphics2D)buffer.getGraphics();
		currentArtObject.paint(g2d, env);

		g.drawImage(buffer, 0, 0, null);
	}

	private Gallery() {
		 last = started = System.currentTimeMillis();
	}

	private long started;
	private long last;
	private IArt currentArtObject;
	private String[] artIds;
	private String[] artTitles;
	private IArt[] artObject;
	private int len;

	private BufferedImage buffer = new BufferedImage(PREFERRED_SIZE.width, PREFERRED_SIZE.height, BufferedImage.TYPE_INT_RGB);

	private static final Dimension PREFERRED_SIZE = new Dimension(800, 600);

	private static final long serialVersionUID = 1L;
}
