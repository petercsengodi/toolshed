package hu.worstofcsega.bfinterpreter;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class BFCode {

	private List<String> code = new ArrayList<String>();
	private Point position = new Point(0, 0);
	private Stack<Point> positionStack = new Stack<Point>();
	private boolean end_of_file = false;
	private Map<Point, Point> startPointOfEndPoint = new HashMap<Point, Point>(); 
	private Map<Point, Point> endPointOfStartPoint = new HashMap<Point, Point>(); 
	
	public void loadProgramCode(String fileName) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
		end_of_file = true;
		
		int row = -1;
		String line;
		while((line = reader.readLine()) != null) {
			if(line.length() > 0) {
				end_of_file = false;
			}
			
			code.add(line);
			row++;

			for(int i = 0; i < line.length(); i++) {
				char c = line.charAt(i);
				if(c == '[') {
					positionStack.push(new Point(i, row));
				}
				
				if(c == ']') {
					Point start = positionStack.pop();
					Point end = new Point(i, row);
					endPointOfStartPoint.put(start, end);
					startPointOfEndPoint.put(end, start);
				}
			}
		}
		
		reader.close();
		
		if(positionStack.size() > 0) {
			throw new IOException("A while block is not closed!");
		}
	}
	
	public void jumpToStart() {
		position = startPointOfEndPoint.get(position);
	}

	public void jumpToEnd() {
		position = endPointOfStartPoint.get(position);
	}
	
	public char getCode() {
		String codeLine = code.get(position.y);
		return codeLine.charAt(position.x);
	}
	
	public String getCodeLine() {
		String codeLine = code.get(position.y);
		return codeLine;
	}
	
	public void moveToNextCode() {
		String codeLine = code.get(position.y);
		int x = position.x + 1;
		int y = position.y;
		while(x >= codeLine.length()) {
			x = 0;
			y++;
			
			if(y >= code.size()) {
				end_of_file = true;
				break;
			} else {
				codeLine = code.get(y);
			}
		}
		
		position = new Point(x, y);
	}
	
	public boolean eof() {
		return end_of_file;
	}
	
	public Point getPosition() {
		return new Point(position);
	}
	
}
