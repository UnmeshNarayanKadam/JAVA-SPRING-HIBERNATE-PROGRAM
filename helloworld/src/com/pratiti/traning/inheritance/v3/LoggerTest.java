package com.pratiti.traning.inheritance.v3;

public class LoggerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = LoggerFactory.getLoggerInstance();
		
		logger.log(" Some info message", LogLevel.INFO);
		logger.log(" Some info message", LogLevel.ERROR);
		
		logger.log(" Some warning message" , LogLevel.WARNING);
		logger.log(" Some warning message" , LogLevel.INFO);
		
		logger.log(" Some error message");
		
	}

}                                                                                                     
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
