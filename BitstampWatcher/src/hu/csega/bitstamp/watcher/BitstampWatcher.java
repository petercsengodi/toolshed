package hu.csega.bitstamp.watcher;

import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class BitstampWatcher extends Thread {

	public static void main(String[] args) throws Exception {
		new BitstampWatcher().start();
	}
	
	@Override
	public void run() {
		try {
			while(true) {

				String lowestAskBTC = "";
				String lowestAskLTC = "";
				
				URL website1 = new URL("https://www.bitstamp.net/api/v2/order_book/btceur/");
				try (InputStream in = website1.openStream()) {
					JsonReader reader = Json.createReader(in);
					JsonObject json = reader.readObject();
					JsonArray outerArray = json.getJsonArray("asks");
					JsonArray innerArray = outerArray.getJsonArray(0);
					lowestAskBTC = innerArray.getString(0);
				}
				
				URL website2 = new URL("https://www.bitstamp.net/api/v2/order_book/ltceur/");
				try (InputStream in = website2.openStream()) {
					JsonReader reader = Json.createReader(in);
					JsonObject json = reader.readObject();
					JsonArray outerArray = json.getJsonArray("asks");
					JsonArray innerArray = outerArray.getJsonArray(0);
					lowestAskLTC = innerArray.getString(0);
				}
				
				System.out.println(lowestAskBTC + " / " + lowestAskLTC);
				
				Thread.sleep(60_000); // a minute
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
	}
	
}
