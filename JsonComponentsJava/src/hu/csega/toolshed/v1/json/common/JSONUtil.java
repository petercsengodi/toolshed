package hu.csega.toolshed.v1.json.common;

import hu.csega.toolshed.v1.common.ModuleInfo;
import hu.csega.toolshed.v1.json.converters.JSONLongConverter;
import hu.csega.toolshed.v1.json.converters.JSONStringConverter;
import hu.csega.toolshed.v1.json.converters.JSONValueConverter;

import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonReader;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonGeneratorFactory;

public class JSONUtil {

	private static final Map<Class<?>, JSONValueConverter> converters = new HashMap<>();

	static {
		new ModuleInfo(ModuleInfo.class);

		synchronized (JSONUtil.class) {

			JSONStringConverter stringConverter = new JSONStringConverter();
			converters.put(String.class, stringConverter);
			converters.put(JSONStringConverter.class, stringConverter);

			JSONLongConverter longConverter = new JSONLongConverter();
			converters.put(long.class, longConverter);
			converters.put(Long.class, longConverter);
			converters.put(JSONLongConverter.class, longConverter);
		}
	}

	public static String toJSON(Object object) {
		if(object == null)
			return null;

        StringWriter sw = new StringWriter();

        Map<String, Object> properties = new HashMap<>(1);
        properties.put(JsonGenerator.PRETTY_PRINTING, true);

        JsonGeneratorFactory jf = Json.createGeneratorFactory(properties);
        JsonGenerator jg = jf.createGenerator(sw);

        jg.writeStartObject();

        Class<?> objectClass = object.getClass();
        Method[] methods = objectClass.getMethods();
        for(Method m : methods) {
        	JSONGetter getter = m.getAnnotation(JSONGetter.class);
        	if(getter == null)
        		continue;

        	// looking up converter object
        	Class<?> converterClass = getter.value();
        	JSONValueConverter converter = converters.get(converterClass);

        	// if doesn't exits yet, we may create it
        	if(converter == null && JSONValueConverter.class.isAssignableFrom(converterClass)) {
        		try {
	        		converter = (JSONValueConverter)converterClass.newInstance();
		        	synchronized (converterClass) {
		        		converters.put(converterClass, converter);
					}
        		} catch(Exception ex) {
        			throw new RuntimeException("Converter " + converterClass.getName() + " could not be created!");
        		}
        	} else if (converter == null) {
        		throw new RuntimeException("Converter " + converterClass.getName() + " is not a subclass of JSONValueConverter!");
        	}

        	String fieldName = convertGetterName(m.getName());

    		try {
	        	Object value = m.invoke(object);
	        	if(value == null) {
	        		jg.writeNull(fieldName);
	        	} else {
	        		String jsonValue = (String)converter.toJSONValue(value);
	        		jg.write(fieldName, jsonValue);
	        	}
    		} catch(Exception ex) {
    			throw new RuntimeException("Error writing field " + fieldName + " from " +
    					objectClass.getName() + '.' + m.getName() + "()", ex);
    		}
        }

        jg.writeEnd();
        jg.close();

        String json = sw.toString();
        return json;
	}

	@SuppressWarnings("unchecked")
	public static <T> T fromJSON(Class<T> resultingClass, String json) {
		if(resultingClass == null || json == null || json.length() == 0)
			return null;

		Object target;

		try {
			target = resultingClass.newInstance();
		} catch(Exception ex) {
			throw new RuntimeException("Could not create instance of class " +
					resultingClass.getName(), ex);
		}

        JsonReader jr = Json.createReader(new StringReader(json));
        JsonObject jobj = jr.readObject();

        Method[] methods = resultingClass.getMethods();
        for(Method m : methods) {
        	JSONSetter setter = m.getAnnotation(JSONSetter.class);
        	if(setter == null)
        		continue;

        	// looking up converter object
        	Class<?> converterClass = setter.value();
        	JSONValueConverter converter = converters.get(converterClass);

        	// if doesn't exits yet, we may create it
        	if(converter == null && JSONValueConverter.class.isAssignableFrom(converterClass)) {
        		try {
	        		converter = (JSONValueConverter)converterClass.newInstance();
		        	synchronized (converterClass) {
		        		converters.put(converterClass, converter);
					}
        		} catch(Exception ex) {
        			throw new RuntimeException("Converter " + converterClass.getName() + " could not be created!");
        		}
        	} else if (converter == null) {
        		throw new RuntimeException("Converter " + converterClass.getName() + " is not a subclass of JSONValueConverter!");
        	}

        	String fieldName = convertSetterName(m.getName());
        	String jsonValue = jobj.getString(fieldName, null);
        	Object value = converter.fromJSONValue(jsonValue);

    		try {
	        	m.invoke(target, value);
    		} catch(Exception ex) {
    			throw new RuntimeException("Error writing value of field " + fieldName + " into " +
    					resultingClass.getName() + '.' + m.getName() + "()", ex);
    		}
        }

        return (T) target;
	}

	public static void main(String[] args) throws Exception {
		StringReader reader = new StringReader("{ \"test\": \"xxx\" }");
		JsonReader reader2 = Json.createReader(reader);
		JsonObject object = reader2.readObject();
		System.out.println(object.getString("test"));

		JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
		JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
		arrayBuilder.add(1).add(2);
		objectBuilder.add("numbers", arrayBuilder.build());
		String json = objectBuilder.build().toString();
		System.out.println(json);

		System.out.println(prettyPrint("{\"test\":\"xxx\"}"));
	}

	private static String prettyPrint(String json) {
        StringWriter sw = new StringWriter();
        JsonReader jr = Json.createReader(new StringReader(json));

        JsonObject jobj = jr.readObject();

        Map<String, Object> properties = new HashMap<>(1);
        properties.put(JsonGenerator.PRETTY_PRINTING, true);

        JsonGeneratorFactory jf = Json.createGeneratorFactory(properties);
        JsonGenerator jg = jf.createGenerator(sw);

        jg.write(jobj);
        jg.close();

        String prettyPrinted = sw.toString();
        return prettyPrinted;
    }


	private static String convertGetterName(String name) {
		if(name.startsWith("get") && name.length() > 3 && Character.isUpperCase(name.charAt(3))) {
			char firstChar = Character.toLowerCase(name.charAt(3));
			return firstChar + name.substring(4);
		}

		if(name.startsWith("is") && name.length() > 2 && Character.isUpperCase(name.charAt(2))) {
			char firstChar = Character.toLowerCase(name.charAt(2));
			return firstChar + name.substring(3);
		}

		return name;
	}

	private static String convertSetterName(String name) {
		if(name.startsWith("set") && name.length() > 3 && Character.isUpperCase(name.charAt(3))) {
			char firstChar = Character.toLowerCase(name.charAt(3));
			return firstChar + name.substring(4);
		}

		return name;
	}
}
