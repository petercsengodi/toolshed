package hu.csega.toolshed.framework.ser.txt;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.lang3.StringEscapeUtils;

import hu.csega.toolshed.framework.util.CharsetUtil;

public class TextSerializer {

	public TextSerializer(String fileName) throws IOException {
		this(new FileOutputStream(fileName));
	}

	public TextSerializer(OutputStream stream) throws IOException {
		this.writer = new OutputStreamWriter(stream, CharsetUtil.UTF8);
	}

	public void serialize(Object toSerialize) {
		try {
			mainId = convertId(1);
			referenceList.add(toSerialize);

			int index = 0;
			while(index < referenceList.size())
			{
				Object tmp = referenceList.get(index);
				Class<?> tmpClass = tmp.getClass();
				String type = tmp.getClass().getName();

				index++;

				writer.write("[object:" + TextBinding.encodeType(type) + ", id:" + convertId(index) + "]\n");
				TextBindingFields binding = bindings.exploreClass(tmpClass);

				// possible attributes
				for(TextFieldBinding fb : binding.values()) {
					writeAttribute(tmp, fb);
				}

				writer.write("\n");
			}

			writer.write("[return: " + mainId + "]\n");
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		} finally {

			try {
				writer.close();
			} catch(Throwable t) {
				// ...
			}

		}
	}

	private void writeAttribute(Object obj, TextFieldBinding fb) throws IOException {

		Object value;

		try {
			value = fb.getter.invoke(obj);
		} catch(Exception ex) {
			throw new RuntimeException(fb.field, ex);
		}

		if(value == null)
			return;

		if(value instanceof Collection<?>)
		{
			Collection<?> list = (Collection<?>)value;
			for(Object o : list) {
				if(o == null)
					continue;

				writeItem(fb.field, o);
			}

		} else if(value.getClass().isArray()) {

			throw new RuntimeException("Sorry, this algorythm can't handle arrays.");

		} else {

			writeItem(fb.field, value);

		}

	} // End of function

	private void writeItem(String field, Object value) throws IOException {
		Class<?> c = value.getClass();
		if(TextBinding.isKindOfPrimitive(c)) {
			printAttribute(field, TextBinding.encodeType(value.getClass().getName()) + ": \"" + StringEscapeUtils.escapeJava(value.toString()) + "\"");
			return;
		}

		int reference = referenceList.indexOf(value);
		if(reference == -1)
		{
			reference = referenceList.size();
			referenceList.add(value);
		}

		printAttribute(field, convertId(reference + 1));
		return;
	}

	private void printAttribute(String name, String value) throws IOException {
		writer.write(name + "= " + value + "\n");
	}

	/** Converts e.g. 3 to #00000003 */
	private String convertId(int id) {
		String ret = String.valueOf(id);
		int size = ret.length();
		if(size < 8) {
			ret = ZEROS.substring(0, 8 - size) + ret;
		}

		return '#' + ret;
	}

	private OutputStreamWriter writer;
	private String mainId;
	private List<Object> referenceList = new ArrayList<>();
	private TextBinding bindings = new TextBinding();

	private static final String ZEROS = "00000000";

} // End of class}
