package dustin.examples.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the annotated construct is still considered
 * "preview" and may change in the near future. This has
 * similar implications as the Guava @Beta annotation.
 */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Preview
{
   /**
    * Anticipated release in which Preview status will no longer apply.
    *
    * @return Anticipated release of feature
    */
   String transition() default "";

   /**
    * Version in which this preview feature was introduced.
    *
    * @return Release in which this preview feature was introduced.
    */
   String since() default "";

   /**
    * Reasons this construct is considered "preview."
    *
    * @return Reasons this construct is considered preview.
    */
   String[] reasons() default {};
}
