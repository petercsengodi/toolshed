package hu.csega.toolshed.v1.utilities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SimpleByteArrayBuilderOutputStream extends ByteArrayBuilderOutputStream {
	
	protected int blockSize;
	private byte[] current;
	private List<byte[]> list;
	private int index = 0;
	private int length = 0;
	
	public SimpleByteArrayBuilderOutputStream() {
		this(65536);
	}
	
	public SimpleByteArrayBuilderOutputStream(int blockSize) {
		this.blockSize = blockSize;
		this.current = new byte[getNextBlockSize()];
		this.list = new ArrayList<byte[]>();
	}
	
	protected int getNextBlockSize() {
		return blockSize;
	}
	
	@Override
	public void write(int b) throws IOException {
		if(index == current.length) {
			list.add(current);
			int newBlockSize = getNextBlockSize();
			current = new byte[newBlockSize];
			index = 0;
		}
		
		current[index++] = (byte)b;
		length++;
	}
	
	@Override
	public void write(byte[] b, int off, int len) throws IOException {
		while(index + len > current.length) {
			int delta = (current.length - index);
			if(delta > 0) {
				System.arraycopy(b, off, current, index, delta);
				off += delta;
				len -= delta;
				length += delta;
				index += delta;
			}
			
			if(len > 0) {
				list.add(current);
				int newBlockSize = getNextBlockSize();
				current = new byte[newBlockSize];
				index = 0;
			}
		}
		
		if(len > 0) {
			System.arraycopy(b, off, current, index, len);
			index += len; 
			length += len;
		}
	}
	
	@Override
	public byte[] buildByteArray() {
		byte[] ret = new byte[length];
		
		int count = length;
		int start = 0;
		
		for(byte[] array : list) {
			int len = array.length;
			System.arraycopy(array, 0, ret, start, len);
			count -= len;
			start += len;
		}
		
		if(count > 0) {
			System.arraycopy(current, 0, ret, start, count);
		}
		
		return ret;
	}
	
	@Override
	public void dispose() {
		list = null;
	}
}
