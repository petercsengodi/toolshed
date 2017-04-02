package hu.csega.toolshed.framework.ser.txt;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringEscapeUtils;

public class TextDeserializer {

	private InputStream inputStream;
	private Map<String, Object> objects = new HashMap<>();

	public TextDeserializer(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public Object read() throws Exception {
		String line;
		int index;

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
			while((line = reader.readLine()) != null) {
				line = line.trim();
				if(line.length() <= 0)
					continue;

				if(line.charAt(0) == '[') {
					if(line.charAt(line.length() - 1) != ']')
						throw new RuntimeException("Invalid block!");

					line = line.substring(1, line.length() - 1);

					index = line.indexOf("return:");
					if(index > -1) {
						for(TextObjectToComplete totc : toComplete) {
							complete(totc.parent, totc.field, objects.get(totc.childId));
						}

						String id = line.substring(index + "return:".length()).trim();
						return objects.get(id);
					}

					index = line.indexOf(',');
					String identifierString = line.substring(index+1);
					String typeString = line.substring(0, index);

					index = typeString.indexOf(':');
					String typeName = TextBinding.decodeType(typeString.substring(index + 1).trim());
					currentClass = getClass().getClassLoader().loadClass(typeName);

					index = identifierString.indexOf(':');
					currentId = identifierString.substring(index + 1).trim();

					currentObject = currentClass.newInstance();
					objects.put(currentId, currentObject);
					continue;
				}

				index = line.indexOf('=');
				String fieldName = line.substring(0, index);
				String valueString = line.substring(index+1).trim();

				TextBindingFields fields = bindings.exploreClass(currentClass);
				TextFieldBinding binding = fields.get(fieldName);

				if(valueString.charAt(0) == '#') {
					Object child = objects.get(valueString);
					if(child != null) {
						complete(currentObject, binding, child);
					} else {
						TextObjectToComplete totc = new TextObjectToComplete();
						totc.childId = valueString;
						totc.parent = currentObject;
						totc.field = binding;
						toComplete.add(totc);
					}
				} else {
					index = valueString.indexOf(':');
					String typeName = TextBinding.decodeType(valueString.substring(0, index).trim());
					Class<?> typeClass = getClass().getClassLoader().loadClass(typeName);

					String quoted = valueString.substring(index + 1).trim();
					if(quoted.charAt(0) != '\"' || quoted.charAt(quoted.length() - 1) != '\"')
						throw new RuntimeException("Not string literal");

					Object value = parse(StringEscapeUtils.unescapeJava(quoted.substring(1, quoted.length() - 1)), typeClass);
					complete(currentObject, binding, value);
					continue;

				}
			}

			throw new RuntimeException("Unexpected end of file.");
		}
	}

	private Object parse(String s, Class<?> class1) {
		if(s == null || class1 == String.class)
			return s;

		if(class1 == int.class || class1 == Integer.class)
			return Integer.parseInt(s);

		if(class1 == byte.class || class1 == Byte.class)
			return Byte.parseByte(s);

		if(class1 == boolean.class || class1 == Boolean.class)
			return Boolean.parseBoolean(s);

		if(class1 == long.class || class1 == Long.class)
			return Long.parseLong(s);

		if(class1 == short.class || class1 == Short.class)
			return Short.parseShort(s);

		if(class1 == char.class || class1 == Character.class)
			return s.charAt(0);

		if(class1 == float.class || class1 == Float.class)
			return Float.parseFloat(s);

		if(class1 == double.class || class1 == Double.class)
			return Double.parseDouble(s);

		throw new RuntimeException("Couldn't identify setter parameter: " + class1.getName());
	}

	@SuppressWarnings("unchecked")
	public void complete(Object parent, TextFieldBinding binding, Object value) throws Exception {

		Class<?> valueClass = binding.setter.getParameterTypes()[0];

		if(Collection.class.isAssignableFrom(valueClass)) {
			if(valueClass.isAssignableFrom(ArrayList.class)) {
				List<Object> l = (List<Object>)binding.getter.invoke(parent);
				if(l == null) {
					l = new ArrayList<>();
					binding.setter.invoke(parent, l);
				}

				l.add(value);
			} else if(valueClass.isAssignableFrom(HashSet.class)) {
				Set<Object> s = (Set<Object>)binding.getter.invoke(parent);
				if(s == null) {
					s = new HashSet<>();
					binding.setter.invoke(parent, s);
				}

				s.add(value);
			} else {
				throw new RuntimeException("Couldn't set value.");
			}

		} else if(valueClass.isArray()) {

			throw new RuntimeException("Sorry, this algorythm can't handle arrays.");

		} else {

			binding.setter.invoke(parent, value);
		}
	}

	private String currentId;
	private Object currentObject;
	private Class<?> currentClass;
	private TextBinding bindings = new TextBinding();
	private List<TextObjectToComplete> toComplete = new ArrayList<>();
}
