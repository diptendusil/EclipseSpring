package com.pack;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main_Logging {
	static final Logger logger = Logger.getLogger(Main_Logging.class);

	public static void main(String[] args) {
		//BasicConfigurator.configure();
		
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("Sample debug message");
		logger.info("Sample info message");
		logger.warn("Sample warn message");
		logger.error("Sample error message");
		logger.fatal("Sample fatal message");
		
		
	}

}
