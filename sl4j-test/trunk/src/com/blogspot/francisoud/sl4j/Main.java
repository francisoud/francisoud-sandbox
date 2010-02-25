package com.blogspot.francisoud.sl4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	public static void main(String[] args) {
		final Logger logger = LoggerFactory.getLogger(Main.class);
		final String command = args.length != 0 ? args[0] : "no arg";
		// using parameterized messages see: http://www.slf4j.org/faq.html#logging_performance
		logger.info("arg: {}", command);
		logger.info("object: {}, {}, {}", new String[] {"newVal", "below", "above"});
		MyService service = new MyService();
		service.doStuff();
		service.exceptionCase();
	}

}
