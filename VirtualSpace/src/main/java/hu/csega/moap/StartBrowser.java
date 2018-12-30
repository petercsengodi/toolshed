package hu.csega.moap;

import java.awt.Desktop;
import java.net.URI;
import java.util.Arrays;

public class StartBrowser {

	public static void main(String[] args) throws Exception {
		if(args == null || args.length == 0) {
			System.out.println("Set link to open in first argument!);");
			System.exit(-1);
			return;
		}

		System.out.println("Args: " + Arrays.asList(args));

		URI uri;

		try {
			uri = new URI(args[0]);
		} catch(Exception ex) {
			System.out.println("Couldn't parse URI!");
			System.exit(-1);
			return;
		}

		if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
			System.out.println("Trying to open: " + args[0]);
			Desktop.getDesktop().browse(uri);
			System.out.println("Browser should be open now!");
			System.exit(0);
			return;
		} else {
			System.out.println("Desktop is not supported or it doesn't support opening a browser!");
			System.exit(-1);
			return;
		}
	}

}
