package hu.worstofcsega.bfinterpreter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BFTape {

	int[] startingBlock = new int[1000];
	Map<Integer, int[]> positiveBlocks = new HashMap<Integer, int[]>();
	Map<Integer, int[]> negativeBlocks = new HashMap<Integer, int[]>();
	
	int position = 0;
	
	public BFTape() {
	}
	
	public void moveLeft() {
		position--;
	}
	
	public void moveRight() {
		position++;
	}
	
	public void increase() {
		int[] block = getBlock();
		block[index()]++;
	}
	
	public void decrease() {
		int[] block = getBlock();
		block[index()]--;
	}
	
	public boolean check() {
		int[] block = getBlock();
		return block[index()] != 0;
	}
	
	public void output() {
		int[] block = getBlock();
		System.out.print((char)block[index()]);
	}
	
	public void input() throws IOException {
		int[] block = getBlock();
		block[index()] = System.in.read();
	}
	
	private int[] getBlock() {
		return getBlock(position);
	}

	private int[] getBlock(int _position) {
		if(_position >= 0 && _position < 1000) {
			return startingBlock;
		}
		
		Integer key;
		Map<Integer, int[]> blocks;
		if(_position > 0) {
			blocks = positiveBlocks;
			key = Integer.valueOf(_position / 1000);
		} else {
			blocks = negativeBlocks;
			key = Integer.valueOf(Math.abs(_position) / 1000);
		}
		
		int[] block = blocks.get(key);
		if(block == null) {
			block = new int[1000];
			blocks.put(key, block);
		}
		
		return block;
	}
	
	public int index() {
		return index(position);
	}
	
	public int index(int _position) {
			return Math.abs(_position) % 1000;
	}

	public int getInt(int pos) {
		int[] block = getBlock(pos);
		return (int) block[index(pos)];
	}

	public int getPosition() {
		return position;
	}
}
