package com.pratiti.traning.exceptionHandling;

public class Example1 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		try {
			arr[15]=10;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No such element in array");
			System.out.println(e);
		}
		try {
			int y=4/0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		try {
			String s=null;
			s.toUpperCase();
		} catch (NullPointerException e) {
			System.out.println(e);
		}
	}

}
