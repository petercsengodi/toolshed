package hu.worstofcsega.bfgenerator;

import hu.worstofcsega.bfgenerator.bff.BFFBlock;
import hu.worstofcsega.bfgenerator.bff.BFFCmd;
import hu.worstofcsega.bfgenerator.bff.BFFProgram;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class BFFGenerator {

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
		BFFCmd program = createProgram();

		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
		program.generate(writer);
		writer.close();
	}

	private static BFFCmd createProgram() {
		BFFCmd methodBlock1 = new BFFBlock();
		BFFCmd methodBlock2 = new BFFBlock();
		BFFCmd mainBlock = new BFFBlock();
		
		BFFProgram.WITH_COMMENTS = false;
		
		BFFCmd ret = new BFFProgram("csega", "BF method call test");
		
		ret.declareMethod("test1", methodBlock1);
		
		methodBlock1.
		write("start test1 \n").
		write("end test1 \n");

		ret.declareMethod("test2", methodBlock2);
		
		methodBlock2.
		write("start test2 \n").
		write("before calling test1 \n").
		callMethod("test1").
		write("after calling test1 \n").
		write("end test2 \n");
		
		ret.main(mainBlock);
		
		mainBlock.
		write("before calling test2 \n").
		callMethod("test2").
		write("after calling test2 \n");
		
		return ret;
	}

}
