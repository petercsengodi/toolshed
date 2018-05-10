package hu.csega.ficbidta.properties;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface FicbidtaProperty {

	public static final String[] empty = new String[0];
	
	String name();
	String displayName() default "";
	Class<? extends FicbidtaAbstractProperty> property();
	String[] possibleValues() default {};
	
}
