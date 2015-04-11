package net.sourceforge.traceability.annotations.usecases;

public @interface UseCase {
	String id();

	String decription() default "";
}