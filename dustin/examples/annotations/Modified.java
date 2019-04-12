package dustin.examples.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the annotated parameter to a method or
 * constructor (yikes!) is subject to modification by the
 * method or constructor (yikes again!). This implies that
 * the parameter must not be {@code null} (implies
 * {@code @NotNull}-ness).
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Modified
{
   /**
    * Description of the type of modification that might
    * be done to the annotated parameter.
    *
    * @return Description of the modification that might be
    *    inflicted on the annotated parameter.
    */
   String description() default "This parameter is subject to modification and should NOT be null.";
}
