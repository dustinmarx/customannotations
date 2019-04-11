package dustin.examples.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the annotated construct is intended to be
 * used in testing scenarios only and should NOT be used in
 * production code. This is similar in spirit to the Guava
 * annotation @VisibleForTesting.
 */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TestOnly
{
   /**
    * Anticipated release in which Preview status will no longer apply.
    *
    * @return Anticipated release of feature
    */
   String description() default "This should only be used in testing scenarios.";

   /**
    * Specifies what construct production methods should use instead
    * of this construct annotated as for testing only.
    * 
    * @return Production alternative to this test-only construct.
    */
   String useInstead() default "";

   /**
    * Reasons this construct is considered test-only and why
    * it's even available (might include why tests cannot
    * use production alternatives).
    *
    * @return Reasons this construct is made available but
    *    only for tests.
    */
   String[] reasons() default {};
}
