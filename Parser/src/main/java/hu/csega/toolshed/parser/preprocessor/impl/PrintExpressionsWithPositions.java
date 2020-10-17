package hu.csega.toolshed.parser.preprocessor.impl;

import java.util.Iterator;
import java.util.List;

import hu.csega.toolshed.parser.preprocessor.ParserToken;
import hu.csega.toolshed.parser.preprocessor.helper.UnprocessedText;

public class PrintExpressionsWithPositions {

	public static void print(List<ParserToken> chunks, UnprocessedText text) {
		System.out.print("\n------------------ START OF CODE ----------------------");

		if (chunks == null || chunks.size() == 0) {
			System.out.print("\n<<< EMPTY CODE >>>");
		} else {
			for (ExpressionWithPositions chunk : chunks) {
				System.out.println("\n\n" + chunk.getClass().getSimpleName() + ":");
				System.out.print("[[START CHUNK]]");

				Iterator<Character> it = chunk.iterator(text);
				while(it.hasNext()) {
					char c = it.next();
					if(c == '\n') {
						System.out.println("[[END ROW]]");
					} else {
						System.out.print(c);
					}
				}

				System.out.print("[[END CHUNK]]");
			}
		}

		System.out.println("\n------------------- END OF CODE -----------------------\n");
	}

}
