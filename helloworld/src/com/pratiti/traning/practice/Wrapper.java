package com.pratiti.traning.practice;

import javax.swing.text.html.HTMLEditorKit.Parser;

//wrapper classes are immutable
public class Wrapper {

	public static void main(String[] args) {
		
//		int a = 10;
//		Integer b = 100000,c=100000;
//		System.out.println(b.equals(c));
//		c=40;
//		System.out.println(c);
//		
		String s = "123";
		int a = Integer.parseInt(s);
		System.out.println("string to int : "+a);
		
		Integer b = Integer.parseInt(s);
		System.out.println("string to integer : "+b);
		
		String s1 = Integer.toString(a);
		System.out.println("int to string : "+s1);
		
		String s2 = Integer.toString(b);
		System.out.println("integer to string : "+s2);
		
		String x="123.22";
		double y = Double.parseDouble(x);
		System.out.println("string to double : "+y);
		
		Double z = Double.parseDouble(x);
		System.out.println("string to double : "+z);
		
		double w = 1.5;
		Integer p = (int)w;
		System.out.println("double to Integer : "+p);
		
		Double d = 1.5;
		Integer f = d.intValue();
		System.out.println("Double to Integer : "+f);
		
	}

}
