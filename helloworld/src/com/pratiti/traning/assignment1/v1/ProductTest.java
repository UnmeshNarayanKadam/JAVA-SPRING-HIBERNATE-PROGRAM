package com.pratiti.traning.assignment1.v1;

public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product("Wings of Fire",50);
		p1.setProductId(101);
		p1.setPrice(500);
		p1.setDescription("Wings of Fire (1999), is the autobiography of the Missile Man of "
				+ "India and President of India, Dr. A. P. J. Abdul Kalam. ");
		p1.setTypeOfProduct("Book");
		
		p1.display();
		
		Product p2 = new Product("Toy Car",100);
		p2.setProductId(201);
		p2.setPrice(1000);
		p2.setDescription("Best Made In India Games\r\n"
				+ "Ideal birthday gifts for kids of age 3 years and above.");
		p2.setTypeOfProduct("Toy");
		
		p2.display();
		
		p1.updateDescription("The 'Wings of Fire' is one such autobiography by visionary scientist \n"
				+ "Dr. APJ Abdul Kalam, who from very humble beginnings rose to be the President of India.");
		p1.display();

		p1.calculateDiscount(60);
		p1.calculateDiscount(20);
		
		p2.calculateDiscount(5);
	}

}
