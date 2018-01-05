package ch.mmi.cep.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.time.Instant;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) //on class level
public @interface ShowParameters {

	public enum Priority {
	   LOW, MEDIUM, HIGH
	}
	
	Priority priority() default Priority.MEDIUM;
	String[] tags() default "";
	String createdBy() default "2m";
	String timestamp = Instant.now().toString();
}
