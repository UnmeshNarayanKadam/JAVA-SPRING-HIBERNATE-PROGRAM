package com.pratiti.traning.lambda;

class Hello {
	void saySomething() {
		System.out.println("Hello");
	}
}

class Hi extends Hello {
	void saySomething() {
		//super.saySomething();
		System.out.println("hi");
	}
}

public class PreReq3 {
	public static void main(String[] args) {
	
		Hello h1 = new Hello();
		h1.saySomething();
		
		Hi h2 = new Hi();
		h2.saySomething();
		
		Hello h3 = new Hello() {
			void saySomething() {
				System.out.println("anonymus");
			}
		};
		h3.saySomething();
		
	}
}
