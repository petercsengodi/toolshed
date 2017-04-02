package hu.csega.toolshed.framework.ser.txt;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import hu.csega.toolshed.framework.util.CharsetUtil;

public class TextSerializerTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws Exception {
		TestClass1 object = new TestClass1();
		object.setValue("class1\nenter");

		object.getNumbers().add(1);
		object.getNumbers().add(2);
		object.getNumbers().add(3);

		object.getList().add(new TestClass2(4, "class2"));
		object.getList().add(new TestClass2(5, "class2"));
		object.getList().add(new TestClass2(6, "class2"));

		ByteArrayOutputStream s = new ByteArrayOutputStream();
		TextSerializer serializer = new TextSerializer(s);
		serializer.serialize(object);

		byte[] bytes = s.toByteArray();
		String text = new String(bytes, CharsetUtil.UTF8);
		System.out.println(text);

		System.out.println("\n------------------------------------------\n");

		ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
		TextDeserializer deserializer = new TextDeserializer(bais);
		Object readBack = deserializer.read();

		s = new ByteArrayOutputStream();
		serializer = new TextSerializer(s);
		serializer.serialize(readBack);

		bytes = s.toByteArray();
		text = new String(bytes, CharsetUtil.UTF8);
		System.out.println(text);
	}

}
