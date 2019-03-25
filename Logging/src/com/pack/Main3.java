package com.pack;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

public class Main3 {

	static final Logger logger = Logger.getLogger(Main3.class);

	public static void main(String[] args) {
		//BasicConfigurator.configure();
		
		//PropertyConfigurator.configure("log1.properties");
		
		DOMConfigurator.configure("log2.xml");
		logger.debug("Sample debug message");
		logger.info("Sample info message");
		logger.warn("Sample warn message");
		logger.error("Sample error message");
		logger.fatal("Sample fatal message");
		
		
	}


}
