package com.example.log4j2;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Log4j2WithAnnotationExample {

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
