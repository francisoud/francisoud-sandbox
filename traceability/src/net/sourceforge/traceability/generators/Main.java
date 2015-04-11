package net.sourceforge.traceability.generators;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import net.sourceforge.traceability.samples.UserService;

public class Main {

	public static void main(String[] args) {
		// todo iterate over all classes or a pattern "**/Service*" for example
		Method[] methods = UserService.class.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println("method: " + method.getName());
			Annotation[] annotations = method.getAnnotations();
			for (Annotation annotation : annotations) {
				System.out.println("\tannotation: \n\t\t" + annotation.annotationType());
				System.out.println("\t\t" + annotation.toString());
			}
		}
	}
}
