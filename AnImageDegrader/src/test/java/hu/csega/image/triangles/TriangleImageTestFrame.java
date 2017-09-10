package hu.csega.image.triangles;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;

import javax.swing.JFrame;

import hu.csega.image.degrader.ImageDegraderTestCanvas;
import hu.csega.image.degrader.ImageDegraderTestFrame;
import hu.csega.image.degrader.ImageEffectService;
import hu.csega.image.degrader.ImageGeneticAlgorithmContainer;
import hu.csega.toolshed.logging.Logger;
import hu.csega.toolshed.logging.LoggerFactory;
import hu.csega.units.UnitStore;

public class TriangleImageTestFrame extends JFrame {

	private Image original;
	private Image degradedBySimpleAlgorithm;
	private Image resultAfterOneCycle;
	private Image currentResult;

	private TriangleImageTestCanvas canvas;

	public static final int DEFAULT_WINDOW_WIDTH = 800;
	public static final int DEFAULT_WINDOW_HEIGHT = 600;

	private static final String TEST_IMAGE = "./files/test.jpg";
	private static final String RESULT_ONE_CYCLE = "./tmp/firstCycle.dat";
	private static final String RESULT_GENERAL = "./tmp/firstCycle.dat";

	public static void main(String[] args) {
		logger.info("Starting application.");

		ImageDegraderTestFrame frame = new ImageDegraderTestFrame();
		ImageEffectService service = UnitStore.instance(ImageEffectService.class);

		logger.info("Loading original image.");
		frame.original = service.loadImage(TEST_IMAGE);

		logger.info("Degrading with simple algorithm.");
		frame.degradedBySimpleAlgorithm = service.degradeBySimpleAlgorithm(frame.original);

		ImageGeneticAlgorithmContainer container = service.createGeneticAlgorithmContainer();

		logger.info("Loading result of first cycle.");
		File firstCycle = new File(RESULT_ONE_CYCLE);
		if(firstCycle.exists()) {
			container.loadFromFile(RESULT_ONE_CYCLE);
			frame.resultAfterOneCycle = container.bestFit();
		}

		logger.info("Running genetic algorithm.");
		container.loadFromFile(RESULT_GENERAL);
		container.doOneCycle();
		container.saveIntoFile(RESULT_GENERAL);

		if(!firstCycle.exists()) {
			frame.resultAfterOneCycle = frame.currentResult;
			container.saveIntoFile(RESULT_ONE_CYCLE);
		}

		frame.prepareWindow();
		frame.setVisible(true);
	}

	public TriangleImageTestFrame() {
		super("Triangle Image Test");
	}

	public ImageDegraderTestCanvas getCanvas() {
		return canvas;
	}

	public Image getOriginal() {
		return original;
	}

	public Image getDegradedBySimpleAlgorithm() {
		return degradedBySimpleAlgorithm;
	}

	public Image getResultAfterOneCycle() {
		return resultAfterOneCycle;
	}

	public Image getCurrentResult() {
		return currentResult;
	}

	private void prepareWindow() {
		canvas = new TriangleImageTestCanvas(this);

		Container contentPane = this.getContentPane();
		contentPane.add(canvas);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(new Dimension(DEFAULT_WINDOW_WIDTH, DEFAULT_WINDOW_HEIGHT));

		logger.info("Test Window Prepared.");
	}

	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.createLogger(TriangleImageTestFrame.class);
}
