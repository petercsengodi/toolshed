package hu.csega.generate.collection;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

import hu.csega.generate.collection.data.GeneratableStory;

public class GenerateStoryCollection {

	private static long storyNumber;
	private static String storyTitle;
	private static String storySubtitle;
	private static String storyUrl;
	private static GeneratableStory story;
	private static Map<Long, GeneratableStory> stories = new TreeMap<>();

	private static boolean italic;
	private static boolean bold;

	private static boolean validLineStarted;
	private static long sequence = 1;
	private static long part = 1;

	public static void main(String[] args) {
		try {

			System.out.println("Started.");

			run();

			System.out.println("Finished.");

		} catch(Throwable t) {
			System.out.flush();
			t.printStackTrace(System.err);
		}
	}

	private static void run() throws Exception {
		File inputFolder = new File("input");
		String[] list = inputFolder.list();

		for(String input : list) {
			if(input == null || !input.endsWith(".story"))
				continue;

			collect(new File("input" + File.separator + input));
		}

		System.out.println("Consumed story parts: " + stories.size());

		generate();
	}

	private static void collect(File file) {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), CHARSET))) {

			clearVariables();

			String line;
			while((line = reader.readLine()) != null) {

				if(line.startsWith("#")) {
					String key = line.substring(1);
					String value = null;
					int index = key.indexOf(' ');
					if(index > 0) {
						value = key.substring(index).trim();
						key = key.substring(0, index);
					}

					key = key.toLowerCase().trim();
					setVariable(key, value);
					continue;
				}

				line = line.trim();
				if(line.isEmpty()) {
					if(!validLineStarted)
						continue;
				} else {
					validLineStarted = true;
				}

				story.body.append("\n").append("<p style=\"text-indent: 30px; text-align: justify;\">");

				if(italic)
					story.body.append("<i>");

				if(bold)
					story.body.append("<b>");

				story.body.append(line);

				if(bold)
					story.body.append("</b>");

				if(italic)
					story.body.append("</i>");

				story.body.append("</p>");
			}

			registerStory();

		} catch(IOException ex) {
			throw new RuntimeException("File error: " + file.getAbsolutePath(), ex);
		}
	}

	private static void clearVariables() {
		validLineStarted = false;

		long number = System.currentTimeMillis();
		if(number > storyNumber) {
			storyNumber = number;
		} else {
			number++;
		}

		storyTitle = "$. történet";
		storySubtitle = null;
		storyUrl = null;
		story = new GeneratableStory();

		bold = false;
		italic = false;
	}

	private static void setVariable(String key, String value) {
		switch(key) {
		case "number":
			storyNumber = Long.parseLong(value);
			break;
		case "url":
			storyUrl = value;
			break;
		case "title":
			storyTitle = value;
			break;
		case "subtitle":
			storySubtitle = value;
			break;
		case "italic":
			italic = !italic;
			break;
		case "bold":
			bold = !bold;
			break;
		case "plain":
			bold = false;
			italic = false;
			break;
		default:
			throw new RuntimeException("Invalid key: " + key);
		}
	}

	private static void registerStory() {
		story.title = storyTitle;
		story.subtitle = storySubtitle;
		story.url = storyUrl;
		stories.put(storyNumber, story);
		story = null;
	}

	private static void generate() {
		File indexFile = new File("output" + File.separator + "index.php");
		try (PrintStream out = new PrintStream(new FileOutputStream(indexFile))) {

			out.println(readFullString("res/index.php.head"));

			for(Map.Entry<Long, GeneratableStory> e : stories.entrySet()) {
				out.println("<?php if($part == " + part + ") { ?>");
				out.println();

				story = e.getValue();

				if(story.title.contains("$")) {
					story.title = story.title.replace("$", String.valueOf(sequence));
					sequence++;
				}

				out.println("<h2>" + story.title + "</h2>");

				if(story.subtitle != null)
					out.println("<h3>" + story.subtitle + "</h3>");

				out.println("<p> </p>");
				out.println(story.body);

				out.println("<p> </p>");
				out.println();
				out.println("<?php } /* $part == " + part + " */ ?>");
				out.println();
				out.println();
				out.flush();

				part++;
			}

			out.println(readFullString("res/index.php.tail"));
			out.flush();

		} catch(IOException ex) {
			throw new RuntimeException("File error: " + indexFile.getAbsolutePath(), ex);
		}
	}

	public static String readFullString(String filename) throws IOException {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		try(FileInputStream stream = new FileInputStream(filename)) {
			int b;
			while((b = stream.read()) >= 0) {
				baos.write(b);
			}
		}

		String source = new String(baos.toByteArray(), CHARSET);
		return source;
	}

	private static final String CHARSET_NAME = "UTF-8";
	private static final Charset CHARSET = Charset.forName(CHARSET_NAME);
}
