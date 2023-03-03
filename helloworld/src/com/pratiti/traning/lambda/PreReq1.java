package com.pratiti.traning.lambda;

interface Sensor{
	void on();
	void off();
}

class TVSensor implements Sensor {
	@Override
	public void on() {
		
	}
	
	@Override
	public void off() {
		
	}
}

public class PreReq1 {
	public static void main(String[] args) {
//here we are not creating the object of interface.we are storing reference of tvsensor class object in sensor
		Sensor s = new TVSensor();
		s.on();
		s.off();
	}
}
