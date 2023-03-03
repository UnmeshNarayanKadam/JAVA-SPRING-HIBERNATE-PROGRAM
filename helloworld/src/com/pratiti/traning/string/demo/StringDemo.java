package com.pratiti.traning.string.demo;

public class StringDemo {

	public static void main(String[] args) {

//only hard coded strings are stored in pool
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		String s4 = new String("Java");
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		
		String s5 = "Hello";
		String s6 = "World";
		String s7 = "HelloWorld";
		
//Strings which are dynamically created are not stored in pool
		String s8 = s5+s6;
		System.out.println(s7==s8);
		
		String s9 = (s5+s6).intern();
		System.out.println(s7==s9);
		
		
	}

}
