package com.blogspot.francisoud.log4j.slf4j.migration;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Main {

    private static Log log = LogFactory.getLog(Main.class);

    public static void main(String[] args) {
        log.info("log4j-to-slf4j-migration");
        log.debug("doing a smooth migration from log4j to slf4j");
        log.warn("no more classpath headaches!");
    }
}
