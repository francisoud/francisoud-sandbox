package com.blogspot.francisoud.sl4j;

import junit.framework.TestCase;

public class MyServiceTest extends TestCase {

	public void testDoStuff() {
		MyService service = new MyService();
		service.doStuff();
	}

	public void testExceptionCase() {
		MyService service = new MyService();
		service.exceptionCase();
	}
}
