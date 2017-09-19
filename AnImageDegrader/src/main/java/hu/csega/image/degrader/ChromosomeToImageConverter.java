package hu.csega.image.degrader;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.TreeMap;

import hu.csega.genetic.framework.Chromosome;
import hu.csega.image.common.BitAssembler;
import hu.csega.image.common.BitPipeline;
import hu.csega.image.common.ImageChromosomeReceiver;
import hu.csega.image.common.ImageEffectService;

public class ChromosomeToImageConverter implements ImageChromosomeReceiver {

	private ImageEffectService service;
	private BitPipeline bp = new BitPipeline();
	private BitAssembler ba = new BitAssembler();
	private int[] buffer;

	public ChromosomeToImageConverter(ImageEffectService service, int[] buffer) {
		this.service = service;
		this.buffer = buffer;
	}

	public int[] convert(Chromosome chromosome) {
		int v, offset = 0;
		byte[] bytes = chromosome.getGenes();

		for(int i = 0; i < bytes.length; i++) {
			bp.set(bytes[i]);
			v = bp.readBits(4);
			buffer[offset++] = PALETTE[v][0];
			buffer[offset++] = PALETTE[v][1];
			buffer[offset++] = PALETTE[v][2];
			v = bp.readBits(4);
			buffer[offset++] = PALETTE[v][0];
			buffer[offset++] = PALETTE[v][1];
			buffer[offset++] = PALETTE[v][2];
		}

		return buffer;
	}

	public Chromosome nativeNearest(int[] referencePicture) {
		int referenceLength = referencePicture.length;
		int genesLength = referenceLength / 6;
		byte[] array = new byte[genesLength];
		TreeMap<Double, Integer> sorted = new TreeMap<>();

		ba.setByteArray(array);
		int r, g, b, j;
		Double distance;

		for(int i = 0; i < referenceLength;) {
			r = referencePicture[i++];
			g = referencePicture[i++];
			b = referencePicture[i++];

			sorted.clear();
			for(j = 0; j < 16; j++) {
				distance = distanceSquareFrom(j, r, g, b);
				sorted.put(distance, j);
			}

			j = sorted.firstEntry().getValue();
			ba.setBitsAndSlide(j, 4);
		}

		Chromosome ret = new Chromosome(array);
		return ret;
	}

	private Double distanceSquareFrom(int index, int r, int g, int b) {
		double d1 = PALETTE[index][0] - r;
		double d2 = PALETTE[index][1] - g;
		double d3 = PALETTE[index][2] - b;
		return d1*d1 + d2*d2 + d3*d3;
	}

	private static int valueOf(char c) {
		switch(c) {
		case '0':
			return 0;
		case '1':
			return 1;
		case '2':
			return 2;
		case '3':
			return 3;
		case '4':
			return 4;
		case '5':
			return 5;
		case '6':
			return 6;
		case '7':
			return 7;
		case '8':
			return 8;
		case '9':
			return 9;
		case 'a':
		case 'A':
			return 10;
		case 'b':
		case 'B':
			return 11;
		case 'c':
		case 'C':
			return 12;
		case 'd':
		case 'D':
			return 13;
		case 'e':
		case 'E':
			return 14;
		case 'f':
		case 'F':
			return 15;
		default:
			throw new RuntimeException("Undefined character: " + c);
		}
	}

	private static void colorOf(int index, String s) {
		PALETTE[index][0] = valueOf(s.charAt(0)) * 16 + valueOf(s.charAt(1));
		PALETTE[index][1] = valueOf(s.charAt(2)) * 16 + valueOf(s.charAt(3));
		PALETTE[index][2] = valueOf(s.charAt(4)) * 16 + valueOf(s.charAt(4));
	}

	@Override
	public void fillFromChromosome(Chromosome chromosome) {
		convert(chromosome);
	}

	@Override
	public String printableMessage() {
		return "";
	}

	@Override
	public void draw(Image tmpImage, Color clearColor) {
		service.rgbArrayToImage(buffer, (BufferedImage)tmpImage);
	}

	public int sizeInBytes() {
		return buffer.length / 6;
	}

	@Override
	public String toString() {
		return "16 colored image";
	}

	public static final int[][] PALETTE;

	static {
		PALETTE = new int[16][3];
		colorOf(0, "000000");
		colorOf(1, "0000AA");
		colorOf(2, "00AA00");
		colorOf(3, "0000AA");
		colorOf(4, "AA0000");
		colorOf(5, "AA00AA");
		colorOf(6, "AA5500");
		colorOf(7, "AAAAAA");
		colorOf(8, "555555");
		colorOf(9, "5555FF");
		colorOf(10, "55FF55");
		colorOf(11, "55FFFF");
		colorOf(12, "FF5555");
		colorOf(13, "FF55FF");
		colorOf(14, "FFFF55");
		colorOf(15, "FFFFFF");
	}
}
