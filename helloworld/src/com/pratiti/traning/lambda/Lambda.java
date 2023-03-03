package com.pratiti.traning.lambda;

@FunctionalInterface
interface Printer {
	void print(String document);
}


class DeskjetPrinter implements Printer {
	@Override
	public void print(String document) {
		System.out.println("Deskjet printer printing : "+document);
	}
}

public class Lambda {

	public static void main(String[] args) {
		
		
		Printer p1 = new DeskjetPrinter();
		p1.print("abc.txt");
		
		//Anonymous class
		Printer p2 = new Printer(){

			@Override
			public void print(String document) {
				System.out.println("anonymous "+document);
			}
			
		};
		p2.print("abc.txt");
		
		//Lambda implementation
		
		Printer p3 = (document) -> {
			System.out.println("lambda "+document);
		};
		p3.print("abc.txt");
		
	}
	
}	