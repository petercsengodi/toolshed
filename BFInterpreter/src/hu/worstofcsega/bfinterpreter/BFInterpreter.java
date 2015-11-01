package hu.worstofcsega.bfinterpreter;

import java.awt.Point;


public class BFInterpreter {

	public static final boolean VERBOSE_MODE = false;
	
	public static void main(String[] args) throws Exception {
		System.out.println("ARGS:");
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	
		System.out.println("-------------------------------------------------------");

		String file="/home/peter/research/generated.bf";
		if(args.length > 0) {
			file = args[0];
		}
	
		System.out.println("Playing file: " + file);
		System.out.println("-------------------------------------------------------");
		
		play(file);
		
		System.out.println("\n-------------------------------------------------------\n\n");
	}
	
	@SuppressWarnings("unused")
	public static void play(String file) throws Exception {
		BFTape tape = new BFTape();
		if(VERBOSE_MODE) {
			printStartingContent(tape);
		}

		BFCode code = new BFCode();
		code.loadProgramCode(file);
		
		while(!code.eof()) {
			char c = code.getCode(); 
			if(VERBOSE_MODE && "+-<>[].,".indexOf(c) > -1) {
				System.out.print("Next character: " + c);
				Point p = code.getPosition();
				System.out.print("  row: " + p.y + " col: " + p.x + "  ");
				
				String line = " " + code.getCodeLine() + " ";
				String verboseLine = line.substring(0, p.x + 1) + "{"
						+ line.substring(p.x + 1, p.x + 2) + "}" 
						+ line.substring(p.x + 2);
				System.out.println(verboseLine);
			}

			switch(c) {
			
			case '<':
				tape.moveLeft();
				break;
			
			case '>':
				tape.moveRight();
				break;
			
			case '+':
				tape.increase();
				break;
			
			case '-':
				tape.decrease();
				break;
			
			case '.':
				tape.output();
				break;
			
			case ',':
				tape.input();
				break;
			
			case '[':
				if(!tape.check()) {
					code.jumpToEnd();
				}
				break;
			
			case ']':
				if(tape.check()) {
					code.jumpToStart();
				}
				break;

			default:
				break;
			}
			
			code.moveToNextCode();

			if(VERBOSE_MODE && "+-<>[].,".indexOf(c) > -1) {
				printStartingContent(tape);
				System.out.println();
				Thread.sleep(500);
			}
		}
	}

	private static void printStartingContent(BFTape tape) {
		System.out.print("| ");

		for(int i = 0; i < 20; i++) {
			if(tape.getPosition() == i) {
				System.out.print("[");
			}
			System.out.print(tape.getInt(i));
			if(tape.getPosition() == i) {
				System.out.print("]");
			}
			System.out.print(" | ");
		}
		
		System.out.println("...");
	}

}
