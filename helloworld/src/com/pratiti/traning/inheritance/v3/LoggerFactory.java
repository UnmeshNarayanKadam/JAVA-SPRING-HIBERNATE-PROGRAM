package com.pratiti.traning.inheritance.v3;

public class LoggerFactory {
	public static Logger getLoggerInstance() {
		return new ConsoleLogger();
	}
}
