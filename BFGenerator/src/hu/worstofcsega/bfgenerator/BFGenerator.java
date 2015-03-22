package hu.worstofcsega.bfgenerator;

import hu.worstofcsega.bfgenerator.statements.BFCmd;
import hu.worstofcsega.bfgenerator.statements.BFProgram;
import hu.worstofcsega.bfgenerator.statements.BFState;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class BFGenerator {

	public static void main(String[] args) throws Exception {

		System.out.println("ARGS:");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		System.out.println("-------------------------------------------------------");

		String file = "/home/peter/research/generated.bf";
		if (args.length > 0) {
			file = args[0];
		}

		System.out.println("Generating file: " + file);

		writeProgram(file);

		System.out.println("Done!");
		System.out.println("\n-------------------------------------------------------\n\n");
	}

	private static void writeProgram(String file) throws Exception {
		BFCmd program = createProgram();

		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
		program.generate(writer);
		writer.close();
	}

	private static BFCmd createProgram() {
		return new BFProgram("csega", "BF state machine test").
				stateMachine(
						new BFState().write('0').next(2),
						new BFState().write('1'),
						new BFState().write('2').next(1)
				);
	}
	
	private static BFCmd createProgram_001() {
		return new BFProgram("csega", "BF gen test").write('H').write('e').write('l').write('l').write('o').write('!');
	}

}
