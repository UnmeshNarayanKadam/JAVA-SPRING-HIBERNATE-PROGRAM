package com.pratiti.traning.inheritance.v2;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileLogger implements Logger{
	
	@Override
	public void log(String msg , LogLevel level) {
		try(FileWriter fw = new FileWriter("app.log",true)) {
			switch(level) {
				case INFO:
					fw.write("[INFO] [" + LocalDateTime.now() + "]" + msg + "\n");
					break;
				case WARNING:
					fw.write("[WARNING] [" + LocalDateTime.now() + "]" + msg + "\n");
					break;
				case ERROR:
					fw.write("[ERROR] [" + LocalDateTime.now() + "]" + msg + "\n");
					break;
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
		
	}
}
