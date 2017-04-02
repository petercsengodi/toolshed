package hu.csega.toolshed.framework.ser.txt;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class TextBinding {

	public Class<?> classOf(String type) {
		Class<?> c = classes.get(type);
		if(c == null) {

			try {
				c = TextBinding.class.getClassLoader().loadClass(type);
			} catch(ClassNotFoundException ex) {
				throw new RuntimeException(ex);
			}

			classes.put(type, c);
		}

		return c;
	}

	public static boolean isKindOfPrimitive(Class<?> c) {
		return ATTRIBUTES.contains(c);
	}

	public TextBindingFields exploreClass(Class<?> classToExplore) {
		TextBindingFields binding = bindings.get(classToExplore.getName());
		if(binding != null)
			return binding;

		binding = new TextBindingFields();
		bindings.put(classToExplore.getName(), binding);

		Set<Method> methods = new HashSet<>();
		Method[] methods1 = classToExplore.getMethods();
		Method[] methods2 = classToExplore.getDeclaredMethods();
		methods.addAll(Arrays.asList(methods1));
		methods.addAll(Arrays.asList(methods2));

		for(Method m : methods) {
			MethodType methodType = methodTypeOf(m);
			if(methodType == null || methodType == MethodType.NONE)
				continue;

			String field = fieldNameOf(m, methodType);
			TextFieldBinding fb = binding.get(field);
			if(fb == null) {
				fb = new TextFieldBinding(field);
				binding.put(field, fb);
			}

			if(methodType == MethodType.GETTER) {

				fb.getter = m;

			} else if(methodType == MethodType.SETTER) {

				fb.setter = m;

			}
		}

		return binding;
	}

	private MethodType methodTypeOf(Method method) {
		if(method == null)
			return MethodType.NONE;

		String name = method.getName();
		if(name == null || name.length() < 3)
			return MethodType.NONE;

		Class<?> returnType = method.getReturnType();

		if(name.startsWith("is") && Character.isUpperCase(name.charAt(2))) {
			if(returnType == null || !returnType.equals(boolean.class)) {
				return MethodType.NONE;
			}

			Class<?>[] parameterTypes = method.getParameterTypes();
			if(parameterTypes == null || parameterTypes.length == 0) {
				return MethodType.GETTER;
			} else {
				return MethodType.NONE;
			}
		}

		if(name.length() > 3 && name.startsWith("get") && Character.isUpperCase(name.charAt(3))) {
			if("getClass".equals(name)) {
				return MethodType.NONE;
			}

			if(returnType == null || returnType.equals(Void.class)) {
				return MethodType.NONE;
			}

			Class<?>[] parameterTypes = method.getParameterTypes();
			if(parameterTypes == null || parameterTypes.length == 0) {
				return MethodType.GETTER;
			} else {
				return MethodType.NONE;
			}
		}

		if(name.length() > 3 && name.startsWith("set") && Character.isUpperCase(name.charAt(3))) {
			Class<?>[] parameterTypes = method.getParameterTypes();
			if(parameterTypes == null || parameterTypes.length != 1) {
				return MethodType.NONE;
			} else {
				return MethodType.SETTER;
			}
		}

		return MethodType.NONE;
	}

	private String fieldNameOf(Method method, MethodType methodType) {
		if(methodType == null || methodType == MethodType.NONE)
			return null;

		String name = method.getName();

		if(methodType == MethodType.GETTER && name.startsWith("is")) {
			return Character.toLowerCase(name.charAt(2)) + name.substring(3);
		}

		return Character.toLowerCase(name.charAt(3)) + name.substring(4);
	}

	public static String encodeType(String type) {
		if(type.startsWith("java.lang."))
			return type.substring("java.lang.".length());
		return type;
	}

	public static String decodeType(String type) {
		if(type.indexOf('.') >= 0)
			return type;
		return "java.lang." + type;
	}

	public Map<String, Class<?>> classes = new HashMap<>();
	public Map<String, TextBindingFields> bindings = new TreeMap<>();

	private static final Set<Class<?>> ATTRIBUTES = new HashSet<>();

	static {
		ATTRIBUTES.add(String.class);
		ATTRIBUTES.add(int.class);
		ATTRIBUTES.add(Integer.class);
		ATTRIBUTES.add(byte.class);
		ATTRIBUTES.add(Byte.class);
		ATTRIBUTES.add(boolean.class);
		ATTRIBUTES.add(Boolean.class);
		ATTRIBUTES.add(long.class);
		ATTRIBUTES.add(Long.class);
		ATTRIBUTES.add(short.class);
		ATTRIBUTES.add(Short.class);
		ATTRIBUTES.add(char.class);
		ATTRIBUTES.add(Character.class);
		ATTRIBUTES.add(float.class);
		ATTRIBUTES.add(Float.class);
		ATTRIBUTES.add(double.class);
		ATTRIBUTES.add(Double.class);
	}

}
