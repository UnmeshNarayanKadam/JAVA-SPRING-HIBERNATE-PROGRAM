package com.pratiti.traning.practice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int firstNumber = sc.nextInt();
		System.out.println("Enter second number : ");
		int secondNumber = sc.nextInt();
		System.out.println("Enter operator +, - : ");
		char ch = sc.next().charAt(0);
		switch (ch) {
		case '+':
			int result = firstNumber + secondNumber;
			System.out.println(firstNumber+" + "+secondNumber+" = "+result);
			break;
		case '-':
			int ans = firstNumber - secondNumber;
			System.out.println(firstNumber+" - "+secondNumber+" = "+ans);
			break;
		default:
			System.out.println("Enter valid operator");
			break;
		}
	}

}
