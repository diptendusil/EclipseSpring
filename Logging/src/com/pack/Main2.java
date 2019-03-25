package com.pack;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main2 {

	static final Logger logger = Logger.getLogger(Main2.class);

	public static void main(String[] args) {
		//BasicConfigurator.configure();
		
		PropertyConfigurator.configure("log1.properties");
		logger.debug("Sample debug message");
		logger.info("Sample info message");
		logger.warn("Sample warn message");
		logger.error("Sample error message");
		logger.fatal("Sample fatal message");
		
		
	}

}
