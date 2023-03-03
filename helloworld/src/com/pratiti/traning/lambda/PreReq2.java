package com.pratiti.traning.lambda;
import com.pratiti.traning.lambda.A.B;

class A {
	private int x=10;
	
	class B {
		void check() {
			System.out.println(x);
		}
	}
	static class C {
		void fun() {
			System.out.println("hi");
		}
	}
}

public class PreReq2 {

	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		b.check();
		A.C c = new A.C();
		c.fun();
	}

}
