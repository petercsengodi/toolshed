package hu.csega.toolshed.v1.json.common;

import hu.csega.toolshed.v1.common.ModuleInfo;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonReader;
import javax.json.stream.JsonGenerator;
import javax.json.stream.JsonGeneratorFactory;

public class JsonUtil {

	static { new ModuleInfo(ModuleInfo.class); }
	
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

}
