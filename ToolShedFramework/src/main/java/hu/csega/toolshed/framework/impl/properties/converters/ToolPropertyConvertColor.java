package hu.csega.toolshed.framework.impl.properties.converters;

import java.awt.Color;

import hu.csega.toolshed.framework.impl.properties.ToolPropertyConverter;

public class ToolPropertyConvertColor implements ToolPropertyConverter {

	@Override
	public Object convertFromString(String input) {
		if(input == null || input.length() == 0)
			return null;

		input = input.toLowerCase();

		Color converted = null;

		//		try {
		//			// TODO convert from name (e.g. black)
		//		} catch(Exception ex) {
		//			converted = null;
		//		}

		if(/* converted == null &&*/  (input.length() == 6 || input.length() == 7 && input.charAt(0) == '#')) {
			if(input.length() == 7 && input.charAt(0) == '#') {
				input = input.substring(1);
			}

			try {
				int r = Integer.valueOf(input.substring(0, 2), 16);
				int g = Integer.valueOf(input.substring(2, 4), 16);
				int b = Integer.valueOf(input.substring(4, 6), 16);
				converted = new Color(r, g, b);
			} catch(Exception ex) {
				converted = null;
			}
		}

		return converted;
	}

	@Override
	public String convertToString(Object object) {
		if(object == null || !(object instanceof Color))
			return "";

		Color converted = (Color) object;

		String r = Integer.toHexString(converted.getRed());
		while(r.length() < 2) {
			r = '0' + r;
		}

		String g = Integer.toHexString(converted.getGreen());
		while(g.length() < 2) {
			g = '0' + g;
		}

		String b = Integer.toHexString(converted.getBlue());
		while(b.length() < 2) {
			b = '0' + b;
		}

		return r + g + b;

	}

}
