package net.sourceforge.traceability.annotations.requirements;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Requirements {
	Requirement[] requirements();
}
