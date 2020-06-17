package org.step.dz3.task7;

import java.lang.annotation.*;

//@Documented
@Target(value = {ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(value = RetentionPolicy.RUNTIME)
@Inherited
public @interface ClassAnnotation {
    String author() default "Medvedeva Natalya";
    String created() default "17/06/2020";
    String value() default "This is default message";
}
