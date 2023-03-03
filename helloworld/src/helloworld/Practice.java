package helloworld;

import java.text.*;
import java.time.*;
import java.util.*;



public class Practice {

	public static void main(String[] args) {
		
//Day of the week in java 8
		LocalDate localDate = LocalDate.of(2001,5,8);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println("Day of week :"+dayOfWeek);

//Time in new York in java 8
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("hh:mm:ss");
		df.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		System.out.println("Time in New york: " + df.format(date));
		
//Date formatter
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");  
	    String strDate= formatter.format(date);  
	    System.out.println(strDate); 
	}

}

