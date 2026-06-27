package com.cognizant.logging.exercise1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDemo {

    // Create Logger object
    private static final Logger logger =
            LoggerFactory.getLogger(LoggingDemo.class);

    public static void main(String[] args) {

        logger.info("Application started successfully.");

        logger.warn("Warning: Low memory detected.");

        logger.error("Error: Unable to connect to the database.");

        logger.info("Application terminated.");

    }
}