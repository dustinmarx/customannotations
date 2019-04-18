package dustin.examples.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the annotated construct needs to be revisited
 * to finish functionality or otherwise address an outstanding
 * issue. This is similar in concept and function to a 'TODO'
 * comment.
 */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Revisit
{
   /**
    * Overview of what needs to be revisited.
    *
    * @return Description of what is to be revisited.
    */
   String description();

   /**
    * Event, milestone, and/or date by which this annotated construct should
    * be revisited. This communicates to developers when information or other
    * other required dependency is available so that this can be revisited.
    *
    * @return Event and/or date by which this construct should be revisited.
    */
   String revisitBy() default "";

   /**
    * If there are multiple reasons to revisit a particular construct,
    * it may be preferred to write a concise overall description and
    * list each detailed issue with this element that supports multiple
    * strings.
    * 
    * @return Detailed descriptions of issues to be revisited.
    */
   String[] issues() default {};

   /**
    * IDs of defects, bug reports, tickets, or other artifacts that
    * are associated with the functionality to be fixed or enhanced
    * when this construct is revisited.
    *
    * @return IDs of defects, bug reports, tickets, or other artifacts
    *    that are associated with the functionality to be added or
    *    fixed on this annotated construct.
    */
   String[] trackingIds() default {};
}
