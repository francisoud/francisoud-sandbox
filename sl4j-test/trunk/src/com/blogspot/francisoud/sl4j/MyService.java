package com.blogspot.francisoud.sl4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyService {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	public void doStuff() {
		logger.info("Some info stuff...");
		logger.debug("Some debug stuff...");
		logger.trace("Some trace stuff...");
	}

	public void exceptionCase() {
		try {
			logger.warn("I'm going to throw an exception!");
			throw new RuntimeException("my error message");
		} catch (RuntimeException e) {
			logger.error(e.getMessage(), e);
		}
	}
}
