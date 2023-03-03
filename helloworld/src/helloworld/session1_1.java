package helloworld;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;

public class session1_1 {
	
	public static void main(String[] args) {
		System.out.println("Hello ");
		
		LocalDate l = LocalDate.now();
		System.out.println("date : "+l);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("date and time : "+dt);
		
		LocalTime t = LocalTime.now();
		System.out.println("Time : "+t);
		
		Date d = new Date();
		System.out.println("Today date : "+d);
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = sc.nextLine();
		System.out.println(name);
		sc.close();
	}

}
