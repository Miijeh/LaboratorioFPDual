package prueba;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Creacion {

	String autor() default "";
	String fechaCreacion() default "";
	String version();
	
}
