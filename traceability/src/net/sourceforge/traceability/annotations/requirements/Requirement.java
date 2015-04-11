package net.sourceforge.traceability.annotations.requirements;

/*
 import static java.lang.annotation.ElementType.METHOD;
 import static java.lang.annotation.ElementType.FIELD;
 */

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
// @Target({METHOD, FIELD})
public @interface Requirement {
	String id();

	String author();

	abstract String date();

	String currentRevision();

	String lastModified() default "N/A";

	String lastModifiedBy() default "N/A";

	String[] reviewers(); // Note use of array

	String junit();
}
