package com.pratiti.traning.lambda;


interface Math {
	int calculate(int x,int y);
}

class add implements Math {
	@Override
	public int calculate(int x,int y) {
		return  x+y;
	}
}



public class LambdaExample2 {

	public static void main(String[] args) {
		
		//anonymous class 
		Math m1 = new Math() {
			@Override
			public int calculate(int x,int y) {
				return  x*y;
			}
		};
		System.out.println("Anonymous class - Multiplication : "+m1.calculate(10, 5));
		
		//lambda
		
		Math m2 = (int x , int y)->{
			return x-y;
		};
		System.out.println("lambda - subtraction : "+m2.calculate(10, 5));

		
	}
	
}	