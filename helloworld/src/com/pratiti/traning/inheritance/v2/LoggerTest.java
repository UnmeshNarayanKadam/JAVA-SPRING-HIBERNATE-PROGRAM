package com.pratiti.traning.inheritance.v2;

public class LoggerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger loggerConsole = new ConsoleLogger();
		Logger loggerFile = new FileLogger();
		
		loggerConsole.log(" Some info message", LogLevel.INFO);
		loggerConsole.log(" Some info message", LogLevel.ERROR);
		
		loggerFile.log(" Some warning message" , LogLevel.WARNING);
		loggerFile.log(" Some warning message" , LogLevel.INFO);
		
		loggerConsole.log(" Some error message");
		
	}

}                                                                                                      
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
