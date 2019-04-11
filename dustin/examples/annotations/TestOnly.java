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
    * Concise high-level specification of why this is not appropriate
    * for use outside of testing scenarios.
    *
    * @return Any additional comments on why this is for test only.
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

   /**
    * Indicates whether there are plans to eventually remove
    * this test-only construct altogether.
    * 
    * @return Indicates whether this test-only construct
    *    is likely to be removed altogether.
    */
   boolean toBeRemoved() default false;

   /**
    * Indicates date or event (such as a sprint or other development
    * milestone) in which this test-only construct is planned to be
    * removed altogether.
    * 
    * @return Date or event on or after which this test-only
    *    construct is scheduled to be removed.
    */
   String removalEvent() default "";
}
