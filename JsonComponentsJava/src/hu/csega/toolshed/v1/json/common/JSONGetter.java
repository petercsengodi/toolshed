package hu.csega.toolshed.v1.json.common;

import hu.csega.toolshed.v1.json.converters.JSONStringConverter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface JSONGetter {

	Class<?> value() default JSONStringConverter.class;

}
