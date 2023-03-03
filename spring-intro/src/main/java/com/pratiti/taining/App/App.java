package com.pratiti.taining.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pratiti.taining.component.CurrencyConverter;
import com.pratiti.taining.component.HelloWorld;
import com.pratiti.taining.component.Substraction;
import com.pratiti.taining.component.SumOfNumber;
import com.pratiti.taining.component.TextEditor;
import com.pratiti.taining.component.bank.Atm;

public class App {

	public static void main(String[] args) {
		//Loading spring
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		//accessing object
		HelloWorld hw = (HelloWorld)ctx.getBean("hello");
		System.out.println(hw.sayHello("Unmesh"));
		
		SumOfNumber sn = (SumOfNumber)ctx.getBean("addition");
		System.out.println("Addition is : "+sn.add(4, 6));
		
		CurrencyConverter cc = (CurrencyConverter)ctx.getBean("currConv");
		System.out.println(cc.convert("USD", "INR", 10));
		
		Substraction substraction = (Substraction)ctx.getBean("sub");
		System.out.println(substraction.sub(10, 5));
		
		TextEditor te = (TextEditor)ctx.getBean("textEdit");
		te.load("doc");
		
		//by default name of componant is same as class name but only the first char is in lower case
		Atm atm = (Atm)ctx.getBean("hdfcAtm");
		atm.withdraw(2222, 1937);
		
		
	}

}
