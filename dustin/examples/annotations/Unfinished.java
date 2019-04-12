package dustin.examples.annotations;

import static java.lang.annotation.ElementType.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Example of a custom annotation that marks Java code constructs
 * that are not yet completed.
 *
 * Notes about custom annotations specific to this example:
 *   - @Documented indicates available for public documentation
 *   - CLASS retention policy means that compiler places annotation
 *     information in compiled .class files, but JVM is NOT aware
 *     of the annotation at runtime.
 *   - @Target parameters (statically imported) indicate that this
 *     annotation can be applied to constructors, fields,
 *     local variables, methods, packages, parameters, and
 *     classes/interfaces.
 *   - Methods defined for this @interface without 'default' are
 *     required settings for application of this annotation. In
 *     this case, the "finishBy" element is NOT required (but
 *     recommended!) but the "value" element is required.
 *   - "value" element has special significance in custom Java
 *     annotations: it is the assumed annotation element if
 *     a String is provided to the annotation without explicit
 *     element name called out.
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({CONSTRUCTOR,FIELD,LOCAL_VARIABLE,METHOD,PACKAGE,PARAMETER,TYPE})
public @interface Unfinished
{
   /** Description of the unfinished construct. */
   String description();

   /**
    * Date, build, or event by which the annotated construct
    * is anticipated to be finished.
    */
   String finishBy() default "Unknown";

   /**
    * Listing of specific to-do items that need to be accomplished
    * to consider the annotated construct complete.
    */
   String[] toDoItems() default "";

   /**
    * IDs of discrepancy reports, defect reports, or other
    * unit of work associated with the work to be completed.
    */
   String[] trackingIds() default "";
}
