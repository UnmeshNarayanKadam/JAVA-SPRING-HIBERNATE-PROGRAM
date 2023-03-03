package com.pratiti.traning.inheritance.v2;

import java.time.LocalDateTime;

/*
public abstract class Logger {
	public void log(String msg) {
		log(msg , LogLevel.INFO);
	}
	
	public abstract void log(String msg , LogLevel level);
	
	
//	public void log(String msg , LogLevel level) {
//	
//  }

}
*/

//another way to write above code using interface
public interface Logger {
	public default void log(String msg) {
		log(msg , LogLevel.INFO);
	}
	
	public abstract void log(String msg , LogLevel level);

}

