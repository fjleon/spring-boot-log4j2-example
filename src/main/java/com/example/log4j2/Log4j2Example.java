package com.example.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Example {

    private static Logger log = LogManager.getLogger();

    public static void main(String[] args) {
	log.debug("This is a debug message");
	log.info("This is an info message");
	log.warn("This is a warn message");
	log.error("This is an error message");
	log.fatal("This is a fatal message");
	
	// Logs a message with parameters which are only to be constructed if the logging level is the target level.
	log.debug("Log: {}", () -> "This is a debug message");
	log.info("Log: {}", () -> "This is an info message");
	log.warn("Log: {}", () -> "This is a warn message");
	log.error("Log: {}", () -> "This is an error message");
	log.fatal("Log: {}", () -> "This is a fatal message");
    }

}
