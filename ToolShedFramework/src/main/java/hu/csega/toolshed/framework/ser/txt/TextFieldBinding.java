package hu.csega.toolshed.framework.ser.txt;

import java.lang.reflect.Method;

class TextFieldBinding {

	public TextFieldBinding(String field) {
		this.field = field;
	}

	public final String field;
	public Method getter;
	public Method setter;
}
