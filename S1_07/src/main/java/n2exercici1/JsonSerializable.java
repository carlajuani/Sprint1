package n2exercici1;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.LOCAL_VARIABLE)
public @interface JsonSerializable {
	public String directory() default "";
}
