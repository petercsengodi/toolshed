package hu.csega.web.components.servlets;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class WebXmlParser extends DefaultHandler {

	public WebXmlParser(ClassLoader classLoader) {
		this.classLoader = classLoader;
	}

	public void parse(String filename) throws Exception {
	    SAXParserFactory spf = SAXParserFactory.newInstance();
	    spf.setNamespaceAware(true);
	    SAXParser saxParser = spf.newSAXParser();

	    saxParser.parse(filename, this);
	}

	public Map<Class<?>, Set<String>> getUrls() {
		return urls;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if(qName.equals("servlet-name")) {
			value = new StringBuffer();
		}
		if(qName.equals("servlet-class")) {
			value = new StringBuffer();
		}
		if(qName.equals("url-pattern")) {
			value = new StringBuffer();
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(qName.equals("servlet-name")) {
			servletName = value.toString();
		}
		if(qName.equals("servlet-class")) {
			servletClass = value.toString();
		}
		if(qName.equals("url-pattern")) {
			String tmp = value.toString();
			if(tmp.endsWith("/*"))
				tmp = tmp.substring(0, tmp.length() - "/*".length());
			if(!tmp.contains("*") && !tmp.contains("."))
				urlList.add(tmp);
		}
		if(qName.equals("servlet") && servletClass != null) {
			try {
				servletNames.put(servletName, classLoader.loadClass(servletClass));
			} catch (ClassNotFoundException ex) {
				System.out.println("WARNING: " + servletClass + " does not exist!");
			}
			servletClass = null;
			servletName = null;
		}
		if(qName.equals("servlet-mapping")) {
			urls.put(servletNames.get(servletName), new TreeSet<>(urlList));
			servletName = null;
			urlList.clear();
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if(value != null)
			value.append(ch, start, length);
	}

	private ClassLoader classLoader;

	private StringBuffer value = null;
	private String servletClass = null;
	private String servletName = null;
	private Map<String, Class<?>> servletNames = new HashMap<>();
	private Set<String> urlList = new TreeSet<>();
	private Map<Class<?>, Set<String>> urls = new HashMap<>();
}
